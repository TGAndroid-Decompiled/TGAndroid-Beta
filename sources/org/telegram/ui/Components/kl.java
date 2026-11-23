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
public final class kl extends li implements org.telegram.ui.ActionBar.c6, org.telegram.messenger.fs {
    public static final int G0 = 0;
    public float A0;
    public final fl B0;
    public int C0;
    public int D0;
    public org.telegram.messenger.da E;
    public int E0;
    public org.telegram.messenger.xa F;
    public int F0;
    public org.telegram.messenger.sa G;
    public float H;
    public boolean I;
    public final View J;
    public final bi.g3 K;
    public final jg.r0 L;
    public final di.b1 M;
    public final ek0 N;
    public final il O;
    public final ImageView P;
    public final kg.d0 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final long W;
    public final Paint f36772a0;
    public AnimatorSet f36773b0;
    public boolean f36774c0;
    public boolean f36775d0;
    public boolean f36776e0;
    public boolean f36777f0;
    public boolean f36778g0;
    public boolean f36779h0;
    public Location f36780i0;
    public Location f36781j0;
    public int f36782k0;
    public boolean f36783l0;
    public boolean m0;
    public final ImageView f36784n;
    public boolean f36785n0;
    public jl f36786o0;
    public final int f36787p0;
    public int f36788q0;
    public final org.telegram.ui.ActionBar.q0 f36789r;
    public int f36790r0;
    public final LinearLayout f36791s;
    public int f36792s0;
    public int f36793t0;
    public float f36794u0;
    public float f36795v0;
    public final TextView f36796w;
    public final int[] f36797w0;
    public final org.telegram.ui.ActionBar.q0 f36798x;
    public int f36799x0;
    public boolean f36800y;
    public int f36801y0;
    public int f36802z0;

