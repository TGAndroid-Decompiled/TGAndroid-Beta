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
public final class uk extends th implements org.telegram.ui.ActionBar.z5, org.telegram.messenger.cs {
    public static final int G0 = 0;
    public float A0;
    public final pk B0;
    public int C0;
    public int D0;
    public org.telegram.messenger.z9 E;
    public int E0;
    public org.telegram.messenger.sa F;
    public int F0;
    public org.telegram.messenger.na G;
    public float H;
    public boolean I;
    public final View J;
    public final ai.o2 K;
    public final kg.o0 L;
    public final ci.j1 M;
    public final tj0 N;
    public final sk O;
    public final ImageView P;
    public final lg.d0 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final long W;
    public final Paint f38780a0;
    public AnimatorSet f38781b0;
    public boolean f38782c0;
    public boolean f38783d0;
    public boolean f38784e0;
    public boolean f38785f0;
    public boolean f38786g0;
    public boolean f38787h0;
    public Location f38788i0;
    public Location f38789j0;
    public int f38790k0;
    public boolean f38791l0;
    public boolean m0;
    public final ImageView f38792n;
    public boolean f38793n0;
    public tk f38794o0;
    public final int f38795p0;
    public int f38796q0;
    public final org.telegram.ui.ActionBar.q0 f38797r;
    public int f38798r0;
    public final LinearLayout f38799s;
    public int f38800s0;
    public int f38801t0;
    public float f38802u0;
    public float f38803v0;
    public final TextView f38804w;
    public final int[] f38805w0;
    public final org.telegram.ui.ActionBar.q0 f38806x;
    public int f38807x0;
    public boolean f38808y;
    public int f38809y0;
    public int f38810z0;

