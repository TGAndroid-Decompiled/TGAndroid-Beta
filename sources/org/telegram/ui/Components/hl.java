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
public final class hl extends oi implements NotificationCenter.NotificationCenterDelegate {
    public static final int E0 = 0;
    public int A0;
    public int B0;
    public int C0;
    public final Bitmap[] D0;
    public final org.telegram.ui.ActionBar.u0 E;
    public final el F;
    public boolean G;
    public IMapsProvider.IMap H;
    public IMapsProvider.IMapView I;
    public IMapsProvider.ICameraUpdate J;
    public float K;
    public boolean L;
    public final View M;
    public final ai.f0 N;
    public final gg.t0 O;
    public final ai.w0 P;
    public final wl0 Q;
    public final bl R;
    public final ImageView S;
    public final hg.g0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean f24797a0;
    public boolean f24798b0;
    public final long f24799c0;
    public final Paint f24800d0;
    public final ArrayList f24801e0;
    public AnimatorSet f24802f0;
    public IMapsProvider.IMarker f24803g0;
    public gl f24804h0;
    public FrameLayout f24805i0;
    public boolean f24806j0;
    public boolean f24807k0;
    public boolean f24808l0;
    public boolean m0;
    public final ImageView f24809n;
    public boolean f24810n0;
    public boolean f24811o0;
    public boolean f24812p0;
    public Location f24813q0;
    public final org.telegram.ui.ActionBar.u0 f24814r;
    public Location f24815r0;
    public final fl f24816s;
    public int f24817s0;
    public boolean f24818t0;
    public boolean f24819u0;
    public final LinearLayout v;
    public boolean f24820v0;
    public final ImageView f24821w;
    public boolean f24822w0;
    public final TextView f24823x;
    public cl f24824x0;
    public final TextView f24825y;
    public final int f24826y0;
    public int f24827z0;

