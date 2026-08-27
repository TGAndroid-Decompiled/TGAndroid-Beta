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
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.location.Location;
import android.location.LocationManager;
import android.media.ExifInterface;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Property;
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

public final class tk extends yh implements NotificationCenter.NotificationCenterDelegate {
    public static final int A0 = 0;
    public final org.telegram.ui.ActionBar.v0 A;
    public final qk B;
    public boolean C;
    public IMapsProvider.IMap D;
    public IMapsProvider.IMapView E;
    public IMapsProvider.ICameraUpdate F;
    public float G;
    public boolean H;
    public final View I;
    public final ag.p1 J;
    public final pf.h0 K;
    public final hh.f1 L;
    public final zk0 M;
    public final nk N;
    public final ImageView O;
    public final zi P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public boolean U;
    public final long V;
    public final Paint W;

    public final ArrayList f32798a0;

    public AnimatorSet f32799b0;

    public IMapsProvider.IMarker f32800c0;

    public sk f32801d0;

    public FrameLayout f32802e0;

    public boolean f32803f0;

    public boolean f32804g0;

    public boolean f32805h0;

    public boolean f32806i0;

    public boolean f32807j0;

    public boolean f32808k0;

    public boolean f32809l0;
    public Location m0;

    public final ImageView f32810n;

    public Location f32811n0;

    public int f32812o0;

    public boolean f32813p0;

    public boolean f32814q0;

    public final org.telegram.ui.ActionBar.v0 f32815r;

    public boolean f32816r0;

    public final rk f32817s;

    public boolean f32818s0;

    public ok f32819t0;

    public final int f32820u0;
    public final LinearLayout v;

    public int f32821v0;

    public final ImageView f32822w;

    public int f32823w0;

    public final TextView f32824x;

    public int f32825x0;

    public final TextView f32826y;

    public int f32827y0;

    public final Bitmap[] f32828z0;

