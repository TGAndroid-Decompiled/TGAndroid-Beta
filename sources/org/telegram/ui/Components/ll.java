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
public final class ll extends qi implements NotificationCenter.NotificationCenterDelegate {
    public static final int E0 = 0;
    public int A0;
    public int B0;
    public int C0;
    public final Bitmap[] D0;
    public final org.telegram.ui.ActionBar.w0 E;
    public final il F;
    public boolean G;
    public IMapsProvider.IMap H;
    public IMapsProvider.IMapView I;
    public IMapsProvider.ICameraUpdate J;
    public float K;
    public boolean L;
    public final View M;
    public final bi.ld N;
    public final fg.t0 O;
    public final bi.y1 P;
    public final vl0 Q;
    public final fl R;
    public final ImageView S;
    public final gg.j0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean f25024a0;
    public boolean f25025b0;
    public final long f25026c0;
    public final Paint f25027d0;
    public final ArrayList f25028e0;
    public AnimatorSet f25029f0;
    public IMapsProvider.IMarker f25030g0;
    public kl f25031h0;
    public FrameLayout f25032i0;
    public boolean f25033j0;
    public boolean f25034k0;
    public boolean f25035l0;
    public boolean m0;
    public final ImageView f25036n;
    public boolean f25037n0;
    public boolean f25038o0;
    public boolean f25039p0;
    public Location f25040q0;
    public final org.telegram.ui.ActionBar.w0 f25041r;
    public Location f25042r0;
    public final jl f25043s;
    public int f25044s0;
    public boolean f25045t0;
    public boolean f25046u0;
    public final LinearLayout v;
    public boolean f25047v0;
    public final ImageView f25048w;
    public boolean f25049w0;
    public final TextView f25050x;
    public gl f25051x0;
    public final TextView f25052y;
    public final int f25053y0;
    public int f25054z0;

