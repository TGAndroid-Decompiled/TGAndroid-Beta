package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
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
import android.opengl.GLSurfaceView;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.collection.LongSparseArray;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.NestedScrollingParent3;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.zxing.qrcode.decoder.Version;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import me.vkryl.android.animator.BoolAnimator;
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
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline2;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.utils.ViewOutlineProviderImpl;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.BaseLocationAdapter;
import org.telegram.ui.Adapters.LocationActivityAdapter;
import org.telegram.ui.Adapters.LocationActivitySearchAdapter;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.EditEmojiTextCell;
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
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.CanvasButton;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.GestureDetectorFixDoubleTap$GestureDetectorCompatImplBase;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.NestedSizeNotifierLayout;
import org.telegram.ui.Components.Premium.GLIcon.GLIconTextureView$1$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.Premium.PremiumStickersPreviewRecycler;
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet;
import org.telegram.ui.Components.ProximitySheet;
import org.telegram.ui.Components.Reactions.ChatSelectionReactionMenuOverlay;
import org.telegram.ui.Components.ReactionsContainerLayout;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SearchDownloadsContainer;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.SharingLocationsAlert;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.StarAppsSheet;
import org.telegram.ui.Components.StickersAlert;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Components.UsersAlertBase;
import org.telegram.ui.Components.ViewPagerFixed;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.poll.sheets.CountrySelectBottomSheet;
import org.telegram.ui.Delegates.MemberRequestsDelegate;
import org.telegram.ui.Delegates.MemberRequestsDelegate$$ExternalSyntheticLambda2;
import org.telegram.ui.Gifts.ResaleGiftsFragment;
import org.telegram.ui.Stories.recorder.HintView2;
import org.telegram.ui.iv.RichEditor;

