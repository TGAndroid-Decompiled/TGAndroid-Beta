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
public final class mc0 implements q0.a {
    public final int f38948a;
    public final bd0 f38949b;

    public mc0(bd0 bd0Var, int i10) {
        this.f38948a = i10;
        this.f38949b = bd0Var;
    }

    @Override
    public final void accept(Object obj) {
        int i10;
        final float maxZoomLevel;
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i11;
        switch (this.f38948a) {
            case 0:
                final bd0 bd0Var = this.f38949b;
                bd0Var.F = (IMapsProvider.IMap) obj;
                if (AndroidUtilities.computePerceivedBrightness(bd0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21661d6)) < 0.721f) {
                    i10 = R.raw.mapstyle_night;
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    bd0Var.X = true;
                    bd0Var.F.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                }
                bd0Var.F.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (bd0Var.F != null) {
                    bd0Var.H.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    if (bd0Var.K0) {
                        maxZoomLevel = bd0Var.F.getMinZoomLevel() + 4.0f;
                    } else {
                        maxZoomLevel = bd0Var.F.getMaxZoomLevel() - 4.0f;
                    }
                    TLRPC.TL_channelLocation tL_channelLocation = bd0Var.f35498w0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        ?? obj2 = new Object();
                        if (DialogObject.isUserDialog(bd0Var.f35471b0)) {
                            obj2.f42085c = bd0Var.getMessagesController().getUser(Long.valueOf(bd0Var.f35471b0));
                        } else {
                            obj2.d = bd0Var.getMessagesController().getChat(Long.valueOf(-bd0Var.f35471b0));
                        }
                        obj2.f42083a = bd0Var.f35471b0;
                        bd0Var.v0(obj2);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap g02 = bd0Var.g0(obj2);
                            if (g02 != null) {
                                position.icon(g02);
                                position.anchor(0.5f, 0.907f);
                                obj2.f42086e = bd0Var.F.addMarker(position);
                                if (!UserObject.isUserSelf(obj2.f42085c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    obj2.f42087f = bd0Var.F.addMarker(flat);
                                }
                                bd0Var.f35474d0.add(obj2);
                                bd0Var.f35476e0.k(obj2, obj2.f42083a);
                            }
                        } catch (Exception e6) {
                            FileLog.e(e6);
                        }
                        bd0Var.F.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(obj2.f42086e.getPosition(), maxZoomLevel));
                    } else {
                        MessageObject messageObject = bd0Var.f35502y0;
                        if (messageObject != null) {
                            if (messageObject.isLiveLocation()) {
                                vc0 c02 = bd0Var.c0(bd0Var.f35502y0.messageOwner);
                                if (!bd0Var.l0()) {
                                    bd0Var.F.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(c02.f42086e.getPosition(), maxZoomLevel));
                                }
                            } else {
                                IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(bd0Var.f35495u0.getLatitude(), bd0Var.f35495u0.getLongitude());
                                try {
                                    bd0Var.F.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                                bd0Var.F.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, maxZoomLevel));
                                bd0Var.f35473c0 = false;
                                bd0Var.l0();
                            }
                        } else {
                            Location location = new Location("network");
                            bd0Var.f35495u0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = bd0Var.f35500x0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                bd0Var.F.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), maxZoomLevel));
                                bd0Var.f35495u0.setLatitude(bd0Var.f35500x0.geo_point.lat);
                                bd0Var.f35495u0.setLongitude(bd0Var.f35500x0.geo_point._long);
                                bd0Var.f35495u0.setAccuracy(bd0Var.f35500x0.geo_point.accuracy_radius);
                                bd0Var.Q.L(bd0Var.f35495u0);
                            } else {
                                location.setLatitude(20.659322d);
                                bd0Var.f35495u0.setLongitude(-11.40625d);
                            }
                        }
                    }
                    try {
                        bd0Var.F.setMyLocationEnabled(true);
                    } catch (Exception e11) {
                        FileLog.e((Throwable) e11, false);
                    }
                    bd0Var.F.getUiSettings().setMyLocationButtonEnabled(false);
                    bd0Var.F.getUiSettings().setZoomControlsEnabled(false);
                    bd0Var.F.getUiSettings().setCompassEnabled(false);
                    bd0Var.F.setOnCameraMoveStartedListener(new ic0(bd0Var, 4));
                    bd0Var.F.setOnMyLocationChangeListener(new mc0(bd0Var, 1));
                    bd0Var.F.setOnMarkerClickListener(new IMapsProvider.OnMarkerClickListener() {
                        @Override
                        public final boolean onClick(IMapsProvider.IMarker iMarker) {
                            int i12;
                            int i13;
                            int i14;
                            int i15;
                            bd0 bd0Var2 = bd0.this;
                            ArrayList arrayList = bd0Var2.f35474d0;
                            if (iMarker.getTag() instanceof ad0) {
                                bd0Var2.U.setVisibility(4);
                                if (!bd0Var2.f35503z0) {
                                    ImageView imageView2 = bd0Var2.f35468a;
                                    int i16 = org.telegram.ui.ActionBar.k6.ui;
                                    imageView2.setColorFilter(new PorterDuffColorFilter(bd0Var2.getThemedColor(i16), PorterDuff.Mode.MULTIPLY));
                                    bd0Var2.f35468a.setTag(Integer.valueOf(i16));
                                    bd0Var2.f35503z0 = true;
                                }
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= arrayList.size()) {
                                        break;
                                    }
                                    vc0 vc0Var = (vc0) arrayList.get(i17);
                                    if (vc0Var != null && vc0Var.f42086e == iMarker) {
                                        bd0Var2.f35478f0 = vc0Var.f42083a;
                                        if (bd0Var2.f35479g0) {
                                            bd0Var2.f35479g0 = false;
                                            bd0Var2.C0();
                                        }
                                        bd0Var2.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(vc0Var.f42086e.getPosition(), maxZoomLevel));
                                    } else {
                                        i17++;
                                    }
                                }
                                yc0 yc0Var = bd0Var2.f35499x;
                                bd0 bd0Var3 = yc0Var.f43597b;
                                HashMap hashMap = yc0Var.f43596a;
                                ad0 ad0Var = (ad0) iMarker.getTag();
                                if (ad0Var != null && bd0Var3.f35483k0 != ad0Var) {
                                    bd0Var3.y0(false);
                                    IMapsProvider.IMarker iMarker2 = bd0Var3.f35482j0;
                                    if (iMarker2 != null) {
                                        View view = (View) hashMap.get(iMarker2);
                                        if (view != null) {
                                            yc0Var.removeView(view);
                                            hashMap.remove(iMarker2);
                                        }
                                        bd0Var3.f35482j0 = null;
                                    }
                                    bd0Var3.f35483k0 = ad0Var;
                                    bd0Var3.f35482j0 = iMarker;
                                    Context context = yc0Var.getContext();
                                    FrameLayout frameLayout = new FrameLayout(context);
                                    yc0Var.addView(frameLayout, k7.c6.c(114.0f, -2));
                                    FrameLayout frameLayout2 = new FrameLayout(context);
                                    bd0Var3.f35484l0 = frameLayout2;
                                    frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                                    bd0Var3.f35484l0.getBackground().setColorFilter(new PorterDuffColorFilter(bd0Var3.getThemedColor(org.telegram.ui.ActionBar.k6.f21733h5), PorterDuff.Mode.MULTIPLY));
                                    frameLayout.addView(bd0Var3.f35484l0, k7.c6.c(71.0f, -2));
                                    bd0Var3.f35484l0.setAlpha(0.0f);
                                    bd0Var3.f35484l0.setOnClickListener(new hb0(2, yc0Var, ad0Var));
                                    TextView textView = new TextView(context);
                                    textView.setTextSize(1, 16.0f);
                                    textView.setMaxLines(1);
                                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                    textView.setEllipsize(truncateAt);
                                    textView.setSingleLine(true);
                                    textView.setTextColor(bd0Var3.getThemedColor(org.telegram.ui.ActionBar.k6.G6));
                                    textView.setTypeface(AndroidUtilities.bold());
                                    if (LocaleController.isRTL) {
                                        i12 = 5;
                                    } else {
                                        i12 = 3;
                                    }
                                    textView.setGravity(i12);
                                    FrameLayout frameLayout3 = bd0Var3.f35484l0;
                                    if (LocaleController.isRTL) {
                                        i13 = 5;
                                    } else {
                                        i13 = 3;
                                    }
                                    TextView h = yh.h(frameLayout3, textView, k7.c6.d(-2, -2.0f, i13 | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                                    h.setTextSize(1, 14.0f);
                                    h.setMaxLines(1);
                                    h.setEllipsize(truncateAt);
                                    h.setSingleLine(true);
                                    h.setTextColor(bd0Var3.getThemedColor(org.telegram.ui.ActionBar.k6.A6));
                                    if (LocaleController.isRTL) {
                                        i14 = 5;
                                    } else {
                                        i14 = 3;
                                    }
                                    h.setGravity(i14);
                                    FrameLayout frameLayout4 = bd0Var3.f35484l0;
                                    if (LocaleController.isRTL) {
                                        i15 = 5;
                                    } else {
                                        i15 = 3;
                                    }
                                    frameLayout4.addView(h, k7.c6.d(-2, -2.0f, i15 | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                                    textView.setText(ad0Var.f35145c.title);
                                    h.setText(LocaleController.getString(R.string.TapToSendLocation));
                                    FrameLayout frameLayout5 = new FrameLayout(context);
                                    frameLayout5.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.u4.a(ad0Var.f35143a)));
                                    frameLayout.addView(frameLayout5, k7.c6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                                    org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
                                    p9Var.f(android.support.v4.media.a.r(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), ad0Var.f35145c.venue_type, "_64.png"), null, null);
                                    frameLayout5.addView(p9Var, k7.c6.e(30, 30, 17));
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat.addUpdateListener(new xc0(yc0Var, frameLayout5));
                                    ofFloat.setDuration(360L);
                                    ofFloat.start();
                                    hashMap.put(iMarker, frameLayout);
                                    bd0Var3.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
                                }
                            }
                            return true;
                        }
                    });
                    bd0Var.F.setOnCameraMoveListener(new kc0(bd0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            bd0Var.f35494t0 = location2;
                            bd0Var.t0(location2);
                            if (bd0Var.Y && bd0Var.getParentActivity() != null) {
                                bd0Var.Y = false;
                                bd0Var.d0();
                            }
                            imageView = bd0Var.f35472c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = bd0Var.getLocationController().getSharingLocationInfo(bd0Var.f35471b0)) != null && (i11 = sharingLocationInfo.proximityMeters) > 0) {
                                bd0Var.e0(i11);
                                return;
                            }
                            return;
                        }
                    }
                    bd0Var.f35494t0 = location2;
                    bd0Var.t0(location2);
                    if (bd0Var.Y) {
                        bd0Var.Y = false;
                        bd0Var.d0();
                    }
                    imageView = bd0Var.f35472c;
                    if (imageView == null) {
                        return;
                    }
                    return;
                }
                return;
            default:
                bd0 bd0Var2 = this.f38949b;
                Location location3 = (Location) obj;
                bd0Var2.t0(location3);
                bd0Var2.getLocationController().setMapLocation(location3, bd0Var2.f35469a0);
                bd0Var2.f35469a0 = false;
                return;
        }
    }
}
