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
public final class pl extends ji implements org.telegram.ui.ActionBar.b6, NotificationCenter.NotificationCenterDelegate {
    public static final int B0 = 0;
    public final Bitmap[] A0;
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
    public final lm0 O;
    public final jl P;
    public final ImageView Q;
    public final ig.d0 R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean W;
    public final long f29588a0;
    public final Paint f29589b0;
    public final ArrayList f29590c0;
    public AnimatorSet f29591d0;
    public IMapsProvider.IMarker f29592e0;
    public ol f29593f0;
    public FrameLayout f29594g0;
    public boolean f29595h0;
    public boolean f29596i0;
    public boolean f29597j0;
    public boolean f29598k0;
    public boolean f29599l0;
    public boolean m0;
    public final ImageView f29600n;
    public Location f29601n0;
    public Location f29602o0;
    public int f29603p0;
    public boolean f29604q0;
    public final org.telegram.ui.ActionBar.u0 f29605r;
    public boolean f29606r0;
    public final nl f29607s;
    public boolean f29608s0;
    public boolean f29609t0;
    public kl f29610u0;
    public final LinearLayout v;
    public final int f29611v0;
    public final TextView f29612w;
    public int f29613w0;
    public final org.telegram.ui.ActionBar.u0 f29614x;
    public int f29615x0;
    public final ml f29616y;
    public int f29617y0;
    public int f29618z0;

