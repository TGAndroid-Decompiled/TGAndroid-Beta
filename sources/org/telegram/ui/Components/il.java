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
public final class il extends oi implements NotificationCenter.NotificationCenterDelegate {
    public static final int E0 = 0;
    public int A0;
    public int B0;
    public int C0;
    public final Bitmap[] D0;
    public final org.telegram.ui.ActionBar.w0 E;
    public final fl F;
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
    public final yl0 Q;
    public final cl R;
    public final ImageView S;
    public final hg.e0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean f25168a0;
    public boolean f25169b0;
    public final long f25170c0;
    public final Paint f25171d0;
    public final ArrayList f25172e0;
    public AnimatorSet f25173f0;
    public IMapsProvider.IMarker f25174g0;
    public hl f25175h0;
    public FrameLayout f25176i0;
    public boolean f25177j0;
    public boolean f25178k0;
    public boolean f25179l0;
    public boolean m0;
    public final ImageView f25180n;
    public boolean f25181n0;
    public boolean f25182o0;
    public boolean f25183p0;
    public Location f25184q0;
    public final org.telegram.ui.ActionBar.w0 f25185r;
    public Location f25186r0;
    public final gl f25187s;
    public int f25188s0;
    public boolean f25189t0;
    public boolean f25190u0;
    public final LinearLayout v;
    public boolean f25191v0;
    public final ImageView f25192w;
    public boolean f25193w0;
    public final TextView f25194x;
    public dl f25195x0;
    public final TextView f25196y;
    public final int f25197y0;
    public int f25198z0;

