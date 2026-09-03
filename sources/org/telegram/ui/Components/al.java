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
public final class al extends di implements NotificationCenter.NotificationCenterDelegate {
    public static final int B0 = 0;
    public final Bitmap[] A0;
    public final org.telegram.ui.ActionBar.w0 B;
    public final xk C;
    public boolean D;
    public IMapsProvider.IMap E;
    public IMapsProvider.IMapView F;
    public IMapsProvider.ICameraUpdate G;
    public float H;
    public boolean I;
    public final View J;
    public final dg.u2 K;
    public final tf.h0 L;
    public final lh.e1 M;
    public final rl0 N;
    public final tk O;
    public final ImageView P;
    public final ej Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public boolean V;
    public final long W;
    public final Paint f23399a0;
    public final ArrayList f23400b0;
    public AnimatorSet f23401c0;
    public IMapsProvider.IMarker f23402d0;
    public zk f23403e0;
    public FrameLayout f23404f0;
    public boolean f23405g0;
    public boolean f23406h0;
    public boolean f23407i0;
    public boolean f23408j0;
    public boolean f23409k0;
    public boolean f23410l0;
    public boolean m0;
    public final ImageView f23411n;
    public Location f23412n0;
    public Location f23413o0;
    public int f23414p0;
    public boolean f23415q0;
    public final org.telegram.ui.ActionBar.w0 f23416r;
    public boolean f23417r0;
    public final yk f23418s;
    public boolean f23419s0;
    public boolean f23420t0;
    public uk f23421u0;
    public final LinearLayout v;
    public final int f23422v0;
    public final ImageView f23423w;
    public int f23424w0;
    public final TextView f23425x;
    public int f23426x0;
    public final TextView f23427y;
    public int f23428y0;
    public int f23429z0;

