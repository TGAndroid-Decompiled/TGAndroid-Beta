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
public final class dl extends ci implements org.telegram.ui.ActionBar.z5, org.telegram.messenger.is {
    public static final int G0 = 0;
    public float A0;
    public final yk B0;
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
    public final bi.g2 K;
    public final jg.r0 L;
    public final di.c1 M;
    public final uj0 N;
    public final bl O;
    public final ImageView P;
    public final kg.c0 Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final long W;
    public final Paint f33961a0;
    public AnimatorSet f33962b0;
    public boolean f33963c0;
    public boolean f33964d0;
    public boolean f33965e0;
    public boolean f33966f0;
    public boolean f33967g0;
    public boolean f33968h0;
    public Location f33969i0;
    public Location f33970j0;
    public int f33971k0;
    public boolean f33972l0;
    public boolean m0;
    public final ImageView f33973n;
    public boolean f33974n0;
    public cl f33975o0;
    public final int f33976p0;
    public int f33977q0;
    public final org.telegram.ui.ActionBar.q0 f33978r;
    public int f33979r0;
    public final LinearLayout f33980s;
    public int f33981s0;
    public int f33982t0;
    public float f33983u0;
    public float f33984v0;
    public final TextView f33985w;
    public final int[] f33986w0;
    public final org.telegram.ui.ActionBar.q0 f33987x;
    public int f33988x0;
    public boolean f33989y;
    public int f33990y0;
    public int f33991z0;

