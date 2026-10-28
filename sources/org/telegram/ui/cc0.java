package org.telegram.ui;

import android.graphics.Bitmap;
import android.location.Location;
import android.location.LocationManager;
import android.widget.ImageView;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLRPC;
public final class cc0 implements q0.a {
    public final int f38261a;
    public final rc0 f38262b;

    public cc0(rc0 rc0Var, int i10) {
        this.f38261a = i10;
        this.f38262b = rc0Var;
    }

    @Override
    public final void accept(Object obj) {
        int i10;
        float maxZoomLevel;
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i11;
        switch (this.f38261a) {
            case 0:
                rc0 rc0Var = this.f38262b;
                rc0Var.I = (IMapsProvider.IMap) obj;
                if (AndroidUtilities.computePerceivedBrightness(rc0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23357d6)) < 0.721f) {
                    i10 = R.raw.mapstyle_night;
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    rc0Var.f42922a0 = true;
                    rc0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                }
                rc0Var.I.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (rc0Var.I != null) {
                    rc0Var.K.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    if (rc0Var.M0) {
                        maxZoomLevel = rc0Var.I.getMinZoomLevel() + 4.0f;
                    } else {
                        maxZoomLevel = rc0Var.I.getMaxZoomLevel() - 4.0f;
                    }
                    TLRPC.TL_channelLocation tL_channelLocation = rc0Var.f42954y0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        ?? obj2 = new Object();
                        if (DialogObject.isUserDialog(rc0Var.f42928e0)) {
                            obj2.f41076c = rc0Var.getMessagesController().getUser(Long.valueOf(rc0Var.f42928e0));
                        } else {
                            obj2.d = rc0Var.getMessagesController().getChat(Long.valueOf(-rc0Var.f42928e0));
                        }
                        obj2.f41074a = rc0Var.f42928e0;
                        rc0Var.w0(obj2);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap h02 = rc0Var.h0(obj2);
                            if (h02 != null) {
                                position.icon(h02);
                                position.anchor(0.5f, 0.907f);
                                obj2.e = rc0Var.I.addMarker(position);
                                if (!UserObject.isUserSelf(obj2.f41076c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    obj2.f41077f = rc0Var.I.addMarker(flat);
                                }
                                rc0Var.f42931g0.add(obj2);
                                rc0Var.f42932h0.k(obj2, obj2.f41074a);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        rc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(obj2.e.getPosition(), maxZoomLevel));
                    } else {
                        MessageObject messageObject = rc0Var.A0;
                        if (messageObject != null) {
                            if (messageObject.isLiveLocation()) {
                                lc0 c02 = rc0Var.c0(rc0Var.A0.messageOwner);
                                if (!rc0Var.m0()) {
                                    rc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(c02.e.getPosition(), maxZoomLevel));
                                }
                            } else {
                                IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(rc0Var.f42950w0.getLatitude(), rc0Var.f42950w0.getLongitude());
                                try {
                                    rc0Var.I.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                                rc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, maxZoomLevel));
                                rc0Var.f42930f0 = false;
                                rc0Var.m0();
                            }
                        } else {
                            Location location = new Location("network");
                            rc0Var.f42950w0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = rc0Var.f42955z0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                rc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), maxZoomLevel));
                                rc0Var.f42950w0.setLatitude(rc0Var.f42955z0.geo_point.lat);
                                rc0Var.f42950w0.setLongitude(rc0Var.f42955z0.geo_point._long);
                                rc0Var.f42950w0.setAccuracy(rc0Var.f42955z0.geo_point.accuracy_radius);
                                rc0Var.T.L(rc0Var.f42950w0);
                            } else {
                                location.setLatitude(20.659322d);
                                rc0Var.f42950w0.setLongitude(-11.40625d);
                            }
                        }
                    }
                    try {
                        rc0Var.I.setMyLocationEnabled(true);
                    } catch (Exception e11) {
                        FileLog.e((Throwable) e11, false);
                    }
                    rc0Var.I.getUiSettings().setMyLocationButtonEnabled(false);
                    rc0Var.I.getUiSettings().setZoomControlsEnabled(false);
                    rc0Var.I.getUiSettings().setCompassEnabled(false);
                    rc0Var.I.setOnCameraMoveStartedListener(new yb0(rc0Var, 4));
                    rc0Var.I.setOnMyLocationChangeListener(new cc0(rc0Var, 1));
                    rc0Var.I.setOnMarkerClickListener(new m4.l0(rc0Var, maxZoomLevel));
                    rc0Var.I.setOnCameraMoveListener(new zb0(rc0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            rc0Var.f42948v0 = location2;
                            rc0Var.u0(location2);
                            if (rc0Var.f42924b0 && rc0Var.getParentActivity() != null) {
                                rc0Var.f42924b0 = false;
                                rc0Var.e0();
                            }
                            imageView = rc0Var.f42925c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = rc0Var.getLocationController().getSharingLocationInfo(rc0Var.f42928e0)) != null && (i11 = sharingLocationInfo.proximityMeters) > 0) {
                                rc0Var.f0(i11);
                                return;
                            }
                            return;
                        }
                    }
                    rc0Var.f42948v0 = location2;
                    rc0Var.u0(location2);
                    if (rc0Var.f42924b0) {
                        rc0Var.f42924b0 = false;
                        rc0Var.e0();
                    }
                    imageView = rc0Var.f42925c;
                    if (imageView == null) {
                        return;
                    }
                    return;
                }
                return;
            default:
                rc0 rc0Var2 = this.f38262b;
                Location location3 = (Location) obj;
                rc0Var2.u0(location3);
                rc0Var2.getLocationController().setMapLocation(location3, rc0Var2.f42927d0);
                rc0Var2.f42927d0 = false;
                return;
        }
    }
}