    public al(li liVar, Context context, final org.telegram.ui.ActionBar.f6 f6Var, boolean z4) {
        super(context, f6Var, liVar);
        final org.telegram.ui.zn znVar;
        boolean z10;
        int i10;
        boolean z11;
        this.S = true;
        this.T = false;
        this.U = false;
        this.V = true;
        this.f23399a0 = new Paint();
        this.f23400b0 = new ArrayList();
        this.f23405g0 = true;
        this.f23406h0 = true;
        int currentActionBarHeight = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.f23424w0 = currentActionBarHeight;
        this.f23426x0 = currentActionBarHeight;
        this.A0 = new Bitmap[7];
        AndroidUtilities.fixGoogleMapsBug();
        li liVar2 = this.f24282b;
        org.telegram.ui.ActionBar.p2 p2Var = liVar2.f26685c0;
        if (p2Var instanceof org.telegram.ui.zn) {
            znVar = (org.telegram.ui.zn) p2Var;
        } else {
            znVar = null;
        }
        long n12 = liVar2.n1();
        this.W = n12;
        if (this.f24282b.L) {
            this.f23422v0 = 7;
        } else if (z4 && znVar != null && znVar.h == null && !znVar.c() && !UserObject.isUserSelf(znVar.i())) {
            this.f23422v0 = 1;
        } else {
            this.f23422v0 = 0;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        this.f23408j0 = false;
        this.f23407i0 = false;
        this.f23409k0 = false;
        tf.h0 h0Var = this.L;
        if (h0Var != null) {
            h0Var.F();
        }
        tk tkVar = this.O;
        if (tkVar != null) {
            tkVar.F();
        }
        if (Build.VERSION.SDK_INT >= 23 && getParentActivity() != null && getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.U = z10;
        org.telegram.ui.ActionBar.z n10 = this.f24282b.U0.n();
        this.C = new xk(this, context);
        org.telegram.ui.ActionBar.w0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.E = new org.telegram.ui.hb(this, 5);
        this.B = a2;
        if (this.U && !this.f24282b.L) {
            i10 = 8;
        } else {
            this.f24282b.getClass();
            i10 = 0;
        }
        a2.setVisibility(i10);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i11 = org.telegram.ui.ActionBar.j6.f19987j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.j6.v0(i11, this.f24281a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.j6.v0(i11, this.f24281a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.Vd, this.f24281a));
        new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f)).gravity = 83;
        dg.u2 u2Var = new dg.u2(this, context, 15);
        this.K = u2Var;
        u2Var.setWillNotDraw(false);
        View view = new View(context);
        this.J = view;
        view.setBackgroundDrawable(new df.f(org.telegram.ui.ActionBar.j6.A0().q()));
        yk ykVar = new yk(context, 0);
        this.f23418s = ykVar;
        ykVar.setTranslationX(-AndroidUtilities.dp(80.0f));
        ykVar.setVisibility(4);
        int dp = AndroidUtilities.dp(40.0f);
        int i12 = org.telegram.ui.ActionBar.j6.wi;
        int v02 = org.telegram.ui.ActionBar.j6.v0(i12, this.f24281a);
        int i13 = org.telegram.ui.ActionBar.j6.xi;
        int v03 = org.telegram.ui.ActionBar.j6.v0(i13, this.f24281a);
        org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.j6.i0(dp, dp, dp, dp, v02, v03, v03);
        k7.d6.a(ykVar);
        ykVar.setTranslationZ(AndroidUtilities.dp(2.0f));
        gg.j1 j1Var = kf.r0.f10496a;
        ykVar.setOutlineProvider(j1Var);
        ykVar.setBackground(i02);
        int i14 = org.telegram.ui.ActionBar.j6.vi;
        ykVar.setTextColor(org.telegram.ui.ActionBar.j6.v0(i14, this.f24281a));
        ykVar.setTextSize(1, 14.0f);
        ykVar.setTypeface(AndroidUtilities.bold());
        ykVar.setText(LocaleController.getString(R.string.PlacesInThisArea));
        ykVar.setGravity(17);
        ykVar.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        u2Var.addView(ykVar, k7.b6.d(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
        ykVar.setOnClickListener(new View.OnClickListener(this) {
            public final al f26773b;

            {
                this.f26773b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        al.Q(this.f26773b);
                        return;
                    case 1:
                        al alVar = this.f26773b;
                        alVar.d0(false);
                        alVar.L.H(null, alVar.f23413o0, true);
                        alVar.f23419s0 = true;
                        alVar.c0();
                        return;
                    default:
                        this.f26773b.f23416r.M(null, null);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.ui, this.f24281a), false, f6Var);
        this.f23416r = w0Var;
        w0Var.setClickable(true);
        w0Var.setSubMenuOpenSide(2);
        w0Var.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        w0Var.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        w0Var.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), f6Var);
        w0Var.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), f6Var);
        w0Var.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), f6Var);
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.j6.v0(i12, this.f24281a), org.telegram.ui.ActionBar.j6.v0(i13, this.f24281a));
        k7.d6.a(w0Var);
        w0Var.setTranslationZ(AndroidUtilities.dp(2.0f));
        w0Var.setOutlineProvider(j1Var);
        w0Var.setBackground(h02);
        w0Var.setIcon(R.drawable.msg_map_type);
        u2Var.addView(w0Var, k7.b6.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        w0Var.setOnClickListener(new View.OnClickListener(this) {
            public final al f26773b;

            {
                this.f26773b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        al.Q(this.f26773b);
                        return;
                    case 1:
                        al alVar = this.f26773b;
                        alVar.d0(false);
                        alVar.L.H(null, alVar.f23413o0, true);
                        alVar.f23419s0 = true;
                        alVar.c0();
                        return;
                    default:
                        this.f26773b.f23416r.M(null, null);
                        return;
                }
            }
        });
        w0Var.setDelegate(new kk(this, 0));
        ImageView imageView = new ImageView(context);
        this.f23411n = imageView;
        org.telegram.ui.Cells.z h03 = org.telegram.ui.ActionBar.j6.h0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.j6.v0(i12, this.f24281a), org.telegram.ui.ActionBar.j6.v0(i13, this.f24281a));
        k7.d6.a(imageView);
        imageView.setTranslationZ(AndroidUtilities.dp(2.0f));
        imageView.setOutlineProvider(j1Var);
        imageView.setBackground(h03);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int v04 = org.telegram.ui.ActionBar.j6.v0(i14, this.f24281a);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v04, mode));
        imageView.setTag(Integer.valueOf(i14));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        u2Var.addView(imageView, k7.b6.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final al f26773b;

            {
                this.f26773b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        al.Q(this.f26773b);
                        return;
                    case 1:
                        al alVar = this.f26773b;
                        alVar.d0(false);
                        alVar.L.H(null, alVar.f23413o0, true);
                        alVar.f23419s0 = true;
                        alVar.c0();
                        return;
                    default:
                        this.f26773b.f23416r.M(null, null);
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
        addView(linearLayout, k7.b6.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new oh.d(15));
        ImageView imageView2 = new ImageView(context);
        this.f23423w = imageView2;
        imageView2.setImageResource(R.drawable.location_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.W5, this.f24281a), mode));
        linearLayout.addView(imageView2, k7.b6.n(-2, -2));
        TextView textView = new TextView(context);
        this.f23425x = textView;
        int i15 = org.telegram.ui.ActionBar.j6.X5;
        textView.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, this.f24281a));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 17.0f);
        textView.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView i16 = org.telegram.ui.ai.i(linearLayout, textView, k7.b6.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.f23427y = i16;
        i16.setTextColor(org.telegram.ui.ActionBar.j6.v0(i15, this.f24281a));
        i16.setGravity(17);
        i16.setTextSize(1, 15.0f);
        i16.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(i16, k7.b6.t(-2, -2, 17, 0, 6, 0, 0));
        lh.e1 e1Var = new lh.e1(this, context, f6Var, 11);
        this.M = e1Var;
        this.f24283c = e1Var;
        this.d = e1Var;
        this.f24284f = true;
        e1Var.setClipToPadding(false);
        tf.h0 h0Var2 = new tf.h0(context, this.f23422v0, n12, true, f6Var, this.f24282b.L, false, false);
        this.L = h0Var2;
        e1Var.setAdapter(h0Var2);
        li liVar3 = this.f24282b;
        if (liVar3 != null && (liVar3.E || liVar3.M)) {
            z11 = true;
        } else {
            z11 = false;
        }
        h0Var2.f44798c0 = z11;
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(mr.h);
        lVar.C = false;
        lVar.f5807m = false;
        e1Var.setItemAnimator(lVar);
        h0Var2.O(this.U, this.T);
        e1Var.setVerticalScrollBarEnabled(false);
        e1Var.o1();
        ej ejVar = new ej(this, e1Var);
        this.Q = ejVar;
        e1Var.setLayoutManager(ejVar);
        addView(e1Var, k7.b6.e(-1, -1, 51));
        e1Var.setOnScrollListener(new sk(this));
        e1Var.setOnItemClickListener(new hl0(this) {
            public final al f27081b;

            {
                this.f27081b = this;
            }

            @Override
            public final void d(int i17, View view2) {
                switch (r4) {
                    case 0:
                        al.N(this.f27081b, znVar, f6Var, i17);
                        return;
                    default:
                        al.O(this.f27081b, znVar, f6Var, i17);
                        return;
                }
            }
        });
        kk kkVar = new kk(this, 1);
        h0Var2.E = n12;
        h0Var2.f44737y = kkVar;
        h0Var2.P(AndroidUtilities.dp(16.0f) + this.f23424w0);
        addView(u2Var, k7.b6.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.F = onCreateMapView;
        onCreateMapView.setOnDispatchTouchEventInterceptor(new kk(this, 2));
        this.F.setOnInterceptTouchEventInterceptor(new kk(this, 3));
        new Thread(new ok(this, this.F, 1)).start();
        ImageView imageView3 = new ImageView(context);
        this.P = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        u2Var.addView(imageView3, k7.b6.e(28, 48, 49));
        rl0 rl0Var = new rl0(context, f6Var);
        this.N = rl0Var;
        rl0Var.setSections(true);
        rl0Var.setClipToPadding(false);
        rl0Var.setVisibility(8);
        rl0Var.setLayoutManager(new f2.i0(1, false));
        tk tkVar2 = new tk(this, context, f6Var, this.f24282b.L);
        this.O = tkVar2;
        boolean z12 = this.U;
        if (tkVar2.J != z12) {
            tkVar2.J = z12;
        }
        kk kkVar2 = new kk(this, 7);
        tkVar2.E = 0L;
        tkVar2.f44737y = kkVar2;
        rl0Var.setItemAnimator(null);
        addView(rl0Var, k7.b6.e(-1, -1, 51));
        rl0Var.setOnScrollListener(new eg.f2(this, 22));
        rl0Var.setOnItemClickListener(new hl0(this) {
            public final al f27081b;

            {
                this.f27081b = this;
            }

            @Override
            public final void d(int i17, View view2) {
                switch (r4) {
                    case 0:
                        al.N(this.f27081b, znVar, f6Var, i17);
                        return;
                    default:
                        al.O(this.f27081b, znVar, f6Var, i17);
                        return;
                }
            }
        });
        f0();
    }

    public static void J(al alVar, IMapsProvider.IMap iMap) {
        PackageManager packageManager;
        alVar.E = iMap;
        iMap.setOnMapLoadedCallback(new jk(alVar, 3));
        if (org.telegram.ui.ActionBar.j6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19881d6, alVar.f24281a)) < 0.721f) {
            alVar.R = true;
            alVar.E.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
        }
        if (alVar.E != null) {
            Location location = new Location("network");
            alVar.f23413o0 = location;
            location.setLatitude(20.659322d);
            alVar.f23413o0.setLongitude(-11.40625d);
            try {
                alVar.E.setMyLocationEnabled(true);
            } catch (Exception e) {
                FileLog.e(e);
            }
            alVar.E.getUiSettings().setMyLocationButtonEnabled(false);
            alVar.E.getUiSettings().setZoomControlsEnabled(false);
            alVar.E.getUiSettings().setCompassEnabled(false);
            alVar.E.setOnCameraMoveStartedListener(new kk(alVar, 4));
            alVar.E.setOnCameraIdleListener(new jk(alVar, 5));
            alVar.E.setOnMyLocationChangeListener(new qk(alVar, 1));
            alVar.E.setOnMarkerClickListener(new kk(alVar, 5));
            alVar.E.setOnCameraMoveListener(new jk(alVar, 6));
            alVar.Z();
            AndroidUtilities.runOnUIThread(new jk(alVar, 7), 200L);
            if (alVar.S && alVar.getParentActivity() != null) {
                alVar.S = false;
                Activity parentActivity = alVar.getParentActivity();
                if (parentActivity == null || (packageManager = parentActivity.getPackageManager()) == null || packageManager.hasSystemFeature("android.hardware.location.gps")) {
                    try {
                        if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(alVar.getParentActivity(), 0, alVar.f24281a);
                            alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.L5, alVar.f24281a), null);
                            alertDialog$Builder.f19478a.Q = LocaleController.getString(R.string.GpsDisabledAlertText);
                            alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new kk(alVar, 6));
                            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                            alertDialog$Builder.o();
                        }
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                } else {
                    return;
                }
            }
            alVar.e0();
        }
    }

    public static void K(al alVar, org.telegram.ui.zn znVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.f6 f6Var, Long l10) {
        if (znVar != null && znVar.c()) {
            z4.M(alVar.getParentActivity(), znVar.a(), new androidx.car.app.utils.a(alVar, tL_messageMediaGeo, l10, 20), f6Var);
            return;
        }
        alVar.f23421u0.b(tL_messageMediaGeo, alVar.f23422v0, true, 0, l10.longValue());
        alVar.f24282b.dismiss(true);
    }

    public static void M(al alVar) {
        int i10;
        Activity parentActivity;
        tf.h0 h0Var = alVar.L;
        li liVar = alVar.f24282b;
        if (alVar.f23405g0 && (i10 = Build.VERSION.SDK_INT) >= 23 && (parentActivity = alVar.getParentActivity()) != null) {
            alVar.f23405g0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                String[] strArr = (!liVar.L || liVar.f26740t2 == null || i10 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
                alVar.T = true;
                if (h0Var != null) {
                    h0Var.O(alVar.U, true);
                }
                parentActivity.requestPermissions(strArr, 2);
            } else if (i10 >= 29 && liVar.L && liVar.f26740t2 != null && parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") != 0) {
                alVar.T = true;
                if (h0Var != null) {
                    h0Var.O(alVar.U, true);
                }
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
            }
        }
    }

    public static void N(al alVar, org.telegram.ui.zn znVar, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        al alVar2;
        org.telegram.ui.zn znVar2;
        org.telegram.ui.ActionBar.f6 f6Var2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j10 = alVar.W;
        tf.h0 h0Var = alVar.L;
        li liVar = alVar.f24282b;
        int i11 = alVar.f23422v0;
        if (i11 == 7) {
            if (i10 == 1 && (tL_messageMediaVenue2 = h0Var.f44796a0) != null) {
                alVar.f23421u0.b(tL_messageMediaVenue2, i11, true, 0, 0L);
                liVar.dismiss(true);
                return;
            } else if (i10 == 2 && (tL_messageMediaVenue = h0Var.f44797b0) != null) {
                alVar.f23421u0.b(tL_messageMediaVenue, i11, true, 0, 0L);
                liVar.dismiss(true);
                return;
            } else {
                alVar2 = alVar;
                znVar2 = znVar;
                f6Var2 = f6Var;
            }
        } else if (i10 == 1) {
            if (alVar.f23421u0 != null && alVar.f23413o0 != null) {
                FrameLayout frameLayout = alVar.f23404f0;
                if (frameLayout != null) {
                    frameLayout.callOnClick();
                    return;
                }
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(alVar.f23413o0.getLatitude());
                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(alVar.f23413o0.getLongitude());
                z4.a0(liVar.G1, liVar.j1() + 1, liVar.n1(), new gg.c1(alVar, znVar, tL_messageMediaGeo, f6Var, 7));
                return;
            } else if (alVar.U) {
                z4.D(alVar.getParentActivity()).show();
                return;
            } else {
                return;
            }
        } else {
            alVar2 = alVar;
            znVar2 = znVar;
            f6Var2 = f6Var;
            if (i10 == 2 && i11 == 1) {
                if (alVar2.getLocationController().isSharingLocation(j10)) {
                    alVar2.getLocationController().removeSharingLocation(j10);
                    liVar.dismiss(true);
                    return;
                } else if (alVar2.f23412n0 == null && alVar2.U) {
                    z4.D(alVar2.getParentActivity()).show();
                    return;
                } else {
                    alVar2.Y();
                    return;
                }
            }
        }
        Object J = h0Var.J(i10);
        if (J instanceof TLRPC.TL_messageMediaVenue) {
            z4.a0(liVar.G1, liVar.j1() + 1, liVar.n1(), new gg.c1(alVar2, znVar2, (TLRPC.TL_messageMediaVenue) J, f6Var2, 8));
        }
    }

    public static void O(al alVar, org.telegram.ui.zn znVar, org.telegram.ui.ActionBar.f6 f6Var, int i10) {
        TLRPC.TL_messageMediaVenue I = alVar.O.I(i10);
        if (I != null && alVar.f23421u0 != null) {
            if (znVar != null && znVar.c()) {
                z4.M(alVar.getParentActivity(), znVar.a(), new pk(alVar, I, 0), f6Var);
                return;
            }
            alVar.f23421u0.b(I, alVar.f23422v0, true, 0, 0L);
            alVar.f24282b.dismiss(true);
        }
    }

    public static void P(al alVar, org.telegram.ui.zn znVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.f6 f6Var) {
        if (znVar != null && znVar.c()) {
            z4.M(alVar.getParentActivity(), znVar.a(), new pk(alVar, tL_messageMediaVenue, 1), f6Var);
            return;
        }
        alVar.f23421u0.b(tL_messageMediaVenue, alVar.f23422v0, true, 0, 0L);
        alVar.f24282b.dismiss(true);
    }

    public static void Q(al alVar) {
        Activity parentActivity;
        tf.h0 h0Var = alVar.L;
        ImageView imageView = alVar.f23411n;
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = alVar.getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z4.D(alVar.getParentActivity()).show();
            return;
        }
        if (alVar.f23412n0 != null && alVar.E != null) {
            int i10 = org.telegram.ui.ActionBar.j6.vi;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.v0(i10, alVar.f24281a), PorterDuff.Mode.MULTIPLY));
            imageView.setTag(Integer.valueOf(i10));
            h0Var.L(null);
            alVar.f23417r0 = false;
            alVar.d0(false);
            alVar.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(alVar.f23412n0.getLatitude(), alVar.f23412n0.getLongitude())));
            if (alVar.f23419s0) {
                Location location = alVar.f23412n0;
                if (location != null && alVar.f23422v0 != 8) {
                    h0Var.H(null, location, true);
                }
                alVar.f23419s0 = false;
                alVar.c0();
            }
        }
        if (alVar.f23402d0 != null) {
            alVar.P.setVisibility(0);
            xk xkVar = alVar.C;
            IMapsProvider.IMarker iMarker = alVar.f23402d0;
            HashMap hashMap = xkVar.f30654a;
            View view = (View) hashMap.get(iMarker);
            if (view != null) {
                xkVar.removeView(view);
                hashMap.remove(iMarker);
            }
            alVar.f23402d0 = null;
            alVar.f23403e0 = null;
            alVar.f23404f0 = null;
        }
    }

    public static void R(al alVar, Location location) {
        int i10;
        li liVar = alVar.f24282b;
        if (liVar != null && liVar.f26685c0 != null) {
            alVar.a0(location);
            tf.h0 h0Var = alVar.L;
            if (h0Var != null && (((i10 = alVar.f23422v0) == 7 || i10 == 8) && !alVar.f23417r0)) {
                h0Var.L(alVar.f23413o0);
            }
            alVar.getLocationController().setMapLocation(location, alVar.V);
            alVar.V = false;
        }
    }

    public static void S(al alVar, IMapsProvider.IMapView iMapView) {
        if (alVar.F != null && alVar.getParentActivity() != null) {
            try {
                iMapView.onCreate(null);
                ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                alVar.F.getMapAsync(new qk(alVar, 0));
                alVar.f23410l0 = true;
                if (alVar.m0) {
                    alVar.F.onResume();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void T(al alVar) {
        if (alVar.getParentActivity() != null) {
            try {
                alVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
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
        return this.f24282b.f26685c0.getLocationController();
    }

    private MessagesController getMessagesController() {
        return this.f24282b.f26685c0.getMessagesController();
    }

    public Activity getParentActivity() {
        org.telegram.ui.ActionBar.p2 p2Var;
        li liVar = this.f24282b;
        if (liVar != null && (p2Var = liVar.f26685c0) != null) {
            return p2Var.getParentActivity();
        }
        return null;
    }

    private UserConfig getUserConfig() {
        return this.f24282b.f26685c0.getUserConfig();
    }

    @Override
    public final void A() {
        IMapsProvider.IMapView iMapView = this.F;
        if (iMapView != null && this.f23410l0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.m0 = true;
    }

    @Override
    public final void D(di diVar) {
        long j10;
        li liVar = this.f24282b;
        liVar.U0.setTitle(LocaleController.getString(R.string.ShareLocation));
        if (this.F.getView().getParent() == null) {
            View view = this.F.getView();
            FrameLayout.LayoutParams e = k7.b6.e(-1, AndroidUtilities.dp(10.0f) + this.f23424w0, 51);
            dg.u2 u2Var = this.K;
            u2Var.addView(view, 0, e);
            u2Var.addView(this.C, 1, k7.b6.e(-1, AndroidUtilities.dp(10.0f) + this.f23424w0, 51));
            u2Var.addView(this.J, 2, k7.b6.c(-1.0f, -1));
        }
        this.B.setVisibility(0);
        IMapsProvider.IMapView iMapView = this.F;
        if (iMapView != null && this.f23410l0) {
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
            } catch (Exception e6) {
                FileLog.e(e6);
            }
        }
        W();
        boolean h02 = liVar.W1.h0();
        jk jkVar = new jk(this, 1);
        if (h02) {
            j10 = 200;
        } else {
            j10 = 0;
        }
        AndroidUtilities.runOnUIThread(jkVar, j10);
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
        if (getMeasuredHeight() != 0 && this.F != null) {
            int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
            int i11 = AndroidUtilities.displaySize.y - currentActionBarHeight;
            int dp = AndroidUtilities.dp(66.0f);
            int i12 = this.f23422v0;
            if (i12 == 1 || i12 == 7 || i12 == 8) {
                dp += AndroidUtilities.dp(66.0f);
            }
            int dp2 = (i11 - dp) - AndroidUtilities.dp(90.0f);
            int dp3 = AndroidUtilities.dp(189.0f);
            this.f23424w0 = dp3;
            if (!this.U || !X()) {
                dp2 = Math.min(AndroidUtilities.dp(310.0f), dp2);
            }
            this.f23426x0 = Math.max(dp3, dp2);
            if (this.U && X()) {
                this.f23424w0 = this.f23426x0;
            }
            lh.e1 e1Var = this.M;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) e1Var.getLayoutParams();
            layoutParams2.topMargin = currentActionBarHeight;
            e1Var.setLayoutParams(layoutParams2);
            dg.u2 u2Var = this.K;
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) u2Var.getLayoutParams();
            layoutParams3.topMargin = currentActionBarHeight;
            layoutParams3.height = this.f23426x0;
            u2Var.setLayoutParams(layoutParams3);
            rl0 rl0Var = this.N;
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) rl0Var.getLayoutParams();
            layoutParams4.topMargin = currentActionBarHeight;
            rl0Var.setLayoutParams(layoutParams4);
            if (this.U && X()) {
                i10 = this.f23424w0 - e1Var.getPaddingTop();
            } else {
                i10 = this.f23424w0;
            }
            int dp4 = AndroidUtilities.dp(16.0f) + i10;
            tf.h0 h0Var = this.L;
            h0Var.P(dp4);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.F.getView().getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.height = AndroidUtilities.dp(10.0f) + this.f23426x0;
                this.F.getView().setLayoutParams(layoutParams5);
            }
            xk xkVar = this.C;
            if (xkVar != null && (layoutParams = (FrameLayout.LayoutParams) xkVar.getLayoutParams()) != null) {
                layoutParams.height = AndroidUtilities.dp(10.0f) + this.f23426x0;
                xkVar.setLayoutParams(layoutParams);
            }
            h0Var.l();
            e0();
        }
    }

    public final boolean X() {
        int i10 = this.f23422v0;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final void Y() {
        TLRPC.User user;
        Activity parentActivity;
        if (this.f23421u0 != null && getParentActivity() != null && this.f23412n0 != null) {
            boolean z4 = this.f23406h0;
            org.telegram.ui.ActionBar.f6 f6Var = this.f24281a;
            if (z4 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
                this.f23406h0 = false;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                    globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                    z4.l(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new jk(this, 2), f6Var).o();
                    return;
                }
            }
            long j10 = this.W;
            if (DialogObject.isUserDialog(j10)) {
                user = this.f24282b.f26685c0.getMessagesController().getUser(Long.valueOf(j10));
            } else {
                user = null;
            }
            z4.E(getParentActivity(), false, user, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i10) {
                    al alVar = al.this;
                    li liVar = alVar.f24282b;
                    z4.a0(liVar.G1, liVar.j1() + 1, liVar.n1(), new org.telegram.ui.Cells.pa(alVar, i10, 1));
                }
            }, f6Var).show();
        }
    }

    public final void Z() {
        al alVar;
        li liVar = this.f24282b;
        if (liVar.L) {
            if (liVar.f26743u2 != null) {
                AndroidUtilities.runOnUIThread(new jk(this, 0));
                return;
            } else if (!this.U) {
                File file = liVar.f26740t2;
                boolean z4 = liVar.f26737s2;
                if (file != null) {
                    if (z4) {
                        try {
                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                            mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                            String extractMetadata = mediaMetadataRetriever.extractMetadata(23);
                            if (extractMetadata != null) {
                                Matcher matcher = Pattern.compile("([+\\-][0-9.]+)([+\\-][0-9.]+)").matcher(extractMetadata);
                                if (matcher.find() && matcher.groupCount() == 2) {
                                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.s7(this, Double.parseDouble(matcher.group(1)), Double.parseDouble(matcher.group(2)), 2));
                                    return;
                                }
                            }
                        } catch (NumberFormatException | Exception unused) {
                        }
                    } else {
                        alVar = this;
                        ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                        float[] fArr = new float[2];
                        if (exifInterface.getLatLong(fArr)) {
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.np(27, this, fArr));
                            return;
                        }
                        Location lastLocation = getLastLocation();
                        alVar.f23412n0 = lastLocation;
                        a0(lastLocation);
                        return;
                    }
                }
                alVar = this;
                Location lastLocation2 = getLastLocation();
                alVar.f23412n0 = lastLocation2;
                a0(lastLocation2);
                return;
            } else {
                AndroidUtilities.runOnUIThread(new jk(this, 8));
                return;
            }
        }
        Location lastLocation3 = getLastLocation();
        this.f23412n0 = lastLocation3;
        a0(lastLocation3);
    }

    public final void a0(Location location) {
        if (location != null) {
            Location location2 = new Location(location);
            this.f23412n0 = location2;
            IMapsProvider.IMap iMap = this.E;
            tf.h0 h0Var = this.L;
            if (iMap != null) {
                IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
                if (h0Var != null) {
                    if (!this.f23419s0 && this.f23422v0 != 8) {
                        h0Var.H(null, this.f23412n0, true);
                    }
                    h0Var.M(this.f23412n0);
                }
                if (!this.f23417r0) {
                    this.f23413o0 = new Location(location);
                    if (this.f23420t0) {
                        this.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                        return;
                    }
                    this.f23420t0 = true;
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
                this.f23413o0 = location;
                location.reset();
                this.f23413o0.setLatitude(d);
                this.f23413o0.setLongitude(d10);
            } else {
                Location location2 = new Location("");
                this.f23412n0 = location2;
                location2.reset();
                this.f23412n0.setLatitude(d);
                this.f23412n0.setLongitude(d10);
            }
            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(d, d10);
            if (i10 != 0 && d10 != 0.0d) {
                newCameraUpdateLatLngZoom = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.E.getMaxZoomLevel() - 4.0f);
            } else {
                newCameraUpdateLatLngZoom = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.E.getMinZoomLevel());
            }
            this.G = newCameraUpdateLatLngZoom;
            this.E.moveCamera(newCameraUpdateLatLngZoom);
            tf.h0 h0Var = this.L;
            if (i10 != 0 && d10 != 0.0d) {
                h0Var.L(this.f23413o0);
            } else {
                h0Var.M(this.f23412n0);
            }
            h0Var.I();
            this.M.v0(0, 1, null);
            this.f23415q0 = true;
            if (i10 != 0 && d10 != 0.0d) {
                this.f23417r0 = true;
                d0(false);
                if (this.f23422v0 != 8) {
                    h0Var.H(null, this.f23413o0, true);
                }
                this.f23419s0 = true;
                c0();
            }
        }
    }

    public final void c0() {
        if (this.L.h() != 0 && this.Q.L0() == 0) {
            lh.e1 e1Var = this.M;
            View childAt = e1Var.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top >= 0 && top <= AndroidUtilities.dp(258.0f)) {
                e1Var.v0(0, top, null);
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
        yk ykVar = this.f23418s;
        if (z4 && ykVar != null && ykVar.getTag() == null && ((location = this.f23412n0) == null || (location2 = this.f23413o0) == null || location2.distanceTo(location) < 300.0f)) {
            z4 = false;
        }
        if (this.f23422v0 == 8) {
            z4 = false;
        }
        if (ykVar != null) {
            if (!z4 || ykVar.getTag() == null) {
                if (z4 || ykVar.getTag() != null) {
                    if (z4) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    ykVar.setVisibility(i10);
                    if (z4) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    ykVar.setTag(num);
                    AnimatorSet animatorSet = new AnimatorSet();
                    if (z4) {
                        f10 = 0.0f;
                    } else {
                        f10 = -AndroidUtilities.dp(80.0f);
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(ykVar, View.TRANSLATION_X, f10));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(mr.f27123g);
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
        tk tkVar = this.O;
        tf.h0 h0Var = this.L;
        int i13 = 0;
        if (i10 == i12) {
            this.U = false;
            this.T = false;
            Z();
            if (h0Var != null) {
                h0Var.O(this.U, this.T);
            }
            if (tkVar != null && tkVar.J != (z10 = this.U)) {
                tkVar.J = z10;
            }
            IMapsProvider.IMap iMap = this.E;
            if (iMap != null) {
                try {
                    iMap.setMyLocationEnabled(true);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } else if (i10 == NotificationCenter.locationPermissionDenied) {
            this.U = true;
            this.T = false;
            if (h0Var != null) {
                h0Var.O(true, false);
            }
            if (tkVar != null && tkVar.J != (z4 = this.U)) {
                tkVar.J = z4;
            }
        }
        W();
        boolean z11 = this.U;
        li liVar = this.f24282b;
        if (z11 && !liVar.L) {
            i13 = 8;
        } else {
            liVar.getClass();
        }
        this.B.setVisibility(i13);
    }

    public final void e0() {
        dg.u2 u2Var;
        int i10;
        int i11;
        IMapsProvider.LatLng latLng;
        Location location;
        IMapsProvider.IMap iMap;
        if (this.F != null && (u2Var = this.K) != null) {
            lh.e1 e1Var = this.M;
            f2.l1 K = e1Var.K(0);
            if (K != null) {
                i10 = (int) K.f5774a.getY();
                i11 = Math.min(i10, 0) + this.f23424w0;
            } else {
                i10 = -u2Var.getMeasuredHeight();
                i11 = 0;
            }
            if (((FrameLayout.LayoutParams) u2Var.getLayoutParams()) != null) {
                xk xkVar = this.C;
                if (i11 <= 0) {
                    if (this.F.getView().getVisibility() == 0) {
                        this.F.getView().setVisibility(4);
                        u2Var.setVisibility(4);
                        if (xkVar != null) {
                            xkVar.setVisibility(4);
                        }
                    }
                    this.F.getView().setTranslationY(i10);
                    return;
                }
                if (this.F.getView().getVisibility() == 4) {
                    this.F.getView().setVisibility(0);
                    u2Var.setVisibility(0);
                    if (xkVar != null) {
                        xkVar.setVisibility(0);
                    }
                }
                int max = Math.max(0, (-((i10 - this.f23426x0) + this.f23424w0)) / 2);
                int i12 = this.f23426x0 - this.f23424w0;
                float max2 = 1.0f - Math.max(0.0f, Math.min(1.0f, (e1Var.getPaddingTop() - i10) / (e1Var.getPaddingTop() - i12)));
                int i13 = this.f23428y0;
                if (this.U && X()) {
                    i12 += Math.min(i10, e1Var.getPaddingTop());
                }
                this.f23428y0 = (int) (i12 * max2);
                float f10 = max;
                this.F.getView().setTranslationY(f10);
                this.f23429z0 = i12 - this.f23428y0;
                u2Var.invalidate();
                u2Var.setTranslationY(i10 - this.f23429z0);
                IMapsProvider.IMap iMap2 = this.E;
                if (iMap2 != null) {
                    iMap2.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f) + this.f23428y0);
                }
                if (xkVar != null) {
                    xkVar.setTranslationY(f10);
                }
                int max3 = Math.max(this.f23429z0 - i10, 0);
                int i14 = this.f23426x0;
                org.telegram.ui.ActionBar.w0 w0Var = this.f23416r;
                float min = Math.min(max3, (i14 - w0Var.getMeasuredHeight()) - AndroidUtilities.dp(80.0f));
                w0Var.setTranslationY(min);
                yk ykVar = this.f23418s;
                ykVar.f31044c = min;
                ykVar.setTranslationY(min + ykVar.f31043b);
                this.f23411n.setTranslationY(-this.f23428y0);
                int C = org.telegram.ui.b.C(48.0f, (this.f23426x0 - this.f23428y0) / 2, max);
                this.f23414p0 = C;
                this.P.setTranslationY(C);
                if (i13 != this.f23428y0) {
                    IMapsProvider.IMarker iMarker = this.f23402d0;
                    if (iMarker != null) {
                        latLng = new IMapsProvider.LatLng(iMarker.getPosition().latitude, this.f23402d0.getPosition().longitude);
                    } else if (this.f23417r0 && (location = this.f23413o0) != null) {
                        latLng = new IMapsProvider.LatLng(location.getLatitude(), this.f23413o0.getLongitude());
                    } else {
                        Location location2 = this.f23412n0;
                        if (location2 != null) {
                            latLng = new IMapsProvider.LatLng(location2.getLatitude(), this.f23412n0.getLongitude());
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
                        f2.l1 K2 = e1Var.K(i15);
                        if (K2 != null) {
                            K2.f5774a.setTranslationY(e1Var.getPaddingTop() - i10);
                        }
                    }
                }
            }
        }
    }

    public final void f0() {
        boolean z4 = this.f23407i0;
        LinearLayout linearLayout = this.v;
        if (z4) {
            boolean z10 = this.f23409k0;
            rl0 rl0Var = this.N;
            if (z10) {
                rl0Var.setEmptyView(null);
                linearLayout.setVisibility(8);
                return;
            }
            rl0Var.setEmptyView(linearLayout);
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
        lh.e1 e1Var = this.M;
        if (e1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        dl0 dl0Var = (dl0) e1Var.K(0);
        if (dl0Var != null) {
            i10 = Math.max(((int) dl0Var.f5774a.getY()) - this.f23429z0, 0);
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
    public ArrayList<org.telegram.ui.ActionBar.l6> getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList<org.telegram.ui.ActionBar.l6> arrayList = new ArrayList<>();
        t6 t6Var = new t6(this, 2);
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.K, 1, null, null, null, null, org.telegram.ui.ActionBar.j6.f19952h5));
        int i10 = org.telegram.ui.ActionBar.j6.A5;
        lh.e1 e1Var = this.M;
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 32768, null, null, null, null, i10));
        org.telegram.ui.ActionBar.w0 w0Var = this.B;
        if (w0Var != null) {
            editTextBoldCursor = w0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.l6(editTextBoldCursor, 16777216, null, null, null, null, org.telegram.ui.ActionBar.j6.f19987j5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.j6.f19971i6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.j6.f20000k0, null, null, org.telegram.ui.ActionBar.j6.f19882d7));
        int i11 = org.telegram.ui.ActionBar.j6.W5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f23423w, 8, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.j6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f23425x, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f23427y, 4, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.j6.ui;
        ImageView imageView = this.f23411n;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 262152, null, null, null, null, i13));
        int i14 = org.telegram.ui.ActionBar.j6.vi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 262152, null, null, null, null, i14));
        int i15 = org.telegram.ui.ActionBar.j6.wi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 32, null, null, null, null, i15));
        int i16 = org.telegram.ui.ActionBar.j6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.l6(imageView, 65568, null, null, null, null, i16));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.f23416r;
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var2, 0, null, null, null, t6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var2, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(w0Var2, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f23418s, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f23418s, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.l6(this.f23418s, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, org.telegram.ui.ActionBar.j6.f20126r0, t6Var, org.telegram.ui.ActionBar.j6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, t6Var, org.telegram.ui.ActionBar.j6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.si));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.l6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.j6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 393216, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.ni));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 393216, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.qi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 393248, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.mi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 393248, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.pi));
        int i17 = org.telegram.ui.ActionBar.j6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"accurateTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 262144, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.ri));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 262144, new Class[]{org.telegram.ui.Cells.r6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.oi));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"buttonTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 131072, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 196608, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 32, new Class[]{org.telegram.ui.Cells.y6.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19846b7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 48, new Class[]{org.telegram.ui.Cells.y6.class}, null, null, null, org.telegram.ui.ActionBar.j6.f19827a7));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.l4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f20059n5));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 32, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.j6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
        rl0 rl0Var = this.N;
        arrayList.add(new org.telegram.ui.ActionBar.l6(rl0Var, 32, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(rl0Var, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(rl0Var, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.t7.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.t7.class}, new String[]{"distanceTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.j6.f19953h6));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 8, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.l6(e1Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView2"}, null, null, -1, null, i12));
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
        dg.u2 u2Var = this.K;
        if (u2Var != null) {
            u2Var.invalidate();
        }
        try {
            IMapsProvider.IMap iMap = this.E;
            if (iMap != null) {
                iMap.setMyLocationEnabled(false);
            }
        } catch (Exception e) {
            FileLog.e(e);
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
        tf.h0 h0Var = this.L;
        if (h0Var != null) {
            h0Var.F();
        }
        tk tkVar = this.O;
        if (tkVar != null) {
            tkVar.F();
        }
        li liVar = this.f24282b;
        liVar.U0.h(true);
        liVar.U0.n().removeView(this.B);
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

    public void setDelegate(uk ukVar) {
        this.f23421u0 = ukVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f24282b.getSheetContainer().invalidate();
        e0();
    }

    @Override
    public final void v() {
        boolean z4;
        li liVar = this.f24282b;
        if (liVar != null && !liVar.isKeyboardVisible()) {
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
        if (iMapView != null && this.f23410l0) {
            try {
                iMapView.onPause();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        this.m0 = false;
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.al.y(int, int):void");
    }
}
