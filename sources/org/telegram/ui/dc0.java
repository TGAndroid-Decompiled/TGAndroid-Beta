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
public final class dc0 implements q0.a {
    public final int f36592a;
    public final sc0 f36593b;

    public dc0(sc0 sc0Var, int i10) {
        this.f36592a = i10;
        this.f36593b = sc0Var;
    }

    @Override
    public final void accept(Object obj) {
        int i10;
        float maxZoomLevel;
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i11;
        switch (this.f36592a) {
            case 0:
                sc0 sc0Var = this.f36593b;
                sc0Var.I = (IMapsProvider.IMap) obj;
                if (AndroidUtilities.computePerceivedBrightness(sc0Var.getThemedColor(org.telegram.ui.ActionBar.k6.f21183d6)) < 0.721f) {
                    i10 = R.raw.mapstyle_night;
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    sc0Var.f41348a0 = true;
                    sc0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                }
                sc0Var.I.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (sc0Var.I != null) {
                    sc0Var.K.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    if (sc0Var.N0) {
                        maxZoomLevel = sc0Var.I.getMinZoomLevel() + 4.0f;
                    } else {
                        maxZoomLevel = sc0Var.I.getMaxZoomLevel() - 4.0f;
                    }
                    TLRPC.TL_channelLocation tL_channelLocation = sc0Var.f41381z0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        ?? obj2 = new Object();
                        if (DialogObject.isUserDialog(sc0Var.f41354e0)) {
                            obj2.f39469c = sc0Var.getMessagesController().getUser(Long.valueOf(sc0Var.f41354e0));
                        } else {
                            obj2.d = sc0Var.getMessagesController().getChat(Long.valueOf(-sc0Var.f41354e0));
                        }
                        obj2.f39467a = sc0Var.f41354e0;
                        sc0Var.v0(obj2);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap g02 = sc0Var.g0(obj2);
                            if (g02 != null) {
                                position.icon(g02);
                                position.anchor(0.5f, 0.907f);
                                obj2.e = sc0Var.I.addMarker(position);
                                if (!UserObject.isUserSelf(obj2.f39469c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    obj2.f39470f = sc0Var.I.addMarker(flat);
                                }
                                sc0Var.f41357g0.add(obj2);
                                sc0Var.f41358h0.k(obj2, obj2.f39467a);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        sc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(obj2.e.getPosition(), maxZoomLevel));
                    } else {
                        MessageObject messageObject = sc0Var.B0;
                        if (messageObject != null) {
                            if (messageObject.isLiveLocation()) {
                                mc0 b02 = sc0Var.b0(sc0Var.B0.messageOwner);
                                if (!sc0Var.l0()) {
                                    sc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(b02.e.getPosition(), maxZoomLevel));
                                }
                            } else {
                                IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(sc0Var.f41378x0.getLatitude(), sc0Var.f41378x0.getLongitude());
                                try {
                                    sc0Var.I.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                }
                                sc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, maxZoomLevel));
                                sc0Var.f41356f0 = false;
                                sc0Var.l0();
                            }
                        } else {
                            Location location = new Location("network");
                            sc0Var.f41378x0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = sc0Var.A0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                sc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), maxZoomLevel));
                                sc0Var.f41378x0.setLatitude(sc0Var.A0.geo_point.lat);
                                sc0Var.f41378x0.setLongitude(sc0Var.A0.geo_point._long);
                                sc0Var.f41378x0.setAccuracy(sc0Var.A0.geo_point.accuracy_radius);
                                sc0Var.T.L(sc0Var.f41378x0);
                            } else {
                                location.setLatitude(20.659322d);
                                sc0Var.f41378x0.setLongitude(-11.40625d);
                            }
                        }
                    }
                    try {
                        sc0Var.I.setMyLocationEnabled(true);
                    } catch (Exception e10) {
                        FileLog.e((Throwable) e10, false);
                    }
                    sc0Var.I.getUiSettings().setMyLocationButtonEnabled(false);
                    sc0Var.I.getUiSettings().setZoomControlsEnabled(false);
                    sc0Var.I.getUiSettings().setCompassEnabled(false);
                    sc0Var.I.setOnCameraMoveStartedListener(new zb0(sc0Var, 4));
                    sc0Var.I.setOnMyLocationChangeListener(new dc0(sc0Var, 1));
                    sc0Var.I.setOnMarkerClickListener(new m4.l0(sc0Var, maxZoomLevel));
                    sc0Var.I.setOnCameraMoveListener(new bc0(sc0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            sc0Var.f41376w0 = location2;
                            sc0Var.t0(location2);
                            if (sc0Var.f41350b0 && sc0Var.getParentActivity() != null) {
                                sc0Var.f41350b0 = false;
                                sc0Var.d0();
                            }
                            imageView = sc0Var.f41351c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = sc0Var.getLocationController().getSharingLocationInfo(sc0Var.f41354e0)) != null && (i11 = sharingLocationInfo.proximityMeters) > 0) {
                                sc0Var.e0(i11);
                                return;
                            }
                            return;
                        }
                    }
                    sc0Var.f41376w0 = location2;
                    sc0Var.t0(location2);
                    if (sc0Var.f41350b0) {
                        sc0Var.f41350b0 = false;
                        sc0Var.d0();
                    }
                    imageView = sc0Var.f41351c;
                    if (imageView == null) {
                        return;
                    }
                    return;
                }
                return;
            default:
                sc0 sc0Var2 = this.f36593b;
                Location location3 = (Location) obj;
                sc0Var2.t0(location3);
                sc0Var2.getLocationController().setMapLocation(location3, sc0Var2.f41353d0);
                sc0Var2.f41353d0 = false;
                return;
        }
    }
}