    public uk(bi biVar, Context context, final org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, biVar);
        final org.telegram.ui.wm wmVar;
        boolean z11;
        boolean z12;
        this.S = true;
        this.T = false;
        this.U = false;
        this.V = true;
        this.f38780a0 = new Paint();
        this.f38782c0 = true;
        int currentActionBarHeight = (org.telegram.messenger.g0.f22608q.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(66.0f);
        this.f38796q0 = currentActionBarHeight;
        this.f38798r0 = currentActionBarHeight;
        this.f38800s0 = -1;
        this.f38801t0 = Integer.MAX_VALUE;
        this.f38802u0 = Float.NaN;
        this.f38803v0 = 1.0f;
        this.f38805w0 = new int[2];
        this.f38809y0 = Integer.MAX_VALUE;
        this.A0 = -1.0f;
        this.B0 = new pk(0, this);
        this.E0 = -1;
        this.F0 = -1;
        org.telegram.messenger.g0.a0();
        bi biVar2 = this.f38416b;
        org.telegram.ui.ActionBar.d2 d2Var = biVar2.X1;
        if (d2Var instanceof org.telegram.ui.wm) {
            wmVar = (org.telegram.ui.wm) d2Var;
        } else {
            wmVar = null;
        }
        long b12 = biVar2.b1();
        this.W = b12;
        if (this.f38416b.G1) {
            this.f38795p0 = 7;
        } else if (z10 && wmVar != null && wmVar.h == null && !wmVar.c() && !org.telegram.messenger.l10.B(wmVar.j())) {
            this.f38795p0 = 1;
        } else {
            this.f38795p0 = 0;
        }
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23323v4);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23330w4);
        this.f38784e0 = false;
        this.f38783d0 = false;
        this.f38785f0 = false;
        kg.o0 o0Var = this.L;
        if (o0Var != null) {
            o0Var.F();
        }
        sk skVar = this.O;
        if (skVar != null) {
            skVar.F();
        }
        if (getParentActivity() != null && getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.U = z11;
        org.telegram.ui.ActionBar.q0 a10 = this.f38416b.S2.q().a(0, 2131232486);
        a10.N();
        a10.I = new lg.w1(this, 7);
        this.f38806x = a10;
        this.f38416b.getClass();
        a10.setVisibility(0);
        a10.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745846, null));
        a10.setContentDescription(org.telegram.messenger.bd.M0(2131745846, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        int i3 = org.telegram.ui.ActionBar.k6.f27988j5;
        org.telegram.ui.ActionBar.r6.V(searchField, i3, e6Var);
        org.telegram.ui.ActionBar.r6.w(searchField, i3, e6Var);
        org.telegram.ui.ActionBar.r6.E(searchField, org.telegram.ui.ActionBar.k6.Je, e6Var);
        new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(21.0f)).gravity = 83;
        ai.o2 o2Var = new ai.o2(16, context, this);
        this.K = o2Var;
        o2Var.setWillNotDraw(false);
        View view = new View(context);
        this.J = view;
        view.setBackgroundDrawable(new mc(org.telegram.ui.ActionBar.k6.D0().q()));
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ij, this.f38415a), false, e6Var);
        this.f38797r = q0Var;
        q0Var.setClickable(true);
        q0Var.setSubMenuOpenSide(2);
        q0Var.setAdditionalXOffset(org.telegram.messenger.g0.L(10.0f));
        q0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(10.0f));
        q0Var.d(2, 2131232213, null, org.telegram.messenger.bd.M0(2131748698, null), true, false, e6Var);
        q0Var.d(3, 2131232349, null, org.telegram.messenger.bd.M0(2131745958, null), true, false, e6Var);
        q0Var.d(4, 2131232184, null, org.telegram.messenger.bd.M0(2131749283, null), true, false, e6Var);
        q0Var.setContentDescription(org.telegram.messenger.bd.M0(2131754839, null));
        int L = org.telegram.messenger.g0.L(40.0f);
        int i10 = org.telegram.ui.ActionBar.k6.kj;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, this.f38415a);
        int i11 = org.telegram.ui.ActionBar.k6.lj;
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(L, w02, org.telegram.ui.ActionBar.k6.w0(i11, this.f38415a));
        b8.pf.a(q0Var);
        q0Var.setTranslationZ(org.telegram.messenger.g0.L(2.0f));
        cg.p0 p0Var = cg.t0.f4745a;
        q0Var.setOutlineProvider(p0Var);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i11);
        q0Var.setBackground(j02);
        org.telegram.ui.ActionBar.r6.k(q0Var, j02, N, N2, e6Var);
        q0Var.setIcon(2131232214);
        o2Var.addView(q0Var, b8.mf.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        q0Var.setOnClickListener(new f0(this, 6));
        q0Var.setDelegate(new jk(this));
        ImageView imageView = new ImageView(context);
        this.f38792n = imageView;
        org.telegram.ui.Cells.y j03 = org.telegram.ui.ActionBar.k6.j0(org.telegram.messenger.g0.L(40.0f), org.telegram.ui.ActionBar.k6.w0(i10, this.f38415a), org.telegram.ui.ActionBar.k6.w0(i11, this.f38415a));
        b8.pf.a(imageView);
        imageView.setTranslationZ(org.telegram.messenger.g0.L(2.0f));
        imageView.setOutlineProvider(p0Var);
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i10);
        org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i11);
        imageView.setBackground(j03);
        org.telegram.ui.ActionBar.r6.k(imageView, j03, N3, N4, e6Var);
        imageView.setImageResource(2131232105);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = org.telegram.ui.ActionBar.k6.jj;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i12, e6Var, mode);
        imageView.setTag(Integer.valueOf(i12));
        imageView.setContentDescription(org.telegram.messenger.bd.M0(2131754831, null));
        o2Var.addView(imageView, b8.mf.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        imageView.setOnClickListener(new q2(6, this, e6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f38799s = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(160.0f), 0, 0);
        linearLayout.setVisibility(8);
        addView(linearLayout, b8.mf.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new fi.a(15));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(2131231640);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.W5, e6Var, mode);
        linearLayout.addView(imageView2, b8.mf.o(-2, -2));
        TextView textView = new TextView(context);
        int i13 = org.telegram.ui.ActionBar.k6.X5;
        org.telegram.ui.ActionBar.r6.V(textView, i13, e6Var);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        k2.p1.u(textView, 1, 17.0f, null, 2131748187);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, b8.mf.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.f38804w = f10;
        org.telegram.ui.ActionBar.r6.V(f10, i13, e6Var);
        f10.setGravity(17);
        f10.setTextSize(1, 15.0f);
        f10.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        linearLayout.addView(f10, b8.mf.t(-2, -2, 17, 0, 6, 0, 0));
        ci.j1 j1Var = new ci.j1(this, context, e6Var, 16);
        this.M = j1Var;
        setBlur3Capture(j1Var);
        this.d = j1Var;
        this.f38419f = true;
        j1Var.setClipToPadding(false);
        kg.o0 o0Var2 = new kg.o0(context, this.f38795p0, b12, true, e6Var, this.f38416b.G1, false, false);
        this.L = o0Var2;
        j1Var.setAdapter(o0Var2);
        bi biVar3 = this.f38416b;
        if (biVar3 != null && (biVar3.f32298z1 || biVar3.H1)) {
            z12 = true;
        } else {
            z12 = false;
        }
        o0Var2.X = z12;
        j1Var.setItemAnimator(null);
        o0Var2.O(this.U, this.T);
        j1Var.setVerticalScrollBarEnabled(false);
        j1Var.r1();
        lg.d0 d0Var = new lg.d0(this, j1Var);
        this.Q = d0Var;
        j1Var.setLayoutManager(d0Var);
        addView(j1Var, b8.mf.e(-1, -1, 51));
        j1Var.setOnScrollListener(new rk(this, 0));
        j1Var.setOnItemClickListener(new fj0(this) {
            public final uk f35425b;

            {
                this.f35425b = this;
            }

            @Override
            public final void f(int i14, View view2) {
                switch (r4) {
                    case 0:
                        uk.T(this.f35425b, wmVar, e6Var, i14);
                        return;
                    default:
                        uk.V(this.f35425b, wmVar, e6Var, i14);
                        return;
                }
            }
        });
        o0Var2.P(this.f38796q0);
        addView(o2Var, indexOfChild(j1Var), b8.mf.e(-1, -1, 51));
        org.telegram.messenger.sa onCreateMapView = ((mb.b) org.telegram.messenger.t0.k()).onCreateMapView(context);
        this.F = onCreateMapView;
        b8.ke keVar = (b8.ke) onCreateMapView;
        keVar.f2717c = new jk(this);
        keVar.d = new org.telegram.ui.jo(16, this, e6Var);
        new Thread(new lk(this, onCreateMapView, 0)).start();
        ImageView imageView3 = new ImageView(context);
        this.P = imageView3;
        imageView3.setImageResource(2131231647);
        o2Var.addView(imageView3, b8.mf.e(28, 48, 49));
        tj0 tj0Var = new tj0(context, e6Var);
        this.N = tj0Var;
        tj0Var.setSections(true);
        tj0Var.setClipToPadding(false);
        tj0Var.setVisibility(8);
        tj0Var.setLayoutManager(new u4.b0(1, false));
        sk skVar2 = new sk(this, context, e6Var, this.f38416b.G1);
        this.O = skVar2;
        skVar2.f16934n = new jk(this);
        tj0Var.setItemAnimator(null);
        addView(tj0Var, b8.mf.e(-1, -1, 51));
        tj0Var.setOnScrollListener(new rk(this, 1));
        tj0Var.setOnItemClickListener(new fj0(this) {
            public final uk f35425b;

            {
                this.f35425b = this;
            }

            @Override
            public final void f(int i14, View view2) {
                switch (r4) {
                    case 0:
                        uk.T(this.f35425b, wmVar, e6Var, i14);
                        return;
                    default:
                        uk.V(this.f35425b, wmVar, e6Var, i14);
                        return;
                }
            }
        });
        j0();
    }

    public static void O(uk ukVar, org.telegram.ui.ActionBar.e6 e6Var) {
        ImageView imageView = ukVar.f38792n;
        Activity parentActivity = ukVar.getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            t4.C(ukVar.getParentActivity()).show();
        } else if (ukVar.f38788i0 != null && ukVar.E != null) {
            int i3 = org.telegram.ui.ActionBar.k6.jj;
            org.telegram.ui.ActionBar.r6.t(imageView, i3, e6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setTag(Integer.valueOf(i3));
            ukVar.L.L(null);
            ukVar.m0 = false;
            ukVar.E.b(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(new org.telegram.messenger.va(ukVar.f38788i0.getLatitude(), ukVar.f38788i0.getLongitude())));
        }
    }

    public static void P(uk ukVar, org.telegram.ui.wm wmVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.e6 e6Var) {
        if (wmVar != null && wmVar.c()) {
            t4.L(ukVar.getParentActivity(), wmVar.a(), new mk(ukVar, tL_messageMediaVenue, 1), e6Var);
            return;
        }
        ukVar.f38794o0.d(tL_messageMediaVenue, ukVar.f38795p0, true, 0, 0L);
        ukVar.f38416b.a(true);
    }

    public static void Q(uk ukVar) {
        if (ukVar.getParentActivity() != null) {
            try {
                ukVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            } catch (Exception unused) {
            }
        }
    }

    public static void R(uk ukVar, org.telegram.messenger.sa saVar) {
        if (ukVar.F != null && ukVar.getParentActivity() != null) {
            try {
                ((b8.ke) saVar).w();
                ((mb.b) org.telegram.messenger.t0.k()).initializeMaps(org.telegram.messenger.t0.f25457b);
                ((b8.ke) ukVar.F).o(new nk(ukVar, 0));
                ukVar.f38786g0 = true;
                if (ukVar.f38787h0) {
                    ((b8.ke) ukVar.F).A();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public static void S(uk ukVar) {
        ci.j1 j1Var = ukVar.M;
        ai.o2 o2Var = ukVar.K;
        if (ukVar.F != null && o2Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) o2Var.getLayoutParams();
            if (layoutParams != null) {
                int i3 = layoutParams.height;
                int i10 = ukVar.f38798r0;
                if (i3 != i10) {
                    layoutParams.height = i10;
                    o2Var.setLayoutParams(layoutParams);
                }
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((ai.c0) ((b8.ke) ukVar.F).f2716b).getLayoutParams();
            if (layoutParams2 != null && layoutParams2.height != ukVar.getMapContentHeight()) {
                layoutParams2.height = ukVar.getMapContentHeight();
                ((ai.c0) ((b8.ke) ukVar.F).f2716b).setLayoutParams(layoutParams2);
            }
            ukVar.L.P(ukVar.f38796q0);
            u4.d1 K = j1Var.K(0);
            if (K != null) {
                View view = K.f55540a;
                if (view.getLayoutParams() != null && view.getLayoutParams().height != ukVar.f38796q0) {
                    view.getLayoutParams().height = ukVar.f38796q0;
                    view.requestLayout();
                }
            }
            lg.d0 d0Var = ukVar.Q;
            d0Var.M = 0;
            d0Var.p1();
            j1Var.requestLayout();
            ukVar.i0();
        }
    }

    public static void T(uk ukVar, org.telegram.ui.wm wmVar, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        uk ukVar2;
        org.telegram.ui.wm wmVar2;
        org.telegram.ui.ActionBar.e6 e6Var2;
        TLRPC.User user;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j10 = ukVar.W;
        kg.o0 o0Var = ukVar.L;
        bi biVar = ukVar.f38416b;
        int i10 = ukVar.f38795p0;
        if (i10 == 7) {
            if (i3 == 1 && (tL_messageMediaVenue2 = o0Var.V) != null) {
                ukVar.f38794o0.d(tL_messageMediaVenue2, i10, true, 0, 0L);
                biVar.a(true);
                return;
            } else if (i3 == 2 && (tL_messageMediaVenue = o0Var.W) != null) {
                ukVar.f38794o0.d(tL_messageMediaVenue, i10, true, 0, 0L);
                biVar.a(true);
                return;
            } else {
                ukVar2 = ukVar;
                wmVar2 = wmVar;
                e6Var2 = e6Var;
            }
        } else if (i3 == 1) {
            if (ukVar.f38794o0 != null && ukVar.f38789j0 != null) {
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = org.telegram.messenger.g0.b0(ukVar.f38789j0.getLatitude());
                tL_messageMediaGeo.geo._long = org.telegram.messenger.g0.b0(ukVar.f38789j0.getLongitude());
                t4.Z(biVar.E3, biVar.X0() + 1, biVar.b1(), new ai.v1(ukVar, wmVar, tL_messageMediaGeo, e6Var, 7));
                return;
            } else if (ukVar.U) {
                t4.C(ukVar.getParentActivity()).show();
                return;
            } else {
                return;
            }
        } else {
            ukVar2 = ukVar;
            wmVar2 = wmVar;
            e6Var2 = e6Var;
            if (i3 == 2 && i10 == 1) {
                if (ukVar2.getLocationController().i(j10)) {
                    ukVar2.getLocationController().k(j10);
                    biVar.a(true);
                    return;
                } else if (ukVar2.f38788i0 == null && ukVar2.U) {
                    t4.C(ukVar2.getParentActivity()).show();
                    return;
                } else if (ukVar2.f38794o0 != null && ukVar2.getParentActivity() != null && ukVar2.f38788i0 != null) {
                    if (org.telegram.messenger.m5.E(j10)) {
                        user = biVar.X1.getMessagesController().a2(Long.valueOf(j10));
                    } else {
                        user = null;
                    }
                    t4.D(ukVar2.getParentActivity(), false, user, new org.telegram.messenger.kr() {
                        @Override
                        public final void a(int i11) {
                            uk ukVar3 = uk.this;
                            bi biVar2 = ukVar3.f38416b;
                            t4.Z(biVar2.E3, biVar2.X0() + 1, biVar2.b1(), new gi.s3(ukVar3, i11, 4));
                        }
                    }, ukVar2.f38415a).show();
                    return;
                } else {
                    return;
                }
            }
        }
        Object I = o0Var.I(i3);
        if (I instanceof TLRPC.TL_messageMediaVenue) {
            t4.Z(biVar.E3, biVar.X0() + 1, biVar.b1(), new ai.v1(ukVar2, wmVar2, (TLRPC.TL_messageMediaVenue) I, e6Var2, 8));
        }
    }

    public static void U(uk ukVar) {
        kg.o0 o0Var = ukVar.L;
        bi biVar = ukVar.f38416b;
        if (ukVar.f38782c0) {
            int i3 = Build.VERSION.SDK_INT;
            Activity parentActivity = ukVar.getParentActivity();
            if (parentActivity != null) {
                ukVar.f38782c0 = false;
                if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    String[] strArr = (!biVar.G1 || biVar.f32281u4 == null || i3 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
                    ukVar.T = true;
                    if (o0Var != null) {
                        o0Var.O(ukVar.U, true);
                    }
                    parentActivity.requestPermissions(strArr, 2);
                } else if (i3 >= 29 && biVar.G1 && biVar.f32281u4 != null && parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") != 0) {
                    ukVar.T = true;
                    if (o0Var != null) {
                        o0Var.O(ukVar.U, true);
                    }
                    parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
                }
            }
        }
    }

    public static void V(uk ukVar, org.telegram.ui.wm wmVar, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        bi biVar = ukVar.f38416b;
        TLRPC.TL_messageMediaVenue H = ukVar.O.H(i3);
        if (H != null && ukVar.f38795p0 != 7) {
            biVar.S2.l(true);
            TLRPC.GeoPoint geoPoint = H.geo;
            ukVar.h0(geoPoint.lat, geoPoint._long);
        } else if (H != null && ukVar.f38794o0 != null) {
            if (wmVar != null && wmVar.c()) {
                t4.L(ukVar.getParentActivity(), wmVar.a(), new mk(ukVar, H, 0), e6Var);
                return;
            }
            ukVar.f38794o0.d(H, ukVar.f38795p0, true, 0, 0L);
            biVar.a(true);
        }
    }

    public static void W(uk ukVar, Location location) {
        int i3;
        bi biVar = ukVar.f38416b;
        if (biVar != null && biVar.X1 != null) {
            ukVar.g0(location);
            kg.o0 o0Var = ukVar.L;
            if (o0Var != null && (((i3 = ukVar.f38795p0) == 7 || i3 == 8) && !ukVar.m0)) {
                o0Var.L(ukVar.f38789j0);
            }
            ukVar.getLocationController().n(location, ukVar.V);
            ukVar.V = false;
        }
    }

    public static void X(uk ukVar, org.telegram.ui.wm wmVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.e6 e6Var, Long l10) {
        if (wmVar != null && wmVar.c()) {
            t4.L(ukVar.getParentActivity(), wmVar.a(), new aa.a(ukVar, tL_messageMediaGeo, l10, 27), e6Var);
            return;
        }
        ukVar.f38794o0.d(tL_messageMediaGeo, ukVar.f38795p0, true, 0, l10.longValue());
        ukVar.f38416b.a(true);
    }

    public static void Z(uk ukVar, org.telegram.messenger.z9 z9Var) {
        PackageManager packageManager;
        ukVar.E = z9Var;
        ik ikVar = new ik(ukVar, 3);
        p4.q qVar = z9Var.f26754a;
        org.telegram.messenger.p1 p1Var = new org.telegram.messenger.p1(ikVar, 4);
        k8.e eVar = (k8.e) qVar.f53181a;
        try {
            j8.b bVar = new j8.b(p1Var);
            Parcel P0 = eVar.P0();
            u7.b.c(P0, bVar);
            eVar.T0(P0, 42);
            if (org.telegram.ui.ActionBar.k6.I.q() || org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, ukVar.f38415a)) < 0.721f) {
                ukVar.R = true;
                ukVar.E.i(((mb.b) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.f25457b, 2131624085));
            }
            if (ukVar.E != null) {
                Location location = new Location("network");
                ukVar.f38789j0 = location;
                location.setLatitude(20.659322d);
                ukVar.f38789j0.setLongitude(-11.40625d);
                try {
                    ukVar.E.k(true);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                ukVar.E.g().n2();
                ukVar.E.g().s2();
                ukVar.E.g().k2();
                ukVar.E.l(new jk(ukVar));
                org.telegram.messenger.z9 z9Var2 = ukVar.E;
                ik ikVar2 = new ik(ukVar, 4);
                p4.q qVar2 = z9Var2.f26754a;
                org.telegram.messenger.p1 p1Var2 = new org.telegram.messenger.p1(ikVar2, 6);
                k8.e eVar2 = (k8.e) qVar2.f53181a;
                try {
                    j8.b bVar2 = new j8.b(p1Var2, 0);
                    Parcel P02 = eVar2.P0();
                    u7.b.c(P02, bVar2);
                    eVar2.T0(P02, 99);
                    ukVar.E.n(new nk(ukVar, 1));
                    ukVar.E.m(new a3(12));
                    ukVar.f0();
                    org.telegram.messenger.g0.i3(new ik(ukVar, 5), 200L);
                    if (ukVar.S && ukVar.getParentActivity() != null) {
                        ukVar.S = false;
                        Activity parentActivity = ukVar.getParentActivity();
                        if (parentActivity == null || (packageManager = parentActivity.getPackageManager()) == null || packageManager.hasSystemFeature("android.hardware.location.gps")) {
                            try {
                                if (!((LocationManager) org.telegram.messenger.t0.f25457b.getSystemService("location")).isProviderEnabled("gps")) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ukVar.getParentActivity(), ukVar.f38415a);
                                    int i3 = org.telegram.ui.ActionBar.k6.L5;
                                    alertDialog$Builder.m(2131624119, 72, org.telegram.ui.ActionBar.k6.w0(i3, ukVar.f38415a), null);
                                    alertDialog$Builder.n(i3, ukVar.f38415a);
                                    alertDialog$Builder.f27343a.U = org.telegram.messenger.bd.M0(2131749538, null);
                                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751806, null), new jk(ukVar));
                                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                    alertDialog$Builder.p();
                                }
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                            }
                        } else {
                            return;
                        }
                    }
                    ukVar.i0();
                } catch (RemoteException e12) {
                    throw new RuntimeException(e12);
                }
            }
        } catch (RemoteException e13) {
            throw new RuntimeException(e13);
        }
    }

    public static void a0(uk ukVar) {
        kg.o0 o0Var = ukVar.L;
        ci.j1 j1Var = ukVar.M;
        if (ukVar.F != null && ukVar.K != null && ukVar.getMeasuredHeight() != 0) {
            u4.d1 K = j1Var.K(0);
            if (K != null) {
                View view = K.f55540a;
                int bottom = view.getBottom();
                int b10 = o0Var.b();
                int i3 = 1;
                while (true) {
                    if (i3 < b10) {
                        if (o0Var.d(i3) != 11) {
                            u4.d1 K2 = j1Var.K(i3);
                            if (K2 == null) {
                                break;
                            }
                            bottom = Math.max(bottom, K2.f55540a.getBottom());
                        }
                        i3++;
                    } else {
                        ukVar.f38800s0 = bottom - view.getBottom();
                        break;
                    }
                }
            }
            int i10 = ukVar.f38800s0;
            if (i10 < 0) {
                int L = org.telegram.messenger.g0.L(66.0f);
                int i11 = ukVar.f38795p0;
                if (i11 != 1 && i11 != 7 && i11 != 8) {
                    i10 = L;
                } else {
                    i10 = org.telegram.messenger.g0.L(66.0f) + L;
                }
            }
            int measuredHeight = (j1Var.getMeasuredHeight() - ukVar.getDefaultBottomInset()) - i10;
            int measuredHeight2 = ukVar.getMeasuredHeight() + ukVar.getMapExtraTop();
            int max = Math.max(org.telegram.messenger.g0.L(120.0f), measuredHeight - j1Var.getPaddingTop());
            if (measuredHeight2 != ukVar.f38798r0 || max != ukVar.f38796q0) {
                ukVar.f38798r0 = measuredHeight2;
                ukVar.f38796q0 = max;
                org.telegram.messenger.g0.h3(new ik(ukVar, 0));
            }
        }
    }

    private int getBottomInset() {
        d0();
        return org.telegram.messenger.g0.W1(0.0f, getDefaultBottomInset(), getMinBottomInset());
    }

    private int getDefaultBottomInset() {
        if (d0()) {
            return org.telegram.messenger.g0.L(8.0f) + this.f38418e;
        }
        return getMinBottomInset();
    }

    private Location getLastLocation() {
        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.f25457b.getSystemService("location");
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

    private org.telegram.messenger.ld getLocationController() {
        return this.f38416b.X1.getLocationController();
    }

    private int getMapContentHeight() {
        return org.telegram.messenger.g0.L(10.0f) + this.f38798r0 + this.D0;
    }

    private int getMapExtraTop() {
        return org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.f22602m;
    }

    private org.telegram.messenger.va getMapTarget() {
        Location location;
        if (this.m0 && (location = this.f38789j0) != null) {
            return new org.telegram.messenger.va(location.getLatitude(), this.f38789j0.getLongitude());
        }
        Location location2 = this.f38788i0;
        if (location2 != null) {
            return new org.telegram.messenger.va(location2.getLatitude(), this.f38788i0.getLongitude());
        }
        return null;
    }

    private org.telegram.messenger.hp getMessagesController() {
        return this.f38416b.X1.getMessagesController();
    }

    private int getMinBottomInset() {
        if (d0()) {
            return getDefaultBottomInset();
        }
        return Math.min(this.f38418e, org.telegram.messenger.g0.f22603n);
    }

    private Activity getParentActivity() {
        org.telegram.ui.ActionBar.d2 d2Var;
        bi biVar = this.f38416b;
        if (biVar != null && (d2Var = biVar.X1) != null) {
            return d2Var.getParentActivity();
        }
        return null;
    }

    private org.telegram.messenger.h10 getUserConfig() {
        return this.f38416b.X1.getUserConfig();
    }

    @Override
    public final void A() {
        org.telegram.messenger.sa saVar = this.F;
        if (saVar != null && this.f38786g0) {
            try {
                ((b8.ke) saVar).y();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        this.f38787h0 = false;
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.uk.B(int, int):void");
    }

    @Override
    public final void C() {
        org.telegram.messenger.sa saVar = this.F;
        if (saVar != null && this.f38786g0) {
            try {
                ((b8.ke) saVar).A();
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        this.f38787h0 = true;
    }

    @Override
    public final void E(float f10, float f11) {
        if (this.f38802u0 == f10 && this.f38803v0 == f11) {
            return;
        }
        this.f38802u0 = f10;
        this.f38803v0 = f11;
        e0();
    }

    @Override
    public final void H(th thVar) {
        long j10;
        bi biVar = this.f38416b;
        biVar.S2.setTitle(org.telegram.messenger.bd.M0(2131745466, null));
        if (((ai.c0) ((b8.ke) this.F).f2716b).getParent() == null) {
            FrameLayout.LayoutParams e10 = b8.mf.e(-1, org.telegram.messenger.g0.L(10.0f) + this.f38796q0, 51);
            ai.o2 o2Var = this.K;
            o2Var.addView((ai.c0) ((b8.ke) this.F).f2716b, 0, e10);
            o2Var.addView(this.J, 1, b8.mf.c(-1.0f, -1));
        }
        this.f38806x.setVisibility(0);
        org.telegram.messenger.sa saVar = this.F;
        if (saVar != null && this.f38786g0) {
            try {
                ((b8.ke) saVar).A();
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        this.f38787h0 = true;
        org.telegram.messenger.z9 z9Var = this.E;
        if (z9Var != null) {
            try {
                z9Var.k(true);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        c0();
        boolean g02 = biVar.U3.g0();
        ik ikVar = new ik(this, 1);
        if (g02) {
            j10 = 200;
        } else {
            j10 = 0;
        }
        org.telegram.messenger.g0.i3(ikVar, j10);
        this.Q.h1(0, 0);
        i0();
    }

    @Override
    public final void J() {
        this.M.y0(0);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28061n5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27824a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27843b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ci));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.cj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.fj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27879d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27972i6));
    }

    public final void b0() {
        org.telegram.ui.ActionBar.q0 q0Var = this.f38797r;
        if (q0Var != null) {
            q0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ij, this.f38415a));
            this.f38797r.H(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, this.f38415a));
            this.f38797r.O(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, this.f38415a), true);
            this.f38797r.O(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, this.f38415a), false);
        }
        if (this.E != null) {
            if (org.telegram.ui.ActionBar.k6.I.q() || org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, this.f38415a)) < 0.721f) {
                if (!this.R) {
                    this.R = true;
                    this.E.i(((mb.b) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.f25457b, 2131624085));
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
            ci.j1 j1Var = this.M;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) j1Var.getLayoutParams();
            layoutParams.topMargin = currentActionBarHeight;
            j1Var.setLayoutParams(layoutParams);
            ai.o2 o2Var = this.K;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) o2Var.getLayoutParams();
            layoutParams2.topMargin = 0;
            layoutParams2.height = this.f38798r0;
            o2Var.setLayoutParams(layoutParams2);
            tj0 tj0Var = this.N;
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) tj0Var.getLayoutParams();
            layoutParams3.topMargin = currentActionBarHeight;
            tj0Var.setLayoutParams(layoutParams3);
            int i3 = this.f38796q0;
            kg.o0 o0Var = this.L;
            o0Var.P(i3);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((ai.c0) ((b8.ke) this.F).f2716b).getLayoutParams();
            if (layoutParams4 != null) {
                layoutParams4.height = org.telegram.messenger.g0.L(10.0f) + this.f38798r0;
                ((ai.c0) ((b8.ke) this.F).f2716b).setLayoutParams(layoutParams4);
            }
            o0Var.f();
            i0();
        }
    }

    public final boolean d0() {
        ah ahVar = this.f38416b.f32272s3;
        if (ahVar != null && ahVar.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.hs.f23323v4;
        kg.o0 o0Var = this.L;
        if (i3 == i11) {
            this.U = false;
            this.T = false;
            f0();
            if (o0Var != null) {
                o0Var.O(this.U, this.T);
            }
            org.telegram.messenger.z9 z9Var = this.E;
            if (z9Var != null) {
                try {
                    z9Var.k(true);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        } else if (i3 == org.telegram.messenger.hs.f23330w4) {
            this.U = true;
            this.T = false;
            if (o0Var != null) {
                o0Var.O(true, false);
            }
        }
        c0();
        this.f38416b.getClass();
        this.f38806x.setVisibility(0);
    }

    @Override
    public final boolean e() {
        return !d0();
    }

    public final void e0() {
        ai.o2 o2Var;
        ci.j1 j1Var;
        int i3;
        int mapContentHeight;
        org.telegram.messenger.va vaVar;
        if (this.F != null && (o2Var = this.K) != null && (j1Var = this.M) != null) {
            u4.d1 K = j1Var.K(0);
            if (K != null) {
                i3 = K.f55540a.getTop() + j1Var.getTop();
            } else {
                i3 = Integer.MAX_VALUE;
            }
            if (K != null && i3 < getMeasuredHeight()) {
                if (((ai.c0) ((b8.ke) this.F).f2716b).getVisibility() == 4) {
                    ((ai.c0) ((b8.ke) this.F).f2716b).setVisibility(0);
                    o2Var.setVisibility(0);
                }
                float f10 = i3;
                boolean z10 = true;
                if (this.f38803v0 < 1.0f) {
                    int[] iArr = this.f38805w0;
                    getLocationInWindow(iArr);
                    f10 = Math.min(i3, org.telegram.messenger.g0.W1(this.f38803v0, -iArr[1], i3));
                }
                int max = (int) Math.max(f10, -getMapExtraTop());
                int max2 = (Math.max(0, K.f55540a.getTop()) + j1Var.getTop()) - max;
                int min = (Math.min(this.f38801t0, j1Var.getMeasuredHeight()) + j1Var.getTop()) - max;
                this.f38807x0 = org.telegram.messenger.g0.L(32.0f) + max2;
                this.f38809y0 = min;
                this.f38810z0 = Math.max(0, this.f38798r0 - (getMeasuredHeight() - max));
                float f11 = max;
                o2Var.setTranslationY(f11);
                o2Var.invalidate();
                this.f38797r.setTranslationY(max2);
                this.f38792n.setTranslationY(-Math.max(0, this.f38798r0 - min));
                int top = j1Var.getTop();
                int i10 = min + max;
                float f12 = (top + i10) / 2.0f;
                float max3 = Math.max(f12, ((j1Var.getPaddingTop() + top) + i10) / 2.0f);
                int ceil = (int) Math.ceil(max3 - f12);
                if (ceil != this.D0) {
                    this.D0 = ceil;
                    org.telegram.messenger.g0.h3(new ik(this, 0));
                }
                float max4 = Math.max(f12, Math.min(max3, ((max + max2) + i10) / 2.0f));
                int ceil2 = ((int) Math.ceil(max3)) + getMapExtraTop();
                float f13 = max4 - ceil2;
                ((ai.c0) ((b8.ke) this.F).f2716b).setTranslationY(f13 - f11);
                int L = ((int) (max4 - f11)) - org.telegram.messenger.g0.L(48.0f);
                if (L != this.f38790k0) {
                    this.f38790k0 = L;
                    this.P.setTranslationY(L);
                }
                if (((ai.c0) ((b8.ke) this.F).f2716b).getMeasuredHeight() > 0) {
                    mapContentHeight = ((ai.c0) ((b8.ke) this.F).f2716b).getMeasuredHeight();
                } else {
                    mapContentHeight = getMapContentHeight();
                }
                int max5 = Math.max(0, (int) (mapContentHeight - (i10 - f13)));
                int i11 = ((ceil2 * 2) - mapContentHeight) + max5;
                org.telegram.messenger.z9 z9Var = this.E;
                if (z9Var != null) {
                    int i12 = this.E0;
                    if (i11 != i12 || max5 != this.F0) {
                        if (i12 >= 0) {
                            z10 = false;
                        }
                        if (z10) {
                            vaVar = getMapTarget();
                        } else if (ceil2 != this.C0) {
                            z9Var.d();
                            vaVar = (org.telegram.messenger.va) this.E.d().f13795b;
                        } else {
                            vaVar = null;
                        }
                        this.C0 = ceil2;
                        this.E0 = i11;
                        this.F0 = max5;
                        this.E.o(0, org.telegram.messenger.g0.L(6.0f) + i11, 0, org.telegram.messenger.g0.L(6.0f) + max5);
                        if (vaVar != null) {
                            this.E.h(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(vaVar));
                        }
                    }
                }
            } else if (((ai.c0) ((b8.ke) this.F).f2716b).getVisibility() == 0) {
                ((ai.c0) ((b8.ke) this.F).f2716b).setVisibility(4);
                o2Var.setVisibility(4);
            }
        }
    }

    @Override
    public final boolean f() {
        return true;
    }

    public final void f0() {
        uk ukVar;
        bi biVar = this.f38416b;
        if (biVar.G1) {
            if (biVar.f32285v4 != null) {
                org.telegram.messenger.g0.h3(new ik(this, 2));
                return;
            } else if (!this.U) {
                File file = biVar.f32281u4;
                boolean z10 = biVar.f32277t4;
                if (file != null) {
                    if (z10) {
                        try {
                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                            String extractMetadata = mediaMetadataRetriever.extractMetadata(23);
                            if (extractMetadata != null) {
                                Matcher matcher = Pattern.compile("([+\\-][0-9.]+)([+\\-][0-9.]+)").matcher(extractMetadata);
                                if (matcher.find() && matcher.groupCount() == 2) {
                                    org.telegram.messenger.g0.h3(new org.telegram.ui.Cells.p7(this, Double.parseDouble(matcher.group(1)), Double.parseDouble(matcher.group(2)), 2));
                                    return;
                                }
                            }
                        } catch (NumberFormatException | Exception unused) {
                        }
                    } else {
                        ukVar = this;
                        ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                        float[] fArr = new float[2];
                        if (exifInterface.getLatLong(fArr)) {
                            org.telegram.messenger.g0.h3(new org.telegram.ui.lo(28, this, fArr));
                            return;
                        }
                        Location lastLocation = getLastLocation();
                        ukVar.f38788i0 = lastLocation;
                        g0(lastLocation);
                        return;
                    }
                }
                ukVar = this;
                Location lastLocation2 = getLastLocation();
                ukVar.f38788i0 = lastLocation2;
                g0(lastLocation2);
                return;
            } else {
                org.telegram.messenger.g0.h3(new ik(this, 7));
                return;
            }
        }
        Location lastLocation3 = getLastLocation();
        this.f38788i0 = lastLocation3;
        g0(lastLocation3);
    }

    public final void g0(Location location) {
        if (location != null) {
            Location location2 = new Location(location);
            this.f38788i0 = location2;
            org.telegram.messenger.z9 z9Var = this.E;
            kg.o0 o0Var = this.L;
            if (z9Var != null) {
                org.telegram.messenger.va vaVar = new org.telegram.messenger.va(location.getLatitude(), location.getLongitude());
                if (o0Var != null) {
                    o0Var.M(this.f38788i0);
                }
                if (!this.m0) {
                    this.f38789j0 = new Location(location);
                    if (this.f38793n0) {
                        this.E.b(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(vaVar));
                        return;
                    }
                    this.f38793n0 = true;
                    this.E.h(((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(vaVar, this.E.e() - 4.0f));
                    return;
                }
                return;
            }
            o0Var.M(location2);
        }
    }

    @Override
    public int getButtonsHideOffset() {
        return org.telegram.messenger.g0.L(56.0f);
    }

    @Override
    public int getCurrentItemTop() {
        ci.j1 j1Var = this.M;
        if (j1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i3 = 0;
        bj0 bj0Var = (bj0) j1Var.K(0);
        if (bj0Var != null) {
            i3 = Math.max((int) bj0Var.f55540a.getY(), 0);
        }
        return org.telegram.messenger.g0.L(56.0f) + i3;
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
    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList = new ArrayList<>();
        q6 q6Var = new q6(this, 1);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.K, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27954h5));
        int i3 = org.telegram.ui.ActionBar.k6.A5;
        ci.j1 j1Var = this.M;
        arrayList.add(new org.telegram.ui.ActionBar.t6(j1Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i3));
        org.telegram.ui.ActionBar.q0 q0Var = this.f38806x;
        if (q0Var != null) {
            editTextBoldCursor = q0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(editTextBoldCursor, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27988j5));
        int i10 = org.telegram.ui.ActionBar.k6.kj;
        ImageView imageView = this.f38792n;
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.lj;
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.ij;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.f38797r;
        arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(q0Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.gj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.mj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(j1Var, 393216, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(j1Var, 393216, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ej));
        arrayList.add(new org.telegram.ui.ActionBar.t6(j1Var, 393248, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(j1Var, 393248, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(j1Var, 196608, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ei));
        return arrayList;
    }

    public final void h0(double d, double d10) {
        org.telegram.messenger.na newCameraUpdateLatLngZoom;
        if (this.E != null) {
            int i3 = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
            if (i3 != 0 && d10 != 0.0d) {
                Location location = new Location("");
                this.f38789j0 = location;
                location.reset();
                this.f38789j0.setLatitude(d);
                this.f38789j0.setLongitude(d10);
            } else {
                Location location2 = new Location("");
                this.f38788i0 = location2;
                location2.reset();
                this.f38788i0.setLatitude(d);
                this.f38788i0.setLongitude(d10);
            }
            org.telegram.messenger.va vaVar = new org.telegram.messenger.va(d, d10);
            if (i3 != 0 && d10 != 0.0d) {
                newCameraUpdateLatLngZoom = ((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(vaVar, this.E.e() - 4.0f);
            } else {
                newCameraUpdateLatLngZoom = ((mb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(vaVar, this.E.f());
            }
            this.G = newCameraUpdateLatLngZoom;
            this.E.h(newCameraUpdateLatLngZoom);
            kg.o0 o0Var = this.L;
            if (i3 != 0 && d10 != 0.0d) {
                o0Var.L(this.f38789j0);
            } else {
                o0Var.M(this.f38788i0);
            }
            o0Var.H();
            this.M.w0(0, 1, null);
            this.f38791l0 = true;
            if (i3 != 0 && d10 != 0.0d) {
                this.m0 = true;
            }
        }
    }

    public final void i0() {
        ai.o2 o2Var;
        if (this.F != null && (o2Var = this.K) != null) {
            ci.j1 j1Var = this.M;
            u4.d1 K = j1Var.K(0);
            if (K != null) {
                K.f55540a.getTop();
            } else {
                o2Var.getMeasuredHeight();
            }
            int i3 = this.f38800s0;
            if (i3 < 0) {
                int L = org.telegram.messenger.g0.L(66.0f);
                int i10 = this.f38795p0;
                if (i10 != 1 && i10 != 7 && i10 != 8) {
                    i3 = L;
                } else {
                    i3 = org.telegram.messenger.g0.L(66.0f) + L;
                }
            }
            int measuredHeight = (j1Var.getMeasuredHeight() - getBottomInset()) - i3;
            this.f38801t0 = measuredHeight;
            if (K != null) {
                int bottom = measuredHeight - K.f55540a.getBottom();
                int childCount = j1Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = j1Var.getChildAt(i11);
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
        boolean z10 = this.f38783d0;
        LinearLayout linearLayout = this.f38799s;
        if (z10) {
            boolean z11 = this.f38785f0;
            tj0 tj0Var = this.N;
            if (z11) {
                tj0Var.setEmptyView(null);
                linearLayout.setVisibility(8);
                return;
            }
            tj0Var.setEmptyView(linearLayout);
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
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        super.onLayout(z10, i3, i10, i11, i12);
        if (z10) {
            c0();
        }
    }

    @Override
    public final void p() {
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23323v4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23330w4);
        this.f38808y = true;
        ai.o2 o2Var = this.K;
        if (o2Var != null) {
            o2Var.invalidate();
        }
        try {
            org.telegram.messenger.z9 z9Var = this.E;
            if (z9Var != null) {
                z9Var.k(false);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.messenger.sa saVar = this.F;
        if (saVar != null) {
            ((ai.c0) ((b8.ke) saVar).f2716b).setTranslationY((-org.telegram.messenger.g0.f22608q.y) * 3);
        }
        try {
            org.telegram.messenger.sa saVar2 = this.F;
            if (saVar2 != null) {
                ((b8.ke) saVar2).y();
            }
        } catch (Exception unused) {
        }
        try {
            org.telegram.messenger.sa saVar3 = this.F;
            if (saVar3 != null) {
                ((b8.ke) saVar3).x();
                this.F = null;
            }
        } catch (Exception unused2) {
        }
        kg.o0 o0Var = this.L;
        if (o0Var != null) {
            o0Var.F();
        }
        sk skVar = this.O;
        if (skVar != null) {
            skVar.F();
        }
        bi biVar = this.f38416b;
        biVar.S2.l(true);
        biVar.S2.q().removeView(this.f38806x);
    }

    @Override
    public final boolean q() {
        p();
        return false;
    }

    public void setDelegate(tk tkVar) {
        this.f38794o0 = tkVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f38416b.f28586b.invalidate();
        i0();
    }

    @Override
    public final void u() {
        this.f38806x.setVisibility(8);
    }

    @Override
    public final void updateColors() {
        try {
            b0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.f38806x;
        if (q0Var != null) {
            try {
                if (q0Var.getSearchField() != null) {
                    q0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27988j5, this.f38415a));
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
    }

    @Override
    public final void y() {
        boolean z10;
        bi biVar = this.f38416b;
        if (biVar != null && !biVar.d) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.L.U = z10;
    }

    @Override
    public final void z(int i3, boolean z10) {
        if (z10) {
            this.L.U = false;
        }
    }
}