    public kl(ti tiVar, Context context, final org.telegram.ui.ActionBar.i6 i6Var, boolean z10) {
        super(context, i6Var, tiVar);
        final org.telegram.ui.bn bnVar;
        boolean z11;
        boolean z12;
        this.S = true;
        this.T = false;
        this.U = false;
        this.V = true;
        this.f36772a0 = new Paint();
        this.f36774c0 = true;
        int currentActionBarHeight = (org.telegram.messenger.g0.f24226q.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(66.0f);
        this.f36788q0 = currentActionBarHeight;
        this.f36790r0 = currentActionBarHeight;
        this.f36792s0 = -1;
        this.f36793t0 = Integer.MAX_VALUE;
        this.f36794u0 = Float.NaN;
        this.f36795v0 = 1.0f;
        this.f36797w0 = new int[2];
        this.f36801y0 = Integer.MAX_VALUE;
        this.A0 = -1.0f;
        this.B0 = new fl(0, this);
        this.E0 = -1;
        this.F0 = -1;
        org.telegram.messenger.g0.a0();
        ti tiVar2 = this.f37135b;
        org.telegram.ui.ActionBar.g2 g2Var = tiVar2.f39956a2;
        if (g2Var instanceof org.telegram.ui.bn) {
            bnVar = (org.telegram.ui.bn) g2Var;
        } else {
            bnVar = null;
        }
        long c12 = tiVar2.c1();
        this.W = c12;
        if (this.f37135b.J1) {
            this.f36787p0 = 7;
        } else if (z10 && bnVar != null && bnVar.h == null && !bnVar.c() && !org.telegram.messenger.n10.C(bnVar.j())) {
            this.f36787p0 = 1;
        } else {
            this.f36787p0 = 0;
        }
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25328y4);
        org.telegram.messenger.ks.e().c(this, org.telegram.messenger.ks.f25335z4);
        this.f36776e0 = false;
        this.f36775d0 = false;
        this.f36777f0 = false;
        jg.r0 r0Var = this.L;
        if (r0Var != null) {
            r0Var.F();
        }
        il ilVar = this.O;
        if (ilVar != null) {
            ilVar.F();
        }
        if (getParentActivity() != null && getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.U = z11;
        org.telegram.ui.ActionBar.q0 a10 = this.f37135b.V2.s().a(0, 2131232491);
        a10.O();
        a10.I = new bi.x1(this, 8);
        this.f36798x = a10;
        this.f37135b.getClass();
        a10.setVisibility(0);
        a10.setSearchFieldHint(org.telegram.messenger.gd.N0(2131745640, null));
        a10.setContentDescription(org.telegram.messenger.gd.N0(2131745640, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        int i7 = org.telegram.ui.ActionBar.n6.f29559j5;
        org.telegram.ui.ActionBar.u6.U(searchField, i7, i6Var);
        org.telegram.ui.ActionBar.u6.v(searchField, i7, i6Var);
        org.telegram.ui.ActionBar.u6.D(searchField, org.telegram.ui.ActionBar.n6.Me, i6Var);
        new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(21.0f)).gravity = 83;
        bi.g3 g3Var = new bi.g3(15, context, this);
        this.K = g3Var;
        g3Var.setWillNotDraw(false);
        View view = new View(context);
        this.J = view;
        view.setBackgroundDrawable(new sc(org.telegram.ui.ActionBar.n6.D0().q()));
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.lj, this.f37134a), false, i6Var);
        this.f36789r = q0Var;
        q0Var.setClickable(true);
        q0Var.setSubMenuOpenSide(2);
        q0Var.setAdditionalXOffset(org.telegram.messenger.g0.L(10.0f));
        q0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(10.0f));
        q0Var.d(2, 2131232218, null, org.telegram.messenger.gd.N0(2131748497, null), true, false, i6Var);
        q0Var.d(3, 2131232354, null, org.telegram.messenger.gd.N0(2131745752, null), true, false, i6Var);
        q0Var.d(4, 2131232189, null, org.telegram.messenger.gd.N0(2131749082, null), true, false, i6Var);
        q0Var.setContentDescription(org.telegram.messenger.gd.N0(2131754838, null));
        int L = org.telegram.messenger.g0.L(40.0f);
        int i10 = org.telegram.ui.ActionBar.n6.nj;
        int w02 = org.telegram.ui.ActionBar.n6.w0(i10, this.f37134a);
        int i11 = org.telegram.ui.ActionBar.n6.oj;
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.n6.j0(L, w02, org.telegram.ui.ActionBar.n6.w0(i11, this.f37134a));
        c8.sa.a(q0Var);
        q0Var.setTranslationZ(org.telegram.messenger.g0.L(2.0f));
        bg.q0 q0Var2 = bg.u0.f3313a;
        q0Var.setOutlineProvider(q0Var2);
        org.telegram.ui.ActionBar.q6 M = org.telegram.ui.ActionBar.u6.M(i10);
        org.telegram.ui.ActionBar.q6 M2 = org.telegram.ui.ActionBar.u6.M(i11);
        q0Var.setBackground(j02);
        org.telegram.ui.ActionBar.u6.j(q0Var, j02, M, M2, i6Var);
        q0Var.setIcon(2131232219);
        g3Var.addView(q0Var, c8.na.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        q0Var.setOnClickListener(new n0(this, 7));
        q0Var.setDelegate(new zk(this));
        ImageView imageView = new ImageView(context);
        this.f36784n = imageView;
        org.telegram.ui.Cells.y j03 = org.telegram.ui.ActionBar.n6.j0(org.telegram.messenger.g0.L(40.0f), org.telegram.ui.ActionBar.n6.w0(i10, this.f37134a), org.telegram.ui.ActionBar.n6.w0(i11, this.f37134a));
        c8.sa.a(imageView);
        imageView.setTranslationZ(org.telegram.messenger.g0.L(2.0f));
        imageView.setOutlineProvider(q0Var2);
        org.telegram.ui.ActionBar.q6 M3 = org.telegram.ui.ActionBar.u6.M(i10);
        org.telegram.ui.ActionBar.q6 M4 = org.telegram.ui.ActionBar.u6.M(i11);
        imageView.setBackground(j03);
        org.telegram.ui.ActionBar.u6.j(imageView, j03, M3, M4, i6Var);
        imageView.setImageResource(2131232110);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = org.telegram.ui.ActionBar.n6.mj;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.u6.s(imageView, i12, i6Var, mode);
        imageView.setTag(Integer.valueOf(i12));
        imageView.setContentDescription(org.telegram.messenger.gd.N0(2131754830, null));
        g3Var.addView(imageView, c8.na.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        imageView.setOnClickListener(new l8(2, this, i6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f36791s = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(160.0f), 0, 0);
        linearLayout.setVisibility(8);
        addView(linearLayout, c8.na.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new gi.a(16));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(2131231644);
        org.telegram.ui.ActionBar.u6.s(imageView2, org.telegram.ui.ActionBar.n6.W5, i6Var, mode);
        linearLayout.addView(imageView2, c8.na.o(-2, -2));
        TextView textView = new TextView(context);
        int i13 = org.telegram.ui.ActionBar.n6.X5;
        org.telegram.ui.ActionBar.u6.U(textView, i13, i6Var);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        i5.c.r(17.0f, 1, 2131747986, textView, null);
        TextView f10 = org.telegram.messenger.m10.f(linearLayout, textView, c8.na.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.f36796w = f10;
        org.telegram.ui.ActionBar.u6.U(f10, i13, i6Var);
        f10.setGravity(17);
        f10.setTextSize(1, 15.0f);
        f10.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        linearLayout.addView(f10, c8.na.t(-2, -2, 17, 0, 6, 0, 0));
        di.b1 b1Var = new di.b1(this, context, i6Var, 16);
        this.M = b1Var;
        setBlur3Capture(b1Var);
        this.d = b1Var;
        this.f37138f = true;
        b1Var.setClipToPadding(false);
        jg.r0 r0Var2 = new jg.r0(context, this.f36787p0, c12, true, i6Var, this.f37135b.J1, false, false);
        this.L = r0Var2;
        b1Var.setAdapter(r0Var2);
        ti tiVar3 = this.f37135b;
        if (tiVar3 != null && (tiVar3.C1 || tiVar3.K1)) {
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
        addView(b1Var, c8.na.e(-1, -1, 51));
        b1Var.setOnScrollListener(new hl(this, 0));
        b1Var.setOnItemClickListener(new qj0(this) {
            public final kl f33490b;

            {
                this.f33490b = this;
            }

            @Override
            public final void b(int i14, View view2) {
                switch (r4) {
                    case 0:
                        kl.U(this.f33490b, bnVar, i6Var, i14);
                        return;
                    default:
                        kl.W(this.f33490b, bnVar, i6Var, i14);
                        return;
                }
            }
        });
        r0Var2.P(this.f36788q0);
        addView(g3Var, indexOfChild(b1Var), c8.na.e(-1, -1, 51));
        org.telegram.messenger.xa onCreateMapView = ((pb.b) org.telegram.messenger.t0.k()).onCreateMapView(context);
        this.F = onCreateMapView;
        a8.r7 r7Var = (a8.r7) onCreateMapView;
        r7Var.f617c = new zk(this);
        r7Var.d = new g2(9, this, i6Var);
        new Thread(new bl(this, onCreateMapView, 0)).start();
        ImageView imageView3 = new ImageView(context);
        this.P = imageView3;
        imageView3.setImageResource(2131231651);
        g3Var.addView(imageView3, c8.na.e(28, 48, 49));
        ek0 ek0Var = new ek0(context, i6Var);
        this.N = ek0Var;
        ek0Var.setSections(true);
        ek0Var.setClipToPadding(false);
        ek0Var.setVisibility(8);
        ek0Var.setLayoutManager(new v4.c0(1, false));
        il ilVar2 = new il(this, context, i6Var, this.f37135b.J1);
        this.O = ilVar2;
        ilVar2.f17503n = new zk(this);
        ek0Var.setItemAnimator(null);
        addView(ek0Var, c8.na.e(-1, -1, 51));
        ek0Var.setOnScrollListener(new hl(this, 1));
        ek0Var.setOnItemClickListener(new qj0(this) {
            public final kl f33490b;

            {
                this.f33490b = this;
            }

            @Override
            public final void b(int i14, View view2) {
                switch (r4) {
                    case 0:
                        kl.U(this.f33490b, bnVar, i6Var, i14);
                        return;
                    default:
                        kl.W(this.f33490b, bnVar, i6Var, i14);
                        return;
                }
            }
        });
        j0();
    }

    public static void P(kl klVar, org.telegram.ui.ActionBar.i6 i6Var) {
        ImageView imageView = klVar.f36784n;
        Activity parentActivity = klVar.getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            b5.A(klVar.getParentActivity()).show();
        } else if (klVar.f36780i0 != null && klVar.E != null) {
            int i7 = org.telegram.ui.ActionBar.n6.mj;
            org.telegram.ui.ActionBar.u6.s(imageView, i7, i6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setTag(Integer.valueOf(i7));
            klVar.L.L(null);
            klVar.m0 = false;
            klVar.E.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(new org.telegram.messenger.ab(klVar.f36780i0.getLatitude(), klVar.f36780i0.getLongitude())));
        }
    }

    public static void Q(kl klVar, org.telegram.ui.bn bnVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.i6 i6Var) {
        if (bnVar != null && bnVar.c()) {
            b5.J(klVar.getParentActivity(), bnVar.a(), new cl(klVar, tL_messageMediaVenue, 1), i6Var);
            return;
        }
        klVar.f36786o0.d(tL_messageMediaVenue, klVar.f36787p0, true, 0, 0L);
        klVar.f37135b.a(true);
    }

    public static void R(kl klVar) {
        if (klVar.getParentActivity() != null) {
            try {
                klVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            } catch (Exception unused) {
            }
        }
    }

    public static void S(kl klVar, org.telegram.messenger.xa xaVar) {
        if (klVar.F != null && klVar.getParentActivity() != null) {
            try {
                ((a8.r7) xaVar).B();
                ((pb.b) org.telegram.messenger.t0.k()).initializeMaps(org.telegram.messenger.t0.f27013b);
                ((a8.r7) klVar.F).x(new dl(klVar, 0));
                klVar.f36778g0 = true;
                if (klVar.f36779h0) {
                    ((a8.r7) klVar.F).E();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public static void T(kl klVar) {
        di.b1 b1Var = klVar.M;
        bi.g3 g3Var = klVar.K;
        if (klVar.F != null && g3Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g3Var.getLayoutParams();
            if (layoutParams != null) {
                int i7 = layoutParams.height;
                int i10 = klVar.f36790r0;
                if (i7 != i10) {
                    layoutParams.height = i10;
                    g3Var.setLayoutParams(layoutParams);
                }
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((ai.h0) ((a8.r7) klVar.F).f616b).getLayoutParams();
            if (layoutParams2 != null && layoutParams2.height != klVar.getMapContentHeight()) {
                layoutParams2.height = klVar.getMapContentHeight();
                ((ai.h0) ((a8.r7) klVar.F).f616b).setLayoutParams(layoutParams2);
            }
            klVar.L.P(klVar.f36788q0);
            v4.f1 K = b1Var.K(0);
            if (K != null) {
                View view = K.f59245a;
                if (view.getLayoutParams() != null && view.getLayoutParams().height != klVar.f36788q0) {
                    view.getLayoutParams().height = klVar.f36788q0;
                    view.requestLayout();
                }
            }
            kg.d0 d0Var = klVar.Q;
            d0Var.M = 0;
            d0Var.p1();
            b1Var.requestLayout();
            klVar.i0();
        }
    }

    public static void U(kl klVar, org.telegram.ui.bn bnVar, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        kl klVar2;
        org.telegram.ui.bn bnVar2;
        org.telegram.ui.ActionBar.i6 i6Var2;
        TLRPC.User user;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j3 = klVar.W;
        jg.r0 r0Var = klVar.L;
        ti tiVar = klVar.f37135b;
        int i10 = klVar.f36787p0;
        if (i10 == 7) {
            if (i7 == 1 && (tL_messageMediaVenue2 = r0Var.V) != null) {
                klVar.f36786o0.d(tL_messageMediaVenue2, i10, true, 0, 0L);
                tiVar.a(true);
                return;
            } else if (i7 == 2 && (tL_messageMediaVenue = r0Var.W) != null) {
                klVar.f36786o0.d(tL_messageMediaVenue, i10, true, 0, 0L);
                tiVar.a(true);
                return;
            } else {
                klVar2 = klVar;
                bnVar2 = bnVar;
                i6Var2 = i6Var;
            }
        } else if (i7 == 1) {
            if (klVar.f36786o0 != null && klVar.f36781j0 != null) {
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = org.telegram.messenger.g0.b0(klVar.f36781j0.getLatitude());
                tL_messageMediaGeo.geo._long = org.telegram.messenger.g0.b0(klVar.f36781j0.getLongitude());
                b5.X(tiVar.H3, tiVar.Y0() + 1, tiVar.c1(), new bi.o2(klVar, bnVar, tL_messageMediaGeo, i6Var, 7));
                return;
            } else if (klVar.U) {
                b5.A(klVar.getParentActivity()).show();
                return;
            } else {
                return;
            }
        } else {
            klVar2 = klVar;
            bnVar2 = bnVar;
            i6Var2 = i6Var;
            if (i7 == 2 && i10 == 1) {
                if (klVar2.getLocationController().i(j3)) {
                    klVar2.getLocationController().k(j3);
                    tiVar.a(true);
                    return;
                } else if (klVar2.f36780i0 == null && klVar2.U) {
                    b5.A(klVar2.getParentActivity()).show();
                    return;
                } else if (klVar2.f36786o0 != null && klVar2.getParentActivity() != null && klVar2.f36780i0 != null) {
                    if (org.telegram.messenger.n5.E(j3)) {
                        user = tiVar.f39956a2.getMessagesController().c2(Long.valueOf(j3));
                    } else {
                        user = null;
                    }
                    b5.B(klVar2.getParentActivity(), false, user, new org.telegram.messenger.nr() {
                        @Override
                        public final void a(int i11) {
                            kl klVar3 = kl.this;
                            ti tiVar2 = klVar3.f37135b;
                            b5.X(tiVar2.H3, tiVar2.Y0() + 1, tiVar2.c1(), new hi.a4(klVar3, i11, 5));
                        }
                    }, klVar2.f37134a).show();
                    return;
                } else {
                    return;
                }
            }
        }
        Object I = r0Var.I(i7);
        if (I instanceof TLRPC.TL_messageMediaVenue) {
            b5.X(tiVar.H3, tiVar.Y0() + 1, tiVar.c1(), new bi.o2(klVar2, bnVar2, (TLRPC.TL_messageMediaVenue) I, i6Var2, 8));
        }
    }

    public static void V(kl klVar) {
        jg.r0 r0Var = klVar.L;
        ti tiVar = klVar.f37135b;
        if (klVar.f36774c0) {
            int i7 = Build.VERSION.SDK_INT;
            Activity parentActivity = klVar.getParentActivity();
            if (parentActivity != null) {
                klVar.f36774c0 = false;
                if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    String[] strArr = (!tiVar.J1 || tiVar.f40035x4 == null || i7 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
                    klVar.T = true;
                    if (r0Var != null) {
                        r0Var.O(klVar.U, true);
                    }
                    parentActivity.requestPermissions(strArr, 2);
                } else if (i7 >= 29 && tiVar.J1 && tiVar.f40035x4 != null && parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") != 0) {
                    klVar.T = true;
                    if (r0Var != null) {
                        r0Var.O(klVar.U, true);
                    }
                    parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
                }
            }
        }
    }

    public static void W(kl klVar, org.telegram.ui.bn bnVar, org.telegram.ui.ActionBar.i6 i6Var, int i7) {
        ti tiVar = klVar.f37135b;
        TLRPC.TL_messageMediaVenue H = klVar.O.H(i7);
        if (H != null && klVar.f36787p0 != 7) {
            tiVar.V2.n(true);
            TLRPC.GeoPoint geoPoint = H.geo;
            klVar.h0(geoPoint.lat, geoPoint._long);
        } else if (H != null && klVar.f36786o0 != null) {
            if (bnVar != null && bnVar.c()) {
                b5.J(klVar.getParentActivity(), bnVar.a(), new cl(klVar, H, 0), i6Var);
                return;
            }
            klVar.f36786o0.d(H, klVar.f36787p0, true, 0, 0L);
            tiVar.a(true);
        }
    }

    public static void X(kl klVar, Location location) {
        int i7;
        ti tiVar = klVar.f37135b;
        if (tiVar != null && tiVar.f39956a2 != null) {
            klVar.g0(location);
            jg.r0 r0Var = klVar.L;
            if (r0Var != null && (((i7 = klVar.f36787p0) == 7 || i7 == 8) && !klVar.m0)) {
                r0Var.L(klVar.f36781j0);
            }
            klVar.getLocationController().n(location, klVar.V);
            klVar.V = false;
        }
    }

    public static void Y(kl klVar, org.telegram.ui.bn bnVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.i6 i6Var, Long l10) {
        if (bnVar != null && bnVar.c()) {
            b5.J(klVar.getParentActivity(), bnVar.a(), new a3.h(klVar, tL_messageMediaGeo, l10, 28), i6Var);
            return;
        }
        klVar.f36786o0.d(tL_messageMediaGeo, klVar.f36787p0, true, 0, l10.longValue());
        klVar.f37135b.a(true);
    }

    public static void Z(kl klVar, org.telegram.messenger.da daVar) {
        PackageManager packageManager;
        klVar.E = daVar;
        yk ykVar = new yk(klVar, 3);
        jb.m mVar = daVar.f23632a;
        org.telegram.messenger.j1 j1Var = new org.telegram.messenger.j1(ykVar, 5);
        l8.e eVar = (l8.e) mVar.f17464b;
        try {
            k8.b bVar = new k8.b(j1Var, (byte) 0);
            Parcel p12 = eVar.p1();
            v7.b.c(p12, bVar);
            eVar.t1(p12, 42);
            if (org.telegram.ui.ActionBar.n6.I.q() || org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, klVar.f37134a)) < 0.721f) {
                klVar.R = true;
                klVar.E.i(((pb.b) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.f27013b, 2131624086));
            }
            if (klVar.E != null) {
                Location location = new Location("network");
                klVar.f36781j0 = location;
                location.setLatitude(20.659322d);
                klVar.f36781j0.setLongitude(-11.40625d);
                try {
                    klVar.E.k(true);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                klVar.E.g().A0();
                klVar.E.g().C0();
                klVar.E.g().x0();
                klVar.E.l(new zk(klVar));
                org.telegram.messenger.da daVar2 = klVar.E;
                yk ykVar2 = new yk(klVar, 4);
                jb.m mVar2 = daVar2.f23632a;
                org.telegram.messenger.j1 j1Var2 = new org.telegram.messenger.j1(ykVar2, 8);
                l8.e eVar2 = (l8.e) mVar2.f17464b;
                try {
                    k8.b bVar2 = new k8.b(j1Var2, (short) 0);
                    Parcel p13 = eVar2.p1();
                    v7.b.c(p13, bVar2);
                    eVar2.t1(p13, 99);
                    org.telegram.messenger.da daVar3 = klVar.E;
                    dl dlVar = new dl(klVar, 1);
                    jb.m mVar3 = daVar3.f23632a;
                    org.telegram.messenger.j1 j1Var3 = new org.telegram.messenger.j1(dlVar, 6);
                    l8.e eVar3 = (l8.e) mVar3.f17464b;
                    try {
                        k8.b bVar3 = new k8.b(j1Var3);
                        Parcel p14 = eVar3.p1();
                        v7.b.c(p14, bVar3);
                        eVar3.t1(p14, 36);
                        klVar.E.m(new k2(20));
                        klVar.f0();
                        org.telegram.messenger.g0.h3(new yk(klVar, 5), 200L);
                        if (klVar.S && klVar.getParentActivity() != null) {
                            klVar.S = false;
                            Activity parentActivity = klVar.getParentActivity();
                            if (parentActivity == null || (packageManager = parentActivity.getPackageManager()) == null || packageManager.hasSystemFeature("android.hardware.location.gps")) {
                                try {
                                    if (!((LocationManager) org.telegram.messenger.t0.f27013b.getSystemService("location")).isProviderEnabled("gps")) {
                                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, klVar.getParentActivity(), klVar.f37134a);
                                        int i7 = org.telegram.ui.ActionBar.n6.L5;
                                        alertDialog$Builder.m(2131624120, 72, org.telegram.ui.ActionBar.n6.w0(i7, klVar.f37134a), null);
                                        alertDialog$Builder.n(i7, klVar.f37134a);
                                        alertDialog$Builder.f28835a.U = org.telegram.messenger.gd.N0(2131749354, null);
                                        alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751794, null), new zk(klVar));
                                        alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                                        alertDialog$Builder.p();
                                    }
                                } catch (Exception e11) {
                                    org.telegram.messenger.a8.g(e11, true);
                                }
                            } else {
                                return;
                            }
                        }
                        klVar.i0();
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

    public static void a0(kl klVar) {
        jg.r0 r0Var = klVar.L;
        di.b1 b1Var = klVar.M;
        if (klVar.F != null && klVar.K != null && klVar.getMeasuredHeight() != 0) {
            v4.f1 K = b1Var.K(0);
            if (K != null) {
                View view = K.f59245a;
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
                            bottom = Math.max(bottom, K2.f59245a.getBottom());
                        }
                        i7++;
                    } else {
                        klVar.f36792s0 = bottom - view.getBottom();
                        break;
                    }
                }
            }
            int i10 = klVar.f36792s0;
            if (i10 < 0) {
                int L = org.telegram.messenger.g0.L(66.0f);
                int i11 = klVar.f36787p0;
                if (i11 != 1 && i11 != 7 && i11 != 8) {
                    i10 = L;
                } else {
                    i10 = org.telegram.messenger.g0.L(66.0f) + L;
                }
            }
            int measuredHeight = (b1Var.getMeasuredHeight() - klVar.getDefaultBottomInset()) - i10;
            int measuredHeight2 = klVar.getMeasuredHeight() + klVar.getMapExtraTop();
            int max = Math.max(org.telegram.messenger.g0.L(120.0f), measuredHeight - b1Var.getPaddingTop());
            if (measuredHeight2 != klVar.f36790r0 || max != klVar.f36788q0) {
                klVar.f36790r0 = measuredHeight2;
                klVar.f36788q0 = max;
                org.telegram.messenger.g0.g3(new yk(klVar, 0));
            }
        }
    }

    private int getBottomInset() {
        d0();
        return org.telegram.messenger.g0.W1(0.0f, getDefaultBottomInset(), getMinBottomInset());
    }

    private int getDefaultBottomInset() {
        if (d0()) {
            return org.telegram.messenger.g0.L(8.0f) + this.f37137e;
        }
        return getMinBottomInset();
    }

    private Location getLastLocation() {
        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.f27013b.getSystemService("location");
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

    private org.telegram.messenger.qd getLocationController() {
        return this.f37135b.f39956a2.getLocationController();
    }

    private int getMapContentHeight() {
        return org.telegram.messenger.g0.L(10.0f) + this.f36790r0 + this.D0;
    }

    private int getMapExtraTop() {
        return org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.f24220m;
    }

    private org.telegram.messenger.ab getMapTarget() {
        Location location;
        if (this.m0 && (location = this.f36781j0) != null) {
            return new org.telegram.messenger.ab(location.getLatitude(), this.f36781j0.getLongitude());
        }
        Location location2 = this.f36780i0;
        if (location2 != null) {
            return new org.telegram.messenger.ab(location2.getLatitude(), this.f36780i0.getLongitude());
        }
        return null;
    }

    private org.telegram.messenger.mp getMessagesController() {
        return this.f37135b.f39956a2.getMessagesController();
    }

    private int getMinBottomInset() {
        if (d0()) {
            return getDefaultBottomInset();
        }
        return Math.min(this.f37137e, org.telegram.messenger.g0.f24221n);
    }

    private Activity getParentActivity() {
        org.telegram.ui.ActionBar.g2 g2Var;
        ti tiVar = this.f37135b;
        if (tiVar != null && (g2Var = tiVar.f39956a2) != null) {
            return g2Var.getParentActivity();
        }
        return null;
    }

    private org.telegram.messenger.i10 getUserConfig() {
        return this.f37135b.f39956a2.getUserConfig();
    }

    @Override
    public final void A() {
        org.telegram.messenger.xa xaVar = this.F;
        if (xaVar != null && this.f36778g0) {
            try {
                ((a8.r7) xaVar).D();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        this.f36779h0 = false;
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.kl.B(int, int):void");
    }

    @Override
    public final void C() {
        org.telegram.messenger.xa xaVar = this.F;
        if (xaVar != null && this.f36778g0) {
            try {
                ((a8.r7) xaVar).E();
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        this.f36779h0 = true;
    }

    @Override
    public final void E(float f10, float f11) {
        if (this.f36794u0 == f10 && this.f36795v0 == f11) {
            return;
        }
        this.f36794u0 = f10;
        this.f36795v0 = f11;
        e0();
    }

    @Override
    public final void H(li liVar) {
        long j3;
        ti tiVar = this.f37135b;
        tiVar.V2.setTitle(org.telegram.messenger.gd.N0(2131745260, null));
        if (((ai.h0) ((a8.r7) this.F).f616b).getParent() == null) {
            FrameLayout.LayoutParams e10 = c8.na.e(-1, org.telegram.messenger.g0.L(10.0f) + this.f36788q0, 51);
            bi.g3 g3Var = this.K;
            g3Var.addView((ai.h0) ((a8.r7) this.F).f616b, 0, e10);
            g3Var.addView(this.J, 1, c8.na.c(-1.0f, -1));
        }
        this.f36798x.setVisibility(0);
        org.telegram.messenger.xa xaVar = this.F;
        if (xaVar != null && this.f36778g0) {
            try {
                ((a8.r7) xaVar).E();
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        this.f36779h0 = true;
        org.telegram.messenger.da daVar = this.E;
        if (daVar != null) {
            try {
                daVar.k(true);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        c0();
        boolean T = tiVar.X3.T();
        yk ykVar = new yk(this, 1);
        if (T) {
            j3 = 200;
        } else {
            j3 = 0;
        }
        org.telegram.messenger.g0.h3(ykVar, j3);
        this.Q.h1(0, 0);
        i0();
    }

    @Override
    public final void J() {
        this.M.y0(0);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29632n5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29394a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29415b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.fj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.ij));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29452d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29543i6));
    }

    public final void b0() {
        org.telegram.ui.ActionBar.q0 q0Var = this.f36789r;
        if (q0Var != null) {
            q0Var.setIconColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.lj, this.f37134a));
            this.f36789r.I(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.G8, this.f37134a));
            this.f36789r.P(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.F8, this.f37134a), true);
            this.f36789r.P(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.E8, this.f37134a), false);
        }
        if (this.E != null) {
            if (org.telegram.ui.ActionBar.n6.I.q() || org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, this.f37134a)) < 0.721f) {
                if (!this.R) {
                    this.R = true;
                    this.E.i(((pb.b) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.f27013b, 2131624086));
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
            bi.g3 g3Var = this.K;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) g3Var.getLayoutParams();
            layoutParams2.topMargin = 0;
            layoutParams2.height = this.f36790r0;
            g3Var.setLayoutParams(layoutParams2);
            ek0 ek0Var = this.N;
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ek0Var.getLayoutParams();
            layoutParams3.topMargin = currentActionBarHeight;
            ek0Var.setLayoutParams(layoutParams3);
            int i7 = this.f36788q0;
            jg.r0 r0Var = this.L;
            r0Var.P(i7);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((ai.h0) ((a8.r7) this.F).f616b).getLayoutParams();
            if (layoutParams4 != null) {
                layoutParams4.height = org.telegram.messenger.g0.L(10.0f) + this.f36790r0;
                ((ai.h0) ((a8.r7) this.F).f616b).setLayoutParams(layoutParams4);
            }
            r0Var.f();
            i0();
        }
    }

    public final boolean d0() {
        th thVar = this.f37135b.f40026v3;
        if (thVar != null && thVar.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ks.f25328y4;
        jg.r0 r0Var = this.L;
        if (i7 == i11) {
            this.U = false;
            this.T = false;
            f0();
            if (r0Var != null) {
                r0Var.O(this.U, this.T);
            }
            org.telegram.messenger.da daVar = this.E;
            if (daVar != null) {
                try {
                    daVar.k(true);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        } else if (i7 == org.telegram.messenger.ks.f25335z4) {
            this.U = true;
            this.T = false;
            if (r0Var != null) {
                r0Var.O(true, false);
            }
        }
        c0();
        this.f37135b.getClass();
        this.f36798x.setVisibility(0);
    }

    @Override
    public final boolean e() {
        return !d0();
    }

    public final void e0() {
        bi.g3 g3Var;
        di.b1 b1Var;
        int i7;
        int mapContentHeight;
        org.telegram.messenger.ab abVar;
        if (this.F != null && (g3Var = this.K) != null && (b1Var = this.M) != null) {
            v4.f1 K = b1Var.K(0);
            if (K != null) {
                i7 = K.f59245a.getTop() + b1Var.getTop();
            } else {
                i7 = Integer.MAX_VALUE;
            }
            if (K != null && i7 < getMeasuredHeight()) {
                if (((ai.h0) ((a8.r7) this.F).f616b).getVisibility() == 4) {
                    ((ai.h0) ((a8.r7) this.F).f616b).setVisibility(0);
                    g3Var.setVisibility(0);
                }
                float f10 = i7;
                boolean z10 = true;
                if (this.f36795v0 < 1.0f) {
                    int[] iArr = this.f36797w0;
                    getLocationInWindow(iArr);
                    f10 = Math.min(i7, org.telegram.messenger.g0.W1(this.f36795v0, -iArr[1], i7));
                }
                int max = (int) Math.max(f10, -getMapExtraTop());
                int max2 = (Math.max(0, K.f59245a.getTop()) + b1Var.getTop()) - max;
                int min = (Math.min(this.f36793t0, b1Var.getMeasuredHeight()) + b1Var.getTop()) - max;
                this.f36799x0 = org.telegram.messenger.g0.L(32.0f) + max2;
                this.f36801y0 = min;
                this.f36802z0 = Math.max(0, this.f36790r0 - (getMeasuredHeight() - max));
                float f11 = max;
                g3Var.setTranslationY(f11);
                g3Var.invalidate();
                this.f36789r.setTranslationY(max2);
                this.f36784n.setTranslationY(-Math.max(0, this.f36790r0 - min));
                int top = b1Var.getTop();
                int i10 = min + max;
                float f12 = (top + i10) / 2.0f;
                float max3 = Math.max(f12, ((b1Var.getPaddingTop() + top) + i10) / 2.0f);
                int ceil = (int) Math.ceil(max3 - f12);
                if (ceil != this.D0) {
                    this.D0 = ceil;
                    org.telegram.messenger.g0.g3(new yk(this, 0));
                }
                float C = a8.p0.C(max + max2 + i10, 2.0f, max3, f12);
                int ceil2 = ((int) Math.ceil(max3)) + getMapExtraTop();
                float f13 = C - ceil2;
                ((ai.h0) ((a8.r7) this.F).f616b).setTranslationY(f13 - f11);
                int L = ((int) (C - f11)) - org.telegram.messenger.g0.L(48.0f);
                if (L != this.f36782k0) {
                    this.f36782k0 = L;
                    this.P.setTranslationY(L);
                }
                if (((ai.h0) ((a8.r7) this.F).f616b).getMeasuredHeight() > 0) {
                    mapContentHeight = ((ai.h0) ((a8.r7) this.F).f616b).getMeasuredHeight();
                } else {
                    mapContentHeight = getMapContentHeight();
                }
                int max4 = Math.max(0, (int) (mapContentHeight - (i10 - f13)));
                int i11 = ((ceil2 * 2) - mapContentHeight) + max4;
                org.telegram.messenger.da daVar = this.E;
                if (daVar != null) {
                    int i12 = this.E0;
                    if (i11 != i12 || max4 != this.F0) {
                        if (i12 >= 0) {
                            z10 = false;
                        }
                        if (z10) {
                            abVar = getMapTarget();
                        } else if (ceil2 != this.C0) {
                            daVar.d();
                            abVar = (org.telegram.messenger.ab) this.E.d().f14540b;
                        } else {
                            abVar = null;
                        }
                        this.C0 = ceil2;
                        this.E0 = i11;
                        this.F0 = max4;
                        this.E.n(0, org.telegram.messenger.g0.L(6.0f) + i11, 0, org.telegram.messenger.g0.L(6.0f) + max4);
                        if (abVar != null) {
                            this.E.h(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(abVar));
                        }
                    }
                }
            } else if (((ai.h0) ((a8.r7) this.F).f616b).getVisibility() == 0) {
                ((ai.h0) ((a8.r7) this.F).f616b).setVisibility(4);
                g3Var.setVisibility(4);
            }
        }
    }

    @Override
    public final boolean f() {
        return true;
    }

    public final void f0() {
        kl klVar;
        ti tiVar = this.f37135b;
        if (tiVar.J1) {
            if (tiVar.f40039y4 != null) {
                org.telegram.messenger.g0.g3(new yk(this, 2));
                return;
            } else if (!this.U) {
                File file = tiVar.f40035x4;
                boolean z10 = tiVar.f40031w4;
                if (file != null) {
                    if (z10) {
                        try {
                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                            String extractMetadata = mediaMetadataRetriever.extractMetadata(23);
                            if (extractMetadata != null) {
                                Matcher matcher = Pattern.compile("([+\\-][0-9.]+)([+\\-][0-9.]+)").matcher(extractMetadata);
                                if (matcher.find() && matcher.groupCount() == 2) {
                                    org.telegram.messenger.g0.g3(new org.telegram.ui.Cells.q7(this, Double.parseDouble(matcher.group(1)), Double.parseDouble(matcher.group(2)), 2));
                                    return;
                                }
                            }
                        } catch (NumberFormatException | Exception unused) {
                        }
                    } else {
                        klVar = this;
                        ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                        float[] fArr = new float[2];
                        if (exifInterface.getLatLong(fArr)) {
                            org.telegram.messenger.g0.g3(new xd(17, this, fArr));
                            return;
                        }
                        Location lastLocation = getLastLocation();
                        klVar.f36780i0 = lastLocation;
                        g0(lastLocation);
                        return;
                    }
                }
                klVar = this;
                Location lastLocation2 = getLastLocation();
                klVar.f36780i0 = lastLocation2;
                g0(lastLocation2);
                return;
            } else {
                org.telegram.messenger.g0.g3(new yk(this, 7));
                return;
            }
        }
        Location lastLocation3 = getLastLocation();
        this.f36780i0 = lastLocation3;
        g0(lastLocation3);
    }

    public final void g0(Location location) {
        if (location != null) {
            Location location2 = new Location(location);
            this.f36780i0 = location2;
            org.telegram.messenger.da daVar = this.E;
            jg.r0 r0Var = this.L;
            if (daVar != null) {
                org.telegram.messenger.ab abVar = new org.telegram.messenger.ab(location.getLatitude(), location.getLongitude());
                if (r0Var != null) {
                    r0Var.M(this.f36780i0);
                }
                if (!this.m0) {
                    this.f36781j0 = new Location(location);
                    if (this.f36785n0) {
                        this.E.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(abVar));
                        return;
                    }
                    this.f36785n0 = true;
                    this.E.h(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(abVar, this.E.e() - 4.0f));
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
            i7 = Math.max((int) mj0Var.f59245a.getY(), 0);
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
    public ArrayList<org.telegram.ui.ActionBar.w6> getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList<org.telegram.ui.ActionBar.w6> arrayList = new ArrayList<>();
        w6 w6Var = new w6(this, 1);
        arrayList.add(new org.telegram.ui.ActionBar.w6(this.K, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29524h5));
        int i7 = org.telegram.ui.ActionBar.n6.A5;
        di.b1 b1Var = this.M;
        arrayList.add(new org.telegram.ui.ActionBar.w6(b1Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i7));
        org.telegram.ui.ActionBar.q0 q0Var = this.f36798x;
        if (q0Var != null) {
            editTextBoldCursor = q0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.w6(editTextBoldCursor, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.f29559j5));
        int i10 = org.telegram.ui.ActionBar.n6.nj;
        ImageView imageView = this.f36784n;
        arrayList.add(new org.telegram.ui.ActionBar.w6(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        int i11 = org.telegram.ui.ActionBar.n6.oj;
        arrayList.add(new org.telegram.ui.ActionBar.w6(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        int i12 = org.telegram.ui.ActionBar.n6.lj;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.f36789r;
        arrayList.add(new org.telegram.ui.ActionBar.w6(q0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, w6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.w6(q0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.w6(q0Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.jj));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.kj));
        arrayList.add(new org.telegram.ui.ActionBar.w6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.pj));
        arrayList.add(new org.telegram.ui.ActionBar.w6(b1Var, 393216, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.ej));
        arrayList.add(new org.telegram.ui.ActionBar.w6(b1Var, 393216, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.w6(b1Var, 393248, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.w6(b1Var, 393248, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.gj));
        arrayList.add(new org.telegram.ui.ActionBar.w6(b1Var, 196608, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.v6) null, org.telegram.ui.ActionBar.n6.Hi));
        return arrayList;
    }

    public final void h0(double d, double d2) {
        org.telegram.messenger.sa newCameraUpdateLatLngZoom;
        if (this.E != null) {
            int i7 = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
            if (i7 != 0 && d2 != 0.0d) {
                Location location = new Location("");
                this.f36781j0 = location;
                location.reset();
                this.f36781j0.setLatitude(d);
                this.f36781j0.setLongitude(d2);
            } else {
                Location location2 = new Location("");
                this.f36780i0 = location2;
                location2.reset();
                this.f36780i0.setLatitude(d);
                this.f36780i0.setLongitude(d2);
            }
            org.telegram.messenger.ab abVar = new org.telegram.messenger.ab(d, d2);
            if (i7 != 0 && d2 != 0.0d) {
                newCameraUpdateLatLngZoom = ((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(abVar, this.E.e() - 4.0f);
            } else {
                newCameraUpdateLatLngZoom = ((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(abVar, this.E.f());
            }
            this.G = newCameraUpdateLatLngZoom;
            this.E.h(newCameraUpdateLatLngZoom);
            jg.r0 r0Var = this.L;
            if (i7 != 0 && d2 != 0.0d) {
                r0Var.L(this.f36781j0);
            } else {
                r0Var.M(this.f36780i0);
            }
            r0Var.H();
            this.M.w0(0, 1, null);
            this.f36783l0 = true;
            if (i7 != 0 && d2 != 0.0d) {
                this.m0 = true;
            }
        }
    }

    public final void i0() {
        bi.g3 g3Var;
        if (this.F != null && (g3Var = this.K) != null) {
            di.b1 b1Var = this.M;
            v4.f1 K = b1Var.K(0);
            if (K != null) {
                K.f59245a.getTop();
            } else {
                g3Var.getMeasuredHeight();
            }
            int i7 = this.f36792s0;
            if (i7 < 0) {
                int L = org.telegram.messenger.g0.L(66.0f);
                int i10 = this.f36787p0;
                if (i10 != 1 && i10 != 7 && i10 != 8) {
                    i7 = L;
                } else {
                    i7 = org.telegram.messenger.g0.L(66.0f) + L;
                }
            }
            int measuredHeight = (b1Var.getMeasuredHeight() - getBottomInset()) - i7;
            this.f36793t0 = measuredHeight;
            if (K != null) {
                int bottom = measuredHeight - K.f59245a.getBottom();
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
        boolean z10 = this.f36775d0;
        LinearLayout linearLayout = this.f36791s;
        if (z10) {
            boolean z11 = this.f36777f0;
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
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25328y4);
        org.telegram.messenger.ks.e().n(this, org.telegram.messenger.ks.f25335z4);
        this.f36800y = true;
        bi.g3 g3Var = this.K;
        if (g3Var != null) {
            g3Var.invalidate();
        }
        try {
            org.telegram.messenger.da daVar = this.E;
            if (daVar != null) {
                daVar.k(false);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.messenger.xa xaVar = this.F;
        if (xaVar != null) {
            ((ai.h0) ((a8.r7) xaVar).f616b).setTranslationY((-org.telegram.messenger.g0.f24226q.y) * 3);
        }
        try {
            org.telegram.messenger.xa xaVar2 = this.F;
            if (xaVar2 != null) {
                ((a8.r7) xaVar2).D();
            }
        } catch (Exception unused) {
        }
        try {
            org.telegram.messenger.xa xaVar3 = this.F;
            if (xaVar3 != null) {
                ((a8.r7) xaVar3).C();
                this.F = null;
            }
        } catch (Exception unused2) {
        }
        jg.r0 r0Var = this.L;
        if (r0Var != null) {
            r0Var.F();
        }
        il ilVar = this.O;
        if (ilVar != null) {
            ilVar.F();
        }
        ti tiVar = this.f37135b;
        tiVar.V2.n(true);
        tiVar.V2.s().removeView(this.f36798x);
    }

    @Override
    public final boolean q() {
        p();
        return false;
    }

    public void setDelegate(jl jlVar) {
        this.f36786o0 = jlVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f37135b.f30226b.invalidate();
        i0();
    }

    @Override
    public final void u() {
        this.f36798x.setVisibility(8);
    }

    @Override
    public final void updateColors() {
        try {
            b0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.f36798x;
        if (q0Var != null) {
            try {
                if (q0Var.getSearchField() != null) {
                    q0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29559j5, this.f37134a));
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
    }

    @Override
    public final void y() {
        boolean z10;
        ti tiVar = this.f37135b;
        if (tiVar != null && !tiVar.d) {
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
