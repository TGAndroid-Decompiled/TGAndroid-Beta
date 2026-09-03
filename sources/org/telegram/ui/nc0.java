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
public final class nc0 implements q0.a {
    public final int f36479a;
    public final cd0 f36480b;

    public nc0(cd0 cd0Var, int i10) {
        this.f36479a = i10;
        this.f36480b = cd0Var;
    }

    @Override
    public final void accept(Object obj) {
        int i10;
        final float maxZoomLevel;
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i11;
        switch (this.f36479a) {
            case 0:
                final cd0 cd0Var = this.f36480b;
                cd0Var.F = (IMapsProvider.IMap) obj;
                if (AndroidUtilities.computePerceivedBrightness(cd0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19881d6)) < 0.721f) {
                    i10 = R.raw.mapstyle_night;
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    cd0Var.X = true;
                    cd0Var.F.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                }
                cd0Var.F.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (cd0Var.F != null) {
                    cd0Var.H.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    if (cd0Var.K0) {
                        maxZoomLevel = cd0Var.F.getMinZoomLevel() + 4.0f;
                    } else {
                        maxZoomLevel = cd0Var.F.getMaxZoomLevel() - 4.0f;
                    }
                    TLRPC.TL_channelLocation tL_channelLocation = cd0Var.f33112w0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        ?? obj2 = new Object();
                        if (DialogObject.isUserDialog(cd0Var.f33086b0)) {
                            obj2.f39340c = cd0Var.getMessagesController().getUser(Long.valueOf(cd0Var.f33086b0));
                        } else {
                            obj2.d = cd0Var.getMessagesController().getChat(Long.valueOf(-cd0Var.f33086b0));
                        }
                        obj2.f39338a = cd0Var.f33086b0;
                        cd0Var.v0(obj2);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap g02 = cd0Var.g0(obj2);
                            if (g02 != null) {
                                position.icon(g02);
                                position.anchor(0.5f, 0.907f);
                                obj2.e = cd0Var.F.addMarker(position);
                                if (!UserObject.isUserSelf(obj2.f39340c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    obj2.f39341f = cd0Var.F.addMarker(flat);
                                }
                                cd0Var.f33089d0.add(obj2);
                                cd0Var.f33090e0.k(obj2, obj2.f39338a);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        cd0Var.F.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(obj2.e.getPosition(), maxZoomLevel));
                    } else {
                        MessageObject messageObject = cd0Var.f33116y0;
                        if (messageObject != null) {
                            if (messageObject.isLiveLocation()) {
                                wc0 c02 = cd0Var.c0(cd0Var.f33116y0.messageOwner);
                                if (!cd0Var.l0()) {
                                    cd0Var.F.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(c02.e.getPosition(), maxZoomLevel));
                                }
                            } else {
                                IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(cd0Var.f33109u0.getLatitude(), cd0Var.f33109u0.getLongitude());
                                try {
                                    cd0Var.F.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                                } catch (Exception e6) {
                                    FileLog.e(e6);
                                }
                                cd0Var.F.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, maxZoomLevel));
                                cd0Var.f33088c0 = false;
                                cd0Var.l0();
                            }
                        } else {
                            Location location = new Location("network");
                            cd0Var.f33109u0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = cd0Var.f33114x0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                cd0Var.F.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), maxZoomLevel));
                                cd0Var.f33109u0.setLatitude(cd0Var.f33114x0.geo_point.lat);
                                cd0Var.f33109u0.setLongitude(cd0Var.f33114x0.geo_point._long);
                                cd0Var.f33109u0.setAccuracy(cd0Var.f33114x0.geo_point.accuracy_radius);
                                cd0Var.Q.L(cd0Var.f33109u0);
                            } else {
                                location.setLatitude(20.659322d);
                                cd0Var.f33109u0.setLongitude(-11.40625d);
                            }
                        }
                    }
                    try {
                        cd0Var.F.setMyLocationEnabled(true);
                    } catch (Exception e10) {
                        FileLog.e((Throwable) e10, false);
                    }
                    cd0Var.F.getUiSettings().setMyLocationButtonEnabled(false);
                    cd0Var.F.getUiSettings().setZoomControlsEnabled(false);
                    cd0Var.F.getUiSettings().setCompassEnabled(false);
                    cd0Var.F.setOnCameraMoveStartedListener(new jc0(cd0Var, 4));
                    cd0Var.F.setOnMyLocationChangeListener(new nc0(cd0Var, 1));
                    cd0Var.F.setOnMarkerClickListener(new IMapsProvider.OnMarkerClickListener() {
                        @Override
                        public final boolean onClick(IMapsProvider.IMarker iMarker) {
                            int i12;
                            int i13;
                            int i14;
                            int i15;
                            cd0 cd0Var2 = cd0.this;
                            ArrayList arrayList = cd0Var2.f33089d0;
                            if (iMarker.getTag() instanceof bd0) {
                                cd0Var2.U.setVisibility(4);
                                if (!cd0Var2.f33117z0) {
                                    ImageView imageView2 = cd0Var2.f33083a;
                                    int i16 = org.telegram.ui.ActionBar.j6.ui;
                                    imageView2.setColorFilter(new PorterDuffColorFilter(cd0Var2.getThemedColor(i16), PorterDuff.Mode.MULTIPLY));
                                    cd0Var2.f33083a.setTag(Integer.valueOf(i16));
                                    cd0Var2.f33117z0 = true;
                                }
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= arrayList.size()) {
                                        break;
                                    }
                                    wc0 wc0Var = (wc0) arrayList.get(i17);
                                    if (wc0Var != null && wc0Var.e == iMarker) {
                                        cd0Var2.f33092f0 = wc0Var.f39338a;
                                        if (cd0Var2.f33093g0) {
                                            cd0Var2.f33093g0 = false;
                                            cd0Var2.C0();
                                        }
                                        cd0Var2.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(wc0Var.e.getPosition(), maxZoomLevel));
                                    } else {
                                        i17++;
                                    }
                                }
                                zc0 zc0Var = cd0Var2.f33113x;
                                cd0 cd0Var3 = zc0Var.f40444b;
                                HashMap hashMap = zc0Var.f40443a;
                                bd0 bd0Var = (bd0) iMarker.getTag();
                                if (bd0Var != null && cd0Var3.f33097k0 != bd0Var) {
                                    cd0Var3.y0(false);
                                    IMapsProvider.IMarker iMarker2 = cd0Var3.f33096j0;
                                    if (iMarker2 != null) {
                                        View view = (View) hashMap.get(iMarker2);
                                        if (view != null) {
                                            zc0Var.removeView(view);
                                            hashMap.remove(iMarker2);
                                        }
                                        cd0Var3.f33096j0 = null;
                                    }
                                    cd0Var3.f33097k0 = bd0Var;
                                    cd0Var3.f33096j0 = iMarker;
                                    Context context = zc0Var.getContext();
                                    FrameLayout frameLayout = new FrameLayout(context);
                                    zc0Var.addView(frameLayout, k7.b6.c(114.0f, -2));
                                    FrameLayout frameLayout2 = new FrameLayout(context);
                                    cd0Var3.f33098l0 = frameLayout2;
                                    frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                                    cd0Var3.f33098l0.getBackground().setColorFilter(new PorterDuffColorFilter(cd0Var3.getThemedColor(org.telegram.ui.ActionBar.j6.f19952h5), PorterDuff.Mode.MULTIPLY));
                                    frameLayout.addView(cd0Var3.f33098l0, k7.b6.c(71.0f, -2));
                                    cd0Var3.f33098l0.setAlpha(0.0f);
                                    cd0Var3.f33098l0.setOnClickListener(new ib0(2, zc0Var, bd0Var));
                                    TextView textView = new TextView(context);
                                    textView.setTextSize(1, 16.0f);
                                    textView.setMaxLines(1);
                                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                    textView.setEllipsize(truncateAt);
                                    textView.setSingleLine(true);
                                    textView.setTextColor(cd0Var3.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                                    textView.setTypeface(AndroidUtilities.bold());
                                    if (LocaleController.isRTL) {
                                        i12 = 5;
                                    } else {
                                        i12 = 3;
                                    }
                                    textView.setGravity(i12);
                                    FrameLayout frameLayout3 = cd0Var3.f33098l0;
                                    if (LocaleController.isRTL) {
                                        i13 = 5;
                                    } else {
                                        i13 = 3;
                                    }
                                    TextView h = ai.h(frameLayout3, textView, k7.b6.d(-2, -2.0f, i13 | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                                    h.setTextSize(1, 14.0f);
                                    h.setMaxLines(1);
                                    h.setEllipsize(truncateAt);
                                    h.setSingleLine(true);
                                    h.setTextColor(cd0Var3.getThemedColor(org.telegram.ui.ActionBar.j6.A6));
                                    if (LocaleController.isRTL) {
                                        i14 = 5;
                                    } else {
                                        i14 = 3;
                                    }
                                    h.setGravity(i14);
                                    FrameLayout frameLayout4 = cd0Var3.f33098l0;
                                    if (LocaleController.isRTL) {
                                        i15 = 5;
                                    } else {
                                        i15 = 3;
                                    }
                                    frameLayout4.addView(h, k7.b6.d(-2, -2.0f, i15 | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                                    textView.setText(bd0Var.f32851c.title);
                                    h.setText(LocaleController.getString(R.string.TapToSendLocation));
                                    FrameLayout frameLayout5 = new FrameLayout(context);
                                    frameLayout5.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.t4.a(bd0Var.f32849a)));
                                    frameLayout.addView(frameLayout5, k7.b6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                                    org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
                                    p9Var.f(android.support.v4.media.a.r(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), bd0Var.f32851c.venue_type, "_64.png"), null, null);
                                    frameLayout5.addView(p9Var, k7.b6.e(30, 30, 17));
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat.addUpdateListener(new yc0(zc0Var, frameLayout5));
                                    ofFloat.setDuration(360L);
                                    ofFloat.start();
                                    hashMap.put(iMarker, frameLayout);
                                    cd0Var3.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
                                }
                            }
                            return true;
                        }
                    });
                    cd0Var.F.setOnCameraMoveListener(new lc0(cd0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            cd0Var.f33108t0 = location2;
                            cd0Var.t0(location2);
                            if (cd0Var.Y && cd0Var.getParentActivity() != null) {
                                cd0Var.Y = false;
                                cd0Var.d0();
                            }
                            imageView = cd0Var.f33087c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = cd0Var.getLocationController().getSharingLocationInfo(cd0Var.f33086b0)) != null && (i11 = sharingLocationInfo.proximityMeters) > 0) {
                                cd0Var.e0(i11);
                                return;
                            }
                            return;
                        }
                    }
                    cd0Var.f33108t0 = location2;
                    cd0Var.t0(location2);
                    if (cd0Var.Y) {
                        cd0Var.Y = false;
                        cd0Var.d0();
                    }
                    imageView = cd0Var.f33087c;
                    if (imageView == null) {
                        return;
                    }
                    return;
                }
                return;
            default:
                cd0 cd0Var2 = this.f36480b;
                Location location3 = (Location) obj;
                cd0Var2.t0(location3);
                cd0Var2.getLocationController().setMapLocation(location3, cd0Var2.f33084a0);
                cd0Var2.f33084a0 = false;
                return;
        }
    }
}