    public tk(gi giVar, Context context, final org.telegram.ui.ActionBar.c6 c6Var, boolean z10) {
        int i10;
        super(context, c6Var, giVar);
        this.R = true;
        this.S = false;
        this.T = false;
        this.U = true;
        this.W = new Paint();
        this.f32798a0 = new ArrayList();
        this.f32803f0 = true;
        this.f32804g0 = true;
        int currentActionBarHeight = (AndroidUtilities.displaySize.x - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.f32821v0 = currentActionBarHeight;
        this.f32823w0 = currentActionBarHeight;
        this.f32828z0 = new Bitmap[7];
        AndroidUtilities.fixGoogleMapsBug();
        gi giVar2 = this.f34900b;
        org.telegram.ui.ActionBar.n2 n2Var = giVar2.f28635b0;
        final org.telegram.ui.rn rnVar = n2Var instanceof org.telegram.ui.rn ? (org.telegram.ui.rn) n2Var : null;
        long jN1 = giVar2.n1();
        this.V = jN1;
        if (this.f34900b.K) {
            this.f32820u0 = 7;
        } else if (!z10 || rnVar == null || rnVar.h != null || rnVar.c() || UserObject.isUserSelf(rnVar.i())) {
            this.f32820u0 = 0;
        } else {
            this.f32820u0 = 1;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        this.f32806i0 = false;
        this.f32805h0 = false;
        this.f32807j0 = false;
        pf.h0 h0Var = this.K;
        if (h0Var != null) {
            h0Var.F();
        }
        nk nkVar = this.N;
        if (nkVar != null) {
            nkVar.F();
        }
        this.T = (Build.VERSION.SDK_INT < 23 || getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        org.telegram.ui.ActionBar.z zVarN = this.f34900b.T0.n();
        this.B = new qk(this, context);
        org.telegram.ui.ActionBar.v0 v0VarA = zVarN.a(0, R.drawable.outline_header_search);
        v0VarA.F();
        v0VarA.D = new org.telegram.ui.db(this, 5);
        this.A = v0VarA;
        if (!this.T || this.f34900b.K) {
            this.f34900b.getClass();
            i10 = 0;
        } else {
            i10 = 8;
        }
        v0VarA.setVisibility(i10);
        v0VarA.setSearchFieldHint(LocaleController.getString(R.string.Search));
        v0VarA.setContentDescription(LocaleController.getString(R.string.Search));
        EditTextBoldCursor searchField = v0VarA.getSearchField();
        int i11 = org.telegram.ui.ActionBar.g6.f23161j5;
        searchField.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, this.f34899a));
        searchField.setCursorColor(org.telegram.ui.ActionBar.g6.v0(i11, this.f34899a));
        searchField.setHintTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Vd, this.f34899a));
        new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f)).gravity = 83;
        ag.p1 p1Var = new ag.p1(this, context, 15);
        this.J = p1Var;
        p1Var.setWillNotDraw(false);
        View view = new View(context);
        this.I = view;
        view.setBackgroundDrawable(new af.g(org.telegram.ui.ActionBar.g6.A0().q()));
        rk rkVar = new rk(context, 0);
        this.f32817s = rkVar;
        rkVar.setTranslationX(-AndroidUtilities.dp(80.0f));
        rkVar.setVisibility(4);
        int iDp = AndroidUtilities.dp(40.0f);
        int i12 = org.telegram.ui.ActionBar.g6.wi;
        int iV0 = org.telegram.ui.ActionBar.g6.v0(i12, this.f34899a);
        int i13 = org.telegram.ui.ActionBar.g6.xi;
        int iV1 = org.telegram.ui.ActionBar.g6.v0(i13, this.f34899a);
        org.telegram.ui.Cells.z zVarI0 = org.telegram.ui.ActionBar.g6.i0(iDp, iDp, iDp, iDp, iV0, iV1, iV1);
        h7.b6.a(rkVar);
        rkVar.setTranslationZ(AndroidUtilities.dp(2.0f));
        cg.l1 l1Var = gf.r0.f7054a;
        rkVar.setOutlineProvider(l1Var);
        rkVar.setBackground(zVarI0);
        int i14 = org.telegram.ui.ActionBar.g6.vi;
        rkVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, this.f34899a));
        rkVar.setTextSize(1, 14.0f);
        rkVar.setTypeface(AndroidUtilities.bold());
        rkVar.setText(LocaleController.getString(R.string.PlacesInThisArea));
        rkVar.setGravity(17);
        rkVar.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        p1Var.addView(rkVar, h7.z5.d(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
        final int i15 = 1;
        rkVar.setOnClickListener(new View.OnClickListener(this) {

            public final tk f28397b;

            {
                this.f28397b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i15) {
                    case 0:
                        tk.Q(this.f28397b);
                        break;
                    case 1:
                        tk tkVar = this.f28397b;
                        tkVar.d0(false);
                        tkVar.K.H(null, tkVar.f32811n0, true);
                        tkVar.f32816r0 = true;
                        tkVar.c0();
                        break;
                    default:
                        this.f28397b.f32815r.M(null, null);
                        break;
                }
            }
        });
        org.telegram.ui.ActionBar.v0 v0Var = new org.telegram.ui.ActionBar.v0(context, null, 0, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.ui, this.f34899a), false, c6Var);
        this.f32815r = v0Var;
        v0Var.setClickable(true);
        v0Var.setSubMenuOpenSide(2);
        v0Var.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        v0Var.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        v0Var.f(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), c6Var);
        v0Var.f(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), c6Var);
        v0Var.f(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), c6Var);
        v0Var.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        org.telegram.ui.Cells.z zVarH0 = org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.g6.v0(i12, this.f34899a), org.telegram.ui.ActionBar.g6.v0(i13, this.f34899a));
        h7.b6.a(v0Var);
        v0Var.setTranslationZ(AndroidUtilities.dp(2.0f));
        v0Var.setOutlineProvider(l1Var);
        v0Var.setBackground(zVarH0);
        v0Var.setIcon(R.drawable.msg_map_type);
        p1Var.addView(v0Var, h7.z5.d(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        final int i16 = 2;
        v0Var.setOnClickListener(new View.OnClickListener(this) {

            public final tk f28397b;

            {
                this.f28397b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i16) {
                    case 0:
                        tk.Q(this.f28397b);
                        break;
                    case 1:
                        tk tkVar = this.f28397b;
                        tkVar.d0(false);
                        tkVar.K.H(null, tkVar.f32811n0, true);
                        tkVar.f32816r0 = true;
                        tkVar.c0();
                        break;
                    default:
                        this.f28397b.f32815r.M(null, null);
                        break;
                }
            }
        });
        v0Var.setDelegate(new ek(this, 0));
        ImageView imageView = new ImageView(context);
        this.f32810n = imageView;
        org.telegram.ui.Cells.z zVarH1 = org.telegram.ui.ActionBar.g6.h0(AndroidUtilities.dp(40.0f), org.telegram.ui.ActionBar.g6.v0(i12, this.f34899a), org.telegram.ui.ActionBar.g6.v0(i13, this.f34899a));
        h7.b6.a(imageView);
        imageView.setTranslationZ(AndroidUtilities.dp(2.0f));
        imageView.setOutlineProvider(l1Var);
        imageView.setBackground(zVarH1);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int iV2 = org.telegram.ui.ActionBar.g6.v0(i14, this.f34899a);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(iV2, mode));
        imageView.setTag(Integer.valueOf(i14));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        p1Var.addView(imageView, h7.z5.d(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        final int i17 = 0;
        imageView.setOnClickListener(new View.OnClickListener(this) {

            public final tk f28397b;

            {
                this.f28397b = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i17) {
                    case 0:
                        tk.Q(this.f28397b);
                        break;
                    case 1:
                        tk tkVar = this.f28397b;
                        tkVar.d0(false);
                        tkVar.K.H(null, tkVar.f32811n0, true);
                        tkVar.f32816r0 = true;
                        tkVar.c0();
                        break;
                    default:
                        this.f28397b.f32815r.M(null, null);
                        break;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(context);
        this.v = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(160.0f), 0, 0);
        linearLayout.setVisibility(8);
        addView(linearLayout, h7.z5.c(-1.0f, -1));
        linearLayout.setOnTouchListener(new kh.e(15));
        ImageView imageView2 = new ImageView(context);
        this.f32822w = imageView2;
        imageView2.setImageResource(R.drawable.location_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.W5, this.f34899a), mode));
        linearLayout.addView(imageView2, h7.z5.n(-2, -2));
        TextView textView = new TextView(context);
        this.f32824x = textView;
        int i18 = org.telegram.ui.ActionBar.g6.X5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i18, this.f34899a));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 17.0f);
        textView.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView textViewI = org.telegram.ui.Cells.pa.i(linearLayout, textView, h7.z5.t(-2, -2, 17, 0, 11, 0, 0), context);
        this.f32826y = textViewI;
        textViewI.setTextColor(org.telegram.ui.ActionBar.g6.v0(i18, this.f34899a));
        textViewI.setGravity(17);
        textViewI.setTextSize(1, 15.0f);
        textViewI.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textViewI, h7.z5.t(-2, -2, 17, 0, 6, 0, 0));
        hh.f1 f1Var = new hh.f1(this, context, c6Var, 13);
        this.L = f1Var;
        this.f34901c = f1Var;
        this.d = f1Var;
        this.f34903f = true;
        f1Var.setClipToPadding(false);
        pf.h0 h0Var2 = new pf.h0(context, this.f32820u0, jN1, true, c6Var, this.f34900b.K, false, false);
        this.K = h0Var2;
        f1Var.setAdapter(h0Var2);
        gi giVar3 = this.f34900b;
        h0Var2.f45814b0 = giVar3 != null && (giVar3.D || giVar3.L);
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(er.h);
        lVar.C = false;
        lVar.f5819m = false;
        f1Var.setItemAnimator(lVar);
        h0Var2.O(this.T, this.S);
        f1Var.setVerticalScrollBarEnabled(false);
        f1Var.p1();
        zi ziVar = new zi(this, f1Var);
        this.P = ziVar;
        f1Var.setLayoutManager(ziVar);
        addView(f1Var, h7.z5.e(-1, -1, 51));
        f1Var.setOnScrollListener(new mk(this));
        final int i19 = 0;
        f1Var.setOnItemClickListener(new pk0(this) {

            public final tk f28735b;

            {
                this.f28735b = this;
            }

            @Override
            public final void a(int i20, View view2) {
                switch (i19) {
                    case 0:
                        tk.N(this.f28735b, rnVar, c6Var, i20);
                        break;
                    default:
                        tk.O(this.f28735b, rnVar, c6Var, i20);
                        break;
                }
            }
        });
        ek ekVar = new ek(this, 1);
        h0Var2.D = jN1;
        h0Var2.f45748y = ekVar;
        h0Var2.P(AndroidUtilities.dp(16.0f) + this.f32821v0);
        addView(p1Var, h7.z5.e(-1, -1, 51));
        IMapsProvider.IMapView iMapViewOnCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.E = iMapViewOnCreateMapView;
        iMapViewOnCreateMapView.setOnDispatchTouchEventInterceptor(new ek(this, 2));
        this.E.setOnInterceptTouchEventInterceptor(new ek(this, 3));
        new Thread(new ik(this, this.E, 1)).start();
        ImageView imageView3 = new ImageView(context);
        this.O = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        p1Var.addView(imageView3, h7.z5.e(28, 48, 49));
        zk0 zk0Var = new zk0(context, c6Var);
        this.M = zk0Var;
        zk0Var.setSections(true);
        zk0Var.setClipToPadding(false);
        zk0Var.setVisibility(8);
        zk0Var.setLayoutManager(new f2.k0(1, false));
        nk nkVar2 = new nk(this, context, c6Var, this.f34900b.K);
        this.N = nkVar2;
        boolean z11 = this.T;
        if (nkVar2.I != z11) {
            nkVar2.I = z11;
        }
        ek ekVar2 = new ek(this, 7);
        nkVar2.D = 0L;
        nkVar2.f45748y = ekVar2;
        zk0Var.setItemAnimator(null);
        addView(zk0Var, h7.z5.e(-1, -1, 51));
        zk0Var.setOnScrollListener(new ag.z2(this, 29));
        final int i20 = 1;
        zk0Var.setOnItemClickListener(new pk0(this) {

            public final tk f28735b;

            {
                this.f28735b = this;
            }

            @Override
            public final void a(int i21, View view2) {
                switch (i20) {
                    case 0:
                        tk.N(this.f28735b, rnVar, c6Var, i21);
                        break;
                    default:
                        tk.O(this.f28735b, rnVar, c6Var, i21);
                        break;
                }
            }
        });
        f0();
    }

    public static void K(tk tkVar, IMapsProvider.IMap iMap) {
        PackageManager packageManager;
        tkVar.D = iMap;
        iMap.setOnMapLoadedCallback(new dk(tkVar, 3));
        if (org.telegram.ui.ActionBar.g6.I.q() || AndroidUtilities.computePerceivedBrightness(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23053d6, tkVar.f34899a)) < 0.721f) {
            tkVar.Q = true;
            tkVar.D.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
        }
        if (tkVar.D == null) {
            return;
        }
        Location location = new Location("network");
        tkVar.f32811n0 = location;
        location.setLatitude(20.659322d);
        tkVar.f32811n0.setLongitude(-11.40625d);
        try {
            tkVar.D.setMyLocationEnabled(true);
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        tkVar.D.getUiSettings().setMyLocationButtonEnabled(false);
        tkVar.D.getUiSettings().setZoomControlsEnabled(false);
        tkVar.D.getUiSettings().setCompassEnabled(false);
        tkVar.D.setOnCameraMoveStartedListener(new ek(tkVar, 4));
        tkVar.D.setOnCameraIdleListener(new dk(tkVar, 5));
        tkVar.D.setOnMyLocationChangeListener(new kk(tkVar, 1));
        tkVar.D.setOnMarkerClickListener(new ek(tkVar, 5));
        tkVar.D.setOnCameraMoveListener(new dk(tkVar, 6));
        tkVar.Z();
        AndroidUtilities.runOnUIThread(new dk(tkVar, 7), 200L);
        if (tkVar.R && tkVar.getParentActivity() != null) {
            tkVar.R = false;
            Activity parentActivity = tkVar.getParentActivity();
            if (parentActivity != null && (packageManager = parentActivity.getPackageManager()) != null && !packageManager.hasSystemFeature("android.hardware.location.gps")) {
                return;
            }
            try {
                if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tkVar.getParentActivity(), 0, tkVar.f34899a);
                    alertDialog$Builder.m(R.raw.permission_request_location, 72, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.L5, tkVar.f34899a), null);
                    alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.GpsDisabledAlertText);
                    alertDialog$Builder.k(LocaleController.getString(R.string.ConnectingToProxyEnable), new ek(tkVar, 6));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.o();
                }
            } catch (Exception e10) {
                FileLog.e(e10);
            }
        }
        tkVar.e0();
    }

    public static void L(tk tkVar, org.telegram.ui.rn rnVar, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, org.telegram.ui.ActionBar.c6 c6Var, Long l10) {
        if (rnVar != null && rnVar.c()) {
            y4.M(tkVar.getParentActivity(), rnVar.a(), new ag.l0(tkVar, tL_messageMediaGeo, l10, 24), c6Var);
        } else {
            tkVar.f32819t0.d(tL_messageMediaGeo, tkVar.f32820u0, true, 0, l10.longValue());
            tkVar.f34900b.dismiss(true);
        }
    }

    public static void M(tk tkVar) {
        int i10;
        Activity parentActivity;
        pf.h0 h0Var = tkVar.K;
        gi giVar = tkVar.f34900b;
        if (!tkVar.f32803f0 || (i10 = Build.VERSION.SDK_INT) < 23 || (parentActivity = tkVar.getParentActivity()) == null) {
            return;
        }
        tkVar.f32803f0 = false;
        if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            String[] strArr = (!giVar.K || giVar.f28692s2 == null || i10 < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
            tkVar.S = true;
            if (h0Var != null) {
                h0Var.O(tkVar.T, true);
            }
            parentActivity.requestPermissions(strArr, 2);
            return;
        }
        if (i10 < 29 || !giVar.K || giVar.f28692s2 == null || parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
            return;
        }
        tkVar.S = true;
        if (h0Var != null) {
            h0Var.O(tkVar.T, true);
        }
        parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
    }

    public static void N(tk tkVar, org.telegram.ui.rn rnVar, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        tk tkVar2;
        org.telegram.ui.rn rnVar2;
        org.telegram.ui.ActionBar.c6 c6Var2;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        long j10 = tkVar.V;
        pf.h0 h0Var = tkVar.K;
        gi giVar = tkVar.f34900b;
        int i11 = tkVar.f32820u0;
        if (i11 == 7) {
            if (i10 == 1 && (tL_messageMediaVenue2 = h0Var.Z) != null) {
                tkVar.f32819t0.d(tL_messageMediaVenue2, i11, true, 0, 0L);
                giVar.dismiss(true);
                return;
            } else if (i10 == 2 && (tL_messageMediaVenue = h0Var.f45813a0) != null) {
                tkVar.f32819t0.d(tL_messageMediaVenue, i11, true, 0, 0L);
                giVar.dismiss(true);
                return;
            } else {
                tkVar2 = tkVar;
                rnVar2 = rnVar;
                c6Var2 = c6Var;
            }
        } else {
            if (i10 == 1) {
                if (tkVar.f32819t0 == null || tkVar.f32811n0 == null) {
                    if (tkVar.T) {
                        y4.D(tkVar.getParentActivity()).show();
                        return;
                    }
                    return;
                }
                FrameLayout frameLayout = tkVar.f32802e0;
                if (frameLayout != null) {
                    frameLayout.callOnClick();
                    return;
                }
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(tkVar.f32811n0.getLatitude());
                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(tkVar.f32811n0.getLongitude());
                y4.a0(giVar.F1, giVar.j1() + 1, giVar.n1(), new cg.e1(tkVar, rnVar, tL_messageMediaGeo, c6Var, 7));
                return;
            }
            tkVar2 = tkVar;
            rnVar2 = rnVar;
            c6Var2 = c6Var;
            if (i10 == 2 && i11 == 1) {
                if (tkVar2.getLocationController().isSharingLocation(j10)) {
                    tkVar2.getLocationController().removeSharingLocation(j10);
                    giVar.dismiss(true);
                    return;
                } else if (tkVar2.m0 == null && tkVar2.T) {
                    y4.D(tkVar2.getParentActivity()).show();
                    return;
                } else {
                    tkVar2.Y();
                    return;
                }
            }
        }
        Object objJ = h0Var.J(i10);
        if (objJ instanceof TLRPC.TL_messageMediaVenue) {
            y4.a0(giVar.F1, giVar.j1() + 1, giVar.n1(), new cg.e1(tkVar2, rnVar2, (TLRPC.TL_messageMediaVenue) objJ, c6Var2, 8));
        }
    }

    public static void O(tk tkVar, org.telegram.ui.rn rnVar, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        TLRPC.TL_messageMediaVenue tL_messageMediaVenueI = tkVar.N.I(i10);
        if (tL_messageMediaVenueI == null || tkVar.f32819t0 == null) {
            return;
        }
        if (rnVar != null && rnVar.c()) {
            y4.M(tkVar.getParentActivity(), rnVar.a(), new jk(tkVar, tL_messageMediaVenueI, 0), c6Var);
        } else {
            tkVar.f32819t0.d(tL_messageMediaVenueI, tkVar.f32820u0, true, 0, 0L);
            tkVar.f34900b.dismiss(true);
        }
    }

    public static void P(tk tkVar, org.telegram.ui.rn rnVar, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, org.telegram.ui.ActionBar.c6 c6Var) {
        if (rnVar != null && rnVar.c()) {
            y4.M(tkVar.getParentActivity(), rnVar.a(), new jk(tkVar, tL_messageMediaVenue, 1), c6Var);
        } else {
            tkVar.f32819t0.d(tL_messageMediaVenue, tkVar.f32820u0, true, 0, 0L);
            tkVar.f34900b.dismiss(true);
        }
    }

    public static void Q(tk tkVar) {
        Activity parentActivity;
        pf.h0 h0Var = tkVar.K;
        ImageView imageView = tkVar.f32810n;
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = tkVar.getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            y4.D(tkVar.getParentActivity()).show();
            return;
        }
        if (tkVar.m0 != null && tkVar.D != null) {
            int i10 = org.telegram.ui.ActionBar.g6.vi;
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i10, tkVar.f34899a), PorterDuff.Mode.MULTIPLY));
            imageView.setTag(Integer.valueOf(i10));
            h0Var.L(null);
            tkVar.f32814q0 = false;
            tkVar.d0(false);
            tkVar.D.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(tkVar.m0.getLatitude(), tkVar.m0.getLongitude())));
            if (tkVar.f32816r0) {
                Location location = tkVar.m0;
                if (location != null && tkVar.f32820u0 != 8) {
                    h0Var.H(null, location, true);
                }
                tkVar.f32816r0 = false;
                tkVar.c0();
            }
        }
        if (tkVar.f32800c0 != null) {
            tkVar.O.setVisibility(0);
            qk qkVar = tkVar.B;
            IMapsProvider.IMarker iMarker = tkVar.f32800c0;
            HashMap map = qkVar.f31919a;
            View view = (View) map.get(iMarker);
            if (view != null) {
                qkVar.removeView(view);
                map.remove(iMarker);
            }
            tkVar.f32800c0 = null;
            tkVar.f32801d0 = null;
            tkVar.f32802e0 = null;
        }
    }

    public static void R(tk tkVar, Location location) {
        int i10;
        gi giVar = tkVar.f34900b;
        if (giVar == null || giVar.f28635b0 == null) {
            return;
        }
        tkVar.a0(location);
        pf.h0 h0Var = tkVar.K;
        if (h0Var != null && (((i10 = tkVar.f32820u0) == 7 || i10 == 8) && !tkVar.f32814q0)) {
            h0Var.L(tkVar.f32811n0);
        }
        tkVar.getLocationController().setMapLocation(location, tkVar.U);
        tkVar.U = false;
    }

    public static void S(tk tkVar, IMapsProvider.IMapView iMapView) {
        if (tkVar.E == null || tkVar.getParentActivity() == null) {
            return;
        }
        try {
            iMapView.onCreate(null);
            ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
            tkVar.E.getMapAsync(new kk(tkVar, 0));
            tkVar.f32808k0 = true;
            if (tkVar.f32809l0) {
                tkVar.E.onResume();
            }
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public static void T(tk tkVar) {
        if (tkVar.getParentActivity() == null) {
            return;
        }
        try {
            tkVar.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        } catch (Exception unused) {
        }
    }

    private Location getLastLocation() {
        LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        List<String> providers = locationManager.getProviders(true);
        Location lastKnownLocation = null;
        for (int size = providers.size() - 1; size >= 0; size--) {
            lastKnownLocation = locationManager.getLastKnownLocation(providers.get(size));
            if (lastKnownLocation != null) {
                return lastKnownLocation;
            }
        }
        return lastKnownLocation;
    }

    private LocationController getLocationController() {
        return this.f34900b.f28635b0.getLocationController();
    }

    private MessagesController getMessagesController() {
        return this.f34900b.f28635b0.getMessagesController();
    }

    public Activity getParentActivity() {
        org.telegram.ui.ActionBar.n2 n2Var;
        gi giVar = this.f34900b;
        if (giVar == null || (n2Var = giVar.f28635b0) == null) {
            return null;
        }
        return n2Var.getParentActivity();
    }

    private UserConfig getUserConfig() {
        return this.f34900b.f28635b0.getUserConfig();
    }

    @Override
    public final void B() {
        IMapsProvider.IMapView iMapView = this.E;
        if (iMapView != null && this.f32808k0) {
            try {
                iMapView.onResume();
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        this.f32809l0 = true;
    }

    @Override
    public final void E(yh yhVar) {
        gi giVar = this.f34900b;
        giVar.T0.setTitle(LocaleController.getString(R.string.ShareLocation));
        if (this.E.getView().getParent() == null) {
            View view = this.E.getView();
            FrameLayout.LayoutParams layoutParamsE = h7.z5.e(-1, AndroidUtilities.dp(10.0f) + this.f32821v0, 51);
            ag.p1 p1Var = this.J;
            p1Var.addView(view, 0, layoutParamsE);
            p1Var.addView(this.B, 1, h7.z5.e(-1, AndroidUtilities.dp(10.0f) + this.f32821v0, 51));
            p1Var.addView(this.I, 2, h7.z5.c(-1.0f, -1));
        }
        this.A.setVisibility(0);
        IMapsProvider.IMapView iMapView = this.E;
        if (iMapView != null && this.f32808k0) {
            try {
                iMapView.onResume();
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        this.f32809l0 = true;
        IMapsProvider.IMap iMap = this.D;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        W();
        AndroidUtilities.runOnUIThread(new dk(this, 1), giVar.V1.s() ? 200L : 0L);
        this.P.h1(0, 0);
        e0();
    }

    @Override
    public final void G() {
        this.L.x0(0);
    }

    @Override
    public final boolean J() {
        return !this.T;
    }

    public final Bitmap V(int i10) {
        Bitmap[] bitmapArr = this.f32828z0;
        Bitmap bitmap = bitmapArr[i10 % 7];
        if (bitmap != null) {
            return bitmap;
        }
        try {
            Paint paint = new Paint(1);
            paint.setColor(-1);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            paint.setColor(org.telegram.ui.Cells.r4.a(i10));
            canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), paint);
            canvas.setBitmap(null);
            bitmapArr[i10 % 7] = bitmapCreateBitmap;
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            FileLog.e(th);
            return null;
        }
    }

    public final void W() {
        FrameLayout.LayoutParams layoutParams;
        if (getMeasuredHeight() == 0 || this.E == null) {
            return;
        }
        int currentActionBarHeight = org.telegram.ui.ActionBar.k.getCurrentActionBarHeight();
        int i10 = AndroidUtilities.displaySize.y - currentActionBarHeight;
        int iDp = AndroidUtilities.dp(66.0f);
        int i11 = this.f32820u0;
        if (i11 == 1 || i11 == 7 || i11 == 8) {
            iDp += AndroidUtilities.dp(66.0f);
        }
        int iDp2 = (i10 - iDp) - AndroidUtilities.dp(90.0f);
        int iDp3 = AndroidUtilities.dp(189.0f);
        this.f32821v0 = iDp3;
        if (!this.T || !X()) {
            iDp2 = Math.min(AndroidUtilities.dp(310.0f), iDp2);
        }
        this.f32823w0 = Math.max(iDp3, iDp2);
        if (this.T && X()) {
            this.f32821v0 = this.f32823w0;
        }
        hh.f1 f1Var = this.L;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) f1Var.getLayoutParams();
        layoutParams2.topMargin = currentActionBarHeight;
        f1Var.setLayoutParams(layoutParams2);
        ag.p1 p1Var = this.J;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) p1Var.getLayoutParams();
        layoutParams3.topMargin = currentActionBarHeight;
        layoutParams3.height = this.f32823w0;
        p1Var.setLayoutParams(layoutParams3);
        zk0 zk0Var = this.M;
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) zk0Var.getLayoutParams();
        layoutParams4.topMargin = currentActionBarHeight;
        zk0Var.setLayoutParams(layoutParams4);
        int iDp4 = AndroidUtilities.dp(16.0f) + ((this.T && X()) ? this.f32821v0 - f1Var.getPaddingTop() : this.f32821v0);
        pf.h0 h0Var = this.K;
        h0Var.P(iDp4);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.E.getView().getLayoutParams();
        if (layoutParams5 != null) {
            layoutParams5.height = AndroidUtilities.dp(10.0f) + this.f32823w0;
            this.E.getView().setLayoutParams(layoutParams5);
        }
        qk qkVar = this.B;
        if (qkVar != null && (layoutParams = (FrameLayout.LayoutParams) qkVar.getLayoutParams()) != null) {
            layoutParams.height = AndroidUtilities.dp(10.0f) + this.f32823w0;
            qkVar.setLayoutParams(layoutParams);
        }
        h0Var.l();
        e0();
    }

    public final boolean X() {
        int i10 = this.f32820u0;
        return i10 == 0 || i10 == 1;
    }

    public final void Y() {
        Activity parentActivity;
        if (this.f32819t0 == null || getParentActivity() == null || this.m0 == null) {
            return;
        }
        boolean z10 = this.f32804g0;
        org.telegram.ui.ActionBar.c6 c6Var = this.f34899a;
        if (z10 && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
            this.f32804g0 = false;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (Math.abs((System.currentTimeMillis() / 1000) - ((long) globalMainSettings.getInt("backgroundloc", 0))) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                y4.l(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new dk(this, 2), c6Var).o();
                return;
            }
        }
        long j10 = this.V;
        y4.E(getParentActivity(), false, DialogObject.isUserDialog(j10) ? this.f34900b.f28635b0.getMessagesController().getUser(Long.valueOf(j10)) : null, new MessagesStorage.IntCallback() {
            @Override
            public final void run(int i10) {
                tk tkVar = this.f29049a;
                gi giVar = tkVar.f34900b;
                y4.a0(giVar.F1, giVar.j1() + 1, giVar.n1(), new lh.o6(tkVar, i10, 2));
            }
        }, c6Var).show();
    }

    public final void Z() {
        gi giVar = this.f34900b;
        if (!giVar.K) {
            Location lastLocation = getLastLocation();
            this.m0 = lastLocation;
            a0(lastLocation);
            return;
        }
        if (giVar.f28695t2 != null) {
            AndroidUtilities.runOnUIThread(new dk(this, 0));
            return;
        }
        if (this.T) {
            AndroidUtilities.runOnUIThread(new dk(this, 8));
            return;
        }
        File file = giVar.f28692s2;
        boolean z10 = giVar.f28688r2;
        if (file != null) {
            try {
                if (z10) {
                    try {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(23);
                        if (strExtractMetadata != null) {
                            Matcher matcher = Pattern.compile("([+\\-][0-9.]+)([+\\-][0-9.]+)").matcher(strExtractMetadata);
                            if (matcher.find() && matcher.groupCount() == 2) {
                                AndroidUtilities.runOnUIThread(new org.telegram.ui.Cells.q7(this, Double.parseDouble(matcher.group(1)), Double.parseDouble(matcher.group(2)), 2));
                                return;
                            }
                        }
                    } catch (NumberFormatException | Exception unused) {
                    }
                } else {
                    ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                    float[] fArr = new float[2];
                    if (exifInterface.getLatLong(fArr)) {
                        AndroidUtilities.runOnUIThread(new org.telegram.ui.yq(22, this, fArr));
                        return;
                    }
                }
            } catch (NumberFormatException | Exception unused2) {
            }
        }
        Location lastLocation2 = getLastLocation();
        this.m0 = lastLocation2;
        a0(lastLocation2);
    }

    public final void a0(Location location) {
        if (location == null) {
            return;
        }
        Location location2 = new Location(location);
        this.m0 = location2;
        IMapsProvider.IMap iMap = this.D;
        pf.h0 h0Var = this.K;
        if (iMap == null) {
            h0Var.M(location2);
            return;
        }
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
        if (h0Var != null) {
            if (!this.f32816r0 && this.f32820u0 != 8) {
                h0Var.H(null, this.m0, true);
            }
            h0Var.M(this.m0);
        }
        if (this.f32814q0) {
            return;
        }
        this.f32811n0 = new Location(location);
        if (this.f32818s0) {
            this.D.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
        } else {
            this.f32818s0 = true;
            this.D.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.D.getMaxZoomLevel() - 4.0f));
        }
    }

    public final void b0(double d, double d10) {
        if (this.D == null) {
            return;
        }
        if (d == 0.0d || d10 == 0.0d) {
            Location location = new Location("");
            this.m0 = location;
            location.reset();
            this.m0.setLatitude(d);
            this.m0.setLongitude(d10);
        } else {
            Location location2 = new Location("");
            this.f32811n0 = location2;
            location2.reset();
            this.f32811n0.setLatitude(d);
            this.f32811n0.setLongitude(d10);
        }
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(d, d10);
        IMapsProvider.ICameraUpdate iCameraUpdateNewCameraUpdateLatLngZoom = (d == 0.0d || d10 == 0.0d) ? ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.D.getMinZoomLevel()) : ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.D.getMaxZoomLevel() - 4.0f);
        this.F = iCameraUpdateNewCameraUpdateLatLngZoom;
        this.D.moveCamera(iCameraUpdateNewCameraUpdateLatLngZoom);
        pf.h0 h0Var = this.K;
        if (d == 0.0d || d10 == 0.0d) {
            h0Var.M(this.m0);
        } else {
            h0Var.L(this.f32811n0);
        }
        h0Var.I();
        this.L.v0(0, 1, null);
        this.f32813p0 = true;
        if (d == 0.0d || d10 == 0.0d) {
            return;
        }
        this.f32814q0 = true;
        d0(false);
        if (this.f32820u0 != 8) {
            h0Var.H(null, this.f32811n0, true);
        }
        this.f32816r0 = true;
        c0();
    }

    public final void c0() {
        if (this.K.h() != 0 && this.P.L0() == 0) {
            hh.f1 f1Var = this.L;
            View childAt = f1Var.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top < 0 || top > AndroidUtilities.dp(258.0f)) {
                return;
            }
            f1Var.v0(0, top, null);
        }
    }

    public final void d0(boolean z10) {
        Location location;
        Location location2;
        if (this.T) {
            z10 = false;
        }
        rk rkVar = this.f32817s;
        if (z10 && rkVar != null && rkVar.getTag() == null && ((location = this.m0) == null || (location2 = this.f32811n0) == null || location2.distanceTo(location) < 300.0f)) {
            z10 = false;
        }
        if (this.f32820u0 == 8) {
            z10 = false;
        }
        if (rkVar != null) {
            if (!z10 || rkVar.getTag() == null) {
                if (z10 || rkVar.getTag() != null) {
                    rkVar.setVisibility(z10 ? 0 : 4);
                    rkVar.setTag(z10 ? 1 : null);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(rkVar, (Property<rk, Float>) View.TRANSLATION_X, z10 ? 0.0f : -AndroidUtilities.dp(80.0f)));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(er.f28123g);
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
        nk nkVar = this.N;
        pf.h0 h0Var = this.K;
        int i13 = 0;
        if (i10 == i12) {
            this.T = false;
            this.S = false;
            Z();
            if (h0Var != null) {
                h0Var.O(this.T, this.S);
            }
            if (nkVar != null && nkVar.I != (z11 = this.T)) {
                nkVar.I = z11;
            }
            IMapsProvider.IMap iMap = this.D;
            if (iMap != null) {
                try {
                    iMap.setMyLocationEnabled(true);
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
            }
        } else if (i10 == NotificationCenter.locationPermissionDenied) {
            this.T = true;
            this.S = false;
            if (h0Var != null) {
                h0Var.O(true, false);
            }
            if (nkVar != null && nkVar.I != (z10 = this.T)) {
                nkVar.I = z10;
            }
        }
        W();
        boolean z12 = this.T;
        gi giVar = this.f34900b;
        if (!z12 || giVar.K) {
            giVar.getClass();
        } else {
            i13 = 8;
        }
        this.A.setVisibility(i13);
    }

    public final void e0() {
        ag.p1 p1Var;
        int y10;
        int iMin;
        IMapsProvider.LatLng latLng;
        Location location;
        IMapsProvider.IMap iMap;
        if (this.E == null || (p1Var = this.J) == null) {
            return;
        }
        hh.f1 f1Var = this.L;
        f2.o1 o1VarK = f1Var.K(0);
        if (o1VarK != null) {
            y10 = (int) o1VarK.f5789a.getY();
            iMin = Math.min(y10, 0) + this.f32821v0;
        } else {
            y10 = -p1Var.getMeasuredHeight();
            iMin = 0;
        }
        if (((FrameLayout.LayoutParams) p1Var.getLayoutParams()) != null) {
            qk qkVar = this.B;
            if (iMin <= 0) {
                if (this.E.getView().getVisibility() == 0) {
                    this.E.getView().setVisibility(4);
                    p1Var.setVisibility(4);
                    if (qkVar != null) {
                        qkVar.setVisibility(4);
                    }
                }
                this.E.getView().setTranslationY(y10);
                return;
            }
            if (this.E.getView().getVisibility() == 4) {
                this.E.getView().setVisibility(0);
                p1Var.setVisibility(0);
                if (qkVar != null) {
                    qkVar.setVisibility(0);
                }
            }
            int iMax = Math.max(0, (-((y10 - this.f32823w0) + this.f32821v0)) / 2);
            int iMin2 = this.f32823w0 - this.f32821v0;
            float fMax = 1.0f - Math.max(0.0f, Math.min(1.0f, (f1Var.getPaddingTop() - y10) / (f1Var.getPaddingTop() - iMin2)));
            int i10 = this.f32825x0;
            if (this.T && X()) {
                iMin2 += Math.min(y10, f1Var.getPaddingTop());
            }
            this.f32825x0 = (int) (iMin2 * fMax);
            float f10 = iMax;
            this.E.getView().setTranslationY(f10);
            this.f32827y0 = iMin2 - this.f32825x0;
            p1Var.invalidate();
            p1Var.setTranslationY(y10 - this.f32827y0);
            IMapsProvider.IMap iMap2 = this.D;
            if (iMap2 != null) {
                iMap2.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f) + this.f32825x0);
            }
            if (qkVar != null) {
                qkVar.setTranslationY(f10);
            }
            int iMax2 = Math.max(this.f32827y0 - y10, 0);
            int i11 = this.f32823w0;
            org.telegram.ui.ActionBar.v0 v0Var = this.f32815r;
            float fMin = Math.min(iMax2, (i11 - v0Var.getMeasuredHeight()) - AndroidUtilities.dp(80.0f));
            v0Var.setTranslationY(fMin);
            rk rkVar = this.f32817s;
            rkVar.f32198c = fMin;
            rkVar.setTranslationY(fMin + rkVar.f32197b);
            this.f32810n.setTranslationY(-this.f32825x0);
            int iC = org.telegram.messenger.rl.C(48.0f, (this.f32823w0 - this.f32825x0) / 2, iMax);
            this.f32812o0 = iC;
            this.O.setTranslationY(iC);
            if (i10 != this.f32825x0) {
                IMapsProvider.IMarker iMarker = this.f32800c0;
                if (iMarker != null) {
                    latLng = new IMapsProvider.LatLng(iMarker.getPosition().latitude, this.f32800c0.getPosition().longitude);
                } else if (!this.f32814q0 || (location = this.f32811n0) == null) {
                    Location location2 = this.m0;
                    latLng = location2 != null ? new IMapsProvider.LatLng(location2.getLatitude(), this.m0.getLongitude()) : null;
                } else {
                    latLng = new IMapsProvider.LatLng(location.getLatitude(), this.f32811n0.getLongitude());
                }
                if (latLng != null && (iMap = this.D) != null) {
                    iMap.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                }
            }
            if (this.T && X()) {
                int iH = this.K.h();
                for (int i12 = 1; i12 < iH; i12++) {
                    f2.o1 o1VarK2 = f1Var.K(i12);
                    if (o1VarK2 != null) {
                        o1VarK2.f5789a.setTranslationY(f1Var.getPaddingTop() - y10);
                    }
                }
            }
        }
    }

    public final void f0() {
        boolean z10 = this.f32805h0;
        LinearLayout linearLayout = this.v;
        if (!z10) {
            linearLayout.setVisibility(8);
            return;
        }
        boolean z11 = this.f32807j0;
        zk0 zk0Var = this.M;
        if (!z11) {
            zk0Var.setEmptyView(linearLayout);
        } else {
            zk0Var.setEmptyView(null);
            linearLayout.setVisibility(8);
        }
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(56.0f);
    }

    @Override
    public int getCurrentItemTop() {
        hh.f1 f1Var = this.L;
        if (f1Var.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        lk0 lk0Var = (lk0) f1Var.K(0);
        return AndroidUtilities.dp(56.0f) + (lk0Var != null ? Math.max(((int) lk0Var.f5789a.getY()) - this.f32827y0, 0) : 0);
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
    public ArrayList<org.telegram.ui.ActionBar.i6> getThemeDescriptions() {
        ArrayList<org.telegram.ui.ActionBar.i6> arrayList = new ArrayList<>();
        s6 s6Var = new s6(this, 2);
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.J, 1, null, null, null, null, org.telegram.ui.ActionBar.g6.f23124h5));
        int i10 = org.telegram.ui.ActionBar.g6.A5;
        hh.f1 f1Var = this.L;
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 32768, null, null, null, null, i10));
        org.telegram.ui.ActionBar.v0 v0Var = this.A;
        arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var != null ? v0Var.getSearchField() : null, 16777216, null, null, null, null, org.telegram.ui.ActionBar.g6.f23161j5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 4096, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144i6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{View.class}, org.telegram.ui.ActionBar.g6.f23175k0, null, null, org.telegram.ui.ActionBar.g6.f23054d7));
        int i11 = org.telegram.ui.ActionBar.g6.W5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32822w, 8, null, null, null, null, i11));
        int i12 = org.telegram.ui.ActionBar.g6.X5;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32824x, 4, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32826y, 4, null, null, null, null, i12));
        int i13 = org.telegram.ui.ActionBar.g6.ui;
        ImageView imageView = this.f32810n;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 262152, null, null, null, null, i13));
        int i14 = org.telegram.ui.ActionBar.g6.vi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 262152, null, null, null, null, i14));
        int i15 = org.telegram.ui.ActionBar.g6.wi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 32, null, null, null, null, i15));
        int i16 = org.telegram.ui.ActionBar.g6.xi;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 65568, null, null, null, null, i16));
        org.telegram.ui.ActionBar.v0 v0Var2 = this.f32815r;
        arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var2, 0, null, null, null, s6Var, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var2, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(v0Var2, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32817s, 4, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32817s, 32, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f32817s, 65568, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, org.telegram.ui.ActionBar.g6.f23295r0, s6Var, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, s6Var, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.si));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.ti));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.yi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 393216, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.ni));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 393216, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.qi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 393248, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.mi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 393248, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"imageView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.pi));
        int i17 = org.telegram.ui.ActionBar.g6.A6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"accurateTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 262144, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.ri));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 262144, new Class[]{org.telegram.ui.Cells.p6.class}, new String[]{"titleTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.oi));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"buttonTextView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 131072, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 196608, new Class[]{org.telegram.ui.Cells.s4.class}, new String[]{"frameLayout"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 32, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23018b7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 48, new Class[]{org.telegram.ui.Cells.w6.class}, null, null, null, org.telegram.ui.ActionBar.g6.f22999a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.j4.class}, new String[]{"textView"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23233n5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 32, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        int i18 = org.telegram.ui.ActionBar.g6.G6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
        zk0 zk0Var = this.M;
        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 32, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(zk0Var, 0, new Class[]{org.telegram.ui.Cells.r4.class}, new String[]{"addressTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r7.class}, new String[]{"nameTextView"}, null, null, -1, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.r7.class}, new String[]{"distanceTextView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"progressBar"}, null, null, -1, null, org.telegram.ui.ActionBar.g6.f23125h6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.t4.class}, new String[]{"imageView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"textView"}, null, null, -1, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 8, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"imageView"}, null, null, -1, null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.i6(f1Var, 0, new Class[]{org.telegram.ui.Cells.u4.class}, new String[]{"textView2"}, null, null, -1, null, i12));
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
        ag.p1 p1Var = this.J;
        if (p1Var != null) {
            p1Var.invalidate();
        }
        try {
            IMapsProvider.IMap iMap = this.D;
            if (iMap != null) {
                iMap.setMyLocationEnabled(false);
            }
        } catch (Exception e9) {
            FileLog.e(e9);
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
        pf.h0 h0Var = this.K;
        if (h0Var != null) {
            h0Var.F();
        }
        nk nkVar = this.N;
        if (nkVar != null) {
            nkVar.F();
        }
        gi giVar = this.f34900b;
        giVar.T0.h(true);
        giVar.T0.n().removeView(this.A);
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
    public final void s() {
        this.A.setVisibility(8);
    }

    public void setDelegate(ok okVar) {
        this.f32819t0 = okVar;
    }

    @Override
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        this.f34900b.getSheetContainer().invalidate();
        e0();
    }

    @Override
    public final void w() {
        gi giVar = this.f34900b;
        this.K.Y = (giVar == null || giVar.isKeyboardVisible()) ? false : true;
    }

    @Override
    public final void x(int i10, boolean z10) {
        if (z10) {
            this.K.Y = false;
        }
    }

    @Override
    public final void y() {
        IMapsProvider.IMapView iMapView = this.E;
        if (iMapView != null && this.f32808k0) {
            try {
                iMapView.onPause();
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        this.f32809l0 = false;
    }

    @Override
    public final void z(int i10, int i11) {
        int iDp;
        int i12;
        gi giVar = this.f34900b;
        if (giVar.T0.f23578j0 || giVar.f28674n1.R() > AndroidUtilities.dp(20.0f)) {
            iDp = this.f32823w0 - this.f32821v0;
            giVar.setAllowNestedScroll(false);
        } else {
            if (AndroidUtilities.isTablet()) {
                i12 = (i11 / 5) * 2;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i12 = (int) (i11 / 3.5f);
                } else {
                    i12 = (i11 / 5) * 2;
                }
            }
            iDp = i12 - AndroidUtilities.dp(52.0f);
            if (iDp < 0) {
                iDp = 0;
            }
            giVar.setAllowNestedScroll(true);
        }
        this.L.o1(0, iDp, 0, this.f34902e);
        this.M.o1(0, 0, 0, this.f34902e);
    }
}