    public ll(yi yiVar, Context context, final org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, f6Var, yiVar);
        final org.telegram.ui.eo eoVar;
        boolean z11;
        int i10;
        boolean z12;
        this.V = true;
        this.W = false;
        this.f25024a0 = false;
        this.f25025b0 = true;
        this.f25027d0 = new Paint();
        this.f25028e0 = new ArrayList();
        this.f25033j0 = true;
        this.f25034k0 = true;
        int currentActionBarHeight = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.f25054z0 = currentActionBarHeight;
        this.A0 = currentActionBarHeight;
        this.D0 = new Bitmap[7];
        AndroidUtilities.fixGoogleMapsBug();
        yi yiVar2 = this.f26422b;
        org.telegram.ui.ActionBar.p2 p2Var = yiVar2.f29366f0;
        if (p2Var instanceof org.telegram.ui.eo) {
            eoVar = (org.telegram.ui.eo) p2Var;
        } else {
            eoVar = null;
        }
        long n12 = yiVar2.n1();
        this.f25026c0 = n12;
        if (this.f26422b.O) {
            this.f25053y0 = 7;
        } else if (z10 && eoVar != null && eoVar.h == null && !eoVar.c() && !UserObject.isUserSelf(eoVar.i())) {
            this.f25053y0 = 1;
        } else {
            this.f25053y0 = 0;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        this.m0 = false;
        this.f25035l0 = false;
        this.f25037n0 = false;
        fg.t0 t0Var = this.O;
        if (t0Var != null) {
            t0Var.F();
        }
        fl flVar = this.R;
        if (flVar != null) {
            flVar.F();
        }
        if (Build.VERSION.SDK_INT >= 23 && getParentActivity() != null && getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f25024a0 = z11;
        org.telegram.ui.ActionBar.z n10 = this.f26422b.X0.n();
        this.F = new il(this, context);
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new gg.m2(this, 6);
        this.E = a2;
        if (this.f25024a0 && !this.f26422b.O) {
            i10 = 8;
        } else {
            this.f26422b.getClass();
            i10 = 0;
        }
        a2.setVisibility(i10);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i11 = org.telegram.ui.ActionBar.j6.f18034j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, this.f26421a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i11, this.f26421a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Vd, this.f26421a));
        new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f)).gravity = 83;
        bi.ld ldVar = new bi.ld(this, context, 7);
        this.N = ldVar;
        ldVar.setWillNotDraw(false);
        View view = new View(context);
        this.M = view;
        view.setBackgroundDrawable(new dd(org.telegram.ui.ActionBar.j6.A0().q()));
        jl jlVar = new jl(context, 0);
        this.f25043s = jlVar;
        jlVar.setTranslationX(-AndroidUtilities.dp(80.0f));
        jlVar.setVisibility(4);
        int dp = AndroidUtilities.dp(40.0f);
        int i12 = org.telegram.ui.ActionBar.j6.wi;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i12, this.f26421a);
        int i13 = org.telegram.ui.ActionBar.j6.xi;
        int v03 = org.telegram.ui.ActionBar.j6.v0(i13, this.f26421a);
        org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v02, v03, v03);
        w7.c6.a(jlVar);
        jlVar.setTranslationZ(AndroidUtilities.dp(2.0f));
        bi.g gVar = xf.k0.f45156a;
        jlVar.setOutlineProvider(gVar);
        jlVar.setBackground(i02);
        int i14 = org.telegram.ui.ActionBar.j6.vi;
        jlVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, this.f26421a));
        jlVar.setTextSize(1, 14.0f);
        jlVar.setTypeface(AndroidUtilities.bold());
        jlVar.setText(LocaleController.getString(R.string.PlacesInThisArea));
        jlVar.setGravity(17);
        jlVar.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        ldVar.addView(jlVar, w7.a6.d(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
        jlVar.setOnClickListener(new View.OnClickListener(this) {
            public final ll f29068b;

            {
                this.f29068b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        ll.Q(this.f29068b);
                        return;
                    case 1:
                        ll llVar = this.f29068b;
                        llVar.d0(false);
                        llVar.O.H(null, llVar.f25042r0, true);
                        llVar.f25047v0 = true;
                        llVar.c0();
                        return;
                    default:
                        this.f29068b.f25041r.M(null, null);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ui, this.f26421a), false, f6Var);
        this.f25041r = w0Var;
        w0Var.setClickable(true);
        w0Var.setSubMenuOpenSide(2);
        w0Var.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        w0Var.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        w0Var.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), f6Var);
        w0Var.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), f6Var);
        w0Var.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), f6Var);
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.j6.v0(i12, this.f26421a), org.telegram.ui.ActionBar.j6.v0(i13, this.f26421a));
        w7.c6.a(w0Var);
        w0Var.setTranslationZ(AndroidUtilities.dp(2.0f));
        w0Var.setOutlineProvider(gVar);
        w0Var.setBackground(h02);
        w0Var.setIcon(R.drawable.msg_map_type);
        ldVar.addView(w0Var, w7.a6.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        w0Var.setOnClickListener(new View.OnClickListener(this) {
            public final ll f29068b;

            {
                this.f29068b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        ll.Q(this.f29068b);
                        return;
                    case 1:
                        ll llVar = this.f29068b;
                        llVar.d0(false);
                        llVar.O.H(null, llVar.f25042r0, true);
                        llVar.f25047v0 = true;
                        llVar.c0();
                        return;
                    default:
                        this.f29068b.f25041r.M(null, null);
                        return;
                }
            }
        });
        w0Var.setDelegate(new wk(this, 0));
        ImageView imageView = new ImageView(context);
        this.f25036n = imageView;
        org.telegram.ui.Cells.z h03 = org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.j6.v0(i12, this.f26421a), org.telegram.ui.ActionBar.j6.v0(i13, this.f26421a));
        w7.c6.a(imageView);
        imageView.setTranslationZ(AndroidUtilities.dp(2.0f));
        imageView.setOutlineProvider(gVar);
        imageView.setBackground(h03);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int v04 = org.telegram.ui.ActionBar.j6.v0(i14, this.f26421a);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v04, mode));
        imageView.setTag(Integer.valueOf(i14));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        ldVar.addView(imageView, w7.a6.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ll f29068b;

            {
                this.f29068b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        ll.Q(this.f29068b);
                        return;
                    case 1:
                        ll llVar = this.f29068b;
                        llVar.d0(false);
                        llVar.O.H(null, llVar.f25042r0, true);
                        llVar.f25047v0 = true;
                        llVar.c0();
                        return;
                    default:
                        this.f29068b.f25041r.M(null, null);
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
        addView(linearLayout, w7.a6.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new ai.h(15));
        ImageView imageView2 = new ImageView(context);
        this.f25048w = imageView2;
        imageView2.setImageResource(R.drawable.location_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W5, this.f26421a), mode));
        linearLayout.addView(imageView2, w7.a6.n(-2, -2));
        TextView textView = new TextView(context);
        this.f25050x = textView;
        int i15 = org.telegram.ui.ActionBar.j6.X5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, this.f26421a));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 17.0f);
        textView.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView g10 = com.google.android.gms.internal.vision.e2.g(linearLayout, textView, w7.a6.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.f25052y = g10;
        g10.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, this.f26421a));
        g10.setGravity(17);
        g10.setTextSize(1, 15.0f);
        g10.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(g10, w7.a6.t(-2, -2, 17, 0, 6, 0, 0));
        bi.y1 y1Var = new bi.y1(this, context, f6Var, 12);
        this.P = y1Var;
        this.f26423c = y1Var;
        this.d = y1Var;
        this.f26424f = true;
        y1Var.setClipToPadding(false);
        fg.t0 t0Var2 = new fg.t0(context, this.f25053y0, n12, true, f6Var, this.f26422b.O, false, false);
        this.O = t0Var2;
        y1Var.setAdapter(t0Var2);
        yi yiVar3 = this.f26422b;
        if (yiVar3 != null && (yiVar3.H || yiVar3.P)) {
            z12 = true;
        } else {
            z12 = false;
        }
        t0Var2.f8219f0 = z12;
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(wr.h);
        jVar.C = false;
        jVar.f41645m = false;
        y1Var.setItemAnimator(jVar);
        t0Var2.O(this.f25024a0, this.W);
        y1Var.setVerticalScrollBarEnabled(false);
        y1Var.o1();
        gg.j0 j0Var = new gg.j0(this, y1Var);
        this.T = j0Var;
        y1Var.setLayoutManager(j0Var);
        addView(y1Var, w7.a6.e(-1, -1, 51));
        y1Var.setOnScrollListener(new el(this));
        y1Var.setOnItemClickListener(new jl0(this) {
            public final ll f29441b;

            {
                this.f29441b = this;
            }

            @Override
            public final void d(int i16, View view2) {
                switch (r4) {
                    case 0:
                        ll.N(this.f29441b, eoVar, f6Var, i16);
                        return;
                    default:
                        ll.O(this.f29441b, eoVar, f6Var, i16);
                        return;
                }
            }
        });
        wk wkVar = new wk(this, 1);
        t0Var2.H = n12;
        t0Var2.f7967y = wkVar;
        t0Var2.P(AndroidUtilities.dp(16.0f) + this.f25054z0);
        addView(ldVar, w7.a6.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.I = onCreateMapView;
        onCreateMapView.setOnDispatchTouchEventInterceptor(new wk(this, 2));
        this.I.setOnInterceptTouchEventInterceptor(new wk(this, 3));
        new Thread(new al(this, this.I, 1)).start();
        ImageView imageView3 = new ImageView(context);
        this.S = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        ldVar.addView(imageView3, w7.a6.e(28, 48, 49));
        vl0 vl0Var = new vl0(context, f6Var);
        this.Q = vl0Var;
        vl0Var.setSections(true);
        vl0Var.setClipToPadding(false);
        vl0Var.setVisibility(8);
        vl0Var.setLayoutManager(new s4.c0(1, false));
        fl flVar2 = new fl(this, context, f6Var, this.f26422b.O);
        this.R = flVar2;
        boolean z13 = this.f25024a0;
        if (flVar2.M != z13) {
            flVar2.M = z13;
        }
        wk wkVar2 = new wk(this, 7);
        flVar2.H = 0L;
        flVar2.f7967y = wkVar2;
        vl0Var.setItemAnimator(null);
        addView(vl0Var, w7.a6.e(-1, -1, 51));
        vl0Var.setOnScrollListener(new bi.a2(this, 19));
        vl0Var.setOnItemClickListener(new jl0(this) {
            public final ll f29441b;

            {
                this.f29441b = this;
            }

            @Override
            public final void d(int i16, View view2) {
                switch (r4) {
                    case 0:
                        ll.N(this.f29441b, eoVar, f6Var, i16);
                        return;
                    default:
                        ll.O(this.f29441b, eoVar, f6Var, i16);
                        return;
                }
            }
        });
        f0();
    }

    public static void K(ll llVar, IMapsProvider.IMap iMap) {
        PackageManager packageManager;
        llVar.H = iMap;
        iMap.setOnMapLoadedCallback(new vk(llVar, 3));
        if (org.telegram.ui.ActionBar.j6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f17928d6, llVar.f26421a)) < 0.721f) {
            llVar.U = true;
            llVar.H.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
        }
        if (llVar.H != null) {
            Location location = new Location("network");
            llVar.f25042r0 = location;
            location.setLatitude(20.659322d);
            llVar.f25042r0.setLongitude(-11.40625d);
            try {
                llVar.H.setMyLocationEnabled(true);
            } catch (Exception e) {
                FileLog.e(e);
            }
            llVar.H.getUiSettings().setMyLocationButtonEnabled(false);
            llVar.H.getUiSettings().setZoomControlsEnabled(false);
            llVar.H.getUiSettings().setCompassEnabled(false);
            llVar.H.setOnCameraMoveStartedListener(new wk(llVar, 4));
            llVar.H.setOnCameraIdleListener(new vk(llVar, 5));
            llVar.H.setOnMyLocationChangeListener(new cl(llVar, 1));
            llVar.H.setOnMarkerClickListener(new wk(llVar, 5));
            llVar.H.setOnCameraMoveListener(new vk(llVar, 6));
            llVar.Z();
            AndroidUtilities.runOnUIThread(new vk(llVar, 7), 200L);
            if (llVar.V && llVar.getParentActivity() != null) {
                llVar.V = false;
                Activity parentActivity = llVar.getParentActivity();
                if (parentActivity == null || (packageManager = parentActivity.getPackageManager()) == null || packageManager.hasSystemFeature("android.hardware.location.gps")) {
                    try {
                        if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(llVar.getParentActivity(), 0, llVar.f26421a);
                            alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L5, llVar.f26421a), null);
                            alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                            alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new wk(llVar, 6));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                } else {
                    return;
                }
            }
            llVar.e0();
        }
    }

    public static void L(ll llVar, org.telegram.ui.eo eoVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.f6 f6Var, Long l4) {
        if (eoVar != null && eoVar.c()) {
            d5.M(llVar.getParentActivity(), eoVar.a(), new androidx.car.app.utils.a(llVar, tL_messageMediaGeo, l4, 23), f6Var);
            return;
        }
        llVar.f25051x0.b(tL_messageMediaGeo, llVar.f25053y0, true, 0, l4.longValue());
        llVar.f26422b.dismiss(true);
    }

    public static void M(ll llVar) {
        int i10;
        Activity parentActivity;
        fg.t0 t0Var = llVar.O;
        yi yiVar = llVar.f26422b;
        if (llVar.f25033j0 && (i10 = Build.VERSION.SDK_INT) >= 23 && (parentActivity = llVar.getParentActivity()) != null) {
            llVar.f25033j0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                String[] strArr = (!yiVar.O || yiVar.f29421w2 == null || i10 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
                llVar.W = true;
                if (t0Var != null) {
                    t0Var.O(llVar.f25024a0, true);
                }
                parentActivity.requestPermissions(strArr, 2);
            } else if (i10 >= 29 && yiVar.O && yiVar.f29421w2 != null && parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") != 0) {
                llVar.W = true;
                if (t0Var != null) {
                    t0Var.O(llVar.f25024a0, true);
                }
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
            }
        }
    }

    public static void N(ll llVar, org.telegram.ui.eo eoVar, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        ll llVar2;
        org.telegram.ui.eo eoVar2;
        org.telegram.ui.ActionBar.f6 f6Var2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j3 = llVar.f25026c0;
        fg.t0 t0Var = llVar.O;
        yi yiVar = llVar.f26422b;
        int i11 = llVar.f25053y0;
        if (i11 == 7) {
            if (i10 == 1 && (tL_messageMediaVenue2 = t0Var.f8217d0) != null) {
                llVar.f25051x0.b(tL_messageMediaVenue2, i11, true, 0, 0L);
                yiVar.dismiss(true);
                return;
            } else if (i10 == 2 && (tL_messageMediaVenue = t0Var.f8218e0) != null) {
                llVar.f25051x0.b(tL_messageMediaVenue, i11, true, 0, 0L);
                yiVar.dismiss(true);
                return;
            } else {
                llVar2 = llVar;
                eoVar2 = eoVar;
                f6Var2 = f6Var;
            }
        } else if (i10 == 1) {
            if (llVar.f25051x0 != null && llVar.f25042r0 != null) {
                FrameLayout frameLayout = llVar.f25032i0;
                if (frameLayout != null) {
                    frameLayout.callOnClick();
                    return;
                }
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(llVar.f25042r0.getLatitude());
                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(llVar.f25042r0.getLongitude());
                d5.a0(yiVar.J1, yiVar.j1() + 1, yiVar.n1(), new gg.u1(llVar, eoVar, tL_messageMediaGeo, f6Var, 3));
                return;
            } else if (llVar.f25024a0) {
                d5.D(llVar.getParentActivity()).show();
                return;
            } else {
                return;
            }
        } else {
            llVar2 = llVar;
            eoVar2 = eoVar;
            f6Var2 = f6Var;
            if (i10 == 2 && i11 == 1) {
                if (llVar2.getLocationController().isSharingLocation(j3)) {
                    llVar2.getLocationController().removeSharingLocation(j3);
                    yiVar.dismiss(true);
                    return;
                } else if (llVar2.f25040q0 == null && llVar2.f25024a0) {
                    d5.D(llVar2.getParentActivity()).show();
                    return;
                } else {
                    llVar2.Y();
                    return;
                }
            }
        }
        Object J = t0Var.J(i10);
        if (J instanceof TLRPC.TL_messageMediaVenue) {
            d5.a0(yiVar.J1, yiVar.j1() + 1, yiVar.n1(), new gg.u1(llVar2, eoVar2, (TLRPC.TL_messageMediaVenue) J, f6Var2, 4));
        }
    }

    public static void O(ll llVar, org.telegram.ui.eo eoVar, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        TLRPC.TL_messageMediaVenue I = llVar.R.I(i10);
        if (I != null && llVar.f25051x0 != null) {
            if (eoVar != null && eoVar.c()) {
                d5.M(llVar.getParentActivity(), eoVar.a(), new bl(llVar, I, 0), f6Var);
                return;
            }
            llVar.f25051x0.b(I, llVar.f25053y0, true, 0, 0L);
            llVar.f26422b.dismiss(true);
        }
    }

    public static void P(ll llVar, org.telegram.ui.eo eoVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.f6 f6Var) {
        if (eoVar != null && eoVar.c()) {
            d5.M(llVar.getParentActivity(), eoVar.a(), new bl(llVar, tL_messageMediaVenue, 1), f6Var);
            return;
        }
        llVar.f25051x0.b(tL_messageMediaVenue, llVar.f25053y0, true, 0, 0L);
        llVar.f26422b.dismiss(true);
    }

    public static void Q(ll llVar) {
        Activity parentActivity;
        fg.t0 t0Var = llVar.O;
        ImageView imageView = llVar.f25036n;
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = llVar.getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            d5.D(llVar.getParentActivity()).show();
            return;
        }
        if (llVar.f25040q0 != null && llVar.H != null) {
            int i10 = org.telegram.ui.ActionBar.j6.vi;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, llVar.f26421a), PorterDuff.Mode.MULTIPLY));
            imageView.setTag(Integer.valueOf(i10));
            t0Var.L(null);
            llVar.f25046u0 = false;
            llVar.d0(false);
            llVar.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(llVar.f25040q0.getLatitude(), llVar.f25040q0.getLongitude())));
            if (llVar.f25047v0) {
                Location location = llVar.f25040q0;
                if (location != null && llVar.f25053y0 != 8) {
                    t0Var.H(null, location, true);
                }
                llVar.f25047v0 = false;
                llVar.c0();
            }
        }
        if (llVar.f25030g0 != null) {
            llVar.S.setVisibility(0);
            il ilVar = llVar.F;
            IMapsProvider.IMarker iMarker = llVar.f25030g0;
            HashMap hashMap = ilVar.f24041a;
            View view = (View) hashMap.get(iMarker);
            if (view != null) {
                ilVar.removeView(view);
                hashMap.remove(iMarker);
            }
            llVar.f25030g0 = null;
            llVar.f25031h0 = null;
            llVar.f25032i0 = null;
        }
    }

    public static void R(ll llVar, Location location) {
        int i10;
        yi yiVar = llVar.f26422b;
        if (yiVar != null && yiVar.f29366f0 != null) {
            llVar.a0(location);
            fg.t0 t0Var = llVar.O;
            if (t0Var != null && (((i10 = llVar.f25053y0) == 7 || i10 == 8) && !llVar.f25046u0)) {
                t0Var.L(llVar.f25042r0);
            }
            llVar.getLocationController().setMapLocation(location, llVar.f25025b0);
            llVar.f25025b0 = false;
        }
    }

    public static void S(ll llVar, IMapsProvider.IMapView iMapView) {
        if (llVar.I != null && llVar.getParentActivity() != null) {
            try {
                iMapView.onCreate(null);
                ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                llVar.I.getMapAsync(new cl(llVar, 0));
                llVar.f25038o0 = true;
                if (llVar.f25039p0) {
                    llVar.I.onResume();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void T(ll llVar) {
        if (llVar.getParentActivity() != null) {
            try {
                llVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
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
        return this.f26422b.f29366f0.getLocationController();
    }

    private MessagesController getMessagesController() {
        return this.f26422b.f29366f0.getMessagesController();
    }

    public Activity getParentActivity() {
        org.telegram.ui.ActionBar.p2 p2Var;
        yi yiVar = this.f26422b;
        if (yiVar != null && (p2Var = yiVar.f29366f0) != null) {
            return p2Var.getParentActivity();
        }
        return null;
    }

    private UserConfig getUserConfig() {
        return this.f26422b.f29366f0.getUserConfig();
    }

    @Override
    public final void D(qi qiVar) {
        long j3;
        yi yiVar = this.f26422b;
        yiVar.X0.setTitle(LocaleController.getString(R.string.ShareLocation));
        if (this.I.getView().getParent() == null) {
            View view = this.I.getView();
            FrameLayout.LayoutParams e = w7.a6.e(-1, AndroidUtilities.dp(10.0f) + this.f25054z0, 51);
            bi.ld ldVar = this.N;
            ldVar.addView(view, 0, e);
            ldVar.addView(this.F, 1, w7.a6.e(-1, AndroidUtilities.dp(10.0f) + this.f25054z0, 51));
            ldVar.addView(this.M, 2, w7.a6.c(-1.0f, -1));
        }
        this.E.setVisibility(0);
        IMapsProvider.IMapView iMapView = this.I;
        if (iMapView != null && this.f25038o0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.f25039p0 = true;
        IMapsProvider.IMap iMap = this.H;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        W();
        boolean e02 = yiVar.Z1.e0();
        vk vkVar = new vk(this, 1);
        if (e02) {
            j3 = 200;
        } else {
            j3 = 0;
        }
        AndroidUtilities.runOnUIThread(vkVar, j3);
        this.T.h1(0, 0);
        e0();
    }

    @Override
    public final void F() {
        this.P.x0(0);
    }

    @Override
    public final boolean J() {
        return !this.f25024a0;
    }

    public final Bitmap V(int i10) {
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

    public final void W() {
        int i10;
        FrameLayout.LayoutParams layoutParams;
        if (getMeasuredHeight() != 0 && this.I != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.l.getCurrentActionBarHeight();
            int i11 = AndroidUtilities.displaySize.y - currentActionBarHeight;
            int dp = AndroidUtilities.dp(66.0f);
            int i12 = this.f25053y0;
            if (i12 == 1 || i12 == 7 || i12 == 8) {
                dp += AndroidUtilities.dp(66.0f);
            }
            int dp2 = (i11 - dp) - AndroidUtilities.dp(90.0f);
            int dp3 = AndroidUtilities.dp(189.0f);
            this.f25054z0 = dp3;
            if (!this.f25024a0 || !X()) {
                dp2 = Math.min(AndroidUtilities.dp(310.0f), dp2);
            }
            this.A0 = Math.max(dp3, dp2);
            if (this.f25024a0 && X()) {
                this.f25054z0 = this.A0;
            }
            bi.y1 y1Var = this.P;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) y1Var.getLayoutParams();
            layoutParams2.topMargin = currentActionBarHeight;
            y1Var.setLayoutParams(layoutParams2);
            bi.ld ldVar = this.N;
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) ldVar.getLayoutParams();
            layoutParams3.topMargin = currentActionBarHeight;
            layoutParams3.height = this.A0;
            ldVar.setLayoutParams(layoutParams3);
            vl0 vl0Var = this.Q;
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) vl0Var.getLayoutParams();
            layoutParams4.topMargin = currentActionBarHeight;
            vl0Var.setLayoutParams(layoutParams4);
            if (this.f25024a0 && X()) {
                i10 = this.f25054z0 - y1Var.getPaddingTop();
            } else {
                i10 = this.f25054z0;
            }
            int dp4 = AndroidUtilities.dp(16.0f) + i10;
            fg.t0 t0Var = this.O;
            t0Var.P(dp4);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.I.getView().getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.height = AndroidUtilities.dp(10.0f) + this.A0;
                this.I.getView().setLayoutParams(layoutParams5);
            }
            il ilVar = this.F;
            if (ilVar != null && (layoutParams = (FrameLayout.LayoutParams) ilVar.getLayoutParams()) != null) {
                layoutParams.height = AndroidUtilities.dp(10.0f) + this.A0;
                ilVar.setLayoutParams(layoutParams);
            }
            t0Var.l();
            e0();
        }
    }

    public final boolean X() {
        int i10 = this.f25053y0;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final void Y() {
        TLRPC.User user;
        Activity parentActivity;
        if (this.f25051x0 != null && getParentActivity() != null && this.f25040q0 != null) {
            boolean z10 = this.f25034k0;
            org.telegram.ui.ActionBar.f6 f6Var = this.f26421a;
            if (z10 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
                this.f25034k0 = false;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                    globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                    d5.l(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new vk(this, 2), f6Var).o();
                    return;
                }
            }
            long j3 = this.f25026c0;
            if (DialogObject.isUserDialog(j3)) {
                user = this.f26422b.f29366f0.getMessagesController().getUser(Long.valueOf(j3));
            } else {
                user = null;
            }
            d5.E(getParentActivity(), false, user, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i10) {
                    ll llVar = ll.this;
                    yi yiVar = llVar.f26422b;
                    d5.a0(yiVar.J1, yiVar.j1() + 1, yiVar.n1(), new bi.c8(llVar, i10, 3));
                }
            }, f6Var).show();
        }
    }

    public final void Z() {
        ll llVar;
        yi yiVar = this.f26422b;
        if (yiVar.O) {
            if (yiVar.f29425x2 != null) {
                AndroidUtilities.runOnUIThread(new vk(this, 0));
                return;
            } else if (!this.f25024a0) {
                File file = yiVar.f29421w2;
                boolean z10 = yiVar.f29417v2;
                if (file != null) {
                    if (z10) {
                        try {
                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                            String extractMetadata = mediaMetadataRetriever.extractMetadata(23);
                            if (extractMetadata != null) {
                                Matcher matcher = Pattern.compile("([+\\-][0-9.]+)([+\\-][0-9.]+)").matcher(extractMetadata);
                                if (matcher.find() && matcher.groupCount() == 2) {
                                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.w7(this, Double.parseDouble(matcher.group(1)), Double.parseDouble(matcher.group(2)), 2));
                                    return;
                                }
                            }
                        } catch (NumberFormatException | Exception unused) {
                        }
                    } else {
                        llVar = this;
                        ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                        float[] fArr = new float[2];
                        if (exifInterface.getLatLong(fArr)) {
                            AndroidUtilities.runOnUIThread(new ee(13, this, fArr));
                            return;
                        }
                        Location lastLocation = getLastLocation();
                        llVar.f25040q0 = lastLocation;
                        a0(lastLocation);
                        return;
                    }
                }
                llVar = this;
                Location lastLocation2 = getLastLocation();
                llVar.f25040q0 = lastLocation2;
                a0(lastLocation2);
                return;
            } else {
                AndroidUtilities.runOnUIThread(new vk(this, 8));
                return;
            }
        }
        Location lastLocation3 = getLastLocation();
        this.f25040q0 = lastLocation3;
        a0(lastLocation3);
    }

    public final void a0(Location location) {
        if (location != null) {
            Location location2 = new Location(location);
            this.f25040q0 = location2;
            IMapsProvider.IMap iMap = this.H;
            fg.t0 t0Var = this.O;
            if (iMap != null) {
                IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
                if (t0Var != null) {
                    if (!this.f25047v0 && this.f25053y0 != 8) {
                        t0Var.H(null, this.f25040q0, true);
                    }
                    t0Var.M(this.f25040q0);
                }
                if (!this.f25046u0) {
                    this.f25042r0 = new Location(location);
                    if (this.f25049w0) {
                        this.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                        return;
                    }
                    this.f25049w0 = true;
                    this.H.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.H.getMaxZoomLevel() - 4.0f));
                    return;
                }
                return;
            }
            t0Var.M(location2);
        }
    }

    public final void b0(double d, double d10) {
        IMapsProvider.ICameraUpdate newCameraUpdateLatLngZoom;
        if (this.H != null) {
            int i10 = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
            if (i10 != 0 && d10 != 0.0d) {
                Location location = new Location("");
                this.f25042r0 = location;
                location.reset();
                this.f25042r0.setLatitude(d);
                this.f25042r0.setLongitude(d10);
            } else {
                Location location2 = new Location("");
                this.f25040q0 = location2;
                location2.reset();
                this.f25040q0.setLatitude(d);
                this.f25040q0.setLongitude(d10);
            }
            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(d, d10);
            if (i10 != 0 && d10 != 0.0d) {
                newCameraUpdateLatLngZoom = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.H.getMaxZoomLevel() - 4.0f);
            } else {
                newCameraUpdateLatLngZoom = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.H.getMinZoomLevel());
            }
            this.J = newCameraUpdateLatLngZoom;
            this.H.moveCamera(newCameraUpdateLatLngZoom);
            fg.t0 t0Var = this.O;
            if (i10 != 0 && d10 != 0.0d) {
                t0Var.L(this.f25042r0);
            } else {
                t0Var.M(this.f25040q0);
            }
            t0Var.I();
            this.P.v0(0, 1, null);
            this.f25045t0 = true;
            if (i10 != 0 && d10 != 0.0d) {
                this.f25046u0 = true;
                d0(false);
                if (this.f25053y0 != 8) {
                    t0Var.H(null, this.f25042r0, true);
                }
                this.f25047v0 = true;
                c0();
            }
        }
    }

    public final void c0() {
        if (this.O.h() != 0 && this.T.L0() == 0) {
            bi.y1 y1Var = this.P;
            View childAt = y1Var.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top >= 0 && top <= AndroidUtilities.dp(258.0f)) {
                y1Var.v0(0, top, null);
            }
        }
    }

    public final void d0(boolean z10) {
        int i10;
        Integer num;
        float f7;
        Location location;
        Location location2;
        if (this.f25024a0) {
            z10 = false;
        }
        jl jlVar = this.f25043s;
        if (z10 && jlVar != null && jlVar.getTag() == null && ((location = this.f25040q0) == null || (location2 = this.f25042r0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        if (this.f25053y0 == 8) {
            z10 = false;
        }
        if (jlVar != null) {
            if (!z10 || jlVar.getTag() == null) {
                if (z10 || jlVar.getTag() != null) {
                    if (z10) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    jlVar.setVisibility(i10);
                    if (z10) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    jlVar.setTag(num);
                    AnimatorSet animatorSet = new AnimatorSet();
                    if (z10) {
                        f7 = 0.0f;
                    } else {
                        f7 = -AndroidUtilities.dp(80.0f);
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(jlVar, View.TRANSLATION_X, f7));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(wr.f28820g);
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
        fl flVar = this.R;
        fg.t0 t0Var = this.O;
        int i13 = 0;
        if (i10 == i12) {
            this.f25024a0 = false;
            this.W = false;
            Z();
            if (t0Var != null) {
                t0Var.O(this.f25024a0, this.W);
            }
            if (flVar != null && flVar.M != (z11 = this.f25024a0)) {
                flVar.M = z11;
            }
            IMapsProvider.IMap iMap = this.H;
            if (iMap != null) {
                try {
                    iMap.setMyLocationEnabled(true);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } else if (i10 == NotificationCenter.locationPermissionDenied) {
            this.f25024a0 = true;
            this.W = false;
            if (t0Var != null) {
                t0Var.O(true, false);
            }
            if (flVar != null && flVar.M != (z10 = this.f25024a0)) {
                flVar.M = z10;
            }
        }
        W();
        boolean z12 = this.f25024a0;
        yi yiVar = this.f26422b;
        if (z12 && !yiVar.O) {
            i13 = 8;
        } else {
            yiVar.getClass();
        }
        this.E.setVisibility(i13);
    }

    public final void e0() {
        bi.ld ldVar;
        int i10;
        int i11;
        IMapsProvider.LatLng latLng;
        Location location;
        IMapsProvider.IMap iMap;
        if (this.I != null && (ldVar = this.N) != null) {
            bi.y1 y1Var = this.P;
            s4.c1 K = y1Var.K(0);
            if (K != null) {
                i10 = (int) K.f41610a.getY();
                i11 = Math.min(i10, 0) + this.f25054z0;
            } else {
                i10 = -ldVar.getMeasuredHeight();
                i11 = 0;
            }
            if (((FrameLayout.LayoutParams) ldVar.getLayoutParams()) != null) {
                il ilVar = this.F;
                if (i11 <= 0) {
                    if (this.I.getView().getVisibility() == 0) {
                        this.I.getView().setVisibility(4);
                        ldVar.setVisibility(4);
                        if (ilVar != null) {
                            ilVar.setVisibility(4);
                        }
                    }
                    this.I.getView().setTranslationY(i10);
                    return;
                }
                if (this.I.getView().getVisibility() == 4) {
                    this.I.getView().setVisibility(0);
                    ldVar.setVisibility(0);
                    if (ilVar != null) {
                        ilVar.setVisibility(0);
                    }
                }
                int max = Math.max(0, (-((i10 - this.A0) + this.f25054z0)) / 2);
                int i12 = this.A0 - this.f25054z0;
                float max2 = 1.0f - Math.max(0.0f, Math.min(1.0f, (y1Var.getPaddingTop() - i10) / (y1Var.getPaddingTop() - i12)));
                int i13 = this.B0;
                if (this.f25024a0 && X()) {
                    i12 += Math.min(i10, y1Var.getPaddingTop());
                }
                this.B0 = (int) (i12 * max2);
                float f7 = max;
                this.I.getView().setTranslationY(f7);
                this.C0 = i12 - this.B0;
                ldVar.invalidate();
                ldVar.setTranslationY(i10 - this.C0);
                IMapsProvider.IMap iMap2 = this.H;
                if (iMap2 != null) {
                    iMap2.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f) + this.B0);
                }
                if (ilVar != null) {
                    ilVar.setTranslationY(f7);
                }
                int max3 = Math.max(this.C0 - i10, 0);
                int i14 = this.A0;
                org.telegram.ui.ActionBar.w0 w0Var = this.f25041r;
                float min = Math.min(max3, (i14 - w0Var.getMeasuredHeight()) - AndroidUtilities.dp(80.0f));
                w0Var.setTranslationY(min);
                jl jlVar = this.f25043s;
                jlVar.f24437c = min;
                jlVar.setTranslationY(min + jlVar.f24436b);
                this.f25036n.setTranslationY(-this.B0);
                int D = org.telegram.messenger.em.D(48.0f, (this.A0 - this.B0) / 2, max);
                this.f25044s0 = D;
                this.S.setTranslationY(D);
                if (i13 != this.B0) {
                    IMapsProvider.IMarker iMarker = this.f25030g0;
                    if (iMarker != null) {
                        latLng = new IMapsProvider.LatLng(iMarker.getPosition().latitude, this.f25030g0.getPosition().longitude);
                    } else if (this.f25046u0 && (location = this.f25042r0) != null) {
                        latLng = new IMapsProvider.LatLng(location.getLatitude(), this.f25042r0.getLongitude());
                    } else {
                        Location location2 = this.f25040q0;
                        if (location2 != null) {
                            latLng = new IMapsProvider.LatLng(location2.getLatitude(), this.f25040q0.getLongitude());
                        } else {
                            latLng = null;
                        }
                    }
                    if (latLng != null && (iMap = this.H) != null) {
                        iMap.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                    }
                }
                if (this.f25024a0 && X()) {
                    int h = this.O.h();
                    for (int i15 = 1; i15 < h; i15++) {
                        s4.c1 K2 = y1Var.K(i15);
                        if (K2 != null) {
                            K2.f41610a.setTranslationY(y1Var.getPaddingTop() - i10);
                        }
                    }
                }
            }
        }
    }

    public final void f0() {
        boolean z10 = this.f25035l0;
        LinearLayout linearLayout = this.v;
        if (z10) {
            boolean z11 = this.f25037n0;
            vl0 vl0Var = this.Q;
            if (z11) {
                vl0Var.setEmptyView(null);
                linearLayout.setVisibility(8);
                return;
            }
            vl0Var.setEmptyView(linearLayout);
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
        bi.y1 y1Var = this.P;
        if (y1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        fl0 fl0Var = (fl0) y1Var.K(0);
        if (fl0Var != null) {
            i10 = Math.max(((int) fl0Var.f41610a.getY()) - this.C0, 0);
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
    public ArrayList<org.telegram.ui.ActionBar.l6> getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList<org.telegram.ui.ActionBar.l6> arrayList = new ArrayList<>();
        x6 x6Var = new x6(this, 2);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f17998h5));
        int i10 = org.telegram.ui.ActionBar.j6.A5;
        bi.y1 y1Var = this.P;
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 32768, null, null, null, null, i10));
        org.telegram.ui.ActionBar.w0 w0Var = this.E;
        if (w0Var != null) {
            editTextBoldCursor = w0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursor, 16777216, null, null, null, null, org.telegram.ui.ActionBar.j6.f18034j5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f18017i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f18049k0, null, null, org.telegram.ui.ActionBar.j6.f17929d7));
        int i11 = org.telegram.ui.ActionBar.j6.W5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25048w, 8, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25050x, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25052y, 4, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.ui;
        ImageView imageView = this.f25036n;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 262152, null, null, null, null, i13));
        int i14 = org.telegram.ui.ActionBar.j6.vi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 262152, null, null, null, null, i14));
        int i15 = org.telegram.ui.ActionBar.j6.wi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 32, null, null, null, null, i15));
        int i16 = org.telegram.ui.ActionBar.j6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 65568, null, null, null, null, i16));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f25041r;
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var2, 0, null, null, null, x6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var2, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var2, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25043s, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25043s, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f25043s, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, org.telegram.ui.ActionBar.j6.f18174r0, x6Var, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, x6Var, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.si));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 393216, new Class[]{org.telegram.ui.Cells.v6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.ni));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 393216, new Class[]{org.telegram.ui.Cells.v6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.qi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 393248, new Class[]{org.telegram.ui.Cells.v6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.mi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 393248, new Class[]{org.telegram.ui.Cells.v6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.pi));
        int i17 = org.telegram.ui.ActionBar.j6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 0, new Class[]{org.telegram.ui.Cells.v6.class}, new String[]{"accurateTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 262144, new Class[]{org.telegram.ui.Cells.v6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.ri));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 262144, new Class[]{org.telegram.ui.Cells.v6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.oi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"buttonTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 131072, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 196608, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 32, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17892b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 48, new Class[]{org.telegram.ui.Cells.c7.class}, null, null, null, org.telegram.ui.ActionBar.j6.f17872a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f18109n5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
        vl0 vl0Var = this.Q;
        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(vl0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 0, new Class[]{org.telegram.ui.Cells.x7.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 0, new Class[]{org.telegram.ui.Cells.x7.class}, new String[]{"distanceTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f17999h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 8, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(y1Var, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView2"}, null, null, -1, null, i12));
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
        this.G = true;
        bi.ld ldVar = this.N;
        if (ldVar != null) {
            ldVar.invalidate();
        }
        try {
            IMapsProvider.IMap iMap = this.H;
            if (iMap != null) {
                iMap.setMyLocationEnabled(false);
            }
        } catch (Exception e) {
            FileLog.e(e);
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
        fg.t0 t0Var = this.O;
        if (t0Var != null) {
            t0Var.F();
        }
        fl flVar = this.R;
        if (flVar != null) {
            flVar.F();
        }
        yi yiVar = this.f26422b;
        yiVar.X0.h(true);
        yiVar.X0.n().removeView(this.E);
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
        this.E.setVisibility(8);
    }

    public void setDelegate(gl glVar) {
        this.f25051x0 = glVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f26422b.getSheetContainer().invalidate();
        e0();
    }

    @Override
    public final void v() {
        boolean z10;
        yi yiVar = this.f26422b;
        if (yiVar != null && !yiVar.isKeyboardVisible()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.O.f8216c0 = z10;
    }

    @Override
    public final void w(int i10, boolean z10) {
        if (z10) {
            this.O.f8216c0 = false;
        }
    }

    @Override
    public final void x() {
        IMapsProvider.IMapView iMapView = this.I;
        if (iMapView != null && this.f25038o0) {
            try {
                iMapView.onPause();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        this.f25039p0 = false;
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ll.y(int, int):void");
    }

    @Override
    public final void z() {
        IMapsProvider.IMapView iMapView = this.I;
        if (iMapView != null && this.f25038o0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.f25039p0 = true;
    }
}
