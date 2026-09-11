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
public final class gl extends ni implements NotificationCenter.NotificationCenterDelegate {
    public static final int E0 = 0;
    public int A0;
    public int B0;
    public int C0;
    public final Bitmap[] D0;
    public final org.telegram.ui.ActionBar.v0 E;
    public final dl F;
    public boolean G;
    public IMapsProvider.IMap H;
    public IMapsProvider.IMapView I;
    public IMapsProvider.ICameraUpdate J;
    public float K;
    public boolean L;
    public final View M;
    public final ah.y N;
    public final hg.t0 O;
    public final bi.o0 P;
    public final ll0 Q;
    public final al R;
    public final ImageView S;
    public final ig.e0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean f26428a0;
    public boolean f26429b0;
    public final long f26430c0;
    public final Paint f26431d0;
    public final ArrayList f26432e0;
    public AnimatorSet f26433f0;
    public IMapsProvider.IMarker f26434g0;
    public fl f26435h0;
    public FrameLayout f26436i0;
    public boolean f26437j0;
    public boolean f26438k0;
    public boolean f26439l0;
    public boolean m0;
    public final ImageView f26440n;
    public boolean f26441n0;
    public boolean f26442o0;
    public boolean f26443p0;
    public Location f26444q0;
    public final org.telegram.ui.ActionBar.v0 f26445r;
    public Location f26446r0;
    public final el f26447s;
    public int f26448s0;
    public boolean f26449t0;
    public boolean f26450u0;
    public final LinearLayout v;
    public boolean f26451v0;
    public final ImageView f26452w;
    public boolean f26453w0;
    public final TextView f26454x;
    public bl f26455x0;
    public final TextView f26456y;
    public final int f26457y0;
    public int f26458z0;

