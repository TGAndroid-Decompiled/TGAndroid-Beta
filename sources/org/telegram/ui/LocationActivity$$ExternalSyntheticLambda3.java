package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.location.Location;
import android.net.Uri;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.BaseLocationAdapter;
import org.telegram.ui.Components.RecyclerListView;

public final class LocationActivity$$ExternalSyntheticLambda3 implements ActionBarMenuItem.ActionBarMenuItemDelegate, AlertDialog.OnButtonClickListener, BaseLocationAdapter.BaseLocationAdapterDelegate, IMapsProvider.OnCameraMoveStartedListener, IMapsProvider.ITouchInterceptor {
    public final int $r8$classId;
    public final LocationActivity f$0;

    public LocationActivity$$ExternalSyntheticLambda3(LocationActivity locationActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = locationActivity;
    }

    @Override
    public void didLoadSearchResult(ArrayList arrayList) {
        switch (this.$r8$classId) {
            case 0:
                LocationActivity locationActivity = this.f$0;
                if (arrayList != null) {
                    ArrayList arrayList2 = locationActivity.placeMarkers;
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        ((LocationActivity.VenueLocation) arrayList2.get(i)).marker.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i2);
                        try {
                            IMapsProvider.IMarkerOptions iMarkerOptionsOnCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions iMarkerOptionsPosition = iMarkerOptionsOnCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            iMarkerOptionsPosition.icon(locationActivity.createPlaceBitmap$1(i2));
                            iMarkerOptionsPosition.anchor(0.5f, 0.5f);
                            iMarkerOptionsPosition.title(tL_messageMediaVenue.title);
                            iMarkerOptionsPosition.snippet(tL_messageMediaVenue.address);
                            LocationActivity.VenueLocation venueLocation = new LocationActivity.VenueLocation();
                            venueLocation.num = i2;
                            IMapsProvider.IMarker iMarkerAddMarker = locationActivity.map.addMarker(iMarkerOptionsPosition);
                            venueLocation.marker = iMarkerAddMarker;
                            venueLocation.venue = tL_messageMediaVenue;
                            iMarkerAddMarker.setTag(venueLocation);
                            arrayList2.add(venueLocation);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                    break;
                }
                break;
            default:
                LocationActivity locationActivity2 = this.f$0;
                locationActivity2.searchInProgress = false;
                locationActivity2.updateEmptyView$5();
                break;
        }
    }

