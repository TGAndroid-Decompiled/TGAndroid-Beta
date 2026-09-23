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
public final class pc0 implements q0.a {
    public final int f36083a;
    public final dd0 f36084b;

    public pc0(dd0 dd0Var, int i10) {
        this.f36083a = i10;
        this.f36084b = dd0Var;
    }

    @Override
    public final void accept(Object obj) {
        int i10;
        float maxZoomLevel;
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i11;
        switch (this.f36083a) {
            case 0:
                dd0 dd0Var = this.f36084b;
                dd0Var.I = (IMapsProvider.IMap) obj;
                if (AndroidUtilities.computePerceivedBrightness(dd0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f18789d6)) < 0.721f) {
                    i10 = R.raw.mapstyle_night;
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    dd0Var.f32581a0 = true;
                    dd0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                }
                dd0Var.I.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (dd0Var.I != null) {
                    dd0Var.K.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    if (dd0Var.N0) {
                        maxZoomLevel = dd0Var.I.getMinZoomLevel() + 4.0f;
                    } else {
                        maxZoomLevel = dd0Var.I.getMaxZoomLevel() - 4.0f;
                    }
                    TLRPC.TL_channelLocation tL_channelLocation = dd0Var.f32614z0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        ?? obj2 = new Object();
                        if (DialogObject.isUserDialog(dd0Var.f32587e0)) {
                            obj2.f39241c = dd0Var.getMessagesController().getUser(Long.valueOf(dd0Var.f32587e0));
                        } else {
                            obj2.d = dd0Var.getMessagesController().getChat(Long.valueOf(-dd0Var.f32587e0));
                        }
                        obj2.f39239a = dd0Var.f32587e0;
                        dd0Var.v0(obj2);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap g02 = dd0Var.g0(obj2);
                            if (g02 != null) {
                                position.icon(g02);
                                position.anchor(0.5f, 0.907f);
                                obj2.e = dd0Var.I.addMarker(position);
                                if (!UserObject.isUserSelf(obj2.f39241c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    obj2.f39242f = dd0Var.I.addMarker(flat);
                                }
                                dd0Var.f32590g0.add(obj2);
                                dd0Var.f32591h0.k(obj2, obj2.f39239a);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        dd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(obj2.e.getPosition(), maxZoomLevel));
                    } else {
                        MessageObject messageObject = dd0Var.B0;
                        if (messageObject != null) {
                            if (messageObject.isLiveLocation()) {
                                xc0 c02 = dd0Var.c0(dd0Var.B0.messageOwner);
                                if (!dd0Var.l0()) {
                                    dd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(c02.e.getPosition(), maxZoomLevel));
                                }
                            } else {
                                IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(dd0Var.f32611x0.getLatitude(), dd0Var.f32611x0.getLongitude());
                                try {
                                    dd0Var.I.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                }
                                dd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, maxZoomLevel));
                                dd0Var.f32589f0 = false;
                                dd0Var.l0();
                            }
                        } else {
                            Location location = new Location("network");
                            dd0Var.f32611x0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = dd0Var.A0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                dd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), maxZoomLevel));
                                dd0Var.f32611x0.setLatitude(dd0Var.A0.geo_point.lat);
                                dd0Var.f32611x0.setLongitude(dd0Var.A0.geo_point._long);
                                dd0Var.f32611x0.setAccuracy(dd0Var.A0.geo_point.accuracy_radius);
                                dd0Var.T.L(dd0Var.f32611x0);
                            } else {
                                location.setLatitude(20.659322d);
                                dd0Var.f32611x0.setLongitude(-11.40625d);
                            }
                        }
                    }
                    try {
                        dd0Var.I.setMyLocationEnabled(true);
                    } catch (Exception e10) {
                        FileLog.e((Throwable) e10, false);
                    }
                    dd0Var.I.getUiSettings().setMyLocationButtonEnabled(false);
                    dd0Var.I.getUiSettings().setZoomControlsEnabled(false);
                    dd0Var.I.getUiSettings().setCompassEnabled(false);
                    dd0Var.I.setOnCameraMoveStartedListener(new lc0(dd0Var, 4));
                    dd0Var.I.setOnMyLocationChangeListener(new pc0(dd0Var, 1));
                    dd0Var.I.setOnMarkerClickListener(new m4.h0(dd0Var, maxZoomLevel));
                    dd0Var.I.setOnCameraMoveListener(new nc0(dd0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            dd0Var.f32609w0 = location2;
                            dd0Var.t0(location2);
                            if (dd0Var.f32583b0 && dd0Var.getParentActivity() != null) {
                                dd0Var.f32583b0 = false;
                                dd0Var.d0();
                            }
                            imageView = dd0Var.f32584c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = dd0Var.getLocationController().getSharingLocationInfo(dd0Var.f32587e0)) != null && (i11 = sharingLocationInfo.proximityMeters) > 0) {
                                dd0Var.e0(i11);
                                return;
                            }
                            return;
                        }
                    }
                    dd0Var.f32609w0 = location2;
                    dd0Var.t0(location2);
                    if (dd0Var.f32583b0) {
                        dd0Var.f32583b0 = false;
                        dd0Var.d0();
                    }
                    imageView = dd0Var.f32584c;
                    if (imageView == null) {
                        return;
                    }
                    return;
                }
                return;
            default:
                dd0 dd0Var2 = this.f36084b;
                Location location3 = (Location) obj;
                dd0Var2.t0(location3);
                dd0Var2.getLocationController().setMapLocation(location3, dd0Var2.f32586d0);
                dd0Var2.f32586d0 = false;
                return;
        }
    }
}
