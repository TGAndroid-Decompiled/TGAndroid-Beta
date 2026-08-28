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
public final class xk extends ci implements NotificationCenter.NotificationCenterDelegate {
    public static final int A0 = 0;
    public final org.telegram.ui.ActionBar.w0 A;
    public final uk B;
    public boolean C;
    public IMapsProvider.IMap D;
    public IMapsProvider.IMapView E;
    public IMapsProvider.ICameraUpdate F;
    public float G;
    public boolean H;
    public final View I;
    public final fh.d2 J;
    public final of.p0 K;
    public final gh.f1 L;
    public final wk0 M;
    public final rk N;
    public final ImageView O;
    public final dj P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public final long V;
    public final Paint W;
    public final ArrayList f34688a0;
    public AnimatorSet f34689b0;
    public IMapsProvider.IMarker f34690c0;
    public wk f34691d0;
    public FrameLayout f34692e0;
    public boolean f34693f0;
    public boolean f34694g0;
    public boolean f34695h0;
    public boolean f34696i0;
    public boolean f34697j0;
    public boolean f34698k0;
    public boolean f34699l0;
    public Location m0;
    public final ImageView f34700n;
    public Location f34701n0;
    public int f34702o0;
    public boolean f34703p0;
    public boolean f34704q0;
    public final org.telegram.ui.ActionBar.w0 f34705r;
    public boolean f34706r0;
    public final vk f34707s;
    public boolean f34708s0;
    public sk f34709t0;
    public final int f34710u0;
    public final LinearLayout v;
    public int f34711v0;
    public final ImageView f34712w;
    public int f34713w0;
    public final TextView f34714x;
    public int f34715x0;
    public final TextView f34716y;
    public int f34717y0;
    public final Bitmap[] f34718z0;