    public pl(ri riVar, Context context, final org.telegram.ui.ActionBar.g6 g6Var, boolean z10) {
        super(context, g6Var, riVar);
        final org.telegram.ui.sn snVar;
        boolean z11;
        int i10;
        boolean z12;
        this.T = true;
        this.U = false;
        this.V = false;
        this.W = true;
        this.f29589b0 = new Paint();
        this.f29590c0 = new ArrayList();
        this.f29595h0 = true;
        int currentActionBarHeight = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.f29613w0 = currentActionBarHeight;
        this.f29615x0 = currentActionBarHeight;
        this.A0 = new Bitmap[7];
        AndroidUtilities.fixGoogleMapsBug();
        ri riVar2 = this.f27704b;
        org.telegram.ui.ActionBar.o2 o2Var = riVar2.f30146f0;
        if (o2Var instanceof org.telegram.ui.sn) {
            snVar = (org.telegram.ui.sn) o2Var;
        } else {
            snVar = null;
        }
        long s12 = riVar2.s1();
        this.f29588a0 = s12;
        if (this.f27704b.O) {
            this.f29611v0 = 7;
        } else if (z10 && snVar != null && snVar.h == null && !snVar.c() && !UserObject.isUserSelf(snVar.i())) {
            this.f29611v0 = 1;
        } else {
            this.f29611v0 = 0;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        this.f29597j0 = false;
        this.f29596i0 = false;
        this.f29598k0 = false;
        hg.s0 s0Var = this.M;
        if (s0Var != null) {
            s0Var.F();
        }
        jl jlVar = this.P;
        if (jlVar != null) {
            jlVar.F();
        }
        if (getParentActivity() != null && getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.V = z11;
        org.telegram.ui.ActionBar.y m10 = this.f27704b.f30130a1.m();
        this.f29616y = new ml(this, context);
        org.telegram.ui.ActionBar.u0 a2 = m10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.b2(this, 6);
        this.f29614x = a2;
        if (this.V && !this.f27704b.O) {
            i10 = 8;
        } else {
            this.f27704b.getClass();
            i10 = 0;
        }
        a2.setVisibility(i10);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i11 = org.telegram.ui.ActionBar.k6.f21290j5;
        org.telegram.ui.ActionBar.r6.W(searchField, i11, g6Var);
        org.telegram.ui.ActionBar.r6.x(searchField, i11, g6Var);
        org.telegram.ui.ActionBar.r6.F(searchField, org.telegram.ui.ActionBar.k6.Vd, g6Var);
        new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f)).gravity = 83;
        ah.x xVar = new ah.x(this, context, 12);
        this.L = xVar;
        xVar.setWillNotDraw(false);
        View view = new View(context);
        this.K = view;
        view.setBackgroundDrawable(new cd(org.telegram.ui.ActionBar.k6.C0().q()));
        nl nlVar = new nl(context, 0);
        this.f29607s = nlVar;
        nlVar.setTranslationX(-AndroidUtilities.dp(80.0f));
        nlVar.setVisibility(4);
        int dp = AndroidUtilities.dp(40.0f);
        int i12 = org.telegram.ui.ActionBar.k6.wi;
        int w02 = org.telegram.ui.ActionBar.k6.w0(i12, this.f27703a);
        int i13 = org.telegram.ui.ActionBar.k6.xi;
        int w03 = org.telegram.ui.ActionBar.k6.w0(i13, this.f27703a);
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.k6.j0(dp, dp, dp, dp, w02, w03, w03);
        w7.b6.a(nlVar);
        nlVar.setTranslationZ(AndroidUtilities.dp(2.0f));
        ci.n1 n1Var = zf.j0.f52046a;
        nlVar.setOutlineProvider(n1Var);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i12);
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i13);
        nlVar.setBackground(j02);
        org.telegram.ui.ActionBar.r6.k(nlVar, j02, O, O2, g6Var);
        int i14 = org.telegram.ui.ActionBar.k6.vi;
        org.telegram.ui.ActionBar.r6.W(nlVar, i14, g6Var);
        nlVar.setTextSize(1, 14.0f);
        nlVar.setTypeface(AndroidUtilities.bold());
        nlVar.setText(LocaleController.getString(R.string.PlacesInThisArea));
        nlVar.setGravity(17);
        nlVar.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        xVar.addView(nlVar, w7.z5.d(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
        nlVar.setOnClickListener(new View.OnClickListener(this) {
            public final pl f26716b;

            {
                this.f26716b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        pl plVar = this.f26716b;
                        plVar.g0(false);
                        plVar.M.H(null, plVar.f29602o0, true);
                        plVar.f29608s0 = true;
                        plVar.f0();
                        return;
                    default:
                        this.f26716b.f29605r.M(null, null);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, 0, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ui, this.f27703a), false, g6Var);
        this.f29605r = u0Var;
        u0Var.setClickable(true);
        u0Var.setSubMenuOpenSide(2);
        u0Var.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        u0Var.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        u0Var.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), g6Var);
        u0Var.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), g6Var);
        u0Var.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), g6Var);
        u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.k6.i0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.k6.w0(i12, this.f27703a), org.telegram.ui.ActionBar.k6.w0(i13, this.f27703a));
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
            public final pl f26716b;

            {
                this.f26716b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        pl plVar = this.f26716b;
                        plVar.g0(false);
                        plVar.M.H(null, plVar.f29602o0, true);
                        plVar.f29608s0 = true;
                        plVar.f0();
                        return;
                    default:
                        this.f26716b.f29605r.M(null, null);
                        return;
                }
            }
        });
        u0Var.setDelegate(new al(this, 0));
        ImageView imageView = new ImageView(context);
        this.f29600n = imageView;
        org.telegram.ui.Cells.y i03 = org.telegram.ui.ActionBar.k6.i0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.k6.w0(i12, this.f27703a), org.telegram.ui.ActionBar.k6.w0(i13, this.f27703a));
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
        imageView.setOnClickListener(new aa(2, this, g6Var));
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
        TextView f7 = org.telegram.messenger.tl.f(linearLayout, textView, w7.z5.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.f29612w = f7;
        org.telegram.ui.ActionBar.r6.W(f7, i15, g6Var);
        f7.setGravity(17);
        f7.setTextSize(1, 15.0f);
        f7.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(f7, w7.z5.t(-2, -2, 17, 0, 6, 0, 0));
        ai.u1 u1Var = new ai.u1(this, context, g6Var, 14);
        this.N = u1Var;
        this.f27705c = u1Var;
        this.d = u1Var;
        this.f27706f = true;
        u1Var.setClipToPadding(false);
        hg.s0 s0Var2 = new hg.s0(context, this.f29611v0, s12, true, g6Var, this.f27704b.O, false, false);
        this.M = s0Var2;
        u1Var.setAdapter(s0Var2);
        ri riVar3 = this.f27704b;
        if (riVar3 != null && (riVar3.H || riVar3.P)) {
            z12 = true;
        } else {
            z12 = false;
        }
        s0Var2.f12070f0 = z12;
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(zr.h);
        kVar.C = false;
        kVar.f46376m = false;
        u1Var.setItemAnimator(kVar);
        s0Var2.O(this.V, this.U);
        u1Var.setVerticalScrollBarEnabled(false);
        u1Var.t1();
        ig.d0 d0Var = new ig.d0(this, u1Var);
        this.R = d0Var;
        u1Var.setLayoutManager(d0Var);
        addView(u1Var, w7.z5.e(-1, -1, 51));
        u1Var.setOnScrollListener(new il(this));
        u1Var.setOnItemClickListener(new zl0(this) {
            public final pl f25046b;

            {
                this.f25046b = this;
            }

            @Override
            public final void d(int i16, View view2) {
                switch (r4) {
                    case 0:
                        pl.Q(this.f25046b, snVar, g6Var, i16);
                        return;
                    default:
                        pl.R(this.f25046b, snVar, g6Var, i16);
                        return;
                }
            }
        });
        al alVar = new al(this, 1);
        s0Var2.H = s12;
        s0Var2.f11848y = alVar;
        s0Var2.P(AndroidUtilities.dp(16.0f) + this.f29613w0);
        addView(xVar, w7.z5.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.G = onCreateMapView;
        onCreateMapView.setOnDispatchTouchEventInterceptor(new al(this, 2));
        this.G.setOnInterceptTouchEventInterceptor(new o2(8, this, g6Var));
        new Thread(new cl(this, this.G, 1)).start();
        ImageView imageView3 = new ImageView(context);
        this.Q = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        xVar.addView(imageView3, w7.z5.e(28, 48, 49));
        lm0 lm0Var = new lm0(context, g6Var);
        this.O = lm0Var;
        lm0Var.setSections(true);
        lm0Var.setClipToPadding(false);
        lm0Var.setVisibility(8);
        lm0Var.setLayoutManager(new s4.b0(1, false));
        jl jlVar2 = new jl(this, context, g6Var, this.f27704b.O);
        this.P = jlVar2;
        boolean z13 = this.V;
        if (jlVar2.M != z13) {
            jlVar2.M = z13;
        }
        al alVar2 = new al(this, 6);
        jlVar2.H = 0L;
        jlVar2.f11848y = alVar2;
        lm0Var.setItemAnimator(null);
        addView(lm0Var, w7.z5.e(-1, -1, 51));
        lm0Var.setOnScrollListener(new ah.d0(this, 26));
        lm0Var.setOnItemClickListener(new zl0(this) {
            public final pl f25046b;

            {
                this.f25046b = this;
            }

            @Override
            public final void d(int i16, View view2) {
                switch (r4) {
                    case 0:
                        pl.Q(this.f25046b, snVar, g6Var, i16);
                        return;
                    default:
                        pl.R(this.f25046b, snVar, g6Var, i16);
                        return;
                }
            }
        });
        i0();
    }

    public static void N(pl plVar, IMapsProvider.IMap iMap) {
        PackageManager packageManager;
        plVar.F = iMap;
        iMap.setOnMapLoadedCallback(new zk(plVar, 2));
        if (org.telegram.ui.ActionBar.k6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21184d6, plVar.f27703a)) < 0.721f) {
            plVar.S = true;
            plVar.F.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
        }
        if (plVar.F != null) {
            Location location = new Location("network");
            plVar.f29602o0 = location;
            location.setLatitude(20.659322d);
            plVar.f29602o0.setLongitude(-11.40625d);
            try {
                plVar.F.setMyLocationEnabled(true);
            } catch (Exception e) {
                FileLog.e(e);
            }
            plVar.F.getUiSettings().setMyLocationButtonEnabled(false);
            plVar.F.getUiSettings().setZoomControlsEnabled(false);
            plVar.F.getUiSettings().setCompassEnabled(false);
            plVar.F.setOnCameraMoveStartedListener(new al(plVar, 3));
            plVar.F.setOnCameraIdleListener(new zk(plVar, 4));
            plVar.F.setOnMyLocationChangeListener(new fl(plVar, 1));
            plVar.F.setOnMarkerClickListener(new al(plVar, 4));
            plVar.F.setOnCameraMoveListener(new zk(plVar, 5));
            plVar.c0();
            AndroidUtilities.runOnUIThread(new zk(plVar, 6), 200L);
            if (plVar.T && plVar.getParentActivity() != null) {
                plVar.T = false;
                Activity parentActivity = plVar.getParentActivity();
                if (parentActivity == null || (packageManager = parentActivity.getPackageManager()) == null || packageManager.hasSystemFeature("android.hardware.location.gps")) {
                    try {
                        if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(plVar.getParentActivity(), 0, plVar.f27703a);
                            int i10 = R.raw.permission_request_location;
                            int i11 = org.telegram.ui.ActionBar.k6.L5;
                            alertDialog$Builder.m(i10, 72, org.telegram.ui.ActionBar.k6.w0(i11, plVar.f27703a), null);
                            alertDialog$Builder.n(i11, plVar.f27703a);
                            alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                            alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new al(plVar, 5));
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
            plVar.h0();
        }
    }

    public static void O(pl plVar, org.telegram.ui.sn snVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.g6 g6Var, Long l4) {
        if (snVar != null && snVar.c()) {
            d5.L(plVar.getParentActivity(), snVar.a(), new ai.u2(plVar, tL_messageMediaGeo, l4, 27), g6Var);
            return;
        }
        plVar.f29610u0.b(tL_messageMediaGeo, plVar.f29611v0, true, 0, l4.longValue());
        plVar.f27704b.dismiss(true);
    }

    public static void P(pl plVar) {
        hg.s0 s0Var = plVar.M;
        ri riVar = plVar.f27704b;
        if (plVar.f29595h0) {
            int i10 = Build.VERSION.SDK_INT;
            Activity parentActivity = plVar.getParentActivity();
            if (parentActivity != null) {
                plVar.f29595h0 = false;
                if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    String[] strArr = (!riVar.O || riVar.C2 == null || i10 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
                    plVar.U = true;
                    if (s0Var != null) {
                        s0Var.O(plVar.V, true);
                    }
                    parentActivity.requestPermissions(strArr, 2);
                } else if (i10 >= 29 && riVar.O && riVar.C2 != null && parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") != 0) {
                    plVar.U = true;
                    if (s0Var != null) {
                        s0Var.O(plVar.V, true);
                    }
                    parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
                }
            }
        }
    }

    public static void Q(pl plVar, org.telegram.ui.sn snVar, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        pl plVar2;
        org.telegram.ui.sn snVar2;
        org.telegram.ui.ActionBar.g6 g6Var2;
        TLRPC.User user;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j10 = plVar.f29588a0;
        hg.s0 s0Var = plVar.M;
        ri riVar = plVar.f27704b;
        int i11 = plVar.f29611v0;
        if (i11 == 7) {
            if (i10 == 1 && (tL_messageMediaVenue2 = s0Var.f12068d0) != null) {
                plVar.f29610u0.b(tL_messageMediaVenue2, i11, true, 0, 0L);
                riVar.dismiss(true);
                return;
            } else if (i10 == 2 && (tL_messageMediaVenue = s0Var.f12069e0) != null) {
                plVar.f29610u0.b(tL_messageMediaVenue, i11, true, 0, 0L);
                riVar.dismiss(true);
                return;
            } else {
                plVar2 = plVar;
                snVar2 = snVar;
                g6Var2 = g6Var;
            }
        } else if (i10 == 1) {
            if (plVar.f29610u0 != null && plVar.f29602o0 != null) {
                FrameLayout frameLayout = plVar.f29594g0;
                if (frameLayout != null) {
                    frameLayout.callOnClick();
                    return;
                }
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(plVar.f29602o0.getLatitude());
                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(plVar.f29602o0.getLongitude());
                d5.Z(riVar.M1, riVar.o1() + 1, riVar.s1(), new ci.y2(plVar, snVar, tL_messageMediaGeo, g6Var, 6));
                return;
            } else if (plVar.V) {
                d5.C(plVar.getParentActivity()).show();
                return;
            } else {
                return;
            }
        } else {
            plVar2 = plVar;
            snVar2 = snVar;
            g6Var2 = g6Var;
            if (i10 == 2 && i11 == 1) {
                if (plVar2.getLocationController().isSharingLocation(j10)) {
                    plVar2.getLocationController().removeSharingLocation(j10);
                    riVar.dismiss(true);
                    return;
                } else if (plVar2.f29601n0 == null && plVar2.V) {
                    d5.C(plVar2.getParentActivity()).show();
                    return;
                } else if (plVar2.f29610u0 != null && plVar2.getParentActivity() != null && plVar2.f29601n0 != null) {
                    if (DialogObject.isUserDialog(j10)) {
                        user = riVar.f30146f0.getMessagesController().getUser(Long.valueOf(j10));
                    } else {
                        user = null;
                    }
                    d5.D(plVar2.getParentActivity(), false, user, new MessagesStorage.IntCallback() {
                        @Override
                        public final void run(int i12) {
                            pl plVar3 = pl.this;
                            ri riVar2 = plVar3.f27704b;
                            d5.Z(riVar2.M1, riVar2.o1() + 1, riVar2.s1(), new ei.e4(plVar3, i12, 4));
                        }
                    }, plVar2.f27703a).show();
                    return;
                } else {
                    return;
                }
            }
        }
        Object J = s0Var.J(i10);
        if (J instanceof TLRPC.TL_messageMediaVenue) {
            d5.Z(riVar.M1, riVar.o1() + 1, riVar.s1(), new ci.y2(plVar2, snVar2, (TLRPC.TL_messageMediaVenue) J, g6Var2, 7));
        }
    }

    public static void R(pl plVar, org.telegram.ui.sn snVar, org.telegram.ui.ActionBar.g6 g6Var, int i10) {
        TLRPC.TL_messageMediaVenue I = plVar.P.I(i10);
        if (I != null && plVar.f29610u0 != null) {
            if (snVar != null && snVar.c()) {
                d5.L(plVar.getParentActivity(), snVar.a(), new dl(plVar, I, 0), g6Var);
                return;
            }
            plVar.f29610u0.b(I, plVar.f29611v0, true, 0, 0L);
            plVar.f27704b.dismiss(true);
        }
    }

    public static void S(pl plVar, org.telegram.ui.sn snVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.g6 g6Var) {
        if (snVar != null && snVar.c()) {
            d5.L(plVar.getParentActivity(), snVar.a(), new dl(plVar, tL_messageMediaVenue, 1), g6Var);
            return;
        }
        plVar.f29610u0.b(tL_messageMediaVenue, plVar.f29611v0, true, 0, 0L);
        plVar.f27704b.dismiss(true);
    }

    public static void T(pl plVar, Location location) {
        int i10;
        ri riVar = plVar.f27704b;
        if (riVar != null && riVar.f30146f0 != null) {
            plVar.d0(location);
            hg.s0 s0Var = plVar.M;
            if (s0Var != null && (((i10 = plVar.f29611v0) == 7 || i10 == 8) && !plVar.f29606r0)) {
                s0Var.L(plVar.f29602o0);
            }
            plVar.getLocationController().setMapLocation(location, plVar.W);
            plVar.W = false;
        }
    }

    public static void U(pl plVar, IMapsProvider.IMapView iMapView) {
        if (plVar.G != null && plVar.getParentActivity() != null) {
            try {
                iMapView.onCreate(null);
                ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                plVar.G.getMapAsync(new fl(plVar, 0));
                plVar.f29599l0 = true;
                if (plVar.m0) {
                    plVar.G.onResume();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void V(pl plVar, org.telegram.ui.ActionBar.g6 g6Var) {
        hg.s0 s0Var = plVar.M;
        ImageView imageView = plVar.f29600n;
        Activity parentActivity = plVar.getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            d5.C(plVar.getParentActivity()).show();
            return;
        }
        if (plVar.f29601n0 != null && plVar.F != null) {
            int i10 = org.telegram.ui.ActionBar.k6.vi;
            org.telegram.ui.ActionBar.r6.t(imageView, i10, g6Var, PorterDuff.Mode.MULTIPLY);
            imageView.setTag(Integer.valueOf(i10));
            s0Var.L(null);
            plVar.f29606r0 = false;
            plVar.g0(false);
            plVar.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(plVar.f29601n0.getLatitude(), plVar.f29601n0.getLongitude())));
            if (plVar.f29608s0) {
                Location location = plVar.f29601n0;
                if (location != null && plVar.f29611v0 != 8) {
                    s0Var.H(null, location, true);
                }
                plVar.f29608s0 = false;
                plVar.f0();
            }
        }
        if (plVar.f29592e0 != null) {
            plVar.Q.setVisibility(0);
            ml mlVar = plVar.f29616y;
            IMapsProvider.IMarker iMarker = plVar.f29592e0;
            HashMap hashMap = mlVar.f28620a;
            View view = (View) hashMap.get(iMarker);
            if (view != null) {
                mlVar.removeView(view);
                hashMap.remove(iMarker);
            }
            plVar.f29592e0 = null;
            plVar.f29593f0 = null;
            plVar.f29594g0 = null;
        }
    }

    public static void W(pl plVar) {
        if (plVar.getParentActivity() != null) {
            try {
                plVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
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
        return this.f27704b.f30146f0.getLocationController();
    }

    private MessagesController getMessagesController() {
        return this.f27704b.f30146f0.getMessagesController();
    }

    public Activity getParentActivity() {
        org.telegram.ui.ActionBar.o2 o2Var;
        ri riVar = this.f27704b;
        if (riVar != null && (o2Var = riVar.f30146f0) != null) {
            return o2Var.getParentActivity();
        }
        return null;
    }

    private UserConfig getUserConfig() {
        return this.f27704b.f30146f0.getUserConfig();
    }

    @Override
    public final void A() {
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView != null && this.f29599l0) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pl.B(int, int):void");
    }

    @Override
    public final void C() {
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView != null && this.f29599l0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.m0 = true;
    }

    @Override
    public final void F(ji jiVar) {
        long j10;
        ri riVar = this.f27704b;
        riVar.f30130a1.setTitle(LocaleController.getString(R.string.ShareLocation));
        if (this.G.getView().getParent() == null) {
            View view = this.G.getView();
            FrameLayout.LayoutParams e = w7.z5.e(-1, AndroidUtilities.dp(10.0f) + this.f29613w0, 51);
            ah.x xVar = this.L;
            xVar.addView(view, 0, e);
            xVar.addView(this.f29616y, 1, w7.z5.e(-1, AndroidUtilities.dp(10.0f) + this.f29613w0, 51));
            xVar.addView(this.K, 2, w7.z5.c(-1.0f, -1));
        }
        this.f29614x.setVisibility(0);
        IMapsProvider.IMapView iMapView = this.G;
        if (iMapView != null && this.f29599l0) {
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
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        a0();
        boolean u10 = riVar.f30138c2.u();
        zk zkVar = new zk(this, 1);
        if (u10) {
            j10 = 200;
        } else {
            j10 = 0;
        }
        AndroidUtilities.runOnUIThread(zkVar, j10);
        this.R.h1(0, 0);
        h0();
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
        org.telegram.ui.ActionBar.u0 u0Var = this.f29605r;
        if (u0Var != null) {
            u0Var.setIconColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.ui, this.f27703a));
            this.f29605r.B(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G8, this.f27703a));
            this.f29605r.G(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.F8, this.f27703a), true);
            this.f29605r.G(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.E8, this.f27703a), false);
        }
        if (this.F != null) {
            if (org.telegram.ui.ActionBar.k6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21184d6, this.f27703a)) < 0.721f) {
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
            int i12 = this.f29611v0;
            if (i12 == 1 || i12 == 7 || i12 == 8) {
                dp += AndroidUtilities.dp(66.0f);
            }
            int dp2 = (i11 - dp) - AndroidUtilities.dp(90.0f);
            int dp3 = AndroidUtilities.dp(189.0f);
            this.f29613w0 = dp3;
            if (!this.V || !b0()) {
                dp2 = Math.min(AndroidUtilities.dp(310.0f), dp2);
            }
            this.f29615x0 = Math.max(dp3, dp2);
            if (this.V && b0()) {
                this.f29613w0 = this.f29615x0;
            }
            ai.u1 u1Var = this.N;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) u1Var.getLayoutParams();
            layoutParams2.topMargin = currentActionBarHeight;
            u1Var.setLayoutParams(layoutParams2);
            ah.x xVar = this.L;
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) xVar.getLayoutParams();
            layoutParams3.topMargin = currentActionBarHeight;
            layoutParams3.height = this.f29615x0;
            xVar.setLayoutParams(layoutParams3);
            lm0 lm0Var = this.O;
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) lm0Var.getLayoutParams();
            layoutParams4.topMargin = currentActionBarHeight;
            lm0Var.setLayoutParams(layoutParams4);
            if (this.V && b0()) {
                i10 = this.f29613w0 - u1Var.getPaddingTop();
            } else {
                i10 = this.f29613w0;
            }
            int dp4 = AndroidUtilities.dp(16.0f) + i10;
            hg.s0 s0Var = this.M;
            s0Var.P(dp4);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.G.getView().getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.height = AndroidUtilities.dp(10.0f) + this.f29615x0;
                this.G.getView().setLayoutParams(layoutParams5);
            }
            ml mlVar = this.f29616y;
            if (mlVar != null && (layoutParams = (FrameLayout.LayoutParams) mlVar.getLayoutParams()) != null) {
                layoutParams.height = AndroidUtilities.dp(10.0f) + this.f29615x0;
                mlVar.setLayoutParams(layoutParams);
            }
            s0Var.l();
            h0();
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.G6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21366n5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21126a7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21146b7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Oh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Sh));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21397oi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21453ri));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21185d7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21273i6));
    }

    public final boolean b0() {
        int i10 = this.f29611v0;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final void c0() {
        pl plVar;
        ri riVar = this.f27704b;
        if (riVar.O) {
            if (riVar.D2 != null) {
                AndroidUtilities.runOnUIThread(new zk(this, 0));
                return;
            } else if (!this.V) {
                File file = riVar.C2;
                boolean z10 = riVar.B2;
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
                        plVar = this;
                        ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                        float[] fArr = new float[2];
                        if (exifInterface.getLatLong(fArr)) {
                            AndroidUtilities.runOnUIThread(new ce(16, this, fArr));
                            return;
                        }
                        Location lastLocation = getLastLocation();
                        plVar.f29601n0 = lastLocation;
                        d0(lastLocation);
                        return;
                    }
                }
                plVar = this;
                Location lastLocation2 = getLastLocation();
                plVar.f29601n0 = lastLocation2;
                d0(lastLocation2);
                return;
            } else {
                AndroidUtilities.runOnUIThread(new zk(this, 7));
                return;
            }
        }
        Location lastLocation3 = getLastLocation();
        this.f29601n0 = lastLocation3;
        d0(lastLocation3);
    }

    public final void d0(Location location) {
        if (location != null) {
            Location location2 = new Location(location);
            this.f29601n0 = location2;
            IMapsProvider.IMap iMap = this.F;
            hg.s0 s0Var = this.M;
            if (iMap != null) {
                IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
                if (s0Var != null) {
                    if (!this.f29608s0 && this.f29611v0 != 8) {
                        s0Var.H(null, this.f29601n0, true);
                    }
                    s0Var.M(this.f29601n0);
                }
                if (!this.f29606r0) {
                    this.f29602o0 = new Location(location);
                    if (this.f29609t0) {
                        this.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                        return;
                    }
                    this.f29609t0 = true;
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
        jl jlVar = this.P;
        hg.s0 s0Var = this.M;
        int i13 = 0;
        if (i10 == i12) {
            this.V = false;
            this.U = false;
            c0();
            if (s0Var != null) {
                s0Var.O(this.V, this.U);
            }
            if (jlVar != null && jlVar.M != (z11 = this.V)) {
                jlVar.M = z11;
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
            if (jlVar != null && jlVar.M != (z10 = this.V)) {
                jlVar.M = z10;
            }
        }
        a0();
        boolean z12 = this.V;
        ri riVar = this.f27704b;
        if (z12 && !riVar.O) {
            i13 = 8;
        } else {
            riVar.getClass();
        }
        this.f29614x.setVisibility(i13);
    }

    public final void e0(double d, double d10) {
        IMapsProvider.ICameraUpdate newCameraUpdateLatLngZoom;
        if (this.F != null) {
            int i10 = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
            if (i10 != 0 && d10 != 0.0d) {
                Location location = new Location("");
                this.f29602o0 = location;
                location.reset();
                this.f29602o0.setLatitude(d);
                this.f29602o0.setLongitude(d10);
            } else {
                Location location2 = new Location("");
                this.f29601n0 = location2;
                location2.reset();
                this.f29601n0.setLatitude(d);
                this.f29601n0.setLongitude(d10);
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
                s0Var.L(this.f29602o0);
            } else {
                s0Var.M(this.f29601n0);
            }
            s0Var.I();
            this.N.v0(0, 1, null);
            this.f29604q0 = true;
            if (i10 != 0 && d10 != 0.0d) {
                this.f29606r0 = true;
                g0(false);
                if (this.f29611v0 != 8) {
                    s0Var.H(null, this.f29602o0, true);
                }
                this.f29608s0 = true;
                f0();
            }
        }
    }

    public final void f0() {
        if (this.M.h() != 0 && this.R.L0() == 0) {
            ai.u1 u1Var = this.N;
            View childAt = u1Var.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top >= 0 && top <= AndroidUtilities.dp(258.0f)) {
                u1Var.v0(0, top, null);
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
        nl nlVar = this.f29607s;
        if (z10 && nlVar != null && nlVar.getTag() == null && ((location = this.f29601n0) == null || (location2 = this.f29602o0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        if (this.f29611v0 == 8) {
            z10 = false;
        }
        if (nlVar != null) {
            if (!z10 || nlVar.getTag() == null) {
                if (z10 || nlVar.getTag() != null) {
                    if (z10) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    nlVar.setVisibility(i10);
                    if (z10) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    nlVar.setTag(num);
                    AnimatorSet animatorSet = new AnimatorSet();
                    if (z10) {
                        f7 = 0.0f;
                    } else {
                        f7 = -AndroidUtilities.dp(80.0f);
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(nlVar, View.TRANSLATION_X, f7));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(zr.f33338g);
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
        ai.u1 u1Var = this.N;
        if (u1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        vl0 vl0Var = (vl0) u1Var.K(0);
        if (vl0Var != null) {
            i10 = Math.max(((int) vl0Var.f46342a.getY()) - this.f29618z0, 0);
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
        x6 x6Var = new x6(this, 1);
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.L, 1, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21255h5));
        int i10 = org.telegram.ui.ActionBar.k6.A5;
        ai.u1 u1Var = this.N;
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 32768, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        org.telegram.ui.ActionBar.u0 u0Var = this.f29614x;
        if (u0Var != null) {
            editTextBoldCursor = u0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(editTextBoldCursor, 16777216, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21290j5));
        int i11 = org.telegram.ui.ActionBar.k6.wi;
        ImageView imageView = this.f29600n;
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        int i12 = org.telegram.ui.ActionBar.k6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        int i13 = org.telegram.ui.ActionBar.k6.ui;
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f29605r;
        arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, x6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u0Var2, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f29607s, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f29607s, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21472si));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21492ti));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 393216, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21379ni));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 393216, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21433qi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 393248, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21359mi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 393248, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21414pi));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 196608, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"progressBar"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21256h6));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 8, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.W5));
        arrayList.add(new org.telegram.ui.ActionBar.t6(u1Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView2"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.X5));
        return arrayList;
    }

    public final void h0() {
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
                i10 = (int) K.f46342a.getY();
                i11 = Math.min(i10, 0) + this.f29613w0;
            } else {
                i10 = -xVar.getMeasuredHeight();
                i11 = 0;
            }
            if (((FrameLayout.LayoutParams) xVar.getLayoutParams()) != null) {
                ml mlVar = this.f29616y;
                if (i11 <= 0) {
                    if (this.G.getView().getVisibility() == 0) {
                        this.G.getView().setVisibility(4);
                        xVar.setVisibility(4);
                        if (mlVar != null) {
                            mlVar.setVisibility(4);
                        }
                    }
                    this.G.getView().setTranslationY(i10);
                    return;
                }
                if (this.G.getView().getVisibility() == 4) {
                    this.G.getView().setVisibility(0);
                    xVar.setVisibility(0);
                    if (mlVar != null) {
                        mlVar.setVisibility(0);
                    }
                }
                int max = Math.max(0, (-((i10 - this.f29615x0) + this.f29613w0)) / 2);
                int i12 = this.f29615x0 - this.f29613w0;
                float max2 = 1.0f - Math.max(0.0f, Math.min(1.0f, (u1Var.getPaddingTop() - i10) / (u1Var.getPaddingTop() - i12)));
                int i13 = this.f29617y0;
                if (this.V && b0()) {
                    i12 += Math.min(i10, u1Var.getPaddingTop());
                }
                this.f29617y0 = (int) (i12 * max2);
                float f7 = max;
                this.G.getView().setTranslationY(f7);
                this.f29618z0 = i12 - this.f29617y0;
                xVar.invalidate();
                xVar.setTranslationY(i10 - this.f29618z0);
                IMapsProvider.IMap iMap2 = this.F;
                if (iMap2 != null) {
                    iMap2.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f) + this.f29617y0);
                }
                if (mlVar != null) {
                    mlVar.setTranslationY(f7);
                }
                int max3 = Math.max(this.f29618z0 - i10, 0);
                int i14 = this.f29615x0;
                org.telegram.ui.ActionBar.u0 u0Var = this.f29605r;
                float min = Math.min(max3, (i14 - u0Var.getMeasuredHeight()) - AndroidUtilities.dp(80.0f));
                u0Var.setTranslationY(min);
                nl nlVar = this.f29607s;
                nlVar.f28963c = min;
                nlVar.setTranslationY(min + nlVar.f28962b);
                this.f29600n.setTranslationY(-this.f29617y0);
                int D = org.telegram.messenger.tl.D(48.0f, (this.f29615x0 - this.f29617y0) / 2, max);
                this.f29603p0 = D;
                this.Q.setTranslationY(D);
                if (i13 != this.f29617y0) {
                    IMapsProvider.IMarker iMarker = this.f29592e0;
                    if (iMarker != null) {
                        latLng = new IMapsProvider.LatLng(iMarker.getPosition().latitude, this.f29592e0.getPosition().longitude);
                    } else if (this.f29606r0 && (location = this.f29602o0) != null) {
                        latLng = new IMapsProvider.LatLng(location.getLatitude(), this.f29602o0.getLongitude());
                    } else {
                        Location location2 = this.f29601n0;
                        if (location2 != null) {
                            latLng = new IMapsProvider.LatLng(location2.getLatitude(), this.f29601n0.getLongitude());
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
                            K2.f46342a.setTranslationY(u1Var.getPaddingTop() - i10);
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
        boolean z10 = this.f29596i0;
        LinearLayout linearLayout = this.v;
        if (z10) {
            boolean z11 = this.f29598k0;
            lm0 lm0Var = this.O;
            if (z11) {
                lm0Var.setEmptyView(null);
                linearLayout.setVisibility(8);
                return;
            }
            lm0Var.setEmptyView(linearLayout);
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
        jl jlVar = this.P;
        if (jlVar != null) {
            jlVar.F();
        }
        ri riVar = this.f27704b;
        riVar.f30130a1.g(true);
        riVar.f30130a1.m().removeView(this.f29614x);
    }

    @Override
    public final boolean q() {
        p();
        return false;
    }

    public void setDelegate(kl klVar) {
        this.f29610u0 = klVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27704b.getSheetContainer().invalidate();
        h0();
    }

    @Override
    public final void u() {
        this.f29614x.setVisibility(8);
    }

    @Override
    public final void updateColors() {
        try {
            Y();
        } catch (Exception e) {
            FileLog.e(e);
        }
        org.telegram.ui.ActionBar.u0 u0Var = this.f29614x;
        if (u0Var != null) {
            try {
                if (u0Var.getSearchField() != null) {
                    u0Var.getSearchField().setCursorColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21290j5, this.f27703a));
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    @Override
    public final void y() {
        boolean z10;
        ri riVar = this.f27704b;
        if (riVar != null && !riVar.isKeyboardVisible()) {
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
