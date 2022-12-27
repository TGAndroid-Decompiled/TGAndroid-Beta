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
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
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
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserObject;
import org.telegram.p009ui.ActionBar.ActionBarMenu;
import org.telegram.p009ui.ActionBar.ActionBarMenuItem;
import org.telegram.p009ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.p009ui.ActionBar.ActionBarPopupWindow;
import org.telegram.p009ui.ActionBar.AlertDialog;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.C1133ActionBar;
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
    private IMapsProvider.ICameraUpdate forceUpdate;
    private boolean hasScreenshot;
    private HintView hintView;
    private TLRPC$TL_channelLocation initialLocation;
    private IMapsProvider.IMarker lastPressedMarker;
    private FrameLayout lastPressedMarkerView;
    private VenueLocation lastPressedVenue;
    private LinearLayoutManager layoutManager;
    private RecyclerListView listView;
    private ImageView locationButton;
    private int locationType;
    private IMapsProvider.IMap map;
    private ActionBarMenuItem mapTypeButton;
    private IMapsProvider.IMapView mapView;
    private FrameLayout mapViewClip;
    private boolean mapsInitialized;
    private Runnable markAsReadRunnable;
    private View markerImageView;
    private int markerTop;
    private MessageObject messageObject;
    private IMapsProvider.ICameraUpdate moveToBounds;
    private Location myLocation;
    private boolean onResumeCalled;
    private ActionBarMenuItem otherItem;
    private MapOverlayView overlayView;
    private ChatActivity parentFragment;
    private ActionBarPopupWindow popupWindow;
    private double previousRadius;
    private boolean proximityAnimationInProgress;
    private ImageView proximityButton;
    private IMapsProvider.ICircle proximityCircle;
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
    private int overScrollHeight = (AndroidUtilities.displaySize.x - C1133ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.m35dp(66.0f);
    private Bitmap[] bitmapCache = new Bitmap[7];

    public static class LiveLocation {
        public TLRPC$Chat chat;
        public IMapsProvider.IMarker directionMarker;
        public boolean hasRotation;
        public long f1166id;
        public IMapsProvider.IMarker marker;
        public TLRPC$Message object;
        public TLRPC$User user;
    }

    public interface LocationActivityDelegate {
        void didSelectLocation(TLRPC$MessageMedia tLRPC$MessageMedia, int i, boolean z, int i2);
    }

    public static class VenueLocation {
        public IMapsProvider.IMarker marker;
        public int num;
        public TLRPC$TL_messageMediaVenue venue;
    }

    public static boolean lambda$createView$7(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override
    public boolean hasForceLightStatusBar() {
        return true;
    }

    @Override
    public boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    static float access$3116(LocationActivity locationActivity, float f) {
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
        private HashMap<IMapsProvider.IMarker, View> views;

        public MapOverlayView(Context context) {
            super(context);
            LocationActivity.this = r1;
            this.views = new HashMap<>();
        }

        public void addInfoView(IMapsProvider.IMarker iMarker) {
            final VenueLocation venueLocation = (VenueLocation) iMarker.getTag();
            if (venueLocation == null || LocationActivity.this.lastPressedVenue == venueLocation) {
                return;
            }
            LocationActivity.this.showSearchPlacesButton(false);
            if (LocationActivity.this.lastPressedMarker != null) {
                removeInfoView(LocationActivity.this.lastPressedMarker);
                LocationActivity.this.lastPressedMarker = null;
            }
            LocationActivity.this.lastPressedVenue = venueLocation;
            LocationActivity.this.lastPressedMarker = iMarker;
            Context context = getContext();
            FrameLayout frameLayout = new FrameLayout(context);
            addView(frameLayout, LayoutHelper.createFrame(-2, 114.0f));
            LocationActivity.this.lastPressedMarkerView = new FrameLayout(context);
            LocationActivity.this.lastPressedMarkerView.setBackgroundResource(C1072R.C1073drawable.venue_tooltip);
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
            textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            textView.setGravity(LocaleController.isRTL ? 5 : 3);
            LocationActivity.this.lastPressedMarkerView.addView(textView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setMaxLines(1);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setSingleLine(true);
            textView2.setTextColor(Theme.getColor("windowBackgroundWhiteGrayText3"));
            textView2.setGravity(LocaleController.isRTL ? 5 : 3);
            LocationActivity.this.lastPressedMarkerView.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
            textView.setText(venueLocation.venue.title);
            textView2.setText(LocaleController.getString("TapToSendLocation", C1072R.string.TapToSendLocation));
            final FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setBackground(Theme.createCircleDrawable(AndroidUtilities.m35dp(36.0f), LocationCell.getColorForIndex(venueLocation.num)));
            frameLayout.addView(frameLayout2, LayoutHelper.createFrame(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
            BackupImageView backupImageView = new BackupImageView(context);
            backupImageView.setImage("https://ss3.4sqi.net/img/categories_v2/" + venueLocation.venue.venue_type + "_64.png", null, null);
            frameLayout2.addView(backupImageView, LayoutHelper.createFrame(30, 30, 17));
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                private final float[] animatorValues = {0.0f, 1.0f};
                private boolean startedInner;

                @Override
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float interpolation;
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
                        interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(lerp / 0.5f) * 1.1f;
                    } else if (lerp <= 0.75f) {
                        interpolation = 1.1f - (CubicBezierInterpolator.EASE_OUT.getInterpolation((lerp - 0.5f) / 0.25f) * 0.2f);
                    } else {
                        interpolation = (CubicBezierInterpolator.EASE_OUT.getInterpolation((lerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
                    }
                    frameLayout2.setScaleX(interpolation);
                    frameLayout2.setScaleY(interpolation);
                }
            });
            ofFloat.setDuration(360L);
            ofFloat.start();
            this.views.put(iMarker, frameLayout);
            LocationActivity.this.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
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

        public void removeInfoView(IMapsProvider.IMarker iMarker) {
            View view = this.views.get(iMarker);
            if (view != null) {
                removeView(view);
                this.views.remove(iMarker);
            }
        }

        public void updatePositions() {
            if (LocationActivity.this.map == null) {
                return;
            }
            IMapsProvider.IProjection projection = LocationActivity.this.map.getProjection();
            for (Map.Entry<IMapsProvider.IMarker, View> entry : this.views.entrySet()) {
                View value = entry.getValue();
                Point screenLocation = projection.toScreenLocation(entry.getKey().getPosition());
                value.setTranslationX(screenLocation.x - (value.getMeasuredWidth() / 2));
                value.setTranslationY((screenLocation.y - value.getMeasuredHeight()) + AndroidUtilities.m35dp(22.0f));
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
            IMapsProvider.IMap iMap = this.map;
            if (iMap != null) {
                iMap.setMyLocationEnabled(false);
            }
        } catch (Exception e) {
            FileLog.m31e(e);
        }
        try {
            IMapsProvider.IMapView iMapView = this.mapView;
            if (iMapView != null) {
                iMapView.onDestroy();
            }
        } catch (Exception e2) {
            FileLog.m31e(e2);
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
    public View createView(final Context context) {
        FrameLayout.LayoutParams layoutParams;
        String str;
        String str2;
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
        this.actionBar.setBackButtonImage(C1072R.C1073drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        if (AndroidUtilities.isTablet()) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new C1133ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i3) {
                if (i3 == -1) {
                    LocationActivity.this.finishFragment();
                } else if (i3 != 1) {
                    if (i3 == 5) {
                        LocationActivity.this.openShareLiveLocation(0);
                    } else if (i3 == 6) {
                        LocationActivity.this.openDirections(null);
                    }
                } else {
                    try {
                        double d = LocationActivity.this.messageObject.messageOwner.media.geo.lat;
                        double d2 = LocationActivity.this.messageObject.messageOwner.media.geo._long;
                        Activity parentActivity = LocationActivity.this.getParentActivity();
                        parentActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                    } catch (Exception e) {
                        FileLog.m31e(e);
                    }
                }
            }
        });
        ActionBarMenu createMenu = this.actionBar.createMenu();
        if (this.chatLocation != null) {
            this.actionBar.setTitle(LocaleController.getString("ChatLocation", C1072R.string.ChatLocation));
        } else {
            MessageObject messageObject = this.messageObject;
            if (messageObject != null) {
                if (messageObject.isLiveLocation()) {
                    this.actionBar.setTitle(LocaleController.getString("AttachLiveLocation", C1072R.string.AttachLiveLocation));
                    ActionBarMenuItem addItem = createMenu.addItem(0, C1072R.C1073drawable.ic_ab_other);
                    this.otherItem = addItem;
                    addItem.addSubItem(6, C1072R.C1073drawable.navigate, LocaleController.getString("GetDirections", C1072R.string.GetDirections));
                } else {
                    String str3 = this.messageObject.messageOwner.media.title;
                    if (str3 != null && str3.length() > 0) {
                        this.actionBar.setTitle(LocaleController.getString("SharedPlace", C1072R.string.SharedPlace));
                    } else {
                        this.actionBar.setTitle(LocaleController.getString("ChatLocation", C1072R.string.ChatLocation));
                    }
                    ActionBarMenuItem addItem2 = createMenu.addItem(0, C1072R.C1073drawable.ic_ab_other);
                    this.otherItem = addItem2;
                    addItem2.addSubItem(1, C1072R.C1073drawable.msg_openin, LocaleController.getString("OpenInExternalApp", C1072R.string.OpenInExternalApp));
                    if (!getLocationController().isSharingLocation(this.dialogId)) {
                        this.otherItem.addSubItem(5, C1072R.C1073drawable.msg_location, LocaleController.getString("SendLiveLocationMenu", C1072R.string.SendLiveLocationMenu));
                    }
                    this.otherItem.setContentDescription(LocaleController.getString("AccDescrMoreOptions", C1072R.string.AccDescrMoreOptions));
                }
            } else {
                this.actionBar.setTitle(LocaleController.getString("ShareLocation", C1072R.string.ShareLocation));
                if (this.locationType != 4) {
                    this.overlayView = new MapOverlayView(context);
                    ActionBarMenuItem actionBarMenuItemSearchListener = createMenu.addItem(0, C1072R.C1073drawable.ic_ab_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
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
                            if (LocationActivity.this.searchAdapter == null) {
                                return;
                            }
                            String obj = editText.getText().toString();
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
                                locationActivity.searchInProgress = locationActivity.searchAdapter.getItemCount() == 0;
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
                    });
                    this.searchItem = actionBarMenuItemSearchListener;
                    int i3 = C1072R.string.Search;
                    actionBarMenuItemSearchListener.setSearchFieldHint(LocaleController.getString("Search", i3));
                    this.searchItem.setContentDescription(LocaleController.getString("Search", i3));
                    EditTextBoldCursor searchField = this.searchItem.getSearchField();
                    searchField.setTextColor(Theme.getColor("dialogTextBlack"));
                    searchField.setCursorColor(Theme.getColor("dialogTextBlack"));
                    searchField.setHintTextColor(Theme.getColor("chat_messagePanelHint"));
                }
            }
        }
        FrameLayout frameLayout = new FrameLayout(context) {
            private boolean first = true;

            @Override
            protected void onLayout(boolean z, int i4, int i5, int i6, int i7) {
                super.onLayout(z, i4, i5, i6, i7);
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
        Drawable mutate = context.getResources().getDrawable(C1072R.C1073drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor("dialogBackground"), PorterDuff.Mode.MULTIPLY));
        final Rect rect = new Rect();
        this.shadowDrawable.getPadding(rect);
        int i4 = this.locationType;
        if (i4 == 0 || i4 == 1) {
            layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.m35dp(21.0f) + rect.top);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.m35dp(6.0f) + rect.top);
        }
        FrameLayout.LayoutParams layoutParams2 = layoutParams;
        layoutParams2.gravity = 83;
        FrameLayout frameLayout3 = new FrameLayout(context) {
            @Override
            protected void onMeasure(int i5, int i6) {
                super.onMeasure(i5, i6);
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
            searchButton.setTranslationX(-AndroidUtilities.m35dp(80.0f));
            Drawable createSimpleSelectorRoundRectDrawable = Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.m35dp(40.0f), Theme.getColor("location_actionBackground"), Theme.getColor("location_actionPressedBackground"));
            if (i2 < 21) {
                Drawable mutate2 = context.getResources().getDrawable(C1072R.C1073drawable.places_btn).mutate();
                mutate2.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
                CombinedDrawable combinedDrawable = new CombinedDrawable(mutate2, createSimpleSelectorRoundRectDrawable, AndroidUtilities.m35dp(2.0f), AndroidUtilities.m35dp(2.0f));
                combinedDrawable.setFullsize(true);
                createSimpleSelectorRoundRectDrawable = combinedDrawable;
            } else {
                StateListAnimator stateListAnimator = new StateListAnimator();
                SearchButton searchButton2 = this.searchAreaButton;
                Property property = View.TRANSLATION_Z;
                stateListAnimator.addState(new int[]{16842919}, ObjectAnimator.ofFloat(searchButton2, property, AndroidUtilities.m35dp(2.0f), AndroidUtilities.m35dp(4.0f)).setDuration(200L));
                stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(this.searchAreaButton, property, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(2.0f)).setDuration(200L));
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
            this.searchAreaButton.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            this.searchAreaButton.setText(LocaleController.getString("PlacesInThisArea", C1072R.string.PlacesInThisArea));
            this.searchAreaButton.setGravity(17);
            this.searchAreaButton.setPadding(AndroidUtilities.m35dp(20.0f), 0, AndroidUtilities.m35dp(20.0f), 0);
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
        this.mapTypeButton.setAdditionalXOffset(AndroidUtilities.m35dp(10.0f));
        this.mapTypeButton.setAdditionalYOffset(-AndroidUtilities.m35dp(10.0f));
        this.mapTypeButton.addSubItem(2, C1072R.C1073drawable.msg_map, LocaleController.getString("Map", C1072R.string.Map));
        this.mapTypeButton.addSubItem(3, C1072R.C1073drawable.msg_satellite, LocaleController.getString("Satellite", C1072R.string.Satellite));
        this.mapTypeButton.addSubItem(4, C1072R.C1073drawable.msg_hybrid, LocaleController.getString("Hybrid", C1072R.string.Hybrid));
        this.mapTypeButton.setContentDescription(LocaleController.getString("AccDescrMoreOptions", C1072R.string.AccDescrMoreOptions));
        Drawable createSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.m35dp(40.0f), Theme.getColor("location_actionBackground"), Theme.getColor("location_actionPressedBackground"));
        if (i2 < 21) {
            Drawable mutate3 = context.getResources().getDrawable(C1072R.C1073drawable.floating_shadow_profile).mutate();
            mutate3.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            CombinedDrawable combinedDrawable2 = new CombinedDrawable(mutate3, createSimpleSelectorCircleDrawable, 0, 0);
            combinedDrawable2.setIconSize(AndroidUtilities.m35dp(40.0f), AndroidUtilities.m35dp(40.0f));
            createSimpleSelectorCircleDrawable = combinedDrawable2;
            str = "location_actionIcon";
        } else {
            StateListAnimator stateListAnimator2 = new StateListAnimator();
            ActionBarMenuItem actionBarMenuItem2 = this.mapTypeButton;
            Property property2 = View.TRANSLATION_Z;
            str = "location_actionIcon";
            stateListAnimator2.addState(new int[]{16842919}, ObjectAnimator.ofFloat(actionBarMenuItem2, property2, AndroidUtilities.m35dp(2.0f), AndroidUtilities.m35dp(4.0f)).setDuration(200L));
            stateListAnimator2.addState(new int[0], ObjectAnimator.ofFloat(this.mapTypeButton, property2, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(2.0f)).setDuration(200L));
            this.mapTypeButton.setStateListAnimator(stateListAnimator2);
            this.mapTypeButton.setOutlineProvider(new ViewOutlineProvider(this) {
                @Override
                @SuppressLint({"NewApi"})
                public void getOutline(View view, Outline outline) {
                    outline.setOval(0, 0, AndroidUtilities.m35dp(40.0f), AndroidUtilities.m35dp(40.0f));
                }
            });
        }
        this.mapTypeButton.setBackgroundDrawable(createSimpleSelectorCircleDrawable);
        this.mapTypeButton.setIcon(C1072R.C1073drawable.msg_map_type);
        this.mapViewClip.addView(this.mapTypeButton, LayoutHelper.createFrame(i2 >= 21 ? 40 : 44, i2 >= 21 ? 40.0f : 44.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        this.mapTypeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                LocationActivity.this.lambda$createView$1(view);
            }
        });
        this.mapTypeButton.setDelegate(new ActionBarMenuItem.ActionBarMenuItemDelegate() {
            @Override
            public final void onItemClick(int i5) {
                LocationActivity.this.lambda$createView$2(i5);
            }
        });
        this.locationButton = new ImageView(context);
        Drawable createSimpleSelectorCircleDrawable2 = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.m35dp(40.0f), Theme.getColor("location_actionBackground"), Theme.getColor("location_actionPressedBackground"));
        if (i2 < 21) {
            Drawable mutate4 = context.getResources().getDrawable(C1072R.C1073drawable.floating_shadow_profile).mutate();
            mutate4.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            CombinedDrawable combinedDrawable3 = new CombinedDrawable(mutate4, createSimpleSelectorCircleDrawable2, 0, 0);
            combinedDrawable3.setIconSize(AndroidUtilities.m35dp(40.0f), AndroidUtilities.m35dp(40.0f));
            createSimpleSelectorCircleDrawable2 = combinedDrawable3;
            str2 = "location_actionPressedBackground";
        } else {
            StateListAnimator stateListAnimator3 = new StateListAnimator();
            ImageView imageView = this.locationButton;
            Property property3 = View.TRANSLATION_Z;
            str2 = "location_actionPressedBackground";
            stateListAnimator3.addState(new int[]{16842919}, ObjectAnimator.ofFloat(imageView, property3, AndroidUtilities.m35dp(2.0f), AndroidUtilities.m35dp(4.0f)).setDuration(200L));
            stateListAnimator3.addState(new int[0], ObjectAnimator.ofFloat(this.locationButton, property3, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(2.0f)).setDuration(200L));
            this.locationButton.setStateListAnimator(stateListAnimator3);
            this.locationButton.setOutlineProvider(new ViewOutlineProvider(this) {
                @Override
                @SuppressLint({"NewApi"})
                public void getOutline(View view, Outline outline) {
                    outline.setOval(0, 0, AndroidUtilities.m35dp(40.0f), AndroidUtilities.m35dp(40.0f));
                }
            });
        }
        this.locationButton.setBackgroundDrawable(createSimpleSelectorCircleDrawable2);
        this.locationButton.setImageResource(C1072R.C1073drawable.msg_current_location);
        this.locationButton.setScaleType(ImageView.ScaleType.CENTER);
        this.locationButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor("location_actionActiveIcon"), PorterDuff.Mode.MULTIPLY));
        this.locationButton.setTag("location_actionActiveIcon");
        this.locationButton.setContentDescription(LocaleController.getString("AccDescrMyLocation", C1072R.string.AccDescrMyLocation));
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
        Drawable createSimpleSelectorCircleDrawable3 = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.m35dp(40.0f), Theme.getColor("location_actionBackground"), Theme.getColor(str2));
        if (i2 < 21) {
            Drawable mutate5 = context.getResources().getDrawable(C1072R.C1073drawable.floating_shadow_profile).mutate();
            mutate5.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.MULTIPLY));
            CombinedDrawable combinedDrawable4 = new CombinedDrawable(mutate5, createSimpleSelectorCircleDrawable3, 0, 0);
            combinedDrawable4.setIconSize(AndroidUtilities.m35dp(40.0f), AndroidUtilities.m35dp(40.0f));
            createSimpleSelectorCircleDrawable3 = combinedDrawable4;
        } else {
            StateListAnimator stateListAnimator4 = new StateListAnimator();
            ImageView imageView2 = this.proximityButton;
            Property property4 = View.TRANSLATION_Z;
            stateListAnimator4.addState(new int[]{16842919}, ObjectAnimator.ofFloat(imageView2, property4, AndroidUtilities.m35dp(2.0f), AndroidUtilities.m35dp(4.0f)).setDuration(200L));
            stateListAnimator4.addState(new int[0], ObjectAnimator.ofFloat(this.proximityButton, property4, AndroidUtilities.m35dp(4.0f), AndroidUtilities.m35dp(2.0f)).setDuration(200L));
            this.proximityButton.setStateListAnimator(stateListAnimator4);
            this.proximityButton.setOutlineProvider(new ViewOutlineProvider(this) {
                @Override
                @SuppressLint({"NewApi"})
                public void getOutline(View view, Outline outline) {
                    outline.setOval(0, 0, AndroidUtilities.m35dp(40.0f), AndroidUtilities.m35dp(40.0f));
                }
            });
        }
        this.proximityButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor(str), PorterDuff.Mode.MULTIPLY));
        this.proximityButton.setBackgroundDrawable(createSimpleSelectorCircleDrawable3);
        this.proximityButton.setScaleType(ImageView.ScaleType.CENTER);
        this.proximityButton.setContentDescription(LocaleController.getString("AccDescrLocationNotify", C1072R.string.AccDescrLocationNotify));
        this.mapViewClip.addView(this.proximityButton, LayoutHelper.createFrame(i2 >= 21 ? 40 : 44, i2 >= 21 ? 40.0f : 44.0f, 53, 0.0f, 62.0f, 12.0f, 0.0f));
        this.proximityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                LocationActivity.this.lambda$createView$6(view);
            }
        });
        TLRPC$Chat chat = DialogObject.isChatDialog(this.dialogId) ? getMessagesController().getChat(Long.valueOf(-this.dialogId)) : null;
        MessageObject messageObject2 = this.messageObject;
        if (messageObject2 == null || !messageObject2.isLiveLocation() || this.messageObject.isExpiredLiveLocation(getConnectionsManager().getCurrentTime()) || (ChatObject.isChannel(chat) && !chat.megagroup)) {
            this.proximityButton.setVisibility(8);
            this.proximityButton.setImageResource(C1072R.C1073drawable.msg_location_alert);
        } else {
            LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.dialogId);
            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                this.proximityButton.setImageResource(C1072R.C1073drawable.msg_location_alert2);
            } else {
                if (DialogObject.isUserDialog(this.dialogId) && this.messageObject.getFromChatId() == getUserConfig().getClientUserId()) {
                    this.proximityButton.setVisibility(4);
                    this.proximityButton.setAlpha(0.0f);
                    this.proximityButton.setScaleX(0.4f);
                    this.proximityButton.setScaleY(0.4f);
                }
                this.proximityButton.setImageResource(C1072R.C1073drawable.msg_location_alert);
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
        this.emptyView.setPadding(0, AndroidUtilities.m35dp(160.0f), 0, 0);
        this.emptyView.setVisibility(8);
        frameLayout2.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f));
        this.emptyView.setOnTouchListener(LocationActivity$$ExternalSyntheticLambda9.INSTANCE);
        ImageView imageView3 = new ImageView(context);
        this.emptyImageView = imageView3;
        imageView3.setImageResource(C1072R.C1073drawable.location_empty);
        this.emptyImageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor("dialogEmptyImage"), PorterDuff.Mode.MULTIPLY));
        this.emptyView.addView(this.emptyImageView, LayoutHelper.createLinear(-2, -2));
        TextView textView = new TextView(context);
        this.emptyTitleTextView = textView;
        textView.setTextColor(Theme.getColor("dialogEmptyText"));
        this.emptyTitleTextView.setGravity(17);
        this.emptyTitleTextView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        this.emptyTitleTextView.setTextSize(1, 17.0f);
        this.emptyTitleTextView.setText(LocaleController.getString("NoPlacesFound", C1072R.string.NoPlacesFound));
        this.emptyView.addView(this.emptyTitleTextView, LayoutHelper.createLinear(-2, -2, 17, 0, 11, 0, 0));
        TextView textView2 = new TextView(context);
        this.emptySubtitleTextView = textView2;
        textView2.setTextColor(Theme.getColor("dialogEmptyText"));
        this.emptySubtitleTextView.setGravity(17);
        this.emptySubtitleTextView.setTextSize(1, 15.0f);
        this.emptySubtitleTextView.setPadding(AndroidUtilities.m35dp(40.0f), 0, AndroidUtilities.m35dp(40.0f), 0);
        this.emptyView.addView(this.emptySubtitleTextView, LayoutHelper.createLinear(-2, -2, 17, 0, 6, 0, 0));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        LocationActivityAdapter locationActivityAdapter2 = new LocationActivityAdapter(context, this.locationType, this.dialogId, false, null) {
            @Override
            protected void onDirectionClick() {
                LocationActivity.this.openDirections(null);
            }

            @Override
            public void setLiveLocations(ArrayList<LiveLocation> arrayList) {
                int i5;
                if (LocationActivity.this.messageObject != null && LocationActivity.this.messageObject.isLiveLocation()) {
                    if (arrayList != null) {
                        i5 = 0;
                        for (int i6 = 0; i6 < arrayList.size(); i6++) {
                            LiveLocation liveLocation = arrayList.get(i6);
                            if (liveLocation != null && !UserObject.isUserSelf(liveLocation.user)) {
                                i5++;
                            }
                        }
                    } else {
                        i5 = 0;
                    }
                    LocationActivity.this.otherItem.setVisibility(i5 != 1 ? 8 : 0);
                }
                super.setLiveLocations(arrayList);
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
            public void onScrollStateChanged(RecyclerView recyclerView, int i5) {
                LocationActivity.this.scrolling = i5 != 0;
                if (LocationActivity.this.scrolling || LocationActivity.this.forceUpdate == null) {
                    return;
                }
                LocationActivity.this.forceUpdate = null;
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i5, int i6) {
                LocationActivity.this.updateClipView(false);
                if (LocationActivity.this.forceUpdate != null) {
                    LocationActivity.access$3116(LocationActivity.this, i6);
                }
            }
        });
        ((DefaultItemAnimator) this.listView.getItemAnimator()).setDelayAnimations(false);
        this.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i5) {
                boolean lambda$createView$10;
                lambda$createView$10 = LocationActivity.this.lambda$createView$10(context, view, i5);
                return lambda$createView$10;
            }
        });
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i5) {
                LocationActivity.this.lambda$createView$16(view, i5);
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
        IMapsProvider.IMapView onCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.mapView = onCreateMapView;
        onCreateMapView.setOnDispatchTouchEventInterceptor(new IMapsProvider.ITouchInterceptor() {
            @Override
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
                boolean lambda$createView$17;
                lambda$createView$17 = LocationActivity.this.lambda$createView$17(motionEvent, iCallableMethod);
                return lambda$createView$17;
            }
        });
        this.mapView.setOnInterceptTouchEventInterceptor(new IMapsProvider.ITouchInterceptor() {
            @Override
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
                boolean lambda$createView$18;
                lambda$createView$18 = LocationActivity.this.lambda$createView$18(motionEvent, iCallableMethod);
                return lambda$createView$18;
            }
        });
        this.mapView.setOnLayoutListener(new Runnable() {
            @Override
            public final void run() {
                LocationActivity.this.lambda$createView$20();
            }
        });
        final IMapsProvider.IMapView iMapView = this.mapView;
        new Thread(new Runnable() {
            @Override
            public final void run() {
                LocationActivity.this.lambda$createView$23(iMapView);
            }
        }).start();
        MessageObject messageObject3 = this.messageObject;
        if (messageObject3 == null && this.chatLocation == null) {
            if (chat != null && this.locationType == 4 && this.dialogId != 0) {
                FrameLayout frameLayout4 = new FrameLayout(context);
                frameLayout4.setBackgroundResource(C1072R.C1073drawable.livepin);
                this.mapViewClip.addView(frameLayout4, LayoutHelper.createFrame(62, 76, 49));
                BackupImageView backupImageView = new BackupImageView(context);
                backupImageView.setRoundRadius(AndroidUtilities.m35dp(26.0f));
                backupImageView.setForUserOrChat(chat, new AvatarDrawable(chat));
                frameLayout4.addView(backupImageView, LayoutHelper.createFrame(52, 52.0f, 51, 5.0f, 5.0f, 0.0f, 0.0f));
                this.markerImageView = frameLayout4;
                frameLayout4.setTag(1);
            }
            if (this.markerImageView == null) {
                ImageView imageView4 = new ImageView(context);
                imageView4.setImageResource(C1072R.C1073drawable.map_pin2);
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
                        LocationActivity.this.emptySubtitleTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", C1072R.string.NoPlacesFoundInfo, LocationActivity.this.searchAdapter.getLastSearchString())));
                    }
                    super.notifyDataSetChanged();
                }
            };
            this.searchAdapter = locationActivitySearchAdapter2;
            locationActivitySearchAdapter2.setDelegate(0L, new BaseLocationAdapter.BaseLocationAdapterDelegate() {
                @Override
                public final void didLoadSearchResult(ArrayList arrayList) {
                    LocationActivity.this.lambda$createView$24(arrayList);
                }
            });
            frameLayout2.addView(this.searchListView, LayoutHelper.createFrame(-1, -1, 51));
            this.searchListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrollStateChanged(RecyclerView recyclerView, int i5) {
                    if (i5 == 1 && LocationActivity.this.searching && LocationActivity.this.searchWas) {
                        AndroidUtilities.hideKeyboard(LocationActivity.this.getParentActivity().getCurrentFocus());
                    }
                }
            });
            this.searchListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(View view, int i5) {
                    LocationActivity.this.lambda$createView$26(view, i5);
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
        for (int i5 = 0; i5 < 2; i5++) {
            this.undoView[i5] = new UndoView(context);
            this.undoView[i5].setAdditionalTranslationY(AndroidUtilities.m35dp(10.0f));
            if (Build.VERSION.SDK_INT >= 21) {
                this.undoView[i5].setTranslationZ(AndroidUtilities.m35dp(5.0f));
            }
            this.mapViewClip.addView(this.undoView[i5], LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        View view = new View(context) {
            private RectF rect = new RectF();

            @Override
            protected void onDraw(Canvas canvas) {
                LocationActivity.this.shadowDrawable.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
                LocationActivity.this.shadowDrawable.draw(canvas);
                if (LocationActivity.this.locationType == 0 || LocationActivity.this.locationType == 1) {
                    int m35dp = AndroidUtilities.m35dp(36.0f);
                    int m35dp2 = rect.top + AndroidUtilities.m35dp(10.0f);
                    this.rect.set((getMeasuredWidth() - m35dp) / 2, m35dp2, (getMeasuredWidth() + m35dp) / 2, m35dp2 + AndroidUtilities.m35dp(4.0f));
                    int color = Theme.getColor("key_sheet_scrollUp");
                    Color.alpha(color);
                    Theme.dialogs_onlineCirclePaint.setColor(color);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.m35dp(2.0f), AndroidUtilities.m35dp(2.0f), Theme.dialogs_onlineCirclePaint);
                }
            }
        };
        this.shadow = view;
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTranslationZ(AndroidUtilities.m35dp(6.0f));
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
        IMapsProvider.IMap iMap = this.map;
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

    public void lambda$createView$3(View view) {
        IMapsProvider.IMap iMap;
        Activity parentActivity;
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            showPermissionAlert(false);
        } else if (checkGpsEnabled()) {
            if (this.messageObject != null || this.chatLocation != null) {
                if (this.myLocation != null && (iMap = this.map) != null) {
                    iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(this.myLocation.getLatitude(), this.myLocation.getLongitude()), this.map.getMaxZoomLevel() - 4.0f));
                }
            } else if (this.myLocation != null && this.map != null) {
                this.locationButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor("location_actionActiveIcon"), PorterDuff.Mode.MULTIPLY));
                this.locationButton.setTag("location_actionActiveIcon");
                this.adapter.setCustomLocation(null);
                this.userLocationMoved = false;
                showSearchPlacesButton(false);
                this.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(this.myLocation.getLatitude(), this.myLocation.getLongitude())));
                if (this.searchedForCustomLocations) {
                    Location location = this.myLocation;
                    if (location != null) {
                        this.adapter.searchPlacesWithQuery(null, location, true, true);
                    }
                    this.searchedForCustomLocations = false;
                    showResults();
                }
            }
            removeInfoView();
        }
    }

    public void lambda$createView$6(View view) {
        if (getParentActivity() == null || this.myLocation == null || !checkGpsEnabled() || this.map == null) {
            return;
        }
        HintView hintView = this.hintView;
        if (hintView != null) {
            hintView.hide();
        }
        MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
        final LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.dialogId);
        if (this.canUndo) {
            this.undoView[0].hide(true, 1);
        }
        if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
            this.proximityButton.setImageResource(C1072R.C1073drawable.msg_location_alert);
            IMapsProvider.ICircle iCircle = this.proximityCircle;
            if (iCircle != null) {
                iCircle.remove();
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
            return;
        }
        openProximityAlert();
    }

    public void lambda$createView$4() {
        getLocationController().setProximityLocation(this.dialogId, 0, true);
        this.canUndo = false;
    }

    public void lambda$createView$5(LocationController.SharingLocationInfo sharingLocationInfo) {
        this.proximityButton.setImageResource(C1072R.C1073drawable.msg_location_alert2);
        createCircle(sharingLocationInfo.proximityMeters);
        this.canUndo = false;
    }

    public void lambda$createView$8() {
        updateClipView(false);
    }

    public boolean lambda$createView$10(Context context, View view, int i) {
        if (this.locationType == 2) {
            Object item = this.adapter.getItem(i);
            if (item instanceof LiveLocation) {
                final LiveLocation liveLocation = (LiveLocation) item;
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(context);
                ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem((Context) getParentActivity(), true, true, getResourceProvider());
                actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.m35dp(200.0f));
                actionBarMenuSubItem.setTextAndIcon(LocaleController.getString("GetDirections", C1072R.string.GetDirections), C1072R.C1073drawable.navigate);
                actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        LocationActivity.this.lambda$createView$9(liveLocation, view2);
                    }
                });
                actionBarPopupWindowLayout.addView(actionBarMenuSubItem);
                ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout, -2, -2) {
                    @Override
                    public void dismiss() {
                        super.dismiss();
                        LocationActivity.this.popupWindow = null;
                    }
                };
                this.popupWindow = actionBarPopupWindow;
                actionBarPopupWindow.setOutsideTouchable(true);
                this.popupWindow.setClippingEnabled(true);
                this.popupWindow.setInputMethodMode(2);
                this.popupWindow.setSoftInputMode(0);
                int[] iArr = new int[2];
                view.getLocationInWindow(iArr);
                this.popupWindow.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.m35dp(52.0f));
                this.popupWindow.dimBehind();
                return true;
            }
        }
        return false;
    }

    public void lambda$createView$9(LiveLocation liveLocation, View view) {
        openDirections(liveLocation);
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.dismiss();
        }
    }

    public void lambda$createView$16(View view, int i) {
        MessageObject messageObject;
        final TLRPC$TL_messageMediaVenue tLRPC$TL_messageMediaVenue;
        int i2 = this.locationType;
        if (i2 == 4) {
            if (i != 1 || (tLRPC$TL_messageMediaVenue = (TLRPC$TL_messageMediaVenue) this.adapter.getItem(i)) == null) {
                return;
            }
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
                    LocationActivity.this.lambda$createView$12(alertDialogArr, tLRPC$TL_messageMediaVenue, tLObject, tLRPC$TL_error);
                }
            });
            alertDialogArr[0].setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    LocationActivity.this.lambda$createView$13(sendRequest, dialogInterface);
                }
            });
            showDialog(alertDialogArr[0]);
        } else if (i2 == 5) {
            IMapsProvider.IMap iMap = this.map;
            if (iMap != null) {
                IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                TLRPC$GeoPoint tLRPC$GeoPoint2 = this.chatLocation.geo_point;
                iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(tLRPC$GeoPoint2.lat, tLRPC$GeoPoint2._long), this.map.getMaxZoomLevel() - 4.0f));
            }
        } else if (i == 1 && (messageObject = this.messageObject) != null && (!messageObject.isLiveLocation() || this.locationType == 6)) {
            IMapsProvider.IMap iMap2 = this.map;
            if (iMap2 != null) {
                IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                TLRPC$GeoPoint tLRPC$GeoPoint3 = this.messageObject.messageOwner.media.geo;
                iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(tLRPC$GeoPoint3.lat, tLRPC$GeoPoint3._long), this.map.getMaxZoomLevel() - 4.0f));
            }
        } else if (i == 1 && this.locationType != 2) {
            if (this.delegate == null || this.userLocation == null) {
                return;
            }
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
            ChatActivity chatActivity = this.parentFragment;
            if (chatActivity != null && chatActivity.isInScheduleMode()) {
                AlertsCreator.createScheduleDatePickerDialog(getParentActivity(), this.parentFragment.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                    @Override
                    public final void didSelectDate(boolean z, int i3) {
                        LocationActivity.this.lambda$createView$14(tLRPC$TL_messageMediaGeo, z, i3);
                    }
                });
                return;
            }
            this.delegate.didSelectLocation(tLRPC$TL_messageMediaGeo, this.locationType, true, 0);
            finishFragment();
        } else if ((i == 2 && this.locationType == 1) || ((i == 1 && this.locationType == 2) || (i == 3 && this.locationType == 3))) {
            if (getLocationController().isSharingLocation(this.dialogId)) {
                getLocationController().removeSharingLocation(this.dialogId);
                finishFragment();
                return;
            }
            openShareLiveLocation(0);
        } else {
            final Object item = this.adapter.getItem(i);
            if (item instanceof TLRPC$TL_messageMediaVenue) {
                ChatActivity chatActivity2 = this.parentFragment;
                if (chatActivity2 != null && chatActivity2.isInScheduleMode()) {
                    AlertsCreator.createScheduleDatePickerDialog(getParentActivity(), this.parentFragment.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                        @Override
                        public final void didSelectDate(boolean z, int i3) {
                            LocationActivity.this.lambda$createView$15(item, z, i3);
                        }
                    });
                    return;
                }
                this.delegate.didSelectLocation((TLRPC$TL_messageMediaVenue) item, this.locationType, true, 0);
                finishFragment();
            } else if (item instanceof LiveLocation) {
                this.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(((LiveLocation) item).marker.getPosition(), this.map.getMaxZoomLevel() - 4.0f));
            }
        }
    }

    public void lambda$createView$12(final AlertDialog[] alertDialogArr, final TLRPC$TL_messageMediaVenue tLRPC$TL_messageMediaVenue, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LocationActivity.this.lambda$createView$11(alertDialogArr, tLRPC$TL_messageMediaVenue);
            }
        });
    }

    public void lambda$createView$11(AlertDialog[] alertDialogArr, TLRPC$TL_messageMediaVenue tLRPC$TL_messageMediaVenue) {
        try {
            alertDialogArr[0].dismiss();
        } catch (Throwable unused) {
        }
        alertDialogArr[0] = null;
        this.delegate.didSelectLocation(tLRPC$TL_messageMediaVenue, 4, true, 0);
        finishFragment();
    }

    public void lambda$createView$13(int i, DialogInterface dialogInterface) {
        getConnectionsManager().cancelRequest(i, true);
    }

    public void lambda$createView$14(TLRPC$TL_messageMediaGeo tLRPC$TL_messageMediaGeo, boolean z, int i) {
        this.delegate.didSelectLocation(tLRPC$TL_messageMediaGeo, this.locationType, z, i);
        finishFragment();
    }

    public void lambda$createView$15(Object obj, boolean z, int i) {
        this.delegate.didSelectLocation((TLRPC$TL_messageMediaVenue) obj, this.locationType, z, i);
        finishFragment();
    }

    public boolean lambda$createView$17(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        if (this.yOffset != 0.0f) {
            motionEvent = MotionEvent.obtain(motionEvent);
            motionEvent.offsetLocation(0.0f, (-this.yOffset) / 2.0f);
            motionEvent2 = motionEvent;
        } else {
            motionEvent2 = null;
        }
        boolean booleanValue = ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        return booleanValue;
    }

    public boolean lambda$createView$18(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        Location location;
        if (this.messageObject == null && this.chatLocation == null) {
            if (motionEvent.getAction() == 0) {
                AnimatorSet animatorSet = this.animatorSet;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.animatorSet = animatorSet2;
                animatorSet2.setDuration(200L);
                this.animatorSet.playTogether(ObjectAnimator.ofFloat(this.markerImageView, View.TRANSLATION_Y, this.markerTop - AndroidUtilities.m35dp(10.0f)));
                this.animatorSet.start();
            } else if (motionEvent.getAction() == 1) {
                AnimatorSet animatorSet3 = this.animatorSet;
                if (animatorSet3 != null) {
                    animatorSet3.cancel();
                }
                this.yOffset = 0.0f;
                AnimatorSet animatorSet4 = new AnimatorSet();
                this.animatorSet = animatorSet4;
                animatorSet4.setDuration(200L);
                this.animatorSet.playTogether(ObjectAnimator.ofFloat(this.markerImageView, View.TRANSLATION_Y, this.markerTop));
                this.animatorSet.start();
                this.adapter.fetchLocationAddress();
            }
            if (motionEvent.getAction() == 2) {
                if (!this.userLocationMoved) {
                    this.locationButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor("location_actionIcon"), PorterDuff.Mode.MULTIPLY));
                    this.locationButton.setTag("location_actionIcon");
                    this.userLocationMoved = true;
                }
                IMapsProvider.IMap iMap = this.map;
                if (iMap != null && (location = this.userLocation) != null) {
                    location.setLatitude(iMap.getCameraPosition().target.latitude);
                    this.userLocation.setLongitude(this.map.getCameraPosition().target.longitude);
                }
                this.adapter.setCustomLocation(this.userLocation);
            }
        }
        return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
    }

    public void lambda$createView$20() {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LocationActivity.this.lambda$createView$19();
            }
        });
    }

    public void lambda$createView$19() {
        IMapsProvider.ICameraUpdate iCameraUpdate = this.moveToBounds;
        if (iCameraUpdate != null) {
            this.map.moveCamera(iCameraUpdate);
            this.moveToBounds = null;
        }
    }

    public void lambda$createView$23(final IMapsProvider.IMapView iMapView) {
        try {
            iMapView.onCreate(null);
        } catch (Exception unused) {
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LocationActivity.this.lambda$createView$22(iMapView);
            }
        });
    }

    public void lambda$createView$22(IMapsProvider.IMapView iMapView) {
        if (this.mapView == null || getParentActivity() == null) {
            return;
        }
        try {
            iMapView.onCreate(null);
            ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
            this.mapView.getMapAsync(new Consumer() {
                @Override
                public final void accept(Object obj) {
                    LocationActivity.this.lambda$createView$21((IMapsProvider.IMap) obj);
                }
            });
            this.mapsInitialized = true;
            if (this.onResumeCalled) {
                this.mapView.onResume();
            }
        } catch (Exception e) {
            FileLog.m31e(e);
        }
    }

    public void lambda$createView$21(IMapsProvider.IMap iMap) {
        this.map = iMap;
        if (isActiveThemeDark()) {
            this.currentMapStyleDark = true;
            this.map.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, C1072R.raw.mapstyle_night));
        }
        this.map.setPadding(AndroidUtilities.m35dp(70.0f), 0, AndroidUtilities.m35dp(70.0f), AndroidUtilities.m35dp(10.0f));
        onMapInit();
    }

    public void lambda$createView$24(ArrayList arrayList) {
        this.searchInProgress = false;
        updateEmptyView();
    }

    public void lambda$createView$26(View view, int i) {
        final TLRPC$TL_messageMediaVenue item = this.searchAdapter.getItem(i);
        if (item == null || this.delegate == null) {
            return;
        }
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity != null && chatActivity.isInScheduleMode()) {
            AlertsCreator.createScheduleDatePickerDialog(getParentActivity(), this.parentFragment.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                @Override
                public final void didSelectDate(boolean z, int i2) {
                    LocationActivity.this.lambda$createView$25(item, z, i2);
                }
            });
            return;
        }
        this.delegate.didSelectLocation(item, this.locationType, true, 0);
        finishFragment();
    }

    public void lambda$createView$25(TLRPC$TL_messageMediaVenue tLRPC$TL_messageMediaVenue, boolean z, int i) {
        this.delegate.didSelectLocation(tLRPC$TL_messageMediaVenue, this.locationType, z, i);
        finishFragment();
    }

    private boolean isActiveThemeDark() {
        return Theme.getActiveTheme().isDark() || AndroidUtilities.computePerceivedBrightness(Theme.getColor("windowBackgroundWhite")) < 0.721f;
    }

    public void openDirections(LiveLocation liveLocation) {
        double d;
        double d2;
        TLRPC$Message tLRPC$Message;
        if (liveLocation != null && (tLRPC$Message = liveLocation.object) != null) {
            TLRPC$GeoPoint tLRPC$GeoPoint = tLRPC$Message.media.geo;
            d = tLRPC$GeoPoint.lat;
            d2 = tLRPC$GeoPoint._long;
        } else {
            MessageObject messageObject = this.messageObject;
            if (messageObject != null) {
                TLRPC$GeoPoint tLRPC$GeoPoint2 = messageObject.messageOwner.media.geo;
                d = tLRPC$GeoPoint2.lat;
                d2 = tLRPC$GeoPoint2._long;
            } else {
                TLRPC$GeoPoint tLRPC$GeoPoint3 = this.chatLocation.geo_point;
                d = tLRPC$GeoPoint3.lat;
                d2 = tLRPC$GeoPoint3._long;
            }
        }
        String str = BuildVars.isHuaweiStoreApp() ? "mapapp://navigation" : "http://maps.google.com/maps";
        if (this.myLocation != null) {
            try {
                Locale locale = Locale.US;
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(locale, str + "?saddr=%f,%f&daddr=%f,%f", Double.valueOf(this.myLocation.getLatitude()), Double.valueOf(this.myLocation.getLongitude()), Double.valueOf(d), Double.valueOf(d2)))));
                return;
            } catch (Exception e) {
                FileLog.m31e(e);
                return;
            }
        }
        try {
            Locale locale2 = Locale.US;
            getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(locale2, str + "?saddr=&daddr=%f,%f", Double.valueOf(d), Double.valueOf(d2)))));
        } catch (Exception e2) {
            FileLog.m31e(e2);
        }
    }

    public void updateEmptyView() {
        if (this.searching) {
            if (this.searchInProgress) {
                this.searchListView.setEmptyView(null);
                this.emptyView.setVisibility(8);
                this.searchListView.setVisibility(8);
                return;
            }
            this.searchListView.setEmptyView(this.emptyView);
            return;
        }
        this.emptyView.setVisibility(8);
    }

    public void showSearchPlacesButton(boolean z) {
        SearchButton searchButton;
        Location location;
        Location location2;
        if (z && (searchButton = this.searchAreaButton) != null && searchButton.getTag() == null && ((location = this.myLocation) == null || (location2 = this.userLocation) == null || location2.distanceTo(location) < 300.0f)) {
            z = false;
        }
        SearchButton searchButton2 = this.searchAreaButton;
        if (searchButton2 != null) {
            if (!z || searchButton2.getTag() == null) {
                if (z || this.searchAreaButton.getTag() != null) {
                    this.searchAreaButton.setTag(z ? 1 : null);
                    AnimatorSet animatorSet = new AnimatorSet();
                    Animator[] animatorArr = new Animator[1];
                    SearchButton searchButton3 = this.searchAreaButton;
                    Property property = View.TRANSLATION_X;
                    float[] fArr = new float[1];
                    fArr[0] = z ? 0.0f : -AndroidUtilities.m35dp(80.0f);
                    animatorArr[0] = ObjectAnimator.ofFloat(searchButton3, property, fArr);
                    animatorSet.playTogether(animatorArr);
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                    animatorSet.start();
                }
            }
        }
    }

    private Bitmap createUserBitmap(LiveLocation liveLocation) {
        TLRPC$FileLocation tLRPC$FileLocation;
        TLRPC$ChatPhoto tLRPC$ChatPhoto;
        TLRPC$UserProfilePhoto tLRPC$UserProfilePhoto;
        Bitmap bitmap = null;
        try {
            TLRPC$User tLRPC$User = liveLocation.user;
            if (tLRPC$User != null && (tLRPC$UserProfilePhoto = tLRPC$User.photo) != null) {
                tLRPC$FileLocation = tLRPC$UserProfilePhoto.photo_small;
            } else {
                TLRPC$Chat tLRPC$Chat = liveLocation.chat;
                tLRPC$FileLocation = (tLRPC$Chat == null || (tLRPC$ChatPhoto = tLRPC$Chat.photo) == null) ? null : tLRPC$ChatPhoto.photo_small;
            }
            Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.m35dp(62.0f), AndroidUtilities.m35dp(85.0f), Bitmap.Config.ARGB_8888);
            try {
                createBitmap.eraseColor(0);
                Canvas canvas = new Canvas(createBitmap);
                Drawable drawable = ApplicationLoader.applicationContext.getResources().getDrawable(C1072R.C1073drawable.map_pin_photo);
                drawable.setBounds(0, 0, AndroidUtilities.m35dp(62.0f), AndroidUtilities.m35dp(85.0f));
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
                        float m35dp = AndroidUtilities.m35dp(50.0f) / decodeFile.getWidth();
                        matrix.postTranslate(AndroidUtilities.m35dp(6.0f), AndroidUtilities.m35dp(6.0f));
                        matrix.postScale(m35dp, m35dp);
                        paint.setShader(bitmapShader);
                        bitmapShader.setLocalMatrix(matrix);
                        rectF.set(AndroidUtilities.m35dp(6.0f), AndroidUtilities.m35dp(6.0f), AndroidUtilities.m35dp(56.0f), AndroidUtilities.m35dp(56.0f));
                        canvas.drawRoundRect(rectF, AndroidUtilities.m35dp(25.0f), AndroidUtilities.m35dp(25.0f), paint);
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
                    canvas.translate(AndroidUtilities.m35dp(6.0f), AndroidUtilities.m35dp(6.0f));
                    avatarDrawable.setBounds(0, 0, AndroidUtilities.m35dp(50.0f), AndroidUtilities.m35dp(50.0f));
                    avatarDrawable.draw(canvas);
                }
                canvas.restore();
                try {
                    canvas.setBitmap(null);
                    return createBitmap;
                } catch (Exception unused) {
                    return createBitmap;
                }
            } catch (Throwable th) {
                th = th;
                bitmap = createBitmap;
                FileLog.m31e(th);
                return bitmap;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private long getMessageId(TLRPC$Message tLRPC$Message) {
        if (tLRPC$Message.from_id != null) {
            return MessageObject.getFromChatId(tLRPC$Message);
        }
        return MessageObject.getDialogId(tLRPC$Message);
    }

    private void openProximityAlert() {
        IMapsProvider.ICircle iCircle = this.proximityCircle;
        if (iCircle == null) {
            createCircle(500);
        } else {
            this.previousRadius = iCircle.getRadius();
        }
        final TLRPC$User user = DialogObject.isUserDialog(this.dialogId) ? getMessagesController().getUser(Long.valueOf(this.dialogId)) : null;
        ProximitySheet proximitySheet = new ProximitySheet(getParentActivity(), user, new ProximitySheet.onRadiusPickerChange() {
            @Override
            public final boolean run(boolean z, int i) {
                boolean lambda$openProximityAlert$27;
                lambda$openProximityAlert$27 = LocationActivity.this.lambda$openProximityAlert$27(z, i);
                return lambda$openProximityAlert$27;
            }
        }, new ProximitySheet.onRadiusPickerChange() {
            @Override
            public final boolean run(boolean z, int i) {
                boolean lambda$openProximityAlert$29;
                lambda$openProximityAlert$29 = LocationActivity.this.lambda$openProximityAlert$29(user, z, i);
                return lambda$openProximityAlert$29;
            }
        }, new Runnable() {
            @Override
            public final void run() {
                LocationActivity.this.lambda$openProximityAlert$30();
            }
        });
        this.proximitySheet = proximitySheet;
        ((FrameLayout) this.fragmentView).addView(proximitySheet, LayoutHelper.createFrame(-1, -1.0f));
        this.proximitySheet.show();
    }

    public boolean lambda$openProximityAlert$27(boolean z, int i) {
        IMapsProvider.ICircle iCircle = this.proximityCircle;
        if (iCircle != null) {
            iCircle.setRadius(i);
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

    public boolean lambda$openProximityAlert$29(final TLRPC$User tLRPC$User, boolean z, final int i) {
        if (getLocationController().getSharingLocationInfo(this.dialogId) == null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setTitle(LocaleController.getString("ShareLocationAlertTitle", C1072R.string.ShareLocationAlertTitle));
            builder.setMessage(LocaleController.getString("ShareLocationAlertText", C1072R.string.ShareLocationAlertText));
            builder.setPositiveButton(LocaleController.getString("ShareLocationAlertButton", C1072R.string.ShareLocationAlertButton), new DialogInterface.OnClickListener() {
                @Override
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    LocationActivity.this.lambda$openProximityAlert$28(tLRPC$User, i, dialogInterface, i2);
                }
            });
            builder.setNegativeButton(LocaleController.getString("Cancel", C1072R.string.Cancel), null);
            showDialog(builder.create());
            return false;
        }
        this.proximitySheet.setRadiusSet();
        this.proximityButton.setImageResource(C1072R.C1073drawable.msg_location_alert2);
        getUndoView().showWithAction(0L, 24, Integer.valueOf(i), tLRPC$User, (Runnable) null, (Runnable) null);
        getLocationController().setProximityLocation(this.dialogId, i, true);
        return true;
    }

    public void lambda$openProximityAlert$28(TLRPC$User tLRPC$User, int i, DialogInterface dialogInterface, int i2) {
        lambda$openShareLiveLocation$32(tLRPC$User, 900, i);
    }

    public void lambda$openProximityAlert$30() {
        IMapsProvider.IMap iMap = this.map;
        if (iMap != null) {
            iMap.setPadding(AndroidUtilities.m35dp(70.0f), 0, AndroidUtilities.m35dp(70.0f), AndroidUtilities.m35dp(10.0f));
        }
        if (!this.proximitySheet.getRadiusSet()) {
            double d = this.previousRadius;
            if (d > 0.0d) {
                this.proximityCircle.setRadius(d);
            } else {
                IMapsProvider.ICircle iCircle = this.proximityCircle;
                if (iCircle != null) {
                    iCircle.remove();
                    this.proximityCircle = null;
                }
            }
        }
        this.proximitySheet = null;
    }

    public void openShareLiveLocation(final int i) {
        Activity parentActivity;
        if (this.delegate == null || getParentActivity() == null || this.myLocation == null || !checkGpsEnabled()) {
            return;
        }
        if (this.checkBackgroundPermission && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
            this.askWithRadius = i;
            this.checkBackgroundPermission = false;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (Math.abs((System.currentTimeMillis() / 1000) - globalMainSettings.getInt("backgroundloc", 0)) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                AlertsCreator.createBackgroundLocationPermissionDialog(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new Runnable() {
                    @Override
                    public final void run() {
                        LocationActivity.this.lambda$openShareLiveLocation$31();
                    }
                }, null).show();
                return;
            }
        }
        final TLRPC$User user = DialogObject.isUserDialog(this.dialogId) ? getMessagesController().getUser(Long.valueOf(this.dialogId)) : null;
        showDialog(AlertsCreator.createLocationUpdateDialog(getParentActivity(), user, new MessagesStorage.IntCallback() {
            @Override
            public final void run(int i2) {
                LocationActivity.this.lambda$openShareLiveLocation$32(user, i, i2);
            }
        }, null));
    }

    public void lambda$openShareLiveLocation$31() {
        openShareLiveLocation(this.askWithRadius);
    }

    public void lambda$openShareLiveLocation$32(TLRPC$User tLRPC$User, int i, int i2) {
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
            this.proximityButton.setImageResource(C1072R.C1073drawable.msg_location_alert2);
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
            Bitmap createBitmap = Bitmap.createBitmap(AndroidUtilities.m35dp(12.0f), AndroidUtilities.m35dp(12.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            canvas.drawCircle(AndroidUtilities.m35dp(6.0f), AndroidUtilities.m35dp(6.0f), AndroidUtilities.m35dp(6.0f), paint);
            paint.setColor(LocationCell.getColorForIndex(i));
            canvas.drawCircle(AndroidUtilities.m35dp(6.0f), AndroidUtilities.m35dp(6.0f), AndroidUtilities.m35dp(5.0f), paint);
            canvas.setBitmap(null);
            this.bitmapCache[i % 7] = createBitmap;
            return createBitmap;
        } catch (Throwable th) {
            FileLog.m31e(th);
            return null;
        }
    }

    public void updatePlacesMarkers(ArrayList<TLRPC$TL_messageMediaVenue> arrayList) {
        if (arrayList == null) {
            return;
        }
        int size = this.placeMarkers.size();
        for (int i = 0; i < size; i++) {
            this.placeMarkers.get(i).marker.remove();
        }
        this.placeMarkers.clear();
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            TLRPC$TL_messageMediaVenue tLRPC$TL_messageMediaVenue = arrayList.get(i2);
            try {
                IMapsProvider.IMarkerOptions onCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                TLRPC$GeoPoint tLRPC$GeoPoint = tLRPC$TL_messageMediaVenue.geo;
                IMapsProvider.IMarkerOptions position = onCreateMarkerOptions.position(new IMapsProvider.LatLng(tLRPC$GeoPoint.lat, tLRPC$GeoPoint._long));
                position.icon(createPlaceBitmap(i2));
                position.anchor(0.5f, 0.5f);
                position.title(tLRPC$TL_messageMediaVenue.title);
                position.snippet(tLRPC$TL_messageMediaVenue.address);
                VenueLocation venueLocation = new VenueLocation();
                venueLocation.num = i2;
                IMapsProvider.IMarker addMarker = this.map.addMarker(position);
                venueLocation.marker = addMarker;
                venueLocation.venue = tLRPC$TL_messageMediaVenue;
                addMarker.setTag(venueLocation);
                this.placeMarkers.add(venueLocation);
            } catch (Exception e) {
                FileLog.m31e(e);
            }
        }
    }

    private LiveLocation addUserMarker(TLRPC$Message tLRPC$Message) {
        Location location;
        TLRPC$GeoPoint tLRPC$GeoPoint = tLRPC$Message.media.geo;
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(tLRPC$GeoPoint.lat, tLRPC$GeoPoint._long);
        LiveLocation liveLocation = this.markersMap.get(MessageObject.getFromChatId(tLRPC$Message));
        if (liveLocation == null) {
            liveLocation = new LiveLocation();
            liveLocation.object = tLRPC$Message;
            if (tLRPC$Message.from_id instanceof TLRPC$TL_peerUser) {
                liveLocation.user = getMessagesController().getUser(Long.valueOf(liveLocation.object.from_id.user_id));
                liveLocation.f1166id = liveLocation.object.from_id.user_id;
            } else {
                long dialogId = MessageObject.getDialogId(tLRPC$Message);
                if (DialogObject.isUserDialog(dialogId)) {
                    liveLocation.user = getMessagesController().getUser(Long.valueOf(dialogId));
                } else {
                    liveLocation.chat = getMessagesController().getChat(Long.valueOf(-dialogId));
                }
                liveLocation.f1166id = dialogId;
            }
            try {
                IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                Bitmap createUserBitmap = createUserBitmap(liveLocation);
                if (createUserBitmap != null) {
                    position.icon(createUserBitmap);
                    position.anchor(0.5f, 0.907f);
                    liveLocation.marker = this.map.addMarker(position);
                    if (!UserObject.isUserSelf(liveLocation.user)) {
                        IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                        flat.anchor(0.5f, 0.5f);
                        IMapsProvider.IMarker addMarker = this.map.addMarker(flat);
                        liveLocation.directionMarker = addMarker;
                        int i = tLRPC$Message.media.heading;
                        if (i != 0) {
                            addMarker.setRotation(i);
                            liveLocation.directionMarker.setIcon(C1072R.C1073drawable.map_pin_cone2);
                            liveLocation.hasRotation = true;
                        } else {
                            addMarker.setRotation(0);
                            liveLocation.directionMarker.setIcon(C1072R.C1073drawable.map_pin_circle);
                            liveLocation.hasRotation = false;
                        }
                    }
                    this.markers.add(liveLocation);
                    this.markersMap.put(liveLocation.f1166id, liveLocation);
                    LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.dialogId);
                    if (liveLocation.f1166id == getUserConfig().getClientUserId() && sharingLocationInfo != null && liveLocation.object.f881id == sharingLocationInfo.mid && (location = this.myLocation) != null) {
                        liveLocation.marker.setPosition(new IMapsProvider.LatLng(location.getLatitude(), this.myLocation.getLongitude()));
                    }
                }
            } catch (Exception e) {
                FileLog.m31e(e);
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
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(tLRPC$GeoPoint.lat, tLRPC$GeoPoint._long);
        LiveLocation liveLocation = new LiveLocation();
        if (DialogObject.isUserDialog(this.dialogId)) {
            liveLocation.user = getMessagesController().getUser(Long.valueOf(this.dialogId));
        } else {
            liveLocation.chat = getMessagesController().getChat(Long.valueOf(-this.dialogId));
        }
        liveLocation.f1166id = this.dialogId;
        try {
            IMapsProvider.IMarkerOptions position = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
            Bitmap createUserBitmap = createUserBitmap(liveLocation);
            if (createUserBitmap != null) {
                position.icon(createUserBitmap);
                position.anchor(0.5f, 0.907f);
                liveLocation.marker = this.map.addMarker(position);
                if (!UserObject.isUserSelf(liveLocation.user)) {
                    IMapsProvider.IMarkerOptions flat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                    flat.icon(C1072R.C1073drawable.map_pin_circle);
                    flat.anchor(0.5f, 0.5f);
                    liveLocation.directionMarker = this.map.addMarker(flat);
                }
                this.markers.add(liveLocation);
                this.markersMap.put(liveLocation.f1166id, liveLocation);
            }
        } catch (Exception e) {
            FileLog.m31e(e);
        }
        return liveLocation;
    }

    private void onMapInit() {
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i;
        if (this.map == null) {
            return;
        }
        TLRPC$TL_channelLocation tLRPC$TL_channelLocation = this.chatLocation;
        if (tLRPC$TL_channelLocation != null) {
            this.map.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(addUserMarker(tLRPC$TL_channelLocation).marker.getPosition(), this.map.getMaxZoomLevel() - 4.0f));
        } else {
            MessageObject messageObject = this.messageObject;
            if (messageObject != null) {
                if (messageObject.isLiveLocation()) {
                    LiveLocation addUserMarker = addUserMarker(this.messageObject.messageOwner);
                    if (!getRecentLocations()) {
                        this.map.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(addUserMarker.marker.getPosition(), this.map.getMaxZoomLevel() - 4.0f));
                    }
                } else {
                    IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(this.userLocation.getLatitude(), this.userLocation.getLongitude());
                    try {
                        this.map.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).icon(C1072R.C1073drawable.map_pin2));
                    } catch (Exception e) {
                        FileLog.m31e(e);
                    }
                    this.map.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.map.getMaxZoomLevel() - 4.0f));
                    this.firstFocus = false;
                    getRecentLocations();
                }
            } else {
                Location location = new Location("network");
                this.userLocation = location;
                TLRPC$TL_channelLocation tLRPC$TL_channelLocation2 = this.initialLocation;
                if (tLRPC$TL_channelLocation2 != null) {
                    TLRPC$GeoPoint tLRPC$GeoPoint = tLRPC$TL_channelLocation2.geo_point;
                    this.map.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(tLRPC$GeoPoint.lat, tLRPC$GeoPoint._long), this.map.getMaxZoomLevel() - 4.0f));
                    this.userLocation.setLatitude(this.initialLocation.geo_point.lat);
                    this.userLocation.setLongitude(this.initialLocation.geo_point._long);
                    this.adapter.setCustomLocation(this.userLocation);
                } else {
                    location.setLatitude(20.659322d);
                    this.userLocation.setLongitude(-11.40625d);
                }
            }
        }
        try {
            this.map.setMyLocationEnabled(true);
        } catch (Exception e2) {
            FileLog.m30e((Throwable) e2, false);
        }
        this.map.getUiSettings().setMyLocationButtonEnabled(false);
        this.map.getUiSettings().setZoomControlsEnabled(false);
        this.map.getUiSettings().setCompassEnabled(false);
        this.map.setOnCameraMoveStartedListener(new IMapsProvider.OnCameraMoveStartedListener() {
            @Override
            public final void onCameraMoveStarted(int i2) {
                LocationActivity.this.lambda$onMapInit$33(i2);
            }
        });
        this.map.setOnMyLocationChangeListener(new Consumer() {
            @Override
            public final void accept(Object obj) {
                LocationActivity.this.lambda$onMapInit$34((Location) obj);
            }
        });
        this.map.setOnMarkerClickListener(new IMapsProvider.OnMarkerClickListener() {
            @Override
            public final boolean onClick(IMapsProvider.IMarker iMarker) {
                boolean lambda$onMapInit$35;
                lambda$onMapInit$35 = LocationActivity.this.lambda$onMapInit$35(iMarker);
                return lambda$onMapInit$35;
            }
        });
        this.map.setOnCameraMoveListener(new Runnable() {
            @Override
            public final void run() {
                LocationActivity.this.lambda$onMapInit$36();
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
        if (imageView == null || imageView.getVisibility() != 0 || (sharingLocationInfo = getLocationController().getSharingLocationInfo(this.dialogId)) == null || (i = sharingLocationInfo.proximityMeters) <= 0) {
            return;
        }
        createCircle(i);
    }

    public void lambda$onMapInit$33(int i) {
        View childAt;
        RecyclerView.ViewHolder findContainingViewHolder;
        if (i == 1) {
            showSearchPlacesButton(true);
            removeInfoView();
            if (this.scrolling) {
                return;
            }
            int i2 = this.locationType;
            if ((i2 == 0 || i2 == 1) && this.listView.getChildCount() > 0 && (childAt = this.listView.getChildAt(0)) != null && (findContainingViewHolder = this.listView.findContainingViewHolder(childAt)) != null && findContainingViewHolder.getAdapterPosition() == 0) {
                int m35dp = this.locationType == 0 ? 0 : AndroidUtilities.m35dp(66.0f);
                int top = childAt.getTop();
                if (top < (-m35dp)) {
                    IMapsProvider.CameraPosition cameraPosition = this.map.getCameraPosition();
                    this.forceUpdate = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                    this.listView.smoothScrollBy(0, top + m35dp);
                }
            }
        }
    }

    public void lambda$onMapInit$34(Location location) {
        positionMarker(location);
        getLocationController().setMapLocation(location, this.isFirstLocation);
        this.isFirstLocation = false;
    }

    public boolean lambda$onMapInit$35(IMapsProvider.IMarker iMarker) {
        if (iMarker.getTag() instanceof VenueLocation) {
            this.markerImageView.setVisibility(4);
            if (!this.userLocationMoved) {
                this.locationButton.setColorFilter(new PorterDuffColorFilter(Theme.getColor("location_actionIcon"), PorterDuff.Mode.MULTIPLY));
                this.locationButton.setTag("location_actionIcon");
                this.userLocationMoved = true;
            }
            this.overlayView.addInfoView(iMarker);
            return true;
        }
        return true;
    }

    public void lambda$onMapInit$36() {
        MapOverlayView mapOverlayView = this.overlayView;
        if (mapOverlayView != null) {
            mapOverlayView.updatePositions();
        }
    }

    private boolean checkGpsEnabled() {
        if (getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
            try {
                if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                    builder.setTopAnimation(C1072R.raw.permission_request_location, 72, false, Theme.getColor("dialogTopBackground"));
                    builder.setMessage(LocaleController.getString("GpsDisabledAlertText", C1072R.string.GpsDisabledAlertText));
                    builder.setPositiveButton(LocaleController.getString("ConnectingToProxyEnable", C1072R.string.ConnectingToProxyEnable), new DialogInterface.OnClickListener() {
                        @Override
                        public final void onClick(DialogInterface dialogInterface, int i) {
                            LocationActivity.this.lambda$checkGpsEnabled$37(dialogInterface, i);
                        }
                    });
                    builder.setNegativeButton(LocaleController.getString("Cancel", C1072R.string.Cancel), null);
                    showDialog(builder.create());
                    return false;
                }
            } catch (Exception e) {
                FileLog.m31e(e);
            }
            return true;
        }
        return true;
    }

    public void lambda$checkGpsEnabled$37(DialogInterface dialogInterface, int i) {
        if (getParentActivity() == null) {
            return;
        }
        try {
            getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        } catch (Exception unused) {
        }
    }

    private void createCircle(int i) {
        if (this.map == null) {
            return;
        }
        List<IMapsProvider.PatternItem> asList = Arrays.asList(new IMapsProvider.PatternItem.Gap(20), new IMapsProvider.PatternItem.Dash(20));
        IMapsProvider.ICircleOptions onCreateCircleOptions = ApplicationLoader.getMapsProvider().onCreateCircleOptions();
        onCreateCircleOptions.center(new IMapsProvider.LatLng(this.myLocation.getLatitude(), this.myLocation.getLongitude()));
        onCreateCircleOptions.radius(i);
        if (isActiveThemeDark()) {
            onCreateCircleOptions.strokeColor(-1771658281);
            onCreateCircleOptions.fillColor(476488663);
        } else {
            onCreateCircleOptions.strokeColor(-1774024971);
            onCreateCircleOptions.fillColor(474121973);
        }
        onCreateCircleOptions.strokePattern(asList);
        onCreateCircleOptions.strokeWidth(2);
        this.proximityCircle = this.map.addCircle(onCreateCircleOptions);
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

    private void showPermissionAlert(boolean z) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
        builder.setTopAnimation(C1072R.raw.permission_request_location, 72, false, Theme.getColor("dialogTopBackground"));
        if (z) {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.getString("PermissionNoLocationNavigation", C1072R.string.PermissionNoLocationNavigation)));
        } else {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.getString("PermissionNoLocationFriends", C1072R.string.PermissionNoLocationFriends)));
        }
        builder.setNegativeButton(LocaleController.getString("PermissionOpenSettings", C1072R.string.PermissionOpenSettings), new DialogInterface.OnClickListener() {
            @Override
            public final void onClick(DialogInterface dialogInterface, int i) {
                LocationActivity.this.lambda$showPermissionAlert$38(dialogInterface, i);
            }
        });
        builder.setPositiveButton(LocaleController.getString("OK", C1072R.string.OK), null);
        showDialog(builder.create());
    }

    public void lambda$showPermissionAlert$38(DialogInterface dialogInterface, int i) {
        if (getParentActivity() == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.m31e(e);
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z || z2) {
            return;
        }
        try {
            if (this.mapView.getView().getParent() instanceof ViewGroup) {
                ((ViewGroup) this.mapView.getView().getParent()).removeView(this.mapView.getView());
            }
        } catch (Exception unused) {
        }
        FrameLayout frameLayout = this.mapViewClip;
        if (frameLayout != null) {
            frameLayout.addView(this.mapView.getView(), 0, LayoutHelper.createFrame(-1, this.overScrollHeight + AndroidUtilities.m35dp(10.0f), 51));
            MapOverlayView mapOverlayView = this.overlayView;
            if (mapOverlayView != null) {
                try {
                    if (mapOverlayView.getParent() instanceof ViewGroup) {
                        ((ViewGroup) this.overlayView.getParent()).removeView(this.overlayView);
                    }
                } catch (Exception unused2) {
                }
                this.mapViewClip.addView(this.overlayView, 1, LayoutHelper.createFrame(-1, this.overScrollHeight + AndroidUtilities.m35dp(10.0f), 51));
            }
            updateClipView(false);
            maybeShowProximityHint();
            return;
        }
        View view = this.fragmentView;
        if (view != null) {
            ((FrameLayout) view).addView(this.mapView.getView(), 0, LayoutHelper.createFrame(-1, -1, 51));
        }
    }

    public void maybeShowProximityHint() {
        SharedPreferences globalMainSettings;
        int i;
        ImageView imageView = this.proximityButton;
        if (imageView == null || imageView.getVisibility() != 0 || this.proximityAnimationInProgress || (i = (globalMainSettings = MessagesController.getGlobalMainSettings()).getInt("proximityhint", 0)) >= 3) {
            return;
        }
        globalMainSettings.edit().putInt("proximityhint", i + 1).commit();
        if (DialogObject.isUserDialog(this.dialogId)) {
            this.hintView.setOverrideText(LocaleController.formatString("ProximityTooltioUser", C1072R.string.ProximityTooltioUser, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.dialogId)))));
        } else {
            this.hintView.setOverrideText(LocaleController.getString("ProximityTooltioGroup", C1072R.string.ProximityTooltioGroup));
        }
        this.hintView.showForView(this.proximityButton, true);
    }

    private void showResults() {
        if (this.adapter.getItemCount() != 0 && this.layoutManager.findFirstVisibleItemPosition() == 0) {
            int m35dp = AndroidUtilities.m35dp(258.0f) + this.listView.getChildAt(0).getTop();
            if (m35dp < 0 || m35dp > AndroidUtilities.m35dp(258.0f)) {
                return;
            }
            this.listView.smoothScrollBy(0, m35dp);
        }
    }

    public void updateClipView(boolean z) {
        int i;
        int i2;
        FrameLayout.LayoutParams layoutParams;
        RecyclerView.ViewHolder findViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(0);
        if (findViewHolderForAdapterPosition != null) {
            i = (int) findViewHolderForAdapterPosition.itemView.getY();
            i2 = this.overScrollHeight + Math.min(i, 0);
        } else {
            i = -this.mapViewClip.getMeasuredHeight();
            i2 = 0;
        }
        if (((FrameLayout.LayoutParams) this.mapViewClip.getLayoutParams()) != null) {
            if (i2 <= 0) {
                if (this.mapView.getView().getVisibility() == 0) {
                    this.mapView.getView().setVisibility(4);
                    this.mapViewClip.setVisibility(4);
                    MapOverlayView mapOverlayView = this.overlayView;
                    if (mapOverlayView != null) {
                        mapOverlayView.setVisibility(4);
                    }
                }
            } else if (this.mapView.getView().getVisibility() == 4) {
                this.mapView.getView().setVisibility(0);
                this.mapViewClip.setVisibility(0);
                MapOverlayView mapOverlayView2 = this.overlayView;
                if (mapOverlayView2 != null) {
                    mapOverlayView2.setVisibility(0);
                }
            }
            this.mapViewClip.setTranslationY(Math.min(0, i));
            int i3 = -i;
            int i4 = i3 / 2;
            this.mapView.getView().setTranslationY(Math.max(0, i4));
            MapOverlayView mapOverlayView3 = this.overlayView;
            if (mapOverlayView3 != null) {
                mapOverlayView3.setTranslationY(Math.max(0, i4));
            }
            int measuredHeight = this.overScrollHeight - this.mapTypeButton.getMeasuredHeight();
            int i5 = this.locationType;
            float min = Math.min(measuredHeight - AndroidUtilities.m35dp(64 + ((i5 == 0 || i5 == 1) ? 30 : 10)), i3);
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
                int m35dp = (i3 - AndroidUtilities.m35dp(view.getTag() == null ? 48.0f : 69.0f)) + (i2 / 2);
                this.markerTop = m35dp;
                view.setTranslationY(m35dp);
            }
            if (z) {
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.mapView.getView().getLayoutParams();
            if (layoutParams2 != null && layoutParams2.height != this.overScrollHeight + AndroidUtilities.m35dp(10.0f)) {
                layoutParams2.height = this.overScrollHeight + AndroidUtilities.m35dp(10.0f);
                IMapsProvider.IMap iMap = this.map;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.m35dp(70.0f), 0, AndroidUtilities.m35dp(70.0f), AndroidUtilities.m35dp(10.0f));
                }
                this.mapView.getView().setLayoutParams(layoutParams2);
            }
            MapOverlayView mapOverlayView4 = this.overlayView;
            if (mapOverlayView4 == null || (layoutParams = (FrameLayout.LayoutParams) mapOverlayView4.getLayoutParams()) == null || layoutParams.height == this.overScrollHeight + AndroidUtilities.m35dp(10.0f)) {
                return;
            }
            layoutParams.height = this.overScrollHeight + AndroidUtilities.m35dp(10.0f);
            this.overlayView.setLayoutParams(layoutParams);
        }
    }

    public void fixLayoutInternal(boolean z) {
        FrameLayout.LayoutParams layoutParams;
        if (this.listView != null) {
            int currentActionBarHeight = (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + C1133ActionBar.getCurrentActionBarHeight();
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            if (measuredHeight == 0) {
                return;
            }
            int i = this.locationType;
            if (i == 6) {
                this.overScrollHeight = (measuredHeight - AndroidUtilities.m35dp(66.0f)) - currentActionBarHeight;
            } else if (i == 2) {
                this.overScrollHeight = (measuredHeight - AndroidUtilities.m35dp(73.0f)) - currentActionBarHeight;
            } else {
                this.overScrollHeight = (measuredHeight - AndroidUtilities.m35dp(66.0f)) - currentActionBarHeight;
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
            FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.mapView.getView().getLayoutParams();
            if (layoutParams5 != null) {
                layoutParams5.height = this.overScrollHeight + AndroidUtilities.m35dp(10.0f);
                IMapsProvider.IMap iMap = this.map;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.m35dp(70.0f), 0, AndroidUtilities.m35dp(70.0f), AndroidUtilities.m35dp(10.0f));
                }
                this.mapView.getView().setLayoutParams(layoutParams5);
            }
            MapOverlayView mapOverlayView = this.overlayView;
            if (mapOverlayView != null && (layoutParams = (FrameLayout.LayoutParams) mapOverlayView.getLayoutParams()) != null) {
                layoutParams.height = this.overScrollHeight + AndroidUtilities.m35dp(10.0f);
                this.overlayView.setLayoutParams(layoutParams);
            }
            this.adapter.notifyDataSetChanged();
            if (z) {
                int i2 = this.locationType;
                final int i3 = i2 == 3 ? 73 : (i2 == 1 || i2 == 2) ? 66 : 0;
                this.layoutManager.scrollToPositionWithOffset(0, -AndroidUtilities.m35dp(i3));
                updateClipView(false);
                this.listView.post(new Runnable() {
                    @Override
                    public final void run() {
                        LocationActivity.this.lambda$fixLayoutInternal$39(i3);
                    }
                });
                return;
            }
            updateClipView(false);
        }
    }

    public void lambda$fixLayoutInternal$39(int i) {
        this.layoutManager.scrollToPositionWithOffset(0, -AndroidUtilities.m35dp(i));
        updateClipView(false);
    }

    @SuppressLint({"MissingPermission"})
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
        if (location == null) {
            return;
        }
        this.myLocation = new Location(location);
        LiveLocation liveLocation = this.markersMap.get(getUserConfig().getClientUserId());
        LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.dialogId);
        if (liveLocation != null && sharingLocationInfo != null && liveLocation.object.f881id == sharingLocationInfo.mid) {
            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            liveLocation.marker.setPosition(latLng);
            IMapsProvider.IMarker iMarker = liveLocation.directionMarker;
            if (iMarker != null) {
                iMarker.setPosition(latLng);
            }
        }
        if (this.messageObject == null && this.chatLocation == null && this.map != null) {
            IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
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
                    this.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng2));
                } else {
                    this.firstWas = true;
                    this.map.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng2, this.map.getMaxZoomLevel() - 4.0f));
                }
            }
        } else {
            this.adapter.setGpsLocation(this.myLocation);
        }
        ProximitySheet proximitySheet = this.proximitySheet;
        if (proximitySheet != null) {
            proximitySheet.updateText(true, true);
        }
        IMapsProvider.ICircle iCircle = this.proximityCircle;
        if (iCircle != null) {
            iCircle.setCenter(new IMapsProvider.LatLng(this.myLocation.getLatitude(), this.myLocation.getLongitude()));
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

    private static IMapsProvider.LatLng move(IMapsProvider.LatLng latLng, double d, double d2) {
        double meterToLongitude = meterToLongitude(d2, latLng.latitude);
        return new IMapsProvider.LatLng(latLng.latitude + meterToLatitude(d), latLng.longitude + meterToLongitude);
    }

    private static double meterToLongitude(double d, double d2) {
        return Math.toDegrees(d / (Math.cos(Math.toRadians(d2)) * 6366198.0d));
    }

    private static double meterToLatitude(double d) {
        return Math.toDegrees(d / 6366198.0d);
    }

    private void fetchRecentLocations(ArrayList<TLRPC$Message> arrayList) {
        IMapsProvider.ILatLngBoundsBuilder onCreateLatLngBoundsBuilder = this.firstFocus ? ApplicationLoader.getMapsProvider().onCreateLatLngBoundsBuilder() : null;
        int currentTime = getConnectionsManager().getCurrentTime();
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC$Message tLRPC$Message = arrayList.get(i);
            int i2 = tLRPC$Message.date;
            TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$Message.media;
            if (i2 + tLRPC$MessageMedia.period > currentTime) {
                if (onCreateLatLngBoundsBuilder != null) {
                    TLRPC$GeoPoint tLRPC$GeoPoint = tLRPC$MessageMedia.geo;
                    onCreateLatLngBoundsBuilder.include(new IMapsProvider.LatLng(tLRPC$GeoPoint.lat, tLRPC$GeoPoint._long));
                }
                addUserMarker(tLRPC$Message);
                if (this.proximityButton.getVisibility() != 8 && MessageObject.getFromChatId(tLRPC$Message) != getUserConfig().getClientUserId()) {
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
        if (onCreateLatLngBoundsBuilder != null) {
            if (this.firstFocus) {
                this.listView.smoothScrollBy(0, AndroidUtilities.m35dp(99.0f));
            }
            this.firstFocus = false;
            this.adapter.setLiveLocations(this.markers);
            if (this.messageObject.isLiveLocation()) {
                try {
                    IMapsProvider.LatLng center = onCreateLatLngBoundsBuilder.build().getCenter();
                    IMapsProvider.LatLng move = move(center, 100.0d, 100.0d);
                    onCreateLatLngBoundsBuilder.include(move(center, -100.0d, -100.0d));
                    onCreateLatLngBoundsBuilder.include(move);
                    IMapsProvider.ILatLngBounds build = onCreateLatLngBoundsBuilder.build();
                    if (arrayList.size() > 1) {
                        try {
                            IMapsProvider.ICameraUpdate newCameraUpdateLatLngBounds = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(build, AndroidUtilities.m35dp(113.0f));
                            this.moveToBounds = newCameraUpdateLatLngBounds;
                            this.map.moveCamera(newCameraUpdateLatLngBounds);
                            this.moveToBounds = null;
                        } catch (Exception e) {
                            FileLog.m31e(e);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    private void moveToBounds(int i, boolean z, boolean z2) {
        IMapsProvider.ILatLngBoundsBuilder onCreateLatLngBoundsBuilder = ApplicationLoader.getMapsProvider().onCreateLatLngBoundsBuilder();
        onCreateLatLngBoundsBuilder.include(new IMapsProvider.LatLng(this.myLocation.getLatitude(), this.myLocation.getLongitude()));
        try {
            if (z) {
                int max = Math.max(i, 250);
                IMapsProvider.LatLng center = onCreateLatLngBoundsBuilder.build().getCenter();
                double d = max;
                IMapsProvider.LatLng move = move(center, d, d);
                double d2 = -max;
                onCreateLatLngBoundsBuilder.include(move(center, d2, d2));
                onCreateLatLngBoundsBuilder.include(move);
                IMapsProvider.ILatLngBounds build = onCreateLatLngBoundsBuilder.build();
                try {
                    this.map.setPadding(AndroidUtilities.m35dp(70.0f), 0, AndroidUtilities.m35dp(70.0f), (int) ((this.proximitySheet.getCustomView().getMeasuredHeight() - AndroidUtilities.m35dp(40.0f)) + this.mapViewClip.getTranslationY()));
                    if (z2) {
                        this.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(build, 0), 500, null);
                    } else {
                        this.map.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(build, 0));
                    }
                } catch (Exception e) {
                    FileLog.m31e(e);
                }
            }
            int currentTime = getConnectionsManager().getCurrentTime();
            int size = this.markers.size();
            for (int i2 = 0; i2 < size; i2++) {
                TLRPC$Message tLRPC$Message = this.markers.get(i2).object;
                int i3 = tLRPC$Message.date;
                TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$Message.media;
                if (i3 + tLRPC$MessageMedia.period > currentTime) {
                    TLRPC$GeoPoint tLRPC$GeoPoint = tLRPC$MessageMedia.geo;
                    onCreateLatLngBoundsBuilder.include(new IMapsProvider.LatLng(tLRPC$GeoPoint.lat, tLRPC$GeoPoint._long));
                }
            }
            IMapsProvider.LatLng center2 = onCreateLatLngBoundsBuilder.build().getCenter();
            IMapsProvider.LatLng move2 = move(center2, 100.0d, 100.0d);
            onCreateLatLngBoundsBuilder.include(move(center2, -100.0d, -100.0d));
            onCreateLatLngBoundsBuilder.include(move2);
            IMapsProvider.ILatLngBounds build2 = onCreateLatLngBoundsBuilder.build();
            try {
                this.map.setPadding(AndroidUtilities.m35dp(70.0f), 0, AndroidUtilities.m35dp(70.0f), this.proximitySheet.getCustomView().getMeasuredHeight() - AndroidUtilities.m35dp(100.0f));
                this.map.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(build2, 0));
            } catch (Exception e2) {
                FileLog.m31e(e2);
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
                LocationActivity.this.lambda$getRecentLocations$42(dialogId, tLObject, tLRPC$TL_error);
            }
        });
        return arrayList != null;
    }

    public void lambda$getRecentLocations$42(final long j, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LocationActivity.this.lambda$getRecentLocations$41(tLObject, j);
                }
            });
        }
    }

    public void lambda$getRecentLocations$41(TLObject tLObject, long j) {
        if (this.map == null) {
            return;
        }
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
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    LocationActivity.this.lambda$getRecentLocations$40();
                }
            };
            this.markAsReadRunnable = runnable;
            AndroidUtilities.runOnUIThread(runnable, 5000L);
        }
    }

    public void lambda$getRecentLocations$40() {
        Runnable runnable;
        getLocationController().markLiveLoactionsAsRead(this.dialogId);
        if (this.isPaused || (runnable = this.markAsReadRunnable) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(runnable, 5000L);
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
            IMapsProvider.IMap iMap = this.map;
            if (iMap != null) {
                try {
                    iMap.setMyLocationEnabled(true);
                } catch (Exception e) {
                    FileLog.m31e(e);
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
            if (((Boolean) objArr[2]).booleanValue() || ((Long) objArr[0]).longValue() != this.dialogId || this.messageObject == null) {
                return;
            }
            ArrayList arrayList = (ArrayList) objArr[1];
            boolean z = false;
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i3);
                if (messageObject.isLiveLocation()) {
                    addUserMarker(messageObject.messageOwner);
                    z = true;
                } else if ((messageObject.messageOwner.action instanceof TLRPC$TL_messageActionGeoProximityReached) && DialogObject.isUserDialog(messageObject.getDialogId())) {
                    this.proximityButton.setImageResource(C1072R.C1073drawable.msg_location_alert);
                    IMapsProvider.ICircle iCircle = this.proximityCircle;
                    if (iCircle != null) {
                        iCircle.remove();
                        this.proximityCircle = null;
                    }
                }
            }
            if (!z || (locationActivityAdapter2 = this.adapter) == null) {
                return;
            }
            locationActivityAdapter2.setLiveLocations(this.markers);
        } else if (i == NotificationCenter.replaceMessagesObjects) {
            long longValue = ((Long) objArr[0]).longValue();
            if (longValue != this.dialogId || this.messageObject == null) {
                return;
            }
            ArrayList arrayList2 = (ArrayList) objArr[1];
            boolean z2 = false;
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i4);
                if (messageObject2.isLiveLocation() && (liveLocation = this.markersMap.get(getMessageId(messageObject2.messageOwner))) != null) {
                    LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(longValue);
                    if (sharingLocationInfo == null || sharingLocationInfo.mid != messageObject2.getId()) {
                        TLRPC$Message tLRPC$Message = messageObject2.messageOwner;
                        liveLocation.object = tLRPC$Message;
                        TLRPC$GeoPoint tLRPC$GeoPoint = tLRPC$Message.media.geo;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(tLRPC$GeoPoint.lat, tLRPC$GeoPoint._long);
                        liveLocation.marker.setPosition(latLng);
                        IMapsProvider.IMarker iMarker = liveLocation.directionMarker;
                        if (iMarker != null) {
                            iMarker.getPosition();
                            liveLocation.directionMarker.setPosition(latLng);
                            int i5 = messageObject2.messageOwner.media.heading;
                            if (i5 != 0) {
                                liveLocation.directionMarker.setRotation(i5);
                                if (!liveLocation.hasRotation) {
                                    liveLocation.directionMarker.setIcon(C1072R.C1073drawable.map_pin_cone2);
                                    liveLocation.hasRotation = true;
                                }
                            } else if (liveLocation.hasRotation) {
                                liveLocation.directionMarker.setRotation(0);
                                liveLocation.directionMarker.setIcon(C1072R.C1073drawable.map_pin_circle);
                                liveLocation.hasRotation = false;
                            }
                        }
                    }
                    z2 = true;
                }
            }
            if (!z2 || (locationActivityAdapter = this.adapter) == null) {
                return;
            }
            locationActivityAdapter.updateLiveLocations();
            ProximitySheet proximitySheet = this.proximitySheet;
            if (proximitySheet != null) {
                proximitySheet.updateText(true, true);
            }
        }
    }

    @Override
    public void onPause() {
        super.onPause();
        IMapsProvider.IMapView iMapView = this.mapView;
        if (iMapView != null && this.mapsInitialized) {
            try {
                iMapView.onPause();
            } catch (Exception e) {
                FileLog.m31e(e);
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
        if (proximitySheet != null) {
            proximitySheet.dismiss();
            return false;
        } else if (onCheckGlScreenshot()) {
            return false;
        } else {
            return super.onBackPressed();
        }
    }

    @Override
    public void finishFragment(boolean z) {
        if (onCheckGlScreenshot()) {
            return;
        }
        super.finishFragment(z);
    }

    private boolean onCheckGlScreenshot() {
        IMapsProvider.IMapView iMapView = this.mapView;
        if (iMapView == null || iMapView.getGlSurfaceView() == null || this.hasScreenshot) {
            return false;
        }
        final GLSurfaceView glSurfaceView = this.mapView.getGlSurfaceView();
        glSurfaceView.queueEvent(new Runnable() {
            @Override
            public final void run() {
                LocationActivity.this.lambda$onCheckGlScreenshot$45(glSurfaceView);
            }
        });
        return true;
    }

    public void lambda$onCheckGlScreenshot$45(final GLSurfaceView gLSurfaceView) {
        if (gLSurfaceView.getWidth() == 0 || gLSurfaceView.getHeight() == 0) {
            return;
        }
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getWidth() * gLSurfaceView.getHeight() * 4);
        GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, allocateDirect);
        Bitmap createBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
        createBitmap.copyPixelsFromBuffer(allocateDirect);
        Matrix matrix = new Matrix();
        matrix.preScale(1.0f, -1.0f);
        final Bitmap createBitmap2 = Bitmap.createBitmap(createBitmap, 0, 0, createBitmap.getWidth(), createBitmap.getHeight(), matrix, false);
        createBitmap.recycle();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LocationActivity.this.lambda$onCheckGlScreenshot$44(createBitmap2, gLSurfaceView);
            }
        });
    }

    public void lambda$onCheckGlScreenshot$44(Bitmap bitmap, final GLSurfaceView gLSurfaceView) {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(bitmap);
        final ViewGroup viewGroup = (ViewGroup) gLSurfaceView.getParent();
        try {
            viewGroup.addView(imageView, viewGroup.indexOfChild(gLSurfaceView));
        } catch (Exception e) {
            FileLog.m31e(e);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LocationActivity.this.lambda$onCheckGlScreenshot$43(viewGroup, gLSurfaceView);
            }
        }, 100L);
    }

    public void lambda$onCheckGlScreenshot$43(ViewGroup viewGroup, GLSurfaceView gLSurfaceView) {
        try {
            viewGroup.removeView(gLSurfaceView);
        } catch (Exception e) {
            FileLog.m31e(e);
        }
        this.hasScreenshot = true;
        finishFragment();
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
        IMapsProvider.IMapView iMapView = this.mapView;
        if (iMapView != null && this.mapsInitialized) {
            try {
                iMapView.onResume();
            } catch (Throwable th) {
                FileLog.m31e(th);
            }
        }
        this.onResumeCalled = true;
        IMapsProvider.IMap iMap = this.map;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e) {
                FileLog.m31e(e);
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
        IMapsProvider.IMapView iMapView = this.mapView;
        if (iMapView == null || !this.mapsInitialized) {
            return;
        }
        iMapView.onLowMemory();
    }

    public void setDelegate(LocationActivityDelegate locationActivityDelegate) {
        this.delegate = locationActivityDelegate;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                LocationActivity.this.lambda$getThemeDescriptions$46();
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
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, themeDescriptionDelegate, "dialogBackground"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "dialogBackground"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, "dialogBackground"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, "dialogTextBlack"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, "dialogTextBlack"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "dialogButtonSelector"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCH, null, null, null, null, "dialogTextBlack"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCHPLACEHOLDER, null, null, null, null, "chat_messagePanelHint"));
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        arrayList.add(new ThemeDescription(actionBarMenuItem != null ? actionBarMenuItem.getSearchField() : null, ThemeDescription.FLAG_CURSORCOLOR, null, null, null, null, "dialogTextBlack"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SUBMENUBACKGROUND, null, null, null, themeDescriptionDelegate, "actionBarDefaultSubmenuBackground"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SUBMENUITEM, null, null, null, themeDescriptionDelegate, "actionBarDefaultSubmenuItem"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_IMAGECOLOR | ThemeDescription.FLAG_AB_SUBMENUITEM, null, null, null, themeDescriptionDelegate, "actionBarDefaultSubmenuItemIcon"));
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
        arrayList.add(new ThemeDescription(this.mapTypeButton, 0, null, null, null, themeDescriptionDelegate, "location_actionIcon"));
        arrayList.add(new ThemeDescription(this.mapTypeButton, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "location_actionBackground"));
        arrayList.add(new ThemeDescription(this.mapTypeButton, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, "location_actionPressedBackground"));
        arrayList.add(new ThemeDescription(this.proximityButton, 0, null, null, null, themeDescriptionDelegate, "location_actionIcon"));
        arrayList.add(new ThemeDescription(this.proximityButton, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "location_actionBackground"));
        arrayList.add(new ThemeDescription(this.proximityButton, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, "location_actionPressedBackground"));
        arrayList.add(new ThemeDescription(this.searchAreaButton, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "location_actionActiveIcon"));
        arrayList.add(new ThemeDescription(this.searchAreaButton, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, "location_actionBackground"));
        arrayList.add(new ThemeDescription(this.searchAreaButton, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, "location_actionPressedBackground"));
        arrayList.add(new ThemeDescription(null, 0, null, null, Theme.avatarDrawables, themeDescriptionDelegate, "avatar_text"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "avatar_backgroundRed"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "avatar_backgroundOrange"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "avatar_backgroundViolet"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "avatar_backgroundGreen"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "avatar_backgroundCyan"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "avatar_backgroundBlue"));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, "avatar_backgroundPink"));
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

    public void lambda$getThemeDescriptions$46() {
        this.mapTypeButton.setIconColor(Theme.getColor("location_actionIcon"));
        this.mapTypeButton.redrawPopup(Theme.getColor("actionBarDefaultSubmenuBackground"));
        this.mapTypeButton.setPopupItemsColor(Theme.getColor("actionBarDefaultSubmenuItemIcon"), true);
        this.mapTypeButton.setPopupItemsColor(Theme.getColor("actionBarDefaultSubmenuItem"), false);
        this.shadowDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor("dialogBackground"), PorterDuff.Mode.MULTIPLY));
        this.shadow.invalidate();
        if (this.map != null) {
            if (isActiveThemeDark()) {
                if (this.currentMapStyleDark) {
                    return;
                }
                this.currentMapStyleDark = true;
                this.map.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, C1072R.raw.mapstyle_night));
                IMapsProvider.ICircle iCircle = this.proximityCircle;
                if (iCircle != null) {
                    iCircle.setStrokeColor(-1);
                    this.proximityCircle.setFillColor(553648127);
                }
            } else if (this.currentMapStyleDark) {
                this.currentMapStyleDark = false;
                this.map.setMapStyle(null);
                IMapsProvider.ICircle iCircle2 = this.proximityCircle;
                if (iCircle2 != null) {
                    iCircle2.setStrokeColor(-16777216);
                    this.proximityCircle.setFillColor(536870912);
                }
            }
        }
    }
}
