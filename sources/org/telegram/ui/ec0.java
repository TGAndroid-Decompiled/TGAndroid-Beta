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

public final class ec0 implements q0.a {

    public final int f37728a;

    public final tc0 f37729b;

    public ec0(tc0 tc0Var, int i10) {
        this.f37728a = i10;
        this.f37729b = tc0Var;
    }

    @Override
    public final void accept(Object obj) {
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i10;
        switch (this.f37728a) {
            case 0:
                final tc0 tc0Var = this.f37729b;
                tc0Var.E = (IMapsProvider.IMap) obj;
                int i11 = AndroidUtilities.computePerceivedBrightness(tc0Var.getThemedColor(org.telegram.ui.ActionBar.g6.f23053d6)) < 0.721f ? R.raw.mapstyle_night : 0;
                if (i11 != 0) {
                    tc0Var.W = true;
                    tc0Var.E.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i11));
                }
                tc0Var.E.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (tc0Var.E != null) {
                    tc0Var.G.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    final float minZoomLevel = tc0Var.J0 ? tc0Var.E.getMinZoomLevel() + 4.0f : tc0Var.E.getMaxZoomLevel() - 4.0f;
                    TLRPC.TL_channelLocation tL_channelLocation = tc0Var.f42883v0;
                    if (tL_channelLocation == null) {
                        MessageObject messageObject = tc0Var.f42887x0;
                        if (messageObject != null) {
                            if (messageObject.isLiveLocation()) {
                                nc0 nc0VarC0 = tc0Var.c0(tc0Var.f42887x0.messageOwner);
                                if (!tc0Var.l0()) {
                                    tc0Var.E.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(nc0VarC0.f40732e.getPosition(), minZoomLevel));
                                }
                            } else {
                                IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(tc0Var.f42881t0.getLatitude(), tc0Var.f42881t0.getLongitude());
                                try {
                                    tc0Var.E.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).icon(R.drawable.map_pin2));
                                } catch (Exception e9) {
                                    FileLog.e(e9);
                                }
                                tc0Var.E.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, minZoomLevel));
                                tc0Var.f42858b0 = false;
                                tc0Var.l0();
                            }
                            break;
                        } else {
                            Location location = new Location("network");
                            tc0Var.f42881t0 = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = tc0Var.f42885w0;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint = tL_channelLocation2.geo_point;
                                tc0Var.E.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), minZoomLevel));
                                tc0Var.f42881t0.setLatitude(tc0Var.f42885w0.geo_point.lat);
                                tc0Var.f42881t0.setLongitude(tc0Var.f42885w0.geo_point._long);
                                tc0Var.f42881t0.setAccuracy(tc0Var.f42885w0.geo_point.accuracy_radius);
                                tc0Var.P.L(tc0Var.f42881t0);
                            } else {
                                location.setLatitude(20.659322d);
                                tc0Var.f42881t0.setLongitude(-11.40625d);
                            }
                        }
                    } else {
                        TLRPC.GeoPoint geoPoint2 = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long);
                        nc0 nc0Var = new nc0();
                        if (DialogObject.isUserDialog(tc0Var.f42856a0)) {
                            nc0Var.f40731c = tc0Var.getMessagesController().getUser(Long.valueOf(tc0Var.f42856a0));
                        } else {
                            nc0Var.d = tc0Var.getMessagesController().getChat(Long.valueOf(-tc0Var.f42856a0));
                        }
                        nc0Var.f40729a = tc0Var.f42856a0;
                        tc0Var.v0(nc0Var);
                        try {
                            IMapsProvider.IMarkerOptions iMarkerOptionsPosition = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2);
                            Bitmap bitmapG0 = tc0Var.g0(nc0Var);
                            if (bitmapG0 != null) {
                                iMarkerOptionsPosition.icon(bitmapG0);
                                iMarkerOptionsPosition.anchor(0.5f, 0.907f);
                                nc0Var.f40732e = tc0Var.E.addMarker(iMarkerOptionsPosition);
                                if (!UserObject.isUserSelf(nc0Var.f40731c)) {
                                    IMapsProvider.IMarkerOptions iMarkerOptionsFlat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).flat(true);
                                    iMarkerOptionsFlat.icon(R.drawable.map_pin_circle);
                                    iMarkerOptionsFlat.anchor(0.5f, 0.5f);
                                    nc0Var.f40733f = tc0Var.E.addMarker(iMarkerOptionsFlat);
                                }
                                tc0Var.f42860c0.add(nc0Var);
                                tc0Var.f42861d0.k(nc0Var, nc0Var.f40729a);
                            }
                        } catch (Exception e10) {
                            FileLog.e(e10);
                        }
                        tc0Var.E.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(nc0Var.f40732e.getPosition(), minZoomLevel));
                        break;
                    }
                    try {
                        tc0Var.E.setMyLocationEnabled(true);
                    } catch (Exception e11) {
                        FileLog.e((Throwable) e11, false);
                    }
                    tc0Var.E.getUiSettings().setMyLocationButtonEnabled(false);
                    tc0Var.E.getUiSettings().setZoomControlsEnabled(false);
                    tc0Var.E.getUiSettings().setCompassEnabled(false);
                    tc0Var.E.setOnCameraMoveStartedListener(new ac0(tc0Var, 4));
                    tc0Var.E.setOnMyLocationChangeListener(new ec0(tc0Var, 1));
                    tc0Var.E.setOnMarkerClickListener(new IMapsProvider.OnMarkerClickListener() {
                        @Override
                        public final boolean onClick(IMapsProvider.IMarker iMarker) {
                            tc0 tc0Var2 = tc0Var;
                            ArrayList arrayList = tc0Var2.f42860c0;
                            if (iMarker.getTag() instanceof sc0) {
                                tc0Var2.T.setVisibility(4);
                                if (!tc0Var2.f42889y0) {
                                    ImageView imageView2 = tc0Var2.f42855a;
                                    int i12 = org.telegram.ui.ActionBar.g6.ui;
                                    imageView2.setColorFilter(new PorterDuffColorFilter(tc0Var2.getThemedColor(i12), PorterDuff.Mode.MULTIPLY));
                                    tc0Var2.f42855a.setTag(Integer.valueOf(i12));
                                    tc0Var2.f42889y0 = true;
                                }
                                for (int i13 = 0; i13 < arrayList.size(); i13++) {
                                    nc0 nc0Var2 = (nc0) arrayList.get(i13);
                                    if (nc0Var2 != null && nc0Var2.f40732e == iMarker) {
                                        tc0Var2.f42863e0 = nc0Var2.f40729a;
                                        if (tc0Var2.f42865f0) {
                                            tc0Var2.f42865f0 = false;
                                            tc0Var2.C0();
                                        }
                                        tc0Var2.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(nc0Var2.f40732e.getPosition(), minZoomLevel));
                                        break;
                                    }
                                }
                                qc0 qc0Var = tc0Var2.f42886x;
                                tc0 tc0Var3 = qc0Var.f41634b;
                                HashMap map = qc0Var.f41633a;
                                sc0 sc0Var = (sc0) iMarker.getTag();
                                if (sc0Var != null && tc0Var3.f42869j0 != sc0Var) {
                                    tc0Var3.y0(false);
                                    IMapsProvider.IMarker iMarker2 = tc0Var3.f42868i0;
                                    if (iMarker2 != null) {
                                        View view = (View) map.get(iMarker2);
                                        if (view != null) {
                                            qc0Var.removeView(view);
                                            map.remove(iMarker2);
                                        }
                                        tc0Var3.f42868i0 = null;
                                    }
                                    tc0Var3.f42869j0 = sc0Var;
                                    tc0Var3.f42868i0 = iMarker;
                                    Context context = qc0Var.getContext();
                                    FrameLayout frameLayout = new FrameLayout(context);
                                    qc0Var.addView(frameLayout, h7.z5.c(114.0f, -2));
                                    FrameLayout frameLayout2 = new FrameLayout(context);
                                    tc0Var3.f42870k0 = frameLayout2;
                                    frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                                    tc0Var3.f42870k0.getBackground().setColorFilter(new PorterDuffColorFilter(tc0Var3.getThemedColor(org.telegram.ui.ActionBar.g6.f23124h5), PorterDuff.Mode.MULTIPLY));
                                    frameLayout.addView(tc0Var3.f42870k0, h7.z5.c(71.0f, -2));
                                    tc0Var3.f42870k0.setAlpha(0.0f);
                                    tc0Var3.f42870k0.setOnClickListener(new u70(5, qc0Var, sc0Var));
                                    TextView textView = new TextView(context);
                                    textView.setTextSize(1, 16.0f);
                                    textView.setMaxLines(1);
                                    TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                    textView.setEllipsize(truncateAt);
                                    textView.setSingleLine(true);
                                    textView.setTextColor(tc0Var3.getThemedColor(org.telegram.ui.ActionBar.g6.G6));
                                    textView.setTypeface(AndroidUtilities.bold());
                                    textView.setGravity(LocaleController.isRTL ? 5 : 3);
                                    TextView textViewH = org.telegram.ui.Cells.pa.h(tc0Var3.f42870k0, textView, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                                    textViewH.setTextSize(1, 14.0f);
                                    textViewH.setMaxLines(1);
                                    textViewH.setEllipsize(truncateAt);
                                    textViewH.setSingleLine(true);
                                    textViewH.setTextColor(tc0Var3.getThemedColor(org.telegram.ui.ActionBar.g6.A6));
                                    textViewH.setGravity(LocaleController.isRTL ? 5 : 3);
                                    tc0Var3.f42870k0.addView(textViewH, h7.z5.d(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                                    textView.setText(sc0Var.f42575c.title);
                                    textViewH.setText(LocaleController.getString(R.string.TapToSendLocation));
                                    FrameLayout frameLayout3 = new FrameLayout(context);
                                    frameLayout3.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(36.0f), org.telegram.ui.Cells.r4.a(sc0Var.f42573a)));
                                    frameLayout.addView(frameLayout3, h7.z5.d(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                                    org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(context);
                                    n9Var.f(a9.p.p(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), sc0Var.f42575c.venue_type, "_64.png"), null, null);
                                    frameLayout3.addView(n9Var, h7.z5.e(30, 30, 17));
                                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                    valueAnimatorOfFloat.addUpdateListener(new pc0(qc0Var, frameLayout3));
                                    valueAnimatorOfFloat.setDuration(360L);
                                    valueAnimatorOfFloat.start();
                                    map.put(iMarker, frameLayout);
                                    tc0Var3.E.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
                                }
                            }
                            return true;
                        }
                    });
                    tc0Var.E.setOnCameraMoveListener(new cc0(tc0Var, 3));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location lastKnownLocation = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        lastKnownLocation = locationManager.getLastKnownLocation(providers.get(size));
                        if (lastKnownLocation != null) {
                            tc0Var.f42880s0 = lastKnownLocation;
                            tc0Var.t0(lastKnownLocation);
                            if (tc0Var.X && tc0Var.getParentActivity() != null) {
                                tc0Var.X = false;
                                tc0Var.d0();
                            }
                            imageView = tc0Var.f42859c;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = tc0Var.getLocationController().getSharingLocationInfo(tc0Var.f42856a0)) != null && (i10 = sharingLocationInfo.proximityMeters) > 0) {
                                tc0Var.e0(i10);
                                break;
                            }
                        }
                    }
                    tc0Var.f42880s0 = lastKnownLocation;
                    tc0Var.t0(lastKnownLocation);
                    if (tc0Var.X) {
                        tc0Var.X = false;
                        tc0Var.d0();
                    }
                    imageView = tc0Var.f42859c;
                    if (imageView == null) {
                    }
                    break;
                }
                break;
            default:
                tc0 tc0Var2 = this.f37729b;
                Location location2 = (Location) obj;
                tc0Var2.t0(location2);
                tc0Var2.getLocationController().setMapLocation(location2, tc0Var2.Z);
                tc0Var2.Z = false;
                break;
        }
    }
}