    @Override
    public void onCameraMoveStarted(int i) {
        View childAt;
        LocationActivity locationActivity = this.f$0;
        if (i == 1) {
            locationActivity.showSearchPlacesButton$1(true);
            if (locationActivity.lastPressedMarker != null) {
                locationActivity.markerImageView.setVisibility(0);
                LocationActivity.MapOverlayView mapOverlayView = locationActivity.overlayView;
                IMapsProvider.IMarker iMarker = locationActivity.lastPressedMarker;
                View view = (View) mapOverlayView.views.get(iMarker);
                if (view != null) {
                    mapOverlayView.removeView(view);
                    mapOverlayView.views.remove(iMarker);
                }
                locationActivity.lastPressedMarker = null;
                locationActivity.lastPressedVenue = null;
                locationActivity.lastPressedMarkerView = null;
            }
            locationActivity.selectedMarkerId = -1L;
            if (locationActivity.showAllMode) {
                locationActivity.showAllMode = false;
                locationActivity.updateShowAllButton();
            }
            if (locationActivity.scrolling) {
                return;
            }
            int i2 = locationActivity.locationType;
            if ((i2 == 0 || i2 == 1) && locationActivity.listView.getChildCount() > 0 && (childAt = locationActivity.listView.getChildAt(0)) != null) {
                RecyclerListView recyclerListView = locationActivity.listView;
                View viewFindContainingItemView = recyclerListView.findContainingItemView(childAt);
                RecyclerView.ViewHolder childViewHolder = viewFindContainingItemView == null ? null : recyclerListView.getChildViewHolder(viewFindContainingItemView);
                if (childViewHolder == null || childViewHolder.getAdapterPosition() != 0) {
                    return;
                }
                int iDp = i2 == 0 ? 0 : AndroidUtilities.dp(66.0f);
                int top = childAt.getTop();
                if (top < (-iDp)) {
                    IMapsProvider.CameraPosition cameraPosition = locationActivity.map.getCameraPosition();
                    locationActivity.forceUpdate = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                    locationActivity.listView.smoothScrollBy(0, top + iDp, null);
                }
            }
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 2:
                LocationActivity locationActivity = this.f$0;
                if (locationActivity.getParentActivity() != null) {
                    try {
                        locationActivity.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
                    } catch (Exception unused) {
                        return;
                    }
                    break;
                }
                break;
            default:
                LocationActivity locationActivity2 = this.f$0;
                if (locationActivity2.getParentActivity() != null) {
                    try {
                        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                        intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                        locationActivity2.getParentActivity().startActivity(intent);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    break;
                }
                break;
        }
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        MotionEvent motionEventObtain;
        Location location;
        LocationActivity locationActivity = this.f$0;
        switch (this.$r8$classId) {
            case 6:
                if (locationActivity.yOffset != 0.0f) {
                    motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(0.0f, (-locationActivity.yOffset) / 2.0f);
                    motionEvent2 = motionEventObtain;
                } else {
                    motionEvent2 = motionEvent;
                    motionEventObtain = null;
                }
                boolean zBooleanValue = ((Boolean) iCallableMethod.call(motionEvent2)).booleanValue();
                if (motionEventObtain != null) {
                    motionEventObtain.recycle();
                }
                return zBooleanValue;
            default:
                if (locationActivity.messageObject == null && locationActivity.chatLocation == null) {
                    if (motionEvent.getAction() == 0) {
                        AnimatorSet animatorSet = locationActivity.animatorSet;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        locationActivity.animatorSet = animatorSet2;
                        animatorSet2.setDuration(200L);
                        locationActivity.animatorSet.playTogether(ObjectAnimator.ofFloat(locationActivity.markerImageView, (Property<View, Float>) View.TRANSLATION_Y, locationActivity.markerTop - AndroidUtilities.dp(10.0f)));
                        locationActivity.animatorSet.start();
                    } else if (motionEvent.getAction() == 1) {
                        AnimatorSet animatorSet3 = locationActivity.animatorSet;
                        if (animatorSet3 != null) {
                            animatorSet3.cancel();
                        }
                        locationActivity.yOffset = 0.0f;
                        AnimatorSet animatorSet4 = new AnimatorSet();
                        locationActivity.animatorSet = animatorSet4;
                        animatorSet4.setDuration(200L);
                        locationActivity.animatorSet.playTogether(ObjectAnimator.ofFloat(locationActivity.markerImageView, (Property<View, Float>) View.TRANSLATION_Y, locationActivity.markerTop));
                        locationActivity.animatorSet.start();
                        locationActivity.adapter.fetchLocationAddress();
                    }
                    if (motionEvent.getAction() == 2) {
                        if (!locationActivity.userLocationMoved) {
                            ImageView imageView = locationActivity.locationButton;
                            int i = Theme.key_location_actionIcon;
                            imageView.setColorFilter(new PorterDuffColorFilter(locationActivity.getThemedColor(i), PorterDuff.Mode.MULTIPLY));
                            locationActivity.locationButton.setTag(Integer.valueOf(i));
                            locationActivity.userLocationMoved = true;
                        }
                        IMapsProvider.IMap iMap = locationActivity.map;
                        if (iMap != null && (location = locationActivity.userLocation) != null) {
                            location.setLatitude(iMap.getCameraPosition().target.latitude);
                            locationActivity.userLocation.setLongitude(locationActivity.map.getCameraPosition().target.longitude);
                        }
                        LocationActivity.AnonymousClass4 anonymousClass4 = locationActivity.adapter;
                        anonymousClass4.customLocation = locationActivity.userLocation;
                        anonymousClass4.fetchLocationAddress();
                        anonymousClass4.updateCell();
                    }
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        }
    }

    @Override
    public void onItemClick(int i) {
        IMapsProvider.IMap iMap = this.f$0.map;
        if (iMap == null) {
            return;
        }
        if (i == 2) {
            iMap.setMapType(0);
        } else if (i == 3) {
            iMap.setMapType(1);
        } else if (i == 4) {
            iMap.setMapType(2);
        }
    }
}
