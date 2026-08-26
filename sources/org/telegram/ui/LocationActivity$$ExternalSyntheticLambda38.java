package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.location.Location;
import android.location.LocationManager;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.util.Consumer;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_label.zzcv;
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
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.LocationCell;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;

public final class LocationActivity$$ExternalSyntheticLambda38 implements Consumer {
    public final int $r8$classId;
    public final LocationActivity f$0;

    public LocationActivity$$ExternalSyntheticLambda38(LocationActivity locationActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = locationActivity;
    }

    @Override
    public final void accept(Object obj) {
        ImageView imageView;
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i;
        switch (this.$r8$classId) {
            case 0:
                final LocationActivity locationActivity = this.f$0;
                locationActivity.map = (IMapsProvider.IMap) obj;
                int i2 = AndroidUtilities.computePerceivedBrightness(locationActivity.getThemedColor(Theme.key_windowBackgroundWhite)) < 0.721f ? R.raw.mapstyle_night : 0;
                if (i2 != 0) {
                    locationActivity.currentMapStyleDark = true;
                    locationActivity.map.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, i2));
                }
                locationActivity.map.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                if (locationActivity.map != null) {
                    locationActivity.mapView.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
                    final float minZoomLevel = locationActivity.initialMaxZoom ? locationActivity.map.getMinZoomLevel() + 4.0f : locationActivity.map.getMaxZoomLevel() - 4.0f;
                    TLRPC.TL_channelLocation tL_channelLocation = locationActivity.chatLocation;
                    if (tL_channelLocation == null) {
                        MessageObject messageObject = locationActivity.messageObject;
                        if (messageObject != null) {
                            if (messageObject.isLiveLocation()) {
                                LocationActivity.LiveLocation liveLocationAddUserMarker = locationActivity.addUserMarker(locationActivity.messageObject.messageOwner);
                                if (!locationActivity.getRecentLocations()) {
                                    locationActivity.map.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(liveLocationAddUserMarker.marker.getPosition(), minZoomLevel));
                                }
                            } else {
                                IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(locationActivity.userLocation.getLatitude(), locationActivity.userLocation.getLongitude());
                                try {
                                    locationActivity.map.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).icon(R.drawable.map_pin2));
                                } catch (Exception e) {
                                    FileLog.e(e);
                                }
                                locationActivity.map.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, minZoomLevel));
                                locationActivity.firstFocus = false;
                                locationActivity.getRecentLocations();
                            }
                            break;
                        } else {
                            Location location = new Location("network");
                            locationActivity.userLocation = location;
                            TLRPC.TL_channelLocation tL_channelLocation2 = locationActivity.initialLocation;
                            if (tL_channelLocation2 != null) {
                                TLRPC.GeoPoint geoPoint = tL_channelLocation2.geo_point;
                                locationActivity.map.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), minZoomLevel));
                                locationActivity.userLocation.setLatitude(locationActivity.initialLocation.geo_point.lat);
                                locationActivity.userLocation.setLongitude(locationActivity.initialLocation.geo_point._long);
                                locationActivity.userLocation.setAccuracy(locationActivity.initialLocation.geo_point.accuracy_radius);
                                LocationActivity.AnonymousClass4 anonymousClass4 = locationActivity.adapter;
                                anonymousClass4.customLocation = locationActivity.userLocation;
                                anonymousClass4.fetchLocationAddress();
                                anonymousClass4.updateCell();
                            } else {
                                location.setLatitude(20.659322d);
                                locationActivity.userLocation.setLongitude(-11.40625d);
                            }
                        }
                    } else {
                        TLRPC.GeoPoint geoPoint2 = tL_channelLocation.geo_point;
                        IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long);
                        LocationActivity.LiveLocation liveLocation = new LocationActivity.LiveLocation();
                        if (DialogObject.isUserDialog(locationActivity.dialogId)) {
                            liveLocation.user = locationActivity.getMessagesController().getUser(Long.valueOf(locationActivity.dialogId));
                        } else {
                            liveLocation.chat = locationActivity.getMessagesController().getChat(Long.valueOf(-locationActivity.dialogId));
                        }
                        liveLocation.id = locationActivity.dialogId;
                        locationActivity.setupAvatarReceiver(liveLocation);
                        try {
                            IMapsProvider.IMarkerOptions iMarkerOptionsPosition = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2);
                            Bitmap bitmapCreateUserBitmap = locationActivity.createUserBitmap(liveLocation);
                            if (bitmapCreateUserBitmap != null) {
                                iMarkerOptionsPosition.icon(bitmapCreateUserBitmap);
                                iMarkerOptionsPosition.anchor(0.5f, 0.907f);
                                liveLocation.marker = locationActivity.map.addMarker(iMarkerOptionsPosition);
                                if (!UserObject.isUserSelf(liveLocation.user)) {
                                    IMapsProvider.IMarkerOptions iMarkerOptionsFlat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng2).flat(true);
                                    iMarkerOptionsFlat.icon(R.drawable.map_pin_circle);
                                    iMarkerOptionsFlat.anchor(0.5f, 0.5f);
                                    liveLocation.directionMarker = locationActivity.map.addMarker(iMarkerOptionsFlat);
                                }
                                locationActivity.markers.add(liveLocation);
                                locationActivity.markersMap.put(liveLocation, liveLocation.id);
                            }
                        } catch (Exception e2) {
                            FileLog.e(e2);
                        }
                        locationActivity.map.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(liveLocation.marker.getPosition(), minZoomLevel));
                        break;
                    }
                    try {
                        locationActivity.map.setMyLocationEnabled(true);
                    } catch (Exception e3) {
                        FileLog.e((Throwable) e3, false);
                    }
                    locationActivity.map.getUiSettings().setMyLocationButtonEnabled(false);
                    locationActivity.map.getUiSettings().setZoomControlsEnabled(false);
                    locationActivity.map.getUiSettings().setCompassEnabled(false);
                    locationActivity.map.setOnCameraMoveStartedListener(new LocationActivity$$ExternalSyntheticLambda3(locationActivity, 5));
                    locationActivity.map.setOnMyLocationChangeListener(new LocationActivity$$ExternalSyntheticLambda38(locationActivity, 1));
                    locationActivity.map.setOnMarkerClickListener(new IMapsProvider.OnMarkerClickListener() {
                        @Override
                        public final boolean onClick(IMapsProvider.IMarker iMarker) {
                            LocationActivity locationActivity2 = locationActivity;
                            if (iMarker.getTag() instanceof LocationActivity.VenueLocation) {
                                locationActivity2.markerImageView.setVisibility(4);
                                if (!locationActivity2.userLocationMoved) {
                                    ImageView imageView2 = locationActivity2.locationButton;
                                    int i3 = Theme.key_location_actionIcon;
                                    imageView2.setColorFilter(new PorterDuffColorFilter(locationActivity2.getThemedColor(i3), PorterDuff.Mode.MULTIPLY));
                                    locationActivity2.locationButton.setTag(Integer.valueOf(i3));
                                    locationActivity2.userLocationMoved = true;
                                }
                                int i4 = 0;
                                while (true) {
                                    ArrayList arrayList = locationActivity2.markers;
                                    if (i4 < arrayList.size()) {
                                        LocationActivity.LiveLocation liveLocation2 = (LocationActivity.LiveLocation) arrayList.get(i4);
                                        if (liveLocation2 != null && liveLocation2.marker == iMarker) {
                                            locationActivity2.selectedMarkerId = liveLocation2.id;
                                            if (locationActivity2.showAllMode) {
                                                locationActivity2.showAllMode = false;
                                                locationActivity2.updateShowAllButton();
                                            }
                                            locationActivity2.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(liveLocation2.marker.getPosition(), minZoomLevel));
                                            break;
                                        }
                                        i4++;
                                    } else {
                                        break;
                                    }
                                }
                                final LocationActivity.MapOverlayView mapOverlayView = locationActivity2.overlayView;
                                mapOverlayView.getClass();
                                LocationActivity.VenueLocation venueLocation = (LocationActivity.VenueLocation) iMarker.getTag();
                                if (venueLocation != null) {
                                    LocationActivity locationActivity3 = LocationActivity.this;
                                    if (locationActivity3.lastPressedVenue != venueLocation) {
                                        locationActivity3.showSearchPlacesButton$1(false);
                                        IMapsProvider.IMarker iMarker2 = locationActivity3.lastPressedMarker;
                                        HashMap map = mapOverlayView.views;
                                        if (iMarker2 != null) {
                                            View view = (View) map.get(iMarker2);
                                            if (view != null) {
                                                mapOverlayView.removeView(view);
                                                map.remove(iMarker2);
                                            }
                                            locationActivity3.lastPressedMarker = null;
                                        }
                                        locationActivity3.lastPressedVenue = venueLocation;
                                        locationActivity3.lastPressedMarker = iMarker;
                                        Context context = mapOverlayView.getContext();
                                        FrameLayout frameLayout = new FrameLayout(context);
                                        mapOverlayView.addView(frameLayout, LayoutHelper.createFrame(114.0f, -2));
                                        FrameLayout frameLayout2 = new FrameLayout(context);
                                        locationActivity3.lastPressedMarkerView = frameLayout2;
                                        frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                                        locationActivity3.lastPressedMarkerView.getBackground().setColorFilter(new PorterDuffColorFilter(locationActivity3.getThemedColor(Theme.key_dialogBackground), PorterDuff.Mode.MULTIPLY));
                                        frameLayout.addView(locationActivity3.lastPressedMarkerView, LayoutHelper.createFrame(71.0f, -2));
                                        locationActivity3.lastPressedMarkerView.setAlpha(0.0f);
                                        locationActivity3.lastPressedMarkerView.setOnClickListener(new IntroActivity$$ExternalSyntheticLambda1(23, mapOverlayView, venueLocation));
                                        TextView textView = new TextView(context);
                                        textView.setTextSize(1, 16.0f);
                                        textView.setMaxLines(1);
                                        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                                        textView.setEllipsize(truncateAt);
                                        textView.setSingleLine(true);
                                        textView.setTextColor(locationActivity3.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
                                        textView.setTypeface(AndroidUtilities.bold());
                                        textView.setGravity(LocaleController.isRTL ? 5 : 3);
                                        TextView textViewM = zzcv.m(locationActivity3.lastPressedMarkerView, textView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                                        textViewM.setTextSize(1, 14.0f);
                                        textViewM.setMaxLines(1);
                                        textViewM.setEllipsize(truncateAt);
                                        textViewM.setSingleLine(true);
                                        textViewM.setTextColor(locationActivity3.getThemedColor(Theme.key_windowBackgroundWhiteGrayText3));
                                        textViewM.setGravity(LocaleController.isRTL ? 5 : 3);
                                        locationActivity3.lastPressedMarkerView.addView(textViewM, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                                        textView.setText(venueLocation.venue.title);
                                        textViewM.setText(LocaleController.getString(R.string.TapToSendLocation));
                                        final FrameLayout frameLayout3 = new FrameLayout(context);
                                        frameLayout3.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(36.0f), LocationCell.getColorForIndex(venueLocation.num)));
                                        frameLayout.addView(frameLayout3, LayoutHelper.createFrame(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                                        BackupImageView backupImageView = new BackupImageView(context);
                                        backupImageView.setImage(MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), venueLocation.venue.venue_type, "_64.png"), null, null);
                                        frameLayout3.addView(backupImageView, LayoutHelper.createFrame(30, 30, 17));
                                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                                            public final float[] animatorValues = {0.0f, 1.0f};
                                            public boolean startedInner;

                                            @Override
                                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                                float interpolation;
                                                float fLerp = AndroidUtilities.lerp(this.animatorValues, valueAnimator.getAnimatedFraction());
                                                if (fLerp >= 0.7f && !this.startedInner) {
                                                    MapOverlayView mapOverlayView2 = MapOverlayView.this;
                                                    if (LocationActivity.this.lastPressedMarkerView != null) {
                                                        AnimatorSet animatorSet = new AnimatorSet();
                                                        LocationActivity locationActivity4 = LocationActivity.this;
                                                        animatorSet.playTogether(ObjectAnimator.ofFloat(locationActivity4.lastPressedMarkerView, (Property<FrameLayout, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(locationActivity4.lastPressedMarkerView, (Property<FrameLayout, Float>) View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(locationActivity4.lastPressedMarkerView, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                                                        animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                                                        animatorSet.setDuration(250L);
                                                        animatorSet.start();
                                                        this.startedInner = true;
                                                    }
                                                }
                                                if (fLerp <= 0.5f) {
                                                    interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(fLerp / 0.5f) * 1.1f;
                                                } else {
                                                    interpolation = fLerp <= 0.75f ? 1.1f - (CubicBezierInterpolator.EASE_OUT.getInterpolation((fLerp - 0.5f) / 0.25f) * 0.2f) : (CubicBezierInterpolator.EASE_OUT.getInterpolation((fLerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
                                                }
                                                FrameLayout frameLayout4 = frameLayout3;
                                                frameLayout4.setScaleX(interpolation);
                                                frameLayout4.setScaleY(interpolation);
                                            }
                                        });
                                        valueAnimatorOfFloat.setDuration(360L);
                                        valueAnimatorOfFloat.start();
                                        map.put(iMarker, frameLayout);
                                        locationActivity3.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
                                    }
                                }
                            }
                            return true;
                        }
                    });
                    locationActivity.map.setOnCameraMoveListener(new LocationActivity$$ExternalSyntheticLambda6(locationActivity, 4));
                    LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
                    List<String> providers = locationManager.getProviders(true);
                    Location lastKnownLocation = null;
                    for (int size = providers.size() - 1; size >= 0; size--) {
                        lastKnownLocation = locationManager.getLastKnownLocation(providers.get(size));
                        if (lastKnownLocation != null) {
                            locationActivity.myLocation = lastKnownLocation;
                            locationActivity.positionMarker$1(lastKnownLocation);
                            if (locationActivity.checkGpsEnabled && locationActivity.getParentActivity() != null) {
                                locationActivity.checkGpsEnabled = false;
                                locationActivity.checkGpsEnabled();
                            }
                            imageView = locationActivity.proximityButton;
                            if (imageView == null && imageView.getVisibility() == 0 && (sharingLocationInfo = locationActivity.getLocationController().getSharingLocationInfo(locationActivity.dialogId)) != null && (i = sharingLocationInfo.proximityMeters) > 0) {
                                locationActivity.createCircle(i);
                                break;
                            }
                        }
                    }
                    locationActivity.myLocation = lastKnownLocation;
                    locationActivity.positionMarker$1(lastKnownLocation);
                    if (locationActivity.checkGpsEnabled) {
                        locationActivity.checkGpsEnabled = false;
                        locationActivity.checkGpsEnabled();
                    }
                    imageView = locationActivity.proximityButton;
                    if (imageView == null) {
                    }
                    break;
                }
                break;
            default:
                Location location2 = (Location) obj;
                LocationActivity locationActivity2 = this.f$0;
                locationActivity2.positionMarker$1(location2);
                locationActivity2.getLocationController().setMapLocation(location2, locationActivity2.isFirstLocation);
                locationActivity2.isFirstLocation = false;
                break;
        }
    }
}
