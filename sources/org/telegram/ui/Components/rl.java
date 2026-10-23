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
public final class rl extends li implements org.telegram.ui.ActionBar.b6, NotificationCenter.NotificationCenterDelegate {
    public static final int C0 = 0;
    public int A0;
    public final Bitmap[] B0;
    public boolean E;
    public IMapsProvider.IMap F;
    public IMapsProvider.IMapView G;
    public IMapsProvider.ICameraUpdate H;
    public float I;
    public boolean J;
    public final View K;
    public final ah.x L;
    public final hg.s0 M;
    public final ai.u1 N;
    public final mm0 O;
    public final ll P;
    public final ImageView Q;
    public final ig.d0 R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final long f30190a0;
    public final Paint f30191b0;
    public final ArrayList f30192c0;
    public AnimatorSet f30193d0;
    public IMapsProvider.IMarker f30194e0;
    public ql f30195f0;
    public FrameLayout f30196g0;
    public boolean f30197h0;
    public boolean f30198i0;
    public boolean f30199j0;
    public boolean f30200k0;
    public boolean f30201l0;
    public boolean m0;
    public final ImageView f30202n;
    public boolean f30203n0;
    public Location f30204o0;
    public Location f30205p0;
    public int f30206q0;
    public final org.telegram.ui.ActionBar.u0 f30207r;
    public boolean f30208r0;
    public final pl f30209s;
    public boolean f30210s0;
    public boolean f30211t0;
    public boolean f30212u0;
    public final LinearLayout v;
    public ml f30213v0;
    public final TextView f30214w;
    public final int f30215w0;
    public final org.telegram.ui.ActionBar.u0 f30216x;
    public int f30217x0;
    public final ol f30218y;
    public int f30219y0;
    public int f30220z0;

