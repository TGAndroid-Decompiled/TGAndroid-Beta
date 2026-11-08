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
public final class wk extends vh implements org.telegram.ui.ActionBar.a6, org.telegram.messenger.ls {
    public static final int F0 = 0;
    public final rk A0;
    public int B0;
    public int C0;
    public org.telegram.messenger.fa D;
    public int D0;
    public org.telegram.messenger.za E;
    public int E0;
    public org.telegram.messenger.ua F;
    public float G;
    public boolean H;
    public final View I;
    public final bi.e5 J;
    public final jg.r0 K;
    public final bi.q1 L;
    public final pj0 M;
    public final uk N;
    public final ImageView O;
    public final kg.c0 P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public final long V;
    public final Paint W;
    public AnimatorSet f39945a0;
    public boolean f39946b0;
    public boolean f39947c0;
    public boolean f39948d0;
    public boolean f39949e0;
    public boolean f39950f0;
    public boolean f39951g0;
    public Location f39952h0;
    public Location f39953i0;
    public int f39954j0;
    public boolean f39955k0;
    public boolean f39956l0;
    public boolean m0;
    public final ImageView f39957n;
    public vk f39958n0;
    public final int f39959o0;
    public int f39960p0;
    public int f39961q0;
    public final org.telegram.ui.ActionBar.r0 f39962r;
    public int f39963r0;
    public final LinearLayout f39964s;
    public int f39965s0;
    public float f39966t0;
    public float f39967u0;
    public final int[] f39968v0;
    public final TextView f39969w;
    public int f39970w0;
    public final org.telegram.ui.ActionBar.r0 f39971x;
    public int f39972x0;
    public boolean f39973y;
    public int f39974y0;
    public float f39975z0;

