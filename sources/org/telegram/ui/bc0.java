package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.location.Location;
import android.location.LocationManager;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class bc0 implements q0.a {
    public final int f36762a;
    public final rc0 f36763b;

    public bc0(rc0 rc0Var, int i10) {
        this.f36762a = i10;
        this.f36763b = rc0Var;
    }

    @Override
    public final void accept(Object obj) {
        int i10;
        final float maxZoomLevel;
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i11;
        switch (this.f36762a) {
            case 0:
                final rc0 rc0Var = this.f36763b;
                rc0Var.E = (IMapsProvider.IMap) obj;
                if (AndroidUtilities.computePerceivedBrightness(rc0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23062d6)) < 0.721f) {
                    i10 = R.raw.mapstyle_night;
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    rc0Var.W = true;
                    rc0Var.E.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                }
                rc0Var.E.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (rc0Var.E != null) {
                    rc0Var.G.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    if (rc0Var.J0) {
                        maxZoomLevel = rc0Var.E.getMinZoomLevel() + 4.0f;
                    } else {
                        maxZoomLevel = rc0Var.E.getMaxZoomLevel() - 4.0f;
                    }
                    TLRPC.TL_channelLocation tL_channelLocation = rc0Var.f42060v0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        ?? obj2 = new Object();
                        if (DialogObject.isUserDialog(rc0Var.f42033a0)) {
                            obj2.f40166c = rc0Var.getMessagesController().getUser(Long.valueOf(rc0Var.f42033a0));
                        } else {
                            obj2.d = rc0Var.getMessagesController().getChat(Long.valueOf(-rc0Var.f42033a0));
                        }
                        obj2.f40164a = rc0Var.f42033a0;
                        rc0Var.v0(obj2);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap g02 = rc0Var.g0(obj2);
                            if (g02 != null) {
                                position.icon(g02);
                                position.anchor(0.5f, 0.907f);
                                obj2.f40167e = rc0Var.E.addMarker(position);
                                if (!UserObject.isUserSelf(obj2.f40166c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    obj2.f40168f = rc0Var.E.addMarker(flat);
                                }
                                rc0Var.f42037c0.add(obj2);
                                rc0Var.f42038d0.k(obj2, obj2.f40164a);
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        rc0Var.E.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(obj2.f40167e.getPosition(), maxZoomLevel));
                    } else {
                        MessageObject messageObject = rc0Var.f42064x0;
                        if (messageObject != null) {
                            if (messageObject.isLiveLocation()) {
                                lc0 c02 = rc0Var.c0(rc0Var.f42064x0.messageOwner);
                                if (!rc0Var.l0()) {
                                    rc0Var.E.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(c02.f40167e.getPosition(), maxZoomLevel));
                                }
                            } else {
                                IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(rc0Var.f42058t0.getLatitude(), rc0Var.f42058t0.getLongitude());
                                try {
                                    rc0Var.E.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                                } catch (Exception e11) {
                                    FileLog.e(e11);
                                }
                                rc0Var.E.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, maxZoomLevel));
                                rc0Var.f42035b0 = false;
                                rc0Var.l0();
                            }
                        } else {
                            Location location = new Location("network");
                            rc0Var.f42058t0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = rc0Var.f42062w0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                rc0Var.E.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), maxZoomLevel));
                                rc0Var.f42058t0.setLatitude(rc0Var.f42062w0.geo_point.lat);
                                rc0Var.f42058t0.setLongitude(rc0Var.f42062w0.geo_point._long);
                                rc0Var.f42058t0.setAccuracy(rc0Var.f42062w0.geo_point.accuracy_radius);
                                rc0Var.P.L(rc0Var.f42058t0);
                            } else {
                                location.setLatitude(20.659322d);
                                rc0Var.f42058t0.setLongitude(-11.40625d);
                            }
                        }
                    }
                    try {
                        rc0Var.E.setMyLocationEnabled(true);
                    } catch (Exception e12) {
                        FileLog.e((Throwable) e12, false);
                    }
                    rc0Var.E.getUiSettings().setMyLocationButtonEnabled(false);
                    rc0Var.E.getUiSettings().setZoomControlsEnabled(false);
                    rc0Var.E.getUiSettings().setCompassEnabled(false);
                    rc0Var.E.setOnCameraMoveStartedListener(new xb0(rc0Var, 4));
                    rc0Var.E.setOnMyLocationChangeListener(new bc0(rc0Var, 1));
                    rc0Var.E.setOnMarkerClickListener(new IMapsProvider.OnMarkerClickListener() {
                        @Override
                        public final boolean onClick(IMapsProvider.IMarker iMarker) {
                            int i12;
                            int i13;
                            int i14;
                            rc0 rc0Var2 = rc0.this;
                            ArrayList arrayList = rc0Var2.f42037c0;
                            if (iMarker.getTag() instanceof qc0) {
                                rc0Var2.T.setVisibility(4);
                                if (!rc0Var2.f42066y0) {
                                    ImageView imageView2 = rc0Var2.f42032a;
                                    int i15 = org.telegram.ui.ActionBar.g6.ui;
                                    imageView2.setColorFilter(new PorterDuffColorFilter(rc0Var2.getThemedColor(i15), PorterDuff.Mode.MULTIPLY));
                                    rc0Var2.f42032a.setTag(Integer.valueOf(i15));
                                    rc0Var2.f42066y0 = true;
                                }
                                int i16 = 0;
                                while (true) {
                                    if (i16 >= arrayList.size()) {
                                        break;
                                    }
                                    lc0 lc0Var = (lc0) arrayList.get(i16);
                                    if (lc0Var != null && lc0Var.f40167e == iMarker) {
                                        rc0Var2.f42040e0 = lc0Var.f40164a;
                                        if (rc0Var2.f42042f0) {
                                            rc0Var2.f42042f0 = false;
                                            rc0Var2.C0();
                                        }
                                        rc0Var2.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(lc0Var.f40167e.getPosition(), maxZoomLevel));
                                    } else {
                                        i16++;
                                    }
                                }
                                oc0 oc0Var = rc0Var2.f42063x;
                                rc0 rc0Var3 = oc0Var.f41090b;
                                HashMap hashMap = oc0Var.f41089a;
                                qc0 qc0Var = (qc0) iMarker.getTag();
                                if (qc0Var != null && rc0Var3.f42046j0 != qc0Var) {
                                    rc0Var3.y0(false);
                                    IMapsProvider.IMarker iMarker2 = rc0Var3.f42045i0;
                                    if (iMarker2 != null) {
                                        View view = (View) hashMap.get(iMarker2);
                                        if (view != null) {
                                            oc0Var.removeView(view);
                                            hashMap.remove(iMarker2);
                                        }
                                        rc0Var3.f42045i0 = null;
                                    }
                                    rc0Var3.f42046j0 = qc0Var;
                                    rc0Var3.f42045i0 = iMarker;
                                    Context context = oc0Var.getContext();
                                    FrameLayout frameLayout = new FrameLayout(context);
                                    oc0Var.addView(frameLayout, i7.f6.c(114.0f, -2));
                                    FrameLayout frameLayout2 = new FrameLayout(context);
                                    rc0Var3.f42047k0 = frameLayout2;
                                    frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                                    rc0Var3.f42047k0.getBackground().setColorFilter(new PorterDuffColorFilter(rc0Var3.getThemedColor(org.telegram.ui.ActionBar.g6.f23133h5), PorterDuff.Mode.MULTIPLY));
                                    frameLayout.addView(rc0Var3.f42047k0, i7.f6.c(71.0f, -2));
                                    rc0Var3.f42047k0.setAlpha(0.0f);
                                    int i17 = 5;
                                    rc0Var3.f42047k0.setOnClickListener(new t70(5, oc0Var, qc0Var));
                                    TextView textView = new TextView(context);
                                    textView.setTextSize(1, 16.0f);
                                    textView.setMaxLines(1);
                                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                    textView.setEllipsize(truncateAt);
                                    textView.setSingleLine(true);
                                    textView.setTextColor(rc0Var3.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                                    textView.setTypeface(AndroidUtilities.bold());
                                    if (LocaleController.isRTL) {
                                        i12 = 5;
                                    } else {
                                        i12 = 3;
                                    }
                                    textView.setGravity(i12);
                                    FrameLayout frameLayout3 = rc0Var3.f42047k0;
                                    if (LocaleController.isRTL) {
                                        i13 = 5;
                                    } else {
                                        i13 = 3;
                                    }
                                    TextView h = th.h(frameLayout3, textView, i7.f6.d(-2, -2.0f, i13 | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                                    h.setTextSize(1, 14.0f);
                                    h.setMaxLines(1);
                                    h.setEllipsize(truncateAt);
                                    h.setSingleLine(true);
                                    h.setTextColor(rc0Var3.getThemedColor(org.telegram.ui.ActionBar.g6.A6));
                                    if (LocaleController.isRTL) {
                                        i14 = 5;
                                    } else {
                                        i14 = 3;
                                    }
                                    h.setGravity(i14);
                                    FrameLayout frameLayout4 = rc0Var3.f42047k0;
                                    if (!LocaleController.isRTL) {
                                        i17 = 3;
                                    }
                                    frameLayout4.addView(h, i7.f6.d(-2, -2.0f, i17 | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                                    textView.setText(qc0Var.f41622c.title);
                                    h.setText(LocaleController.getString(R.string.TapToSendLocation));
                                    FrameLayout frameLayout5 = new FrameLayout(context);
                                    frameLayout5.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.s4.a(qc0Var.f41620a)));
                                    frameLayout.addView(frameLayout5, i7.f6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                                    org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(context);
                                    t9Var.f(a4.w.q(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), qc0Var.f41622c.venue_type, "_64.png"), null, null);
                                    frameLayout5.addView(t9Var, i7.f6.e(30, 30, 17));
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat.addUpdateListener(new nc0(oc0Var, frameLayout5));
                                    ofFloat.setDuration(360L);
                                    ofFloat.start();
                                    hashMap.put(iMarker, frameLayout);
                                    rc0Var3.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
                                }
                            }
                            return true;
                        }
                    });
                    rc0Var.E.setOnCameraMoveListener(new zb0(rc0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            rc0Var.f42057s0 = location2;
                            rc0Var.t0(location2);
                            if (rc0Var.X && rc0Var.getParentActivity() != null) {
                                rc0Var.X = false;
                                rc0Var.d0();
                            }
                            imageView = rc0Var.f42036c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = rc0Var.getLocationController().getSharingLocationInfo(rc0Var.f42033a0)) != null && (i11 = sharingLocationInfo.proximityMeters) > 0) {
                                rc0Var.e0(i11);
                                return;
                            }
                            return;
                        }
                    }
                    rc0Var.f42057s0 = location2;
                    rc0Var.t0(location2);
                    if (rc0Var.X) {
                        rc0Var.X = false;
                        rc0Var.d0();
                    }
                    imageView = rc0Var.f42036c;
                    if (imageView == null) {
                        return;
                    }
                    return;
                }
                return;
            default:
                rc0 rc0Var2 = this.f36763b;
                Location location3 = (Location) obj;
                rc0Var2.t0(location3);
                rc0Var2.getLocationController().setMapLocation(location3, rc0Var2.Z);
                rc0Var2.Z = false;
                return;
        }
    }
}
