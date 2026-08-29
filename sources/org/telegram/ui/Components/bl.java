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
public final class bl extends fi implements NotificationCenter.NotificationCenterDelegate {
    public static final int A0 = 0;
    public final org.telegram.ui.ActionBar.w0 A;
    public final yk B;
    public boolean C;
    public IMapsProvider.IMap D;
    public IMapsProvider.IMapView E;
    public IMapsProvider.ICameraUpdate F;
    public float G;
    public boolean H;
    public final View I;
    public final bg.x2 J;
    public final rf.i0 K;
    public final jh.e1 L;
    public final jl0 M;
    public final vk N;
    public final ImageView O;
    public final gj P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public final long V;
    public final Paint W;
    public final ArrayList f27152a0;
    public AnimatorSet f27153b0;
    public IMapsProvider.IMarker f27154c0;
    public al f27155d0;
    public FrameLayout f27156e0;
    public boolean f27157f0;
    public boolean f27158g0;
    public boolean f27159h0;
    public boolean f27160i0;
    public boolean f27161j0;
    public boolean f27162k0;
    public boolean f27163l0;
    public Location m0;
    public final ImageView f27164n;
    public Location f27165n0;
    public int f27166o0;
    public boolean f27167p0;
    public boolean f27168q0;
    public final org.telegram.ui.ActionBar.w0 f27169r;
    public boolean f27170r0;
    public final zk f27171s;
    public boolean f27172s0;
    public wk f27173t0;
    public final int f27174u0;
    public final LinearLayout v;
    public int f27175v0;
    public final ImageView f27176w;
    public int f27177w0;
    public final TextView f27178x;
    public int f27179x0;
    public final TextView f27180y;
    public int f27181y0;
    public final Bitmap[] f27182z0;