    public xk(ki kiVar, Context context, final org.telegram.ui.ActionBar.b6 b6Var, boolean z10) {
        super(context, b6Var, kiVar);
        final org.telegram.ui.qn qnVar;
        boolean z11;
        int i9;
        boolean z12;
        this.R = true;
        this.S = false;
        this.T = false;
        this.U = true;
        this.W = new Paint();
        this.f34688a0 = new ArrayList();
        this.f34693f0 = true;
        this.f34694g0 = true;
        int currentActionBarHeight = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.f34711v0 = currentActionBarHeight;
        this.f34713w0 = currentActionBarHeight;
        this.f34718z0 = new Bitmap[7];
        AndroidUtilities.fixGoogleMapsBug();
        ki kiVar2 = this.f27493b;
        org.telegram.ui.ActionBar.o2 o2Var = kiVar2.f30099b0;
        if (o2Var instanceof org.telegram.ui.qn) {
            qnVar = (org.telegram.ui.qn) o2Var;
        } else {
            qnVar = null;
        }
        long n12 = kiVar2.n1();
        this.V = n12;
        if (this.f27493b.K) {
            this.f34710u0 = 7;
        } else if (z10 && qnVar != null && qnVar.h == null && !qnVar.c() && !UserObject.isUserSelf(qnVar.i())) {
            this.f34710u0 = 1;
        } else {
            this.f34710u0 = 0;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        this.f34696i0 = false;
        this.f34695h0 = false;
        this.f34697j0 = false;
        of.p0 p0Var = this.K;
        if (p0Var != null) {
            p0Var.F();
        }
        rk rkVar = this.N;
        if (rkVar != null) {
            rkVar.F();
        }
        if (Build.VERSION.SDK_INT >= 23 && getParentActivity() != null && getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.T = z11;
        org.telegram.ui.ActionBar.z n10 = this.f27493b.T0.n();
        this.B = new uk(this, context);
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.D = new org.telegram.ui.cb(this, 5);
        this.A = a2;
        if (this.T && !this.f27493b.K) {
            i9 = 8;
        } else {
            this.f27493b.getClass();
            i9 = 0;
        }
        a2.setVisibility(i9);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i10 = org.telegram.ui.ActionBar.f6.f23108j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.f6.v0(i10, this.f27492a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.f6.v0(i10, this.f27492a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Vd, this.f27492a));
        new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f)).gravity = 83;
        fh.d2 d2Var = new fh.d2(this, context, 12);
        this.J = d2Var;
        d2Var.setWillNotDraw(false);
        View view = new View(context);
        this.I = view;
        view.setBackgroundDrawable(new vc(org.telegram.ui.ActionBar.f6.A0().q()));
        vk vkVar = new vk(context, 0);
        this.f34707s = vkVar;
        vkVar.setTranslationX(-AndroidUtilities.dp(80.0f));
        vkVar.setVisibility(4);
        int dp = AndroidUtilities.dp(40.0f);
        int i11 = org.telegram.ui.ActionBar.f6.wi;
        int v02 = org.telegram.ui.ActionBar.f6.v0(i11, this.f27492a);
        int i12 = org.telegram.ui.ActionBar.f6.xi;
        int v03 = org.telegram.ui.ActionBar.f6.v0(i12, this.f27492a);
        org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, v02, v03, v03);
        g7.g6.a(vkVar);
        vkVar.setTranslationZ(AndroidUtilities.dp(2.0f));
        bg.q1 q1Var = ff.r0.f6254a;
        vkVar.setOutlineProvider(q1Var);
        vkVar.setBackground(i02);
        int i13 = org.telegram.ui.ActionBar.f6.vi;
        vkVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(i13, this.f27492a));
        vkVar.setTextSize(1, 14.0f);
        vkVar.setTypeface(AndroidUtilities.bold());
        vkVar.setText(LocaleController.getString(R.string.PlacesInThisArea));
        vkVar.setGravity(17);
        vkVar.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        d2Var.addView(vkVar, g7.e6.d(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
        vkVar.setOnClickListener(new View.OnClickListener(this) {
            public final xk f29754b;

            {
                this.f29754b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        xk.P(this.f29754b);
                        return;
                    case 1:
                        xk xkVar = this.f29754b;
                        xkVar.c0(false);
                        xkVar.K.H(null, xkVar.f34701n0, true);
                        xkVar.f34706r0 = true;
                        xkVar.b0();
                        return;
                    default:
                        this.f29754b.f34705r.M(null, null);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ui, this.f27492a), false, b6Var);
        this.f34705r = w0Var;
        w0Var.setClickable(true);
        w0Var.setSubMenuOpenSide(2);
        w0Var.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        w0Var.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        w0Var.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), b6Var);
        w0Var.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), b6Var);
        w0Var.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), b6Var);
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.f6.h0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.f6.v0(i11, this.f27492a), org.telegram.ui.ActionBar.f6.v0(i12, this.f27492a));
        g7.g6.a(w0Var);
        w0Var.setTranslationZ(AndroidUtilities.dp(2.0f));
        w0Var.setOutlineProvider(q1Var);
        w0Var.setBackground(h02);
        w0Var.setIcon(R.drawable.msg_map_type);
        d2Var.addView(w0Var, g7.e6.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        w0Var.setOnClickListener(new View.OnClickListener(this) {
            public final xk f29754b;

            {
                this.f29754b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        xk.P(this.f29754b);
                        return;
                    case 1:
                        xk xkVar = this.f29754b;
                        xkVar.c0(false);
                        xkVar.K.H(null, xkVar.f34701n0, true);
                        xkVar.f34706r0 = true;
                        xkVar.b0();
                        return;
                    default:
                        this.f29754b.f34705r.M(null, null);
                        return;
                }
            }
        });
        w0Var.setDelegate(new ik(this, 0));
        ImageView imageView = new ImageView(context);
        this.f34700n = imageView;
        org.telegram.ui.Cells.z h03 = org.telegram.ui.ActionBar.f6.h0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.f6.v0(i11, this.f27492a), org.telegram.ui.ActionBar.f6.v0(i12, this.f27492a));
        g7.g6.a(imageView);
        imageView.setTranslationZ(AndroidUtilities.dp(2.0f));
        imageView.setOutlineProvider(q1Var);
        imageView.setBackground(h03);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int v04 = org.telegram.ui.ActionBar.f6.v0(i13, this.f27492a);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v04, mode));
        imageView.setTag(Integer.valueOf(i13));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        d2Var.addView(imageView, g7.e6.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final xk f29754b;

            {
                this.f29754b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        xk.P(this.f29754b);
                        return;
                    case 1:
                        xk xkVar = this.f29754b;
                        xkVar.c0(false);
                        xkVar.K.H(null, xkVar.f34701n0, true);
                        xkVar.f34706r0 = true;
                        xkVar.b0();
                        return;
                    default:
                        this.f29754b.f34705r.M(null, null);
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
        addView(linearLayout, g7.e6.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new jh.d(15));
        ImageView imageView2 = new ImageView(context);
        this.f34712w = imageView2;
        imageView2.setImageResource(R.drawable.location_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.W5, this.f27492a), mode));
        linearLayout.addView(imageView2, g7.e6.n(-2, -2));
        TextView textView = new TextView(context);
        this.f34714x = textView;
        int i14 = org.telegram.ui.ActionBar.f6.X5;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i14, this.f27492a));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 17.0f);
        textView.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView h = j3.r0.h(linearLayout, textView, g7.e6.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.f34716y = h;
        h.setTextColor(org.telegram.ui.ActionBar.f6.v0(i14, this.f27492a));
        h.setGravity(17);
        h.setTextSize(1, 15.0f);
        h.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(h, g7.e6.t(-2, -2, 17, 0, 6, 0, 0));
        gh.f1 f1Var = new gh.f1(this, context, b6Var, 13);
        this.L = f1Var;
        this.f27494c = f1Var;
        this.d = f1Var;
        this.f27496f = true;
        f1Var.setClipToPadding(false);
        of.p0 p0Var2 = new of.p0(context, this.f34710u0, n12, true, b6Var, this.f27493b.K, false, false);
        this.K = p0Var2;
        f1Var.setAdapter(p0Var2);
        ki kiVar3 = this.f27493b;
        if (kiVar3 != null && (kiVar3.D || kiVar3.L)) {
            z12 = true;
        } else {
            z12 = false;
        }
        p0Var2.f19451b0 = z12;
        f2.n nVar = new f2.n();
        nVar.n(350L);
        nVar.o(gr.h);
        nVar.C = false;
        nVar.f5532m = false;
        f1Var.setItemAnimator(nVar);
        p0Var2.O(this.T, this.S);
        f1Var.setVerticalScrollBarEnabled(false);
        f1Var.p1();
        dj djVar = new dj(this, f1Var);
        this.P = djVar;
        f1Var.setLayoutManager(djVar);
        addView(f1Var, g7.e6.e(-1, -1, 51));
        f1Var.setOnScrollListener(new qk(this));
        f1Var.setOnItemClickListener(new mk0(this) {
            public final xk f30188b;

            {
                this.f30188b = this;
            }

            @Override
            public final void a(int i15, View view2) {
                switch (r4) {
                    case 0:
                        xk.M(this.f30188b, qnVar, b6Var, i15);
                        return;
                    default:
                        xk.N(this.f30188b, qnVar, b6Var, i15);
                        return;
                }
            }
        });
        ik ikVar = new ik(this, 1);
        p0Var2.D = n12;
        p0Var2.f19260y = ikVar;
        p0Var2.P(AndroidUtilities.dp(16.0f) + this.f34711v0);
        addView(d2Var, g7.e6.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.E = onCreateMapView;
        onCreateMapView.setOnDispatchTouchEventInterceptor(new ik(this, 2));
        this.E.setOnInterceptTouchEventInterceptor(new ik(this, 3));
        new Thread(new mk(this, this.E, 1)).start();
        ImageView imageView3 = new ImageView(context);
        this.O = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        d2Var.addView(imageView3, g7.e6.e(28, 48, 49));
        wk0 wk0Var = new wk0(context, b6Var);
        this.M = wk0Var;
        wk0Var.setSections(true);
        wk0Var.setClipToPadding(false);
        wk0Var.setVisibility(8);
        wk0Var.setLayoutManager(new f2.m0(1, false));
        rk rkVar2 = new rk(this, context, b6Var, this.f27493b.K);
        this.N = rkVar2;
        boolean z13 = this.T;
        if (rkVar2.I != z13) {
            rkVar2.I = z13;
        }
        ik ikVar2 = new ik(this, 7);
        rkVar2.D = 0L;
        rkVar2.f19260y = ikVar2;
        wk0Var.setItemAnimator(null);
        addView(wk0Var, g7.e6.e(-1, -1, 51));
        wk0Var.setOnScrollListener(new bg.o2(this, 28));
        wk0Var.setOnItemClickListener(new mk0(this) {
            public final xk f30188b;

            {
                this.f30188b = this;
            }

            @Override
            public final void a(int i15, View view2) {
                switch (r4) {
                    case 0:
                        xk.M(this.f30188b, qnVar, b6Var, i15);
                        return;
                    default:
                        xk.N(this.f30188b, qnVar, b6Var, i15);
                        return;
                }
            }
        });
        e0();
    }

    public static void J(xk xkVar, IMapsProvider.IMap iMap) {
        PackageManager packageManager;
        xkVar.D = iMap;
        iMap.setOnMapLoadedCallback(new hk(xkVar, 3));
        if (org.telegram.ui.ActionBar.f6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, xkVar.f27492a)) < 0.721f) {
            xkVar.Q = true;
            xkVar.D.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
        }
        if (xkVar.D != null) {
            Location location = new Location("network");
            xkVar.f34701n0 = location;
            location.setLatitude(20.659322d);
            xkVar.f34701n0.setLongitude(-11.40625d);
            try {
                xkVar.D.setMyLocationEnabled(true);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            xkVar.D.getUiSettings().setMyLocationButtonEnabled(false);
            xkVar.D.getUiSettings().setZoomControlsEnabled(false);
            xkVar.D.getUiSettings().setCompassEnabled(false);
            xkVar.D.setOnCameraMoveStartedListener(new ik(xkVar, 4));
            xkVar.D.setOnCameraIdleListener(new hk(xkVar, 5));
            xkVar.D.setOnMyLocationChangeListener(new ok(xkVar, 1));
            xkVar.D.setOnMarkerClickListener(new ik(xkVar, 5));
            xkVar.D.setOnCameraMoveListener(new hk(xkVar, 6));
            xkVar.Y();
            AndroidUtilities.runOnUIThread(new hk(xkVar, 7), 200L);
            if (xkVar.R && xkVar.getParentActivity() != null) {
                xkVar.R = false;
                Activity parentActivity = xkVar.getParentActivity();
                if (parentActivity == null || (packageManager = parentActivity.getPackageManager()) == null || packageManager.hasSystemFeature("android.hardware.location.gps")) {
                    try {
                        if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xkVar.getParentActivity(), 0, xkVar.f27492a);
                            alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.L5, xkVar.f27492a), null);
                            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.GpsDisabledAlertText);
                            alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new ik(xkVar, 6));
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
            xkVar.d0();
        }
    }

    public static void K(xk xkVar, org.telegram.ui.qn qnVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.b6 b6Var, Long l10) {
        if (qnVar != null && qnVar.c()) {
            y4.M(xkVar.getParentActivity(), qnVar.a(), new androidx.car.app.utils.a(xkVar, tL_messageMediaGeo, l10, 24), b6Var);
            return;
        }
        xkVar.f34709t0.d(tL_messageMediaGeo, xkVar.f34710u0, true, 0, l10.longValue());
        xkVar.f27493b.dismiss(true);
    }

    public static void L(xk xkVar) {
        int i9;
        Activity parentActivity;
        of.p0 p0Var = xkVar.K;
        ki kiVar = xkVar.f27493b;
        if (xkVar.f34693f0 && (i9 = Build.VERSION.SDK_INT) >= 23 && (parentActivity = xkVar.getParentActivity()) != null) {
            xkVar.f34693f0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                String[] strArr = (!kiVar.K || kiVar.f30156s2 == null || i9 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
                xkVar.S = true;
                if (p0Var != null) {
                    p0Var.O(xkVar.T, true);
                }
                parentActivity.requestPermissions(strArr, 2);
            } else if (i9 >= 29 && kiVar.K && kiVar.f30156s2 != null && parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") != 0) {
                xkVar.S = true;
                if (p0Var != null) {
                    p0Var.O(xkVar.T, true);
                }
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
            }
        }
    }

    public static void M(xk xkVar, org.telegram.ui.qn qnVar, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        xk xkVar2;
        org.telegram.ui.qn qnVar2;
        org.telegram.ui.ActionBar.b6 b6Var2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j10 = xkVar.V;
        of.p0 p0Var = xkVar.K;
        ki kiVar = xkVar.f27493b;
        int i10 = xkVar.f34710u0;
        if (i10 == 7) {
            if (i9 == 1 && (tL_messageMediaVenue2 = p0Var.Z) != null) {
                xkVar.f34709t0.d(tL_messageMediaVenue2, i10, true, 0, 0L);
                kiVar.dismiss(true);
                return;
            } else if (i9 == 2 && (tL_messageMediaVenue = p0Var.f19450a0) != null) {
                xkVar.f34709t0.d(tL_messageMediaVenue, i10, true, 0, 0L);
                kiVar.dismiss(true);
                return;
            } else {
                xkVar2 = xkVar;
                qnVar2 = qnVar;
                b6Var2 = b6Var;
            }
        } else if (i9 == 1) {
            if (xkVar.f34709t0 != null && xkVar.f34701n0 != null) {
                FrameLayout frameLayout = xkVar.f34692e0;
                if (frameLayout != null) {
                    frameLayout.callOnClick();
                    return;
                }
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(xkVar.f34701n0.getLatitude());
                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(xkVar.f34701n0.getLongitude());
                y4.a0(kiVar.F1, kiVar.j1() + 1, kiVar.n1(), new bg.j1(xkVar, qnVar, tL_messageMediaGeo, b6Var, 7));
                return;
            } else if (xkVar.T) {
                y4.D(xkVar.getParentActivity()).show();
                return;
            } else {
                return;
            }
        } else {
            xkVar2 = xkVar;
            qnVar2 = qnVar;
            b6Var2 = b6Var;
            if (i9 == 2 && i10 == 1) {
                if (xkVar2.getLocationController().isSharingLocation(j10)) {
                    xkVar2.getLocationController().removeSharingLocation(j10);
                    kiVar.dismiss(true);
                    return;
                } else if (xkVar2.m0 == null && xkVar2.T) {
                    y4.D(xkVar2.getParentActivity()).show();
                    return;
                } else {
                    xkVar2.X();
                    return;
                }
            }
        }
        Object J = p0Var.J(i9);
        if (J instanceof TLRPC.TL_messageMediaVenue) {
            y4.a0(kiVar.F1, kiVar.j1() + 1, kiVar.n1(), new bg.j1(xkVar2, qnVar2, (TLRPC.TL_messageMediaVenue) J, b6Var2, 8));
        }
    }

    public static void N(xk xkVar, org.telegram.ui.qn qnVar, org.telegram.ui.ActionBar.b6 b6Var, int i9) {
        TLRPC.TL_messageMediaVenue I = xkVar.N.I(i9);
        if (I != null && xkVar.f34709t0 != null) {
            if (qnVar != null && qnVar.c()) {
                y4.M(xkVar.getParentActivity(), qnVar.a(), new nk(xkVar, I, 0), b6Var);
                return;
            }
            xkVar.f34709t0.d(I, xkVar.f34710u0, true, 0, 0L);
            xkVar.f27493b.dismiss(true);
        }
    }

    public static void O(xk xkVar, org.telegram.ui.qn qnVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.b6 b6Var) {
        if (qnVar != null && qnVar.c()) {
            y4.M(xkVar.getParentActivity(), qnVar.a(), new nk(xkVar, tL_messageMediaVenue, 1), b6Var);
            return;
        }
        xkVar.f34709t0.d(tL_messageMediaVenue, xkVar.f34710u0, true, 0, 0L);
        xkVar.f27493b.dismiss(true);
    }

    public static void P(xk xkVar) {
        Activity parentActivity;
        of.p0 p0Var = xkVar.K;
        ImageView imageView = xkVar.f34700n;
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = xkVar.getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            y4.D(xkVar.getParentActivity()).show();
            return;
        }
        if (xkVar.m0 != null && xkVar.D != null) {
            int i9 = org.telegram.ui.ActionBar.f6.vi;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.v0(i9, xkVar.f27492a), PorterDuff.Mode.MULTIPLY));
            imageView.setTag(Integer.valueOf(i9));
            p0Var.L(null);
            xkVar.f34704q0 = false;
            xkVar.c0(false);
            xkVar.D.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(xkVar.m0.getLatitude(), xkVar.m0.getLongitude())));
            if (xkVar.f34706r0) {
                Location location = xkVar.m0;
                if (location != null && xkVar.f34710u0 != 8) {
                    p0Var.H(null, location, true);
                }
                xkVar.f34706r0 = false;
                xkVar.b0();
            }
        }
        if (xkVar.f34690c0 != null) {
            xkVar.O.setVisibility(0);
            uk ukVar = xkVar.B;
            IMapsProvider.IMarker iMarker = xkVar.f34690c0;
            HashMap hashMap = ukVar.f33084a;
            View view = (View) hashMap.get(iMarker);
            if (view != null) {
                ukVar.removeView(view);
                hashMap.remove(iMarker);
            }
            xkVar.f34690c0 = null;
            xkVar.f34691d0 = null;
            xkVar.f34692e0 = null;
        }
    }

    public static void Q(xk xkVar, Location location) {
        int i9;
        ki kiVar = xkVar.f27493b;
        if (kiVar != null && kiVar.f30099b0 != null) {
            xkVar.Z(location);
            of.p0 p0Var = xkVar.K;
            if (p0Var != null && (((i9 = xkVar.f34710u0) == 7 || i9 == 8) && !xkVar.f34704q0)) {
                p0Var.L(xkVar.f34701n0);
            }
            xkVar.getLocationController().setMapLocation(location, xkVar.U);
            xkVar.U = false;
        }
    }

    public static void R(xk xkVar, IMapsProvider.IMapView iMapView) {
        if (xkVar.E != null && xkVar.getParentActivity() != null) {
            try {
                iMapView.onCreate(null);
                ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                xkVar.E.getMapAsync(new ok(xkVar, 0));
                xkVar.f34698k0 = true;
                if (xkVar.f34699l0) {
                    xkVar.E.onResume();
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
    }

    public static void S(xk xkVar) {
        if (xkVar.getParentActivity() != null) {
            try {
                xkVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
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
        return this.f27493b.f30099b0.getLocationController();
    }

    private MessagesController getMessagesController() {
        return this.f27493b.f30099b0.getMessagesController();
    }

    public Activity getParentActivity() {
        org.telegram.ui.ActionBar.o2 o2Var;
        ki kiVar = this.f27493b;
        if (kiVar != null && (o2Var = kiVar.f30099b0) != null) {
            return o2Var.getParentActivity();
        }
        return null;
    }

    private UserConfig getUserConfig() {
        return this.f27493b.f30099b0.getUserConfig();
    }

    @Override
    public final void D(ci ciVar) {
        long j10;
        ki kiVar = this.f27493b;
        kiVar.T0.setTitle(LocaleController.getString(R.string.ShareLocation));
        if (this.E.getView().getParent() == null) {
            View view = this.E.getView();
            FrameLayout.LayoutParams e10 = g7.e6.e(-1, AndroidUtilities.dp(10.0f) + this.f34711v0, 51);
            fh.d2 d2Var = this.J;
            d2Var.addView(view, 0, e10);
            d2Var.addView(this.B, 1, g7.e6.e(-1, AndroidUtilities.dp(10.0f) + this.f34711v0, 51));
            d2Var.addView(this.I, 2, g7.e6.c(-1.0f, -1));
        }
        this.A.setVisibility(0);
        IMapsProvider.IMapView iMapView = this.E;
        if (iMapView != null && this.f34698k0) {
            try {
                iMapView.onResume();
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        this.f34699l0 = true;
        IMapsProvider.IMap iMap = this.D;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e11) {
                FileLog.e(e11);
            }
        }
        V();
        boolean j11 = kiVar.V1.j();
        hk hkVar = new hk(this, 1);
        if (j11) {
            j10 = 200;
        } else {
            j10 = 0;
        }
        AndroidUtilities.runOnUIThread(hkVar, j10);
        this.P.h1(0, 0);
        d0();
    }

    @Override
    public final void F() {
        this.L.x0(0);
    }

    @Override
    public final boolean I() {
        return !this.T;
    }

    public final Bitmap U(int i9) {
        Bitmap[] bitmapArr = this.f34718z0;
        Bitmap bitmap = bitmapArr[i9 % 7];
        if (bitmap != null) {
            return bitmap;
        }
        try {
            Paint paint = new Paint(1);
            paint.setColor(-1);
            Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            paint.setColor(org.telegram.ui.Cells.u4.a(i9));
            canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), paint);
            canvas.setBitmap(null);
            bitmapArr[i9 % 7] = createBitmap;
            return createBitmap;
        } catch (Throwable th) {
            FileLog.e(th);
            return null;
        }
    }

    public final void V() {
        int i9;
        FrameLayout.LayoutParams layoutParams;
        if (getMeasuredHeight() != 0 && this.E != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            int i10 = AndroidUtilities.displaySize.y - currentActionBarHeight;
            int dp = AndroidUtilities.dp(66.0f);
            int i11 = this.f34710u0;
            if (i11 == 1 || i11 == 7 || i11 == 8) {
                dp += AndroidUtilities.dp(66.0f);
            }
            int dp2 = (i10 - dp) - AndroidUtilities.dp(90.0f);
            int dp3 = AndroidUtilities.dp(189.0f);
            this.f34711v0 = dp3;
            if (!this.T || !W()) {
                dp2 = Math.min(AndroidUtilities.dp(310.0f), dp2);
            }
            this.f34713w0 = Math.max(dp3, dp2);
            if (this.T && W()) {
                this.f34711v0 = this.f34713w0;
            }
            gh.f1 f1Var = this.L;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) f1Var.getLayoutParams();
            layoutParams2.topMargin = currentActionBarHeight;
            f1Var.setLayoutParams(layoutParams2);
            fh.d2 d2Var = this.J;
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) d2Var.getLayoutParams();
            layoutParams3.topMargin = currentActionBarHeight;
            layoutParams3.height = this.f34713w0;
            d2Var.setLayoutParams(layoutParams3);
            wk0 wk0Var = this.M;
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) wk0Var.getLayoutParams();
            layoutParams4.topMargin = currentActionBarHeight;
            wk0Var.setLayoutParams(layoutParams4);
            if (this.T && W()) {
                i9 = this.f34711v0 - f1Var.getPaddingTop();
            } else {
                i9 = this.f34711v0;
            }
            int dp4 = AndroidUtilities.dp(16.0f) + i9;
            of.p0 p0Var = this.K;
            p0Var.P(dp4);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.E.getView().getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.height = AndroidUtilities.dp(10.0f) + this.f34713w0;
                this.E.getView().setLayoutParams(layoutParams5);
            }
            uk ukVar = this.B;
            if (ukVar != null && (layoutParams = (FrameLayout.LayoutParams) ukVar.getLayoutParams()) != null) {
                layoutParams.height = AndroidUtilities.dp(10.0f) + this.f34713w0;
                ukVar.setLayoutParams(layoutParams);
            }
            p0Var.l();
            d0();
        }
    }

    public final boolean W() {
        int i9 = this.f34710u0;
        if (i9 == 0 || i9 == 1) {
            return true;
        }
        return false;
    }

    public final void X() {
        TLRPC.User user;
        Activity parentActivity;
        if (this.f34709t0 != null && getParentActivity() != null && this.m0 != null) {
            boolean z10 = this.f34694g0;
            org.telegram.ui.ActionBar.b6 b6Var = this.f27492a;
            if (z10 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
                this.f34694g0 = false;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                    globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                    y4.l(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new hk(this, 2), b6Var).o();
                    return;
                }
            }
            long j10 = this.V;
            if (DialogObject.isUserDialog(j10)) {
                user = this.f27493b.f30099b0.getMessagesController().getUser(Long.valueOf(j10));
            } else {
                user = null;
            }
            y4.E(getParentActivity(), false, user, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i9) {
                    xk xkVar = xk.this;
                    ki kiVar = xkVar.f27493b;
                    y4.a0(kiVar.F1, kiVar.j1() + 1, kiVar.n1(), new kh.p6(xkVar, i9, 2));
                }
            }, b6Var).show();
        }
    }

    public final void Y() {
        xk xkVar;
        ki kiVar = this.f27493b;
        if (kiVar.K) {
            if (kiVar.f30159t2 != null) {
                AndroidUtilities.runOnUIThread(new hk(this, 0));
                return;
            } else if (!this.T) {
                File file = kiVar.f30156s2;
                boolean z10 = kiVar.f30152r2;
                if (file != null) {
                    if (z10) {
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
                        xkVar = this;
                        ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                        float[] fArr = new float[2];
                        if (exifInterface.getLatLong(fArr)) {
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.wq(22, this, fArr));
                            return;
                        }
                        Location lastLocation = getLastLocation();
                        xkVar.m0 = lastLocation;
                        Z(lastLocation);
                        return;
                    }
                }
                xkVar = this;
                Location lastLocation2 = getLastLocation();
                xkVar.m0 = lastLocation2;
                Z(lastLocation2);
                return;
            } else {
                AndroidUtilities.runOnUIThread(new hk(this, 8));
                return;
            }
        }
        Location lastLocation3 = getLastLocation();
        this.m0 = lastLocation3;
        Z(lastLocation3);
    }

    public final void Z(Location location) {
        if (location != null) {
            Location location2 = new Location(location);
            this.m0 = location2;
            IMapsProvider.IMap iMap = this.D;
            of.p0 p0Var = this.K;
            if (iMap != null) {
                IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
                if (p0Var != null) {
                    if (!this.f34706r0 && this.f34710u0 != 8) {
                        p0Var.H(null, this.m0, true);
                    }
                    p0Var.M(this.m0);
                }
                if (!this.f34704q0) {
                    this.f34701n0 = new Location(location);
                    if (this.f34708s0) {
                        this.D.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                        return;
                    }
                    this.f34708s0 = true;
                    this.D.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.D.getMaxZoomLevel() - 4.0f));
                    return;
                }
                return;
            }
            p0Var.M(location2);
        }
    }

    public final void a0(double d, double d9) {
        IMapsProvider.ICameraUpdate newCameraUpdateLatLngZoom;
        if (this.D != null) {
            int i9 = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
            if (i9 != 0 && d9 != 0.0d) {
                Location location = new Location("");
                this.f34701n0 = location;
                location.reset();
                this.f34701n0.setLatitude(d);
                this.f34701n0.setLongitude(d9);
            } else {
                Location location2 = new Location("");
                this.m0 = location2;
                location2.reset();
                this.m0.setLatitude(d);
                this.m0.setLongitude(d9);
            }
            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(d, d9);
            if (i9 != 0 && d9 != 0.0d) {
                newCameraUpdateLatLngZoom = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.D.getMaxZoomLevel() - 4.0f);
            } else {
                newCameraUpdateLatLngZoom = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.D.getMinZoomLevel());
            }
            this.F = newCameraUpdateLatLngZoom;
            this.D.moveCamera(newCameraUpdateLatLngZoom);
            of.p0 p0Var = this.K;
            if (i9 != 0 && d9 != 0.0d) {
                p0Var.L(this.f34701n0);
            } else {
                p0Var.M(this.m0);
            }
            p0Var.I();
            this.L.v0(0, 1, null);
            this.f34703p0 = true;
            if (i9 != 0 && d9 != 0.0d) {
                this.f34704q0 = true;
                c0(false);
                if (this.f34710u0 != 8) {
                    p0Var.H(null, this.f34701n0, true);
                }
                this.f34706r0 = true;
                b0();
            }
        }
    }

    public final void b0() {
        if (this.K.h() != 0 && this.P.L0() == 0) {
            gh.f1 f1Var = this.L;
            View childAt = f1Var.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top >= 0 && top <= AndroidUtilities.dp(258.0f)) {
                f1Var.v0(0, top, null);
            }
        }
    }

    public final void c0(boolean z10) {
        int i9;
        Integer num;
        float f10;
        Location location;
        Location location2;
        if (this.T) {
            z10 = false;
        }
        vk vkVar = this.f34707s;
        if (z10 && vkVar != null && vkVar.getTag() == null && ((location = this.m0) == null || (location2 = this.f34701n0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        if (this.f34710u0 == 8) {
            z10 = false;
        }
        if (vkVar != null) {
            if (!z10 || vkVar.getTag() == null) {
                if (z10 || vkVar.getTag() != null) {
                    if (z10) {
                        i9 = 0;
                    } else {
                        i9 = 4;
                    }
                    vkVar.setVisibility(i9);
                    if (z10) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    vkVar.setTag(num);
                    AnimatorSet animatorSet = new AnimatorSet();
                    if (z10) {
                        f10 = 0.0f;
                    } else {
                        f10 = -AndroidUtilities.dp(80.0f);
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(vkVar, View.TRANSLATION_X, f10));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(gr.f28845g);
                    animatorSet.start();
                }
            }
        }
    }

    public final void d0() {
        fh.d2 d2Var;
        int i9;
        int i10;
        IMapsProvider.LatLng latLng;
        Location location;
        IMapsProvider.IMap iMap;
        if (this.E != null && (d2Var = this.J) != null) {
            gh.f1 f1Var = this.L;
            f2.q1 K = f1Var.K(0);
            if (K != null) {
                i9 = (int) K.f5501a.getY();
                i10 = Math.min(i9, 0) + this.f34711v0;
            } else {
                i9 = -d2Var.getMeasuredHeight();
                i10 = 0;
            }
            if (((FrameLayout.LayoutParams) d2Var.getLayoutParams()) != null) {
                uk ukVar = this.B;
                if (i10 <= 0) {
                    if (this.E.getView().getVisibility() == 0) {
                        this.E.getView().setVisibility(4);
                        d2Var.setVisibility(4);
                        if (ukVar != null) {
                            ukVar.setVisibility(4);
                        }
                    }
                    this.E.getView().setTranslationY(i9);
                    return;
                }
                if (this.E.getView().getVisibility() == 4) {
                    this.E.getView().setVisibility(0);
                    d2Var.setVisibility(0);
                    if (ukVar != null) {
                        ukVar.setVisibility(0);
                    }
                }
                int max = Math.max(0, (-((i9 - this.f34713w0) + this.f34711v0)) / 2);
                int i11 = this.f34713w0 - this.f34711v0;
                float max2 = 1.0f - Math.max(0.0f, Math.min(1.0f, (f1Var.getPaddingTop() - i9) / (f1Var.getPaddingTop() - i11)));
                int i12 = this.f34715x0;
                if (this.T && W()) {
                    i11 += Math.min(i9, f1Var.getPaddingTop());
                }
                this.f34715x0 = (int) (i11 * max2);
                float f10 = max;
                this.E.getView().setTranslationY(f10);
                this.f34717y0 = i11 - this.f34715x0;
                d2Var.invalidate();
                d2Var.setTranslationY(i9 - this.f34717y0);
                IMapsProvider.IMap iMap2 = this.D;
                if (iMap2 != null) {
                    iMap2.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f) + this.f34715x0);
                }
                if (ukVar != null) {
                    ukVar.setTranslationY(f10);
                }
                int max3 = Math.max(this.f34717y0 - i9, 0);
                int i13 = this.f34713w0;
                org.telegram.ui.ActionBar.w0 w0Var = this.f34705r;
                float min = Math.min(max3, (i13 - w0Var.getMeasuredHeight()) - AndroidUtilities.dp(80.0f));
                w0Var.setTranslationY(min);
                vk vkVar = this.f34707s;
                vkVar.f33402c = min;
                vkVar.setTranslationY(min + vkVar.f33401b);
                this.f34700n.setTranslationY(-this.f34715x0);
                int D = org.telegram.messenger.ll.D(48.0f, (this.f34713w0 - this.f34715x0) / 2, max);
                this.f34702o0 = D;
                this.O.setTranslationY(D);
                if (i12 != this.f34715x0) {
                    IMapsProvider.IMarker iMarker = this.f34690c0;
                    if (iMarker != null) {
                        latLng = new IMapsProvider.LatLng(iMarker.getPosition().latitude, this.f34690c0.getPosition().longitude);
                    } else if (this.f34704q0 && (location = this.f34701n0) != null) {
                        latLng = new IMapsProvider.LatLng(location.getLatitude(), this.f34701n0.getLongitude());
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
                if (this.T && W()) {
                    int h = this.K.h();
                    for (int i14 = 1; i14 < h; i14++) {
                        f2.q1 K2 = f1Var.K(i14);
                        if (K2 != null) {
                            K2.f5501a.setTranslationY(f1Var.getPaddingTop() - i9);
                        }
                    }
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        boolean z10;
        boolean z11;
        int i11 = NotificationCenter.locationPermissionGranted;
        rk rkVar = this.N;
        of.p0 p0Var = this.K;
        int i12 = 0;
        if (i9 == i11) {
            this.T = false;
            this.S = false;
            Y();
            if (p0Var != null) {
                p0Var.O(this.T, this.S);
            }
            if (rkVar != null && rkVar.I != (z11 = this.T)) {
                rkVar.I = z11;
            }
            IMapsProvider.IMap iMap = this.D;
            if (iMap != null) {
                try {
                    iMap.setMyLocationEnabled(true);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        } else if (i9 == NotificationCenter.locationPermissionDenied) {
            this.T = true;
            this.S = false;
            if (p0Var != null) {
                p0Var.O(true, false);
            }
            if (rkVar != null && rkVar.I != (z10 = this.T)) {
                rkVar.I = z10;
            }
        }
        V();
        boolean z12 = this.T;
        ki kiVar = this.f27493b;
        if (z12 && !kiVar.K) {
            i12 = 8;
        } else {
            kiVar.getClass();
        }
        this.A.setVisibility(i12);
    }

    public final void e0() {
        boolean z10 = this.f34695h0;
        LinearLayout linearLayout = this.v;
        if (z10) {
            boolean z11 = this.f34697j0;
            wk0 wk0Var = this.M;
            if (z11) {
                wk0Var.setEmptyView(null);
                linearLayout.setVisibility(8);
                return;
            }
            wk0Var.setEmptyView(linearLayout);
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
        gh.f1 f1Var = this.L;
        if (f1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i9 = 0;
        ik0 ik0Var = (ik0) f1Var.K(0);
        if (ik0Var != null) {
            i9 = Math.max(((int) ik0Var.f5501a.getY()) - this.f34717y0, 0);
        }
        return AndroidUtilities.dp(56.0f) + i9;
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
    public ArrayList<org.telegram.ui.ActionBar.h6> getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList<org.telegram.ui.ActionBar.h6> arrayList = new ArrayList<>();
        s6 s6Var = new s6(this, 2);
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.J, 1, null, null, null, null, org.telegram.ui.ActionBar.f6.f23072h5));
        int i9 = org.telegram.ui.ActionBar.f6.A5;
        gh.f1 f1Var = this.L;
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 32768, null, null, null, null, i9));
        org.telegram.ui.ActionBar.w0 w0Var = this.A;
        if (w0Var != null) {
            editTextBoldCursor = w0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h6(editTextBoldCursor, 16777216, null, null, null, null, org.telegram.ui.ActionBar.f6.f23108j5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.f6.f23092i6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.f6.f23121k0, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        int i10 = org.telegram.ui.ActionBar.f6.W5;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f34712w, 8, null, null, null, null, i10));
        int i11 = org.telegram.ui.ActionBar.f6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f34714x, 4, null, null, null, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f34716y, 4, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.f6.ui;
        ImageView imageView = this.f34700n;
        arrayList.add(new org.telegram.ui.ActionBar.h6(imageView, 262152, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.f6.vi;
        arrayList.add(new org.telegram.ui.ActionBar.h6(imageView, 262152, null, null, null, null, i13));
        int i14 = org.telegram.ui.ActionBar.f6.wi;
        arrayList.add(new org.telegram.ui.ActionBar.h6(imageView, 32, null, null, null, null, i14));
        int i15 = org.telegram.ui.ActionBar.f6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.h6(imageView, 65568, null, null, null, null, i15));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f34705r;
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var2, 0, null, null, null, s6Var, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var2, 32, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(w0Var2, 65568, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f34707s, 4, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f34707s, 32, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f34707s, 65568, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, org.telegram.ui.ActionBar.f6.f23242r0, s6Var, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.si));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 393216, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.ni));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 393216, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.qi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 393248, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.mi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 393248, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.pi));
        int i16 = org.telegram.ui.ActionBar.f6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"accurateTextView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 262144, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.ri));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 262144, new Class[]{org.telegram.ui.Cells.s6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.oi));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"buttonTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 131072, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 196608, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 32, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22966b7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 48, new Class[]{org.telegram.ui.Cells.z6.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23178n5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        int i17 = org.telegram.ui.ActionBar.f6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i16));
        wk0 wk0Var = this.M;
        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(wk0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.u7.class}, new String[]{"nameTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.u7.class}, new String[]{"distanceTextView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.f6.f23073h6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 8, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, i10));
        arrayList.add(new org.telegram.ui.ActionBar.h6(f1Var, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView2"}, null, null, -1, null, i11));
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
        fh.d2 d2Var = this.J;
        if (d2Var != null) {
            d2Var.invalidate();
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
        of.p0 p0Var = this.K;
        if (p0Var != null) {
            p0Var.F();
        }
        rk rkVar = this.N;
        if (rkVar != null) {
            rkVar.F();
        }
        ki kiVar = this.f27493b;
        kiVar.T0.h(true);
        kiVar.T0.n().removeView(this.A);
    }

    @Override
    public final boolean n() {
        m();
        return false;
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        if (z10) {
            V();
        }
    }

    @Override
    public final void r() {
        this.A.setVisibility(8);
    }

    public void setDelegate(sk skVar) {
        this.f34709t0 = skVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f27493b.getSheetContainer().invalidate();
        d0();
    }

    @Override
    public final void v() {
        boolean z10;
        ki kiVar = this.f27493b;
        if (kiVar != null && !kiVar.isKeyboardVisible()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.K.Y = z10;
    }

    @Override
    public final void w(int i9, boolean z10) {
        if (z10) {
            this.K.Y = false;
        }
    }

    @Override
    public final void x() {
        IMapsProvider.IMapView iMapView = this.E;
        if (iMapView != null && this.f34698k0) {
            try {
                iMapView.onPause();
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        this.f34699l0 = false;
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xk.y(int, int):void");
    }

    @Override
    public final void z() {
        IMapsProvider.IMapView iMapView = this.E;
        if (iMapView != null && this.f34698k0) {
            try {
                iMapView.onResume();
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        this.f34699l0 = true;
    }
}