public class LocationActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    public AnonymousClass4 adapter;
    public AnimatorSet animatorSet;
    public final Bitmap[] bitmapCache;
    public boolean canUndo;
    public TLRPC.TL_channelLocation chatLocation;
    public boolean checkBackgroundPermission;
    public boolean checkGpsEnabled;
    public boolean checkPermission;
    public boolean currentMapStyleDark;
    public LocationActivityDelegate delegate;
    public long dialogId;
    public ImageView emptyImageView;
    public TextView emptySubtitleTextView;
    public TextView emptyTitleTextView;
    public LinearLayout emptyView;
    public boolean firstFocus;
    public boolean firstWas;
    public IMapsProvider.ICameraUpdate forceUpdate;
    public boolean fromStories;
    public boolean hasScreenshot;
    public HintView2 hintView;
    public TLRPC.TL_channelLocation initialLocation;
    public boolean initialMaxZoom;
    public boolean isFirstLocation;
    public boolean isSharingAllowed;
    public IMapsProvider.IMarker lastPressedMarker;
    public FrameLayout lastPressedMarkerView;
    public VenueLocation lastPressedVenue;
    public LinearLayoutManager layoutManager;
    public RecyclerListView listView;
    public ImageView locationButton;
    public boolean locationDenied;
    public final int locationType;
    public IMapsProvider.IMap map;
    public ActionBarMenuItem mapTypeButton;
    public IMapsProvider.IMapView mapView;
    public LoginActivity.AnonymousClass4 mapViewClip;
    public boolean mapsInitialized;
    public LocationActivity$$ExternalSyntheticLambda6 markAsReadRunnable;
    public View markerImageView;
    public int markerTop;
    public final ArrayList markers;
    public final LongSparseArray markersMap;
    public MessageObject messageObject;
    public IMapsProvider.ICameraUpdate moveToBounds;
    public Location myLocation;
    public boolean onResumeCalled;
    public ActionBarMenuItem otherItem;
    public int overScrollHeight;
    public MapOverlayView overlayView;
    public final ArrayList placeMarkers;
    public AnonymousClass8 popupWindow;
    public double previousRadius;
    public boolean proximityAnimationInProgress;
    public ImageView proximityButton;
    public IMapsProvider.ICircle proximityCircle;
    public ProximitySheet proximitySheet;
    public boolean scrolling;
    public AnonymousClass9 searchAdapter;
    public SearchButton searchAreaButton;
    public boolean searchInProgress;
    public ActionBarMenuItem searchItem;
    public RecyclerListView searchListView;
    public TL_stories.MediaArea searchStoriesArea;
    public boolean searchWas;
    public boolean searchedForCustomLocations;
    public boolean searching;
    public long selectedMarkerId;
    public CalendarActivity.AnonymousClass5 shadow;
    public Drawable shadowDrawable;
    public GraySectionCell sharedMediaHeader;
    public AnonymousClass6 sharedMediaLayout;
    public TextView showAllButton;
    public boolean showAllMode;
    public Boolean shownShowAllButton;
    public final UndoView[] undoView;
    public Location userLocation;
    public boolean userLocationMoved;
    public float yOffset;

    public final class AnonymousClass4 extends LocationActivityAdapter {
        public boolean firstSet;

        public AnonymousClass4(Context context, int i, long j, Theme.ResourcesProvider resourcesProvider, boolean z, boolean z2) {
            super(context, i, j, false, resourcesProvider, false, z, z2);
            this.firstSet = true;
        }

        @Override
        public final void onDirectionClick() {
            LocationActivity.this.openDirections(null);
        }

        public final void setLiveLocations(ArrayList arrayList) {
            int i;
            LocationActivity locationActivity = LocationActivity.this;
            MessageObject messageObject = locationActivity.messageObject;
            if (messageObject != null && messageObject.isLiveLocation()) {
                if (arrayList != null) {
                    i = 0;
                    for (int i2 = 0; i2 < arrayList.size(); i2++) {
                        LiveLocation liveLocation = (LiveLocation) arrayList.get(i2);
                        if (liveLocation != null && !UserObject.isUserSelf(liveLocation.user)) {
                            i++;
                        }
                    }
                } else {
                    i = 0;
                }
                if (this.firstSet && i == 1) {
                    locationActivity.selectedMarkerId = ((LiveLocation) arrayList.get(0)).id;
                }
                this.firstSet = false;
                locationActivity.otherItem.setVisibility(i == 1 ? 0 : 8);
            }
            this.currentLiveLocations = new ArrayList(arrayList);
            long clientUserId = UserConfig.getInstance(((LocationActivityAdapter) this).currentAccount).getClientUserId();
            for (int i3 = 0; i3 < this.currentLiveLocations.size(); i3++) {
                if (((LiveLocation) this.currentLiveLocations.get(i3)).id == clientUserId || ((LiveLocation) this.currentLiveLocations.get(i3)).object.out) {
                    this.currentLiveLocations.remove(i3);
                    break;
                }
            }
            this.mObservable.notifyChanged();
        }
    }

    public final class AnonymousClass8 extends ActionBarPopupWindow {
        public AnonymousClass8(ActionBarPopupWindow.ActionBarPopupWindowLayout actionBarPopupWindowLayout) {
            super(actionBarPopupWindowLayout);
        }

        @Override
        public final void dismiss() {
            dismiss(true);
            LocationActivity.this.popupWindow = null;
        }
    }

    public final class LiveLocation {
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

    public final class MapOverlayView extends FrameLayout {
        public final HashMap views;

        public MapOverlayView(Context context) {
            super(context);
            this.views = new HashMap();
        }

        public final void updatePositions() {
            IMapsProvider.IMap iMap = LocationActivity.this.map;
            if (iMap == null) {
                return;
            }
            IMapsProvider.IProjection projection = iMap.getProjection();
            for (Map.Entry entry : this.views.entrySet()) {
                IMapsProvider.IMarker iMarker = (IMapsProvider.IMarker) entry.getKey();
                View view = (View) entry.getValue();
                Point screenLocation = projection.toScreenLocation(iMarker.getPosition());
                view.setTranslationX(screenLocation.x - (view.getMeasuredWidth() / 2));
                view.setTranslationY(AndroidUtilities.dp(22.0f) + (screenLocation.y - view.getMeasuredHeight()));
            }
        }
    }

    public final class NestedFrameLayout extends SizeNotifierFrameLayout implements NestedScrollingParent3 {
        public boolean first;
        public final Version.ECB nestedScrollingParentHelper;

        public NestedFrameLayout(Context context) {
            super(context, null);
            this.first = true;
            this.nestedScrollingParentHelper = new Version.ECB();
        }

        @Override
        public final boolean drawChild(Canvas canvas, View view, long j) {
            boolean zDrawChild = super.drawChild(canvas, view, j);
            LocationActivity locationActivity = LocationActivity.this;
            if (view == ((BaseFragment) locationActivity).actionBar && ((BaseFragment) locationActivity).parentLayout != null) {
                INavigationLayout iNavigationLayout = ((BaseFragment) locationActivity).parentLayout;
                int measuredHeight = ((BaseFragment) locationActivity).actionBar.getMeasuredHeight();
                iNavigationLayout.getClass();
                ((ActionBarLayout) iNavigationLayout).drawHeaderShadow(canvas, 255, measuredHeight);
            }
            return zDrawChild;
        }

        @Override
        public final void drawList(Canvas canvas, ArrayList arrayList) {
            LocationActivity locationActivity = LocationActivity.this;
            if (locationActivity.sharedMediaLayout != null) {
                canvas.save();
                canvas.translate(0.0f, locationActivity.listView.getY());
                locationActivity.sharedMediaLayout.drawListForBlur(canvas, arrayList);
                canvas.restore();
            }
        }

        @Override
        public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
            super.onLayout(z, i, i2, i3, i4);
            LocationActivity locationActivity = LocationActivity.this;
            if (!z) {
                locationActivity.updateClipView(true);
            } else {
                locationActivity.fixLayoutInternal$1(this.first);
                this.first = false;
            }
        }

        @Override
        public final void onNestedPreScroll(ViewGroup viewGroup, int i, int i2, int[] iArr, int i3) {
            AnonymousClass6 anonymousClass6;
            int i4;
            RecyclerListView currentListView;
            LocationActivity locationActivity = LocationActivity.this;
            if (viewGroup == locationActivity.listView && (anonymousClass6 = locationActivity.sharedMediaLayout) != null && anonymousClass6.isAttachedToWindow()) {
                boolean z = ((BaseFragment) locationActivity).actionBar.isSearchFieldVisible;
                int top = locationActivity.sharedMediaLayout.getTop();
                boolean z2 = false;
                if (i2 >= 0) {
                    if (z) {
                        RecyclerListView currentListView2 = locationActivity.sharedMediaLayout.getCurrentListView();
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
                if (top <= 0 && (currentListView = locationActivity.sharedMediaLayout.getCurrentListView()) != null) {
                    int iFindFirstVisibleItemPosition = ((LinearLayoutManager) currentListView.getLayoutManager()).findFirstVisibleItemPosition();
                    if (iFindFirstVisibleItemPosition != -1) {
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = currentListView.findViewHolderForAdapterPosition(iFindFirstVisibleItemPosition);
                        int top2 = viewHolderFindViewHolderForAdapterPosition != null ? viewHolderFindViewHolderForAdapterPosition.itemView.getTop() : -1;
                        int paddingTop = currentListView.getPaddingTop();
                        if (top2 != paddingTop || iFindFirstVisibleItemPosition != 0) {
                            iArr[1] = iFindFirstVisibleItemPosition != 0 ? i2 : Math.max(i2, top2 - paddingTop);
                            currentListView.scrollBy(0, i2);
                            z2 = true;
                        }
                    }
                }
                if (z) {
                    if (z2 || top >= 0) {
                        iArr[1] = i2;
                    } else {
                        iArr[1] = i2 - Math.max(top, i2);
                    }
                }
            }
        }

        @Override
        public final void onNestedScroll(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5) {
        }

        @Override
        public final void onNestedScrollAccepted(View view, View view2, int i, int i2) {
            this.nestedScrollingParentHelper.count = i;
        }

        @Override
        public final boolean onStartNestedScroll(View view, View view2, int i, int i2) {
            return LocationActivity.this.sharedMediaLayout != null && i == 2;
        }

        @Override
        public final void onStopNestedScroll(View view) {
        }

        @Override
        public final void onNestedScroll(ViewGroup viewGroup, int i, int i2, int i3, int i4, int i5, int[] iArr) {
            AnonymousClass6 anonymousClass6;
            LocationActivity locationActivity = LocationActivity.this;
            try {
                if (viewGroup == locationActivity.listView && (anonymousClass6 = locationActivity.sharedMediaLayout) != null && anonymousClass6.isAttachedToWindow()) {
                    RecyclerListView currentListView = locationActivity.sharedMediaLayout.getCurrentListView();
                    int top = locationActivity.sharedMediaLayout.getTop();
                    if (currentListView == null || top != 0) {
                        return;
                    }
                    iArr[1] = i4;
                    currentListView.scrollBy(0, i4);
                }
            } catch (Throwable th) {
                FileLog.e(th);
                AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda6(this, 15));
            }
        }

        @Override
        public final void onStopNestedScroll(int i, View view) {
            this.nestedScrollingParentHelper.count = 0;
        }
    }

    public final class SearchButton extends TextView {
        public float additionanTranslationY;
        public float currentTranslationY;

        @Override
        public final float getTranslationX() {
            return this.additionanTranslationY;
        }

        @Override
        public final void setTranslationX(float f) {
            this.additionanTranslationY = f;
            setTranslationY(this.currentTranslationY + f);
        }
    }

    public final class VenueLocation {
        public IMapsProvider.IMarker marker;
        public int num;
        public TLRPC.TL_messageMediaVenue venue;
    }

    public LocationActivity(int i) {
        super(null);
        this.undoView = new UndoView[2];
        this.checkGpsEnabled = true;
        this.locationDenied = false;
        this.isFirstLocation = true;
        this.firstFocus = true;
        this.markers = new ArrayList();
        this.markersMap = new LongSparseArray();
        this.selectedMarkerId = -1L;
        this.placeMarkers = new ArrayList();
        this.checkPermission = true;
        this.checkBackgroundPermission = true;
        this.overScrollHeight = (AndroidUtilities.displaySize.x - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.isSharingAllowed = true;
        this.bitmapCache = new Bitmap[7];
        this.locationType = i;
        AndroidUtilities.fixGoogleMapsBug();
    }

    public static IMapsProvider.LatLng move(IMapsProvider.LatLng latLng, double d, double d2) {
        double degrees = Math.toDegrees(d2 / (Math.cos(Math.toRadians(latLng.latitude)) * 6366198.0d));
        return new IMapsProvider.LatLng(latLng.latitude + Math.toDegrees(d / 6366198.0d), latLng.longitude + degrees);
    }

    public final LiveLocation addUserMarker(TLRPC.Message message) {
        Location location;
        TLRPC.GeoPoint geoPoint = message.media.geo;
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(geoPoint.lat, geoPoint._long);
        long fromChatId = MessageObject.getFromChatId(message);
        LongSparseArray longSparseArray = this.markersMap;
        LiveLocation liveLocation = (LiveLocation) longSparseArray.get(fromChatId);
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
                    longSparseArray.put(liveLocation, liveLocation.id);
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
            proximitySheet.updateText(true);
        }
        updateShowAllButton();
        return liveLocation;
    }

    public final boolean checkGpsEnabled() {
        if (disablePermissionCheck()) {
            return false;
        }
        if (!getParentActivity().getPackageManager().hasSystemFeature("android.hardware.location.gps")) {
            return true;
        }
        try {
            if (((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                return true;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, null);
            builder.setTopAnimation(R.raw.permission_request_location, 72, getThemedColor(Theme.key_dialogTopBackground), null);
            builder.alertDialog.message = LocaleController.getString(R.string.GpsDisabledAlertText);
            builder.setPositiveButton(LocaleController.getString(R.string.ConnectingToProxyEnable), new LocationActivity$$ExternalSyntheticLambda3(this, 2));
            builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
            showDialog(builder.alertDialog);
            return false;
        } catch (Exception e) {
            FileLog.e(e);
            return true;
        }
    }

    public final void createCircle(int i) {
        if (this.map == null) {
            return;
        }
        List<IMapsProvider.PatternItem> listAsList = Arrays.asList(new IMapsProvider.PatternItem.Gap(20), new IMapsProvider.PatternItem.Dash(20));
        IMapsProvider.ICircleOptions iCircleOptionsOnCreateCircleOptions = ApplicationLoader.getMapsProvider().onCreateCircleOptions();
        iCircleOptionsOnCreateCircleOptions.center(new IMapsProvider.LatLng(this.myLocation.getLatitude(), this.myLocation.getLongitude()));
        iCircleOptionsOnCreateCircleOptions.radius(i);
        if (!(getResourceProvider() == null && Theme.currentTheme.isDark()) && AndroidUtilities.computePerceivedBrightness(getThemedColor(Theme.key_windowBackgroundWhite)) >= 0.721f) {
            iCircleOptionsOnCreateCircleOptions.strokeColor(-1774024971);
            iCircleOptionsOnCreateCircleOptions.fillColor(474121973);
        } else {
            iCircleOptionsOnCreateCircleOptions.strokeColor(-1771658281);
            iCircleOptionsOnCreateCircleOptions.fillColor(476488663);
        }
        iCircleOptionsOnCreateCircleOptions.strokePattern(listAsList);
        iCircleOptionsOnCreateCircleOptions.strokeWidth(2);
        this.proximityCircle = this.map.addCircle(iCircleOptionsOnCreateCircleOptions);
    }

    public final Bitmap createPlaceBitmap$1(int i) {
        Bitmap[] bitmapArr = this.bitmapCache;
        Bitmap bitmap = bitmapArr[i % 7];
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
            bitmapArr[i % 7] = bitmapCreateBitmap;
            return bitmapCreateBitmap;
        } catch (Throwable th) {
            FileLog.e(th);
            return null;
        }
    }

    public final Bitmap createUserBitmap(LiveLocation liveLocation) {
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
                AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
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

    @Override
    public final View createView(Context context) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        this.searchWas = false;
        this.searching = false;
        this.searchInProgress = false;
        AnonymousClass4 anonymousClass4 = this.adapter;
        if (anonymousClass4 != null) {
            anonymousClass4.destroy();
        }
        AnonymousClass9 anonymousClass9 = this.searchAdapter;
        if (anonymousClass9 != null) {
            anonymousClass9.destroy();
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
        int i = Theme.key_dialogBackground;
        actionBar.setBackgroundColor(getThemedColor(i));
        ActionBar actionBar2 = this.actionBar;
        int i2 = Theme.key_dialogTextBlack;
        actionBar2.setTitleColor(getThemedColor(i2));
        this.actionBar.setItemsColor(getThemedColor(i2), false);
        this.actionBar.setItemsBackgroundColor(getThemedColor(Theme.key_dialogButtonSelector), false);
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && ((ActionBarLayout) iNavigationLayout).isLayersLayout) {
            this.actionBar.setOccupyStatusBar(false);
        }
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public final void onItemClick(int i3) {
                LocationActivity locationActivity = LocationActivity.this;
                if (i3 == -1) {
                    locationActivity.finishFragment();
                    return;
                }
                if (i3 != 1) {
                    if (i3 == 5) {
                        locationActivity.openShareLiveLocation(false);
                        return;
                    } else {
                        if (i3 == 6) {
                            locationActivity.openDirections(null);
                            return;
                        }
                        return;
                    }
                }
                try {
                    TLRPC.GeoPoint geoPoint = locationActivity.messageObject.messageOwner.media.geo;
                    double d = geoPoint.lat;
                    double d2 = geoPoint._long;
                    locationActivity.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        });
        ActionBarMenu actionBarMenuCreateMenu = this.actionBar.createMenu();
        TLRPC.TL_channelLocation tL_channelLocation = this.chatLocation;
        int i3 = this.locationType;
        if (tL_channelLocation != null) {
            this.actionBar.setTitle(LocaleController.getString(R.string.ChatLocation));
        } else {
            MessageObject messageObject = this.messageObject;
            if (messageObject == null) {
                this.actionBar.setTitle(LocaleController.getString(R.string.ShareLocation));
                if (i3 != 4) {
                    this.overlayView = new MapOverlayView(context);
                    ActionBarMenuItem actionBarMenuItemAddItem = actionBarMenuCreateMenu.addItem(0, R.drawable.outline_header_search, getResourceProvider());
                    actionBarMenuItemAddItem.setIsSearchField$1();
                    actionBarMenuItemAddItem.listener = new TopicsFragment.AnonymousClass3(this, 13);
                    this.searchItem = actionBarMenuItemAddItem;
                    int i4 = R.string.Search;
                    actionBarMenuItemAddItem.setSearchFieldHint(LocaleController.getString(i4));
                    this.searchItem.setContentDescription(LocaleController.getString(i4));
                    EditTextBoldCursor searchField = this.searchItem.getSearchField();
                    searchField.setTextColor(getThemedColor(i2));
                    searchField.setCursorColor(getThemedColor(i2));
                    searchField.setHintTextColor(getThemedColor(Theme.key_chat_messagePanelHint));
                }
            } else if (messageObject.isLiveLocation()) {
                this.actionBar.setTitle(LocaleController.getString(R.string.AttachLiveLocation));
                ActionBarMenuItem actionBarMenuItemAddItem2 = actionBarMenuCreateMenu.addItem(0, R.drawable.ic_ab_other, getResourceProvider());
                this.otherItem = actionBarMenuItemAddItem2;
                actionBarMenuItemAddItem2.addSubItem(6, R.drawable.filled_directions, LocaleController.getString(R.string.GetDirections));
            } else {
                String str = this.messageObject.messageOwner.media.title;
                if (str == null || str.length() <= 0) {
                    this.actionBar.setTitle(LocaleController.getString(R.string.ChatLocation));
                } else {
                    this.actionBar.setTitle(LocaleController.getString(R.string.SharedPlace));
                }
                if (i3 != 3) {
                    ActionBarMenuItem actionBarMenuItemAddItem3 = actionBarMenuCreateMenu.addItem(0, R.drawable.ic_ab_other, getResourceProvider());
                    this.otherItem = actionBarMenuItemAddItem3;
                    actionBarMenuItemAddItem3.addSubItem(1, R.drawable.msg_openin, LocaleController.getString(R.string.OpenInExternalApp));
                    if (!getLocationController().isSharingLocation(this.dialogId) && this.isSharingAllowed) {
                        this.otherItem.addSubItem(5, R.drawable.msg_location, LocaleController.getString(R.string.SendLiveLocationMenu));
                    }
                    this.otherItem.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
                }
            }
        }
        NestedFrameLayout nestedFrameLayout = new NestedFrameLayout(context);
        this.fragmentView = nestedFrameLayout;
        nestedFrameLayout.setBackgroundColor(getThemedColor(i));
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = drawableMutate;
        int themedColor = getThemedColor(i);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
        Rect rect = new Rect();
        this.shadowDrawable.getPadding(rect);
        FrameLayout.LayoutParams layoutParams = (i3 == 0 || i3 == 1) ? new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f) + rect.top) : new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(6.0f) + rect.top);
        layoutParams.gravity = 83;
        LoginActivity.AnonymousClass4 anonymousClass5 = new LoginActivity.AnonymousClass4(this, context, 9);
        this.mapViewClip = anonymousClass5;
        anonymousClass5.setBackgroundDrawable(new CanvasButton.AnonymousClass2((getResourceProvider() == null && Theme.currentTheme.isDark()) || AndroidUtilities.computePerceivedBrightness(getThemedColor(Theme.key_windowBackgroundWhite)) < 0.721f));
        MessageObject messageObject2 = this.messageObject;
        if ((messageObject2 == null && (i3 == 0 || i3 == 1)) || (messageObject2 != null && i3 == 3)) {
            SearchButton searchButton = new SearchButton(context);
            this.searchAreaButton = searchButton;
            searchButton.setTranslationX(-AndroidUtilities.dp(80.0f));
            int iDp = AndroidUtilities.dp(40.0f);
            int themedColor2 = getThemedColor(Theme.key_location_actionBackground);
            int themedColor3 = getThemedColor(Theme.key_location_actionPressedBackground);
            BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSimpleSelectorRoundRectDrawable = Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, themedColor2, themedColor3, themedColor3);
            ScaleStateListAnimator.apply(this.searchAreaButton, 0.1f, 1.5f);
            this.searchAreaButton.setTranslationZ(AndroidUtilities.dp(2.0f));
            this.searchAreaButton.setOutlineProvider(ViewOutlineProviderImpl.BOUNDS_ROUND_RECT);
            this.searchAreaButton.setBackgroundDrawable(rippleDrawableSafeCreateSimpleSelectorRoundRectDrawable);
            this.searchAreaButton.setTextColor(getThemedColor(Theme.key_location_actionActiveIcon));
            this.searchAreaButton.setTextSize(1, 14.0f);
            this.searchAreaButton.setTypeface(AndroidUtilities.bold());
            this.searchAreaButton.setGravity(17);
            this.searchAreaButton.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            this.mapViewClip.addView(this.searchAreaButton, LayoutHelper.createFrame(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
            if (i3 == 3) {
                this.searchAreaButton.setText(LocaleController.getString(R.string.OpenInMaps));
                final int i5 = 0;
                this.searchAreaButton.setOnClickListener(new View.OnClickListener(this) {
                    public final LocationActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        IMapsProvider.IMap iMap;
                        Activity parentActivity;
                        int i6 = 4;
                        int i7 = 3;
                        LocationActivity locationActivity = this.f$0;
                        switch (i5) {
                            case 0:
                                locationActivity.getClass();
                                try {
                                    TLRPC.GeoPoint geoPoint = locationActivity.messageObject.messageOwner.media.geo;
                                    double d = geoPoint.lat;
                                    double d2 = geoPoint._long;
                                    locationActivity.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                                break;
                            case 1:
                                locationActivity.showSearchPlacesButton$1(false);
                                locationActivity.adapter.searchPlacesWithQuery(null, locationActivity.userLocation, true);
                                locationActivity.searchedForCustomLocations = true;
                                if (locationActivity.adapter.getItemCount() != 0 && locationActivity.layoutManager.findFirstVisibleItemPosition() == 0) {
                                    int top = locationActivity.listView.getChildAt(0).getTop() + AndroidUtilities.dp(258.0f);
                                    if (top >= 0 && top <= AndroidUtilities.dp(258.0f)) {
                                        locationActivity.listView.smoothScrollBy(0, top, null);
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                locationActivity.mapTypeButton.toggleSubMenu(null, null);
                                break;
                            case 3:
                                if (Build.VERSION.SDK_INT < 23 || (parentActivity = locationActivity.getParentActivity()) == null || parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
                                    boolean zCheckGpsEnabled = locationActivity.checkGpsEnabled();
                                    int i8 = locationActivity.locationType;
                                    if (zCheckGpsEnabled || i8 == 3) {
                                        if ((locationActivity.messageObject == null || i8 == 3) && locationActivity.chatLocation == null) {
                                            if (locationActivity.myLocation != null && locationActivity.map != null) {
                                                ImageView imageView = locationActivity.locationButton;
                                                int i9 = Theme.key_location_actionActiveIcon;
                                                imageView.setColorFilter(new PorterDuffColorFilter(locationActivity.getThemedColor(i9), PorterDuff.Mode.MULTIPLY));
                                                locationActivity.locationButton.setTag(Integer.valueOf(i9));
                                                LocationActivity.AnonymousClass4 anonymousClass6 = locationActivity.adapter;
                                                anonymousClass6.customLocation = null;
                                                anonymousClass6.fetchLocationAddress();
                                                anonymousClass6.updateCell();
                                                locationActivity.userLocationMoved = false;
                                                locationActivity.showSearchPlacesButton$1(false);
                                                locationActivity.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(locationActivity.myLocation.getLatitude(), locationActivity.myLocation.getLongitude())));
                                                if (locationActivity.searchedForCustomLocations && i8 != 8) {
                                                    Location location3 = locationActivity.myLocation;
                                                    if (location3 != null) {
                                                        locationActivity.adapter.searchPlacesWithQuery(null, location3, true);
                                                    }
                                                    locationActivity.searchedForCustomLocations = false;
                                                    if (locationActivity.adapter.getItemCount() != 0 && locationActivity.layoutManager.findFirstVisibleItemPosition() == 0) {
                                                        int top2 = locationActivity.listView.getChildAt(0).getTop() + AndroidUtilities.dp(258.0f);
                                                        if (top2 >= 0 && top2 <= AndroidUtilities.dp(258.0f)) {
                                                            locationActivity.listView.smoothScrollBy(0, top2, null);
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (locationActivity.myLocation != null && (iMap = locationActivity.map) != null) {
                                            iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(locationActivity.myLocation.getLatitude(), locationActivity.myLocation.getLongitude()), locationActivity.map.getMaxZoomLevel() - 4.0f));
                                        }
                                        if (locationActivity.lastPressedMarker != null) {
                                            locationActivity.markerImageView.setVisibility(0);
                                            LocationActivity.MapOverlayView mapOverlayView = locationActivity.overlayView;
                                            IMapsProvider.IMarker iMarker = locationActivity.lastPressedMarker;
                                            View view2 = (View) mapOverlayView.views.get(iMarker);
                                            if (view2 != null) {
                                                mapOverlayView.removeView(view2);
                                                mapOverlayView.views.remove(iMarker);
                                            }
                                            locationActivity.lastPressedMarker = null;
                                            locationActivity.lastPressedVenue = null;
                                            locationActivity.lastPressedMarkerView = null;
                                        }
                                    }
                                    break;
                                } else if (locationActivity.getParentActivity() != null) {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(locationActivity.getParentActivity(), 0, null);
                                    builder.setTopAnimation(R.raw.permission_request_location, 72, locationActivity.getThemedColor(Theme.key_dialogTopBackground), null);
                                    SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                                    AlertDialog alertDialog = builder.alertDialog;
                                    alertDialog.message = spannableStringBuilderReplaceTags;
                                    builder.setNegativeButton(LocaleController.getString(R.string.PermissionOpenSettings), new LocationActivity$$ExternalSyntheticLambda3(locationActivity, i6));
                                    builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                                    locationActivity.showDialog(alertDialog);
                                    break;
                                }
                                break;
                            case 4:
                                locationActivity.selectedMarkerId = -1L;
                                locationActivity.userLocationMoved = true;
                                if (locationActivity.fitAllLiveLocations()) {
                                    locationActivity.showAllMode = true;
                                    locationActivity.showShowAllButton(false, true);
                                }
                                break;
                            default:
                                if (locationActivity.getParentActivity() != null && locationActivity.myLocation != null && locationActivity.checkGpsEnabled() && locationActivity.map != null) {
                                    HintView2 hintView2 = locationActivity.hintView;
                                    if (hintView2 != null) {
                                        hintView2.hide(true);
                                    }
                                    MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                                    LocationController.SharingLocationInfo sharingLocationInfo = locationActivity.getLocationController().getSharingLocationInfo(locationActivity.dialogId);
                                    if (locationActivity.canUndo) {
                                        locationActivity.undoView[0].hide(1, true);
                                    }
                                    if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                        locationActivity.proximityButton.setImageResource(R.drawable.msg_location_alert);
                                        IMapsProvider.ICircle iCircle = locationActivity.proximityCircle;
                                        if (iCircle != null) {
                                            iCircle.remove();
                                            locationActivity.proximityCircle = null;
                                        }
                                        locationActivity.canUndo = true;
                                        locationActivity.getUndoView$1().showWithAction(0L, 25, (Object) 0, (Object) null, (Runnable) new LocationActivity$$ExternalSyntheticLambda6(locationActivity, 1), (Runnable) new LinkManager$$ExternalSyntheticLambda2(4, locationActivity, sharingLocationInfo));
                                    } else {
                                        IMapsProvider.ICircle iCircle2 = locationActivity.proximityCircle;
                                        if (iCircle2 == null) {
                                            locationActivity.createCircle(500);
                                        } else {
                                            locationActivity.previousRadius = iCircle2.getRadius();
                                        }
                                        TLRPC.User user = DialogObject.isUserDialog(locationActivity.dialogId) ? locationActivity.getMessagesController().getUser(Long.valueOf(locationActivity.dialogId)) : null;
                                        ProximitySheet proximitySheet = new ProximitySheet(locationActivity.getParentActivity(), user, new LocationActivity$$ExternalSyntheticLambda3(locationActivity, i7), new DialogsActivity$$ExternalSyntheticLambda89(22, locationActivity, user), new LocationActivity$$ExternalSyntheticLambda6(locationActivity, 3));
                                        locationActivity.proximitySheet = proximitySheet;
                                        ((FrameLayout) locationActivity.fragmentView).addView(proximitySheet, LayoutHelper.createFrame(-1.0f, -1));
                                        ProximitySheet proximitySheet2 = locationActivity.proximitySheet;
                                        proximitySheet2.dismissed = false;
                                        AnimatorSet animatorSet = proximitySheet2.currentSheetAnimation;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                            proximitySheet2.currentSheetAnimation = null;
                                        }
                                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((proximitySheet2.backgroundPaddingLeft * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE);
                                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE);
                                        ProximitySheet.AnonymousClass1 anonymousClass1 = proximitySheet2.containerView;
                                        anonymousClass1.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                        if (!proximitySheet2.dismissed) {
                                            anonymousClass1.setVisibility(0);
                                            if (proximitySheet2.useHardwareLayer) {
                                                proximitySheet2.setLayerType(2, null);
                                            }
                                            anonymousClass1.setTranslationY(anonymousClass1.getMeasuredHeight());
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            proximitySheet2.currentSheetAnimation = animatorSet2;
                                            animatorSet2.playTogether(ObjectAnimator.ofFloat(anonymousClass1, (Property<ProximitySheet.AnonymousClass1, Float>) View.TRANSLATION_Y, 0.0f));
                                            proximitySheet2.currentSheetAnimation.setDuration(400L);
                                            proximitySheet2.currentSheetAnimation.setStartDelay(20L);
                                            proximitySheet2.currentSheetAnimation.setInterpolator(proximitySheet2.openInterpolator);
                                            proximitySheet2.currentSheetAnimation.addListener(new ProximitySheet.AnonymousClass4(proximitySheet2, 1));
                                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                            proximitySheet2.currentSheetAnimation.start();
                                        }
                                        proximitySheet2.updateText(true);
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
                this.searchAreaButton.setTranslationX(0.0f);
            } else {
                this.searchAreaButton.setText(LocaleController.getString(R.string.PlacesInThisArea));
                final int i6 = 1;
                this.searchAreaButton.setOnClickListener(new View.OnClickListener(this) {
                    public final LocationActivity f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        IMapsProvider.IMap iMap;
                        Activity parentActivity;
                        int i7 = 4;
                        int i8 = 3;
                        LocationActivity locationActivity = this.f$0;
                        switch (i6) {
                            case 0:
                                locationActivity.getClass();
                                try {
                                    TLRPC.GeoPoint geoPoint = locationActivity.messageObject.messageOwner.media.geo;
                                    double d = geoPoint.lat;
                                    double d2 = geoPoint._long;
                                    locationActivity.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                                } catch (Exception e) {
                                    FileLog.e(e);
                                    return;
                                }
                                break;
                            case 1:
                                locationActivity.showSearchPlacesButton$1(false);
                                locationActivity.adapter.searchPlacesWithQuery(null, locationActivity.userLocation, true);
                                locationActivity.searchedForCustomLocations = true;
                                if (locationActivity.adapter.getItemCount() != 0 && locationActivity.layoutManager.findFirstVisibleItemPosition() == 0) {
                                    int top = locationActivity.listView.getChildAt(0).getTop() + AndroidUtilities.dp(258.0f);
                                    if (top >= 0 && top <= AndroidUtilities.dp(258.0f)) {
                                        locationActivity.listView.smoothScrollBy(0, top, null);
                                        break;
                                    }
                                }
                                break;
                            case 2:
                                locationActivity.mapTypeButton.toggleSubMenu(null, null);
                                break;
                            case 3:
                                if (Build.VERSION.SDK_INT < 23 || (parentActivity = locationActivity.getParentActivity()) == null || parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
                                    boolean zCheckGpsEnabled = locationActivity.checkGpsEnabled();
                                    int i9 = locationActivity.locationType;
                                    if (zCheckGpsEnabled || i9 == 3) {
                                        if ((locationActivity.messageObject == null || i9 == 3) && locationActivity.chatLocation == null) {
                                            if (locationActivity.myLocation != null && locationActivity.map != null) {
                                                ImageView imageView = locationActivity.locationButton;
                                                int i10 = Theme.key_location_actionActiveIcon;
                                                imageView.setColorFilter(new PorterDuffColorFilter(locationActivity.getThemedColor(i10), PorterDuff.Mode.MULTIPLY));
                                                locationActivity.locationButton.setTag(Integer.valueOf(i10));
                                                LocationActivity.AnonymousClass4 anonymousClass6 = locationActivity.adapter;
                                                anonymousClass6.customLocation = null;
                                                anonymousClass6.fetchLocationAddress();
                                                anonymousClass6.updateCell();
                                                locationActivity.userLocationMoved = false;
                                                locationActivity.showSearchPlacesButton$1(false);
                                                locationActivity.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(locationActivity.myLocation.getLatitude(), locationActivity.myLocation.getLongitude())));
                                                if (locationActivity.searchedForCustomLocations && i9 != 8) {
                                                    Location location3 = locationActivity.myLocation;
                                                    if (location3 != null) {
                                                        locationActivity.adapter.searchPlacesWithQuery(null, location3, true);
                                                    }
                                                    locationActivity.searchedForCustomLocations = false;
                                                    if (locationActivity.adapter.getItemCount() != 0 && locationActivity.layoutManager.findFirstVisibleItemPosition() == 0) {
                                                        int top2 = locationActivity.listView.getChildAt(0).getTop() + AndroidUtilities.dp(258.0f);
                                                        if (top2 >= 0 && top2 <= AndroidUtilities.dp(258.0f)) {
                                                            locationActivity.listView.smoothScrollBy(0, top2, null);
                                                        }
                                                    }
                                                }
                                            }
                                        } else if (locationActivity.myLocation != null && (iMap = locationActivity.map) != null) {
                                            iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(locationActivity.myLocation.getLatitude(), locationActivity.myLocation.getLongitude()), locationActivity.map.getMaxZoomLevel() - 4.0f));
                                        }
                                        if (locationActivity.lastPressedMarker != null) {
                                            locationActivity.markerImageView.setVisibility(0);
                                            LocationActivity.MapOverlayView mapOverlayView = locationActivity.overlayView;
                                            IMapsProvider.IMarker iMarker = locationActivity.lastPressedMarker;
                                            View view2 = (View) mapOverlayView.views.get(iMarker);
                                            if (view2 != null) {
                                                mapOverlayView.removeView(view2);
                                                mapOverlayView.views.remove(iMarker);
                                            }
                                            locationActivity.lastPressedMarker = null;
                                            locationActivity.lastPressedVenue = null;
                                            locationActivity.lastPressedMarkerView = null;
                                        }
                                    }
                                    break;
                                } else if (locationActivity.getParentActivity() != null) {
                                    AlertDialog.Builder builder = new AlertDialog.Builder(locationActivity.getParentActivity(), 0, null);
                                    builder.setTopAnimation(R.raw.permission_request_location, 72, locationActivity.getThemedColor(Theme.key_dialogTopBackground), null);
                                    SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                                    AlertDialog alertDialog = builder.alertDialog;
                                    alertDialog.message = spannableStringBuilderReplaceTags;
                                    builder.setNegativeButton(LocaleController.getString(R.string.PermissionOpenSettings), new LocationActivity$$ExternalSyntheticLambda3(locationActivity, i7));
                                    builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                                    locationActivity.showDialog(alertDialog);
                                    break;
                                }
                                break;
                            case 4:
                                locationActivity.selectedMarkerId = -1L;
                                locationActivity.userLocationMoved = true;
                                if (locationActivity.fitAllLiveLocations()) {
                                    locationActivity.showAllMode = true;
                                    locationActivity.showShowAllButton(false, true);
                                }
                                break;
                            default:
                                if (locationActivity.getParentActivity() != null && locationActivity.myLocation != null && locationActivity.checkGpsEnabled() && locationActivity.map != null) {
                                    HintView2 hintView2 = locationActivity.hintView;
                                    if (hintView2 != null) {
                                        hintView2.hide(true);
                                    }
                                    MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                                    LocationController.SharingLocationInfo sharingLocationInfo = locationActivity.getLocationController().getSharingLocationInfo(locationActivity.dialogId);
                                    if (locationActivity.canUndo) {
                                        locationActivity.undoView[0].hide(1, true);
                                    }
                                    if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                        locationActivity.proximityButton.setImageResource(R.drawable.msg_location_alert);
                                        IMapsProvider.ICircle iCircle = locationActivity.proximityCircle;
                                        if (iCircle != null) {
                                            iCircle.remove();
                                            locationActivity.proximityCircle = null;
                                        }
                                        locationActivity.canUndo = true;
                                        locationActivity.getUndoView$1().showWithAction(0L, 25, (Object) 0, (Object) null, (Runnable) new LocationActivity$$ExternalSyntheticLambda6(locationActivity, 1), (Runnable) new LinkManager$$ExternalSyntheticLambda2(4, locationActivity, sharingLocationInfo));
                                    } else {
                                        IMapsProvider.ICircle iCircle2 = locationActivity.proximityCircle;
                                        if (iCircle2 == null) {
                                            locationActivity.createCircle(500);
                                        } else {
                                            locationActivity.previousRadius = iCircle2.getRadius();
                                        }
                                        TLRPC.User user = DialogObject.isUserDialog(locationActivity.dialogId) ? locationActivity.getMessagesController().getUser(Long.valueOf(locationActivity.dialogId)) : null;
                                        ProximitySheet proximitySheet = new ProximitySheet(locationActivity.getParentActivity(), user, new LocationActivity$$ExternalSyntheticLambda3(locationActivity, i8), new DialogsActivity$$ExternalSyntheticLambda89(22, locationActivity, user), new LocationActivity$$ExternalSyntheticLambda6(locationActivity, 3));
                                        locationActivity.proximitySheet = proximitySheet;
                                        ((FrameLayout) locationActivity.fragmentView).addView(proximitySheet, LayoutHelper.createFrame(-1.0f, -1));
                                        ProximitySheet proximitySheet2 = locationActivity.proximitySheet;
                                        proximitySheet2.dismissed = false;
                                        AnimatorSet animatorSet = proximitySheet2.currentSheetAnimation;
                                        if (animatorSet != null) {
                                            animatorSet.cancel();
                                            proximitySheet2.currentSheetAnimation = null;
                                        }
                                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((proximitySheet2.backgroundPaddingLeft * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE);
                                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE);
                                        ProximitySheet.AnonymousClass1 anonymousClass1 = proximitySheet2.containerView;
                                        anonymousClass1.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                        if (!proximitySheet2.dismissed) {
                                            anonymousClass1.setVisibility(0);
                                            if (proximitySheet2.useHardwareLayer) {
                                                proximitySheet2.setLayerType(2, null);
                                            }
                                            anonymousClass1.setTranslationY(anonymousClass1.getMeasuredHeight());
                                            AnimatorSet animatorSet2 = new AnimatorSet();
                                            proximitySheet2.currentSheetAnimation = animatorSet2;
                                            animatorSet2.playTogether(ObjectAnimator.ofFloat(anonymousClass1, (Property<ProximitySheet.AnonymousClass1, Float>) View.TRANSLATION_Y, 0.0f));
                                            proximitySheet2.currentSheetAnimation.setDuration(400L);
                                            proximitySheet2.currentSheetAnimation.setStartDelay(20L);
                                            proximitySheet2.currentSheetAnimation.setInterpolator(proximitySheet2.openInterpolator);
                                            proximitySheet2.currentSheetAnimation.addListener(new ProximitySheet.AnonymousClass4(proximitySheet2, 1));
                                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                            proximitySheet2.currentSheetAnimation.start();
                                        }
                                        proximitySheet2.updateText(true);
                                    }
                                    break;
                                }
                                break;
                        }
                    }
                });
            }
        }
        int i7 = Theme.key_location_actionIcon;
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, null, 0, getThemedColor(i7), false, getResourceProvider());
        this.mapTypeButton = actionBarMenuItem;
        actionBarMenuItem.setClickable(true);
        this.mapTypeButton.setSubMenuOpenSide(2);
        this.mapTypeButton.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        this.mapTypeButton.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        this.mapTypeButton.addSubItem(2, R.drawable.msg_map, null, LocaleController.getString(R.string.Map), true, false, getResourceProvider());
        this.mapTypeButton.addSubItem(3, R.drawable.msg_satellite, null, LocaleController.getString(R.string.Satellite), true, false, getResourceProvider());
        this.mapTypeButton.addSubItem(4, R.drawable.msg_hybrid, null, LocaleController.getString(R.string.Hybrid), true, false, getResourceProvider());
        this.mapTypeButton.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        int iDp2 = AndroidUtilities.dp(40.0f);
        int i8 = Theme.key_location_actionBackground;
        int themedColor4 = getThemedColor(i8);
        int i9 = Theme.key_location_actionPressedBackground;
        BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(iDp2, themedColor4, getThemedColor(i9));
        ScaleStateListAnimator.apply(this.mapTypeButton, 0.1f, 1.5f);
        this.mapTypeButton.setTranslationZ(AndroidUtilities.dp(2.0f));
        ActionBarMenuItem actionBarMenuItem2 = this.mapTypeButton;
        RichEditor.AnonymousClass5 anonymousClass6 = ViewOutlineProviderImpl.BOUNDS_OVAL;
        actionBarMenuItem2.setOutlineProvider(anonymousClass6);
        this.mapTypeButton.setBackgroundDrawable(rippleDrawableSafeCreateSimpleSelectorCircleDrawable);
        this.mapTypeButton.setIcon(R.drawable.msg_map_type);
        this.mapViewClip.addView(this.mapTypeButton, LayoutHelper.createFrame(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        final int i10 = 2;
        this.mapTypeButton.setOnClickListener(new View.OnClickListener(this) {
            public final LocationActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                IMapsProvider.IMap iMap;
                Activity parentActivity;
                int i11 = 4;
                int i12 = 3;
                LocationActivity locationActivity = this.f$0;
                switch (i10) {
                    case 0:
                        locationActivity.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = locationActivity.messageObject.messageOwner.media.geo;
                            double d = geoPoint.lat;
                            double d2 = geoPoint._long;
                            locationActivity.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                        break;
                    case 1:
                        locationActivity.showSearchPlacesButton$1(false);
                        locationActivity.adapter.searchPlacesWithQuery(null, locationActivity.userLocation, true);
                        locationActivity.searchedForCustomLocations = true;
                        if (locationActivity.adapter.getItemCount() != 0 && locationActivity.layoutManager.findFirstVisibleItemPosition() == 0) {
                            int top = locationActivity.listView.getChildAt(0).getTop() + AndroidUtilities.dp(258.0f);
                            if (top >= 0 && top <= AndroidUtilities.dp(258.0f)) {
                                locationActivity.listView.smoothScrollBy(0, top, null);
                                break;
                            }
                        }
                        break;
                    case 2:
                        locationActivity.mapTypeButton.toggleSubMenu(null, null);
                        break;
                    case 3:
                        if (Build.VERSION.SDK_INT < 23 || (parentActivity = locationActivity.getParentActivity()) == null || parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
                            boolean zCheckGpsEnabled = locationActivity.checkGpsEnabled();
                            int i13 = locationActivity.locationType;
                            if (zCheckGpsEnabled || i13 == 3) {
                                if ((locationActivity.messageObject == null || i13 == 3) && locationActivity.chatLocation == null) {
                                    if (locationActivity.myLocation != null && locationActivity.map != null) {
                                        ImageView imageView = locationActivity.locationButton;
                                        int i14 = Theme.key_location_actionActiveIcon;
                                        imageView.setColorFilter(new PorterDuffColorFilter(locationActivity.getThemedColor(i14), PorterDuff.Mode.MULTIPLY));
                                        locationActivity.locationButton.setTag(Integer.valueOf(i14));
                                        LocationActivity.AnonymousClass4 anonymousClass7 = locationActivity.adapter;
                                        anonymousClass7.customLocation = null;
                                        anonymousClass7.fetchLocationAddress();
                                        anonymousClass7.updateCell();
                                        locationActivity.userLocationMoved = false;
                                        locationActivity.showSearchPlacesButton$1(false);
                                        locationActivity.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(locationActivity.myLocation.getLatitude(), locationActivity.myLocation.getLongitude())));
                                        if (locationActivity.searchedForCustomLocations && i13 != 8) {
                                            Location location3 = locationActivity.myLocation;
                                            if (location3 != null) {
                                                locationActivity.adapter.searchPlacesWithQuery(null, location3, true);
                                            }
                                            locationActivity.searchedForCustomLocations = false;
                                            if (locationActivity.adapter.getItemCount() != 0 && locationActivity.layoutManager.findFirstVisibleItemPosition() == 0) {
                                                int top2 = locationActivity.listView.getChildAt(0).getTop() + AndroidUtilities.dp(258.0f);
                                                if (top2 >= 0 && top2 <= AndroidUtilities.dp(258.0f)) {
                                                    locationActivity.listView.smoothScrollBy(0, top2, null);
                                                }
                                            }
                                        }
                                    }
                                } else if (locationActivity.myLocation != null && (iMap = locationActivity.map) != null) {
                                    iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(locationActivity.myLocation.getLatitude(), locationActivity.myLocation.getLongitude()), locationActivity.map.getMaxZoomLevel() - 4.0f));
                                }
                                if (locationActivity.lastPressedMarker != null) {
                                    locationActivity.markerImageView.setVisibility(0);
                                    LocationActivity.MapOverlayView mapOverlayView = locationActivity.overlayView;
                                    IMapsProvider.IMarker iMarker = locationActivity.lastPressedMarker;
                                    View view2 = (View) mapOverlayView.views.get(iMarker);
                                    if (view2 != null) {
                                        mapOverlayView.removeView(view2);
                                        mapOverlayView.views.remove(iMarker);
                                    }
                                    locationActivity.lastPressedMarker = null;
                                    locationActivity.lastPressedVenue = null;
                                    locationActivity.lastPressedMarkerView = null;
                                }
                            }
                            break;
                        } else if (locationActivity.getParentActivity() != null) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(locationActivity.getParentActivity(), 0, null);
                            builder.setTopAnimation(R.raw.permission_request_location, 72, locationActivity.getThemedColor(Theme.key_dialogTopBackground), null);
                            SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                            AlertDialog alertDialog = builder.alertDialog;
                            alertDialog.message = spannableStringBuilderReplaceTags;
                            builder.setNegativeButton(LocaleController.getString(R.string.PermissionOpenSettings), new LocationActivity$$ExternalSyntheticLambda3(locationActivity, i11));
                            builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                            locationActivity.showDialog(alertDialog);
                            break;
                        }
                        break;
                    case 4:
                        locationActivity.selectedMarkerId = -1L;
                        locationActivity.userLocationMoved = true;
                        if (locationActivity.fitAllLiveLocations()) {
                            locationActivity.showAllMode = true;
                            locationActivity.showShowAllButton(false, true);
                        }
                        break;
                    default:
                        if (locationActivity.getParentActivity() != null && locationActivity.myLocation != null && locationActivity.checkGpsEnabled() && locationActivity.map != null) {
                            HintView2 hintView2 = locationActivity.hintView;
                            if (hintView2 != null) {
                                hintView2.hide(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = locationActivity.getLocationController().getSharingLocationInfo(locationActivity.dialogId);
                            if (locationActivity.canUndo) {
                                locationActivity.undoView[0].hide(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                locationActivity.proximityButton.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = locationActivity.proximityCircle;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    locationActivity.proximityCircle = null;
                                }
                                locationActivity.canUndo = true;
                                locationActivity.getUndoView$1().showWithAction(0L, 25, (Object) 0, (Object) null, (Runnable) new LocationActivity$$ExternalSyntheticLambda6(locationActivity, 1), (Runnable) new LinkManager$$ExternalSyntheticLambda2(4, locationActivity, sharingLocationInfo));
                            } else {
                                IMapsProvider.ICircle iCircle2 = locationActivity.proximityCircle;
                                if (iCircle2 == null) {
                                    locationActivity.createCircle(500);
                                } else {
                                    locationActivity.previousRadius = iCircle2.getRadius();
                                }
                                TLRPC.User user = DialogObject.isUserDialog(locationActivity.dialogId) ? locationActivity.getMessagesController().getUser(Long.valueOf(locationActivity.dialogId)) : null;
                                ProximitySheet proximitySheet = new ProximitySheet(locationActivity.getParentActivity(), user, new LocationActivity$$ExternalSyntheticLambda3(locationActivity, i12), new DialogsActivity$$ExternalSyntheticLambda89(22, locationActivity, user), new LocationActivity$$ExternalSyntheticLambda6(locationActivity, 3));
                                locationActivity.proximitySheet = proximitySheet;
                                ((FrameLayout) locationActivity.fragmentView).addView(proximitySheet, LayoutHelper.createFrame(-1.0f, -1));
                                ProximitySheet proximitySheet2 = locationActivity.proximitySheet;
                                proximitySheet2.dismissed = false;
                                AnimatorSet animatorSet = proximitySheet2.currentSheetAnimation;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    proximitySheet2.currentSheetAnimation = null;
                                }
                                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((proximitySheet2.backgroundPaddingLeft * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE);
                                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE);
                                ProximitySheet.AnonymousClass1 anonymousClass1 = proximitySheet2.containerView;
                                anonymousClass1.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                if (!proximitySheet2.dismissed) {
                                    anonymousClass1.setVisibility(0);
                                    if (proximitySheet2.useHardwareLayer) {
                                        proximitySheet2.setLayerType(2, null);
                                    }
                                    anonymousClass1.setTranslationY(anonymousClass1.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    proximitySheet2.currentSheetAnimation = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(anonymousClass1, (Property<ProximitySheet.AnonymousClass1, Float>) View.TRANSLATION_Y, 0.0f));
                                    proximitySheet2.currentSheetAnimation.setDuration(400L);
                                    proximitySheet2.currentSheetAnimation.setStartDelay(20L);
                                    proximitySheet2.currentSheetAnimation.setInterpolator(proximitySheet2.openInterpolator);
                                    proximitySheet2.currentSheetAnimation.addListener(new ProximitySheet.AnonymousClass4(proximitySheet2, 1));
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                    proximitySheet2.currentSheetAnimation.start();
                                }
                                proximitySheet2.updateText(true);
                            }
                            break;
                        }
                        break;
                }
            }
        });
        this.mapTypeButton.setDelegate(new LocationActivity$$ExternalSyntheticLambda3(this, 1));
        this.locationButton = new ImageView(context);
        BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSimpleSelectorCircleDrawable2 = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(40.0f), getThemedColor(i8), getThemedColor(i9));
        ScaleStateListAnimator.apply(this.locationButton, 0.1f, 1.5f);
        this.locationButton.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.locationButton.setOutlineProvider(anonymousClass6);
        this.locationButton.setBackground(rippleDrawableSafeCreateSimpleSelectorCircleDrawable2);
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
        layoutParamsCreateFrame.bottomMargin = (layoutParams.height - rect.top) + layoutParamsCreateFrame.bottomMargin;
        this.mapViewClip.addView(this.locationButton, layoutParamsCreateFrame);
        final int i12 = 3;
        this.locationButton.setOnClickListener(new View.OnClickListener(this) {
            public final LocationActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                IMapsProvider.IMap iMap;
                Activity parentActivity;
                int i13 = 4;
                int i14 = 3;
                LocationActivity locationActivity = this.f$0;
                switch (i12) {
                    case 0:
                        locationActivity.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = locationActivity.messageObject.messageOwner.media.geo;
                            double d = geoPoint.lat;
                            double d2 = geoPoint._long;
                            locationActivity.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                        break;
                    case 1:
                        locationActivity.showSearchPlacesButton$1(false);
                        locationActivity.adapter.searchPlacesWithQuery(null, locationActivity.userLocation, true);
                        locationActivity.searchedForCustomLocations = true;
                        if (locationActivity.adapter.getItemCount() != 0 && locationActivity.layoutManager.findFirstVisibleItemPosition() == 0) {
                            int top = locationActivity.listView.getChildAt(0).getTop() + AndroidUtilities.dp(258.0f);
                            if (top >= 0 && top <= AndroidUtilities.dp(258.0f)) {
                                locationActivity.listView.smoothScrollBy(0, top, null);
                                break;
                            }
                        }
                        break;
                    case 2:
                        locationActivity.mapTypeButton.toggleSubMenu(null, null);
                        break;
                    case 3:
                        if (Build.VERSION.SDK_INT < 23 || (parentActivity = locationActivity.getParentActivity()) == null || parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
                            boolean zCheckGpsEnabled = locationActivity.checkGpsEnabled();
                            int i15 = locationActivity.locationType;
                            if (zCheckGpsEnabled || i15 == 3) {
                                if ((locationActivity.messageObject == null || i15 == 3) && locationActivity.chatLocation == null) {
                                    if (locationActivity.myLocation != null && locationActivity.map != null) {
                                        ImageView imageView3 = locationActivity.locationButton;
                                        int i16 = Theme.key_location_actionActiveIcon;
                                        imageView3.setColorFilter(new PorterDuffColorFilter(locationActivity.getThemedColor(i16), PorterDuff.Mode.MULTIPLY));
                                        locationActivity.locationButton.setTag(Integer.valueOf(i16));
                                        LocationActivity.AnonymousClass4 anonymousClass7 = locationActivity.adapter;
                                        anonymousClass7.customLocation = null;
                                        anonymousClass7.fetchLocationAddress();
                                        anonymousClass7.updateCell();
                                        locationActivity.userLocationMoved = false;
                                        locationActivity.showSearchPlacesButton$1(false);
                                        locationActivity.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(locationActivity.myLocation.getLatitude(), locationActivity.myLocation.getLongitude())));
                                        if (locationActivity.searchedForCustomLocations && i15 != 8) {
                                            Location location3 = locationActivity.myLocation;
                                            if (location3 != null) {
                                                locationActivity.adapter.searchPlacesWithQuery(null, location3, true);
                                            }
                                            locationActivity.searchedForCustomLocations = false;
                                            if (locationActivity.adapter.getItemCount() != 0 && locationActivity.layoutManager.findFirstVisibleItemPosition() == 0) {
                                                int top2 = locationActivity.listView.getChildAt(0).getTop() + AndroidUtilities.dp(258.0f);
                                                if (top2 >= 0 && top2 <= AndroidUtilities.dp(258.0f)) {
                                                    locationActivity.listView.smoothScrollBy(0, top2, null);
                                                }
                                            }
                                        }
                                    }
                                } else if (locationActivity.myLocation != null && (iMap = locationActivity.map) != null) {
                                    iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(locationActivity.myLocation.getLatitude(), locationActivity.myLocation.getLongitude()), locationActivity.map.getMaxZoomLevel() - 4.0f));
                                }
                                if (locationActivity.lastPressedMarker != null) {
                                    locationActivity.markerImageView.setVisibility(0);
                                    LocationActivity.MapOverlayView mapOverlayView = locationActivity.overlayView;
                                    IMapsProvider.IMarker iMarker = locationActivity.lastPressedMarker;
                                    View view2 = (View) mapOverlayView.views.get(iMarker);
                                    if (view2 != null) {
                                        mapOverlayView.removeView(view2);
                                        mapOverlayView.views.remove(iMarker);
                                    }
                                    locationActivity.lastPressedMarker = null;
                                    locationActivity.lastPressedVenue = null;
                                    locationActivity.lastPressedMarkerView = null;
                                }
                            }
                            break;
                        } else if (locationActivity.getParentActivity() != null) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(locationActivity.getParentActivity(), 0, null);
                            builder.setTopAnimation(R.raw.permission_request_location, 72, locationActivity.getThemedColor(Theme.key_dialogTopBackground), null);
                            SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                            AlertDialog alertDialog = builder.alertDialog;
                            alertDialog.message = spannableStringBuilderReplaceTags;
                            builder.setNegativeButton(LocaleController.getString(R.string.PermissionOpenSettings), new LocationActivity$$ExternalSyntheticLambda3(locationActivity, i13));
                            builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                            locationActivity.showDialog(alertDialog);
                            break;
                        }
                        break;
                    case 4:
                        locationActivity.selectedMarkerId = -1L;
                        locationActivity.userLocationMoved = true;
                        if (locationActivity.fitAllLiveLocations()) {
                            locationActivity.showAllMode = true;
                            locationActivity.showShowAllButton(false, true);
                        }
                        break;
                    default:
                        if (locationActivity.getParentActivity() != null && locationActivity.myLocation != null && locationActivity.checkGpsEnabled() && locationActivity.map != null) {
                            HintView2 hintView2 = locationActivity.hintView;
                            if (hintView2 != null) {
                                hintView2.hide(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = locationActivity.getLocationController().getSharingLocationInfo(locationActivity.dialogId);
                            if (locationActivity.canUndo) {
                                locationActivity.undoView[0].hide(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                locationActivity.proximityButton.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = locationActivity.proximityCircle;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    locationActivity.proximityCircle = null;
                                }
                                locationActivity.canUndo = true;
                                locationActivity.getUndoView$1().showWithAction(0L, 25, (Object) 0, (Object) null, (Runnable) new LocationActivity$$ExternalSyntheticLambda6(locationActivity, 1), (Runnable) new LinkManager$$ExternalSyntheticLambda2(4, locationActivity, sharingLocationInfo));
                            } else {
                                IMapsProvider.ICircle iCircle2 = locationActivity.proximityCircle;
                                if (iCircle2 == null) {
                                    locationActivity.createCircle(500);
                                } else {
                                    locationActivity.previousRadius = iCircle2.getRadius();
                                }
                                TLRPC.User user = DialogObject.isUserDialog(locationActivity.dialogId) ? locationActivity.getMessagesController().getUser(Long.valueOf(locationActivity.dialogId)) : null;
                                ProximitySheet proximitySheet = new ProximitySheet(locationActivity.getParentActivity(), user, new LocationActivity$$ExternalSyntheticLambda3(locationActivity, i14), new DialogsActivity$$ExternalSyntheticLambda89(22, locationActivity, user), new LocationActivity$$ExternalSyntheticLambda6(locationActivity, 3));
                                locationActivity.proximitySheet = proximitySheet;
                                ((FrameLayout) locationActivity.fragmentView).addView(proximitySheet, LayoutHelper.createFrame(-1.0f, -1));
                                ProximitySheet proximitySheet2 = locationActivity.proximitySheet;
                                proximitySheet2.dismissed = false;
                                AnimatorSet animatorSet = proximitySheet2.currentSheetAnimation;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    proximitySheet2.currentSheetAnimation = null;
                                }
                                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((proximitySheet2.backgroundPaddingLeft * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE);
                                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE);
                                ProximitySheet.AnonymousClass1 anonymousClass1 = proximitySheet2.containerView;
                                anonymousClass1.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                if (!proximitySheet2.dismissed) {
                                    anonymousClass1.setVisibility(0);
                                    if (proximitySheet2.useHardwareLayer) {
                                        proximitySheet2.setLayerType(2, null);
                                    }
                                    anonymousClass1.setTranslationY(anonymousClass1.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    proximitySheet2.currentSheetAnimation = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(anonymousClass1, (Property<ProximitySheet.AnonymousClass1, Float>) View.TRANSLATION_Y, 0.0f));
                                    proximitySheet2.currentSheetAnimation.setDuration(400L);
                                    proximitySheet2.currentSheetAnimation.setStartDelay(20L);
                                    proximitySheet2.currentSheetAnimation.setInterpolator(proximitySheet2.openInterpolator);
                                    proximitySheet2.currentSheetAnimation.addListener(new ProximitySheet.AnonymousClass4(proximitySheet2, 1));
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                    proximitySheet2.currentSheetAnimation.start();
                                }
                                proximitySheet2.updateText(true);
                            }
                            break;
                        }
                        break;
                }
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
        this.showAllButton.setBackground(Theme.createRadSelectorDrawable(getThemedColor(i8), getThemedColor(i9), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(19.0f)));
        FrameLayout.LayoutParams layoutParamsCreateFrame2 = LayoutHelper.createFrame(-2, 38.0f, 81, 12.0f, 0.0f, 12.0f, 12.0f);
        layoutParamsCreateFrame2.bottomMargin = (layoutParams.height - rect.top) + layoutParamsCreateFrame2.bottomMargin;
        this.mapViewClip.addView(this.showAllButton, layoutParamsCreateFrame2);
        ScaleStateListAnimator.apply(this.showAllButton, 0.1f, 1.5f);
        final int i13 = 4;
        this.showAllButton.setOnClickListener(new View.OnClickListener(this) {
            public final LocationActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                IMapsProvider.IMap iMap;
                Activity parentActivity;
                int i14 = 4;
                int i15 = 3;
                LocationActivity locationActivity = this.f$0;
                switch (i13) {
                    case 0:
                        locationActivity.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = locationActivity.messageObject.messageOwner.media.geo;
                            double d = geoPoint.lat;
                            double d2 = geoPoint._long;
                            locationActivity.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                        break;
                    case 1:
                        locationActivity.showSearchPlacesButton$1(false);
                        locationActivity.adapter.searchPlacesWithQuery(null, locationActivity.userLocation, true);
                        locationActivity.searchedForCustomLocations = true;
                        if (locationActivity.adapter.getItemCount() != 0 && locationActivity.layoutManager.findFirstVisibleItemPosition() == 0) {
                            int top = locationActivity.listView.getChildAt(0).getTop() + AndroidUtilities.dp(258.0f);
                            if (top >= 0 && top <= AndroidUtilities.dp(258.0f)) {
                                locationActivity.listView.smoothScrollBy(0, top, null);
                                break;
                            }
                        }
                        break;
                    case 2:
                        locationActivity.mapTypeButton.toggleSubMenu(null, null);
                        break;
                    case 3:
                        if (Build.VERSION.SDK_INT < 23 || (parentActivity = locationActivity.getParentActivity()) == null || parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
                            boolean zCheckGpsEnabled = locationActivity.checkGpsEnabled();
                            int i16 = locationActivity.locationType;
                            if (zCheckGpsEnabled || i16 == 3) {
                                if ((locationActivity.messageObject == null || i16 == 3) && locationActivity.chatLocation == null) {
                                    if (locationActivity.myLocation != null && locationActivity.map != null) {
                                        ImageView imageView3 = locationActivity.locationButton;
                                        int i17 = Theme.key_location_actionActiveIcon;
                                        imageView3.setColorFilter(new PorterDuffColorFilter(locationActivity.getThemedColor(i17), PorterDuff.Mode.MULTIPLY));
                                        locationActivity.locationButton.setTag(Integer.valueOf(i17));
                                        LocationActivity.AnonymousClass4 anonymousClass7 = locationActivity.adapter;
                                        anonymousClass7.customLocation = null;
                                        anonymousClass7.fetchLocationAddress();
                                        anonymousClass7.updateCell();
                                        locationActivity.userLocationMoved = false;
                                        locationActivity.showSearchPlacesButton$1(false);
                                        locationActivity.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(locationActivity.myLocation.getLatitude(), locationActivity.myLocation.getLongitude())));
                                        if (locationActivity.searchedForCustomLocations && i16 != 8) {
                                            Location location3 = locationActivity.myLocation;
                                            if (location3 != null) {
                                                locationActivity.adapter.searchPlacesWithQuery(null, location3, true);
                                            }
                                            locationActivity.searchedForCustomLocations = false;
                                            if (locationActivity.adapter.getItemCount() != 0 && locationActivity.layoutManager.findFirstVisibleItemPosition() == 0) {
                                                int top2 = locationActivity.listView.getChildAt(0).getTop() + AndroidUtilities.dp(258.0f);
                                                if (top2 >= 0 && top2 <= AndroidUtilities.dp(258.0f)) {
                                                    locationActivity.listView.smoothScrollBy(0, top2, null);
                                                }
                                            }
                                        }
                                    }
                                } else if (locationActivity.myLocation != null && (iMap = locationActivity.map) != null) {
                                    iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(locationActivity.myLocation.getLatitude(), locationActivity.myLocation.getLongitude()), locationActivity.map.getMaxZoomLevel() - 4.0f));
                                }
                                if (locationActivity.lastPressedMarker != null) {
                                    locationActivity.markerImageView.setVisibility(0);
                                    LocationActivity.MapOverlayView mapOverlayView = locationActivity.overlayView;
                                    IMapsProvider.IMarker iMarker = locationActivity.lastPressedMarker;
                                    View view2 = (View) mapOverlayView.views.get(iMarker);
                                    if (view2 != null) {
                                        mapOverlayView.removeView(view2);
                                        mapOverlayView.views.remove(iMarker);
                                    }
                                    locationActivity.lastPressedMarker = null;
                                    locationActivity.lastPressedVenue = null;
                                    locationActivity.lastPressedMarkerView = null;
                                }
                            }
                            break;
                        } else if (locationActivity.getParentActivity() != null) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(locationActivity.getParentActivity(), 0, null);
                            builder.setTopAnimation(R.raw.permission_request_location, 72, locationActivity.getThemedColor(Theme.key_dialogTopBackground), null);
                            SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                            AlertDialog alertDialog = builder.alertDialog;
                            alertDialog.message = spannableStringBuilderReplaceTags;
                            builder.setNegativeButton(LocaleController.getString(R.string.PermissionOpenSettings), new LocationActivity$$ExternalSyntheticLambda3(locationActivity, i14));
                            builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                            locationActivity.showDialog(alertDialog);
                            break;
                        }
                        break;
                    case 4:
                        locationActivity.selectedMarkerId = -1L;
                        locationActivity.userLocationMoved = true;
                        if (locationActivity.fitAllLiveLocations()) {
                            locationActivity.showAllMode = true;
                            locationActivity.showShowAllButton(false, true);
                        }
                        break;
                    default:
                        if (locationActivity.getParentActivity() != null && locationActivity.myLocation != null && locationActivity.checkGpsEnabled() && locationActivity.map != null) {
                            HintView2 hintView2 = locationActivity.hintView;
                            if (hintView2 != null) {
                                hintView2.hide(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = locationActivity.getLocationController().getSharingLocationInfo(locationActivity.dialogId);
                            if (locationActivity.canUndo) {
                                locationActivity.undoView[0].hide(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                locationActivity.proximityButton.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = locationActivity.proximityCircle;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    locationActivity.proximityCircle = null;
                                }
                                locationActivity.canUndo = true;
                                locationActivity.getUndoView$1().showWithAction(0L, 25, (Object) 0, (Object) null, (Runnable) new LocationActivity$$ExternalSyntheticLambda6(locationActivity, 1), (Runnable) new LinkManager$$ExternalSyntheticLambda2(4, locationActivity, sharingLocationInfo));
                            } else {
                                IMapsProvider.ICircle iCircle2 = locationActivity.proximityCircle;
                                if (iCircle2 == null) {
                                    locationActivity.createCircle(500);
                                } else {
                                    locationActivity.previousRadius = iCircle2.getRadius();
                                }
                                TLRPC.User user = DialogObject.isUserDialog(locationActivity.dialogId) ? locationActivity.getMessagesController().getUser(Long.valueOf(locationActivity.dialogId)) : null;
                                ProximitySheet proximitySheet = new ProximitySheet(locationActivity.getParentActivity(), user, new LocationActivity$$ExternalSyntheticLambda3(locationActivity, i15), new DialogsActivity$$ExternalSyntheticLambda89(22, locationActivity, user), new LocationActivity$$ExternalSyntheticLambda6(locationActivity, 3));
                                locationActivity.proximitySheet = proximitySheet;
                                ((FrameLayout) locationActivity.fragmentView).addView(proximitySheet, LayoutHelper.createFrame(-1.0f, -1));
                                ProximitySheet proximitySheet2 = locationActivity.proximitySheet;
                                proximitySheet2.dismissed = false;
                                AnimatorSet animatorSet = proximitySheet2.currentSheetAnimation;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    proximitySheet2.currentSheetAnimation = null;
                                }
                                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((proximitySheet2.backgroundPaddingLeft * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE);
                                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE);
                                ProximitySheet.AnonymousClass1 anonymousClass1 = proximitySheet2.containerView;
                                anonymousClass1.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                if (!proximitySheet2.dismissed) {
                                    anonymousClass1.setVisibility(0);
                                    if (proximitySheet2.useHardwareLayer) {
                                        proximitySheet2.setLayerType(2, null);
                                    }
                                    anonymousClass1.setTranslationY(anonymousClass1.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    proximitySheet2.currentSheetAnimation = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(anonymousClass1, (Property<ProximitySheet.AnonymousClass1, Float>) View.TRANSLATION_Y, 0.0f));
                                    proximitySheet2.currentSheetAnimation.setDuration(400L);
                                    proximitySheet2.currentSheetAnimation.setStartDelay(20L);
                                    proximitySheet2.currentSheetAnimation.setInterpolator(proximitySheet2.openInterpolator);
                                    proximitySheet2.currentSheetAnimation.addListener(new ProximitySheet.AnonymousClass4(proximitySheet2, 1));
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                    proximitySheet2.currentSheetAnimation.start();
                                }
                                proximitySheet2.updateText(true);
                            }
                            break;
                        }
                        break;
                }
            }
        });
        showShowAllButton(false, false);
        this.proximityButton = new ImageView(context);
        BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSimpleSelectorCircleDrawable3 = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(40.0f), getThemedColor(i8), getThemedColor(i9));
        ScaleStateListAnimator.apply(this.proximityButton, 0.1f, 1.5f);
        this.proximityButton.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.proximityButton.setOutlineProvider(anonymousClass6);
        this.proximityButton.setColorFilter(new PorterDuffColorFilter(getThemedColor(i7), mode));
        this.proximityButton.setBackgroundDrawable(rippleDrawableSafeCreateSimpleSelectorCircleDrawable3);
        this.proximityButton.setScaleType(scaleType);
        this.proximityButton.setContentDescription(LocaleController.getString(R.string.AccDescrLocationNotify));
        this.mapViewClip.addView(this.proximityButton, LayoutHelper.createFrame(40, 40.0f, 53, 0.0f, 62.0f, 12.0f, 0.0f));
        final int i14 = 5;
        this.proximityButton.setOnClickListener(new View.OnClickListener(this) {
            public final LocationActivity f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                IMapsProvider.IMap iMap;
                Activity parentActivity;
                int i15 = 4;
                int i16 = 3;
                LocationActivity locationActivity = this.f$0;
                switch (i14) {
                    case 0:
                        locationActivity.getClass();
                        try {
                            TLRPC.GeoPoint geoPoint = locationActivity.messageObject.messageOwner.media.geo;
                            double d = geoPoint.lat;
                            double d2 = geoPoint._long;
                            locationActivity.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d2 + "?q=" + d + "," + d2)));
                        } catch (Exception e) {
                            FileLog.e(e);
                            return;
                        }
                        break;
                    case 1:
                        locationActivity.showSearchPlacesButton$1(false);
                        locationActivity.adapter.searchPlacesWithQuery(null, locationActivity.userLocation, true);
                        locationActivity.searchedForCustomLocations = true;
                        if (locationActivity.adapter.getItemCount() != 0 && locationActivity.layoutManager.findFirstVisibleItemPosition() == 0) {
                            int top = locationActivity.listView.getChildAt(0).getTop() + AndroidUtilities.dp(258.0f);
                            if (top >= 0 && top <= AndroidUtilities.dp(258.0f)) {
                                locationActivity.listView.smoothScrollBy(0, top, null);
                                break;
                            }
                        }
                        break;
                    case 2:
                        locationActivity.mapTypeButton.toggleSubMenu(null, null);
                        break;
                    case 3:
                        if (Build.VERSION.SDK_INT < 23 || (parentActivity = locationActivity.getParentActivity()) == null || parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
                            boolean zCheckGpsEnabled = locationActivity.checkGpsEnabled();
                            int i17 = locationActivity.locationType;
                            if (zCheckGpsEnabled || i17 == 3) {
                                if ((locationActivity.messageObject == null || i17 == 3) && locationActivity.chatLocation == null) {
                                    if (locationActivity.myLocation != null && locationActivity.map != null) {
                                        ImageView imageView3 = locationActivity.locationButton;
                                        int i18 = Theme.key_location_actionActiveIcon;
                                        imageView3.setColorFilter(new PorterDuffColorFilter(locationActivity.getThemedColor(i18), PorterDuff.Mode.MULTIPLY));
                                        locationActivity.locationButton.setTag(Integer.valueOf(i18));
                                        LocationActivity.AnonymousClass4 anonymousClass7 = locationActivity.adapter;
                                        anonymousClass7.customLocation = null;
                                        anonymousClass7.fetchLocationAddress();
                                        anonymousClass7.updateCell();
                                        locationActivity.userLocationMoved = false;
                                        locationActivity.showSearchPlacesButton$1(false);
                                        locationActivity.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(locationActivity.myLocation.getLatitude(), locationActivity.myLocation.getLongitude())));
                                        if (locationActivity.searchedForCustomLocations && i17 != 8) {
                                            Location location3 = locationActivity.myLocation;
                                            if (location3 != null) {
                                                locationActivity.adapter.searchPlacesWithQuery(null, location3, true);
                                            }
                                            locationActivity.searchedForCustomLocations = false;
                                            if (locationActivity.adapter.getItemCount() != 0 && locationActivity.layoutManager.findFirstVisibleItemPosition() == 0) {
                                                int top2 = locationActivity.listView.getChildAt(0).getTop() + AndroidUtilities.dp(258.0f);
                                                if (top2 >= 0 && top2 <= AndroidUtilities.dp(258.0f)) {
                                                    locationActivity.listView.smoothScrollBy(0, top2, null);
                                                }
                                            }
                                        }
                                    }
                                } else if (locationActivity.myLocation != null && (iMap = locationActivity.map) != null) {
                                    iMap.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(new IMapsProvider.LatLng(locationActivity.myLocation.getLatitude(), locationActivity.myLocation.getLongitude()), locationActivity.map.getMaxZoomLevel() - 4.0f));
                                }
                                if (locationActivity.lastPressedMarker != null) {
                                    locationActivity.markerImageView.setVisibility(0);
                                    LocationActivity.MapOverlayView mapOverlayView = locationActivity.overlayView;
                                    IMapsProvider.IMarker iMarker = locationActivity.lastPressedMarker;
                                    View view2 = (View) mapOverlayView.views.get(iMarker);
                                    if (view2 != null) {
                                        mapOverlayView.removeView(view2);
                                        mapOverlayView.views.remove(iMarker);
                                    }
                                    locationActivity.lastPressedMarker = null;
                                    locationActivity.lastPressedVenue = null;
                                    locationActivity.lastPressedMarkerView = null;
                                }
                            }
                            break;
                        } else if (locationActivity.getParentActivity() != null) {
                            AlertDialog.Builder builder = new AlertDialog.Builder(locationActivity.getParentActivity(), 0, null);
                            builder.setTopAnimation(R.raw.permission_request_location, 72, locationActivity.getThemedColor(Theme.key_dialogTopBackground), null);
                            SpannableStringBuilder spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoLocationFriends));
                            AlertDialog alertDialog = builder.alertDialog;
                            alertDialog.message = spannableStringBuilderReplaceTags;
                            builder.setNegativeButton(LocaleController.getString(R.string.PermissionOpenSettings), new LocationActivity$$ExternalSyntheticLambda3(locationActivity, i15));
                            builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
                            locationActivity.showDialog(alertDialog);
                            break;
                        }
                        break;
                    case 4:
                        locationActivity.selectedMarkerId = -1L;
                        locationActivity.userLocationMoved = true;
                        if (locationActivity.fitAllLiveLocations()) {
                            locationActivity.showAllMode = true;
                            locationActivity.showShowAllButton(false, true);
                        }
                        break;
                    default:
                        if (locationActivity.getParentActivity() != null && locationActivity.myLocation != null && locationActivity.checkGpsEnabled() && locationActivity.map != null) {
                            HintView2 hintView2 = locationActivity.hintView;
                            if (hintView2 != null) {
                                hintView2.hide(true);
                            }
                            MessagesController.getGlobalMainSettings().edit().putInt("proximityhint", 3).commit();
                            LocationController.SharingLocationInfo sharingLocationInfo = locationActivity.getLocationController().getSharingLocationInfo(locationActivity.dialogId);
                            if (locationActivity.canUndo) {
                                locationActivity.undoView[0].hide(1, true);
                            }
                            if (sharingLocationInfo != null && sharingLocationInfo.proximityMeters > 0) {
                                locationActivity.proximityButton.setImageResource(R.drawable.msg_location_alert);
                                IMapsProvider.ICircle iCircle = locationActivity.proximityCircle;
                                if (iCircle != null) {
                                    iCircle.remove();
                                    locationActivity.proximityCircle = null;
                                }
                                locationActivity.canUndo = true;
                                locationActivity.getUndoView$1().showWithAction(0L, 25, (Object) 0, (Object) null, (Runnable) new LocationActivity$$ExternalSyntheticLambda6(locationActivity, 1), (Runnable) new LinkManager$$ExternalSyntheticLambda2(4, locationActivity, sharingLocationInfo));
                            } else {
                                IMapsProvider.ICircle iCircle2 = locationActivity.proximityCircle;
                                if (iCircle2 == null) {
                                    locationActivity.createCircle(500);
                                } else {
                                    locationActivity.previousRadius = iCircle2.getRadius();
                                }
                                TLRPC.User user = DialogObject.isUserDialog(locationActivity.dialogId) ? locationActivity.getMessagesController().getUser(Long.valueOf(locationActivity.dialogId)) : null;
                                ProximitySheet proximitySheet = new ProximitySheet(locationActivity.getParentActivity(), user, new LocationActivity$$ExternalSyntheticLambda3(locationActivity, i16), new DialogsActivity$$ExternalSyntheticLambda89(22, locationActivity, user), new LocationActivity$$ExternalSyntheticLambda6(locationActivity, 3));
                                locationActivity.proximitySheet = proximitySheet;
                                ((FrameLayout) locationActivity.fragmentView).addView(proximitySheet, LayoutHelper.createFrame(-1.0f, -1));
                                ProximitySheet proximitySheet2 = locationActivity.proximitySheet;
                                proximitySheet2.dismissed = false;
                                AnimatorSet animatorSet = proximitySheet2.currentSheetAnimation;
                                if (animatorSet != null) {
                                    animatorSet.cancel();
                                    proximitySheet2.currentSheetAnimation = null;
                                }
                                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((proximitySheet2.backgroundPaddingLeft * 2) + AndroidUtilities.displaySize.x, Integer.MIN_VALUE);
                                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.y, Integer.MIN_VALUE);
                                ProximitySheet.AnonymousClass1 anonymousClass1 = proximitySheet2.containerView;
                                anonymousClass1.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                if (!proximitySheet2.dismissed) {
                                    anonymousClass1.setVisibility(0);
                                    if (proximitySheet2.useHardwareLayer) {
                                        proximitySheet2.setLayerType(2, null);
                                    }
                                    anonymousClass1.setTranslationY(anonymousClass1.getMeasuredHeight());
                                    AnimatorSet animatorSet2 = new AnimatorSet();
                                    proximitySheet2.currentSheetAnimation = animatorSet2;
                                    animatorSet2.playTogether(ObjectAnimator.ofFloat(anonymousClass1, (Property<ProximitySheet.AnonymousClass1, Float>) View.TRANSLATION_Y, 0.0f));
                                    proximitySheet2.currentSheetAnimation.setDuration(400L);
                                    proximitySheet2.currentSheetAnimation.setStartDelay(20L);
                                    proximitySheet2.currentSheetAnimation.setInterpolator(proximitySheet2.openInterpolator);
                                    proximitySheet2.currentSheetAnimation.addListener(new ProximitySheet.AnonymousClass4(proximitySheet2, 1));
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                                    proximitySheet2.currentSheetAnimation.start();
                                }
                                proximitySheet2.updateText(true);
                            }
                            break;
                        }
                        break;
                }
            }
        });
        TLRPC.Chat chat = DialogObject.isChatDialog(this.dialogId) ? getMessagesController().getChat(Long.valueOf(-this.dialogId)) : null;
        MessageObject messageObject3 = this.messageObject;
        if (messageObject3 == null || !messageObject3.isLiveLocation() || this.messageObject.isExpiredLiveLocation(getConnectionsManager().getCurrentTime()) || (ChatObject.isChannel(chat) && !chat.megagroup)) {
            this.proximityButton.setVisibility(8);
            this.proximityButton.setImageResource(R.drawable.msg_location_alert);
        } else {
            LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(this.dialogId);
            if (sharingLocationInfo == null || sharingLocationInfo.proximityMeters <= 0) {
                if (DialogObject.isUserDialog(this.dialogId) && this.messageObject.getFromChatId() == getUserConfig().getClientUserId()) {
                    this.proximityButton.setVisibility(4);
                    this.proximityButton.setAlpha(0.0f);
                    this.proximityButton.setScaleX(0.4f);
                    this.proximityButton.setScaleY(0.4f);
                }
                this.proximityButton.setImageResource(R.drawable.msg_location_alert);
            } else {
                this.proximityButton.setImageResource(R.drawable.msg_location_alert2);
            }
        }
        HintView2 hintView2 = new HintView2(context, 1);
        this.hintView = hintView2;
        hintView2.setLayerType(2, null);
        HintView2 hintView3 = this.hintView;
        hintView3.duration = 4000L;
        hintView3.setJoint(1.0f, -25.0f);
        this.hintView.setPadding(0, AndroidUtilities.dp(4.0f), 0, 0);
        this.mapViewClip.addView(this.hintView, LayoutHelper.createFrame(-1, -2.0f, 51, 8.0f, 106.0f, 8.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.emptyView = linearLayout;
        linearLayout.setOrientation(1);
        this.emptyView.setGravity(1);
        this.emptyView.setPadding(0, AndroidUtilities.dp(160.0f), 0, 0);
        this.emptyView.setVisibility(8);
        nestedFrameLayout.addView(this.emptyView, LayoutHelper.createFrame(-1.0f, -1));
        this.emptyView.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(2));
        ImageView imageView3 = new ImageView(context);
        this.emptyImageView = imageView3;
        imageView3.setImageResource(R.drawable.location_empty);
        this.emptyImageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_dialogEmptyImage), mode));
        this.emptyView.addView(this.emptyImageView, LayoutHelper.createLinear(-2, -2));
        TextView textView2 = new TextView(context);
        this.emptyTitleTextView = textView2;
        int i15 = Theme.key_dialogEmptyText;
        textView2.setTextColor(getThemedColor(i15));
        this.emptyTitleTextView.setGravity(17);
        this.emptyTitleTextView.setTypeface(AndroidUtilities.bold());
        this.emptyTitleTextView.setTextSize(1, 17.0f);
        this.emptyTitleTextView.setText(LocaleController.getString(R.string.NoPlacesFound));
        this.emptyView.addView(this.emptyTitleTextView, LayoutHelper.createLinear(-2, -2, 17, 0, 11, 0, 0));
        TextView textView3 = new TextView(context);
        this.emptySubtitleTextView = textView3;
        textView3.setTextColor(getThemedColor(i15));
        this.emptySubtitleTextView.setGravity(17);
        this.emptySubtitleTextView.setTextSize(1, 15.0f);
        this.emptySubtitleTextView.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        this.emptyView.addView(this.emptySubtitleTextView, LayoutHelper.createLinear(-2, -2, 17, 0, 6, 0, 0));
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        AnonymousClass4 anonymousClass7 = new AnonymousClass4(context, this.locationType, this.dialogId, getResourceProvider(), this.fromStories, i3 == 8);
        this.adapter = anonymousClass7;
        recyclerListView.setAdapter(anonymousClass7);
        RecyclerListView recyclerListView2 = this.listView;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.layoutManager = linearLayoutManager;
        recyclerListView2.setLayoutManager(linearLayoutManager);
        if (this.searchStoriesArea != null) {
            this.sharedMediaHeader = new GraySectionCell(context, 16, this.resourceProvider);
            ?? r0 = new SharedMediaLayout(context, new SharedMediaLayout.SharedMediaPreloader(this), this, new SharedMediaLayout.Delegate() {
                @Override
                public final boolean canSearchMembers() {
                    return false;
                }

                @Override
                public final TLRPC.Chat getCurrentChat() {
                    return null;
                }

                @Override
                public final RecyclerListView getListView() {
                    return LocationActivity.this.listView;
                }

                @Override
                public final boolean isFragmentOpened() {
                    return true;
                }

                @Override
                public final boolean onMemberClick(TLRPC.ChatParticipant chatParticipant, boolean z, boolean z2, View view) {
                    return false;
                }

                @Override
                public final void scrollToSharedMedia() {
                }

                @Override
                public final void updateSelectedMediaTabText() {
                    LocationActivity locationActivity = LocationActivity.this;
                    AnonymousClass6 anonymousClass8 = locationActivity.sharedMediaLayout;
                    int storiesCount = anonymousClass8 == null ? 0 : anonymousClass8.getStoriesCount(8);
                    locationActivity.sharedMediaHeader.setText(LocaleController.formatPluralString("LocationStories", storiesCount, new Object[0]));
                    AnonymousClass4 anonymousClass10 = locationActivity.adapter;
                    boolean z = storiesCount > 0;
                    if (anonymousClass10.sharedMediaLayoutVisible != z) {
                        anonymousClass10.sharedMediaLayoutVisible = z;
                        anonymousClass10.mObservable.notifyChanged();
                        locationActivity.listView.smoothScrollBy(0, AndroidUtilities.dp(200.0f), null);
                    }
                }
            }, getResourceProvider()) {
                @Override
                public final boolean customTabs() {
                    return true;
                }

                @Override
                public final TL_stories.MediaArea getStoriesArea() {
                    return LocationActivity.this.searchStoriesArea;
                }

                @Override
                public final int mediaPageTopMargin() {
                    return 32;
                }

                @Override
                public final int overrideColumnsCount() {
                    return 3;
                }
            };
            this.sharedMediaLayout = r0;
            r0.setBackgroundColor(getThemedColor(i));
            addView(this.sharedMediaHeader, LayoutHelper.createFrame(-1, 32, 55));
            this.adapter.sharedMediaLayout = this.sharedMediaLayout;
            this.listView.setOverScrollMode(2);
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.mSupportsChangeAnimations = false;
            defaultItemAnimator.delayAnimations = false;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
            defaultItemAnimator.setDurations(350L);
            this.listView.setItemAnimator(defaultItemAnimator);
        }
        this.adapter.setMyLocationDenied(this.locationDenied, false);
        this.adapter.getClass();
        this.listView.setVerticalScrollBarEnabled(false);
        nestedFrameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        MessageObject messageObject4 = this.messageObject;
        if (messageObject4 != null && (message = messageObject4.messageOwner) != null && (messageMedia = message.media) != null && !TextUtils.isEmpty(messageMedia.address)) {
            AnonymousClass4 anonymousClass8 = this.adapter;
            anonymousClass8.overrideAddressName = this.messageObject.messageOwner.media.address;
            anonymousClass8.updateCell();
        }
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public final void onScrollStateChanged(RecyclerView recyclerView, int i16) {
                boolean z = i16 != 0;
                LocationActivity locationActivity = LocationActivity.this;
                locationActivity.scrolling = z;
                if (z || locationActivity.forceUpdate == null) {
                    return;
                }
                locationActivity.forceUpdate = null;
            }

            @Override
            public final void onScrolled(RecyclerView recyclerView, int i16, int i17) {
                LocationActivity locationActivity = LocationActivity.this;
                locationActivity.updateClipView(false);
                if (locationActivity.forceUpdate != null) {
                    locationActivity.yOffset += i17;
                }
            }
        });
        ((DefaultItemAnimator) this.listView.getItemAnimator()).delayAnimations = false;
        this.listView.setOnItemLongClickListener(new DialogsActivity$$ExternalSyntheticLambda89(21, this, context));
        this.listView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda61(this, 19));
        AnonymousClass4 anonymousClass10 = this.adapter;
        long j = this.dialogId;
        LocationActivity$$ExternalSyntheticLambda3 locationActivity$$ExternalSyntheticLambda3 = new LocationActivity$$ExternalSyntheticLambda3(this, 0);
        ((BaseLocationAdapter) anonymousClass10).dialogId = j;
        anonymousClass10.delegate = locationActivity$$ExternalSyntheticLambda3;
        anonymousClass10.setOverScrollHeight(this.overScrollHeight);
        nestedFrameLayout.addView(this.mapViewClip, LayoutHelper.createFrame(-1, -1, 51));
        IMapsProvider.IMapView iMapViewOnCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.mapView = iMapViewOnCreateMapView;
        iMapViewOnCreateMapView.getView().setAlpha(0.0f);
        this.mapView.setOnDispatchTouchEventInterceptor(new LocationActivity$$ExternalSyntheticLambda3(this, 6));
        this.mapView.setOnInterceptTouchEventInterceptor(new LocationActivity$$ExternalSyntheticLambda3(this, 7));
        this.mapView.setOnLayoutListener(new LocationActivity$$ExternalSyntheticLambda6(this, 0));
        new Thread(new LocationActivity$$ExternalSyntheticLambda7(this, this.mapView, 0)).start();
        MessageObject messageObject5 = this.messageObject;
        if (messageObject5 == null && this.chatLocation == null) {
            if (chat != null && i3 == 4 && this.dialogId != 0) {
                FrameLayout frameLayout = new FrameLayout(context);
                frameLayout.setBackgroundResource(R.drawable.livepin);
                this.mapViewClip.addView(frameLayout, LayoutHelper.createFrame(62, 76, 49));
                BackupImageView backupImageView = new BackupImageView(context);
                backupImageView.setRoundRadius(AndroidUtilities.dp(26.0f));
                backupImageView.imageReceiver.setForUserOrChat(chat, new AvatarDrawable(chat));
                backupImageView.onNewImageSet();
                frameLayout.addView(backupImageView, LayoutHelper.createFrame(52, 52.0f, 51, 5.0f, 5.0f, 0.0f, 0.0f));
                this.markerImageView = frameLayout;
                frameLayout.setTag(1);
            }
            if (this.markerImageView == null) {
                ImageView imageView4 = new ImageView(context);
                imageView4.setImageResource(R.drawable.map_pin2);
                this.mapViewClip.addView(imageView4, LayoutHelper.createFrame(28, 48, 49));
                this.markerImageView = imageView4;
            }
            RecyclerListView recyclerListView3 = new RecyclerListView(context, null);
            this.searchListView = recyclerListView3;
            recyclerListView3.setVisibility(8);
            this.searchListView.setLayoutManager(new LinearLayoutManager(1, false));
            ?? r1 = new LocationActivitySearchAdapter(context, getResourceProvider(), i3 == 8) {
                @Override
                public final void notifyDataSetChanged() {
                    LocationActivity locationActivity = LocationActivity.this;
                    ActionBarMenuItem actionBarMenuItem3 = locationActivity.searchItem;
                    if (actionBarMenuItem3 != null) {
                        actionBarMenuItem3.setShowSearchProgress(locationActivity.searchAdapter.searchInProgress);
                    }
                    TextView textView4 = locationActivity.emptySubtitleTextView;
                    if (textView4 != null) {
                        textView4.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, locationActivity.searchAdapter.lastFoundQuery)));
                    }
                    this.mObservable.notifyChanged();
                }
            };
            this.searchAdapter = r1;
            LocationActivity$$ExternalSyntheticLambda3 locationActivity$$ExternalSyntheticLambda4 = new LocationActivity$$ExternalSyntheticLambda3(this, 8);
            r1.dialogId = 0L;
            r1.delegate = locationActivity$$ExternalSyntheticLambda4;
            nestedFrameLayout.addView(this.searchListView, LayoutHelper.createFrame(-1, -1, 51));
            this.searchListView.setOnScrollListener(new AnonymousClass10(this, 0));
            this.searchListView.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda0(17, this, actionBarMenuCreateMenu));
        } else if ((messageObject5 != null && !messageObject5.isLiveLocation()) || this.chatLocation != null) {
            TLRPC.TL_channelLocation tL_channelLocation2 = this.chatLocation;
            if (tL_channelLocation2 != null) {
                this.adapter.chatLocation = tL_channelLocation2;
            } else {
                MessageObject messageObject6 = this.messageObject;
                if (messageObject6 != null) {
                    AnonymousClass4 anonymousClass11 = this.adapter;
                    anonymousClass11.currentMessageObject = messageObject6;
                    anonymousClass11.mObservable.notifyChanged();
                }
            }
        }
        MessageObject messageObject7 = this.messageObject;
        if (messageObject7 != null && i3 == 6) {
            AnonymousClass4 anonymousClass12 = this.adapter;
            anonymousClass12.currentMessageObject = messageObject7;
            anonymousClass12.mObservable.notifyChanged();
        }
        for (int i16 = 0; i16 < 2; i16++) {
            UndoView undoView = new UndoView(context, null, false, null);
            UndoView[] undoViewArr = this.undoView;
            undoViewArr[i16] = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(10.0f));
            undoViewArr[i16].setTranslationZ(AndroidUtilities.dp(5.0f));
            this.mapViewClip.addView(undoViewArr[i16], LayoutHelper.createFrame(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
        CalendarActivity.AnonymousClass5 anonymousClass13 = new CalendarActivity.AnonymousClass5(this, context, rect);
        this.shadow = anonymousClass13;
        anonymousClass13.setTranslationZ(AndroidUtilities.dp(6.0f));
        this.mapViewClip.addView(this.shadow, layoutParams);
        if (this.messageObject == null && this.chatLocation == null && this.initialLocation != null) {
            this.userLocationMoved = true;
            ImageView imageView5 = this.locationButton;
            int i17 = Theme.key_location_actionIcon;
            imageView5.setColorFilter(new PorterDuffColorFilter(getThemedColor(i17), PorterDuff.Mode.MULTIPLY));
            this.locationButton.setTag(Integer.valueOf(i17));
        }
        nestedFrameLayout.addView(this.actionBar);
        updateEmptyView$5();
        return this.fragmentView;
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        AnonymousClass4 anonymousClass4;
        AnonymousClass4 anonymousClass5;
        if (i == NotificationCenter.closeChats) {
            removeSelfFromStack(true);
            return;
        }
        if (i == NotificationCenter.locationPermissionGranted) {
            this.locationDenied = false;
            AnonymousClass4 anonymousClass6 = this.adapter;
            if (anonymousClass6 != null) {
                anonymousClass6.setMyLocationDenied(false, false);
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
            AnonymousClass4 anonymousClass7 = this.adapter;
            if (anonymousClass7 != null) {
                anonymousClass7.setMyLocationDenied(true, false);
                return;
            }
            return;
        }
        if (i == NotificationCenter.liveLocationsChanged) {
            AnonymousClass4 anonymousClass8 = this.adapter;
            if (anonymousClass8 != null) {
                anonymousClass8.mObservable.notifyChanged();
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
            if (!z || (anonymousClass5 = this.adapter) == null) {
                return;
            }
            anonymousClass5.setLiveLocations(this.markers);
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
                if (messageObject2.isLiveLocation()) {
                    TLRPC.Message message = messageObject2.messageOwner;
                    LiveLocation liveLocation = (LiveLocation) this.markersMap.get(message.from_id != null ? MessageObject.getFromChatId(message) : MessageObject.getDialogId(message));
                    if (liveLocation != null) {
                        LocationController.SharingLocationInfo sharingLocationInfo = getLocationController().getSharingLocationInfo(jLongValue);
                        if (sharingLocationInfo == null || sharingLocationInfo.mid != messageObject2.getId()) {
                            TLRPC.Message message2 = messageObject2.messageOwner;
                            liveLocation.object = message2;
                            TLRPC.GeoPoint geoPoint = message2.media.geo;
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
            }
            if (z2 && (anonymousClass4 = this.adapter) != null) {
                anonymousClass4.mObservable.notifyChanged();
                ProximitySheet proximitySheet = this.proximitySheet;
                if (proximitySheet != null) {
                    proximitySheet.updateText(true);
                }
            }
            if (z2) {
                updateShowAllButton();
            }
        }
    }

    public boolean disablePermissionCheck() {
        return this instanceof ChatActivity.ChatMessageCellDelegate.AnonymousClass7;
    }

    public final void fetchRecentLocations(ArrayList arrayList) {
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
                    this.proximityButton.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(180L).setListener(new PhotoViewer$41$1(this, 17)).start();
                }
            }
        }
        if (iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder != null) {
            if (this.firstFocus) {
                this.listView.smoothScrollBy(0, AndroidUtilities.dp(99.0f), null);
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

    @Override
    public final boolean finishFragment(boolean z) {
        if (onCheckGlScreenshot()) {
            return false;
        }
        return super.finishFragment(z);
    }

    public final boolean fitAllLiveLocations() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        int i;
        if (this.map == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        int currentTime = getConnectionsManager() != null ? getConnectionsManager().getCurrentTime() : 0;
        ArrayList arrayList2 = this.markers;
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            LiveLocation liveLocation = (LiveLocation) arrayList2.get(i2);
            IMapsProvider.IMarker iMarker = liveLocation.marker;
            if (iMarker != null && (message = liveLocation.object) != null && (messageMedia = message.media) != null && ((i = messageMedia.period) == Integer.MAX_VALUE || message.date + i > currentTime)) {
                arrayList.add(iMarker.getPosition());
            }
        }
        boolean z = this.markersMap.get(getUserConfig().getClientUserId()) != null;
        Location location = this.myLocation;
        if (location != null && !z) {
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
            this.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngBounds(iLatLngBoundsBuilderOnCreateLatLngBoundsBuilder.build(), AndroidUtilities.dp(60.0f)), 500, null);
            return true;
        } catch (Exception e) {
            FileLog.e(e);
            return false;
        }
    }

    public final void fixLayoutInternal$1(boolean z) {
        int i;
        FrameLayout.LayoutParams layoutParams;
        if (this.listView != null) {
            int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + (this.actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
            int measuredHeight = this.fragmentView.getMeasuredHeight();
            if (measuredHeight == 0) {
                return;
            }
            int i2 = this.locationType;
            if (i2 != 6 && i2 == 2) {
                this.overScrollHeight = RichMessageLayout$$ExternalSyntheticOutline2.m(measuredHeight, 73.0f, currentActionBarHeight);
            } else {
                this.overScrollHeight = RichMessageLayout$$ExternalSyntheticOutline2.m(measuredHeight, 66.0f, currentActionBarHeight);
            }
            AnonymousClass6 anonymousClass6 = this.sharedMediaLayout;
            if (anonymousClass6 != null && anonymousClass6.getStoriesCount(8) > 0) {
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
                layoutParams5.height = AndroidUtilities.dp(10.0f) + this.overScrollHeight;
                IMapsProvider.IMap iMap = this.map;
                if (iMap != null) {
                    iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                }
                this.mapView.getView().setLayoutParams(layoutParams5);
            }
            MapOverlayView mapOverlayView = this.overlayView;
            if (mapOverlayView != null && (layoutParams = (FrameLayout.LayoutParams) mapOverlayView.getLayoutParams()) != null) {
                layoutParams.height = AndroidUtilities.dp(10.0f) + this.overScrollHeight;
                this.overlayView.setLayoutParams(layoutParams);
            }
            this.adapter.mObservable.notifyChanged();
            if (!z) {
                updateClipView(false);
                return;
            }
            if (i2 == 3) {
                i = 73;
            } else {
                i = (i2 == 1 || i2 == 2) ? 66 : 0;
            }
            LinearLayoutManager linearLayoutManager = this.layoutManager;
            linearLayoutManager.scrollToPositionWithOffset(0, -AndroidUtilities.dp(i), linearLayoutManager.mShouldReverseLayout);
            updateClipView(false);
            this.listView.post(new OAuthSheet$$ExternalSyntheticLambda17(this, i, 16));
        }
    }

    public final boolean getRecentLocations() {
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
        long dialogId = this.messageObject.getDialogId();
        tL_messages_getRecentLocations.peer = getMessagesController().getInputPeer(dialogId);
        tL_messages_getRecentLocations.limit = 100;
        getConnectionsManager().sendRequest(tL_messages_getRecentLocations, new LocationActivity$$ExternalSyntheticLambda44(this, dialogId, 0));
        return arrayList != null;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
        QrActivity$$ExternalSyntheticLambda9 qrActivity$$ExternalSyntheticLambda9 = new QrActivity$$ExternalSyntheticLambda9(4, this);
        int i = 0;
        while (true) {
            UndoView[] undoViewArr = this.undoView;
            if (i >= undoViewArr.length) {
                break;
            }
            UndoView undoView = undoViewArr[i];
            int i2 = Theme.key_undo_background;
            arrayList.add(new ThemeDescription(undoView, 32, null, null, null, null, i2));
            int i3 = Theme.key_undo_cancelColor;
            arrayList.add(new ThemeDescription(undoViewArr[i], 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, -1, null, i3));
            arrayList.add(new ThemeDescription(undoViewArr[i], 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, -1, null, i3));
            int i4 = Theme.key_undo_infoColor;
            arrayList.add(new ThemeDescription(undoViewArr[i], 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, -1, null, i4));
            arrayList.add(new ThemeDescription(undoViewArr[i], 0, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, null, null, -1, null, i4));
            arrayList.add(new ThemeDescription(undoViewArr[i], 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, -1, null, i4));
            arrayList.add(new ThemeDescription(undoViewArr[i], 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, -1, null, i4));
            arrayList.add(new ThemeDescription(undoViewArr[i], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "BODY", i2));
            arrayList.add(new ThemeDescription(undoViewArr[i], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Big", i2));
            arrayList.add(new ThemeDescription(undoViewArr[i], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Big 3", i4));
            arrayList.add(new ThemeDescription(undoViewArr[i], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Wibe Small", i4));
            arrayList.add(new ThemeDescription(undoViewArr[i], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Body Main", i4));
            arrayList.add(new ThemeDescription(undoViewArr[i], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Body Top", i4));
            arrayList.add(new ThemeDescription(undoViewArr[i], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Line", i4));
            arrayList.add(new ThemeDescription(undoViewArr[i], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Curve Big", i4));
            arrayList.add(new ThemeDescription(undoViewArr[i], new Class[]{UndoView.class}, new String[]{"leftImageView"}, "Curve Small", i4));
            i++;
        }
        View view = this.fragmentView;
        int i5 = Theme.key_dialogBackground;
        arrayList.add(new ThemeDescription(view, 1, null, null, null, qrActivity$$ExternalSyntheticLambda9, i5));
        arrayList.add(new ThemeDescription(this.actionBar, 1, null, null, null, null, i5));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, i5));
        ActionBar actionBar = this.actionBar;
        int i6 = Theme.key_dialogTextBlack;
        arrayList.add(new ThemeDescription(actionBar, 64, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_dialogButtonSelector));
        arrayList.add(new ThemeDescription(this.actionBar, 134217728, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.actionBar, 67108864, null, null, null, null, Theme.key_chat_messagePanelHint));
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        arrayList.add(new ThemeDescription(actionBarMenuItem != null ? actionBarMenuItem.getSearchField() : null, 16777216, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.actionBar, Integer.MIN_VALUE, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_actionBarDefaultSubmenuBackground));
        arrayList.add(new ThemeDescription(this.actionBar, 1073741824, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_actionBarDefaultSubmenuItem));
        arrayList.add(new ThemeDescription(this.actionBar, 1073741832, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_actionBarDefaultSubmenuItemIcon));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        ImageView imageView = this.emptyImageView;
        int i7 = Theme.key_dialogEmptyImage;
        arrayList.add(new ThemeDescription(imageView, 8, null, null, null, null, i7));
        TextView textView = this.emptyTitleTextView;
        int i8 = Theme.key_dialogEmptyText;
        arrayList.add(new ThemeDescription(textView, 4, null, null, null, null, i8));
        arrayList.add(new ThemeDescription(this.emptySubtitleTextView, 4, null, null, null, null, i8));
        arrayList.add(new ThemeDescription(this.shadow, 0, null, null, null, null, Theme.key_sheet_scrollUp));
        ImageView imageView2 = this.locationButton;
        int i9 = Theme.key_location_actionIcon;
        arrayList.add(new ThemeDescription(imageView2, 262152, null, null, null, null, i9));
        ImageView imageView3 = this.locationButton;
        int i10 = Theme.key_location_actionActiveIcon;
        arrayList.add(new ThemeDescription(imageView3, 262152, null, null, null, null, i10));
        ImageView imageView4 = this.locationButton;
        int i11 = Theme.key_location_actionBackground;
        arrayList.add(new ThemeDescription(imageView4, 32, null, null, null, null, i11));
        ImageView imageView5 = this.locationButton;
        int i12 = Theme.key_location_actionPressedBackground;
        arrayList.add(new ThemeDescription(imageView5, 65568, null, null, null, null, i12));
        arrayList.add(new ThemeDescription(this.mapTypeButton, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, i9));
        arrayList.add(new ThemeDescription(this.mapTypeButton, 32, null, null, null, null, i11));
        arrayList.add(new ThemeDescription(this.mapTypeButton, 65568, null, null, null, null, i12));
        arrayList.add(new ThemeDescription(this.proximityButton, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, i9));
        arrayList.add(new ThemeDescription(this.proximityButton, 32, null, null, null, null, i11));
        arrayList.add(new ThemeDescription(this.proximityButton, 65568, null, null, null, null, i12));
        arrayList.add(new ThemeDescription(this.searchAreaButton, 4, null, null, null, null, i10));
        arrayList.add(new ThemeDescription(this.searchAreaButton, 32, null, null, null, null, i11));
        arrayList.add(new ThemeDescription(this.searchAreaButton, 65568, null, null, null, null, i12));
        arrayList.add(new ThemeDescription(null, 0, null, null, Theme.avatarDrawables, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, qrActivity$$ExternalSyntheticLambda9, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_location_liveLocationProgress));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_location_placeLocationBackground));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialog_liveLocationProgress));
        arrayList.add(new ThemeDescription(this.listView, 393216, new Class[]{SendLocationCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_location_sendLocationIcon));
        arrayList.add(new ThemeDescription(this.listView, 393216, new Class[]{SendLocationCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_location_sendLiveLocationIcon));
        arrayList.add(new ThemeDescription(this.listView, 393248, new Class[]{SendLocationCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_location_sendLocationBackground));
        arrayList.add(new ThemeDescription(this.listView, 393248, new Class[]{SendLocationCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_location_sendLiveLocationBackground));
        int i13 = Theme.key_windowBackgroundWhiteGrayText3;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SendLocationCell.class}, new String[]{"accurateTextView"}, null, null, -1, null, i13));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{SendLocationCell.class}, new String[]{"titleTextView"}, null, null, -1, null, Theme.key_location_sendLiveLocationText));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{SendLocationCell.class}, new String[]{"titleTextView"}, null, null, -1, null, Theme.key_location_sendLocationText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationDirectionCell.class}, new String[]{"buttonTextView"}, null, null, -1, null, Theme.key_featuredStickers_buttonText));
        arrayList.add(new ThemeDescription(this.listView, 131072, new Class[]{LocationDirectionCell.class}, new String[]{"frameLayout"}, null, null, -1, null, Theme.key_featuredStickers_addButton));
        arrayList.add(new ThemeDescription(this.listView, 196608, new Class[]{LocationDirectionCell.class}, new String[]{"frameLayout"}, null, null, -1, null, Theme.key_featuredStickers_addButtonPressed));
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{ShadowSectionCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
        arrayList.add(new ThemeDescription(this.listView, 48, new Class[]{ShadowSectionCell.class}, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_dialogTextBlue2));
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{LocationCell.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        int i14 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i14));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationCell.class}, new String[]{"addressTextView"}, null, null, -1, null, i13));
        arrayList.add(new ThemeDescription(this.searchListView, 32, new Class[]{LocationCell.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        arrayList.add(new ThemeDescription(this.searchListView, 0, new Class[]{LocationCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i14));
        arrayList.add(new ThemeDescription(this.searchListView, 0, new Class[]{LocationCell.class}, new String[]{"addressTextView"}, null, null, -1, null, i13));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SharingLiveLocationCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i14));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SharingLiveLocationCell.class}, new String[]{"distanceTextView"}, null, null, -1, null, i13));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationLoadingCell.class}, new String[]{"progressBar"}, null, null, -1, null, Theme.key_progressCircle));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationLoadingCell.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationLoadingCell.class}, new String[]{"imageView"}, null, null, -1, null, i13));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationPoweredCell.class}, new String[]{"textView"}, null, null, -1, null, i13));
        arrayList.add(new ThemeDescription(this.listView, 8, new Class[]{LocationPoweredCell.class}, new String[]{"imageView"}, null, null, -1, null, i7));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationPoweredCell.class}, new String[]{"textView2"}, null, null, -1, null, i8));
        return arrayList;
    }

    public final UndoView getUndoView$1() {
        UndoView[] undoViewArr = this.undoView;
        if (undoViewArr[0].getVisibility() == 0) {
            UndoView undoView = undoViewArr[0];
            undoViewArr[0] = undoViewArr[1];
            undoViewArr[1] = undoView;
            undoView.hide(2, true);
            this.mapViewClip.removeView(undoViewArr[0]);
            this.mapViewClip.addView(undoViewArr[0]);
        }
        return undoViewArr[0];
    }

    @Override
    public final boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(getThemedColor(Theme.key_windowBackgroundWhite)) > 0.699999988079071d;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    public final void lambda$getRecentLocations$44() {
        LocationActivity$$ExternalSyntheticLambda6 locationActivity$$ExternalSyntheticLambda6;
        getLocationController().markLiveLoactionsAsRead(this.dialogId);
        if (this.isPaused || (locationActivity$$ExternalSyntheticLambda6 = this.markAsReadRunnable) == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(locationActivity$$ExternalSyntheticLambda6, 5000L);
    }

    public final void lambda$openShareLiveLocation$35(TLRPC.User user, int i, boolean z) {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        if (!z) {
            shareLiveLocation(i, user, 0);
            return;
        }
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
            int i2 = sharingLocationInfo.lastSentProximityMeters;
            int i3 = sharingLocationInfo.proximityMeters;
            if (i2 != i3) {
                inputMedia.proximity_notification_radius = i3;
                inputMedia.flags |= 8;
            }
            inputMedia.heading = LocationController.getHeading(lastKnownLocation);
            TLRPC.InputMedia inputMedia2 = tL_messages_editMessage.media;
            int i4 = inputMedia2.flags;
            inputMedia2.flags = i4 | 4;
            int i5 = i == Integer.MAX_VALUE ? Integer.MAX_VALUE : sharingLocationInfo.period + i;
            sharingLocationInfo.period = i5;
            inputMedia2.period = i5;
            sharingLocationInfo.stopTime = i != Integer.MAX_VALUE ? sharingLocationInfo.stopTime + i : Integer.MAX_VALUE;
            inputMedia2.flags = i4 | 6;
            MessageObject messageObject = sharingLocationInfo.messageObject;
            if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
                messageMedia.period = i5;
                getMessagesStorage().replaceMessageIfExists(sharingLocationInfo.messageObject.messageOwner, null, null, true);
            }
            getConnectionsManager().sendRequest(tL_messages_editMessage, null);
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsChanged, new Object[0]);
        }
    }

    public final void maybeShowProximityHint() {
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

    @Override
    public final boolean onBackPressed(boolean z) {
        ProximitySheet proximitySheet = this.proximitySheet;
        if (proximitySheet == null) {
            IMapsProvider.IMapView iMapView = this.mapView;
            if (iMapView == null || iMapView.getGlSurfaceView() == null || this.hasScreenshot) {
                return super.onBackPressed(z);
            }
            if (z) {
                onCheckGlScreenshot();
            }
        } else if (z) {
            proximitySheet.dismiss();
            return false;
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        UndoView undoView = this.undoView[0];
        if (undoView != null) {
            undoView.hide(0, true);
        }
    }

    public final boolean onCheckGlScreenshot() {
        IMapsProvider.IMapView iMapView = this.mapView;
        if (iMapView == null || iMapView.getGlSurfaceView() == null || this.hasScreenshot) {
            return false;
        }
        GLSurfaceView glSurfaceView = this.mapView.getGlSurfaceView();
        glSurfaceView.queueEvent(new LinkManager$$ExternalSyntheticLambda2(3, this, glSurfaceView));
        return true;
    }

    @Override
    public final boolean onFragmentCreate() {
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
    public final void onFragmentDestroy() {
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
            undoView.hide(0, true);
        }
        AnonymousClass4 anonymousClass4 = this.adapter;
        if (anonymousClass4 != null) {
            anonymousClass4.destroy();
        }
        AnonymousClass9 anonymousClass9 = this.searchAdapter;
        if (anonymousClass9 != null) {
            anonymousClass9.destroy();
        }
        LocationActivity$$ExternalSyntheticLambda6 locationActivity$$ExternalSyntheticLambda6 = this.markAsReadRunnable;
        if (locationActivity$$ExternalSyntheticLambda6 != null) {
            AndroidUtilities.cancelRunOnUIThread(locationActivity$$ExternalSyntheticLambda6);
            this.markAsReadRunnable = null;
        }
        ArrayList arrayList = this.markers;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            LiveLocation liveLocation = (LiveLocation) arrayList.get(i);
            ImageReceiver imageReceiver = liveLocation.avatarReceiver;
            if (imageReceiver != null) {
                imageReceiver.onDetachedFromWindow();
                liveLocation.avatarReceiver = null;
            }
        }
    }

    @Override
    public final void onLowMemory() {
        super.onLowMemory();
        IMapsProvider.IMapView iMapView = this.mapView;
        if (iMapView == null || !this.mapsInitialized) {
            return;
        }
        iMapView.onLowMemory();
    }

    @Override
    public final void onPause() {
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
            undoView.hide(0, true);
        }
        this.onResumeCalled = false;
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i, String[] strArr, int[] iArr) {
        if (i == 30) {
            openShareLiveLocation(false);
        }
    }

    @Override
    public final void onResume() {
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
        fixLayoutInternal$1(true);
        if (disablePermissionCheck()) {
            this.checkPermission = false;
        } else if (this.checkPermission && Build.VERSION.SDK_INT >= 23 && (parentActivity = getParentActivity()) != null) {
            this.checkPermission = false;
            if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
                parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, 2);
            }
        }
        LocationActivity$$ExternalSyntheticLambda6 locationActivity$$ExternalSyntheticLambda6 = this.markAsReadRunnable;
        if (locationActivity$$ExternalSyntheticLambda6 != null) {
            AndroidUtilities.cancelRunOnUIThread(locationActivity$$ExternalSyntheticLambda6);
            AndroidUtilities.runOnUIThread(this.markAsReadRunnable, 5000L);
        }
    }

    @Override
    public final void onTransitionAnimationEnd(boolean z, boolean z2) {
        if (!z || z2) {
            return;
        }
        try {
            if (this.mapView.getView().getParent() instanceof ViewGroup) {
                ((ViewGroup) this.mapView.getView().getParent()).removeView(this.mapView.getView());
            }
        } catch (Exception unused) {
        }
        LoginActivity.AnonymousClass4 anonymousClass4 = this.mapViewClip;
        if (anonymousClass4 == null) {
            View view = this.fragmentView;
            if (view != null) {
                ((FrameLayout) view).addView(this.mapView.getView(), 0, LayoutHelper.createFrame(-1, -1, 51));
                return;
            }
            return;
        }
        anonymousClass4.addView(this.mapView.getView(), 0, LayoutHelper.createFrame(-1, AndroidUtilities.dp(10.0f) + this.overScrollHeight, 51));
        MapOverlayView mapOverlayView = this.overlayView;
        if (mapOverlayView != null) {
            try {
                if (mapOverlayView.getParent() instanceof ViewGroup) {
                    ((ViewGroup) this.overlayView.getParent()).removeView(this.overlayView);
                }
            } catch (Exception unused2) {
            }
            this.mapViewClip.addView(this.overlayView, 1, LayoutHelper.createFrame(-1, AndroidUtilities.dp(10.0f) + this.overScrollHeight, 51));
        }
        updateClipView(false);
        maybeShowProximityHint();
    }

    public final void openDirections(LiveLocation liveLocation) {
        double d;
        double d2;
        TLRPC.Message message;
        if (liveLocation == null || (message = liveLocation.object) == null) {
            MessageObject messageObject = this.messageObject;
            if (messageObject != null) {
                TLRPC.GeoPoint geoPoint = messageObject.messageOwner.media.geo;
                d = geoPoint.lat;
                d2 = geoPoint._long;
            } else {
                TLRPC.GeoPoint geoPoint2 = this.chatLocation.geo_point;
                d = geoPoint2.lat;
                d2 = geoPoint2._long;
            }
        } else {
            TLRPC.GeoPoint geoPoint3 = message.media.geo;
            d = geoPoint3.lat;
            d2 = geoPoint3._long;
        }
        String str = BuildVars.isHuaweiStoreApp() ? "mapapp://navigation" : "http://maps.google.com/maps";
        if (this.myLocation != null) {
            try {
                getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str.concat("?saddr=%f,%f&daddr=%f,%f"), Double.valueOf(this.myLocation.getLatitude()), Double.valueOf(this.myLocation.getLongitude()), Double.valueOf(d), Double.valueOf(d2)))));
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        try {
            getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(String.format(Locale.US, str.concat("?saddr=&daddr=%f,%f"), Double.valueOf(d), Double.valueOf(d2)))));
        } catch (Exception e2) {
            FileLog.e(e2);
        }
    }

    public final void openShareLiveLocation(final boolean z) {
        Activity parentActivity;
        if (this.delegate == null || disablePermissionCheck() || getParentActivity() == null || this.myLocation == null || !checkGpsEnabled()) {
            return;
        }
        if (this.checkBackgroundPermission && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
            this.checkBackgroundPermission = false;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (Math.abs((System.currentTimeMillis() / 1000) - ((long) globalMainSettings.getInt("backgroundloc", 0))) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                AlertsCreator.createBackgroundLocationPermissionDialog(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new LocationActivity$$ExternalSyntheticLambda0(this, z, 1), null).show();
                return;
            }
        }
        final TLRPC.User user = DialogObject.isUserDialog(this.dialogId) ? getMessagesController().getUser(Long.valueOf(this.dialogId)) : null;
        showDialog(AlertsCreator.createLocationUpdateDialog(getParentActivity(), z, user, new MessagesStorage.IntCallback() {
            @Override
            public final void run(int i) {
                this.f$0.lambda$openShareLiveLocation$35(user, i, z);
            }
        }, null));
    }

    public final void positionMarker$1(Location location) {
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
            AnonymousClass4 anonymousClass4 = this.adapter;
            if (anonymousClass4 != null) {
                if (!this.searchedForCustomLocations && (i = this.locationType) != 4 && i != 8) {
                    anonymousClass4.searchPlacesWithQuery(null, this.myLocation, true);
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
            proximitySheet.updateText(true);
        }
        IMapsProvider.ICircle iCircle = this.proximityCircle;
        if (iCircle != null) {
            iCircle.setCenter(new IMapsProvider.LatLng(this.myLocation.getLatitude(), this.myLocation.getLongitude()));
        }
        updateShowAllButton();
    }

    public final void setupAvatarReceiver(LiveLocation liveLocation) {
        if (liveLocation.avatarReceiver != null) {
            return;
        }
        TLRPC.User user = liveLocation.user;
        TLRPC.Chat chat = liveLocation.chat;
        if (user == null && chat == null) {
            return;
        }
        AvatarDrawable avatarDrawable = new AvatarDrawable((Theme.ResourcesProvider) null);
        if (user != null) {
            avatarDrawable.setInfo(this.currentAccount, user);
        } else {
            avatarDrawable.setInfo(this.currentAccount, chat);
        }
        ImageReceiver imageReceiver = new ImageReceiver();
        imageReceiver.setCurrentAccount(this.currentAccount);
        imageReceiver.setDelegate(new DialogsActivity$$ExternalSyntheticLambda89(20, this, liveLocation));
        imageReceiver.onAttachedToWindow();
        TLObject tLObject = user;
        if (user == null) {
            tLObject = chat;
        }
        imageReceiver.setForUserOrChat(tLObject, avatarDrawable);
        liveLocation.avatarReceiver = imageReceiver;
    }

    public final void shareLiveLocation(int i, TLRPC.User user, int i2) {
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
        if (i2 <= 0) {
            finishFragment();
            return;
        }
        this.proximitySheet.radiusSet = true;
        this.proximityButton.setImageResource(R.drawable.msg_location_alert2);
        ProximitySheet proximitySheet = this.proximitySheet;
        if (proximitySheet != null) {
            proximitySheet.dismiss();
        }
        getUndoView$1().showWithAction(0L, 24, Integer.valueOf(i2), user, (Runnable) null, (Runnable) null);
    }

    public final void showSearchPlacesButton$1(boolean z) {
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

    public final void showShowAllButton(boolean z, boolean z2) {
        Boolean bool = this.shownShowAllButton;
        if (bool == null || bool.booleanValue() != z) {
            this.shownShowAllButton = Boolean.valueOf(z);
            if (z2) {
                this.showAllButton.setVisibility(0);
                this.showAllButton.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.7f).scaleY(z ? 1.0f : 0.7f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(420L).withEndAction(new LocationActivity$$ExternalSyntheticLambda0(this, z, 0)).start();
            } else {
                this.showAllButton.setVisibility(z ? 0 : 8);
                this.showAllButton.setAlpha(z ? 1.0f : 0.0f);
                this.showAllButton.setScaleX(z ? 1.0f : 0.7f);
                this.showAllButton.setScaleY(z ? 1.0f : 0.7f);
            }
        }
    }

    public final void updateClipView(boolean z) {
        int y;
        int iMin;
        FrameLayout.LayoutParams layoutParams;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = this.listView.findViewHolderForAdapterPosition(0);
        if (viewHolderFindViewHolderForAdapterPosition != null) {
            y = (int) viewHolderFindViewHolderForAdapterPosition.itemView.getY();
            iMin = Math.min(y, 0) + this.overScrollHeight;
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
                searchButton.currentTranslationY = fMin;
                searchButton.setTranslationY(fMin + searchButton.additionanTranslationY);
            }
            View view = this.markerImageView;
            if (view != null) {
                int iDp = (iMin / 2) + (i - AndroidUtilities.dp(view.getTag() == null ? 48.0f : 69.0f));
                this.markerTop = iDp;
                view.setTranslationY(iDp);
            }
            if (z) {
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.mapView.getView().getLayoutParams();
            if (layoutParams2 != null) {
                if (layoutParams2.height != AndroidUtilities.dp(10.0f) + this.overScrollHeight) {
                    layoutParams2.height = AndroidUtilities.dp(10.0f) + this.overScrollHeight;
                    IMapsProvider.IMap iMap = this.map;
                    if (iMap != null) {
                        iMap.setPadding(AndroidUtilities.dp(70.0f), 0, AndroidUtilities.dp(70.0f), AndroidUtilities.dp(10.0f));
                    }
                    this.mapView.getView().setLayoutParams(layoutParams2);
                }
            }
            MapOverlayView mapOverlayView4 = this.overlayView;
            if (mapOverlayView4 == null || (layoutParams = (FrameLayout.LayoutParams) mapOverlayView4.getLayoutParams()) == null) {
                return;
            }
            if (layoutParams.height != AndroidUtilities.dp(10.0f) + this.overScrollHeight) {
                layoutParams.height = AndroidUtilities.dp(10.0f) + this.overScrollHeight;
                this.overlayView.setLayoutParams(layoutParams);
            }
        }
    }

    public final void updateEmptyView$5() {
        if (!this.searching) {
            this.emptyView.setVisibility(8);
        } else {
            if (!this.searchInProgress) {
                this.searchListView.setEmptyView(this.emptyView);
                return;
            }
            this.searchListView.setEmptyView(null);
            this.emptyView.setVisibility(8);
            this.searchListView.setVisibility(8);
        }
    }

    public final void updateShowAllButton() {
        TLRPC.MessageMedia messageMedia;
        int i;
        if (this.showAllButton == null) {
            return;
        }
        if (this.showAllMode) {
            showShowAllButton(false, true);
            fitAllLiveLocations();
            return;
        }
        int currentTime = getConnectionsManager() != null ? getConnectionsManager().getCurrentTime() : 0;
        ArrayList arrayList = this.markers;
        int size = arrayList.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            TLRPC.Message message = ((LiveLocation) arrayList.get(i3)).object;
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

    public final class AnonymousClass10 extends RecyclerView.OnScrollListener {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass10(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            RecyclerListView.Holder holder;
            View viewFindViewByPosition;
            PremiumStickersPreviewRecycler.StickerView stickerView = null;
            Object obj = this.this$0;
            switch (this.$r8$classId) {
                case 0:
                    if (i == 1) {
                        LocationActivity locationActivity = (LocationActivity) obj;
                        if (locationActivity.searching && locationActivity.searchWas) {
                            AndroidUtilities.hideKeyboard(locationActivity.getParentActivity().getCurrentFocus());
                            break;
                        }
                    }
                    break;
                case 1:
                    PremiumFeatureBottomSheet.AnonymousClass11 anonymousClass11 = (PremiumFeatureBottomSheet.AnonymousClass11) obj;
                    if (i == 1) {
                        anonymousClass11.haptic = true;
                    }
                    BubbleActivity.AnonymousClass1 anonymousClass1 = anonymousClass11.autoScrollRunnable;
                    if (i != 0) {
                        AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
                        break;
                    } else {
                        for (int i2 = 0; i2 < recyclerView.getChildCount(); i2++) {
                            PremiumStickersPreviewRecycler.StickerView stickerView2 = (PremiumStickersPreviewRecycler.StickerView) anonymousClass11.getChildAt(i2);
                            if (stickerView == null || stickerView2.progress > stickerView.progress) {
                                stickerView = stickerView2;
                            }
                        }
                        if (stickerView != null) {
                            anonymousClass11.drawEffectForView(stickerView, true);
                            anonymousClass11.haptic = false;
                            anonymousClass11.smoothScrollBy(0, stickerView.getTop() - ((anonymousClass11.getMeasuredHeight() - stickerView.getMeasuredHeight()) / 2), AndroidUtilities.overshootInterpolator);
                        }
                        if (anonymousClass11.autoPlayEnabled) {
                            AndroidUtilities.cancelRunOnUIThread(anonymousClass1);
                            AndroidUtilities.runOnUIThread(anonymousClass1, 2700L);
                            break;
                        }
                    }
                    break;
                case 2:
                    if (i == 1) {
                        AndroidUtilities.hideKeyboard(((SelectorBottomSheet) obj).searchField.getEditText());
                    }
                    break;
                case 5:
                    RecyclerListView recyclerListView = (RecyclerListView) obj;
                    if (i == 0) {
                        if (recyclerListView.stoppedAllHeavyOperations) {
                            recyclerListView.stoppedAllHeavyOperations = false;
                            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                        }
                    } else if (!recyclerListView.stoppedAllHeavyOperations && recyclerListView.allowStopHeaveOperations) {
                        recyclerListView.stoppedAllHeavyOperations = true;
                        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
                    }
                    if (i != 0 && recyclerListView.currentChildView != null) {
                        GLIconTextureView$1$$ExternalSyntheticLambda0 gLIconTextureView$1$$ExternalSyntheticLambda0 = recyclerListView.selectChildRunnable;
                        if (gLIconTextureView$1$$ExternalSyntheticLambda0 != null) {
                            AndroidUtilities.cancelRunOnUIThread(gLIconTextureView$1$$ExternalSyntheticLambda0);
                            recyclerListView.selectChildRunnable = null;
                        }
                        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                        try {
                            ((GestureDetectorFixDoubleTap$GestureDetectorCompatImplBase) recyclerListView.gestureDetector.this$0).onTouchEvent(motionEventObtain);
                        } catch (Exception e) {
                            FileLog.e(e);
                        }
                        recyclerListView.currentChildView.onTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                        View view = recyclerListView.currentChildView;
                        recyclerListView.onChildPressed(view, 0.0f, 0.0f, false);
                        recyclerListView.currentChildView = null;
                        recyclerListView.removeSelection(null, view);
                        recyclerListView.interceptedByChild = false;
                    }
                    RecyclerView.OnScrollListener onScrollListener = recyclerListView.onScrollListener;
                    if (onScrollListener != null) {
                        onScrollListener.onScrollStateChanged(recyclerView, i);
                    }
                    boolean z = i == 1 || i == 2;
                    recyclerListView.scrollingByUser = z;
                    if (z) {
                        recyclerListView.scrolledByUserOnce = true;
                    }
                    break;
                case 6:
                    SearchDownloadsContainer searchDownloadsContainer = (SearchDownloadsContainer) obj;
                    if (i == 1) {
                        AndroidUtilities.hideKeyboard(searchDownloadsContainer.parentActivity.getCurrentFocus());
                    }
                    searchDownloadsContainer.checkItemsFloodWait();
                    break;
                case 11:
                    if (i == 0) {
                        UsersAlertBase usersAlertBase = (UsersAlertBase) obj;
                        if (usersAlertBase.needSnapToTop && AndroidUtilities.dp(13.0f) + ((BottomSheet) usersAlertBase).backgroundPaddingTop + usersAlertBase.scrollOffsetY < AndroidUtilities.statusBarHeight * 2) {
                            UsersAlertBase.AnonymousClass1 anonymousClass2 = usersAlertBase.listView;
                            if (anonymousClass2.canScrollVertically(1) && (holder = (RecyclerListView.Holder) anonymousClass2.findViewHolderForAdapterPosition(0)) != null) {
                                View view2 = holder.itemView;
                                if (view2.getTop() > 0) {
                                    anonymousClass2.smoothScrollBy(0, view2.getTop(), null);
                                }
                                break;
                            }
                        }
                    }
                    break;
                case 14:
                    if (i == 1) {
                        AndroidUtilities.hideKeyboard(((CountrySelectActivity) obj).getParentActivity().getCurrentFocus());
                    }
                    break;
                case 20:
                    if (i == 0) {
                        GradientHeaderActivity gradientHeaderActivity = (GradientHeaderActivity) obj;
                        int iDp = AndroidUtilities.dp(16.0f) + ((BaseFragment) gradientHeaderActivity).actionBar.getBottom();
                        if (gradientHeaderActivity.totalProgress > 0.5f) {
                            gradientHeaderActivity.listView.smoothScrollBy(0, gradientHeaderActivity.currentYOffset - iDp, null);
                            break;
                        } else {
                            View viewFindViewByPosition2 = gradientHeaderActivity.listView.getLayoutManager() != null ? gradientHeaderActivity.listView.getLayoutManager().findViewByPosition(0) : null;
                            if (viewFindViewByPosition2 != null && viewFindViewByPosition2.getTop() < 0) {
                                gradientHeaderActivity.listView.smoothScrollBy(0, viewFindViewByPosition2.getTop(), null);
                                break;
                            }
                        }
                    }
                    break;
                case 21:
                    if (i == 0) {
                        GroupColorActivity groupColorActivity = (GroupColorActivity) obj;
                        float f = groupColorActivity.profilePreviewPercent;
                        if (f >= 0.5f && f < 1.0f) {
                            int bottom = ((BaseFragment) groupColorActivity).actionBar.getBottom();
                            RecyclerView.LayoutManager layoutManager = groupColorActivity.listView.getLayoutManager();
                            if (layoutManager != null && (viewFindViewByPosition = layoutManager.findViewByPosition(0)) != null) {
                                groupColorActivity.listView.smoothScrollBy(0, viewFindViewByPosition.getBottom() - bottom, null);
                                break;
                            }
                        } else if (f < 0.5f) {
                            View viewFindViewByPosition3 = groupColorActivity.listView.getLayoutManager() != null ? groupColorActivity.listView.getLayoutManager().findViewByPosition(0) : null;
                            if (viewFindViewByPosition3 != null && viewFindViewByPosition3.getTop() < 0) {
                                groupColorActivity.listView.smoothScrollBy(0, viewFindViewByPosition3.getTop(), null);
                                break;
                            }
                        }
                    }
                    break;
                case 22:
                    if (i == 1) {
                        GroupCreateActivity groupCreateActivity = (GroupCreateActivity) obj;
                        groupCreateActivity.searchField.editText.hideActionMode();
                        AndroidUtilities.hideKeyboard(groupCreateActivity.searchField.editText);
                    }
                    break;
                case 23:
                    if (i == 1) {
                        AndroidUtilities.hideKeyboard(((GroupCreateFinalActivity) obj).editText);
                    }
                    break;
                case 24:
                    if (i == 1) {
                        AndroidUtilities.hideKeyboard(((GroupStickersActivity) obj).getParentActivity().getCurrentFocus());
                    }
                    break;
                case 25:
                    if (i == 1) {
                        InviteContactsActivity inviteContactsActivity = (InviteContactsActivity) obj;
                        inviteContactsActivity.searchField.editText.hideActionMode();
                        AndroidUtilities.hideKeyboard(inviteContactsActivity.searchField.editText);
                    }
                    break;
                case 26:
                    if (i == 1) {
                        AndroidUtilities.hideKeyboard(((LanguageSelectActivity) obj).getParentActivity().getCurrentFocus());
                    }
                    break;
                case 29:
                    if (i == 1) {
                        AndroidUtilities.hideKeyboard(((MultiContactsSelectorBottomSheet) obj).searchField.getEditText());
                    }
                    break;
            }
        }

        @Override
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            RecyclerListView.FastScroll fastScroll;
            FilterCreateActivity.ListAdapter.AnonymousClass1 anonymousClass1;
            EditEmojiTextCell.AnonymousClass2 anonymousClass2;
            ResaleGiftsFragment resaleGiftsFragment;
            DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
            DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor2;
            switch (this.$r8$classId) {
                case 1:
                    int scrollState = recyclerView.getScrollState();
                    PremiumFeatureBottomSheet.AnonymousClass11 anonymousClass11 = (PremiumFeatureBottomSheet.AnonymousClass11) this.this$0;
                    if (scrollState == 1) {
                        anonymousClass11.drawEffectForView(null, true);
                    }
                    anonymousClass11.invalidate();
                    break;
                case 3:
                    ((ChatSelectionReactionMenuOverlay) this.this$0).invalidatePosition(true);
                    break;
                case 4:
                    int childCount = recyclerView.getChildCount();
                    ReactionsContainerLayout reactionsContainerLayout = (ReactionsContainerLayout) this.this$0;
                    if (childCount > 2) {
                        int[] iArr = reactionsContainerLayout.location;
                        recyclerView.getLocationInWindow(iArr);
                        int i3 = iArr[0];
                        View childAt = recyclerView.getChildAt(0);
                        childAt.getLocationInWindow(iArr);
                        float fMin = ((1.0f - Math.min(1.0f, (-Math.min(iArr[0] - i3, 0.0f)) / childAt.getWidth())) * 0.39999998f) + 0.6f;
                        if (Float.isNaN(fMin)) {
                            fMin = 1.0f;
                        }
                        if (childAt instanceof ReactionsContainerLayout.ReactionHolderView) {
                            ((ReactionsContainerLayout.ReactionHolderView) childAt).sideScale = fMin;
                        } else {
                            childAt.setScaleX(fMin);
                            childAt.setScaleY(fMin);
                        }
                        View childAt2 = recyclerView.getChildAt(recyclerView.getChildCount() - 1);
                        childAt2.getLocationInWindow(iArr);
                        float fMin2 = ((1.0f - Math.min(1.0f, (-Math.min((recyclerView.getWidth() + i3) - (childAt2.getWidth() + iArr[0]), 0.0f)) / childAt2.getWidth())) * 0.39999998f) + 0.6f;
                        if (Float.isNaN(fMin2)) {
                            fMin2 = 1.0f;
                        }
                        if (childAt2 instanceof ReactionsContainerLayout.ReactionHolderView) {
                            ((ReactionsContainerLayout.ReactionHolderView) childAt2).sideScale = fMin2;
                        } else {
                            childAt2.setScaleX(fMin2);
                            childAt2.setScaleY(fMin2);
                        }
                    }
                    int i4 = 1;
                    while (true) {
                        ChatActivity.AnonymousClass34 anonymousClass34 = reactionsContainerLayout.recyclerListView;
                        if (i4 >= anonymousClass34.getChildCount() - 1) {
                            reactionsContainerLayout.invalidate();
                        } else {
                            View childAt3 = anonymousClass34.getChildAt(i4);
                            if (childAt3 instanceof ReactionsContainerLayout.ReactionHolderView) {
                                ((ReactionsContainerLayout.ReactionHolderView) childAt3).sideScale = 1.0f;
                            } else {
                                childAt3.setScaleX(1.0f);
                                childAt3.setScaleY(1.0f);
                            }
                            i4++;
                        }
                        break;
                    }
                    break;
                case 5:
                    RecyclerListView recyclerListView = (RecyclerListView) this.this$0;
                    RecyclerView.OnScrollListener onScrollListener = recyclerListView.onScrollListener;
                    if (onScrollListener != null) {
                        onScrollListener.onScrolled(recyclerView, i, i2);
                    }
                    int i5 = recyclerListView.selectorPosition;
                    Rect rect = recyclerListView.selectorRect;
                    if (i5 != -1) {
                        rect.offset(-i, -i2);
                        BaseCell.RippleDrawableSafe rippleDrawableSafe = recyclerListView.selectorDrawable;
                        if (rippleDrawableSafe != null) {
                            rippleDrawableSafe.setBounds(recyclerListView.selectorRect);
                        }
                        recyclerListView.invalidate();
                    } else {
                        rect.setEmpty();
                    }
                    recyclerListView.checkSection(false);
                    if (i2 != 0 && (fastScroll = recyclerListView.fastScroll) != null) {
                        fastScroll.showFloatingDate();
                    }
                    RecyclerListView.IntReturnCallback intReturnCallback = recyclerListView.pendingHighlightPosition;
                    if (intReturnCallback != null) {
                        recyclerListView.highlightRowInternal(intReturnCallback, 700, false);
                    }
                    break;
                case 7:
                    SharingLocationsAlert.access$300((SharingLocationsAlert) this.this$0);
                    break;
                case 8:
                    ((StarAppsSheet) this.this$0).adapter.checkBottom();
                    break;
                case 9:
                    StickersAlert.access$2700((StickersAlert) this.this$0);
                    break;
                case 10:
                    ThemeEditorView.EditorAlert.access$2200((ThemeEditorView.EditorAlert) this.this$0);
                    break;
                case 11:
                    ((UsersAlertBase) this.this$0).updateLayout$5();
                    break;
                case 12:
                    ((ViewPagerFixed.AnonymousClass3) this.this$0).invalidate();
                    break;
                case 13:
                    ((CountrySelectBottomSheet) this.this$0).checkUi_searchFieldY$3();
                    break;
                case 15:
                    LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                    MemberRequestsDelegate memberRequestsDelegate = (MemberRequestsDelegate) this.this$0;
                    if (memberRequestsDelegate.hasMore && !memberRequestsDelegate.isLoading && linearLayoutManager != null) {
                        if (memberRequestsDelegate.adapter.getItemCount() - linearLayoutManager.findLastVisibleItemPosition() < 10) {
                            MemberRequestsDelegate$$ExternalSyntheticLambda2 memberRequestsDelegate$$ExternalSyntheticLambda2 = memberRequestsDelegate.loadMembersRunnable;
                            AndroidUtilities.cancelRunOnUIThread(memberRequestsDelegate$$ExternalSyntheticLambda2);
                            AndroidUtilities.runOnUIThread(memberRequestsDelegate$$ExternalSyntheticLambda2);
                        }
                        break;
                    }
                    break;
                case 16:
                    DialogCacheBottomSheet dialogCacheBottomSheet = (DialogCacheBottomSheet) this.this$0;
                    BottomSheetWithRecyclerListView.AnonymousClass1 anonymousClass3 = dialogCacheBottomSheet.nestedSizeNotifierLayout;
                    if (anonymousClass3 != null) {
                        NestedSizeNotifierLayout.ChildLayout childLayout = anonymousClass3.childLayout;
                        dialogCacheBottomSheet.showShadow = !(childLayout != null && childLayout.getTop() == anonymousClass3.maxTop);
                        dialogCacheBottomSheet.nestedSizeNotifierLayout.invalidate();
                    }
                    break;
                case 17:
                    FilterCreateActivity filterCreateActivity = (FilterCreateActivity) this.this$0;
                    if (filterCreateActivity.listView.scrollingByUser && (anonymousClass1 = filterCreateActivity.nameEditTextCell) != null && (anonymousClass2 = anonymousClass1.editTextEmoji) != null) {
                        if (!anonymousClass2.emojiViewVisible) {
                            AndroidUtilities.hideKeyboard(anonymousClass2.editText);
                        } else {
                            anonymousClass2.hidePopup(true);
                        }
                        break;
                    }
                    break;
                case 18:
                    int i6 = 0;
                    while (true) {
                        resaleGiftsFragment = (ResaleGiftsFragment) this.this$0;
                        if (i6 < resaleGiftsFragment.listView.getChildCount()) {
                            if (resaleGiftsFragment.listView.getChildAt(i6) instanceof FlickerLoadingView) {
                                resaleGiftsFragment.list.load(false);
                            } else {
                                i6++;
                            }
                        }
                    }
                    OKLCH.m(resaleGiftsFragment.filtersDivider.animate().alpha((resaleGiftsFragment.filtersShown && resaleGiftsFragment.listView.canScrollVertically(-1)) ? 1.0f : 0.0f), CubicBezierInterpolator.EASE_OUT_QUINT, 320L);
                    break;
                case 19:
                    ((ResaleGiftsFragment.SelectGiftSheet) this.this$0).onScroll$1();
                    break;
                case 20:
                    ((GradientHeaderActivity) this.this$0).contentView.invalidate();
                    break;
                case 21:
                    GroupColorActivity groupColorActivity = (GroupColorActivity) this.this$0;
                    if (groupColorActivity.profilePreview == null) {
                        groupColorActivity.profilePreview = (ChannelColorActivity.ProfilePreview) groupColorActivity.findChildAt(groupColorActivity.profilePreviewRow);
                    }
                    int measuredHeight = groupColorActivity.profilePreview.getMeasuredHeight() - ((BaseFragment) groupColorActivity).actionBar.getMeasuredHeight();
                    float top = groupColorActivity.profilePreview.getTop() * (-1);
                    float f = measuredHeight;
                    float fMax = Math.max(Math.min(1.0f, top / f), 0.0f);
                    groupColorActivity.profilePreviewPercent = fMax;
                    float fMin3 = Math.min(fMax * 2.0f, 1.0f);
                    float fMin4 = Math.min(Math.max(groupColorActivity.profilePreviewPercent - 0.45f, 0.0f) * 2.0f, 1.0f);
                    groupColorActivity.profilePreview.profileView.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, fMin3));
                    groupColorActivity.profilePreview.infoLayout.setAlpha(AndroidUtilities.lerp(1.0f, 0.0f, fMin3));
                    groupColorActivity.profilePreview.title.setAlpha(AndroidUtilities.lerp(0.0f, 1.0f, fMin4));
                    if (groupColorActivity.profilePreviewPercent < 1.0f) {
                        groupColorActivity.profilePreview.setTranslationY(0.0f);
                    } else {
                        groupColorActivity.profilePreview.setTranslationY(top - f);
                    }
                    break;
                case 22:
                    GroupCreateActivity groupCreateActivity = (GroupCreateActivity) this.this$0;
                    int iFindFirstVisibleItemPosition = groupCreateActivity.layoutManager.findFirstVisibleItemPosition();
                    View childAt4 = groupCreateActivity.listView.getChildAt(0);
                    ((BoolAnimator) groupCreateActivity.headerShadowView.this$0).setValue(iFindFirstVisibleItemPosition != 0 || (childAt4 != null ? childAt4.getTop() : 0) < groupCreateActivity.listView.getPaddingTop(), true);
                    if (Build.VERSION.SDK_INT >= 31 && (downscaleScrollableNoiseSuppressor = groupCreateActivity.scrollableViewNoiseSuppressor) != null) {
                        downscaleScrollableNoiseSuppressor.onScrolled(i, i2);
                        groupCreateActivity.blur3_InvalidateBlur$5();
                        break;
                    }
                    break;
                case 25:
                    InviteContactsActivity inviteContactsActivity = (InviteContactsActivity) this.this$0;
                    inviteContactsActivity.layoutManager.findFirstVisibleItemPosition();
                    View childAt5 = inviteContactsActivity.listView.getChildAt(0);
                    if (childAt5 != null) {
                        childAt5.getTop();
                    }
                    if (Build.VERSION.SDK_INT >= 31 && (downscaleScrollableNoiseSuppressor2 = inviteContactsActivity.scrollableViewNoiseSuppressor) != null) {
                        downscaleScrollableNoiseSuppressor2.onScrolled(i, i2);
                        inviteContactsActivity.blur3_InvalidateBlur$6();
                        break;
                    }
                    break;
                case 27:
                    ((MessageSendPreview) this.this$0).chatListView.invalidate();
                    break;
                case 28:
                    MessageStatisticActivity messageStatisticActivity = (MessageStatisticActivity) this.this$0;
                    int iFindFirstVisibleItemPosition2 = messageStatisticActivity.layoutManager.findFirstVisibleItemPosition();
                    int iAbs = iFindFirstVisibleItemPosition2 == -1 ? 0 : Math.abs(messageStatisticActivity.layoutManager.findLastVisibleItemPosition() - iFindFirstVisibleItemPosition2) + 1;
                    int itemCount = recyclerView.getAdapter().getItemCount();
                    if (iAbs > 0 && !messageStatisticActivity.endReached && !messageStatisticActivity.loading && !messageStatisticActivity.messages.isEmpty() && iFindFirstVisibleItemPosition2 + iAbs >= itemCount - 5 && messageStatisticActivity.statsLoaded) {
                        messageStatisticActivity.loadChats$1();
                        break;
                    }
                    break;
            }
        }

        private final void onScrollStateChanged$org$telegram$ui$MessageStatisticActivity$3(RecyclerView recyclerView, int i) {
        }
    }
}