    public wk(di diVar, Context context, final org.telegram.ui.ActionBar.f6 f6Var, boolean z9) {
        super(context, f6Var, diVar);
        final org.telegram.ui.an anVar;
        boolean z10;
        boolean z11;
        this.R = true;
        this.S = false;
        this.T = false;
        this.U = true;
        this.W = new Paint();
        this.f39946b0 = true;
        int currentActionBarHeight = (org.telegram.messenger.g0.f22563q.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(66.0f);
        this.f39960p0 = currentActionBarHeight;
        this.f39961q0 = currentActionBarHeight;
        this.f39963r0 = -1;
        this.f39965s0 = Integer.MAX_VALUE;
        this.f39966t0 = Float.NaN;
        this.f39967u0 = 1.0f;
        this.f39968v0 = new int[2];
        this.f39972x0 = Integer.MAX_VALUE;
        this.f39975z0 = -1.0f;
        this.A0 = new rk(0, this);
        this.D0 = -1;
        this.E0 = -1;
        org.telegram.messenger.g0.a0();
        di diVar2 = this.f39004b;
        org.telegram.ui.ActionBar.f2 f2Var = diVar2.W1;
        if (f2Var instanceof org.telegram.ui.an) {
            anVar = (org.telegram.ui.an) f2Var;
        } else {
            anVar = null;
        }
        long b12 = diVar2.b1();
        this.V = b12;
        if (this.f39004b.F1) {
            this.f39959o0 = 7;
        } else if (z9 && anVar != null && anVar.h == null && !anVar.c() && !org.telegram.messenger.t10.B(anVar.j())) {
            this.f39959o0 = 1;
        } else {
            this.f39959o0 = 0;
        }
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25094v4);
        org.telegram.messenger.qs.e().c(this, org.telegram.messenger.qs.f25101w4);
        this.f39948d0 = false;
        this.f39947c0 = false;
        this.f39949e0 = false;
        jg.r0 r0Var = this.K;
        if (r0Var != null) {
            r0Var.F();
        }
        uk ukVar = this.N;
        if (ukVar != null) {
            ukVar.F();
        }
        if (getParentActivity() != null && getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.T = z10;
        org.telegram.ui.ActionBar.r0 a10 = this.f39004b.R2.q().a(0, 2131232486);
        a10.N();
        a10.H = new kg.v1(this, 7);
        this.f39971x = a10;
        this.f39004b.getClass();
        a10.setVisibility(0);
        a10.setSearchFieldHint(org.telegram.messenger.id.M0(2131745839, null));
        a10.setContentDescription(org.telegram.messenger.id.M0(2131745839, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        int i7 = org.telegram.ui.ActionBar.k6.f27960j5;
        org.telegram.ui.ActionBar.r6.V(searchField, i7, f6Var);
        org.telegram.ui.ActionBar.r6.w(searchField, i7, f6Var);
        org.telegram.ui.ActionBar.r6.E(searchField, org.telegram.ui.ActionBar.k6.Je, f6Var);
        new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(21.0f)).gravity = 83;
        bi.e5 e5Var = new bi.e5(14, context, this);
        this.J = e5Var;
        e5Var.setWillNotDraw(false);
        View view = new View(context);
        this.I = view;
        view.setBackgroundDrawable(new oc(org.telegram.ui.ActionBar.k6.D0().q()));
        org.telegram.ui.ActionBar.r0 r0Var2 = new org.telegram.ui.ActionBar.r0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ij, this.f39003a), false, f6Var);
        this.f39962r = r0Var2;
        r0Var2.setClickable(true);
        r0Var2.setSubMenuOpenSide(2);
        r0Var2.setAdditionalXOffset(org.telegram.messenger.g0.L(10.0f));
        r0Var2.setAdditionalYOffset(-org.telegram.messenger.g0.L(10.0f));
        r0Var2.d(2, 2131232213, null, org.telegram.messenger.id.M0(2131748691, null), true, false, f6Var);
        r0Var2.d(3, 2131232349, null, org.telegram.messenger.id.M0(2131745951, null), true, false, f6Var);
        r0Var2.d(4, 2131232184, null, org.telegram.messenger.id.M0(2131749276, null), true, false, f6Var);
        r0Var2.setContentDescription(org.telegram.messenger.id.M0(2131754839, null));
        int L = org.telegram.messenger.g0.L(40.0f);
        int i10 = org.telegram.ui.ActionBar.k6.kj;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i10, this.f39003a);
        int i11 = org.telegram.ui.ActionBar.k6.lj;
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(L, w02, org.telegram.ui.ActionBar.k6.w0(i11, this.f39003a));
        c8.ka.a(r0Var2);
        r0Var2.setTranslationZ(org.telegram.messenger.g0.L(2.0f));
        bg.q0 q0Var = bg.u0.f3380a;
        r0Var2.setOutlineProvider(q0Var);
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i10);
        org.telegram.ui.ActionBar.n6 N2 = org.telegram.ui.ActionBar.r6.N(i11);
        r0Var2.setBackground(j02);
        org.telegram.ui.ActionBar.r6.k(r0Var2, j02, N, N2, f6Var);
        r0Var2.setIcon(2131232214);
        e5Var.addView(r0Var2, c8.ha.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        r0Var2.setOnClickListener(new h0(this, 6));
        r0Var2.setDelegate(new kk(this));
        ImageView imageView = new ImageView(context);
        this.f39957n = imageView;
        org.telegram.ui.Cells.y j03 = org.telegram.ui.ActionBar.k6.j0(org.telegram.messenger.g0.L(40.0f), org.telegram.ui.ActionBar.k6.w0(i10, this.f39003a), org.telegram.ui.ActionBar.k6.w0(i11, this.f39003a));
        c8.ka.a(imageView);
        imageView.setTranslationZ(org.telegram.messenger.g0.L(2.0f));
        imageView.setOutlineProvider(q0Var);
        org.telegram.ui.ActionBar.n6 N3 = org.telegram.ui.ActionBar.r6.N(i10);
        org.telegram.ui.ActionBar.n6 N4 = org.telegram.ui.ActionBar.r6.N(i11);
        imageView.setBackground(j03);
        org.telegram.ui.ActionBar.r6.k(imageView, j03, N3, N4, f6Var);
        imageView.setImageResource(2131232105);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = org.telegram.ui.ActionBar.k6.jj;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i12, f6Var, mode);
        imageView.setTag(Integer.valueOf(i12));
        imageView.setContentDescription(org.telegram.messenger.id.M0(2131754831, null));
        e5Var.addView(imageView, c8.ha.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        imageView.setOnClickListener(new lk(0, this, f6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f39964s = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(160.0f), 0, 0);
        linearLayout.setVisibility(8);
        addView(linearLayout, c8.ha.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new ei.b(15));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(2131231640);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.W5, f6Var, mode);
        linearLayout.addView(imageView2, c8.ha.o(-2, -2));
        TextView textView = new TextView(context);
        int i13 = org.telegram.ui.ActionBar.k6.X5;
        org.telegram.ui.ActionBar.r6.V(textView, i13, f6Var);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        jg.g.v(textView, 1, 17.0f, null, 2131748180);
        TextView f10 = org.telegram.messenger.camera.q.f(linearLayout, textView, c8.ha.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.f39969w = f10;
        org.telegram.ui.ActionBar.r6.V(f10, i13, f6Var);
        f10.setGravity(17);
        f10.setTextSize(1, 15.0f);
        f10.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        linearLayout.addView(f10, c8.ha.t(-2, -2, 17, 0, 6, 0, 0));
        bi.q1 q1Var = new bi.q1(this, context, f6Var, 16);
        this.L = q1Var;
        setBlur3Capture(q1Var);
        this.d = q1Var;
        this.f39007f = true;
        q1Var.setClipToPadding(false);
        jg.r0 r0Var3 = new jg.r0(context, this.f39959o0, b12, true, f6Var, this.f39004b.F1, false, false);
        this.K = r0Var3;
        q1Var.setAdapter(r0Var3);
        di diVar3 = this.f39004b;
        if (diVar3 != null && (diVar3.f33015y1 || diVar3.G1)) {
            z11 = true;
        } else {
            z11 = false;
        }
        r0Var3.W = z11;
        q1Var.setItemAnimator(null);
        r0Var3.O(this.T, this.S);
        q1Var.setVerticalScrollBarEnabled(false);
        q1Var.r1();
        kg.c0 c0Var = new kg.c0(this, q1Var);
        this.P = c0Var;
        q1Var.setLayoutManager(c0Var);
        addView(q1Var, c8.ha.e(-1, -1, 51));
        q1Var.setOnScrollListener(new tk(this, 0));
        q1Var.setOnItemClickListener(new bj0(this) {
            public final wk f35993b;

            {
                this.f35993b = this;
            }

            @Override
            public final void c(int i14, View view2) {
                switch (r4) {
                    case 0:
                        wk.T(this.f35993b, anVar, f6Var, i14);
                        return;
                    default:
                        wk.V(this.f35993b, anVar, f6Var, i14);
                        return;
                }
            }
        });
        r0Var3.P(this.f39960p0);
        addView(e5Var, indexOfChild(q1Var), c8.ha.e(-1, -1, 51));
        org.telegram.messenger.za onCreateMapView = ((nb.a) org.telegram.messenger.t0.k()).onCreateMapView(context);
        this.E = onCreateMapView;
        a8.r7 r7Var = (a8.r7) onCreateMapView;
        r7Var.f615c = new kk(this);
        r7Var.d = new f2(6, this, f6Var);
        new Thread(new nk(this, onCreateMapView, 0)).start();
        ImageView imageView3 = new ImageView(context);
        this.O = imageView3;
        imageView3.setImageResource(2131231647);
        e5Var.addView(imageView3, c8.ha.e(28, 48, 49));
        pj0 pj0Var = new pj0(context, f6Var);
        this.M = pj0Var;
        pj0Var.setSections(true);
        pj0Var.setClipToPadding(false);
        pj0Var.setVisibility(8);
        pj0Var.setLayoutManager(new v4.b0(1, false));
        uk ukVar2 = new uk(this, context, f6Var, this.f39004b.F1);
        this.N = ukVar2;
        ukVar2.f16675n = new kk(this);
        pj0Var.setItemAnimator(null);
        addView(pj0Var, c8.ha.e(-1, -1, 51));
        pj0Var.setOnScrollListener(new tk(this, 1));
        pj0Var.setOnItemClickListener(new bj0(this) {
            public final wk f35993b;

            {
                this.f35993b = this;
            }

            @Override
            public final void c(int i14, View view2) {
                switch (r4) {
                    case 0:
                        wk.T(this.f35993b, anVar, f6Var, i14);
                        return;
                    default:
                        wk.V(this.f35993b, anVar, f6Var, i14);
                        return;
                }
            }
        });
        j0();
    }

    public static void O(wk wkVar, org.telegram.ui.ActionBar.f6 f6Var) {
        ImageView imageView = wkVar.f39957n;
        Activity parentActivity = wkVar.getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            v4.A(wkVar.getParentActivity()).show();
        } else if (wkVar.f39952h0 != null && wkVar.D != null) {
            int i7 = org.telegram.ui.ActionBar.k6.jj;
            org.telegram.ui.ActionBar.r6.t(imageView, i7, f6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setTag(Integer.valueOf(i7));
            wkVar.K.L(null);
            wkVar.f39956l0 = false;
            wkVar.D.b(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(new org.telegram.messenger.cb(wkVar.f39952h0.getLatitude(), wkVar.f39952h0.getLongitude())));
        }
    }

    public static void P(wk wkVar, org.telegram.ui.an anVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.f6 f6Var) {
        if (anVar != null && anVar.c()) {
            v4.J(wkVar.getParentActivity(), anVar.a(), new ok(wkVar, tL_messageMediaVenue, 1), f6Var);
            return;
        }
        wkVar.f39958n0.d(tL_messageMediaVenue, wkVar.f39959o0, true, 0, 0L);
        wkVar.f39004b.a(true);
    }

    public static void Q(wk wkVar) {
        if (wkVar.getParentActivity() != null) {
            try {
                wkVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            } catch (Exception unused) {
            }
        }
    }

    public static void R(wk wkVar, org.telegram.messenger.za zaVar) {
        if (wkVar.E != null && wkVar.getParentActivity() != null) {
            try {
                ((a8.r7) zaVar).u();
                ((nb.a) org.telegram.messenger.t0.k()).initializeMaps(org.telegram.messenger.t0.f25566b);
                ((a8.r7) wkVar.E).p(new pk(wkVar, 0));
                wkVar.f39950f0 = true;
                if (wkVar.f39951g0) {
                    ((a8.r7) wkVar.E).z();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public static void S(wk wkVar) {
        bi.q1 q1Var = wkVar.L;
        bi.e5 e5Var = wkVar.J;
        if (wkVar.E != null && e5Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) e5Var.getLayoutParams();
            if (layoutParams != null) {
                int i7 = layoutParams.height;
                int i10 = wkVar.f39961q0;
                if (i7 != i10) {
                    layoutParams.height = i10;
                    e5Var.setLayoutParams(layoutParams);
                }
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((bi.x5) ((a8.r7) wkVar.E).f614b).getLayoutParams();
            if (layoutParams2 != null && layoutParams2.height != wkVar.getMapContentHeight()) {
                layoutParams2.height = wkVar.getMapContentHeight();
                ((bi.x5) ((a8.r7) wkVar.E).f614b).setLayoutParams(layoutParams2);
            }
            wkVar.K.P(wkVar.f39960p0);
            v4.d1 K = q1Var.K(0);
            if (K != null) {
                View view = K.f57043a;
                if (view.getLayoutParams() != null && view.getLayoutParams().height != wkVar.f39960p0) {
                    view.getLayoutParams().height = wkVar.f39960p0;
                    view.requestLayout();
                }
            }
            kg.c0 c0Var = wkVar.P;
            c0Var.M = 0;
            c0Var.p1();
            q1Var.requestLayout();
            wkVar.i0();
        }
    }

    public static void T(wk wkVar, org.telegram.ui.an anVar, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        wk wkVar2;
        org.telegram.ui.an anVar2;
        org.telegram.ui.ActionBar.f6 f6Var2;
        TLRPC.User user;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j3 = wkVar.V;
        jg.r0 r0Var = wkVar.K;
        di diVar = wkVar.f39004b;
        int i10 = wkVar.f39959o0;
        if (i10 == 7) {
            if (i7 == 1 && (tL_messageMediaVenue2 = r0Var.U) != null) {
                wkVar.f39958n0.d(tL_messageMediaVenue2, i10, true, 0, 0L);
                diVar.a(true);
                return;
            } else if (i7 == 2 && (tL_messageMediaVenue = r0Var.V) != null) {
                wkVar.f39958n0.d(tL_messageMediaVenue, i10, true, 0, 0L);
                diVar.a(true);
                return;
            } else {
                wkVar2 = wkVar;
                anVar2 = anVar;
                f6Var2 = f6Var;
            }
        } else if (i7 == 1) {
            if (wkVar.f39958n0 != null && wkVar.f39953i0 != null) {
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = org.telegram.messenger.g0.b0(wkVar.f39953i0.getLatitude());
                tL_messageMediaGeo.geo._long = org.telegram.messenger.g0.b0(wkVar.f39953i0.getLongitude());
                v4.X(diVar.D3, diVar.X0() + 1, diVar.b1(), new di.s2(wkVar, anVar, tL_messageMediaGeo, f6Var, 6));
                return;
            } else if (wkVar.T) {
                v4.A(wkVar.getParentActivity()).show();
                return;
            } else {
                return;
            }
        } else {
            wkVar2 = wkVar;
            anVar2 = anVar;
            f6Var2 = f6Var;
            if (i7 == 2 && i10 == 1) {
                if (wkVar2.getLocationController().i(j3)) {
                    wkVar2.getLocationController().k(j3);
                    diVar.a(true);
                    return;
                } else if (wkVar2.f39952h0 == null && wkVar2.T) {
                    v4.A(wkVar2.getParentActivity()).show();
                    return;
                } else if (wkVar2.f39958n0 != null && wkVar2.getParentActivity() != null && wkVar2.f39952h0 != null) {
                    if (org.telegram.messenger.m5.E(j3)) {
                        user = diVar.W1.getMessagesController().a2(Long.valueOf(j3));
                    } else {
                        user = null;
                    }
                    v4.B(wkVar2.getParentActivity(), false, user, new org.telegram.messenger.sr() {
                        @Override
                        public final void a(int i11) {
                            wk wkVar3 = wk.this;
                            di diVar2 = wkVar3.f39004b;
                            v4.X(diVar2.D3, diVar2.X0() + 1, diVar2.b1(), new fi.t3(wkVar3, i11, 4));
                        }
                    }, wkVar2.f39003a).show();
                    return;
                } else {
                    return;
                }
            }
        }
        Object I = r0Var.I(i7);
        if (I instanceof TLRPC.TL_messageMediaVenue) {
            v4.X(diVar.D3, diVar.X0() + 1, diVar.b1(), new di.s2(wkVar2, anVar2, (TLRPC.TL_messageMediaVenue) I, f6Var2, 7));
        }
    }

    public static void U(wk wkVar) {
        jg.r0 r0Var = wkVar.K;
        di diVar = wkVar.f39004b;
        if (wkVar.f39946b0) {
            int i7 = Build.VERSION.SDK_INT;
            Activity parentActivity = wkVar.getParentActivity();
            if (parentActivity != null) {
                wkVar.f39946b0 = false;
                if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    String[] strArr = (!diVar.F1 || diVar.f32998t4 == null || i7 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
                    wkVar.S = true;
                    if (r0Var != null) {
                        r0Var.O(wkVar.T, true);
                    }
                    parentActivity.requestPermissions(strArr, 2);
                } else if (i7 >= 29 && diVar.F1 && diVar.f32998t4 != null && parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") != 0) {
                    wkVar.S = true;
                    if (r0Var != null) {
                        r0Var.O(wkVar.T, true);
                    }
                    parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
                }
            }
        }
    }

    public static void V(wk wkVar, org.telegram.ui.an anVar, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        di diVar = wkVar.f39004b;
        TLRPC.TL_messageMediaVenue H = wkVar.N.H(i7);
        if (H != null && wkVar.f39959o0 != 7) {
            diVar.R2.l(true);
            TLRPC.GeoPoint geoPoint = H.geo;
            wkVar.h0(geoPoint.lat, geoPoint._long);
        } else if (H != null && wkVar.f39958n0 != null) {
            if (anVar != null && anVar.c()) {
                v4.J(wkVar.getParentActivity(), anVar.a(), new ok(wkVar, H, 0), f6Var);
                return;
            }
            wkVar.f39958n0.d(H, wkVar.f39959o0, true, 0, 0L);
            diVar.a(true);
        }
    }

    public static void W(wk wkVar, Location location) {
        int i7;
        di diVar = wkVar.f39004b;
        if (diVar != null && diVar.W1 != null) {
            wkVar.g0(location);
            jg.r0 r0Var = wkVar.K;
            if (r0Var != null && (((i7 = wkVar.f39959o0) == 7 || i7 == 8) && !wkVar.f39956l0)) {
                r0Var.L(wkVar.f39953i0);
            }
            wkVar.getLocationController().n(location, wkVar.U);
            wkVar.U = false;
        }
    }

    public static void X(wk wkVar, org.telegram.ui.an anVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.f6 f6Var, Long l10) {
        if (anVar != null && anVar.c()) {
            v4.J(wkVar.getParentActivity(), anVar.a(), new a3.h(wkVar, tL_messageMediaGeo, l10, 27), f6Var);
            return;
        }
        wkVar.f39958n0.d(tL_messageMediaGeo, wkVar.f39959o0, true, 0, l10.longValue());
        wkVar.f39004b.a(true);
    }

    public static void Z(wk wkVar, org.telegram.messenger.fa faVar) {
        PackageManager packageManager;
        wkVar.D = faVar;
        jk jkVar = new jk(wkVar, 3);
        wf.b bVar = faVar.f22390a;
        org.telegram.messenger.j1 j1Var = new org.telegram.messenger.j1(jkVar, 5);
        l8.e eVar = (l8.e) bVar.f57654b;
        try {
            k8.c cVar = new k8.c(j1Var);
            Parcel p12 = eVar.p1();
            v7.b.c(p12, cVar);
            eVar.t1(p12, 42);
            if (org.telegram.ui.ActionBar.k6.I.q() || org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27852d6, wkVar.f39003a)) < 0.721f) {
                wkVar.Q = true;
                wkVar.D.i(((nb.a) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.f25566b, 2131624085));
            }
            if (wkVar.D != null) {
                Location location = new Location("network");
                wkVar.f39953i0 = location;
                location.setLatitude(20.659322d);
                wkVar.f39953i0.setLongitude(-11.40625d);
                try {
                    wkVar.D.k(true);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                wkVar.D.g().Z1();
                wkVar.D.g().d2();
                wkVar.D.g().X1();
                wkVar.D.l(new kk(wkVar));
                org.telegram.messenger.fa faVar2 = wkVar.D;
                jk jkVar2 = new jk(wkVar, 4);
                wf.b bVar2 = faVar2.f22390a;
                org.telegram.messenger.j1 j1Var2 = new org.telegram.messenger.j1(jkVar2, 7);
                l8.e eVar2 = (l8.e) bVar2.f57654b;
                try {
                    k8.c cVar2 = new k8.c(j1Var2, 0);
                    Parcel p13 = eVar2.p1();
                    v7.b.c(p13, cVar2);
                    eVar2.t1(p13, 99);
                    wkVar.D.n(new pk(wkVar, 1));
                    wkVar.D.m(new k2(15));
                    wkVar.f0();
                    org.telegram.messenger.g0.i3(new jk(wkVar, 5), 200L);
                    if (wkVar.R && wkVar.getParentActivity() != null) {
                        wkVar.R = false;
                        Activity parentActivity = wkVar.getParentActivity();
                        if (parentActivity == null || (packageManager = parentActivity.getPackageManager()) == null || packageManager.hasSystemFeature("android.hardware.location.gps")) {
                            try {
                                if (!((LocationManager) org.telegram.messenger.t0.f25566b.getSystemService("location")).isProviderEnabled("gps")) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wkVar.getParentActivity(), wkVar.f39003a);
                                    int i7 = org.telegram.ui.ActionBar.k6.L5;
                                    alertDialog$Builder.m(2131624119, 72, org.telegram.ui.ActionBar.k6.w0(i7, wkVar.f39003a), null);
                                    alertDialog$Builder.n(i7, wkVar.f39003a);
                                    alertDialog$Builder.f27296a.T = org.telegram.messenger.id.M0(2131749531, null);
                                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751806, null), new kk(wkVar));
                                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                    alertDialog$Builder.p();
                                }
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                            }
                        } else {
                            return;
                        }
                    }
                    wkVar.i0();
                } catch (RemoteException e12) {
                    throw new RuntimeException(e12);
                }
            }
        } catch (RemoteException e13) {
            throw new RuntimeException(e13);
        }
    }

    public static void a0(wk wkVar) {
        jg.r0 r0Var = wkVar.K;
        bi.q1 q1Var = wkVar.L;
        if (wkVar.E != null && wkVar.J != null && wkVar.getMeasuredHeight() != 0) {
            v4.d1 K = q1Var.K(0);
            if (K != null) {
                View view = K.f57043a;
                int bottom = view.getBottom();
                int b10 = r0Var.b();
                int i7 = 1;
                while (true) {
                    if (i7 < b10) {
                        if (r0Var.d(i7) != 11) {
                            v4.d1 K2 = q1Var.K(i7);
                            if (K2 == null) {
                                break;
                            }
                            bottom = Math.max(bottom, K2.f57043a.getBottom());
                        }
                        i7++;
                    } else {
                        wkVar.f39963r0 = bottom - view.getBottom();
                        break;
                    }
                }
            }
            int i10 = wkVar.f39963r0;
            if (i10 < 0) {
                int L = org.telegram.messenger.g0.L(66.0f);
                int i11 = wkVar.f39959o0;
                if (i11 != 1 && i11 != 7 && i11 != 8) {
                    i10 = L;
                } else {
                    i10 = org.telegram.messenger.g0.L(66.0f) + L;
                }
            }
            int measuredHeight = (q1Var.getMeasuredHeight() - wkVar.getDefaultBottomInset()) - i10;
            int measuredHeight2 = wkVar.getMeasuredHeight() + wkVar.getMapExtraTop();
            int max = Math.max(org.telegram.messenger.g0.L(120.0f), measuredHeight - q1Var.getPaddingTop());
            if (measuredHeight2 != wkVar.f39961q0 || max != wkVar.f39960p0) {
                wkVar.f39961q0 = measuredHeight2;
                wkVar.f39960p0 = max;
                org.telegram.messenger.g0.h3(new jk(wkVar, 0));
            }
        }
    }

    private int getBottomInset() {
        d0();
        return org.telegram.messenger.g0.W1(0.0f, getDefaultBottomInset(), getMinBottomInset());
    }

    private int getDefaultBottomInset() {
        if (d0()) {
            return org.telegram.messenger.g0.L(8.0f) + this.f39006e;
        }
        return getMinBottomInset();
    }

    private Location getLastLocation() {
        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.f25566b.getSystemService("location");
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

    private org.telegram.messenger.sd getLocationController() {
        return this.f39004b.W1.getLocationController();
    }

    private int getMapContentHeight() {
        return org.telegram.messenger.g0.L(10.0f) + this.f39961q0 + this.C0;
    }

    private int getMapExtraTop() {
        return org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.f22557m;
    }

    private org.telegram.messenger.cb getMapTarget() {
        Location location;
        if (this.f39956l0 && (location = this.f39953i0) != null) {
            return new org.telegram.messenger.cb(location.getLatitude(), this.f39953i0.getLongitude());
        }
        Location location2 = this.f39952h0;
        if (location2 != null) {
            return new org.telegram.messenger.cb(location2.getLatitude(), this.f39952h0.getLongitude());
        }
        return null;
    }

    private org.telegram.messenger.qp getMessagesController() {
        return this.f39004b.W1.getMessagesController();
    }

    private int getMinBottomInset() {
        if (d0()) {
            return getDefaultBottomInset();
        }
        return Math.min(this.f39006e, org.telegram.messenger.g0.f22558n);
    }

    private Activity getParentActivity() {
        org.telegram.ui.ActionBar.f2 f2Var;
        di diVar = this.f39004b;
        if (diVar != null && (f2Var = diVar.W1) != null) {
            return f2Var.getParentActivity();
        }
        return null;
    }

    private org.telegram.messenger.p10 getUserConfig() {
        return this.f39004b.W1.getUserConfig();
    }

    @Override
    public final void A() {
        org.telegram.messenger.za zaVar = this.E;
        if (zaVar != null && this.f39950f0) {
            try {
                ((a8.r7) zaVar).x();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        this.f39951g0 = false;
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.wk.B(int, int):void");
    }

    @Override
    public final void C() {
        org.telegram.messenger.za zaVar = this.E;
        if (zaVar != null && this.f39950f0) {
            try {
                ((a8.r7) zaVar).z();
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        this.f39951g0 = true;
    }

    @Override
    public final void E(float f10, float f11) {
        if (this.f39966t0 == f10 && this.f39967u0 == f11) {
            return;
        }
        this.f39966t0 = f10;
        this.f39967u0 = f11;
        e0();
    }

    @Override
    public final void H(vh vhVar) {
        long j3;
        di diVar = this.f39004b;
        diVar.R2.setTitle(org.telegram.messenger.id.M0(2131745459, null));
        if (((bi.x5) ((a8.r7) this.E).f614b).getParent() == null) {
            FrameLayout.LayoutParams e10 = c8.ha.e(-1, org.telegram.messenger.g0.L(10.0f) + this.f39960p0, 51);
            bi.e5 e5Var = this.J;
            e5Var.addView((bi.x5) ((a8.r7) this.E).f614b, 0, e10);
            e5Var.addView(this.I, 1, c8.ha.c(-1.0f, -1));
        }
        this.f39971x.setVisibility(0);
        org.telegram.messenger.za zaVar = this.E;
        if (zaVar != null && this.f39950f0) {
            try {
                ((a8.r7) zaVar).z();
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        this.f39951g0 = true;
        org.telegram.messenger.fa faVar = this.D;
        if (faVar != null) {
            try {
                faVar.k(true);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        c0();
        boolean f02 = diVar.T3.f0();
        jk jkVar = new jk(this, 1);
        if (f02) {
            j3 = 200;
        } else {
            j3 = 0;
        }
        org.telegram.messenger.g0.i3(jkVar, j3);
        this.P.h1(0, 0);
        i0();
    }

    @Override
    public final void J() {
        this.L.y0(0);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28033n5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27796a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27816b7));
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27853d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27944i6));
    }

    public final void b0() {
        org.telegram.ui.ActionBar.r0 r0Var = this.f39962r;
        if (r0Var != null) {
            r0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ij, this.f39003a));
            this.f39962r.H(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, this.f39003a));
            this.f39962r.O(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, this.f39003a), true);
            this.f39962r.O(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, this.f39003a), false);
        }
        if (this.D != null) {
            if (org.telegram.ui.ActionBar.k6.I.q() || org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27852d6, this.f39003a)) < 0.721f) {
                if (!this.Q) {
                    this.Q = true;
                    this.D.i(((nb.a) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.f25566b, 2131624085));
                }
            } else if (this.Q) {
                this.Q = false;
                this.D.i(null);
            }
        }
    }

    public final void c0() {
        if (getMeasuredHeight() != 0 && this.E != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            bi.q1 q1Var = this.L;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) q1Var.getLayoutParams();
            layoutParams.topMargin = currentActionBarHeight;
            q1Var.setLayoutParams(layoutParams);
            bi.e5 e5Var = this.J;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) e5Var.getLayoutParams();
            layoutParams2.topMargin = 0;
            layoutParams2.height = this.f39961q0;
            e5Var.setLayoutParams(layoutParams2);
            pj0 pj0Var = this.M;
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) pj0Var.getLayoutParams();
            layoutParams3.topMargin = currentActionBarHeight;
            pj0Var.setLayoutParams(layoutParams3);
            int i7 = this.f39960p0;
            jg.r0 r0Var = this.K;
            r0Var.P(i7);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((bi.x5) ((a8.r7) this.E).f614b).getLayoutParams();
            if (layoutParams4 != null) {
                layoutParams4.height = org.telegram.messenger.g0.L(10.0f) + this.f39961q0;
                ((bi.x5) ((a8.r7) this.E).f614b).setLayoutParams(layoutParams4);
            }
            r0Var.f();
            i0();
        }
    }

    public final boolean d0() {
        dh dhVar = this.f39004b.f32989r3;
        if (dhVar != null && dhVar.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.qs.f25094v4;
        jg.r0 r0Var = this.K;
        if (i7 == i11) {
            this.T = false;
            this.S = false;
            f0();
            if (r0Var != null) {
                r0Var.O(this.T, this.S);
            }
            org.telegram.messenger.fa faVar = this.D;
            if (faVar != null) {
                try {
                    faVar.k(true);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
        } else if (i7 == org.telegram.messenger.qs.f25101w4) {
            this.T = true;
            this.S = false;
            if (r0Var != null) {
                r0Var.O(true, false);
            }
        }
        c0();
        this.f39004b.getClass();
        this.f39971x.setVisibility(0);
    }

    @Override
    public final boolean e() {
        return !d0();
    }

    public final void e0() {
        bi.e5 e5Var;
        bi.q1 q1Var;
        int i7;
        int mapContentHeight;
        org.telegram.messenger.cb cbVar;
        if (this.E != null && (e5Var = this.J) != null && (q1Var = this.L) != null) {
            v4.d1 K = q1Var.K(0);
            if (K != null) {
                i7 = K.f57043a.getTop() + q1Var.getTop();
            } else {
                i7 = Integer.MAX_VALUE;
            }
            if (K != null && i7 < getMeasuredHeight()) {
                if (((bi.x5) ((a8.r7) this.E).f614b).getVisibility() == 4) {
                    ((bi.x5) ((a8.r7) this.E).f614b).setVisibility(0);
                    e5Var.setVisibility(0);
                }
                float f10 = i7;
                boolean z9 = true;
                if (this.f39967u0 < 1.0f) {
                    int[] iArr = this.f39968v0;
                    getLocationInWindow(iArr);
                    f10 = Math.min(i7, org.telegram.messenger.g0.W1(this.f39967u0, -iArr[1], i7));
                }
                int max = (int) Math.max(f10, -getMapExtraTop());
                int max2 = (Math.max(0, K.f57043a.getTop()) + q1Var.getTop()) - max;
                int min = (Math.min(this.f39965s0, q1Var.getMeasuredHeight()) + q1Var.getTop()) - max;
                this.f39970w0 = org.telegram.messenger.g0.L(32.0f) + max2;
                this.f39972x0 = min;
                this.f39974y0 = Math.max(0, this.f39961q0 - (getMeasuredHeight() - max));
                float f11 = max;
                e5Var.setTranslationY(f11);
                e5Var.invalidate();
                this.f39962r.setTranslationY(max2);
                this.f39957n.setTranslationY(-Math.max(0, this.f39961q0 - min));
                int top = q1Var.getTop();
                int i10 = min + max;
                float f12 = (top + i10) / 2.0f;
                float max3 = Math.max(f12, ((q1Var.getPaddingTop() + top) + i10) / 2.0f);
                int ceil = (int) Math.ceil(max3 - f12);
                if (ceil != this.C0) {
                    this.C0 = ceil;
                    org.telegram.messenger.g0.h3(new jk(this, 0));
                }
                float max4 = Math.max(f12, Math.min(max3, ((max + max2) + i10) / 2.0f));
                int ceil2 = ((int) Math.ceil(max3)) + getMapExtraTop();
                float f13 = max4 - ceil2;
                ((bi.x5) ((a8.r7) this.E).f614b).setTranslationY(f13 - f11);
                int L = ((int) (max4 - f11)) - org.telegram.messenger.g0.L(48.0f);
                if (L != this.f39954j0) {
                    this.f39954j0 = L;
                    this.O.setTranslationY(L);
                }
                if (((bi.x5) ((a8.r7) this.E).f614b).getMeasuredHeight() > 0) {
                    mapContentHeight = ((bi.x5) ((a8.r7) this.E).f614b).getMeasuredHeight();
                } else {
                    mapContentHeight = getMapContentHeight();
                }
                int max5 = Math.max(0, (int) (mapContentHeight - (i10 - f13)));
                int i11 = ((ceil2 * 2) - mapContentHeight) + max5;
                org.telegram.messenger.fa faVar = this.D;
                if (faVar != null) {
                    int i12 = this.D0;
                    if (i11 != i12 || max5 != this.E0) {
                        if (i12 >= 0) {
                            z9 = false;
                        }
                        if (z9) {
                            cbVar = getMapTarget();
                        } else if (ceil2 != this.B0) {
                            faVar.d();
                            cbVar = (org.telegram.messenger.cb) this.D.d().f13160b;
                        } else {
                            cbVar = null;
                        }
                        this.B0 = ceil2;
                        this.D0 = i11;
                        this.E0 = max5;
                        this.D.o(0, org.telegram.messenger.g0.L(6.0f) + i11, 0, org.telegram.messenger.g0.L(6.0f) + max5);
                        if (cbVar != null) {
                            this.D.h(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(cbVar));
                        }
                    }
                }
            } else if (((bi.x5) ((a8.r7) this.E).f614b).getVisibility() == 0) {
                ((bi.x5) ((a8.r7) this.E).f614b).setVisibility(4);
                e5Var.setVisibility(4);
            }
        }
    }

    @Override
    public final boolean f() {
        return true;
    }

    public final void f0() {
        wk wkVar;
        di diVar = this.f39004b;
        if (diVar.F1) {
            if (diVar.f33002u4 != null) {
                org.telegram.messenger.g0.h3(new jk(this, 2));
                return;
            } else if (!this.T) {
                File file = diVar.f32998t4;
                boolean z9 = diVar.f32994s4;
                if (file != null) {
                    if (z9) {
                        try {
                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                            String extractMetadata = mediaMetadataRetriever.extractMetadata(23);
                            if (extractMetadata != null) {
                                Matcher matcher = Pattern.compile("([+\\-][0-9.]+)([+\\-][0-9.]+)").matcher(extractMetadata);
                                if (matcher.find() && matcher.groupCount() == 2) {
                                    org.telegram.messenger.g0.h3(new org.telegram.ui.Cells.q7(this, Double.parseDouble(matcher.group(1)), Double.parseDouble(matcher.group(2)), 2));
                                    return;
                                }
                            }
                        } catch (NumberFormatException | Exception unused) {
                        }
                    } else {
                        wkVar = this;
                        ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                        float[] fArr = new float[2];
                        if (exifInterface.getLatLong(fArr)) {
                            org.telegram.messenger.g0.h3(new f(23, this, fArr));
                            return;
                        }
                        Location lastLocation = getLastLocation();
                        wkVar.f39952h0 = lastLocation;
                        g0(lastLocation);
                        return;
                    }
                }
                wkVar = this;
                Location lastLocation2 = getLastLocation();
                wkVar.f39952h0 = lastLocation2;
                g0(lastLocation2);
                return;
            } else {
                org.telegram.messenger.g0.h3(new jk(this, 7));
                return;
            }
        }
        Location lastLocation3 = getLastLocation();
        this.f39952h0 = lastLocation3;
        g0(lastLocation3);
    }

    public final void g0(Location location) {
        if (location != null) {
            Location location2 = new Location(location);
            this.f39952h0 = location2;
            org.telegram.messenger.fa faVar = this.D;
            jg.r0 r0Var = this.K;
            if (faVar != null) {
                org.telegram.messenger.cb cbVar = new org.telegram.messenger.cb(location.getLatitude(), location.getLongitude());
                if (r0Var != null) {
                    r0Var.M(this.f39952h0);
                }
                if (!this.f39956l0) {
                    this.f39953i0 = new Location(location);
                    if (this.m0) {
                        this.D.b(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(cbVar));
                        return;
                    }
                    this.m0 = true;
                    this.D.h(((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(cbVar, this.D.e() - 4.0f));
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
        bi.q1 q1Var = this.L;
        if (q1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i7 = 0;
        xi0 xi0Var = (xi0) q1Var.K(0);
        if (xi0Var != null) {
            i7 = Math.max((int) xi0Var.f57043a.getY(), 0);
        }
        return org.telegram.messenger.g0.L(56.0f) + i7;
    }

    @Override
    public int getFirstOffset() {
        return org.telegram.messenger.g0.L(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.L.getPaddingTop();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList = new ArrayList<>();
        s6 s6Var = new s6(this, 1);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.J, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27925h5));
        int i7 = org.telegram.ui.ActionBar.k6.A5;
        bi.q1 q1Var = this.L;
        arrayList.add(new org.telegram.ui.ActionBar.t6(q1Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i7));
        org.telegram.ui.ActionBar.r0 r0Var = this.f39971x;
        if (r0Var != null) {
            editTextBoldCursor = r0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(editTextBoldCursor, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27960j5));
        int i10 = org.telegram.ui.ActionBar.k6.kj;
        ImageView imageView = this.f39957n;
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        int i11 = org.telegram.ui.ActionBar.k6.lj;
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.ij;
        org.telegram.ui.ActionBar.r0 r0Var2 = this.f39962r;
        arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, s6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.t6(r0Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.gj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.mj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(q1Var, 393216, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.bj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(q1Var, 393216, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ej));
        arrayList.add(new org.telegram.ui.ActionBar.t6(q1Var, 393248, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.aj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(q1Var, 393248, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.t6(q1Var, 196608, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ei));
        return arrayList;
    }

    public final void h0(double d, double d2) {
        org.telegram.messenger.ua newCameraUpdateLatLngZoom;
        if (this.D != null) {
            int i7 = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
            if (i7 != 0 && d2 != 0.0d) {
                Location location = new Location("");
                this.f39953i0 = location;
                location.reset();
                this.f39953i0.setLatitude(d);
                this.f39953i0.setLongitude(d2);
            } else {
                Location location2 = new Location("");
                this.f39952h0 = location2;
                location2.reset();
                this.f39952h0.setLatitude(d);
                this.f39952h0.setLongitude(d2);
            }
            org.telegram.messenger.cb cbVar = new org.telegram.messenger.cb(d, d2);
            if (i7 != 0 && d2 != 0.0d) {
                newCameraUpdateLatLngZoom = ((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(cbVar, this.D.e() - 4.0f);
            } else {
                newCameraUpdateLatLngZoom = ((nb.a) org.telegram.messenger.t0.k()).newCameraUpdateLatLngZoom(cbVar, this.D.f());
            }
            this.F = newCameraUpdateLatLngZoom;
            this.D.h(newCameraUpdateLatLngZoom);
            jg.r0 r0Var = this.K;
            if (i7 != 0 && d2 != 0.0d) {
                r0Var.L(this.f39953i0);
            } else {
                r0Var.M(this.f39952h0);
            }
            r0Var.H();
            this.L.w0(0, 1, null);
            this.f39955k0 = true;
            if (i7 != 0 && d2 != 0.0d) {
                this.f39956l0 = true;
            }
        }
    }

    public final void i0() {
        bi.e5 e5Var;
        if (this.E != null && (e5Var = this.J) != null) {
            bi.q1 q1Var = this.L;
            v4.d1 K = q1Var.K(0);
            if (K != null) {
                K.f57043a.getTop();
            } else {
                e5Var.getMeasuredHeight();
            }
            int i7 = this.f39963r0;
            if (i7 < 0) {
                int L = org.telegram.messenger.g0.L(66.0f);
                int i10 = this.f39959o0;
                if (i10 != 1 && i10 != 7 && i10 != 8) {
                    i7 = L;
                } else {
                    i7 = org.telegram.messenger.g0.L(66.0f) + L;
                }
            }
            int measuredHeight = (q1Var.getMeasuredHeight() - getBottomInset()) - i7;
            this.f39965s0 = measuredHeight;
            if (K != null) {
                int bottom = measuredHeight - K.f57043a.getBottom();
                int childCount = q1Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = q1Var.getChildAt(i11);
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
        boolean z9 = this.f39947c0;
        LinearLayout linearLayout = this.f39964s;
        if (z9) {
            boolean z10 = this.f39949e0;
            pj0 pj0Var = this.M;
            if (z10) {
                pj0Var.setEmptyView(null);
                linearLayout.setVisibility(8);
                return;
            }
            pj0Var.setEmptyView(linearLayout);
            return;
        }
        linearLayout.setVisibility(8);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getViewTreeObserver().addOnPreDrawListener(this.A0);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnPreDrawListener(this.A0);
    }

    @Override
    public final void onLayout(boolean z9, int i7, int i10, int i11, int i12) {
        super.onLayout(z9, i7, i10, i11, i12);
        if (z9) {
            c0();
        }
    }

    @Override
    public final void p() {
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25094v4);
        org.telegram.messenger.qs.e().n(this, org.telegram.messenger.qs.f25101w4);
        this.f39973y = true;
        bi.e5 e5Var = this.J;
        if (e5Var != null) {
            e5Var.invalidate();
        }
        try {
            org.telegram.messenger.fa faVar = this.D;
            if (faVar != null) {
                faVar.k(false);
            }
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.messenger.za zaVar = this.E;
        if (zaVar != null) {
            ((bi.x5) ((a8.r7) zaVar).f614b).setTranslationY((-org.telegram.messenger.g0.f22563q.y) * 3);
        }
        try {
            org.telegram.messenger.za zaVar2 = this.E;
            if (zaVar2 != null) {
                ((a8.r7) zaVar2).x();
            }
        } catch (Exception unused) {
        }
        try {
            org.telegram.messenger.za zaVar3 = this.E;
            if (zaVar3 != null) {
                ((a8.r7) zaVar3).w();
                this.E = null;
            }
        } catch (Exception unused2) {
        }
        jg.r0 r0Var = this.K;
        if (r0Var != null) {
            r0Var.F();
        }
        uk ukVar = this.N;
        if (ukVar != null) {
            ukVar.F();
        }
        di diVar = this.f39004b;
        diVar.R2.l(true);
        diVar.R2.q().removeView(this.f39971x);
    }

    @Override
    public final boolean q() {
        p();
        return false;
    }

    public void setDelegate(vk vkVar) {
        this.f39958n0 = vkVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f39004b.f28619b.invalidate();
        i0();
    }

    @Override
    public final void u() {
        this.f39971x.setVisibility(8);
    }

    @Override
    public final void updateColors() {
        try {
            b0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.ActionBar.r0 r0Var = this.f39971x;
        if (r0Var != null) {
            try {
                if (r0Var.getSearchField() != null) {
                    r0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27960j5, this.f39003a));
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
    }

    @Override
    public final void y() {
        boolean z9;
        di diVar = this.f39004b;
        if (diVar != null && !diVar.d) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.K.T = z9;
    }

    @Override
    public final void z(int i7, boolean z9) {
        if (z9) {
            this.K.T = false;
        }
    }
}
