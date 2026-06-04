package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
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
import androidx.core.graphics.ColorUtils;
import androidx.core.util.Consumer;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
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
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.utils.ViewOutlineProviderImpl;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.BaseLocationAdapter;
import org.telegram.ui.Adapters.LocationActivityAdapter;
import org.telegram.ui.Adapters.LocationActivitySearchAdapter;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.LocationCell;
import org.telegram.ui.Cells.LocationDirectionCell;
import org.telegram.ui.Cells.LocationLoadingCell;
import org.telegram.ui.Cells.LocationPoweredCell;
import org.telegram.ui.Cells.SendLocationCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.SharingLiveLocationCell;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.AvatarDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.MapPlaceholderDrawable;
import org.telegram.ui.Components.ProximitySheet;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Stories.recorder.HintView2;

public class LocationActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private LocationActivityAdapter adapter;
    private AnimatorSet animatorSet;
    private int askWithRadius;
    private boolean canUndo;
    private TLRPC.TL_channelLocation chatLocation;
    private boolean currentMapStyleDark;
    private LocationActivityDelegate delegate;
    private long dialogId;
    private ImageView emptyImageView;
    private TextView emptySubtitleTextView;
    private TextView emptyTitleTextView;
    private LinearLayout emptyView;
    private boolean firstWas;
    private IMapsProvider.ICameraUpdate forceUpdate;
    public boolean fromStories;
    private boolean hasScreenshot;
    private HintView2 hintView;
    private TLRPC.TL_channelLocation initialLocation;
    private boolean initialMaxZoom;
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
    private TL_stories.MediaArea searchStoriesArea;
    private boolean searchWas;
    private boolean searchedForCustomLocations;
    private boolean searching;
    private View shadow;
    private Drawable shadowDrawable;
    private GraySectionCell sharedMediaHeader;
    private SharedMediaLayout sharedMediaLayout;
    private TextView showAllButton;
    private boolean showAllMode;
    private Boolean shownShowAllButton;
    private Runnable updateRunnable;
    private Location userLocation;
    private boolean userLocationMoved;
    private float yOffset;
    private UndoView[] undoView = new UndoView[2];
    private boolean checkGpsEnabled = true;
    private boolean locationDenied = false;
    private boolean isFirstLocation = true;
    private boolean firstFocus = true;
    private ArrayList markers = new ArrayList();
    private LongSparseArray markersMap = new LongSparseArray();
    private long selectedMarkerId = -1;
    private ArrayList placeMarkers = new ArrayList();
    private boolean checkPermission = true;
    private boolean checkBackgroundPermission = true;
    private int overScrollHeight = (AndroidUtilities.displaySize.x - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
    private boolean isSharingAllowed = true;
    private Bitmap[] bitmapCache = new Bitmap[7];

    public static class LiveLocation {
        public ImageReceiver avatarReceiver;
        public TLRPC.Chat chat;
        public IMapsProvider.IMarker directionMarker;
        public boolean hasRotation;
        public long id;
        public IMapsProvider.IMarker marker;
        public TLRPC.Message object;
        public TLRPC.User user;
    }

    public interface LocationActivityDelegate {
        void didSelectLocation(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j);
    }

    public static class VenueLocation {
        public IMapsProvider.IMarker marker;
        public int num;
        public TLRPC.TL_messageMediaVenue venue;
    }

    public static boolean lambda$createView$9(View view, MotionEvent motionEvent) {
        return true;
    }

    protected boolean disablePermissionCheck() {
        return false;
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

    private static class SearchButton extends TextView {
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
        private HashMap views;

        public MapOverlayView(Context context) {
            super(context);
            this.views = new HashMap();
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
            LocationActivity.this.lastPressedMarkerView.setBackgroundResource(R.drawable.venue_tooltip);
            LocationActivity.this.lastPressedMarkerView.getBackground().setColorFilter(new PorterDuffColorFilter(LocationActivity.this.getThemedColor(Theme.key_dialogBackground), PorterDuff.Mode.MULTIPLY));
            frameLayout.addView(LocationActivity.this.lastPressedMarkerView, LayoutHelper.createFrame(-2, 71.0f));
            LocationActivity.this.lastPressedMarkerView.setAlpha(0.0f);
            LocationActivity.this.lastPressedMarkerView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$addInfoView$1(venueLocation, view);
                }
            });
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setMaxLines(1);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            textView.setSingleLine(true);
            textView.setTextColor(LocationActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(LocaleController.isRTL ? 5 : 3);
            LocationActivity.this.lastPressedMarkerView.addView(textView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setMaxLines(1);
            textView2.setEllipsize(truncateAt);
            textView2.setSingleLine(true);
            textView2.setTextColor(LocationActivity.this.getThemedColor(Theme.key_windowBackgroundWhiteGrayText3));
            textView2.setGravity(LocaleController.isRTL ? 5 : 3);
            LocationActivity.this.lastPressedMarkerView.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
            textView.setText(venueLocation.venue.title);
            textView2.setText(LocaleController.getString(R.string.TapToSendLocation));
            final FrameLayout frameLayout2 = new FrameLayout(context);
            frameLayout2.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(36.0f), LocationCell.getColorForIndex(venueLocation.num)));
            frameLayout.addView(frameLayout2, LayoutHelper.createFrame(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
            BackupImageView backupImageView = new BackupImageView(context);
            backupImageView.setImage("https://ss3.4sqi.net/img/categories_v2/" + venueLocation.venue.venue_type + "_64.png", null, null);
            frameLayout2.addView(backupImageView, LayoutHelper.createFrame(30, 30, 17));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                private final float[] animatorValues = {0.0f, 1.0f};
                private boolean startedInner;

                @Override
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float interpolation;
                    float fLerp = AndroidUtilities.lerp(this.animatorValues, valueAnimator.getAnimatedFraction());
                    if (fLerp >= 0.7f && !this.startedInner && LocationActivity.this.lastPressedMarkerView != null) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(LocationActivity.this.lastPressedMarkerView, (Property<FrameLayout, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(LocationActivity.this.lastPressedMarkerView, (Property<FrameLayout, Float>) View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(LocationActivity.this.lastPressedMarkerView, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
                        animatorSet.setInterpolator(new OvershootInterpolator(1.02f));
                        animatorSet.setDuration(250L);
                        animatorSet.start();
                        this.startedInner = true;
                    }
                    if (fLerp <= 0.5f) {
                        interpolation = CubicBezierInterpolator.EASE_OUT.getInterpolation(fLerp / 0.5f) * 1.1f;
                    } else if (fLerp <= 0.75f) {
                        interpolation = 1.1f - (CubicBezierInterpolator.EASE_OUT.getInterpolation((fLerp - 0.5f) / 0.25f) * 0.2f);
                    } else {
                        interpolation = (CubicBezierInterpolator.EASE_OUT.getInterpolation((fLerp - 0.75f) / 0.25f) * 0.1f) + 0.9f;
                    }
                    frameLayout2.setScaleX(interpolation);
                    frameLayout2.setScaleY(interpolation);
                }
            });
            valueAnimatorOfFloat.setDuration(360L);
            valueAnimatorOfFloat.start();
            this.views.put(iMarker, frameLayout);
            LocationActivity.this.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
        }

        public void lambda$addInfoView$1(final VenueLocation venueLocation, View view) {
            if (LocationActivity.this.parentFragment == null || !LocationActivity.this.parentFragment.isInScheduleMode()) {
                LocationActivity.this.delegate.didSelectLocation(venueLocation.venue, LocationActivity.this.locationType, true, 0, 0L);
                LocationActivity.this.finishFragment();
            } else {
                AlertsCreator.createScheduleDatePickerDialog(LocationActivity.this.getParentActivity(), LocationActivity.this.parentFragment.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                    @Override
                    public final void didSelectDate(boolean z, int i, int i2) {
                        this.f$0.lambda$addInfoView$0(venueLocation, z, i, i2);
                    }
                });
            }
        }

        public void lambda$addInfoView$0(VenueLocation venueLocation, boolean z, int i, int i2) {
            LocationActivity.this.delegate.didSelectLocation(venueLocation.venue, LocationActivity.this.locationType, z, i, 0L);
            LocationActivity.this.finishFragment();
        }

        public void removeInfoView(IMapsProvider.IMarker iMarker) {
            View view = (View) this.views.get(iMarker);
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
            for (Map.Entry entry : this.views.entrySet()) {
                IMapsProvider.IMarker iMarker = (IMapsProvider.IMarker) entry.getKey();
                View view = (View) entry.getValue();
                Point screenLocation = projection.toScreenLocation(iMarker.getPosition());
                view.setTranslationX(screenLocation.x - (view.getMeasuredWidth() / 2));
                view.setTranslationY((screenLocation.y - view.getMeasuredHeight()) + AndroidUtilities.dp(22.0f));
            }
        }
    }

    public LocationActivity(int i) {
        this.locationType = i;
        AndroidUtilities.fixGoogleMapsBug();
    }

    public LocationActivity searchStories(TL_stories.MediaArea mediaArea) {
        this.searchStoriesArea = mediaArea;
        return this;
    }

    public void setInitialMaxZoom(boolean z) {
        this.initialMaxZoom = z;
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
            FileLog.e(e);
        }
        try {
            IMapsProvider.IMapView iMapView = this.mapView;
            if (iMapView != null) {
                iMapView.onDestroy();
            }
        } catch (Exception e2) {
            FileLog.e(e2);
        }
        UndoView undoView = this.undoView[0];
        if (undoView != null) {
            undoView.hide(true, 0);
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
        int size = this.markers.size();
        for (int i = 0; i < size; i++) {
            LiveLocation liveLocation = (LiveLocation) this.markers.get(i);
            ImageReceiver imageReceiver = liveLocation.avatarReceiver;
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
                liveLocation.avatarReceiver = null;
            }
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

    public void setSharingAllowed(boolean z) {
        this.isSharingAllowed = z;
    }

    @Override
    public View createView(final Context context) {
        FrameLayout.LayoutParams layoutParams;
        FrameLayout.LayoutParams layoutParams2;
        Rect rect;
        final LocationActivity locationActivity;
        int i;
        char c;
        ?? r9;
        int i2;
        boolean z;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        int i3;
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
        this.locationDenied = (Build.VERSION.SDK_INT < 23 || getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        ActionBar actionBar = this.actionBar;
        int i4 = Theme.key_dialogBackground;
        actionBar.setBackgroundColor(getThemedColor(i4));
        ActionBar actionBar2 = this.actionBar;
        int i5 = Theme.key_dialogTextBlack;
        actionBar2.setTitleColor(getThemedColor(i5));
        this.actionBar.setItemsColor(getThemedColor(i5), false);
        this.actionBar.setItemsBackgroundColor(getThemedColor(Theme.key_dialogButtonSelector), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && iNavigationLayout.isLayersLayout()) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i6) {
                if (i6 == -1) {
                    LocationActivity.this.finishFragment();
                    return;
                }
                if (i6 != 1) {
                    if (i6 == 5) {
                        LocationActivity.this.openShareLiveLocation(false, 0);
                        return;
                    } else {
                        if (i6 == 6) {
                            LocationActivity.this.openDirections(null);
                            return;
                        }
                        return;
                    }
                }
                try {
                    double d = LocationActivity.this.messageObject.messageOwner.media.geo.lat;
                    double d2 = LocationActivity.this.messageObject.messageOwner.media.geo._long;
                    LocationActivity.this.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        });
        final ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        if (this.chatLocation != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChatLocation));
        } else {
            MessageObject messageObject = this.messageObject;
            if (messageObject != null) {
                if (messageObject.isLiveLocation()) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.AttachLiveLocation));
                    ActionBarMenuItem actionBarMenuItemAddItem = actionBarMenuCreateMenu.addItem(0, R.drawable.ic_ab_other, getResourceProvider());
                    this.otherItem = actionBarMenuItemAddItem;
                    actionBarMenuItemAddItem.addSubItem(6, R.drawable.filled_directions, LocaleController.getString(R.string.GetDirections));
                } else {
                    String str = this.messageObject.messageOwner.media.title;
                    if (str != null && str.length() > 0) {
                        this.actionBar.setTitle(LocaleController.getString(R.string.SharedPlace));
                    } else {
                        this.actionBar.setTitle(LocaleController.getString(R.string.ChatLocation));
                    }
                    if (this.locationType != 3) {
                        ActionBarMenuItem actionBarMenuItemAddItem2 = actionBarMenuCreateMenu.addItem(0, R.drawable.ic_ab_other, getResourceProvider());
                        this.otherItem = actionBarMenuItemAddItem2;
                        actionBarMenuItemAddItem2.addSubItem(1, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
                        if (!getLocationController().isSharingLocation(this.dialogId) && this.isSharingAllowed) {
                            this.otherItem.addSubItem(5, R.drawable.msg_location, LocaleController.getString(R.string.SendLiveLocationMenu));
                        }
                        this.otherItem.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
                    }
                }
            } else {
                this.actionBar.setTitle(LocaleController.getString(R.string.ShareLocation));
                if (this.locationType != 4) {
                    this.overlayView = new MapOverlayView(context);
                    ActionBarMenuItem actionBarMenuItemSearchListener = actionBarMenuCreateMenu.addItem(0, R.drawable.outline_header_search, getResourceProvider()).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
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
                            if (LocationActivity.this.locationType == 8) {
                                if (LocationActivity.this.otherItem != null) {
                                    LocationActivity.this.otherItem.setVisibility(0);
                                }
                                LocationActivity.this.listView.setVisibility(0);
                                LocationActivity.this.mapViewClip.setVisibility(0);
                                LocationActivity.this.searchListView.setAdapter(null);
                                LocationActivity.this.searchListView.setVisibility(8);
                            }
                        }

                        @Override
                        public void onTextChanged(EditText editText) {
                            if (LocationActivity.this.searchAdapter == null) {
                                return;
                            }
                            String string = editText.getText().toString();
                            if (string.length() != 0) {
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
                                LocationActivity locationActivity2 = LocationActivity.this;
                                locationActivity2.searchInProgress = locationActivity2.searchAdapter.getItemCount() == 0;
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
                            LocationActivity.this.searchAdapter.searchDelayed(string, LocationActivity.this.userLocation);
                        }
                    });
                    this.searchItem = actionBarMenuItemSearchListener;
                    int i6 = R.string.Search;
                    actionBarMenuItemSearchListener.setSearchFieldHint(LocaleController.getString(i6));
                    this.searchItem.setContentDescription(LocaleController.getString(i6));
                    EditTextBoldCursor searchField = this.searchItem.getSearchField();
                    searchField.setTextColor(getThemedColor(i5));
                    searchField.setCursorColor(getThemedColor(i5));
                    searchField.setHintTextColor(getThemedColor(Theme.key_chat_messagePanelHint));
                }
            }
        }
        NestedFrameLayout nestedFrameLayout = new NestedFrameLayout(context);
        this.fragmentView = nestedFrameLayout;
        nestedFrameLayout.setBackgroundColor(getThemedColor(i4));
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = drawableMutate;
        int themedColor = getThemedColor(i4);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        Rect rect2 = new Rect();
        this.shadowDrawable.getPadding(rect2);
        int i7 = this.locationType;
        if (i7 == 0 || i7 == 1) {
            layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f) + rect2.top);
        } else {
            layoutParams = new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(6.0f) + rect2.top);
        }
        FrameLayout.LayoutParams layoutParams3 = layoutParams;
        layoutParams3.gravity = 83;
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            protected void onMeasure(int i8, int i9) {
                super.onMeasure(i8, i9);
                if (LocationActivity.this.overlayView != null) {
                    LocationActivity.this.overlayView.updatePositions();
                }
            }
        };
        this.mapViewClip = frameLayout;
        frameLayout.setBackgroundDrawable(new MapPlaceholderDrawable(isActiveThemeDark()));
        MessageObject messageObject2 = this.messageObject;
        if ((messageObject2 == null && ((i3 = this.locationType) == 0 || i3 == 1)) || (messageObject2 != null && this.locationType == 3)) {
            SearchButton searchButton = new SearchButton(context);
            this.searchAreaButton = searchButton;
            searchButton.setTranslationX(-AndroidUtilities.dp(80.0f));
            Drawable drawableCreateSimpleSelectorRoundRectDrawable = Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(40.0f), getThemedColor(Theme.key_location_actionBackground), getThemedColor(Theme.key_location_actionPressedBackground));
            ScaleStateListAnimator.apply(this.searchAreaButton);
            this.searchAreaButton.setTranslationZ(AndroidUtilities.dp(2.0f));
            this.searchAreaButton.setOutlineProvider(ViewOutlineProviderImpl.BOUNDS_ROUND_RECT);
            this.searchAreaButton.setBackgroundDrawable(drawableCreateSimpleSelectorRoundRectDrawable);
            this.searchAreaButton.setTextColor(getThemedColor(Theme.key_location_actionActiveIcon));
            this.searchAreaButton.setTextSize(1, 14.0f);
            this.searchAreaButton.setTypeface(AndroidUtilities.bold());
            this.searchAreaButton.setGravity(17);
            this.searchAreaButton.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            this.mapViewClip.addView(this.searchAreaButton, LayoutHelper.createFrame(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
            if (this.locationType == 3) {
                this.searchAreaButton.setText(LocaleController.getString(R.string.OpenInMaps));
                this.searchAreaButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.lambda$createView$0(view);
                    }
                });
                this.searchAreaButton.setTranslationX(0.0f);
            } else {
                this.searchAreaButton.setText(LocaleController.getString(R.string.PlacesInThisArea));
                this.searchAreaButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.lambda$createView$1(view);
                    }
                });
            }
        }
        int i8 = Theme.key_location_actionIcon;
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, (ActionBarMenu) null, 0, getThemedColor(i8), getResourceProvider());
        this.mapTypeButton = actionBarMenuItem;
        actionBarMenuItem.setClickable(true);
        this.mapTypeButton.setSubMenuOpenSide(2);
        this.mapTypeButton.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        this.mapTypeButton.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        this.mapTypeButton.addSubItem(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), getResourceProvider());
        this.mapTypeButton.addSubItem(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), getResourceProvider());
        this.mapTypeButton.addSubItem(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), getResourceProvider());
        this.mapTypeButton.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        int iDp = AndroidUtilities.dp(40.0f);
        int i9 = Theme.key_location_actionBackground;
        int themedColor2 = getThemedColor(i9);
        int i10 = Theme.key_location_actionPressedBackground;
        Drawable drawableCreateSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(iDp, themedColor2, getThemedColor(i10));
        ScaleStateListAnimator.apply(this.mapTypeButton);
        this.mapTypeButton.setTranslationZ(AndroidUtilities.dp(2.0f));
        ActionBarMenuItem actionBarMenuItem2 = this.mapTypeButton;
        ViewOutlineProvider viewOutlineProvider = ViewOutlineProviderImpl.BOUNDS_OVAL;
        actionBarMenuItem2.setOutlineProvider(viewOutlineProvider);
        this.mapTypeButton.setBackgroundDrawable(drawableCreateSimpleSelectorCircleDrawable);
        this.mapTypeButton.setIcon(R.drawable.msg_map_type);
        this.mapViewClip.addView(this.mapTypeButton, LayoutHelper.createFrame(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        this.mapTypeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$createView$2(view);
            }
        });
        this.mapTypeButton.setDelegate(new ActionBarMenuItem.ActionBarMenuItemDelegate() {
            @Override
            public final void onItemClick(int i11) {
                this.f$0.lambda$createView$3(i11);
            }
        });
        this.locationButton = new ImageView(context);
        Drawable drawableCreateSimpleSelectorCircleDrawable2 = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(40.0f), getThemedColor(i9), getThemedColor(i10));
        ScaleStateListAnimator.apply(this.locationButton);
        this.locationButton.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.locationButton.setOutlineProvider(viewOutlineProvider);
        this.locationButton.setBackground(drawableCreateSimpleSelectorCircleDrawable2);
        this.locationButton.setImageResource(R.drawable.msg_current_location);
        ImageView imageView = this.locationButton;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        ImageView imageView2 = this.locationButton;
        int i11 = Theme.key_location_actionActiveIcon;
        imageView2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), mode));
        this.locationButton.setTag(Integer.valueOf(i11));
        this.locationButton.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f);
        layoutParamsCreateFrame.bottomMargin += layoutParams3.height - rect2.top;
        this.mapViewClip.addView(this.locationButton, layoutParamsCreateFrame);
        this.locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$createView$4(view);
            }
        });
        TextView textView = new TextView(context);
        this.showAllButton = textView;
        textView.setGravity(17);
        this.showAllButton.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.showAllButton.setTextSize(1, 15.0f);
        this.showAllButton.setTextColor(Theme.getColor(Theme.key_featuredStickers_addButton, this.resourceProvider));
        this.showAllButton.setTypeface(AndroidUtilities.bold());
        this.showAllButton.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.showAllButton.setText(LocaleController.getString(R.string.LocationsShowAll));
        this.showAllButton.setBackground(Theme.createRadSelectorDrawable(getThemedColor(i9), getThemedColor(i10), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f)));
        FrameLayout.LayoutParams layoutParamsCreateFrame2 = LayoutHelper.createFrame(-2, 38.0f, 81, 12.0f, 0.0f, 12.0f, 12.0f);
        layoutParamsCreateFrame2.bottomMargin += layoutParams3.height - rect2.top;
        this.mapViewClip.addView(this.showAllButton, layoutParamsCreateFrame2);
        ScaleStateListAnimator.apply(this.showAllButton);
        this.showAllButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$createView$5(view);
            }
        });
        showShowAllButton(false, false);
        this.proximityButton = new ImageView(context);
        Drawable drawableCreateSimpleSelectorCircleDrawable3 = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(40.0f), getThemedColor(i9), getThemedColor(i10));
        ScaleStateListAnimator.apply(this.proximityButton);
        this.proximityButton.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.proximityButton.setOutlineProvider(viewOutlineProvider);
        this.proximityButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(i8), mode));
        this.proximityButton.setBackgroundDrawable(drawableCreateSimpleSelectorCircleDrawable3);
        this.proximityButton.setScaleType(scaleType);
        this.proximityButton.setContentDescription(LocaleController.getString(R.string.AccDescrLocationNotify));
        this.mapViewClip.addView(this.proximityButton, LayoutHelper.createFrame(40, 40.0f, 53, 0.0f, 62.0f, 12.0f, 0.0f));
        this.proximityButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$createView$8(view);
            }
        });
        TLRPC.Chat chat = DialogObject.isChatDialog(this.dialogId) ? getMessagesController().getChat(Long.valueOf(-this.dialogId)) : null;
        MessageObject messageObject3 = this.messageObject;
        if (messageObject3 == null || !messageObject3.isLiveLocation() || this.messageObject.isExpiredLiveLocation(getConnectionsManager().getCurrentTime()) || (ChatObject.isChannel(chat) && !chat.megagroup)) {
            this.proximityButton.setVisibility(8);
            this.proximityButton.setImageResource(R.drawable.msg_location_alert);
        } else {
            LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.dialogId);
            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                this.proximityButton.setImageResource(R.drawable.msg_location_alert2);
            } else {
                if (DialogObject.isUserDialog(this.dialogId) && this.messageObject.getFromChatId() == getUserConfig().getClientUserId()) {
                    this.proximityButton.setVisibility(4);
                    this.proximityButton.setAlpha(0.0f);
                    this.proximityButton.setScaleX(0.4f);
                    this.proximityButton.setScaleY(0.4f);
                }
                this.proximityButton.setImageResource(R.drawable.msg_location_alert);
            }
        }
        HintView2 hintView2 = new HintView2(context, 1);
        this.hintView = hintView2;
        hintView2.setLayerType(2, null);
        this.hintView.setDuration(4000L);
        this.hintView.setJoint(1.0f, -25.0f);
        this.hintView.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        this.mapViewClip.addView(this.hintView, LayoutHelper.createFrame(-1, -2.0f, 51, 8.0f, 106.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.emptyView = linearLayout;
        linearLayout.setOrientation(1);
        this.emptyView.setGravity(1);
        this.emptyView.setPadding(0, AndroidUtilities.dp(160.0f), 0, 0);
        this.emptyView.setVisibility(8);
        nestedFrameLayout.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f));
        this.emptyView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return LocationActivity.lambda$createView$9(view, motionEvent);
            }
        });
        ImageView imageView3 = new ImageView(context);
        this.emptyImageView = imageView3;
        imageView3.setImageResource(R.drawable.location_empty);
        this.emptyImageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_dialogEmptyImage), mode));
        this.emptyView.addView(this.emptyImageView, LayoutHelper.createLinear(-2, -2));
        TextView textView2 = new TextView(context);
        this.emptyTitleTextView = textView2;
        int i12 = Theme.key_dialogEmptyText;
        textView2.setTextColor(getThemedColor(i12));
        this.emptyTitleTextView.setGravity(17);
        this.emptyTitleTextView.setTypeface(AndroidUtilities.bold());
        this.emptyTitleTextView.setTextSize(1, 17.0f);
        this.emptyTitleTextView.setText(LocaleController.getString(R.string.NoPlacesFound));
        this.emptyView.addView(this.emptyTitleTextView, LayoutHelper.createLinear(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(context);
        this.emptySubtitleTextView = textView3;
        textView3.setTextColor(getThemedColor(i12));
        this.emptySubtitleTextView.setGravity(17);
        this.emptySubtitleTextView.setTextSize(1, 15.0f);
        this.emptySubtitleTextView.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        this.emptyView.addView(this.emptySubtitleTextView, LayoutHelper.createLinear(-2, -2, 17, 0, 6, 0, 0));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        TLRPC.Chat chat2 = chat;
        LocationActivityAdapter locationActivityAdapter2 = new LocationActivityAdapter(context, this.locationType, this.dialogId, false, getResourceProvider(), false, this.fromStories, this.locationType == 8) {
            private boolean firstSet = true;

            @Override
            protected void onDirectionClick() {
                LocationActivity.this.openDirections(null);
            }

            @Override
            public void setLiveLocations(ArrayList arrayList) {
                int i13;
                if (LocationActivity.this.messageObject != null && LocationActivity.this.messageObject.isLiveLocation()) {
                    if (arrayList != null) {
                        i13 = 0;
                        for (int i14 = 0; i14 < arrayList.size(); i14++) {
                            LiveLocation liveLocation = (LiveLocation) arrayList.get(i14);
                            if (liveLocation != null && !UserObject.isUserSelf(liveLocation.user)) {
                                i13++;
                            }
                        }
                    } else {
                        i13 = 0;
                    }
                    if (this.firstSet && i13 == 1) {
                        LocationActivity.this.selectedMarkerId = ((LiveLocation) arrayList.get(0)).id;
                    }
                    this.firstSet = false;
                    LocationActivity.this.otherItem.setVisibility(i13 != 1 ? 8 : 0);
                }
                super.setLiveLocations(arrayList);
            }
        };
        this.adapter = locationActivityAdapter2;
        recyclerListView.setAdapter(locationActivityAdapter2);
        RecyclerListView recyclerListView2 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context, 1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        if (this.searchStoriesArea != null) {
            this.sharedMediaHeader = new GraySectionCell(context, this.resourceProvider);
            i2 = 1;
            layoutParams2 = layoutParams3;
            rect = rect2;
            SharedMediaLayout sharedMediaLayout = new SharedMediaLayout(context, 0L, new SharedMediaLayout.SharedMediaPreloader(this), 0, null, null, null, 8, 0, this, new SharedMediaLayout.Delegate() {
                @Override
                public boolean canSearchMembers() {
                    return false;
                }

                @Override
                public TLRPC.Chat getCurrentChat() {
                    return null;
                }

                @Override
                public boolean isFragmentOpened() {
                    return true;
                }

                @Override
                public boolean onMemberClick(TLRPC.ChatParticipant chatParticipant, boolean z2, boolean z3, View view) {
                    return false;
                }

                @Override
                public void scrollToSharedMedia() {
                }

                @Override
                public RecyclerListView getListView() {
                    return LocationActivity.this.listView;
                }

                @Override
                public void updateSelectedMediaTabText() {
                    int storiesCount = LocationActivity.this.sharedMediaLayout == null ? 0 : LocationActivity.this.sharedMediaLayout.getStoriesCount(8);
                    LocationActivity.this.sharedMediaHeader.setText(LocaleController.formatPluralString("LocationStories", storiesCount, new Object[0]));
                    if (LocationActivity.this.adapter.setSharedMediaLayoutVisible(storiesCount > 0)) {
                        LocationActivity.this.listView.smoothScrollBy(0, AndroidUtilities.dp(200.0f));
                    }
                }
            }, 0, getResourceProvider()) {
                @Override
                protected boolean customTabs() {
                    return true;
                }

                @Override
                public int mediaPageTopMargin() {
                    return 32;
                }

                @Override
                public int overrideColumnsCount() {
                    return 3;
                }

                @Override
                public TL_stories.MediaArea getStoriesArea() {
                    return LocationActivity.this.searchStoriesArea;
                }
            };
            locationActivity = this;
            locationActivity.sharedMediaLayout = sharedMediaLayout;
            sharedMediaLayout.setBackgroundColor(locationActivity.getThemedColor(i4));
            i = -1;
            locationActivity.sharedMediaLayout.addView(locationActivity.sharedMediaHeader, LayoutHelper.createFrame(-1, 32, 55));
            locationActivity.adapter.setSharedMediaLayout(locationActivity.sharedMediaLayout);
            c = 2;
            locationActivity.listView.setOverScrollMode(2);
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            r9 = 0;
            defaultItemAnimator.setSupportsChangeAnimations(false);
            defaultItemAnimator.setDelayAnimations(false);
            defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            defaultItemAnimator.setDurations(350L);
            locationActivity.listView.setItemAnimator(defaultItemAnimator);
        } else {
            layoutParams2 = layoutParams3;
            rect = rect2;
            locationActivity = this;
            i = -1;
            c = 2;
            r9 = 0;
            i2 = 1;
        }
        locationActivity.adapter.setMyLocationDenied(locationActivity.locationDenied, r9);
        locationActivity.adapter.setUpdateRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createView$10();
            }
        });
        locationActivity.listView.setVerticalScrollBarEnabled(r9);
        nestedFrameLayout.addView(locationActivity.listView, LayoutHelper.createFrame(i, i, 51));
        MessageObject messageObject4 = locationActivity.messageObject;
        if (messageObject4 != null && (message = messageObject4.messageOwner) != null && (messageMedia = message.media) != null && !TextUtils.isEmpty(messageMedia.address)) {
            locationActivity.adapter.setAddressNameOverride(locationActivity.messageObject.messageOwner.media.address);
        }
        locationActivity.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i13) {
                LocationActivity.this.scrolling = i13 != 0;
                if (LocationActivity.this.scrolling || LocationActivity.this.forceUpdate == null) {
                    return;
                }
                LocationActivity.this.forceUpdate = null;
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i13, int i14) {
                LocationActivity.this.updateClipView(false);
                if (LocationActivity.this.forceUpdate != null) {
                    LocationActivity.access$3116(LocationActivity.this, i14);
                }
            }
        });
        ((DefaultItemAnimator) locationActivity.listView.getItemAnimator()).setDelayAnimations(r9);
        locationActivity.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i13) {
                return this.f$0.lambda$createView$12(context, view, i13);
            }
        });
        locationActivity.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i13) {
                this.f$0.lambda$createView$18(view, i13);
            }
        });
        locationActivity.adapter.setDelegate(locationActivity.dialogId, new BaseLocationAdapter.BaseLocationAdapterDelegate() {
            @Override
            public final void didLoadSearchResult(ArrayList arrayList) {
                this.f$0.updatePlacesMarkers(arrayList);
            }
        });
        locationActivity.adapter.setOverScrollHeight(locationActivity.overScrollHeight);
        nestedFrameLayout.addView(locationActivity.mapViewClip, LayoutHelper.createFrame(i, i, 51));
        IMapsProvider.IMapView iMapViewOnCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        locationActivity.mapView = iMapViewOnCreateMapView;
        iMapViewOnCreateMapView.getView().setAlpha(0.0f);
        locationActivity.mapView.setOnDispatchTouchEventInterceptor(new IMapsProvider.ITouchInterceptor() {
            @Override
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
                return this.f$0.lambda$createView$19(motionEvent, iCallableMethod);
            }
        });
        locationActivity.mapView.setOnInterceptTouchEventInterceptor(new IMapsProvider.ITouchInterceptor() {
            @Override
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
                return this.f$0.lambda$createView$20(motionEvent, iCallableMethod);
            }
        });
        locationActivity.mapView.setOnLayoutListener(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createView$22();
            }
        });
        final IMapsProvider.IMapView iMapView = locationActivity.mapView;
        new Thread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createView$25(iMapView);
            }
        }).start();
        MessageObject messageObject5 = locationActivity.messageObject;
        if (messageObject5 == null && locationActivity.chatLocation == null) {
            if (chat2 != null && locationActivity.locationType == 4 && locationActivity.dialogId != 0) {
                FrameLayout frameLayout2 = new FrameLayout(context);
                frameLayout2.setBackgroundResource(R.drawable.livepin);
                locationActivity.mapViewClip.addView(frameLayout2, LayoutHelper.createFrame(62, 76, 49));
                BackupImageView backupImageView = new BackupImageView(context);
                backupImageView.setRoundRadius(AndroidUtilities.dp(26.0f));
                backupImageView.setForUserOrChat(chat2, new AvatarDrawable(chat2));
                frameLayout2.addView(backupImageView, LayoutHelper.createFrame(52, 52.0f, 51, 5.0f, 5.0f, 0.0f, 0.0f));
                locationActivity.markerImageView = frameLayout2;
                frameLayout2.setTag(Integer.valueOf(i2));
            }
            if (locationActivity.markerImageView == null) {
                ImageView imageView4 = new ImageView(context);
                imageView4.setImageResource(R.drawable.map_pin2);
                locationActivity.mapViewClip.addView(imageView4, LayoutHelper.createFrame(28, 48, 49));
                locationActivity.markerImageView = imageView4;
            }
            RecyclerListView recyclerListView3 = new RecyclerListView(context);
            locationActivity.searchListView = recyclerListView3;
            recyclerListView3.setVisibility(8);
            z = true;
            locationActivity.searchListView.setLayoutManager(new LinearLayoutManager(context, 1, r9));
            LocationActivitySearchAdapter locationActivitySearchAdapter2 = new LocationActivitySearchAdapter(context, getResourceProvider(), false, locationActivity.locationType == 8) {
                @Override
                public void notifyDataSetChanged() {
                    if (LocationActivity.this.searchItem != null) {
                        LocationActivity.this.searchItem.setShowSearchProgress(LocationActivity.this.searchAdapter.isSearching());
                    }
                    if (LocationActivity.this.emptySubtitleTextView != null) {
                        LocationActivity.this.emptySubtitleTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, LocationActivity.this.searchAdapter.getLastSearchString())));
                    }
                    super.notifyDataSetChanged();
                }
            };
            locationActivity.searchAdapter = locationActivitySearchAdapter2;
            locationActivitySearchAdapter2.setDelegate(0L, new BaseLocationAdapter.BaseLocationAdapterDelegate() {
                @Override
                public final void didLoadSearchResult(ArrayList arrayList) {
                    this.f$0.lambda$createView$26(arrayList);
                }
            });
            nestedFrameLayout.addView(locationActivity.searchListView, LayoutHelper.createFrame(i, i, 51));
            locationActivity.searchListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrollStateChanged(RecyclerView recyclerView, int i13) {
                    if (i13 == 1 && LocationActivity.this.searching && LocationActivity.this.searchWas) {
                        AndroidUtilities.hideKeyboard(LocationActivity.this.getParentActivity().getCurrentFocus());
                    }
                }
            });
            locationActivity.searchListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(View view, int i13) {
                    this.f$0.lambda$createView$28(actionBarMenuCreateMenu, view, i13);
                }
            });
        } else {
            z = true;
            if ((messageObject5 != null && !messageObject5.isLiveLocation()) || locationActivity.chatLocation != null) {
                TLRPC.TL_channelLocation tL_channelLocation = locationActivity.chatLocation;
                if (tL_channelLocation != null) {
                    locationActivity.adapter.setChatLocation(tL_channelLocation);
                } else {
                    MessageObject messageObject6 = locationActivity.messageObject;
                    if (messageObject6 != null) {
                        locationActivity.adapter.setMessageObject(messageObject6);
                    }
                }
            }
        }
        MessageObject messageObject7 = locationActivity.messageObject;
        if (messageObject7 != null && locationActivity.locationType == 6) {
            locationActivity.adapter.setMessageObject(messageObject7);
        }
        while (r9 < c) {
            locationActivity.undoView[r9] = new UndoView(context);
            locationActivity.undoView[r9].setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            locationActivity.undoView[r9].setTranslationZ(AndroidUtilities.dp(5.0f));
            locationActivity.mapViewClip.addView(locationActivity.undoView[r9], LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
            r9++;
        }
        final Rect rect3 = rect;
        View view = new View(context) {
            private RectF rect = new RectF();

            @Override
            protected void onDraw(Canvas canvas) {
                LocationActivity.this.shadowDrawable.setBounds(-rect3.left, 0, getMeasuredWidth() + rect3.right, getMeasuredHeight());
                LocationActivity.this.shadowDrawable.draw(canvas);
                if (LocationActivity.this.locationType == 0 || LocationActivity.this.locationType == 1) {
                    int iDp2 = AndroidUtilities.dp(36.0f);
                    this.rect.set((getMeasuredWidth() - iDp2) / 2, rect3.top + AndroidUtilities.dp(10.0f), (getMeasuredWidth() + iDp2) / 2, r1 + AndroidUtilities.dp(4.0f));
                    int themedColor3 = LocationActivity.this.getThemedColor(Theme.key_sheet_scrollUp);
                    Color.alpha(themedColor3);
                    Theme.dialogs_onlineCirclePaint.setColor(themedColor3);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                }
            }
        };
        locationActivity.shadow = view;
        view.setTranslationZ(AndroidUtilities.dp(6.0f));
        locationActivity.mapViewClip.addView(locationActivity.shadow, layoutParams2);
        if (locationActivity.messageObject == null && locationActivity.chatLocation == null && locationActivity.initialLocation != null) {
            locationActivity.userLocationMoved = z;
            ImageView imageView5 = locationActivity.locationButton;
            int i13 = Theme.key_location_actionIcon;
            imageView5.setColorFilter(new PorterDuffColorFilter(locationActivity.getThemedColor(i13), PorterDuff.Mode.MULTIPLY));
            locationActivity.locationButton.setTag(Integer.valueOf(i13));
        }
        nestedFrameLayout.addView(locationActivity.actionBar);
        updateEmptyView();
        return locationActivity.fragmentView;
    }

    public void lambda$createView$0(View view) {
        try {
            TLRPC.GeoPoint geoPoint = this.messageObject.messageOwner.media.geo;
            double d = geoPoint.lat;
            double d2 = geoPoint._long;
            getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$createView$1(View view) {
        showSearchPlacesButton(false);
        this.adapter.searchPlacesWithQuery(null, this.userLocation, true, true);
        this.searchedForCustomLocations = true;
        showResults();
    }

    public void lambda$createView$2(View view) {
        this.mapTypeButton.toggleSubMenu();
    }

    public void lambda$createView$3(int i) {
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

    public void lambda$createView$4(View view) {
        IMapsProvider.IMap iMap;
        Activity parentActivity;
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            showPermissionAlert(false);
            return;
        }
        if (checkGpsEnabled() || this.locationType == 3) {
            if ((this.messageObject != null && this.locationType != 3) || this.chatLocation != null) {
                if (this.myLocation != null && (iMap = this.map) != null) {
                    iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(this.myLocation.getLatitude(), this.myLocation.getLongitude()), this.map.getMaxZoomLevel() - 4.0f));
                }
            } else if (this.myLocation != null && this.map != null) {
                ImageView imageView = this.locationButton;
                int i = Theme.key_location_actionActiveIcon;
                imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i), PorterDuff.Mode.MULTIPLY));
                this.locationButton.setTag(Integer.valueOf(i));
                this.adapter.setCustomLocation(null);
                this.userLocationMoved = false;
                showSearchPlacesButton(false);
                this.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(this.myLocation.getLatitude(), this.myLocation.getLongitude())));
                if (this.searchedForCustomLocations && this.locationType != 8) {
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

    public void lambda$createView$5(View view) {
        this.selectedMarkerId = -1L;
        this.userLocationMoved = true;
        if (fitAllLiveLocations(true)) {
            this.showAllMode = true;
            showShowAllButton(false, true);
        }
    }

    public void lambda$createView$8(View view) {
        if (getParentActivity() == null || this.myLocation == null || !checkGpsEnabled() || this.map == null) {
            return;
        }
        HintView2 hintView2 = this.hintView;
        if (hintView2 != null) {
            hintView2.hide();
        }
        MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
        final LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.dialogId);
        if (this.canUndo) {
            this.undoView[0].hide(true, 1);
        }
        if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
            this.proximityButton.setImageResource(R.drawable.msg_location_alert);
            IMapsProvider.ICircle iCircle = this.proximityCircle;
            if (iCircle != null) {
                iCircle.remove();
                this.proximityCircle = null;
            }
            this.canUndo = true;
            getUndoView().showWithAction(0L, 25, (Object) 0, (Object) null, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$createView$6();
                }
            }, new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$createView$7(sharingLocationInfo);
                }
            });
            return;
        }
        openProximityAlert();
    }

    public void lambda$createView$6() {
        getLocationController().setProximityLocation(this.dialogId, 0, true);
        this.canUndo = false;
    }

    public void lambda$createView$7(LocationController.SharingLocationInfo sharingLocationInfo) {
        this.proximityButton.setImageResource(R.drawable.msg_location_alert2);
        createCircle(sharingLocationInfo.proximityMeters);
        this.canUndo = false;
    }

    public void lambda$createView$10() {
        updateClipView(false);
    }

    public boolean lambda$createView$12(Context context, View view, int i) {
        if (this.locationType == 2) {
            Object item = this.adapter.getItem(i);
            if (item instanceof LiveLocation) {
                final LiveLocation liveLocation = (LiveLocation) item;
                ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout = new ActionBarPopupWindow.ActionBarPopupWindowLayout(context);
                ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem((Context) getParentActivity(), true, true, getResourceProvider());
                actionBarMenuSubItem.setMinimumWidth(AndroidUtilities.dp(200.0f));
                actionBarMenuSubItem.setTextAndIcon(LocaleController.getString(R.string.GetDirections), R.drawable.filled_directions);
                actionBarMenuSubItem.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        this.f$0.lambda$createView$11(liveLocation, view2);
                    }
                });
                actionBarPopupWindowLayout.addView(actionBarMenuSubItem);
                int i2 = -2;
                ActionBarPopupWindow actionBarPopupWindow = new ActionBarPopupWindow(actionBarPopupWindowLayout, i2, i2) {
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
                this.popupWindow.showAtLocation(view, 48, 0, iArr[1] - AndroidUtilities.dp(52.0f));
                this.popupWindow.dimBehind();
                return true;
            }
        }
        return false;
    }

    public void lambda$createView$11(LiveLocation liveLocation, View view) {
        openDirections(liveLocation);
        ActionBarPopupWindow actionBarPopupWindow = this.popupWindow;
        if (actionBarPopupWindow != null) {
            actionBarPopupWindow.dismiss();
        }
    }

    public void lambda$createView$18(View view, int i) {
        MessageObject messageObject;
        final TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        this.selectedMarkerId = -1L;
        int i2 = this.locationType;
        if (i2 == 4) {
            if (i != 1 || (tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) this.adapter.getItem(i)) == null) {
                return;
            }
            if (this.dialogId == 0) {
                this.delegate.didSelectLocation(tL_messageMediaVenue, 4, true, 0, 0L);
                finishFragment();
                return;
            }
            final AlertDialog[] alertDialogArr = {new AlertDialog(getParentActivity(), 3)};
            TLRPC.TL_channels_editLocation tL_channels_editLocation = new TLRPC.TL_channels_editLocation();
            tL_channels_editLocation.address = tL_messageMediaVenue.address;
            tL_channels_editLocation.channel = getMessagesController().getInputChannel(-this.dialogId);
            TLRPC.TL_inputGeoPoint tL_inputGeoPoint = new TLRPC.TL_inputGeoPoint();
            tL_channels_editLocation.geo_point = tL_inputGeoPoint;
            TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
            tL_inputGeoPoint.lat = geoPoint.lat;
            tL_inputGeoPoint._long = geoPoint._long;
            final int iSendRequest = getConnectionsManager().sendRequest(tL_channels_editLocation, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$createView$14(alertDialogArr, tL_messageMediaVenue, tLObject, tL_error);
                }
            });
            alertDialogArr[0].setOnCancelListener(new DialogInterface.OnCancelListener() {
                @Override
                public final void onCancel(DialogInterface dialogInterface) {
                    this.f$0.lambda$createView$15(iSendRequest, dialogInterface);
                }
            });
            showDialog(alertDialogArr[0]);
            return;
        }
        if (i2 == 5) {
            IMapsProvider.IMap iMap = this.map;
            if (iMap != null) {
                IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
                TLRPC.GeoPoint geoPoint2 = this.chatLocation.geo_point;
                iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint2.lat, geoPoint2._long), this.map.getMaxZoomLevel() - 4.0f));
                return;
            }
            return;
        }
        if (i == 1 && (messageObject = this.messageObject) != null && (!messageObject.isLiveLocation() || this.locationType == 6)) {
            IMapsProvider.IMap iMap2 = this.map;
            if (iMap2 != null) {
                IMapsProvider mapsProvider2 = ApplicationLoader.getMapsProvider();
                TLRPC.GeoPoint geoPoint3 = this.messageObject.messageOwner.media.geo;
                iMap2.animateCamera(mapsProvider2.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint3.lat, geoPoint3._long), this.map.getMaxZoomLevel() - 4.0f));
                return;
            }
            return;
        }
        if (i == 1 && this.locationType != 2) {
            if (this.delegate == null || this.userLocation == null) {
                return;
            }
            FrameLayout frameLayout = this.lastPressedMarkerView;
            if (frameLayout != null) {
                frameLayout.callOnClick();
                return;
            }
            final TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
            TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
            tL_messageMediaGeo.geo = tL_geoPoint;
            tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(this.userLocation.getLatitude());
            tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(this.userLocation.getLongitude());
            ChatActivity chatActivity = this.parentFragment;
            if (chatActivity != null && chatActivity.isInScheduleMode()) {
                AlertsCreator.createScheduleDatePickerDialog(getParentActivity(), this.parentFragment.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                    @Override
                    public final void didSelectDate(boolean z, int i3, int i4) {
                        this.f$0.lambda$createView$16(tL_messageMediaGeo, z, i3, i4);
                    }
                });
                return;
            } else {
                this.delegate.didSelectLocation(tL_messageMediaGeo, this.locationType, true, 0, 0L);
                finishFragment();
                return;
            }
        }
        if (this.locationType == 2 && getLocationController().isSharingLocation(this.dialogId) && this.adapter.getItemViewType(i) == 7) {
            getLocationController().removeSharingLocation(this.dialogId);
            this.adapter.notifyDataSetChanged();
            finishFragment();
            return;
        }
        if (this.locationType == 2 && getLocationController().isSharingLocation(this.dialogId) && this.adapter.getItemViewType(i) == 6) {
            openShareLiveLocation(getLocationController().getSharingLocationInfo(this.dialogId).period != Integer.MAX_VALUE, 0);
            return;
        }
        if ((i == 2 && this.locationType == 1) || ((i == 1 && this.locationType == 2) || (i == 3 && this.locationType == 3))) {
            if (getLocationController().isSharingLocation(this.dialogId)) {
                getLocationController().removeSharingLocation(this.dialogId);
                this.adapter.notifyDataSetChanged();
                finishFragment();
                return;
            }
            openShareLiveLocation(false, 0);
            return;
        }
        final Object item = this.adapter.getItem(i);
        if (item instanceof TLRPC.TL_messageMediaVenue) {
            ChatActivity chatActivity2 = this.parentFragment;
            if (chatActivity2 != null && chatActivity2.isInScheduleMode()) {
                AlertsCreator.createScheduleDatePickerDialog(getParentActivity(), this.parentFragment.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                    @Override
                    public final void didSelectDate(boolean z, int i3, int i4) {
                        this.f$0.lambda$createView$17(item, z, i3, i4);
                    }
                });
                return;
            } else {
                this.delegate.didSelectLocation((TLRPC.TL_messageMediaVenue) item, this.locationType, true, 0, 0L);
                finishFragment();
                return;
            }
        }
        if (item instanceof LiveLocation) {
            LiveLocation liveLocation = (LiveLocation) item;
            this.selectedMarkerId = liveLocation.id;
            if (this.showAllMode) {
                this.showAllMode = false;
                updateShowAllButton();
            }
            this.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(liveLocation.marker.getPosition(), this.map.getMaxZoomLevel() - 4.0f));
        }
    }

    public void lambda$createView$14(final AlertDialog[] alertDialogArr, final TLRPC.TL_messageMediaVenue tL_messageMediaVenue, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createView$13(alertDialogArr, tL_messageMediaVenue);
            }
        });
    }

    public void lambda$createView$13(AlertDialog[] alertDialogArr, TLRPC.TL_messageMediaVenue tL_messageMediaVenue) {
        try {
            alertDialogArr[0].dismiss();
        } catch (Throwable unused) {
        }
        alertDialogArr[0] = null;
        this.delegate.didSelectLocation(tL_messageMediaVenue, 4, true, 0, 0L);
        finishFragment();
    }

    public void lambda$createView$15(int i, DialogInterface dialogInterface) {
        getConnectionsManager().cancelRequest(i, true);
    }

    public void lambda$createView$16(TLRPC.TL_messageMediaGeo tL_messageMediaGeo, boolean z, int i, int i2) {
        this.delegate.didSelectLocation(tL_messageMediaGeo, this.locationType, z, i, 0L);
        finishFragment();
    }

    public void lambda$createView$17(Object obj, boolean z, int i, int i2) {
        this.delegate.didSelectLocation((TLRPC.TL_messageMediaVenue) obj, this.locationType, z, i, 0L);
        finishFragment();
    }

    public boolean lambda$createView$19(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEvent2;
        MotionEvent motionEventObtain;
        if (this.yOffset != 0.0f) {
            motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.offsetLocation(0.0f, (-this.yOffset) / 2.0f);
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

    public boolean lambda$createView$20(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
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
                this.animatorSet.playTogether(ObjectAnimator.ofFloat(this.markerImageView, (Property<View, Float>) View.TRANSLATION_Y, this.markerTop - AndroidUtilities.dp(10.0f)));
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
                this.animatorSet.playTogether(ObjectAnimator.ofFloat(this.markerImageView, (Property<View, Float>) View.TRANSLATION_Y, this.markerTop));
                this.animatorSet.start();
                this.adapter.fetchLocationAddress();
            }
            if (motionEvent.getAction() == 2) {
                if (!this.userLocationMoved) {
                    ImageView imageView = this.locationButton;
                    int i = Theme.key_location_actionIcon;
                    imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i), PorterDuff.Mode.MULTIPLY));
                    this.locationButton.setTag(Integer.valueOf(i));
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

    public void lambda$createView$22() {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createView$21();
            }
        });
    }

    public void lambda$createView$21() {
        IMapsProvider.ICameraUpdate iCameraUpdate = this.moveToBounds;
        if (iCameraUpdate != null) {
            this.map.moveCamera(iCameraUpdate);
            this.moveToBounds = null;
        }
    }

    public void lambda$createView$25(final IMapsProvider.IMapView iMapView) {
        try {
            iMapView.onCreate(null);
        } catch (Exception unused) {
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$createView$24(iMapView);
            }
        });
    }

    public void lambda$createView$24(IMapsProvider.IMapView iMapView) {
        if (this.mapView == null || getParentActivity() == null) {
            return;
        }
        try {
            iMapView.onCreate(null);
            ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
            this.mapView.getMapAsync(new Consumer() {
                @Override
                public final void accept(Object obj) {
                    this.f$0.lambda$createView$23((IMapsProvider.IMap) obj);
                }
            });
            this.mapsInitialized = true;
            if (this.onResumeCalled) {
                this.mapView.onResume();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$createView$23(IMapsProvider.IMap iMap) {
        this.map = iMap;
        int mapThemeResId = getMapThemeResId();
        if (mapThemeResId != 0) {
            this.currentMapStyleDark = true;
            this.map.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, mapThemeResId));
        }
        this.map.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
        onMapInit();
    }

    public void lambda$createView$26(ArrayList arrayList) {
        this.searchInProgress = false;
        updateEmptyView();
    }

    public void lambda$createView$28(ActionBarMenu actionBarMenu, View view, int i) {
        float maxZoomLevel;
        float f;
        final TLRPC.TL_messageMediaVenue item = this.searchAdapter.getItem(i);
        if (item != null && item.icon != null && this.locationType == 8 && this.map != null) {
            this.userLocationMoved = true;
            actionBarMenu.closeSearchField(true);
            if ("pin".equals(item.icon)) {
                maxZoomLevel = this.map.getMaxZoomLevel();
                f = 4.0f;
            } else {
                maxZoomLevel = this.map.getMaxZoomLevel();
                f = 9.0f;
            }
            float f2 = maxZoomLevel - f;
            IMapsProvider.IMap iMap = this.map;
            IMapsProvider mapsProvider = ApplicationLoader.getMapsProvider();
            TLRPC.GeoPoint geoPoint = item.geo;
            iMap.animateCamera(mapsProvider.newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), f2));
            Location location = this.userLocation;
            if (location != null) {
                location.setLatitude(item.geo.lat);
                this.userLocation.setLongitude(item.geo._long);
            }
            this.adapter.setCustomLocation(this.userLocation);
            return;
        }
        if (item == null || this.delegate == null) {
            return;
        }
        ChatActivity chatActivity = this.parentFragment;
        if (chatActivity != null && chatActivity.isInScheduleMode()) {
            AlertsCreator.createScheduleDatePickerDialog(getParentActivity(), this.parentFragment.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                @Override
                public final void didSelectDate(boolean z, int i2, int i3) {
                    this.f$0.lambda$createView$27(item, z, i2, i3);
                }
            });
        } else {
            this.delegate.didSelectLocation(item, this.locationType, true, 0, 0L);
            finishFragment();
        }
    }

    public void lambda$createView$27(TLRPC.TL_messageMediaVenue tL_messageMediaVenue, boolean z, int i, int i2) {
        this.delegate.didSelectLocation(tL_messageMediaVenue, this.locationType, z, i, 0L);
        finishFragment();
    }

    private void updateShowAllButton() {
        TLRPC.MessageMedia messageMedia;
        int i;
        if (this.showAllButton == null) {
            return;
        }
        if (this.showAllMode) {
            showShowAllButton(false, true);
            fitAllLiveLocations(true);
            return;
        }
        int currentTime = getConnectionsManager() != null ? getConnectionsManager().getCurrentTime() : 0;
        int size = this.markers.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.Message message = ((LiveLocation) this.markers.get(i3)).object;
            if (message != null && (messageMedia = message.media) != null && ((i = messageMedia.period) == Integer.MAX_VALUE || message.date + i > currentTime)) {
                i2++;
            }
        }
        boolean z = this.markersMap.get(getUserConfig().getClientUserId()) != null;
        if (this.myLocation != null && !z) {
            i2++;
        }
        showShowAllButton(i2 >= 2, true);
    }

    private boolean fitAllLiveLocations(boolean z) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        int i;
        if (this.map == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        int currentTime = getConnectionsManager() != null ? getConnectionsManager().getCurrentTime() : 0;
        int size = this.markers.size();
        for (int i2 = 0; i2 < size; i2++) {
            LiveLocation liveLocation = (LiveLocation) this.markers.get(i2);
            IMapsProvider.IMarker iMarker = liveLocation.marker;
            if (iMarker != null && (message = liveLocation.object) != null && (messageMedia = message.media) != null && ((i = messageMedia.period) == Integer.MAX_VALUE || message.date + i > currentTime)) {
                arrayList.add(iMarker.getPosition());
            }
        }
        boolean z2 = this.markersMap.get(getUserConfig().getClientUserId()) != null;
        Location location = this.myLocation;
        if (location != null && !z2) {
            arrayList.add(new IMapsProvider.LatLng(location.getLatitude(), this.myLocation.getLongitude()));
        }
        if (arrayList.size() < 2) {
            return false;
        }
        try {
            IMapsProvider.ILatLngBoundsBuilder iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder = ApplicationLoader.getMapsProvider().onCreateLatLngBoundsBuilder();
            int size2 = arrayList.size();
            double d = -1.7976931348623157E308d;
            double d2 = Double.MAX_VALUE;
            double d3 = Double.MAX_VALUE;
            int i3 = 0;
            double d4 = -1.7976931348623157E308d;
            while (i3 < size2) {
                IMapsProvider.LatLng latLng = (IMapsProvider.LatLng) arrayList.get(i3);
                iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.include(latLng);
                int i4 = size2;
                double d5 = latLng.latitude;
                if (d5 < d2) {
                    d2 = d5;
                }
                if (d5 > d) {
                    d = d5;
                }
                double d6 = latLng.longitude;
                if (d6 < d3) {
                    d3 = d6;
                }
                if (d6 > d4) {
                    d4 = d6;
                }
                i3++;
                size2 = i4;
            }
            IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng((d2 + d) / 2.0d, (d3 + d4) / 2.0d);
            double radians = Math.toRadians(d - d2) * 6366198.0d;
            double radians2 = Math.toRadians(d4 - d3) * 6366198.0d * Math.cos(Math.toRadians(latLng2.latitude));
            if (radians < 30.0d || radians2 < 30.0d) {
                iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.include(move(latLng2, 15.0d, 15.0d));
                iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.include(move(latLng2, -15.0d, -15.0d));
            }
            IMapsProvider.ICameraUpdate iCameraUpdateNewCameraUpdateLatLngBounds = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.build(), AndroidUtilities.dp(60.0f));
            if (z) {
                this.map.animateCamera(iCameraUpdateNewCameraUpdateLatLngBounds, 500, null);
            } else {
                this.map.moveCamera(iCameraUpdateNewCameraUpdateLatLngBounds);
            }
            return true;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    private void showShowAllButton(final boolean z, boolean z2) {
        Boolean bool = this.shownShowAllButton;
        if (bool == null || bool.booleanValue() != z) {
            this.shownShowAllButton = Boolean.valueOf(z);
            if (!z2) {
                this.showAllButton.setVisibility(z ? 0 : 8);
                this.showAllButton.setAlpha(z ? 1.0f : 0.0f);
                this.showAllButton.setScaleX(z ? 1.0f : 0.7f);
                this.showAllButton.setScaleY(z ? 1.0f : 0.7f);
                return;
            }
            this.showAllButton.setVisibility(0);
            this.showAllButton.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.7f).scaleY(z ? 1.0f : 0.7f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(420L).withEndAction(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$showShowAllButton$29(z);
                }
            }).start();
        }
    }

    public void lambda$showShowAllButton$29(boolean z) {
        if (z) {
            return;
        }
        this.showAllButton.setVisibility(8);
    }

    private boolean isActiveThemeDark() {
        return (getResourceProvider() == null && Theme.getActiveTheme().isDark()) || AndroidUtilities.computePerceivedBrightness(getThemedColor(Theme.key_windowBackgroundWhite)) < 0.721f;
    }

    private int getMapThemeResId() {
        if (AndroidUtilities.computePerceivedBrightness(getThemedColor(Theme.key_windowBackgroundWhite)) < 0.721f) {
            return R.raw.mapstyle_night;
        }
        return 0;
    }

    public void openDirections(LiveLocation liveLocation) {
        double d;
        double d2;
        String str;
        TLRPC.Message message;
        if (liveLocation != null && (message = liveLocation.object) != null) {
            TLRPC.GeoPoint geoPoint = message.media.geo;
            d = geoPoint.lat;
            d2 = geoPoint._long;
        } else {
            MessageObject messageObject = this.messageObject;
            if (messageObject != null) {
                TLRPC.GeoPoint geoPoint2 = messageObject.messageOwner.media.geo;
                d = geoPoint2.lat;
                d2 = geoPoint2._long;
            } else {
                TLRPC.GeoPoint geoPoint3 = this.chatLocation.geo_point;
                d = geoPoint3.lat;
                d2 = geoPoint3._long;
            }
        }
        if (BuildVars.isHuaweiStoreApp()) {
            str = "mapapp://navigation";
        } else {
            str = "http://maps.google.com/maps";
        }
        if (this.myLocation != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str + "?saddr=%f,%f&daddr=%f,%f", Double.valueOf(this.myLocation.getLatitude()), Double.valueOf(this.myLocation.getLongitude()), Double.valueOf(d), Double.valueOf(d2)))));
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        try {
            getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str + "?saddr=&daddr=%f,%f", Double.valueOf(d), Double.valueOf(d2)))));
        } catch (Exception e2) {
            FileLog.e(e2);
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
        if (this.locationType == 3) {
            z = true;
        }
        if (z && (searchButton = this.searchAreaButton) != null && searchButton.getTag() == null && ((location = this.myLocation) == null || (location2 = this.userLocation) == null || location2.distanceTo(location) < 300.0f)) {
            z = false;
        }
        SearchButton searchButton2 = this.searchAreaButton;
        if (searchButton2 != null) {
            if (!z || searchButton2.getTag() == null) {
                if (z || this.searchAreaButton.getTag() != null) {
                    this.searchAreaButton.setTag(z ? 1 : null);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(this.searchAreaButton, (Property<SearchButton, Float>) View.TRANSLATION_X, z ? 0.0f : -AndroidUtilities.dp(80.0f)));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                    animatorSet.start();
                }
            }
        }
    }

    private Bitmap createUserBitmap(LiveLocation liveLocation) {
        Bitmap bitmap = null;
        try {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(AndroidUtilities.dp(62.0f), AndroidUtilities.dp(85.0f), Bitmap.Config.ARGB_8888);
            try {
                bitmapCreateBitmap.eraseColor(0);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                Drawable drawable = ApplicationLoader.applicationContext.getResources().getDrawable(R.drawable.map_pin_photo);
                drawable.setBounds(0, 0, AndroidUtilities.dp(62.0f), AndroidUtilities.dp(85.0f));
                drawable.draw(canvas);
                Paint paint = new Paint(1);
                RectF rectF = new RectF();
                canvas.save();
                canvas.save();
                AvatarDrawable avatarDrawable = new AvatarDrawable();
                TLRPC.User user = liveLocation.user;
                if (user != null) {
                    avatarDrawable.setInfo(this.currentAccount, user);
                } else {
                    TLRPC.Chat chat = liveLocation.chat;
                    if (chat != null) {
                        avatarDrawable.setInfo(this.currentAccount, chat);
                    }
                }
                canvas.translate(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                avatarDrawable.setBounds(0, 0, AndroidUtilities.dp(50.0f), AndroidUtilities.dp(50.0f));
                avatarDrawable.draw(canvas);
                canvas.restore();
                ImageReceiver imageReceiver = liveLocation.avatarReceiver;
                Bitmap bitmap2 = (imageReceiver == null || !imageReceiver.hasImageLoaded()) ? null : liveLocation.avatarReceiver.getBitmap();
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                    BitmapShader bitmapShader = new BitmapShader(bitmap2, tileMode, tileMode);
                    Matrix matrix = new Matrix();
                    float fDp = AndroidUtilities.dp(50.0f) / bitmap2.getWidth();
                    matrix.postTranslate(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f));
                    matrix.postScale(fDp, fDp);
                    paint.setShader(bitmapShader);
                    bitmapShader.setLocalMatrix(matrix);
                    rectF.set(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(56.0f));
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(25.0f), AndroidUtilities.dp(25.0f), paint);
                }
                canvas.restore();
                try {
                    canvas.setBitmap(null);
                    return bitmapCreateBitmap;
                } catch (Exception unused) {
                    return bitmapCreateBitmap;
                }
            } catch (Throwable th) {
                th = th;
                bitmap = bitmapCreateBitmap;
                FileLog.e(th);
                return bitmap;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private long getMessageId(TLRPC.Message message) {
        if (message.from_id != null) {
            return MessageObject.getFromChatId(message);
        }
        return MessageObject.getDialogId(message);
    }

    private void openProximityAlert() {
        IMapsProvider.ICircle iCircle = this.proximityCircle;
        if (iCircle == null) {
            createCircle(500);
        } else {
            this.previousRadius = iCircle.getRadius();
        }
        final TLRPC.User user = DialogObject.isUserDialog(this.dialogId) ? getMessagesController().getUser(Long.valueOf(this.dialogId)) : null;
        ProximitySheet proximitySheet = new ProximitySheet(getParentActivity(), user, new ProximitySheet.onRadiusPickerChange() {
            @Override
            public final boolean run(boolean z, int i) {
                return this.f$0.lambda$openProximityAlert$30(z, i);
            }
        }, new ProximitySheet.onRadiusPickerChange() {
            @Override
            public final boolean run(boolean z, int i) {
                return this.f$0.lambda$openProximityAlert$32(user, z, i);
            }
        }, new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$openProximityAlert$33();
            }
        });
        this.proximitySheet = proximitySheet;
        ((FrameLayout) this.fragmentView).addView(proximitySheet, LayoutHelper.createFrame(-1, -1.0f));
        this.proximitySheet.show();
    }

    public boolean lambda$openProximityAlert$30(boolean z, int i) {
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
            LiveLocation liveLocation = (LiveLocation) this.markers.get(i2);
            if (liveLocation.object != null && !UserObject.isUserSelf(liveLocation.user)) {
                TLRPC.GeoPoint geoPoint = liveLocation.object.media.geo;
                Location location = new Location("network");
                location.setLatitude(geoPoint.lat);
                location.setLongitude(geoPoint._long);
                if (this.myLocation.distanceTo(location) > i) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean lambda$openProximityAlert$32(final TLRPC.User user, boolean z, final int i) {
        if (getLocationController().getSharingLocationInfo(this.dialogId) == null) {
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
            builder.setTitle(LocaleController.getString(R.string.ShareLocationAlertTitle));
            builder.setMessage(LocaleController.getString(R.string.ShareLocationAlertText));
            builder.setPositiveButton(LocaleController.getString(R.string.ShareLocationAlertButton), new AlertDialog.OnButtonClickListener() {
                @Override
                public final void onClick(AlertDialog alertDialog, int i2) {
                    this.f$0.lambda$openProximityAlert$31(user, i, alertDialog, i2);
                }
            });
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            showDialog(builder.create());
            return false;
        }
        this.proximitySheet.setRadiusSet();
        this.proximityButton.setImageResource(R.drawable.msg_location_alert2);
        getUndoView().showWithAction(0L, 24, Integer.valueOf(i), user, (Runnable) null, (Runnable) null);
        getLocationController().setProximityLocation(this.dialogId, i, true);
        return true;
    }

    public void lambda$openProximityAlert$31(TLRPC.User user, int i, AlertDialog alertDialog, int i2) {
        shareLiveLocation(user, 900, i);
    }

    public void lambda$openProximityAlert$33() {
        IMapsProvider.IMap iMap = this.map;
        if (iMap != null) {
            iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
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

    public void openShareLiveLocation(final boolean z, final int i) {
        Activity parentActivity;
        if (this.delegate == null || disablePermissionCheck() || getParentActivity() == null || this.myLocation == null || !checkGpsEnabled()) {
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
                        this.f$0.lambda$openShareLiveLocation$34(z);
                    }
                }, null).show();
                return;
            }
        }
        final TLRPC.User user = DialogObject.isUserDialog(this.dialogId) ? getMessagesController().getUser(Long.valueOf(this.dialogId)) : null;
        showDialog(AlertsCreator.createLocationUpdateDialog(getParentActivity(), z, user, new MessagesStorage.IntCallback() {
            @Override
            public final void run(int i2) {
                this.f$0.lambda$openShareLiveLocation$35(z, user, i, i2);
            }
        }, null));
    }

    public void lambda$openShareLiveLocation$34(boolean z) {
        openShareLiveLocation(z, this.askWithRadius);
    }

    public void lambda$openShareLiveLocation$35(boolean z, TLRPC.User user, int i, int i2) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (z) {
            LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.dialogId);
            if (sharingLocationInfo != null) {
                TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                tL_messages_editMessage.peer = getMessagesController().getInputPeer(sharingLocationInfo.did);
                tL_messages_editMessage.id = sharingLocationInfo.mid;
                tL_messages_editMessage.flags |= 16384;
                TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                tL_messages_editMessage.media = tL_inputMediaGeoLive;
                tL_inputMediaGeoLive.stopped = false;
                tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPoint();
                Location lastKnownLocation = LocationController.getInstance(this.currentAccount).getLastKnownLocation();
                tL_messages_editMessage.media.geo_point.lat = AndroidUtilities.fixLocationCoord(lastKnownLocation.getLatitude());
                tL_messages_editMessage.media.geo_point._long = AndroidUtilities.fixLocationCoord(lastKnownLocation.getLongitude());
                tL_messages_editMessage.media.geo_point.accuracy_radius = (int) lastKnownLocation.getAccuracy();
                TLRPC.InputMedia inputMedia = tL_messages_editMessage.media;
                TLRPC.InputGeoPoint inputGeoPoint = inputMedia.geo_point;
                if (inputGeoPoint.accuracy_radius != 0) {
                    inputGeoPoint.flags |= 1;
                }
                int i3 = sharingLocationInfo.lastSentProximityMeters;
                int i4 = sharingLocationInfo.proximityMeters;
                if (i3 != i4) {
                    inputMedia.proximity_notification_radius = i4;
                    inputMedia.flags |= 8;
                }
                inputMedia.heading = LocationController.getHeading(lastKnownLocation);
                TLRPC.InputMedia inputMedia2 = tL_messages_editMessage.media;
                int i5 = inputMedia2.flags;
                inputMedia2.flags = i5 | 4;
                int i6 = i2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : sharingLocationInfo.period + i2;
                sharingLocationInfo.period = i6;
                inputMedia2.period = i6;
                sharingLocationInfo.stopTime = i2 != Integer.MAX_VALUE ? sharingLocationInfo.stopTime + i2 : Integer.MAX_VALUE;
                inputMedia2.flags = i5 | 6;
                MessageObject messageObject = sharingLocationInfo.messageObject;
                if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
                    messageMedia.period = i6;
                    getMessagesStorage().replaceMessageIfExists(sharingLocationInfo.messageObject.messageOwner, null, null, true);
                }
                getConnectionsManager().sendRequest(tL_messages_editMessage, null);
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
                return;
            }
            return;
        }
        shareLiveLocation(user, i2, i);
    }

    private void shareLiveLocation(TLRPC.User user, int i, int i2) {
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(this.myLocation.getLatitude());
        tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(this.myLocation.getLongitude());
        tL_messageMediaGeoLive.heading = LocationController.getHeading(this.myLocation);
        int i3 = tL_messageMediaGeoLive.flags;
        tL_messageMediaGeoLive.period = i;
        tL_messageMediaGeoLive.proximity_notification_radius = i2;
        tL_messageMediaGeoLive.flags = i3 | 9;
        this.delegate.didSelectLocation(tL_messageMediaGeoLive, this.locationType, true, 0, 0L);
        if (i2 > 0) {
            this.proximitySheet.setRadiusSet();
            this.proximityButton.setImageResource(R.drawable.msg_location_alert2);
            ProximitySheet proximitySheet = this.proximitySheet;
            if (proximitySheet != null) {
                proximitySheet.dismiss();
            }
            getUndoView().showWithAction(0L, 24, Integer.valueOf(i2), user, (Runnable) null, (Runnable) null);
            return;
        }
        finishFragment();
    }

    private Bitmap createPlaceBitmap(int i) {
        Bitmap bitmap = this.bitmapCache[i % 7];
        if (bitmap != null) {
            return bitmap;
        }
        try {
            Paint paint = new Paint(1);
            paint.setColor(-1);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            paint.setColor(LocationCell.getColorForIndex(i));
            canvas.drawCircle(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f), paint);
            canvas.setBitmap(null);
            this.bitmapCache[i % 7] = bitmapCreateBitmap;
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            FileLog.e(th);
            return null;
        }
    }

    public void updatePlacesMarkers(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        int size = this.placeMarkers.size();
        for (int i = 0; i < size; i++) {
            ((VenueLocation) this.placeMarkers.get(i)).marker.remove();
        }
        this.placeMarkers.clear();
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) arrayList.get(i2);
            try {
                IMapsProvider.IMarkerOptions iMarkerOptionsOnCreateMarkerOptions = ApplicationLoader.getMapsProvider().onCreateMarkerOptions();
                TLRPC.GeoPoint geoPoint = tL_messageMediaVenue.geo;
                IMapsProvider.IMarkerOptions iMarkerOptionsPosition = iMarkerOptionsOnCreateMarkerOptions.position(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                iMarkerOptionsPosition.icon(createPlaceBitmap(i2));
                iMarkerOptionsPosition.anchor(0.5f, 0.5f);
                iMarkerOptionsPosition.title(tL_messageMediaVenue.title);
                iMarkerOptionsPosition.snippet(tL_messageMediaVenue.address);
                VenueLocation venueLocation = new VenueLocation();
                venueLocation.num = i2;
                IMapsProvider.IMarker iMarkerAddMarker = this.map.addMarker(iMarkerOptionsPosition);
                venueLocation.marker = iMarkerAddMarker;
                venueLocation.venue = tL_messageMediaVenue;
                iMarkerAddMarker.setTag(venueLocation);
                this.placeMarkers.add(venueLocation);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    private void setupAvatarReceiver(final LiveLocation liveLocation) {
        if (liveLocation.avatarReceiver != null) {
            return;
        }
        TLRPC.User user = liveLocation.user;
        TLRPC.Chat chat = liveLocation.chat;
        if (user == null && chat == 0) {
            return;
        }
        AvatarDrawable avatarDrawable = new AvatarDrawable();
        if (user != null) {
            avatarDrawable.setInfo(this.currentAccount, user);
        } else {
            avatarDrawable.setInfo(this.currentAccount, chat);
        }
        ImageReceiver imageReceiver = new ImageReceiver();
        imageReceiver.setCurrentAccount(this.currentAccount);
        imageReceiver.setDelegate(new ImageReceiver.ImageReceiverDelegate() {
            @Override
            public final void didSetImage(ImageReceiver imageReceiver2, boolean z, boolean z2, boolean z3) {
                this.f$0.lambda$setupAvatarReceiver$36(liveLocation, imageReceiver2, z, z2, z3);
            }

            @Override
            public void didSetImageBitmap(int i, String str, Drawable drawable) {
                ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
            }

            @Override
            public void onAnimationReady(ImageReceiver imageReceiver2) {
                ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver2);
            }
        });
        imageReceiver.onAttachedToWindow();
        if (user == null) {
            user = chat;
        }
        imageReceiver.setForUserOrChat(user, avatarDrawable);
        liveLocation.avatarReceiver = imageReceiver;
    }

    public void lambda$setupAvatarReceiver$36(LiveLocation liveLocation, ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        Bitmap bitmapCreateUserBitmap;
        if (!z || z2 || liveLocation.marker == null || (bitmapCreateUserBitmap = createUserBitmap(liveLocation)) == null) {
            return;
        }
        liveLocation.marker.setIcon(bitmapCreateUserBitmap);
    }

    private LiveLocation addUserMarker(TLRPC.Message message) {
        Location location;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
        LiveLocation liveLocation = (LiveLocation) this.markersMap.get(MessageObject.getFromChatId(message));
        if (liveLocation == null) {
            liveLocation = new LiveLocation();
            liveLocation.object = message;
            if (message.from_id instanceof TLRPC.TL_peerUser) {
                liveLocation.user = getMessagesController().getUser(Long.valueOf(liveLocation.object.from_id.user_id));
                liveLocation.id = liveLocation.object.from_id.user_id;
            } else {
                long dialogId = MessageObject.getDialogId(message);
                if (DialogObject.isUserDialog(dialogId)) {
                    liveLocation.user = getMessagesController().getUser(Long.valueOf(dialogId));
                } else {
                    liveLocation.chat = getMessagesController().getChat(Long.valueOf(-dialogId));
                }
                liveLocation.id = dialogId;
            }
            setupAvatarReceiver(liveLocation);
            try {
                IMapsProvider.IMarkerOptions iMarkerOptionsPosition = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
                Bitmap bitmapCreateUserBitmap = createUserBitmap(liveLocation);
                if (bitmapCreateUserBitmap != null) {
                    iMarkerOptionsPosition.icon(bitmapCreateUserBitmap);
                    iMarkerOptionsPosition.anchor(0.5f, 0.907f);
                    liveLocation.marker = this.map.addMarker(iMarkerOptionsPosition);
                    if (!UserObject.isUserSelf(liveLocation.user)) {
                        IMapsProvider.IMarkerOptions iMarkerOptionsFlat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                        iMarkerOptionsFlat.anchor(0.5f, 0.5f);
                        IMapsProvider.IMarker iMarkerAddMarker = this.map.addMarker(iMarkerOptionsFlat);
                        liveLocation.directionMarker = iMarkerAddMarker;
                        int i = message.media.heading;
                        if (i != 0) {
                            iMarkerAddMarker.setRotation(i);
                            liveLocation.directionMarker.setIcon(R.drawable.map_pin_cone2);
                            liveLocation.hasRotation = true;
                        } else {
                            iMarkerAddMarker.setRotation(0);
                            liveLocation.directionMarker.setIcon(R.drawable.map_pin_circle);
                            liveLocation.hasRotation = false;
                        }
                    }
                    this.markers.add(liveLocation);
                    this.markersMap.put(liveLocation.id, liveLocation);
                    LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.dialogId);
                    if (liveLocation.id == getUserConfig().getClientUserId() && sharingLocationInfo != null && liveLocation.object.id == sharingLocationInfo.mid && (location = this.myLocation) != null) {
                        liveLocation.marker.setPosition(new IMapsProvider.LatLng(location.getLatitude(), this.myLocation.getLongitude()));
                    }
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        } else {
            liveLocation.object = message;
            liveLocation.marker.setPosition(latLng);
            if (this.selectedMarkerId == liveLocation.id) {
                this.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(liveLocation.marker.getPosition()));
            }
        }
        ProximitySheet proximitySheet = this.proximitySheet;
        if (proximitySheet != null) {
            proximitySheet.updateText(true, true);
        }
        updateShowAllButton();
        return liveLocation;
    }

    private LiveLocation addUserMarker(TLRPC.TL_channelLocation tL_channelLocation) {
        TLRPC.GeoPoint geoPoint = tL_channelLocation.geo_point;
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
        LiveLocation liveLocation = new LiveLocation();
        if (DialogObject.isUserDialog(this.dialogId)) {
            liveLocation.user = getMessagesController().getUser(Long.valueOf(this.dialogId));
        } else {
            liveLocation.chat = getMessagesController().getChat(Long.valueOf(-this.dialogId));
        }
        liveLocation.id = this.dialogId;
        setupAvatarReceiver(liveLocation);
        try {
            IMapsProvider.IMarkerOptions iMarkerOptionsPosition = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng);
            Bitmap bitmapCreateUserBitmap = createUserBitmap(liveLocation);
            if (bitmapCreateUserBitmap != null) {
                iMarkerOptionsPosition.icon(bitmapCreateUserBitmap);
                iMarkerOptionsPosition.anchor(0.5f, 0.907f);
                liveLocation.marker = this.map.addMarker(iMarkerOptionsPosition);
                if (!UserObject.isUserSelf(liveLocation.user)) {
                    IMapsProvider.IMarkerOptions iMarkerOptionsFlat = ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).flat(true);
                    iMarkerOptionsFlat.icon(R.drawable.map_pin_circle);
                    iMarkerOptionsFlat.anchor(0.5f, 0.5f);
                    liveLocation.directionMarker = this.map.addMarker(iMarkerOptionsFlat);
                }
                this.markers.add(liveLocation);
                this.markersMap.put(liveLocation.id, liveLocation);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        return liveLocation;
    }

    private void onMapInit() {
        LocationController.SharingLocationInfo sharingLocationInfo;
        int i;
        if (this.map == null) {
            return;
        }
        this.mapView.getView().animate().alpha(1.0f).setStartDelay(200L).setDuration(100L).start();
        final float minZoomLevel = this.initialMaxZoom ? this.map.getMinZoomLevel() + 4.0f : this.map.getMaxZoomLevel() - 4.0f;
        TLRPC.TL_channelLocation tL_channelLocation = this.chatLocation;
        if (tL_channelLocation != null) {
            this.map.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(addUserMarker(tL_channelLocation).marker.getPosition(), minZoomLevel));
        } else {
            MessageObject messageObject = this.messageObject;
            if (messageObject != null) {
                if (messageObject.isLiveLocation()) {
                    LiveLocation liveLocationAddUserMarker = addUserMarker(this.messageObject.messageOwner);
                    if (!getRecentLocations()) {
                        this.map.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(liveLocationAddUserMarker.marker.getPosition(), minZoomLevel));
                    }
                } else {
                    IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(this.userLocation.getLatitude(), this.userLocation.getLongitude());
                    try {
                        this.map.addMarker(ApplicationLoader.getMapsProvider().onCreateMarkerOptions().position(latLng).icon(R.drawable.map_pin2));
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                    this.map.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, minZoomLevel));
                    this.firstFocus = false;
                    getRecentLocations();
                }
            } else {
                Location location = new Location("network");
                this.userLocation = location;
                TLRPC.TL_channelLocation tL_channelLocation2 = this.initialLocation;
                if (tL_channelLocation2 != null) {
                    TLRPC.GeoPoint geoPoint = tL_channelLocation2.geo_point;
                    this.map.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long), minZoomLevel));
                    this.userLocation.setLatitude(this.initialLocation.geo_point.lat);
                    this.userLocation.setLongitude(this.initialLocation.geo_point._long);
                    this.userLocation.setAccuracy(this.initialLocation.geo_point.accuracy_radius);
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
            FileLog.e((Throwable) e2, false);
        }
        this.map.getUiSettings().setMyLocationButtonEnabled(false);
        this.map.getUiSettings().setZoomControlsEnabled(false);
        this.map.getUiSettings().setCompassEnabled(false);
        this.map.setOnCameraMoveStartedListener(new IMapsProvider.OnCameraMoveStartedListener() {
            @Override
            public final void onCameraMoveStarted(int i2) {
                this.f$0.lambda$onMapInit$37(i2);
            }
        });
        this.map.setOnMyLocationChangeListener(new Consumer() {
            @Override
            public final void accept(Object obj) {
                this.f$0.lambda$onMapInit$38((Location) obj);
            }
        });
        this.map.setOnMarkerClickListener(new IMapsProvider.OnMarkerClickListener() {
            @Override
            public final boolean onClick(IMapsProvider.IMarker iMarker) {
                return this.f$0.lambda$onMapInit$39(minZoomLevel, iMarker);
            }
        });
        this.map.setOnCameraMoveListener(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onMapInit$40();
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

    public void lambda$onMapInit$37(int i) {
        View childAt;
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder;
        if (i == 1) {
            showSearchPlacesButton(true);
            removeInfoView();
            this.selectedMarkerId = -1L;
            if (this.showAllMode) {
                this.showAllMode = false;
                updateShowAllButton();
            }
            if (this.scrolling) {
                return;
            }
            int i2 = this.locationType;
            if ((i2 == 0 || i2 == 1) && this.listView.getChildCount() > 0 && (childAt = this.listView.getChildAt(0)) != null && (viewHolderFindContainingViewHolder = this.listView.findContainingViewHolder(childAt)) != null && viewHolderFindContainingViewHolder.getAdapterPosition() == 0) {
                int iDp = this.locationType == 0 ? 0 : AndroidUtilities.dp(66.0f);
                int top = childAt.getTop();
                if (top < (-iDp)) {
                    IMapsProvider.CameraPosition cameraPosition = this.map.getCameraPosition();
                    this.forceUpdate = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
                    this.listView.smoothScrollBy(0, top + iDp);
                }
            }
        }
    }

    public void lambda$onMapInit$38(Location location) {
        positionMarker(location);
        getLocationController().setMapLocation(location, this.isFirstLocation);
        this.isFirstLocation = false;
    }

    public boolean lambda$onMapInit$39(float f, IMapsProvider.IMarker iMarker) {
        if (!(iMarker.getTag() instanceof VenueLocation)) {
            return true;
        }
        this.markerImageView.setVisibility(4);
        if (!this.userLocationMoved) {
            ImageView imageView = this.locationButton;
            int i = Theme.key_location_actionIcon;
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(i), PorterDuff.Mode.MULTIPLY));
            this.locationButton.setTag(Integer.valueOf(i));
            this.userLocationMoved = true;
        }
        int i2 = 0;
        while (true) {
            if (i2 >= this.markers.size()) {
                break;
            }
            LiveLocation liveLocation = (LiveLocation) this.markers.get(i2);
            if (liveLocation == null || liveLocation.marker != iMarker) {
                i2++;
            } else {
                this.selectedMarkerId = liveLocation.id;
                if (this.showAllMode) {
                    this.showAllMode = false;
                    updateShowAllButton();
                }
                this.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(liveLocation.marker.getPosition(), f));
            }
        }
        this.overlayView.addInfoView(iMarker);
        return true;
    }

    public void lambda$onMapInit$40() {
        MapOverlayView mapOverlayView = this.overlayView;
        if (mapOverlayView != null) {
            mapOverlayView.updatePositions();
        }
    }

    private boolean checkGpsEnabled() {
        if (disablePermissionCheck()) {
            return false;
        }
        if (!getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
            return true;
        }
        try {
            if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                builder.setTopAnimation(R.raw.permission_request_location, 72, false, getThemedColor(Theme.key_dialogTopBackground));
                builder.setMessage(LocaleController.getString(R.string.GpsDisabledAlertText));
                builder.setPositiveButton(LocaleController.getString(R.string.ConnectingToProxyEnable), new AlertDialog.OnButtonClickListener() {
                    @Override
                    public final void onClick(AlertDialog alertDialog, int i) {
                        this.f$0.lambda$checkGpsEnabled$41(alertDialog, i);
                    }
                });
                builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                showDialog(builder.create());
                return false;
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        return true;
    }

    public void lambda$checkGpsEnabled$41(AlertDialog alertDialog, int i) {
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
        List<IMapsProvider.PatternItem> listAsList = Arrays.asList(new IMapsProvider.PatternItem.Gap(20), new IMapsProvider.PatternItem.Dash(20));
        IMapsProvider.ICircleOptions iCircleOptionsOnCreateCircleOptions = ApplicationLoader.getMapsProvider().onCreateCircleOptions();
        iCircleOptionsOnCreateCircleOptions.center(new IMapsProvider.LatLng(this.myLocation.getLatitude(), this.myLocation.getLongitude()));
        iCircleOptionsOnCreateCircleOptions.radius(i);
        if (isActiveThemeDark()) {
            iCircleOptionsOnCreateCircleOptions.strokeColor(-1771658281);
            iCircleOptionsOnCreateCircleOptions.fillColor(476488663);
        } else {
            iCircleOptionsOnCreateCircleOptions.strokeColor(-1774024971);
            iCircleOptionsOnCreateCircleOptions.fillColor(474121973);
        }
        iCircleOptionsOnCreateCircleOptions.strokePattern(listAsList);
        iCircleOptionsOnCreateCircleOptions.strokeWidth(2);
        this.proximityCircle = this.map.addCircle(iCircleOptionsOnCreateCircleOptions);
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
        builder.setTopAnimation(R.raw.permission_request_location, 72, false, getThemedColor(Theme.key_dialogTopBackground));
        if (z) {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationNavigation)));
        } else {
            builder.setMessage(AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends)));
        }
        builder.setNegativeButton(LocaleController.getString(R.string.PermissionOpenSettings), new AlertDialog.OnButtonClickListener() {
            @Override
            public final void onClick(AlertDialog alertDialog, int i) {
                this.f$0.lambda$showPermissionAlert$42(alertDialog, i);
            }
        });
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        showDialog(builder.create());
    }

    public void lambda$showPermissionAlert$42(AlertDialog alertDialog, int i) {
        if (getParentActivity() == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(Uri.parse("package:" + ApplicationLoader.applicationContext.getPackageName()));
            getParentActivity().startActivity(intent);
        } catch (Exception e) {
            FileLog.e(e);
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
            frameLayout.addView(this.mapView.getView(), 0, LayoutHelper.createFrame(-1, this.overScrollHeight + AndroidUtilities.dp(10.0f), 51));
            MapOverlayView mapOverlayView = this.overlayView;
            if (mapOverlayView != null) {
                try {
                    if (mapOverlayView.getParent() instanceof ViewGroup) {
                        ((ViewGroup) this.overlayView.getParent()).removeView(this.overlayView);
                    }
                } catch (Exception unused2) {
                }
                this.mapViewClip.addView(this.overlayView, 1, LayoutHelper.createFrame(-1, this.overScrollHeight + AndroidUtilities.dp(10.0f), 51));
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
            this.hintView.setText(LocaleController.formatString("ProximityTooltioUser", R.string.ProximityTooltioUser, UserObject.getFirstName(getMessagesController().getUser(Long.valueOf(this.dialogId)))));
        } else {
            this.hintView.setText(LocaleController.getString(R.string.ProximityTooltioGroup));
        }
        this.hintView.show();
    }

    private void showResults() {
        if (this.adapter.getItemCount() != 0 && this.layoutManager.findFirstVisibleItemPosition() == 0) {
            int iDp = AndroidUtilities.dp(258.0f) + this.listView.getChildAt(0).getTop();
            if (iDp < 0 || iDp > AndroidUtilities.dp(258.0f)) {
                return;
            }
            this.listView.smoothScrollBy(0, iDp);
        }
    }

    public void updateClipView(boolean z) {
        int y;
        int iMin;
        FrameLayout.LayoutParams layoutParams;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(0);
        if (viewHolderFindViewHolderForAdapterPosition != null) {
            y = (int) viewHolderFindViewHolderForAdapterPosition.itemView.getY();
            iMin = this.overScrollHeight + Math.min(y, 0);
        } else {
            y = -this.mapViewClip.getMeasuredHeight();
            iMin = 0;
        }
        if (((FrameLayout.LayoutParams) this.mapViewClip.getLayoutParams()) != null) {
            if (iMin <= 0) {
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
            this.mapViewClip.setTranslationY(Math.min(0, y));
            int i = -y;
            int i2 = i / 2;
            this.mapView.getView().setTranslationY(Math.max(0, i2));
            MapOverlayView mapOverlayView3 = this.overlayView;
            if (mapOverlayView3 != null) {
                mapOverlayView3.setTranslationY(Math.max(0, i2));
            }
            int measuredHeight = this.overScrollHeight - this.mapTypeButton.getMeasuredHeight();
            int i3 = this.locationType;
            float fMin = Math.min(measuredHeight - AndroidUtilities.dp(64 + ((i3 == 0 || i3 == 1) ? 30 : 10)), i);
            this.mapTypeButton.setTranslationY(fMin);
            this.proximityButton.setTranslationY(fMin);
            HintView2 hintView2 = this.hintView;
            if (hintView2 != null) {
                hintView2.setTranslationY(fMin);
            }
            SearchButton searchButton = this.searchAreaButton;
            if (searchButton != null) {
                searchButton.setTranslation(fMin);
            }
            View view = this.markerImageView;
            if (view != null) {
                int iDp = (i - AndroidUtilities.dp(view.getTag() == null ? 48.0f : 69.0f)) + (iMin / 2);
                this.markerTop = iDp;
                view.setTranslationY(iDp);
            }
            if (z) {
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.mapView.getView().getLayoutParams();
            if (layoutParams2 != null && layoutParams2.height != this.overScrollHeight + AndroidUtilities.dp(10.0f)) {
                layoutParams2.height = this.overScrollHeight + AndroidUtilities.dp(10.0f);
                IMapsProvider.IMap iMap = this.map;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                this.mapView.getView().setLayoutParams(layoutParams2);
            }
            MapOverlayView mapOverlayView4 = this.overlayView;
            if (mapOverlayView4 == null || (layoutParams = (FrameLayout.LayoutParams) mapOverlayView4.getLayoutParams()) == null || layoutParams.height == this.overScrollHeight + AndroidUtilities.dp(10.0f)) {
                return;
            }
            layoutParams.height = this.overScrollHeight + AndroidUtilities.dp(10.0f);
            this.overlayView.setLayoutParams(layoutParams);
        }
    }

    public void fixLayoutInternal(boolean z) {
        FrameLayout.LayoutParams layoutParams;
        if (this.listView != null) {
            int currentActionBarHeight = (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + ActionBar.getCurrentActionBarHeight();
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            if (measuredHeight == 0) {
                return;
            }
            int i = this.locationType;
            if (i != 6 && i == 2) {
                this.overScrollHeight = (measuredHeight - AndroidUtilities.dp(73.0f)) - currentActionBarHeight;
            } else {
                this.overScrollHeight = (measuredHeight - AndroidUtilities.dp(66.0f)) - currentActionBarHeight;
            }
            SharedMediaLayout sharedMediaLayout = this.sharedMediaLayout;
            if (sharedMediaLayout != null && sharedMediaLayout.getStoriesCount(8) > 0) {
                this.overScrollHeight -= AndroidUtilities.dp(200.0f);
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
                layoutParams5.height = this.overScrollHeight + AndroidUtilities.dp(10.0f);
                IMapsProvider.IMap iMap = this.map;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                this.mapView.getView().setLayoutParams(layoutParams5);
            }
            MapOverlayView mapOverlayView = this.overlayView;
            if (mapOverlayView != null && (layoutParams = (FrameLayout.LayoutParams) mapOverlayView.getLayoutParams()) != null) {
                layoutParams.height = this.overScrollHeight + AndroidUtilities.dp(10.0f);
                this.overlayView.setLayoutParams(layoutParams);
            }
            this.adapter.notifyDataSetChanged();
            if (z) {
                int i2 = this.locationType;
                final int i3 = i2 == 3 ? 73 : (i2 == 1 || i2 == 2) ? 66 : 0;
                this.layoutManager.scrollToPositionWithOffset(0, -AndroidUtilities.dp(i3));
                updateClipView(false);
                this.listView.post(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$fixLayoutInternal$43(i3);
                    }
                });
                return;
            }
            updateClipView(false);
        }
    }

    public void lambda$fixLayoutInternal$43(int i) {
        this.layoutManager.scrollToPositionWithOffset(0, -AndroidUtilities.dp(i));
        updateClipView(false);
    }

    private Location getLastLocation() {
        LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        List<String> providers = locationManager.getProviders(true);
        Location lastKnownLocation = null;
        for (int size = providers.size() - 1; size >= 0; size--) {
            lastKnownLocation = locationManager.getLastKnownLocation(providers.get(size));
            if (lastKnownLocation != null) {
                break;
            }
        }
        return lastKnownLocation;
    }

    private void positionMarker(Location location) {
        int i;
        if (location == null) {
            return;
        }
        this.myLocation = new Location(location);
        LiveLocation liveLocation = (LiveLocation) this.markersMap.get(getUserConfig().getClientUserId());
        LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.dialogId);
        if (liveLocation != null && sharingLocationInfo != null && liveLocation.object.id == sharingLocationInfo.mid) {
            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            liveLocation.marker.setPosition(latLng);
            IMapsProvider.IMarker iMarker = liveLocation.directionMarker;
            if (iMarker != null) {
                iMarker.setPosition(latLng);
            }
            if (this.selectedMarkerId == liveLocation.id) {
                this.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(liveLocation.marker.getPosition()));
            }
        }
        if (this.messageObject == null && this.chatLocation == null && this.map != null) {
            IMapsProvider.LatLng latLng2 = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            LocationActivityAdapter locationActivityAdapter = this.adapter;
            if (locationActivityAdapter != null) {
                if (!this.searchedForCustomLocations && (i = this.locationType) != 4 && i != 8) {
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
        updateShowAllButton();
    }

    public void setMessageObject(MessageObject messageObject) {
        this.messageObject = messageObject;
        this.dialogId = messageObject.getDialogId();
    }

    public void setChatLocation(long j, TLRPC.TL_channelLocation tL_channelLocation) {
        this.dialogId = -j;
        this.chatLocation = tL_channelLocation;
    }

    public void setDialogId(long j) {
        this.dialogId = j;
    }

    public void setInitialLocation(TLRPC.TL_channelLocation tL_channelLocation) {
        this.initialLocation = tL_channelLocation;
    }

    private static IMapsProvider.LatLng move(IMapsProvider.LatLng latLng, double d, double d2) {
        double dMeterToLongitude = meterToLongitude(d2, latLng.latitude);
        return new IMapsProvider.LatLng(latLng.latitude + meterToLatitude(d), latLng.longitude + dMeterToLongitude);
    }

    private static double meterToLongitude(double d, double d2) {
        return Math.toDegrees(d / (Math.cos(Math.toRadians(d2)) * 6366198.0d));
    }

    private static double meterToLatitude(double d) {
        return Math.toDegrees(d / 6366198.0d);
    }

    private void fetchRecentLocations(ArrayList arrayList) {
        IMapsProvider.ILatLngBoundsBuilder iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder = this.firstFocus ? ApplicationLoader.getMapsProvider().onCreateLatLngBoundsBuilder() : null;
        int currentTime = getConnectionsManager().getCurrentTime();
        for (int i = 0; i < arrayList.size(); i++) {
            TLRPC.Message message = (TLRPC.Message) arrayList.get(i);
            int i2 = message.date;
            TLRPC.MessageMedia messageMedia = message.media;
            int i3 = messageMedia.period;
            if (i2 + i3 > currentTime || i3 == Integer.MAX_VALUE) {
                if (iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder != null) {
                    TLRPC.GeoPoint geoPoint = messageMedia.geo;
                    iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.include(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                }
                addUserMarker(message);
                if (this.proximityButton.getVisibility() != 8 && MessageObject.getFromChatId(message) != getUserConfig().getClientUserId()) {
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
        if (iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder != null) {
            if (this.firstFocus) {
                this.listView.smoothScrollBy(0, AndroidUtilities.dp(99.0f));
            }
            this.firstFocus = false;
            this.adapter.setLiveLocations(this.markers);
            if (this.messageObject.isLiveLocation()) {
                try {
                    IMapsProvider.LatLng center = iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.build().getCenter();
                    IMapsProvider.LatLng latLngMove = move(center, 100.0d, 100.0d);
                    iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.include(move(center, -100.0d, -100.0d));
                    iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.include(latLngMove);
                    IMapsProvider.ILatLngBounds iLatLngBoundsBuild = iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.build();
                    if (arrayList.size() > 1) {
                        try {
                            IMapsProvider.ICameraUpdate iCameraUpdateNewCameraUpdateLatLngBounds = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(iLatLngBoundsBuild, AndroidUtilities.dp(113.0f));
                            this.moveToBounds = iCameraUpdateNewCameraUpdateLatLngBounds;
                            this.map.moveCamera(iCameraUpdateNewCameraUpdateLatLngBounds);
                            this.moveToBounds = null;
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    private void moveToBounds(int i, boolean z, boolean z2) {
        IMapsProvider.ILatLngBoundsBuilder iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder = ApplicationLoader.getMapsProvider().onCreateLatLngBoundsBuilder();
        iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.include(new IMapsProvider.LatLng(this.myLocation.getLatitude(), this.myLocation.getLongitude()));
        try {
            if (z) {
                int iMax = Math.max(i, 250);
                IMapsProvider.LatLng center = iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.build().getCenter();
                double d = iMax;
                IMapsProvider.LatLng latLngMove = move(center, d, d);
                double d2 = -iMax;
                iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.include(move(center, d2, d2));
                iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.include(latLngMove);
                IMapsProvider.ILatLngBounds iLatLngBoundsBuild = iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.build();
                try {
                    this.map.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), (int) ((this.proximitySheet.getCustomView().getMeasuredHeight() - AndroidUtilities.dp(40.0f)) + this.mapViewClip.getTranslationY()));
                    if (z2) {
                        this.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(iLatLngBoundsBuild, 0), 500, null);
                    } else {
                        this.map.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(iLatLngBoundsBuild, 0));
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            } else {
                int currentTime = getConnectionsManager().getCurrentTime();
                int size = this.markers.size();
                for (int i2 = 0; i2 < size; i2++) {
                    TLRPC.Message message = ((LiveLocation) this.markers.get(i2)).object;
                    int i3 = message.date;
                    TLRPC.MessageMedia messageMedia = message.media;
                    if (i3 + messageMedia.period > currentTime) {
                        TLRPC.GeoPoint geoPoint = messageMedia.geo;
                        iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.include(new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long));
                    }
                }
                IMapsProvider.LatLng center2 = iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.build().getCenter();
                IMapsProvider.LatLng latLngMove2 = move(center2, 100.0d, 100.0d);
                iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.include(move(center2, -100.0d, -100.0d));
                iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.include(latLngMove2);
                IMapsProvider.ILatLngBounds iLatLngBoundsBuild2 = iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.build();
                try {
                    this.map.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), this.proximitySheet.getCustomView().getMeasuredHeight() - AndroidUtilities.dp(100.0f));
                    this.map.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(iLatLngBoundsBuild2, 0));
                } catch (Exception e2) {
                    FileLog.e(e2);
                }
            }
        } catch (Exception unused) {
        }
    }

    private boolean getRecentLocations() {
        ArrayList arrayList = (ArrayList) getLocationController().locationsCache.get(this.messageObject.getDialogId());
        if (arrayList == null || !arrayList.isEmpty()) {
            arrayList = null;
        } else {
            fetchRecentLocations(arrayList);
        }
        if (DialogObject.isChatDialog(this.dialogId)) {
            TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(-this.dialogId));
            if (ChatObject.isChannel(chat) && !chat.megagroup) {
                return false;
            }
        }
        TLRPC.TL_messages_getRecentLocations tL_messages_getRecentLocations = new TLRPC.TL_messages_getRecentLocations();
        final long dialogId = this.messageObject.getDialogId();
        tL_messages_getRecentLocations.peer = getMessagesController().getInputPeer(dialogId);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$getRecentLocations$46(dialogId, tLObject, tL_error);
            }
        });
        return arrayList != null;
    }

    public void lambda$getRecentLocations$46(final long j, final TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject != null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$getRecentLocations$45(tLObject, j);
                }
            });
        }
    }

    public void lambda$getRecentLocations$45(TLObject tLObject, long j) {
        if (this.map == null) {
            return;
        }
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        int i = 0;
        while (i < messages_messages.messages.size()) {
            if (!(messages_messages.messages.get(i).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                messages_messages.messages.remove(i);
                i--;
            }
            i++;
        }
        getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
        getMessagesController().putUsers(messages_messages.users, false);
        getMessagesController().putChats(messages_messages.chats, false);
        getLocationController().locationsCache.put(j, messages_messages.messages);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, Long.valueOf(j));
        fetchRecentLocations(messages_messages.messages);
        getLocationController().markLiveLoactionsAsRead(this.dialogId);
        if (this.markAsReadRunnable == null) {
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$getRecentLocations$44();
                }
            };
            this.markAsReadRunnable = runnable;
            AndroidUtilities.runOnUIThread(runnable, 5000L);
        }
    }

    public void lambda$getRecentLocations$44() {
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
            removeSelfFromStack(true);
            return;
        }
        if (i == NotificationCenter.locationPermissionGranted) {
            this.locationDenied = false;
            LocationActivityAdapter locationActivityAdapter3 = this.adapter;
            if (locationActivityAdapter3 != null) {
                locationActivityAdapter3.setMyLocationDenied(false, false);
            }
            IMapsProvider.IMap iMap = this.map;
            if (iMap != null) {
                try {
                    iMap.setMyLocationEnabled(true);
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            }
            return;
        }
        if (i == NotificationCenter.locationPermissionDenied) {
            this.locationDenied = true;
            LocationActivityAdapter locationActivityAdapter4 = this.adapter;
            if (locationActivityAdapter4 != null) {
                locationActivityAdapter4.setMyLocationDenied(true, false);
                return;
            }
            return;
        }
        if (i == NotificationCenter.liveLocationsChanged) {
            LocationActivityAdapter locationActivityAdapter5 = this.adapter;
            if (locationActivityAdapter5 != null) {
                locationActivityAdapter5.notifyDataSetChanged();
            }
            updateShowAllButton();
            return;
        }
        if (i == NotificationCenter.didReceiveNewMessages) {
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
                } else if ((messageObject.messageOwner.action instanceof TLRPC.TL_messageActionGeoProximityReached) && DialogObject.isUserDialog(messageObject.getDialogId())) {
                    this.proximityButton.setImageResource(R.drawable.msg_location_alert);
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
            return;
        }
        if (i == NotificationCenter.replaceMessagesObjects) {
            long jLongValue = ((Long) objArr[0]).longValue();
            if (jLongValue != this.dialogId || this.messageObject == null) {
                return;
            }
            ArrayList arrayList2 = (ArrayList) objArr[1];
            boolean z2 = false;
            for (int i4 = 0; i4 < arrayList2.size(); i4++) {
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i4);
                if (messageObject2.isLiveLocation() && (liveLocation = (LiveLocation) this.markersMap.get(getMessageId(messageObject2.messageOwner))) != null) {
                    LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(jLongValue);
                    if (sharingLocationInfo == null || sharingLocationInfo.mid != messageObject2.getId()) {
                        TLRPC.Message message = messageObject2.messageOwner;
                        liveLocation.object = message;
                        TLRPC.GeoPoint geoPoint = message.media.geo;
                        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
                        liveLocation.marker.setPosition(latLng);
                        if (this.selectedMarkerId == liveLocation.id) {
                            this.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(liveLocation.marker.getPosition()));
                        }
                        IMapsProvider.IMarker iMarker = liveLocation.directionMarker;
                        if (iMarker != null) {
                            iMarker.getPosition();
                            liveLocation.directionMarker.setPosition(latLng);
                            int i5 = messageObject2.messageOwner.media.heading;
                            if (i5 != 0) {
                                liveLocation.directionMarker.setRotation(i5);
                                if (!liveLocation.hasRotation) {
                                    liveLocation.directionMarker.setIcon(R.drawable.map_pin_cone2);
                                    liveLocation.hasRotation = true;
                                }
                            } else if (liveLocation.hasRotation) {
                                liveLocation.directionMarker.setRotation(0);
                                liveLocation.directionMarker.setIcon(R.drawable.map_pin_circle);
                                liveLocation.hasRotation = false;
                            }
                        }
                    }
                    z2 = true;
                }
            }
            if (z2 && (locationActivityAdapter = this.adapter) != null) {
                locationActivityAdapter.notifyDataSetChanged();
                ProximitySheet proximitySheet = this.proximitySheet;
                if (proximitySheet != null) {
                    proximitySheet.updateText(true, true);
                }
            }
            if (z2) {
                updateShowAllButton();
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
                FileLog.e(e);
            }
        }
        UndoView undoView = this.undoView[0];
        if (undoView != null) {
            undoView.hide(true, 0);
        }
        this.onResumeCalled = false;
    }

    @Override
    public boolean onBackPressed(boolean z) {
        ProximitySheet proximitySheet = this.proximitySheet;
        if (proximitySheet != null) {
            if (z) {
                proximitySheet.dismiss();
            }
            return false;
        }
        IMapsProvider.IMapView iMapView = this.mapView;
        if (iMapView == null || iMapView.getGlSurfaceView() == null || this.hasScreenshot) {
            return super.onBackPressed(z);
        }
        if (z) {
            onCheckGlScreenshot();
        }
        return false;
    }

    @Override
    public boolean finishFragment(boolean z) {
        if (onCheckGlScreenshot()) {
            return false;
        }
        return super.finishFragment(z);
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
                this.f$0.lambda$onCheckGlScreenshot$49(glSurfaceView);
            }
        });
        return true;
    }

    public void lambda$onCheckGlScreenshot$49(final GLSurfaceView gLSurfaceView) {
        if (gLSurfaceView.getWidth() == 0 || gLSurfaceView.getHeight() == 0) {
            return;
        }
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(gLSurfaceView.getWidth() * gLSurfaceView.getHeight() * 4);
        GLES20.glReadPixels(0, 0, gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), 6408, 5121, byteBufferAllocateDirect);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(gLSurfaceView.getWidth(), gLSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
        bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocateDirect);
        Matrix matrix = new Matrix();
        matrix.preScale(1.0f, -1.0f);
        final Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), matrix, false);
        bitmapCreateBitmap.recycle();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onCheckGlScreenshot$48(bitmapCreateBitmap2, gLSurfaceView);
            }
        });
    }

    public void lambda$onCheckGlScreenshot$48(Bitmap bitmap, final GLSurfaceView gLSurfaceView) {
        ImageView imageView = new ImageView(getContext());
        imageView.setImageBitmap(bitmap);
        final ViewGroup viewGroup = (ViewGroup) gLSurfaceView.getParent();
        try {
            viewGroup.addView(imageView, viewGroup.indexOfChild(gLSurfaceView));
        } catch (Exception e) {
            FileLog.e(e);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$onCheckGlScreenshot$47(viewGroup, gLSurfaceView);
            }
        }, 100L);
    }

    public void lambda$onCheckGlScreenshot$47(ViewGroup viewGroup, GLSurfaceView gLSurfaceView) {
        try {
            viewGroup.removeView(gLSurfaceView);
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.hasScreenshot = true;
        finishFragment();
    }

    @Override
    public void onBecomeFullyHidden() {
        UndoView undoView = this.undoView[0];
        if (undoView != null) {
            undoView.hide(true, 0);
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
                FileLog.e(th);
            }
        }
        this.onResumeCalled = true;
        IMapsProvider.IMap iMap = this.map;
        if (iMap != null) {
            try {
                iMap.setMyLocationEnabled(true);
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        fixLayoutInternal(true);
        if (disablePermissionCheck()) {
            this.checkPermission = false;
        } else if (this.checkPermission && Build.VERSION.SDK_INT >= 23 && (parentActivity = getParentActivity()) != null) {
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
            openShareLiveLocation(false, this.askWithRadius);
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
    public ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        ThemeDescription.ThemeDescriptionDelegate themeDescriptionDelegate = new ThemeDescription.ThemeDescriptionDelegate() {
            @Override
            public final void didSetColor() {
                this.f$0.lambda$getThemeDescriptions$50();
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        for (int i = 0; i < this.undoView.length; i++) {
            UndoView undoView = this.undoView[i];
            int i2 = ThemeDescription.FLAG_BACKGROUNDFILTER;
            int i3 = Theme.key_undo_background;
            arrayList.add(new ThemeDescription(undoView, i2, null, null, null, null, i3));
            int i4 = Theme.key_undo_cancelColor;
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
            int i5 = Theme.key_undo_infoColor;
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i5));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "BODY", i3));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Big", i3));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Big 3", i5));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Small", i5));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Body Main.**", i5));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Body Top.**", i5));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Line.**", i5));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Curve Big.**", i5));
            arrayList.add(new ThemeDescription(this.undoView[i], 0, new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Curve Small.**", i5));
        }
        View view = this.fragmentView;
        int i6 = ThemeDescription.FLAG_BACKGROUND;
        int i7 = Theme.key_dialogBackground;
        arrayList.add(new ThemeDescription(view, i6, null, null, null, themeDescriptionDelegate, i7));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, i7));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, i7));
        ActionBar actionBar = this.actionBar;
        int i8 = ThemeDescription.FLAG_AB_ITEMSCOLOR;
        int i9 = Theme.key_dialogTextBlack;
        arrayList.add(new ThemeDescription(actionBar, i8, null, null, null, null, i9));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, i9));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, Theme.key_dialogButtonSelector));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCH, null, null, null, null, i9));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCHPLACEHOLDER, null, null, null, null, Theme.key_chat_messagePanelHint));
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        arrayList.add(new ThemeDescription(actionBarMenuItem != null ? actionBarMenuItem.getSearchField() : null, ThemeDescription.FLAG_CURSORCOLOR, null, null, null, null, i9));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SUBMENUBACKGROUND, null, null, null, themeDescriptionDelegate, Theme.key_actionBarDefaultSubmenuBackground));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SUBMENUITEM, null, null, null, themeDescriptionDelegate, Theme.key_actionBarDefaultSubmenuItem));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_IMAGECOLOR | ThemeDescription.FLAG_AB_SUBMENUITEM, null, null, null, themeDescriptionDelegate, Theme.key_actionBarDefaultSubmenuItemIcon));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        ImageView imageView = this.emptyImageView;
        int i10 = ThemeDescription.FLAG_IMAGECOLOR;
        int i11 = Theme.key_dialogEmptyImage;
        arrayList.add(new ThemeDescription(imageView, i10, null, null, null, null, i11));
        TextView textView = this.emptyTitleTextView;
        int i12 = ThemeDescription.FLAG_TEXTCOLOR;
        int i13 = Theme.key_dialogEmptyText;
        arrayList.add(new ThemeDescription(textView, i12, null, null, null, null, i13));
        arrayList.add(new ThemeDescription(this.emptySubtitleTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i13));
        arrayList.add(new ThemeDescription(this.shadow, 0, null, null, null, null, Theme.key_sheet_scrollUp));
        ImageView imageView2 = this.locationButton;
        int i14 = ThemeDescription.FLAG_IMAGECOLOR | ThemeDescription.FLAG_CHECKTAG;
        int i15 = Theme.key_location_actionIcon;
        arrayList.add(new ThemeDescription(imageView2, i14, null, null, null, null, i15));
        ImageView imageView3 = this.locationButton;
        int i16 = ThemeDescription.FLAG_IMAGECOLOR | ThemeDescription.FLAG_CHECKTAG;
        int i17 = Theme.key_location_actionActiveIcon;
        arrayList.add(new ThemeDescription(imageView3, i16, null, null, null, null, i17));
        ImageView imageView4 = this.locationButton;
        int i18 = ThemeDescription.FLAG_BACKGROUNDFILTER;
        int i19 = Theme.key_location_actionBackground;
        arrayList.add(new ThemeDescription(imageView4, i18, null, null, null, null, i19));
        ImageView imageView5 = this.locationButton;
        int i20 = ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE;
        int i21 = Theme.key_location_actionPressedBackground;
        arrayList.add(new ThemeDescription(imageView5, i20, null, null, null, null, i21));
        arrayList.add(new ThemeDescription(this.mapTypeButton, 0, null, null, null, themeDescriptionDelegate, i15));
        arrayList.add(new ThemeDescription(this.mapTypeButton, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, i19));
        arrayList.add(new ThemeDescription(this.mapTypeButton, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, i21));
        arrayList.add(new ThemeDescription(this.proximityButton, 0, null, null, null, themeDescriptionDelegate, i15));
        arrayList.add(new ThemeDescription(this.proximityButton, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, i19));
        arrayList.add(new ThemeDescription(this.proximityButton, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, i21));
        arrayList.add(new ThemeDescription(this.searchAreaButton, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i17));
        arrayList.add(new ThemeDescription(this.searchAreaButton, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, i19));
        arrayList.add(new ThemeDescription(this.searchAreaButton, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, i21));
        arrayList.add(new ThemeDescription(null, 0, null, null, Theme.avatarDrawables, themeDescriptionDelegate, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, themeDescriptionDelegate, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_location_liveLocationProgress));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_location_placeLocationBackground));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialog_liveLocationProgress));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE | ThemeDescription.FLAG_CHECKTAG, new Class[]{SendLocationCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_location_sendLocationIcon));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE | ThemeDescription.FLAG_CHECKTAG, new Class[]{SendLocationCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_location_sendLiveLocationIcon));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE | ThemeDescription.FLAG_CHECKTAG, new Class[]{SendLocationCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_location_sendLocationBackground));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE | ThemeDescription.FLAG_CHECKTAG, new Class[]{SendLocationCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_location_sendLiveLocationBackground));
        int i22 = Theme.key_windowBackgroundWhiteGrayText3;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SendLocationCell.class}, new String[]{"accurateTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i22));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{SendLocationCell.class}, new String[]{"titleTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_location_sendLiveLocationText));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{SendLocationCell.class}, new String[]{"titleTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_location_sendLocationText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationDirectionCell.class}, new String[]{"buttonTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_featuredStickers_buttonText));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE, new Class[]{LocationDirectionCell.class}, new String[]{"frameLayout"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_featuredStickers_addButton));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, new Class[]{LocationDirectionCell.class}, new String[]{"frameLayout"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_featuredStickers_addButtonPressed));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{ShadowSectionCell.class}, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_dialogTextBlue2));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{LocationCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i22));
        int i23 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i23));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationCell.class}, new String[]{"addressTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i22));
        arrayList.add(new ThemeDescription(this.searchListView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{LocationCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i22));
        arrayList.add(new ThemeDescription(this.searchListView, 0, new Class[]{LocationCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i23));
        arrayList.add(new ThemeDescription(this.searchListView, 0, new Class[]{LocationCell.class}, new String[]{"addressTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i22));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SharingLiveLocationCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i23));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SharingLiveLocationCell.class}, new String[]{"distanceTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i22));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationLoadingCell.class}, new String[]{"progressBar"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_progressCircle));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationLoadingCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i22));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationLoadingCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i22));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationPoweredCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i22));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{LocationPoweredCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i11));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationPoweredCell.class}, new String[]{"textView2"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i13));
        return arrayList;
    }

    public void lambda$getThemeDescriptions$50() {
        this.mapTypeButton.setIconColor(getThemedColor(Theme.key_location_actionIcon));
        this.mapTypeButton.redrawPopup(getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
        this.mapTypeButton.setPopupItemsColor(getThemedColor(Theme.key_actionBarDefaultSubmenuItemIcon), true);
        this.mapTypeButton.setPopupItemsColor(getThemedColor(Theme.key_actionBarDefaultSubmenuItem), false);
        this.shadowDrawable.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_dialogBackground), PorterDuff.Mode.MULTIPLY));
        this.shadow.invalidate();
        if (this.map != null) {
            int mapThemeResId = getMapThemeResId();
            if (mapThemeResId != 0) {
                if (this.currentMapStyleDark) {
                    return;
                }
                this.currentMapStyleDark = true;
                this.map.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, mapThemeResId));
                IMapsProvider.ICircle iCircle = this.proximityCircle;
                if (iCircle != null) {
                    iCircle.setStrokeColor(-1);
                    this.proximityCircle.setFillColor(553648127);
                    return;
                }
                return;
            }
            if (this.currentMapStyleDark) {
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

    public String getAddressName() {
        LocationActivityAdapter locationActivityAdapter = this.adapter;
        if (locationActivityAdapter != null) {
            return locationActivityAdapter.getAddressName();
        }
        return null;
    }

    @Override
    public boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(getThemedColor(Theme.key_windowBackgroundWhite)) > 0.699999988079071d;
    }

    class NestedFrameLayout extends SizeNotifierFrameLayout implements NestedScrollingParent3 {
        private boolean first;
        private NestedScrollingParentHelper nestedScrollingParentHelper;

        @Override
        public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5) {
        }

        @Override
        public void onStopNestedScroll(View view) {
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            if (z) {
                LocationActivity.this.fixLayoutInternal(this.first);
                this.first = false;
            } else {
                LocationActivity.this.updateClipView(true);
            }
        }

        @Override
        protected boolean drawChild(Canvas canvas, View view, long j) {
            boolean zDrawChild = super.drawChild(canvas, view, j);
            if (view == ((BaseFragment) LocationActivity.this).actionBar && ((BaseFragment) LocationActivity.this).parentLayout != null) {
                ((BaseFragment) LocationActivity.this).parentLayout.drawHeaderShadow(canvas, ((BaseFragment) LocationActivity.this).actionBar.getMeasuredHeight());
            }
            return zDrawChild;
        }

        public NestedFrameLayout(Context context) {
            super(context);
            this.first = true;
            this.nestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        }

        @Override
        public void onNestedScroll(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            try {
                if (view == LocationActivity.this.listView && LocationActivity.this.sharedMediaLayout != null && LocationActivity.this.sharedMediaLayout.isAttachedToWindow()) {
                    RecyclerListView currentListView = LocationActivity.this.sharedMediaLayout.getCurrentListView();
                    int top = LocationActivity.this.sharedMediaLayout.getTop();
                    if (currentListView == null || top != 0) {
                        return;
                    }
                    iArr[1] = i4;
                    currentListView.scrollBy(0, i4);
                }
            } catch (Throwable th) {
                FileLog.e(th);
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onNestedScroll$0();
                    }
                });
            }
        }

        public void lambda$onNestedScroll$0() {
            try {
                RecyclerListView currentListView = LocationActivity.this.sharedMediaLayout.getCurrentListView();
                if (currentListView == null || currentListView.getAdapter() == null) {
                    return;
                }
                currentListView.getAdapter().notifyDataSetChanged();
            } catch (Throwable unused) {
            }
        }

        @Override
        public boolean onNestedPreFling(View view, float f, float f2) {
            return super.onNestedPreFling(view, f, f2);
        }

        @Override
        public void onNestedPreScroll(View view, int i, int i2, int[] iArr, int i3) {
            int i4;
            RecyclerListView currentListView;
            if (view == LocationActivity.this.listView && LocationActivity.this.sharedMediaLayout != null && LocationActivity.this.sharedMediaLayout.isAttachedToWindow()) {
                boolean zIsSearchFieldVisible = ((BaseFragment) LocationActivity.this).actionBar.isSearchFieldVisible();
                int top = LocationActivity.this.sharedMediaLayout.getTop();
                boolean z = false;
                if (i2 >= 0) {
                    if (zIsSearchFieldVisible) {
                        RecyclerListView currentListView2 = LocationActivity.this.sharedMediaLayout.getCurrentListView();
                        iArr[1] = i2;
                        if (top > 0) {
                            iArr[1] = 0;
                        }
                        if (currentListView2 == null || (i4 = iArr[1]) <= 0) {
                            return;
                        }
                        currentListView2.scrollBy(0, i4);
                        return;
                    }
                    return;
                }
                if (top <= 0 && (currentListView = LocationActivity.this.sharedMediaLayout.getCurrentListView()) != null) {
                    int iFindFirstVisibleItemPosition = ((LinearLayoutManager) currentListView.getLayoutManager()).findFirstVisibleItemPosition();
                    if (iFindFirstVisibleItemPosition != -1) {
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = currentListView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
                        int top2 = viewHolderFindViewHolderForAdapterPosition != null ? viewHolderFindViewHolderForAdapterPosition.itemView.getTop() : -1;
                        int paddingTop = currentListView.getPaddingTop();
                        if (top2 != paddingTop || iFindFirstVisibleItemPosition != 0) {
                            iArr[1] = iFindFirstVisibleItemPosition != 0 ? i2 : Math.max(i2, top2 - paddingTop);
                            currentListView.scrollBy(0, i2);
                            z = true;
                        }
                    }
                }
                if (zIsSearchFieldVisible) {
                    if (!z && top < 0) {
                        iArr[1] = i2 - Math.max(top, i2);
                    } else {
                        iArr[1] = i2;
                    }
                }
            }
        }

        @Override
        public boolean onStartNestedScroll(View view, View view2, int i, int i2) {
            return LocationActivity.this.sharedMediaLayout != null && i == 2;
        }

        @Override
        public void onNestedScrollAccepted(View view, View view2, int i, int i2) {
            this.nestedScrollingParentHelper.onNestedScrollAccepted(view, view2, i);
        }

        @Override
        public void onStopNestedScroll(View view, int i) {
            this.nestedScrollingParentHelper.onStopNestedScroll(view);
        }

        @Override
        protected void drawList(Canvas canvas, boolean z, ArrayList arrayList) {
            super.drawList(canvas, z, arrayList);
            if (LocationActivity.this.sharedMediaLayout != null) {
                canvas.save();
                canvas.translate(0.0f, LocationActivity.this.listView.getY());
                LocationActivity.this.sharedMediaLayout.drawListForBlur(canvas, arrayList);
                canvas.restore();
            }
        }
    }
}
