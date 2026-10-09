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
public final class xl extends qi implements NotificationCenter.NotificationCenterDelegate {
    public static final int E0 = 0;
    public int A0;
    public int B0;
    public int C0;
    public final Bitmap[] D0;
    public final org.telegram.ui.ActionBar.v0 E;
    public final ul F;
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
    public final qm0 Q;
    public final rl R;
    public final ImageView S;
    public final hg.f0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean f32904a0;
    public boolean f32905b0;
    public final long f32906c0;
    public final Paint f32907d0;
    public final ArrayList f32908e0;
    public AnimatorSet f32909f0;
    public IMapsProvider.IMarker f32910g0;
    public wl f32911h0;
    public FrameLayout f32912i0;
    public boolean f32913j0;
    public boolean f32914k0;
    public boolean f32915l0;
    public boolean m0;
    public final ImageView f32916n;
    public boolean f32917n0;
    public boolean f32918o0;
    public boolean f32919p0;
    public Location f32920q0;
    public final org.telegram.ui.ActionBar.v0 f32921r;
    public Location f32922r0;
    public final vl f32923s;
    public int f32924s0;
    public boolean f32925t0;
    public boolean f32926u0;
    public final LinearLayout v;
    public boolean f32927v0;
    public final ImageView f32928w;
    public boolean f32929w0;
    public final TextView f32930x;
    public sl f32931x0;
    public final TextView f32932y;
    public final int f32933y0;
    public int f32934z0;