    public dl(ki kiVar, Context context, final org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, kiVar);
        final org.telegram.ui.an anVar;
        boolean z11;
        boolean z12;
        this.S = true;
        this.T = false;
        this.U = false;
        this.V = true;
        this.f33961a0 = new Paint();
        this.f33963c0 = true;
        int currentActionBarHeight = (org.telegram.messenger.g0.f23611q.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - org.telegram.messenger.g0.L(66.0f);
        this.f33977q0 = currentActionBarHeight;
        this.f33979r0 = currentActionBarHeight;
        this.f33981s0 = -1;
        this.f33982t0 = Integer.MAX_VALUE;
        this.f33983u0 = Float.NaN;
        this.f33984v0 = 1.0f;
        this.f33986w0 = new int[2];
        this.f33990y0 = Integer.MAX_VALUE;
        this.A0 = -1.0f;
        this.B0 = new yk(0, this);
        this.E0 = -1;
        this.F0 = -1;
        org.telegram.messenger.g0.a0();
        ki kiVar2 = this.f33609b;
        org.telegram.ui.ActionBar.e2 e2Var = kiVar2.f36424a2;
        if (e2Var instanceof org.telegram.ui.an) {
            anVar = (org.telegram.ui.an) e2Var;
        } else {
            anVar = null;
        }
        long b12 = kiVar2.b1();
        this.W = b12;
        if (this.f33609b.J1) {
            this.f33976p0 = 7;
        } else if (z10 && anVar != null && anVar.h == null && !anVar.c() && !org.telegram.messenger.q10.B(anVar.j())) {
            this.f33976p0 = 1;
        } else {
            this.f33976p0 = 0;
        }
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25591v4);
        org.telegram.messenger.ns.e().c(this, org.telegram.messenger.ns.f25598w4);
        this.f33965e0 = false;
        this.f33964d0 = false;
        this.f33966f0 = false;
        jg.r0 r0Var = this.L;
        if (r0Var != null) {
            r0Var.F();
        }
        bl blVar = this.O;
        if (blVar != null) {
            blVar.F();
        }
        if (getParentActivity() != null && getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.U = z11;
        org.telegram.ui.ActionBar.q0 a10 = this.f33609b.V2.s().a(0, 2131232487);
        a10.O();
        a10.I = new kg.x1(this, 7);
        this.f33987x = a10;
        this.f33609b.getClass();
        a10.setVisibility(0);
        a10.setSearchFieldHint(org.telegram.messenger.hd.M0(2131745836, null));
        a10.setContentDescription(org.telegram.messenger.hd.M0(2131745836, null));
        EditTextBoldCursor searchField = a10.getSearchField();
        int i7 = org.telegram.ui.ActionBar.j6.f28957j5;
        org.telegram.ui.ActionBar.q6.U(searchField, i7, e6Var);
        org.telegram.ui.ActionBar.q6.v(searchField, i7, e6Var);
        org.telegram.ui.ActionBar.q6.D(searchField, org.telegram.ui.ActionBar.j6.Me, e6Var);
        new FrameLayout.LayoutParams(-1, org.telegram.messenger.g0.L(21.0f)).gravity = 83;
        bi.g2 g2Var = new bi.g2(15, context, this);
        this.K = g2Var;
        g2Var.setWillNotDraw(false);
        View view = new View(context);
        this.J = view;
        view.setBackgroundDrawable(new jc(org.telegram.ui.ActionBar.j6.D0().q()));
        org.telegram.ui.ActionBar.q0 q0Var = new org.telegram.ui.ActionBar.q0(context, null, 0, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.lj, this.f33608a), false, e6Var);
        this.f33978r = q0Var;
        q0Var.setClickable(true);
        q0Var.setSubMenuOpenSide(2);
        q0Var.setAdditionalXOffset(org.telegram.messenger.g0.L(10.0f));
        q0Var.setAdditionalYOffset(-org.telegram.messenger.g0.L(10.0f));
        q0Var.d(2, 2131232214, null, org.telegram.messenger.hd.M0(2131748690, null), true, false, e6Var);
        q0Var.d(3, 2131232350, null, org.telegram.messenger.hd.M0(2131745948, null), true, false, e6Var);
        q0Var.d(4, 2131232185, null, org.telegram.messenger.hd.M0(2131749275, null), true, false, e6Var);
        q0Var.setContentDescription(org.telegram.messenger.hd.M0(2131754839, null));
        int L = org.telegram.messenger.g0.L(40.0f);
        int i10 = org.telegram.ui.ActionBar.j6.nj;
        int w02 = org.telegram.ui.ActionBar.j6.w0(i10, this.f33608a);
        int i11 = org.telegram.ui.ActionBar.j6.oj;
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.j6.j0(L, w02, org.telegram.ui.ActionBar.j6.w0(i11, this.f33608a));
        c8.na.a(q0Var);
        q0Var.setTranslationZ(org.telegram.messenger.g0.L(2.0f));
        bg.p0 p0Var = bg.t0.f3335a;
        q0Var.setOutlineProvider(p0Var);
        org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i10);
        org.telegram.ui.ActionBar.m6 M2 = org.telegram.ui.ActionBar.q6.M(i11);
        q0Var.setBackground(j02);
        org.telegram.ui.ActionBar.q6.j(q0Var, j02, M, M2, e6Var);
        q0Var.setIcon(2131232215);
        g2Var.addView(q0Var, c8.ja.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        q0Var.setOnClickListener(new e0(this, 7));
        q0Var.setDelegate(new sk(this));
        ImageView imageView = new ImageView(context);
        this.f33973n = imageView;
        org.telegram.ui.Cells.y j03 = org.telegram.ui.ActionBar.j6.j0(org.telegram.messenger.g0.L(40.0f), org.telegram.ui.ActionBar.j6.w0(i10, this.f33608a), org.telegram.ui.ActionBar.j6.w0(i11, this.f33608a));
        c8.na.a(imageView);
        imageView.setTranslationZ(org.telegram.messenger.g0.L(2.0f));
        imageView.setOutlineProvider(p0Var);
        org.telegram.ui.ActionBar.m6 M3 = org.telegram.ui.ActionBar.q6.M(i10);
        org.telegram.ui.ActionBar.m6 M4 = org.telegram.ui.ActionBar.q6.M(i11);
        imageView.setBackground(j03);
        org.telegram.ui.ActionBar.q6.j(imageView, j03, M3, M4, e6Var);
        imageView.setImageResource(2131232106);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int i12 = org.telegram.ui.ActionBar.j6.mj;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.q6.s(imageView, i12, e6Var, mode);
        imageView.setTag(Integer.valueOf(i12));
        imageView.setContentDescription(org.telegram.messenger.hd.M0(2131754831, null));
        g2Var.addView(imageView, c8.ja.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        imageView.setOnClickListener(new n2(7, this, e6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f33980s = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, org.telegram.messenger.g0.L(160.0f), 0, 0);
        linearLayout.setVisibility(8);
        addView(linearLayout, c8.ja.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new gi.a(16));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(2131231640);
        org.telegram.ui.ActionBar.q6.s(imageView2, org.telegram.ui.ActionBar.j6.W5, e6Var, mode);
        linearLayout.addView(imageView2, c8.ja.o(-2, -2));
        TextView textView = new TextView(context);
        int i13 = org.telegram.ui.ActionBar.j6.X5;
        org.telegram.ui.ActionBar.q6.U(textView, i13, e6Var);
        textView.setGravity(17);
        textView.setTypeface(org.telegram.messenger.g0.o());
        i5.c.w(textView, 1, 17.0f, null, 2131748179);
        TextView f10 = org.telegram.messenger.i20.f(linearLayout, textView, c8.ja.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.f33985w = f10;
        org.telegram.ui.ActionBar.q6.U(f10, i13, e6Var);
        f10.setGravity(17);
        f10.setTextSize(1, 15.0f);
        f10.setPadding(org.telegram.messenger.g0.L(40.0f), 0, org.telegram.messenger.g0.L(40.0f), 0);
        linearLayout.addView(f10, c8.ja.t(-2, -2, 17, 0, 6, 0, 0));
        di.c1 c1Var = new di.c1(this, context, e6Var, 16);
        this.M = c1Var;
        setBlur3Capture(c1Var);
        this.d = c1Var;
        this.f33612f = true;
        c1Var.setClipToPadding(false);
        jg.r0 r0Var2 = new jg.r0(context, this.f33976p0, b12, true, e6Var, this.f33609b.J1, false, false);
        this.L = r0Var2;
        c1Var.setAdapter(r0Var2);
        ki kiVar3 = this.f33609b;
        if (kiVar3 != null && (kiVar3.C1 || kiVar3.K1)) {
            z12 = true;
        } else {
            z12 = false;
        }
        r0Var2.X = z12;
        c1Var.setItemAnimator(null);
        r0Var2.O(this.U, this.T);
        c1Var.setVerticalScrollBarEnabled(false);
        c1Var.r1();
        kg.c0 c0Var = new kg.c0(this, c1Var);
        this.Q = c0Var;
        c1Var.setLayoutManager(c0Var);
        addView(c1Var, c8.ja.e(-1, -1, 51));
        c1Var.setOnScrollListener(new al(this, 0));
        c1Var.setOnItemClickListener(new gj0(this) {
            public final dl f39706b;

            {
                this.f39706b = this;
            }

            @Override
            public final void b(int i14, View view2) {
                switch (r4) {
                    case 0:
                        dl.U(this.f39706b, anVar, e6Var, i14);
                        return;
                    default:
                        dl.W(this.f39706b, anVar, e6Var, i14);
                        return;
                }
            }
        });
        r0Var2.P(this.f33977q0);
        addView(g2Var, indexOfChild(c1Var), c8.ja.e(-1, -1, 51));
        org.telegram.messenger.ya onCreateMapView = ((pb.b) org.telegram.messenger.t0.k()).onCreateMapView(context);
        this.F = onCreateMapView;
        a8.r7 r7Var = (a8.r7) onCreateMapView;
        r7Var.f618c = new sk(this);
        r7Var.d = new f1(10, this, e6Var);
        new Thread(new uk(this, onCreateMapView, 0)).start();
        ImageView imageView3 = new ImageView(context);
        this.P = imageView3;
        imageView3.setImageResource(2131231647);
        g2Var.addView(imageView3, c8.ja.e(28, 48, 49));
        uj0 uj0Var = new uj0(context, e6Var);
        this.N = uj0Var;
        uj0Var.setSections(true);
        uj0Var.setClipToPadding(false);
        uj0Var.setVisibility(8);
        uj0Var.setLayoutManager(new v4.b0(1, false));
        bl blVar2 = new bl(this, context, e6Var, this.f33609b.J1);
        this.O = blVar2;
        blVar2.f17024n = new sk(this);
        uj0Var.setItemAnimator(null);
        addView(uj0Var, c8.ja.e(-1, -1, 51));
        uj0Var.setOnScrollListener(new al(this, 1));
        uj0Var.setOnItemClickListener(new gj0(this) {
            public final dl f39706b;

            {
                this.f39706b = this;
            }

            @Override
            public final void b(int i14, View view2) {
                switch (r4) {
                    case 0:
                        dl.U(this.f39706b, anVar, e6Var, i14);
                        return;
                    default:
                        dl.W(this.f39706b, anVar, e6Var, i14);
                        return;
                }
            }
        });
        j0();
    }

    public static void P(dl dlVar, org.telegram.ui.ActionBar.e6 e6Var) {
        ImageView imageView = dlVar.f33973n;
        Activity parentActivity = dlVar.getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            t4.A(dlVar.getParentActivity()).show();
        } else if (dlVar.f33969i0 != null && dlVar.E != null) {
            int i7 = org.telegram.ui.ActionBar.j6.mj;
            org.telegram.ui.ActionBar.q6.s(imageView, i7, e6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setTag(Integer.valueOf(i7));
            dlVar.L.L(null);
            dlVar.m0 = false;
            dlVar.E.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(new org.telegram.messenger.bb(dlVar.f33969i0.getLatitude(), dlVar.f33969i0.getLongitude())));
        }
    }

    public static void Q(dl dlVar, org.telegram.ui.an anVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.e6 e6Var) {
        if (anVar != null && anVar.c()) {
            t4.J(dlVar.getParentActivity(), anVar.a(), new vk(dlVar, tL_messageMediaVenue, 1), e6Var);
            return;
        }
        dlVar.f33975o0.d(tL_messageMediaVenue, dlVar.f33976p0, true, 0, 0L);
        dlVar.f33609b.a(true);
    }

    public static void R(dl dlVar) {
        if (dlVar.getParentActivity() != null) {
            try {
                dlVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            } catch (Exception unused) {
            }
        }
    }

    public static void S(dl dlVar, org.telegram.messenger.ya yaVar) {
        if (dlVar.F != null && dlVar.getParentActivity() != null) {
            try {
                ((a8.r7) yaVar).w();
                ((pb.b) org.telegram.messenger.t0.k()).initializeMaps(org.telegram.messenger.t0.f26609b);
                ((a8.r7) dlVar.F).p(new wk(dlVar, 0));
                dlVar.f33967g0 = true;
                if (dlVar.f33968h0) {
                    ((a8.r7) dlVar.F).z();
                }
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
    }

    public static void T(dl dlVar) {
        di.c1 c1Var = dlVar.M;
        bi.g2 g2Var = dlVar.K;
        if (dlVar.F != null && g2Var != null) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) g2Var.getLayoutParams();
            if (layoutParams != null) {
                int i7 = layoutParams.height;
                int i10 = dlVar.f33979r0;
                if (i7 != i10) {
                    layoutParams.height = i10;
                    g2Var.setLayoutParams(layoutParams);
                }
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) ((ai.k0) ((a8.r7) dlVar.F).f617b).getLayoutParams();
            if (layoutParams2 != null && layoutParams2.height != dlVar.getMapContentHeight()) {
                layoutParams2.height = dlVar.getMapContentHeight();
                ((ai.k0) ((a8.r7) dlVar.F).f617b).setLayoutParams(layoutParams2);
            }
            dlVar.L.P(dlVar.f33977q0);
            v4.e1 K = c1Var.K(0);
            if (K != null) {
                View view = K.f58535a;
                if (view.getLayoutParams() != null && view.getLayoutParams().height != dlVar.f33977q0) {
                    view.getLayoutParams().height = dlVar.f33977q0;
                    view.requestLayout();
                }
            }
            kg.c0 c0Var = dlVar.Q;
            c0Var.M = 0;
            c0Var.p1();
            c1Var.requestLayout();
            dlVar.i0();
        }
    }

    public static void U(dl dlVar, org.telegram.ui.an anVar, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        dl dlVar2;
        org.telegram.ui.an anVar2;
        org.telegram.ui.ActionBar.e6 e6Var2;
        TLRPC.User user;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j3 = dlVar.W;
        jg.r0 r0Var = dlVar.L;
        ki kiVar = dlVar.f33609b;
        int i10 = dlVar.f33976p0;
        if (i10 == 7) {
            if (i7 == 1 && (tL_messageMediaVenue2 = r0Var.V) != null) {
                dlVar.f33975o0.d(tL_messageMediaVenue2, i10, true, 0, 0L);
                kiVar.a(true);
                return;
            } else if (i7 == 2 && (tL_messageMediaVenue = r0Var.W) != null) {
                dlVar.f33975o0.d(tL_messageMediaVenue, i10, true, 0, 0L);
                kiVar.a(true);
                return;
            } else {
                dlVar2 = dlVar;
                anVar2 = anVar;
                e6Var2 = e6Var;
            }
        } else if (i7 == 1) {
            if (dlVar.f33975o0 != null && dlVar.f33970j0 != null) {
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = org.telegram.messenger.g0.b0(dlVar.f33970j0.getLatitude());
                tL_messageMediaGeo.geo._long = org.telegram.messenger.g0.b0(dlVar.f33970j0.getLongitude());
                t4.X(kiVar.H3, kiVar.X0() + 1, kiVar.b1(), new bi.o1(dlVar, anVar, tL_messageMediaGeo, e6Var, 7));
                return;
            } else if (dlVar.U) {
                t4.A(dlVar.getParentActivity()).show();
                return;
            } else {
                return;
            }
        } else {
            dlVar2 = dlVar;
            anVar2 = anVar;
            e6Var2 = e6Var;
            if (i7 == 2 && i10 == 1) {
                if (dlVar2.getLocationController().i(j3)) {
                    dlVar2.getLocationController().k(j3);
                    kiVar.a(true);
                    return;
                } else if (dlVar2.f33969i0 == null && dlVar2.U) {
                    t4.A(dlVar2.getParentActivity()).show();
                    return;
                } else if (dlVar2.f33975o0 != null && dlVar2.getParentActivity() != null && dlVar2.f33969i0 != null) {
                    if (org.telegram.messenger.m5.E(j3)) {
                        user = kiVar.f36424a2.getMessagesController().a2(Long.valueOf(j3));
                    } else {
                        user = null;
                    }
                    t4.B(dlVar2.getParentActivity(), false, user, new org.telegram.messenger.pr() {
                        @Override
                        public final void a(int i11) {
                            dl dlVar3 = dl.this;
                            ki kiVar2 = dlVar3.f33609b;
                            t4.X(kiVar2.H3, kiVar2.X0() + 1, kiVar2.b1(), new ai.y1(dlVar3, i11, 5));
                        }
                    }, dlVar2.f33608a).show();
                    return;
                } else {
                    return;
                }
            }
        }
        Object I = r0Var.I(i7);
        if (I instanceof TLRPC.TL_messageMediaVenue) {
            t4.X(kiVar.H3, kiVar.X0() + 1, kiVar.b1(), new bi.o1(dlVar2, anVar2, (TLRPC.TL_messageMediaVenue) I, e6Var2, 8));
        }
    }

    public static void V(dl dlVar) {
        jg.r0 r0Var = dlVar.L;
        ki kiVar = dlVar.f33609b;
        if (dlVar.f33963c0) {
            int i7 = Build.VERSION.SDK_INT;
            Activity parentActivity = dlVar.getParentActivity();
            if (parentActivity != null) {
                dlVar.f33963c0 = false;
                if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    String[] strArr = (!kiVar.J1 || kiVar.f36503x4 == null || i7 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
                    dlVar.T = true;
                    if (r0Var != null) {
                        r0Var.O(dlVar.U, true);
                    }
                    parentActivity.requestPermissions(strArr, 2);
                } else if (i7 >= 29 && kiVar.J1 && kiVar.f36503x4 != null && parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") != 0) {
                    dlVar.T = true;
                    if (r0Var != null) {
                        r0Var.O(dlVar.U, true);
                    }
                    parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
                }
            }
        }
    }

    public static void W(dl dlVar, org.telegram.ui.an anVar, org.telegram.ui.ActionBar.e6 e6Var, int i7) {
        ki kiVar = dlVar.f33609b;
        TLRPC.TL_messageMediaVenue H = dlVar.O.H(i7);
        if (H != null && dlVar.f33976p0 != 7) {
            kiVar.V2.n(true);
            TLRPC.GeoPoint geoPoint = H.geo;
            dlVar.h0(geoPoint.lat, geoPoint._long);
        } else if (H != null && dlVar.f33975o0 != null) {
            if (anVar != null && anVar.c()) {
                t4.J(dlVar.getParentActivity(), anVar.a(), new vk(dlVar, H, 0), e6Var);
                return;
            }
            dlVar.f33975o0.d(H, dlVar.f33976p0, true, 0, 0L);
            kiVar.a(true);
        }
    }

    public static void X(dl dlVar, Location location) {
        int i7;
        ki kiVar = dlVar.f33609b;
        if (kiVar != null && kiVar.f36424a2 != null) {
            dlVar.g0(location);
            jg.r0 r0Var = dlVar.L;
            if (r0Var != null && (((i7 = dlVar.f33976p0) == 7 || i7 == 8) && !dlVar.m0)) {
                r0Var.L(dlVar.f33970j0);
            }
            dlVar.getLocationController().n(location, dlVar.V);
            dlVar.V = false;
        }
    }

    public static void Y(dl dlVar, org.telegram.ui.an anVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.e6 e6Var, Long l10) {
        if (anVar != null && anVar.c()) {
            t4.J(dlVar.getParentActivity(), anVar.a(), new a3.h(dlVar, tL_messageMediaGeo, l10, 28), e6Var);
            return;
        }
        dlVar.f33975o0.d(tL_messageMediaGeo, dlVar.f33976p0, true, 0, l10.longValue());
        dlVar.f33609b.a(true);
    }

    public static void Z(dl dlVar, org.telegram.messenger.ea eaVar) {
        PackageManager packageManager;
        dlVar.E = eaVar;
        rk rkVar = new rk(dlVar, 3);
        k8.a aVar = eaVar.f23288a;
        org.telegram.messenger.j1 j1Var = new org.telegram.messenger.j1(rkVar, 5);
        l8.e eVar = (l8.e) aVar.f17788b;
        try {
            k8.c cVar = new k8.c(j1Var);
            Parcel p12 = eVar.p1();
            v7.b.c(p12, cVar);
            eVar.t1(p12, 42);
            if (org.telegram.ui.ActionBar.j6.I.q() || org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, dlVar.f33608a)) < 0.721f) {
                dlVar.R = true;
                dlVar.E.i(((pb.b) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.f26609b, 2131624086));
            }
            if (dlVar.E != null) {
                Location location = new Location("network");
                dlVar.f33970j0 = location;
                location.setLatitude(20.659322d);
                dlVar.f33970j0.setLongitude(-11.40625d);
                try {
                    dlVar.E.k(true);
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                dlVar.E.g().C0();
                dlVar.E.g().D0();
                dlVar.E.g().B0();
                dlVar.E.l(new sk(dlVar));
                org.telegram.messenger.ea eaVar2 = dlVar.E;
                rk rkVar2 = new rk(dlVar, 4);
                k8.a aVar2 = eaVar2.f23288a;
                org.telegram.messenger.j1 j1Var2 = new org.telegram.messenger.j1(rkVar2, 7);
                l8.e eVar2 = (l8.e) aVar2.f17788b;
                try {
                    k8.c cVar2 = new k8.c(j1Var2, 0);
                    Parcel p13 = eVar2.p1();
                    v7.b.c(p13, cVar2);
                    eVar2.t1(p13, 99);
                    dlVar.E.n(new wk(dlVar, 1));
                    dlVar.E.m(new e2(19));
                    dlVar.f0();
                    org.telegram.messenger.g0.i3(new rk(dlVar, 5), 200L);
                    if (dlVar.S && dlVar.getParentActivity() != null) {
                        dlVar.S = false;
                        Activity parentActivity = dlVar.getParentActivity();
                        if (parentActivity == null || (packageManager = parentActivity.getPackageManager()) == null || packageManager.hasSystemFeature("android.hardware.location.gps")) {
                            try {
                                if (!((LocationManager) org.telegram.messenger.t0.f26609b.getSystemService("location")).isProviderEnabled("gps")) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, dlVar.getParentActivity(), dlVar.f33608a);
                                    int i7 = org.telegram.ui.ActionBar.j6.L5;
                                    alertDialog$Builder.m(2131624120, 72, org.telegram.ui.ActionBar.j6.w0(i7, dlVar.f33608a), null);
                                    alertDialog$Builder.n(i7, dlVar.f33608a);
                                    alertDialog$Builder.f28392a.U = org.telegram.messenger.hd.M0(2131749530, null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751806, null), new sk(dlVar));
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    alertDialog$Builder.p();
                                }
                            } catch (Exception e11) {
                                org.telegram.messenger.a8.g(e11, true);
                            }
                        } else {
                            return;
                        }
                    }
                    dlVar.i0();
                } catch (RemoteException e12) {
                    throw new RuntimeException(e12);
                }
            }
        } catch (RemoteException e13) {
            throw new RuntimeException(e13);
        }
    }

    public static void a0(dl dlVar) {
        jg.r0 r0Var = dlVar.L;
        di.c1 c1Var = dlVar.M;
        if (dlVar.F != null && dlVar.K != null && dlVar.getMeasuredHeight() != 0) {
            v4.e1 K = c1Var.K(0);
            if (K != null) {
                View view = K.f58535a;
                int bottom = view.getBottom();
                int b10 = r0Var.b();
                int i7 = 1;
                while (true) {
                    if (i7 < b10) {
                        if (r0Var.d(i7) != 11) {
                            v4.e1 K2 = c1Var.K(i7);
                            if (K2 == null) {
                                break;
                            }
                            bottom = Math.max(bottom, K2.f58535a.getBottom());
                        }
                        i7++;
                    } else {
                        dlVar.f33981s0 = bottom - view.getBottom();
                        break;
                    }
                }
            }
            int i10 = dlVar.f33981s0;
            if (i10 < 0) {
                int L = org.telegram.messenger.g0.L(66.0f);
                int i11 = dlVar.f33976p0;
                if (i11 != 1 && i11 != 7 && i11 != 8) {
                    i10 = L;
                } else {
                    i10 = org.telegram.messenger.g0.L(66.0f) + L;
                }
            }
            int measuredHeight = (c1Var.getMeasuredHeight() - dlVar.getDefaultBottomInset()) - i10;
            int measuredHeight2 = dlVar.getMeasuredHeight() + dlVar.getMapExtraTop();
            int max = Math.max(org.telegram.messenger.g0.L(120.0f), measuredHeight - c1Var.getPaddingTop());
            if (measuredHeight2 != dlVar.f33979r0 || max != dlVar.f33977q0) {
                dlVar.f33979r0 = measuredHeight2;
                dlVar.f33977q0 = max;
                org.telegram.messenger.g0.h3(new rk(dlVar, 0));
            }
        }
    }

    private int getBottomInset() {
        d0();
        return org.telegram.messenger.g0.W1(0.0f, getDefaultBottomInset(), getMinBottomInset());
    }

    private int getDefaultBottomInset() {
        if (d0()) {
            return org.telegram.messenger.g0.L(8.0f) + this.f33611e;
        }
        return getMinBottomInset();
    }

    private Location getLastLocation() {
        LocationManager locationManager = (LocationManager) org.telegram.messenger.t0.f26609b.getSystemService("location");
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
        return this.f33609b.f36424a2.getLocationController();
    }

    private int getMapContentHeight() {
        return org.telegram.messenger.g0.L(10.0f) + this.f33979r0 + this.D0;
    }

    private int getMapExtraTop() {
        return org.telegram.messenger.g0.L(8.0f) + org.telegram.messenger.g0.f23605m;
    }

    private org.telegram.messenger.bb getMapTarget() {
        Location location;
        if (this.m0 && (location = this.f33970j0) != null) {
            return new org.telegram.messenger.bb(location.getLatitude(), this.f33970j0.getLongitude());
        }
        Location location2 = this.f33969i0;
        if (location2 != null) {
            return new org.telegram.messenger.bb(location2.getLatitude(), this.f33969i0.getLongitude());
        }
        return null;
    }

    private org.telegram.messenger.np getMessagesController() {
        return this.f33609b.f36424a2.getMessagesController();
    }

    private int getMinBottomInset() {
        if (d0()) {
            return getDefaultBottomInset();
        }
        return Math.min(this.f33611e, org.telegram.messenger.g0.f23606n);
    }

    private Activity getParentActivity() {
        org.telegram.ui.ActionBar.e2 e2Var;
        ki kiVar = this.f33609b;
        if (kiVar != null && (e2Var = kiVar.f36424a2) != null) {
            return e2Var.getParentActivity();
        }
        return null;
    }

    private org.telegram.messenger.m10 getUserConfig() {
        return this.f33609b.f36424a2.getUserConfig();
    }

    @Override
    public final void A() {
        org.telegram.messenger.ya yaVar = this.F;
        if (yaVar != null && this.f33967g0) {
            try {
                ((a8.r7) yaVar).y();
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
            }
        }
        this.f33968h0 = false;
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.dl.B(int, int):void");
    }

    @Override
    public final void C() {
        org.telegram.messenger.ya yaVar = this.F;
        if (yaVar != null && this.f33967g0) {
            try {
                ((a8.r7) yaVar).z();
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        this.f33968h0 = true;
    }

    @Override
    public final void F(float f10, float f11) {
        if (this.f33983u0 == f10 && this.f33984v0 == f11) {
            return;
        }
        this.f33983u0 = f10;
        this.f33984v0 = f11;
        e0();
    }

    @Override
    public final void I(ci ciVar) {
        long j3;
        ki kiVar = this.f33609b;
        kiVar.V2.setTitle(org.telegram.messenger.hd.M0(2131745456, null));
        if (((ai.k0) ((a8.r7) this.F).f617b).getParent() == null) {
            FrameLayout.LayoutParams e10 = c8.ja.e(-1, org.telegram.messenger.g0.L(10.0f) + this.f33977q0, 51);
            bi.g2 g2Var = this.K;
            g2Var.addView((ai.k0) ((a8.r7) this.F).f617b, 0, e10);
            g2Var.addView(this.J, 1, c8.ja.c(-1.0f, -1));
        }
        this.f33987x.setVisibility(0);
        org.telegram.messenger.ya yaVar = this.F;
        if (yaVar != null && this.f33967g0) {
            try {
                ((a8.r7) yaVar).z();
            } catch (Throwable th2) {
                org.telegram.messenger.a8.g(th2, true);
            }
        }
        this.f33968h0 = true;
        org.telegram.messenger.ea eaVar = this.E;
        if (eaVar != null) {
            try {
                eaVar.k(true);
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
        c0();
        boolean g02 = kiVar.X3.g0();
        rk rkVar = new rk(this, 1);
        if (g02) {
            j3 = 200;
        } else {
            j3 = 0;
        }
        org.telegram.messenger.g0.i3(rkVar, j3);
        this.Q.h1(0, 0);
        i0();
    }

    @Override
    public final void K() {
        this.M.y0(0);
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29030n5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28792a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28813b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Fi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Ji));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.fj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.ij));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28850d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28941i6));
    }

    public final void b0() {
        org.telegram.ui.ActionBar.q0 q0Var = this.f33978r;
        if (q0Var != null) {
            q0Var.setIconColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.lj, this.f33608a));
            this.f33978r.I(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.G8, this.f33608a));
            this.f33978r.P(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.F8, this.f33608a), true);
            this.f33978r.P(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.E8, this.f33608a), false);
        }
        if (this.E != null) {
            if (org.telegram.ui.ActionBar.j6.I.q() || org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, this.f33608a)) < 0.721f) {
                if (!this.R) {
                    this.R = true;
                    this.E.i(((pb.b) org.telegram.messenger.t0.k()).loadRawResourceStyle(org.telegram.messenger.t0.f26609b, 2131624086));
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
            di.c1 c1Var = this.M;
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c1Var.getLayoutParams();
            layoutParams.topMargin = currentActionBarHeight;
            c1Var.setLayoutParams(layoutParams);
            bi.g2 g2Var = this.K;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) g2Var.getLayoutParams();
            layoutParams2.topMargin = 0;
            layoutParams2.height = this.f33979r0;
            g2Var.setLayoutParams(layoutParams2);
            uj0 uj0Var = this.N;
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) uj0Var.getLayoutParams();
            layoutParams3.topMargin = currentActionBarHeight;
            uj0Var.setLayoutParams(layoutParams3);
            int i7 = this.f33977q0;
            jg.r0 r0Var = this.L;
            r0Var.P(i7);
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ((ai.k0) ((a8.r7) this.F).f617b).getLayoutParams();
            if (layoutParams4 != null) {
                layoutParams4.height = org.telegram.messenger.g0.L(10.0f) + this.f33979r0;
                ((ai.k0) ((a8.r7) this.F).f617b).setLayoutParams(layoutParams4);
            }
            r0Var.f();
            i0();
        }
    }

    public final boolean d0() {
        kh khVar = this.f33609b.f36494v3;
        if (khVar != null && khVar.getVisibility() != 8) {
            return true;
        }
        return false;
    }

    @Override
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        int i11 = org.telegram.messenger.ns.f25591v4;
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
        } else if (i7 == org.telegram.messenger.ns.f25598w4) {
            this.U = true;
            this.T = false;
            if (r0Var != null) {
                r0Var.O(true, false);
            }
        }
        c0();
        this.f33609b.getClass();
        this.f33987x.setVisibility(0);
    }

    @Override
    public final boolean e() {
        return !d0();
    }

    public final void e0() {
        bi.g2 g2Var;
        di.c1 c1Var;
        int i7;
        int mapContentHeight;
        org.telegram.messenger.bb bbVar;
        if (this.F != null && (g2Var = this.K) != null && (c1Var = this.M) != null) {
            v4.e1 K = c1Var.K(0);
            if (K != null) {
                i7 = K.f58535a.getTop() + c1Var.getTop();
            } else {
                i7 = Integer.MAX_VALUE;
            }
            if (K != null && i7 < getMeasuredHeight()) {
                if (((ai.k0) ((a8.r7) this.F).f617b).getVisibility() == 4) {
                    ((ai.k0) ((a8.r7) this.F).f617b).setVisibility(0);
                    g2Var.setVisibility(0);
                }
                float f10 = i7;
                boolean z10 = true;
                if (this.f33984v0 < 1.0f) {
                    int[] iArr = this.f33986w0;
                    getLocationInWindow(iArr);
                    f10 = Math.min(i7, org.telegram.messenger.g0.W1(this.f33984v0, -iArr[1], i7));
                }
                int max = (int) Math.max(f10, -getMapExtraTop());
                int max2 = (Math.max(0, K.f58535a.getTop()) + c1Var.getTop()) - max;
                int min = (Math.min(this.f33982t0, c1Var.getMeasuredHeight()) + c1Var.getTop()) - max;
                this.f33988x0 = org.telegram.messenger.g0.L(32.0f) + max2;
                this.f33990y0 = min;
                this.f33991z0 = Math.max(0, this.f33979r0 - (getMeasuredHeight() - max));
                float f11 = max;
                g2Var.setTranslationY(f11);
                g2Var.invalidate();
                this.f33978r.setTranslationY(max2);
                this.f33973n.setTranslationY(-Math.max(0, this.f33979r0 - min));
                int top = c1Var.getTop();
                int i10 = min + max;
                float f12 = (top + i10) / 2.0f;
                float max3 = Math.max(f12, ((c1Var.getPaddingTop() + top) + i10) / 2.0f);
                int ceil = (int) Math.ceil(max3 - f12);
                if (ceil != this.D0) {
                    this.D0 = ceil;
                    org.telegram.messenger.g0.h3(new rk(this, 0));
                }
                float C = a8.p0.C(max + max2 + i10, 2.0f, max3, f12);
                int ceil2 = ((int) Math.ceil(max3)) + getMapExtraTop();
                float f13 = C - ceil2;
                ((ai.k0) ((a8.r7) this.F).f617b).setTranslationY(f13 - f11);
                int L = ((int) (C - f11)) - org.telegram.messenger.g0.L(48.0f);
                if (L != this.f33971k0) {
                    this.f33971k0 = L;
                    this.P.setTranslationY(L);
                }
                if (((ai.k0) ((a8.r7) this.F).f617b).getMeasuredHeight() > 0) {
                    mapContentHeight = ((ai.k0) ((a8.r7) this.F).f617b).getMeasuredHeight();
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
                            bbVar = (org.telegram.messenger.bb) this.E.d().f15288b;
                        } else {
                            bbVar = null;
                        }
                        this.C0 = ceil2;
                        this.E0 = i11;
                        this.F0 = max4;
                        this.E.o(0, org.telegram.messenger.g0.L(6.0f) + i11, 0, org.telegram.messenger.g0.L(6.0f) + max4);
                        if (bbVar != null) {
                            this.E.h(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(bbVar));
                        }
                    }
                }
            } else if (((ai.k0) ((a8.r7) this.F).f617b).getVisibility() == 0) {
                ((ai.k0) ((a8.r7) this.F).f617b).setVisibility(4);
                g2Var.setVisibility(4);
            }
        }
    }

    @Override
    public final boolean f() {
        return true;
    }

    public final void f0() {
        dl dlVar;
        ki kiVar = this.f33609b;
        if (kiVar.J1) {
            if (kiVar.f36507y4 != null) {
                org.telegram.messenger.g0.h3(new rk(this, 2));
                return;
            } else if (!this.U) {
                File file = kiVar.f36503x4;
                boolean z10 = kiVar.f36499w4;
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
                        dlVar = this;
                        ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                        float[] fArr = new float[2];
                        if (exifInterface.getLatLong(fArr)) {
                            org.telegram.messenger.g0.h3(new od(17, this, fArr));
                            return;
                        }
                        Location lastLocation = getLastLocation();
                        dlVar.f33969i0 = lastLocation;
                        g0(lastLocation);
                        return;
                    }
                }
                dlVar = this;
                Location lastLocation2 = getLastLocation();
                dlVar.f33969i0 = lastLocation2;
                g0(lastLocation2);
                return;
            } else {
                org.telegram.messenger.g0.h3(new rk(this, 7));
                return;
            }
        }
        Location lastLocation3 = getLastLocation();
        this.f33969i0 = lastLocation3;
        g0(lastLocation3);
    }

    public final void g0(Location location) {
        if (location != null) {
            Location location2 = new Location(location);
            this.f33969i0 = location2;
            org.telegram.messenger.ea eaVar = this.E;
            jg.r0 r0Var = this.L;
            if (eaVar != null) {
                org.telegram.messenger.bb bbVar = new org.telegram.messenger.bb(location.getLatitude(), location.getLongitude());
                if (r0Var != null) {
                    r0Var.M(this.f33969i0);
                }
                if (!this.m0) {
                    this.f33970j0 = new Location(location);
                    if (this.f33974n0) {
                        this.E.b(((pb.b) org.telegram.messenger.t0.k()).newCameraUpdateLatLng(bbVar));
                        return;
                    }
                    this.f33974n0 = true;
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
        di.c1 c1Var = this.M;
        if (c1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i7 = 0;
        cj0 cj0Var = (cj0) c1Var.K(0);
        if (cj0Var != null) {
            i7 = Math.max((int) cj0Var.f58535a.getY(), 0);
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
    public ArrayList<org.telegram.ui.ActionBar.s6> getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList<org.telegram.ui.ActionBar.s6> arrayList = new ArrayList<>();
        q6 q6Var = new q6(this, 1);
        arrayList.add(new org.telegram.ui.ActionBar.s6(this.K, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28922h5));
        int i7 = org.telegram.ui.ActionBar.j6.A5;
        di.c1 c1Var = this.M;
        arrayList.add(new org.telegram.ui.ActionBar.s6(c1Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i7));
        org.telegram.ui.ActionBar.q0 q0Var = this.f33987x;
        if (q0Var != null) {
            editTextBoldCursor = q0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.s6(editTextBoldCursor, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.f28957j5));
        int i10 = org.telegram.ui.ActionBar.j6.nj;
        ImageView imageView = this.f33973n;
        arrayList.add(new org.telegram.ui.ActionBar.s6(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        int i11 = org.telegram.ui.ActionBar.j6.oj;
        arrayList.add(new org.telegram.ui.ActionBar.s6(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.lj;
        org.telegram.ui.ActionBar.q0 q0Var2 = this.f33978r;
        arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, q6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.s6(q0Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.jj));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.kj));
        arrayList.add(new org.telegram.ui.ActionBar.s6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.pj));
        arrayList.add(new org.telegram.ui.ActionBar.s6(c1Var, 393216, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.ej));
        arrayList.add(new org.telegram.ui.ActionBar.s6(c1Var, 393216, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.hj));
        arrayList.add(new org.telegram.ui.ActionBar.s6(c1Var, 393248, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.dj));
        arrayList.add(new org.telegram.ui.ActionBar.s6(c1Var, 393248, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.gj));
        arrayList.add(new org.telegram.ui.ActionBar.s6(c1Var, 196608, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.r6) null, org.telegram.ui.ActionBar.j6.Hi));
        return arrayList;
    }

    public final void h0(double d, double d2) {
        org.telegram.messenger.ta newCameraUpdateLatLngZoom;
        if (this.E != null) {
            int i7 = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
            if (i7 != 0 && d2 != 0.0d) {
                Location location = new Location("");
                this.f33970j0 = location;
                location.reset();
                this.f33970j0.setLatitude(d);
                this.f33970j0.setLongitude(d2);
            } else {
                Location location2 = new Location("");
                this.f33969i0 = location2;
                location2.reset();
                this.f33969i0.setLatitude(d);
                this.f33969i0.setLongitude(d2);
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
                r0Var.L(this.f33970j0);
            } else {
                r0Var.M(this.f33969i0);
            }
            r0Var.H();
            this.M.w0(0, 1, null);
            this.f33972l0 = true;
            if (i7 != 0 && d2 != 0.0d) {
                this.m0 = true;
            }
        }
    }

    public final void i0() {
        bi.g2 g2Var;
        if (this.F != null && (g2Var = this.K) != null) {
            di.c1 c1Var = this.M;
            v4.e1 K = c1Var.K(0);
            if (K != null) {
                K.f58535a.getTop();
            } else {
                g2Var.getMeasuredHeight();
            }
            int i7 = this.f33981s0;
            if (i7 < 0) {
                int L = org.telegram.messenger.g0.L(66.0f);
                int i10 = this.f33976p0;
                if (i10 != 1 && i10 != 7 && i10 != 8) {
                    i7 = L;
                } else {
                    i7 = org.telegram.messenger.g0.L(66.0f) + L;
                }
            }
            int measuredHeight = (c1Var.getMeasuredHeight() - getBottomInset()) - i7;
            this.f33982t0 = measuredHeight;
            if (K != null) {
                int bottom = measuredHeight - K.f58535a.getBottom();
                int childCount = c1Var.getChildCount();
                for (int i11 = 0; i11 < childCount; i11++) {
                    View childAt = c1Var.getChildAt(i11);
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
        boolean z10 = this.f33964d0;
        LinearLayout linearLayout = this.f33980s;
        if (z10) {
            boolean z11 = this.f33966f0;
            uj0 uj0Var = this.N;
            if (z11) {
                uj0Var.setEmptyView(null);
                linearLayout.setVisibility(8);
                return;
            }
            uj0Var.setEmptyView(linearLayout);
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
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25591v4);
        org.telegram.messenger.ns.e().n(this, org.telegram.messenger.ns.f25598w4);
        this.f33989y = true;
        bi.g2 g2Var = this.K;
        if (g2Var != null) {
            g2Var.invalidate();
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
            ((ai.k0) ((a8.r7) yaVar).f617b).setTranslationY((-org.telegram.messenger.g0.f23611q.y) * 3);
        }
        try {
            org.telegram.messenger.ya yaVar2 = this.F;
            if (yaVar2 != null) {
                ((a8.r7) yaVar2).y();
            }
        } catch (Exception unused) {
        }
        try {
            org.telegram.messenger.ya yaVar3 = this.F;
            if (yaVar3 != null) {
                ((a8.r7) yaVar3).x();
                this.F = null;
            }
        } catch (Exception unused2) {
        }
        jg.r0 r0Var = this.L;
        if (r0Var != null) {
            r0Var.F();
        }
        bl blVar = this.O;
        if (blVar != null) {
            blVar.F();
        }
        ki kiVar = this.f33609b;
        kiVar.V2.n(true);
        kiVar.V2.s().removeView(this.f33987x);
    }

    @Override
    public final boolean q() {
        p();
        return false;
    }

    public void setDelegate(cl clVar) {
        this.f33975o0 = clVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f33609b.f29682b.invalidate();
        i0();
    }

    @Override
    public final void u() {
        this.f33987x.setVisibility(8);
    }

    @Override
    public final void updateColors() {
        try {
            b0();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.f33987x;
        if (q0Var != null) {
            try {
                if (q0Var.getSearchField() != null) {
                    q0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28957j5, this.f33608a));
                }
            } catch (Exception e11) {
                org.telegram.messenger.a8.g(e11, true);
            }
        }
    }

    @Override
    public final void y() {
        boolean z10;
        ki kiVar = this.f33609b;
        if (kiVar != null && !kiVar.d) {
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
