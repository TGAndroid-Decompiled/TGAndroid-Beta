package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
public final class cl extends ei implements NotificationCenter.NotificationCenterDelegate {
    public static final int B0 = 0;
    public final Bitmap[] A0;
    public final org.telegram.ui.ActionBar.w0 B;
    public final zk C;
    public boolean D;
    public IMapsProvider.IMap E;
    public IMapsProvider.IMapView F;
    public IMapsProvider.ICameraUpdate G;
    public float H;
    public boolean I;
    public final View J;
    public final eg.s2 K;
    public final uf.h0 L;
    public final mh.d1 M;
    public final tl0 N;
    public final vk O;
    public final ImageView P;
    public final gj Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final long W;
    public final Paint f25996a0;
    public final ArrayList f25997b0;
    public AnimatorSet f25998c0;
    public IMapsProvider.IMarker f25999d0;
    public bl f26000e0;
    public FrameLayout f26001f0;
    public boolean f26002g0;
    public boolean f26003h0;
    public boolean f26004i0;
    public boolean f26005j0;
    public boolean f26006k0;
    public boolean f26007l0;
    public boolean m0;
    public final ImageView f26008n;
    public Location f26009n0;
    public Location f26010o0;
    public int f26011p0;
    public boolean f26012q0;
    public final org.telegram.ui.ActionBar.w0 f26013r;
    public boolean f26014r0;
    public final al f26015s;
    public boolean f26016s0;
    public boolean f26017t0;
    public wk f26018u0;
    public final LinearLayout v;
    public final int f26019v0;
    public final ImageView f26020w;
    public int f26021w0;
    public final TextView f26022x;
    public int f26023x0;
    public final TextView f26024y;
    public int f26025y0;
    public int f26026z0;