    public xl(yi yiVar, Context context, final org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, yiVar);
        final org.telegram.ui.zn znVar;
        boolean z11;
        int i10;
        boolean z12;
        this.V = true;
        this.W = false;
        this.f32904a0 = false;
        this.f32905b0 = true;
        this.f32907d0 = new Paint();
        this.f32908e0 = new ArrayList();
        this.f32913j0 = true;
        this.f32914k0 = true;
        int currentActionBarHeight = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.f32934z0 = currentActionBarHeight;
        this.A0 = currentActionBarHeight;
        this.D0 = new Bitmap[7];
        AndroidUtilities.fixGoogleMapsBug();
        yi yiVar2 = this.f30173b;
        org.telegram.ui.ActionBar.n2 n2Var = yiVar2.f33228f0;
        if (n2Var instanceof org.telegram.ui.zn) {
            znVar = (org.telegram.ui.zn) n2Var;
        } else {
            znVar = null;
        }
        long p12 = yiVar2.p1();
        this.f32906c0 = p12;
        if (this.f30173b.O) {
            this.f32933y0 = 7;
        } else if (z10 && znVar != null && znVar.h == null && !znVar.c() && !UserObject.isUserSelf(znVar.i())) {
            this.f32933y0 = 1;
        } else {
            this.f32933y0 = 0;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        this.m0 = false;
        this.f32915l0 = false;
        this.f32917n0 = false;
        gg.s0 s0Var = this.O;
        if (s0Var != null) {
            s0Var.F();
        }
        rl rlVar = this.R;
        if (rlVar != null) {
            rlVar.F();
        }
        if (getParentActivity() != null && getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f32904a0 = z11;
        org.telegram.ui.ActionBar.z o9 = this.f30173b.f33211a1.o();
        this.F = new ul(this, context);
        org.telegram.ui.ActionBar.v0 a2 = o9.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.e2(this, 6);
        this.E = a2;
        if (this.f32904a0 && !this.f30173b.O) {
            i10 = 8;
        } else {
            this.f30173b.getClass();
            i10 = 0;
        }
        a2.setVisibility(i10);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i11 = org.telegram.ui.ActionBar.i6.f20905j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.i6.w0(i11, this.f30172a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.i6.w0(i11, this.f30172a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.Vd, this.f30172a));
        new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f)).gravity = 83;
        ai.f0 f0Var = new ai.f0(this, context, 9);
        this.N = f0Var;
        f0Var.setWillNotDraw(false);
        View view = new View(context);
        this.M = view;
        view.setBackgroundDrawable(new hd(org.telegram.ui.ActionBar.i6.B0().q()));
        vl vlVar = new vl(context, 0);
        this.f32923s = vlVar;
        vlVar.setTranslationX(-AndroidUtilities.dp(80.0f));
        vlVar.setVisibility(4);
        int dp = AndroidUtilities.dp(40.0f);
        int i12 = org.telegram.ui.ActionBar.i6.wi;
        int w02 = org.telegram.ui.ActionBar.i6.w0(i12, this.f30172a);
        int i13 = org.telegram.ui.ActionBar.i6.xi;
        int w03 = org.telegram.ui.ActionBar.i6.w0(i13, this.f30172a);
        org.telegram.ui.Cells.z j02 = org.telegram.ui.ActionBar.i6.j0(dp, dp, dp, dp, w02, w03, w03);
        w7.z5.a(vlVar);
        vlVar.setTranslationZ(AndroidUtilities.dp(2.0f));
        ai.l2 l2Var = yf.i0.f52169a;
        vlVar.setOutlineProvider(l2Var);
        vlVar.setBackground(j02);
        int i14 = org.telegram.ui.ActionBar.i6.vi;
        vlVar.setTextColor(org.telegram.ui.ActionBar.i6.w0(i14, this.f30172a));
        vlVar.setTextSize(1, 14.0f);
        vlVar.setTypeface(AndroidUtilities.bold());
        vlVar.setText(LocaleController.getString(R.string.PlacesInThisArea));
        vlVar.setGravity(17);
        vlVar.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        f0Var.addView(vlVar, w7.x5.a(40.0f, 80.0f, 12.0f, 80.0f, 0.0f, -2, 49));
        vlVar.setOnClickListener(new View.OnClickListener(this) {
            public final xl f27738b;

            {
                this.f27738b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        xl.T(this.f27738b);
                        return;
                    case 1:
                        xl xlVar = this.f27738b;
                        xlVar.g0(false);
                        xlVar.O.H(null, xlVar.f32922r0, true);
                        xlVar.f32927v0 = true;
                        xlVar.f0();
                        return;
                    default:
                        this.f27738b.f32921r.M(null, null);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, 0, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.ui, this.f30172a), false, e6Var);
        this.f32921r = v0Var;
        v0Var.setClickable(true);
        v0Var.setSubMenuOpenSide(2);
        v0Var.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        v0Var.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        v0Var.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), e6Var);
        v0Var.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), e6Var);
        v0Var.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), e6Var);
        v0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.i6.i0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.i6.w0(i12, this.f30172a), org.telegram.ui.ActionBar.i6.w0(i13, this.f30172a));
        w7.z5.a(v0Var);
        v0Var.setTranslationZ(AndroidUtilities.dp(2.0f));
        v0Var.setOutlineProvider(l2Var);
        v0Var.setBackground(i02);
        v0Var.setIcon(R.drawable.msg_map_type);
        f0Var.addView(v0Var, w7.x5.a(40.0f, 0.0f, 12.0f, 12.0f, 0.0f, 40, 53));
        v0Var.setOnClickListener(new View.OnClickListener(this) {
            public final xl f27738b;

            {
                this.f27738b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        xl.T(this.f27738b);
                        return;
                    case 1:
                        xl xlVar = this.f27738b;
                        xlVar.g0(false);
                        xlVar.O.H(null, xlVar.f32922r0, true);
                        xlVar.f32927v0 = true;
                        xlVar.f0();
                        return;
                    default:
                        this.f27738b.f32921r.M(null, null);
                        return;
                }
            }
        });
        v0Var.setDelegate(new il(this, 0));
        ImageView imageView = new ImageView(context);
        this.f32916n = imageView;
        org.telegram.ui.Cells.z i03 = org.telegram.ui.ActionBar.i6.i0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.i6.w0(i12, this.f30172a), org.telegram.ui.ActionBar.i6.w0(i13, this.f30172a));
        w7.z5.a(imageView);
        imageView.setTranslationZ(AndroidUtilities.dp(2.0f));
        imageView.setOutlineProvider(l2Var);
        imageView.setBackground(i03);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int w04 = org.telegram.ui.ActionBar.i6.w0(i14, this.f30172a);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w04, mode));
        imageView.setTag(Integer.valueOf(i14));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        f0Var.addView(imageView, w7.x5.a(40.0f, 0.0f, 0.0f, 12.0f, 12.0f, 40, 85));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final xl f27738b;

            {
                this.f27738b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        xl.T(this.f27738b);
                        return;
                    case 1:
                        xl xlVar = this.f27738b;
                        xlVar.g0(false);
                        xlVar.O.H(null, xlVar.f32922r0, true);
                        xlVar.f32927v0 = true;
                        xlVar.f0();
                        return;
                    default:
                        this.f27738b.f32921r.M(null, null);
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
        addView(linearLayout, w7.x5.d(-1.0f, -1));
        linearLayout.setOnTouchListener(new bi.d(15));
        ImageView imageView2 = new ImageView(context);
        this.f32928w = imageView2;
        imageView2.setImageResource(R.drawable.location_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.W5, this.f30172a), mode));
        linearLayout.addView(imageView2, w7.x5.n(-2, -2));
        TextView textView = new TextView(context);
        this.f32930x = textView;
        int i15 = org.telegram.ui.ActionBar.i6.X5;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(i15, this.f30172a));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 17.0f);
        textView.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.f32932y = h;
        h.setTextColor(org.telegram.ui.ActionBar.i6.w0(i15, this.f30172a));
        h.setGravity(17);
        h.setTextSize(1, 15.0f);
        h.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(h, w7.x5.t(-2, -2, 17, 0, 6, 0, 0));
        ai.w0 w0Var = new ai.w0(this, context, e6Var, 13);
        this.P = w0Var;
        this.f30174c = w0Var;
        this.d = w0Var;
        this.f30176f = true;
        w0Var.setClipToPadding(false);
        gg.s0 s0Var2 = new gg.s0(context, this.f32933y0, p12, true, e6Var, this.f30173b.O, false, false);
        this.O = s0Var2;
        w0Var.setAdapter(s0Var2);
        yi yiVar3 = this.f30173b;
        if (yiVar3 != null && (yiVar3.H || yiVar3.P)) {
            z12 = true;
        } else {
            z12 = false;
        }
        s0Var2.f10801f0 = z12;
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(hs.h);
        jVar.C = false;
        jVar.f47696m = false;
        w0Var.setItemAnimator(jVar);
        s0Var2.O(this.f32904a0, this.W);
        w0Var.setVerticalScrollBarEnabled(false);
        w0Var.p1();
        hg.f0 f0Var2 = new hg.f0(this, w0Var);
        this.T = f0Var2;
        w0Var.setLayoutManager(f0Var2);
        addView(w0Var, w7.x5.e(-1, -1, 51));
        w0Var.setOnScrollListener(new ql(this));
        w0Var.setOnItemClickListener(new em0(this) {
            public final xl f28061b;

            {
                this.f28061b = this;
            }

            @Override
            public final void d(int i16, View view2) {
                switch (r4) {
                    case 0:
                        xl.Q(this.f28061b, znVar, e6Var, i16);
                        return;
                    default:
                        xl.R(this.f28061b, znVar, e6Var, i16);
                        return;
                }
            }
        });
        il ilVar = new il(this, 1);
        s0Var2.H = p12;
        s0Var2.f10556y = ilVar;
        s0Var2.P(AndroidUtilities.dp(16.0f) + this.f32934z0);
        addView(f0Var, w7.x5.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.I = onCreateMapView;
        onCreateMapView.setOnDispatchTouchEventInterceptor(new il(this, 2));
        this.I.setOnInterceptTouchEventInterceptor(new il(this, 3));
        new Thread(new ml(this, this.I, 1)).start();
        ImageView imageView3 = new ImageView(context);
        this.S = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        f0Var.addView(imageView3, w7.x5.e(28, 48, 49));
        qm0 qm0Var = new qm0(context, e6Var);
        this.Q = qm0Var;
        qm0Var.setSections(true);
        qm0Var.setClipToPadding(false);
        qm0Var.setVisibility(8);
        qm0Var.setLayoutManager(new s4.d0(1, false));
        rl rlVar2 = new rl(this, context, e6Var, this.f30173b.O);
        this.R = rlVar2;
        boolean z13 = this.f32904a0;
        if (rlVar2.M != z13) {
            rlVar2.M = z13;
        }
        il ilVar2 = new il(this, 7);
        rlVar2.H = 0L;
        rlVar2.f10556y = ilVar2;
        qm0Var.setItemAnimator(null);
        addView(qm0Var, w7.x5.e(-1, -1, 51));
        qm0Var.setOnScrollListener(new ai.r(this, 21));
        qm0Var.setOnItemClickListener(new em0(this) {
            public final xl f28061b;

            {
                this.f28061b = this;
            }

            @Override
            public final void d(int i16, View view2) {
                switch (r4) {
                    case 0:
                        xl.Q(this.f28061b, znVar, e6Var, i16);
                        return;
                    default:
                        xl.R(this.f28061b, znVar, e6Var, i16);
                        return;
                }
            }
        });
        i0();
    }

    public static void N(xl xlVar, IMapsProvider.IMap iMap) {
        PackageManager packageManager;
        xlVar.H = iMap;
        iMap.setOnMapLoadedCallback(new hl(xlVar, 3));
        if (org.telegram.ui.ActionBar.i6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, xlVar.f30172a)) < 0.721f) {
            xlVar.U = true;
            xlVar.H.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
        }
        if (xlVar.H != null) {
            Location location = new Location("network");
            xlVar.f32922r0 = location;
            location.setLatitude(20.659322d);
            xlVar.f32922r0.setLongitude(-11.40625d);
            try {
                xlVar.H.setMyLocationEnabled(true);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            xlVar.H.getUiSettings().setMyLocationButtonEnabled(false);
            xlVar.H.getUiSettings().setZoomControlsEnabled(false);
            xlVar.H.getUiSettings().setCompassEnabled(false);
            xlVar.H.setOnCameraMoveStartedListener(new il(xlVar, 4));
            xlVar.H.setOnCameraIdleListener(new hl(xlVar, 5));
            xlVar.H.setOnMyLocationChangeListener(new ol(xlVar, 1));
            xlVar.H.setOnMarkerClickListener(new il(xlVar, 5));
            xlVar.H.setOnCameraMoveListener(new hl(xlVar, 6));
            xlVar.c0();
            AndroidUtilities.runOnUIThread(new hl(xlVar, 7), 200L);
            if (xlVar.V && xlVar.getParentActivity() != null) {
                xlVar.V = false;
                Activity parentActivity = xlVar.getParentActivity();
                if (parentActivity == null || (packageManager = parentActivity.getPackageManager()) == null || packageManager.hasSystemFeature("android.hardware.location.gps")) {
                    try {
                        if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xlVar.getParentActivity(), 0, xlVar.f30172a);
                            alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.L5, xlVar.f30172a), null);
                            alertDialog$Builder.f20374a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                            alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new il(xlVar, 6));
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
            xlVar.h0();
        }
    }

    public static void O(xl xlVar, org.telegram.ui.zn znVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.e6 e6Var, Long l4) {
        if (znVar != null && znVar.c()) {
            g5.L(xlVar.getParentActivity(), znVar.a(), new ai.r5(xlVar, tL_messageMediaGeo, l4, 26), e6Var);
            return;
        }
        xlVar.f32931x0.b(tL_messageMediaGeo, xlVar.f32933y0, true, 0, l4.longValue());
        xlVar.f30173b.dismiss(true);
    }

    public static void P(xl xlVar) {
        gg.s0 s0Var = xlVar.O;
        yi yiVar = xlVar.f30173b;
        if (xlVar.f32913j0) {
            int i10 = Build.VERSION.SDK_INT;
            Activity parentActivity = xlVar.getParentActivity();
            if (parentActivity != null) {
                xlVar.f32913j0 = false;
                if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    String[] strArr = (!yiVar.O || yiVar.f33294z2 == null || i10 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
                    xlVar.W = true;
                    if (s0Var != null) {
                        s0Var.O(xlVar.f32904a0, true);
                    }
                    parentActivity.requestPermissions(strArr, 2);
                } else if (i10 >= 29 && yiVar.O && yiVar.f33294z2 != null && parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") != 0) {
                    xlVar.W = true;
                    if (s0Var != null) {
                        s0Var.O(xlVar.f32904a0, true);
                    }
                    parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
                }
            }
        }
    }

    public static void Q(xl xlVar, org.telegram.ui.zn znVar, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        xl xlVar2;
        org.telegram.ui.zn znVar2;
        org.telegram.ui.ActionBar.e6 e6Var2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j3 = xlVar.f32906c0;
        gg.s0 s0Var = xlVar.O;
        yi yiVar = xlVar.f30173b;
        int i11 = xlVar.f32933y0;
        if (i11 == 7) {
            if (i10 == 1 && (tL_messageMediaVenue2 = s0Var.f10799d0) != null) {
                xlVar.f32931x0.b(tL_messageMediaVenue2, i11, true, 0, 0L);
                yiVar.dismiss(true);
                return;
            } else if (i10 == 2 && (tL_messageMediaVenue = s0Var.f10800e0) != null) {
                xlVar.f32931x0.b(tL_messageMediaVenue, i11, true, 0, 0L);
                yiVar.dismiss(true);
                return;
            } else {
                xlVar2 = xlVar;
                znVar2 = znVar;
                e6Var2 = e6Var;
            }
        } else if (i10 == 1) {
            if (xlVar.f32931x0 != null && xlVar.f32922r0 != null) {
                FrameLayout frameLayout = xlVar.f32912i0;
                if (frameLayout != null) {
                    frameLayout.callOnClick();
                    return;
                }
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(xlVar.f32922r0.getLatitude());
                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(xlVar.f32922r0.getLongitude());
                g5.Z(yiVar.M1, yiVar.l1() + 1, yiVar.p1(), new ai.f4(xlVar, znVar, tL_messageMediaGeo, e6Var, 6));
                return;
            } else if (xlVar.f32904a0) {
                g5.C(xlVar.getParentActivity()).show();
                return;
            } else {
                return;
            }
        } else {
            xlVar2 = xlVar;
            znVar2 = znVar;
            e6Var2 = e6Var;
            if (i10 == 2 && i11 == 1) {
                if (xlVar2.getLocationController().isSharingLocation(j3)) {
                    xlVar2.getLocationController().removeSharingLocation(j3);
                    yiVar.dismiss(true);
                    return;
                } else if (xlVar2.f32920q0 == null && xlVar2.f32904a0) {
                    g5.C(xlVar2.getParentActivity()).show();
                    return;
                } else {
                    xlVar2.b0();
                    return;
                }
            }
        }
        Object J = s0Var.J(i10);
        if (J instanceof TLRPC.TL_messageMediaVenue) {
            g5.Z(yiVar.M1, yiVar.l1() + 1, yiVar.p1(), new ai.f4(xlVar2, znVar2, (TLRPC.TL_messageMediaVenue) J, e6Var2, 7));
        }
    }

    public static void R(xl xlVar, org.telegram.ui.zn znVar, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        TLRPC.TL_messageMediaVenue I = xlVar.R.I(i10);
        if (I != null && xlVar.f32931x0 != null) {
            if (znVar != null && znVar.c()) {
                g5.L(xlVar.getParentActivity(), znVar.a(), new nl(xlVar, I, 0), e6Var);
                return;
            }
            xlVar.f32931x0.b(I, xlVar.f32933y0, true, 0, 0L);
            xlVar.f30173b.dismiss(true);
        }
    }

    public static void S(xl xlVar, org.telegram.ui.zn znVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.e6 e6Var) {
        if (znVar != null && znVar.c()) {
            g5.L(xlVar.getParentActivity(), znVar.a(), new nl(xlVar, tL_messageMediaVenue, 1), e6Var);
            return;
        }
        xlVar.f32931x0.b(tL_messageMediaVenue, xlVar.f32933y0, true, 0, 0L);
        xlVar.f30173b.dismiss(true);
    }

    public static void T(xl xlVar) {
        gg.s0 s0Var = xlVar.O;
        ImageView imageView = xlVar.f32916n;
        Activity parentActivity = xlVar.getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            g5.C(xlVar.getParentActivity()).show();
            return;
        }
        if (xlVar.f32920q0 != null && xlVar.H != null) {
            int i10 = org.telegram.ui.ActionBar.i6.vi;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.w0(i10, xlVar.f30172a), PorterDuff.Mode.MULTIPLY));
            imageView.setTag(Integer.valueOf(i10));
            s0Var.L(null);
            xlVar.f32926u0 = false;
            xlVar.g0(false);
            xlVar.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(xlVar.f32920q0.getLatitude(), xlVar.f32920q0.getLongitude())));
            if (xlVar.f32927v0) {
                Location location = xlVar.f32920q0;
                if (location != null && xlVar.f32933y0 != 8) {
                    s0Var.H(null, location, true);
                }
                xlVar.f32927v0 = false;
                xlVar.f0();
            }
        }
        if (xlVar.f32910g0 != null) {
            xlVar.S.setVisibility(0);
            ul ulVar = xlVar.F;
            IMapsProvider.IMarker iMarker = xlVar.f32910g0;
            HashMap hashMap = ulVar.f31532a;
            View view = (View) hashMap.get(iMarker);
            if (view != null) {
                ulVar.removeView(view);
                hashMap.remove(iMarker);
            }
            xlVar.f32910g0 = null;
            xlVar.f32911h0 = null;
            xlVar.f32912i0 = null;
        }
    }

    public static void U(xl xlVar, Location location) {
        int i10;
        yi yiVar = xlVar.f30173b;
        if (yiVar != null && yiVar.f33228f0 != null) {
            xlVar.d0(location);
            gg.s0 s0Var = xlVar.O;
            if (s0Var != null && (((i10 = xlVar.f32933y0) == 7 || i10 == 8) && !xlVar.f32926u0)) {
                s0Var.L(xlVar.f32922r0);
            }
            xlVar.getLocationController().setMapLocation(location, xlVar.f32905b0);
            xlVar.f32905b0 = false;
        }
    }

    public static void V(xl xlVar, IMapsProvider.IMapView iMapView) {
        if (xlVar.I != null && xlVar.getParentActivity() != null) {
            try {
                iMapView.onCreate(null);
                ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                xlVar.I.getMapAsync(new ol(xlVar, 0));
                xlVar.f32918o0 = true;
                if (xlVar.f32919p0) {
                    xlVar.I.onResume();
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public static void W(xl xlVar) {
        if (xlVar.getParentActivity() != null) {
            try {
                xlVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
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
        return this.f30173b.f33228f0.getLocationController();
    }

    private MessagesController getMessagesController() {
        return this.f30173b.f33228f0.getMessagesController();
    }

    public Activity getParentActivity() {
        org.telegram.ui.ActionBar.n2 n2Var;
        yi yiVar = this.f30173b;
        if (yiVar != null && (n2Var = yiVar.f33228f0) != null) {
            return n2Var.getParentActivity();
        }
        return null;
    }

    private UserConfig getUserConfig() {
        return this.f30173b.f33228f0.getUserConfig();
    }

    @Override
    public final void B() {
        IMapsProvider.IMapView iMapView = this.I;
        if (iMapView != null && this.f32918o0) {
            try {
                iMapView.onPause();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        this.f32919p0 = false;
    }

    @Override
    public final void C(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.xl.C(int, int):void");
    }

    @Override
    public final void D() {
        IMapsProvider.IMapView iMapView = this.I;
        if (iMapView != null && this.f32918o0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.f32919p0 = true;
    }

    @Override
    public final void G(qi qiVar) {
        long j3;
        yi yiVar = this.f30173b;
        yiVar.f33211a1.setTitle(LocaleController.getString(R.string.ShareLocation));
        if (this.I.getView().getParent() == null) {
            View view = this.I.getView();
            FrameLayout.LayoutParams e7 = w7.x5.e(-1, AndroidUtilities.dp(10.0f) + this.f32934z0, 51);
            ai.f0 f0Var = this.N;
            f0Var.addView(view, 0, e7);
            f0Var.addView(this.F, 1, w7.x5.e(-1, AndroidUtilities.dp(10.0f) + this.f32934z0, 51));
            f0Var.addView(this.M, 2, w7.x5.d(-1.0f, -1));
        }
        this.E.setVisibility(0);
        IMapsProvider.IMapView iMapView = this.I;
        if (iMapView != null && this.f32918o0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.f32919p0 = true;
        IMapsProvider.IMap iMap = this.H;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        Z();
        boolean i02 = yiVar.f33219c2.i0();
        hl hlVar = new hl(this, 1);
        if (i02) {
            j3 = 200;
        } else {
            j3 = 0;
        }
        AndroidUtilities.runOnUIThread(hlVar, j3);
        this.T.h1(0, 0);
        h0();
    }

    @Override
    public final void J() {
        this.P.x0(0);
    }

    @Override
    public final boolean L() {
        return !this.f32904a0;
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
            int i12 = this.f32933y0;
            if (i12 == 1 || i12 == 7 || i12 == 8) {
                dp += AndroidUtilities.dp(66.0f);
            }
            int dp2 = (i11 - dp) - AndroidUtilities.dp(90.0f);
            int dp3 = AndroidUtilities.dp(189.0f);
            this.f32934z0 = dp3;
            if (!this.f32904a0 || !a0()) {
                dp2 = Math.min(AndroidUtilities.dp(310.0f), dp2);
            }
            this.A0 = Math.max(dp3, dp2);
            if (this.f32904a0 && a0()) {
                this.f32934z0 = this.A0;
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
            qm0 qm0Var = this.Q;
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) qm0Var.getLayoutParams();
            layoutParams4.topMargin = currentActionBarHeight;
            qm0Var.setLayoutParams(layoutParams4);
            if (this.f32904a0 && a0()) {
                i10 = this.f32934z0 - w0Var.getPaddingTop();
            } else {
                i10 = this.f32934z0;
            }
            int dp4 = AndroidUtilities.dp(16.0f) + i10;
            gg.s0 s0Var = this.O;
            s0Var.P(dp4);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.I.getView().getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.height = AndroidUtilities.dp(10.0f) + this.A0;
                this.I.getView().setLayoutParams(layoutParams5);
            }
            ul ulVar = this.F;
            if (ulVar != null && (layoutParams = (FrameLayout.LayoutParams) ulVar.getLayoutParams()) != null) {
                layoutParams.height = AndroidUtilities.dp(10.0f) + this.A0;
                ulVar.setLayoutParams(layoutParams);
            }
            s0Var.l();
            h0();
        }
    }

    public final boolean a0() {
        int i10 = this.f32933y0;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final void b0() {
        TLRPC.User user;
        Activity parentActivity;
        if (this.f32931x0 != null && getParentActivity() != null && this.f32920q0 != null) {
            boolean z10 = this.f32914k0;
            org.telegram.ui.ActionBar.e6 e6Var = this.f30172a;
            if (z10 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
                this.f32914k0 = false;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                    globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                    g5.k(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new hl(this, 2), e6Var).o();
                    return;
                }
            }
            long j3 = this.f32906c0;
            if (DialogObject.isUserDialog(j3)) {
                user = this.f30173b.f33228f0.getMessagesController().getUser(Long.valueOf(j3));
            } else {
                user = null;
            }
            g5.D(getParentActivity(), false, user, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i10) {
                    xl xlVar = xl.this;
                    yi yiVar = xlVar.f30173b;
                    g5.Z(yiVar.M1, yiVar.l1() + 1, yiVar.p1(), new ci.k4(xlVar, i10, 4));
                }
            }, e6Var).show();
        }
    }

    public final void c0() {
        xl xlVar;
        yi yiVar = this.f30173b;
        if (yiVar.O) {
            if (yiVar.A2 != null) {
                AndroidUtilities.runOnUIThread(new hl(this, 0));
                return;
            } else if (!this.f32904a0) {
                File file = yiVar.f33294z2;
                boolean z10 = yiVar.f33291y2;
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
                        xlVar = this;
                        ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                        float[] fArr = new float[2];
                        if (exifInterface.getLatLong(fArr)) {
                            AndroidUtilities.runOnUIThread(new ea(21, this, fArr));
                            return;
                        }
                        Location lastLocation = getLastLocation();
                        xlVar.f32920q0 = lastLocation;
                        d0(lastLocation);
                        return;
                    }
                }
                xlVar = this;
                Location lastLocation2 = getLastLocation();
                xlVar.f32920q0 = lastLocation2;
                d0(lastLocation2);
                return;
            } else {
                AndroidUtilities.runOnUIThread(new hl(this, 8));
                return;
            }
        }
        Location lastLocation3 = getLastLocation();
        this.f32920q0 = lastLocation3;
        d0(lastLocation3);
    }

    public final void d0(Location location) {
        if (location != null) {
            Location location2 = new Location(location);
            this.f32920q0 = location2;
            IMapsProvider.IMap iMap = this.H;
            gg.s0 s0Var = this.O;
            if (iMap != null) {
                IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
                if (s0Var != null) {
                    if (!this.f32927v0 && this.f32933y0 != 8) {
                        s0Var.H(null, this.f32920q0, true);
                    }
                    s0Var.M(this.f32920q0);
                }
                if (!this.f32926u0) {
                    this.f32922r0 = new Location(location);
                    if (this.f32929w0) {
                        this.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                        return;
                    }
                    this.f32929w0 = true;
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
        rl rlVar = this.R;
        gg.s0 s0Var = this.O;
        int i13 = 0;
        if (i10 == i12) {
            this.f32904a0 = false;
            this.W = false;
            c0();
            if (s0Var != null) {
                s0Var.O(this.f32904a0, this.W);
            }
            if (rlVar != null && rlVar.M != (z11 = this.f32904a0)) {
                rlVar.M = z11;
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
            this.f32904a0 = true;
            this.W = false;
            if (s0Var != null) {
                s0Var.O(true, false);
            }
            if (rlVar != null && rlVar.M != (z10 = this.f32904a0)) {
                rlVar.M = z10;
            }
        }
        Z();
        boolean z12 = this.f32904a0;
        yi yiVar = this.f30173b;
        if (z12 && !yiVar.O) {
            i13 = 8;
        } else {
            yiVar.getClass();
        }
        this.E.setVisibility(i13);
    }

    public final void e0(double d, double d10) {
        IMapsProvider.ICameraUpdate newCameraUpdateLatLngZoom;
        if (this.H != null) {
            int i10 = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
            if (i10 != 0 && d10 != 0.0d) {
                Location location = new Location("");
                this.f32922r0 = location;
                location.reset();
                this.f32922r0.setLatitude(d);
                this.f32922r0.setLongitude(d10);
            } else {
                Location location2 = new Location("");
                this.f32920q0 = location2;
                location2.reset();
                this.f32920q0.setLatitude(d);
                this.f32920q0.setLongitude(d10);
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
                s0Var.L(this.f32922r0);
            } else {
                s0Var.M(this.f32920q0);
            }
            s0Var.I();
            this.P.v0(0, 1, null);
            this.f32925t0 = true;
            if (i10 != 0 && d10 != 0.0d) {
                this.f32926u0 = true;
                g0(false);
                if (this.f32933y0 != 8) {
                    s0Var.H(null, this.f32922r0, true);
                }
                this.f32927v0 = true;
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
        if (this.f32904a0) {
            z10 = false;
        }
        vl vlVar = this.f32923s;
        if (z10 && vlVar != null && vlVar.getTag() == null && ((location = this.f32920q0) == null || (location2 = this.f32922r0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        if (this.f32933y0 == 8) {
            z10 = false;
        }
        if (vlVar != null) {
            if (!z10 || vlVar.getTag() == null) {
                if (z10 || vlVar.getTag() != null) {
                    if (z10) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    vlVar.setVisibility(i10);
                    if (z10) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    vlVar.setTag(num);
                    AnimatorSet animatorSet = new AnimatorSet();
                    if (z10) {
                        f7 = 0.0f;
                    } else {
                        f7 = -AndroidUtilities.dp(80.0f);
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(vlVar, View.TRANSLATION_X, f7));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(hs.f27119g);
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
        am0 am0Var = (am0) w0Var.K(0);
        if (am0Var != null) {
            i10 = Math.max(((int) am0Var.f47656a.getY()) - this.C0, 0);
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
    public ArrayList<org.telegram.ui.ActionBar.k6> getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList<org.telegram.ui.ActionBar.k6> arrayList = new ArrayList<>();
        a7 a7Var = new a7(this, 2);
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.N, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f20868h5));
        int i10 = org.telegram.ui.ActionBar.i6.A5;
        ai.w0 w0Var = this.P;
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 32768, null, null, null, null, i10));
        org.telegram.ui.ActionBar.v0 v0Var = this.E;
        if (v0Var != null) {
            editTextBoldCursor = v0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.k6(editTextBoldCursor, 16777216, null, null, null, null, org.telegram.ui.ActionBar.i6.f20905j5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f20888i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f20919k0, null, null, org.telegram.ui.ActionBar.i6.f20798d7));
        int i11 = org.telegram.ui.ActionBar.i6.W5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32928w, 8, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.i6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32930x, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32932y, 4, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.i6.ui;
        ImageView imageView = this.f32916n;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView, 262152, null, null, null, null, i13));
        int i14 = org.telegram.ui.ActionBar.i6.vi;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView, 262152, null, null, null, null, i14));
        int i15 = org.telegram.ui.ActionBar.i6.wi;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView, 32, null, null, null, null, i15));
        int i16 = org.telegram.ui.ActionBar.i6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView, 65568, null, null, null, null, i16));
        org.telegram.ui.ActionBar.v0 v0Var2 = this.f32921r;
        arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var2, 0, null, null, null, a7Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var2, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(v0Var2, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32923s, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32923s, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f32923s, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, org.telegram.ui.ActionBar.i6.f21049r0, a7Var, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, a7Var, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.si));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 393216, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20992ni));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 393216, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.qi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 393248, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20974mi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 393248, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21029pi));
        int i17 = org.telegram.ui.ActionBar.i6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"accurateTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 262144, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.ri));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 262144, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f21010oi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"buttonTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 131072, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 196608, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20761b7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 48, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20741a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20981n5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
        qm0 qm0Var = this.Q;
        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.k6(qm0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.w7.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.w7.class}, new String[]{"distanceTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f20869h6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 8, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView2"}, null, null, -1, null, i12));
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
                i10 = (int) K.f47656a.getY();
                i11 = Math.min(i10, 0) + this.f32934z0;
            } else {
                i10 = -f0Var.getMeasuredHeight();
                i11 = 0;
            }
            if (((FrameLayout.LayoutParams) f0Var.getLayoutParams()) != null) {
                ul ulVar = this.F;
                if (i11 <= 0) {
                    if (this.I.getView().getVisibility() == 0) {
                        this.I.getView().setVisibility(4);
                        f0Var.setVisibility(4);
                        if (ulVar != null) {
                            ulVar.setVisibility(4);
                        }
                    }
                    this.I.getView().setTranslationY(i10);
                    return;
                }
                if (this.I.getView().getVisibility() == 4) {
                    this.I.getView().setVisibility(0);
                    f0Var.setVisibility(0);
                    if (ulVar != null) {
                        ulVar.setVisibility(0);
                    }
                }
                int max = Math.max(0, (-((i10 - this.A0) + this.f32934z0)) / 2);
                int i12 = this.A0 - this.f32934z0;
                float max2 = 1.0f - Math.max(0.0f, Math.min(1.0f, (w0Var.getPaddingTop() - i10) / (w0Var.getPaddingTop() - i12)));
                int i13 = this.B0;
                if (this.f32904a0 && a0()) {
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
                if (ulVar != null) {
                    ulVar.setTranslationY(f7);
                }
                int max3 = Math.max(this.C0 - i10, 0);
                int i14 = this.A0;
                org.telegram.ui.ActionBar.v0 v0Var = this.f32921r;
                float min = Math.min(max3, (i14 - v0Var.getMeasuredHeight()) - AndroidUtilities.dp(80.0f));
                v0Var.setTranslationY(min);
                vl vlVar = this.f32923s;
                vlVar.f31815c = min;
                vlVar.setTranslationY(min + vlVar.f31814b);
                this.f32916n.setTranslationY(-this.B0);
                int D = org.telegram.messenger.bi.D(48.0f, (this.A0 - this.B0) / 2, max);
                this.f32924s0 = D;
                this.S.setTranslationY(D);
                if (i13 != this.B0) {
                    IMapsProvider.IMarker iMarker = this.f32910g0;
                    if (iMarker != null) {
                        latLng = new IMapsProvider.LatLng(iMarker.getPosition().latitude, this.f32910g0.getPosition().longitude);
                    } else if (this.f32926u0 && (location = this.f32922r0) != null) {
                        latLng = new IMapsProvider.LatLng(location.getLatitude(), this.f32922r0.getLongitude());
                    } else {
                        Location location2 = this.f32920q0;
                        if (location2 != null) {
                            latLng = new IMapsProvider.LatLng(location2.getLatitude(), this.f32920q0.getLongitude());
                        } else {
                            latLng = null;
                        }
                    }
                    if (latLng != null && (iMap = this.H) != null) {
                        iMap.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                    }
                }
                if (this.f32904a0 && a0()) {
                    int h = this.O.h();
                    for (int i15 = 1; i15 < h; i15++) {
                        s4.d1 K2 = w0Var.K(i15);
                        if (K2 != null) {
                            K2.f47656a.setTranslationY(w0Var.getPaddingTop() - i10);
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
        boolean z10 = this.f32915l0;
        LinearLayout linearLayout = this.v;
        if (z10) {
            boolean z11 = this.f32917n0;
            qm0 qm0Var = this.Q;
            if (z11) {
                qm0Var.setEmptyView(null);
                linearLayout.setVisibility(8);
                return;
            }
            qm0Var.setEmptyView(linearLayout);
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
        rl rlVar = this.R;
        if (rlVar != null) {
            rlVar.F();
        }
        yi yiVar = this.f30173b;
        yiVar.f33211a1.h(true);
        yiVar.f33211a1.o().removeView(this.E);
    }

    @Override
    public final boolean q() {
        p();
        return false;
    }

    public void setDelegate(sl slVar) {
        this.f32931x0 = slVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f30173b.getSheetContainer().invalidate();
        h0();
    }

    @Override
    public final void u() {
        this.E.setVisibility(8);
    }

    @Override
    public final void y() {
        boolean z10;
        yi yiVar = this.f30173b;
        if (yiVar != null && !yiVar.isKeyboardVisible()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.O.f10798c0 = z10;
    }

    @Override
    public final void z(int i10, boolean z10) {
        if (z10) {
            this.O.f10798c0 = false;
        }
    }
}
