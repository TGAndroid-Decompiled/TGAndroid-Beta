package org.telegram.p009ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.MapsInitializer;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Circle;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.Dash;
import com.google.android.gms.maps.model.Gap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PatternItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.C0952R;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.p009ui.ActionBar.ActionBarMenu;
import org.telegram.p009ui.ActionBar.ActionBarMenuItem;
import org.telegram.p009ui.ActionBar.AlertDialog;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.C1006ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ActionBar.ThemeDescription;
import org.telegram.p009ui.Adapters.BaseLocationAdapter;
import org.telegram.p009ui.Adapters.LocationActivityAdapter;
import org.telegram.p009ui.Adapters.LocationActivitySearchAdapter;
import org.telegram.p009ui.Cells.HeaderCell;
import org.telegram.p009ui.Cells.LocationCell;
import org.telegram.p009ui.Cells.LocationDirectionCell;
import org.telegram.p009ui.Cells.LocationLoadingCell;
import org.telegram.p009ui.Cells.LocationPoweredCell;
import org.telegram.p009ui.Cells.SendLocationCell;
import org.telegram.p009ui.Cells.ShadowSectionCell;
import org.telegram.p009ui.Cells.SharingLiveLocationCell;
import org.telegram.p009ui.Components.AlertsCreator;
import org.telegram.p009ui.Components.AvatarDrawable;
import org.telegram.p009ui.Components.BackupImageView;
import org.telegram.p009ui.Components.CombinedDrawable;
import org.telegram.p009ui.Components.CubicBezierInterpolator;
import org.telegram.p009ui.Components.EditTextBoldCursor;
import org.telegram.p009ui.Components.HintView;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.MapPlaceholderDrawable;
import org.telegram.p009ui.Components.ProximitySheet;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.p009ui.Components.UndoView;
import org.telegram.p009ui.LocationActivity;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Chat;
import org.telegram.tgnet.TLRPC$ChatPhoto;
import org.telegram.tgnet.TLRPC$FileLocation;
import org.telegram.tgnet.TLRPC$GeoPoint;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$TL_channelLocation;
import org.telegram.tgnet.TLRPC$TL_channels_editLocation;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_geoPoint;
import org.telegram.tgnet.TLRPC$TL_inputGeoPoint;
import org.telegram.tgnet.TLRPC$TL_messageActionGeoProximityReached;
import org.telegram.tgnet.TLRPC$TL_messageMediaGeo;
import org.telegram.tgnet.TLRPC$TL_messageMediaGeoLive;
import org.telegram.tgnet.TLRPC$TL_messageMediaVenue;
import org.telegram.tgnet.TLRPC$TL_messages_getRecentLocations;
import org.telegram.tgnet.TLRPC$TL_peerUser;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$UserProfilePhoto;
import org.telegram.tgnet.TLRPC$messages_Messages;

