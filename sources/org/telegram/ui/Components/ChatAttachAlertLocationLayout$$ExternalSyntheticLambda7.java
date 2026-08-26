package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_label.zzcv;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Adapters.BaseLocationAdapter;
import org.telegram.ui.Adapters.LocationActivityAdapter;
import org.telegram.ui.Cells.LocationCell;
import org.telegram.ui.ChatActivity;

public final class ChatAttachAlertLocationLayout$$ExternalSyntheticLambda7 implements ActionBarMenuItem.ActionBarMenuItemDelegate, BaseLocationAdapter.BaseLocationAdapterDelegate, IMapsProvider.ITouchInterceptor, IMapsProvider.OnCameraMoveStartedListener, IMapsProvider.OnMarkerClickListener, AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final ChatAttachAlertLocationLayout f$0;

    public ChatAttachAlertLocationLayout$$ExternalSyntheticLambda7(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = chatAttachAlertLocationLayout;
    }

    @Override
    public void didLoadSearchResult(ArrayList arrayList) {
        switch (this.$r8$classId) {
            case 2:
                ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = this.f$0;
                if (arrayList == null) {
                    chatAttachAlertLocationLayout.getClass();
                } else {
                    ArrayList arrayList2 = chatAttachAlertLocationLayout.placeMarkers;
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        ((ChatAttachAlertLocationLayout.VenueLocation) arrayList2.get(i)).marker.remove();
                    }
                    arrayList2.clear();
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i2);
                        try {
                            IMapsProvider.IMarkerOptions iMarkerOptionsOnCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                            IMapsProvider.IMarkerOptions iMarkerOptionsPosition = iMarkerOptionsOnCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                            iMarkerOptionsPosition.icon(chatAttachAlertLocationLayout.createPlaceBitmap(i2));
                            iMarkerOptionsPosition.anchor(0.5f, 0.5f);
                            iMarkerOptionsPosition.title(tL_messageMediaVenue.title);
                            iMarkerOptionsPosition.snippet(tL_messageMediaVenue.address);
                            ChatAttachAlertLocationLayout.VenueLocation venueLocation = new ChatAttachAlertLocationLayout.VenueLocation();
                            venueLocation.num = i2;
                            IMapsProvider.IMarker iMarkerAddMarker = chatAttachAlertLocationLayout.map.addMarker(iMarkerOptionsPosition);
                            venueLocation.marker = iMarkerAddMarker;
                            venueLocation.venue = tL_messageMediaVenue;
                            iMarkerAddMarker.setTag(venueLocation);
                            arrayList2.add(venueLocation);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                }
                break;
            default:
                ChatAttachAlertLocationLayout chatAttachAlertLocationLayout2 = this.f$0;
                chatAttachAlertLocationLayout2.searchInProgress = false;
                chatAttachAlertLocationLayout2.updateEmptyView$3();
                break;
        }
    }

    @Override
    public void onCameraMoveStarted(int i) {
        View childAt;
        ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = this.f$0;
        if (i != 1) {
            chatAttachAlertLocationLayout.getClass();
            return;
        }
        chatAttachAlertLocationLayout.showSearchPlacesButton(true);
        if (chatAttachAlertLocationLayout.lastPressedMarker != null) {
            chatAttachAlertLocationLayout.markerImageView.setVisibility(0);
            IMapsProvider.IMarker iMarker = chatAttachAlertLocationLayout.lastPressedMarker;
            ChatAttachAlertLocationLayout.MapOverlayView mapOverlayView = chatAttachAlertLocationLayout.overlayView;
            View view = (View) mapOverlayView.views.get(iMarker);
            if (view != null) {
                mapOverlayView.removeView(view);
                mapOverlayView.views.remove(iMarker);
            }
            chatAttachAlertLocationLayout.lastPressedMarker = null;
            chatAttachAlertLocationLayout.lastPressedVenue = null;
            chatAttachAlertLocationLayout.lastPressedMarkerView = null;
        }
        if (chatAttachAlertLocationLayout.scrolling) {
            return;
        }
        ChatActivity.AnonymousClass34 anonymousClass34 = chatAttachAlertLocationLayout.listView;
        if (anonymousClass34.getChildCount() <= 0 || (childAt = anonymousClass34.getChildAt(0)) == null) {
            return;
        }
        View viewFindContainingItemView = anonymousClass34.findContainingItemView(childAt);
        RecyclerView.ViewHolder childViewHolder = viewFindContainingItemView == null ? null : anonymousClass34.getChildViewHolder(viewFindContainingItemView);
        if (childViewHolder == null || childViewHolder.getAdapterPosition() != 0) {
            return;
        }
        int iDp = chatAttachAlertLocationLayout.locationType == 0 ? 0 : AndroidUtilities.dp(66.0f);
        int top = childAt.getTop();
        if (top < (-iDp)) {
            IMapsProvider.CameraPosition cameraPosition = chatAttachAlertLocationLayout.map.getCameraPosition();
            chatAttachAlertLocationLayout.forceUpdate = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
            anonymousClass34.smoothScrollBy(0, top + iDp, null);
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        this.f$0.lambda$onMapInit$28();
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        Location location;
        MotionEvent motionEvent2;
        MotionEvent motionEventObtain;
        ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                chatAttachAlertLocationLayout.getClass();
                int action = motionEvent.getAction();
                Property property = View.TRANSLATION_Y;
                ImageView imageView = chatAttachAlertLocationLayout.markerImageView;
                if (action == 0) {
                    AnimatorSet animatorSet = chatAttachAlertLocationLayout.animatorSet;
                    if (animatorSet != null) {
                        animatorSet.cancel();
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    chatAttachAlertLocationLayout.animatorSet = animatorSet2;
                    animatorSet2.setDuration(200L);
                    chatAttachAlertLocationLayout.animatorSet.playTogether(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, chatAttachAlertLocationLayout.markerTop - AndroidUtilities.dp(10.0f)));
                    chatAttachAlertLocationLayout.animatorSet.start();
                } else if (motionEvent.getAction() == 1) {
                    AnimatorSet animatorSet3 = chatAttachAlertLocationLayout.animatorSet;
                    if (animatorSet3 != null) {
                        animatorSet3.cancel();
                    }
                    chatAttachAlertLocationLayout.yOffset = 0.0f;
                    AnimatorSet animatorSet4 = new AnimatorSet();
                    chatAttachAlertLocationLayout.animatorSet = animatorSet4;
                    animatorSet4.setDuration(200L);
                    chatAttachAlertLocationLayout.animatorSet.playTogether(ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, chatAttachAlertLocationLayout.markerTop));
                    chatAttachAlertLocationLayout.animatorSet.start();
                }
                if (motionEvent.getAction() == 2) {
                    if (!chatAttachAlertLocationLayout.userLocationMoved) {
                        ImageView imageView2 = chatAttachAlertLocationLayout.locationButton;
                        int i = Theme.key_location_actionIcon;
                        imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, chatAttachAlertLocationLayout.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                        imageView2.setTag(Integer.valueOf(i));
                        chatAttachAlertLocationLayout.userLocationMoved = true;
                    }
                    IMapsProvider.IMap iMap = chatAttachAlertLocationLayout.map;
                    if (iMap != null && (location = chatAttachAlertLocationLayout.userLocation) != null) {
                        location.setLatitude(iMap.getCameraPosition().target.latitude);
                        chatAttachAlertLocationLayout.userLocation.setLongitude(chatAttachAlertLocationLayout.map.getCameraPosition().target.longitude);
                    }
                    LocationActivityAdapter locationActivityAdapter = chatAttachAlertLocationLayout.adapter;
                    locationActivityAdapter.customLocation = chatAttachAlertLocationLayout.userLocation;
                    locationActivityAdapter.fetchLocationAddress();
                    locationActivityAdapter.updateCell();
                }
                return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
            default:
                if (chatAttachAlertLocationLayout.yOffset != 0.0f) {
                    motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.offsetLocation(0.0f, (-chatAttachAlertLocationLayout.yOffset) / 2.0f);
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

    @Override
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = this.f$0;
        chatAttachAlertLocationLayout.getClass();
        if (iMarker.getTag() instanceof ChatAttachAlertLocationLayout.VenueLocation) {
            chatAttachAlertLocationLayout.markerImageView.setVisibility(4);
            if (!chatAttachAlertLocationLayout.userLocationMoved) {
                ImageView imageView = chatAttachAlertLocationLayout.locationButton;
                int i = Theme.key_location_actionIcon;
                imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, chatAttachAlertLocationLayout.resourcesProvider), PorterDuff.Mode.MULTIPLY));
                imageView.setTag(Integer.valueOf(i));
                chatAttachAlertLocationLayout.userLocationMoved = true;
            }
            final ChatAttachAlertLocationLayout.MapOverlayView mapOverlayView = chatAttachAlertLocationLayout.overlayView;
            mapOverlayView.getClass();
            ChatAttachAlertLocationLayout.VenueLocation venueLocation = (ChatAttachAlertLocationLayout.VenueLocation) iMarker.getTag();
            ChatAttachAlertLocationLayout chatAttachAlertLocationLayout2 = ChatAttachAlertLocationLayout.this;
            if (chatAttachAlertLocationLayout2.lastPressedVenue != venueLocation) {
                chatAttachAlertLocationLayout2.showSearchPlacesButton(false);
                IMapsProvider.IMarker iMarker2 = chatAttachAlertLocationLayout2.lastPressedMarker;
                HashMap map = mapOverlayView.views;
                if (iMarker2 != null) {
                    View view = (View) map.get(iMarker2);
                    if (view != null) {
                        mapOverlayView.removeView(view);
                        map.remove(iMarker2);
                    }
                    chatAttachAlertLocationLayout2.lastPressedMarker = null;
                }
                chatAttachAlertLocationLayout2.lastPressedVenue = venueLocation;
                chatAttachAlertLocationLayout2.lastPressedMarker = iMarker;
                Context context = mapOverlayView.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                mapOverlayView.addView(frameLayout, LayoutHelper.createFrame(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                chatAttachAlertLocationLayout2.lastPressedMarkerView = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                Drawable background = chatAttachAlertLocationLayout2.lastPressedMarkerView.getBackground();
                int i2 = Theme.key_dialogBackground;
                Theme.ResourcesProvider resourcesProvider = chatAttachAlertLocationLayout2.resourcesProvider;
                background.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, resourcesProvider), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(chatAttachAlertLocationLayout2.lastPressedMarkerView, LayoutHelper.createFrame(71.0f, -2));
                chatAttachAlertLocationLayout2.lastPressedMarkerView.setAlpha(0.0f);
                chatAttachAlertLocationLayout2.lastPressedMarkerView.setOnClickListener(new ItemOptions$$ExternalSyntheticLambda7(13, mapOverlayView, venueLocation));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                TextView textViewM = zzcv.m(chatAttachAlertLocationLayout2.lastPressedMarkerView, textView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                textViewM.setTextSize(1, 14.0f);
                textViewM.setMaxLines(1);
                textViewM.setEllipsize(truncateAt);
                textViewM.setSingleLine(true);
                textViewM.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3, resourcesProvider));
                textViewM.setGravity(LocaleController.isRTL ? 5 : 3);
                chatAttachAlertLocationLayout2.lastPressedMarkerView.addView(textViewM, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
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
                    public final FrameLayout val$iconLayout;

                    public AnonymousClass1() {
                        frameLayout = frameLayout3;
                    }

                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float interpolation;
                        float fLerp = AndroidUtilities.lerp(this.animatorValues, valueAnimator.getAnimatedFraction());
                        if (fLerp >= 0.7f && !this.startedInner) {
                            MapOverlayView mapOverlayView2 = MapOverlayView.this;
                            if (ChatAttachAlertLocationLayout.this.lastPressedMarkerView != null) {
                                AnimatorSet animatorSet = new AnimatorSet();
                                ChatAttachAlertLocationLayout chatAttachAlertLocationLayout3 = ChatAttachAlertLocationLayout.this;
                                animatorSet.playTogether(ObjectAnimator.ofFloat(chatAttachAlertLocationLayout3.lastPressedMarkerView, (Property<FrameLayout, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(chatAttachAlertLocationLayout3.lastPressedMarkerView, (Property<FrameLayout, Float>) View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(chatAttachAlertLocationLayout3.lastPressedMarkerView, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
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
                        FrameLayout frameLayout4 = frameLayout;
                        frameLayout4.setScaleX(interpolation);
                        frameLayout4.setScaleY(interpolation);
                    }
                });
                valueAnimatorOfFloat.setDuration(360L);
                valueAnimatorOfFloat.start();
                map.put(iMarker, frameLayout);
                chatAttachAlertLocationLayout2.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
                return true;
            }
        }
        return true;
    }
}