    public il(wi wiVar, Context context, final org.telegram.ui.ActionBar.e6 e6Var, boolean z10) {
        super(context, e6Var, wiVar);
        final org.telegram.ui.xn xnVar;
        boolean z11;
        int i10;
        boolean z12;
        this.V = true;
        this.W = false;
        this.f25168a0 = false;
        this.f25169b0 = true;
        this.f25171d0 = new Paint();
        this.f25172e0 = new ArrayList();
        this.f25177j0 = true;
        this.f25178k0 = true;
        int currentActionBarHeight = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.f25198z0 = currentActionBarHeight;
        this.A0 = currentActionBarHeight;
        this.D0 = new Bitmap[7];
        AndroidUtilities.fixGoogleMapsBug();
        wi wiVar2 = this.f27104b;
        org.telegram.ui.ActionBar.o2 o2Var = wiVar2.f29962f0;
        if (o2Var instanceof org.telegram.ui.xn) {
            xnVar = (org.telegram.ui.xn) o2Var;
        } else {
            xnVar = null;
        }
        long l1 = wiVar2.l1();
        this.f25170c0 = l1;
        if (this.f27104b.O) {
            this.f25197y0 = 7;
        } else if (z10 && xnVar != null && xnVar.h == null && !xnVar.c() && !UserObject.isUserSelf(xnVar.i())) {
            this.f25197y0 = 1;
        } else {
            this.f25197y0 = 0;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        this.m0 = false;
        this.f25179l0 = false;
        this.f25181n0 = false;
        gg.t0 t0Var = this.O;
        if (t0Var != null) {
            t0Var.F();
        }
        cl clVar = this.R;
        if (clVar != null) {
            clVar.F();
        }
        if (Build.VERSION.SDK_INT >= 23 && getParentActivity() != null && getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f25168a0 = z11;
        org.telegram.ui.ActionBar.a0 o9 = this.f27104b.X0.o();
        this.F = new fl(this, context);
        org.telegram.ui.ActionBar.w0 a2 = o9.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new hg.d2(this, 7);
        this.E = a2;
        if (this.f25168a0 && !this.f27104b.O) {
            i10 = 8;
        } else {
            this.f27104b.getClass();
            i10 = 0;
        }
        a2.setVisibility(i10);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i11 = org.telegram.ui.ActionBar.i6.f19164j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.i6.v0(i11, this.f27103a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.i6.v0(i11, this.f27103a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Vd, this.f27103a));
        new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f)).gravity = 83;
        ai.f0 f0Var = new ai.f0(this, context, 9);
        this.N = f0Var;
        f0Var.setWillNotDraw(false);
        View view = new View(context);
        this.M = view;
        view.setBackgroundDrawable(new ed(org.telegram.ui.ActionBar.i6.A0().q()));
        gl glVar = new gl(context, 0);
        this.f25187s = glVar;
        glVar.setTranslationX(-AndroidUtilities.dp(80.0f));
        glVar.setVisibility(4);
        int dp = AndroidUtilities.dp(40.0f);
        int i12 = org.telegram.ui.ActionBar.i6.wi;
        int v02 = org.telegram.ui.ActionBar.i6.v0(i12, this.f27103a);
        int i13 = org.telegram.ui.ActionBar.i6.xi;
        int v03 = org.telegram.ui.ActionBar.i6.v0(i13, this.f27103a);
        org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.i6.i0(dp, dp, dp, dp, v02, v03, v03);
        w7.a6.a(glVar);
        glVar.setTranslationZ(AndroidUtilities.dp(2.0f));
        ai.k2 k2Var = yf.j0.f47162a;
        glVar.setOutlineProvider(k2Var);
        glVar.setBackground(i02);
        int i14 = org.telegram.ui.ActionBar.i6.vi;
        glVar.setTextColor(org.telegram.ui.ActionBar.i6.v0(i14, this.f27103a));
        glVar.setTextSize(1, 14.0f);
        glVar.setTypeface(AndroidUtilities.bold());
        glVar.setText(LocaleController.getString(R.string.PlacesInThisArea));
        glVar.setGravity(17);
        glVar.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        f0Var.addView(glVar, w7.y5.d(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
        glVar.setOnClickListener(new View.OnClickListener(this) {
            public final il f28893b;

            {
                this.f28893b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        il.Q(this.f28893b);
                        return;
                    case 1:
                        il ilVar = this.f28893b;
                        ilVar.d0(false);
                        ilVar.O.H(null, ilVar.f25186r0, true);
                        ilVar.f25191v0 = true;
                        ilVar.c0();
                        return;
                    default:
                        this.f28893b.f25185r.M(null, null);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.w0 w0Var = new org.telegram.ui.ActionBar.w0(context, null, 0, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.ui, this.f27103a), false, e6Var);
        this.f25185r = w0Var;
        w0Var.setClickable(true);
        w0Var.setSubMenuOpenSide(2);
        w0Var.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        w0Var.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        w0Var.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), e6Var);
        w0Var.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), e6Var);
        w0Var.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), e6Var);
        w0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.Cells.z h02 = org.telegram.ui.ActionBar.i6.h0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.i6.v0(i12, this.f27103a), org.telegram.ui.ActionBar.i6.v0(i13, this.f27103a));
        w7.a6.a(w0Var);
        w0Var.setTranslationZ(AndroidUtilities.dp(2.0f));
        w0Var.setOutlineProvider(k2Var);
        w0Var.setBackground(h02);
        w0Var.setIcon(R.drawable.msg_map_type);
        f0Var.addView(w0Var, w7.y5.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        w0Var.setOnClickListener(new View.OnClickListener(this) {
            public final il f28893b;

            {
                this.f28893b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        il.Q(this.f28893b);
                        return;
                    case 1:
                        il ilVar = this.f28893b;
                        ilVar.d0(false);
                        ilVar.O.H(null, ilVar.f25186r0, true);
                        ilVar.f25191v0 = true;
                        ilVar.c0();
                        return;
                    default:
                        this.f28893b.f25185r.M(null, null);
                        return;
                }
            }
        });
        w0Var.setDelegate(new tk(this, 0));
        ImageView imageView = new ImageView(context);
        this.f25180n = imageView;
        org.telegram.ui.Cells.z h03 = org.telegram.ui.ActionBar.i6.h0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.i6.v0(i12, this.f27103a), org.telegram.ui.ActionBar.i6.v0(i13, this.f27103a));
        w7.a6.a(imageView);
        imageView.setTranslationZ(AndroidUtilities.dp(2.0f));
        imageView.setOutlineProvider(k2Var);
        imageView.setBackground(h03);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int v04 = org.telegram.ui.ActionBar.i6.v0(i14, this.f27103a);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(v04, mode));
        imageView.setTag(Integer.valueOf(i14));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        f0Var.addView(imageView, w7.y5.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final il f28893b;

            {
                this.f28893b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        il.Q(this.f28893b);
                        return;
                    case 1:
                        il ilVar = this.f28893b;
                        ilVar.d0(false);
                        ilVar.O.H(null, ilVar.f25186r0, true);
                        ilVar.f25191v0 = true;
                        ilVar.c0();
                        return;
                    default:
                        this.f28893b.f25185r.M(null, null);
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
        this.f25192w = imageView2;
        imageView2.setImageResource(R.drawable.location_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.W5, this.f27103a), mode));
        linearLayout.addView(imageView2, w7.y5.n(-2, -2));
        TextView textView = new TextView(context);
        this.f25194x = textView;
        int i15 = org.telegram.ui.ActionBar.i6.X5;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i15, this.f27103a));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 17.0f);
        textView.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView h = com.google.android.gms.internal.vision.e2.h(linearLayout, textView, w7.y5.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.f25196y = h;
        h.setTextColor(org.telegram.ui.ActionBar.i6.v0(i15, this.f27103a));
        h.setGravity(17);
        h.setTextSize(1, 15.0f);
        h.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(h, w7.y5.t(-2, -2, 17, 0, 6, 0, 0));
        ai.w0 w0Var2 = new ai.w0(this, context, e6Var, 13);
        this.P = w0Var2;
        setBlur3Capture(w0Var2);
        this.d = w0Var2;
        this.f27106f = true;
        w0Var2.setClipToPadding(false);
        gg.t0 t0Var2 = new gg.t0(context, this.f25197y0, l1, true, e6Var, this.f27104b.O, false, false);
        this.O = t0Var2;
        w0Var2.setAdapter(t0Var2);
        wi wiVar3 = this.f27104b;
        if (wiVar3 != null && (wiVar3.H || wiVar3.P)) {
            z12 = true;
        } else {
            z12 = false;
        }
        t0Var2.f9922f0 = z12;
        s4.j jVar = new s4.j();
        jVar.n(350L);
        jVar.o(sr.h);
        jVar.C = false;
        jVar.f43040m = false;
        w0Var2.setItemAnimator(jVar);
        t0Var2.O(this.f25168a0, this.W);
        w0Var2.setVerticalScrollBarEnabled(false);
        w0Var2.q1();
        hg.e0 e0Var = new hg.e0(this, w0Var2);
        this.T = e0Var;
        w0Var2.setLayoutManager(e0Var);
        addView(w0Var2, w7.y5.e(-1, -1, 51));
        w0Var2.setOnScrollListener(new bl(this));
        w0Var2.setOnItemClickListener(new ml0(this) {
            public final il f29172b;

            {
                this.f29172b = this;
            }

            @Override
            public final void d(int i16, View view2) {
                switch (r4) {
                    case 0:
                        il.N(this.f29172b, xnVar, e6Var, i16);
                        return;
                    default:
                        il.O(this.f29172b, xnVar, e6Var, i16);
                        return;
                }
            }
        });
        tk tkVar = new tk(this, 1);
        t0Var2.H = l1;
        t0Var2.f9672y = tkVar;
        t0Var2.P(AndroidUtilities.dp(16.0f) + this.f25198z0);
        addView(f0Var, w7.y5.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.I = onCreateMapView;
        onCreateMapView.setOnDispatchTouchEventInterceptor(new tk(this, 2));
        this.I.setOnInterceptTouchEventInterceptor(new tk(this, 3));
        new Thread(new xk(this, this.I, 1)).start();
        ImageView imageView3 = new ImageView(context);
        this.S = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        f0Var.addView(imageView3, w7.y5.e(28, 48, 49));
        yl0 yl0Var = new yl0(context, e6Var);
        this.Q = yl0Var;
        yl0Var.setSections(true);
        yl0Var.setClipToPadding(false);
        yl0Var.setVisibility(8);
        yl0Var.setLayoutManager(new s4.c0(1, false));
        cl clVar2 = new cl(this, context, e6Var, this.f27104b.O);
        this.R = clVar2;
        boolean z13 = this.f25168a0;
        if (clVar2.M != z13) {
            clVar2.M = z13;
        }
        tk tkVar2 = new tk(this, 7);
        clVar2.H = 0L;
        clVar2.f9672y = tkVar2;
        yl0Var.setItemAnimator(null);
        addView(yl0Var, w7.y5.e(-1, -1, 51));
        yl0Var.setOnScrollListener(new ai.r(this, 21));
        yl0Var.setOnItemClickListener(new ml0(this) {
            public final il f29172b;

            {
                this.f29172b = this;
            }

            @Override
            public final void d(int i16, View view2) {
                switch (r4) {
                    case 0:
                        il.N(this.f29172b, xnVar, e6Var, i16);
                        return;
                    default:
                        il.O(this.f29172b, xnVar, e6Var, i16);
                        return;
                }
            }
        });
        f0();
    }

    public static void K(il ilVar, IMapsProvider.IMap iMap) {
        PackageManager packageManager;
        ilVar.H = iMap;
        iMap.setOnMapLoadedCallback(new sk(ilVar, 3));
        if (org.telegram.ui.ActionBar.i6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f19057d6, ilVar.f27103a)) < 0.721f) {
            ilVar.U = true;
            ilVar.H.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
        }
        if (ilVar.H != null) {
            Location location = new Location("network");
            ilVar.f25186r0 = location;
            location.setLatitude(20.659322d);
            ilVar.f25186r0.setLongitude(-11.40625d);
            try {
                ilVar.H.setMyLocationEnabled(true);
            } catch (Exception e) {
                FileLog.e(e);
            }
            ilVar.H.getUiSettings().setMyLocationButtonEnabled(false);
            ilVar.H.getUiSettings().setZoomControlsEnabled(false);
            ilVar.H.getUiSettings().setCompassEnabled(false);
            ilVar.H.setOnCameraMoveStartedListener(new tk(ilVar, 4));
            ilVar.H.setOnCameraIdleListener(new sk(ilVar, 5));
            ilVar.H.setOnMyLocationChangeListener(new zk(ilVar, 1));
            ilVar.H.setOnMarkerClickListener(new tk(ilVar, 5));
            ilVar.H.setOnCameraMoveListener(new sk(ilVar, 6));
            ilVar.Z();
            AndroidUtilities.runOnUIThread(new sk(ilVar, 7), 200L);
            if (ilVar.V && ilVar.getParentActivity() != null) {
                ilVar.V = false;
                Activity parentActivity = ilVar.getParentActivity();
                if (parentActivity == null || (packageManager = parentActivity.getPackageManager()) == null || packageManager.hasSystemFeature("android.hardware.location.gps")) {
                    try {
                        if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ilVar.getParentActivity(), 0, ilVar.f27103a);
                            alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.L5, ilVar.f27103a), null);
                            alertDialog$Builder.f18655a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                            alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new tk(ilVar, 6));
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
            ilVar.e0();
        }
    }

    public static void L(il ilVar, org.telegram.ui.xn xnVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.e6 e6Var, Long l4) {
        if (xnVar != null && xnVar.c()) {
            e5.M(ilVar.getParentActivity(), xnVar.a(), new ai.q5(ilVar, tL_messageMediaGeo, l4, 25), e6Var);
            return;
        }
        ilVar.f25195x0.b(tL_messageMediaGeo, ilVar.f25197y0, true, 0, l4.longValue());
        ilVar.f27104b.dismiss(true);
    }

    public static void M(il ilVar) {
        int i10;
        Activity parentActivity;
        gg.t0 t0Var = ilVar.O;
        wi wiVar = ilVar.f27104b;
        if (ilVar.f25177j0 && (i10 = Build.VERSION.SDK_INT) >= 23 && (parentActivity = ilVar.getParentActivity()) != null) {
            ilVar.f25177j0 = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                String[] strArr = (!wiVar.O || wiVar.f30017w2 == null || i10 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
                ilVar.W = true;
                if (t0Var != null) {
                    t0Var.O(ilVar.f25168a0, true);
                }
                parentActivity.requestPermissions(strArr, 2);
            } else if (i10 >= 29 && wiVar.O && wiVar.f30017w2 != null && parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") != 0) {
                ilVar.W = true;
                if (t0Var != null) {
                    t0Var.O(ilVar.f25168a0, true);
                }
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
            }
        }
    }

    public static void N(il ilVar, org.telegram.ui.xn xnVar, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        il ilVar2;
        org.telegram.ui.xn xnVar2;
        org.telegram.ui.ActionBar.e6 e6Var2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j3 = ilVar.f25170c0;
        gg.t0 t0Var = ilVar.O;
        wi wiVar = ilVar.f27104b;
        int i11 = ilVar.f25197y0;
        if (i11 == 7) {
            if (i10 == 1 && (tL_messageMediaVenue2 = t0Var.f9920d0) != null) {
                ilVar.f25195x0.b(tL_messageMediaVenue2, i11, true, 0, 0L);
                wiVar.dismiss(true);
                return;
            } else if (i10 == 2 && (tL_messageMediaVenue = t0Var.f9921e0) != null) {
                ilVar.f25195x0.b(tL_messageMediaVenue, i11, true, 0, 0L);
                wiVar.dismiss(true);
                return;
            } else {
                ilVar2 = ilVar;
                xnVar2 = xnVar;
                e6Var2 = e6Var;
            }
        } else if (i10 == 1) {
            if (ilVar.f25195x0 != null && ilVar.f25186r0 != null) {
                FrameLayout frameLayout = ilVar.f25176i0;
                if (frameLayout != null) {
                    frameLayout.callOnClick();
                    return;
                }
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(ilVar.f25186r0.getLatitude());
                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(ilVar.f25186r0.getLongitude());
                e5.a0(wiVar.J1, wiVar.h1() + 1, wiVar.l1(), new ai.e4(ilVar, xnVar, tL_messageMediaGeo, e6Var, 6));
                return;
            } else if (ilVar.f25168a0) {
                e5.D(ilVar.getParentActivity()).show();
                return;
            } else {
                return;
            }
        } else {
            ilVar2 = ilVar;
            xnVar2 = xnVar;
            e6Var2 = e6Var;
            if (i10 == 2 && i11 == 1) {
                if (ilVar2.getLocationController().isSharingLocation(j3)) {
                    ilVar2.getLocationController().removeSharingLocation(j3);
                    wiVar.dismiss(true);
                    return;
                } else if (ilVar2.f25184q0 == null && ilVar2.f25168a0) {
                    e5.D(ilVar2.getParentActivity()).show();
                    return;
                } else {
                    ilVar2.Y();
                    return;
                }
            }
        }
        Object J = t0Var.J(i10);
        if (J instanceof TLRPC.TL_messageMediaVenue) {
            e5.a0(wiVar.J1, wiVar.h1() + 1, wiVar.l1(), new ai.e4(ilVar2, xnVar2, (TLRPC.TL_messageMediaVenue) J, e6Var2, 7));
        }
    }

    public static void O(il ilVar, org.telegram.ui.xn xnVar, org.telegram.ui.ActionBar.e6 e6Var, int i10) {
        TLRPC.TL_messageMediaVenue I = ilVar.R.I(i10);
        if (I != null && ilVar.f25195x0 != null) {
            if (xnVar != null && xnVar.c()) {
                e5.M(ilVar.getParentActivity(), xnVar.a(), new yk(ilVar, I, 0), e6Var);
                return;
            }
            ilVar.f25195x0.b(I, ilVar.f25197y0, true, 0, 0L);
            ilVar.f27104b.dismiss(true);
        }
    }

    public static void P(il ilVar, org.telegram.ui.xn xnVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.e6 e6Var) {
        if (xnVar != null && xnVar.c()) {
            e5.M(ilVar.getParentActivity(), xnVar.a(), new yk(ilVar, tL_messageMediaVenue, 1), e6Var);
            return;
        }
        ilVar.f25195x0.b(tL_messageMediaVenue, ilVar.f25197y0, true, 0, 0L);
        ilVar.f27104b.dismiss(true);
    }

    public static void Q(il ilVar) {
        Activity parentActivity;
        gg.t0 t0Var = ilVar.O;
        ImageView imageView = ilVar.f25180n;
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = ilVar.getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            e5.D(ilVar.getParentActivity()).show();
            return;
        }
        if (ilVar.f25184q0 != null && ilVar.H != null) {
            int i10 = org.telegram.ui.ActionBar.i6.vi;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.i6.v0(i10, ilVar.f27103a), PorterDuff.Mode.MULTIPLY));
            imageView.setTag(Integer.valueOf(i10));
            t0Var.L(null);
            ilVar.f25190u0 = false;
            ilVar.d0(false);
            ilVar.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(ilVar.f25184q0.getLatitude(), ilVar.f25184q0.getLongitude())));
            if (ilVar.f25191v0) {
                Location location = ilVar.f25184q0;
                if (location != null && ilVar.f25197y0 != 8) {
                    t0Var.H(null, location, true);
                }
                ilVar.f25191v0 = false;
                ilVar.c0();
            }
        }
        if (ilVar.f25174g0 != null) {
            ilVar.S.setVisibility(0);
            fl flVar = ilVar.F;
            IMapsProvider.IMarker iMarker = ilVar.f25174g0;
            HashMap hashMap = flVar.f24306a;
            View view = (View) hashMap.get(iMarker);
            if (view != null) {
                flVar.removeView(view);
                hashMap.remove(iMarker);
            }
            ilVar.f25174g0 = null;
            ilVar.f25175h0 = null;
            ilVar.f25176i0 = null;
        }
    }

    public static void R(il ilVar, Location location) {
        int i10;
        wi wiVar = ilVar.f27104b;
        if (wiVar != null && wiVar.f29962f0 != null) {
            ilVar.a0(location);
            gg.t0 t0Var = ilVar.O;
            if (t0Var != null && (((i10 = ilVar.f25197y0) == 7 || i10 == 8) && !ilVar.f25190u0)) {
                t0Var.L(ilVar.f25186r0);
            }
            ilVar.getLocationController().setMapLocation(location, ilVar.f25169b0);
            ilVar.f25169b0 = false;
        }
    }

    public static void S(il ilVar, IMapsProvider.IMapView iMapView) {
        if (ilVar.I != null && ilVar.getParentActivity() != null) {
            try {
                iMapView.onCreate(null);
                ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                ilVar.I.getMapAsync(new zk(ilVar, 0));
                ilVar.f25182o0 = true;
                if (ilVar.f25183p0) {
                    ilVar.I.onResume();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void T(il ilVar) {
        if (ilVar.getParentActivity() != null) {
            try {
                ilVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
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
        return this.f27104b.f29962f0.getLocationController();
    }

    private MessagesController getMessagesController() {
        return this.f27104b.f29962f0.getMessagesController();
    }

    public Activity getParentActivity() {
        org.telegram.ui.ActionBar.o2 o2Var;
        wi wiVar = this.f27104b;
        if (wiVar != null && (o2Var = wiVar.f29962f0) != null) {
            return o2Var.getParentActivity();
        }
        return null;
    }

    private UserConfig getUserConfig() {
        return this.f27104b.f29962f0.getUserConfig();
    }

    @Override
    public final void E(oi oiVar) {
        long j3;
        wi wiVar = this.f27104b;
        wiVar.X0.setTitle(LocaleController.getString(R.string.ShareLocation));
        if (this.I.getView().getParent() == null) {
            View view = this.I.getView();
            FrameLayout.LayoutParams e = w7.y5.e(-1, AndroidUtilities.dp(10.0f) + this.f25198z0, 51);
            ai.f0 f0Var = this.N;
            f0Var.addView(view, 0, e);
            f0Var.addView(this.F, 1, w7.y5.e(-1, AndroidUtilities.dp(10.0f) + this.f25198z0, 51));
            f0Var.addView(this.M, 2, w7.y5.c(-1.0f, -1));
        }
        this.E.setVisibility(0);
        IMapsProvider.IMapView iMapView = this.I;
        if (iMapView != null && this.f25182o0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.f25183p0 = true;
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
        sk skVar = new sk(this, 1);
        if (c02) {
            j3 = 200;
        } else {
            j3 = 0;
        }
        AndroidUtilities.runOnUIThread(skVar, j3);
        this.T.h1(0, 0);
        e0();
    }

    @Override
    public final void G() {
        this.P.y0(0);
    }

    @Override
    public final boolean J() {
        return !this.f25168a0;
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
            int i12 = this.f25197y0;
            if (i12 == 1 || i12 == 7 || i12 == 8) {
                dp += AndroidUtilities.dp(66.0f);
            }
            int dp2 = (i11 - dp) - AndroidUtilities.dp(90.0f);
            int dp3 = AndroidUtilities.dp(189.0f);
            this.f25198z0 = dp3;
            if (!this.f25168a0 || !X()) {
                dp2 = Math.min(AndroidUtilities.dp(310.0f), dp2);
            }
            this.A0 = Math.max(dp3, dp2);
            if (this.f25168a0 && X()) {
                this.f25198z0 = this.A0;
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
            yl0 yl0Var = this.Q;
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) yl0Var.getLayoutParams();
            layoutParams4.topMargin = currentActionBarHeight;
            yl0Var.setLayoutParams(layoutParams4);
            if (this.f25168a0 && X()) {
                i10 = this.f25198z0 - w0Var.getPaddingTop();
            } else {
                i10 = this.f25198z0;
            }
            int dp4 = AndroidUtilities.dp(16.0f) + i10;
            gg.t0 t0Var = this.O;
            t0Var.P(dp4);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.I.getView().getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.height = AndroidUtilities.dp(10.0f) + this.A0;
                this.I.getView().setLayoutParams(layoutParams5);
            }
            fl flVar = this.F;
            if (flVar != null && (layoutParams = (FrameLayout.LayoutParams) flVar.getLayoutParams()) != null) {
                layoutParams.height = AndroidUtilities.dp(10.0f) + this.A0;
                flVar.setLayoutParams(layoutParams);
            }
            t0Var.l();
            e0();
        }
    }

    public final boolean X() {
        int i10 = this.f25197y0;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final void Y() {
        TLRPC.User user;
        Activity parentActivity;
        if (this.f25195x0 != null && getParentActivity() != null && this.f25184q0 != null) {
            boolean z10 = this.f25178k0;
            org.telegram.ui.ActionBar.e6 e6Var = this.f27103a;
            if (z10 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
                this.f25178k0 = false;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                    globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                    e5.l(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new sk(this, 2), e6Var).o();
                    return;
                }
            }
            long j3 = this.f25170c0;
            if (DialogObject.isUserDialog(j3)) {
                user = this.f27104b.f29962f0.getMessagesController().getUser(Long.valueOf(j3));
            } else {
                user = null;
            }
            e5.E(getParentActivity(), false, user, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i10) {
                    il ilVar = il.this;
                    wi wiVar = ilVar.f27104b;
                    e5.a0(wiVar.J1, wiVar.h1() + 1, wiVar.l1(), new ci.l4(ilVar, i10, 4));
                }
            }, e6Var).show();
        }
    }

    public final void Z() {
        il ilVar;
        wi wiVar = this.f27104b;
        if (wiVar.O) {
            if (wiVar.f30021x2 != null) {
                AndroidUtilities.runOnUIThread(new sk(this, 0));
                return;
            } else if (!this.f25168a0) {
                File file = wiVar.f30017w2;
                boolean z10 = wiVar.f30013v2;
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
                        ilVar = this;
                        ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                        float[] fArr = new float[2];
                        if (exifInterface.getLatLong(fArr)) {
                            AndroidUtilities.runOnUIThread(new fe(12, this, fArr));
                            return;
                        }
                        Location lastLocation = getLastLocation();
                        ilVar.f25184q0 = lastLocation;
                        a0(lastLocation);
                        return;
                    }
                }
                ilVar = this;
                Location lastLocation2 = getLastLocation();
                ilVar.f25184q0 = lastLocation2;
                a0(lastLocation2);
                return;
            } else {
                AndroidUtilities.runOnUIThread(new sk(this, 8));
                return;
            }
        }
        Location lastLocation3 = getLastLocation();
        this.f25184q0 = lastLocation3;
        a0(lastLocation3);
    }

    public final void a0(Location location) {
        if (location != null) {
            Location location2 = new Location(location);
            this.f25184q0 = location2;
            IMapsProvider.IMap iMap = this.H;
            gg.t0 t0Var = this.O;
            if (iMap != null) {
                IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
                if (t0Var != null) {
                    if (!this.f25191v0 && this.f25197y0 != 8) {
                        t0Var.H(null, this.f25184q0, true);
                    }
                    t0Var.M(this.f25184q0);
                }
                if (!this.f25190u0) {
                    this.f25186r0 = new Location(location);
                    if (this.f25193w0) {
                        this.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                        return;
                    }
                    this.f25193w0 = true;
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
                this.f25186r0 = location;
                location.reset();
                this.f25186r0.setLatitude(d);
                this.f25186r0.setLongitude(d10);
            } else {
                Location location2 = new Location("");
                this.f25184q0 = location2;
                location2.reset();
                this.f25184q0.setLatitude(d);
                this.f25184q0.setLongitude(d10);
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
                t0Var.L(this.f25186r0);
            } else {
                t0Var.M(this.f25184q0);
            }
            t0Var.I();
            this.P.w0(0, 1, null);
            this.f25189t0 = true;
            if (i10 != 0 && d10 != 0.0d) {
                this.f25190u0 = true;
                d0(false);
                if (this.f25197y0 != 8) {
                    t0Var.H(null, this.f25186r0, true);
                }
                this.f25191v0 = true;
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
                w0Var.w0(0, top, null);
            }
        }
    }

    public final void d0(boolean z10) {
        int i10;
        Integer num;
        float f7;
        Location location;
        Location location2;
        if (this.f25168a0) {
            z10 = false;
        }
        gl glVar = this.f25187s;
        if (z10 && glVar != null && glVar.getTag() == null && ((location = this.f25184q0) == null || (location2 = this.f25186r0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        if (this.f25197y0 == 8) {
            z10 = false;
        }
        if (glVar != null) {
            if (!z10 || glVar.getTag() == null) {
                if (z10 || glVar.getTag() != null) {
                    if (z10) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    glVar.setVisibility(i10);
                    if (z10) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    glVar.setTag(num);
                    AnimatorSet animatorSet = new AnimatorSet();
                    if (z10) {
                        f7 = 0.0f;
                    } else {
                        f7 = -AndroidUtilities.dp(80.0f);
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(glVar, View.TRANSLATION_X, f7));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(sr.f28360g);
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
        cl clVar = this.R;
        gg.t0 t0Var = this.O;
        int i13 = 0;
        if (i10 == i12) {
            this.f25168a0 = false;
            this.W = false;
            Z();
            if (t0Var != null) {
                t0Var.O(this.f25168a0, this.W);
            }
            if (clVar != null && clVar.M != (z11 = this.f25168a0)) {
                clVar.M = z11;
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
            this.f25168a0 = true;
            this.W = false;
            if (t0Var != null) {
                t0Var.O(true, false);
            }
            if (clVar != null && clVar.M != (z10 = this.f25168a0)) {
                clVar.M = z10;
            }
        }
        W();
        boolean z12 = this.f25168a0;
        wi wiVar = this.f27104b;
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
            s4.c1 L = w0Var.L(0);
            if (L != null) {
                i10 = (int) L.f43005a.getY();
                i11 = Math.min(i10, 0) + this.f25198z0;
            } else {
                i10 = -f0Var.getMeasuredHeight();
                i11 = 0;
            }
            if (((FrameLayout.LayoutParams) f0Var.getLayoutParams()) != null) {
                fl flVar = this.F;
                if (i11 <= 0) {
                    if (this.I.getView().getVisibility() == 0) {
                        this.I.getView().setVisibility(4);
                        f0Var.setVisibility(4);
                        if (flVar != null) {
                            flVar.setVisibility(4);
                        }
                    }
                    this.I.getView().setTranslationY(i10);
                    return;
                }
                if (this.I.getView().getVisibility() == 4) {
                    this.I.getView().setVisibility(0);
                    f0Var.setVisibility(0);
                    if (flVar != null) {
                        flVar.setVisibility(0);
                    }
                }
                int max = Math.max(0, (-((i10 - this.A0) + this.f25198z0)) / 2);
                int i12 = this.A0 - this.f25198z0;
                float max2 = 1.0f - Math.max(0.0f, Math.min(1.0f, (w0Var.getPaddingTop() - i10) / (w0Var.getPaddingTop() - i12)));
                int i13 = this.B0;
                if (this.f25168a0 && X()) {
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
                if (flVar != null) {
                    flVar.setTranslationY(f7);
                }
                int max3 = Math.max(this.C0 - i10, 0);
                int i14 = this.A0;
                org.telegram.ui.ActionBar.w0 w0Var2 = this.f25185r;
                float min = Math.min(max3, (i14 - w0Var2.getMeasuredHeight()) - AndroidUtilities.dp(80.0f));
                w0Var2.setTranslationY(min);
                gl glVar = this.f25187s;
                glVar.f24595c = min;
                glVar.setTranslationY(min + glVar.f24594b);
                this.f25180n.setTranslationY(-this.B0);
                int D = org.telegram.messenger.qk.D(48.0f, (this.A0 - this.B0) / 2, max);
                this.f25188s0 = D;
                this.S.setTranslationY(D);
                if (i13 != this.B0) {
                    IMapsProvider.IMarker iMarker = this.f25174g0;
                    if (iMarker != null) {
                        latLng = new IMapsProvider.LatLng(iMarker.getPosition().latitude, this.f25174g0.getPosition().longitude);
                    } else if (this.f25190u0 && (location = this.f25186r0) != null) {
                        latLng = new IMapsProvider.LatLng(location.getLatitude(), this.f25186r0.getLongitude());
                    } else {
                        Location location2 = this.f25184q0;
                        if (location2 != null) {
                            latLng = new IMapsProvider.LatLng(location2.getLatitude(), this.f25184q0.getLongitude());
                        } else {
                            latLng = null;
                        }
                    }
                    if (latLng != null && (iMap = this.H) != null) {
                        iMap.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                    }
                }
                if (this.f25168a0 && X()) {
                    int h = this.O.h();
                    for (int i15 = 1; i15 < h; i15++) {
                        s4.c1 L2 = w0Var.L(i15);
                        if (L2 != null) {
                            L2.f43005a.setTranslationY(w0Var.getPaddingTop() - i10);
                        }
                    }
                }
            }
        }
    }

    public final void f0() {
        boolean z10 = this.f25179l0;
        LinearLayout linearLayout = this.v;
        if (z10) {
            boolean z11 = this.f25181n0;
            yl0 yl0Var = this.Q;
            if (z11) {
                yl0Var.setEmptyView(null);
                linearLayout.setVisibility(8);
                return;
            }
            yl0Var.setEmptyView(linearLayout);
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
        il0 il0Var = (il0) w0Var.L(0);
        if (il0Var != null) {
            i10 = Math.max(((int) il0Var.f43005a.getY()) - this.C0, 0);
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
        y6 y6Var = new y6(this, 2);
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.N, 1, null, null, null, null, org.telegram.ui.ActionBar.i6.f19128h5));
        int i10 = org.telegram.ui.ActionBar.i6.A5;
        ai.w0 w0Var = this.P;
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 32768, null, null, null, null, i10));
        org.telegram.ui.ActionBar.w0 w0Var2 = this.E;
        if (w0Var2 != null) {
            editTextBoldCursor = w0Var2.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.k6(editTextBoldCursor, 16777216, null, null, null, null, org.telegram.ui.ActionBar.i6.f19164j5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.i6.f19147i6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.i6.f19179k0, null, null, org.telegram.ui.ActionBar.i6.f19058d7));
        int i11 = org.telegram.ui.ActionBar.i6.W5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f25192w, 8, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.i6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f25194x, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f25196y, 4, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.i6.ui;
        ImageView imageView = this.f25180n;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView, 262152, null, null, null, null, i13));
        int i14 = org.telegram.ui.ActionBar.i6.vi;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView, 262152, null, null, null, null, i14));
        int i15 = org.telegram.ui.ActionBar.i6.wi;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView, 32, null, null, null, null, i15));
        int i16 = org.telegram.ui.ActionBar.i6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView, 65568, null, null, null, null, i16));
        org.telegram.ui.ActionBar.w0 w0Var3 = this.f25185r;
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var3, 0, null, null, null, y6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var3, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var3, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f25187s, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f25187s, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f25187s, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, org.telegram.ui.ActionBar.i6.f19310r0, y6Var, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, y6Var, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.si));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 393216, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19251ni));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 393216, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19308qi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 393248, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19234mi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 393248, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19289pi));
        int i17 = org.telegram.ui.ActionBar.i6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"accurateTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 262144, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.ri));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 262144, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19270oi));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"buttonTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 131072, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 196608, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.i6.f19021b7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 48, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.i6.f19001a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19241n5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.i6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
        yl0 yl0Var = this.Q;
        arrayList.add(new org.telegram.ui.ActionBar.k6(yl0Var, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(yl0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.k6(yl0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.w7.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.w7.class}, new String[]{"distanceTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.i6.f19129h6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 8, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.k6(w0Var, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView2"}, null, null, -1, null, i12));
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
        cl clVar = this.R;
        if (clVar != null) {
            clVar.F();
        }
        wi wiVar = this.f27104b;
        wiVar.X0.i(true);
        wiVar.X0.o().removeView(this.E);
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

    public void setDelegate(dl dlVar) {
        this.f25195x0 = dlVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27104b.getSheetContainer().invalidate();
        e0();
    }

    @Override
    public final void v() {
        boolean z10;
        wi wiVar = this.f27104b;
        if (wiVar != null && !wiVar.isKeyboardVisible()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.O.f9919c0 = z10;
    }

    @Override
    public final void w(int i10, boolean z10) {
        if (z10) {
            this.O.f9919c0 = false;
        }
    }

    @Override
    public final void x() {
        IMapsProvider.IMapView iMapView = this.I;
        if (iMapView != null && this.f25182o0) {
            try {
                iMapView.onPause();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        this.f25183p0 = false;
    }

    @Override
    public final void y(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.il.y(int, int):void");
    }

    @Override
    public final void z() {
        IMapsProvider.IMapView iMapView = this.I;
        if (iMapView != null && this.f25182o0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.f25183p0 = true;
    }
}
