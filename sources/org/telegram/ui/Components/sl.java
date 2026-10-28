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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public final class sl extends li implements org.telegram.ui.ActionBar.p6, NotificationCenter.NotificationCenterDelegate {
    public static final int B0 = 0;
    public final Bitmap[] A0;
    public boolean E;
    public IMapsProvider.IMap F;
    public IMapsProvider.IMapView G;
    public IMapsProvider.ICameraUpdate H;
    public float I;
    public boolean J;
    public final View K;
    public final bh.r L;
    public final ig.s0 M;
    public final bi.r1 N;
    public final nm0 O;
    public final ll P;
    public final ImageView Q;
    public final jg.e0 R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final long f32614a0;
    public final Paint f32615b0;
    public final ArrayList f32616c0;
    public AnimatorSet f32617d0;
    public IMapsProvider.IMarker f32618e0;
    public rl f32619f0;
    public FrameLayout f32620g0;
    public boolean f32621h0;
    public boolean f32622i0;
    public boolean f32623j0;
    public boolean f32624k0;
    public boolean f32625l0;
    public boolean m0;
    public final ImageView f32626n;
    public Location f32627n0;
    public Location f32628o0;
    public int f32629p0;
    public boolean f32630q0;
    public final org.telegram.ui.ActionBar.w0 f32631r;
    public boolean f32632r0;
    public final ql f32633s;
    public boolean f32634s0;
    public boolean f32635t0;
    public nl f32636u0;
    public final LinearLayout v;
    public final int f32637v0;
    public final TextView f32638w;
    public int f32639w0;
    public final org.telegram.ui.ActionBar.w0 f32640x;
    public int f32641x0;
    public final pl f32642y;
    public int f32643y0;
    public int f32644z0;

    public sl(ti tiVar, Context context, final org.telegram.ui.ActionBar.u6 u6Var, boolean z10) {
        super(context, u6Var, tiVar);
        final org.telegram.ui.wn wnVar;
        boolean z11;
        int i10;
        boolean z12;
        this.T = true;
        this.U = false;
        this.V = false;
        this.W = true;
        this.f32615b0 = new Paint();
        this.f32616c0 = new ArrayList();
        this.f32621h0 = true;
        int currentActionBarHeight = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.f32639w0 = currentActionBarHeight;
        this.f32641x0 = currentActionBarHeight;
        this.A0 = new Bitmap[7];
        AndroidUtilities.fixGoogleMapsBug();
        ti tiVar2 = this.f30254b;
        org.telegram.ui.ActionBar.r2 r2Var = tiVar2.f32990f0;
        if (r2Var instanceof org.telegram.ui.wn) {
            wnVar = (org.telegram.ui.wn) r2Var;
        } else {
            wnVar = null;
        }
        long t12 = tiVar2.t1();
        this.f32614a0 = t12;
        if (this.f30254b.O) {
            this.f32637v0 = 7;
        } else if (z10 && wnVar != null && wnVar.h == null && !wnVar.c() && !UserObject.isUserSelf(wnVar.i())) {
            this.f32637v0 = 1;
        } else {
            this.f32637v0 = 0;
        }
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addWeakObserver(this, NotificationCenter.locationPermissionDenied);
        this.f32623j0 = false;
        this.f32622i0 = false;
        this.f32624k0 = false;
        ig.s0 s0Var = this.M;
        if (s0Var != null) {
            s0Var.F();
        }
        ll llVar = this.P;
        if (llVar != null) {
            llVar.F();
        }
        if (getParentActivity() != null && getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.V = z11;
        org.telegram.ui.ActionBar.z l4 = this.f30254b.f32974a1.l();
        this.f32642y = new pl(this, context);
        org.telegram.ui.ActionBar.w0 a2 = l4.a(0, R.drawable.outline_header_search);
        a2.N();
        a2.H = new jg.e2(this, 7);
        this.f32640x = a2;
        if (this.V && !this.f30254b.O) {
            i10 = 8;
        } else {
            this.f30254b.getClass();
            i10 = 0;
        }
        a2.setVisibility(i10);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i11 = org.telegram.ui.ActionBar.y6.f23465j5;
        org.telegram.ui.ActionBar.f7.V(searchField, i11, u6Var);
        org.telegram.ui.ActionBar.f7.w(searchField, i11, u6Var);
        org.telegram.ui.ActionBar.f7.E(searchField, org.telegram.ui.ActionBar.y6.Vd, u6Var);
        new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f)).gravity = 83;
        bh.r rVar = new bh.r(this, context, 12);
        this.L = rVar;
        rVar.setWillNotDraw(false);
        View view = new View(context);
        this.K = view;
        view.setBackgroundDrawable(new dd(org.telegram.ui.ActionBar.y6.C0().q()));
        ql qlVar = new ql(context, 0);
        this.f32633s = qlVar;
        qlVar.setTranslationX(-AndroidUtilities.dp(80.0f));
        qlVar.setVisibility(4);
        int dp = AndroidUtilities.dp(40.0f);
        int i12 = org.telegram.ui.ActionBar.y6.f23724wi;
        int w02 = org.telegram.ui.ActionBar.y6.w0(i12, this.f30253a);
        int i13 = org.telegram.ui.ActionBar.y6.xi;
        int w03 = org.telegram.ui.ActionBar.y6.w0(i13, this.f30253a);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, w02, w03, w03);
        kb1.b(qlVar);
        qlVar.setTranslationZ(AndroidUtilities.dp(2.0f));
        ag.v0 v0Var = ag.z0.f1400a;
        qlVar.setOutlineProvider(v0Var);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i12);
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i13);
        qlVar.setBackground(j02);
        org.telegram.ui.ActionBar.f7.k(qlVar, j02, N, N2, u6Var);
        int i14 = org.telegram.ui.ActionBar.y6.f23704vi;
        org.telegram.ui.ActionBar.f7.V(qlVar, i14, u6Var);
        qlVar.setTextSize(1, 14.0f);
        qlVar.setTypeface(AndroidUtilities.bold());
        qlVar.setText(LocaleController.getString(R.string.PlacesInThisArea));
        qlVar.setGravity(17);
        qlVar.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        rVar.addView(qlVar, kb1.h(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
        qlVar.setOnClickListener(new View.OnClickListener(this) {
            public final sl f29380b;

            {
                this.f29380b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        sl slVar = this.f29380b;
                        slVar.g0(false);
                        slVar.M.H(null, slVar.f32628o0, true);
                        slVar.f32634s0 = true;
                        slVar.f0();
                        return;
                    default:
                        this.f29380b.f32631r.U(null, null);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23686ui, this.f30253a), false, u6Var);
        this.f32631r = w0Var;
        w0Var.setClickable(true);
        w0Var.setSubMenuOpenSide(2);
        w0Var.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        w0Var.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        w0Var.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), u6Var);
        w0Var.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), u6Var);
        w0Var.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), u6Var);
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.y6.i0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.y6.w0(i12, this.f30253a), org.telegram.ui.ActionBar.y6.w0(i13, this.f30253a));
        kb1.b(w0Var);
        w0Var.setTranslationZ(AndroidUtilities.dp(2.0f));
        w0Var.setOutlineProvider(v0Var);
        org.telegram.ui.ActionBar.b7 N3 = org.telegram.ui.ActionBar.f7.N(i12);
        org.telegram.ui.ActionBar.b7 N4 = org.telegram.ui.ActionBar.f7.N(i13);
        w0Var.setBackground(i02);
        org.telegram.ui.ActionBar.f7.k(w0Var, i02, N3, N4, u6Var);
        w0Var.setIcon(R.drawable.msg_map_type);
        rVar.addView(w0Var, kb1.h(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        w0Var.setOnClickListener(new View.OnClickListener(this) {
            public final sl f29380b;

            {
                this.f29380b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        sl slVar = this.f29380b;
                        slVar.g0(false);
                        slVar.M.H(null, slVar.f32628o0, true);
                        slVar.f32634s0 = true;
                        slVar.f0();
                        return;
                    default:
                        this.f29380b.f32631r.U(null, null);
                        return;
                }
            }
        });
        w0Var.setDelegate(new cl(this, 0));
        ImageView imageView = new ImageView(context);
        this.f32626n = imageView;
        org.telegram.ui.Cells.y i03 = org.telegram.ui.ActionBar.y6.i0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.y6.w0(i12, this.f30253a), org.telegram.ui.ActionBar.y6.w0(i13, this.f30253a));
        kb1.b(imageView);
        imageView.setTranslationZ(AndroidUtilities.dp(2.0f));
        imageView.setOutlineProvider(v0Var);
        org.telegram.ui.ActionBar.b7 N5 = org.telegram.ui.ActionBar.f7.N(i12);
        org.telegram.ui.ActionBar.b7 N6 = org.telegram.ui.ActionBar.f7.N(i13);
        imageView.setBackground(i03);
        org.telegram.ui.ActionBar.f7.k(imageView, i03, N5, N6, u6Var);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.f7.t(imageView, i14, u6Var, mode);
        imageView.setTag(Integer.valueOf(i14));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        rVar.addView(imageView, kb1.h(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        imageView.setOnClickListener(new ga(3, this, u6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(160.0f), 0, 0);
        linearLayout.setVisibility(8);
        addView(linearLayout, kb1.g(-1.0f, -1));
        linearLayout.setOnTouchListener(new ei.d(15));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.location_empty);
        org.telegram.ui.ActionBar.f7.t(imageView2, org.telegram.ui.ActionBar.y6.W5, u6Var, mode);
        linearLayout.addView(imageView2, kb1.r(-2, -2));
        TextView textView = new TextView(context);
        int i15 = org.telegram.ui.ActionBar.y6.X5;
        org.telegram.ui.ActionBar.f7.V(textView, i15, u6Var);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 17.0f);
        textView.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView e = org.telegram.messenger.wh.e(linearLayout, textView, kb1.x(-2, -2, 17, 0, 11, 0, 0), context);
        this.f32638w = e;
        org.telegram.ui.ActionBar.f7.V(e, i15, u6Var);
        e.setGravity(17);
        e.setTextSize(1, 15.0f);
        e.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(e, kb1.x(-2, -2, 17, 0, 6, 0, 0));
        bi.r1 r1Var = new bi.r1(this, context, u6Var, 14);
        this.N = r1Var;
        setBlur3Capture(r1Var);
        this.d = r1Var;
        this.f30256f = true;
        r1Var.setClipToPadding(false);
        ig.s0 s0Var2 = new ig.s0(context, this.f32637v0, t12, true, u6Var, this.f30254b.O, false, false);
        this.M = s0Var2;
        r1Var.setAdapter(s0Var2);
        ti tiVar3 = this.f30254b;
        if (tiVar3 != null && (tiVar3.H || tiVar3.P)) {
            z12 = true;
        } else {
            z12 = false;
        }
        s0Var2.f14235f0 = z12;
        s4.l lVar = new s4.l();
        lVar.n(350L);
        lVar.o(ds.h);
        lVar.C = false;
        lVar.f47798m = false;
        r1Var.setItemAnimator(lVar);
        s0Var2.O(this.V, this.U);
        r1Var.setVerticalScrollBarEnabled(false);
        r1Var.u1();
        jg.e0 e0Var = new jg.e0(this, r1Var);
        this.R = e0Var;
        r1Var.setLayoutManager(e0Var);
        addView(r1Var, kb1.i(-1, -1, 51));
        r1Var.setOnScrollListener(new kl(this));
        r1Var.setOnItemClickListener(new am0(this) {
            public final sl f27481b;

            {
                this.f27481b = this;
            }

            @Override
            public final void c(int i16, View view2) {
                switch (r4) {
                    case 0:
                        sl.Q(this.f27481b, wnVar, u6Var, i16);
                        return;
                    default:
                        sl.R(this.f27481b, wnVar, u6Var, i16);
                        return;
                }
            }
        });
        cl clVar = new cl(this, 1);
        s0Var2.H = t12;
        s0Var2.f14014y = clVar;
        s0Var2.P(AndroidUtilities.dp(16.0f) + this.f32639w0);
        addView(rVar, kb1.i(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.G = onCreateMapView;
        onCreateMapView.setOnDispatchTouchEventInterceptor(new cl(this, 2));
        this.G.setOnInterceptTouchEventInterceptor(new p1(11, this, u6Var));
        new Thread(new el(this, this.G, 1)).start();
        ImageView imageView3 = new ImageView(context);
        this.Q = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        rVar.addView(imageView3, kb1.i(28, 48, 49));
        nm0 nm0Var = new nm0(context, u6Var);
        this.O = nm0Var;
        nm0Var.setSections(true);
        nm0Var.setClipToPadding(false);
        nm0Var.setVisibility(8);
        nm0Var.setLayoutManager(new s4.c0(1, false));
        ll llVar2 = new ll(this, context, u6Var, this.f30254b.O);
        this.P = llVar2;
        boolean z13 = this.V;
        if (llVar2.M != z13) {
            llVar2.M = z13;
        }
        cl clVar2 = new cl(this, 6);
        llVar2.H = 0L;
        llVar2.f14014y = clVar2;
        nm0Var.setItemAnimator(null);
        addView(nm0Var, kb1.i(-1, -1, 51));
        nm0Var.setOnScrollListener(new ml(this, 0));
        nm0Var.setOnItemClickListener(new am0(this) {
            public final sl f27481b;

            {
                this.f27481b = this;
            }

            @Override
            public final void c(int i16, View view2) {
                switch (r4) {
                    case 0:
                        sl.Q(this.f27481b, wnVar, u6Var, i16);
                        return;
                    default:
                        sl.R(this.f27481b, wnVar, u6Var, i16);
                        return;
                }
            }
        });
        i0();
    }

    public static void N(sl slVar, IMapsProvider.IMap iMap) {
        PackageManager packageManager;
        slVar.F = iMap;
        iMap.setOnMapLoadedCallback(new bl(slVar, 2));
        if (org.telegram.ui.ActionBar.y6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23357d6, slVar.f30253a)) < 0.721f) {
            slVar.S = true;
            slVar.F.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
        }
        if (slVar.F != null) {
            Location location = new Location("network");
            slVar.f32628o0 = location;
            location.setLatitude(20.659322d);
            slVar.f32628o0.setLongitude(-11.40625d);
            try {
                slVar.F.setMyLocationEnabled(true);
            } catch (Exception e) {
                FileLog.e(e);
            }
            slVar.F.getUiSettings().setMyLocationButtonEnabled(false);
            slVar.F.getUiSettings().setZoomControlsEnabled(false);
            slVar.F.getUiSettings().setCompassEnabled(false);
            slVar.F.setOnCameraMoveStartedListener(new cl(slVar, 3));
            slVar.F.setOnCameraIdleListener(new bl(slVar, 4));
            slVar.F.setOnMyLocationChangeListener(new hl(slVar, 1));
            slVar.F.setOnMarkerClickListener(new cl(slVar, 4));
            slVar.F.setOnCameraMoveListener(new bl(slVar, 5));
            slVar.c0();
            AndroidUtilities.runOnUIThread(new bl(slVar, 6), 200L);
            if (slVar.T && slVar.getParentActivity() != null) {
                slVar.T = false;
                Activity parentActivity = slVar.getParentActivity();
                if (parentActivity == null || (packageManager = parentActivity.getPackageManager()) == null || packageManager.hasSystemFeature("android.hardware.location.gps")) {
                    try {
                        if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(slVar.getParentActivity(), 0, slVar.f30253a);
                            int i10 = R.raw.permission_request_location;
                            int i11 = org.telegram.ui.ActionBar.y6.L5;
                            alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.y6.w0(i11, slVar.f30253a), null);
                            alertDialog$Builder.n(i11, slVar.f30253a);
                            alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                            alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new cl(slVar, 5));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.p();
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                } else {
                    return;
                }
            }
            slVar.h0();
        }
    }

    public static void O(sl slVar, org.telegram.ui.wn wnVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.u6 u6Var, Long l4) {
        if (wnVar != null && wnVar.c()) {
            g5.L(slVar.getParentActivity(), wnVar.a(), new androidx.car.app.utils.a(slVar, tL_messageMediaGeo, l4, 27), u6Var);
            return;
        }
        slVar.f32636u0.d(tL_messageMediaGeo, slVar.f32637v0, true, 0, l4.longValue());
        slVar.f30254b.dismiss(true);
    }

    public static void P(sl slVar) {
        ig.s0 s0Var = slVar.M;
        ti tiVar = slVar.f30254b;
        if (slVar.f32621h0) {
            int i10 = Build.VERSION.SDK_INT;
            Activity parentActivity = slVar.getParentActivity();
            if (parentActivity != null) {
                slVar.f32621h0 = false;
                if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    String[] strArr = (!tiVar.O || tiVar.C2 == null || i10 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
                    slVar.U = true;
                    if (s0Var != null) {
                        s0Var.O(slVar.V, true);
                    }
                    parentActivity.requestPermissions(strArr, 2);
                } else if (i10 >= 29 && tiVar.O && tiVar.C2 != null && parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") != 0) {
                    slVar.U = true;
                    if (s0Var != null) {
                        s0Var.O(slVar.V, true);
                    }
                    parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
                }
            }
        }
    }

    public static void Q(sl slVar, org.telegram.ui.wn wnVar, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        sl slVar2;
        org.telegram.ui.wn wnVar2;
        org.telegram.ui.ActionBar.u6 u6Var2;
        TLRPC.User user;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j10 = slVar.f32614a0;
        ig.s0 s0Var = slVar.M;
        ti tiVar = slVar.f30254b;
        int i11 = slVar.f32637v0;
        if (i11 == 7) {
            if (i10 == 1 && (tL_messageMediaVenue2 = s0Var.f14233d0) != null) {
                slVar.f32636u0.d(tL_messageMediaVenue2, i11, true, 0, 0L);
                tiVar.dismiss(true);
                return;
            } else if (i10 == 2 && (tL_messageMediaVenue = s0Var.f14234e0) != null) {
                slVar.f32636u0.d(tL_messageMediaVenue, i11, true, 0, 0L);
                tiVar.dismiss(true);
                return;
            } else {
                slVar2 = slVar;
                wnVar2 = wnVar;
                u6Var2 = u6Var;
            }
        } else if (i10 == 1) {
            if (slVar.f32636u0 != null && slVar.f32628o0 != null) {
                FrameLayout frameLayout = slVar.f32620g0;
                if (frameLayout != null) {
                    frameLayout.callOnClick();
                    return;
                }
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(slVar.f32628o0.getLatitude());
                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(slVar.f32628o0.getLongitude());
                g5.Z(tiVar.M1, tiVar.p1() + 1, tiVar.t1(), new di.y2(slVar, wnVar, tL_messageMediaGeo, u6Var, 6));
                return;
            } else if (slVar.V) {
                g5.C(slVar.getParentActivity()).show();
                return;
            } else {
                return;
            }
        } else {
            slVar2 = slVar;
            wnVar2 = wnVar;
            u6Var2 = u6Var;
            if (i10 == 2 && i11 == 1) {
                if (slVar2.getLocationController().isSharingLocation(j10)) {
                    slVar2.getLocationController().removeSharingLocation(j10);
                    tiVar.dismiss(true);
                    return;
                } else if (slVar2.f32627n0 == null && slVar2.V) {
                    g5.C(slVar2.getParentActivity()).show();
                    return;
                } else if (slVar2.f32636u0 != null && slVar2.getParentActivity() != null && slVar2.f32627n0 != null) {
                    if (DialogObject.isUserDialog(j10)) {
                        user = tiVar.f32990f0.getMessagesController().getUser(Long.valueOf(j10));
                    } else {
                        user = null;
                    }
                    g5.D(slVar2.getParentActivity(), false, user, new MessagesStorage.IntCallback() {
                        @Override
                        public final void run(int i12) {
                            sl slVar3 = sl.this;
                            ti tiVar2 = slVar3.f30254b;
                            g5.Z(tiVar2.M1, tiVar2.p1() + 1, tiVar2.t1(), new fi.c4(slVar3, i12, 4));
                        }
                    }, slVar2.f30253a).show();
                    return;
                } else {
                    return;
                }
            }
        }
        Object J = s0Var.J(i10);
        if (J instanceof TLRPC.TL_messageMediaVenue) {
            g5.Z(tiVar.M1, tiVar.p1() + 1, tiVar.t1(), new di.y2(slVar2, wnVar2, (TLRPC.TL_messageMediaVenue) J, u6Var2, 7));
        }
    }

    public static void R(sl slVar, org.telegram.ui.wn wnVar, org.telegram.ui.ActionBar.u6 u6Var, int i10) {
        TLRPC.TL_messageMediaVenue I = slVar.P.I(i10);
        if (I != null && slVar.f32636u0 != null) {
            if (wnVar != null && wnVar.c()) {
                g5.L(slVar.getParentActivity(), wnVar.a(), new fl(slVar, I, 0), u6Var);
                return;
            }
            slVar.f32636u0.d(I, slVar.f32637v0, true, 0, 0L);
            slVar.f30254b.dismiss(true);
        }
    }

    public static void S(sl slVar, org.telegram.ui.wn wnVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.u6 u6Var) {
        if (wnVar != null && wnVar.c()) {
            g5.L(slVar.getParentActivity(), wnVar.a(), new fl(slVar, tL_messageMediaVenue, 1), u6Var);
            return;
        }
        slVar.f32636u0.d(tL_messageMediaVenue, slVar.f32637v0, true, 0, 0L);
        slVar.f30254b.dismiss(true);
    }

    public static void T(sl slVar, Location location) {
        int i10;
        ti tiVar = slVar.f30254b;
        if (tiVar != null && tiVar.f32990f0 != null) {
            slVar.d0(location);
            ig.s0 s0Var = slVar.M;
            if (s0Var != null && (((i10 = slVar.f32637v0) == 7 || i10 == 8) && !slVar.f32632r0)) {
                s0Var.L(slVar.f32628o0);
            }
            slVar.getLocationController().setMapLocation(location, slVar.W);
            slVar.W = false;
        }
    }

    public static void U(sl slVar, IMapsProvider.IMapView iMapView) {
        if (slVar.G != null && slVar.getParentActivity() != null) {
            try {
                iMapView.onCreate(null);
                ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                slVar.G.getMapAsync(new hl(slVar, 0));
                slVar.f32625l0 = true;
                if (slVar.m0) {
                    slVar.G.onResume();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void V(sl slVar, org.telegram.ui.ActionBar.u6 u6Var) {
        ig.s0 s0Var = slVar.M;
        ImageView imageView = slVar.f32626n;
        Activity parentActivity = slVar.getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            g5.C(slVar.getParentActivity()).show();
            return;
        }
        if (slVar.f32627n0 != null && slVar.F != null) {
            int i10 = org.telegram.ui.ActionBar.y6.f23704vi;
            org.telegram.ui.ActionBar.f7.t(imageView, i10, u6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setTag(Integer.valueOf(i10));
            s0Var.L(null);
            slVar.f32632r0 = false;
            slVar.g0(false);
            slVar.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(slVar.f32627n0.getLatitude(), slVar.f32627n0.getLongitude())));
            if (slVar.f32634s0) {
                Location location = slVar.f32627n0;
                if (location != null && slVar.f32637v0 != 8) {
                    s0Var.H(null, location, true);
                }
                slVar.f32634s0 = false;
                slVar.f0();
            }
        }
        if (slVar.f32618e0 != null) {
            slVar.Q.setVisibility(0);
            pl plVar = slVar.f32642y;
            IMapsProvider.IMarker iMarker = slVar.f32618e0;
            HashMap hashMap = plVar.f31636a;
            View view = (View) hashMap.get(iMarker);
            if (view != null) {
                plVar.removeView(view);
                hashMap.remove(iMarker);
            }
            slVar.f32618e0 = null;
            slVar.f32619f0 = null;
            slVar.f32620g0 = null;
        }
    }

    public static void W(sl slVar) {
        if (slVar.getParentActivity() != null) {
            try {
                slVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            } catch (Exception unused) {
            }
        }
    }

    private Location getLastLocation() {
        LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
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

    private LocationController getLocationController() {
        return this.f30254b.f32990f0.getLocationController();
    }

    private MessagesController getMessagesController() {
        return this.f30254b.f32990f0.getMessagesController();
    }

    public Activity getParentActivity() {
        org.telegram.ui.ActionBar.r2 r2Var;
        ti tiVar = this.f30254b;
        if (tiVar != null && (r2Var = tiVar.f32990f0) != null) {
            return r2Var.getParentActivity();
        }
        return null;
    }

    private UserConfig getUserConfig() {
        return this.f30254b.f32990f0.getUserConfig();
    }

    @Override
    public final void A() {
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView != null && this.f32625l0) {
            try {
                iMapView.onPause();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        this.m0 = false;
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.sl.B(int, int):void");
    }

    @Override
    public final void C() {
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView != null && this.f32625l0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.m0 = true;
    }

    @Override
    public final void G(li liVar) {
        long j10;
        ti tiVar = this.f30254b;
        tiVar.f32974a1.setTitle(LocaleController.getString(R.string.ShareLocation));
        if (this.G.getView().getParent() == null) {
            View view = this.G.getView();
            FrameLayout.LayoutParams i10 = kb1.i(-1, AndroidUtilities.dp(10.0f) + this.f32639w0, 51);
            bh.r rVar = this.L;
            rVar.addView(view, 0, i10);
            rVar.addView(this.f32642y, 1, kb1.i(-1, AndroidUtilities.dp(10.0f) + this.f32639w0, 51));
            rVar.addView(this.K, 2, kb1.g(-1.0f, -1));
        }
        this.f32640x.setVisibility(0);
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView != null && this.f32625l0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.m0 = true;
        IMapsProvider.IMap iMap = this.F;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        a0();
        boolean E = tiVar.f32982c2.E();
        bl blVar = new bl(this, 1);
        if (E) {
            j10 = 200;
        } else {
            j10 = 0;
        }
        AndroidUtilities.runOnUIThread(blVar, j10);
        this.R.h1(0, 0);
        h0();
    }

    @Override
    public final void J() {
        this.N.y0(0);
    }

    @Override
    public final boolean L() {
        return !this.V;
    }

    public final void Y() {
        org.telegram.ui.ActionBar.w0 w0Var = this.f32631r;
        if (w0Var != null) {
            w0Var.setIconColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23686ui, this.f30253a));
            this.f32631r.H(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.G8, this.f30253a));
            this.f32631r.O(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.F8, this.f30253a), true);
            this.f32631r.O(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.E8, this.f30253a), false);
        }
        if (this.F != null) {
            if (org.telegram.ui.ActionBar.y6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23357d6, this.f30253a)) < 0.721f) {
                if (!this.S) {
                    this.S = true;
                    this.F.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
                }
            } else if (this.S) {
                this.S = false;
                this.F.setMapStyle(null);
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
            Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            paint.setColor(org.telegram.ui.Cells.y4.a(i10));
            canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), paint);
            canvas.setBitmap(null);
            bitmapArr[i10 % 7] = createBitmap;
            return createBitmap;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return null;
        }
    }

    public final void a0() {
        int i10;
        FrameLayout.LayoutParams layoutParams;
        if (getMeasuredHeight() != 0 && this.G != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            int i11 = AndroidUtilities.displaySize.y - currentActionBarHeight;
            int dp = AndroidUtilities.dp(66.0f);
            int i12 = this.f32637v0;
            if (i12 == 1 || i12 == 7 || i12 == 8) {
                dp += AndroidUtilities.dp(66.0f);
            }
            int dp2 = (i11 - dp) - AndroidUtilities.dp(90.0f);
            int dp3 = AndroidUtilities.dp(189.0f);
            this.f32639w0 = dp3;
            if (!this.V || !b0()) {
                dp2 = Math.min(AndroidUtilities.dp(310.0f), dp2);
            }
            this.f32641x0 = Math.max(dp3, dp2);
            if (this.V && b0()) {
                this.f32639w0 = this.f32641x0;
            }
            bi.r1 r1Var = this.N;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) r1Var.getLayoutParams();
            layoutParams2.topMargin = currentActionBarHeight;
            r1Var.setLayoutParams(layoutParams2);
            bh.r rVar = this.L;
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) rVar.getLayoutParams();
            layoutParams3.topMargin = currentActionBarHeight;
            layoutParams3.height = this.f32641x0;
            rVar.setLayoutParams(layoutParams3);
            nm0 nm0Var = this.O;
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) nm0Var.getLayoutParams();
            layoutParams4.topMargin = currentActionBarHeight;
            nm0Var.setLayoutParams(layoutParams4);
            if (this.V && b0()) {
                i10 = this.f32639w0 - r1Var.getPaddingTop();
            } else {
                i10 = this.f32639w0;
            }
            int dp4 = AndroidUtilities.dp(16.0f) + i10;
            ig.s0 s0Var = this.M;
            s0Var.P(dp4);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.G.getView().getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.height = AndroidUtilities.dp(10.0f) + this.f32641x0;
                this.G.getView().setLayoutParams(layoutParams5);
            }
            pl plVar = this.f32642y;
            if (plVar != null && (layoutParams = (FrameLayout.LayoutParams) plVar.getLayoutParams()) != null) {
                layoutParams.height = AndroidUtilities.dp(10.0f) + this.f32641x0;
                plVar.setLayoutParams(layoutParams);
            }
            s0Var.l();
            h0();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23540n5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23300a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23319b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Oh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Sh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23573oi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23627ri));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23358d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23449i6));
    }

    public final boolean b0() {
        int i10 = this.f32637v0;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final void c0() {
        sl slVar;
        ti tiVar = this.f30254b;
        if (tiVar.O) {
            if (tiVar.D2 != null) {
                AndroidUtilities.runOnUIThread(new bl(this, 0));
                return;
            } else if (!this.V) {
                File file = tiVar.C2;
                boolean z10 = tiVar.B2;
                if (file != null) {
                    if (z10) {
                        try {
                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                            String extractMetadata = mediaMetadataRetriever.extractMetadata(23);
                            if (extractMetadata != null) {
                                Matcher matcher = Pattern.compile("([+\\-][0-9.]+)([+\\-][0-9.]+)").matcher(extractMetadata);
                                if (matcher.find() && matcher.groupCount() == 2) {
                                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.y7(this, Double.parseDouble(matcher.group(1)), Double.parseDouble(matcher.group(2)), 2));
                                    return;
                                }
                            }
                        } catch (NumberFormatException | Exception unused) {
                        }
                    } else {
                        slVar = this;
                        ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                        float[] fArr = new float[2];
                        if (exifInterface.getLatLong(fArr)) {
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.kp(26, this, fArr));
                            return;
                        }
                        Location lastLocation = getLastLocation();
                        slVar.f32627n0 = lastLocation;
                        d0(lastLocation);
                        return;
                    }
                }
                slVar = this;
                Location lastLocation2 = getLastLocation();
                slVar.f32627n0 = lastLocation2;
                d0(lastLocation2);
                return;
            } else {
                AndroidUtilities.runOnUIThread(new bl(this, 7));
                return;
            }
        }
        Location lastLocation3 = getLastLocation();
        this.f32627n0 = lastLocation3;
        d0(lastLocation3);
    }

    public final void d0(Location location) {
        if (location != null) {
            Location location2 = new Location(location);
            this.f32627n0 = location2;
            IMapsProvider.IMap iMap = this.F;
            ig.s0 s0Var = this.M;
            if (iMap != null) {
                IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
                if (s0Var != null) {
                    if (!this.f32634s0 && this.f32637v0 != 8) {
                        s0Var.H(null, this.f32627n0, true);
                    }
                    s0Var.M(this.f32627n0);
                }
                if (!this.f32632r0) {
                    this.f32628o0 = new Location(location);
                    if (this.f32635t0) {
                        this.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                        return;
                    }
                    this.f32635t0 = true;
                    this.F.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.F.getMaxZoomLevel() - 4.0f));
                    return;
                }
                return;
            }
            s0Var.M(location2);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        boolean z11;
        int i12 = NotificationCenter.locationPermissionGranted;
        ll llVar = this.P;
        ig.s0 s0Var = this.M;
        int i13 = 0;
        if (i10 == i12) {
            this.V = false;
            this.U = false;
            c0();
            if (s0Var != null) {
                s0Var.O(this.V, this.U);
            }
            if (llVar != null && llVar.M != (z11 = this.V)) {
                llVar.M = z11;
            }
            IMapsProvider.IMap iMap = this.F;
            if (iMap != null) {
                try {
                    iMap.setMyLocationEnabled(true);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } else if (i10 == NotificationCenter.locationPermissionDenied) {
            this.V = true;
            this.U = false;
            if (s0Var != null) {
                s0Var.O(true, false);
            }
            if (llVar != null && llVar.M != (z10 = this.V)) {
                llVar.M = z10;
            }
        }
        a0();
        boolean z12 = this.V;
        ti tiVar = this.f30254b;
        if (z12 && !tiVar.O) {
            i13 = 8;
        } else {
            tiVar.getClass();
        }
        this.f32640x.setVisibility(i13);
    }

    public final void e0(double d, double d10) {
        IMapsProvider.ICameraUpdate newCameraUpdateLatLngZoom;
        if (this.F != null) {
            int i10 = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
            if (i10 != 0 && d10 != 0.0d) {
                Location location = new Location("");
                this.f32628o0 = location;
                location.reset();
                this.f32628o0.setLatitude(d);
                this.f32628o0.setLongitude(d10);
            } else {
                Location location2 = new Location("");
                this.f32627n0 = location2;
                location2.reset();
                this.f32627n0.setLatitude(d);
                this.f32627n0.setLongitude(d10);
            }
            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(d, d10);
            if (i10 != 0 && d10 != 0.0d) {
                newCameraUpdateLatLngZoom = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.F.getMaxZoomLevel() - 4.0f);
            } else {
                newCameraUpdateLatLngZoom = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.F.getMinZoomLevel());
            }
            this.H = newCameraUpdateLatLngZoom;
            this.F.moveCamera(newCameraUpdateLatLngZoom);
            ig.s0 s0Var = this.M;
            if (i10 != 0 && d10 != 0.0d) {
                s0Var.L(this.f32628o0);
            } else {
                s0Var.M(this.f32627n0);
            }
            s0Var.I();
            this.N.w0(0, 1, null);
            this.f32630q0 = true;
            if (i10 != 0 && d10 != 0.0d) {
                this.f32632r0 = true;
                g0(false);
                if (this.f32637v0 != 8) {
                    s0Var.H(null, this.f32628o0, true);
                }
                this.f32634s0 = true;
                f0();
            }
        }
    }

    public final void f0() {
        if (this.M.h() != 0 && this.R.L0() == 0) {
            bi.r1 r1Var = this.N;
            View childAt = r1Var.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top >= 0 && top <= AndroidUtilities.dp(258.0f)) {
                r1Var.w0(0, top, null);
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
        ql qlVar = this.f32633s;
        if (z10 && qlVar != null && qlVar.getTag() == null && ((location = this.f32627n0) == null || (location2 = this.f32628o0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        if (this.f32637v0 == 8) {
            z10 = false;
        }
        if (qlVar != null) {
            if (!z10 || qlVar.getTag() == null) {
                if (z10 || qlVar.getTag() != null) {
                    if (z10) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    qlVar.setVisibility(i10);
                    if (z10) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    qlVar.setTag(num);
                    AnimatorSet animatorSet = new AnimatorSet();
                    if (z10) {
                        f7 = 0.0f;
                    } else {
                        f7 = -AndroidUtilities.dp(80.0f);
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(qlVar, View.TRANSLATION_X, f7));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(ds.f27531g);
                    animatorSet.start();
                }
            }
        }
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(56.0f);
    }

    @Override
    public int getCurrentItemTop() {
        bi.r1 r1Var = this.N;
        if (r1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        wl0 wl0Var = (wl0) r1Var.K(0);
        if (wl0Var != null) {
            i10 = Math.max(((int) wl0Var.f47773a.getY()) - this.f32644z0, 0);
        }
        return AndroidUtilities.dp(56.0f) + i10;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.N.getPaddingTop();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.h7> getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList<org.telegram.ui.ActionBar.h7> arrayList = new ArrayList<>();
        b7 b7Var = new b7(this, 1);
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.L, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23428h5));
        int i10 = org.telegram.ui.ActionBar.y6.A5;
        bi.r1 r1Var = this.N;
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i10));
        org.telegram.ui.ActionBar.w0 w0Var = this.f32640x;
        if (w0Var != null) {
            editTextBoldCursor = w0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(editTextBoldCursor, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23465j5));
        int i11 = org.telegram.ui.ActionBar.y6.f23724wi;
        ImageView imageView = this.f32626n;
        arrayList.add(new org.telegram.ui.ActionBar.h7(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        int i12 = org.telegram.ui.ActionBar.y6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.h7(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        int i13 = org.telegram.ui.ActionBar.y6.f23686ui;
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f32631r;
        arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, b7Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(w0Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f32633s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f32633s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23647si));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23666ti));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 393216, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23553ni));
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 393216, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23608qi));
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 393248, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23533mi));
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 393248, new Class[]{org.telegram.ui.Cells.x6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23591pi));
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 196608, new Class[]{org.telegram.ui.Cells.z4.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 0, new Class[]{org.telegram.ui.Cells.a5.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23429h6));
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 8, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.W5));
        arrayList.add(new org.telegram.ui.ActionBar.h7(r1Var, 0, new Class[]{org.telegram.ui.Cells.b5.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.X5));
        return arrayList;
    }

    public final void h0() {
        bh.r rVar;
        int i10;
        int i11;
        IMapsProvider.LatLng latLng;
        Location location;
        IMapsProvider.IMap iMap;
        if (this.G != null && (rVar = this.L) != null) {
            bi.r1 r1Var = this.N;
            s4.e1 K = r1Var.K(0);
            if (K != null) {
                i10 = (int) K.f47773a.getY();
                i11 = Math.min(i10, 0) + this.f32639w0;
            } else {
                i10 = -rVar.getMeasuredHeight();
                i11 = 0;
            }
            if (((FrameLayout.LayoutParams) rVar.getLayoutParams()) != null) {
                pl plVar = this.f32642y;
                if (i11 <= 0) {
                    if (this.G.getView().getVisibility() == 0) {
                        this.G.getView().setVisibility(4);
                        rVar.setVisibility(4);
                        if (plVar != null) {
                            plVar.setVisibility(4);
                        }
                    }
                    this.G.getView().setTranslationY(i10);
                    return;
                }
                if (this.G.getView().getVisibility() == 4) {
                    this.G.getView().setVisibility(0);
                    rVar.setVisibility(0);
                    if (plVar != null) {
                        plVar.setVisibility(0);
                    }
                }
                int max = Math.max(0, (-((i10 - this.f32641x0) + this.f32639w0)) / 2);
                int i12 = this.f32641x0 - this.f32639w0;
                float max2 = 1.0f - Math.max(0.0f, Math.min(1.0f, (r1Var.getPaddingTop() - i10) / (r1Var.getPaddingTop() - i12)));
                int i13 = this.f32643y0;
                if (this.V && b0()) {
                    i12 += Math.min(i10, r1Var.getPaddingTop());
                }
                this.f32643y0 = (int) (i12 * max2);
                float f7 = max;
                this.G.getView().setTranslationY(f7);
                this.f32644z0 = i12 - this.f32643y0;
                rVar.invalidate();
                rVar.setTranslationY(i10 - this.f32644z0);
                IMapsProvider.IMap iMap2 = this.F;
                if (iMap2 != null) {
                    iMap2.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f) + this.f32643y0);
                }
                if (plVar != null) {
                    plVar.setTranslationY(f7);
                }
                int max3 = Math.max(this.f32644z0 - i10, 0);
                int i14 = this.f32641x0;
                org.telegram.ui.ActionBar.w0 w0Var = this.f32631r;
                float g7 = org.telegram.ui.d3.g(80.0f, i14 - w0Var.getMeasuredHeight(), max3);
                w0Var.setTranslationY(g7);
                ql qlVar = this.f32633s;
                qlVar.f31932c = g7;
                qlVar.setTranslationY(g7 + qlVar.f31931b);
                this.f32626n.setTranslationY(-this.f32643y0);
                int w10 = org.telegram.ui.d3.w(48.0f, (this.f32641x0 - this.f32643y0) / 2, max);
                this.f32629p0 = w10;
                this.Q.setTranslationY(w10);
                if (i13 != this.f32643y0) {
                    IMapsProvider.IMarker iMarker = this.f32618e0;
                    if (iMarker != null) {
                        latLng = new IMapsProvider.LatLng(iMarker.getPosition().latitude, this.f32618e0.getPosition().longitude);
                    } else if (this.f32632r0 && (location = this.f32628o0) != null) {
                        latLng = new IMapsProvider.LatLng(location.getLatitude(), this.f32628o0.getLongitude());
                    } else {
                        Location location2 = this.f32627n0;
                        if (location2 != null) {
                            latLng = new IMapsProvider.LatLng(location2.getLatitude(), this.f32627n0.getLongitude());
                        } else {
                            latLng = null;
                        }
                    }
                    if (latLng != null && (iMap = this.F) != null) {
                        iMap.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                    }
                }
                if (this.V && b0()) {
                    int h = this.M.h();
                    for (int i15 = 1; i15 < h; i15++) {
                        s4.e1 K2 = r1Var.K(i15);
                        if (K2 != null) {
                            K2.f47773a.setTranslationY(r1Var.getPaddingTop() - i10);
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
        boolean z10 = this.f32622i0;
        LinearLayout linearLayout = this.v;
        if (z10) {
            boolean z11 = this.f32624k0;
            nm0 nm0Var = this.O;
            if (z11) {
                nm0Var.setEmptyView(null);
                linearLayout.setVisibility(8);
                return;
            }
            nm0Var.setEmptyView(linearLayout);
            return;
        }
        linearLayout.setVisibility(8);
    }

    @Override
    public final void o() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionDenied);
        this.E = true;
        bh.r rVar = this.L;
        if (rVar != null) {
            rVar.invalidate();
        }
        try {
            IMapsProvider.IMap iMap = this.F;
            if (iMap != null) {
                iMap.setMyLocationEnabled(false);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView != null) {
            iMapView.getView().setTranslationY((-AndroidUtilities.displaySize.y) * 3);
        }
        try {
            IMapsProvider.IMapView iMapView2 = this.G;
            if (iMapView2 != null) {
                iMapView2.onPause();
            }
        } catch (Exception unused) {
        }
        try {
            IMapsProvider.IMapView iMapView3 = this.G;
            if (iMapView3 != null) {
                iMapView3.onDestroy();
                this.G = null;
            }
        } catch (Exception unused2) {
        }
        ig.s0 s0Var = this.M;
        if (s0Var != null) {
            s0Var.F();
        }
        ll llVar = this.P;
        if (llVar != null) {
            llVar.F();
        }
        ti tiVar = this.f30254b;
        tiVar.f32974a1.g(true);
        tiVar.f32974a1.l().removeView(this.f32640x);
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

    public void setDelegate(nl nlVar) {
        this.f32636u0 = nlVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30254b.getSheetContainer().invalidate();
        h0();
    }

    @Override
    public final void t() {
        this.f32640x.setVisibility(8);
    }

    @Override
    public final void updateColors() {
        try {
            Y();
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.f32640x;
        if (w0Var != null) {
            try {
                if (w0Var.getSearchField() != null) {
                    w0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23465j5, this.f30253a));
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    @Override
    public final void x() {
        boolean z10;
        ti tiVar = this.f30254b;
        if (tiVar != null && !tiVar.isKeyboardVisible()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.M.f14232c0 = z10;
    }

    @Override
    public final void y(int i10, boolean z10) {
        if (z10) {
            this.M.f14232c0 = false;
        }
    }
}
