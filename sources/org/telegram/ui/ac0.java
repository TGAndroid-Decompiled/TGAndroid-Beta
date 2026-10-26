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
public final class ac0 implements q0.a {
    public final int f37712a;
    public final pc0 f37713b;

    public ac0(pc0 pc0Var, int i10) {
        this.f37712a = i10;
        this.f37713b = pc0Var;
    }

    @Override
    public final void accept(Object obj) {
        int i10;
        float maxZoomLevel;
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i11;
        switch (this.f37712a) {
            case 0:
                pc0 pc0Var = this.f37713b;
                pc0Var.I = (IMapsProvider.IMap) obj;
                if (AndroidUtilities.computePerceivedBrightness(pc0Var.getThemedColor(org.telegram.ui.ActionBar.y6.f23356d6)) < 0.721f) {
                    i10 = R.raw.mapstyle_night;
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    pc0Var.f42429a0 = true;
                    pc0Var.I.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                }
                pc0Var.I.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (pc0Var.I != null) {
                    pc0Var.K.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    if (pc0Var.M0) {
                        maxZoomLevel = pc0Var.I.getMinZoomLevel() + 4.0f;
                    } else {
                        maxZoomLevel = pc0Var.I.getMaxZoomLevel() - 4.0f;
                    }
                    TLRPC.TL_channelLocation tL_channelLocation = pc0Var.f42461y0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        ?? obj2 = new Object();
                        if (DialogObject.isUserDialog(pc0Var.f42435e0)) {
                            obj2.f40555c = pc0Var.getMessagesController().getUser(Long.valueOf(pc0Var.f42435e0));
                        } else {
                            obj2.d = pc0Var.getMessagesController().getChat(Long.valueOf(-pc0Var.f42435e0));
                        }
                        obj2.f40553a = pc0Var.f42435e0;
                        pc0Var.w0(obj2);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap h02 = pc0Var.h0(obj2);
                            if (h02 != null) {
                                position.icon(h02);
                                position.anchor(0.5f, 0.907f);
                                obj2.e = pc0Var.I.addMarker(position);
                                if (!UserObject.isUserSelf(obj2.f40555c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    obj2.f40556f = pc0Var.I.addMarker(flat);
                                }
                                pc0Var.f42438g0.add(obj2);
                                pc0Var.f42439h0.k(obj2, obj2.f40553a);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        pc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(obj2.e.getPosition(), maxZoomLevel));
                    } else {
                        MessageObject messageObject = pc0Var.A0;
                        if (messageObject != null) {
                            if (messageObject.isLiveLocation()) {
                                jc0 c02 = pc0Var.c0(pc0Var.A0.messageOwner);
                                if (!pc0Var.m0()) {
                                    pc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(c02.e.getPosition(), maxZoomLevel));
                                }
                            } else {
                                IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(pc0Var.f42457w0.getLatitude(), pc0Var.f42457w0.getLongitude());
                                try {
                                    pc0Var.I.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                                } catch (Exception e10) {
                                    FileLog.e(e10);
                                }
                                pc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, maxZoomLevel));
                                pc0Var.f42437f0 = false;
                                pc0Var.m0();
                            }
                        } else {
                            Location location = new Location("network");
                            pc0Var.f42457w0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = pc0Var.f42462z0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                pc0Var.I.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), maxZoomLevel));
                                pc0Var.f42457w0.setLatitude(pc0Var.f42462z0.geo_point.lat);
                                pc0Var.f42457w0.setLongitude(pc0Var.f42462z0.geo_point._long);
                                pc0Var.f42457w0.setAccuracy(pc0Var.f42462z0.geo_point.accuracy_radius);
                                pc0Var.T.L(pc0Var.f42457w0);
                            } else {
                                location.setLatitude(20.659322d);
                                pc0Var.f42457w0.setLongitude(-11.40625d);
                            }
                        }
                    }
                    try {
                        pc0Var.I.setMyLocationEnabled(true);
                    } catch (Exception e11) {
                        FileLog.e((Throwable) e11, false);
                    }
                    pc0Var.I.getUiSettings().setMyLocationButtonEnabled(false);
                    pc0Var.I.getUiSettings().setZoomControlsEnabled(false);
                    pc0Var.I.getUiSettings().setCompassEnabled(false);
                    pc0Var.I.setOnCameraMoveStartedListener(new vb0(pc0Var, 4));
                    pc0Var.I.setOnMyLocationChangeListener(new ac0(pc0Var, 1));
                    pc0Var.I.setOnMarkerClickListener(new m4.l0(pc0Var, maxZoomLevel));
                    pc0Var.I.setOnCameraMoveListener(new xb0(pc0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            pc0Var.f42455v0 = location2;
                            pc0Var.u0(location2);
                            if (pc0Var.f42431b0 && pc0Var.getParentActivity() != null) {
                                pc0Var.f42431b0 = false;
                                pc0Var.e0();
                            }
                            imageView = pc0Var.f42432c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = pc0Var.getLocationController().getSharingLocationInfo(pc0Var.f42435e0)) != null && (i11 = sharingLocationInfo.proximityMeters) > 0) {
                                pc0Var.f0(i11);
                                return;
                            }
                            return;
                        }
                    }
                    pc0Var.f42455v0 = location2;
                    pc0Var.u0(location2);
                    if (pc0Var.f42431b0) {
                        pc0Var.f42431b0 = false;
                        pc0Var.e0();
                    }
                    imageView = pc0Var.f42432c;
                    if (imageView == null) {
                        return;
                    }
                    return;
                }
                return;
            default:
                pc0 pc0Var2 = this.f37713b;
                Location location3 = (Location) obj;
                pc0Var2.u0(location3);
                pc0Var2.getLocationController().setMapLocation(location3, pc0Var2.f42434d0);
                pc0Var2.f42434d0 = false;
                return;
        }
    }
}