    public cl(mi miVar, Context context, final org.telegram.ui.ActionBar.g6 g6Var, boolean z4) {
        super(context, g6Var, miVar);
        final org.telegram.ui.xn xnVar;
        boolean z10;
        int i10;
        boolean z11;
        this.S = true;
        this.T = false;
        this.U = false;
        this.V = true;
        this.f25996a0 = new Paint();
        this.f25997b0 = new ArrayList();
        this.f26002g0 = true;
        this.f26003h0 = true;
        int currentActionBarHeight = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.f26021w0 = currentActionBarHeight;
        this.f26023x0 = currentActionBarHeight;
        this.A0 = new Bitmap[7];
        AndroidUtilities.fixGoogleMapsBug();
        mi miVar2 = this.f26546b;
        org.telegram.ui.ActionBar.p2 p2Var = miVar2.f29040c0;
        if (p2Var instanceof org.telegram.ui.xn) {
            xnVar = (org.telegram.ui.xn) p2Var;
        } else {
            xnVar = null;
        }
        long n12 = miVar2.n1();
        this.W = n12;
        if (this.f26546b.L) {
            this.f26019v0 = 7;
        } else if (z4 && xnVar != null && xnVar.h == null && !xnVar.c() && !UserObject.isUserSelf(xnVar.i())) {
            this.f26019v0 = 1;
        } else {
            this.f26019v0 = 0;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        this.f26005j0 = false;
        this.f26004i0 = false;
        this.f26006k0 = false;
        uf.h0 h0Var = this.L;
        if (h0Var != null) {
            h0Var.F();
        }
        vk vkVar = this.O;
        if (vkVar != null) {
            vkVar.F();
        }
        if (Build.VERSION.SDK_INT >= 23 && getParentActivity() != null && getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.U = z10;
        org.telegram.ui.ActionBar.z n10 = this.f26546b.U0.n();
        this.C = new zk(this, context);
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.E = new org.telegram.ui.fb(this, 5);
        this.B = a2;
        if (this.U && !this.f26546b.L) {
            i10 = 8;
        } else {
            this.f26546b.getClass();
            i10 = 0;
        }
        a2.setVisibility(i10);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i11 = org.telegram.ui.ActionBar.k6.f21766j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.k6.v0(i11, this.f26545a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.k6.v0(i11, this.f26545a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Vd, this.f26545a));
        new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f)).gravity = 83;
        eg.s2 s2Var = new eg.s2(this, context, 15);
        this.K = s2Var;
        s2Var.setWillNotDraw(false);
        View view = new View(context);
        this.J = view;
        view.setBackgroundDrawable(new ef.f(org.telegram.ui.ActionBar.k6.A0().q()));
        al alVar = new al(context, 0);
        this.f26015s = alVar;
        alVar.setTranslationX(-AndroidUtilities.dp(80.0f));
        alVar.setVisibility(4);
        int dp = AndroidUtilities.dp(40.0f);
        int i12 = org.telegram.ui.ActionBar.k6.wi;
        int v02 = org.telegram.ui.ActionBar.k6.v0(i12, this.f26545a);
        int i13 = org.telegram.ui.ActionBar.k6.xi;
        int v03 = org.telegram.ui.ActionBar.k6.v0(i13, this.f26545a);
        org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, v02, v03, v03);
        k7.e6.a(alVar);
        alVar.setTranslationZ(AndroidUtilities.dp(2.0f));
        hg.j1 j1Var = lf.q0.f12504a;
        alVar.setOutlineProvider(j1Var);
        alVar.setBackground(i02);
        int i14 = org.telegram.ui.ActionBar.k6.vi;
        alVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(i14, this.f26545a));
        alVar.setTextSize(1, 14.0f);
        alVar.setTypeface(AndroidUtilities.bold());
        alVar.setText(LocaleController.getString(R.string.PlacesInThisArea));
        alVar.setGravity(17);
        alVar.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        s2Var.addView(alVar, k7.c6.d(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
        alVar.setOnClickListener(new View.OnClickListener(this) {
            public final cl f29533b;

            {
                this.f29533b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        cl.Q(this.f29533b);
                        return;
                    case 1:
                        cl clVar = this.f29533b;
                        clVar.d0(false);
                        clVar.L.H(null, clVar.f26010o0, true);
                        clVar.f26016s0 = true;
                        clVar.c0();
                        return;
                    default:
                        this.f29533b.f26013r.M(null, null);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.ui, this.f26545a), false, g6Var);
        this.f26013r = w0Var;
        w0Var.setClickable(true);
        w0Var.setSubMenuOpenSide(2);
        w0Var.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        w0Var.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        w0Var.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), g6Var);
        w0Var.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), g6Var);
        w0Var.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), g6Var);
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.k6.h0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.k6.v0(i12, this.f26545a), org.telegram.ui.ActionBar.k6.v0(i13, this.f26545a));
        k7.e6.a(w0Var);
        w0Var.setTranslationZ(AndroidUtilities.dp(2.0f));
        w0Var.setOutlineProvider(j1Var);
        w0Var.setBackground(h02);
        w0Var.setIcon(R.drawable.msg_map_type);
        s2Var.addView(w0Var, k7.c6.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        w0Var.setOnClickListener(new View.OnClickListener(this) {
            public final cl f29533b;

            {
                this.f29533b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        cl.Q(this.f29533b);
                        return;
                    case 1:
                        cl clVar = this.f29533b;
                        clVar.d0(false);
                        clVar.L.H(null, clVar.f26010o0, true);
                        clVar.f26016s0 = true;
                        clVar.c0();
                        return;
                    default:
                        this.f29533b.f26013r.M(null, null);
                        return;
                }
            }
        });
        w0Var.setDelegate(new mk(this, 0));
        ImageView imageView = new ImageView(context);
        this.f26008n = imageView;
        org.telegram.ui.Cells.z h03 = org.telegram.ui.ActionBar.k6.h0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.k6.v0(i12, this.f26545a), org.telegram.ui.ActionBar.k6.v0(i13, this.f26545a));
        k7.e6.a(imageView);
        imageView.setTranslationZ(AndroidUtilities.dp(2.0f));
        imageView.setOutlineProvider(j1Var);
        imageView.setBackground(h03);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int v04 = org.telegram.ui.ActionBar.k6.v0(i14, this.f26545a);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v04, mode));
        imageView.setTag(Integer.valueOf(i14));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        s2Var.addView(imageView, k7.c6.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final cl f29533b;

            {
                this.f29533b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        cl.Q(this.f29533b);
                        return;
                    case 1:
                        cl clVar = this.f29533b;
                        clVar.d0(false);
                        clVar.L.H(null, clVar.f26010o0, true);
                        clVar.f26016s0 = true;
                        clVar.c0();
                        return;
                    default:
                        this.f29533b.f26013r.M(null, null);
                        return;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(160.0f), 0, 0);
        linearLayout.setVisibility(8);
        addView(linearLayout, k7.c6.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new org.telegram.ui.ActionBar.s2(14));
        ImageView imageView2 = new ImageView(context);
        this.f26020w = imageView2;
        imageView2.setImageResource(R.drawable.location_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.W5, this.f26545a), mode));
        linearLayout.addView(imageView2, k7.c6.n(-2, -2));
        TextView textView = new TextView(context);
        this.f26022x = textView;
        int i15 = org.telegram.ui.ActionBar.k6.X5;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i15, this.f26545a));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 17.0f);
        textView.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView i16 = org.telegram.ui.yh.i(linearLayout, textView, k7.c6.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.f26024y = i16;
        i16.setTextColor(org.telegram.ui.ActionBar.k6.v0(i15, this.f26545a));
        i16.setGravity(17);
        i16.setTextSize(1, 15.0f);
        i16.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(i16, k7.c6.t(-2, -2, 17, 0, 6, 0, 0));
        mh.d1 d1Var = new mh.d1(this, context, g6Var, 11);
        this.M = d1Var;
        this.f26547c = d1Var;
        this.d = d1Var;
        this.f26549f = true;
        d1Var.setClipToPadding(false);
        uf.h0 h0Var2 = new uf.h0(context, this.f26019v0, n12, true, g6Var, this.f26546b.L, false, false);
        this.L = h0Var2;
        d1Var.setAdapter(h0Var2);
        mi miVar3 = this.f26546b;
        if (miVar3 != null && (miVar3.E || miVar3.M)) {
            z11 = true;
        } else {
            z11 = false;
        }
        h0Var2.f48583c0 = z11;
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(pr.h);
        lVar.C = false;
        lVar.f5910m = false;
        d1Var.setItemAnimator(lVar);
        h0Var2.O(this.U, this.T);
        d1Var.setVerticalScrollBarEnabled(false);
        d1Var.p1();
        gj gjVar = new gj(this, d1Var);
        this.Q = gjVar;
        d1Var.setLayoutManager(gjVar);
        addView(d1Var, k7.c6.e(-1, -1, 51));
        d1Var.setOnScrollListener(new uk(this));
        d1Var.setOnItemClickListener(new jl0(this) {
            public final cl f29790b;

            {
                this.f29790b = this;
            }

            @Override
            public final void f(int i17, View view2) {
                switch (r4) {
                    case 0:
                        cl.N(this.f29790b, xnVar, g6Var, i17);
                        return;
                    default:
                        cl.O(this.f29790b, xnVar, g6Var, i17);
                        return;
                }
            }
        });
        mk mkVar = new mk(this, 1);
        h0Var2.E = n12;
        h0Var2.f48515y = mkVar;
        h0Var2.P(AndroidUtilities.dp(16.0f) + this.f26021w0);
        addView(s2Var, k7.c6.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.F = onCreateMapView;
        onCreateMapView.setOnDispatchTouchEventInterceptor(new mk(this, 2));
        this.F.setOnInterceptTouchEventInterceptor(new mk(this, 3));
        new Thread(new qk(this, this.F, 1)).start();
        ImageView imageView3 = new ImageView(context);
        this.P = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        s2Var.addView(imageView3, k7.c6.e(28, 48, 49));
        tl0 tl0Var = new tl0(context, g6Var);
        this.N = tl0Var;
        tl0Var.setSections(true);
        tl0Var.setClipToPadding(false);
        tl0Var.setVisibility(8);
        tl0Var.setLayoutManager(new f2.j0(1, false));
        vk vkVar2 = new vk(this, context, g6Var, this.f26546b.L);
        this.O = vkVar2;
        boolean z12 = this.U;
        if (vkVar2.J != z12) {
            vkVar2.J = z12;
        }
        mk mkVar2 = new mk(this, 7);
        vkVar2.E = 0L;
        vkVar2.f48515y = mkVar2;
        tl0Var.setItemAnimator(null);
        addView(tl0Var, k7.c6.e(-1, -1, 51));
        tl0Var.setOnScrollListener(new fg.e2(this, 22));
        tl0Var.setOnItemClickListener(new jl0(this) {
            public final cl f29790b;

            {
                this.f29790b = this;
            }

            @Override
            public final void f(int i17, View view2) {
                switch (r4) {
                    case 0:
                        cl.N(this.f29790b, xnVar, g6Var, i17);
                        return;
                    default:
                        cl.O(this.f29790b, xnVar, g6Var, i17);
                        return;
                }
            }
        });
        f0();
    }

    public static void J(cl clVar, IMapsProvider.IMap iMap) {
        PackageManager packageManager;
        clVar.E = iMap;
        iMap.setOnMapLoadedCallback(new lk(clVar, 3));
        if (org.telegram.ui.ActionBar.k6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21659d6, clVar.f26545a)) < 0.721f) {
            clVar.R = true;
            clVar.E.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
        }
        if (clVar.E != null) {
            Location location = new Location("network");
            clVar.f26010o0 = location;
            location.setLatitude(20.659322d);
            clVar.f26010o0.setLongitude(-11.40625d);
            try {
                clVar.E.setMyLocationEnabled(true);
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            clVar.E.getUiSettings().setMyLocationButtonEnabled(false);
            clVar.E.getUiSettings().setZoomControlsEnabled(false);
            clVar.E.getUiSettings().setCompassEnabled(false);
            clVar.E.setOnCameraMoveStartedListener(new mk(clVar, 4));
            clVar.E.setOnCameraIdleListener(new lk(clVar, 5));
            clVar.E.setOnMyLocationChangeListener(new sk(clVar, 1));
            clVar.E.setOnMarkerClickListener(new mk(clVar, 5));
            clVar.E.setOnCameraMoveListener(new lk(clVar, 6));
            clVar.Z();
            AndroidUtilities.runOnUIThread(new lk(clVar, 7), 200L);
            if (clVar.S && clVar.getParentActivity() != null) {
                clVar.S = false;
                Activity parentActivity = clVar.getParentActivity();
                if (parentActivity == null || (packageManager = parentActivity.getPackageManager()) == null || packageManager.hasSystemFeature("android.hardware.location.gps")) {
                    try {
                        if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(clVar.getParentActivity(), 0, clVar.f26545a);
                            alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.L5, clVar.f26545a), null);
                            alertDialog$Builder.f21166a.Q = LocaleController.getString(R.string.GpsDisabledAlertText);
                            alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new mk(clVar, 6));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                        }
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                } else {
                    return;
                }
            }
            clVar.e0();
        }
    }

    public static void K(cl clVar, org.telegram.ui.xn xnVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.g6 g6Var, Long l10) {
        if (xnVar != null && xnVar.c()) {
            z4.M(clVar.getParentActivity(), xnVar.a(), new androidx.car.app.utils.a(clVar, tL_messageMediaGeo, l10, 20), g6Var);
            return;
        }
        clVar.f26018u0.d(tL_messageMediaGeo, clVar.f26019v0, true, 0, l10.longValue());
        clVar.f26546b.dismiss(true);
    }

    public static void M(cl clVar) {
        int i10;
        Activity parentActivity;
        uf.h0 h0Var = clVar.L;
        mi miVar = clVar.f26546b;
        if (clVar.f26002g0 && (i10 = Build.VERSION.SDK_INT) >= 23 && (parentActivity = clVar.getParentActivity()) != null) {
            clVar.f26002g0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                String[] strArr = (!miVar.L || miVar.f29096t2 == null || i10 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
                clVar.T = true;
                if (h0Var != null) {
                    h0Var.O(clVar.U, true);
                }
                parentActivity.requestPermissions(strArr, 2);
            } else if (i10 >= 29 && miVar.L && miVar.f29096t2 != null && parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") != 0) {
                clVar.T = true;
                if (h0Var != null) {
                    h0Var.O(clVar.U, true);
                }
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
            }
        }
    }

    public static void N(cl clVar, org.telegram.ui.xn xnVar, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        cl clVar2;
        org.telegram.ui.xn xnVar2;
        org.telegram.ui.ActionBar.g6 g6Var2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j10 = clVar.W;
        uf.h0 h0Var = clVar.L;
        mi miVar = clVar.f26546b;
        int i11 = clVar.f26019v0;
        if (i11 == 7) {
            if (i10 == 1 && (tL_messageMediaVenue2 = h0Var.f48581a0) != null) {
                clVar.f26018u0.d(tL_messageMediaVenue2, i11, true, 0, 0L);
                miVar.dismiss(true);
                return;
            } else if (i10 == 2 && (tL_messageMediaVenue = h0Var.f48582b0) != null) {
                clVar.f26018u0.d(tL_messageMediaVenue, i11, true, 0, 0L);
                miVar.dismiss(true);
                return;
            } else {
                clVar2 = clVar;
                xnVar2 = xnVar;
                g6Var2 = g6Var;
            }
        } else if (i10 == 1) {
            if (clVar.f26018u0 != null && clVar.f26010o0 != null) {
                FrameLayout frameLayout = clVar.f26001f0;
                if (frameLayout != null) {
                    frameLayout.callOnClick();
                    return;
                }
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(clVar.f26010o0.getLatitude());
                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(clVar.f26010o0.getLongitude());
                z4.a0(miVar.G1, miVar.j1() + 1, miVar.n1(), new hg.c1(clVar, xnVar, tL_messageMediaGeo, g6Var, 7));
                return;
            } else if (clVar.U) {
                z4.D(clVar.getParentActivity()).show();
                return;
            } else {
                return;
            }
        } else {
            clVar2 = clVar;
            xnVar2 = xnVar;
            g6Var2 = g6Var;
            if (i10 == 2 && i11 == 1) {
                if (clVar2.getLocationController().isSharingLocation(j10)) {
                    clVar2.getLocationController().removeSharingLocation(j10);
                    miVar.dismiss(true);
                    return;
                } else if (clVar2.f26009n0 == null && clVar2.U) {
                    z4.D(clVar2.getParentActivity()).show();
                    return;
                } else {
                    clVar2.Y();
                    return;
                }
            }
        }
        Object J = h0Var.J(i10);
        if (J instanceof TLRPC.TL_messageMediaVenue) {
            z4.a0(miVar.G1, miVar.j1() + 1, miVar.n1(), new hg.c1(clVar2, xnVar2, (TLRPC.TL_messageMediaVenue) J, g6Var2, 8));
        }
    }

    public static void O(cl clVar, org.telegram.ui.xn xnVar, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        TLRPC.TL_messageMediaVenue I = clVar.O.I(i10);
        if (I != null && clVar.f26018u0 != null) {
            if (xnVar != null && xnVar.c()) {
                z4.M(clVar.getParentActivity(), xnVar.a(), new rk(clVar, I, 0), g6Var);
                return;
            }
            clVar.f26018u0.d(I, clVar.f26019v0, true, 0, 0L);
            clVar.f26546b.dismiss(true);
        }
    }

    public static void P(cl clVar, org.telegram.ui.xn xnVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.g6 g6Var) {
        if (xnVar != null && xnVar.c()) {
            z4.M(clVar.getParentActivity(), xnVar.a(), new rk(clVar, tL_messageMediaVenue, 1), g6Var);
            return;
        }
        clVar.f26018u0.d(tL_messageMediaVenue, clVar.f26019v0, true, 0, 0L);
        clVar.f26546b.dismiss(true);
    }

    public static void Q(cl clVar) {
        Activity parentActivity;
        uf.h0 h0Var = clVar.L;
        ImageView imageView = clVar.f26008n;
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = clVar.getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z4.D(clVar.getParentActivity()).show();
            return;
        }
        if (clVar.f26009n0 != null && clVar.E != null) {
            int i10 = org.telegram.ui.ActionBar.k6.vi;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.v0(i10, clVar.f26545a), PorterDuff.Mode.MULTIPLY));
            imageView.setTag(Integer.valueOf(i10));
            h0Var.L(null);
            clVar.f26014r0 = false;
            clVar.d0(false);
            clVar.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(clVar.f26009n0.getLatitude(), clVar.f26009n0.getLongitude())));
            if (clVar.f26016s0) {
                Location location = clVar.f26009n0;
                if (location != null && clVar.f26019v0 != 8) {
                    h0Var.H(null, location, true);
                }
                clVar.f26016s0 = false;
                clVar.c0();
            }
        }
        if (clVar.f25999d0 != null) {
            clVar.P.setVisibility(0);
            zk zkVar = clVar.C;
            IMapsProvider.IMarker iMarker = clVar.f25999d0;
            HashMap hashMap = zkVar.f33906a;
            View view = (View) hashMap.get(iMarker);
            if (view != null) {
                zkVar.removeView(view);
                hashMap.remove(iMarker);
            }
            clVar.f25999d0 = null;
            clVar.f26000e0 = null;
            clVar.f26001f0 = null;
        }
    }

    public static void R(cl clVar, Location location) {
        int i10;
        mi miVar = clVar.f26546b;
        if (miVar != null && miVar.f29040c0 != null) {
            clVar.a0(location);
            uf.h0 h0Var = clVar.L;
            if (h0Var != null && (((i10 = clVar.f26019v0) == 7 || i10 == 8) && !clVar.f26014r0)) {
                h0Var.L(clVar.f26010o0);
            }
            clVar.getLocationController().setMapLocation(location, clVar.V);
            clVar.V = false;
        }
    }

    public static void S(cl clVar, IMapsProvider.IMapView iMapView) {
        if (clVar.F != null && clVar.getParentActivity() != null) {
            try {
                iMapView.onCreate(null);
                ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                clVar.F.getMapAsync(new sk(clVar, 0));
                clVar.f26007l0 = true;
                if (clVar.m0) {
                    clVar.F.onResume();
                }
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
    }

    public static void T(cl clVar) {
        if (clVar.getParentActivity() != null) {
            try {
                clVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
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
        return this.f26546b.f29040c0.getLocationController();
    }

    private MessagesController getMessagesController() {
        return this.f26546b.f29040c0.getMessagesController();
    }

    public Activity getParentActivity() {
        org.telegram.ui.ActionBar.p2 p2Var;
        mi miVar = this.f26546b;
        if (miVar != null && (p2Var = miVar.f29040c0) != null) {
            return p2Var.getParentActivity();
        }
        return null;
    }

    private UserConfig getUserConfig() {
        return this.f26546b.f29040c0.getUserConfig();
    }

    @Override
    public final void A() {
        IMapsProvider.IMapView iMapView = this.F;
        if (iMapView != null && this.f26007l0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.m0 = true;
    }

    @Override
    public final void D(ei eiVar) {
        long j10;
        mi miVar = this.f26546b;
        miVar.U0.setTitle(LocaleController.getString(R.string.ShareLocation));
        if (this.F.getView().getParent() == null) {
            View view = this.F.getView();
            FrameLayout.LayoutParams e6 = k7.c6.e(-1, AndroidUtilities.dp(10.0f) + this.f26021w0, 51);
            eg.s2 s2Var = this.K;
            s2Var.addView(view, 0, e6);
            s2Var.addView(this.C, 1, k7.c6.e(-1, AndroidUtilities.dp(10.0f) + this.f26021w0, 51));
            s2Var.addView(this.J, 2, k7.c6.c(-1.0f, -1));
        }
        this.B.setVisibility(0);
        IMapsProvider.IMapView iMapView = this.F;
        if (iMapView != null && this.f26007l0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.m0 = true;
        IMapsProvider.IMap iMap = this.E;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        W();
        boolean h02 = miVar.W1.h0();
        lk lkVar = new lk(this, 1);
        if (h02) {
            j10 = 200;
        } else {
            j10 = 0;
        }
        AndroidUtilities.runOnUIThread(lkVar, j10);
        this.Q.h1(0, 0);
        e0();
    }

    @Override
    public final void F() {
        this.M.x0(0);
    }

    @Override
    public final boolean I() {
        return !this.U;
    }

    public final Bitmap V(int i10) {
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
            paint.setColor(org.telegram.ui.Cells.u4.a(i10));
            canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), paint);
            canvas.setBitmap(null);
            bitmapArr[i10 % 7] = createBitmap;
            return createBitmap;
        } catch (Throwable th2) {
            FileLog.e(th2);
            return null;
        }
    }

    public final void W() {
        int i10;
        FrameLayout.LayoutParams layoutParams;
        if (getMeasuredHeight() != 0 && this.F != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            int i11 = AndroidUtilities.displaySize.y - currentActionBarHeight;
            int dp = AndroidUtilities.dp(66.0f);
            int i12 = this.f26019v0;
            if (i12 == 1 || i12 == 7 || i12 == 8) {
                dp += AndroidUtilities.dp(66.0f);
            }
            int dp2 = (i11 - dp) - AndroidUtilities.dp(90.0f);
            int dp3 = AndroidUtilities.dp(189.0f);
            this.f26021w0 = dp3;
            if (!this.U || !X()) {
                dp2 = Math.min(AndroidUtilities.dp(310.0f), dp2);
            }
            this.f26023x0 = Math.max(dp3, dp2);
            if (this.U && X()) {
                this.f26021w0 = this.f26023x0;
            }
            mh.d1 d1Var = this.M;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) d1Var.getLayoutParams();
            layoutParams2.topMargin = currentActionBarHeight;
            d1Var.setLayoutParams(layoutParams2);
            eg.s2 s2Var = this.K;
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) s2Var.getLayoutParams();
            layoutParams3.topMargin = currentActionBarHeight;
            layoutParams3.height = this.f26023x0;
            s2Var.setLayoutParams(layoutParams3);
            tl0 tl0Var = this.N;
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) tl0Var.getLayoutParams();
            layoutParams4.topMargin = currentActionBarHeight;
            tl0Var.setLayoutParams(layoutParams4);
            if (this.U && X()) {
                i10 = this.f26021w0 - d1Var.getPaddingTop();
            } else {
                i10 = this.f26021w0;
            }
            int dp4 = AndroidUtilities.dp(16.0f) + i10;
            uf.h0 h0Var = this.L;
            h0Var.P(dp4);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.F.getView().getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.height = AndroidUtilities.dp(10.0f) + this.f26023x0;
                this.F.getView().setLayoutParams(layoutParams5);
            }
            zk zkVar = this.C;
            if (zkVar != null && (layoutParams = (FrameLayout.LayoutParams) zkVar.getLayoutParams()) != null) {
                layoutParams.height = AndroidUtilities.dp(10.0f) + this.f26023x0;
                zkVar.setLayoutParams(layoutParams);
            }
            h0Var.l();
            e0();
        }
    }

    public final boolean X() {
        int i10 = this.f26019v0;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final void Y() {
        TLRPC.User user;
        Activity parentActivity;
        if (this.f26018u0 != null && getParentActivity() != null && this.f26009n0 != null) {
            boolean z4 = this.f26003h0;
            org.telegram.ui.ActionBar.g6 g6Var = this.f26545a;
            if (z4 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
                this.f26003h0 = false;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                    globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                    z4.l(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new lk(this, 2), g6Var).o();
                    return;
                }
            }
            long j10 = this.W;
            if (DialogObject.isUserDialog(j10)) {
                user = this.f26546b.f29040c0.getMessagesController().getUser(Long.valueOf(j10));
            } else {
                user = null;
            }
            z4.E(getParentActivity(), false, user, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i10) {
                    cl clVar = cl.this;
                    mi miVar = clVar.f26546b;
                    z4.a0(miVar.G1, miVar.j1() + 1, miVar.n1(), new org.telegram.ui.Cells.qa(clVar, i10, 1));
                }
            }, g6Var).show();
        }
    }

    public final void Z() {
        cl clVar;
        mi miVar = this.f26546b;
        if (miVar.L) {
            if (miVar.f29099u2 != null) {
                AndroidUtilities.runOnUIThread(new lk(this, 0));
                return;
            } else if (!this.U) {
                File file = miVar.f29096t2;
                boolean z4 = miVar.f29093s2;
                if (file != null) {
                    if (z4) {
                        try {
                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                            String extractMetadata = mediaMetadataRetriever.extractMetadata(23);
                            if (extractMetadata != null) {
                                Matcher matcher = Pattern.compile("([+\\-][0-9.]+)([+\\-][0-9.]+)").matcher(extractMetadata);
                                if (matcher.find() && matcher.groupCount() == 2) {
                                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.t7(this, Double.parseDouble(matcher.group(1)), Double.parseDouble(matcher.group(2)), 2));
                                    return;
                                }
                            }
                        } catch (NumberFormatException | Exception unused) {
                        }
                    } else {
                        clVar = this;
                        ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                        float[] fArr = new float[2];
                        if (exifInterface.getLatLong(fArr)) {
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.mp(27, this, fArr));
                            return;
                        }
                        Location lastLocation = getLastLocation();
                        clVar.f26009n0 = lastLocation;
                        a0(lastLocation);
                        return;
                    }
                }
                clVar = this;
                Location lastLocation2 = getLastLocation();
                clVar.f26009n0 = lastLocation2;
                a0(lastLocation2);
                return;
            } else {
                AndroidUtilities.runOnUIThread(new lk(this, 8));
                return;
            }
        }
        Location lastLocation3 = getLastLocation();
        this.f26009n0 = lastLocation3;
        a0(lastLocation3);
    }

    public final void a0(Location location) {
        if (location != null) {
            Location location2 = new Location(location);
            this.f26009n0 = location2;
            IMapsProvider.IMap iMap = this.E;
            uf.h0 h0Var = this.L;
            if (iMap != null) {
                IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
                if (h0Var != null) {
                    if (!this.f26016s0 && this.f26019v0 != 8) {
                        h0Var.H(null, this.f26009n0, true);
                    }
                    h0Var.M(this.f26009n0);
                }
                if (!this.f26014r0) {
                    this.f26010o0 = new Location(location);
                    if (this.f26017t0) {
                        this.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                        return;
                    }
                    this.f26017t0 = true;
                    this.E.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.E.getMaxZoomLevel() - 4.0f));
                    return;
                }
                return;
            }
            h0Var.M(location2);
        }
    }

    public final void b0(double d, double d10) {
        IMapsProvider.ICameraUpdate newCameraUpdateLatLngZoom;
        if (this.E != null) {
            int i10 = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
            if (i10 != 0 && d10 != 0.0d) {
                Location location = new Location("");
                this.f26010o0 = location;
                location.reset();
                this.f26010o0.setLatitude(d);
                this.f26010o0.setLongitude(d10);
            } else {
                Location location2 = new Location("");
                this.f26009n0 = location2;
                location2.reset();
                this.f26009n0.setLatitude(d);
                this.f26009n0.setLongitude(d10);
            }
            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(d, d10);
            if (i10 != 0 && d10 != 0.0d) {
                newCameraUpdateLatLngZoom = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.E.getMaxZoomLevel() - 4.0f);
            } else {
                newCameraUpdateLatLngZoom = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.E.getMinZoomLevel());
            }
            this.G = newCameraUpdateLatLngZoom;
            this.E.moveCamera(newCameraUpdateLatLngZoom);
            uf.h0 h0Var = this.L;
            if (i10 != 0 && d10 != 0.0d) {
                h0Var.L(this.f26010o0);
            } else {
                h0Var.M(this.f26009n0);
            }
            h0Var.I();
            this.M.v0(0, 1, null);
            this.f26012q0 = true;
            if (i10 != 0 && d10 != 0.0d) {
                this.f26014r0 = true;
                d0(false);
                if (this.f26019v0 != 8) {
                    h0Var.H(null, this.f26010o0, true);
                }
                this.f26016s0 = true;
                c0();
            }
        }
    }

    public final void c0() {
        if (this.L.h() != 0 && this.Q.L0() == 0) {
            mh.d1 d1Var = this.M;
            View childAt = d1Var.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top >= 0 && top <= AndroidUtilities.dp(258.0f)) {
                d1Var.v0(0, top, null);
            }
        }
    }

    public final void d0(boolean z4) {
        int i10;
        Integer num;
        float f10;
        Location location;
        Location location2;
        if (this.U) {
            z4 = false;
        }
        al alVar = this.f26015s;
        if (z4 && alVar != null && alVar.getTag() == null && ((location = this.f26009n0) == null || (location2 = this.f26010o0) == null || location2.distanceTo(location) < 300.0f)) {
            z4 = false;
        }
        if (this.f26019v0 == 8) {
            z4 = false;
        }
        if (alVar != null) {
            if (!z4 || alVar.getTag() == null) {
                if (z4 || alVar.getTag() != null) {
                    if (z4) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    alVar.setVisibility(i10);
                    if (z4) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    alVar.setTag(num);
                    AnimatorSet animatorSet = new AnimatorSet();
                    if (z4) {
                        f10 = 0.0f;
                    } else {
                        f10 = -AndroidUtilities.dp(80.0f);
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(alVar, View.TRANSLATION_X, f10));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(pr.f30184g);
                    animatorSet.start();
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z4;
        boolean z10;
        int i12 = NotificationCenter.locationPermissionGranted;
        vk vkVar = this.O;
        uf.h0 h0Var = this.L;
        int i13 = 0;
        if (i10 == i12) {
            this.U = false;
            this.T = false;
            Z();
            if (h0Var != null) {
                h0Var.O(this.U, this.T);
            }
            if (vkVar != null && vkVar.J != (z10 = this.U)) {
                vkVar.J = z10;
            }
            IMapsProvider.IMap iMap = this.E;
            if (iMap != null) {
                try {
                    iMap.setMyLocationEnabled(true);
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
        } else if (i10 == NotificationCenter.locationPermissionDenied) {
            this.U = true;
            this.T = false;
            if (h0Var != null) {
                h0Var.O(true, false);
            }
            if (vkVar != null && vkVar.J != (z4 = this.U)) {
                vkVar.J = z4;
            }
        }
        W();
        boolean z11 = this.U;
        mi miVar = this.f26546b;
        if (z11 && !miVar.L) {
            i13 = 8;
        } else {
            miVar.getClass();
        }
        this.B.setVisibility(i13);
    }

    public final void e0() {
        eg.s2 s2Var;
        int i10;
        int i11;
        IMapsProvider.LatLng latLng;
        Location location;
        IMapsProvider.IMap iMap;
        if (this.F != null && (s2Var = this.K) != null) {
            mh.d1 d1Var = this.M;
            f2.m1 K = d1Var.K(0);
            if (K != null) {
                i10 = (int) K.f5875a.getY();
                i11 = Math.min(i10, 0) + this.f26021w0;
            } else {
                i10 = -s2Var.getMeasuredHeight();
                i11 = 0;
            }
            if (((FrameLayout.LayoutParams) s2Var.getLayoutParams()) != null) {
                zk zkVar = this.C;
                if (i11 <= 0) {
                    if (this.F.getView().getVisibility() == 0) {
                        this.F.getView().setVisibility(4);
                        s2Var.setVisibility(4);
                        if (zkVar != null) {
                            zkVar.setVisibility(4);
                        }
                    }
                    this.F.getView().setTranslationY(i10);
                    return;
                }
                if (this.F.getView().getVisibility() == 4) {
                    this.F.getView().setVisibility(0);
                    s2Var.setVisibility(0);
                    if (zkVar != null) {
                        zkVar.setVisibility(0);
                    }
                }
                int max = Math.max(0, (-((i10 - this.f26023x0) + this.f26021w0)) / 2);
                int i12 = this.f26023x0 - this.f26021w0;
                float max2 = 1.0f - Math.max(0.0f, Math.min(1.0f, (d1Var.getPaddingTop() - i10) / (d1Var.getPaddingTop() - i12)));
                int i13 = this.f26025y0;
                if (this.U && X()) {
                    i12 += Math.min(i10, d1Var.getPaddingTop());
                }
                this.f26025y0 = (int) (i12 * max2);
                float f10 = max;
                this.F.getView().setTranslationY(f10);
                this.f26026z0 = i12 - this.f26025y0;
                s2Var.invalidate();
                s2Var.setTranslationY(i10 - this.f26026z0);
                IMapsProvider.IMap iMap2 = this.E;
                if (iMap2 != null) {
                    iMap2.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f) + this.f26025y0);
                }
                if (zkVar != null) {
                    zkVar.setTranslationY(f10);
                }
                int max3 = Math.max(this.f26026z0 - i10, 0);
                int i14 = this.f26023x0;
                org.telegram.ui.ActionBar.w0 w0Var = this.f26013r;
                float min = Math.min(max3, (i14 - w0Var.getMeasuredHeight()) - AndroidUtilities.dp(80.0f));
                w0Var.setTranslationY(min);
                al alVar = this.f26015s;
                alVar.f25284c = min;
                alVar.setTranslationY(min + alVar.f25283b);
                this.f26008n.setTranslationY(-this.f26025y0);
                int C = org.telegram.ui.b.C(48.0f, (this.f26023x0 - this.f26025y0) / 2, max);
                this.f26011p0 = C;
                this.P.setTranslationY(C);
                if (i13 != this.f26025y0) {
                    IMapsProvider.IMarker iMarker = this.f25999d0;
                    if (iMarker != null) {
                        latLng = new IMapsProvider.LatLng(iMarker.getPosition().latitude, this.f25999d0.getPosition().longitude);
                    } else if (this.f26014r0 && (location = this.f26010o0) != null) {
                        latLng = new IMapsProvider.LatLng(location.getLatitude(), this.f26010o0.getLongitude());
                    } else {
                        Location location2 = this.f26009n0;
                        if (location2 != null) {
                            latLng = new IMapsProvider.LatLng(location2.getLatitude(), this.f26009n0.getLongitude());
                        } else {
                            latLng = null;
                        }
                    }
                    if (latLng != null && (iMap = this.E) != null) {
                        iMap.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                    }
                }
                if (this.U && X()) {
                    int h = this.L.h();
                    for (int i15 = 1; i15 < h; i15++) {
                        f2.m1 K2 = d1Var.K(i15);
                        if (K2 != null) {
                            K2.f5875a.setTranslationY(d1Var.getPaddingTop() - i10);
                        }
                    }
                }
            }
        }
    }

    public final void f0() {
        boolean z4 = this.f26004i0;
        LinearLayout linearLayout = this.v;
        if (z4) {
            boolean z10 = this.f26006k0;
            tl0 tl0Var = this.N;
            if (z10) {
                tl0Var.setEmptyView(null);
                linearLayout.setVisibility(8);
                return;
            }
            tl0Var.setEmptyView(linearLayout);
            return;
        }
        linearLayout.setVisibility(8);
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(56.0f);
    }

    @Override
    public int getCurrentItemTop() {
        mh.d1 d1Var = this.M;
        if (d1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        fl0 fl0Var = (fl0) d1Var.K(0);
        if (fl0Var != null) {
            i10 = Math.max(((int) fl0Var.f5875a.getY()) - this.f26026z0, 0);
        }
        return AndroidUtilities.dp(56.0f) + i10;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.M.getPaddingTop();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.m6> getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList<org.telegram.ui.ActionBar.m6> arrayList = new ArrayList<>();
        t6 t6Var = new t6(this, 2);
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.K, 1, null, null, null, null, org.telegram.ui.ActionBar.k6.f21731h5));
        int i10 = org.telegram.ui.ActionBar.k6.A5;
        mh.d1 d1Var = this.M;
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 32768, null, null, null, null, i10));
        org.telegram.ui.ActionBar.w0 w0Var = this.B;
        if (w0Var != null) {
            editTextBoldCursor = w0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.m6(editTextBoldCursor, 16777216, null, null, null, null, org.telegram.ui.ActionBar.k6.f21766j5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.k6.f21750i6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.k6.f21779k0, null, null, org.telegram.ui.ActionBar.k6.f21660d7));
        int i11 = org.telegram.ui.ActionBar.k6.W5;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f26020w, 8, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f26022x, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f26024y, 4, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.k6.ui;
        ImageView imageView = this.f26008n;
        arrayList.add(new org.telegram.ui.ActionBar.m6(imageView, 262152, null, null, null, null, i13));
        int i14 = org.telegram.ui.ActionBar.k6.vi;
        arrayList.add(new org.telegram.ui.ActionBar.m6(imageView, 262152, null, null, null, null, i14));
        int i15 = org.telegram.ui.ActionBar.k6.wi;
        arrayList.add(new org.telegram.ui.ActionBar.m6(imageView, 32, null, null, null, null, i15));
        int i16 = org.telegram.ui.ActionBar.k6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.m6(imageView, 65568, null, null, null, null, i16));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f26013r;
        arrayList.add(new org.telegram.ui.ActionBar.m6(w0Var2, 0, null, null, null, t6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(w0Var2, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(w0Var2, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f26015s, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f26015s, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f26015s, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, org.telegram.ui.ActionBar.k6.f21906r0, t6Var, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.k6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.si));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 393216, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.ni));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 393216, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.qi));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 393248, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.mi));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 393248, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.pi));
        int i17 = org.telegram.ui.ActionBar.k6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"accurateTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 262144, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.ri));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 262144, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.oi));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"buttonTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 131072, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 196608, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21624b7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21605a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21838n5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.k6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
        tl0 tl0Var = this.N;
        arrayList.add(new org.telegram.ui.ActionBar.m6(tl0Var, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(tl0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.m6(tl0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.u7.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.u7.class}, new String[]{"distanceTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.k6.f21732h6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 8, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.m6(d1Var, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView2"}, null, null, -1, null, i12));
        return arrayList;
    }

    @Override
    public final int h() {
        return 1;
    }

    @Override
    public final void m() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionDenied);
        this.D = true;
        eg.s2 s2Var = this.K;
        if (s2Var != null) {
            s2Var.invalidate();
        }
        try {
            IMapsProvider.IMap iMap = this.E;
            if (iMap != null) {
                iMap.setMyLocationEnabled(false);
            }
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        IMapsProvider.IMapView iMapView = this.F;
        if (iMapView != null) {
            iMapView.getView().setTranslationY((-AndroidUtilities.displaySize.y) * 3);
        }
        try {
            IMapsProvider.IMapView iMapView2 = this.F;
            if (iMapView2 != null) {
                iMapView2.onPause();
            }
        } catch (Exception unused) {
        }
        try {
            IMapsProvider.IMapView iMapView3 = this.F;
            if (iMapView3 != null) {
                iMapView3.onDestroy();
                this.F = null;
            }
        } catch (Exception unused2) {
        }
        uf.h0 h0Var = this.L;
        if (h0Var != null) {
            h0Var.F();
        }
        vk vkVar = this.O;
        if (vkVar != null) {
            vkVar.F();
        }
        mi miVar = this.f26546b;
        miVar.U0.h(true);
        miVar.U0.n().removeView(this.B);
    }

    @Override
    public final boolean n() {
        m();
        return false;
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        if (z4) {
            W();
        }
    }

    @Override
    public final void r() {
        this.B.setVisibility(8);
    }

    public void setDelegate(wk wkVar) {
        this.f26018u0 = wkVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f26546b.getSheetContainer().invalidate();
        e0();
    }

    @Override
    public final void v() {
        boolean z4;
        mi miVar = this.f26546b;
        if (miVar != null && !miVar.isKeyboardVisible()) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.L.Z = z4;
    }

    @Override
    public final void w(int i10, boolean z4) {
        if (z4) {
            this.L.Z = false;
        }
    }

    @Override
    public final void x() {
        IMapsProvider.IMapView iMapView = this.F;
        if (iMapView != null && this.f26007l0) {
            try {
                iMapView.onPause();
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        this.m0 = false;
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.cl.y(int, int):void");
    }
}