public class LocationActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private LocationActivityAdapter adapter;
    private AnimatorSet animatorSet;
    private int askWithRadius;
    private boolean canUndo;
    private TLRPC$TL_channelLocation chatLocation;
    private boolean currentMapStyleDark;
    private LocationActivityDelegate delegate;
    private long dialogId;
    private ImageView emptyImageView;
    private TextView emptySubtitleTextView;
    private TextView emptyTitleTextView;
    private LinearLayout emptyView;
    private boolean firstWas;
    private CameraUpdate forceUpdate;
    private GoogleMap googleMap;
    private HintView hintView;
    private TLRPC$TL_channelLocation initialLocation;
    private Marker lastPressedMarker;
    private FrameLayout lastPressedMarkerView;
    private VenueLocation lastPressedVenue;
    private LinearLayoutManager layoutManager;
    private RecyclerListView listView;
    private ImageView locationButton;
    private int locationType;
    private ActionBarMenuItem mapTypeButton;
    private MapView mapView;
    private FrameLayout mapViewClip;
    private boolean mapsInitialized;
    private Runnable markAsReadRunnable;
    private View markerImageView;
    private int markerTop;
    private MessageObject messageObject;
    private CameraUpdate moveToBounds;
    private Location myLocation;
    private boolean onResumeCalled;
    private ActionBarMenuItem otherItem;
    private MapOverlayView overlayView;
    private ChatActivity parentFragment;
    private double previousRadius;
    private boolean proximityAnimationInProgress;
    private ImageView proximityButton;
    private Circle proximityCircle;
    private ProximitySheet proximitySheet;
    private boolean scrolling;
    private LocationActivitySearchAdapter searchAdapter;
    private SearchButton searchAreaButton;
    private boolean searchInProgress;
    private ActionBarMenuItem searchItem;
    private RecyclerListView searchListView;
    private boolean searchWas;
    private boolean searchedForCustomLocations;
    private boolean searching;
    private View shadow;
    private Drawable shadowDrawable;
    private Runnable updateRunnable;
    private Location userLocation;
    private boolean userLocationMoved;
    private float yOffset;
    private UndoView[] undoView = new UndoView[2];
    private boolean checkGpsEnabled = true;
    private boolean locationDenied = false;
    private boolean isFirstLocation = true;
    private boolean firstFocus = true;
    private ArrayList<LiveLocation> markers = new ArrayList<>();
    private LongSparseArray<LiveLocation> markersMap = new LongSparseArray<>();
    private ArrayList<VenueLocation> placeMarkers = new ArrayList<>();
    private boolean checkPermission = true;
    private boolean checkBackgroundPermission = true;
    private int overScrollHeight = (AndroidUtilities.displaySize.x - C1006ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.m34dp(66.0f);
    private Bitmap[] bitmapCache = new Bitmap[7];

    public static class LiveLocation {
        public TLRPC$Chat chat;
        public Marker directionMarker;
        public boolean hasRotation;
        public long f1111id;
        public Marker marker;
        public TLRPC$Message object;
        public TLRPC$User user;
    }

    public interface LocationActivityDelegate {
        void didSelectLocation(TLRPC$MessageMedia tLRPC$MessageMedia, int i, boolean z, int i2);
    }

    public static class VenueLocation {
        public Marker marker;
        public int num;
        public TLRPC$TL_messageMediaVenue venue;
    }

    public static boolean lambda$createView$7(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    static float access$3316(LocationActivity locationActivity, float f) {
        float f2 = locationActivity.yOffset + f;
        locationActivity.yOffset = f2;
        return f2;
    }

    public static class SearchButton extends TextView {
        private float additionanTranslationY;
        private float currentTranslationY;

        public SearchButton(Context context) {
            super(context);
        }

        @Override
        public float getTranslationX() {
            return this.additionanTranslationY;
        }

        @Override
        public void setTranslationX(float f) {
            this.additionanTranslationY = f;
            updateTranslationY();
        }

        public void setTranslation(float f) {
            this.currentTranslationY = f;
            updateTranslationY();
        }

        private void updateTranslationY() {
            setTranslationY(this.currentTranslationY + this.additionanTranslationY);
        }
    }

    public class MapOverlayView extends FrameLayout {
        private HashMap<Marker, View> views = new HashMap<>();

        public MapOverlayView(Context context) {
            super(context);
        }

        public void addInfoView(Marker marker) {
            final VenueLocation venueLocation = (VenueLocation) marker.getTag();
            if (venueLocation != null && LocationActivity.this.lastPressedVenue != venueLocation) {
                LocationActivity.this.showSearchPlacesButton(false);
                if (LocationActivity.this.lastPressedMarker != null) {
                    removeInfoView(LocationActivity.this.lastPressedMarker);
                    LocationActivity.this.lastPressedMarker = null;
                }
                LocationActivity.this.lastPressedVenue = venueLocation;
                LocationActivity.this.lastPressedMarker = marker;
                Context context = getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                addView(frameLayout, LayoutHelper.createFrame(-2, 114.0f));
                LocationActivity.this.lastPressedMarkerView = new FrameLayout(context);
                LocationActivity.this.lastPressedMarkerView.setBackgroundResource(C0952R.C0953drawable.venue_tooltip);
                LocationActivity.this.lastPressedMarkerView.getBackground().setColorFilter(new PorterDuffColorFilter(Theme.getColor("dialogBackground"), PorterDuff.Mode.MULTIPLY));
                frameLayout.addView(LocationActivity.this.lastPressedMarkerView, LayoutHelper.createFrame(-2, 71.0f));
                LocationActivity.this.lastPressedMarkerView.setAlpha(0.0f);
                LocationActivity.this.lastPressedMarkerView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        LocationActivity.MapOverlayView.this.lambda$addInfoView$1(venueLocation, view);
                    }
                });
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                textView.setEllipsize(TextUtils.TruncateAt.END);
                textView.setSingleLine(true);
                textView.setTextColor(Theme.getColor("windowBackgroundWhiteBlackText"));
                textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
                int i = 5;
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                LocationActivity.this.lastPressedMarkerView.addView(textView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f));
                TextView textView2 = new TextView(context);
                textView2.setTextSize(1, 14.0f);
                textView2.setMaxLines(1);
                textView2.setEllipsize(TextUtils.TruncateAt.END);
                textView2.setSingleLine(true);
                textView2.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText3"));
                textView2.setGravity(LocaleController.isRTL ? 5 : 3);
                FrameLayout frameLayout2 = LocationActivity.this.lastPressedMarkerView;
                if (!LocaleController.isRTL) {
                    i = 3;
                }
                frameLayout2.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, i | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(venueLocation.venue.title);
                textView2.setText(LocaleController.getString("TapToSendLocation", C0952R.string.TapToSendLocation));
                final FrameLayout frameLayout3 = new FrameLayout(context);
                frameLayout3.setBackground(Theme.createCircleDrawable(AndroidUtilities.m34dp(36.0f), LocationCell.getColorForIndex(venueLocation.num)));
                frameLayout.addView(frameLayout3, LayoutHelper.createFrame(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                BackupImageView backupImageView = new BackupImageView(context);
                backupImageView.setImage("https://ss3.4sqi.net/img/categories_v2/" + venueLocation.venue.venue_type + "_64.png", null, null);
                frameLayout3.addView(backupImageView, LayoutHelper.createFrame(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    private final float[] animatorValues = {0.0f, 1.0f};
                    private boolean startedInner;

                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float f;
                        float lerp = AndroidUtilities.lerp(this.animatorValues, valueAnimator.getAnimatedFraction());
                        if (lerp >= 0.7f && !this.startedInner && LocationActivity.this.lastPressedMarkerView != null) {
                            AnimatorSet animatorSet = new AnimatorSet();
                            animatorSet.playTogether(ObjectAnimator.ofFloat(LocationActivity.this.lastPressedMarkerView, View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(LocationActivity.this.lastPressedMarkerView, View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(LocationActivity.this.lastPressedMarkerView, View.ALPHA, 0.0f, 1.0f));
                            animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                            animatorSet.setDuration(250L);
                            animatorSet.start();
                            this.startedInner = true;
                        }
                        if (lerp <= 0.5f) {
                            f = CubicBezierInterpolator.EASE_OUT.getInterpolation(lerp / 0.5f) * 1.1f;
                        } else if (lerp <= 0.75f) {
                            f = 1.1f - (CubicBezierInterpolator.EASE_OUT.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
                        } else {
                            f = (CubicBezierInterpolator.EASE_OUT.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
                        }
                        frameLayout3.setScaleX(f);
                        frameLayout3.setScaleY(f);
                    }
                });
                ofFloat.setDuration(360L);
                ofFloat.start();
                this.views.put(marker, frameLayout);
                LocationActivity.this.googleMap.animateCamera(CameraUpdateFactory.newLatLng(marker.getPosition()), 300, null);
            }
        }

        public void lambda$addInfoView$1(final VenueLocation venueLocation, View view) {
            if (LocationActivity.this.parentFragment == null || !LocationActivity.this.parentFragment.isInScheduleMode()) {
                LocationActivity.this.delegate.didSelectLocation(venueLocation.venue, LocationActivity.this.locationType, true, 0);
                LocationActivity.this.finishFragment();
                return;
            }
            AlertsCreator.createScheduleDatePickerDialog(LocationActivity.this.getParentActivity(), LocationActivity.this.parentFragment.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                @Override
                public final void didSelectDate(boolean z, int i) {
                    LocationActivity.MapOverlayView.this.lambda$addInfoView$0(venueLocation, z, i);
                }
            });
        }

        public void lambda$addInfoView$0(VenueLocation venueLocation, boolean z, int i) {
            LocationActivity.this.delegate.didSelectLocation(venueLocation.venue, LocationActivity.this.locationType, z, i);
            LocationActivity.this.finishFragment();
        }

        public void removeInfoView(Marker marker) {
            View view = this.views.get(marker);
            if (view != null) {
                removeView(view);
                this.views.remove(marker);
            }
        }

        public void updatePositions() {
            if (LocationActivity.this.googleMap != null) {
                Projection projection = LocationActivity.this.googleMap.getProjection();
                for (Map.Entry<Marker, View> entry : this.views.entrySet()) {
                    View value = entry.getValue();
                    Point screenLocation = projection.toScreenLocation(entry.getKey().getPosition());
                    value.setTranslationX(screenLocation.x - (value.getMeasuredWidth() / 2));
                    value.setTranslationY((screenLocation.y - value.getMeasuredHeight()) + AndroidUtilities.m34dp(22.0f));
                }
            }
        }
    }

    public LocationActivity(int i) {
        this.locationType = i;
        AndroidUtilities.fixGoogleMapsBug();
    }

    @Override
    public boolean onFragmentCreate() {
        super.onFragmentCreate();
        getNotificationCenter().addObserver(this, NotificationCenter.closeChats);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.liveLocationsChanged);
        MessageObject messageObject = this.messageObject;
        if (messageObject == null || !messageObject.isLiveLocation()) {
            return true;
        }
        getNotificationCenter().addObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().addObserver(this, NotificationCenter.replaceMessagesObjects);
        return true;
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionDenied);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.liveLocationsChanged);
        getNotificationCenter().removeObserver(this, NotificationCenter.closeChats);
        getNotificationCenter().removeObserver(this, NotificationCenter.didReceiveNewMessages);
        getNotificationCenter().removeObserver(this, NotificationCenter.replaceMessagesObjects);
        try {
            GoogleMap googleMap = this.googleMap;
            if (googleMap != null) {
                googleMap.setMyLocationEnabled(false);
            }
        } catch (Exception e) {
            FileLog.m30e(e);
        }
        try {
            MapView mapView = this.mapView;
            if (mapView != null) {
                mapView.onDestroy();
            }
        } catch (Exception e2) {
            FileLog.m30e(e2);
        }
        UndoView[] undoViewArr = this.undoView;
        if (undoViewArr[0] != null) {
            undoViewArr[0].hide(true, 0);
        }
        LocationActivityAdapter locationActivityAdapter = this.adapter;
        if (locationActivityAdapter != null) {
            locationActivityAdapter.destroy();
        }
        LocationActivitySearchAdapter locationActivitySearchAdapter = this.searchAdapter;
        if (locationActivitySearchAdapter != null) {
            locationActivitySearchAdapter.destroy();
        }
        Runnable runnable = this.updateRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            this.updateRunnable = null;
        }
        Runnable runnable2 = this.markAsReadRunnable;
        if (runnable2 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable2);
            this.markAsReadRunnable = null;
        }
    }

    private UndoView getUndoView() {
        if (this.undoView[0].getVisibility() == 0) {
            UndoView[] undoViewArr = this.undoView;
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.hide(true, 2);
            this.mapViewClip.removeView(this.undoView[0]);
            this.mapViewClip.addView(this.undoView[0]);
        }
        return this.undoView[0];
    }

    @Override
    public View createView(Context context) {
        FrameLayout.LayoutParams layoutParams;
        String str;
        String str2;
        String str3;
        int i;
        this.searchWas = false;
        this.searching = false;
        this.searchInProgress = false;
        LocationActivityAdapter locationActivityAdapter = this.adapter;
        if (locationActivityAdapter != null) {
            locationActivityAdapter.destroy();
        }
        LocationActivitySearchAdapter locationActivitySearchAdapter = this.searchAdapter;
        if (locationActivitySearchAdapter != null) {
            locationActivitySearchAdapter.destroy();
        }
        if (this.chatLocation != null) {
            Location location = new Location("network");
            this.userLocation = location;
            location.setLatitude(this.chatLocation.geo_point.lat);
            this.userLocation.setLongitude(this.chatLocation.geo_point._long);
        } else if (this.messageObject != null) {
            Location location2 = new Location("network");
            this.userLocation = location2;
            location2.setLatitude(this.messageObject.messageOwner.media.geo.lat);
            this.userLocation.setLongitude(this.messageObject.messageOwner.media.geo._long);
        }
        int i2 = Build.VERSION.SDK_INT;
        this.locationDenied = (i2 < 23 || getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        this.actionBar.setBackgroundColor(Theme.getColor("dialogBackground"));
        this.actionBar.setTitleColor(Theme.getColor("dialogTextBlack"));
        this.actionBar.setItemsColor(Theme.getColor("dialogTextBlack"), false);
        this.actionBar.setItemsBackgroundColor(Theme.getColor("dialogButtonSelector"), false);
        this.actionBar.setBackButtonImage(C0952R.C0953drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (AndroidUtilities.isTablet()) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new C1006ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i3) {
                if (i3 == -1) {
                    LocationActivity.this.finishFragment();
                } else if (i3 == 1) {
                    try {
                        double d = LocationActivity.this.messageObject.messageOwner.media.geo.lat;
                        double d2 = LocationActivity.this.messageObject.messageOwner.media.geo._long;
                        Activity parentActivity = LocationActivity.this.getParentActivity();
                        parentActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                    } catch (Exception e) {
                        FileLog.m30e(e);
                    }
                } else if (i3 == 5) {
                    LocationActivity.this.openShareLiveLocation(0);
                }
            }
        });
        ActionBarMenu createMenu = this.actionBar.createMenu();
        if (this.chatLocation != null) {
            this.actionBar.setTitle(LocaleController.getString("ChatLocation", C0952R.string.ChatLocation));
        } else {
            MessageObject messageObject = this.messageObject;
            if (messageObject == null) {
                this.actionBar.setTitle(LocaleController.getString("ShareLocation", C0952R.string.ShareLocation));
                if (this.locationType != 4) {
                    this.overlayView = new MapOverlayView(context);
                    ActionBarMenuItem actionBarMenuItemSearchListener = createMenu.addItem(0, C0952R.C0953drawable.ic_ab_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
                        @Override
                        public void onSearchExpand() {
                            LocationActivity.this.searching = true;
                        }

                        @Override
                        public void onSearchCollapse() {
                            LocationActivity.this.searching = false;
                            LocationActivity.this.searchWas = false;
                            LocationActivity.this.searchAdapter.searchDelayed(null, null);
                            LocationActivity.this.updateEmptyView();
                        }

                        @Override
                        public void onTextChanged(EditText editText) {
                            if (LocationActivity.this.searchAdapter != null) {
                                String obj = editText.getText().toString();
                                boolean z = false;
                                if (obj.length() != 0) {
                                    LocationActivity.this.searchWas = true;
                                    LocationActivity.this.searchItem.setShowSearchProgress(true);
                                    if (LocationActivity.this.otherItem != null) {
                                        LocationActivity.this.otherItem.setVisibility(8);
                                    }
                                    LocationActivity.this.listView.setVisibility(8);
                                    LocationActivity.this.mapViewClip.setVisibility(8);
                                    if (LocationActivity.this.searchListView.getAdapter() != LocationActivity.this.searchAdapter) {
                                        LocationActivity.this.searchListView.setAdapter(LocationActivity.this.searchAdapter);
                                    }
                                    LocationActivity.this.searchListView.setVisibility(0);
                                    LocationActivity locationActivity = LocationActivity.this;
                                    if (locationActivity.searchAdapter.getItemCount() == 0) {
                                        z = true;
                                    }
                                    locationActivity.searchInProgress = z;
                                } else {
                                    if (LocationActivity.this.otherItem != null) {
                                        LocationActivity.this.otherItem.setVisibility(0);
                                    }
                                    LocationActivity.this.listView.setVisibility(0);
                                    LocationActivity.this.mapViewClip.setVisibility(0);
                                    LocationActivity.this.searchListView.setAdapter(null);
                                    LocationActivity.this.searchListView.setVisibility(8);
                                }
                                LocationActivity.this.updateEmptyView();
                                LocationActivity.this.searchAdapter.searchDelayed(obj, LocationActivity.this.userLocation);
                            }
                        }
                    });
                    this.searchItem = actionBarMenuItemSearchListener;
                    actionBarMenuItemSearchListener.setSearchFieldHint(LocaleController.getString("Search", C0952R.string.Search));
                    this.searchItem.setContentDescription(LocaleController.getString("Search", C0952R.string.Search));
                    EditTextBoldCursor searchField = this.searchItem.getSearchField();
                    searchField.setTextColor(Theme.getColor("dialogTextBlack"));
                    searchField.setCursorColor(Theme.getColor("dialogTextBlack"));
                    searchField.setHintTextColor(Theme.getColor("chat_messagePanelHint"));
                }
            } else if (messageObject.isLiveLocation()) {
                this.actionBar.setTitle(LocaleController.getString("AttachLiveLocation", C0952R.string.AttachLiveLocation));
            } else {
                String str4 = this.messageObject.messageOwner.media.title;
                if (str4 == null || str4.length() <= 0) {
                    this.actionBar.setTitle(LocaleController.getString("ChatLocation", C0952R.string.ChatLocation));
                } else {
                    this.actionBar.setTitle(LocaleController.getString("SharedPlace", C0952R.string.SharedPlace));
                }
                ActionBarMenuItem addItem = createMenu.addItem(0, C0952R.C0953drawable.ic_ab_other);
                this.otherItem = addItem;
                addItem.addSubItem(1, C0952R.C0953drawable.msg_openin, LocaleController.getString("OpenInExternalApp", C0952R.string.OpenInExternalApp));
                if (!getLocationController().isSharingLocation(this.dialogId)) {
                    this.otherItem.addSubItem(5, C0952R.C0953drawable.menu_location, LocaleController.getString("SendLiveLocationMenu", C0952R.string.SendLiveLocationMenu));
                }
                this.otherItem.setContentDescription(LocaleController.getString("AccDescrMoreOptions", C0952R.string.AccDescrMoreOptions));
            }
        }
        FrameLayout frameLayout = new FrameLayout(context) {
            private boolean first = true;

            @Override
            protected void onLayout(boolean z, int i3, int i4, int i5, int i6) {
                super.onLayout(z, i3, i4, i5, i6);
                if (z) {
                    LocationActivity.this.fixLayoutInternal(this.first);
                    this.first = false;
                    return;
                }
                LocationActivity.this.updateClipView(true);
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                boolean drawChild = super.drawChild(canvas, view, j);
                if (view == ((BaseFragment) LocationActivity.this).actionBar && ((BaseFragment) LocationActivity.this).parentLayout != null) {
                    ((BaseFragment) LocationActivity.this).parentLayout.drawHeaderShadow(canvas, ((BaseFragment) LocationActivity.this).actionBar.getMeasuredHeight());
                }
                return drawChild;
            }
        };
        this.fragmentView = frameLayout;
        FrameLayout frameLayout2 = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor("dialogBackground"));
        Drawable mutate = context.getResources().getDrawable(C0952R.C0953drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor("dialogBackground"), PorterDuff.Mode.MULTIPLY));
        final Rect rect = new Rect();
        this.shadowDrawable.getPadding(rect);
        int i3 = this.locationType;
        if (i3 == 0 || i3 == 1) {
            layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.m34dp(21.0f) + rect.top);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.m34dp(6.0f) + rect.top);
        }
        FrameLayout.LayoutParams layoutParams2 = layoutParams;
        layoutParams2.gravity = 83;
        FrameLayout frameLayout3 = new FrameLayout(context) {
            @Override
            protected void onMeasure(int i4, int i5) {
                super.onMeasure(i4, i5);
                if (LocationActivity.this.overlayView != null) {
                    LocationActivity.this.overlayView.updatePositions();
                }
            }
        };
        this.mapViewClip = frameLayout3;
        frameLayout3.setBackgroundDrawable(new MapPlaceholderDrawable());
        if (this.messageObject == null && ((i = this.locationType) == 0 || i == 1)) {
            SearchButton searchButton = new SearchButton(context);
            this.searchAreaButton = searchButton;
            searchButton.setTranslationX(-AndroidUtilities.m34dp(80.0f));
            Drawable createSimpleSelectorRoundRectDrawable = Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.m34dp(40.0f), Theme.getColor("location_actionBackground"), Theme.getColor("location_actionPressedBackground"));
            if (i2 < 21) {
                Drawable mutate2 = context.getResources().getDrawable(C0952R.C0953drawable.places_btn).mutate();
                mutate2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
                CombinedDrawable combinedDrawable = new CombinedDrawable(mutate2, createSimpleSelectorRoundRectDrawable, AndroidUtilities.m34dp(2.0f), AndroidUtilities.m34dp(2.0f));
                combinedDrawable.setFullsize(true);
                createSimpleSelectorRoundRectDrawable = combinedDrawable;
            } else {
                StateListAnimator stateListAnimator = new StateListAnimator();
                SearchButton searchButton2 = this.searchAreaButton;
                Property property = View.TRANSLATION_Z;
                stateListAnimator.addState(new int[]{16842919}, ObjectAnimator.ofFloat(searchButton2, property, AndroidUtilities.m34dp(2.0f), AndroidUtilities.m34dp(4.0f)).setDuration(200L));
                stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this.searchAreaButton, property, AndroidUtilities.m34dp(4.0f), AndroidUtilities.m34dp(2.0f)).setDuration(200L));
                this.searchAreaButton.setStateListAnimator(stateListAnimator);
                this.searchAreaButton.setOutlineProvider(new ViewOutlineProvider(this) {
                    @Override
                    @SuppressLint({"NewApi"})
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight(), view.getMeasuredHeight() / 2);
                    }
                });
            }
            this.searchAreaButton.setBackgroundDrawable(createSimpleSelectorRoundRectDrawable);
            this.searchAreaButton.setTextColor(Theme.getColor("location_actionActiveIcon"));
            this.searchAreaButton.setTextSize(1, 14.0f);
            this.searchAreaButton.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
            this.searchAreaButton.setText(LocaleController.getString("PlacesInThisArea", C0952R.string.PlacesInThisArea));
            this.searchAreaButton.setGravity(17);
            this.searchAreaButton.setPadding(AndroidUtilities.m34dp(20.0f), 0, AndroidUtilities.m34dp(20.0f), 0);
            this.mapViewClip.addView(this.searchAreaButton, LayoutHelper.createFrame(-2, i2 >= 21 ? 40.0f : 44.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
            this.searchAreaButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    LocationActivity.this.lambda$createView$0(view);
                }
            });
        }
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, null, 0, Theme.getColor("location_actionIcon"));
        this.mapTypeButton = actionBarMenuItem;
        actionBarMenuItem.setClickable(true);
        this.mapTypeButton.setSubMenuOpenSide(2);
        this.mapTypeButton.setAdditionalXOffset(AndroidUtilities.m34dp(10.0f));
        this.mapTypeButton.setAdditionalYOffset(-AndroidUtilities.m34dp(10.0f));
        this.mapTypeButton.addSubItem(2, C0952R.C0953drawable.msg_map, LocaleController.getString("Map", C0952R.string.Map));
        this.mapTypeButton.addSubItem(3, C0952R.C0953drawable.msg_satellite, LocaleController.getString("Satellite", C0952R.string.Satellite));
        this.mapTypeButton.addSubItem(4, C0952R.C0953drawable.msg_hybrid, LocaleController.getString("Hybrid", C0952R.string.Hybrid));
        this.mapTypeButton.setContentDescription(LocaleController.getString("AccDescrMoreOptions", C0952R.string.AccDescrMoreOptions));
        Drawable createSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.m34dp(40.0f), Theme.getColor("location_actionBackground"), Theme.getColor("location_actionPressedBackground"));
        if (i2 < 21) {
            Drawable mutate3 = context.getResources().getDrawable(C0952R.C0953drawable.floating_shadow_profile).mutate();
            mutate3.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            CombinedDrawable combinedDrawable2 = new CombinedDrawable(mutate3, createSimpleSelectorCircleDrawable, 0, 0);
            combinedDrawable2.setIconSize(AndroidUtilities.m34dp(40.0f), AndroidUtilities.m34dp(40.0f));
            createSimpleSelectorCircleDrawable = combinedDrawable2;
            str = "location_actionIcon";
        } else {
            StateListAnimator stateListAnimator2 = new StateListAnimator();
            ActionBarMenuItem actionBarMenuItem2 = this.mapTypeButton;
            Property property2 = View.TRANSLATION_Z;
            str = "location_actionIcon";
            stateListAnimator2.addState(new int[]{16842919}, ObjectAnimator.ofFloat(actionBarMenuItem2, property2, AndroidUtilities.m34dp(2.0f), AndroidUtilities.m34dp(4.0f)).setDuration(200L));
            stateListAnimator2.addState(new int[0], ObjectAnimator.ofFloat(this.mapTypeButton, property2, AndroidUtilities.m34dp(4.0f), AndroidUtilities.m34dp(2.0f)).setDuration(200L));
            this.mapTypeButton.setStateListAnimator(stateListAnimator2);
            this.mapTypeButton.setOutlineProvider(new ViewOutlineProvider(this) {
                @Override
                @SuppressLint({"NewApi"})
                public void getOutline(View view, Outline outline) {
                    outline.setOval(0, 0, AndroidUtilities.m34dp(40.0f), AndroidUtilities.m34dp(40.0f));
                }
            });
        }
        this.mapTypeButton.setBackgroundDrawable(createSimpleSelectorCircleDrawable);
        this.mapTypeButton.setIcon(C0952R.C0953drawable.location_type);
        this.mapViewClip.addView(this.mapTypeButton, LayoutHelper.createFrame(i2 >= 21 ? 40 : 44, i2 >= 21 ? 40.0f : 44.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        this.mapTypeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                LocationActivity.this.lambda$createView$1(view);
            }
        });
        this.mapTypeButton.setDelegate(new ActionBarMenuItem.ActionBarMenuItemDelegate() {
            @Override
            public final void onItemClick(int i4) {
                LocationActivity.this.lambda$createView$2(i4);
            }
        });
        this.locationButton = new ImageView(context);
        Drawable createSimpleSelectorCircleDrawable2 = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.m34dp(40.0f), Theme.getColor("location_actionBackground"), Theme.getColor("location_actionPressedBackground"));
        if (i2 < 21) {
            Drawable mutate4 = context.getResources().getDrawable(C0952R.C0953drawable.floating_shadow_profile).mutate();
            mutate4.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            CombinedDrawable combinedDrawable3 = new CombinedDrawable(mutate4, createSimpleSelectorCircleDrawable2, 0, 0);
            combinedDrawable3.setIconSize(AndroidUtilities.m34dp(40.0f), AndroidUtilities.m34dp(40.0f));
            str2 = "location_actionBackground";
            createSimpleSelectorCircleDrawable2 = combinedDrawable3;
            str3 = "location_actionPressedBackground";
        } else {
            StateListAnimator stateListAnimator3 = new StateListAnimator();
            ImageView imageView = this.locationButton;
            Property property3 = View.TRANSLATION_Z;
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, property3, AndroidUtilities.m34dp(2.0f), AndroidUtilities.m34dp(4.0f));
            str3 = "location_actionPressedBackground";
            str2 = "location_actionBackground";
            stateListAnimator3.addState(new int[]{16842919}, ofFloat.setDuration(200L));
            stateListAnimator3.addState(new int[0], ObjectAnimator.ofFloat(this.locationButton, property3, AndroidUtilities.m34dp(4.0f), AndroidUtilities.m34dp(2.0f)).setDuration(200L));
            this.locationButton.setStateListAnimator(stateListAnimator3);
            this.locationButton.setOutlineProvider(new ViewOutlineProvider(this) {
                @Override
                @SuppressLint({"NewApi"})
                public void getOutline(View view, Outline outline) {
                    outline.setOval(0, 0, AndroidUtilities.m34dp(40.0f), AndroidUtilities.m34dp(40.0f));
                }
            });
        }
        this.locationButton.setBackgroundDrawable(createSimpleSelectorCircleDrawable2);
        this.locationButton.setImageResource(C0952R.C0953drawable.location_current);
        this.locationButton.setScaleType(ImageView.ScaleType.CENTER);
        this.locationButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor("location_actionActiveIcon"), PorterDuff.Mode.MULTIPLY));
        this.locationButton.setTag("location_actionActiveIcon");
        this.locationButton.setContentDescription(LocaleController.getString("AccDescrMyLocation", C0952R.string.AccDescrMyLocation));
        FrameLayout.LayoutParams createFrame = LayoutHelper.createFrame(i2 >= 21 ? 40 : 44, i2 >= 21 ? 40.0f : 44.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f);
        createFrame.bottomMargin += layoutParams2.height - rect.top;
        this.mapViewClip.addView(this.locationButton, createFrame);
        this.locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                LocationActivity.this.lambda$createView$3(view);
            }
        });
        this.proximityButton = new ImageView(context);
        Drawable createSimpleSelectorCircleDrawable3 = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.m34dp(40.0f), Theme.getColor(str2), Theme.getColor(str3));
        if (i2 < 21) {
            Drawable mutate5 = context.getResources().getDrawable(C0952R.C0953drawable.floating_shadow_profile).mutate();
            mutate5.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            CombinedDrawable combinedDrawable4 = new CombinedDrawable(mutate5, createSimpleSelectorCircleDrawable3, 0, 0);
            combinedDrawable4.setIconSize(AndroidUtilities.m34dp(40.0f), AndroidUtilities.m34dp(40.0f));
            createSimpleSelectorCircleDrawable3 = combinedDrawable4;
        } else {
            StateListAnimator stateListAnimator4 = new StateListAnimator();
            ImageView imageView2 = this.proximityButton;
            Property property4 = View.TRANSLATION_Z;
            stateListAnimator4.addState(new int[]{16842919}, ObjectAnimator.ofFloat(imageView2, property4, AndroidUtilities.m34dp(2.0f), AndroidUtilities.m34dp(4.0f)).setDuration(200L));
            stateListAnimator4.addState(new int[0], ObjectAnimator.ofFloat(this.proximityButton, property4, AndroidUtilities.m34dp(4.0f), AndroidUtilities.m34dp(2.0f)).setDuration(200L));
            this.proximityButton.setStateListAnimator(stateListAnimator4);
            this.proximityButton.setOutlineProvider(new ViewOutlineProvider(this) {
                @Override
                @SuppressLint({"NewApi"})
                public void getOutline(View view, Outline outline) {
                    outline.setOval(0, 0, AndroidUtilities.m34dp(40.0f), AndroidUtilities.m34dp(40.0f));
                }
            });
        }
        this.proximityButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(str), PorterDuff.Mode.MULTIPLY));
        this.proximityButton.setBackgroundDrawable(createSimpleSelectorCircleDrawable3);
        this.proximityButton.setScaleType(ImageView.ScaleType.CENTER);
        this.proximityButton.setContentDescription(LocaleController.getString("AccDescrLocationNotify", C0952R.string.AccDescrLocationNotify));
        this.mapViewClip.addView(this.proximityButton, LayoutHelper.createFrame(i2 >= 21 ? 40 : 44, i2 >= 21 ? 40.0f : 44.0f, 53, 0.0f, 62.0f, 12.0f, 0.0f));
        this.proximityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                LocationActivity.this.lambda$createView$6(view);
            }
        });
        TLRPC$Chat tLRPC$Chat = null;
        if (DialogObject.isChatDialog(this.dialogId)) {
            tLRPC$Chat = getMessagesController().getChat(Long.valueOf(-this.dialogId));
        }
        TLRPC$Chat tLRPC$Chat2 = tLRPC$Chat;
        MessageObject messageObject2 = this.messageObject;
        if (messageObject2 == null || !messageObject2.isLiveLocation() || this.messageObject.isExpiredLiveLocation(getConnectionsManager().getCurrentTime()) || (ChatObject.isChannel(tLRPC$Chat2) && !tLRPC$Chat2.megagroup)) {
            this.proximityButton.setVisibility(8);
            this.proximityButton.setImageResource(C0952R.C0953drawable.msg_location_alert);
        } else {
            LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.dialogId);
            if (sharingLocationInfo == null || sharingLocationInfo.proximityMeters <= 0) {
                if (DialogObject.isUserDialog(this.dialogId) && this.messageObject.getFromChatId() == getUserConfig().getClientUserId()) {
                    this.proximityButton.setVisibility(4);
                    this.proximityButton.setAlpha(0.0f);
                    this.proximityButton.setScaleX(0.4f);
                    this.proximityButton.setScaleY(0.4f);
                }
                this.proximityButton.setImageResource(C0952R.C0953drawable.msg_location_alert);
            } else {
                this.proximityButton.setImageResource(C0952R.C0953drawable.msg_location_alert2);
            }
        }
        HintView hintView = new HintView(context, 6, true);
        this.hintView = hintView;
        hintView.setVisibility(4);
        this.hintView.setShowingDuration(4000L);
        this.mapViewClip.addView(this.hintView, LayoutHelper.createFrame(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.emptyView = linearLayout;
        linearLayout.setOrientation(1);
        this.emptyView.setGravity(1);
        this.emptyView.setPadding(0, AndroidUtilities.m34dp(160.0f), 0, 0);
        this.emptyView.setVisibility(8);
        frameLayout2.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f));
        this.emptyView.setOnTouchListener(LocationActivity$$ExternalSyntheticLambda8.INSTANCE);
        ImageView imageView3 = new ImageView(context);
        this.emptyImageView = imageView3;
        imageView3.setImageResource(C0952R.C0953drawable.location_empty);
        this.emptyImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor("dialogEmptyImage"), PorterDuff.Mode.MULTIPLY));
        this.emptyView.addView(this.emptyImageView, LayoutHelper.createLinear(-2, -2));
        TextView textView = new TextView(context);
        this.emptyTitleTextView = textView;
        textView.setTextColor(Theme.getColor("dialogEmptyText"));
        this.emptyTitleTextView.setGravity(17);
        this.emptyTitleTextView.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
        this.emptyTitleTextView.setTextSize(1, 17.0f);
        this.emptyTitleTextView.setText(LocaleController.getString("NoPlacesFound", C0952R.string.NoPlacesFound));
        this.emptyView.addView(this.emptyTitleTextView, LayoutHelper.createLinear(-2, -2, 17, 0, 11, 0, 0));
        TextView textView2 = new TextView(context);
        this.emptySubtitleTextView = textView2;
        textView2.setTextColor(Theme.getColor("dialogEmptyText"));
        this.emptySubtitleTextView.setGravity(17);
        this.emptySubtitleTextView.setTextSize(1, 15.0f);
        this.emptySubtitleTextView.setPadding(AndroidUtilities.m34dp(40.0f), 0, AndroidUtilities.m34dp(40.0f), 0);
        this.emptyView.addView(this.emptySubtitleTextView, LayoutHelper.createLinear(-2, -2, 17, 0, 6, 0, 0));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        LocationActivityAdapter locationActivityAdapter2 = new LocationActivityAdapter(context, this.locationType, this.dialogId, false, null) {
            @Override
            protected void onDirectionClick() {
                Intent intent;
                Activity parentActivity;
                if (Build.VERSION.SDK_INT >= 23 && (parentActivity = LocationActivity.this.getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    LocationActivity.this.showPermissionAlert(true);
                } else if (LocationActivity.this.myLocation != null) {
                    try {
                        if (LocationActivity.this.messageObject != null) {
                            intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps?saddr=%f,%f&daddr=%f,%f", Double.valueOf(LocationActivity.this.myLocation.getLatitude()), Double.valueOf(LocationActivity.this.myLocation.getLongitude()), Double.valueOf(LocationActivity.this.messageObject.messageOwner.media.geo.lat), Double.valueOf(LocationActivity.this.messageObject.messageOwner.media.geo._long))));
                        } else {
                            intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, "http://maps.google.com/maps?saddr=%f,%f&daddr=%f,%f", Double.valueOf(LocationActivity.this.myLocation.getLatitude()), Double.valueOf(LocationActivity.this.myLocation.getLongitude()), Double.valueOf(LocationActivity.this.chatLocation.geo_point.lat), Double.valueOf(LocationActivity.this.chatLocation.geo_point._long))));
                        }
                        LocationActivity.this.getParentActivity().startActivity(intent);
                    } catch (Exception e) {
                        FileLog.m30e(e);
                    }
                }
            }
        };
        this.adapter = locationActivityAdapter2;
        recyclerListView.setAdapter(locationActivityAdapter2);
        this.adapter.setMyLocationDenied(this.locationDenied);
        this.adapter.setUpdateRunnable(new Runnable() {
            @Override
            public final void run() {
                LocationActivity.this.lambda$createView$8();
            }
        });
        this.listView.setVerticalScrollBarEnabled(false);
        RecyclerListView recyclerListView2 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i4) {
                LocationActivity.this.scrolling = i4 != 0;
                if (!LocationActivity.this.scrolling && LocationActivity.this.forceUpdate != null) {
                    LocationActivity.this.forceUpdate = null;
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
                LocationActivity.this.updateClipView(false);
                if (LocationActivity.this.forceUpdate != null) {
                    LocationActivity.access$3316(LocationActivity.this, i5);
                }
            }
        });
        ((DefaultItemAnimator) this.listView.getItemAnimator()).setDelayAnimations(false);
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i4) {
                LocationActivity.this.lambda$createView$14(view, i4);
            }
        });
        this.adapter.setDelegate(this.dialogId, new BaseLocationAdapter.BaseLocationAdapterDelegate() {
            @Override
            public final void didLoadSearchResult(ArrayList arrayList) {
                LocationActivity.this.updatePlacesMarkers(arrayList);
            }
        });
        this.adapter.setOverScrollHeight(this.overScrollHeight);
        frameLayout2.addView(this.mapViewClip, LayoutHelper.createFrame(-1, -1, 51));
        final C301711 r0 = new C301711(context);
        this.mapView = r0;
        new Thread(new Runnable() {
            @Override
            public final void run() {
                LocationActivity.this.lambda$createView$17(r0);
            }
        }).start();
        MessageObject messageObject3 = this.messageObject;
        if (messageObject3 == null && this.chatLocation == null) {
            if (!(tLRPC$Chat2 == null || this.locationType != 4 || this.dialogId == 0)) {
                FrameLayout frameLayout4 = new FrameLayout(context);
                frameLayout4.setBackgroundResource(C0952R.C0953drawable.livepin);
                this.mapViewClip.addView(frameLayout4, LayoutHelper.createFrame(62, 76, 49));
                BackupImageView backupImageView = new BackupImageView(context);
                backupImageView.setRoundRadius(AndroidUtilities.m34dp(26.0f));
                backupImageView.setForUserOrChat(tLRPC$Chat2, new AvatarDrawable(tLRPC$Chat2));
                frameLayout4.addView(backupImageView, LayoutHelper.createFrame(52, 52.0f, 51, 5.0f, 5.0f, 0.0f, 0.0f));
                this.markerImageView = frameLayout4;
                frameLayout4.setTag(1);
            }
            if (this.markerImageView == null) {
                ImageView imageView4 = new ImageView(context);
                imageView4.setImageResource(C0952R.C0953drawable.map_pin2);
                this.mapViewClip.addView(imageView4, LayoutHelper.createFrame(28, 48, 49));
                this.markerImageView = imageView4;
            }
            RecyclerListView recyclerListView3 = new RecyclerListView(context);
            this.searchListView = recyclerListView3;
            recyclerListView3.setVisibility(8);
            this.searchListView.setLayoutManager(new LinearLayoutManager(context, 1, false));
            LocationActivitySearchAdapter locationActivitySearchAdapter2 = new LocationActivitySearchAdapter(context) {
                @Override
                public void notifyDataSetChanged() {
                    if (LocationActivity.this.searchItem != null) {
                        LocationActivity.this.searchItem.setShowSearchProgress(LocationActivity.this.searchAdapter.isSearching());
                    }
                    if (LocationActivity.this.emptySubtitleTextView != null) {
                        LocationActivity.this.emptySubtitleTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", C0952R.string.NoPlacesFoundInfo, LocationActivity.this.searchAdapter.getLastSearchString())));
                    }
                    super.notifyDataSetChanged();
                }
            };
            this.searchAdapter = locationActivitySearchAdapter2;
            locationActivitySearchAdapter2.setDelegate(0L, new BaseLocationAdapter.BaseLocationAdapterDelegate() {
                @Override
                public final void didLoadSearchResult(ArrayList arrayList) {
                    LocationActivity.this.lambda$createView$18(arrayList);
                }
            });
            frameLayout2.addView(this.searchListView, LayoutHelper.createFrame(-1, -1, 51));
            this.searchListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrollStateChanged(RecyclerView recyclerView, int i4) {
                    if (i4 == 1 && LocationActivity.this.searching && LocationActivity.this.searchWas) {
                        AndroidUtilities.hideKeyboard(LocationActivity.this.getParentActivity().getCurrentFocus());
                    }
                }
            });
            this.searchListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(View view, int i4) {
                    LocationActivity.this.lambda$createView$20(view, i4);
                }
            });
        } else if ((messageObject3 != null && !messageObject3.isLiveLocation()) || this.chatLocation != null) {
            TLRPC$TL_channelLocation tLRPC$TL_channelLocation = this.chatLocation;
            if (tLRPC$TL_channelLocation != null) {
                this.adapter.setChatLocation(tLRPC$TL_channelLocation);
            } else {
                MessageObject messageObject4 = this.messageObject;
                if (messageObject4 != null) {
                    this.adapter.setMessageObject(messageObject4);
                }
            }
        }
        MessageObject messageObject5 = this.messageObject;
        if (messageObject5 != null && this.locationType == 6) {
            this.adapter.setMessageObject(messageObject5);
        }
        for (int i4 = 0; i4 < 2; i4++) {
            this.undoView[i4] = new UndoView(context);
            this.undoView[i4].setAdditionalTranslationY(AndroidUtilities.m34dp(10.0f));
            if (Build.VERSION.SDK_INT >= 21) {
                this.undoView[i4].setTranslationZ(AndroidUtilities.m34dp(5.0f));
            }
            this.mapViewClip.addView(this.undoView[i4], LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        View view = new View(context) {
            private RectF rect = new RectF();

            @Override
            protected void onDraw(Canvas canvas) {
                LocationActivity.this.shadowDrawable.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                LocationActivity.this.shadowDrawable.draw(canvas);
                if (LocationActivity.this.locationType == 0 || LocationActivity.this.locationType == 1) {
                    int dp = AndroidUtilities.m34dp(36.0f);
                    int dp2 = rect.top + AndroidUtilities.m34dp(10.0f);
                    this.rect.set((getMeasuredWidth() - dp) / 2, dp2, (getMeasuredWidth() + dp) / 2, dp2 + AndroidUtilities.m34dp(4.0f));
                    int color = Theme.getColor("key_sheet_scrollUp");
                    Color.alpha(color);
                    Theme.dialogs_onlineCirclePaint.setColor(color);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.m34dp(2.0f), AndroidUtilities.m34dp(2.0f), Theme.dialogs_onlineCirclePaint);
                }
            }
        };
        this.shadow = view;
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTranslationZ(AndroidUtilities.m34dp(6.0f));
        }
        this.mapViewClip.addView(this.shadow, layoutParams2);
        if (this.messageObject == null && this.chatLocation == null && this.initialLocation != null) {
            this.userLocationMoved = true;
            this.locationButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(str), PorterDuff.Mode.MULTIPLY));
            this.locationButton.setTag(str);
        }
        frameLayout2.addView(this.actionBar);
        updateEmptyView();
        return this.fragmentView;
    }

    public void lambda$createView$0(View view) {
        showSearchPlacesButton(false);
        this.adapter.searchPlacesWithQuery(null, this.userLocation, true, true);
        this.searchedForCustomLocations = true;
        showResults();
    }

    public void lambda$createView$1(View view) {
        this.mapTypeButton.toggleSubMenu();
    }

    public void lambda$createView$2(int i) {
        GoogleMap googleMap = this.googleMap;
        if (googleMap != null) {
            if (i == 2) {
                googleMap.setMapType(1);
            } else if (i == 3) {
                googleMap.setMapType(2);
            } else if (i == 4) {
                googleMap.setMapType(4);
            }
        }
    }

    public void lambda$createView$3(View view) {
        GoogleMap googleMap;
        Activity parentActivity;
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            showPermissionAlert(false);
        } else if (checkGpsEnabled()) {
            if (this.messageObject == null && this.chatLocation == null) {
                if (!(this.myLocation == null || this.googleMap == null)) {
                    this.locationButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor("location_actionActiveIcon"), PorterDuff.Mode.MULTIPLY));
                    this.locationButton.setTag("location_actionActiveIcon");
                    this.adapter.setCustomLocation(null);
                    this.userLocationMoved = false;
                    showSearchPlacesButton(false);
                    this.googleMap.animateCamera(CameraUpdateFactory.newLatLng(new LatLng(this.myLocation.getLatitude(), this.myLocation.getLongitude())));
                    if (this.searchedForCustomLocations) {
                        Location location = this.myLocation;
                        if (location != null) {
                            this.adapter.searchPlacesWithQuery(null, location, true, true);
                        }
                        this.searchedForCustomLocations = false;
                        showResults();
                    }
                }
            } else if (!(this.myLocation == null || (googleMap = this.googleMap) == null)) {
                googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(this.myLocation.getLatitude(), this.myLocation.getLongitude()), this.googleMap.getMaxZoomLevel() - 4.0f));
            }
            removeInfoView();
        }
    }

    public void lambda$createView$6(View view) {
        if (getParentActivity() != null && this.myLocation != null && checkGpsEnabled() && this.googleMap != null) {
            HintView hintView = this.hintView;
            if (hintView != null) {
                hintView.hide();
            }
            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
            final LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.dialogId);
            if (this.canUndo) {
                this.undoView[0].hide(true, 1);
            }
            if (sharingLocationInfo == null || sharingLocationInfo.proximityMeters <= 0) {
                openProximityAlert();
                return;
            }
            this.proximityButton.setImageResource(C0952R.C0953drawable.msg_location_alert);
            Circle circle = this.proximityCircle;
            if (circle != null) {
                circle.remove();
                this.proximityCircle = null;
            }
            this.canUndo = true;
            getUndoView().showWithAction(0L, 25, (Object) 0, (Object) null, new Runnable() {
                @Override
                public final void run() {
                    LocationActivity.this.lambda$createView$4();
                }
            }, new Runnable() {
                @Override
                public final void run() {
                    LocationActivity.this.lambda$createView$5(sharingLocationInfo);
                }
            });
        }
    }

    public void lambda$createView$4() {
        getLocationController().setProximityLocation(this.dialogId, 0, true);
        this.canUndo = false;
    }

    public void lambda$createView$5(LocationController.SharingLocationInfo sharingLocationInfo) {
        this.proximityButton.setImageResource(C0952R.C0953drawable.msg_location_alert2);
        createCircle(sharingLocationInfo.proximityMeters);
        this.canUndo = false;
    }

    public void lambda$createView$8() {
        updateClipView(false);
    }

    public void lambda$createView$14(View view, int i) {
        MessageObject messageObject;
        final TLRPC$TL_messageMediaVenue tLRPC$TL_messageMediaVenue;
        int i2 = this.locationType;
        if (i2 == 4) {
            if (i == 1 && (tLRPC$TL_messageMediaVenue = (TLRPC$TL_messageMediaVenue) this.adapter.getItem(i)) != null) {
                if (this.dialogId == 0) {
                    this.delegate.didSelectLocation(tLRPC$TL_messageMediaVenue, 4, true, 0);
                    finishFragment();
                    return;
                }
                final AlertDialog[] alertDialogArr = {new AlertDialog(getParentActivity(), 3)};
                TLRPC$TL_channels_editLocation tLRPC$TL_channels_editLocation = new TLRPC$TL_channels_editLocation();
                tLRPC$TL_channels_editLocation.address = tLRPC$TL_messageMediaVenue.address;
                tLRPC$TL_channels_editLocation.channel = getMessagesController().getInputChannel(-this.dialogId);
                TLRPC$TL_inputGeoPoint tLRPC$TL_inputGeoPoint = new TLRPC$TL_inputGeoPoint();
                tLRPC$TL_channels_editLocation.geo_point = tLRPC$TL_inputGeoPoint;
                TLRPC$GeoPoint tLRPC$GeoPoint = tLRPC$TL_messageMediaVenue.geo;
                tLRPC$TL_inputGeoPoint.lat = tLRPC$GeoPoint.lat;
                tLRPC$TL_inputGeoPoint._long = tLRPC$GeoPoint._long;
                final int sendRequest = getConnectionsManager().sendRequest(tLRPC$TL_channels_editLocation, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        LocationActivity.this.lambda$createView$10(alertDialogArr, tLRPC$TL_messageMediaVenue, tLObject, tLRPC$TL_error);
                    }
                });
                alertDialogArr[0].setOnCancelListener(new DialogInterface.OnCancelListener() {
                    @Override
                    public final void onCancel(DialogInterface dialogInterface) {
                        LocationActivity.this.lambda$createView$11(sendRequest, dialogInterface);
                    }
                });
                showDialog(alertDialogArr[0]);
            }
        } else if (i2 == 5) {
            GoogleMap googleMap = this.googleMap;
            if (googleMap != null) {
                TLRPC$GeoPoint tLRPC$GeoPoint2 = this.chatLocation.geo_point;
                googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(tLRPC$GeoPoint2.lat, tLRPC$GeoPoint2._long), this.googleMap.getMaxZoomLevel() - 4.0f));
            }
        } else if (i == 1 && (messageObject = this.messageObject) != null && (!messageObject.isLiveLocation() || this.locationType == 6)) {
            GoogleMap googleMap2 = this.googleMap;
            if (googleMap2 != null) {
                TLRPC$GeoPoint tLRPC$GeoPoint3 = this.messageObject.messageOwner.media.geo;
                googleMap2.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(tLRPC$GeoPoint3.lat, tLRPC$GeoPoint3._long), this.googleMap.getMaxZoomLevel() - 4.0f));
            }
        } else if (i != 1 || this.locationType == 2) {
            if ((i != 2 || this.locationType != 1) && ((i != 1 || this.locationType != 2) && (i != 3 || this.locationType != 3))) {
                final Object item = this.adapter.getItem(i);
                if (item instanceof TLRPC$TL_messageMediaVenue) {
                    ChatActivity chatActivity = this.parentFragment;
                    if (chatActivity == null || !chatActivity.isInScheduleMode()) {
                        this.delegate.didSelectLocation((TLRPC$TL_messageMediaVenue) item, this.locationType, true, 0);
                        finishFragment();
                        return;
                    }
                    AlertsCreator.createScheduleDatePickerDialog(getParentActivity(), this.parentFragment.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                        @Override
                        public final void didSelectDate(boolean z, int i3) {
                            LocationActivity.this.lambda$createView$13(item, z, i3);
                        }
                    });
                } else if (item instanceof LiveLocation) {
                    this.googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(((LiveLocation) item).marker.getPosition(), this.googleMap.getMaxZoomLevel() - 4.0f));
                }
            } else if (getLocationController().isSharingLocation(this.dialogId)) {
                getLocationController().removeSharingLocation(this.dialogId);
                finishFragment();
            } else {
                openShareLiveLocation(0);
            }
        } else if (this.delegate != null && this.userLocation != null) {
            FrameLayout frameLayout = this.lastPressedMarkerView;
            if (frameLayout != null) {
                frameLayout.callOnClick();
                return;
            }
            final TLRPC$TL_messageMediaGeo tLRPC$TL_messageMediaGeo = new TLRPC$TL_messageMediaGeo();
            TLRPC$TL_geoPoint tLRPC$TL_geoPoint = new TLRPC$TL_geoPoint();
            tLRPC$TL_messageMediaGeo.geo = tLRPC$TL_geoPoint;
            tLRPC$TL_geoPoint.lat = AndroidUtilities.fixLocationCoord(this.userLocation.getLatitude());
            tLRPC$TL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(this.userLocation.getLongitude());
            ChatActivity chatActivity2 = this.parentFragment;
            if (chatActivity2 == null || !chatActivity2.isInScheduleMode()) {
                this.delegate.didSelectLocation(tLRPC$TL_messageMediaGeo, this.locationType, true, 0);
                finishFragment();
                return;
            }
            AlertsCreator.createScheduleDatePickerDialog(getParentActivity(), this.parentFragment.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                @Override
                public final void didSelectDate(boolean z, int i3) {
                    LocationActivity.this.lambda$createView$12(tLRPC$TL_messageMediaGeo, z, i3);
                }
            });
        }
    }

    public void lambda$createView$10(final AlertDialog[] alertDialogArr, final TLRPC$TL_messageMediaVenue tLRPC$TL_messageMediaVenue, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LocationActivity.this.lambda$createView$9(alertDialogArr, tLRPC$TL_messageMediaVenue);
            }
        });
    }

    public void lambda$createView$9(AlertDialog[] alertDialogArr, TLRPC$TL_messageMediaVenue tLRPC$TL_messageMediaVenue) {
        try {
            alertDialogArr[0].dismiss();
        } catch (Throwable unused) {
        }
        alertDialogArr[0] = null;
        this.delegate.didSelectLocation(tLRPC$TL_messageMediaVenue, 4, true, 0);
        finishFragment();
    }

    public void lambda$createView$11(int i, DialogInterface dialogInterface) {
        getConnectionsManager().cancelRequest(i, true);
    }

    public void lambda$createView$12(TLRPC$TL_messageMediaGeo tLRPC$TL_messageMediaGeo, boolean z, int i) {
        this.delegate.didSelectLocation(tLRPC$TL_messageMediaGeo, this.locationType, z, i);
        finishFragment();
    }

    public void lambda$createView$13(Object obj, boolean z, int i) {
        this.delegate.didSelectLocation((TLRPC$TL_messageMediaVenue) obj, this.locationType, z, i);
        finishFragment();
    }

    public class C301711 extends MapView {
        C301711(Context context) {
            super(context);
        }

        @Override
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        @Override
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            MotionEvent motionEvent2;
            if (LocationActivity.this.yOffset != 0.0f) {
                motionEvent = MotionEvent.obtain(motionEvent);
                motionEvent.offsetLocation(0.0f, (-LocationActivity.this.yOffset) / 2.0f);
                motionEvent2 = motionEvent;
            } else {
                motionEvent2 = null;
            }
            boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
            if (motionEvent2 != null) {
                motionEvent2.recycle();
            }
            return dispatchTouchEvent;
        }

        @Override
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (LocationActivity.this.messageObject == null && LocationActivity.this.chatLocation == null) {
                if (motionEvent.getAction() == 0) {
                    if (LocationActivity.this.animatorSet != null) {
                        LocationActivity.this.animatorSet.cancel();
                    }
                    LocationActivity.this.animatorSet = new AnimatorSet();
                    LocationActivity.this.animatorSet.setDuration(200L);
                    LocationActivity.this.animatorSet.playTogether(ObjectAnimator.ofFloat(LocationActivity.this.markerImageView, View.TRANSLATION_Y, LocationActivity.this.markerTop - AndroidUtilities.m34dp(10.0f)));
                    LocationActivity.this.animatorSet.start();
                } else if (motionEvent.getAction() == 1) {
                    if (LocationActivity.this.animatorSet != null) {
                        LocationActivity.this.animatorSet.cancel();
                    }
                    LocationActivity.this.yOffset = 0.0f;
                    LocationActivity.this.animatorSet = new AnimatorSet();
                    LocationActivity.this.animatorSet.setDuration(200L);
                    LocationActivity.this.animatorSet.playTogether(ObjectAnimator.ofFloat(LocationActivity.this.markerImageView, View.TRANSLATION_Y, LocationActivity.this.markerTop));
                    LocationActivity.this.animatorSet.start();
                    LocationActivity.this.adapter.fetchLocationAddress();
                }
                if (motionEvent.getAction() == 2) {
                    if (!LocationActivity.this.userLocationMoved) {
                        LocationActivity.this.locationButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor("location_actionIcon"), PorterDuff.Mode.MULTIPLY));
                        LocationActivity.this.locationButton.setTag("location_actionIcon");
                        LocationActivity.this.userLocationMoved = true;
                    }
                    if (!(LocationActivity.this.googleMap == null || LocationActivity.this.userLocation == null)) {
                        LocationActivity.this.userLocation.setLatitude(LocationActivity.this.googleMap.getCameraPosition().target.latitude);
                        LocationActivity.this.userLocation.setLongitude(LocationActivity.this.googleMap.getCameraPosition().target.longitude);
                    }
                    LocationActivity.this.adapter.setCustomLocation(LocationActivity.this.userLocation);
                }
            }
            return super.onInterceptTouchEvent(motionEvent);
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LocationActivity.C301711.this.lambda$onLayout$0();
                }
            });
        }

        public void lambda$onLayout$0() {
            if (LocationActivity.this.moveToBounds != null) {
                LocationActivity.this.googleMap.moveCamera(LocationActivity.this.moveToBounds);
                LocationActivity.this.moveToBounds = null;
            }
        }
    }

    public void lambda$createView$17(final MapView mapView) {
        try {
            mapView.onCreate(null);
        } catch (Exception unused) {
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LocationActivity.this.lambda$createView$16(mapView);
            }
        });
    }

    public void lambda$createView$16(MapView mapView) {
        if (this.mapView != null && getParentActivity() != null) {
            try {
                mapView.onCreate(null);
                MapsInitializer.initialize(ApplicationLoader.applicationContext);
                this.mapView.getMapAsync(new OnMapReadyCallback() {
                    @Override
                    public final void onMapReady(GoogleMap googleMap) {
                        LocationActivity.this.lambda$createView$15(googleMap);
                    }
                });
                this.mapsInitialized = true;
                if (this.onResumeCalled) {
                    this.mapView.onResume();
                }
            } catch (Exception e) {
                FileLog.m30e(e);
            }
        }
    }

    public void lambda$createView$15(GoogleMap googleMap) {
        this.googleMap = googleMap;
        if (isActiveThemeDark()) {
            this.currentMapStyleDark = true;
            this.googleMap.setMapStyle(MapStyleOptions.loadRawResourceStyle(ApplicationLoader.applicationContext, C0952R.raw.mapstyle_night));
        }
        this.googleMap.setPadding(AndroidUtilities.m34dp(70.0f), 0, AndroidUtilities.m34dp(70.0f), AndroidUtilities.m34dp(10.0f));
        onMapInit();
    }

    public void lambda$createView$18(ArrayList arrayList) {
        this.searchInProgress = false;
        updateEmptyView();
    }

    public void lambda$createView$20(View view, int i) {
        final TLRPC$TL_messageMediaVenue item = this.searchAdapter.getItem(i);
        if (item != null && this.delegate != null) {
            ChatActivity chatActivity = this.parentFragment;
            if (chatActivity == null || !chatActivity.isInScheduleMode()) {
                this.delegate.didSelectLocation(item, this.locationType, true, 0);
                finishFragment();
                return;
            }
            AlertsCreator.createScheduleDatePickerDialog(getParentActivity(), this.parentFragment.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                @Override
                public final void didSelectDate(boolean z, int i2) {
                    LocationActivity.this.lambda$createView$19(item, z, i2);
                }
            });
        }
    }

    public void lambda$createView$19(TLRPC$TL_messageMediaVenue tLRPC$TL_messageMediaVenue, boolean z, int i) {
        this.delegate.didSelectLocation(tLRPC$TL_messageMediaVenue, this.locationType, z, i);
        finishFragment();
    }

    private boolean isActiveThemeDark() {
        return Theme.getActiveTheme().isDark() || AndroidUtilities.computePerceivedBrightness(Theme.getColor("windowBackgroundWhite")) < 0.721f;
    }

    public void updateEmptyView() {
        if (!this.searching) {
            this.emptyView.setVisibility(8);
        } else if (this.searchInProgress) {
            this.searchListView.setEmptyView(null);
            this.emptyView.setVisibility(8);
            this.searchListView.setVisibility(8);
        } else {
            this.searchListView.setEmptyView(this.emptyView);
        }
    }

    public void showSearchPlacesButton(boolean z) {
        SearchButton searchButton;
        Location location;
        Location location2;
        if (z && (searchButton = this.searchAreaButton) != null && searchButton.getTag() == null && ((location = this.myLocation) == null || (location2 = this.userLocation) == null || location2.distanceTo(location) < 300.0f)) {
            z = false;
        }
        SearchButton searchButton2 = this.searchAreaButton;
        if (searchButton2 == null) {
            return;
        }
        if (z && searchButton2.getTag() != null) {
            return;
        }
        if (z || this.searchAreaButton.getTag() != null) {
            this.searchAreaButton.setTag(z ? 1 : null);
            AnimatorSet animatorSet = new AnimatorSet();
            Animator[] animatorArr = new Animator[1];
            SearchButton searchButton3 = this.searchAreaButton;
            Property property = View.TRANSLATION_X;
            float[] fArr = new float[1];
            fArr[0] = z ? 0.0f : -AndroidUtilities.m34dp(80.0f);
            animatorArr[0] = ObjectAnimator.ofFloat(searchButton3, property, fArr);
            animatorSet.playTogether(animatorArr);
            animatorSet.setDuration(180L);
            animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            animatorSet.start();
        }
    }

    private Bitmap createUserBitmap(LiveLocation liveLocation) {
        Throwable th;
        TLRPC$FileLocation tLRPC$FileLocation;
        TLRPC$ChatPhoto tLRPC$ChatPhoto;
        TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto;
        Bitmap bitmap = null;
        try {
            TLRPC$User tLRPC$User = liveLocation.user;
            if (tLRPC$User == null || (tLRPC$UserProfilePhoto = tLRPC$User.photo) == null) {
                TLRPC$Chat tLRPC$Chat = liveLocation.chat;
                if (tLRPC$Chat == null || (tLRPC$ChatPhoto = tLRPC$Chat.photo) == null) {
                    tLRPC$FileLocation = null;
                } else {
                    tLRPC$FileLocation = tLRPC$ChatPhoto.photo_small;
                }
            } else {
                tLRPC$FileLocation = tLRPC$UserProfilePhoto.photo_small;
            }
            Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.m34dp(62.0f), AndroidUtilities.m34dp(85.0f), Bitmap.Config.ARGB_8888);
            try {
                createBitmap.eraseColor(0);
                Canvas canvas = new Canvas(createBitmap);
                Drawable drawable = ApplicationLoader.applicationContext.getResources().getDrawable(C0952R.C0953drawable.map_pin_photo);
                drawable.setBounds(0, 0, AndroidUtilities.m34dp(62.0f), AndroidUtilities.m34dp(85.0f));
                drawable.draw(canvas);
                Paint paint = new Paint(1);
                RectF rectF = new RectF();
                canvas.save();
                if (tLRPC$FileLocation != null) {
                    Bitmap decodeFile = BitmapFactory.decodeFile(getFileLoader().getPathToAttach(tLRPC$FileLocation, true).toString());
                    if (decodeFile != null) {
                        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                        BitmapShader bitmapShader = new BitmapShader(decodeFile, tileMode, tileMode);
                        Matrix matrix = new Matrix();
                        float dp = AndroidUtilities.m34dp(50.0f) / decodeFile.getWidth();
                        matrix.postTranslate(AndroidUtilities.m34dp(6.0f), AndroidUtilities.m34dp(6.0f));
                        matrix.postScale(dp, dp);
                        paint.setShader(bitmapShader);
                        bitmapShader.setLocalMatrix(matrix);
                        rectF.set(AndroidUtilities.m34dp(6.0f), AndroidUtilities.m34dp(6.0f), AndroidUtilities.m34dp(56.0f), AndroidUtilities.m34dp(56.0f));
                        canvas.drawRoundRect(rectF, AndroidUtilities.m34dp(25.0f), AndroidUtilities.m34dp(25.0f), paint);
                    }
                } else {
                    AvatarDrawable avatarDrawable = new AvatarDrawable();
                    TLRPC$User tLRPC$User2 = liveLocation.user;
                    if (tLRPC$User2 != null) {
                        avatarDrawable.setInfo(tLRPC$User2);
                    } else {
                        TLRPC$Chat tLRPC$Chat2 = liveLocation.chat;
                        if (tLRPC$Chat2 != null) {
                            avatarDrawable.setInfo(tLRPC$Chat2);
                        }
                    }
                    canvas.translate(AndroidUtilities.m34dp(6.0f), AndroidUtilities.m34dp(6.0f));
                    avatarDrawable.setBounds(0, 0, AndroidUtilities.m34dp(50.0f), AndroidUtilities.m34dp(50.0f));
                    avatarDrawable.draw(canvas);
                }
                canvas.restore();
                try {
                    canvas.setBitmap(null);
                    return createBitmap;
                } catch (Exception unused) {
                    return createBitmap;
                }
            } catch (Throwable th2) {
                th = th2;
                bitmap = createBitmap;
                FileLog.m30e(th);
                return bitmap;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private long getMessageId(TLRPC$Message tLRPC$Message) {
        if (tLRPC$Message.from_id != null) {
            return MessageObject.getFromChatId(tLRPC$Message);
        }
        return MessageObject.getDialogId(tLRPC$Message);
    }

    private void openProximityAlert() {
        Circle circle = this.proximityCircle;
        if (circle == null) {
            createCircle(500);
        } else {
            this.previousRadius = circle.getRadius();
        }
        final TLRPC$User user = DialogObject.isUserDialog(this.dialogId) ? getMessagesController().getUser(Long.valueOf(this.dialogId)) : null;
        ProximitySheet proximitySheet = new ProximitySheet(getParentActivity(), user, new ProximitySheet.onRadiusPickerChange() {
            @Override
            public final boolean run(boolean z, int i) {
                boolean lambda$openProximityAlert$21;
                lambda$openProximityAlert$21 = LocationActivity.this.lambda$openProximityAlert$21(z, i);
                return lambda$openProximityAlert$21;
            }
        }, new ProximitySheet.onRadiusPickerChange() {
            @Override
            public final boolean run(boolean z, int i) {
                boolean lambda$openProximityAlert$23;
                lambda$openProximityAlert$23 = LocationActivity.this.lambda$openProximityAlert$23(user, z, i);
                return lambda$openProximityAlert$23;
            }
        }, new Runnable() {
            @Override
            public final void run() {
                LocationActivity.this.lambda$openProximityAlert$24();
            }
        });
        this.proximitySheet = proximitySheet;
        ((FrameLayout) this.fragmentView).addView(proximitySheet, LayoutHelper.createFrame(-1, -1.0f));
        this.proximitySheet.show();
    }

    public boolean lambda$openProximityAlert$21(boolean z, int i) {
        Circle circle = this.proximityCircle;
        if (circle != null) {
            circle.setRadius(i);
            if (z) {
                moveToBounds(i, true, true);
            }
        }
        if (DialogObject.isChatDialog(this.dialogId)) {
            return true;
        }
        int size = this.markers.size();
        for (int i2 = 0; i2 < size; i2++) {
            LiveLocation liveLocation = this.markers.get(i2);
            if (liveLocation.object != null && !UserObject.isUserSelf(liveLocation.user)) {
                TLRPC$GeoPoint tLRPC$GeoPoint = liveLocation.object.media.geo;
                Location location = new Location("network");
                location.setLatitude(tLRPC$GeoPoint.lat);
                location.setLongitude(tLRPC$GeoPoint._long);
                if (this.myLocation.distanceTo(location) > i) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean lambda$openProximityAlert$23(final TLRPC$User tLRPC$User, boolean z, final int i) {
        if (getLocationController().getSharingLocationInfo(this.dialogId) == null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setTitle(LocaleController.getString("ShareLocationAlertTitle", C0952R.string.ShareLocationAlertTitle));
            builder.setMessage(LocaleController.getString("ShareLocationAlertText", C0952R.string.ShareLocationAlertText));
            builder.setPositiveButton(LocaleController.getString("ShareLocationAlertButton", C0952R.string.ShareLocationAlertButton), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    LocationActivity.this.lambda$openProximityAlert$22(tLRPC$User, i, dialogInterface, i2);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
            showDialog(builder.create());
            return false;
        }
        this.proximitySheet.setRadiusSet();
        this.proximityButton.setImageResource(C0952R.C0953drawable.msg_location_alert2);
        getUndoView().showWithAction(0L, 24, Integer.valueOf(i), tLRPC$User, (Runnable) null, (Runnable) null);
        getLocationController().setProximityLocation(this.dialogId, i, true);
        return true;
    }

    public void lambda$openProximityAlert$22(TLRPC$User tLRPC$User, int i, DialogInterface dialogInterface, int i2) {
        lambda$openShareLiveLocation$26(tLRPC$User, 900, i);
    }

    public void lambda$openProximityAlert$24() {
        GoogleMap googleMap = this.googleMap;
        if (googleMap != null) {
            googleMap.setPadding(AndroidUtilities.m34dp(70.0f), 0, AndroidUtilities.m34dp(70.0f), AndroidUtilities.m34dp(10.0f));
        }
        if (!this.proximitySheet.getRadiusSet()) {
            double d = this.previousRadius;
            if (d > 0.0d) {
                this.proximityCircle.setRadius(d);
            } else {
                Circle circle = this.proximityCircle;
                if (circle != null) {
                    circle.remove();
                    this.proximityCircle = null;
                }
            }
        }
        this.proximitySheet = null;
    }

    public void openShareLiveLocation(final int i) {
        Activity parentActivity;
        if (this.delegate != null && getParentActivity() != null && this.myLocation != null && checkGpsEnabled()) {
            if (this.checkBackgroundPermission && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
                this.askWithRadius = i;
                this.checkBackgroundPermission = false;
                SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                    globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                    AlertsCreator.createBackgroundLocationPermissionDialog(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new Runnable() {
                        @Override
                        public final void run() {
                            LocationActivity.this.lambda$openShareLiveLocation$25();
                        }
                    }, null).show();
                    return;
                }
            }
            final TLRPC$User user = DialogObject.isUserDialog(this.dialogId) ? getMessagesController().getUser(Long.valueOf(this.dialogId)) : null;
            showDialog(AlertsCreator.createLocationUpdateDialog(getParentActivity(), user, new MessagesStorage.IntCallback() {
                @Override
                public final void run(int i2) {
                    LocationActivity.this.lambda$openShareLiveLocation$26(user, i, i2);
                }
            }, null));
        }
    }

    public void lambda$openShareLiveLocation$25() {
        openShareLiveLocation(this.askWithRadius);
    }

    public void lambda$openShareLiveLocation$26(TLRPC$User tLRPC$User, int i, int i2) {
        TLRPC$TL_messageMediaGeoLive tLRPC$TL_messageMediaGeoLive = new TLRPC$TL_messageMediaGeoLive();
        TLRPC$TL_geoPoint tLRPC$TL_geoPoint = new TLRPC$TL_geoPoint();
        tLRPC$TL_messageMediaGeoLive.geo = tLRPC$TL_geoPoint;
        tLRPC$TL_geoPoint.lat = AndroidUtilities.fixLocationCoord(this.myLocation.getLatitude());
        tLRPC$TL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(this.myLocation.getLongitude());
        tLRPC$TL_messageMediaGeoLive.heading = LocationController.getHeading(this.myLocation);
        int i3 = tLRPC$TL_messageMediaGeoLive.flags | 1;
        tLRPC$TL_messageMediaGeoLive.flags = i3;
        tLRPC$TL_messageMediaGeoLive.period = i;
        tLRPC$TL_messageMediaGeoLive.proximity_notification_radius = i2;
        tLRPC$TL_messageMediaGeoLive.flags = i3 | 8;
        this.delegate.didSelectLocation(tLRPC$TL_messageMediaGeoLive, this.locationType, true, 0);
        if (i2 > 0) {
            this.proximitySheet.setRadiusSet();
            this.proximityButton.setImageResource(C0952R.C0953drawable.msg_location_alert2);
            ProximitySheet proximitySheet = this.proximitySheet;
            if (proximitySheet != null) {
                proximitySheet.dismiss();
            }
            getUndoView().showWithAction(0L, 24, Integer.valueOf(i2), tLRPC$User, (Runnable) null, (Runnable) null);
            return;
        }
        finishFragment();
    }

    private Bitmap createPlaceBitmap(int i) {
        Bitmap[] bitmapArr = this.bitmapCache;
        int i2 = i % 7;
        if (bitmapArr[i2] != null) {
            return bitmapArr[i2];
        }
        try {
            Paint paint = new Paint(1);
            paint.setColor(-1);
            Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.m34dp(12.0f), AndroidUtilities.m34dp(12.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawCircle(AndroidUtilities.m34dp(6.0f), AndroidUtilities.m34dp(6.0f), AndroidUtilities.m34dp(6.0f), paint);
            paint.setColor(LocationCell.getColorForIndex(i));
            canvas.drawCircle(AndroidUtilities.m34dp(6.0f), AndroidUtilities.m34dp(6.0f), AndroidUtilities.m34dp(5.0f), paint);
            canvas.setBitmap(null);
            this.bitmapCache[i % 7] = createBitmap;
            return createBitmap;
        } catch (Throwable th) {
            FileLog.m30e(th);
            return null;
        }
    }

    public void updatePlacesMarkers(ArrayList<TLRPC$TL_messageMediaVenue> arrayList) {
        if (arrayList != null) {
            int size = this.placeMarkers.size();
            for (int i = 0; i < size; i++) {
                this.placeMarkers.get(i).marker.remove();
            }
            this.placeMarkers.clear();
            int size2 = arrayList.size();
            for (int i2 = 0; i2 < size2; i2++) {
                TLRPC$TL_messageMediaVenue tLRPC$TL_messageMediaVenue = arrayList.get(i2);
                try {
                    MarkerOptions markerOptions = new MarkerOptions();
                    TLRPC$GeoPoint tLRPC$GeoPoint = tLRPC$TL_messageMediaVenue.geo;
                    MarkerOptions position = markerOptions.position(new LatLng(tLRPC$GeoPoint.lat, tLRPC$GeoPoint._long));
                    position.icon(BitmapDescriptorFactory.fromBitmap(createPlaceBitmap(i2)));
                    position.anchor(0.5f, 0.5f);
                    position.title(tLRPC$TL_messageMediaVenue.title);
                    position.snippet(tLRPC$TL_messageMediaVenue.address);
                    VenueLocation venueLocation = new VenueLocation();
                    venueLocation.num = i2;
                    Marker addMarker = this.googleMap.addMarker(position);
                    venueLocation.marker = addMarker;
                    venueLocation.venue = tLRPC$TL_messageMediaVenue;
                    addMarker.setTag(venueLocation);
                    this.placeMarkers.add(venueLocation);
                } catch (Exception e) {
                    FileLog.m30e(e);
                }
            }
        }
    }

    private LiveLocation addUserMarker(TLRPC$Message tLRPC$Message) {
        TLRPC$GeoPoint tLRPC$GeoPoint = tLRPC$Message.media.geo;
        LatLng latLng = new LatLng(tLRPC$GeoPoint.lat, tLRPC$GeoPoint._long);
        LiveLocation liveLocation = this.markersMap.get(MessageObject.getFromChatId(tLRPC$Message));
        if (liveLocation == null) {
            liveLocation = new LiveLocation();
            liveLocation.object = tLRPC$Message;
            if (tLRPC$Message.from_id instanceof TLRPC$TL_peerUser) {
                liveLocation.user = getMessagesController().getUser(Long.valueOf(liveLocation.object.from_id.user_id));
                liveLocation.f1111id = liveLocation.object.from_id.user_id;
            } else {
                long dialogId = MessageObject.getDialogId(tLRPC$Message);
                if (DialogObject.isUserDialog(dialogId)) {
                    liveLocation.user = getMessagesController().getUser(Long.valueOf(dialogId));
                } else {
                    liveLocation.chat = getMessagesController().getChat(Long.valueOf(-dialogId));
                }
                liveLocation.f1111id = dialogId;
            }
            try {
                MarkerOptions position = new MarkerOptions().position(latLng);
                Bitmap createUserBitmap = createUserBitmap(liveLocation);
                if (createUserBitmap != null) {
                    position.icon(BitmapDescriptorFactory.fromBitmap(createUserBitmap));
                    position.anchor(0.5f, 0.907f);
                    liveLocation.marker = this.googleMap.addMarker(position);
                    if (!UserObject.isUserSelf(liveLocation.user)) {
                        MarkerOptions flat = new MarkerOptions().position(latLng).flat(true);
                        flat.anchor(0.5f, 0.5f);
                        Marker addMarker = this.googleMap.addMarker(flat);
                        liveLocation.directionMarker = addMarker;
                        int i = tLRPC$Message.media.heading;
                        if (i != 0) {
                            addMarker.setRotation(i);
                            liveLocation.directionMarker.setIcon(BitmapDescriptorFactory.fromResource(C0952R.C0953drawable.map_pin_cone2));
                            liveLocation.hasRotation = true;
                        } else {
                            addMarker.setRotation(0.0f);
                            liveLocation.directionMarker.setIcon(BitmapDescriptorFactory.fromResource(C0952R.C0953drawable.map_pin_circle));
                            liveLocation.hasRotation = false;
                        }
                    }
                    this.markers.add(liveLocation);
                    this.markersMap.put(liveLocation.f1111id, liveLocation);
                    LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.dialogId);
                    if (liveLocation.f1111id == getUserConfig().getClientUserId() && sharingLocationInfo != null && liveLocation.object.f877id == sharingLocationInfo.mid && this.myLocation != null) {
                        liveLocation.marker.setPosition(new LatLng(this.myLocation.getLatitude(), this.myLocation.getLongitude()));
                    }
                }
            } catch (Exception e) {
                FileLog.m30e(e);
            }
        } else {
            liveLocation.object = tLRPC$Message;
            liveLocation.marker.setPosition(latLng);
        }
        ProximitySheet proximitySheet = this.proximitySheet;
        if (proximitySheet != null) {
            proximitySheet.updateText(true, true);
        }
        return liveLocation;
    }

    private LiveLocation addUserMarker(TLRPC$TL_channelLocation tLRPC$TL_channelLocation) {
        TLRPC$GeoPoint tLRPC$GeoPoint = tLRPC$TL_channelLocation.geo_point;
        LatLng latLng = new LatLng(tLRPC$GeoPoint.lat, tLRPC$GeoPoint._long);
        LiveLocation liveLocation = new LiveLocation();
        if (DialogObject.isUserDialog(this.dialogId)) {
            liveLocation.user = getMessagesController().getUser(Long.valueOf(this.dialogId));
        } else {
            liveLocation.chat = getMessagesController().getChat(Long.valueOf(-this.dialogId));
        }
        liveLocation.f1111id = this.dialogId;
        try {
            MarkerOptions position = new MarkerOptions().position(latLng);
            Bitmap createUserBitmap = createUserBitmap(liveLocation);
            if (createUserBitmap != null) {
                position.icon(BitmapDescriptorFactory.fromBitmap(createUserBitmap));
                position.anchor(0.5f, 0.907f);
                liveLocation.marker = this.googleMap.addMarker(position);
                if (!UserObject.isUserSelf(liveLocation.user)) {
                    MarkerOptions flat = new MarkerOptions().position(latLng).flat(true);
                    flat.icon(BitmapDescriptorFactory.fromResource(C0952R.C0953drawable.map_pin_circle));
                    flat.anchor(0.5f, 0.5f);
                    liveLocation.directionMarker = this.googleMap.addMarker(flat);
                }
                this.markers.add(liveLocation);
                this.markersMap.put(liveLocation.f1111id, liveLocation);
            }
        } catch (Exception e) {
            FileLog.m30e(e);
        }
        return liveLocation;
    }

    private void onMapInit() {
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i;
        if (this.googleMap != null) {
            TLRPC$TL_channelLocation tLRPC$TL_channelLocation = this.chatLocation;
            if (tLRPC$TL_channelLocation != null) {
                this.googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(addUserMarker(tLRPC$TL_channelLocation).marker.getPosition(), this.googleMap.getMaxZoomLevel() - 4.0f));
            } else {
                MessageObject messageObject = this.messageObject;
                if (messageObject == null) {
                    Location location = new Location("network");
                    this.userLocation = location;
                    if (this.initialLocation != null) {
                        TLRPC$GeoPoint tLRPC$GeoPoint = this.initialLocation.geo_point;
                        LatLng latLng = new LatLng(tLRPC$GeoPoint.lat, tLRPC$GeoPoint._long);
                        GoogleMap googleMap = this.googleMap;
                        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, googleMap.getMaxZoomLevel() - 4.0f));
                        this.userLocation.setLatitude(this.initialLocation.geo_point.lat);
                        this.userLocation.setLongitude(this.initialLocation.geo_point._long);
                        this.adapter.setCustomLocation(this.userLocation);
                    } else {
                        location.setLatitude(20.659322d);
                        this.userLocation.setLongitude(-11.40625d);
                    }
                } else if (messageObject.isLiveLocation()) {
                    LiveLocation addUserMarker = addUserMarker(this.messageObject.messageOwner);
                    if (!getRecentLocations()) {
                        this.googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(addUserMarker.marker.getPosition(), this.googleMap.getMaxZoomLevel() - 4.0f));
                    }
                } else {
                    LatLng latLng2 = new LatLng(this.userLocation.getLatitude(), this.userLocation.getLongitude());
                    try {
                        this.googleMap.addMarker(new MarkerOptions().position(latLng2).icon(BitmapDescriptorFactory.fromResource(C0952R.C0953drawable.map_pin2)));
                    } catch (Exception e) {
                        FileLog.m30e(e);
                    }
                    this.googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng2, this.googleMap.getMaxZoomLevel() - 4.0f));
                    this.firstFocus = false;
                    getRecentLocations();
                }
            }
            try {
                this.googleMap.setMyLocationEnabled(true);
            } catch (Exception e2) {
                FileLog.m29e((Throwable) e2, false);
            }
            this.googleMap.getUiSettings().setMyLocationButtonEnabled(false);
            this.googleMap.getUiSettings().setZoomControlsEnabled(false);
            this.googleMap.getUiSettings().setCompassEnabled(false);
            this.googleMap.setOnCameraMoveStartedListener(new GoogleMap.OnCameraMoveStartedListener() {
                @Override
                public final void onCameraMoveStarted(int i2) {
                    LocationActivity.this.lambda$onMapInit$27(i2);
                }
            });
            this.googleMap.setOnMyLocationChangeListener(new GoogleMap.OnMyLocationChangeListener() {
                @Override
                public final void onMyLocationChange(Location location2) {
                    LocationActivity.this.lambda$onMapInit$28(location2);
                }
            });
            this.googleMap.setOnMarkerClickListener(new GoogleMap.OnMarkerClickListener() {
                @Override
                public final boolean onMarkerClick(Marker marker) {
                    boolean lambda$onMapInit$29;
                    lambda$onMapInit$29 = LocationActivity.this.lambda$onMapInit$29(marker);
                    return lambda$onMapInit$29;
                }
            });
            this.googleMap.setOnCameraMoveListener(new GoogleMap.OnCameraMoveListener() {
                @Override
                public final void onCameraMove() {
                    LocationActivity.this.lambda$onMapInit$30();
                }
            });
            Location lastLocation = getLastLocation();
            this.myLocation = lastLocation;
            positionMarker(lastLocation);
            if (this.checkGpsEnabled && getParentActivity() != null) {
                this.checkGpsEnabled = false;
                checkGpsEnabled();
            }
            ImageView imageView = this.proximityButton;
            if (imageView != null && imageView.getVisibility() == 0 && (sharingLocationInfo = getLocationController().getSharingLocationInfo(this.dialogId)) != null && (i = sharingLocationInfo.proximityMeters) > 0) {
                createCircle(i);
            }
        }
    }

    public void lambda$onMapInit$27(int i) {
        View childAt;
        RecyclerView.ViewHolder findContainingViewHolder;
        if (i == 1) {
            showSearchPlacesButton(true);
            removeInfoView();
            if (!this.scrolling) {
                int i2 = this.locationType;
                if ((i2 == 0 || i2 == 1) && this.listView.getChildCount() > 0 && (childAt = this.listView.getChildAt(0)) != null && (findContainingViewHolder = this.listView.findContainingViewHolder(childAt)) != null && findContainingViewHolder.getAdapterPosition() == 0) {
                    int dp = this.locationType == 0 ? 0 : AndroidUtilities.m34dp(66.0f);
                    int top = childAt.getTop();
                    if (top < (-dp)) {
                        CameraPosition cameraPosition = this.googleMap.getCameraPosition();
                        this.forceUpdate = CameraUpdateFactory.newLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                        this.listView.smoothScrollBy(0, top + dp);
                    }
                }
            }
        }
    }

    public void lambda$onMapInit$28(Location location) {
        positionMarker(location);
        getLocationController().setGoogleMapLocation(location, this.isFirstLocation);
        this.isFirstLocation = false;
    }

    public boolean lambda$onMapInit$29(Marker marker) {
        if (!(marker.getTag() instanceof VenueLocation)) {
            return true;
        }
        this.markerImageView.setVisibility(4);
        if (!this.userLocationMoved) {
            this.locationButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor("location_actionIcon"), PorterDuff.Mode.MULTIPLY));
            this.locationButton.setTag("location_actionIcon");
            this.userLocationMoved = true;
        }
        this.overlayView.addInfoView(marker);
        return true;
    }

    public void lambda$onMapInit$30() {
        MapOverlayView mapOverlayView = this.overlayView;
        if (mapOverlayView != null) {
            mapOverlayView.updatePositions();
        }
    }

    private boolean checkGpsEnabled() {
        if (!getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
            return true;
        }
        try {
            if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                builder.setTopAnimation(C0952R.raw.permission_request_location, 72, false, Theme.getColor("dialogTopBackground"));
                builder.setMessage(LocaleController.getString("GpsDisabledAlertText", C0952R.string.GpsDisabledAlertText));
                builder.setPositiveButton(LocaleController.getString("ConnectingToProxyEnable", C0952R.string.ConnectingToProxyEnable), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        LocationActivity.this.lambda$checkGpsEnabled$31(dialogInterface, i);
                    }
                });
                builder.setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
                showDialog(builder.create());
                return false;
            }
        } catch (Exception e) {
            FileLog.m30e(e);
        }
        return true;
    }

    public void lambda$checkGpsEnabled$31(DialogInterface dialogInterface, int i) {
        if (getParentActivity() != null) {
            try {
                getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
            } catch (Exception unused) {
            }
        }
    }

    private void createCircle(int i) {
        if (this.googleMap != null) {
            List<PatternItem> asList = Arrays.asList(new Gap(20.0f), new Dash(20.0f));
            CircleOptions circleOptions = new CircleOptions();
            circleOptions.center(new LatLng(this.myLocation.getLatitude(), this.myLocation.getLongitude()));
            circleOptions.radius(i);
            if (isActiveThemeDark()) {
                circleOptions.strokeColor(-1771658281);
                circleOptions.fillColor(476488663);
            } else {
                circleOptions.strokeColor(-1774024971);
                circleOptions.fillColor(474121973);
            }
            circleOptions.strokePattern(asList);
            circleOptions.strokeWidth(2.0f);
            this.proximityCircle = this.googleMap.addCircle(circleOptions);
        }
    }

    private void removeInfoView() {
        if (this.lastPressedMarker != null) {
            this.markerImageView.setVisibility(0);
            this.overlayView.removeInfoView(this.lastPressedMarker);
            this.lastPressedMarker = null;
            this.lastPressedVenue = null;
            this.lastPressedMarkerView = null;
        }
    }

    public void showPermissionAlert(boolean z) {
        if (getParentActivity() != null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setTopAnimation(C0952R.raw.permission_request_location, 72, false, Theme.getColor("dialogTopBackground"));
            if (z) {
                builder.setMessage(LocaleController.getString("PermissionNoLocationNavigation", C0952R.string.PermissionNoLocationNavigation));
            } else {
                builder.setMessage(LocaleController.getString("PermissionNoLocationFriends", C0952R.string.PermissionNoLocationFriends));
            }
            builder.setNegativeButton(LocaleController.getString("PermissionOpenSettings", C0952R.string.PermissionOpenSettings), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i) {
                    LocationActivity.this.lambda$showPermissionAlert$32(dialogInterface, i);
                }
            });
            builder.setPositiveButton(LocaleController.getString("OK", C0952R.string.OK), null);
            showDialog(builder.create());
        }
    }

    public void lambda$showPermissionAlert$32(DialogInterface dialogInterface, int i) {
        if (getParentActivity() != null) {
            try {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
                getParentActivity().startActivity(intent);
            } catch (Exception e) {
                FileLog.m30e(e);
            }
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (z && !z2) {
            try {
                if (this.mapView.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.mapView.getParent()).removeView(this.mapView);
                }
            } catch (Exception unused) {
            }
            FrameLayout frameLayout = this.mapViewClip;
            if (frameLayout != null) {
                frameLayout.addView(this.mapView, 0, LayoutHelper.createFrame(-1, this.overScrollHeight + AndroidUtilities.m34dp(10.0f), 51));
                MapOverlayView mapOverlayView = this.overlayView;
                if (mapOverlayView != null) {
                    try {
                        if (mapOverlayView.getParent() instanceof ViewGroup) {
                            ((ViewGroup) this.overlayView.getParent()).removeView(this.overlayView);
                        }
                    } catch (Exception unused2) {
                    }
                    this.mapViewClip.addView(this.overlayView, 1, LayoutHelper.createFrame(-1, this.overScrollHeight + AndroidUtilities.m34dp(10.0f), 51));
                }
                updateClipView(false);
                maybeShowProximityHint();
                return;
            }
            View view = this.fragmentView;
            if (view != null) {
                ((FrameLayout) view).addView(this.mapView, 0, LayoutHelper.createFrame(-1, -1, 51));
            }
        }
    }

    public void maybeShowProximityHint() {
        SharedPreferences globalMainSettings;
        int i;
        ImageView imageView = this.proximityButton;
        if (imageView != null && imageView.getVisibility() == 0 && !this.proximityAnimationInProgress && (i = (globalMainSettings = MessagesController.getGlobalMainSettings()).getInt("proximityhint", 0)) < 3) {
            globalMainSettings.edit().putInt("proximityhint", i + 1).commit();
            if (DialogObject.isUserDialog(this.dialogId)) {
                this.hintView.setOverrideText(LocaleController.formatString("ProximityTooltioUser", C0952R.string.ProximityTooltioUser, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.dialogId)))));
            } else {
                this.hintView.setOverrideText(LocaleController.getString("ProximityTooltioGroup", C0952R.string.ProximityTooltioGroup));
            }
            this.hintView.showForView(this.proximityButton, true);
        }
    }

    private void showResults() {
        if (this.adapter.getItemCount() != 0 && this.layoutManager.findFirstVisibleItemPosition() == 0) {
            int dp = AndroidUtilities.m34dp(258.0f) + this.listView.getChildAt(0).getTop();
            if (dp >= 0 && dp <= AndroidUtilities.m34dp(258.0f)) {
                this.listView.smoothScrollBy(0, dp);
            }
        }
    }

    public void updateClipView(boolean z) {
        int i;
        int i2;
        FrameLayout.LayoutParams layoutParams;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(0);
        if (findViewHolderForAdapterPosition != null) {
            i2 = (int) findViewHolderForAdapterPosition.itemView.getY();
            i = this.overScrollHeight + Math.min(i2, 0);
        } else {
            i2 = -this.mapViewClip.getMeasuredHeight();
            i = 0;
        }
        if (((FrameLayout.LayoutParams) this.mapViewClip.getLayoutParams()) != null) {
            if (i <= 0) {
                if (this.mapView.getVisibility() == 0) {
                    this.mapView.setVisibility(4);
                    this.mapViewClip.setVisibility(4);
                    MapOverlayView mapOverlayView = this.overlayView;
                    if (mapOverlayView != null) {
                        mapOverlayView.setVisibility(4);
                    }
                }
            } else if (this.mapView.getVisibility() == 4) {
                this.mapView.setVisibility(0);
                this.mapViewClip.setVisibility(0);
                MapOverlayView mapOverlayView2 = this.overlayView;
                if (mapOverlayView2 != null) {
                    mapOverlayView2.setVisibility(0);
                }
            }
            this.mapViewClip.setTranslationY(Math.min(0, i2));
            int i3 = -i2;
            int i4 = i3 / 2;
            this.mapView.setTranslationY(Math.max(0, i4));
            MapOverlayView mapOverlayView3 = this.overlayView;
            if (mapOverlayView3 != null) {
                mapOverlayView3.setTranslationY(Math.max(0, i4));
            }
            int measuredHeight = this.overScrollHeight - this.mapTypeButton.getMeasuredHeight();
            int i5 = this.locationType;
            float min = Math.min(measuredHeight - AndroidUtilities.m34dp(64 + ((i5 == 0 || i5 == 1) ? 30 : 10)), i3);
            this.mapTypeButton.setTranslationY(min);
            this.proximityButton.setTranslationY(min);
            HintView hintView = this.hintView;
            if (hintView != null) {
                hintView.setExtraTranslationY(min);
            }
            SearchButton searchButton = this.searchAreaButton;
            if (searchButton != null) {
                searchButton.setTranslation(min);
            }
            View view = this.markerImageView;
            if (view != null) {
                int dp = (i3 - AndroidUtilities.m34dp(view.getTag() == null ? 48.0f : 69.0f)) + (i / 2);
                this.markerTop = dp;
                view.setTranslationY(dp);
            }
            if (!z) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.mapView.getLayoutParams();
                if (!(layoutParams2 == null || layoutParams2.height == this.overScrollHeight + AndroidUtilities.m34dp(10.0f))) {
                    layoutParams2.height = this.overScrollHeight + AndroidUtilities.m34dp(10.0f);
                    GoogleMap googleMap = this.googleMap;
                    if (googleMap != null) {
                        googleMap.setPadding(AndroidUtilities.m34dp(70.0f), 0, AndroidUtilities.m34dp(70.0f), AndroidUtilities.m34dp(10.0f));
                    }
                    this.mapView.setLayoutParams(layoutParams2);
                }
                MapOverlayView mapOverlayView4 = this.overlayView;
                if (mapOverlayView4 != null && (layoutParams = (FrameLayout.LayoutParams) mapOverlayView4.getLayoutParams()) != null && layoutParams.height != this.overScrollHeight + AndroidUtilities.m34dp(10.0f)) {
                    layoutParams.height = this.overScrollHeight + AndroidUtilities.m34dp(10.0f);
                    this.overlayView.setLayoutParams(layoutParams);
                }
            }
        }
    }

    public void fixLayoutInternal(boolean z) {
        FrameLayout.LayoutParams layoutParams;
        if (this.listView != null) {
            int currentActionBarHeight = (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + C1006ActionBar.getCurrentActionBarHeight();
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            if (measuredHeight != 0) {
                int i = this.locationType;
                if (i == 6) {
                    this.overScrollHeight = (measuredHeight - AndroidUtilities.m34dp(66.0f)) - currentActionBarHeight;
                } else if (i == 2) {
                    this.overScrollHeight = (measuredHeight - AndroidUtilities.m34dp(73.0f)) - currentActionBarHeight;
                } else {
                    this.overScrollHeight = (measuredHeight - AndroidUtilities.m34dp(66.0f)) - currentActionBarHeight;
                }
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.listView.getLayoutParams();
                layoutParams2.topMargin = currentActionBarHeight;
                this.listView.setLayoutParams(layoutParams2);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.mapViewClip.getLayoutParams();
                layoutParams3.topMargin = currentActionBarHeight;
                layoutParams3.height = this.overScrollHeight;
                this.mapViewClip.setLayoutParams(layoutParams3);
                RecyclerListView recyclerListView = this.searchListView;
                if (recyclerListView != null) {
                    FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) recyclerListView.getLayoutParams();
                    layoutParams4.topMargin = currentActionBarHeight;
                    this.searchListView.setLayoutParams(layoutParams4);
                }
                this.adapter.setOverScrollHeight(this.overScrollHeight);
                FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.mapView.getLayoutParams();
                if (layoutParams5 != null) {
                    layoutParams5.height = this.overScrollHeight + AndroidUtilities.m34dp(10.0f);
                    GoogleMap googleMap = this.googleMap;
                    if (googleMap != null) {
                        googleMap.setPadding(AndroidUtilities.m34dp(70.0f), 0, AndroidUtilities.m34dp(70.0f), AndroidUtilities.m34dp(10.0f));
                    }
                    this.mapView.setLayoutParams(layoutParams5);
                }
                MapOverlayView mapOverlayView = this.overlayView;
                if (!(mapOverlayView == null || (layoutParams = (FrameLayout.LayoutParams) mapOverlayView.getLayoutParams()) == null)) {
                    layoutParams.height = this.overScrollHeight + AndroidUtilities.m34dp(10.0f);
                    this.overlayView.setLayoutParams(layoutParams);
                }
                this.adapter.notifyDataSetChanged();
                if (z) {
                    int i2 = this.locationType;
                    final int i3 = i2 == 3 ? 73 : (i2 == 1 || i2 == 2) ? 66 : 0;
                    this.layoutManager.scrollToPositionWithOffset(0, -AndroidUtilities.m34dp(i3));
                    updateClipView(false);
                    this.listView.post(new Runnable() {
                        @Override
                        public final void run() {
                            LocationActivity.this.lambda$fixLayoutInternal$33(i3);
                        }
                    });
                    return;
                }
                updateClipView(false);
            }
        }
    }

    public void lambda$fixLayoutInternal$33(int i) {
        this.layoutManager.scrollToPositionWithOffset(0, -AndroidUtilities.m34dp(i));
        updateClipView(false);
    }

    private Location getLastLocation() {
        LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        List<String> providers = locationManager.getProviders(true);
        Location location = null;
        for (int size = providers.size() - 1; size >= 0; size--) {
            location = locationManager.getLastKnownLocation(providers.get(size));
            if (location != null) {
                break;
            }
        }
        return location;
    }

    private void positionMarker(Location location) {
        if (location != null) {
            this.myLocation = new Location(location);
            LiveLocation liveLocation = this.markersMap.get(getUserConfig().getClientUserId());
            LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.dialogId);
            if (!(liveLocation == null || sharingLocationInfo == null || liveLocation.object.f877id != sharingLocationInfo.mid)) {
                LatLng latLng = new LatLng(location.getLatitude(), location.getLongitude());
                liveLocation.marker.setPosition(latLng);
                Marker marker = liveLocation.directionMarker;
                if (marker != null) {
                    marker.setPosition(latLng);
                }
            }
            if (this.messageObject == null && this.chatLocation == null && this.googleMap != null) {
                LatLng latLng2 = new LatLng(location.getLatitude(), location.getLongitude());
                LocationActivityAdapter locationActivityAdapter = this.adapter;
                if (locationActivityAdapter != null) {
                    if (!this.searchedForCustomLocations && this.locationType != 4) {
                        locationActivityAdapter.searchPlacesWithQuery(null, this.myLocation, true);
                    }
                    this.adapter.setGpsLocation(this.myLocation);
                }
                if (!this.userLocationMoved) {
                    this.userLocation = new Location(location);
                    if (this.firstWas) {
                        this.googleMap.animateCamera(CameraUpdateFactory.newLatLng(latLng2));
                    } else {
                        this.firstWas = true;
                        this.googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng2, this.googleMap.getMaxZoomLevel() - 4.0f));
                    }
                }
            } else {
                this.adapter.setGpsLocation(this.myLocation);
            }
            ProximitySheet proximitySheet = this.proximitySheet;
            if (proximitySheet != null) {
                proximitySheet.updateText(true, true);
            }
            Circle circle = this.proximityCircle;
            if (circle != null) {
                circle.setCenter(new LatLng(this.myLocation.getLatitude(), this.myLocation.getLongitude()));
            }
        }
    }

    public void setMessageObject(MessageObject messageObject) {
        this.messageObject = messageObject;
        this.dialogId = messageObject.getDialogId();
    }

    public void setChatLocation(long j, TLRPC$TL_channelLocation tLRPC$TL_channelLocation) {
        this.dialogId = -j;
        this.chatLocation = tLRPC$TL_channelLocation;
    }

    public void setDialogId(long j) {
        this.dialogId = j;
    }

    public void setInitialLocation(TLRPC$TL_channelLocation tLRPC$TL_channelLocation) {
        this.initialLocation = tLRPC$TL_channelLocation;
    }

    private static LatLng move(LatLng latLng, double d, double d2) {
        double meterToLongitude = meterToLongitude(d2, latLng.latitude);
        return new LatLng(latLng.latitude + meterToLatitude(d), latLng.longitude + meterToLongitude);
    }

    private static double meterToLongitude(double d, double d2) {
        return Math.toDegrees(d / (Math.cos(Math.toRadians(d2)) * 6366198.0d));
    }

    private static double meterToLatitude(double d) {
        return Math.toDegrees(d / 6366198.0d);
    }

    private void fetchRecentLocations(ArrayList<TLRPC$Message> arrayList) {
        LatLngBounds.Builder builder = this.firstFocus ? new LatLngBounds.Builder() : null;
        int currentTime = getConnectionsManager().getCurrentTime();
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC$Message tLRPC$Message = arrayList.get(i);
            if (tLRPC$Message.date + tLRPC$Message.media.period > currentTime) {
                if (builder != null) {
                    TLRPC$GeoPoint tLRPC$GeoPoint = tLRPC$Message.media.geo;
                    builder.include(new LatLng(tLRPC$GeoPoint.lat, tLRPC$GeoPoint._long));
                }
                addUserMarker(tLRPC$Message);
                if (!(this.proximityButton.getVisibility() == 8 || MessageObject.getFromChatId(tLRPC$Message) == getUserConfig().getClientUserId())) {
                    this.proximityButton.setVisibility(0);
                    this.proximityAnimationInProgress = true;
                    this.proximityButton.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            LocationActivity.this.proximityAnimationInProgress = false;
                            LocationActivity.this.maybeShowProximityHint();
                        }
                    }).start();
                }
            }
        }
        if (builder != null) {
            if (this.firstFocus) {
                this.listView.smoothScrollBy(0, AndroidUtilities.m34dp(99.0f));
            }
            this.firstFocus = false;
            this.adapter.setLiveLocations(this.markers);
            if (this.messageObject.isLiveLocation()) {
                try {
                    LatLng center = builder.build().getCenter();
                    LatLng move = move(center, 100.0d, 100.0d);
                    builder.include(move(center, -100.0d, -100.0d));
                    builder.include(move);
                    LatLngBounds build = builder.build();
                    if (arrayList.size() > 1) {
                        try {
                            CameraUpdate newLatLngBounds = CameraUpdateFactory.newLatLngBounds(build, AndroidUtilities.m34dp(113.0f));
                            this.moveToBounds = newLatLngBounds;
                            this.googleMap.moveCamera(newLatLngBounds);
                            this.moveToBounds = null;
                        } catch (Exception e) {
                            FileLog.m30e(e);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    private void moveToBounds(int i, boolean z, boolean z2) {
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        builder.include(new LatLng(this.myLocation.getLatitude(), this.myLocation.getLongitude()));
        try {
            if (z) {
                int max = Math.max(i, 250);
                LatLng center = builder.build().getCenter();
                double d = max;
                LatLng move = move(center, d, d);
                double d2 = -max;
                builder.include(move(center, d2, d2));
                builder.include(move);
                LatLngBounds build = builder.build();
                try {
                    this.googleMap.setPadding(AndroidUtilities.m34dp(70.0f), 0, AndroidUtilities.m34dp(70.0f), (int) ((this.proximitySheet.getCustomView().getMeasuredHeight() - AndroidUtilities.m34dp(40.0f)) + this.mapViewClip.getTranslationY()));
                    if (z2) {
                        this.googleMap.animateCamera(CameraUpdateFactory.newLatLngBounds(build, 0), 500, null);
                    } else {
                        this.googleMap.moveCamera(CameraUpdateFactory.newLatLngBounds(build, 0));
                    }
                } catch (Exception e) {
                    FileLog.m30e(e);
                }
            }
            int currentTime = getConnectionsManager().getCurrentTime();
            int size = this.markers.size();
            for (int i2 = 0; i2 < size; i2++) {
                TLRPC$Message tLRPC$Message = this.markers.get(i2).object;
                if (tLRPC$Message.date + tLRPC$Message.media.period > currentTime) {
                    TLRPC$GeoPoint tLRPC$GeoPoint = tLRPC$Message.media.geo;
                    builder.include(new LatLng(tLRPC$GeoPoint.lat, tLRPC$GeoPoint._long));
                }
            }
            LatLng center2 = builder.build().getCenter();
            LatLng move2 = move(center2, 100.0d, 100.0d);
            builder.include(move(center2, -100.0d, -100.0d));
            builder.include(move2);
            LatLngBounds build2 = builder.build();
            try {
                this.googleMap.setPadding(AndroidUtilities.m34dp(70.0f), 0, AndroidUtilities.m34dp(70.0f), this.proximitySheet.getCustomView().getMeasuredHeight() - AndroidUtilities.m34dp(100.0f));
                this.googleMap.moveCamera(CameraUpdateFactory.newLatLngBounds(build2, 0));
            } catch (Exception e2) {
                FileLog.m30e(e2);
            }
        } catch (Exception unused) {
        }
    }

    private boolean getRecentLocations() {
        ArrayList<TLRPC$Message> arrayList = getLocationController().locationsCache.get(this.messageObject.getDialogId());
        if (arrayList == null || !arrayList.isEmpty()) {
            arrayList = null;
        } else {
            fetchRecentLocations(arrayList);
        }
        if (DialogObject.isChatDialog(this.dialogId)) {
            TLRPC$Chat chat = getMessagesController().getChat(Long.valueOf(-this.dialogId));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                return false;
            }
        }
        TLRPC$TL_messages_getRecentLocations tLRPC$TL_messages_getRecentLocations = new TLRPC$TL_messages_getRecentLocations();
        final long dialogId = this.messageObject.getDialogId();
        tLRPC$TL_messages_getRecentLocations.peer = getMessagesController().getInputPeer(dialogId);
        tLRPC$TL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getRecentLocations, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                LocationActivity.this.lambda$getRecentLocations$36(dialogId, tLObject, tLRPC$TL_error);
            }
        });
        return arrayList != null;
    }

    public void lambda$getRecentLocations$36(final long j, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LocationActivity.this.lambda$getRecentLocations$35(tLObject, j);
                }
            });
        }
    }

    public void lambda$getRecentLocations$35(TLObject tLObject, long j) {
        if (this.googleMap != null) {
            TLRPC$messages_Messages tLRPC$messages_Messages = (TLRPC$messages_Messages) tLObject;
            int i = 0;
            while (i < tLRPC$messages_Messages.messages.size()) {
                if (!(tLRPC$messages_Messages.messages.get(i).media instanceof TLRPC$TL_messageMediaGeoLive)) {
                    tLRPC$messages_Messages.messages.remove(i);
                    i--;
                }
                i++;
            }
            getMessagesStorage().putUsersAndChats(tLRPC$messages_Messages.users, tLRPC$messages_Messages.chats, true, true);
            getMessagesController().putUsers(tLRPC$messages_Messages.users, false);
            getMessagesController().putChats(tLRPC$messages_Messages.chats, false);
            getLocationController().locationsCache.put(j, tLRPC$messages_Messages.messages);
            getNotificationCenter().postNotificationName(NotificationCenter.liveLocationsCacheChanged, Long.valueOf(j));
            fetchRecentLocations(tLRPC$messages_Messages.messages);
            getLocationController().markLiveLoactionsAsRead(this.dialogId);
            if (this.markAsReadRunnable == null) {
                Runnable locationActivity$$ExternalSyntheticLambda18 = new Runnable() {
                    @Override
                    public final void run() {
                        LocationActivity.this.lambda$getRecentLocations$34();
                    }
                };
                this.markAsReadRunnable = locationActivity$$ExternalSyntheticLambda18;
                AndroidUtilities.runOnUIThread(locationActivity$$ExternalSyntheticLambda18, 5000L);
            }
        }
    }

    public void lambda$getRecentLocations$34() {
        Runnable runnable;
        getLocationController().markLiveLoactionsAsRead(this.dialogId);
        if (!this.isPaused && (runnable = this.markAsReadRunnable) != null) {
            AndroidUtilities.runOnUIThread(runnable, 5000L);
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        LocationActivityAdapter locationActivityAdapter;
        LiveLocation liveLocation;
        LocationActivityAdapter locationActivityAdapter2;
        if (i == NotificationCenter.closeChats) {
            removeSelfFromStack();
            return;
        }
        if (i == NotificationCenter.locationPermissionGranted) {
            this.locationDenied = false;
            LocationActivityAdapter locationActivityAdapter3 = this.adapter;
            if (locationActivityAdapter3 != null) {
                locationActivityAdapter3.setMyLocationDenied(false);
            }
            GoogleMap googleMap = this.googleMap;
            if (googleMap != null) {
                try {
                    googleMap.setMyLocationEnabled(true);
                } catch (Exception e) {
                    FileLog.m30e(e);
                }
            }
        } else if (i == NotificationCenter.locationPermissionDenied) {
            this.locationDenied = true;
            LocationActivityAdapter locationActivityAdapter4 = this.adapter;
            if (locationActivityAdapter4 != null) {
                locationActivityAdapter4.setMyLocationDenied(true);
            }
        } else if (i == NotificationCenter.liveLocationsChanged) {
            LocationActivityAdapter locationActivityAdapter5 = this.adapter;
            if (locationActivityAdapter5 != null) {
                locationActivityAdapter5.updateLiveLocationCell();
            }
        } else if (i == NotificationCenter.didReceiveNewMessages) {
            if (!((Boolean) objArr[2]).booleanValue() && ((Long) objArr[0]).longValue() == this.dialogId && this.messageObject != null) {
                ArrayList arrayList = (ArrayList) objArr[1];
                boolean z = false;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i3);
                    if (messageObject.isLiveLocation()) {
                        addUserMarker(messageObject.messageOwner);
                        z = true;
                    } else if ((messageObject.messageOwner.action instanceof TLRPC$TL_messageActionGeoProximityReached) && DialogObject.isUserDialog(messageObject.getDialogId())) {
                        this.proximityButton.setImageResource(C0952R.C0953drawable.msg_location_alert);
                        Circle circle = this.proximityCircle;
                        if (circle != null) {
                            circle.remove();
                            this.proximityCircle = null;
                        }
                    }
                }
                if (z && (locationActivityAdapter2 = this.adapter) != null) {
                    locationActivityAdapter2.setLiveLocations(this.markers);
                }
            }
        } else if (i == NotificationCenter.replaceMessagesObjects) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue == this.dialogId && this.messageObject != null) {
                ArrayList arrayList2 = (ArrayList) objArr[1];
                boolean z2 = false;
                for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                    MessageObject messageObject2 = (MessageObject) arrayList2.get(i4);
                    if (messageObject2.isLiveLocation() && (liveLocation = this.markersMap.get(getMessageId(messageObject2.messageOwner))) != null) {
                        LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(longValue);
                        if (sharingLocationInfo == null || sharingLocationInfo.mid != messageObject2.getId()) {
                            liveLocation.object = messageObject2.messageOwner;
                            TLRPC$GeoPoint tLRPC$GeoPoint = messageObject2.messageOwner.media.geo;
                            LatLng latLng = new LatLng(tLRPC$GeoPoint.lat, tLRPC$GeoPoint._long);
                            liveLocation.marker.setPosition(latLng);
                            Marker marker = liveLocation.directionMarker;
                            if (marker != null) {
                                marker.getPosition();
                                liveLocation.directionMarker.setPosition(latLng);
                                int i5 = messageObject2.messageOwner.media.heading;
                                if (i5 != 0) {
                                    liveLocation.directionMarker.setRotation(i5);
                                    if (!liveLocation.hasRotation) {
                                        liveLocation.directionMarker.setIcon(BitmapDescriptorFactory.fromResource(C0952R.C0953drawable.map_pin_cone2));
                                        liveLocation.hasRotation = true;
                                    }
                                } else if (liveLocation.hasRotation) {
                                    liveLocation.directionMarker.setRotation(0.0f);
                                    liveLocation.directionMarker.setIcon(BitmapDescriptorFactory.fromResource(C0952R.C0953drawable.map_pin_circle));
                                    liveLocation.hasRotation = false;
                                }
                            }
                        }
                        z2 = true;
                    }
                }
                if (z2 && (locationActivityAdapter = this.adapter) != null) {
                    locationActivityAdapter.updateLiveLocations();
                    ProximitySheet proximitySheet = this.proximitySheet;
                    if (proximitySheet != null) {
                        proximitySheet.updateText(true, true);
                    }
                }
            }
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        MapView mapView = this.mapView;
        if (mapView != null && this.mapsInitialized) {
            try {
                mapView.onPause();
            } catch (Exception e) {
                FileLog.m30e(e);
            }
        }
        UndoView[] undoViewArr = this.undoView;
        if (undoViewArr[0] != null) {
            undoViewArr[0].hide(true, 0);
        }
        this.onResumeCalled = false;
    }

    @Override
    public boolean onBackPressed() {
        ProximitySheet proximitySheet = this.proximitySheet;
        if (proximitySheet == null) {
            return super.onBackPressed();
        }
        proximitySheet.dismiss();
        return false;
    }

    @Override
    public void onBecomeFullyHidden() {
        UndoView[] undoViewArr = this.undoView;
        if (undoViewArr[0] != null) {
            undoViewArr[0].hide(true, 0);
        }
    }

    @Override
    public void onResume() {
        Activity parentActivity;
        super.onResume();
        AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        MapView mapView = this.mapView;
        if (mapView != null && this.mapsInitialized) {
            try {
                mapView.onResume();
            } catch (Throwable th) {
                FileLog.m30e(th);
            }
        }
        this.onResumeCalled = true;
        GoogleMap googleMap = this.googleMap;
        if (googleMap != null) {
            try {
                googleMap.setMyLocationEnabled(true);
            } catch (Exception e) {
                FileLog.m30e(e);
            }
        }
        fixLayoutInternal(true);
        if (this.checkPermission && Build.VERSION.SDK_INT >= 23 && (parentActivity = getParentActivity()) != null) {
            this.checkPermission = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        Runnable runnable = this.markAsReadRunnable;
        if (runnable != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable);
            AndroidUtilities.runOnUIThread(this.markAsReadRunnable, 5000L);
        }
    }

    @Override
    public void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (i == 30) {
            openShareLiveLocation(this.askWithRadius);
        }
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        MapView mapView = this.mapView;
        if (mapView != null && this.mapsInitialized) {
            mapView.onLowMemory();
        }
    }

    public void setDelegate(LocationActivityDelegate locationActivityDelegate) {
        this.delegate = locationActivityDelegate;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        ThemeDescription.ThemeDescriptionDelegate locationActivity$$ExternalSyntheticLambda29 = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                LocationActivity.this.lambda$getThemeDescriptions$37();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        for (int i = 0; i < this.undoView.length; i++) {
            arrayList.add(new ThemeDescription(this.undoView[i], ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "undo_background"));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "undo_cancelColor"));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "undo_cancelColor"));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "undo_infoColor"));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "undo_infoColor"));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "undo_infoColor"));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "undo_infoColor"));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "BODY", "undo_background"));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Big", "undo_background"));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Big 3", "undo_infoColor"));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Small", "undo_infoColor"));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Body Main.**", "undo_infoColor"));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Body Top.**", "undo_infoColor"));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Line.**", "undo_infoColor"));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Curve Big.**", "undo_infoColor"));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Curve Small.**", "undo_infoColor"));
        }
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, locationActivity$$ExternalSyntheticLambda29, "dialogBackground"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "dialogBackground"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, "dialogBackground"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, "dialogTextBlack"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, "dialogTextBlack"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "dialogButtonSelector"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCH, null, null, null, null, "dialogTextBlack"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCHPLACEHOLDER, null, null, null, null, "chat_messagePanelHint"));
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        arrayList.add(new ThemeDescription(actionBarMenuItem != null ? actionBarMenuItem.getSearchField() : null, ThemeDescription.FLAG_CURSORCOLOR, null, null, null, null, "dialogTextBlack"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SUBMENUBACKGROUND, null, null, null, locationActivity$$ExternalSyntheticLambda29, "actionBarDefaultSubmenuBackground"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SUBMENUITEM, null, null, null, locationActivity$$ExternalSyntheticLambda29, "actionBarDefaultSubmenuItem"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_IMAGECOLOR | ThemeDescription.FLAG_AB_SUBMENUITEM, null, null, null, locationActivity$$ExternalSyntheticLambda29, "actionBarDefaultSubmenuItemIcon"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, "listSelectorSDK21"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, "divider"));
        arrayList.add(new ThemeDescription(this.emptyImageView, ThemeDescription.FLAG_IMAGECOLOR, null, null, null, null, "dialogEmptyImage"));
        arrayList.add(new ThemeDescription(this.emptyTitleTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "dialogEmptyText"));
        arrayList.add(new ThemeDescription(this.emptySubtitleTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "dialogEmptyText"));
        arrayList.add(new ThemeDescription(this.shadow, 0, null, null, null, null, "key_sheet_scrollUp"));
        arrayList.add(new ThemeDescription(this.locationButton, ThemeDescription.FLAG_IMAGECOLOR | ThemeDescription.FLAG_CHECKTAG, null, null, null, null, "location_actionIcon"));
        arrayList.add(new ThemeDescription(this.locationButton, ThemeDescription.FLAG_IMAGECOLOR | ThemeDescription.FLAG_CHECKTAG, null, null, null, null, "location_actionActiveIcon"));
        arrayList.add(new ThemeDescription(this.locationButton, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "location_actionBackground"));
        arrayList.add(new ThemeDescription(this.locationButton, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, "location_actionPressedBackground"));
        arrayList.add(new ThemeDescription(this.mapTypeButton, 0, null, null, null, locationActivity$$ExternalSyntheticLambda29, "location_actionIcon"));
        arrayList.add(new ThemeDescription(this.mapTypeButton, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "location_actionBackground"));
        arrayList.add(new ThemeDescription(this.mapTypeButton, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, "location_actionPressedBackground"));
        arrayList.add(new ThemeDescription(this.proximityButton, 0, null, null, null, locationActivity$$ExternalSyntheticLambda29, "location_actionIcon"));
        arrayList.add(new ThemeDescription(this.proximityButton, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "location_actionBackground"));
        arrayList.add(new ThemeDescription(this.proximityButton, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, "location_actionPressedBackground"));
        arrayList.add(new ThemeDescription(this.searchAreaButton, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "location_actionActiveIcon"));
        arrayList.add(new ThemeDescription(this.searchAreaButton, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "location_actionBackground"));
        arrayList.add(new ThemeDescription(this.searchAreaButton, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, "location_actionPressedBackground"));
        arrayList.add(new ThemeDescription(null, 0, null, null, Theme.avatarDrawables, locationActivity$$ExternalSyntheticLambda29, "avatar_text"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, locationActivity$$ExternalSyntheticLambda29, "avatar_backgroundRed"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, locationActivity$$ExternalSyntheticLambda29, "avatar_backgroundOrange"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, locationActivity$$ExternalSyntheticLambda29, "avatar_backgroundViolet"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, locationActivity$$ExternalSyntheticLambda29, "avatar_backgroundGreen"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, locationActivity$$ExternalSyntheticLambda29, "avatar_backgroundCyan"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, locationActivity$$ExternalSyntheticLambda29, "avatar_backgroundBlue"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, locationActivity$$ExternalSyntheticLambda29, "avatar_backgroundPink"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "location_liveLocationProgress"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "location_placeLocationBackground"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, "dialog_liveLocationProgress"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE | ThemeDescription.FLAG_CHECKTAG, new Class[]{SendLocationCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "location_sendLocationIcon"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE | ThemeDescription.FLAG_CHECKTAG, new Class[]{SendLocationCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "location_sendLiveLocationIcon"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE | ThemeDescription.FLAG_CHECKTAG, new Class[]{SendLocationCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "location_sendLocationBackground"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE | ThemeDescription.FLAG_CHECKTAG, new Class[]{SendLocationCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "location_sendLiveLocationBackground"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SendLocationCell.class}, new String[]{"accurateTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText3"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{SendLocationCell.class}, new String[]{"titleTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "location_sendLiveLocationText"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{SendLocationCell.class}, new String[]{"titleTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "location_sendLocationText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationDirectionCell.class}, new String[]{"buttonTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "featuredStickers_buttonText"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE, new Class[]{LocationDirectionCell.class}, new String[]{"frameLayout"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "featuredStickers_addButton"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, new Class[]{LocationDirectionCell.class}, new String[]{"frameLayout"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "featuredStickers_addButtonPressed"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{ShadowSectionCell.class}, null, null, null, "windowBackgroundGray"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "dialogTextBlue2"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{LocationCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText3"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationCell.class}, new String[]{"addressTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText3"));
        arrayList.add(new ThemeDescription(this.searchListView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{LocationCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText3"));
        arrayList.add(new ThemeDescription(this.searchListView, 0, new Class[]{LocationCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.searchListView, 0, new Class[]{LocationCell.class}, new String[]{"addressTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText3"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SharingLiveLocationCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SharingLiveLocationCell.class}, new String[]{"distanceTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText3"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationLoadingCell.class}, new String[]{"progressBar"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "progressCircle"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationLoadingCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText3"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationLoadingCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText3"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationPoweredCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText3"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{LocationPoweredCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "dialogEmptyImage"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationPoweredCell.class}, new String[]{"textView2"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "dialogEmptyText"));
        return arrayList;
    }

    public void lambda$getThemeDescriptions$37() {
        this.mapTypeButton.setIconColor(Theme.getColor("location_actionIcon"));
        this.mapTypeButton.redrawPopup(Theme.getColor("actionBarDefaultSubmenuBackground"));
        this.mapTypeButton.setPopupItemsColor(Theme.getColor("actionBarDefaultSubmenuItemIcon"), true);
        this.mapTypeButton.setPopupItemsColor(Theme.getColor("actionBarDefaultSubmenuItem"), false);
        this.shadowDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor("dialogBackground"), PorterDuff.Mode.MULTIPLY));
        this.shadow.invalidate();
        if (this.googleMap == null) {
            return;
        }
        if (isActiveThemeDark()) {
            if (!this.currentMapStyleDark) {
                this.currentMapStyleDark = true;
                this.googleMap.setMapStyle(MapStyleOptions.loadRawResourceStyle(ApplicationLoader.applicationContext, C0952R.raw.mapstyle_night));
                Circle circle = this.proximityCircle;
                if (circle != null) {
                    circle.setStrokeColor(-1);
                    this.proximityCircle.setFillColor(553648127);
                }
            }
        } else if (this.currentMapStyleDark) {
            this.currentMapStyleDark = false;
            this.googleMap.setMapStyle(null);
            Circle circle2 = this.proximityCircle;
            if (circle2 != null) {
                circle2.setStrokeColor(-16777216);
                this.proximityCircle.setFillColor(536870912);
            }
        }
    }
}
