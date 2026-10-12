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
public final class ul extends ni implements NotificationCenter.NotificationCenterDelegate {
    public static final int E0 = 0;
    public int A0;
    public int B0;
    public int C0;
    public final Bitmap[] D0;
    public final org.telegram.ui.ActionBar.u0 E;
    public final rl F;
    public boolean G;
    public IMapsProvider.IMap H;
    public IMapsProvider.IMapView I;
    public IMapsProvider.ICameraUpdate J;
    public float K;
    public boolean L;
    public final View M;
    public final ah.x N;
    public final hg.s0 O;
    public final bi.o0 P;
    public final mm0 Q;
    public final ol R;
    public final ImageView S;
    public final ig.e0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean f29706a0;
    public boolean f29707b0;
    public final long f29708c0;
    public final Paint f29709d0;
    public final ArrayList f29710e0;
    public AnimatorSet f29711f0;
    public IMapsProvider.IMarker f29712g0;
    public tl f29713h0;
    public FrameLayout f29714i0;
    public boolean f29715j0;
    public boolean f29716k0;
    public boolean f29717l0;
    public boolean m0;
    public final ImageView f29718n;
    public boolean f29719n0;
    public boolean f29720o0;
    public boolean f29721p0;
    public Location f29722q0;
    public final org.telegram.ui.ActionBar.u0 f29723r;
    public Location f29724r0;
    public final sl f29725s;
    public int f29726s0;
    public boolean f29727t0;
    public boolean f29728u0;
    public final LinearLayout v;
    public boolean f29729v0;
    public final ImageView f29730w;
    public boolean f29731w0;
    public final TextView f29732x;
    public pl f29733x0;
    public final TextView f29734y;
    public final int f29735y0;
    public int f29736z0;