    public hl(wi wiVar, Context context, final org.telegram.ui.ActionBar.d6 d6Var, boolean z10) {
        super(context, d6Var, wiVar);
        final org.telegram.ui.wn wnVar;
        boolean z11;
        int i10;
        boolean z12;
        this.V = true;
        this.W = false;
        this.f24797a0 = false;
        this.f24798b0 = true;
        this.f24800d0 = new Paint();
        this.f24801e0 = new ArrayList();
        this.f24806j0 = true;
        this.f24807k0 = true;
        int currentActionBarHeight = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.f24827z0 = currentActionBarHeight;
        this.A0 = currentActionBarHeight;
        this.D0 = new Bitmap[7];
        AndroidUtilities.fixGoogleMapsBug();
        wi wiVar2 = this.f27087b;
        org.telegram.ui.ActionBar.m2 m2Var = wiVar2.f30005f0;
        if (m2Var instanceof org.telegram.ui.wn) {
            wnVar = (org.telegram.ui.wn) m2Var;
        } else {
            wnVar = null;
        }
        long n12 = wiVar2.n1();
        this.f24799c0 = n12;
        if (this.f27087b.O) {
            this.f24826y0 = 7;
        } else if (z10 && wnVar != null && wnVar.h == null && !wnVar.c() && !UserObject.isUserSelf(wnVar.i())) {
            this.f24826y0 = 1;
        } else {
            this.f24826y0 = 0;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        this.m0 = false;
        this.f24808l0 = false;
        this.f24810n0 = false;
        gg.t0 t0Var = this.O;
        if (t0Var != null) {
            t0Var.F();
        }
        bl blVar = this.R;
        if (blVar != null) {
            blVar.F();
        }
        if (Build.VERSION.SDK_INT >= 23 && getParentActivity() != null && getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f24797a0 = z11;
        org.telegram.ui.ActionBar.y n10 = this.f27087b.X0.n();
        this.F = new el(this, context);
        org.telegram.ui.ActionBar.u0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 6);
        this.E = a2;
        if (this.f24797a0 && !this.f27087b.O) {
            i10 = 8;
        } else {
            this.f27087b.getClass();
            i10 = 0;
        }
        a2.setVisibility(i10);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i11 = org.telegram.ui.ActionBar.h6.f19165j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.h6.v0(i11, this.f27086a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.h6.v0(i11, this.f27086a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.Vd, this.f27086a));
        new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f)).gravity = 83;
        ai.f0 f0Var = new ai.f0(this, context, 9);
        this.N = f0Var;
        f0Var.setWillNotDraw(false);
        View view = new View(context);
        this.M = view;
        view.setBackgroundDrawable(new ed(org.telegram.ui.ActionBar.h6.A0().q()));
        fl flVar = new fl(context, 0);
        this.f24816s = flVar;
        flVar.setTranslationX(-AndroidUtilities.dp(80.0f));
        flVar.setVisibility(4);
        int dp = AndroidUtilities.dp(40.0f);
        int i12 = org.telegram.ui.ActionBar.h6.wi;
        int v02 = org.telegram.ui.ActionBar.h6.v0(i12, this.f27086a);
        int i13 = org.telegram.ui.ActionBar.h6.xi;
        int v03 = org.telegram.ui.ActionBar.h6.v0(i13, this.f27086a);
        org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.h6.i0(dp, dp, dp, dp, v02, v03, v03);
        w7.a6.a(flVar);
        flVar.setTranslationZ(AndroidUtilities.dp(2.0f));
        ai.k2 k2Var = yf.i0.f47111a;
        flVar.setOutlineProvider(k2Var);
        flVar.setBackground(i02);
        int i14 = org.telegram.ui.ActionBar.h6.vi;
        flVar.setTextColor(org.telegram.ui.ActionBar.h6.v0(i14, this.f27086a));
        flVar.setTextSize(1, 14.0f);
        flVar.setTypeface(AndroidUtilities.bold());
        flVar.setText(LocaleController.getString(R.string.PlacesInThisArea));
        flVar.setGravity(17);
        flVar.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        f0Var.addView(flVar, w7.y5.d(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
        flVar.setOnClickListener(new View.OnClickListener(this) {
            public final hl f28559b;

            {
                this.f28559b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        hl.Q(this.f28559b);
                        return;
                    case 1:
                        hl hlVar = this.f28559b;
                        hlVar.d0(false);
                        hlVar.O.H(null, hlVar.f24815r0, true);
                        hlVar.f24820v0 = true;
                        hlVar.c0();
                        return;
                    default:
                        this.f28559b.f24814r.M(null, null);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, 0, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.ui, this.f27086a), false, d6Var);
        this.f24814r = u0Var;
        u0Var.setClickable(true);
        u0Var.setSubMenuOpenSide(2);
        u0Var.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        u0Var.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        u0Var.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), d6Var);
        u0Var.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), d6Var);
        u0Var.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), d6Var);
        u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.h6.h0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.h6.v0(i12, this.f27086a), org.telegram.ui.ActionBar.h6.v0(i13, this.f27086a));
        w7.a6.a(u0Var);
        u0Var.setTranslationZ(AndroidUtilities.dp(2.0f));
        u0Var.setOutlineProvider(k2Var);
        u0Var.setBackground(h02);
        u0Var.setIcon(R.drawable.msg_map_type);
        f0Var.addView(u0Var, w7.y5.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        u0Var.setOnClickListener(new View.OnClickListener(this) {
            public final hl f28559b;

            {
                this.f28559b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        hl.Q(this.f28559b);
                        return;
                    case 1:
                        hl hlVar = this.f28559b;
                        hlVar.d0(false);
                        hlVar.O.H(null, hlVar.f24815r0, true);
                        hlVar.f24820v0 = true;
                        hlVar.c0();
                        return;
                    default:
                        this.f28559b.f24814r.M(null, null);
                        return;
                }
            }
        });
        u0Var.setDelegate(new sk(this, 0));
        ImageView imageView = new ImageView(context);
        this.f24809n = imageView;
        org.telegram.ui.Cells.z h03 = org.telegram.ui.ActionBar.h6.h0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.h6.v0(i12, this.f27086a), org.telegram.ui.ActionBar.h6.v0(i13, this.f27086a));
        w7.a6.a(imageView);
        imageView.setTranslationZ(AndroidUtilities.dp(2.0f));
        imageView.setOutlineProvider(k2Var);
        imageView.setBackground(h03);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int v04 = org.telegram.ui.ActionBar.h6.v0(i14, this.f27086a);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v04, mode));
        imageView.setTag(Integer.valueOf(i14));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        f0Var.addView(imageView, w7.y5.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final hl f28559b;

            {
                this.f28559b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        hl.Q(this.f28559b);
                        return;
                    case 1:
                        hl hlVar = this.f28559b;
                        hlVar.d0(false);
                        hlVar.O.H(null, hlVar.f24815r0, true);
                        hlVar.f24820v0 = true;
                        hlVar.c0();
                        return;
                    default:
                        this.f28559b.f24814r.M(null, null);
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
        addView(linearLayout, w7.y5.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new bi.d(15));
        ImageView imageView2 = new ImageView(context);
        this.f24821w = imageView2;
        imageView2.setImageResource(R.drawable.location_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.W5, this.f27086a), mode));
        linearLayout.addView(imageView2, w7.y5.n(-2, -2));
        TextView textView = new TextView(context);
        this.f24823x = textView;
        int i15 = org.telegram.ui.ActionBar.h6.X5;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.v0(i15, this.f27086a));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 17.0f);
        textView.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.y5.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.f24825y = h;
        h.setTextColor(org.telegram.ui.ActionBar.h6.v0(i15, this.f27086a));
        h.setGravity(17);
        h.setTextSize(1, 15.0f);
        h.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(h, w7.y5.t(-2, -2, 17, 0, 6, 0, 0));
        ai.w0 w0Var = new ai.w0(this, context, d6Var, 13);
        this.P = w0Var;
        this.f27088c = w0Var;
        this.d = w0Var;
        this.f27089f = true;
        w0Var.setClipToPadding(false);
        gg.t0 t0Var2 = new gg.t0(context, this.f24826y0, n12, true, d6Var, this.f27087b.O, false, false);
        this.O = t0Var2;
        w0Var.setAdapter(t0Var2);
        wi wiVar3 = this.f27087b;
        if (wiVar3 != null && (wiVar3.H || wiVar3.P)) {
            z12 = true;
        } else {
            z12 = false;
        }
        t0Var2.f9916f0 = z12;
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(rr.h);
        jVar.C = false;
        jVar.f42995m = false;
        w0Var.setItemAnimator(jVar);
        t0Var2.O(this.f24797a0, this.W);
        w0Var.setVerticalScrollBarEnabled(false);
        w0Var.p1();
        hg.g0 g0Var = new hg.g0(this, w0Var);
        this.T = g0Var;
        w0Var.setLayoutManager(g0Var);
        addView(w0Var, w7.y5.e(-1, -1, 51));
        w0Var.setOnScrollListener(new al(this));
        w0Var.setOnItemClickListener(new kl0(this) {
            public final hl f28804b;

            {
                this.f28804b = this;
            }

            @Override
            public final void d(int i16, View view2) {
                switch (r4) {
                    case 0:
                        hl.N(this.f28804b, wnVar, d6Var, i16);
                        return;
                    default:
                        hl.O(this.f28804b, wnVar, d6Var, i16);
                        return;
                }
            }
        });
        sk skVar = new sk(this, 1);
        t0Var2.H = n12;
        t0Var2.f9666y = skVar;
        t0Var2.P(AndroidUtilities.dp(16.0f) + this.f24827z0);
        addView(f0Var, w7.y5.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.I = onCreateMapView;
        onCreateMapView.setOnDispatchTouchEventInterceptor(new sk(this, 2));
        this.I.setOnInterceptTouchEventInterceptor(new sk(this, 3));
        new Thread(new wk(this, this.I, 1)).start();
        ImageView imageView3 = new ImageView(context);
        this.S = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        f0Var.addView(imageView3, w7.y5.e(28, 48, 49));
        wl0 wl0Var = new wl0(context, d6Var);
        this.Q = wl0Var;
        wl0Var.setSections(true);
        wl0Var.setClipToPadding(false);
        wl0Var.setVisibility(8);
        wl0Var.setLayoutManager(new s4.c0(1, false));
        bl blVar2 = new bl(this, context, d6Var, this.f27087b.O);
        this.R = blVar2;
        boolean z13 = this.f24797a0;
        if (blVar2.M != z13) {
            blVar2.M = z13;
        }
        sk skVar2 = new sk(this, 7);
        blVar2.H = 0L;
        blVar2.f9666y = skVar2;
        wl0Var.setItemAnimator(null);
        addView(wl0Var, w7.y5.e(-1, -1, 51));
        wl0Var.setOnScrollListener(new ai.r(this, 21));
        wl0Var.setOnItemClickListener(new kl0(this) {
            public final hl f28804b;

            {
                this.f28804b = this;
            }

            @Override
            public final void d(int i16, View view2) {
                switch (r4) {
                    case 0:
                        hl.N(this.f28804b, wnVar, d6Var, i16);
                        return;
                    default:
                        hl.O(this.f28804b, wnVar, d6Var, i16);
                        return;
                }
            }
        });
        f0();
    }

    public static void K(hl hlVar, IMapsProvider.IMap iMap) {
        PackageManager packageManager;
        hlVar.H = iMap;
        iMap.setOnMapLoadedCallback(new rk(hlVar, 3));
        if (org.telegram.ui.ActionBar.h6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19059d6, hlVar.f27086a)) < 0.721f) {
            hlVar.U = true;
            hlVar.H.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
        }
        if (hlVar.H != null) {
            Location location = new Location("network");
            hlVar.f24815r0 = location;
            location.setLatitude(20.659322d);
            hlVar.f24815r0.setLongitude(-11.40625d);
            try {
                hlVar.H.setMyLocationEnabled(true);
            } catch (Exception e) {
                FileLog.e(e);
            }
            hlVar.H.getUiSettings().setMyLocationButtonEnabled(false);
            hlVar.H.getUiSettings().setZoomControlsEnabled(false);
            hlVar.H.getUiSettings().setCompassEnabled(false);
            hlVar.H.setOnCameraMoveStartedListener(new sk(hlVar, 4));
            hlVar.H.setOnCameraIdleListener(new rk(hlVar, 5));
            hlVar.H.setOnMyLocationChangeListener(new yk(hlVar, 1));
            hlVar.H.setOnMarkerClickListener(new sk(hlVar, 5));
            hlVar.H.setOnCameraMoveListener(new rk(hlVar, 6));
            hlVar.Z();
            AndroidUtilities.runOnUIThread(new rk(hlVar, 7), 200L);
            if (hlVar.V && hlVar.getParentActivity() != null) {
                hlVar.V = false;
                Activity parentActivity = hlVar.getParentActivity();
                if (parentActivity == null || (packageManager = parentActivity.getPackageManager()) == null || packageManager.hasSystemFeature("android.hardware.location.gps")) {
                    try {
                        if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(hlVar.getParentActivity(), 0, hlVar.f27086a);
                            alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.L5, hlVar.f27086a), null);
                            alertDialog$Builder.f18661a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                            alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new sk(hlVar, 6));
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
            hlVar.e0();
        }
    }

    public static void L(hl hlVar, org.telegram.ui.wn wnVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.d6 d6Var, Long l4) {
        if (wnVar != null && wnVar.c()) {
            e5.M(hlVar.getParentActivity(), wnVar.a(), new ai.q5(hlVar, tL_messageMediaGeo, l4, 25), d6Var);
            return;
        }
        hlVar.f24824x0.b(tL_messageMediaGeo, hlVar.f24826y0, true, 0, l4.longValue());
        hlVar.f27087b.dismiss(true);
    }

    public static void M(hl hlVar) {
        int i10;
        Activity parentActivity;
        gg.t0 t0Var = hlVar.O;
        wi wiVar = hlVar.f27087b;
        if (hlVar.f24806j0 && (i10 = Build.VERSION.SDK_INT) >= 23 && (parentActivity = hlVar.getParentActivity()) != null) {
            hlVar.f24806j0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                String[] strArr = (!wiVar.O || wiVar.f30060w2 == null || i10 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
                hlVar.W = true;
                if (t0Var != null) {
                    t0Var.O(hlVar.f24797a0, true);
                }
                parentActivity.requestPermissions(strArr, 2);
            } else if (i10 >= 29 && wiVar.O && wiVar.f30060w2 != null && parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") != 0) {
                hlVar.W = true;
                if (t0Var != null) {
                    t0Var.O(hlVar.f24797a0, true);
                }
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
            }
        }
    }

    public static void N(hl hlVar, org.telegram.ui.wn wnVar, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        hl hlVar2;
        org.telegram.ui.wn wnVar2;
        org.telegram.ui.ActionBar.d6 d6Var2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j3 = hlVar.f24799c0;
        gg.t0 t0Var = hlVar.O;
        wi wiVar = hlVar.f27087b;
        int i11 = hlVar.f24826y0;
        if (i11 == 7) {
            if (i10 == 1 && (tL_messageMediaVenue2 = t0Var.f9914d0) != null) {
                hlVar.f24824x0.b(tL_messageMediaVenue2, i11, true, 0, 0L);
                wiVar.dismiss(true);
                return;
            } else if (i10 == 2 && (tL_messageMediaVenue = t0Var.f9915e0) != null) {
                hlVar.f24824x0.b(tL_messageMediaVenue, i11, true, 0, 0L);
                wiVar.dismiss(true);
                return;
            } else {
                hlVar2 = hlVar;
                wnVar2 = wnVar;
                d6Var2 = d6Var;
            }
        } else if (i10 == 1) {
            if (hlVar.f24824x0 != null && hlVar.f24815r0 != null) {
                FrameLayout frameLayout = hlVar.f24805i0;
                if (frameLayout != null) {
                    frameLayout.callOnClick();
                    return;
                }
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(hlVar.f24815r0.getLatitude());
                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(hlVar.f24815r0.getLongitude());
                e5.a0(wiVar.J1, wiVar.j1() + 1, wiVar.n1(), new ai.e4(hlVar, wnVar, tL_messageMediaGeo, d6Var, 6));
                return;
            } else if (hlVar.f24797a0) {
                e5.D(hlVar.getParentActivity()).show();
                return;
            } else {
                return;
            }
        } else {
            hlVar2 = hlVar;
            wnVar2 = wnVar;
            d6Var2 = d6Var;
            if (i10 == 2 && i11 == 1) {
                if (hlVar2.getLocationController().isSharingLocation(j3)) {
                    hlVar2.getLocationController().removeSharingLocation(j3);
                    wiVar.dismiss(true);
                    return;
                } else if (hlVar2.f24813q0 == null && hlVar2.f24797a0) {
                    e5.D(hlVar2.getParentActivity()).show();
                    return;
                } else {
                    hlVar2.Y();
                    return;
                }
            }
        }
        Object J = t0Var.J(i10);
        if (J instanceof TLRPC.TL_messageMediaVenue) {
            e5.a0(wiVar.J1, wiVar.j1() + 1, wiVar.n1(), new ai.e4(hlVar2, wnVar2, (TLRPC.TL_messageMediaVenue) J, d6Var2, 7));
        }
    }

    public static void O(hl hlVar, org.telegram.ui.wn wnVar, org.telegram.ui.ActionBar.d6 d6Var, int i10) {
        TLRPC.TL_messageMediaVenue I = hlVar.R.I(i10);
        if (I != null && hlVar.f24824x0 != null) {
            if (wnVar != null && wnVar.c()) {
                e5.M(hlVar.getParentActivity(), wnVar.a(), new xk(hlVar, I, 0), d6Var);
                return;
            }
            hlVar.f24824x0.b(I, hlVar.f24826y0, true, 0, 0L);
            hlVar.f27087b.dismiss(true);
        }
    }

    public static void P(hl hlVar, org.telegram.ui.wn wnVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.d6 d6Var) {
        if (wnVar != null && wnVar.c()) {
            e5.M(hlVar.getParentActivity(), wnVar.a(), new xk(hlVar, tL_messageMediaVenue, 1), d6Var);
            return;
        }
        hlVar.f24824x0.b(tL_messageMediaVenue, hlVar.f24826y0, true, 0, 0L);
        hlVar.f27087b.dismiss(true);
    }

    public static void Q(hl hlVar) {
        Activity parentActivity;
        gg.t0 t0Var = hlVar.O;
        ImageView imageView = hlVar.f24809n;
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = hlVar.getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            e5.D(hlVar.getParentActivity()).show();
            return;
        }
        if (hlVar.f24813q0 != null && hlVar.H != null) {
            int i10 = org.telegram.ui.ActionBar.h6.vi;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.v0(i10, hlVar.f27086a), PorterDuff.Mode.MULTIPLY));
            imageView.setTag(Integer.valueOf(i10));
            t0Var.L(null);
            hlVar.f24819u0 = false;
            hlVar.d0(false);
            hlVar.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(hlVar.f24813q0.getLatitude(), hlVar.f24813q0.getLongitude())));
            if (hlVar.f24820v0) {
                Location location = hlVar.f24813q0;
                if (location != null && hlVar.f24826y0 != 8) {
                    t0Var.H(null, location, true);
                }
                hlVar.f24820v0 = false;
                hlVar.c0();
            }
        }
        if (hlVar.f24803g0 != null) {
            hlVar.S.setVisibility(0);
            el elVar = hlVar.F;
            IMapsProvider.IMarker iMarker = hlVar.f24803g0;
            HashMap hashMap = elVar.f23969a;
            View view = (View) hashMap.get(iMarker);
            if (view != null) {
                elVar.removeView(view);
                hashMap.remove(iMarker);
            }
            hlVar.f24803g0 = null;
            hlVar.f24804h0 = null;
            hlVar.f24805i0 = null;
        }
    }

    public static void R(hl hlVar, Location location) {
        int i10;
        wi wiVar = hlVar.f27087b;
        if (wiVar != null && wiVar.f30005f0 != null) {
            hlVar.a0(location);
            gg.t0 t0Var = hlVar.O;
            if (t0Var != null && (((i10 = hlVar.f24826y0) == 7 || i10 == 8) && !hlVar.f24819u0)) {
                t0Var.L(hlVar.f24815r0);
            }
            hlVar.getLocationController().setMapLocation(location, hlVar.f24798b0);
            hlVar.f24798b0 = false;
        }
    }

    public static void S(hl hlVar, IMapsProvider.IMapView iMapView) {
        if (hlVar.I != null && hlVar.getParentActivity() != null) {
            try {
                iMapView.onCreate(null);
                ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                hlVar.I.getMapAsync(new yk(hlVar, 0));
                hlVar.f24811o0 = true;
                if (hlVar.f24812p0) {
                    hlVar.I.onResume();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void T(hl hlVar) {
        if (hlVar.getParentActivity() != null) {
            try {
                hlVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
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
        return this.f27087b.f30005f0.getLocationController();
    }

    private MessagesController getMessagesController() {
        return this.f27087b.f30005f0.getMessagesController();
    }

    public Activity getParentActivity() {
        org.telegram.ui.ActionBar.m2 m2Var;
        wi wiVar = this.f27087b;
        if (wiVar != null && (m2Var = wiVar.f30005f0) != null) {
            return m2Var.getParentActivity();
        }
        return null;
    }

    private UserConfig getUserConfig() {
        return this.f27087b.f30005f0.getUserConfig();
    }

    @Override
    public final void E(oi oiVar) {
        long j3;
        wi wiVar = this.f27087b;
        wiVar.X0.setTitle(LocaleController.getString(R.string.ShareLocation));
        if (this.I.getView().getParent() == null) {
            View view = this.I.getView();
            FrameLayout.LayoutParams e = w7.y5.e(-1, AndroidUtilities.dp(10.0f) + this.f24827z0, 51);
            ai.f0 f0Var = this.N;
            f0Var.addView(view, 0, e);
            f0Var.addView(this.F, 1, w7.y5.e(-1, AndroidUtilities.dp(10.0f) + this.f24827z0, 51));
            f0Var.addView(this.M, 2, w7.y5.c(-1.0f, -1));
        }
        this.E.setVisibility(0);
        IMapsProvider.IMapView iMapView = this.I;
        if (iMapView != null && this.f24811o0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.f24812p0 = true;
        IMapsProvider.IMap iMap = this.H;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        W();
        boolean c02 = wiVar.Z1.c0();
        rk rkVar = new rk(this, 1);
        if (c02) {
            j3 = 200;
        } else {
            j3 = 0;
        }
        AndroidUtilities.runOnUIThread(rkVar, j3);
        this.T.h1(0, 0);
        e0();
    }

    @Override
    public final void G() {
        this.P.x0(0);
    }

    @Override
    public final boolean J() {
        return !this.f24797a0;
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
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            int i11 = AndroidUtilities.displaySize.y - currentActionBarHeight;
            int dp = AndroidUtilities.dp(66.0f);
            int i12 = this.f24826y0;
            if (i12 == 1 || i12 == 7 || i12 == 8) {
                dp += AndroidUtilities.dp(66.0f);
            }
            int dp2 = (i11 - dp) - AndroidUtilities.dp(90.0f);
            int dp3 = AndroidUtilities.dp(189.0f);
            this.f24827z0 = dp3;
            if (!this.f24797a0 || !X()) {
                dp2 = Math.min(AndroidUtilities.dp(310.0f), dp2);
            }
            this.A0 = Math.max(dp3, dp2);
            if (this.f24797a0 && X()) {
                this.f24827z0 = this.A0;
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
            wl0 wl0Var = this.Q;
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) wl0Var.getLayoutParams();
            layoutParams4.topMargin = currentActionBarHeight;
            wl0Var.setLayoutParams(layoutParams4);
            if (this.f24797a0 && X()) {
                i10 = this.f24827z0 - w0Var.getPaddingTop();
            } else {
                i10 = this.f24827z0;
            }
            int dp4 = AndroidUtilities.dp(16.0f) + i10;
            gg.t0 t0Var = this.O;
            t0Var.P(dp4);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.I.getView().getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.height = AndroidUtilities.dp(10.0f) + this.A0;
                this.I.getView().setLayoutParams(layoutParams5);
            }
            el elVar = this.F;
            if (elVar != null && (layoutParams = (FrameLayout.LayoutParams) elVar.getLayoutParams()) != null) {
                layoutParams.height = AndroidUtilities.dp(10.0f) + this.A0;
                elVar.setLayoutParams(layoutParams);
            }
            t0Var.l();
            e0();
        }
    }

    public final boolean X() {
        int i10 = this.f24826y0;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final void Y() {
        TLRPC.User user;
        Activity parentActivity;
        if (this.f24824x0 != null && getParentActivity() != null && this.f24813q0 != null) {
            boolean z10 = this.f24807k0;
            org.telegram.ui.ActionBar.d6 d6Var = this.f27086a;
            if (z10 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
                this.f24807k0 = false;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                    globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                    e5.l(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new rk(this, 2), d6Var).o();
                    return;
                }
            }
            long j3 = this.f24799c0;
            if (DialogObject.isUserDialog(j3)) {
                user = this.f27087b.f30005f0.getMessagesController().getUser(Long.valueOf(j3));
            } else {
                user = null;
            }
            e5.E(getParentActivity(), false, user, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i10) {
                    hl hlVar = hl.this;
                    wi wiVar = hlVar.f27087b;
                    e5.a0(wiVar.J1, wiVar.j1() + 1, wiVar.n1(), new ci.l4(hlVar, i10, 4));
                }
            }, d6Var).show();
        }
    }

    public final void Z() {
        hl hlVar;
        wi wiVar = this.f27087b;
        if (wiVar.O) {
            if (wiVar.f30064x2 != null) {
                AndroidUtilities.runOnUIThread(new rk(this, 0));
                return;
            } else if (!this.f24797a0) {
                File file = wiVar.f30060w2;
                boolean z10 = wiVar.f30056v2;
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
                        hlVar = this;
                        ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                        float[] fArr = new float[2];
                        if (exifInterface.getLatLong(fArr)) {
                            AndroidUtilities.runOnUIThread(new kd(15, this, fArr));
                            return;
                        }
                        Location lastLocation = getLastLocation();
                        hlVar.f24813q0 = lastLocation;
                        a0(lastLocation);
                        return;
                    }
                }
                hlVar = this;
                Location lastLocation2 = getLastLocation();
                hlVar.f24813q0 = lastLocation2;
                a0(lastLocation2);
                return;
            } else {
                AndroidUtilities.runOnUIThread(new rk(this, 8));
                return;
            }
        }
        Location lastLocation3 = getLastLocation();
        this.f24813q0 = lastLocation3;
        a0(lastLocation3);
    }

    public final void a0(Location location) {
        if (location != null) {
            Location location2 = new Location(location);
            this.f24813q0 = location2;
            IMapsProvider.IMap iMap = this.H;
            gg.t0 t0Var = this.O;
            if (iMap != null) {
                IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
                if (t0Var != null) {
                    if (!this.f24820v0 && this.f24826y0 != 8) {
                        t0Var.H(null, this.f24813q0, true);
                    }
                    t0Var.M(this.f24813q0);
                }
                if (!this.f24819u0) {
                    this.f24815r0 = new Location(location);
                    if (this.f24822w0) {
                        this.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                        return;
                    }
                    this.f24822w0 = true;
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
                this.f24815r0 = location;
                location.reset();
                this.f24815r0.setLatitude(d);
                this.f24815r0.setLongitude(d10);
            } else {
                Location location2 = new Location("");
                this.f24813q0 = location2;
                location2.reset();
                this.f24813q0.setLatitude(d);
                this.f24813q0.setLongitude(d10);
            }
            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(d, d10);
            if (i10 != 0 && d10 != 0.0d) {
                newCameraUpdateLatLngZoom = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.H.getMaxZoomLevel() - 4.0f);
            } else {
                newCameraUpdateLatLngZoom = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.H.getMinZoomLevel());
            }
            this.J = newCameraUpdateLatLngZoom;
            this.H.moveCamera(newCameraUpdateLatLngZoom);
            gg.t0 t0Var = this.O;
            if (i10 != 0 && d10 != 0.0d) {
                t0Var.L(this.f24815r0);
            } else {
                t0Var.M(this.f24813q0);
            }
            t0Var.I();
            this.P.v0(0, 1, null);
            this.f24818t0 = true;
            if (i10 != 0 && d10 != 0.0d) {
                this.f24819u0 = true;
                d0(false);
                if (this.f24826y0 != 8) {
                    t0Var.H(null, this.f24815r0, true);
                }
                this.f24820v0 = true;
                c0();
            }
        }
    }

    public final void c0() {
        if (this.O.h() != 0 && this.T.L0() == 0) {
            ai.w0 w0Var = this.P;
            View childAt = w0Var.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top >= 0 && top <= AndroidUtilities.dp(258.0f)) {
                w0Var.v0(0, top, null);
            }
        }
    }

    public final void d0(boolean z10) {
        int i10;
        Integer num;
        float f7;
        Location location;
        Location location2;
        if (this.f24797a0) {
            z10 = false;
        }
        fl flVar = this.f24816s;
        if (z10 && flVar != null && flVar.getTag() == null && ((location = this.f24813q0) == null || (location2 = this.f24815r0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        if (this.f24826y0 == 8) {
            z10 = false;
        }
        if (flVar != null) {
            if (!z10 || flVar.getTag() == null) {
                if (z10 || flVar.getTag() != null) {
                    if (z10) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    flVar.setVisibility(i10);
                    if (z10) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    flVar.setTag(num);
                    AnimatorSet animatorSet = new AnimatorSet();
                    if (z10) {
                        f7 = 0.0f;
                    } else {
                        f7 = -AndroidUtilities.dp(80.0f);
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(flVar, View.TRANSLATION_X, f7));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(rr.f28031g);
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
        bl blVar = this.R;
        gg.t0 t0Var = this.O;
        int i13 = 0;
        if (i10 == i12) {
            this.f24797a0 = false;
            this.W = false;
            Z();
            if (t0Var != null) {
                t0Var.O(this.f24797a0, this.W);
            }
            if (blVar != null && blVar.M != (z11 = this.f24797a0)) {
                blVar.M = z11;
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
            this.f24797a0 = true;
            this.W = false;
            if (t0Var != null) {
                t0Var.O(true, false);
            }
            if (blVar != null && blVar.M != (z10 = this.f24797a0)) {
                blVar.M = z10;
            }
        }
        W();
        boolean z12 = this.f24797a0;
        wi wiVar = this.f27087b;
        if (z12 && !wiVar.O) {
            i13 = 8;
        } else {
            wiVar.getClass();
        }
        this.E.setVisibility(i13);
    }

    public final void e0() {
        ai.f0 f0Var;
        int i10;
        int i11;
        IMapsProvider.LatLng latLng;
        Location location;
        IMapsProvider.IMap iMap;
        if (this.I != null && (f0Var = this.N) != null) {
            ai.w0 w0Var = this.P;
            s4.c1 K = w0Var.K(0);
            if (K != null) {
                i10 = (int) K.f42960a.getY();
                i11 = Math.min(i10, 0) + this.f24827z0;
            } else {
                i10 = -f0Var.getMeasuredHeight();
                i11 = 0;
            }
            if (((FrameLayout.LayoutParams) f0Var.getLayoutParams()) != null) {
                el elVar = this.F;
                if (i11 <= 0) {
                    if (this.I.getView().getVisibility() == 0) {
                        this.I.getView().setVisibility(4);
                        f0Var.setVisibility(4);
                        if (elVar != null) {
                            elVar.setVisibility(4);
                        }
                    }
                    this.I.getView().setTranslationY(i10);
                    return;
                }
                if (this.I.getView().getVisibility() == 4) {
                    this.I.getView().setVisibility(0);
                    f0Var.setVisibility(0);
                    if (elVar != null) {
                        elVar.setVisibility(0);
                    }
                }
                int max = Math.max(0, (-((i10 - this.A0) + this.f24827z0)) / 2);
                int i12 = this.A0 - this.f24827z0;
                float max2 = 1.0f - Math.max(0.0f, Math.min(1.0f, (w0Var.getPaddingTop() - i10) / (w0Var.getPaddingTop() - i12)));
                int i13 = this.B0;
                if (this.f24797a0 && X()) {
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
                if (elVar != null) {
                    elVar.setTranslationY(f7);
                }
                int max3 = Math.max(this.C0 - i10, 0);
                int i14 = this.A0;
                org.telegram.ui.ActionBar.u0 u0Var = this.f24814r;
                float min = Math.min(max3, (i14 - u0Var.getMeasuredHeight()) - AndroidUtilities.dp(80.0f));
                u0Var.setTranslationY(min);
                fl flVar = this.f24816s;
                flVar.f24208c = min;
                flVar.setTranslationY(min + flVar.f24207b);
                this.f24809n.setTranslationY(-this.B0);
                int D = org.telegram.messenger.ok.D(48.0f, (this.A0 - this.B0) / 2, max);
                this.f24817s0 = D;
                this.S.setTranslationY(D);
                if (i13 != this.B0) {
                    IMapsProvider.IMarker iMarker = this.f24803g0;
                    if (iMarker != null) {
                        latLng = new IMapsProvider.LatLng(iMarker.getPosition().latitude, this.f24803g0.getPosition().longitude);
                    } else if (this.f24819u0 && (location = this.f24815r0) != null) {
                        latLng = new IMapsProvider.LatLng(location.getLatitude(), this.f24815r0.getLongitude());
                    } else {
                        Location location2 = this.f24813q0;
                        if (location2 != null) {
                            latLng = new IMapsProvider.LatLng(location2.getLatitude(), this.f24813q0.getLongitude());
                        } else {
                            latLng = null;
                        }
                    }
                    if (latLng != null && (iMap = this.H) != null) {
                        iMap.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                    }
                }
                if (this.f24797a0 && X()) {
                    int h = this.O.h();
                    for (int i15 = 1; i15 < h; i15++) {
                        s4.c1 K2 = w0Var.K(i15);
                        if (K2 != null) {
                            K2.f42960a.setTranslationY(w0Var.getPaddingTop() - i10);
                        }
                    }
                }
            }
        }
    }

    public final void f0() {
        boolean z10 = this.f24808l0;
        LinearLayout linearLayout = this.v;
        if (z10) {
            boolean z11 = this.f24810n0;
            wl0 wl0Var = this.Q;
            if (z11) {
                wl0Var.setEmptyView(null);
                linearLayout.setVisibility(8);
                return;
            }
            wl0Var.setEmptyView(linearLayout);
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
        ai.w0 w0Var = this.P;
        if (w0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        gl0 gl0Var = (gl0) w0Var.K(0);
        if (gl0Var != null) {
            i10 = Math.max(((int) gl0Var.f42960a.getY()) - this.C0, 0);
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
        y6 y6Var = new y6(this, 2);
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.N, 1, null, null, null, null, org.telegram.ui.ActionBar.h6.f19129h5));
        int i10 = org.telegram.ui.ActionBar.h6.A5;
        ai.w0 w0Var = this.P;
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 32768, null, null, null, null, i10));
        org.telegram.ui.ActionBar.u0 u0Var = this.E;
        if (u0Var != null) {
            editTextBoldCursor = u0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(editTextBoldCursor, 16777216, null, null, null, null, org.telegram.ui.ActionBar.h6.f19165j5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.h6.f19148i6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.h6.f19180k0, null, null, org.telegram.ui.ActionBar.h6.f19060d7));
        int i11 = org.telegram.ui.ActionBar.h6.W5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f24821w, 8, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.h6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f24823x, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f24825y, 4, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.h6.ui;
        ImageView imageView = this.f24809n;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 262152, null, null, null, null, i13));
        int i14 = org.telegram.ui.ActionBar.h6.vi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 262152, null, null, null, null, i14));
        int i15 = org.telegram.ui.ActionBar.h6.wi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 32, null, null, null, null, i15));
        int i16 = org.telegram.ui.ActionBar.h6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 65568, null, null, null, null, i16));
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f24814r;
        arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var2, 0, null, null, null, y6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var2, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(u0Var2, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f24816s, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f24816s, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f24816s, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, org.telegram.ui.ActionBar.h6.f19310r0, y6Var, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.si));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 393216, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19252ni));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 393216, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.qi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 393248, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19235mi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 393248, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19290pi));
        int i17 = org.telegram.ui.ActionBar.h6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"accurateTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 262144, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.ri));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 262144, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19271oi));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"buttonTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 131072, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 196608, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19023b7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 48, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.h6.f19003a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19242n5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.h6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
        wl0 wl0Var = this.Q;
        arrayList.add(new org.telegram.ui.ActionBar.j6(wl0Var, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(wl0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(wl0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.w7.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.w7.class}, new String[]{"distanceTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.h6.f19130h6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 8, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.j6(w0Var, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView2"}, null, null, -1, null, i12));
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
        ai.f0 f0Var = this.N;
        if (f0Var != null) {
            f0Var.invalidate();
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
        gg.t0 t0Var = this.O;
        if (t0Var != null) {
            t0Var.F();
        }
        bl blVar = this.R;
        if (blVar != null) {
            blVar.F();
        }
        wi wiVar = this.f27087b;
        wiVar.X0.h(true);
        wiVar.X0.n().removeView(this.E);
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

    public void setDelegate(cl clVar) {
        this.f24824x0 = clVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27087b.getSheetContainer().invalidate();
        e0();
    }

    @Override
    public final void v() {
        boolean z10;
        wi wiVar = this.f27087b;
        if (wiVar != null && !wiVar.isKeyboardVisible()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.O.f9913c0 = z10;
    }

    @Override
    public final void w(int i10, boolean z10) {
        if (z10) {
            this.O.f9913c0 = false;
        }
    }

    @Override
    public final void x() {
        IMapsProvider.IMapView iMapView = this.I;
        if (iMapView != null && this.f24811o0) {
            try {
                iMapView.onPause();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        this.f24812p0 = false;
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.hl.y(int, int):void");
    }

    @Override
    public final void z() {
        IMapsProvider.IMapView iMapView = this.I;
        if (iMapView != null && this.f24811o0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.f24812p0 = true;
    }
}