    public rl(ti tiVar, Context context, final org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context, g6Var, tiVar);
        final org.telegram.ui.sn snVar;
        boolean z11;
        int i10;
        boolean z12;
        this.T = true;
        this.U = false;
        this.V = false;
        this.W = true;
        this.f30191b0 = new Paint();
        this.f30192c0 = new ArrayList();
        this.f30197h0 = true;
        this.f30198i0 = true;
        int currentActionBarHeight = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.f30217x0 = currentActionBarHeight;
        this.f30219y0 = currentActionBarHeight;
        this.B0 = new Bitmap[7];
        AndroidUtilities.fixGoogleMapsBug();
        ti tiVar2 = this.f28366b;
        org.telegram.ui.ActionBar.o2 o2Var = tiVar2.f30730f0;
        if (o2Var instanceof org.telegram.ui.sn) {
            snVar = (org.telegram.ui.sn) o2Var;
        } else {
            snVar = null;
        }
        long s12 = tiVar2.s1();
        this.f30190a0 = s12;
        if (this.f28366b.O) {
            this.f30215w0 = 7;
        } else if (z10 && snVar != null && snVar.h == null && !snVar.c() && !UserObject.isUserSelf(snVar.i())) {
            this.f30215w0 = 1;
        } else {
            this.f30215w0 = 0;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        this.f30200k0 = false;
        this.f30199j0 = false;
        this.f30201l0 = false;
        hg.s0 s0Var = this.M;
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
        org.telegram.ui.ActionBar.y m10 = this.f28366b.f30714a1.m();
        this.f30218y = new ol(this, context);
        org.telegram.ui.ActionBar.u0 a2 = m10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.b2(this, 6);
        this.f30216x = a2;
        if (this.V && !this.f28366b.O) {
            i10 = 8;
        } else {
            this.f28366b.getClass();
            i10 = 0;
        }
        a2.setVisibility(i10);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i11 = org.telegram.ui.ActionBar.k6.f21289j5;
        org.telegram.ui.ActionBar.r6.W(searchField, i11, g6Var);
        org.telegram.ui.ActionBar.r6.x(searchField, i11, g6Var);
        org.telegram.ui.ActionBar.r6.F(searchField, org.telegram.ui.ActionBar.k6.Vd, g6Var);
        new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f)).gravity = 83;
        ah.x xVar = new ah.x(this, context, 12);
        this.L = xVar;
        xVar.setWillNotDraw(false);
        View view = new View(context);
        this.K = view;
        view.setBackgroundDrawable(new ed(org.telegram.ui.ActionBar.k6.C0().q()));
        pl plVar = new pl(context, 0);
        this.f30209s = plVar;
        plVar.setTranslationX(-AndroidUtilities.dp(80.0f));
        plVar.setVisibility(4);
        int dp = AndroidUtilities.dp(40.0f);
        int i12 = org.telegram.ui.ActionBar.k6.wi;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i12, this.f28365a);
        int i13 = org.telegram.ui.ActionBar.k6.xi;
        int w03 = org.telegram.ui.ActionBar.k6.w0(i13, this.f28365a);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, w02, w03, w03);
        w7.b6.a(plVar);
        plVar.setTranslationZ(AndroidUtilities.dp(2.0f));
        ci.n1 n1Var = zf.j0.f52047a;
        plVar.setOutlineProvider(n1Var);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i13);
        plVar.setBackground(j02);
        org.telegram.ui.ActionBar.r6.k(plVar, j02, O, O2, g6Var);
        int i14 = org.telegram.ui.ActionBar.k6.vi;
        org.telegram.ui.ActionBar.r6.W(plVar, i14, g6Var);
        plVar.setTextSize(1, 14.0f);
        plVar.setTypeface(AndroidUtilities.bold());
        plVar.setText(LocaleController.getString(R.string.PlacesInThisArea));
        plVar.setGravity(17);
        plVar.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        xVar.addView(plVar, w7.z5.d(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
        plVar.setOnClickListener(new View.OnClickListener(this) {
            public final rl f27363b;

            {
                this.f27363b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        rl rlVar = this.f27363b;
                        rlVar.h0(false);
                        rlVar.M.H(null, rlVar.f30205p0, true);
                        rlVar.f30211t0 = true;
                        rlVar.g0();
                        return;
                    default:
                        this.f27363b.f30207r.M(null, null);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ui, this.f28365a), false, g6Var);
        this.f30207r = u0Var;
        u0Var.setClickable(true);
        u0Var.setSubMenuOpenSide(2);
        u0Var.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        u0Var.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        u0Var.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), g6Var);
        u0Var.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), g6Var);
        u0Var.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), g6Var);
        u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.k6.i0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.k6.w0(i12, this.f28365a), org.telegram.ui.ActionBar.k6.w0(i13, this.f28365a));
        w7.b6.a(u0Var);
        u0Var.setTranslationZ(AndroidUtilities.dp(2.0f));
        u0Var.setOutlineProvider(n1Var);
        org.telegram.ui.ActionBar.n6 O3 = org.telegram.ui.ActionBar.r6.O(i12);
        org.telegram.ui.ActionBar.n6 O4 = org.telegram.ui.ActionBar.r6.O(i13);
        u0Var.setBackground(i02);
        org.telegram.ui.ActionBar.r6.k(u0Var, i02, O3, O4, g6Var);
        u0Var.setIcon(R.drawable.msg_map_type);
        xVar.addView(u0Var, w7.z5.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        u0Var.setOnClickListener(new View.OnClickListener(this) {
            public final rl f27363b;

            {
                this.f27363b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        rl rlVar = this.f27363b;
                        rlVar.h0(false);
                        rlVar.M.H(null, rlVar.f30205p0, true);
                        rlVar.f30211t0 = true;
                        rlVar.g0();
                        return;
                    default:
                        this.f27363b.f30207r.M(null, null);
                        return;
                }
            }
        });
        u0Var.setDelegate(new cl(this, 0));
        ImageView imageView = new ImageView(context);
        this.f30202n = imageView;
        org.telegram.ui.Cells.y i03 = org.telegram.ui.ActionBar.k6.i0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.k6.w0(i12, this.f28365a), org.telegram.ui.ActionBar.k6.w0(i13, this.f28365a));
        w7.b6.a(imageView);
        imageView.setTranslationZ(AndroidUtilities.dp(2.0f));
        imageView.setOutlineProvider(n1Var);
        org.telegram.ui.ActionBar.n6 O5 = org.telegram.ui.ActionBar.r6.O(i12);
        org.telegram.ui.ActionBar.n6 O6 = org.telegram.ui.ActionBar.r6.O(i13);
        imageView.setBackground(i03);
        org.telegram.ui.ActionBar.r6.k(imageView, i03, O5, O6, g6Var);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        org.telegram.ui.ActionBar.r6.t(imageView, i14, g6Var, mode);
        imageView.setTag(Integer.valueOf(i14));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        xVar.addView(imageView, w7.z5.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        imageView.setOnClickListener(new ca(2, this, g6Var));
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(160.0f), 0, 0);
        linearLayout.setVisibility(8);
        addView(linearLayout, w7.z5.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new di.d(15));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.location_empty);
        org.telegram.ui.ActionBar.r6.t(imageView2, org.telegram.ui.ActionBar.k6.W5, g6Var, mode);
        linearLayout.addView(imageView2, w7.z5.n(-2, -2));
        TextView textView = new TextView(context);
        int i15 = org.telegram.ui.ActionBar.k6.X5;
        org.telegram.ui.ActionBar.r6.W(textView, i15, g6Var);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 17.0f);
        textView.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView f7 = org.telegram.messenger.sl.f(linearLayout, textView, w7.z5.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.f30214w = f7;
        org.telegram.ui.ActionBar.r6.W(f7, i15, g6Var);
        f7.setGravity(17);
        f7.setTextSize(1, 15.0f);
        f7.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(f7, w7.z5.t(-2, -2, 17, 0, 6, 0, 0));
        ai.u1 u1Var = new ai.u1(this, context, g6Var, 14);
        this.N = u1Var;
        this.f28367c = u1Var;
        this.d = u1Var;
        this.f28368f = true;
        u1Var.setClipToPadding(false);
        hg.s0 s0Var2 = new hg.s0(context, this.f30215w0, s12, true, g6Var, this.f28366b.O, false, false);
        this.M = s0Var2;
        u1Var.setAdapter(s0Var2);
        ti tiVar3 = this.f28366b;
        if (tiVar3 != null && (tiVar3.H || tiVar3.P)) {
            z12 = true;
        } else {
            z12 = false;
        }
        s0Var2.f12070f0 = z12;
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(bs.h);
        kVar.C = false;
        kVar.f46377m = false;
        u1Var.setItemAnimator(kVar);
        s0Var2.O(this.V, this.U);
        u1Var.setVerticalScrollBarEnabled(false);
        u1Var.t1();
        ig.d0 d0Var = new ig.d0(this, u1Var);
        this.R = d0Var;
        u1Var.setLayoutManager(d0Var);
        addView(u1Var, w7.z5.e(-1, -1, 51));
        u1Var.setOnScrollListener(new kl(this));
        u1Var.setOnItemClickListener(new am0(this) {
            public final rl f25670b;

            {
                this.f25670b = this;
            }

            @Override
            public final void d(int i16, View view2) {
                switch (r4) {
                    case 0:
                        rl.Q(this.f25670b, snVar, g6Var, i16);
                        return;
                    default:
                        rl.R(this.f25670b, snVar, g6Var, i16);
                        return;
                }
            }
        });
        cl clVar = new cl(this, 1);
        s0Var2.H = s12;
        s0Var2.f11848y = clVar;
        s0Var2.P(AndroidUtilities.dp(16.0f) + this.f30217x0);
        addView(xVar, w7.z5.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.G = onCreateMapView;
        onCreateMapView.setOnDispatchTouchEventInterceptor(new cl(this, 2));
        this.G.setOnInterceptTouchEventInterceptor(new p2(8, this, g6Var));
        new Thread(new fl(this, this.G, 1)).start();
        ImageView imageView3 = new ImageView(context);
        this.Q = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        xVar.addView(imageView3, w7.z5.e(28, 48, 49));
        mm0 mm0Var = new mm0(context, g6Var);
        this.O = mm0Var;
        mm0Var.setSections(true);
        mm0Var.setClipToPadding(false);
        mm0Var.setVisibility(8);
        mm0Var.setLayoutManager(new s4.b0(1, false));
        ll llVar2 = new ll(this, context, g6Var, this.f28366b.O);
        this.P = llVar2;
        boolean z13 = this.V;
        if (llVar2.M != z13) {
            llVar2.M = z13;
        }
        cl clVar2 = new cl(this, 6);
        llVar2.H = 0L;
        llVar2.f11848y = clVar2;
        mm0Var.setItemAnimator(null);
        addView(mm0Var, w7.z5.e(-1, -1, 51));
        mm0Var.setOnScrollListener(new ah.d0(this, 26));
        mm0Var.setOnItemClickListener(new am0(this) {
            public final rl f25670b;

            {
                this.f25670b = this;
            }

            @Override
            public final void d(int i16, View view2) {
                switch (r4) {
                    case 0:
                        rl.Q(this.f25670b, snVar, g6Var, i16);
                        return;
                    default:
                        rl.R(this.f25670b, snVar, g6Var, i16);
                        return;
                }
            }
        });
        j0();
    }

    public static void N(rl rlVar, IMapsProvider.IMap iMap) {
        PackageManager packageManager;
        rlVar.F = iMap;
        iMap.setOnMapLoadedCallback(new bl(rlVar, 3));
        if (org.telegram.ui.ActionBar.k6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21183d6, rlVar.f28365a)) < 0.721f) {
            rlVar.S = true;
            rlVar.F.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
        }
        if (rlVar.F != null) {
            Location location = new Location("network");
            rlVar.f30205p0 = location;
            location.setLatitude(20.659322d);
            rlVar.f30205p0.setLongitude(-11.40625d);
            try {
                rlVar.F.setMyLocationEnabled(true);
            } catch (Exception e) {
                FileLog.e(e);
            }
            rlVar.F.getUiSettings().setMyLocationButtonEnabled(false);
            rlVar.F.getUiSettings().setZoomControlsEnabled(false);
            rlVar.F.getUiSettings().setCompassEnabled(false);
            rlVar.F.setOnCameraMoveStartedListener(new cl(rlVar, 3));
            rlVar.F.setOnCameraIdleListener(new bl(rlVar, 5));
            rlVar.F.setOnMyLocationChangeListener(new hl(rlVar, 1));
            rlVar.F.setOnMarkerClickListener(new cl(rlVar, 4));
            rlVar.F.setOnCameraMoveListener(new bl(rlVar, 6));
            rlVar.d0();
            AndroidUtilities.runOnUIThread(new bl(rlVar, 7), 200L);
            if (rlVar.T && rlVar.getParentActivity() != null) {
                rlVar.T = false;
                Activity parentActivity = rlVar.getParentActivity();
                if (parentActivity == null || (packageManager = parentActivity.getPackageManager()) == null || packageManager.hasSystemFeature("android.hardware.location.gps")) {
                    try {
                        if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(rlVar.getParentActivity(), 0, rlVar.f28365a);
                            int i10 = R.raw.permission_request_location;
                            int i11 = org.telegram.ui.ActionBar.k6.L5;
                            alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.k6.w0(i11, rlVar.f28365a), null);
                            alertDialog$Builder.n(i11, rlVar.f28365a);
                            alertDialog$Builder.f20678a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                            alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new cl(rlVar, 5));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.p();
                        }
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                } else {
                    return;
                }
            }
            rlVar.i0();
        }
    }

    public static void O(rl rlVar, org.telegram.ui.sn snVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.g6 g6Var, Long l4) {
        if (snVar != null && snVar.c()) {
            f5.M(rlVar.getParentActivity(), snVar.a(), new ai.u2(rlVar, tL_messageMediaGeo, l4, 27), g6Var);
            return;
        }
        rlVar.f30213v0.b(tL_messageMediaGeo, rlVar.f30215w0, true, 0, l4.longValue());
        rlVar.f28366b.dismiss(true);
    }

    public static void P(rl rlVar) {
        hg.s0 s0Var = rlVar.M;
        ti tiVar = rlVar.f28366b;
        if (rlVar.f30197h0) {
            int i10 = Build.VERSION.SDK_INT;
            Activity parentActivity = rlVar.getParentActivity();
            if (parentActivity != null) {
                rlVar.f30197h0 = false;
                if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    String[] strArr = (!tiVar.O || tiVar.C2 == null || i10 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
                    rlVar.U = true;
                    if (s0Var != null) {
                        s0Var.O(rlVar.V, true);
                    }
                    parentActivity.requestPermissions(strArr, 2);
                } else if (i10 >= 29 && tiVar.O && tiVar.C2 != null && parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") != 0) {
                    rlVar.U = true;
                    if (s0Var != null) {
                        s0Var.O(rlVar.V, true);
                    }
                    parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
                }
            }
        }
    }

    public static void Q(rl rlVar, org.telegram.ui.sn snVar, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        rl rlVar2;
        org.telegram.ui.sn snVar2;
        org.telegram.ui.ActionBar.g6 g6Var2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j10 = rlVar.f30190a0;
        hg.s0 s0Var = rlVar.M;
        ti tiVar = rlVar.f28366b;
        int i11 = rlVar.f30215w0;
        if (i11 == 7) {
            if (i10 == 1 && (tL_messageMediaVenue2 = s0Var.f12068d0) != null) {
                rlVar.f30213v0.b(tL_messageMediaVenue2, i11, true, 0, 0L);
                tiVar.dismiss(true);
                return;
            } else if (i10 == 2 && (tL_messageMediaVenue = s0Var.f12069e0) != null) {
                rlVar.f30213v0.b(tL_messageMediaVenue, i11, true, 0, 0L);
                tiVar.dismiss(true);
                return;
            } else {
                rlVar2 = rlVar;
                snVar2 = snVar;
                g6Var2 = g6Var;
            }
        } else if (i10 == 1) {
            if (rlVar.f30213v0 != null && rlVar.f30205p0 != null) {
                FrameLayout frameLayout = rlVar.f30196g0;
                if (frameLayout != null) {
                    frameLayout.callOnClick();
                    return;
                }
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(rlVar.f30205p0.getLatitude());
                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(rlVar.f30205p0.getLongitude());
                f5.a0(tiVar.M1, tiVar.o1() + 1, tiVar.s1(), new ci.y2(rlVar, snVar, tL_messageMediaGeo, g6Var, 6));
                return;
            } else if (rlVar.V) {
                f5.D(rlVar.getParentActivity()).show();
                return;
            } else {
                return;
            }
        } else {
            rlVar2 = rlVar;
            snVar2 = snVar;
            g6Var2 = g6Var;
            if (i10 == 2 && i11 == 1) {
                if (rlVar2.getLocationController().isSharingLocation(j10)) {
                    rlVar2.getLocationController().removeSharingLocation(j10);
                    tiVar.dismiss(true);
                    return;
                } else if (rlVar2.f30204o0 == null && rlVar2.V) {
                    f5.D(rlVar2.getParentActivity()).show();
                    return;
                } else {
                    rlVar2.c0();
                    return;
                }
            }
        }
        Object J = s0Var.J(i10);
        if (J instanceof TLRPC.TL_messageMediaVenue) {
            f5.a0(tiVar.M1, tiVar.o1() + 1, tiVar.s1(), new ci.y2(rlVar2, snVar2, (TLRPC.TL_messageMediaVenue) J, g6Var2, 7));
        }
    }

    public static void R(rl rlVar, org.telegram.ui.sn snVar, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        TLRPC.TL_messageMediaVenue I = rlVar.P.I(i10);
        if (I != null && rlVar.f30213v0 != null) {
            if (snVar != null && snVar.c()) {
                f5.M(rlVar.getParentActivity(), snVar.a(), new gl(rlVar, I, 0), g6Var);
                return;
            }
            rlVar.f30213v0.b(I, rlVar.f30215w0, true, 0, 0L);
            rlVar.f28366b.dismiss(true);
        }
    }

    public static void S(rl rlVar, org.telegram.ui.sn snVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.g6 g6Var) {
        if (snVar != null && snVar.c()) {
            f5.M(rlVar.getParentActivity(), snVar.a(), new gl(rlVar, tL_messageMediaVenue, 1), g6Var);
            return;
        }
        rlVar.f30213v0.b(tL_messageMediaVenue, rlVar.f30215w0, true, 0, 0L);
        rlVar.f28366b.dismiss(true);
    }

    public static void T(rl rlVar, Location location) {
        int i10;
        ti tiVar = rlVar.f28366b;
        if (tiVar != null && tiVar.f30730f0 != null) {
            rlVar.e0(location);
            hg.s0 s0Var = rlVar.M;
            if (s0Var != null && (((i10 = rlVar.f30215w0) == 7 || i10 == 8) && !rlVar.f30210s0)) {
                s0Var.L(rlVar.f30205p0);
            }
            rlVar.getLocationController().setMapLocation(location, rlVar.W);
            rlVar.W = false;
        }
    }

    public static void U(rl rlVar, IMapsProvider.IMapView iMapView) {
        if (rlVar.G != null && rlVar.getParentActivity() != null) {
            try {
                iMapView.onCreate(null);
                ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                rlVar.G.getMapAsync(new hl(rlVar, 0));
                rlVar.m0 = true;
                if (rlVar.f30203n0) {
                    rlVar.G.onResume();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void V(rl rlVar, org.telegram.ui.ActionBar.g6 g6Var) {
        hg.s0 s0Var = rlVar.M;
        ImageView imageView = rlVar.f30202n;
        Activity parentActivity = rlVar.getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            f5.D(rlVar.getParentActivity()).show();
            return;
        }
        if (rlVar.f30204o0 != null && rlVar.F != null) {
            int i10 = org.telegram.ui.ActionBar.k6.vi;
            org.telegram.ui.ActionBar.r6.t(imageView, i10, g6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setTag(Integer.valueOf(i10));
            s0Var.L(null);
            rlVar.f30210s0 = false;
            rlVar.h0(false);
            rlVar.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(rlVar.f30204o0.getLatitude(), rlVar.f30204o0.getLongitude())));
            if (rlVar.f30211t0) {
                Location location = rlVar.f30204o0;
                if (location != null && rlVar.f30215w0 != 8) {
                    s0Var.H(null, location, true);
                }
                rlVar.f30211t0 = false;
                rlVar.g0();
            }
        }
        if (rlVar.f30194e0 != null) {
            rlVar.Q.setVisibility(0);
            ol olVar = rlVar.f30218y;
            IMapsProvider.IMarker iMarker = rlVar.f30194e0;
            HashMap hashMap = olVar.f29227a;
            View view = (View) hashMap.get(iMarker);
            if (view != null) {
                olVar.removeView(view);
                hashMap.remove(iMarker);
            }
            rlVar.f30194e0 = null;
            rlVar.f30195f0 = null;
            rlVar.f30196g0 = null;
        }
    }

    public static void W(rl rlVar) {
        if (rlVar.getParentActivity() != null) {
            try {
                rlVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
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
        return this.f28366b.f30730f0.getLocationController();
    }

    private MessagesController getMessagesController() {
        return this.f28366b.f30730f0.getMessagesController();
    }

    public Activity getParentActivity() {
        org.telegram.ui.ActionBar.o2 o2Var;
        ti tiVar = this.f28366b;
        if (tiVar != null && (o2Var = tiVar.f30730f0) != null) {
            return o2Var.getParentActivity();
        }
        return null;
    }

    private UserConfig getUserConfig() {
        return this.f28366b.f30730f0.getUserConfig();
    }

    @Override
    public final void A() {
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView != null && this.m0) {
            try {
                iMapView.onPause();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        this.f30203n0 = false;
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.rl.B(int, int):void");
    }

    @Override
    public final void C() {
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView != null && this.m0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.f30203n0 = true;
    }

    @Override
    public final void F(li liVar) {
        long j10;
        ti tiVar = this.f28366b;
        tiVar.f30714a1.setTitle(LocaleController.getString(R.string.ShareLocation));
        if (this.G.getView().getParent() == null) {
            View view = this.G.getView();
            FrameLayout.LayoutParams e = w7.z5.e(-1, AndroidUtilities.dp(10.0f) + this.f30217x0, 51);
            ah.x xVar = this.L;
            xVar.addView(view, 0, e);
            xVar.addView(this.f30218y, 1, w7.z5.e(-1, AndroidUtilities.dp(10.0f) + this.f30217x0, 51));
            xVar.addView(this.K, 2, w7.z5.c(-1.0f, -1));
        }
        this.f30216x.setVisibility(0);
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView != null && this.m0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.f30203n0 = true;
        IMapsProvider.IMap iMap = this.F;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        a0();
        boolean u10 = tiVar.f30722c2.u();
        bl blVar = new bl(this, 1);
        if (u10) {
            j10 = 200;
        } else {
            j10 = 0;
        }
        AndroidUtilities.runOnUIThread(blVar, j10);
        this.R.h1(0, 0);
        i0();
    }

    @Override
    public final void J() {
        this.N.x0(0);
    }

    @Override
    public final boolean L() {
        return !this.V;
    }

    public final void Y() {
        org.telegram.ui.ActionBar.u0 u0Var = this.f30207r;
        if (u0Var != null) {
            u0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ui, this.f28365a));
            this.f30207r.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, this.f28365a));
            this.f30207r.G(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, this.f28365a), true);
            this.f30207r.G(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, this.f28365a), false);
        }
        if (this.F != null) {
            if (org.telegram.ui.ActionBar.k6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21183d6, this.f28365a)) < 0.721f) {
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
        Bitmap[] bitmapArr = this.B0;
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
            paint.setColor(org.telegram.ui.Cells.t4.a(i10));
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
            int i12 = this.f30215w0;
            if (i12 == 1 || i12 == 7 || i12 == 8) {
                dp += AndroidUtilities.dp(66.0f);
            }
            int dp2 = (i11 - dp) - AndroidUtilities.dp(90.0f);
            int dp3 = AndroidUtilities.dp(189.0f);
            this.f30217x0 = dp3;
            if (!this.V || !b0()) {
                dp2 = Math.min(AndroidUtilities.dp(310.0f), dp2);
            }
            this.f30219y0 = Math.max(dp3, dp2);
            if (this.V && b0()) {
                this.f30217x0 = this.f30219y0;
            }
            ai.u1 u1Var = this.N;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) u1Var.getLayoutParams();
            layoutParams2.topMargin = currentActionBarHeight;
            u1Var.setLayoutParams(layoutParams2);
            ah.x xVar = this.L;
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) xVar.getLayoutParams();
            layoutParams3.topMargin = currentActionBarHeight;
            layoutParams3.height = this.f30219y0;
            xVar.setLayoutParams(layoutParams3);
            mm0 mm0Var = this.O;
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) mm0Var.getLayoutParams();
            layoutParams4.topMargin = currentActionBarHeight;
            mm0Var.setLayoutParams(layoutParams4);
            if (this.V && b0()) {
                i10 = this.f30217x0 - u1Var.getPaddingTop();
            } else {
                i10 = this.f30217x0;
            }
            int dp4 = AndroidUtilities.dp(16.0f) + i10;
            hg.s0 s0Var = this.M;
            s0Var.P(dp4);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.G.getView().getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.height = AndroidUtilities.dp(10.0f) + this.f30219y0;
                this.G.getView().setLayoutParams(layoutParams5);
            }
            ol olVar = this.f30218y;
            if (olVar != null && (layoutParams = (FrameLayout.LayoutParams) olVar.getLayoutParams()) != null) {
                layoutParams.height = AndroidUtilities.dp(10.0f) + this.f30219y0;
                olVar.setLayoutParams(layoutParams);
            }
            s0Var.l();
            i0();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21365n5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21125a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21145b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Oh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Sh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21396oi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21452ri));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21184d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21272i6));
    }

    public final boolean b0() {
        int i10 = this.f30215w0;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final void c0() {
        TLRPC.User user;
        Activity parentActivity;
        if (this.f30213v0 != null && getParentActivity() != null && this.f30204o0 != null) {
            boolean z10 = this.f30198i0;
            org.telegram.ui.ActionBar.g6 g6Var = this.f28365a;
            if (z10 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
                this.f30198i0 = false;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                    globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                    f5.l(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new bl(this, 2), g6Var).p();
                    return;
                }
            }
            long j10 = this.f30190a0;
            if (DialogObject.isUserDialog(j10)) {
                user = this.f28366b.f30730f0.getMessagesController().getUser(Long.valueOf(j10));
            } else {
                user = null;
            }
            f5.E(getParentActivity(), false, user, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i10) {
                    rl rlVar = rl.this;
                    ti tiVar = rlVar.f28366b;
                    f5.a0(tiVar.M1, tiVar.o1() + 1, tiVar.s1(), new ei.e4(rlVar, i10, 4));
                }
            }, g6Var).show();
        }
    }

    public final void d0() {
        rl rlVar;
        ti tiVar = this.f28366b;
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
                                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.u7(this, Double.parseDouble(matcher.group(1)), Double.parseDouble(matcher.group(2)), 2));
                                    return;
                                }
                            }
                        } catch (NumberFormatException | Exception unused) {
                        }
                    } else {
                        rlVar = this;
                        ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                        float[] fArr = new float[2];
                        if (exifInterface.getLatLong(fArr)) {
                            AndroidUtilities.runOnUIThread(new ee(16, this, fArr));
                            return;
                        }
                        Location lastLocation = getLastLocation();
                        rlVar.f30204o0 = lastLocation;
                        e0(lastLocation);
                        return;
                    }
                }
                rlVar = this;
                Location lastLocation2 = getLastLocation();
                rlVar.f30204o0 = lastLocation2;
                e0(lastLocation2);
                return;
            } else {
                AndroidUtilities.runOnUIThread(new bl(this, 8));
                return;
            }
        }
        Location lastLocation3 = getLastLocation();
        this.f30204o0 = lastLocation3;
        e0(lastLocation3);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        boolean z10;
        boolean z11;
        int i12 = NotificationCenter.locationPermissionGranted;
        ll llVar = this.P;
        hg.s0 s0Var = this.M;
        int i13 = 0;
        if (i10 == i12) {
            this.V = false;
            this.U = false;
            d0();
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
        ti tiVar = this.f28366b;
        if (z12 && !tiVar.O) {
            i13 = 8;
        } else {
            tiVar.getClass();
        }
        this.f30216x.setVisibility(i13);
    }

    public final void e0(Location location) {
        if (location != null) {
            Location location2 = new Location(location);
            this.f30204o0 = location2;
            IMapsProvider.IMap iMap = this.F;
            hg.s0 s0Var = this.M;
            if (iMap != null) {
                IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
                if (s0Var != null) {
                    if (!this.f30211t0 && this.f30215w0 != 8) {
                        s0Var.H(null, this.f30204o0, true);
                    }
                    s0Var.M(this.f30204o0);
                }
                if (!this.f30210s0) {
                    this.f30205p0 = new Location(location);
                    if (this.f30212u0) {
                        this.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                        return;
                    }
                    this.f30212u0 = true;
                    this.F.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.F.getMaxZoomLevel() - 4.0f));
                    return;
                }
                return;
            }
            s0Var.M(location2);
        }
    }

    public final void f0(double d, double d10) {
        IMapsProvider.ICameraUpdate newCameraUpdateLatLngZoom;
        if (this.F != null) {
            int i10 = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
            if (i10 != 0 && d10 != 0.0d) {
                Location location = new Location("");
                this.f30205p0 = location;
                location.reset();
                this.f30205p0.setLatitude(d);
                this.f30205p0.setLongitude(d10);
            } else {
                Location location2 = new Location("");
                this.f30204o0 = location2;
                location2.reset();
                this.f30204o0.setLatitude(d);
                this.f30204o0.setLongitude(d10);
            }
            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(d, d10);
            if (i10 != 0 && d10 != 0.0d) {
                newCameraUpdateLatLngZoom = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.F.getMaxZoomLevel() - 4.0f);
            } else {
                newCameraUpdateLatLngZoom = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.F.getMinZoomLevel());
            }
            this.H = newCameraUpdateLatLngZoom;
            this.F.moveCamera(newCameraUpdateLatLngZoom);
            hg.s0 s0Var = this.M;
            if (i10 != 0 && d10 != 0.0d) {
                s0Var.L(this.f30205p0);
            } else {
                s0Var.M(this.f30204o0);
            }
            s0Var.I();
            this.N.v0(0, 1, null);
            this.f30208r0 = true;
            if (i10 != 0 && d10 != 0.0d) {
                this.f30210s0 = true;
                h0(false);
                if (this.f30215w0 != 8) {
                    s0Var.H(null, this.f30205p0, true);
                }
                this.f30211t0 = true;
                g0();
            }
        }
    }

    public final void g0() {
        if (this.M.h() != 0 && this.R.L0() == 0) {
            ai.u1 u1Var = this.N;
            View childAt = u1Var.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top >= 0 && top <= AndroidUtilities.dp(258.0f)) {
                u1Var.v0(0, top, null);
            }
        }
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(56.0f);
    }

    @Override
    public int getCurrentItemTop() {
        ai.u1 u1Var = this.N;
        if (u1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        wl0 wl0Var = (wl0) u1Var.K(0);
        if (wl0Var != null) {
            i10 = Math.max(((int) wl0Var.f46343a.getY()) - this.A0, 0);
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
    public ArrayList<org.telegram.ui.ActionBar.t6> getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList<org.telegram.ui.ActionBar.t6> arrayList = new ArrayList<>();
        z6 z6Var = new z6(this, 1);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.L, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21254h5));
        int i10 = org.telegram.ui.ActionBar.k6.A5;
        ai.u1 u1Var = this.N;
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        org.telegram.ui.ActionBar.u0 u0Var = this.f30216x;
        if (u0Var != null) {
            editTextBoldCursor = u0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(editTextBoldCursor, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21289j5));
        int i11 = org.telegram.ui.ActionBar.k6.wi;
        ImageView imageView = this.f30202n;
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        int i13 = org.telegram.ui.ActionBar.k6.ui;
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f30207r;
        arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, z6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f30209s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f30209s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21471si));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21491ti));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 393216, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21378ni));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 393216, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21432qi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 393248, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21358mi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 393248, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21413pi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 196608, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21255h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 8, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.W5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.X5));
        return arrayList;
    }

    public final void h0(boolean z10) {
        int i10;
        Integer num;
        float f7;
        Location location;
        Location location2;
        if (this.V) {
            z10 = false;
        }
        pl plVar = this.f30209s;
        if (z10 && plVar != null && plVar.getTag() == null && ((location = this.f30204o0) == null || (location2 = this.f30205p0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        if (this.f30215w0 == 8) {
            z10 = false;
        }
        if (plVar != null) {
            if (!z10 || plVar.getTag() == null) {
                if (z10 || plVar.getTag() != null) {
                    if (z10) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    plVar.setVisibility(i10);
                    if (z10) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    plVar.setTag(num);
                    AnimatorSet animatorSet = new AnimatorSet();
                    if (z10) {
                        f7 = 0.0f;
                    } else {
                        f7 = -AndroidUtilities.dp(80.0f);
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(plVar, View.TRANSLATION_X, f7));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(bs.f25134g);
                    animatorSet.start();
                }
            }
        }
    }

    @Override
    public final int i() {
        return 1;
    }

    public final void i0() {
        ah.x xVar;
        int i10;
        int i11;
        IMapsProvider.LatLng latLng;
        Location location;
        IMapsProvider.IMap iMap;
        if (this.G != null && (xVar = this.L) != null) {
            ai.u1 u1Var = this.N;
            s4.b1 K = u1Var.K(0);
            if (K != null) {
                i10 = (int) K.f46343a.getY();
                i11 = Math.min(i10, 0) + this.f30217x0;
            } else {
                i10 = -xVar.getMeasuredHeight();
                i11 = 0;
            }
            if (((FrameLayout.LayoutParams) xVar.getLayoutParams()) != null) {
                ol olVar = this.f30218y;
                if (i11 <= 0) {
                    if (this.G.getView().getVisibility() == 0) {
                        this.G.getView().setVisibility(4);
                        xVar.setVisibility(4);
                        if (olVar != null) {
                            olVar.setVisibility(4);
                        }
                    }
                    this.G.getView().setTranslationY(i10);
                    return;
                }
                if (this.G.getView().getVisibility() == 4) {
                    this.G.getView().setVisibility(0);
                    xVar.setVisibility(0);
                    if (olVar != null) {
                        olVar.setVisibility(0);
                    }
                }
                int max = Math.max(0, (-((i10 - this.f30219y0) + this.f30217x0)) / 2);
                int i12 = this.f30219y0 - this.f30217x0;
                float max2 = 1.0f - Math.max(0.0f, Math.min(1.0f, (u1Var.getPaddingTop() - i10) / (u1Var.getPaddingTop() - i12)));
                int i13 = this.f30220z0;
                if (this.V && b0()) {
                    i12 += Math.min(i10, u1Var.getPaddingTop());
                }
                this.f30220z0 = (int) (i12 * max2);
                float f7 = max;
                this.G.getView().setTranslationY(f7);
                this.A0 = i12 - this.f30220z0;
                xVar.invalidate();
                xVar.setTranslationY(i10 - this.A0);
                IMapsProvider.IMap iMap2 = this.F;
                if (iMap2 != null) {
                    iMap2.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f) + this.f30220z0);
                }
                if (olVar != null) {
                    olVar.setTranslationY(f7);
                }
                int max3 = Math.max(this.A0 - i10, 0);
                int i14 = this.f30219y0;
                org.telegram.ui.ActionBar.u0 u0Var = this.f30207r;
                float min = Math.min(max3, (i14 - u0Var.getMeasuredHeight()) - AndroidUtilities.dp(80.0f));
                u0Var.setTranslationY(min);
                pl plVar = this.f30209s;
                plVar.f29587c = min;
                plVar.setTranslationY(min + plVar.f29586b);
                this.f30202n.setTranslationY(-this.f30220z0);
                int D = org.telegram.messenger.sl.D(48.0f, (this.f30219y0 - this.f30220z0) / 2, max);
                this.f30206q0 = D;
                this.Q.setTranslationY(D);
                if (i13 != this.f30220z0) {
                    IMapsProvider.IMarker iMarker = this.f30194e0;
                    if (iMarker != null) {
                        latLng = new IMapsProvider.LatLng(iMarker.getPosition().latitude, this.f30194e0.getPosition().longitude);
                    } else if (this.f30210s0 && (location = this.f30205p0) != null) {
                        latLng = new IMapsProvider.LatLng(location.getLatitude(), this.f30205p0.getLongitude());
                    } else {
                        Location location2 = this.f30204o0;
                        if (location2 != null) {
                            latLng = new IMapsProvider.LatLng(location2.getLatitude(), this.f30204o0.getLongitude());
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
                        s4.b1 K2 = u1Var.K(i15);
                        if (K2 != null) {
                            K2.f46343a.setTranslationY(u1Var.getPaddingTop() - i10);
                        }
                    }
                }
            }
        }
    }

    public final void j0() {
        boolean z10 = this.f30199j0;
        LinearLayout linearLayout = this.v;
        if (z10) {
            boolean z11 = this.f30201l0;
            mm0 mm0Var = this.O;
            if (z11) {
                mm0Var.setEmptyView(null);
                linearLayout.setVisibility(8);
                return;
            }
            mm0Var.setEmptyView(linearLayout);
            return;
        }
        linearLayout.setVisibility(8);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            a0();
        }
    }

    @Override
    public final void p() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionDenied);
        this.E = true;
        ah.x xVar = this.L;
        if (xVar != null) {
            xVar.invalidate();
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
        hg.s0 s0Var = this.M;
        if (s0Var != null) {
            s0Var.F();
        }
        ll llVar = this.P;
        if (llVar != null) {
            llVar.F();
        }
        ti tiVar = this.f28366b;
        tiVar.f30714a1.g(true);
        tiVar.f30714a1.m().removeView(this.f30216x);
    }

    @Override
    public final boolean q() {
        p();
        return false;
    }

    public void setDelegate(ml mlVar) {
        this.f30213v0 = mlVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f28366b.getSheetContainer().invalidate();
        i0();
    }

    @Override
    public final void u() {
        this.f30216x.setVisibility(8);
    }

    @Override
    public final void updateColors() {
        try {
            Y();
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.ActionBar.u0 u0Var = this.f30216x;
        if (u0Var != null) {
            try {
                if (u0Var.getSearchField() != null) {
                    u0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21289j5, this.f28365a));
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    @Override
    public final void y() {
        boolean z10;
        ti tiVar = this.f28366b;
        if (tiVar != null && !tiVar.isKeyboardVisible()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.M.f12067c0 = z10;
    }

    @Override
    public final void z(int i10, boolean z10) {
        if (z10) {
            this.M.f12067c0 = false;
        }
    }
}
