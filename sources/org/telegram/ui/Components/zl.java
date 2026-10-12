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
public final class zl extends si implements NotificationCenter.NotificationCenterDelegate {
    public static final int E0 = 0;
    public int A0;
    public int B0;
    public int C0;
    public final Bitmap[] D0;
    public final org.telegram.ui.ActionBar.u0 E;
    public final wl F;
    public boolean G;
    public IMapsProvider.IMap H;
    public IMapsProvider.IMapView I;
    public IMapsProvider.ICameraUpdate J;
    public float K;
    public boolean L;
    public final View M;
    public final ai.f0 N;
    public final gg.s0 O;
    public final ai.w0 P;
    public final wm0 Q;
    public final tl R;
    public final ImageView S;
    public final hg.f0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean f33398a0;
    public boolean f33399b0;
    public final long f33400c0;
    public final Paint f33401d0;
    public final ArrayList f33402e0;
    public AnimatorSet f33403f0;
    public IMapsProvider.IMarker f33404g0;
    public yl f33405h0;
    public FrameLayout f33406i0;
    public boolean f33407j0;
    public boolean f33408k0;
    public boolean f33409l0;
    public boolean m0;
    public final ImageView f33410n;
    public boolean f33411n0;
    public boolean f33412o0;
    public boolean f33413p0;
    public Location f33414q0;
    public final org.telegram.ui.ActionBar.u0 f33415r;
    public Location f33416r0;
    public final xl f33417s;
    public int f33418s0;
    public boolean f33419t0;
    public boolean f33420u0;
    public final LinearLayout v;
    public boolean f33421v0;
    public final ImageView f33422w;
    public boolean f33423w0;
    public final TextView f33424x;
    public ul f33425x0;
    public final TextView f33426y;
    public final int f33427y0;
    public int f33428z0;