    public bl(ni niVar, Context context, final org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, niVar);
        final org.telegram.ui.tn tnVar;
        boolean z11;
        int i10;
        boolean z12;
        this.R = true;
        this.S = false;
        this.T = false;
        this.U = true;
        this.W = new Paint();
        this.f27152a0 = new ArrayList();
        this.f27157f0 = true;
        this.f27158g0 = true;
        int currentActionBarHeight = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.f27175v0 = currentActionBarHeight;
        this.f27177w0 = currentActionBarHeight;
        this.f27182z0 = new Bitmap[7];
        AndroidUtilities.fixGoogleMapsBug();
        ni niVar2 = this.f28403b;
        org.telegram.ui.ActionBar.o2 o2Var = niVar2.f30990b0;
        if (o2Var instanceof org.telegram.ui.tn) {
            tnVar = (org.telegram.ui.tn) o2Var;
        } else {
            tnVar = null;
        }
        long n12 = niVar2.n1();
        this.V = n12;
        if (this.f28403b.K) {
            this.f27174u0 = 7;
        } else if (z10 && tnVar != null && tnVar.h == null && !tnVar.c() && !UserObject.isUserSelf(tnVar.i())) {
            this.f27174u0 = 1;
        } else {
            this.f27174u0 = 0;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        this.f27160i0 = false;
        this.f27159h0 = false;
        this.f27161j0 = false;
        rf.i0 i0Var = this.K;
        if (i0Var != null) {
            i0Var.F();
        }
        vk vkVar = this.N;
        if (vkVar != null) {
            vkVar.F();
        }
        if (Build.VERSION.SDK_INT >= 23 && getParentActivity() != null && getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.T = z11;
        org.telegram.ui.ActionBar.a0 n10 = this.f28403b.T0.n();
        this.B = new yk(this, context);
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new org.telegram.ui.bb(this, 5);
        this.A = a2;
        if (this.T && !this.f28403b.K) {
            i10 = 8;
        } else {
            this.f28403b.getClass();
            i10 = 0;
        }
        a2.setVisibility(i10);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i11 = org.telegram.ui.ActionBar.g6.f23169j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, this.f28402a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.g6.v0(i11, this.f28402a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Vd, this.f28402a));
        new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f)).gravity = 83;
        bg.x2 x2Var = new bg.x2(this, context, 17);
        this.J = x2Var;
        x2Var.setWillNotDraw(false);
        View view = new View(context);
        this.I = view;
        view.setBackgroundDrawable(new cf.f(org.telegram.ui.ActionBar.g6.A0().q()));
        zk zkVar = new zk(context, 0);
        this.f27171s = zkVar;
        zkVar.setTranslationX(-AndroidUtilities.dp(80.0f));
        zkVar.setVisibility(4);
        int dp = AndroidUtilities.dp(40.0f);
        int i12 = org.telegram.ui.ActionBar.g6.wi;
        int v02 = org.telegram.ui.ActionBar.g6.v0(i12, this.f28402a);
        int i13 = org.telegram.ui.ActionBar.g6.xi;
        int v03 = org.telegram.ui.ActionBar.g6.v0(i13, this.f28402a);
        org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.g6.i0(dp, dp, dp, dp, v02, v03, v03);
        i7.h6.a(zkVar);
        zkVar.setTranslationZ(AndroidUtilities.dp(2.0f));
        eg.k1 k1Var = jf.q0.f11668a;
        zkVar.setOutlineProvider(k1Var);
        zkVar.setBackground(i02);
        int i14 = org.telegram.ui.ActionBar.g6.vi;
        zkVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, this.f28402a));
        zkVar.setTextSize(1, 14.0f);
        zkVar.setTypeface(AndroidUtilities.bold());
        zkVar.setText(LocaleController.getString(R.string.PlacesInThisArea));
        zkVar.setGravity(17);
        zkVar.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        x2Var.addView(zkVar, i7.f6.d(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
        zkVar.setOnClickListener(new View.OnClickListener(this) {
            public final bl f31083b;

            {
                this.f31083b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        bl.Q(this.f31083b);
                        return;
                    case 1:
                        bl blVar = this.f31083b;
                        blVar.d0(false);
                        blVar.K.H(null, blVar.f27165n0, true);
                        blVar.f27170r0 = true;
                        blVar.c0();
                        return;
                    default:
                        this.f31083b.f27169r.M(null, null);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ui, this.f28402a), false, c6Var);
        this.f27169r = w0Var;
        w0Var.setClickable(true);
        w0Var.setSubMenuOpenSide(2);
        w0Var.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        w0Var.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        w0Var.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), c6Var);
        w0Var.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), c6Var);
        w0Var.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), c6Var);
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.g6.v0(i12, this.f28402a), org.telegram.ui.ActionBar.g6.v0(i13, this.f28402a));
        i7.h6.a(w0Var);
        w0Var.setTranslationZ(AndroidUtilities.dp(2.0f));
        w0Var.setOutlineProvider(k1Var);
        w0Var.setBackground(h02);
        w0Var.setIcon(R.drawable.msg_map_type);
        x2Var.addView(w0Var, i7.f6.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        w0Var.setOnClickListener(new View.OnClickListener(this) {
            public final bl f31083b;

            {
                this.f31083b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        bl.Q(this.f31083b);
                        return;
                    case 1:
                        bl blVar = this.f31083b;
                        blVar.d0(false);
                        blVar.K.H(null, blVar.f27165n0, true);
                        blVar.f27170r0 = true;
                        blVar.c0();
                        return;
                    default:
                        this.f31083b.f27169r.M(null, null);
                        return;
                }
            }
        });
        w0Var.setDelegate(new mk(this, 0));
        ImageView imageView = new ImageView(context);
        this.f27164n = imageView;
        org.telegram.ui.Cells.z h03 = org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.g6.v0(i12, this.f28402a), org.telegram.ui.ActionBar.g6.v0(i13, this.f28402a));
        i7.h6.a(imageView);
        imageView.setTranslationZ(AndroidUtilities.dp(2.0f));
        imageView.setOutlineProvider(k1Var);
        imageView.setBackground(h03);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int v04 = org.telegram.ui.ActionBar.g6.v0(i14, this.f28402a);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v04, mode));
        imageView.setTag(Integer.valueOf(i14));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        x2Var.addView(imageView, i7.f6.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final bl f31083b;

            {
                this.f31083b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        bl.Q(this.f31083b);
                        return;
                    case 1:
                        bl blVar = this.f31083b;
                        blVar.d0(false);
                        blVar.K.H(null, blVar.f27165n0, true);
                        blVar.f27170r0 = true;
                        blVar.c0();
                        return;
                    default:
                        this.f31083b.f27169r.M(null, null);
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
        addView(linearLayout, i7.f6.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new mh.d(15));
        ImageView imageView2 = new ImageView(context);
        this.f27176w = imageView2;
        imageView2.setImageResource(R.drawable.location_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.W5, this.f28402a), mode));
        linearLayout.addView(imageView2, i7.f6.n(-2, -2));
        TextView textView = new TextView(context);
        this.f27178x = textView;
        int i15 = org.telegram.ui.ActionBar.g6.X5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i15, this.f28402a));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 17.0f);
        textView.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView i16 = org.telegram.ui.th.i(linearLayout, textView, i7.f6.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.f27180y = i16;
        i16.setTextColor(org.telegram.ui.ActionBar.g6.v0(i15, this.f28402a));
        i16.setGravity(17);
        i16.setTextSize(1, 15.0f);
        i16.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(i16, i7.f6.t(-2, -2, 17, 0, 6, 0, 0));
        jh.e1 e1Var = new jh.e1(this, context, c6Var, 12);
        this.L = e1Var;
        this.f28404c = e1Var;
        this.d = e1Var;
        this.f28406f = true;
        e1Var.setClipToPadding(false);
        rf.i0 i0Var2 = new rf.i0(context, this.f27174u0, n12, true, c6Var, this.f28403b.K, false, false);
        this.K = i0Var2;
        e1Var.setAdapter(i0Var2);
        ni niVar3 = this.f28403b;
        if (niVar3 != null && (niVar3.D || niVar3.L)) {
            z12 = true;
        } else {
            z12 = false;
        }
        i0Var2.f47255b0 = z12;
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(jr.h);
        lVar.C = false;
        lVar.f6463m = false;
        e1Var.setItemAnimator(lVar);
        i0Var2.O(this.T, this.S);
        e1Var.setVerticalScrollBarEnabled(false);
        e1Var.p1();
        gj gjVar = new gj(this, e1Var);
        this.P = gjVar;
        e1Var.setLayoutManager(gjVar);
        addView(e1Var, i7.f6.e(-1, -1, 51));
        e1Var.setOnScrollListener(new uk(this));
        e1Var.setOnItemClickListener(new zk0(this) {
            public final bl f31378b;

            {
                this.f31378b = this;
            }

            @Override
            public final void c(int i17, View view2) {
                switch (r4) {
                    case 0:
                        bl.M(this.f31378b, tnVar, c6Var, i17);
                        return;
                    default:
                        bl.O(this.f31378b, tnVar, c6Var, i17);
                        return;
                }
            }
        });
        mk mkVar = new mk(this, 1);
        i0Var2.D = n12;
        i0Var2.f47183y = mkVar;
        i0Var2.P(AndroidUtilities.dp(16.0f) + this.f27175v0);
        addView(x2Var, i7.f6.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.E = onCreateMapView;
        onCreateMapView.setOnDispatchTouchEventInterceptor(new mk(this, 2));
        this.E.setOnInterceptTouchEventInterceptor(new mk(this, 3));
        new Thread(new qk(this, this.E, 1)).start();
        ImageView imageView3 = new ImageView(context);
        this.O = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        x2Var.addView(imageView3, i7.f6.e(28, 48, 49));
        jl0 jl0Var = new jl0(context, c6Var);
        this.M = jl0Var;
        jl0Var.setSections(true);
        jl0Var.setClipToPadding(false);
        jl0Var.setVisibility(8);
        jl0Var.setLayoutManager(new f2.j0(1, false));
        vk vkVar2 = new vk(this, context, c6Var, this.f28403b.K);
        this.N = vkVar2;
        boolean z13 = this.T;
        if (vkVar2.I != z13) {
            vkVar2.I = z13;
        }
        mk mkVar2 = new mk(this, 7);
        vkVar2.D = 0L;
        vkVar2.f47183y = mkVar2;
        jl0Var.setItemAnimator(null);
        addView(jl0Var, i7.f6.e(-1, -1, 51));
        jl0Var.setOnScrollListener(new cg.g2(this, 24));
        jl0Var.setOnItemClickListener(new zk0(this) {
            public final bl f31378b;

            {
                this.f31378b = this;
            }

            @Override
            public final void c(int i17, View view2) {
                switch (r4) {
                    case 0:
                        bl.M(this.f31378b, tnVar, c6Var, i17);
                        return;
                    default:
                        bl.O(this.f31378b, tnVar, c6Var, i17);
                        return;
                }
            }
        });
        f0();
    }

    public static void J(bl blVar, IMapsProvider.IMap iMap) {
        PackageManager packageManager;
        blVar.D = iMap;
        iMap.setOnMapLoadedCallback(new lk(blVar, 3));
        if (org.telegram.ui.ActionBar.g6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23062d6, blVar.f28402a)) < 0.721f) {
            blVar.Q = true;
            blVar.D.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
        }
        if (blVar.D != null) {
            Location location = new Location("network");
            blVar.f27165n0 = location;
            location.setLatitude(20.659322d);
            blVar.f27165n0.setLongitude(-11.40625d);
            try {
                blVar.D.setMyLocationEnabled(true);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            blVar.D.getUiSettings().setMyLocationButtonEnabled(false);
            blVar.D.getUiSettings().setZoomControlsEnabled(false);
            blVar.D.getUiSettings().setCompassEnabled(false);
            blVar.D.setOnCameraMoveStartedListener(new mk(blVar, 4));
            blVar.D.setOnCameraIdleListener(new lk(blVar, 5));
            blVar.D.setOnMyLocationChangeListener(new sk(blVar, 1));
            blVar.D.setOnMarkerClickListener(new mk(blVar, 5));
            blVar.D.setOnCameraMoveListener(new lk(blVar, 6));
            blVar.Z();
            AndroidUtilities.runOnUIThread(new lk(blVar, 7), 200L);
            if (blVar.R && blVar.getParentActivity() != null) {
                blVar.R = false;
                Activity parentActivity = blVar.getParentActivity();
                if (parentActivity == null || (packageManager = parentActivity.getPackageManager()) == null || packageManager.hasSystemFeature("android.hardware.location.gps")) {
                    try {
                        if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(blVar.getParentActivity(), 0, blVar.f28402a);
                            alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.L5, blVar.f28402a), null);
                            alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.GpsDisabledAlertText);
                            alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new mk(blVar, 6));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                        }
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                } else {
                    return;
                }
            }
            blVar.e0();
        }
    }

    public static void K(bl blVar, org.telegram.ui.tn tnVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.c6 c6Var, Long l10) {
        if (tnVar != null && tnVar.c()) {
            c5.M(blVar.getParentActivity(), tnVar.a(), new androidx.car.app.utils.a(blVar, tL_messageMediaGeo, l10, 22), c6Var);
            return;
        }
        blVar.f27173t0.d(tL_messageMediaGeo, blVar.f27174u0, true, 0, l10.longValue());
        blVar.f28403b.dismiss(true);
    }

    public static void L(bl blVar) {
        int i10;
        Activity parentActivity;
        rf.i0 i0Var = blVar.K;
        ni niVar = blVar.f28403b;
        if (blVar.f27157f0 && (i10 = Build.VERSION.SDK_INT) >= 23 && (parentActivity = blVar.getParentActivity()) != null) {
            blVar.f27157f0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                String[] strArr = (!niVar.K || niVar.f31047s2 == null || i10 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
                blVar.S = true;
                if (i0Var != null) {
                    i0Var.O(blVar.T, true);
                }
                parentActivity.requestPermissions(strArr, 2);
            } else if (i10 >= 29 && niVar.K && niVar.f31047s2 != null && parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") != 0) {
                blVar.S = true;
                if (i0Var != null) {
                    i0Var.O(blVar.T, true);
                }
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
            }
        }
    }

    public static void M(bl blVar, org.telegram.ui.tn tnVar, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        bl blVar2;
        org.telegram.ui.tn tnVar2;
        org.telegram.ui.ActionBar.c6 c6Var2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j10 = blVar.V;
        rf.i0 i0Var = blVar.K;
        ni niVar = blVar.f28403b;
        int i11 = blVar.f27174u0;
        if (i11 == 7) {
            if (i10 == 1 && (tL_messageMediaVenue2 = i0Var.Z) != null) {
                blVar.f27173t0.d(tL_messageMediaVenue2, i11, true, 0, 0L);
                niVar.dismiss(true);
                return;
            } else if (i10 == 2 && (tL_messageMediaVenue = i0Var.f47254a0) != null) {
                blVar.f27173t0.d(tL_messageMediaVenue, i11, true, 0, 0L);
                niVar.dismiss(true);
                return;
            } else {
                blVar2 = blVar;
                tnVar2 = tnVar;
                c6Var2 = c6Var;
            }
        } else if (i10 == 1) {
            if (blVar.f27173t0 != null && blVar.f27165n0 != null) {
                FrameLayout frameLayout = blVar.f27156e0;
                if (frameLayout != null) {
                    frameLayout.callOnClick();
                    return;
                }
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(blVar.f27165n0.getLatitude());
                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(blVar.f27165n0.getLongitude());
                c5.a0(niVar.F1, niVar.j1() + 1, niVar.n1(), new eg.d1(blVar, tnVar, tL_messageMediaGeo, c6Var, 7));
                return;
            } else if (blVar.T) {
                c5.D(blVar.getParentActivity()).show();
                return;
            } else {
                return;
            }
        } else {
            blVar2 = blVar;
            tnVar2 = tnVar;
            c6Var2 = c6Var;
            if (i10 == 2 && i11 == 1) {
                if (blVar2.getLocationController().isSharingLocation(j10)) {
                    blVar2.getLocationController().removeSharingLocation(j10);
                    niVar.dismiss(true);
                    return;
                } else if (blVar2.m0 == null && blVar2.T) {
                    c5.D(blVar2.getParentActivity()).show();
                    return;
                } else {
                    blVar2.Y();
                    return;
                }
            }
        }
        Object J = i0Var.J(i10);
        if (J instanceof TLRPC.TL_messageMediaVenue) {
            c5.a0(niVar.F1, niVar.j1() + 1, niVar.n1(), new eg.d1(blVar2, tnVar2, (TLRPC.TL_messageMediaVenue) J, c6Var2, 8));
        }
    }

    public static void O(bl blVar, org.telegram.ui.tn tnVar, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        TLRPC.TL_messageMediaVenue I = blVar.N.I(i10);
        if (I != null && blVar.f27173t0 != null) {
            if (tnVar != null && tnVar.c()) {
                c5.M(blVar.getParentActivity(), tnVar.a(), new rk(blVar, I, 0), c6Var);
                return;
            }
            blVar.f27173t0.d(I, blVar.f27174u0, true, 0, 0L);
            blVar.f28403b.dismiss(true);
        }
    }

    public static void P(bl blVar, org.telegram.ui.tn tnVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.c6 c6Var) {
        if (tnVar != null && tnVar.c()) {
            c5.M(blVar.getParentActivity(), tnVar.a(), new rk(blVar, tL_messageMediaVenue, 1), c6Var);
            return;
        }
        blVar.f27173t0.d(tL_messageMediaVenue, blVar.f27174u0, true, 0, 0L);
        blVar.f28403b.dismiss(true);
    }

    public static void Q(bl blVar) {
        Activity parentActivity;
        rf.i0 i0Var = blVar.K;
        ImageView imageView = blVar.f27164n;
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = blVar.getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            c5.D(blVar.getParentActivity()).show();
            return;
        }
        if (blVar.m0 != null && blVar.D != null) {
            int i10 = org.telegram.ui.ActionBar.g6.vi;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, blVar.f28402a), PorterDuff.Mode.MULTIPLY));
            imageView.setTag(Integer.valueOf(i10));
            i0Var.L(null);
            blVar.f27168q0 = false;
            blVar.d0(false);
            blVar.D.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(blVar.m0.getLatitude(), blVar.m0.getLongitude())));
            if (blVar.f27170r0) {
                Location location = blVar.m0;
                if (location != null && blVar.f27174u0 != 8) {
                    i0Var.H(null, location, true);
                }
                blVar.f27170r0 = false;
                blVar.c0();
            }
        }
        if (blVar.f27154c0 != null) {
            blVar.O.setVisibility(0);
            yk ykVar = blVar.B;
            IMapsProvider.IMarker iMarker = blVar.f27154c0;
            HashMap hashMap = ykVar.f35085a;
            View view = (View) hashMap.get(iMarker);
            if (view != null) {
                ykVar.removeView(view);
                hashMap.remove(iMarker);
            }
            blVar.f27154c0 = null;
            blVar.f27155d0 = null;
            blVar.f27156e0 = null;
        }
    }

    public static void R(bl blVar, Location location) {
        int i10;
        ni niVar = blVar.f28403b;
        if (niVar != null && niVar.f30990b0 != null) {
            blVar.a0(location);
            rf.i0 i0Var = blVar.K;
            if (i0Var != null && (((i10 = blVar.f27174u0) == 7 || i10 == 8) && !blVar.f27168q0)) {
                i0Var.L(blVar.f27165n0);
            }
            blVar.getLocationController().setMapLocation(location, blVar.U);
            blVar.U = false;
        }
    }

    public static void S(bl blVar, IMapsProvider.IMapView iMapView) {
        if (blVar.E != null && blVar.getParentActivity() != null) {
            try {
                iMapView.onCreate(null);
                ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                blVar.E.getMapAsync(new sk(blVar, 0));
                blVar.f27162k0 = true;
                if (blVar.f27163l0) {
                    blVar.E.onResume();
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public static void T(bl blVar) {
        if (blVar.getParentActivity() != null) {
            try {
                blVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
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
        return this.f28403b.f30990b0.getLocationController();
    }

    private MessagesController getMessagesController() {
        return this.f28403b.f30990b0.getMessagesController();
    }

    public Activity getParentActivity() {
        org.telegram.ui.ActionBar.o2 o2Var;
        ni niVar = this.f28403b;
        if (niVar != null && (o2Var = niVar.f30990b0) != null) {
            return o2Var.getParentActivity();
        }
        return null;
    }

    private UserConfig getUserConfig() {
        return this.f28403b.f30990b0.getUserConfig();
    }

    @Override
    public final void A() {
        IMapsProvider.IMapView iMapView = this.E;
        if (iMapView != null && this.f27162k0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.f27163l0 = true;
    }

    @Override
    public final void D(fi fiVar) {
        long j10;
        ni niVar = this.f28403b;
        niVar.T0.setTitle(LocaleController.getString(R.string.ShareLocation));
        if (this.E.getView().getParent() == null) {
            View view = this.E.getView();
            FrameLayout.LayoutParams e10 = i7.f6.e(-1, AndroidUtilities.dp(10.0f) + this.f27175v0, 51);
            bg.x2 x2Var = this.J;
            x2Var.addView(view, 0, e10);
            x2Var.addView(this.B, 1, i7.f6.e(-1, AndroidUtilities.dp(10.0f) + this.f27175v0, 51));
            x2Var.addView(this.I, 2, i7.f6.c(-1.0f, -1));
        }
        this.A.setVisibility(0);
        IMapsProvider.IMapView iMapView = this.E;
        if (iMapView != null && this.f27162k0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.f27163l0 = true;
        IMapsProvider.IMap iMap = this.D;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        W();
        boolean a02 = niVar.V1.a0();
        lk lkVar = new lk(this, 1);
        if (a02) {
            j10 = 200;
        } else {
            j10 = 0;
        }
        AndroidUtilities.runOnUIThread(lkVar, j10);
        this.P.h1(0, 0);
        e0();
    }

    @Override
    public final void F() {
        this.L.x0(0);
    }

    @Override
    public final boolean I() {
        return !this.T;
    }

    public final Bitmap V(int i10) {
        Bitmap[] bitmapArr = this.f27182z0;
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
            paint.setColor(org.telegram.ui.Cells.s4.a(i10));
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
        if (getMeasuredHeight() != 0 && this.E != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            int i11 = AndroidUtilities.displaySize.y - currentActionBarHeight;
            int dp = AndroidUtilities.dp(66.0f);
            int i12 = this.f27174u0;
            if (i12 == 1 || i12 == 7 || i12 == 8) {
                dp += AndroidUtilities.dp(66.0f);
            }
            int dp2 = (i11 - dp) - AndroidUtilities.dp(90.0f);
            int dp3 = AndroidUtilities.dp(189.0f);
            this.f27175v0 = dp3;
            if (!this.T || !X()) {
                dp2 = Math.min(AndroidUtilities.dp(310.0f), dp2);
            }
            this.f27177w0 = Math.max(dp3, dp2);
            if (this.T && X()) {
                this.f27175v0 = this.f27177w0;
            }
            jh.e1 e1Var = this.L;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) e1Var.getLayoutParams();
            layoutParams2.topMargin = currentActionBarHeight;
            e1Var.setLayoutParams(layoutParams2);
            bg.x2 x2Var = this.J;
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) x2Var.getLayoutParams();
            layoutParams3.topMargin = currentActionBarHeight;
            layoutParams3.height = this.f27177w0;
            x2Var.setLayoutParams(layoutParams3);
            jl0 jl0Var = this.M;
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) jl0Var.getLayoutParams();
            layoutParams4.topMargin = currentActionBarHeight;
            jl0Var.setLayoutParams(layoutParams4);
            if (this.T && X()) {
                i10 = this.f27175v0 - e1Var.getPaddingTop();
            } else {
                i10 = this.f27175v0;
            }
            int dp4 = AndroidUtilities.dp(16.0f) + i10;
            rf.i0 i0Var = this.K;
            i0Var.P(dp4);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.E.getView().getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.height = AndroidUtilities.dp(10.0f) + this.f27177w0;
                this.E.getView().setLayoutParams(layoutParams5);
            }
            yk ykVar = this.B;
            if (ykVar != null && (layoutParams = (FrameLayout.LayoutParams) ykVar.getLayoutParams()) != null) {
                layoutParams.height = AndroidUtilities.dp(10.0f) + this.f27177w0;
                ykVar.setLayoutParams(layoutParams);
            }
            i0Var.l();
            e0();
        }
    }

    public final boolean X() {
        int i10 = this.f27174u0;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final void Y() {
        TLRPC.User user;
        Activity parentActivity;
        if (this.f27173t0 != null && getParentActivity() != null && this.m0 != null) {
            boolean z10 = this.f27158g0;
            org.telegram.ui.ActionBar.c6 c6Var = this.f28402a;
            if (z10 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
                this.f27158g0 = false;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                    globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                    c5.l(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new lk(this, 2), c6Var).o();
                    return;
                }
            }
            long j10 = this.V;
            if (DialogObject.isUserDialog(j10)) {
                user = this.f28403b.f30990b0.getMessagesController().getUser(Long.valueOf(j10));
            } else {
                user = null;
            }
            c5.E(getParentActivity(), false, user, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i10) {
                    bl blVar = bl.this;
                    ni niVar = blVar.f28403b;
                    c5.a0(niVar.F1, niVar.j1() + 1, niVar.n1(), new nh.c6(blVar, i10, 2));
                }
            }, c6Var).show();
        }
    }

    public final void Z() {
        bl blVar;
        ni niVar = this.f28403b;
        if (niVar.K) {
            if (niVar.f31050t2 != null) {
                AndroidUtilities.runOnUIThread(new lk(this, 0));
                return;
            } else if (!this.T) {
                File file = niVar.f31047s2;
                boolean z10 = niVar.f31043r2;
                if (file != null) {
                    if (z10) {
                        try {
                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                            String extractMetadata = mediaMetadataRetriever.extractMetadata(23);
                            if (extractMetadata != null) {
                                Matcher matcher = Pattern.compile("([+\\-][0-9.]+)([+\\-][0-9.]+)").matcher(extractMetadata);
                                if (matcher.find() && matcher.groupCount() == 2) {
                                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.r7(this, Double.parseDouble(matcher.group(1)), Double.parseDouble(matcher.group(2)), 2));
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
                            AndroidUtilities.runOnUIThread(new z2(19, this, fArr));
                            return;
                        }
                        Location lastLocation = getLastLocation();
                        blVar.m0 = lastLocation;
                        a0(lastLocation);
                        return;
                    }
                }
                blVar = this;
                Location lastLocation2 = getLastLocation();
                blVar.m0 = lastLocation2;
                a0(lastLocation2);
                return;
            } else {
                AndroidUtilities.runOnUIThread(new lk(this, 8));
                return;
            }
        }
        Location lastLocation3 = getLastLocation();
        this.m0 = lastLocation3;
        a0(lastLocation3);
    }

    public final void a0(Location location) {
        if (location != null) {
            Location location2 = new Location(location);
            this.m0 = location2;
            IMapsProvider.IMap iMap = this.D;
            rf.i0 i0Var = this.K;
            if (iMap != null) {
                IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
                if (i0Var != null) {
                    if (!this.f27170r0 && this.f27174u0 != 8) {
                        i0Var.H(null, this.m0, true);
                    }
                    i0Var.M(this.m0);
                }
                if (!this.f27168q0) {
                    this.f27165n0 = new Location(location);
                    if (this.f27172s0) {
                        this.D.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                        return;
                    }
                    this.f27172s0 = true;
                    this.D.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.D.getMaxZoomLevel() - 4.0f));
                    return;
                }
                return;
            }
            i0Var.M(location2);
        }
    }

    public final void b0(double d, double d10) {
        IMapsProvider.ICameraUpdate newCameraUpdateLatLngZoom;
        if (this.D != null) {
            int i10 = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
            if (i10 != 0 && d10 != 0.0d) {
                Location location = new Location("");
                this.f27165n0 = location;
                location.reset();
                this.f27165n0.setLatitude(d);
                this.f27165n0.setLongitude(d10);
            } else {
                Location location2 = new Location("");
                this.m0 = location2;
                location2.reset();
                this.m0.setLatitude(d);
                this.m0.setLongitude(d10);
            }
            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(d, d10);
            if (i10 != 0 && d10 != 0.0d) {
                newCameraUpdateLatLngZoom = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.D.getMaxZoomLevel() - 4.0f);
            } else {
                newCameraUpdateLatLngZoom = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.D.getMinZoomLevel());
            }
            this.F = newCameraUpdateLatLngZoom;
            this.D.moveCamera(newCameraUpdateLatLngZoom);
            rf.i0 i0Var = this.K;
            if (i10 != 0 && d10 != 0.0d) {
                i0Var.L(this.f27165n0);
            } else {
                i0Var.M(this.m0);
            }
            i0Var.I();
            this.L.v0(0, 1, null);
            this.f27167p0 = true;
            if (i10 != 0 && d10 != 0.0d) {
                this.f27168q0 = true;
                d0(false);
                if (this.f27174u0 != 8) {
                    i0Var.H(null, this.f27165n0, true);
                }
                this.f27170r0 = true;
                c0();
            }
        }
    }

    public final void c0() {
        if (this.K.h() != 0 && this.P.L0() == 0) {
            jh.e1 e1Var = this.L;
            View childAt = e1Var.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top >= 0 && top <= AndroidUtilities.dp(258.0f)) {
                e1Var.v0(0, top, null);
            }
        }
    }

    public final void d0(boolean z10) {
        int i10;
        Integer num;
        float f9;
        Location location;
        Location location2;
        if (this.T) {
            z10 = false;
        }
        zk zkVar = this.f27171s;
        if (z10 && zkVar != null && zkVar.getTag() == null && ((location = this.m0) == null || (location2 = this.f27165n0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        if (this.f27174u0 == 8) {
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
                        f9 = 0.0f;
                    } else {
                        f9 = -AndroidUtilities.dp(80.0f);
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(zkVar, View.TRANSLATION_X, f9));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(jr.f29801g);
                    animatorSet.start();
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        boolean z11;
        int i12 = NotificationCenter.locationPermissionGranted;
        vk vkVar = this.N;
        rf.i0 i0Var = this.K;
        int i13 = 0;
        if (i10 == i12) {
            this.T = false;
            this.S = false;
            Z();
            if (i0Var != null) {
                i0Var.O(this.T, this.S);
            }
            if (vkVar != null && vkVar.I != (z11 = this.T)) {
                vkVar.I = z11;
            }
            IMapsProvider.IMap iMap = this.D;
            if (iMap != null) {
                try {
                    iMap.setMyLocationEnabled(true);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        } else if (i10 == NotificationCenter.locationPermissionDenied) {
            this.T = true;
            this.S = false;
            if (i0Var != null) {
                i0Var.O(true, false);
            }
            if (vkVar != null && vkVar.I != (z10 = this.T)) {
                vkVar.I = z10;
            }
        }
        W();
        boolean z12 = this.T;
        ni niVar = this.f28403b;
        if (z12 && !niVar.K) {
            i13 = 8;
        } else {
            niVar.getClass();
        }
        this.A.setVisibility(i13);
    }

    public final void e0() {
        bg.x2 x2Var;
        int i10;
        int i11;
        IMapsProvider.LatLng latLng;
        Location location;
        IMapsProvider.IMap iMap;
        if (this.E != null && (x2Var = this.J) != null) {
            jh.e1 e1Var = this.L;
            f2.n1 K = e1Var.K(0);
            if (K != null) {
                i10 = (int) K.f6432a.getY();
                i11 = Math.min(i10, 0) + this.f27175v0;
            } else {
                i10 = -x2Var.getMeasuredHeight();
                i11 = 0;
            }
            if (((FrameLayout.LayoutParams) x2Var.getLayoutParams()) != null) {
                yk ykVar = this.B;
                if (i11 <= 0) {
                    if (this.E.getView().getVisibility() == 0) {
                        this.E.getView().setVisibility(4);
                        x2Var.setVisibility(4);
                        if (ykVar != null) {
                            ykVar.setVisibility(4);
                        }
                    }
                    this.E.getView().setTranslationY(i10);
                    return;
                }
                if (this.E.getView().getVisibility() == 4) {
                    this.E.getView().setVisibility(0);
                    x2Var.setVisibility(0);
                    if (ykVar != null) {
                        ykVar.setVisibility(0);
                    }
                }
                int max = Math.max(0, (-((i10 - this.f27177w0) + this.f27175v0)) / 2);
                int i12 = this.f27177w0 - this.f27175v0;
                float max2 = 1.0f - Math.max(0.0f, Math.min(1.0f, (e1Var.getPaddingTop() - i10) / (e1Var.getPaddingTop() - i12)));
                int i13 = this.f27179x0;
                if (this.T && X()) {
                    i12 += Math.min(i10, e1Var.getPaddingTop());
                }
                this.f27179x0 = (int) (i12 * max2);
                float f9 = max;
                this.E.getView().setTranslationY(f9);
                this.f27181y0 = i12 - this.f27179x0;
                x2Var.invalidate();
                x2Var.setTranslationY(i10 - this.f27181y0);
                IMapsProvider.IMap iMap2 = this.D;
                if (iMap2 != null) {
                    iMap2.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f) + this.f27179x0);
                }
                if (ykVar != null) {
                    ykVar.setTranslationY(f9);
                }
                int max3 = Math.max(this.f27181y0 - i10, 0);
                int i14 = this.f27177w0;
                org.telegram.ui.ActionBar.w0 w0Var = this.f27169r;
                float min = Math.min(max3, (i14 - w0Var.getMeasuredHeight()) - AndroidUtilities.dp(80.0f));
                w0Var.setTranslationY(min);
                zk zkVar = this.f27171s;
                zkVar.f35362c = min;
                zkVar.setTranslationY(min + zkVar.f35361b);
                this.f27164n.setTranslationY(-this.f27179x0);
                int C = org.telegram.ui.b.C(48.0f, (this.f27177w0 - this.f27179x0) / 2, max);
                this.f27166o0 = C;
                this.O.setTranslationY(C);
                if (i13 != this.f27179x0) {
                    IMapsProvider.IMarker iMarker = this.f27154c0;
                    if (iMarker != null) {
                        latLng = new IMapsProvider.LatLng(iMarker.getPosition().latitude, this.f27154c0.getPosition().longitude);
                    } else if (this.f27168q0 && (location = this.f27165n0) != null) {
                        latLng = new IMapsProvider.LatLng(location.getLatitude(), this.f27165n0.getLongitude());
                    } else {
                        Location location2 = this.m0;
                        if (location2 != null) {
                            latLng = new IMapsProvider.LatLng(location2.getLatitude(), this.m0.getLongitude());
                        } else {
                            latLng = null;
                        }
                    }
                    if (latLng != null && (iMap = this.D) != null) {
                        iMap.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                    }
                }
                if (this.T && X()) {
                    int h = this.K.h();
                    for (int i15 = 1; i15 < h; i15++) {
                        f2.n1 K2 = e1Var.K(i15);
                        if (K2 != null) {
                            K2.f6432a.setTranslationY(e1Var.getPaddingTop() - i10);
                        }
                    }
                }
            }
        }
    }

    public final void f0() {
        boolean z10 = this.f27159h0;
        LinearLayout linearLayout = this.v;
        if (z10) {
            boolean z11 = this.f27161j0;
            jl0 jl0Var = this.M;
            if (z11) {
                jl0Var.setEmptyView(null);
                linearLayout.setVisibility(8);
                return;
            }
            jl0Var.setEmptyView(linearLayout);
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
        jh.e1 e1Var = this.L;
        if (e1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        vk0 vk0Var = (vk0) e1Var.K(0);
        if (vk0Var != null) {
            i10 = Math.max(((int) vk0Var.f6432a.getY()) - this.f27181y0, 0);
        }
        return AndroidUtilities.dp(56.0f) + i10;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.L.getPaddingTop();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList<org.telegram.ui.ActionBar.i6> arrayList = new ArrayList<>();
        x6 x6Var = new x6(this, 2);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.J, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23133h5));
        int i10 = org.telegram.ui.ActionBar.g6.A5;
        jh.e1 e1Var = this.L;
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 32768, null, null, null, null, i10));
        org.telegram.ui.ActionBar.w0 w0Var = this.A;
        if (w0Var != null) {
            editTextBoldCursor = w0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursor, 16777216, null, null, null, null, org.telegram.ui.ActionBar.g6.f23169j5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23152i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23183k0, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        int i11 = org.telegram.ui.ActionBar.g6.W5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27176w, 8, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27178x, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27180y, 4, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.ui;
        ImageView imageView = this.f27164n;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 262152, null, null, null, null, i13));
        int i14 = org.telegram.ui.ActionBar.g6.vi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 262152, null, null, null, null, i14));
        int i15 = org.telegram.ui.ActionBar.g6.wi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 32, null, null, null, null, i15));
        int i16 = org.telegram.ui.ActionBar.g6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 65568, null, null, null, null, i16));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f27169r;
        arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var2, 0, null, null, null, x6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var2, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(w0Var2, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27171s, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27171s, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f27171s, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, org.telegram.ui.ActionBar.g6.f23305r0, x6Var, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.si));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 393216, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.ni));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 393216, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.qi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 393248, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.mi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 393248, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.pi));
        int i17 = org.telegram.ui.ActionBar.g6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"accurateTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 262144, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.ri));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 262144, new Class[]{org.telegram.ui.Cells.q6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.oi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"buttonTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 131072, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 196608, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 32, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23028b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 48, new Class[]{org.telegram.ui.Cells.x6.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.k4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23240n5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 32, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
        jl0 jl0Var = this.M;
        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 32, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(jl0Var, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.s7.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.s7.class}, new String[]{"distanceTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23134h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 8, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(e1Var, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"textView2"}, null, null, -1, null, i12));
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
        this.C = true;
        bg.x2 x2Var = this.J;
        if (x2Var != null) {
            x2Var.invalidate();
        }
        try {
            IMapsProvider.IMap iMap = this.D;
            if (iMap != null) {
                iMap.setMyLocationEnabled(false);
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        IMapsProvider.IMapView iMapView = this.E;
        if (iMapView != null) {
            iMapView.getView().setTranslationY((-AndroidUtilities.displaySize.y) * 3);
        }
        try {
            IMapsProvider.IMapView iMapView2 = this.E;
            if (iMapView2 != null) {
                iMapView2.onPause();
            }
        } catch (Exception unused) {
        }
        try {
            IMapsProvider.IMapView iMapView3 = this.E;
            if (iMapView3 != null) {
                iMapView3.onDestroy();
                this.E = null;
            }
        } catch (Exception unused2) {
        }
        rf.i0 i0Var = this.K;
        if (i0Var != null) {
            i0Var.F();
        }
        vk vkVar = this.N;
        if (vkVar != null) {
            vkVar.F();
        }
        ni niVar = this.f28403b;
        niVar.T0.h(true);
        niVar.T0.n().removeView(this.A);
    }

    @Override
    public final boolean n() {
        m();
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            W();
        }
    }

    @Override
    public final void r() {
        this.A.setVisibility(8);
    }

    public void setDelegate(wk wkVar) {
        this.f27173t0 = wkVar;
    }

    @Override
    public void setTranslationY(float f9) {
        super.setTranslationY(f9);
        this.f28403b.getSheetContainer().invalidate();
        e0();
    }

    @Override
    public final void v() {
        boolean z10;
        ni niVar = this.f28403b;
        if (niVar != null && !niVar.isKeyboardVisible()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.K.Y = z10;
    }

    @Override
    public final void w(int i10, boolean z10) {
        if (z10) {
            this.K.Y = false;
        }
    }

    @Override
    public final void x() {
        IMapsProvider.IMapView iMapView = this.E;
        if (iMapView != null && this.f27162k0) {
            try {
                iMapView.onPause();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        this.f27163l0 = false;
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.bl.y(int, int):void");
    }
}
