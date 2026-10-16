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
public final class tl extends ni implements NotificationCenter.NotificationCenterDelegate {
    public static final int E0 = 0;
    public int A0;
    public int B0;
    public int C0;
    public final Bitmap[] D0;
    public final org.telegram.ui.ActionBar.u0 E;
    public final ql F;
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
    public final nl R;
    public final ImageView S;
    public final ig.e0 T;
    public boolean U;
    public boolean V;
    public boolean W;
    public boolean f29092a0;
    public boolean f29093b0;
    public final long f29094c0;
    public final Paint f29095d0;
    public final ArrayList f29096e0;
    public AnimatorSet f29097f0;
    public IMapsProvider.IMarker f29098g0;
    public sl f29099h0;
    public FrameLayout f29100i0;
    public boolean f29101j0;
    public boolean f29102k0;
    public boolean f29103l0;
    public boolean m0;
    public final ImageView f29104n;
    public boolean f29105n0;
    public boolean f29106o0;
    public boolean f29107p0;
    public Location f29108q0;
    public final org.telegram.ui.ActionBar.u0 f29109r;
    public Location f29110r0;
    public final rl f29111s;
    public int f29112s0;
    public boolean f29113t0;
    public boolean f29114u0;
    public final LinearLayout v;
    public boolean f29115v0;
    public final ImageView f29116w;
    public boolean f29117w0;
    public final TextView f29118x;
    public ol f29119x0;
    public final TextView f29120y;
    public final int f29121y0;
    public int f29122z0;