    public zl(aj ajVar, Context context, final org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, ajVar);
        final org.telegram.ui.eo eoVar;
        boolean z11;
        int i10;
        boolean z12;
        this.V = true;
        this.W = false;
        this.f33398a0 = false;
        this.f33399b0 = true;
        this.f33401d0 = new Paint();
        this.f33402e0 = new ArrayList();
        this.f33407j0 = true;
        this.f33408k0 = true;
        int currentActionBarHeight = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.f33428z0 = currentActionBarHeight;
        this.A0 = currentActionBarHeight;
        this.D0 = new Bitmap[7];
        AndroidUtilities.fixGoogleMapsBug();
        aj ajVar2 = this.f30574b;
        org.telegram.ui.ActionBar.m2 m2Var = ajVar2.f24342f0;
        if (m2Var instanceof org.telegram.ui.eo) {
            eoVar = (org.telegram.ui.eo) m2Var;
        } else {
            eoVar = null;
        }
        long p12 = ajVar2.p1();
        this.f33400c0 = p12;
        if (this.f30574b.O) {
            this.f33427y0 = 7;
        } else if (z10 && eoVar != null && eoVar.h == null && !eoVar.c() && !UserObject.isUserSelf(eoVar.i())) {
            this.f33427y0 = 1;
        } else {
            this.f33427y0 = 0;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        this.m0 = false;
        this.f33409l0 = false;
        this.f33411n0 = false;
        gg.s0 s0Var = this.O;
        if (s0Var != null) {
            s0Var.F();
        }
        tl tlVar = this.R;
        if (tlVar != null) {
            tlVar.F();
        }
        if (getParentActivity() != null && getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f33398a0 = z11;
        org.telegram.ui.ActionBar.y p5 = this.f30574b.f24325a1.p();
        this.F = new wl(this, context);
        org.telegram.ui.ActionBar.u0 a2 = p5.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 6);
        this.E = a2;
        if (this.f33398a0 && !this.f30574b.O) {
            i10 = 8;
        } else {
            this.f30574b.getClass();
            i10 = 0;
        }
        a2.setVisibility(i10);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i11 = org.telegram.ui.ActionBar.h6.f20667j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, this.f30573a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.h6.w0(i11, this.f30573a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Vd, this.f30573a));
        new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f)).gravity = 83;
        ai.f0 f0Var = new ai.f0(this, context, 9);
        this.N = f0Var;
        f0Var.setWillNotDraw(false);
        View view = new View(context);
        this.M = view;
        view.setBackgroundDrawable(new gd(org.telegram.ui.ActionBar.h6.B0().q()));
        xl xlVar = new xl(context, 0);
        this.f33417s = xlVar;
        xlVar.setTranslationX(-AndroidUtilities.dp(80.0f));
        xlVar.setVisibility(4);
        int dp = AndroidUtilities.dp(40.0f);
        int i12 = org.telegram.ui.ActionBar.h6.wi;
        int w02 = org.telegram.ui.ActionBar.h6.w0(i12, this.f30573a);
        int i13 = org.telegram.ui.ActionBar.h6.xi;
        int w03 = org.telegram.ui.ActionBar.h6.w0(i13, this.f30573a);
        org.telegram.ui.Cells.z j02 = org.telegram.ui.ActionBar.h6.j0(dp, dp, dp, dp, w02, w03, w03);
        w7.y5.a(xlVar);
        xlVar.setTranslationZ(AndroidUtilities.dp(2.0f));
        ai.l2 l2Var = yf.i0.f52395a;
        xlVar.setOutlineProvider(l2Var);
        xlVar.setBackground(j02);
        int i14 = org.telegram.ui.ActionBar.h6.vi;
        xlVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, this.f30573a));
        xlVar.setTextSize(1, 14.0f);
        xlVar.setTypeface(AndroidUtilities.bold());
        xlVar.setText(LocaleController.getString(R.string.PlacesInThisArea));
        xlVar.setGravity(17);
        xlVar.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        f0Var.addView(xlVar, w7.w5.a(40.0f, 80.0f, 12.0f, 80.0f, 0.0f, -2, 49));
        xlVar.setOnClickListener(new View.OnClickListener(this) {
            public final zl f28228b;

            {
                this.f28228b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        zl.T(this.f28228b);
                        return;
                    case 1:
                        zl zlVar = this.f28228b;
                        zlVar.g0(false);
                        zlVar.O.H(null, zlVar.f33416r0, true);
                        zlVar.f33421v0 = true;
                        zlVar.f0();
                        return;
                    default:
                        this.f28228b.f33415r.M(null, null);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, 0, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.ui, this.f30573a), false, c6Var);
        this.f33415r = u0Var;
        u0Var.setClickable(true);
        u0Var.setSubMenuOpenSide(2);
        u0Var.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        u0Var.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        u0Var.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), c6Var);
        u0Var.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), c6Var);
        u0Var.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), c6Var);
        u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.h6.i0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.h6.w0(i12, this.f30573a), org.telegram.ui.ActionBar.h6.w0(i13, this.f30573a));
        w7.y5.a(u0Var);
        u0Var.setTranslationZ(AndroidUtilities.dp(2.0f));
        u0Var.setOutlineProvider(l2Var);
        u0Var.setBackground(i02);
        u0Var.setIcon(R.drawable.msg_map_type);
        f0Var.addView(u0Var, w7.w5.a(40.0f, 0.0f, 12.0f, 12.0f, 0.0f, 40, 53));
        u0Var.setOnClickListener(new View.OnClickListener(this) {
            public final zl f28228b;

            {
                this.f28228b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        zl.T(this.f28228b);
                        return;
                    case 1:
                        zl zlVar = this.f28228b;
                        zlVar.g0(false);
                        zlVar.O.H(null, zlVar.f33416r0, true);
                        zlVar.f33421v0 = true;
                        zlVar.f0();
                        return;
                    default:
                        this.f28228b.f33415r.M(null, null);
                        return;
                }
            }
        });
        u0Var.setDelegate(new kl(this, 0));
        ImageView imageView = new ImageView(context);
        this.f33410n = imageView;
        org.telegram.ui.Cells.z i03 = org.telegram.ui.ActionBar.h6.i0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.h6.w0(i12, this.f30573a), org.telegram.ui.ActionBar.h6.w0(i13, this.f30573a));
        w7.y5.a(imageView);
        imageView.setTranslationZ(AndroidUtilities.dp(2.0f));
        imageView.setOutlineProvider(l2Var);
        imageView.setBackground(i03);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int w04 = org.telegram.ui.ActionBar.h6.w0(i14, this.f30573a);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w04, mode));
        imageView.setTag(Integer.valueOf(i14));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        f0Var.addView(imageView, w7.w5.a(40.0f, 0.0f, 0.0f, 12.0f, 12.0f, 40, 85));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final zl f28228b;

            {
                this.f28228b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        zl.T(this.f28228b);
                        return;
                    case 1:
                        zl zlVar = this.f28228b;
                        zlVar.g0(false);
                        zlVar.O.H(null, zlVar.f33416r0, true);
                        zlVar.f33421v0 = true;
                        zlVar.f0();
                        return;
                    default:
                        this.f28228b.f33415r.M(null, null);
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
        addView(linearLayout, w7.w5.d(-1.0f, -1));
        linearLayout.setOnTouchListener(new bi.d(15));
        ImageView imageView2 = new ImageView(context);
        this.f33422w = imageView2;
        imageView2.setImageResource(R.drawable.location_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.W5, this.f30573a), mode));
        linearLayout.addView(imageView2, w7.w5.n(-2, -2));
        TextView textView = new TextView(context);
        this.f33424x = textView;
        int i15 = org.telegram.ui.ActionBar.h6.X5;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i15, this.f30573a));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 17.0f);
        textView.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.w5.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.f33426y = h;
        h.setTextColor(org.telegram.ui.ActionBar.h6.w0(i15, this.f30573a));
        h.setGravity(17);
        h.setTextSize(1, 15.0f);
        h.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(h, w7.w5.t(-2, -2, 17, 0, 6, 0, 0));
        ai.w0 w0Var = new ai.w0(this, context, c6Var, 13);
        this.P = w0Var;
        this.f30575c = w0Var;
        this.d = w0Var;
        this.f30577f = true;
        w0Var.setClipToPadding(false);
        gg.s0 s0Var2 = new gg.s0(context, this.f33427y0, p12, true, c6Var, this.f30574b.O, false, false);
        this.O = s0Var2;
        w0Var.setAdapter(s0Var2);
        aj ajVar3 = this.f30574b;
        if (ajVar3 != null && (ajVar3.H || ajVar3.P)) {
            z12 = true;
        } else {
            z12 = false;
        }
        s0Var2.f10799f0 = z12;
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(js.h);
        jVar.C = false;
        jVar.f47929m = false;
        w0Var.setItemAnimator(jVar);
        s0Var2.O(this.f33398a0, this.W);
        w0Var.setVerticalScrollBarEnabled(false);
        w0Var.p1();
        hg.f0 f0Var2 = new hg.f0(this, w0Var);
        this.T = f0Var2;
        w0Var.setLayoutManager(f0Var2);
        addView(w0Var, w7.w5.e(-1, -1, 51));
        w0Var.setOnScrollListener(new sl(this));
        w0Var.setOnItemClickListener(new km0(this) {
            public final zl f28601b;

            {
                this.f28601b = this;
            }

            @Override
            public final void d(int i16, View view2) {
                switch (r4) {
                    case 0:
                        zl.Q(this.f28601b, eoVar, c6Var, i16);
                        return;
                    default:
                        zl.R(this.f28601b, eoVar, c6Var, i16);
                        return;
                }
            }
        });
        kl klVar = new kl(this, 1);
        s0Var2.H = p12;
        s0Var2.f10554y = klVar;
        s0Var2.P(AndroidUtilities.dp(16.0f) + this.f33428z0);
        addView(f0Var, w7.w5.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.I = onCreateMapView;
        onCreateMapView.setOnDispatchTouchEventInterceptor(new kl(this, 2));
        this.I.setOnInterceptTouchEventInterceptor(new kl(this, 3));
        new Thread(new ol(this, this.I, 1)).start();
        ImageView imageView3 = new ImageView(context);
        this.S = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        f0Var.addView(imageView3, w7.w5.e(28, 48, 49));
        wm0 wm0Var = new wm0(context, c6Var);
        this.Q = wm0Var;
        wm0Var.setSections(true);
        wm0Var.setClipToPadding(false);
        wm0Var.setVisibility(8);
        wm0Var.setLayoutManager(new s4.d0(1, false));
        tl tlVar2 = new tl(this, context, c6Var, this.f30574b.O);
        this.R = tlVar2;
        boolean z13 = this.f33398a0;
        if (tlVar2.M != z13) {
            tlVar2.M = z13;
        }
        kl klVar2 = new kl(this, 7);
        tlVar2.H = 0L;
        tlVar2.f10554y = klVar2;
        wm0Var.setItemAnimator(null);
        addView(wm0Var, w7.w5.e(-1, -1, 51));
        wm0Var.setOnScrollListener(new ai.r(this, 21));
        wm0Var.setOnItemClickListener(new km0(this) {
            public final zl f28601b;

            {
                this.f28601b = this;
            }

            @Override
            public final void d(int i16, View view2) {
                switch (r4) {
                    case 0:
                        zl.Q(this.f28601b, eoVar, c6Var, i16);
                        return;
                    default:
                        zl.R(this.f28601b, eoVar, c6Var, i16);
                        return;
                }
            }
        });
        i0();
    }

    public static void N(zl zlVar, IMapsProvider.IMap iMap) {
        PackageManager packageManager;
        zlVar.H = iMap;
        iMap.setOnMapLoadedCallback(new jl(zlVar, 3));
        if (org.telegram.ui.ActionBar.h6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20559d6, zlVar.f30573a)) < 0.721f) {
            zlVar.U = true;
            zlVar.H.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
        }
        if (zlVar.H != null) {
            Location location = new Location("network");
            zlVar.f33416r0 = location;
            location.setLatitude(20.659322d);
            zlVar.f33416r0.setLongitude(-11.40625d);
            try {
                zlVar.H.setMyLocationEnabled(true);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            zlVar.H.getUiSettings().setMyLocationButtonEnabled(false);
            zlVar.H.getUiSettings().setZoomControlsEnabled(false);
            zlVar.H.getUiSettings().setCompassEnabled(false);
            zlVar.H.setOnCameraMoveStartedListener(new kl(zlVar, 4));
            zlVar.H.setOnCameraIdleListener(new jl(zlVar, 5));
            zlVar.H.setOnMyLocationChangeListener(new ql(zlVar, 1));
            zlVar.H.setOnMarkerClickListener(new kl(zlVar, 5));
            zlVar.H.setOnCameraMoveListener(new jl(zlVar, 6));
            zlVar.c0();
            AndroidUtilities.runOnUIThread(new jl(zlVar, 7), 200L);
            if (zlVar.V && zlVar.getParentActivity() != null) {
                zlVar.V = false;
                Activity parentActivity = zlVar.getParentActivity();
                if (parentActivity == null || (packageManager = parentActivity.getPackageManager()) == null || packageManager.hasSystemFeature("android.hardware.location.gps")) {
                    try {
                        if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(zlVar.getParentActivity(), 0, zlVar.f30573a);
                            alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.L5, zlVar.f30573a), null);
                            alertDialog$Builder.f20141a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                            alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new kl(zlVar, 6));
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
            zlVar.h0();
        }
    }

    public static void O(zl zlVar, org.telegram.ui.eo eoVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.c6 c6Var, Long l4) {
        if (eoVar != null && eoVar.c()) {
            g5.L(zlVar.getParentActivity(), eoVar.a(), new ai.r5(zlVar, tL_messageMediaGeo, l4, 26), c6Var);
            return;
        }
        zlVar.f33425x0.b(tL_messageMediaGeo, zlVar.f33427y0, true, 0, l4.longValue());
        zlVar.f30574b.dismiss(true);
    }

    public static void P(zl zlVar) {
        gg.s0 s0Var = zlVar.O;
        aj ajVar = zlVar.f30574b;
        if (zlVar.f33407j0) {
            int i10 = Build.VERSION.SDK_INT;
            Activity parentActivity = zlVar.getParentActivity();
            if (parentActivity != null) {
                zlVar.f33407j0 = false;
                if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    String[] strArr = (!ajVar.O || ajVar.f24408z2 == null || i10 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
                    zlVar.W = true;
                    if (s0Var != null) {
                        s0Var.O(zlVar.f33398a0, true);
                    }
                    parentActivity.requestPermissions(strArr, 2);
                } else if (i10 >= 29 && ajVar.O && ajVar.f24408z2 != null && parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") != 0) {
                    zlVar.W = true;
                    if (s0Var != null) {
                        s0Var.O(zlVar.f33398a0, true);
                    }
                    parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
                }
            }
        }
    }

    public static void Q(zl zlVar, org.telegram.ui.eo eoVar, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        zl zlVar2;
        org.telegram.ui.eo eoVar2;
        org.telegram.ui.ActionBar.c6 c6Var2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j3 = zlVar.f33400c0;
        gg.s0 s0Var = zlVar.O;
        aj ajVar = zlVar.f30574b;
        int i11 = zlVar.f33427y0;
        if (i11 == 7) {
            if (i10 == 1 && (tL_messageMediaVenue2 = s0Var.f10797d0) != null) {
                zlVar.f33425x0.b(tL_messageMediaVenue2, i11, true, 0, 0L);
                ajVar.dismiss(true);
                return;
            } else if (i10 == 2 && (tL_messageMediaVenue = s0Var.f10798e0) != null) {
                zlVar.f33425x0.b(tL_messageMediaVenue, i11, true, 0, 0L);
                ajVar.dismiss(true);
                return;
            } else {
                zlVar2 = zlVar;
                eoVar2 = eoVar;
                c6Var2 = c6Var;
            }
        } else if (i10 == 1) {
            if (zlVar.f33425x0 != null && zlVar.f33416r0 != null) {
                FrameLayout frameLayout = zlVar.f33406i0;
                if (frameLayout != null) {
                    frameLayout.callOnClick();
                    return;
                }
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(zlVar.f33416r0.getLatitude());
                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(zlVar.f33416r0.getLongitude());
                g5.Z(ajVar.M1, ajVar.l1() + 1, ajVar.p1(), new ai.f4(zlVar, eoVar, tL_messageMediaGeo, c6Var, 6));
                return;
            } else if (zlVar.f33398a0) {
                g5.C(zlVar.getParentActivity()).show();
                return;
            } else {
                return;
            }
        } else {
            zlVar2 = zlVar;
            eoVar2 = eoVar;
            c6Var2 = c6Var;
            if (i10 == 2 && i11 == 1) {
                if (zlVar2.getLocationController().isSharingLocation(j3)) {
                    zlVar2.getLocationController().removeSharingLocation(j3);
                    ajVar.dismiss(true);
                    return;
                } else if (zlVar2.f33414q0 == null && zlVar2.f33398a0) {
                    g5.C(zlVar2.getParentActivity()).show();
                    return;
                } else {
                    zlVar2.b0();
                    return;
                }
            }
        }
        Object J = s0Var.J(i10);
        if (J instanceof TLRPC.TL_messageMediaVenue) {
            g5.Z(ajVar.M1, ajVar.l1() + 1, ajVar.p1(), new ai.f4(zlVar2, eoVar2, (TLRPC.TL_messageMediaVenue) J, c6Var2, 7));
        }
    }

    public static void R(zl zlVar, org.telegram.ui.eo eoVar, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        TLRPC.TL_messageMediaVenue I = zlVar.R.I(i10);
        if (I != null && zlVar.f33425x0 != null) {
            if (eoVar != null && eoVar.c()) {
                g5.L(zlVar.getParentActivity(), eoVar.a(), new pl(zlVar, I, 0), c6Var);
                return;
            }
            zlVar.f33425x0.b(I, zlVar.f33427y0, true, 0, 0L);
            zlVar.f30574b.dismiss(true);
        }
    }

    public static void S(zl zlVar, org.telegram.ui.eo eoVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.c6 c6Var) {
        if (eoVar != null && eoVar.c()) {
            g5.L(zlVar.getParentActivity(), eoVar.a(), new pl(zlVar, tL_messageMediaVenue, 1), c6Var);
            return;
        }
        zlVar.f33425x0.b(tL_messageMediaVenue, zlVar.f33427y0, true, 0, 0L);
        zlVar.f30574b.dismiss(true);
    }

    public static void T(zl zlVar) {
        gg.s0 s0Var = zlVar.O;
        ImageView imageView = zlVar.f33410n;
        Activity parentActivity = zlVar.getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            g5.C(zlVar.getParentActivity()).show();
            return;
        }
        if (zlVar.f33414q0 != null && zlVar.H != null) {
            int i10 = org.telegram.ui.ActionBar.h6.vi;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.w0(i10, zlVar.f30573a), PorterDuff.Mode.MULTIPLY));
            imageView.setTag(Integer.valueOf(i10));
            s0Var.L(null);
            zlVar.f33420u0 = false;
            zlVar.g0(false);
            zlVar.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(zlVar.f33414q0.getLatitude(), zlVar.f33414q0.getLongitude())));
            if (zlVar.f33421v0) {
                Location location = zlVar.f33414q0;
                if (location != null && zlVar.f33427y0 != 8) {
                    s0Var.H(null, location, true);
                }
                zlVar.f33421v0 = false;
                zlVar.f0();
            }
        }
        if (zlVar.f33404g0 != null) {
            zlVar.S.setVisibility(0);
            wl wlVar = zlVar.F;
            IMapsProvider.IMarker iMarker = zlVar.f33404g0;
            HashMap hashMap = wlVar.f32433a;
            View view = (View) hashMap.get(iMarker);
            if (view != null) {
                wlVar.removeView(view);
                hashMap.remove(iMarker);
            }
            zlVar.f33404g0 = null;
            zlVar.f33405h0 = null;
            zlVar.f33406i0 = null;
        }
    }

    public static void U(zl zlVar, Location location) {
        int i10;
        aj ajVar = zlVar.f30574b;
        if (ajVar != null && ajVar.f24342f0 != null) {
            zlVar.d0(location);
            gg.s0 s0Var = zlVar.O;
            if (s0Var != null && (((i10 = zlVar.f33427y0) == 7 || i10 == 8) && !zlVar.f33420u0)) {
                s0Var.L(zlVar.f33416r0);
            }
            zlVar.getLocationController().setMapLocation(location, zlVar.f33399b0);
            zlVar.f33399b0 = false;
        }
    }

    public static void V(zl zlVar, IMapsProvider.IMapView iMapView) {
        if (zlVar.I != null && zlVar.getParentActivity() != null) {
            try {
                iMapView.onCreate(null);
                ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                zlVar.I.getMapAsync(new ql(zlVar, 0));
                zlVar.f33412o0 = true;
                if (zlVar.f33413p0) {
                    zlVar.I.onResume();
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public static void W(zl zlVar) {
        if (zlVar.getParentActivity() != null) {
            try {
                zlVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
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
        return this.f30574b.f24342f0.getLocationController();
    }

    private MessagesController getMessagesController() {
        return this.f30574b.f24342f0.getMessagesController();
    }

    public Activity getParentActivity() {
        org.telegram.ui.ActionBar.m2 m2Var;
        aj ajVar = this.f30574b;
        if (ajVar != null && (m2Var = ajVar.f24342f0) != null) {
            return m2Var.getParentActivity();
        }
        return null;
    }

    private UserConfig getUserConfig() {
        return this.f30574b.f24342f0.getUserConfig();
    }

    @Override
    public final void A() {
        IMapsProvider.IMapView iMapView = this.I;
        if (iMapView != null && this.f33412o0) {
            try {
                iMapView.onPause();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        this.f33413p0 = false;
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.zl.B(int, int):void");
    }

    @Override
    public final void D() {
        IMapsProvider.IMapView iMapView = this.I;
        if (iMapView != null && this.f33412o0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.f33413p0 = true;
    }

    @Override
    public final void G(si siVar) {
        long j3;
        aj ajVar = this.f30574b;
        ajVar.f24325a1.setTitle(LocaleController.getString(R.string.ShareLocation));
        if (this.I.getView().getParent() == null) {
            View view = this.I.getView();
            FrameLayout.LayoutParams e7 = w7.w5.e(-1, AndroidUtilities.dp(10.0f) + this.f33428z0, 51);
            ai.f0 f0Var = this.N;
            f0Var.addView(view, 0, e7);
            f0Var.addView(this.F, 1, w7.w5.e(-1, AndroidUtilities.dp(10.0f) + this.f33428z0, 51));
            f0Var.addView(this.M, 2, w7.w5.d(-1.0f, -1));
        }
        this.E.setVisibility(0);
        IMapsProvider.IMapView iMapView = this.I;
        if (iMapView != null && this.f33412o0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.f33413p0 = true;
        IMapsProvider.IMap iMap = this.H;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        Z();
        boolean g02 = ajVar.f24333c2.g0();
        jl jlVar = new jl(this, 1);
        if (g02) {
            j3 = 200;
        } else {
            j3 = 0;
        }
        AndroidUtilities.runOnUIThread(jlVar, j3);
        this.T.h1(0, 0);
        h0();
    }

    @Override
    public final void J() {
        this.P.x0(0);
    }

    @Override
    public final boolean L() {
        return !this.f33398a0;
    }

    public final Bitmap Y(int i10) {
        Bitmap[] bitmapArr = this.D0;
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

    public final void Z() {
        int i10;
        FrameLayout.LayoutParams layoutParams;
        if (getMeasuredHeight() != 0 && this.I != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            int i11 = AndroidUtilities.displaySize.y - currentActionBarHeight;
            int dp = AndroidUtilities.dp(66.0f);
            int i12 = this.f33427y0;
            if (i12 == 1 || i12 == 7 || i12 == 8) {
                dp += AndroidUtilities.dp(66.0f);
            }
            int dp2 = (i11 - dp) - AndroidUtilities.dp(90.0f);
            int dp3 = AndroidUtilities.dp(189.0f);
            this.f33428z0 = dp3;
            if (!this.f33398a0 || !a0()) {
                dp2 = Math.min(AndroidUtilities.dp(310.0f), dp2);
            }
            this.A0 = Math.max(dp3, dp2);
            if (this.f33398a0 && a0()) {
                this.f33428z0 = this.A0;
            }
            ai.w0 w0Var = this.P;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) w0Var.getLayoutParams();
            layoutParams2.topMargin = currentActionBarHeight;
            w0Var.setLayoutParams(layoutParams2);
            ai.f0 f0Var = this.N;
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) f0Var.getLayoutParams();
            layoutParams3.topMargin = currentActionBarHeight;
            layoutParams3.height = this.A0;
            f0Var.setLayoutParams(layoutParams3);
            wm0 wm0Var = this.Q;
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) wm0Var.getLayoutParams();
            layoutParams4.topMargin = currentActionBarHeight;
            wm0Var.setLayoutParams(layoutParams4);
            if (this.f33398a0 && a0()) {
                i10 = this.f33428z0 - w0Var.getPaddingTop();
            } else {
                i10 = this.f33428z0;
            }
            int dp4 = AndroidUtilities.dp(16.0f) + i10;
            gg.s0 s0Var = this.O;
            s0Var.P(dp4);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.I.getView().getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.height = AndroidUtilities.dp(10.0f) + this.A0;
                this.I.getView().setLayoutParams(layoutParams5);
            }
            wl wlVar = this.F;
            if (wlVar != null && (layoutParams = (FrameLayout.LayoutParams) wlVar.getLayoutParams()) != null) {
                layoutParams.height = AndroidUtilities.dp(10.0f) + this.A0;
                wlVar.setLayoutParams(layoutParams);
            }
            s0Var.l();
            h0();
        }
    }

    public final boolean a0() {
        int i10 = this.f33427y0;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final void b0() {
        TLRPC.User user;
        Activity parentActivity;
        if (this.f33425x0 != null && getParentActivity() != null && this.f33414q0 != null) {
            boolean z10 = this.f33408k0;
            org.telegram.ui.ActionBar.c6 c6Var = this.f30573a;
            if (z10 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
                this.f33408k0 = false;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                    globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                    g5.k(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new jl(this, 2), c6Var).o();
                    return;
                }
            }
            long j3 = this.f33400c0;
            if (DialogObject.isUserDialog(j3)) {
                user = this.f30574b.f24342f0.getMessagesController().getUser(Long.valueOf(j3));
            } else {
                user = null;
            }
            g5.D(getParentActivity(), false, user, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i10) {
                    zl zlVar = zl.this;
                    aj ajVar = zlVar.f30574b;
                    g5.Z(ajVar.M1, ajVar.l1() + 1, ajVar.p1(), new ci.k4(zlVar, i10, 4));
                }
            }, c6Var).show();
        }
    }

    public final void c0() {
        zl zlVar;
        aj ajVar = this.f30574b;
        if (ajVar.O) {
            if (ajVar.A2 != null) {
                AndroidUtilities.runOnUIThread(new jl(this, 0));
                return;
            } else if (!this.f33398a0) {
                File file = ajVar.f24408z2;
                boolean z10 = ajVar.f24405y2;
                if (file != null) {
                    if (z10) {
                        try {
                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                            String extractMetadata = mediaMetadataRetriever.extractMetadata(23);
                            if (extractMetadata != null) {
                                Matcher matcher = Pattern.compile("([+\\-][0-9.]+)([+\\-][0-9.]+)").matcher(extractMetadata);
                                if (matcher.find() && matcher.groupCount() == 2) {
                                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.v7(this, Double.parseDouble(matcher.group(1)), Double.parseDouble(matcher.group(2)), 2));
                                    return;
                                }
                            }
                        } catch (NumberFormatException | Exception unused) {
                        }
                    } else {
                        zlVar = this;
                        ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                        float[] fArr = new float[2];
                        if (exifInterface.getLatLong(fArr)) {
                            AndroidUtilities.runOnUIThread(new md(18, this, fArr));
                            return;
                        }
                        Location lastLocation = getLastLocation();
                        zlVar.f33414q0 = lastLocation;
                        d0(lastLocation);
                        return;
                    }
                }
                zlVar = this;
                Location lastLocation2 = getLastLocation();
                zlVar.f33414q0 = lastLocation2;
                d0(lastLocation2);
                return;
            } else {
                AndroidUtilities.runOnUIThread(new jl(this, 8));
                return;
            }
        }
        Location lastLocation3 = getLastLocation();
        this.f33414q0 = lastLocation3;
        d0(lastLocation3);
    }

    public final void d0(Location location) {
        if (location != null) {
            Location location2 = new Location(location);
            this.f33414q0 = location2;
            IMapsProvider.IMap iMap = this.H;
            gg.s0 s0Var = this.O;
            if (iMap != null) {
                IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
                if (s0Var != null) {
                    if (!this.f33421v0 && this.f33427y0 != 8) {
                        s0Var.H(null, this.f33414q0, true);
                    }
                    s0Var.M(this.f33414q0);
                }
                if (!this.f33420u0) {
                    this.f33416r0 = new Location(location);
                    if (this.f33423w0) {
                        this.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                        return;
                    }
                    this.f33423w0 = true;
                    this.H.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.H.getMaxZoomLevel() - 4.0f));
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
        tl tlVar = this.R;
        gg.s0 s0Var = this.O;
        int i13 = 0;
        if (i10 == i12) {
            this.f33398a0 = false;
            this.W = false;
            c0();
            if (s0Var != null) {
                s0Var.O(this.f33398a0, this.W);
            }
            if (tlVar != null && tlVar.M != (z11 = this.f33398a0)) {
                tlVar.M = z11;
            }
            IMapsProvider.IMap iMap = this.H;
            if (iMap != null) {
                try {
                    iMap.setMyLocationEnabled(true);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        } else if (i10 == NotificationCenter.locationPermissionDenied) {
            this.f33398a0 = true;
            this.W = false;
            if (s0Var != null) {
                s0Var.O(true, false);
            }
            if (tlVar != null && tlVar.M != (z10 = this.f33398a0)) {
                tlVar.M = z10;
            }
        }
        Z();
        boolean z12 = this.f33398a0;
        aj ajVar = this.f30574b;
        if (z12 && !ajVar.O) {
            i13 = 8;
        } else {
            ajVar.getClass();
        }
        this.E.setVisibility(i13);
    }

    public final void e0(double d, double d10) {
        IMapsProvider.ICameraUpdate newCameraUpdateLatLngZoom;
        if (this.H != null) {
            int i10 = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
            if (i10 != 0 && d10 != 0.0d) {
                Location location = new Location("");
                this.f33416r0 = location;
                location.reset();
                this.f33416r0.setLatitude(d);
                this.f33416r0.setLongitude(d10);
            } else {
                Location location2 = new Location("");
                this.f33414q0 = location2;
                location2.reset();
                this.f33414q0.setLatitude(d);
                this.f33414q0.setLongitude(d10);
            }
            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(d, d10);
            if (i10 != 0 && d10 != 0.0d) {
                newCameraUpdateLatLngZoom = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.H.getMaxZoomLevel() - 4.0f);
            } else {
                newCameraUpdateLatLngZoom = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.H.getMinZoomLevel());
            }
            this.J = newCameraUpdateLatLngZoom;
            this.H.moveCamera(newCameraUpdateLatLngZoom);
            gg.s0 s0Var = this.O;
            if (i10 != 0 && d10 != 0.0d) {
                s0Var.L(this.f33416r0);
            } else {
                s0Var.M(this.f33414q0);
            }
            s0Var.I();
            this.P.v0(0, 1, null);
            this.f33419t0 = true;
            if (i10 != 0 && d10 != 0.0d) {
                this.f33420u0 = true;
                g0(false);
                if (this.f33427y0 != 8) {
                    s0Var.H(null, this.f33416r0, true);
                }
                this.f33421v0 = true;
                f0();
            }
        }
    }

    public final void f0() {
        if (this.O.h() != 0 && this.T.L0() == 0) {
            ai.w0 w0Var = this.P;
            View childAt = w0Var.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top >= 0 && top <= AndroidUtilities.dp(258.0f)) {
                w0Var.v0(0, top, null);
            }
        }
    }

    public final void g0(boolean z10) {
        int i10;
        Integer num;
        float f7;
        Location location;
        Location location2;
        if (this.f33398a0) {
            z10 = false;
        }
        xl xlVar = this.f33417s;
        if (z10 && xlVar != null && xlVar.getTag() == null && ((location = this.f33414q0) == null || (location2 = this.f33416r0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        if (this.f33427y0 == 8) {
            z10 = false;
        }
        if (xlVar != null) {
            if (!z10 || xlVar.getTag() == null) {
                if (z10 || xlVar.getTag() != null) {
                    if (z10) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    xlVar.setVisibility(i10);
                    if (z10) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    xlVar.setTag(num);
                    AnimatorSet animatorSet = new AnimatorSet();
                    if (z10) {
                        f7 = 0.0f;
                    } else {
                        f7 = -AndroidUtilities.dp(80.0f);
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(xlVar, View.TRANSLATION_X, f7));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(js.f27628g);
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
        ai.w0 w0Var = this.P;
        if (w0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        gm0 gm0Var = (gm0) w0Var.K(0);
        if (gm0Var != null) {
            i10 = Math.max(((int) gm0Var.f47889a.getY()) - this.C0, 0);
        }
        return AndroidUtilities.dp(56.0f) + i10;
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.P.getPaddingTop();
    }

    @Override
    public ArrayList<org.telegram.ui.ActionBar.j6> getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList<org.telegram.ui.ActionBar.j6> arrayList = new ArrayList<>();
        a7 a7Var = new a7(this, 2);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.N, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f20630h5));
        int i10 = org.telegram.ui.ActionBar.h6.A5;
        ai.w0 w0Var = this.P;
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 32768, null, null, null, null, i10));
        org.telegram.ui.ActionBar.u0 u0Var = this.E;
        if (u0Var != null) {
            editTextBoldCursor = u0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(editTextBoldCursor, 16777216, null, null, null, null, org.telegram.ui.ActionBar.h6.f20667j5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f20650i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f20681k0, null, null, org.telegram.ui.ActionBar.h6.f20560d7));
        int i11 = org.telegram.ui.ActionBar.h6.W5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33422w, 8, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33424x, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33426y, 4, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.h6.ui;
        ImageView imageView = this.f33410n;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 262152, null, null, null, null, i13));
        int i14 = org.telegram.ui.ActionBar.h6.vi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 262152, null, null, null, null, i14));
        int i15 = org.telegram.ui.ActionBar.h6.wi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 32, null, null, null, null, i15));
        int i16 = org.telegram.ui.ActionBar.h6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 65568, null, null, null, null, i16));
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f33415r;
        arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var2, 0, null, null, null, a7Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var2, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var2, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33417s, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33417s, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f33417s, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, org.telegram.ui.ActionBar.h6.f20812r0, a7Var, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.si));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 393216, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20754ni));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 393216, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20810qi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 393248, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20736mi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 393248, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20791pi));
        int i17 = org.telegram.ui.ActionBar.h6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"accurateTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 262144, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20829ri));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 262144, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20772oi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"buttonTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 131072, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 196608, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20523b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 48, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20503a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20743n5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
        wm0 wm0Var = this.Q;
        arrayList.add(new org.telegram.ui.ActionBar.j6(wm0Var, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(wm0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(wm0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.w7.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.w7.class}, new String[]{"distanceTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f20631h6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 8, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView2"}, null, null, -1, null, i12));
        return arrayList;
    }

    public final void h0() {
        ai.f0 f0Var;
        int i10;
        int i11;
        IMapsProvider.LatLng latLng;
        Location location;
        IMapsProvider.IMap iMap;
        if (this.I != null && (f0Var = this.N) != null) {
            ai.w0 w0Var = this.P;
            s4.d1 K = w0Var.K(0);
            if (K != null) {
                i10 = (int) K.f47889a.getY();
                i11 = Math.min(i10, 0) + this.f33428z0;
            } else {
                i10 = -f0Var.getMeasuredHeight();
                i11 = 0;
            }
            if (((FrameLayout.LayoutParams) f0Var.getLayoutParams()) != null) {
                wl wlVar = this.F;
                if (i11 <= 0) {
                    if (this.I.getView().getVisibility() == 0) {
                        this.I.getView().setVisibility(4);
                        f0Var.setVisibility(4);
                        if (wlVar != null) {
                            wlVar.setVisibility(4);
                        }
                    }
                    this.I.getView().setTranslationY(i10);
                    return;
                }
                if (this.I.getView().getVisibility() == 4) {
                    this.I.getView().setVisibility(0);
                    f0Var.setVisibility(0);
                    if (wlVar != null) {
                        wlVar.setVisibility(0);
                    }
                }
                int max = Math.max(0, (-((i10 - this.A0) + this.f33428z0)) / 2);
                int i12 = this.A0 - this.f33428z0;
                float max2 = 1.0f - Math.max(0.0f, Math.min(1.0f, (w0Var.getPaddingTop() - i10) / (w0Var.getPaddingTop() - i12)));
                int i13 = this.B0;
                if (this.f33398a0 && a0()) {
                    i12 += Math.min(i10, w0Var.getPaddingTop());
                }
                this.B0 = (int) (i12 * max2);
                float f7 = max;
                this.I.getView().setTranslationY(f7);
                this.C0 = i12 - this.B0;
                f0Var.invalidate();
                f0Var.setTranslationY(i10 - this.C0);
                IMapsProvider.IMap iMap2 = this.H;
                if (iMap2 != null) {
                    iMap2.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f) + this.B0);
                }
                if (wlVar != null) {
                    wlVar.setTranslationY(f7);
                }
                int max3 = Math.max(this.C0 - i10, 0);
                int i14 = this.A0;
                org.telegram.ui.ActionBar.u0 u0Var = this.f33415r;
                float min = Math.min(max3, (i14 - u0Var.getMeasuredHeight()) - AndroidUtilities.dp(80.0f));
                u0Var.setTranslationY(min);
                xl xlVar = this.f33417s;
                xlVar.f32807c = min;
                xlVar.setTranslationY(min + xlVar.f32806b);
                this.f33410n.setTranslationY(-this.B0);
                int D = org.telegram.messenger.am.D(48.0f, (this.A0 - this.B0) / 2, max);
                this.f33418s0 = D;
                this.S.setTranslationY(D);
                if (i13 != this.B0) {
                    IMapsProvider.IMarker iMarker = this.f33404g0;
                    if (iMarker != null) {
                        latLng = new IMapsProvider.LatLng(iMarker.getPosition().latitude, this.f33404g0.getPosition().longitude);
                    } else if (this.f33420u0 && (location = this.f33416r0) != null) {
                        latLng = new IMapsProvider.LatLng(location.getLatitude(), this.f33416r0.getLongitude());
                    } else {
                        Location location2 = this.f33414q0;
                        if (location2 != null) {
                            latLng = new IMapsProvider.LatLng(location2.getLatitude(), this.f33414q0.getLongitude());
                        } else {
                            latLng = null;
                        }
                    }
                    if (latLng != null && (iMap = this.H) != null) {
                        iMap.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                    }
                }
                if (this.f33398a0 && a0()) {
                    int h = this.O.h();
                    for (int i15 = 1; i15 < h; i15++) {
                        s4.d1 K2 = w0Var.K(i15);
                        if (K2 != null) {
                            K2.f47889a.setTranslationY(w0Var.getPaddingTop() - i10);
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
        boolean z10 = this.f33409l0;
        LinearLayout linearLayout = this.v;
        if (z10) {
            boolean z11 = this.f33411n0;
            wm0 wm0Var = this.Q;
            if (z11) {
                wm0Var.setEmptyView(null);
                linearLayout.setVisibility(8);
                return;
            }
            wm0Var.setEmptyView(linearLayout);
            return;
        }
        linearLayout.setVisibility(8);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            Z();
        }
    }

    @Override
    public final void p() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionDenied);
        this.G = true;
        ai.f0 f0Var = this.N;
        if (f0Var != null) {
            f0Var.invalidate();
        }
        try {
            IMapsProvider.IMap iMap = this.H;
            if (iMap != null) {
                iMap.setMyLocationEnabled(false);
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        IMapsProvider.IMapView iMapView = this.I;
        if (iMapView != null) {
            iMapView.getView().setTranslationY((-AndroidUtilities.displaySize.y) * 3);
        }
        try {
            IMapsProvider.IMapView iMapView2 = this.I;
            if (iMapView2 != null) {
                iMapView2.onPause();
            }
        } catch (Exception unused) {
        }
        try {
            IMapsProvider.IMapView iMapView3 = this.I;
            if (iMapView3 != null) {
                iMapView3.onDestroy();
                this.I = null;
            }
        } catch (Exception unused2) {
        }
        gg.s0 s0Var = this.O;
        if (s0Var != null) {
            s0Var.F();
        }
        tl tlVar = this.R;
        if (tlVar != null) {
            tlVar.F();
        }
        aj ajVar = this.f30574b;
        ajVar.f24325a1.i(true);
        ajVar.f24325a1.p().removeView(this.E);
    }

    @Override
    public final boolean q() {
        p();
        return false;
    }

    public void setDelegate(ul ulVar) {
        this.f33425x0 = ulVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30574b.getSheetContainer().invalidate();
        h0();
    }

    @Override
    public final void u() {
        this.E.setVisibility(8);
    }

    @Override
    public final void y() {
        boolean z10;
        aj ajVar = this.f30574b;
        if (ajVar != null && !ajVar.isKeyboardVisible()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.O.f10796c0 = z10;
    }

    @Override
    public final void z(int i10, boolean z10) {
        if (z10) {
            this.O.f10796c0 = false;
        }
    }
}