    public ul(vi viVar, Context context, final org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, viVar);
        final org.telegram.ui.fo foVar;
        boolean z11;
        int i10;
        boolean z12;
        this.V = true;
        this.W = false;
        this.f29706a0 = false;
        this.f29707b0 = true;
        this.f29709d0 = new Paint();
        this.f29710e0 = new ArrayList();
        this.f29715j0 = true;
        this.f29716k0 = true;
        int currentActionBarHeight = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.f29736z0 = currentActionBarHeight;
        this.A0 = currentActionBarHeight;
        this.D0 = new Bitmap[7];
        AndroidUtilities.fixGoogleMapsBug();
        vi viVar2 = this.f27671b;
        org.telegram.ui.ActionBar.m2 m2Var = viVar2.f30001f0;
        if (m2Var instanceof org.telegram.ui.fo) {
            foVar = (org.telegram.ui.fo) m2Var;
        } else {
            foVar = null;
        }
        long p12 = viVar2.p1();
        this.f29708c0 = p12;
        if (this.f27671b.O) {
            this.f29735y0 = 7;
        } else if (z10 && foVar != null && foVar.h == null && !foVar.c() && !UserObject.isUserSelf(foVar.i())) {
            this.f29735y0 = 1;
        } else {
            this.f29735y0 = 0;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        this.m0 = false;
        this.f29717l0 = false;
        this.f29719n0 = false;
        hg.s0 s0Var = this.O;
        if (s0Var != null) {
            s0Var.F();
        }
        ol olVar = this.R;
        if (olVar != null) {
            olVar.F();
        }
        if (getParentActivity() != null && getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f29706a0 = z11;
        org.telegram.ui.ActionBar.y n10 = this.f27671b.f29985a1.n();
        this.F = new rl(this, context);
        org.telegram.ui.ActionBar.u0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.d2(this, 6);
        this.E = a2;
        if (this.f29706a0 && !this.f27671b.O) {
            i10 = 8;
        } else {
            this.f27671b.getClass();
            i10 = 0;
        }
        a2.setVisibility(i10);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i11 = org.telegram.ui.ActionBar.g6.f20007j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, this.f27670a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.g6.w0(i11, this.f27670a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Vd, this.f27670a));
        new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f)).gravity = 83;
        ah.x xVar = new ah.x(this, context, 10);
        this.N = xVar;
        xVar.setWillNotDraw(false);
        View view = new View(context);
        this.M = view;
        view.setBackgroundDrawable(new gd(org.telegram.ui.ActionBar.g6.B0().q()));
        sl slVar = new sl(context, 0);
        this.f29725s = slVar;
        slVar.setTranslationX(-AndroidUtilities.dp(80.0f));
        slVar.setVisibility(4);
        int dp = AndroidUtilities.dp(40.0f);
        int i12 = org.telegram.ui.ActionBar.g6.wi;
        int w02 = org.telegram.ui.ActionBar.g6.w0(i12, this.f27670a);
        int i13 = org.telegram.ui.ActionBar.g6.xi;
        int w03 = org.telegram.ui.ActionBar.g6.w0(i13, this.f27670a);
        org.telegram.ui.Cells.z j02 = org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, w02, w03, w03);
        w7.c6.a(slVar);
        slVar.setTranslationZ(AndroidUtilities.dp(2.0f));
        bi.a2 a2Var = zf.j0.f50191a;
        slVar.setOutlineProvider(a2Var);
        slVar.setBackground(j02);
        int i14 = org.telegram.ui.ActionBar.g6.vi;
        slVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(i14, this.f27670a));
        slVar.setTextSize(1, 14.0f);
        slVar.setTypeface(AndroidUtilities.bold());
        slVar.setText(LocaleController.getString(R.string.PlacesInThisArea));
        slVar.setGravity(17);
        slVar.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        xVar.addView(slVar, w7.a6.a(40.0f, 80.0f, 12.0f, 80.0f, 0.0f, -2, 49));
        slVar.setOnClickListener(new View.OnClickListener(this) {
            public final ul f25315b;

            {
                this.f25315b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        ul.T(this.f25315b);
                        return;
                    case 1:
                        ul ulVar = this.f25315b;
                        ulVar.g0(false);
                        ulVar.O.H(null, ulVar.f29724r0, true);
                        ulVar.f29729v0 = true;
                        ulVar.f0();
                        return;
                    default:
                        this.f25315b.f29723r.M(null, null);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, 0, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.ui, this.f27670a), false, c6Var);
        this.f29723r = u0Var;
        u0Var.setClickable(true);
        u0Var.setSubMenuOpenSide(2);
        u0Var.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        u0Var.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        u0Var.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), c6Var);
        u0Var.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), c6Var);
        u0Var.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), c6Var);
        u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.g6.i0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.g6.w0(i12, this.f27670a), org.telegram.ui.ActionBar.g6.w0(i13, this.f27670a));
        w7.c6.a(u0Var);
        u0Var.setTranslationZ(AndroidUtilities.dp(2.0f));
        u0Var.setOutlineProvider(a2Var);
        u0Var.setBackground(i02);
        u0Var.setIcon(R.drawable.msg_map_type);
        xVar.addView(u0Var, w7.a6.a(40.0f, 0.0f, 12.0f, 12.0f, 0.0f, 40, 53));
        u0Var.setOnClickListener(new View.OnClickListener(this) {
            public final ul f25315b;

            {
                this.f25315b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        ul.T(this.f25315b);
                        return;
                    case 1:
                        ul ulVar = this.f25315b;
                        ulVar.g0(false);
                        ulVar.O.H(null, ulVar.f29724r0, true);
                        ulVar.f29729v0 = true;
                        ulVar.f0();
                        return;
                    default:
                        this.f25315b.f29723r.M(null, null);
                        return;
                }
            }
        });
        u0Var.setDelegate(new fl(this, 0));
        ImageView imageView = new ImageView(context);
        this.f29718n = imageView;
        org.telegram.ui.Cells.z i03 = org.telegram.ui.ActionBar.g6.i0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.g6.w0(i12, this.f27670a), org.telegram.ui.ActionBar.g6.w0(i13, this.f27670a));
        w7.c6.a(imageView);
        imageView.setTranslationZ(AndroidUtilities.dp(2.0f));
        imageView.setOutlineProvider(a2Var);
        imageView.setBackground(i03);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int w04 = org.telegram.ui.ActionBar.g6.w0(i14, this.f27670a);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w04, mode));
        imageView.setTag(Integer.valueOf(i14));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        xVar.addView(imageView, w7.a6.a(40.0f, 0.0f, 0.0f, 12.0f, 12.0f, 40, 85));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ul f25315b;

            {
                this.f25315b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        ul.T(this.f25315b);
                        return;
                    case 1:
                        ul ulVar = this.f25315b;
                        ulVar.g0(false);
                        ulVar.O.H(null, ulVar.f29724r0, true);
                        ulVar.f29729v0 = true;
                        ulVar.f0();
                        return;
                    default:
                        this.f25315b.f29723r.M(null, null);
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
        addView(linearLayout, w7.a6.d(-1.0f, -1));
        linearLayout.setOnTouchListener(new ci.d(15));
        ImageView imageView2 = new ImageView(context);
        this.f29730w = imageView2;
        imageView2.setImageResource(R.drawable.location_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.W5, this.f27670a), mode));
        linearLayout.addView(imageView2, w7.a6.n(-2, -2));
        TextView textView = new TextView(context);
        this.f29732x = textView;
        int i15 = org.telegram.ui.ActionBar.g6.X5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i15, this.f27670a));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 17.0f);
        textView.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView i16 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.a6.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.f29734y = i16;
        i16.setTextColor(org.telegram.ui.ActionBar.g6.w0(i15, this.f27670a));
        i16.setGravity(17);
        i16.setTextSize(1, 15.0f);
        i16.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(i16, w7.a6.t(-2, -2, 17, 0, 6, 0, 0));
        bi.o0 o0Var = new bi.o0(this, context, c6Var, 13);
        this.P = o0Var;
        this.f27672c = o0Var;
        this.d = o0Var;
        this.f27673f = true;
        o0Var.setClipToPadding(false);
        hg.s0 s0Var2 = new hg.s0(context, this.f29735y0, p12, true, c6Var, this.f27671b.O, false, false);
        this.O = s0Var2;
        o0Var.setAdapter(s0Var2);
        vi viVar3 = this.f27671b;
        if (viVar3 != null && (viVar3.H || viVar3.P)) {
            z12 = true;
        } else {
            z12 = false;
        }
        s0Var2.f10735f0 = z12;
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(es.h);
        kVar.C = false;
        kVar.f44872m = false;
        o0Var.setItemAnimator(kVar);
        s0Var2.O(this.f29706a0, this.W);
        o0Var.setVerticalScrollBarEnabled(false);
        o0Var.p1();
        ig.e0 e0Var = new ig.e0(this, o0Var);
        this.T = e0Var;
        o0Var.setLayoutManager(e0Var);
        addView(o0Var, w7.a6.e(-1, -1, 51));
        o0Var.setOnScrollListener(new nl(this));
        o0Var.setOnItemClickListener(new am0(this) {
            public final ul f25698b;

            {
                this.f25698b = this;
            }

            @Override
            public final void a(int i17, View view2) {
                switch (r4) {
                    case 0:
                        ul.Q(this.f25698b, foVar, c6Var, i17);
                        return;
                    default:
                        ul.R(this.f25698b, foVar, c6Var, i17);
                        return;
                }
            }
        });
        fl flVar = new fl(this, 1);
        s0Var2.H = p12;
        s0Var2.f10513y = flVar;
        s0Var2.P(AndroidUtilities.dp(16.0f) + this.f29736z0);
        addView(xVar, w7.a6.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.I = onCreateMapView;
        onCreateMapView.setOnDispatchTouchEventInterceptor(new fl(this, 2));
        this.I.setOnInterceptTouchEventInterceptor(new fl(this, 3));
        new Thread(new jl(this, this.I, 1)).start();
        ImageView imageView3 = new ImageView(context);
        this.S = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        xVar.addView(imageView3, w7.a6.e(28, 48, 49));
        mm0 mm0Var = new mm0(context, c6Var);
        this.Q = mm0Var;
        mm0Var.setSections(true);
        mm0Var.setClipToPadding(false);
        mm0Var.setVisibility(8);
        mm0Var.setLayoutManager(new s4.b0(1, false));
        ol olVar2 = new ol(this, context, c6Var, this.f27671b.O);
        this.R = olVar2;
        boolean z13 = this.f29706a0;
        if (olVar2.M != z13) {
            olVar2.M = z13;
        }
        fl flVar2 = new fl(this, 7);
        olVar2.H = 0L;
        olVar2.f10513y = flVar2;
        mm0Var.setItemAnimator(null);
        addView(mm0Var, w7.a6.e(-1, -1, 51));
        mm0Var.setOnScrollListener(new ah.d0(this, 22));
        mm0Var.setOnItemClickListener(new am0(this) {
            public final ul f25698b;

            {
                this.f25698b = this;
            }

            @Override
            public final void a(int i17, View view2) {
                switch (r4) {
                    case 0:
                        ul.Q(this.f25698b, foVar, c6Var, i17);
                        return;
                    default:
                        ul.R(this.f25698b, foVar, c6Var, i17);
                        return;
                }
            }
        });
        i0();
    }

    public static void N(ul ulVar, IMapsProvider.IMap iMap) {
        PackageManager packageManager;
        ulVar.H = iMap;
        iMap.setOnMapLoadedCallback(new el(ulVar, 3));
        if (org.telegram.ui.ActionBar.g6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, ulVar.f27670a)) < 0.721f) {
            ulVar.U = true;
            ulVar.H.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
        }
        if (ulVar.H != null) {
            Location location = new Location("network");
            ulVar.f29724r0 = location;
            location.setLatitude(20.659322d);
            ulVar.f29724r0.setLongitude(-11.40625d);
            try {
                ulVar.H.setMyLocationEnabled(true);
            } catch (Exception e) {
                FileLog.e(e);
            }
            ulVar.H.getUiSettings().setMyLocationButtonEnabled(false);
            ulVar.H.getUiSettings().setZoomControlsEnabled(false);
            ulVar.H.getUiSettings().setCompassEnabled(false);
            ulVar.H.setOnCameraMoveStartedListener(new fl(ulVar, 4));
            ulVar.H.setOnCameraIdleListener(new el(ulVar, 5));
            ulVar.H.setOnMyLocationChangeListener(new ll(ulVar, 1));
            ulVar.H.setOnMarkerClickListener(new fl(ulVar, 5));
            ulVar.H.setOnCameraMoveListener(new el(ulVar, 6));
            ulVar.c0();
            AndroidUtilities.runOnUIThread(new el(ulVar, 7), 200L);
            if (ulVar.V && ulVar.getParentActivity() != null) {
                ulVar.V = false;
                Activity parentActivity = ulVar.getParentActivity();
                if (parentActivity == null || (packageManager = parentActivity.getPackageManager()) == null || packageManager.hasSystemFeature("android.hardware.location.gps")) {
                    try {
                        if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ulVar.getParentActivity(), 0, ulVar.f27670a);
                            alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.L5, ulVar.f27670a), null);
                            alertDialog$Builder.f19548a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                            alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new fl(ulVar, 6));
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
            ulVar.h0();
        }
    }

    public static void O(ul ulVar, org.telegram.ui.fo foVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.c6 c6Var, Long l4) {
        if (foVar != null && foVar.c()) {
            g5.L(ulVar.getParentActivity(), foVar.a(), new androidx.car.app.utils.a(ulVar, tL_messageMediaGeo, l4, 26), c6Var);
            return;
        }
        ulVar.f29733x0.b(tL_messageMediaGeo, ulVar.f29735y0, true, 0, l4.longValue());
        ulVar.f27671b.dismiss(true);
    }

    public static void P(ul ulVar) {
        hg.s0 s0Var = ulVar.O;
        vi viVar = ulVar.f27671b;
        if (ulVar.f29715j0) {
            int i10 = Build.VERSION.SDK_INT;
            Activity parentActivity = ulVar.getParentActivity();
            if (parentActivity != null) {
                ulVar.f29715j0 = false;
                if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    String[] strArr = (!viVar.O || viVar.f30067z2 == null || i10 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
                    ulVar.W = true;
                    if (s0Var != null) {
                        s0Var.O(ulVar.f29706a0, true);
                    }
                    parentActivity.requestPermissions(strArr, 2);
                } else if (i10 >= 29 && viVar.O && viVar.f30067z2 != null && parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") != 0) {
                    ulVar.W = true;
                    if (s0Var != null) {
                        s0Var.O(ulVar.f29706a0, true);
                    }
                    parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
                }
            }
        }
    }

    public static void Q(ul ulVar, org.telegram.ui.fo foVar, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        ul ulVar2;
        org.telegram.ui.fo foVar2;
        org.telegram.ui.ActionBar.c6 c6Var2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j10 = ulVar.f29708c0;
        hg.s0 s0Var = ulVar.O;
        vi viVar = ulVar.f27671b;
        int i11 = ulVar.f29735y0;
        if (i11 == 7) {
            if (i10 == 1 && (tL_messageMediaVenue2 = s0Var.f10733d0) != null) {
                ulVar.f29733x0.b(tL_messageMediaVenue2, i11, true, 0, 0L);
                viVar.dismiss(true);
                return;
            } else if (i10 == 2 && (tL_messageMediaVenue = s0Var.f10734e0) != null) {
                ulVar.f29733x0.b(tL_messageMediaVenue, i11, true, 0, 0L);
                viVar.dismiss(true);
                return;
            } else {
                ulVar2 = ulVar;
                foVar2 = foVar;
                c6Var2 = c6Var;
            }
        } else if (i10 == 1) {
            if (ulVar.f29733x0 != null && ulVar.f29724r0 != null) {
                FrameLayout frameLayout = ulVar.f29714i0;
                if (frameLayout != null) {
                    frameLayout.callOnClick();
                    return;
                }
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(ulVar.f29724r0.getLatitude());
                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(ulVar.f29724r0.getLongitude());
                g5.Z(viVar.M1, viVar.l1() + 1, viVar.p1(), new bi.u3(ulVar, foVar, tL_messageMediaGeo, c6Var, 6));
                return;
            } else if (ulVar.f29706a0) {
                g5.C(ulVar.getParentActivity()).show();
                return;
            } else {
                return;
            }
        } else {
            ulVar2 = ulVar;
            foVar2 = foVar;
            c6Var2 = c6Var;
            if (i10 == 2 && i11 == 1) {
                if (ulVar2.getLocationController().isSharingLocation(j10)) {
                    ulVar2.getLocationController().removeSharingLocation(j10);
                    viVar.dismiss(true);
                    return;
                } else if (ulVar2.f29722q0 == null && ulVar2.f29706a0) {
                    g5.C(ulVar2.getParentActivity()).show();
                    return;
                } else {
                    ulVar2.b0();
                    return;
                }
            }
        }
        Object J = s0Var.J(i10);
        if (J instanceof TLRPC.TL_messageMediaVenue) {
            g5.Z(viVar.M1, viVar.l1() + 1, viVar.p1(), new bi.u3(ulVar2, foVar2, (TLRPC.TL_messageMediaVenue) J, c6Var2, 7));
        }
    }

    public static void R(ul ulVar, org.telegram.ui.fo foVar, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        TLRPC.TL_messageMediaVenue I = ulVar.R.I(i10);
        if (I != null && ulVar.f29733x0 != null) {
            if (foVar != null && foVar.c()) {
                g5.L(ulVar.getParentActivity(), foVar.a(), new kl(ulVar, I, 0), c6Var);
                return;
            }
            ulVar.f29733x0.b(I, ulVar.f29735y0, true, 0, 0L);
            ulVar.f27671b.dismiss(true);
        }
    }

    public static void S(ul ulVar, org.telegram.ui.fo foVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.c6 c6Var) {
        if (foVar != null && foVar.c()) {
            g5.L(ulVar.getParentActivity(), foVar.a(), new kl(ulVar, tL_messageMediaVenue, 1), c6Var);
            return;
        }
        ulVar.f29733x0.b(tL_messageMediaVenue, ulVar.f29735y0, true, 0, 0L);
        ulVar.f27671b.dismiss(true);
    }

    public static void T(ul ulVar) {
        hg.s0 s0Var = ulVar.O;
        ImageView imageView = ulVar.f29718n;
        Activity parentActivity = ulVar.getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            g5.C(ulVar.getParentActivity()).show();
            return;
        }
        if (ulVar.f29722q0 != null && ulVar.H != null) {
            int i10 = org.telegram.ui.ActionBar.g6.vi;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i10, ulVar.f27670a), PorterDuff.Mode.MULTIPLY));
            imageView.setTag(Integer.valueOf(i10));
            s0Var.L(null);
            ulVar.f29728u0 = false;
            ulVar.g0(false);
            ulVar.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(ulVar.f29722q0.getLatitude(), ulVar.f29722q0.getLongitude())));
            if (ulVar.f29729v0) {
                Location location = ulVar.f29722q0;
                if (location != null && ulVar.f29735y0 != 8) {
                    s0Var.H(null, location, true);
                }
                ulVar.f29729v0 = false;
                ulVar.f0();
            }
        }
        if (ulVar.f29712g0 != null) {
            ulVar.S.setVisibility(0);
            rl rlVar = ulVar.F;
            IMapsProvider.IMarker iMarker = ulVar.f29712g0;
            HashMap hashMap = rlVar.f28863a;
            View view = (View) hashMap.get(iMarker);
            if (view != null) {
                rlVar.removeView(view);
                hashMap.remove(iMarker);
            }
            ulVar.f29712g0 = null;
            ulVar.f29713h0 = null;
            ulVar.f29714i0 = null;
        }
    }

    public static void U(ul ulVar, Location location) {
        int i10;
        vi viVar = ulVar.f27671b;
        if (viVar != null && viVar.f30001f0 != null) {
            ulVar.d0(location);
            hg.s0 s0Var = ulVar.O;
            if (s0Var != null && (((i10 = ulVar.f29735y0) == 7 || i10 == 8) && !ulVar.f29728u0)) {
                s0Var.L(ulVar.f29724r0);
            }
            ulVar.getLocationController().setMapLocation(location, ulVar.f29707b0);
            ulVar.f29707b0 = false;
        }
    }

    public static void V(ul ulVar, IMapsProvider.IMapView iMapView) {
        if (ulVar.I != null && ulVar.getParentActivity() != null) {
            try {
                iMapView.onCreate(null);
                ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                ulVar.I.getMapAsync(new ll(ulVar, 0));
                ulVar.f29720o0 = true;
                if (ulVar.f29721p0) {
                    ulVar.I.onResume();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void W(ul ulVar) {
        if (ulVar.getParentActivity() != null) {
            try {
                ulVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
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
        return this.f27671b.f30001f0.getLocationController();
    }

    private MessagesController getMessagesController() {
        return this.f27671b.f30001f0.getMessagesController();
    }

    public Activity getParentActivity() {
        org.telegram.ui.ActionBar.m2 m2Var;
        vi viVar = this.f27671b;
        if (viVar != null && (m2Var = viVar.f30001f0) != null) {
            return m2Var.getParentActivity();
        }
        return null;
    }

    private UserConfig getUserConfig() {
        return this.f27671b.f30001f0.getUserConfig();
    }

    @Override
    public final void A() {
        IMapsProvider.IMapView iMapView = this.I;
        if (iMapView != null && this.f29720o0) {
            try {
                iMapView.onPause();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        this.f29721p0 = false;
    }

    @Override
    public final void B(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ul.B(int, int):void");
    }

    @Override
    public final void D() {
        IMapsProvider.IMapView iMapView = this.I;
        if (iMapView != null && this.f29720o0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.f29721p0 = true;
    }

    @Override
    public final void G(ni niVar) {
        long j10;
        vi viVar = this.f27671b;
        viVar.f29985a1.setTitle(LocaleController.getString(R.string.ShareLocation));
        if (this.I.getView().getParent() == null) {
            View view = this.I.getView();
            FrameLayout.LayoutParams e = w7.a6.e(-1, AndroidUtilities.dp(10.0f) + this.f29736z0, 51);
            ah.x xVar = this.N;
            xVar.addView(view, 0, e);
            xVar.addView(this.F, 1, w7.a6.e(-1, AndroidUtilities.dp(10.0f) + this.f29736z0, 51));
            xVar.addView(this.M, 2, w7.a6.d(-1.0f, -1));
        }
        this.E.setVisibility(0);
        IMapsProvider.IMapView iMapView = this.I;
        if (iMapView != null && this.f29720o0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.f29721p0 = true;
        IMapsProvider.IMap iMap = this.H;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        Z();
        boolean x10 = viVar.f29993c2.x();
        el elVar = new el(this, 1);
        if (x10) {
            j10 = 200;
        } else {
            j10 = 0;
        }
        AndroidUtilities.runOnUIThread(elVar, j10);
        this.T.h1(0, 0);
        h0();
    }

    @Override
    public final void J() {
        this.P.x0(0);
    }

    @Override
    public final boolean L() {
        return !this.f29706a0;
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
            int i12 = this.f29735y0;
            if (i12 == 1 || i12 == 7 || i12 == 8) {
                dp += AndroidUtilities.dp(66.0f);
            }
            int dp2 = (i11 - dp) - AndroidUtilities.dp(90.0f);
            int dp3 = AndroidUtilities.dp(189.0f);
            this.f29736z0 = dp3;
            if (!this.f29706a0 || !a0()) {
                dp2 = Math.min(AndroidUtilities.dp(310.0f), dp2);
            }
            this.A0 = Math.max(dp3, dp2);
            if (this.f29706a0 && a0()) {
                this.f29736z0 = this.A0;
            }
            bi.o0 o0Var = this.P;
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) o0Var.getLayoutParams();
            layoutParams2.topMargin = currentActionBarHeight;
            o0Var.setLayoutParams(layoutParams2);
            ah.x xVar = this.N;
            FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) xVar.getLayoutParams();
            layoutParams3.topMargin = currentActionBarHeight;
            layoutParams3.height = this.A0;
            xVar.setLayoutParams(layoutParams3);
            mm0 mm0Var = this.Q;
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) mm0Var.getLayoutParams();
            layoutParams4.topMargin = currentActionBarHeight;
            mm0Var.setLayoutParams(layoutParams4);
            if (this.f29706a0 && a0()) {
                i10 = this.f29736z0 - o0Var.getPaddingTop();
            } else {
                i10 = this.f29736z0;
            }
            int dp4 = AndroidUtilities.dp(16.0f) + i10;
            hg.s0 s0Var = this.O;
            s0Var.P(dp4);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.I.getView().getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.height = AndroidUtilities.dp(10.0f) + this.A0;
                this.I.getView().setLayoutParams(layoutParams5);
            }
            rl rlVar = this.F;
            if (rlVar != null && (layoutParams = (FrameLayout.LayoutParams) rlVar.getLayoutParams()) != null) {
                layoutParams.height = AndroidUtilities.dp(10.0f) + this.A0;
                rlVar.setLayoutParams(layoutParams);
            }
            s0Var.l();
            h0();
        }
    }

    public final boolean a0() {
        int i10 = this.f29735y0;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final void b0() {
        TLRPC.User user;
        Activity parentActivity;
        if (this.f29733x0 != null && getParentActivity() != null && this.f29722q0 != null) {
            boolean z10 = this.f29716k0;
            org.telegram.ui.ActionBar.c6 c6Var = this.f27670a;
            if (z10 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
                this.f29716k0 = false;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                    globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                    g5.k(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new el(this, 2), c6Var).o();
                    return;
                }
            }
            long j10 = this.f29708c0;
            if (DialogObject.isUserDialog(j10)) {
                user = this.f27671b.f30001f0.getMessagesController().getUser(Long.valueOf(j10));
            } else {
                user = null;
            }
            g5.D(getParentActivity(), false, user, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i10) {
                    ul ulVar = ul.this;
                    vi viVar = ulVar.f27671b;
                    g5.Z(viVar.M1, viVar.l1() + 1, viVar.p1(), new di.k4(ulVar, i10, 4));
                }
            }, c6Var).show();
        }
    }

    public final void c0() {
        ul ulVar;
        vi viVar = this.f27671b;
        if (viVar.O) {
            if (viVar.A2 != null) {
                AndroidUtilities.runOnUIThread(new el(this, 0));
                return;
            } else if (!this.f29706a0) {
                File file = viVar.f30067z2;
                boolean z10 = viVar.f30064y2;
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
                        ulVar = this;
                        ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                        float[] fArr = new float[2];
                        if (exifInterface.getLatLong(fArr)) {
                            AndroidUtilities.runOnUIThread(new sk(2, this, fArr));
                            return;
                        }
                        Location lastLocation = getLastLocation();
                        ulVar.f29722q0 = lastLocation;
                        d0(lastLocation);
                        return;
                    }
                }
                ulVar = this;
                Location lastLocation2 = getLastLocation();
                ulVar.f29722q0 = lastLocation2;
                d0(lastLocation2);
                return;
            } else {
                AndroidUtilities.runOnUIThread(new el(this, 8));
                return;
            }
        }
        Location lastLocation3 = getLastLocation();
        this.f29722q0 = lastLocation3;
        d0(lastLocation3);
    }

    public final void d0(Location location) {
        if (location != null) {
            Location location2 = new Location(location);
            this.f29722q0 = location2;
            IMapsProvider.IMap iMap = this.H;
            hg.s0 s0Var = this.O;
            if (iMap != null) {
                IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
                if (s0Var != null) {
                    if (!this.f29729v0 && this.f29735y0 != 8) {
                        s0Var.H(null, this.f29722q0, true);
                    }
                    s0Var.M(this.f29722q0);
                }
                if (!this.f29728u0) {
                    this.f29724r0 = new Location(location);
                    if (this.f29731w0) {
                        this.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                        return;
                    }
                    this.f29731w0 = true;
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
        ol olVar = this.R;
        hg.s0 s0Var = this.O;
        int i13 = 0;
        if (i10 == i12) {
            this.f29706a0 = false;
            this.W = false;
            c0();
            if (s0Var != null) {
                s0Var.O(this.f29706a0, this.W);
            }
            if (olVar != null && olVar.M != (z11 = this.f29706a0)) {
                olVar.M = z11;
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
            this.f29706a0 = true;
            this.W = false;
            if (s0Var != null) {
                s0Var.O(true, false);
            }
            if (olVar != null && olVar.M != (z10 = this.f29706a0)) {
                olVar.M = z10;
            }
        }
        Z();
        boolean z12 = this.f29706a0;
        vi viVar = this.f27671b;
        if (z12 && !viVar.O) {
            i13 = 8;
        } else {
            viVar.getClass();
        }
        this.E.setVisibility(i13);
    }

    public final void e0(double d, double d10) {
        IMapsProvider.ICameraUpdate newCameraUpdateLatLngZoom;
        if (this.H != null) {
            int i10 = (d > 0.0d ? 1 : (d == 0.0d ? 0 : -1));
            if (i10 != 0 && d10 != 0.0d) {
                Location location = new Location("");
                this.f29724r0 = location;
                location.reset();
                this.f29724r0.setLatitude(d);
                this.f29724r0.setLongitude(d10);
            } else {
                Location location2 = new Location("");
                this.f29722q0 = location2;
                location2.reset();
                this.f29722q0.setLatitude(d);
                this.f29722q0.setLongitude(d10);
            }
            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(d, d10);
            if (i10 != 0 && d10 != 0.0d) {
                newCameraUpdateLatLngZoom = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.H.getMaxZoomLevel() - 4.0f);
            } else {
                newCameraUpdateLatLngZoom = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.H.getMinZoomLevel());
            }
            this.J = newCameraUpdateLatLngZoom;
            this.H.moveCamera(newCameraUpdateLatLngZoom);
            hg.s0 s0Var = this.O;
            if (i10 != 0 && d10 != 0.0d) {
                s0Var.L(this.f29724r0);
            } else {
                s0Var.M(this.f29722q0);
            }
            s0Var.I();
            this.P.v0(0, 1, null);
            this.f29727t0 = true;
            if (i10 != 0 && d10 != 0.0d) {
                this.f29728u0 = true;
                g0(false);
                if (this.f29735y0 != 8) {
                    s0Var.H(null, this.f29724r0, true);
                }
                this.f29729v0 = true;
                f0();
            }
        }
    }

    public final void f0() {
        if (this.O.h() != 0 && this.T.L0() == 0) {
            bi.o0 o0Var = this.P;
            View childAt = o0Var.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top >= 0 && top <= AndroidUtilities.dp(258.0f)) {
                o0Var.v0(0, top, null);
            }
        }
    }

    public final void g0(boolean z10) {
        int i10;
        Integer num;
        float f7;
        Location location;
        Location location2;
        if (this.f29706a0) {
            z10 = false;
        }
        sl slVar = this.f29725s;
        if (z10 && slVar != null && slVar.getTag() == null && ((location = this.f29722q0) == null || (location2 = this.f29724r0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        if (this.f29735y0 == 8) {
            z10 = false;
        }
        if (slVar != null) {
            if (!z10 || slVar.getTag() == null) {
                if (z10 || slVar.getTag() != null) {
                    if (z10) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    slVar.setVisibility(i10);
                    if (z10) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    slVar.setTag(num);
                    AnimatorSet animatorSet = new AnimatorSet();
                    if (z10) {
                        f7 = 0.0f;
                    } else {
                        f7 = -AndroidUtilities.dp(80.0f);
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(slVar, View.TRANSLATION_X, f7));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(es.f24772g);
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
        bi.o0 o0Var = this.P;
        if (o0Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        int i10 = 0;
        wl0 wl0Var = (wl0) o0Var.K(0);
        if (wl0Var != null) {
            i10 = Math.max(((int) wl0Var.f44838a.getY()) - this.C0, 0);
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
    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        EditTextBoldCursor editTextBoldCursor;
        ArrayList<org.telegram.ui.ActionBar.i6> arrayList = new ArrayList<>();
        b7 b7Var = new b7(this, 2);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19972h5));
        int i10 = org.telegram.ui.ActionBar.g6.A5;
        bi.o0 o0Var = this.P;
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 32768, null, null, null, null, i10));
        org.telegram.ui.ActionBar.u0 u0Var = this.E;
        if (u0Var != null) {
            editTextBoldCursor = u0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursor, 16777216, null, null, null, null, org.telegram.ui.ActionBar.g6.f20007j5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19990i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f20022k0, null, null, org.telegram.ui.ActionBar.g6.f19902d7));
        int i11 = org.telegram.ui.ActionBar.g6.W5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f29730w, 8, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f29732x, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f29734y, 4, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.ui;
        ImageView imageView = this.f29718n;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 262152, null, null, null, null, i13));
        int i14 = org.telegram.ui.ActionBar.g6.vi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 262152, null, null, null, null, i14));
        int i15 = org.telegram.ui.ActionBar.g6.wi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 32, null, null, null, null, i15));
        int i16 = org.telegram.ui.ActionBar.g6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 65568, null, null, null, null, i16));
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f29723r;
        arrayList.add(new org.telegram.ui.ActionBar.i6(u0Var2, 0, null, null, null, b7Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(u0Var2, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(u0Var2, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f29725s, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f29725s, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f29725s, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, org.telegram.ui.ActionBar.g6.f20152r0, b7Var, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f20189si));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 393216, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20096ni));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 393216, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20150qi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 393248, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20076mi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 393248, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20131pi));
        int i17 = org.telegram.ui.ActionBar.g6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"accurateTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 262144, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20170ri));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 262144, new Class[]{org.telegram.ui.Cells.u6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20114oi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"buttonTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 131072, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 196608, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 32, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19863b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 48, new Class[]{org.telegram.ui.Cells.b7.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19843a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f20083n5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
        mm0 mm0Var = this.Q;
        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 32, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(mm0Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.w7.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.w7.class}, new String[]{"distanceTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19973h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 8, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.x4.class}, new String[]{"textView2"}, null, null, -1, null, i12));
        return arrayList;
    }

    public final void h0() {
        ah.x xVar;
        int i10;
        int i11;
        IMapsProvider.LatLng latLng;
        Location location;
        IMapsProvider.IMap iMap;
        if (this.I != null && (xVar = this.N) != null) {
            bi.o0 o0Var = this.P;
            s4.b1 K = o0Var.K(0);
            if (K != null) {
                i10 = (int) K.f44838a.getY();
                i11 = Math.min(i10, 0) + this.f29736z0;
            } else {
                i10 = -xVar.getMeasuredHeight();
                i11 = 0;
            }
            if (((FrameLayout.LayoutParams) xVar.getLayoutParams()) != null) {
                rl rlVar = this.F;
                if (i11 <= 0) {
                    if (this.I.getView().getVisibility() == 0) {
                        this.I.getView().setVisibility(4);
                        xVar.setVisibility(4);
                        if (rlVar != null) {
                            rlVar.setVisibility(4);
                        }
                    }
                    this.I.getView().setTranslationY(i10);
                    return;
                }
                if (this.I.getView().getVisibility() == 4) {
                    this.I.getView().setVisibility(0);
                    xVar.setVisibility(0);
                    if (rlVar != null) {
                        rlVar.setVisibility(0);
                    }
                }
                int max = Math.max(0, (-((i10 - this.A0) + this.f29736z0)) / 2);
                int i12 = this.A0 - this.f29736z0;
                float max2 = 1.0f - Math.max(0.0f, Math.min(1.0f, (o0Var.getPaddingTop() - i10) / (o0Var.getPaddingTop() - i12)));
                int i13 = this.B0;
                if (this.f29706a0 && a0()) {
                    i12 += Math.min(i10, o0Var.getPaddingTop());
                }
                this.B0 = (int) (i12 * max2);
                float f7 = max;
                this.I.getView().setTranslationY(f7);
                this.C0 = i12 - this.B0;
                xVar.invalidate();
                xVar.setTranslationY(i10 - this.C0);
                IMapsProvider.IMap iMap2 = this.H;
                if (iMap2 != null) {
                    iMap2.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f) + this.B0);
                }
                if (rlVar != null) {
                    rlVar.setTranslationY(f7);
                }
                int max3 = Math.max(this.C0 - i10, 0);
                int i14 = this.A0;
                org.telegram.ui.ActionBar.u0 u0Var = this.f29723r;
                float min = Math.min(max3, (i14 - u0Var.getMeasuredHeight()) - AndroidUtilities.dp(80.0f));
                u0Var.setTranslationY(min);
                sl slVar = this.f29725s;
                slVar.f29154c = min;
                slVar.setTranslationY(min + slVar.f29153b);
                this.f29718n.setTranslationY(-this.B0);
                int b10 = org.telegram.ui.Cells.d0.b(48.0f, (this.A0 - this.B0) / 2, max);
                this.f29726s0 = b10;
                this.S.setTranslationY(b10);
                if (i13 != this.B0) {
                    IMapsProvider.IMarker iMarker = this.f29712g0;
                    if (iMarker != null) {
                        latLng = new IMapsProvider.LatLng(iMarker.getPosition().latitude, this.f29712g0.getPosition().longitude);
                    } else if (this.f29728u0 && (location = this.f29724r0) != null) {
                        latLng = new IMapsProvider.LatLng(location.getLatitude(), this.f29724r0.getLongitude());
                    } else {
                        Location location2 = this.f29722q0;
                        if (location2 != null) {
                            latLng = new IMapsProvider.LatLng(location2.getLatitude(), this.f29722q0.getLongitude());
                        } else {
                            latLng = null;
                        }
                    }
                    if (latLng != null && (iMap = this.H) != null) {
                        iMap.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                    }
                }
                if (this.f29706a0 && a0()) {
                    int h = this.O.h();
                    for (int i15 = 1; i15 < h; i15++) {
                        s4.b1 K2 = o0Var.K(i15);
                        if (K2 != null) {
                            K2.f44838a.setTranslationY(o0Var.getPaddingTop() - i10);
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
        boolean z10 = this.f29717l0;
        LinearLayout linearLayout = this.v;
        if (z10) {
            boolean z11 = this.f29719n0;
            mm0 mm0Var = this.Q;
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
    public final void o() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionDenied);
        this.G = true;
        ah.x xVar = this.N;
        if (xVar != null) {
            xVar.invalidate();
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
        hg.s0 s0Var = this.O;
        if (s0Var != null) {
            s0Var.F();
        }
        ol olVar = this.R;
        if (olVar != null) {
            olVar.F();
        }
        vi viVar = this.f27671b;
        viVar.f29985a1.h(true);
        viVar.f29985a1.n().removeView(this.E);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        if (z10) {
            Z();
        }
    }

    @Override
    public final boolean q() {
        o();
        return false;
    }

    public void setDelegate(pl plVar) {
        this.f29733x0 = plVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27671b.getSheetContainer().invalidate();
        h0();
    }

    @Override
    public final void u() {
        this.E.setVisibility(8);
    }

    @Override
    public final void y() {
        boolean z10;
        vi viVar = this.f27671b;
        if (viVar != null && !viVar.isKeyboardVisible()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.O.f10732c0 = z10;
    }

    @Override
    public final void z(int i10, boolean z10) {
        if (z10) {
            this.O.f10732c0 = false;
        }
    }
}
