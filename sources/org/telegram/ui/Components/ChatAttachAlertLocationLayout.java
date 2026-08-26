package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.location.Location;
import android.location.LocationManager;
import android.media.ExifInterface;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.util.Property;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzlb;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.utils.ViewOutlineProviderImpl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Adapters.BaseLocationAdapter;
import org.telegram.ui.Adapters.LocationActivityAdapter;
import org.telegram.ui.Adapters.LocationActivitySearchAdapter;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.ArticleViewer$$ExternalSyntheticLambda23;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.LocationCell;
import org.telegram.ui.Cells.LocationDirectionCell;
import org.telegram.ui.Cells.LocationLoadingCell;
import org.telegram.ui.Cells.LocationPoweredCell;
import org.telegram.ui.Cells.SendLocationCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.SharingLiveLocationCell;
import org.telegram.ui.Cells.SharingLiveLocationCell$$ExternalSyntheticLambda0;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda248;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda94;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda23;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda156;
import org.telegram.ui.TopicsFragment;
import org.telegram.ui.iv.RichEditor;

public final class ChatAttachAlertLocationLayout extends ChatAttachAlert.AttachAlertLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final int $r8$clinit = 0;
    public final LocationActivityAdapter adapter;
    public AnimatorSet animatorSet;
    public boolean askedForLocation;
    public final Paint backgroundPaint;
    public final Bitmap[] bitmapCache;
    public boolean checkBackgroundPermission;
    public boolean checkGpsEnabled;
    public boolean checkPermission;
    public int clipSize;
    public boolean currentMapStyleDark;
    public LocationActivityDelegate delegate;
    public final long dialogId;
    public boolean doNotDrawMap;
    public final ImageView emptyImageView;
    public final TextView emptySubtitleTextView;
    public final TextView emptyTitleTextView;
    public final LinearLayout emptyView;
    public boolean firstWas;
    public IMapsProvider.ICameraUpdate forceUpdate;
    public boolean ignoreIdleCamera;
    public boolean isFirstLocation;
    public IMapsProvider.IMarker lastPressedMarker;
    public FrameLayout lastPressedMarkerView;
    public VenueLocation lastPressedVenue;
    public final ChatAttachAlertPollLayout.AnonymousClass4 layoutManager;
    public final ChatActivity.AnonymousClass34 listView;
    public final View loadingMapView;
    public final ImageView locationButton;
    public boolean locationDenied;
    public final int locationType;
    public IMapsProvider.IMap map;
    public int mapHeight;
    public final ActionBarMenuItem mapTypeButton;
    public IMapsProvider.IMapView mapView;
    public final ChatActivity.AnonymousClass60 mapViewClip;
    public boolean mapsInitialized;
    public final ImageView markerImageView;
    public int markerTop;
    public Location myLocation;
    public int nonClipSize;
    public boolean onResumeCalled;
    public int overScrollHeight;
    public final MapOverlayView overlayView;
    public final ArrayList placeMarkers;
    public boolean scrolling;
    public final AnonymousClass6 searchAdapter;
    public final SearchButton searchAreaButton;
    public boolean searchInProgress;
    public final ActionBarMenuItem searchItem;
    public final RecyclerListView searchListView;
    public boolean searchWas;
    public boolean searchedForCustomLocations;
    public boolean searching;
    public Location userLocation;
    public boolean userLocationMoved;
    public float yOffset;

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
            IMapsProvider.IMap iMap = ChatAttachAlertLocationLayout.this.map;
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

    public ChatAttachAlertLocationLayout(ChatAttachAlert chatAttachAlert, Context context, final Theme.ResourcesProvider resourcesProvider, boolean z) {
        int i;
        super(context, resourcesProvider, chatAttachAlert);
        this.checkGpsEnabled = true;
        this.askedForLocation = false;
        this.locationDenied = false;
        this.isFirstLocation = true;
        this.backgroundPaint = new Paint();
        this.placeMarkers = new ArrayList();
        this.checkPermission = true;
        this.checkBackgroundPermission = true;
        int currentActionBarHeight = (AndroidUtilities.displaySize.x - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.overScrollHeight = currentActionBarHeight;
        this.mapHeight = currentActionBarHeight;
        this.bitmapCache = new Bitmap[7];
        AndroidUtilities.fixGoogleMapsBug();
        ChatAttachAlert chatAttachAlert2 = this.parentAlert;
        BaseFragment baseFragment = chatAttachAlert2.baseFragment;
        final ChatActivity chatActivity = baseFragment instanceof ChatActivity ? (ChatActivity) baseFragment : null;
        long dialogId = chatAttachAlert2.getDialogId();
        this.dialogId = dialogId;
        if (this.parentAlert.isStoryLocationPicker) {
            this.locationType = 7;
        } else if (!z || chatActivity == null || chatActivity.currentEncryptedChat != null || chatActivity.isInScheduleMode() || UserObject.isUserSelf(chatActivity.getCurrentUser())) {
            this.locationType = 0;
        } else {
            this.locationType = 1;
        }
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.locationPermissionDenied);
        this.searchWas = false;
        this.searching = false;
        this.searchInProgress = false;
        LocationActivityAdapter locationActivityAdapter = this.adapter;
        if (locationActivityAdapter != null) {
            locationActivityAdapter.destroy();
        }
        AnonymousClass6 anonymousClass6 = this.searchAdapter;
        if (anonymousClass6 != null) {
            anonymousClass6.destroy();
        }
        this.locationDenied = (Build.VERSION.SDK_INT < 23 || getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        ActionBarMenu actionBarMenuCreateMenu = this.parentAlert.actionBar.createMenu();
        this.overlayView = new MapOverlayView(context);
        ActionBarMenuItem actionBarMenuItemAddItem = actionBarMenuCreateMenu.addItem(0, R.drawable.outline_header_search);
        actionBarMenuItemAddItem.setIsSearchField$1();
        actionBarMenuItemAddItem.listener = new TopicsFragment.AnonymousClass3(this, 7);
        this.searchItem = actionBarMenuItemAddItem;
        if (!this.locationDenied || this.parentAlert.isStoryLocationPicker) {
            this.parentAlert.getClass();
            i = 0;
        } else {
            i = 8;
        }
        actionBarMenuItemAddItem.setVisibility(i);
        int i2 = R.string.Search;
        actionBarMenuItemAddItem.setSearchFieldHint(LocaleController.getString(i2));
        actionBarMenuItemAddItem.setContentDescription(LocaleController.getString(i2));
        EditTextBoldCursor searchField = actionBarMenuItemAddItem.getSearchField();
        int i3 = Theme.key_dialogTextBlack;
        searchField.setTextColor(Theme.getColor(i3, this.resourcesProvider));
        searchField.setCursorColor(Theme.getColor(i3, this.resourcesProvider));
        searchField.setHintTextColor(Theme.getColor(Theme.key_chat_messagePanelHint, this.resourcesProvider));
        new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f)).gravity = 83;
        ChatActivity.AnonymousClass60 anonymousClass60 = new ChatActivity.AnonymousClass60(this, context, 9);
        this.mapViewClip = anonymousClass60;
        anonymousClass60.setWillNotDraw(false);
        View view = new View(context);
        this.loadingMapView = view;
        Theme.ThemeInfo themeInfo = Theme.currentDayTheme;
        view.setBackgroundDrawable(new CanvasButton.AnonymousClass2((themeInfo == null ? Theme.defaultTheme : themeInfo).isDark()));
        SearchButton searchButton = new SearchButton(context);
        this.searchAreaButton = searchButton;
        searchButton.setTranslationX(-AndroidUtilities.dp(80.0f));
        searchButton.setVisibility(4);
        int iDp = AndroidUtilities.dp(40.0f);
        int i4 = Theme.key_location_actionBackground;
        int color = Theme.getColor(i4, this.resourcesProvider);
        int i5 = Theme.key_location_actionPressedBackground;
        int color2 = Theme.getColor(i5, this.resourcesProvider);
        BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSimpleSelectorRoundRectDrawable = Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, color, color2, color2);
        ScaleStateListAnimator.apply(searchButton, 0.1f, 1.5f);
        searchButton.setTranslationZ(AndroidUtilities.dp(2.0f));
        RichEditor.AnonymousClass5 anonymousClass5 = ViewOutlineProviderImpl.BOUNDS_OVAL;
        searchButton.setOutlineProvider(anonymousClass5);
        searchButton.setBackground(rippleDrawableSafeCreateSimpleSelectorRoundRectDrawable);
        int i6 = Theme.key_location_actionActiveIcon;
        searchButton.setTextColor(Theme.getColor(i6, this.resourcesProvider));
        searchButton.setTextSize(1, 14.0f);
        searchButton.setTypeface(AndroidUtilities.bold());
        searchButton.setText(LocaleController.getString(R.string.PlacesInThisArea));
        searchButton.setGravity(17);
        searchButton.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        anonymousClass60.addView(searchButton, LayoutHelper.createFrame(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
        final int i7 = 0;
        searchButton.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertLocationLayout f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i7) {
                    case 0:
                        ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = this.f$0;
                        chatAttachAlertLocationLayout.showSearchPlacesButton(false);
                        chatAttachAlertLocationLayout.adapter.searchPlacesWithQuery(null, chatAttachAlertLocationLayout.userLocation, true);
                        chatAttachAlertLocationLayout.searchedForCustomLocations = true;
                        chatAttachAlertLocationLayout.showResults();
                        break;
                    case 1:
                        this.f$0.mapTypeButton.toggleSubMenu(null, null);
                        break;
                    default:
                        this.f$0.lambda$new$3$1$2();
                        break;
                }
            }
        });
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, null, 0, Theme.getColor(Theme.key_location_actionIcon, this.resourcesProvider), false, resourcesProvider);
        this.mapTypeButton = actionBarMenuItem;
        actionBarMenuItem.setClickable(true);
        actionBarMenuItem.setSubMenuOpenSide(2);
        actionBarMenuItem.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        actionBarMenuItem.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        actionBarMenuItem.addSubItem(2, R.drawable.msg_map, null, LocaleController.getString(R.string.Map), true, false, resourcesProvider);
        actionBarMenuItem.addSubItem(3, R.drawable.msg_satellite, null, LocaleController.getString(R.string.Satellite), true, false, resourcesProvider);
        actionBarMenuItem.addSubItem(4, R.drawable.msg_hybrid, null, LocaleController.getString(R.string.Hybrid), true, false, resourcesProvider);
        actionBarMenuItem.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(40.0f), Theme.getColor(i4, this.resourcesProvider), Theme.getColor(i5, this.resourcesProvider));
        ScaleStateListAnimator.apply(actionBarMenuItem, 0.1f, 1.5f);
        actionBarMenuItem.setTranslationZ(AndroidUtilities.dp(2.0f));
        actionBarMenuItem.setOutlineProvider(anonymousClass5);
        actionBarMenuItem.setBackground(rippleDrawableSafeCreateSimpleSelectorCircleDrawable);
        actionBarMenuItem.setIcon(R.drawable.msg_map_type);
        anonymousClass60.addView(actionBarMenuItem, LayoutHelper.createFrame(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        final int i8 = 1;
        actionBarMenuItem.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertLocationLayout f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i8) {
                    case 0:
                        ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = this.f$0;
                        chatAttachAlertLocationLayout.showSearchPlacesButton(false);
                        chatAttachAlertLocationLayout.adapter.searchPlacesWithQuery(null, chatAttachAlertLocationLayout.userLocation, true);
                        chatAttachAlertLocationLayout.searchedForCustomLocations = true;
                        chatAttachAlertLocationLayout.showResults();
                        break;
                    case 1:
                        this.f$0.mapTypeButton.toggleSubMenu(null, null);
                        break;
                    default:
                        this.f$0.lambda$new$3$1$2();
                        break;
                }
            }
        });
        actionBarMenuItem.setDelegate(new ChatAttachAlertLocationLayout$$ExternalSyntheticLambda7(this, i8));
        ImageView imageView = new ImageView(context);
        this.locationButton = imageView;
        BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSimpleSelectorCircleDrawable2 = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(40.0f), Theme.getColor(i4, this.resourcesProvider), Theme.getColor(i5, this.resourcesProvider));
        ScaleStateListAnimator.apply(imageView, 0.1f, 1.5f);
        imageView.setTranslationZ(AndroidUtilities.dp(2.0f));
        imageView.setOutlineProvider(anonymousClass5);
        imageView.setBackground(rippleDrawableSafeCreateSimpleSelectorCircleDrawable2);
        imageView.setImageResource(R.drawable.msg_current_location);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        int color3 = Theme.getColor(i6, this.resourcesProvider);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(color3, mode));
        imageView.setTag(Integer.valueOf(i6));
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        anonymousClass60.addView(imageView, LayoutHelper.createFrame(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        final int i9 = 2;
        imageView.setOnClickListener(new View.OnClickListener(this) {
            public final ChatAttachAlertLocationLayout f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view2) {
                switch (i9) {
                    case 0:
                        ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = this.f$0;
                        chatAttachAlertLocationLayout.showSearchPlacesButton(false);
                        chatAttachAlertLocationLayout.adapter.searchPlacesWithQuery(null, chatAttachAlertLocationLayout.userLocation, true);
                        chatAttachAlertLocationLayout.searchedForCustomLocations = true;
                        chatAttachAlertLocationLayout.showResults();
                        break;
                    case 1:
                        this.f$0.mapTypeButton.toggleSubMenu(null, null);
                        break;
                    default:
                        this.f$0.lambda$new$3$1$2();
                        break;
                }
            }
        });
        LinearLayout linearLayout = new LinearLayout(context);
        this.emptyView = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(1);
        linearLayout.setPadding(0, AndroidUtilities.dp(160.0f), 0, 0);
        linearLayout.setVisibility(8);
        addView(linearLayout, LayoutHelper.createFrame(-1.0f, -1));
        linearLayout.setOnTouchListener(new ArticleViewer$$ExternalSyntheticLambda23(14));
        ImageView imageView2 = new ImageView(context);
        this.emptyImageView = imageView2;
        imageView2.setImageResource(R.drawable.location_empty);
        imageView2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_dialogEmptyImage, this.resourcesProvider), mode));
        linearLayout.addView(imageView2, LayoutHelper.createLinear(-2, -2));
        TextView textView = new TextView(context);
        this.emptyTitleTextView = textView;
        int i10 = Theme.key_dialogEmptyText;
        textView.setTextColor(Theme.getColor(i10, this.resourcesProvider));
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 17.0f);
        textView.setText(LocaleController.getString(R.string.NoPlacesFound));
        TextView textViewM = ArticleViewer.IBlock.CC.m(linearLayout, textView, LayoutHelper.createLinear(-2, -2, 17, 0, 11, 0, 0), context);
        this.emptySubtitleTextView = textViewM;
        textViewM.setTextColor(Theme.getColor(i10, this.resourcesProvider));
        textViewM.setGravity(17);
        textViewM.setTextSize(1, 15.0f);
        textViewM.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        linearLayout.addView(textViewM, LayoutHelper.createLinear(-2, -2, 17, 0, 6, 0, 0));
        ChatActivity.AnonymousClass34 anonymousClass34 = new ChatActivity.AnonymousClass34(this, context, resourcesProvider, 10);
        this.listView = anonymousClass34;
        this.iBlur3Capture = anonymousClass34;
        this.iBlur3CaptureView = anonymousClass34;
        this.occupyNavigationBar = true;
        anonymousClass34.setClipToPadding(false);
        LocationActivityAdapter locationActivityAdapter2 = new LocationActivityAdapter(context, this.locationType, dialogId, true, resourcesProvider, this.parentAlert.isStoryLocationPicker, false, false);
        this.adapter = locationActivityAdapter2;
        anonymousClass34.setAdapter(locationActivityAdapter2);
        ChatAttachAlert chatAttachAlert3 = this.parentAlert;
        locationActivityAdapter2.isPollAttach = chatAttachAlert3 != null && (chatAttachAlert3.isPollAttach || chatAttachAlert3.isLocationPicker);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(350L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.delayAnimations = false;
        defaultItemAnimator.mSupportsChangeAnimations = false;
        anonymousClass34.setItemAnimator(defaultItemAnimator);
        locationActivityAdapter2.setMyLocationDenied(this.locationDenied, this.askedForLocation);
        anonymousClass34.setVerticalScrollBarEnabled(false);
        anonymousClass34.setSections();
        ChatAttachAlertPollLayout.AnonymousClass4 anonymousClass4 = new ChatAttachAlertPollLayout.AnonymousClass4(this, anonymousClass34);
        this.layoutManager = anonymousClass4;
        anonymousClass34.setLayoutManager(anonymousClass4);
        addView(anonymousClass34, LayoutHelper.createFrame(-1, -1, 51));
        anonymousClass34.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public final void onScrollStateChanged(RecyclerView recyclerView, int i11) {
                boolean z2 = i11 != 0;
                ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = ChatAttachAlertLocationLayout.this;
                chatAttachAlertLocationLayout.scrolling = z2;
                if (!z2 && chatAttachAlertLocationLayout.forceUpdate != null) {
                    chatAttachAlertLocationLayout.forceUpdate = null;
                }
                if (i11 == 0) {
                    int iDp2 = AndroidUtilities.dp(13.0f);
                    ChatAttachAlert chatAttachAlert4 = chatAttachAlertLocationLayout.parentAlert;
                    int backgroundPaddingTop = chatAttachAlert4.getBackgroundPaddingTop();
                    if (((chatAttachAlert4.scrollOffsetY[0] - backgroundPaddingTop) - iDp2) + backgroundPaddingTop < ActionBar.getCurrentActionBarHeight()) {
                        ChatActivity.AnonymousClass34 anonymousClass35 = chatAttachAlertLocationLayout.listView;
                        RecyclerListView.Holder holder = (RecyclerListView.Holder) anonymousClass35.findViewHolderForAdapterPosition(0);
                        if (holder != null) {
                            View view2 = holder.itemView;
                            if (view2.getTop() > chatAttachAlertLocationLayout.mapHeight - chatAttachAlertLocationLayout.overScrollHeight) {
                                anonymousClass35.smoothScrollBy(0, view2.getTop() - (chatAttachAlertLocationLayout.mapHeight - chatAttachAlertLocationLayout.overScrollHeight), null);
                            }
                        }
                    }
                }
            }

            @Override
            public final void onScrolled(RecyclerView recyclerView, int i11, int i12) {
                ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = ChatAttachAlertLocationLayout.this;
                chatAttachAlertLocationLayout.updateClipView();
                if (chatAttachAlertLocationLayout.forceUpdate != null) {
                    chatAttachAlertLocationLayout.yOffset += i12;
                }
                chatAttachAlertLocationLayout.parentAlert.updateLayout(chatAttachAlertLocationLayout, true, i12);
            }
        });
        final int i11 = 1;
        anonymousClass34.setOnItemClickListener(new RecyclerListView.OnItemClickListener(this) {
            public final ChatAttachAlertLocationLayout f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onItemClick(int i12, View view2) {
                switch (i11) {
                    case 0:
                        this.f$0.lambda$new$19(chatActivity, resourcesProvider, i12);
                        break;
                    default:
                        this.f$0.lambda$new$9(chatActivity, resourcesProvider, i12);
                        break;
                }
            }
        });
        ChatAttachAlertLocationLayout$$ExternalSyntheticLambda7 chatAttachAlertLocationLayout$$ExternalSyntheticLambda7 = new ChatAttachAlertLocationLayout$$ExternalSyntheticLambda7(this, 2);
        ((BaseLocationAdapter) locationActivityAdapter2).dialogId = dialogId;
        locationActivityAdapter2.delegate = chatAttachAlertLocationLayout$$ExternalSyntheticLambda7;
        locationActivityAdapter2.setOverScrollHeight(AndroidUtilities.dp(16.0f) + this.overScrollHeight);
        addView(anonymousClass60, LayoutHelper.createFrame(-1, -1, 51));
        IMapsProvider.IMapView iMapViewOnCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.mapView = iMapViewOnCreateMapView;
        iMapViewOnCreateMapView.setOnDispatchTouchEventInterceptor(new ChatAttachAlertLocationLayout$$ExternalSyntheticLambda7(this, 3));
        this.mapView.setOnInterceptTouchEventInterceptor(new ChatAttachAlertLocationLayout$$ExternalSyntheticLambda7(this, 0));
        new Thread(new ChatAttachAlertLocationLayout$$ExternalSyntheticLambda8(this, this.mapView, 0)).start();
        ImageView imageView3 = new ImageView(context);
        this.markerImageView = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        anonymousClass60.addView(imageView3, LayoutHelper.createFrame(28, 48, 49));
        RecyclerListView recyclerListView = new RecyclerListView(context, resourcesProvider);
        this.searchListView = recyclerListView;
        recyclerListView.setSections(true);
        recyclerListView.setClipToPadding(false);
        recyclerListView.setVisibility(8);
        recyclerListView.setLayoutManager(new LinearLayoutManager(1, false));
        ?? r4 = new LocationActivitySearchAdapter(context, resourcesProvider, this.parentAlert.isStoryLocationPicker) {
            @Override
            public final void notifyDataSetChanged() {
                ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = ChatAttachAlertLocationLayout.this;
                ActionBarMenuItem actionBarMenuItem2 = chatAttachAlertLocationLayout.searchItem;
                AnonymousClass6 anonymousClass7 = chatAttachAlertLocationLayout.searchAdapter;
                if (actionBarMenuItem2 != null) {
                    actionBarMenuItem2.setShowSearchProgress(anonymousClass7.searchInProgress);
                }
                TextView textView2 = chatAttachAlertLocationLayout.emptySubtitleTextView;
                if (textView2 != null) {
                    textView2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, anonymousClass7.lastFoundQuery)));
                }
                this.mObservable.notifyChanged();
            }
        };
        this.searchAdapter = r4;
        boolean z2 = this.locationDenied;
        if (r4.myLocationDenied != z2) {
            r4.myLocationDenied = z2;
        }
        ChatAttachAlertLocationLayout$$ExternalSyntheticLambda7 chatAttachAlertLocationLayout$$ExternalSyntheticLambda8 = new ChatAttachAlertLocationLayout$$ExternalSyntheticLambda7(this, 7);
        r4.dialogId = 0L;
        r4.delegate = chatAttachAlertLocationLayout$$ExternalSyntheticLambda8;
        recyclerListView.setItemAnimator(null);
        addView(recyclerListView, LayoutHelper.createFrame(-1, -1, 51));
        recyclerListView.setOnScrollListener(new ChatActivity.AnonymousClass53(this, 20));
        final int i12 = 0;
        recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener(this) {
            public final ChatAttachAlertLocationLayout f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onItemClick(int i13, View view2) {
                switch (i12) {
                    case 0:
                        this.f$0.lambda$new$19(chatActivity, resourcesProvider, i13);
                        break;
                    default:
                        this.f$0.lambda$new$9(chatActivity, resourcesProvider, i13);
                        break;
                }
            }
        });
        updateEmptyView$3();
    }

    private Location getLastLocation() {
        LocationManager locationManager = (LocationManager) ApplicationLoader.applicationContext.getSystemService("location");
        List<String> providers = locationManager.getProviders(true);
        Location lastKnownLocation = null;
        for (int size = providers.size() - 1; size >= 0; size--) {
            lastKnownLocation = locationManager.getLastKnownLocation(providers.get(size));
            if (lastKnownLocation != null) {
                return lastKnownLocation;
            }
        }
        return lastKnownLocation;
    }

    private LocationController getLocationController() {
        return this.parentAlert.baseFragment.getLocationController();
    }

    private MessagesController getMessagesController() {
        return this.parentAlert.baseFragment.getMessagesController();
    }

    public Activity getParentActivity() {
        BaseFragment baseFragment;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (chatAttachAlert == null || (baseFragment = chatAttachAlert.baseFragment) == null) {
            return null;
        }
        return baseFragment.getParentActivity();
    }

    private UserConfig getUserConfig() {
        return this.parentAlert.baseFragment.getUserConfig();
    }

    public final Bitmap createPlaceBitmap(int i) {
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

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        boolean z;
        boolean z2;
        int i3 = NotificationCenter.locationPermissionGranted;
        LocationActivityAdapter locationActivityAdapter = this.adapter;
        AnonymousClass6 anonymousClass6 = this.searchAdapter;
        int i4 = 0;
        if (i == i3) {
            this.locationDenied = false;
            this.askedForLocation = false;
            positionMarker();
            if (locationActivityAdapter != null) {
                locationActivityAdapter.setMyLocationDenied(this.locationDenied, this.askedForLocation);
            }
            if (anonymousClass6 != null && anonymousClass6.myLocationDenied != (z2 = this.locationDenied)) {
                anonymousClass6.myLocationDenied = z2;
            }
            IMapsProvider.IMap iMap = this.map;
            if (iMap != null) {
                try {
                    iMap.setMyLocationEnabled(true);
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
        } else if (i == NotificationCenter.locationPermissionDenied) {
            this.locationDenied = true;
            this.askedForLocation = false;
            if (locationActivityAdapter != null) {
                locationActivityAdapter.setMyLocationDenied(true, false);
            }
            if (anonymousClass6 != null && anonymousClass6.myLocationDenied != (z = this.locationDenied)) {
                anonymousClass6.myLocationDenied = z;
            }
        }
        fixLayoutInternal();
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        boolean z3 = this.locationDenied;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (!z3 || chatAttachAlert.isStoryLocationPicker) {
            chatAttachAlert.getClass();
        } else {
            i4 = 8;
        }
        actionBarMenuItem.setVisibility(i4);
    }

    public final void fixLayoutInternal() {
        FrameLayout.LayoutParams layoutParams;
        if (getMeasuredHeight() == 0 || this.mapView == null) {
            return;
        }
        int currentActionBarHeight = ActionBar.getCurrentActionBarHeight();
        int i = AndroidUtilities.displaySize.y - currentActionBarHeight;
        int iDp = AndroidUtilities.dp(66.0f);
        int i2 = this.locationType;
        if (i2 == 1 || i2 == 7 || i2 == 8) {
            iDp += AndroidUtilities.dp(66.0f);
        }
        int iDp2 = (i - iDp) - AndroidUtilities.dp(90.0f);
        int iDp3 = AndroidUtilities.dp(189.0f);
        this.overScrollHeight = iDp3;
        if (!this.locationDenied || (i2 != 0 && i2 != 1)) {
            iDp2 = Math.min(AndroidUtilities.dp(310.0f), iDp2);
        }
        int iMax = Math.max(iDp3, iDp2);
        this.mapHeight = iMax;
        if (this.locationDenied && (i2 == 0 || i2 == 1)) {
            this.overScrollHeight = iMax;
        }
        ChatActivity.AnonymousClass34 anonymousClass34 = this.listView;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) anonymousClass34.getLayoutParams();
        layoutParams2.topMargin = currentActionBarHeight;
        anonymousClass34.setLayoutParams(layoutParams2);
        ChatActivity.AnonymousClass60 anonymousClass60 = this.mapViewClip;
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) anonymousClass60.getLayoutParams();
        layoutParams3.topMargin = currentActionBarHeight;
        layoutParams3.height = this.mapHeight;
        anonymousClass60.setLayoutParams(layoutParams3);
        RecyclerListView recyclerListView = this.searchListView;
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) recyclerListView.getLayoutParams();
        layoutParams4.topMargin = currentActionBarHeight;
        recyclerListView.setLayoutParams(layoutParams4);
        int iDp4 = AndroidUtilities.dp(16.0f) + ((this.locationDenied && (i2 == 0 || i2 == 1)) ? this.overScrollHeight - anonymousClass34.getPaddingTop() : this.overScrollHeight);
        LocationActivityAdapter locationActivityAdapter = this.adapter;
        locationActivityAdapter.setOverScrollHeight(iDp4);
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.mapView.getView().getLayoutParams();
        if (layoutParams5 != null) {
            layoutParams5.height = AndroidUtilities.dp(10.0f) + this.mapHeight;
            this.mapView.getView().setLayoutParams(layoutParams5);
        }
        MapOverlayView mapOverlayView = this.overlayView;
        if (mapOverlayView != null && (layoutParams = (FrameLayout.LayoutParams) mapOverlayView.getLayoutParams()) != null) {
            layoutParams.height = AndroidUtilities.dp(10.0f) + this.mapHeight;
            mapOverlayView.setLayoutParams(layoutParams);
        }
        locationActivityAdapter.mObservable.notifyChanged();
        updateClipView();
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(56.0f);
    }

    @Override
    public int getCurrentItemTop() {
        ChatActivity.AnonymousClass34 anonymousClass34 = this.listView;
        if (anonymousClass34.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        RecyclerListView.Holder holder = (RecyclerListView.Holder) anonymousClass34.findViewHolderForAdapterPosition(0);
        return AndroidUtilities.dp(56.0f) + (holder != null ? Math.max(((int) holder.itemView.getY()) - this.nonClipSize, 0) : 0);
    }

    @Override
    public int getFirstOffset() {
        return AndroidUtilities.dp(56.0f) + getListTopPadding();
    }

    @Override
    public int getListTopPadding() {
        return this.listView.getPaddingTop();
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        ChatActivity$$ExternalSyntheticLambda94 chatActivity$$ExternalSyntheticLambda94 = new ChatActivity$$ExternalSyntheticLambda94(this, 14);
        arrayList.add(new ThemeDescription(this.mapViewClip, 1, null, null, null, null, Theme.key_dialogBackground));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, Theme.key_dialogScrollGlow));
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        arrayList.add(new ThemeDescription(actionBarMenuItem != null ? actionBarMenuItem.getSearchField() : null, 16777216, null, null, null, null, Theme.key_dialogTextBlack));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        ImageView imageView = this.emptyImageView;
        int i = Theme.key_dialogEmptyImage;
        arrayList.add(new ThemeDescription(imageView, 8, null, null, null, null, i));
        TextView textView = this.emptyTitleTextView;
        int i2 = Theme.key_dialogEmptyText;
        arrayList.add(new ThemeDescription(textView, 4, null, null, null, null, i2));
        arrayList.add(new ThemeDescription(this.emptySubtitleTextView, 4, null, null, null, null, i2));
        ImageView imageView2 = this.locationButton;
        int i3 = Theme.key_location_actionIcon;
        arrayList.add(new ThemeDescription(imageView2, 262152, null, null, null, null, i3));
        int i4 = Theme.key_location_actionActiveIcon;
        arrayList.add(new ThemeDescription(imageView2, 262152, null, null, null, null, i4));
        int i5 = Theme.key_location_actionBackground;
        arrayList.add(new ThemeDescription(imageView2, 32, null, null, null, null, i5));
        int i6 = Theme.key_location_actionPressedBackground;
        arrayList.add(new ThemeDescription(imageView2, 65568, null, null, null, null, i6));
        ActionBarMenuItem actionBarMenuItem2 = this.mapTypeButton;
        arrayList.add(new ThemeDescription(actionBarMenuItem2, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, i3));
        arrayList.add(new ThemeDescription(actionBarMenuItem2, 32, null, null, null, null, i5));
        arrayList.add(new ThemeDescription(actionBarMenuItem2, 65568, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(this.searchAreaButton, 4, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.searchAreaButton, 32, null, null, null, null, i5));
        arrayList.add(new ThemeDescription(this.searchAreaButton, 65568, null, null, null, null, i6));
        arrayList.add(new ThemeDescription(null, 0, null, null, Theme.avatarDrawables, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_text));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundRed));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundOrange));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundViolet));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundGreen));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundCyan));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundBlue));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, chatActivity$$ExternalSyntheticLambda94, Theme.key_avatar_backgroundPink));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_location_liveLocationProgress));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_location_placeLocationBackground));
        arrayList.add(new ThemeDescription(null, 0, null, null, null, null, Theme.key_dialog_liveLocationProgress));
        arrayList.add(new ThemeDescription(this.listView, 393216, new Class[]{SendLocationCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_location_sendLocationIcon));
        arrayList.add(new ThemeDescription(this.listView, 393216, new Class[]{SendLocationCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_location_sendLiveLocationIcon));
        arrayList.add(new ThemeDescription(this.listView, 393248, new Class[]{SendLocationCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_location_sendLocationBackground));
        arrayList.add(new ThemeDescription(this.listView, 393248, new Class[]{SendLocationCell.class}, new String[]{"imageView"}, null, null, -1, null, Theme.key_location_sendLiveLocationBackground));
        int i7 = Theme.key_windowBackgroundWhiteGrayText3;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SendLocationCell.class}, new String[]{"accurateTextView"}, null, null, -1, null, i7));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{SendLocationCell.class}, new String[]{"titleTextView"}, null, null, -1, null, Theme.key_location_sendLiveLocationText));
        arrayList.add(new ThemeDescription(this.listView, 262144, new Class[]{SendLocationCell.class}, new String[]{"titleTextView"}, null, null, -1, null, Theme.key_location_sendLocationText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationDirectionCell.class}, new String[]{"buttonTextView"}, null, null, -1, null, Theme.key_featuredStickers_buttonText));
        arrayList.add(new ThemeDescription(this.listView, 131072, new Class[]{LocationDirectionCell.class}, new String[]{"frameLayout"}, null, null, -1, null, Theme.key_featuredStickers_addButton));
        arrayList.add(new ThemeDescription(this.listView, 196608, new Class[]{LocationDirectionCell.class}, new String[]{"frameLayout"}, null, null, -1, null, Theme.key_featuredStickers_addButtonPressed));
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{ShadowSectionCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
        arrayList.add(new ThemeDescription(this.listView, 48, new Class[]{ShadowSectionCell.class}, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_dialogTextBlue2));
        arrayList.add(new ThemeDescription(this.listView, 32, new Class[]{LocationCell.class}, new String[]{"imageView"}, null, null, -1, null, i7));
        int i8 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i8));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationCell.class}, new String[]{"addressTextView"}, null, null, -1, null, i7));
        RecyclerListView recyclerListView = this.searchListView;
        arrayList.add(new ThemeDescription(recyclerListView, 32, new Class[]{LocationCell.class}, new String[]{"imageView"}, null, null, -1, null, i7));
        arrayList.add(new ThemeDescription(recyclerListView, 0, new Class[]{LocationCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i8));
        arrayList.add(new ThemeDescription(recyclerListView, 0, new Class[]{LocationCell.class}, new String[]{"addressTextView"}, null, null, -1, null, i7));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SharingLiveLocationCell.class}, new String[]{"nameTextView"}, null, null, -1, null, i8));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SharingLiveLocationCell.class}, new String[]{"distanceTextView"}, null, null, -1, null, i7));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationLoadingCell.class}, new String[]{"progressBar"}, null, null, -1, null, Theme.key_progressCircle));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationLoadingCell.class}, new String[]{"textView"}, null, null, -1, null, i7));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationLoadingCell.class}, new String[]{"imageView"}, null, null, -1, null, i7));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationPoweredCell.class}, new String[]{"textView"}, null, null, -1, null, i7));
        arrayList.add(new ThemeDescription(this.listView, 8, new Class[]{LocationPoweredCell.class}, new String[]{"imageView"}, null, null, -1, null, i));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationPoweredCell.class}, new String[]{"textView2"}, null, null, -1, null, i2));
        return arrayList;
    }

    public final void lambda$new$14(IMapsProvider.IMap iMap) {
        PackageManager packageManager;
        this.map = iMap;
        iMap.setOnMapLoadedCallback(new ChatAttachAlertLocationLayout$$ExternalSyntheticLambda2(this, 3));
        if (Theme.currentTheme.isDark() || AndroidUtilities.computePerceivedBrightness(Theme.getColor(Theme.key_windowBackgroundWhite, this.resourcesProvider)) < 0.721f) {
            this.currentMapStyleDark = true;
            this.map.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
        }
        if (this.map == null) {
            return;
        }
        Location location = new Location("network");
        this.userLocation = location;
        location.setLatitude(20.659322d);
        this.userLocation.setLongitude(-11.40625d);
        try {
            this.map.setMyLocationEnabled(true);
        } catch (Exception e) {
            FileLog.e(e);
        }
        this.map.getUiSettings().setMyLocationButtonEnabled(false);
        this.map.getUiSettings().setZoomControlsEnabled(false);
        this.map.getUiSettings().setCompassEnabled(false);
        this.map.setOnCameraMoveStartedListener(new ChatAttachAlertLocationLayout$$ExternalSyntheticLambda7(this, 4));
        this.map.setOnCameraIdleListener(new ChatAttachAlertLocationLayout$$ExternalSyntheticLambda2(this, 5));
        this.map.setOnMyLocationChangeListener(new ChatAttachAlertLocationLayout$$ExternalSyntheticLambda29(this, 1));
        this.map.setOnMarkerClickListener(new ChatAttachAlertLocationLayout$$ExternalSyntheticLambda7(this, 5));
        this.map.setOnCameraMoveListener(new ChatAttachAlertLocationLayout$$ExternalSyntheticLambda2(this, 6));
        positionMarker();
        AndroidUtilities.runOnUIThread(new ChatAttachAlertLocationLayout$$ExternalSyntheticLambda2(this, 7), 200L);
        if (this.checkGpsEnabled && getParentActivity() != null) {
            this.checkGpsEnabled = false;
            Activity parentActivity = getParentActivity();
            if (parentActivity != null && (packageManager = parentActivity.getPackageManager()) != null && !packageManager.hasSystemFeature("android.hardware.location.gps")) {
                return;
            }
            try {
                if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), 0, this.resourcesProvider);
                    builder.setTopAnimation(R.raw.permission_request_location, 72, Theme.getColor(Theme.key_dialogTopBackground, this.resourcesProvider), null);
                    builder.alertDialog.message = LocaleController.getString(R.string.GpsDisabledAlertText);
                    builder.setPositiveButton(LocaleController.getString(R.string.ConnectingToProxyEnable), new ChatAttachAlertLocationLayout$$ExternalSyntheticLambda7(this, 6));
                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                    builder.show();
                }
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
        updateClipView();
    }

    public final void lambda$new$15(IMapsProvider.IMapView iMapView) {
        if (this.mapView == null || getParentActivity() == null) {
            return;
        }
        try {
            iMapView.onCreate(null);
            ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
            this.mapView.getMapAsync(new ChatAttachAlertLocationLayout$$ExternalSyntheticLambda29(this, 0));
            this.mapsInitialized = true;
            if (this.onResumeCalled) {
                this.mapView.onResume();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void lambda$new$19(ChatActivity chatActivity, Theme.ResourcesProvider resourcesProvider, int i) {
        TLRPC.TL_messageMediaVenue item = getItem(i);
        if (item == null || this.delegate == null) {
            return;
        }
        if (chatActivity != null && chatActivity.isInScheduleMode()) {
            AlertsCreator.createScheduleDatePickerDialog(getParentActivity(), chatActivity.getDialogId(), -1L, 0, new ChatAttachAlertLocationLayout$$ExternalSyntheticLambda24(this, item, 0), null, resourcesProvider);
        } else {
            this.delegate.didSelectLocation(item, this.locationType, true, 0, 0L);
            this.parentAlert.dismiss(true);
        }
    }

    public final void lambda$new$3$1$2() {
        Activity parentActivity;
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            AlertsCreator.createLocationRequiredDialog(getParentActivity()).show();
            return;
        }
        if (this.myLocation != null && this.map != null) {
            ImageView imageView = this.locationButton;
            int i = Theme.key_location_actionActiveIcon;
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
            imageView.setTag(Integer.valueOf(i));
            LocationActivityAdapter locationActivityAdapter = this.adapter;
            locationActivityAdapter.customLocation = null;
            locationActivityAdapter.fetchLocationAddress();
            locationActivityAdapter.updateCell();
            this.userLocationMoved = false;
            showSearchPlacesButton(false);
            this.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(this.myLocation.getLatitude(), this.myLocation.getLongitude())));
            if (this.searchedForCustomLocations) {
                Location location = this.myLocation;
                if (location != null && this.locationType != 8) {
                    locationActivityAdapter.searchPlacesWithQuery(null, location, true);
                }
                this.searchedForCustomLocations = false;
                showResults();
            }
        }
        if (this.lastPressedMarker != null) {
            this.markerImageView.setVisibility(0);
            IMapsProvider.IMarker iMarker = this.lastPressedMarker;
            MapOverlayView mapOverlayView = this.overlayView;
            View view = (View) mapOverlayView.views.get(iMarker);
            if (view != null) {
                mapOverlayView.removeView(view);
                mapOverlayView.views.remove(iMarker);
            }
            this.lastPressedMarker = null;
            this.lastPressedVenue = null;
            this.lastPressedMarkerView = null;
        }
    }

    public final void lambda$new$6(ChatActivity chatActivity, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, Theme.ResourcesProvider resourcesProvider, Long l) {
        if (chatActivity != null && chatActivity.isInScheduleMode()) {
            AlertsCreator.createScheduleDatePickerDialog(getParentActivity(), chatActivity.getDialogId(), -1L, 0, new ChatActivity$$ExternalSyntheticLambda248(this, tL_messageMediaGeo, l, 27), null, resourcesProvider);
            return;
        }
        this.delegate.didSelectLocation(tL_messageMediaGeo, this.locationType, true, 0, l.longValue());
        this.parentAlert.dismiss(true);
    }

    public final void lambda$new$8(ChatActivity chatActivity, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, Theme.ResourcesProvider resourcesProvider) {
        if (chatActivity != null && chatActivity.isInScheduleMode()) {
            AlertsCreator.createScheduleDatePickerDialog(getParentActivity(), chatActivity.getDialogId(), -1L, 0, new ChatAttachAlertLocationLayout$$ExternalSyntheticLambda24(this, tL_messageMediaVenue, 1), null, resourcesProvider);
        } else {
            this.delegate.didSelectLocation(tL_messageMediaVenue, this.locationType, true, 0, 0L);
            this.parentAlert.dismiss(true);
        }
    }

    public final void lambda$new$9(ChatActivity chatActivity, Theme.ResourcesProvider resourcesProvider, int i) {
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        LocationActivityAdapter locationActivityAdapter = this.adapter;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        int i2 = this.locationType;
        if (i2 == 7) {
            if (i == 1 && (tL_messageMediaVenue2 = locationActivityAdapter.city) != null) {
                this.delegate.didSelectLocation(tL_messageMediaVenue2, i2, true, 0, 0L);
                chatAttachAlert.dismiss(true);
                return;
            } else if (i == 2 && (tL_messageMediaVenue = locationActivityAdapter.street) != null) {
                this.delegate.didSelectLocation(tL_messageMediaVenue, i2, true, 0, 0L);
                chatAttachAlert.dismiss(true);
                return;
            }
        } else {
            if (i == 1) {
                if (this.delegate == null || this.userLocation == null) {
                    if (this.locationDenied) {
                        AlertsCreator.createLocationRequiredDialog(getParentActivity()).show();
                        return;
                    }
                    return;
                }
                FrameLayout frameLayout = this.lastPressedMarkerView;
                if (frameLayout != null) {
                    frameLayout.callOnClick();
                    return;
                }
                TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeo.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(this.userLocation.getLatitude());
                tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(this.userLocation.getLongitude());
                AlertsCreator.ensurePaidMessageConfirmation(chatAttachAlert.currentAccount, chatAttachAlert.getDialogId(), chatAttachAlert.getAdditionalMessagesCount() + 1, new GiftSheet$$ExternalSyntheticLambda23(this, chatActivity, tL_messageMediaGeo, resourcesProvider, 4), 0L);
                return;
            }
            if (i == 2 && i2 == 1) {
                LocationController locationController = getLocationController();
                long j = this.dialogId;
                if (locationController.isSharingLocation(j)) {
                    getLocationController().removeSharingLocation(j);
                    chatAttachAlert.dismiss(true);
                    return;
                } else if (this.myLocation == null && this.locationDenied) {
                    AlertsCreator.createLocationRequiredDialog(getParentActivity()).show();
                    return;
                } else {
                    openShareLiveLocation();
                    return;
                }
            }
        }
        Object item = locationActivityAdapter.getItem(i);
        if (item instanceof TLRPC.TL_messageMediaVenue) {
            AlertsCreator.ensurePaidMessageConfirmation(chatAttachAlert.currentAccount, chatAttachAlert.getDialogId(), chatAttachAlert.getAdditionalMessagesCount() + 1, new GiftSheet$$ExternalSyntheticLambda23(this, chatActivity, (TLRPC.TL_messageMediaVenue) item, resourcesProvider, 5), 0L);
        }
    }

    public final void lambda$onMapInit$24(Location location) {
        int i;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (chatAttachAlert == null || chatAttachAlert.baseFragment == null) {
            return;
        }
        positionMarker(location);
        LocationActivityAdapter locationActivityAdapter = this.adapter;
        if (locationActivityAdapter != null && (((i = this.locationType) == 7 || i == 8) && !this.userLocationMoved)) {
            locationActivityAdapter.customLocation = this.userLocation;
            locationActivityAdapter.fetchLocationAddress();
            locationActivityAdapter.updateCell();
        }
        getLocationController().setMapLocation(location, this.isFirstLocation);
        this.isFirstLocation = false;
    }

    public final void lambda$onMapInit$28() {
        if (getParentActivity() == null) {
            return;
        }
        try {
            getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        } catch (Exception unused) {
        }
    }

    public final void lambda$onShow$33() {
        int i;
        Activity parentActivity;
        if (!this.checkPermission || (i = Build.VERSION.SDK_INT) < 23 || (parentActivity = getParentActivity()) == null) {
            return;
        }
        this.checkPermission = false;
        int iCheckSelfPermission = parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION");
        LocationActivityAdapter locationActivityAdapter = this.adapter;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (iCheckSelfPermission != 0) {
            String[] strArr = (!chatAttachAlert.isStoryLocationPicker || chatAttachAlert.storyLocationPickerPhotoFile == null || i < 29) ? new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"} : new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
            this.askedForLocation = true;
            if (locationActivityAdapter != null) {
                locationActivityAdapter.setMyLocationDenied(this.locationDenied, true);
            }
            parentActivity.requestPermissions(strArr, 2);
            return;
        }
        if (i < 29 || !chatAttachAlert.isStoryLocationPicker || chatAttachAlert.storyLocationPickerPhotoFile == null || parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
            return;
        }
        this.askedForLocation = true;
        if (locationActivityAdapter != null) {
            locationActivityAdapter.setMyLocationDenied(this.locationDenied, true);
        }
        parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
    }

    @Override
    public final int needsActionBar() {
        return 1;
    }

    @Override
    public final void onDestroy() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionDenied);
        this.doNotDrawMap = true;
        ChatActivity.AnonymousClass60 anonymousClass60 = this.mapViewClip;
        if (anonymousClass60 != null) {
            anonymousClass60.invalidate();
        }
        try {
            IMapsProvider.IMap iMap = this.map;
            if (iMap != null) {
                iMap.setMyLocationEnabled(false);
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
        IMapsProvider.IMapView iMapView = this.mapView;
        if (iMapView != null) {
            iMapView.getView().setTranslationY((-AndroidUtilities.displaySize.y) * 3);
        }
        try {
            IMapsProvider.IMapView iMapView2 = this.mapView;
            if (iMapView2 != null) {
                iMapView2.onPause();
            }
        } catch (Exception unused) {
        }
        try {
            IMapsProvider.IMapView iMapView3 = this.mapView;
            if (iMapView3 != null) {
                iMapView3.onDestroy();
                this.mapView = null;
            }
        } catch (Exception unused2) {
        }
        LocationActivityAdapter locationActivityAdapter = this.adapter;
        if (locationActivityAdapter != null) {
            locationActivityAdapter.destroy();
        }
        AnonymousClass6 anonymousClass6 = this.searchAdapter;
        if (anonymousClass6 != null) {
            anonymousClass6.destroy();
        }
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        chatAttachAlert.actionBar.closeSearchField(true);
        chatAttachAlert.actionBar.createMenu().removeView(this.searchItem);
    }

    @Override
    public final boolean onDismiss() {
        onDestroy();
        return false;
    }

    @Override
    public final void onHide() {
        this.searchItem.setVisibility(8);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            fixLayoutInternal();
        }
    }

    @Override
    public final void onPanTransitionEnd() {
        LocationActivityAdapter locationActivityAdapter = this.adapter;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        locationActivityAdapter.animated = (chatAttachAlert == null || chatAttachAlert.isKeyboardVisible()) ? false : true;
    }

    @Override
    public final void onPanTransitionStart(int i, boolean z) {
        if (z) {
            this.adapter.animated = false;
        }
    }

    @Override
    public final void onPause() {
        IMapsProvider.IMapView iMapView = this.mapView;
        if (iMapView != null && this.mapsInitialized) {
            try {
                iMapView.onPause();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        this.onResumeCalled = false;
    }

    @Override
    public final void onPreMeasure(int i, int i2) {
        int iDp;
        int i3;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (chatAttachAlert.actionBar.isSearchFieldVisible || chatAttachAlert.sizeNotifierFrameLayout.measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
            iDp = this.mapHeight - this.overScrollHeight;
            chatAttachAlert.setAllowNestedScroll(false);
        } else {
            if (AndroidUtilities.isTablet()) {
                i3 = (i2 / 5) * 2;
            } else {
                Point point = AndroidUtilities.displaySize;
                if (point.x > point.y) {
                    i3 = (int) (i2 / 3.5f);
                } else {
                    i3 = (i2 / 5) * 2;
                }
            }
            iDp = i3 - AndroidUtilities.dp(52.0f);
            if (iDp < 0) {
                iDp = 0;
            }
            chatAttachAlert.setAllowNestedScroll(true);
        }
        this.listView.setPaddingWithoutRequestLayout(0, iDp, 0, this.listPaddingBottom);
        this.searchListView.setPaddingWithoutRequestLayout(0, 0, 0, this.listPaddingBottom);
    }

    @Override
    public final void onResume() {
        IMapsProvider.IMapView iMapView = this.mapView;
        if (iMapView != null && this.mapsInitialized) {
            try {
                iMapView.onResume();
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        this.onResumeCalled = true;
    }

    @Override
    public final void onShow(ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        chatAttachAlert.actionBar.setTitle(LocaleController.getString(R.string.ShareLocation));
        if (this.mapView.getView().getParent() == null) {
            View view = this.mapView.getView();
            FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, AndroidUtilities.dp(10.0f) + this.overScrollHeight, 51);
            ChatActivity.AnonymousClass60 anonymousClass60 = this.mapViewClip;
            anonymousClass60.addView(view, 0, layoutParamsCreateFrame);
            anonymousClass60.addView(this.overlayView, 1, LayoutHelper.createFrame(-1, AndroidUtilities.dp(10.0f) + this.overScrollHeight, 51));
            anonymousClass60.addView(this.loadingMapView, 2, LayoutHelper.createFrame(-1.0f, -1));
        }
        this.searchItem.setVisibility(0);
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
        fixLayoutInternal();
        AndroidUtilities.runOnUIThread(new ChatAttachAlertLocationLayout$$ExternalSyntheticLambda2(this, 1), chatAttachAlert.delegate.needEnterComment() ? 200L : 0L);
        ChatAttachAlertPollLayout.AnonymousClass4 anonymousClass4 = this.layoutManager;
        anonymousClass4.scrollToPositionWithOffset(0, 0, anonymousClass4.mShouldReverseLayout);
        updateClipView();
    }

    public final void openShareLiveLocation() {
        Activity parentActivity;
        if (this.delegate == null || getParentActivity() == null || this.myLocation == null) {
            return;
        }
        boolean z = this.checkBackgroundPermission;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        if (z && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
            this.checkBackgroundPermission = false;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (Math.abs((System.currentTimeMillis() / 1000) - ((long) globalMainSettings.getInt("backgroundloc", 0))) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                AlertsCreator.createBackgroundLocationPermissionDialog(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new ChatAttachAlertLocationLayout$$ExternalSyntheticLambda2(this, 2), resourcesProvider).show();
                return;
            }
        }
        long j = this.dialogId;
        AlertsCreator.createLocationUpdateDialog(getParentActivity(), false, DialogObject.isUserDialog(j) ? this.parentAlert.baseFragment.getMessagesController().getUser(Long.valueOf(j)) : null, new PhotoViewer$$ExternalSyntheticLambda156(this, 3), resourcesProvider).show();
    }

    public final void positionMarker() {
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (!chatAttachAlert.isStoryLocationPicker) {
            Location lastLocation = getLastLocation();
            this.myLocation = lastLocation;
            positionMarker(lastLocation);
            return;
        }
        if (chatAttachAlert.storyLocationPickerLatLong != null) {
            AndroidUtilities.runOnUIThread(new ChatAttachAlertLocationLayout$$ExternalSyntheticLambda2(this, 0));
            return;
        }
        if (this.locationDenied) {
            AndroidUtilities.runOnUIThread(new ChatAttachAlertLocationLayout$$ExternalSyntheticLambda2(this, 8));
            return;
        }
        File file = chatAttachAlert.storyLocationPickerPhotoFile;
        boolean z = chatAttachAlert.storyLocationPickerFileIsVideo;
        if (file != null) {
            try {
                if (z) {
                    try {
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        mediaMetadataRetriever.setDataSource(file.getAbsolutePath());
                        String strExtractMetadata = mediaMetadataRetriever.extractMetadata(23);
                        if (strExtractMetadata != null) {
                            Matcher matcher = Pattern.compile("([+\\-][0-9.]+)([+\\-][0-9.]+)").matcher(strExtractMetadata);
                            if (matcher.find() && matcher.groupCount() == 2) {
                                AndroidUtilities.runOnUIThread(new SharingLiveLocationCell$$ExternalSyntheticLambda0(this, Double.parseDouble(matcher.group(1)), Double.parseDouble(matcher.group(2)), 2));
                                return;
                            }
                        }
                    } catch (NumberFormatException | Exception unused) {
                    }
                } else {
                    ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                    float[] fArr = new float[2];
                    if (exifInterface.getLatLong(fArr)) {
                        AndroidUtilities.runOnUIThread(new EmojiView$2$$ExternalSyntheticLambda1(6, this, fArr));
                        return;
                    }
                }
            } catch (NumberFormatException | Exception unused2) {
            }
        }
        Location lastLocation2 = getLastLocation();
        this.myLocation = lastLocation2;
        positionMarker(lastLocation2);
    }

    public final void resetMapPosition(double d, double d2) {
        if (this.map == null) {
            return;
        }
        if (d == 0.0d || d2 == 0.0d) {
            Location location = new Location("");
            this.myLocation = location;
            location.reset();
            this.myLocation.setLatitude(d);
            this.myLocation.setLongitude(d2);
        } else {
            Location location2 = new Location("");
            this.userLocation = location2;
            location2.reset();
            this.userLocation.setLatitude(d);
            this.userLocation.setLongitude(d2);
        }
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(d, d2);
        IMapsProvider.ICameraUpdate iCameraUpdateNewCameraUpdateLatLngZoom = (d == 0.0d || d2 == 0.0d) ? ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.map.getMinZoomLevel()) : ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.map.getMaxZoomLevel() - 4.0f);
        this.forceUpdate = iCameraUpdateNewCameraUpdateLatLngZoom;
        this.map.moveCamera(iCameraUpdateNewCameraUpdateLatLngZoom);
        LocationActivityAdapter locationActivityAdapter = this.adapter;
        if (d == 0.0d || d2 == 0.0d) {
            locationActivityAdapter.setGpsLocation(this.myLocation);
        } else {
            locationActivityAdapter.customLocation = this.userLocation;
            locationActivityAdapter.fetchLocationAddress();
            locationActivityAdapter.updateCell();
        }
        locationActivityAdapter.fetchLocationAddress();
        this.listView.smoothScrollBy(0, 1, null);
        this.ignoreIdleCamera = true;
        if (d == 0.0d || d2 == 0.0d) {
            return;
        }
        this.userLocationMoved = true;
        showSearchPlacesButton(false);
        if (this.locationType != 8) {
            locationActivityAdapter.searchPlacesWithQuery(null, this.userLocation, true);
        }
        this.searchedForCustomLocations = true;
        showResults();
    }

    @Override
    public final void scrollToTop() {
        this.listView.smoothScrollToPosition(0);
    }

    public void setDelegate(LocationActivityDelegate locationActivityDelegate) {
        this.delegate = locationActivityDelegate;
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.parentAlert.getSheetContainer().invalidate();
        updateClipView();
    }

    @Override
    public final boolean shouldHideBottomButtons() {
        return !this.locationDenied;
    }

    public final void showResults() {
        if (this.adapter.getItemCount() != 0 && this.layoutManager.findFirstVisibleItemPosition() == 0) {
            ChatActivity.AnonymousClass34 anonymousClass34 = this.listView;
            View childAt = anonymousClass34.getChildAt(0);
            int top = childAt.getTop() + AndroidUtilities.dp(258.0f);
            if (top < 0 || top > AndroidUtilities.dp(258.0f)) {
                return;
            }
            anonymousClass34.smoothScrollBy(0, top, null);
        }
    }

    public final void showSearchPlacesButton(boolean z) {
        Location location;
        Location location2;
        if (this.locationDenied) {
            z = false;
        }
        SearchButton searchButton = this.searchAreaButton;
        if (z && searchButton != null && searchButton.getTag() == null && ((location = this.myLocation) == null || (location2 = this.userLocation) == null || location2.distanceTo(location) < 300.0f)) {
            z = false;
        }
        if (this.locationType == 8) {
            z = false;
        }
        if (searchButton != null) {
            if (!z || searchButton.getTag() == null) {
                if (z || searchButton.getTag() != null) {
                    searchButton.setVisibility(z ? 0 : 4);
                    searchButton.setTag(z ? 1 : null);
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(ObjectAnimator.ofFloat(searchButton, (Property<SearchButton, Float>) View.TRANSLATION_X, z ? 0.0f : -AndroidUtilities.dp(80.0f)));
                    animatorSet.setDuration(180L);
                    animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT);
                    animatorSet.start();
                }
            }
        }
    }

    public final void updateClipView() {
        ChatActivity.AnonymousClass60 anonymousClass60;
        int y;
        int iMin;
        IMapsProvider.LatLng latLng;
        Location location;
        IMapsProvider.IMap iMap;
        if (this.mapView == null || (anonymousClass60 = this.mapViewClip) == null) {
            return;
        }
        ChatActivity.AnonymousClass34 anonymousClass34 = this.listView;
        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = anonymousClass34.findViewHolderForAdapterPosition(0);
        if (viewHolderFindViewHolderForAdapterPosition != null) {
            y = (int) viewHolderFindViewHolderForAdapterPosition.itemView.getY();
            iMin = Math.min(y, 0) + this.overScrollHeight;
        } else {
            y = -anonymousClass60.getMeasuredHeight();
            iMin = 0;
        }
        if (((FrameLayout.LayoutParams) anonymousClass60.getLayoutParams()) != null) {
            MapOverlayView mapOverlayView = this.overlayView;
            if (iMin <= 0) {
                if (this.mapView.getView().getVisibility() == 0) {
                    this.mapView.getView().setVisibility(4);
                    anonymousClass60.setVisibility(4);
                    if (mapOverlayView != null) {
                        mapOverlayView.setVisibility(4);
                    }
                }
                this.mapView.getView().setTranslationY(y);
                return;
            }
            if (this.mapView.getView().getVisibility() == 4) {
                this.mapView.getView().setVisibility(0);
                anonymousClass60.setVisibility(0);
                if (mapOverlayView != null) {
                    mapOverlayView.setVisibility(0);
                }
            }
            int iMax = Math.max(0, (-((y - this.mapHeight) + this.overScrollHeight)) / 2);
            int iMin2 = this.mapHeight - this.overScrollHeight;
            float fMax = 1.0f - Math.max(0.0f, Math.min(1.0f, (anonymousClass34.getPaddingTop() - y) / (anonymousClass34.getPaddingTop() - iMin2)));
            int i = this.clipSize;
            boolean z = this.locationDenied;
            int i2 = this.locationType;
            if (z && (i2 == 0 || i2 == 1)) {
                iMin2 += Math.min(y, anonymousClass34.getPaddingTop());
            }
            this.clipSize = (int) (iMin2 * fMax);
            float f = iMax;
            this.mapView.getView().setTranslationY(f);
            this.nonClipSize = iMin2 - this.clipSize;
            anonymousClass60.invalidate();
            anonymousClass60.setTranslationY(y - this.nonClipSize);
            IMapsProvider.IMap iMap2 = this.map;
            if (iMap2 != null) {
                iMap2.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f) + this.clipSize);
            }
            if (mapOverlayView != null) {
                mapOverlayView.setTranslationY(f);
            }
            int iMax2 = Math.max(this.nonClipSize - y, 0);
            int i3 = this.mapHeight;
            ActionBarMenuItem actionBarMenuItem = this.mapTypeButton;
            float fMin = Math.min(iMax2, (i3 - actionBarMenuItem.getMeasuredHeight()) - AndroidUtilities.dp(80.0f));
            actionBarMenuItem.setTranslationY(fMin);
            SearchButton searchButton = this.searchAreaButton;
            searchButton.currentTranslationY = fMin;
            searchButton.setTranslationY(fMin + searchButton.additionanTranslationY);
            this.locationButton.setTranslationY(-this.clipSize);
            int iM = zzlb.m((this.mapHeight - this.clipSize) / 2, 48.0f, iMax);
            this.markerTop = iM;
            this.markerImageView.setTranslationY(iM);
            if (i != this.clipSize) {
                IMapsProvider.IMarker iMarker = this.lastPressedMarker;
                if (iMarker != null) {
                    latLng = new IMapsProvider.LatLng(iMarker.getPosition().latitude, this.lastPressedMarker.getPosition().longitude);
                } else if (!this.userLocationMoved || (location = this.userLocation) == null) {
                    Location location2 = this.myLocation;
                    latLng = location2 != null ? new IMapsProvider.LatLng(location2.getLatitude(), this.myLocation.getLongitude()) : null;
                } else {
                    latLng = new IMapsProvider.LatLng(location.getLatitude(), this.userLocation.getLongitude());
                }
                if (latLng != null && (iMap = this.map) != null) {
                    iMap.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                }
            }
            if (this.locationDenied) {
                if (i2 == 0 || i2 == 1) {
                    int itemCount = this.adapter.getItemCount();
                    for (int i4 = 1; i4 < itemCount; i4++) {
                        RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = anonymousClass34.findViewHolderForAdapterPosition(i4);
                        if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                            viewHolderFindViewHolderForAdapterPosition2.itemView.setTranslationY(anonymousClass34.getPaddingTop() - y);
                        }
                    }
                }
            }
        }
    }

    public final void updateEmptyView$3() {
        boolean z = this.searching;
        LinearLayout linearLayout = this.emptyView;
        if (!z) {
            linearLayout.setVisibility(8);
            return;
        }
        boolean z2 = this.searchInProgress;
        RecyclerListView recyclerListView = this.searchListView;
        if (!z2) {
            recyclerListView.setEmptyView(linearLayout);
        } else {
            recyclerListView.setEmptyView(null);
            linearLayout.setVisibility(8);
        }
    }

    public final void positionMarker(Location location) {
        if (location == null) {
            return;
        }
        Location location2 = new Location(location);
        this.myLocation = location2;
        IMapsProvider.IMap iMap = this.map;
        LocationActivityAdapter locationActivityAdapter = this.adapter;
        if (iMap != null) {
            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            if (locationActivityAdapter != null) {
                if (!this.searchedForCustomLocations && this.locationType != 8) {
                    locationActivityAdapter.searchPlacesWithQuery(null, this.myLocation, true);
                }
                locationActivityAdapter.setGpsLocation(this.myLocation);
            }
            if (this.userLocationMoved) {
                return;
            }
            this.userLocation = new Location(location);
            if (this.firstWas) {
                this.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                return;
            } else {
                this.firstWas = true;
                this.map.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.map.getMaxZoomLevel() - 4.0f));
                return;
            }
        }
        locationActivityAdapter.setGpsLocation(location2);
    }
}
