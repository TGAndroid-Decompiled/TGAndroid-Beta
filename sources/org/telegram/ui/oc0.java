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
public final class oc0 implements q0.a {
    public final int f36138a;
    public final cd0 f36139b;

    public oc0(cd0 cd0Var, int i10) {
        this.f36138a = i10;
        this.f36139b = cd0Var;
    }

    @Override
    public final void accept(Object obj) {
        int i10;
        float maxZoomLevel;
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i11;
        switch (this.f36138a) {
            case 0:
                cd0 cd0Var = this.f36139b;
                cd0Var.I = (IMapsProvider.IMap) obj;
                if (AndroidUtilities.computePerceivedBrightness(cd0Var.getThemedColor(org.telegram.ui.ActionBar.h6.f19060d6)) < 0.721f) {
                    i10 = R.raw.mapstyle_night;
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    cd0Var.f32657a0 = true;
                    cd0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                }
                cd0Var.I.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (cd0Var.I != null) {
                    cd0Var.K.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    if (cd0Var.N0) {
                        maxZoomLevel = cd0Var.I.getMinZoomLevel() + 4.0f;
                    } else {
                        maxZoomLevel = cd0Var.I.getMaxZoomLevel() - 4.0f;
                    }
                    TLRPC.TL_channelLocation tL_channelLocation = cd0Var.f32690z0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        ?? obj2 = new Object();
                        if (DialogObject.isUserDialog(cd0Var.f32663e0)) {
                            obj2.f38958c = cd0Var.getMessagesController().getUser(Long.valueOf(cd0Var.f32663e0));
                        } else {
                            obj2.d = cd0Var.getMessagesController().getChat(Long.valueOf(-cd0Var.f32663e0));
                        }
                        obj2.f38956a = cd0Var.f32663e0;
                        cd0Var.v0(obj2);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap g02 = cd0Var.g0(obj2);
                            if (g02 != null) {
                                position.icon(g02);
                                position.anchor(0.5f, 0.907f);
                                obj2.e = cd0Var.I.addMarker(position);
                                if (!UserObject.isUserSelf(obj2.f38958c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    obj2.f38959f = cd0Var.I.addMarker(flat);
                                }
                                cd0Var.f32666g0.add(obj2);
                                cd0Var.f32667h0.k(obj2, obj2.f38956a);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        cd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(obj2.e.getPosition(), maxZoomLevel));
                    } else {
                        MessageObject messageObject = cd0Var.B0;
                        if (messageObject != null) {
                            if (messageObject.isLiveLocation()) {
                                wc0 c02 = cd0Var.c0(cd0Var.B0.messageOwner);
                                if (!cd0Var.l0()) {
                                    cd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(c02.e.getPosition(), maxZoomLevel));
                                }
                            } else {
                                IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(cd0Var.f32687x0.getLatitude(), cd0Var.f32687x0.getLongitude());
                                try {
                                    cd0Var.I.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                                } catch (Exception e7) {
                                    FileLog.e(e7);
                                }
                                cd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, maxZoomLevel));
                                cd0Var.f32665f0 = false;
                                cd0Var.l0();
                            }
                        } else {
                            Location location = new Location("network");
                            cd0Var.f32687x0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = cd0Var.A0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                cd0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), maxZoomLevel));
                                cd0Var.f32687x0.setLatitude(cd0Var.A0.geo_point.lat);
                                cd0Var.f32687x0.setLongitude(cd0Var.A0.geo_point._long);
                                cd0Var.f32687x0.setAccuracy(cd0Var.A0.geo_point.accuracy_radius);
                                cd0Var.T.L(cd0Var.f32687x0);
                            } else {
                                location.setLatitude(20.659322d);
                                cd0Var.f32687x0.setLongitude(-11.40625d);
                            }
                        }
                    }
                    try {
                        cd0Var.I.setMyLocationEnabled(true);
                    } catch (Exception e10) {
                        FileLog.e((Throwable) e10, false);
                    }
                    cd0Var.I.getUiSettings().setMyLocationButtonEnabled(false);
                    cd0Var.I.getUiSettings().setZoomControlsEnabled(false);
                    cd0Var.I.getUiSettings().setCompassEnabled(false);
                    cd0Var.I.setOnCameraMoveStartedListener(new kc0(cd0Var, 4));
                    cd0Var.I.setOnMyLocationChangeListener(new oc0(cd0Var, 1));
                    cd0Var.I.setOnMarkerClickListener(new m4.g0(cd0Var, maxZoomLevel));
                    cd0Var.I.setOnCameraMoveListener(new mc0(cd0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            cd0Var.f32685w0 = location2;
                            cd0Var.t0(location2);
                            if (cd0Var.f32659b0 && cd0Var.getParentActivity() != null) {
                                cd0Var.f32659b0 = false;
                                cd0Var.d0();
                            }
                            imageView = cd0Var.f32660c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = cd0Var.getLocationController().getSharingLocationInfo(cd0Var.f32663e0)) != null && (i11 = sharingLocationInfo.proximityMeters) > 0) {
                                cd0Var.e0(i11);
                                return;
                            }
                            return;
                        }
                    }
                    cd0Var.f32685w0 = location2;
                    cd0Var.t0(location2);
                    if (cd0Var.f32659b0) {
                        cd0Var.f32659b0 = false;
                        cd0Var.d0();
                    }
                    imageView = cd0Var.f32660c;
                    if (imageView == null) {
                        return;
                    }
                    return;
                }
                return;
            default:
                cd0 cd0Var2 = this.f36139b;
                Location location3 = (Location) obj;
                cd0Var2.t0(location3);
                cd0Var2.getLocationController().setMapLocation(location3, cd0Var2.f32662d0);
                cd0Var2.f32662d0 = false;
                return;
        }
    }
}