    public tl(vi viVar, Context context, final org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        super(context, c6Var, viVar);
        final org.telegram.ui.fo foVar;
        boolean z11;
        int i10;
        boolean z12;
        this.V = true;
        this.W = false;
        this.f29092a0 = false;
        this.f29093b0 = true;
        this.f29095d0 = new Paint();
        this.f29096e0 = new ArrayList();
        this.f29101j0 = true;
        this.f29102k0 = true;
        int currentActionBarHeight = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.f29122z0 = currentActionBarHeight;
        this.A0 = currentActionBarHeight;
        this.D0 = new Bitmap[7];
        AndroidUtilities.fixGoogleMapsBug();
        vi viVar2 = this.f27360b;
        org.telegram.ui.ActionBar.m2 m2Var = viVar2.f29672f0;
        if (m2Var instanceof org.telegram.ui.fo) {
            foVar = (org.telegram.ui.fo) m2Var;
        } else {
            foVar = null;
        }
        long p12 = viVar2.p1();
        this.f29094c0 = p12;
        if (this.f27360b.O) {
            this.f29121y0 = 7;
        } else if (z10 && foVar != null && foVar.h == null && !foVar.c() && !UserObject.isUserSelf(foVar.i())) {
            this.f29121y0 = 1;
        } else {
            this.f29121y0 = 0;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        this.m0 = false;
        this.f29103l0 = false;
        this.f29105n0 = false;
        hg.s0 s0Var = this.O;
        if (s0Var != null) {
            s0Var.F();
        }
        nl nlVar = this.R;
        if (nlVar != null) {
            nlVar.F();
        }
        if (getParentActivity() != null && getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f29092a0 = z11;
        org.telegram.ui.ActionBar.y n10 = this.f27360b.f29656a1.n();
        this.F = new ql(this, context);
        org.telegram.ui.ActionBar.u0 a2 = n10.a(0, R.drawable.outline_header_search);
        a2.F();
        a2.H = new ig.d2(this, 6);
        this.E = a2;
        if (this.f29092a0 && !this.f27360b.O) {
            i10 = 8;
        } else {
            this.f27360b.getClass();
            i10 = 0;
        }
        a2.setVisibility(i10);
        a2.setSearchFieldHint(LocaleController.getString(R.string.Search));
        a2.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = a2.getSearchField();
        int i11 = org.telegram.ui.ActionBar.g6.f19707j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.g6.w0(i11, this.f27359a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.g6.w0(i11, this.f27359a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.Vd, this.f27359a));
        new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f)).gravity = 83;
        ah.x xVar = new ah.x(this, context, 10);
        this.N = xVar;
        xVar.setWillNotDraw(false);
        View view = new View(context);
        this.M = view;
        view.setBackgroundDrawable(new gd(org.telegram.ui.ActionBar.g6.B0().q()));
        rl rlVar = new rl(context, 0);
        this.f29111s = rlVar;
        rlVar.setTranslationX(-AndroidUtilities.dp(80.0f));
        rlVar.setVisibility(4);
        int dp = AndroidUtilities.dp(40.0f);
        int i12 = org.telegram.ui.ActionBar.g6.wi;
        int w02 = org.telegram.ui.ActionBar.g6.w0(i12, this.f27359a);
        int i13 = org.telegram.ui.ActionBar.g6.xi;
        int w03 = org.telegram.ui.ActionBar.g6.w0(i13, this.f27359a);
        org.telegram.ui.Cells.z j02 = org.telegram.ui.ActionBar.g6.j0(dp, dp, dp, dp, w02, w03, w03);
        w7.b6.a(rlVar);
        rlVar.setTranslationZ(AndroidUtilities.dp(2.0f));
        bi.a2 a2Var = zf.j0.f50192a;
        rlVar.setOutlineProvider(a2Var);
        rlVar.setBackground(j02);
        int i14 = org.telegram.ui.ActionBar.g6.vi;
        rlVar.setTextColor(org.telegram.ui.ActionBar.g6.w0(i14, this.f27359a));
        rlVar.setTextSize(1, 14.0f);
        rlVar.setTypeface(AndroidUtilities.bold());
        rlVar.setText(LocaleController.getString(R.string.PlacesInThisArea));
        rlVar.setGravity(17);
        rlVar.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        xVar.addView(rlVar, w7.z5.a(40.0f, 80.0f, 12.0f, 80.0f, 0.0f, -2, 49));
        rlVar.setOnClickListener(new View.OnClickListener(this) {
            public final tl f24775b;

            {
                this.f24775b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        tl.T(this.f24775b);
                        return;
                    case 1:
                        tl tlVar = this.f24775b;
                        tlVar.g0(false);
                        tlVar.O.H(null, tlVar.f29110r0, true);
                        tlVar.f29115v0 = true;
                        tlVar.f0();
                        return;
                    default:
                        this.f24775b.f29109r.M(null, null);
                        return;
                }
            }
        });
        org.telegram.ui.ActionBar.u0 u0Var = new org.telegram.ui.ActionBar.u0(context, null, 0, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.ui, this.f27359a), false, c6Var);
        this.f29109r = u0Var;
        u0Var.setClickable(true);
        u0Var.setSubMenuOpenSide(2);
        u0Var.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        u0Var.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        u0Var.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), c6Var);
        u0Var.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), c6Var);
        u0Var.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), c6Var);
        u0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.Cells.z i02 = org.telegram.ui.ActionBar.g6.i0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.g6.w0(i12, this.f27359a), org.telegram.ui.ActionBar.g6.w0(i13, this.f27359a));
        w7.b6.a(u0Var);
        u0Var.setTranslationZ(AndroidUtilities.dp(2.0f));
        u0Var.setOutlineProvider(a2Var);
        u0Var.setBackground(i02);
        u0Var.setIcon(R.drawable.msg_map_type);
        xVar.addView(u0Var, w7.z5.a(40.0f, 0.0f, 12.0f, 12.0f, 0.0f, 40, 53));
        u0Var.setOnClickListener(new View.OnClickListener(this) {
            public final tl f24775b;

            {
                this.f24775b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        tl.T(this.f24775b);
                        return;
                    case 1:
                        tl tlVar = this.f24775b;
                        tlVar.g0(false);
                        tlVar.O.H(null, tlVar.f29110r0, true);
                        tlVar.f29115v0 = true;
                        tlVar.f0();
                        return;
                    default:
                        this.f24775b.f29109r.M(null, null);
                        return;
                }
            }
        });
        u0Var.setDelegate(new el(this, 0));
        ImageView imageView = new ImageView(context);
        this.f29104n = imageView;
        org.telegram.ui.Cells.z i03 = org.telegram.ui.ActionBar.g6.i0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.g6.w0(i12, this.f27359a), org.telegram.ui.ActionBar.g6.w0(i13, this.f27359a));
        w7.b6.a(imageView);
        imageView.setTranslationZ(AndroidUtilities.dp(2.0f));
        imageView.setOutlineProvider(a2Var);
        imageView.setBackground(i03);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int w04 = org.telegram.ui.ActionBar.g6.w0(i14, this.f27359a);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(w04, mode));
        imageView.setTag(Integer.valueOf(i14));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        xVar.addView(imageView, w7.z5.a(40.0f, 0.0f, 0.0f, 12.0f, 12.0f, 40, 85));
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final tl f24775b;

            {
                this.f24775b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (r2) {
                    case 0:
                        tl.T(this.f24775b);
                        return;
                    case 1:
                        tl tlVar = this.f24775b;
                        tlVar.g0(false);
                        tlVar.O.H(null, tlVar.f29110r0, true);
                        tlVar.f29115v0 = true;
                        tlVar.f0();
                        return;
                    default:
                        this.f24775b.f29109r.M(null, null);
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
        addView(linearLayout, w7.z5.d(-1.0f, -1));
        linearLayout.setOnTouchListener(new ci.d(15));
        ImageView imageView2 = new ImageView(context);
        this.f29116w = imageView2;
        imageView2.setImageResource(R.drawable.location_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.W5, this.f27359a), mode));
        linearLayout.addView(imageView2, w7.z5.n(-2, -2));
        TextView textView = new TextView(context);
        this.f29118x = textView;
        int i15 = org.telegram.ui.ActionBar.g6.X5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(i15, this.f27359a));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 17.0f);
        textView.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView i16 = com.google.android.gms.internal.play_billing.k3.i(linearLayout, textView, w7.z5.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.f29120y = i16;
        i16.setTextColor(org.telegram.ui.ActionBar.g6.w0(i15, this.f27359a));
        i16.setGravity(17);
        i16.setTextSize(1, 15.0f);
        i16.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(i16, w7.z5.t(-2, -2, 17, 0, 6, 0, 0));
        bi.o0 o0Var = new bi.o0(this, context, c6Var, 13);
        this.P = o0Var;
        this.f27361c = o0Var;
        this.d = o0Var;
        this.f27362f = true;
        o0Var.setClipToPadding(false);
        hg.s0 s0Var2 = new hg.s0(context, this.f29121y0, p12, true, c6Var, this.f27360b.O, false, false);
        this.O = s0Var2;
        o0Var.setAdapter(s0Var2);
        vi viVar3 = this.f27360b;
        if (viVar3 != null && (viVar3.H || viVar3.P)) {
            z12 = true;
        } else {
            z12 = false;
        }
        s0Var2.f10739f0 = z12;
        s4.k kVar = new s4.k();
        kVar.n(350L);
        kVar.o(es.h);
        kVar.C = false;
        kVar.f44872m = false;
        o0Var.setItemAnimator(kVar);
        s0Var2.O(this.f29092a0, this.W);
        o0Var.setVerticalScrollBarEnabled(false);
        o0Var.p1();
        ig.e0 e0Var = new ig.e0(this, o0Var);
        this.T = e0Var;
        o0Var.setLayoutManager(e0Var);
        addView(o0Var, w7.z5.e(-1, -1, 51));
        o0Var.setOnScrollListener(new ml(this));
        o0Var.setOnItemClickListener(new am0(this) {
            public final tl f25003b;

            {
                this.f25003b = this;
            }

            @Override
            public final void a(int i17, View view2) {
                switch (r4) {
                    case 0:
                        tl.Q(this.f25003b, foVar, c6Var, i17);
                        return;
                    default:
                        tl.R(this.f25003b, foVar, c6Var, i17);
                        return;
                }
            }
        });
        el elVar = new el(this, 1);
        s0Var2.H = p12;
        s0Var2.f10517y = elVar;
        s0Var2.P(AndroidUtilities.dp(16.0f) + this.f29122z0);
        addView(xVar, w7.z5.e(-1, -1, 51));
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.I = onCreateMapView;
        onCreateMapView.setOnDispatchTouchEventInterceptor(new el(this, 2));
        this.I.setOnInterceptTouchEventInterceptor(new el(this, 3));
        new Thread(new il(this, this.I, 1)).start();
        ImageView imageView3 = new ImageView(context);
        this.S = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        xVar.addView(imageView3, w7.z5.e(28, 48, 49));
        mm0 mm0Var = new mm0(context, c6Var);
        this.Q = mm0Var;
        mm0Var.setSections(true);
        mm0Var.setClipToPadding(false);
        mm0Var.setVisibility(8);
        mm0Var.setLayoutManager(new s4.b0(1, false));
        nl nlVar2 = new nl(this, context, c6Var, this.f27360b.O);
        this.R = nlVar2;
        boolean z13 = this.f29092a0;
        if (nlVar2.M != z13) {
            nlVar2.M = z13;
        }
        el elVar2 = new el(this, 7);
        nlVar2.H = 0L;
        nlVar2.f10517y = elVar2;
        mm0Var.setItemAnimator(null);
        addView(mm0Var, w7.z5.e(-1, -1, 51));
        mm0Var.setOnScrollListener(new ah.d0(this, 22));
        mm0Var.setOnItemClickListener(new am0(this) {
            public final tl f25003b;

            {
                this.f25003b = this;
            }

            @Override
            public final void a(int i17, View view2) {
                switch (r4) {
                    case 0:
                        tl.Q(this.f25003b, foVar, c6Var, i17);
                        return;
                    default:
                        tl.R(this.f25003b, foVar, c6Var, i17);
                        return;
                }
            }
        });
        i0();
    }

    public static void N(tl tlVar, IMapsProvider.IMap iMap) {
        PackageManager packageManager;
        tlVar.H = iMap;
        iMap.setOnMapLoadedCallback(new dl(tlVar, 3));
        if (org.telegram.ui.ActionBar.g6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19601d6, tlVar.f27359a)) < 0.721f) {
            tlVar.U = true;
            tlVar.H.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
        }
        if (tlVar.H != null) {
            Location location = new Location("network");
            tlVar.f29110r0 = location;
            location.setLatitude(20.659322d);
            tlVar.f29110r0.setLongitude(-11.40625d);
            try {
                tlVar.H.setMyLocationEnabled(true);
            } catch (Exception e) {
                FileLog.e(e);
            }
            tlVar.H.getUiSettings().setMyLocationButtonEnabled(false);
            tlVar.H.getUiSettings().setZoomControlsEnabled(false);
            tlVar.H.getUiSettings().setCompassEnabled(false);
            tlVar.H.setOnCameraMoveStartedListener(new el(tlVar, 4));
            tlVar.H.setOnCameraIdleListener(new dl(tlVar, 5));
            tlVar.H.setOnMyLocationChangeListener(new kl(tlVar, 1));
            tlVar.H.setOnMarkerClickListener(new el(tlVar, 5));
            tlVar.H.setOnCameraMoveListener(new dl(tlVar, 6));
            tlVar.c0();
            AndroidUtilities.runOnUIThread(new dl(tlVar, 7), 200L);
            if (tlVar.V && tlVar.getParentActivity() != null) {
                tlVar.V = false;
                Activity parentActivity = tlVar.getParentActivity();
                if (parentActivity == null || (packageManager = parentActivity.getPackageManager()) == null || packageManager.hasSystemFeature("android.hardware.location.gps")) {
                    try {
                        if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tlVar.getParentActivity(), 0, tlVar.f27359a);
                            alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.L5, tlVar.f27359a), null);
                            alertDialog$Builder.f19248a.T = LocaleController.getString(R.string.GpsDisabledAlertText);
                            alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new el(tlVar, 6));
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
            tlVar.h0();
        }
    }

    public static void O(tl tlVar, org.telegram.ui.fo foVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.c6 c6Var, Long l4) {
        if (foVar != null && foVar.c()) {
            g5.L(tlVar.getParentActivity(), foVar.a(), new androidx.car.app.utils.a(tlVar, tL_messageMediaGeo, l4, 26), c6Var);
            return;
        }
        tlVar.f29119x0.b(tL_messageMediaGeo, tlVar.f29121y0, true, 0, l4.longValue());
        tlVar.f27360b.dismiss(true);
    }

    public static void P(tl tlVar) {
        hg.s0 s0Var = tlVar.O;
        vi viVar = tlVar.f27360b;
        if (tlVar.f29101j0) {
            int i10 = Build.VERSION.SDK_INT;
            Activity parentActivity = tlVar.getParentActivity();
            if (parentActivity != null) {
                tlVar.f29101j0 = false;
                if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    String[] strArr = (!viVar.O || viVar.f29738z2 == null || i10 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
                    tlVar.W = true;
                    if (s0Var != null) {
                        s0Var.O(tlVar.f29092a0, true);
                    }
                    parentActivity.requestPermissions(strArr, 2);
                } else if (i10 >= 29 && viVar.O && viVar.f29738z2 != null && parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") != 0) {
                    tlVar.W = true;
                    if (s0Var != null) {
                        s0Var.O(tlVar.f29092a0, true);
                    }
                    parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
                }
            }
        }
    }

    public static void Q(tl tlVar, org.telegram.ui.fo foVar, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        tl tlVar2;
        org.telegram.ui.fo foVar2;
        org.telegram.ui.ActionBar.c6 c6Var2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j10 = tlVar.f29094c0;
        hg.s0 s0Var = tlVar.O;
        vi viVar = tlVar.f27360b;
        int i11 = tlVar.f29121y0;
        if (i11 == 7) {
            if (i10 == 1 && (tL_messageMediaVenue2 = s0Var.f10737d0) != null) {
                tlVar.f29119x0.b(tL_messageMediaVenue2, i11, true, 0, 0L);
                viVar.dismiss(true);
                return;
            } else if (i10 == 2 && (tL_messageMediaVenue = s0Var.f10738e0) != null) {
                tlVar.f29119x0.b(tL_messageMediaVenue, i11, true, 0, 0L);
                viVar.dismiss(true);
                return;
            } else {
                tlVar2 = tlVar;
                foVar2 = foVar;
                c6Var2 = c6Var;
            }
        } else if (i10 == 1) {
            if (tlVar.f29119x0 != null && tlVar.f29110r0 != null) {
                FrameLayout frameLayout = tlVar.f29100i0;
                if (frameLayout != null) {
                    frameLayout.callOnClick();
                    return;
                }
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(tlVar.f29110r0.getLatitude());
                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(tlVar.f29110r0.getLongitude());
                g5.Z(viVar.M1, viVar.l1() + 1, viVar.p1(), new bi.u3(tlVar, foVar, tL_messageMediaGeo, c6Var, 6));
                return;
            } else if (tlVar.f29092a0) {
                g5.C(tlVar.getParentActivity()).show();
                return;
            } else {
                return;
            }
        } else {
            tlVar2 = tlVar;
            foVar2 = foVar;
            c6Var2 = c6Var;
            if (i10 == 2 && i11 == 1) {
                if (tlVar2.getLocationController().isSharingLocation(j10)) {
                    tlVar2.getLocationController().removeSharingLocation(j10);
                    viVar.dismiss(true);
                    return;
                } else if (tlVar2.f29108q0 == null && tlVar2.f29092a0) {
                    g5.C(tlVar2.getParentActivity()).show();
                    return;
                } else {
                    tlVar2.b0();
                    return;
                }
            }
        }
        Object J = s0Var.J(i10);
        if (J instanceof TLRPC.TL_messageMediaVenue) {
            g5.Z(viVar.M1, viVar.l1() + 1, viVar.p1(), new bi.u3(tlVar2, foVar2, (TLRPC.TL_messageMediaVenue) J, c6Var2, 7));
        }
    }

    public static void R(tl tlVar, org.telegram.ui.fo foVar, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        TLRPC.TL_messageMediaVenue I = tlVar.R.I(i10);
        if (I != null && tlVar.f29119x0 != null) {
            if (foVar != null && foVar.c()) {
                g5.L(tlVar.getParentActivity(), foVar.a(), new jl(tlVar, I, 0), c6Var);
                return;
            }
            tlVar.f29119x0.b(I, tlVar.f29121y0, true, 0, 0L);
            tlVar.f27360b.dismiss(true);
        }
    }

    public static void S(tl tlVar, org.telegram.ui.fo foVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.c6 c6Var) {
        if (foVar != null && foVar.c()) {
            g5.L(tlVar.getParentActivity(), foVar.a(), new jl(tlVar, tL_messageMediaVenue, 1), c6Var);
            return;
        }
        tlVar.f29119x0.b(tL_messageMediaVenue, tlVar.f29121y0, true, 0, 0L);
        tlVar.f27360b.dismiss(true);
    }

    public static void T(tl tlVar) {
        hg.s0 s0Var = tlVar.O;
        ImageView imageView = tlVar.f29104n;
        Activity parentActivity = tlVar.getParentActivity();
        if (parentActivity != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            g5.C(tlVar.getParentActivity()).show();
            return;
        }
        if (tlVar.f29108q0 != null && tlVar.H != null) {
            int i10 = org.telegram.ui.ActionBar.g6.vi;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(i10, tlVar.f27359a), PorterDuff.Mode.MULTIPLY));
            imageView.setTag(Integer.valueOf(i10));
            s0Var.L(null);
            tlVar.f29114u0 = false;
            tlVar.g0(false);
            tlVar.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(tlVar.f29108q0.getLatitude(), tlVar.f29108q0.getLongitude())));
            if (tlVar.f29115v0) {
                Location location = tlVar.f29108q0;
                if (location != null && tlVar.f29121y0 != 8) {
                    s0Var.H(null, location, true);
                }
                tlVar.f29115v0 = false;
                tlVar.f0();
            }
        }
        if (tlVar.f29098g0 != null) {
            tlVar.S.setVisibility(0);
            ql qlVar = tlVar.F;
            IMapsProvider.IMarker iMarker = tlVar.f29098g0;
            HashMap hashMap = qlVar.f28320a;
            View view = (View) hashMap.get(iMarker);
            if (view != null) {
                qlVar.removeView(view);
                hashMap.remove(iMarker);
            }
            tlVar.f29098g0 = null;
            tlVar.f29099h0 = null;
            tlVar.f29100i0 = null;
        }
    }

    public static void U(tl tlVar, Location location) {
        int i10;
        vi viVar = tlVar.f27360b;
        if (viVar != null && viVar.f29672f0 != null) {
            tlVar.d0(location);
            hg.s0 s0Var = tlVar.O;
            if (s0Var != null && (((i10 = tlVar.f29121y0) == 7 || i10 == 8) && !tlVar.f29114u0)) {
                s0Var.L(tlVar.f29110r0);
            }
            tlVar.getLocationController().setMapLocation(location, tlVar.f29093b0);
            tlVar.f29093b0 = false;
        }
    }

    public static void V(tl tlVar, IMapsProvider.IMapView iMapView) {
        if (tlVar.I != null && tlVar.getParentActivity() != null) {
            try {
                iMapView.onCreate(null);
                ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
                tlVar.I.getMapAsync(new kl(tlVar, 0));
                tlVar.f29106o0 = true;
                if (tlVar.f29107p0) {
                    tlVar.I.onResume();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public static void W(tl tlVar) {
        if (tlVar.getParentActivity() != null) {
            try {
                tlVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
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
        return this.f27360b.f29672f0.getLocationController();
    }

    private MessagesController getMessagesController() {
        return this.f27360b.f29672f0.getMessagesController();
    }

    public Activity getParentActivity() {
        org.telegram.ui.ActionBar.m2 m2Var;
        vi viVar = this.f27360b;
        if (viVar != null && (m2Var = viVar.f29672f0) != null) {
            return m2Var.getParentActivity();
        }
        return null;
    }

    private UserConfig getUserConfig() {
        return this.f27360b.f29672f0.getUserConfig();
    }

    @Override
    public final void B() {
        IMapsProvider.IMapView iMapView = this.I;
        if (iMapView != null && this.f29106o0) {
            try {
                iMapView.onPause();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        this.f29107p0 = false;
    }

    @Override
    public final void C(int r4, int r5) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.tl.C(int, int):void");
    }

    @Override
    public final void D() {
        IMapsProvider.IMapView iMapView = this.I;
        if (iMapView != null && this.f29106o0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.f29107p0 = true;
    }

    @Override
    public final void G(ni niVar) {
        long j10;
        vi viVar = this.f27360b;
        viVar.f29656a1.setTitle(LocaleController.getString(R.string.ShareLocation));
        if (this.I.getView().getParent() == null) {
            View view = this.I.getView();
            FrameLayout.LayoutParams e = w7.z5.e(-1, AndroidUtilities.dp(10.0f) + this.f29122z0, 51);
            ah.x xVar = this.N;
            xVar.addView(view, 0, e);
            xVar.addView(this.F, 1, w7.z5.e(-1, AndroidUtilities.dp(10.0f) + this.f29122z0, 51));
            xVar.addView(this.M, 2, w7.z5.d(-1.0f, -1));
        }
        this.E.setVisibility(0);
        IMapsProvider.IMapView iMapView = this.I;
        if (iMapView != null && this.f29106o0) {
            try {
                iMapView.onResume();
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        this.f29107p0 = true;
        IMapsProvider.IMap iMap = this.H;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
        Z();
        boolean w9 = viVar.f29664c2.w();
        dl dlVar = new dl(this, 1);
        if (w9) {
            j10 = 200;
        } else {
            j10 = 0;
        }
        AndroidUtilities.runOnUIThread(dlVar, j10);
        this.T.h1(0, 0);
        h0();
    }

    @Override
    public final void J() {
        this.P.x0(0);
    }

    @Override
    public final boolean L() {
        return !this.f29092a0;
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
            int i12 = this.f29121y0;
            if (i12 == 1 || i12 == 7 || i12 == 8) {
                dp += AndroidUtilities.dp(66.0f);
            }
            int dp2 = (i11 - dp) - AndroidUtilities.dp(90.0f);
            int dp3 = AndroidUtilities.dp(189.0f);
            this.f29122z0 = dp3;
            if (!this.f29092a0 || !a0()) {
                dp2 = Math.min(AndroidUtilities.dp(310.0f), dp2);
            }
            this.A0 = Math.max(dp3, dp2);
            if (this.f29092a0 && a0()) {
                this.f29122z0 = this.A0;
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
            if (this.f29092a0 && a0()) {
                i10 = this.f29122z0 - o0Var.getPaddingTop();
            } else {
                i10 = this.f29122z0;
            }
            int dp4 = AndroidUtilities.dp(16.0f) + i10;
            hg.s0 s0Var = this.O;
            s0Var.P(dp4);
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.I.getView().getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.height = AndroidUtilities.dp(10.0f) + this.A0;
                this.I.getView().setLayoutParams(layoutParams5);
            }
            ql qlVar = this.F;
            if (qlVar != null && (layoutParams = (FrameLayout.LayoutParams) qlVar.getLayoutParams()) != null) {
                layoutParams.height = AndroidUtilities.dp(10.0f) + this.A0;
                qlVar.setLayoutParams(layoutParams);
            }
            s0Var.l();
            h0();
        }
    }

    public final boolean a0() {
        int i10 = this.f29121y0;
        if (i10 == 0 || i10 == 1) {
            return true;
        }
        return false;
    }

    public final void b0() {
        TLRPC.User user;
        Activity parentActivity;
        if (this.f29119x0 != null && getParentActivity() != null && this.f29108q0 != null) {
            boolean z10 = this.f29102k0;
            org.telegram.ui.ActionBar.c6 c6Var = this.f27359a;
            if (z10 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
                this.f29102k0 = false;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                    globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                    g5.k(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new dl(this, 2), c6Var).o();
                    return;
                }
            }
            long j10 = this.f29094c0;
            if (DialogObject.isUserDialog(j10)) {
                user = this.f27360b.f29672f0.getMessagesController().getUser(Long.valueOf(j10));
            } else {
                user = null;
            }
            g5.D(getParentActivity(), false, user, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i10) {
                    tl tlVar = tl.this;
                    vi viVar = tlVar.f27360b;
                    g5.Z(viVar.M1, viVar.l1() + 1, viVar.p1(), new di.k4(tlVar, i10, 4));
                }
            }, c6Var).show();
        }
    }

    public final void c0() {
        tl tlVar;
        vi viVar = this.f27360b;
        if (viVar.O) {
            if (viVar.A2 != null) {
                AndroidUtilities.runOnUIThread(new dl(this, 0));
                return;
            } else if (!this.f29092a0) {
                File file = viVar.f29738z2;
                boolean z10 = viVar.f29735y2;
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
                        tlVar = this;
                        ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                        float[] fArr = new float[2];
                        if (exifInterface.getLatLong(fArr)) {
                            AndroidUtilities.runOnUIThread(new org.telegram.ui.vp(27, this, fArr));
                            return;
                        }
                        Location lastLocation = getLastLocation();
                        tlVar.f29108q0 = lastLocation;
                        d0(lastLocation);
                        return;
                    }
                }
                tlVar = this;
                Location lastLocation2 = getLastLocation();
                tlVar.f29108q0 = lastLocation2;
                d0(lastLocation2);
                return;
            } else {
                AndroidUtilities.runOnUIThread(new dl(this, 8));
                return;
            }
        }
        Location lastLocation3 = getLastLocation();
        this.f29108q0 = lastLocation3;
        d0(lastLocation3);
    }

    public final void d0(Location location) {
        if (location != null) {
            Location location2 = new Location(location);
            this.f29108q0 = location2;
            IMapsProvider.IMap iMap = this.H;
            hg.s0 s0Var = this.O;
            if (iMap != null) {
                IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
                if (s0Var != null) {
                    if (!this.f29115v0 && this.f29121y0 != 8) {
                        s0Var.H(null, this.f29108q0, true);
                    }
                    s0Var.M(this.f29108q0);
                }
                if (!this.f29114u0) {
                    this.f29110r0 = new Location(location);
                    if (this.f29117w0) {
                        this.H.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                        return;
                    }
                    this.f29117w0 = true;
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
        nl nlVar = this.R;
        hg.s0 s0Var = this.O;
        int i13 = 0;
        if (i10 == i12) {
            this.f29092a0 = false;
            this.W = false;
            c0();
            if (s0Var != null) {
                s0Var.O(this.f29092a0, this.W);
            }
            if (nlVar != null && nlVar.M != (z11 = this.f29092a0)) {
                nlVar.M = z11;
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
            this.f29092a0 = true;
            this.W = false;
            if (s0Var != null) {
                s0Var.O(true, false);
            }
            if (nlVar != null && nlVar.M != (z10 = this.f29092a0)) {
                nlVar.M = z10;
            }
        }
        Z();
        boolean z12 = this.f29092a0;
        vi viVar = this.f27360b;
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
                this.f29110r0 = location;
                location.reset();
                this.f29110r0.setLatitude(d);
                this.f29110r0.setLongitude(d10);
            } else {
                Location location2 = new Location("");
                this.f29108q0 = location2;
                location2.reset();
                this.f29108q0.setLatitude(d);
                this.f29108q0.setLongitude(d10);
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
                s0Var.L(this.f29110r0);
            } else {
                s0Var.M(this.f29108q0);
            }
            s0Var.I();
            this.P.v0(0, 1, null);
            this.f29113t0 = true;
            if (i10 != 0 && d10 != 0.0d) {
                this.f29114u0 = true;
                g0(false);
                if (this.f29121y0 != 8) {
                    s0Var.H(null, this.f29110r0, true);
                }
                this.f29115v0 = true;
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
        if (this.f29092a0) {
            z10 = false;
        }
        rl rlVar = this.f29111s;
        if (z10 && rlVar != null && rlVar.getTag() == null && ((location = this.f29108q0) == null || (location2 = this.f29110r0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        if (this.f29121y0 == 8) {
            z10 = false;
        }
        if (rlVar != null) {
            if (!z10 || rlVar.getTag() == null) {
                if (z10 || rlVar.getTag() != null) {
                    if (z10) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    rlVar.setVisibility(i10);
                    if (z10) {
                        num = 1;
                    } else {
                        num = null;
                    }
                    rlVar.setTag(num);
                    AnimatorSet animatorSet = new AnimatorSet();
                    if (z10) {
                        f7 = 0.0f;
                    } else {
                        f7 = -AndroidUtilities.dp(80.0f);
                    }
                    animatorSet.playTogether(ObjectAnimator.ofFloat(rlVar, View.TRANSLATION_X, f7));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(es.f24466g);
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
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f19672h5));
        int i10 = org.telegram.ui.ActionBar.g6.A5;
        bi.o0 o0Var = this.P;
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 32768, null, null, null, null, i10));
        org.telegram.ui.ActionBar.u0 u0Var = this.E;
        if (u0Var != null) {
            editTextBoldCursor = u0Var.getSearchField();
        } else {
            editTextBoldCursor = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(editTextBoldCursor, 16777216, null, null, null, null, org.telegram.ui.ActionBar.g6.f19707j5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f19690i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f19722k0, null, null, org.telegram.ui.ActionBar.g6.f19602d7));
        int i11 = org.telegram.ui.ActionBar.g6.W5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f29116w, 8, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f29118x, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f29120y, 4, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.ui;
        ImageView imageView = this.f29104n;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 262152, null, null, null, null, i13));
        int i14 = org.telegram.ui.ActionBar.g6.vi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 262152, null, null, null, null, i14));
        int i15 = org.telegram.ui.ActionBar.g6.wi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 32, null, null, null, null, i15));
        int i16 = org.telegram.ui.ActionBar.g6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 65568, null, null, null, null, i16));
        org.telegram.ui.ActionBar.u0 u0Var2 = this.f29109r;
        arrayList.add(new org.telegram.ui.ActionBar.i6(u0Var2, 0, null, null, null, b7Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(u0Var2, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(u0Var2, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f29111s, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f29111s, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f29111s, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, org.telegram.ui.ActionBar.g6.f19852r0, b7Var, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, b7Var, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f19889si));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 393216, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19796ni));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 393216, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19850qi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 393248, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19776mi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 393248, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19831pi));
        int i17 = org.telegram.ui.ActionBar.g6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"accurateTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 262144, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19870ri));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 262144, new Class[]{org.telegram.ui.Cells.t6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19814oi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"buttonTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 131072, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 196608, new Class[]{org.telegram.ui.Cells.v4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 32, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19563b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 48, new Class[]{org.telegram.ui.Cells.a7.class}, null, null, null, org.telegram.ui.ActionBar.g6.f19543a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.m4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19783n5));
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
        arrayList.add(new org.telegram.ui.ActionBar.i6(o0Var, 0, new Class[]{org.telegram.ui.Cells.w4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f19673h6));
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
                i11 = Math.min(i10, 0) + this.f29122z0;
            } else {
                i10 = -xVar.getMeasuredHeight();
                i11 = 0;
            }
            if (((FrameLayout.LayoutParams) xVar.getLayoutParams()) != null) {
                ql qlVar = this.F;
                if (i11 <= 0) {
                    if (this.I.getView().getVisibility() == 0) {
                        this.I.getView().setVisibility(4);
                        xVar.setVisibility(4);
                        if (qlVar != null) {
                            qlVar.setVisibility(4);
                        }
                    }
                    this.I.getView().setTranslationY(i10);
                    return;
                }
                if (this.I.getView().getVisibility() == 4) {
                    this.I.getView().setVisibility(0);
                    xVar.setVisibility(0);
                    if (qlVar != null) {
                        qlVar.setVisibility(0);
                    }
                }
                int max = Math.max(0, (-((i10 - this.A0) + this.f29122z0)) / 2);
                int i12 = this.A0 - this.f29122z0;
                float max2 = 1.0f - Math.max(0.0f, Math.min(1.0f, (o0Var.getPaddingTop() - i10) / (o0Var.getPaddingTop() - i12)));
                int i13 = this.B0;
                if (this.f29092a0 && a0()) {
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
                if (qlVar != null) {
                    qlVar.setTranslationY(f7);
                }
                int max3 = Math.max(this.C0 - i10, 0);
                int i14 = this.A0;
                org.telegram.ui.ActionBar.u0 u0Var = this.f29109r;
                float min = Math.min(max3, (i14 - u0Var.getMeasuredHeight()) - AndroidUtilities.dp(80.0f));
                u0Var.setTranslationY(min);
                rl rlVar = this.f29111s;
                rlVar.f28565c = min;
                rlVar.setTranslationY(min + rlVar.f28564b);
                this.f29104n.setTranslationY(-this.B0);
                int D = org.telegram.messenger.sk.D(48.0f, (this.A0 - this.B0) / 2, max);
                this.f29112s0 = D;
                this.S.setTranslationY(D);
                if (i13 != this.B0) {
                    IMapsProvider.IMarker iMarker = this.f29098g0;
                    if (iMarker != null) {
                        latLng = new IMapsProvider.LatLng(iMarker.getPosition().latitude, this.f29098g0.getPosition().longitude);
                    } else if (this.f29114u0 && (location = this.f29110r0) != null) {
                        latLng = new IMapsProvider.LatLng(location.getLatitude(), this.f29110r0.getLongitude());
                    } else {
                        Location location2 = this.f29108q0;
                        if (location2 != null) {
                            latLng = new IMapsProvider.LatLng(location2.getLatitude(), this.f29108q0.getLongitude());
                        } else {
                            latLng = null;
                        }
                    }
                    if (latLng != null && (iMap = this.H) != null) {
                        iMap.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                    }
                }
                if (this.f29092a0 && a0()) {
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
        boolean z10 = this.f29103l0;
        LinearLayout linearLayout = this.v;
        if (z10) {
            boolean z11 = this.f29105n0;
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
        nl nlVar = this.R;
        if (nlVar != null) {
            nlVar.F();
        }
        vi viVar = this.f27360b;
        viVar.f29656a1.h(true);
        viVar.f29656a1.n().removeView(this.E);
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

    public void setDelegate(ol olVar) {
        this.f29119x0 = olVar;
    }

    @Override
    public void setTranslationY(float f7) {
        super.setTranslationY(f7);
        this.f27360b.getSheetContainer().invalidate();
        h0();
    }

    @Override
    public final void u() {
        this.E.setVisibility(8);
    }

    @Override
    public final void y() {
        boolean z10;
        vi viVar = this.f27360b;
        if (viVar != null && !viVar.isKeyboardVisible()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.O.f10736c0 = z10;
    }

    @Override
    public final void z(int i10, boolean z10) {
        if (z10) {
            this.O.f10736c0 = false;
        }
    }
}
