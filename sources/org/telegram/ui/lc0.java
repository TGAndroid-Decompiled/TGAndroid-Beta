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
public final class lc0 implements q0.a {
    public final int f36060a;
    public final ad0 f36061b;

    public lc0(ad0 ad0Var, int i10) {
        this.f36060a = i10;
        this.f36061b = ad0Var;
    }

    @Override
    public final void accept(Object obj) {
        int i10;
        final float maxZoomLevel;
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i11;
        switch (this.f36060a) {
            case 0:
                final ad0 ad0Var = this.f36061b;
                ad0Var.F = (IMapsProvider.IMap) obj;
                if (AndroidUtilities.computePerceivedBrightness(ad0Var.getThemedColor(org.telegram.ui.ActionBar.j6.f19906d6)) < 0.721f) {
                    i10 = R.raw.mapstyle_night;
                } else {
                    i10 = 0;
                }
                if (i10 != 0) {
                    ad0Var.X = true;
                    ad0Var.F.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i10));
                }
                ad0Var.F.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (ad0Var.F != null) {
                    ad0Var.H.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    if (ad0Var.K0) {
                        maxZoomLevel = ad0Var.F.getMinZoomLevel() + 4.0f;
                    } else {
                        maxZoomLevel = ad0Var.F.getMaxZoomLevel() - 4.0f;
                    }
                    TLRPC.TL_channelLocation tL_channelLocation = ad0Var.f32550w0;
                    if (tL_channelLocation != null) {
                        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        ?? obj2 = new Object();
                        if (DialogObject.isUserDialog(ad0Var.f32524b0)) {
                            obj2.f38908c = ad0Var.getMessagesController().getUser(Long.valueOf(ad0Var.f32524b0));
                        } else {
                            obj2.d = ad0Var.getMessagesController().getChat(Long.valueOf(-ad0Var.f32524b0));
                        }
                        obj2.f38906a = ad0Var.f32524b0;
                        ad0Var.v0(obj2);
                        try {
                            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                            Bitmap g02 = ad0Var.g0(obj2);
                            if (g02 != null) {
                                position.icon(g02);
                                position.anchor(0.5f, 0.907f);
                                obj2.e = ad0Var.F.addMarker(position);
                                if (!UserObject.isUserSelf(obj2.f38908c)) {
                                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                                    flat.icon(R.drawable.map_pin_circle);
                                    flat.anchor(0.5f, 0.5f);
                                    obj2.f38909f = ad0Var.F.addMarker(flat);
                                }
                                ad0Var.f32527d0.add(obj2);
                                ad0Var.f32528e0.k(obj2, obj2.f38906a);
                            }
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        ad0Var.F.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(obj2.e.getPosition(), maxZoomLevel));
                    } else {
                        MessageObject messageObject = ad0Var.f32554y0;
                        if (messageObject != null) {
                            if (messageObject.isLiveLocation()) {
                                uc0 c02 = ad0Var.c0(ad0Var.f32554y0.messageOwner);
                                if (!ad0Var.l0()) {
                                    ad0Var.F.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(c02.e.getPosition(), maxZoomLevel));
                                }
                            } else {
                                IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(ad0Var.f32547u0.getLatitude(), ad0Var.f32547u0.getLongitude());
                                try {
                                    ad0Var.F.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).icon(R.drawable.map_pin2));
                                } catch (Exception e6) {
                                    FileLog.e(e6);
                                }
                                ad0Var.F.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, maxZoomLevel));
                                ad0Var.f32526c0 = false;
                                ad0Var.l0();
                            }
                        } else {
                            Location location = new Location("network");
                            ad0Var.f32547u0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = ad0Var.f32552x0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint2 = tL_channelLocation2.geo_point;
                                ad0Var.F.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), maxZoomLevel));
                                ad0Var.f32547u0.setLatitude(ad0Var.f32552x0.geo_point.lat);
                                ad0Var.f32547u0.setLongitude(ad0Var.f32552x0.geo_point._long);
                                ad0Var.f32547u0.setAccuracy(ad0Var.f32552x0.geo_point.accuracy_radius);
                                ad0Var.Q.L(ad0Var.f32547u0);
                            } else {
                                location.setLatitude(20.659322d);
                                ad0Var.f32547u0.setLongitude(-11.40625d);
                            }
                        }
                    }
                    try {
                        ad0Var.F.setMyLocationEnabled(true);
                    } catch (Exception e10) {
                        FileLog.e((Throwable) e10, false);
                    }
                    ad0Var.F.getUiSettings().setMyLocationButtonEnabled(false);
                    ad0Var.F.getUiSettings().setZoomControlsEnabled(false);
                    ad0Var.F.getUiSettings().setCompassEnabled(false);
                    ad0Var.F.setOnCameraMoveStartedListener(new hc0(ad0Var, 4));
                    ad0Var.F.setOnMyLocationChangeListener(new lc0(ad0Var, 1));
                    ad0Var.F.setOnMarkerClickListener(new IMapsProvider.OnMarkerClickListener() {
                        @Override
                        public final boolean onClick(IMapsProvider.IMarker iMarker) {
                            int i12;
                            int i13;
                            int i14;
                            int i15;
                            ad0 ad0Var2 = ad0.this;
                            ArrayList arrayList = ad0Var2.f32527d0;
                            if (iMarker.getTag() instanceof zc0) {
                                ad0Var2.U.setVisibility(4);
                                if (!ad0Var2.f32555z0) {
                                    ImageView imageView2 = ad0Var2.f32521a;
                                    int i16 = org.telegram.ui.ActionBar.j6.ui;
                                    imageView2.setColorFilter(new PorterDuffColorFilter(ad0Var2.getThemedColor(i16), PorterDuff.Mode.MULTIPLY));
                                    ad0Var2.f32521a.setTag(Integer.valueOf(i16));
                                    ad0Var2.f32555z0 = true;
                                }
                                int i17 = 0;
                                while (true) {
                                    if (i17 >= arrayList.size()) {
                                        break;
                                    }
                                    uc0 uc0Var = (uc0) arrayList.get(i17);
                                    if (uc0Var != null && uc0Var.e == iMarker) {
                                        ad0Var2.f32530f0 = uc0Var.f38906a;
                                        if (ad0Var2.f32531g0) {
                                            ad0Var2.f32531g0 = false;
                                            ad0Var2.C0();
                                        }
                                        ad0Var2.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(uc0Var.e.getPosition(), maxZoomLevel));
                                    } else {
                                        i17++;
                                    }
                                }
                                xc0 xc0Var = ad0Var2.f32551x;
                                ad0 ad0Var3 = xc0Var.f39896b;
                                HashMap hashMap = xc0Var.f39895a;
                                zc0 zc0Var = (zc0) iMarker.getTag();
                                if (zc0Var != null && ad0Var3.f32535k0 != zc0Var) {
                                    ad0Var3.y0(false);
                                    IMapsProvider.IMarker iMarker2 = ad0Var3.f32534j0;
                                    if (iMarker2 != null) {
                                        View view = (View) hashMap.get(iMarker2);
                                        if (view != null) {
                                            xc0Var.removeView(view);
                                            hashMap.remove(iMarker2);
                                        }
                                        ad0Var3.f32534j0 = null;
                                    }
                                    ad0Var3.f32535k0 = zc0Var;
                                    ad0Var3.f32534j0 = iMarker;
                                    Context context = xc0Var.getContext();
                                    FrameLayout frameLayout = new FrameLayout(context);
                                    xc0Var.addView(frameLayout, k7.b6.c(114.0f, -2));
                                    FrameLayout frameLayout2 = new FrameLayout(context);
                                    ad0Var3.f32536l0 = frameLayout2;
                                    frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                                    ad0Var3.f32536l0.getBackground().setColorFilter(new PorterDuffColorFilter(ad0Var3.getThemedColor(org.telegram.ui.ActionBar.j6.f19977h5), PorterDuff.Mode.MULTIPLY));
                                    frameLayout.addView(ad0Var3.f32536l0, k7.b6.c(71.0f, -2));
                                    ad0Var3.f32536l0.setAlpha(0.0f);
                                    ad0Var3.f32536l0.setOnClickListener(new gb0(2, xc0Var, zc0Var));
                                    TextView textView = new TextView(context);
                                    textView.setTextSize(1, 16.0f);
                                    textView.setMaxLines(1);
                                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                    textView.setEllipsize(truncateAt);
                                    textView.setSingleLine(true);
                                    textView.setTextColor(ad0Var3.getThemedColor(org.telegram.ui.ActionBar.j6.G6));
                                    textView.setTypeface(AndroidUtilities.bold());
                                    if (LocaleController.isRTL) {
                                        i12 = 5;
                                    } else {
                                        i12 = 3;
                                    }
                                    textView.setGravity(i12);
                                    FrameLayout frameLayout3 = ad0Var3.f32536l0;
                                    if (LocaleController.isRTL) {
                                        i13 = 5;
                                    } else {
                                        i13 = 3;
                                    }
                                    TextView i18 = yh.i(frameLayout3, textView, k7.b6.d(-2, -2.0f, i13 | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                                    i18.setTextSize(1, 14.0f);
                                    i18.setMaxLines(1);
                                    i18.setEllipsize(truncateAt);
                                    i18.setSingleLine(true);
                                    i18.setTextColor(ad0Var3.getThemedColor(org.telegram.ui.ActionBar.j6.A6));
                                    if (LocaleController.isRTL) {
                                        i14 = 5;
                                    } else {
                                        i14 = 3;
                                    }
                                    i18.setGravity(i14);
                                    FrameLayout frameLayout4 = ad0Var3.f32536l0;
                                    if (LocaleController.isRTL) {
                                        i15 = 5;
                                    } else {
                                        i15 = 3;
                                    }
                                    frameLayout4.addView(i18, k7.b6.d(-2, -2.0f, i15 | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                                    textView.setText(zc0Var.f40766c.title);
                                    i18.setText(LocaleController.getString(R.string.TapToSendLocation));
                                    FrameLayout frameLayout5 = new FrameLayout(context);
                                    frameLayout5.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.u4.a(zc0Var.f40764a)));
                                    frameLayout.addView(frameLayout5, k7.b6.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                                    org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(context);
                                    p9Var.f(android.support.v4.media.a.r(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), zc0Var.f40766c.venue_type, "_64.png"), null, null);
                                    frameLayout5.addView(p9Var, k7.b6.e(30, 30, 17));
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    ofFloat.addUpdateListener(new wc0(xc0Var, frameLayout5));
                                    ofFloat.setDuration(360L);
                                    ofFloat.start();
                                    hashMap.put(iMarker, frameLayout);
                                    ad0Var3.F.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
                                }
                            }
                            return true;
                        }
                    });
                    ad0Var.F.setOnCameraMoveListener(new jc0(ad0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location location2 = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        location2 = locationManager.getLastKnownLocation(providers.get(size));
                        if (location2 != null) {
                            ad0Var.f32546t0 = location2;
                            ad0Var.t0(location2);
                            if (ad0Var.Y && ad0Var.getParentActivity() != null) {
                                ad0Var.Y = false;
                                ad0Var.d0();
                            }
                            imageView = ad0Var.f32525c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = ad0Var.getLocationController().getSharingLocationInfo(ad0Var.f32524b0)) != null && (i11 = sharingLocationInfo.proximityMeters) > 0) {
                                ad0Var.e0(i11);
                                return;
                            }
                            return;
                        }
                    }
                    ad0Var.f32546t0 = location2;
                    ad0Var.t0(location2);
                    if (ad0Var.Y) {
                        ad0Var.Y = false;
                        ad0Var.d0();
                    }
                    imageView = ad0Var.f32525c;
                    if (imageView == null) {
                        return;
                    }
                    return;
                }
                return;
            default:
                ad0 ad0Var2 = this.f36061b;
                Location location3 = (Location) obj;
                ad0Var2.t0(location3);
                ad0Var2.getLocationController().setMapLocation(location3, ad0Var2.f32522a0);
                ad0Var2.f32522a0 = false;
                return;
        }
    }
}