    public gl(vi viVar, Context context, final org.telegram.ui.ActionBar.f6 f6Var, boolean z10) {
        super(context, f6Var, viVar);
        final org.telegram.ui.co coVar;
        boolean z11;
        int i10;
        boolean z12;
        this.V = true;
        this.W = false;
        this.f26428a0 = false;
        this.f26429b0 = true;
        this.f26431d0 = new Paint();
        this.f26432e0 = new ArrayList();
        this.f26437j0 = true;
        this.f26438k0 = true;
        int currentActionBarHeight = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.f26458z0 = currentActionBarHeight;
        this.A0 = currentActionBarHeight;
        this.D0 = new Bitmap[7];
        AndroidUtilities.fixGoogleMapsBug();
        vi viVar2 = this.f28753b;
        org.telegram.ui.ActionBar.n2 n2Var = viVar2.f31279f0;
        if (n2Var instanceof org.telegram.ui.co) {
            coVar = (org.telegram.ui.co) n2Var;
        } else {
            coVar = null;
        }
        long n12 = viVar2.n1();
        this.f26430c0 = n12;
        if (this.f28753b.O) {
            this.f26457y0 = 7;
        } else if (z10 && coVar != null && coVar.h == null && !coVar.c() && !UserObject.isUserSelf(coVar.i())) {
            this.f26457y0 = 1;
        } else {
            this.f26457y0 = 0;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        this.m0 = false;
        this.f26439l0 = false;
        this.f26441n0 = false;
        hg.t0 t0Var = this.O;
        if (t0Var != null) {
            t0Var.F();
        }
        al alVar = this.R;
        if (alVar != null) {
            alVar.F();
        }
        if (Build.VERSION.SDK_INT >= 23 && getParentActivity() != null && getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f26428a0 = z11;
        org.telegram.ui.ActionBar.z n10 = this.f28753b.X0.n();
        this.F = new dl(this, context);
        org.telegram.ui.ActionBar.v0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.d2(this, 6);
        this.E = a2;
        if (this.f26428a0 && !this.f28753b.O) {
            i10 = 8;
        } else {
            this.f28753b.getClass();
            i10 = 0;
        }
        a2.setVisibility(i10);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i11 = org.telegram.ui.ActionBar.j6.f20770j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, this.f28752a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i11, this.f28752a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Vd, this.f28752a));
        new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f)).gravity = 83;
        ah.y yVar = new ah.y(this, context, 10);
        this.N = yVar;
        yVar.setWillNotDraw(false);
        View view = new View(context);
        this.M = view;
        view.setBackgroundDrawable(new fd(org.telegram.ui.ActionBar.j6.A0().q()));
        el elVar = new el(context, 0);
        this.f26447s = elVar;
        elVar.setTranslationX(-AndroidUtilities.dp(80.0f));
        elVar.setVisibility(4);
        int dp = AndroidUtilities.dp(40.0f);
        int i12 = org.telegram.ui.ActionBar.j6.wi;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i12, this.f28752a);
        int i13 = org.telegram.ui.ActionBar.j6.xi;
        int v03 = org.telegram.ui.ActionBar.j6.v0(i13, this.f28752a);
        org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v02, v03, v03);
        w7.z5.a(elVar);
        elVar.setTranslationZ(AndroidUtilities.dp(2.0f));
        bi.z1 z1Var = yf.j0.f50112a;
        elVar.setOutlineProvider(z1Var);
        elVar.setBackground(i02);
        int i14 = org.telegram.ui.ActionBar.j6.vi;
        elVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, this.f28752a));
        elVar.setTextSize(1, 14.0f);
        elVar.setTypeface(AndroidUtilities.bold());
        elVar.setText(LocaleController.getString(R.string.PlacesInThisArea));
        elVar.setGravity(17);
        elVar.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        yVar.addView(elVar, w7.x5.d(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
        elVar.setOnClickListener(new View.OnClickListener(this) {
            public final gl f30324b;

            {
                this.f30324b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        gl.Q(this.f30324b);
                        return;
                    case 1:
                        gl glVar = this.f30324b;
                        glVar.d0(false);
                        glVar.O.H(null, glVar.f26446r0, true);
                        glVar.f26451v0 = true;
                        glVar.c0();
                        return;
                    default:
                        this.f30324b.f26445r.M(null, null);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, 0, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ui, this.f28752a), false, f6Var);
        this.f26445r = v0Var;
        v0Var.setClickable(true);
        v0Var.setSubMenuOpenSide(2);
        v0Var.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        v0Var.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        v0Var.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), f6Var);
        v0Var.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), f6Var);
        v0Var.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), f6Var);
        v0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.j6.v0(i12, this.f28752a), org.telegram.ui.ActionBar.j6.v0(i13, this.f28752a));
        w7.z5.a(v0Var);
        v0Var.setTranslationZ(AndroidUtilities.dp(2.0f));
        v0Var.setOutlineProvider(z1Var);
        v0Var.setBackground(h02);
        v0Var.setIcon(R.drawable.msg_map_type);
        yVar.addView(v0Var, w7.x5.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        v0Var.setOnClickListener(new View.OnClickListener(this) {
            public final gl f30324b;

            {
                this.f30324b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        gl.Q(this.f30324b);
                        return;
                    case 1:
                        gl glVar = this.f30324b;
                        glVar.d0(false);
                        glVar.O.H(null, glVar.f26446r0, true);
                        glVar.f26451v0 = true;
                        glVar.c0();
                        return;
                    default:
                        this.f30324b.f26445r.M(null, null);
                        return;
                }
            }
        });
        v0Var.setDelegate(new rk(this, 0));
        ImageView imageView = new ImageView(context);
        this.f26440n = imageView;
        org.telegram.ui.Cells.z h03 = org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.j6.v0(i12, this.f28752a), org.telegram.ui.ActionBar.j6.v0(i13, this.f28752a));
        w7.z5.a(imageView);
        imageView.setTranslationZ(AndroidUtilities.dp(2.0f));
        imageView.setOutlineProvider(z1Var);
        imageView.setBackground(h03);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int v04 = org.telegram.ui.ActionBar.j6.v0(i14, this.f28752a);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v04, mode));
        imageView.setTag(Integer.valueOf(i14));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        yVar.addView(imageView, w7.x5.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final gl f30324b;

            {
                this.f30324b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        gl.Q(this.f30324b);
                        return;
                    case 1:
                        gl glVar = this.f30324b;
                        glVar.d0(false);
                        glVar.O.H(null, glVar.f26446r0, true);
                        glVar.f26451v0 = true;
                        glVar.c0();
                        return;
                    default:
                        this.f30324b.f26445r.M(null, null);
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
        addView(linearLayout, w7.x5.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new ci.d(15));
        ImageView imageView2 = new ImageView(context);
        this.f26452w = imageView2;
        imageView2.setImageResource(R.drawable.location_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W5, this.f28752a), mode));
        linearLayout.addView(imageView2, w7.x5.n(-2, -2));
        TextView textView = new TextView(context);
        this.f26454x = textView;
        int i15 = org.telegram.ui.ActionBar.j6.X5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, this.f28752a));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 17.0f);
        textView.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.x5.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.f26456y = h;
        h.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, this.f28752a));
        h.setGravity(17);
        h.setTextSize(1, 15.0f);
        h.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(h, w7.x5.t(-2, -2, 17, 0, 6, 0, 0));
        bi.o0 o0Var = new bi.o0(this, context, f6Var, 13);
        this.P = o0Var;
        this.f28754c = o0Var;
        this.d = o0Var;
        this.f28756f = true;
        o0Var.setClipToPadding(false);
        hg.t0 t0Var2 = new hg.t0(context, this.f26457y0, n12, true, f6Var, this.f28753b.O, false, false);
        this.O = t0Var2;
        o0Var.setAdapter(t0Var2);
        vi viVar3 = this.f28753b;
        if (viVar3 != null && (viVar3.H || viVar3.P)) {
            z12 = true;
        } else {
            z12 = false;
        }
        t0Var2.f11257f0 = z12;
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(pr.h);
        jVar.C = false;
        jVar.f45777m = false;
        o0Var.setItemAnimator(jVar);
        t0Var2.O(this.f26428a0, this.W);
        o0Var.setVerticalScrollBarEnabled(false);
        o0Var.o1();
        ig.e0 e0Var = new ig.e0(this, o0Var);
        this.T = e0Var;
        o0Var.setLayoutManager(e0Var);
        addView(o0Var, w7.x5.e(-1, -1, 51));
        o0Var.setOnScrollListener(new zk(this));
        o0Var.setOnItemClickListener(new zk0(this) {
            public final gl f30617b;

            {
                this.f30617b = this;
            }

            @Override
            public final void a(int i16, View view2) {
                switch (r4) {
                    case 0:
                        gl.N(this.f30617b, coVar, f6Var, i16);
                        return;
                    default:
                        gl.O(this.f30617b, coVar, f6Var, i16);
                        return;
                }
            }
        });
        rk rkVar = new rk(this, 1);
        t0Var2.H = n12;
        t0Var2.f11003y = rkVar;
        t0Var2.P(AndroidUtilities.dp(16.0f) + this.f26458z0);
        addView(yVar, w7.x5.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.I = onCreateMapView;
        onCreateMapView.setOnDispatchTouchEventInterceptor(new rk(this, 2));
        this.I.setOnInterceptTouchEventInterceptor(new rk(this, 3));
        new Thread(new vk(this, this.I, 1)).start();
        ImageView imageView3 = new ImageView(context);
        this.S = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        yVar.addView(imageView3, w7.x5.e(28, 48, 49));
        ll0 ll0Var = new ll0(context, f6Var);
        this.Q = ll0Var;
        ll0Var.setSections(true);
        ll0Var.setClipToPadding(false);
        ll0Var.setVisibility(8);
        ll0Var.setLayoutManager(new s4.c0(1, false));
        al alVar2 = new al(this, context, f6Var, this.f28753b.O);
        this.R = alVar2;
        boolean z13 = this.f26428a0;
        if (alVar2.M != z13) {
            alVar2.M = z13;
        }
        rk rkVar2 = new rk(this, 7);
        alVar2.H = 0L;
        alVar2.f11003y = rkVar2;
        ll0Var.setItemAnimator(null);
        addView(ll0Var, w7.x5.e(-1, -1, 51));
        ll0Var.setOnScrollListener(new ah.e0(this, 22));
        ll0Var.setOnItemClickListener(new zk0(this) {
            public final gl f30617b;

            {
                this.f30617b = this;
            }

            @Override
            public final void a(int i16, View view2) {
                switch (r4) {
                    case 0:
                        gl.N(this.f30617b, coVar, f6Var, i16);
                        return;
                    default:
                        gl.O(this.f30617b, coVar, f6Var, i16);
                        return;
                }
            }
        });
        f0();
    }

    public static void K(gl glVar, IMapsProvider.IMap iMap) {
        PackageManager packageManager;
        glVar.H = iMap;
        iMap.setOnMapLoadedCallback(new qk(glVar, 3));
        if (org.telegram.ui.ActionBar.j6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20663d6, glVar.f28752a)) < 0.721f) {
            glVar.U = true;
            glVar.H.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
        }
        if (glVar.H != null) {
            Location location = new Location("network");
            glVar.f26446r0 = location;
            location.setLatitude(20.659322d);
            glVar.f26446r0.setLongitude(-11.40625d);
            try {
                glVar.H.setMyLocationEnabled(true);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            glVar.H.getUiSettings().setMyLocationButtonEnabled(false);
            glVar.H.getUiSettings().setZoomControlsEnabled(false);
            glVar.H.getUiSettings().setCompassEnabled(false);
            glVar.H.setOnCameraMoveStartedListener(new rk(glVar, 4));
            glVar.H.setOnCameraIdleListener(new qk(glVar, 5));
            glVar.H.setOnMyLocationChangeListener(new xk(glVar, 1));
            glVar.H.setOnMarkerClickListener(new rk(glVar, 5));
            glVar.H.setOnCameraMoveListener(new qk(glVar, 6));
            glVar.Z();
            AndroidUtilities.runOnUIThread(new qk(glVar, 7), 200L);
            if (glVar.V && glVar.getParentActivity() != null) {
                glVar.V = false;
                Activity parentActivity = glVar.getParentActivity();
                if (parentActivity == null || (packageManager = parentActivity.getPackageManager()) == null || packageManager.hasSystemFeature("android.hardware.location.gps")) {
                    try {
                        if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(glVar.getParentActivity(), 0, glVar.f28752a);
                            alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L5, glVar.f28752a), null);
                            alertDialog$Builder.f20198a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                            alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new rk(glVar, 6));
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
            glVar.e0();
        }
    }

    public static void L(gl glVar, org.telegram.ui.co coVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.f6 f6Var, Long l4) {
        if (coVar != null && coVar.c()) {
            e5.M(glVar.getParentActivity(), coVar.a(), new androidx.car.app.utils.a(glVar, tL_messageMediaGeo, l4, 25), f6Var);
            return;
        }
        glVar.f26455x0.b(tL_messageMediaGeo, glVar.f26457y0, true, 0, l4.longValue());
        glVar.f28753b.dismiss(true);
    }

    public static void M(gl glVar) {
        int i10;
        Activity parentActivity;
        hg.t0 t0Var = glVar.O;
        vi viVar = glVar.f28753b;
        if (glVar.f26437j0 && (i10 = Build.VERSION.SDK_INT) >= 23 && (parentActivity = glVar.getParentActivity()) != null) {
            glVar.f26437j0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                String[] strArr = (!viVar.O || viVar.f31334w2 == null || i10 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
                glVar.W = true;
                if (t0Var != null) {
                    t0Var.O(glVar.f26428a0, true);
                }
                parentActivity.requestPermissions(strArr, 2);
            } else if (i10 >= 29 && viVar.O && viVar.f31334w2 != null && parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") != 0) {
                glVar.W = true;
                if (t0Var != null) {
                    t0Var.O(glVar.f26428a0, true);
                }
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
            }
        }
    }

    public static void N(gl glVar, org.telegram.ui.co coVar, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        gl glVar2;
        org.telegram.ui.co coVar2;
        org.telegram.ui.ActionBar.f6 f6Var2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j3 = glVar.f26430c0;
        hg.t0 t0Var = glVar.O;
        vi viVar = glVar.f28753b;
        int i11 = glVar.f26457y0;
        if (i11 == 7) {
            if (i10 == 1 && (tL_messageMediaVenue2 = t0Var.f11255d0) != null) {
                glVar.f26455x0.b(tL_messageMediaVenue2, i11, true, 0, 0L);
                viVar.dismiss(true);
                return;
            } else if (i10 == 2 && (tL_messageMediaVenue = t0Var.f11256e0) != null) {
                glVar.f26455x0.b(tL_messageMediaVenue, i11, true, 0, 0L);
                viVar.dismiss(true);
                return;
            } else {
                glVar2 = glVar;
                coVar2 = coVar;
                f6Var2 = f6Var;
            }
        } else if (i10 == 1) {
            if (glVar.f26455x0 != null && glVar.f26446r0 != null) {
                FrameLayout frameLayout = glVar.f26436i0;
                if (frameLayout != null) {
                    frameLayout.callOnClick();
                    return;
                }
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(glVar.f26446r0.getLatitude());
                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(glVar.f26446r0.getLongitude());
                e5.a0(viVar.J1, viVar.j1() + 1, viVar.n1(), new bi.r3(glVar, coVar, tL_messageMediaGeo, f6Var, 5));
                return;
            } else if (glVar.f26428a0) {
                e5.D(glVar.getParentActivity()).show();
                return;
            } else {
                return;
            }
        } else {
            glVar2 = glVar;
            coVar2 = coVar;
            f6Var2 = f6Var;
            if (i10 == 2 && i11 == 1) {
                if (glVar2.getLocationController().isSharingLocation(j3)) {
                    glVar2.getLocationController().removeSharingLocation(j3);
                    viVar.dismiss(true);
                    return;
                } else if (glVar2.f26444q0 == null && glVar2.f26428a0) {
                    e5.D(glVar2.getParentActivity()).show();
                    return;
                } else {
                    glVar2.Y();
                    return;
                }
            }
        }
        Object J = t0Var.J(i10);
        if (J instanceof TLRPC.TL_messageMediaVenue) {
            e5.a0(viVar.J1, viVar.j1() + 1, viVar.n1(), new bi.r3(glVar2, coVar2, (TLRPC.TL_messageMediaVenue) J, f6Var2, 6));
        }
    }

    public static void O(gl glVar, org.telegram.ui.co coVar, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        TLRPC.TL_messageMediaVenue I = glVar.R.I(i10);
        if (I != null && glVar.f26455x0 != null) {
            if (coVar != null && coVar.c()) {
                e5.M(glVar.getParentActivity(), coVar.a(), new wk(glVar, I, 0), f6Var);
                return;
            }
            glVar.f26455x0.b(I, glVar.f26457y0, true, 0, 0L);
            glVar.f28753b.dismiss(true);
        }
    }

    public static void P(gl glVar, org.telegram.ui.co coVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.f6 f6Var) {
        if (coVar != null && coVar.c()) {
            e5.M(glVar.getParentActivity(), coVar.a(), new wk(glVar, tL_messageMediaVenue, 1), f6Var);
            return;
        }
        glVar.f26455x0.b(tL_messageMediaVenue, glVar.f26457y0, true, 0, 0L);
        glVar.f28753b.dismiss(true);
    }

    public static void Q(gl glVar) {
        Activity parentActivity;
        hg.t0 t0Var = glVar.O;
        ImageView imageView = glVar.f26440n;
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = glVar.getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            e5.D(glVar.getParentActivity()).show();
            return;
        }
        if (glVar.f26444q0 != null && glVar.H != null) {
            int i10 = org.telegram.ui.ActionBar.j6.vi;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, glVar.f28752a), PorterDuff.Mode.MULTIPLY));
            imageView.setTag(Integer.valueOf(i10));
            t0Var.L(null);
            glVar.f26450u0 = false;
            glVar.d0(false);
            glVar.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(glVar.f26444q0.getLatitude(), glVar.f26444q0.getLongitude())));
            if (glVar.f26451v0) {
                Location location = glVar.f26444q0;
                if (location != null && glVar.f26457y0 != 8) {
                    t0Var.H(null, location, true);
                }
                glVar.f26451v0 = false;
                glVar.c0();
            }
        }
        if (glVar.f26434g0 != null) {
            glVar.S.setVisibility(0);
            dl dlVar = glVar.F;
            IMapsProvider.IMarker iMarker = glVar.f26434g0;
            HashMap hashMap = dlVar.f25418a;
            View view = (View) hashMap.get(iMarker);
            if (view != null) {
                dlVar.removeView(view);
                hashMap.remove(iMarker);
            }
            glVar.f26434g0 = null;
            glVar.f26435h0 = null;
            glVar.f26436i0 = null;
        }
    }

    public static void R(gl glVar, Location location) {
        int i10;
        vi viVar = glVar.f28753b;
        if (viVar != null && viVar.f31279f0 != null) {
            glVar.a0(location);
            hg.t0 t0Var = glVar.O;
            if (t0Var != null && (((i10 = glVar.f26457y0) == 7 || i10 == 8) && !glVar.f26450u0)) {
                t0Var.L(glVar.f26446r0);
            }
            glVar.getLocationController().setMapLocation(location, glVar.f26429b0);
            glVar.f26429b0 = false;
        }
    }

    public static void S(gl glVar, IMapsProvider.IMapView iMapView) {
        if (glVar.I != null && glVar.getParentActivity() != null) {
            try {
                iMapView.onCreate(null);
                ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                glVar.I.getMapAsync(new xk(glVar, 0));
                glVar.f26442o0 = true;
                if (glVar.f26443p0) {
                    glVar.I.onResume();
                }
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    public static void T(gl glVar) {
        if (glVar.getParentActivity() != null) {
            try {
                glVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
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
        return this.f28753b.f31279f0.getLocationController();
    }

    private MessagesController getMessagesController() {
        return this.f28753b.f31279f0.getMessagesController();
    }

    public Activity getParentActivity() {
        org.telegram.ui.ActionBar.n2 n2Var;
        vi viVar = this.f28753b;
        if (viVar != null && (n2Var = viVar.f31279f0) != null) {
            return n2Var.getParentActivity();
        }
        return null;
    }

    private UserConfig getUserConfig() {
        return this.f28753b.f31279f0.getUserConfig();
    }

    @Override
    public final void A() {
        IMapsProvider.IMapView iMapView = this.I;
        if (iMapView != null && this.f26442o0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.f26443p0 = true;
    }

    @Override
    public final void D(ni niVar) {
        long j3;
        vi viVar = this.f28753b;
        viVar.X0.setTitle(LocaleController.getString(R.string.ShareLocation));
        if (this.I.getView().getParent() == null) {
            View view = this.I.getView();
            FrameLayout.LayoutParams e7 = w7.x5.e(-1, AndroidUtilities.dp(10.0f) + this.f26458z0, 51);
            ah.y yVar = this.N;
            yVar.addView(view, 0, e7);
            yVar.addView(this.F, 1, w7.x5.e(-1, AndroidUtilities.dp(10.0f) + this.f26458z0, 51));
            yVar.addView(this.M, 2, w7.x5.c(-1.0f, -1));
        }
        this.E.setVisibility(0);
        IMapsProvider.IMapView iMapView = this.I;
        if (iMapView != null && this.f26442o0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.f26443p0 = true;
        IMapsProvider.IMap iMap = this.H;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        W();
        boolean q6 = viVar.Z1.q();
        qk qkVar = new qk(this, 1);
        if (q6) {
            j3 = 200;
        } else {
            j3 = 0;
        }
        AndroidUtilities.runOnUIThread(qkVar, j3);
        this.T.h1(0, 0);
        e0();
    }

    @Override
    public final void G() {
        this.P.x0(0);
    }

    @Override
    public final boolean J() {
        return !this.f26428a0;
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

    public final void W() {
        int i10;
        FrameLayout.LayoutParams layoutParams;
        if (getMeasuredHeight() != 0 && this.I != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            int i11 = AndroidUtilities.displaySize.y - currentActionBarHeight;
            int dp = AndroidUtilities.dp(66.0f);
            int i12 = this.f26457y0;
            if (i12 == 1 || i12 == 7 || i12 == 8) {
                dp += AndroidUtilities.dp(66.0f);
            }
            int dp2 = (i11 - dp) - AndroidUtilities.dp(90.0f);
            int dp3 = AndroidUtilities.dp(189.0f);
            this.f26458z0 = dp3;
            if (!this.f26428a0 || !X()) {
                dp2 = Math.min(AndroidUtilities.dp(310.0f), dp2);
            }
            this.A0 = Math.max(dp3, dp2);
            if (this.f26428a0 && X()) {
                this.f26458z0 = this.A0;
            }
            bi.o0 o0Var = this.P;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) o0Var.getLayoutParams();
            layoutParams2.topMargin = currentActionBarHeight;
            o0Var.setLayoutParams(layoutParams2);
            ah.y yVar = this.N;
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) yVar.getLayoutParams();
            layoutParams3.topMargin = currentActionBarHeight;
            layoutParams3.height = this.A0;
            yVar.setLayoutParams(layoutParams3);
            ll0 ll0Var = this.Q;
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) ll0Var.getLayoutParams();
            layoutParams4.topMargin = currentActionBarHeight;
            ll0Var.setLayoutParams(layoutParams4);
            if (this.f26428a0 && X()) {
                i10 = this.f26458z0 - o0Var.getPaddingTop();
            } else {
                i10 = this.f26458z0;
            }
            int dp4 = AndroidUtilities.dp(16.0f) + i10;
            hg.t0 t0Var = this.O;
            t0Var.P(dp4);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.I.getView().getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.height = AndroidUtilities.dp(10.0f) + this.A0;
                this.I.getView().setLayoutParams(layoutParams5);
            }
            dl dlVar = this.F;
            if (dlVar != null && (layoutParams = (FrameLayout.LayoutParams) dlVar.getLayoutParams()) != null) {
                layoutParams.height = AndroidUtilities.dp(10.0f) + this.A0;
                dlVar.setLayoutParams(layoutParams);
            }
            t0Var.l();
            e0();
        }
    }

    public final boolean X() {
        int i10 = this.f26457y0;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final void Y() {
        TLRPC.User user;
        Activity parentActivity;
        if (this.f26455x0 != null && getParentActivity() != null && this.f26444q0 != null) {
            boolean z10 = this.f26438k0;
            org.telegram.ui.ActionBar.f6 f6Var = this.f28752a;
            if (z10 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
                this.f26438k0 = false;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                    globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                    e5.l(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new qk(this, 2), f6Var).o();
                    return;
                }
            }
            long j3 = this.f26430c0;
            if (DialogObject.isUserDialog(j3)) {
                user = this.f28753b.f31279f0.getMessagesController().getUser(Long.valueOf(j3));
            } else {
                user = null;
            }
            e5.E(getParentActivity(), false, user, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i10) {
                    gl glVar = gl.this;
                    vi viVar = glVar.f28753b;
                    e5.a0(viVar.J1, viVar.j1() + 1, viVar.n1(), new di.a7(glVar, i10, 3));
                }
            }, f6Var).show();
        }
    }

    public final void Z() {
        gl glVar;
        vi viVar = this.f28753b;
        if (viVar.O) {
            if (viVar.f31338x2 != null) {
                AndroidUtilities.runOnUIThread(new qk(this, 0));
                return;
            } else if (!this.f26428a0) {
                File file = viVar.f31334w2;
                boolean z10 = viVar.f31330v2;
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
                        glVar = this;
                        ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                        float[] fArr = new float[2];
                        if (exifInterface.getLatLong(fArr)) {
                            AndroidUtilities.runOnUIThread(new uc(16, this, fArr));
                            return;
                        }
                        Location lastLocation = getLastLocation();
                        glVar.f26444q0 = lastLocation;
                        a0(lastLocation);
                        return;
                    }
                }
                glVar = this;
                Location lastLocation2 = getLastLocation();
                glVar.f26444q0 = lastLocation2;
                a0(lastLocation2);
                return;
            } else {
                AndroidUtilities.runOnUIThread(new qk(this, 8));
                return;
            }
        }
        Location lastLocation3 = getLastLocation();
        this.f26444q0 = lastLocation3;
        a0(lastLocation3);
    }

    public final void a0(Location location) {
        if (location != null) {
            Location location2 = new Location(location);
            this.f26444q0 = location2;
            IMapsProvider.IMap iMap = this.H;
            hg.t0 t0Var = this.O;
            if (iMap != null) {
                IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
                if (t0Var != null) {
                    if (!this.f26451v0 && this.f26457y0 != 8) {
                        t0Var.H(null, this.f26444q0, true);
                    }
                    t0Var.M(this.f26444q0);
                }
                if (!this.f26450u0) {
                    this.f26446r0 = new Location(location);
                    if (this.f26453w0) {
                        this.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                        return;
                    }
                    this.f26453w0 = true;
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
                this.f26446r0 = location;
                location.reset();
                this.f26446r0.setLatitude(d);
                this.f26446r0.setLongitude(d10);
            } else {
                Location location2 = new Location("");
                this.f26444q0 = location2;
                location2.reset();
                this.f26444q0.setLatitude(d);
                this.f26444q0.setLongitude(d10);
            }
            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(d, d10);
            if (i10 != 0 && d10 != 0.0d) {
                newCameraUpdateLatLngZoom = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.H.getMaxZoomLevel() - 4.0f);
            } else {
                newCameraUpdateLatLngZoom = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.H.getMinZoomLevel());
            }
            this.J = newCameraUpdateLatLngZoom;
            this.H.moveCamera(newCameraUpdateLatLngZoom);
            hg.t0 t0Var = this.O;
            if (i10 != 0 && d10 != 0.0d) {
                t0Var.L(this.f26446r0);
            } else {
                t0Var.M(this.f26444q0);
            }
            t0Var.I();
            this.P.v0(0, 1, null);
            this.f26449t0 = true;
            if (i10 != 0 && d10 != 0.0d) {
                this.f26450u0 = true;
                d0(false);
                if (this.f26457y0 != 8) {
                    t0Var.H(null, this.f26446r0, true);
                }
                this.f26451v0 = true;
                c0();
            }
        }
    }

    public final void c0() {
        if (this.O.h() != 0 && this.T.L0() == 0) {
            bi.o0 o0Var = this.P;
            View childAt = o0Var.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top >= 0 && top <= AndroidUtilities.dp(258.0f)) {
                o0Var.v0(0, top, null);
            }
        }
    }

    public final void d0(boolean z10) {
        int i10;
        Integer num;
        float f7;
        Location location;
        Location location2;
        if (this.f26428a0) {
            z10 = false;
        }
        el elVar = this.f26447s;
        if (z10 && elVar != null && elVar.getTag() == null && ((location = this.f26444q0) == null || (location2 = this.f26446r0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        if (this.f26457y0 == 8) {
            z10 = false;
        }
        if (elVar != null) {
            if (!z10 || elVar.getTag() == null) {
                if (z10 || elVar.getTag() != null) {
                    if (z10) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    elVar.setVisibility(i10);
                    if (z10) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    elVar.setTag(num);
                    AnimatorSet animatorSet = new AnimatorSet();
                    if (z10) {
                        f7 = 0.0f;
                    } else {
                        f7 = -AndroidUtilities.dp(80.0f);
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(elVar, View.TRANSLATION_X, f7));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(pr.f29467g);
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
        al alVar = this.R;
        hg.t0 t0Var = this.O;
        int i13 = 0;
        if (i10 == i12) {
            this.f26428a0 = false;
            this.W = false;
            Z();
            if (t0Var != null) {
                t0Var.O(this.f26428a0, this.W);
            }
            if (alVar != null && alVar.M != (z11 = this.f26428a0)) {
                alVar.M = z11;
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
            this.f26428a0 = true;
            this.W = false;
            if (t0Var != null) {
                t0Var.O(true, false);
            }
            if (alVar != null && alVar.M != (z10 = this.f26428a0)) {
                alVar.M = z10;
            }
        }
        W();
        boolean z12 = this.f26428a0;
        vi viVar = this.f28753b;
        if (z12 && !viVar.O) {
            i13 = 8;
        } else {
            viVar.getClass();
        }
        this.E.setVisibility(i13);
    }

    public final void e0() {
        ah.y yVar;
        int i10;
        int i11;
        IMapsProvider.LatLng latLng;
        Location location;
        IMapsProvider.IMap iMap;
        if (this.I != null && (yVar = this.N) != null) {
            bi.o0 o0Var = this.P;
            s4.c1 K = o0Var.K(0);
            if (K != null) {
                i10 = (int) K.f45738a.getY();
                i11 = Math.min(i10, 0) + this.f26458z0;
            } else {
                i10 = -yVar.getMeasuredHeight();
                i11 = 0;
            }
            if (((FrameLayout.LayoutParams) yVar.getLayoutParams()) != null) {
                dl dlVar = this.F;
                if (i11 <= 0) {
                    if (this.I.getView().getVisibility() == 0) {
                        this.I.getView().setVisibility(4);
                        yVar.setVisibility(4);
                        if (dlVar != null) {
                            dlVar.setVisibility(4);
                        }
                    }
                    this.I.getView().setTranslationY(i10);
                    return;
                }
                if (this.I.getView().getVisibility() == 4) {
                    this.I.getView().setVisibility(0);
                    yVar.setVisibility(0);
                    if (dlVar != null) {
                        dlVar.setVisibility(0);
                    }
                }
                int max = Math.max(0, (-((i10 - this.A0) + this.f26458z0)) / 2);
                int i12 = this.A0 - this.f26458z0;
                float max2 = 1.0f - Math.max(0.0f, Math.min(1.0f, (o0Var.getPaddingTop() - i10) / (o0Var.getPaddingTop() - i12)));
                int i13 = this.B0;
                if (this.f26428a0 && X()) {
                    i12 += Math.min(i10, o0Var.getPaddingTop());
                }
                this.B0 = (int) (i12 * max2);
                float f7 = max;
                this.I.getView().setTranslationY(f7);
                this.C0 = i12 - this.B0;
                yVar.invalidate();
                yVar.setTranslationY(i10 - this.C0);
                IMapsProvider.IMap iMap2 = this.H;
                if (iMap2 != null) {
                    iMap2.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f) + this.B0);
                }
                if (dlVar != null) {
                    dlVar.setTranslationY(f7);
                }
                int max3 = Math.max(this.C0 - i10, 0);
                int i14 = this.A0;
                org.telegram.ui.ActionBar.v0 v0Var = this.f26445r;
                float min = Math.min(max3, (i14 - v0Var.getMeasuredHeight()) - AndroidUtilities.dp(80.0f));
                v0Var.setTranslationY(min);
                el elVar = this.f26447s;
                elVar.f25724c = min;
                elVar.setTranslationY(min + elVar.f25723b);
                this.f26440n.setTranslationY(-this.B0);
                int D = org.telegram.messenger.vl.D(48.0f, (this.A0 - this.B0) / 2, max);
                this.f26448s0 = D;
                this.S.setTranslationY(D);
                if (i13 != this.B0) {
                    IMapsProvider.IMarker iMarker = this.f26434g0;
                    if (iMarker != null) {
                        latLng = new IMapsProvider.LatLng(iMarker.getPosition().latitude, this.f26434g0.getPosition().longitude);
                    } else if (this.f26450u0 && (location = this.f26446r0) != null) {
                        latLng = new IMapsProvider.LatLng(location.getLatitude(), this.f26446r0.getLongitude());
                    } else {
                        Location location2 = this.f26444q0;
                        if (location2 != null) {
                            latLng = new IMapsProvider.LatLng(location2.getLatitude(), this.f26444q0.getLongitude());
                        } else {
                            latLng = null;
                        }
                    }
                    if (latLng != null && (iMap = this.H) != null) {
                        iMap.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                    }
                }
                if (this.f26428a0 && X()) {
                    int h = this.O.h();
                    for (int i15 = 1; i15 < h; i15++) {
                        s4.c1 K2 = o0Var.K(i15);
                        if (K2 != null) {
                            K2.f45738a.setTranslationY(o0Var.getPaddingTop() - i10);
                        }
                    }
                }
            }
        }
    }

    public final void f0() {
        boolean z10 = this.f26439l0;
        LinearLayout linearLayout = this.v;
        if (z10) {
            boolean z11 = this.f26441n0;
            ll0 ll0Var = this.Q;
            if (z11) {
                ll0Var.setEmptyView(null);
                linearLayout.setVisibility(8);
                return;
            }
            ll0Var.setEmptyView(linearLayout);
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
        bi.o0 o0Var = this.P;
        if (o0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        vk0 vk0Var = (vk0) o0Var.K(0);
        if (vk0Var != null) {
            i10 = Math.max(((int) vk0Var.f45738a.getY()) - this.C0, 0);
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
        z6 z6Var = new z6(this, 2);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.N, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f20734h5));
        int i10 = org.telegram.ui.ActionBar.j6.A5;
        bi.o0 o0Var = this.P;
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 32768, null, null, null, null, i10));
        org.telegram.ui.ActionBar.v0 v0Var = this.E;
        if (v0Var != null) {
            editTextBoldCursor = v0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursor, 16777216, null, null, null, null, org.telegram.ui.ActionBar.j6.f20770j5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f20753i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20785k0, null, null, org.telegram.ui.ActionBar.j6.f20664d7));
        int i11 = org.telegram.ui.ActionBar.j6.W5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f26452w, 8, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f26454x, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f26456y, 4, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.ui;
        ImageView imageView = this.f26440n;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 262152, null, null, null, null, i13));
        int i14 = org.telegram.ui.ActionBar.j6.vi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 262152, null, null, null, null, i14));
        int i15 = org.telegram.ui.ActionBar.j6.wi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 32, null, null, null, null, i15));
        int i16 = org.telegram.ui.ActionBar.j6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 65568, null, null, null, null, i16));
        org.telegram.ui.ActionBar.v0 v0Var2 = this.f26445r;
        arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var2, 0, null, null, null, z6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var2, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(v0Var2, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f26447s, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f26447s, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f26447s, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, org.telegram.ui.ActionBar.j6.f20910r0, z6Var, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, z6Var, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.si));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 393216, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.ni));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 393216, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.qi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 393248, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.mi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 393248, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.pi));
        int i17 = org.telegram.ui.ActionBar.j6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"accurateTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 262144, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.ri));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 262144, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.oi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"buttonTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 131072, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 196608, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20627b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 48, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, org.telegram.ui.ActionBar.j6.f20607a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20845n5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 32, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
        ll0 ll0Var = this.Q;
        arrayList.add(new org.telegram.ui.ActionBar.l6(ll0Var, 32, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ll0Var, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(ll0Var, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.w7.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.w7.class}, new String[]{"distanceTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20735h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 8, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(o0Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView2"}, null, null, -1, null, i12));
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
        ah.y yVar = this.N;
        if (yVar != null) {
            yVar.invalidate();
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
        hg.t0 t0Var = this.O;
        if (t0Var != null) {
            t0Var.F();
        }
        al alVar = this.R;
        if (alVar != null) {
            alVar.F();
        }
        vi viVar = this.f28753b;
        viVar.X0.h(true);
        viVar.X0.n().removeView(this.E);
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

    public void setDelegate(bl blVar) {
        this.f26455x0 = blVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f28753b.getSheetContainer().invalidate();
        e0();
    }

    @Override
    public final void v() {
        boolean z10;
        vi viVar = this.f28753b;
        if (viVar != null && !viVar.isKeyboardVisible()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.O.f11254c0 = z10;
    }

    @Override
    public final void w(int i10, boolean z10) {
        if (z10) {
            this.O.f11254c0 = false;
        }
    }

    @Override
    public final void x() {
        IMapsProvider.IMapView iMapView = this.I;
        if (iMapView != null && this.f26442o0) {
            try {
                iMapView.onPause();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        this.f26443p0 = false;
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.gl.y(int, int):void");
    }
}
