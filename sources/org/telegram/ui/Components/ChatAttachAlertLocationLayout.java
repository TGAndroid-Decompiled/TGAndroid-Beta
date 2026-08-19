package org.telegram.ui.Components;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
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
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.location.LocationManager;
import android.media.ExifInterface;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.animation.OvershootInterpolator;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.util.Consumer;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
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
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
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
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.Cells.LocationCell;
import org.telegram.ui.Cells.LocationDirectionCell;
import org.telegram.ui.Cells.LocationLoadingCell;
import org.telegram.ui.Cells.LocationPoweredCell;
import org.telegram.ui.Cells.SendLocationCell;
import org.telegram.ui.Cells.ShadowSectionCell;
import org.telegram.ui.Cells.SharingLiveLocationCell;
import org.telegram.ui.ChatActivity;

public class ChatAttachAlertLocationLayout extends ChatAttachAlert.AttachAlertLayout implements NotificationCenter.NotificationCenterDelegate {
    private LocationActivityAdapter adapter;
    private AnimatorSet animatorSet;
    private boolean askedForLocation;
    private Paint backgroundPaint;
    private Bitmap[] bitmapCache;
    private boolean checkBackgroundPermission;
    private boolean checkGpsEnabled;
    private boolean checkPermission;
    private int clipSize;
    private boolean currentMapStyleDark;
    private LocationActivityDelegate delegate;
    private long dialogId;
    private boolean doNotDrawMap;
    private ImageView emptyImageView;
    private TextView emptySubtitleTextView;
    private TextView emptyTitleTextView;
    private LinearLayout emptyView;
    private boolean first;
    private boolean firstFocus;
    private boolean firstWas;
    private IMapsProvider.ICameraUpdate forceUpdate;
    private boolean ignoreIdleCamera;
    private boolean isFirstLocation;
    private IMapsProvider.IMarker lastPressedMarker;
    private FrameLayout lastPressedMarkerView;
    private VenueLocation lastPressedVenue;
    private FillLastLinearLayoutManager layoutManager;
    private RecyclerListView listView;
    private View loadingMapView;
    private ImageView locationButton;
    private boolean locationDenied;
    private int locationType;
    private IMapsProvider.IMap map;
    private int mapHeight;
    private ActionBarMenuItem mapTypeButton;
    private IMapsProvider.IMapView mapView;
    private FrameLayout mapViewClip;
    private boolean mapsInitialized;
    private ImageView markerImageView;
    private int markerTop;
    private Location myLocation;
    private int nonClipSize;
    private boolean onResumeCalled;
    private ActionBarMenuItem otherItem;
    private int overScrollHeight;
    private MapOverlayView overlayView;
    private ArrayList placeMarkers;
    private boolean scrolling;
    private LocationActivitySearchAdapter searchAdapter;
    private SearchButton searchAreaButton;
    private boolean searchInProgress;
    private ActionBarMenuItem searchItem;
    private RecyclerListView searchListView;
    private boolean searchWas;
    private boolean searchedForCustomLocations;
    private boolean searching;
    private Location userLocation;
    private boolean userLocationMoved;
    private float yOffset;

    public interface LocationActivityDelegate {
        void didSelectLocation(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j);
    }

    public static class VenueLocation {
        public IMapsProvider.IMarker marker;
        public int num;
        public TLRPC.TL_messageMediaVenue venue;
    }

    public static boolean m2168$r8$lambda$NV4s6CRnI_tkfHRJSUIsAp0RZ4(View view, MotionEvent motionEvent) {
        return true;
    }

    @Override
    public int needsActionBar() {
        return 1;
    }

    static float access$2916(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, float f) {
        float f2 = chatAttachAlertLocationLayout.yOffset + f;
        chatAttachAlertLocationLayout.yOffset = f2;
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
            if (ChatAttachAlertLocationLayout.this.lastPressedVenue == venueLocation) {
                return;
            }
            ChatAttachAlertLocationLayout.this.showSearchPlacesButton(false);
            if (ChatAttachAlertLocationLayout.this.lastPressedMarker != null) {
                removeInfoView(ChatAttachAlertLocationLayout.this.lastPressedMarker);
                ChatAttachAlertLocationLayout.this.lastPressedMarker = null;
            }
            ChatAttachAlertLocationLayout.this.lastPressedVenue = venueLocation;
            ChatAttachAlertLocationLayout.this.lastPressedMarker = iMarker;
            Context context = getContext();
            FrameLayout frameLayout = new FrameLayout(context);
            addView(frameLayout, LayoutHelper.createFrame(-2, 114.0f));
            ChatAttachAlertLocationLayout.this.lastPressedMarkerView = new FrameLayout(context);
            ChatAttachAlertLocationLayout.this.lastPressedMarkerView.setBackgroundResource(R.drawable.venue_tooltip);
            ChatAttachAlertLocationLayout.this.lastPressedMarkerView.getBackground().setColorFilter(new PorterDuffColorFilter(ChatAttachAlertLocationLayout.this.getThemedColor(Theme.key_dialogBackground), PorterDuff.Mode.MULTIPLY));
            frameLayout.addView(ChatAttachAlertLocationLayout.this.lastPressedMarkerView, LayoutHelper.createFrame(-2, 71.0f));
            ChatAttachAlertLocationLayout.this.lastPressedMarkerView.setAlpha(0.0f);
            ChatAttachAlertLocationLayout.this.lastPressedMarkerView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    ChatAttachAlertLocationLayout.MapOverlayView.$r8$lambda$kHJEFy3tCF5lTX6Qa_Uqa0FmbCE(this.f$0, venueLocation, view);
                }
            });
            TextView textView = new TextView(context);
            textView.setTextSize(1, 16.0f);
            textView.setMaxLines(1);
            TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
            textView.setEllipsize(truncateAt);
            textView.setSingleLine(true);
            textView.setTextColor(ChatAttachAlertLocationLayout.this.getThemedColor(Theme.key_windowBackgroundWhiteBlackText));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(LocaleController.isRTL ? 5 : 3);
            ChatAttachAlertLocationLayout.this.lastPressedMarkerView.addView(textView, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 10.0f, 18.0f, 0.0f));
            TextView textView2 = new TextView(context);
            textView2.setTextSize(1, 14.0f);
            textView2.setMaxLines(1);
            textView2.setEllipsize(truncateAt);
            textView2.setSingleLine(true);
            textView2.setTextColor(ChatAttachAlertLocationLayout.this.getThemedColor(Theme.key_windowBackgroundWhiteGrayText3));
            textView2.setGravity(LocaleController.isRTL ? 5 : 3);
            ChatAttachAlertLocationLayout.this.lastPressedMarkerView.addView(textView2, LayoutHelper.createFrame(-2, -2.0f, (LocaleController.isRTL ? 5 : 3) | 48, 18.0f, 32.0f, 18.0f, 0.0f));
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
                    if (fLerp >= 0.7f && !this.startedInner && ChatAttachAlertLocationLayout.this.lastPressedMarkerView != null) {
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(ObjectAnimator.ofFloat(ChatAttachAlertLocationLayout.this.lastPressedMarkerView, (Property<FrameLayout, Float>) View.SCALE_X, 0.0f, 1.0f), ObjectAnimator.ofFloat(ChatAttachAlertLocationLayout.this.lastPressedMarkerView, (Property<FrameLayout, Float>) View.SCALE_Y, 0.0f, 1.0f), ObjectAnimator.ofFloat(ChatAttachAlertLocationLayout.this.lastPressedMarkerView, (Property<FrameLayout, Float>) View.ALPHA, 0.0f, 1.0f));
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
            ChatAttachAlertLocationLayout.this.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
        }

        public static void $r8$lambda$kHJEFy3tCF5lTX6Qa_Uqa0FmbCE(final MapOverlayView mapOverlayView, final VenueLocation venueLocation, View view) {
            ChatActivity chatActivity = (ChatActivity) ChatAttachAlertLocationLayout.this.parentAlert.baseFragment;
            if (chatActivity.isInScheduleMode()) {
                AlertsCreator.createScheduleDatePickerDialog(ChatAttachAlertLocationLayout.this.getParentActivity(), chatActivity.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                    @Override
                    public final void didSelectDate(boolean z, int i, int i2) {
                        ChatAttachAlertLocationLayout.MapOverlayView.$r8$lambda$BoJJZanmEngVErgge2Y2NdHua50(this.f$0, venueLocation, z, i, i2);
                    }
                }, ChatAttachAlertLocationLayout.this.resourcesProvider);
            } else {
                ChatAttachAlert chatAttachAlert = ChatAttachAlertLocationLayout.this.parentAlert;
                AlertsCreator.ensurePaidMessageConfirmation(chatAttachAlert.currentAccount, chatAttachAlert.getDialogId(), ChatAttachAlertLocationLayout.this.parentAlert.getAdditionalMessagesCount() + 1, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        ChatAttachAlertLocationLayout.MapOverlayView.m2176$r8$lambda$Q9iLFx9MJlLqtGgkunjnKKdqrM(this.f$0, venueLocation, (Long) obj);
                    }
                });
            }
        }

        public static void $r8$lambda$BoJJZanmEngVErgge2Y2NdHua50(MapOverlayView mapOverlayView, VenueLocation venueLocation, boolean z, int i, int i2) {
            ChatAttachAlertLocationLayout.this.delegate.didSelectLocation(venueLocation.venue, ChatAttachAlertLocationLayout.this.locationType, z, i, 0L);
            ChatAttachAlertLocationLayout.this.parentAlert.dismiss(true);
        }

        public static void m2176$r8$lambda$Q9iLFx9MJlLqtGgkunjnKKdqrM(MapOverlayView mapOverlayView, VenueLocation venueLocation, Long l) {
            ChatAttachAlertLocationLayout.this.delegate.didSelectLocation(venueLocation.venue, ChatAttachAlertLocationLayout.this.locationType, true, 0, l.longValue());
            ChatAttachAlertLocationLayout.this.parentAlert.dismiss(true);
        }

        public void removeInfoView(IMapsProvider.IMarker iMarker) {
            View view = (View) this.views.get(iMarker);
            if (view != null) {
                removeView(view);
                this.views.remove(iMarker);
            }
        }

        public void updatePositions() {
            if (ChatAttachAlertLocationLayout.this.map == null) {
                return;
            }
            IMapsProvider.IProjection projection = ChatAttachAlertLocationLayout.this.map.getProjection();
            for (Map.Entry entry : this.views.entrySet()) {
                IMapsProvider.IMarker iMarker = (IMapsProvider.IMarker) entry.getKey();
                View view = (View) entry.getValue();
                Point screenLocation = projection.toScreenLocation(iMarker.getPosition());
                view.setTranslationX(screenLocation.x - (view.getMeasuredWidth() / 2));
                view.setTranslationY((screenLocation.y - view.getMeasuredHeight()) + AndroidUtilities.dp(22.0f));
            }
        }
    }

    public ChatAttachAlertLocationLayout(ChatAttachAlert chatAttachAlert, Context context, final Theme.ResourcesProvider resourcesProvider, boolean z) {
        super(chatAttachAlert, context, resourcesProvider);
        this.checkGpsEnabled = true;
        this.askedForLocation = false;
        this.locationDenied = false;
        this.isFirstLocation = true;
        this.firstFocus = true;
        this.backgroundPaint = new Paint();
        this.placeMarkers = new ArrayList();
        this.checkPermission = true;
        this.checkBackgroundPermission = true;
        int currentActionBarHeight = (AndroidUtilities.displaySize.x - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.dp(66.0f);
        this.overScrollHeight = currentActionBarHeight;
        this.mapHeight = currentActionBarHeight;
        this.first = true;
        this.bitmapCache = new Bitmap[7];
        AndroidUtilities.fixGoogleMapsBug();
        ChatAttachAlert chatAttachAlert2 = this.parentAlert;
        BaseFragment baseFragment = chatAttachAlert2.baseFragment;
        final ChatActivity chatActivity = baseFragment instanceof ChatActivity ? (ChatActivity) baseFragment : null;
        this.dialogId = chatAttachAlert2.getDialogId();
        ChatAttachAlert chatAttachAlert3 = this.parentAlert;
        if (chatAttachAlert3.isStoryLocationPicker) {
            this.locationType = 7;
        } else if (chatAttachAlert3.isBizLocationPicker) {
            this.locationType = 8;
        } else if (z && chatActivity != null && chatActivity.getCurrentEncryptedChat() == null && !chatActivity.isInScheduleMode() && !UserObject.isUserSelf(chatActivity.getCurrentUser())) {
            this.locationType = 1;
        } else {
            this.locationType = 0;
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
        LocationActivitySearchAdapter locationActivitySearchAdapter = this.searchAdapter;
        if (locationActivitySearchAdapter != null) {
            locationActivitySearchAdapter.destroy();
        }
        this.locationDenied = (Build.VERSION.SDK_INT < 23 || getParentActivity() == null || getParentActivity().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) ? false : true;
        ActionBarMenu actionBarMenuCreateMenu = this.parentAlert.actionBar.createMenu();
        this.overlayView = new MapOverlayView(context);
        ActionBarMenuItem actionBarMenuItemSearchListener = actionBarMenuCreateMenu.addItem(0, R.drawable.outline_header_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
            @Override
            public void onSearchExpand() {
                ChatAttachAlertLocationLayout.this.searching = true;
                ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = ChatAttachAlertLocationLayout.this;
                chatAttachAlertLocationLayout.parentAlert.makeFocusable(chatAttachAlertLocationLayout.searchItem.getSearchField(), true);
            }

            @Override
            public void onSearchCollapse() {
                ChatAttachAlertLocationLayout.this.searching = false;
                ChatAttachAlertLocationLayout.this.searchWas = false;
                ChatAttachAlertLocationLayout.this.searchAdapter.searchDelayed(null, null);
                ChatAttachAlertLocationLayout.this.updateEmptyView();
                if (ChatAttachAlertLocationLayout.this.otherItem != null) {
                    ChatAttachAlertLocationLayout.this.otherItem.setVisibility(0);
                }
                ChatAttachAlertLocationLayout.this.listView.setVisibility(0);
                ChatAttachAlertLocationLayout.this.mapViewClip.setVisibility(0);
                ChatAttachAlertLocationLayout.this.searchListView.setVisibility(8);
                ChatAttachAlertLocationLayout.this.emptyView.setVisibility(8);
            }

            @Override
            public void onTextChanged(EditText editText) {
                if (ChatAttachAlertLocationLayout.this.searchAdapter == null) {
                    return;
                }
                String string = editText.getText().toString();
                if (string.length() != 0) {
                    ChatAttachAlertLocationLayout.this.searchWas = true;
                    ChatAttachAlertLocationLayout.this.searchItem.setShowSearchProgress(true);
                    if (ChatAttachAlertLocationLayout.this.otherItem != null) {
                        ChatAttachAlertLocationLayout.this.otherItem.setVisibility(8);
                    }
                    ChatAttachAlertLocationLayout.this.listView.setVisibility(8);
                    ChatAttachAlertLocationLayout.this.mapViewClip.setVisibility(8);
                    if (ChatAttachAlertLocationLayout.this.searchListView.getAdapter() != ChatAttachAlertLocationLayout.this.searchAdapter) {
                        ChatAttachAlertLocationLayout.this.searchListView.setAdapter(ChatAttachAlertLocationLayout.this.searchAdapter);
                    }
                    ChatAttachAlertLocationLayout.this.searchListView.setVisibility(0);
                    ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = ChatAttachAlertLocationLayout.this;
                    chatAttachAlertLocationLayout.searchInProgress = chatAttachAlertLocationLayout.searchAdapter.isEmpty();
                    ChatAttachAlertLocationLayout.this.updateEmptyView();
                } else {
                    if (ChatAttachAlertLocationLayout.this.otherItem != null) {
                        ChatAttachAlertLocationLayout.this.otherItem.setVisibility(0);
                    }
                    ChatAttachAlertLocationLayout.this.listView.setVisibility(0);
                    ChatAttachAlertLocationLayout.this.mapViewClip.setVisibility(0);
                    ChatAttachAlertLocationLayout.this.searchListView.setAdapter(null);
                    ChatAttachAlertLocationLayout.this.searchListView.setVisibility(8);
                    ChatAttachAlertLocationLayout.this.emptyView.setVisibility(8);
                }
                ChatAttachAlertLocationLayout.this.searchAdapter.searchDelayed(string, ChatAttachAlertLocationLayout.this.userLocation);
            }
        });
        this.searchItem = actionBarMenuItemSearchListener;
        actionBarMenuItemSearchListener.setVisibility(((!this.locationDenied || this.parentAlert.isStoryLocationPicker) && !this.parentAlert.isBizLocationPicker) ? 0 : 8);
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        int i = R.string.Search;
        actionBarMenuItem.setSearchFieldHint(LocaleController.getString(i));
        this.searchItem.setContentDescription(LocaleController.getString(i));
        EditTextBoldCursor searchField = this.searchItem.getSearchField();
        int i2 = Theme.key_dialogTextBlack;
        searchField.setTextColor(getThemedColor(i2));
        searchField.setCursorColor(getThemedColor(i2));
        searchField.setHintTextColor(getThemedColor(Theme.key_chat_messagePanelHint));
        new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(21.0f)).gravity = 83;
        FrameLayout frameLayout = new FrameLayout(context) {
            @Override
            protected void onMeasure(int i3, int i4) {
                super.onMeasure(i3, i4);
                if (ChatAttachAlertLocationLayout.this.overlayView != null) {
                    ChatAttachAlertLocationLayout.this.overlayView.updatePositions();
                }
            }

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight() - ChatAttachAlertLocationLayout.this.clipSize);
                boolean zDrawChild = ChatAttachAlertLocationLayout.this.doNotDrawMap ? false : super.drawChild(canvas, view, j);
                canvas.restore();
                return zDrawChild;
            }

            @Override
            protected void onDraw(Canvas canvas) {
                ChatAttachAlertLocationLayout.this.backgroundPaint.setColor(ChatAttachAlertLocationLayout.this.getThemedColor(Theme.key_dialogBackground));
                canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight() - ChatAttachAlertLocationLayout.this.clipSize, ChatAttachAlertLocationLayout.this.backgroundPaint);
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getY() > getMeasuredHeight() - ChatAttachAlertLocationLayout.this.clipSize) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getY() > getMeasuredHeight() - ChatAttachAlertLocationLayout.this.clipSize) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            }
        };
        this.mapViewClip = frameLayout;
        frameLayout.setWillNotDraw(false);
        View view = new View(context);
        this.loadingMapView = view;
        view.setBackgroundDrawable(new MapPlaceholderDrawable());
        SearchButton searchButton = new SearchButton(context);
        this.searchAreaButton = searchButton;
        searchButton.setTranslationX(-AndroidUtilities.dp(80.0f));
        this.searchAreaButton.setVisibility(4);
        int iDp = AndroidUtilities.dp(40.0f);
        int i3 = Theme.key_location_actionBackground;
        int themedColor = getThemedColor(i3);
        int i4 = Theme.key_location_actionPressedBackground;
        Drawable drawableCreateSimpleSelectorRoundRectDrawable = Theme.createSimpleSelectorRoundRectDrawable(iDp, themedColor, getThemedColor(i4));
        ScaleStateListAnimator.apply(this.searchAreaButton);
        this.searchAreaButton.setTranslationZ(AndroidUtilities.dp(2.0f));
        SearchButton searchButton2 = this.searchAreaButton;
        ViewOutlineProvider viewOutlineProvider = ViewOutlineProviderImpl.BOUNDS_OVAL;
        searchButton2.setOutlineProvider(viewOutlineProvider);
        this.searchAreaButton.setBackground(drawableCreateSimpleSelectorRoundRectDrawable);
        SearchButton searchButton3 = this.searchAreaButton;
        int i5 = Theme.key_location_actionActiveIcon;
        searchButton3.setTextColor(getThemedColor(i5));
        this.searchAreaButton.setTextSize(1, 14.0f);
        this.searchAreaButton.setTypeface(AndroidUtilities.bold());
        this.searchAreaButton.setText(LocaleController.getString(R.string.PlacesInThisArea));
        this.searchAreaButton.setGravity(17);
        this.searchAreaButton.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        this.mapViewClip.addView(this.searchAreaButton, LayoutHelper.createFrame(-2, 40.0f, 49, 80.0f, 12.0f, 80.0f, 0.0f));
        this.searchAreaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                ChatAttachAlertLocationLayout.$r8$lambda$vgK31XspztoAgmg38kEyqB8gjrU(this.f$0, view2);
            }
        });
        ActionBarMenuItem actionBarMenuItem2 = new ActionBarMenuItem(context, (ActionBarMenu) null, 0, getThemedColor(Theme.key_location_actionIcon), resourcesProvider);
        this.mapTypeButton = actionBarMenuItem2;
        actionBarMenuItem2.setClickable(true);
        this.mapTypeButton.setSubMenuOpenSide(2);
        this.mapTypeButton.setAdditionalXOffset(AndroidUtilities.dp(10.0f));
        this.mapTypeButton.setAdditionalYOffset(-AndroidUtilities.dp(10.0f));
        this.mapTypeButton.addSubItem(2, R.drawable.msg_map, LocaleController.getString(R.string.Map), resourcesProvider);
        this.mapTypeButton.addSubItem(3, R.drawable.msg_satellite, LocaleController.getString(R.string.Satellite), resourcesProvider);
        this.mapTypeButton.addSubItem(4, R.drawable.msg_hybrid, LocaleController.getString(R.string.Hybrid), resourcesProvider);
        this.mapTypeButton.setContentDescription(LocaleController.getString(R.string.AccDescrMoreOptions));
        Drawable drawableCreateSimpleSelectorCircleDrawable = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(40.0f), getThemedColor(i3), getThemedColor(i4));
        ScaleStateListAnimator.apply(this.mapTypeButton);
        this.mapTypeButton.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.mapTypeButton.setOutlineProvider(viewOutlineProvider);
        this.mapTypeButton.setBackground(drawableCreateSimpleSelectorCircleDrawable);
        this.mapTypeButton.setIcon(R.drawable.msg_map_type);
        this.mapViewClip.addView(this.mapTypeButton, LayoutHelper.createFrame(40, 40.0f, 53, 0.0f, 12.0f, 12.0f, 0.0f));
        this.mapTypeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.mapTypeButton.toggleSubMenu();
            }
        });
        this.mapTypeButton.setDelegate(new ActionBarMenuItem.ActionBarMenuItemDelegate() {
            @Override
            public final void onItemClick(int i6) {
                ChatAttachAlertLocationLayout.m2163$r8$lambda$8r3dgrr7wqIuF0pxHO2GaqS714(this.f$0, i6);
            }
        });
        this.locationButton = new ImageView(context);
        Drawable drawableCreateSimpleSelectorCircleDrawable2 = Theme.createSimpleSelectorCircleDrawable(AndroidUtilities.dp(40.0f), getThemedColor(i3), getThemedColor(i4));
        ScaleStateListAnimator.apply(this.locationButton);
        this.locationButton.setTranslationZ(AndroidUtilities.dp(2.0f));
        this.locationButton.setOutlineProvider(viewOutlineProvider);
        this.locationButton.setBackground(drawableCreateSimpleSelectorCircleDrawable2);
        this.locationButton.setImageResource(R.drawable.msg_current_location);
        this.locationButton.setScaleType(ImageView.ScaleType.CENTER);
        ImageView imageView = this.locationButton;
        int themedColor2 = getThemedColor(i5);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(themedColor2, mode));
        this.locationButton.setTag(Integer.valueOf(i5));
        this.locationButton.setContentDescription(LocaleController.getString(R.string.AccDescrMyLocation));
        this.mapViewClip.addView(this.locationButton, LayoutHelper.createFrame(40, 40.0f, 85, 0.0f, 0.0f, 12.0f, 12.0f));
        this.locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                ChatAttachAlertLocationLayout.m2172$r8$lambda$hfwbYBs946IprBHQ19YJokaEa4(this.f$0, view2);
            }
        });
        LinearLayout linearLayout = new LinearLayout(context);
        this.emptyView = linearLayout;
        linearLayout.setOrientation(1);
        this.emptyView.setGravity(1);
        this.emptyView.setPadding(0, AndroidUtilities.dp(160.0f), 0, 0);
        this.emptyView.setVisibility(8);
        addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f));
        this.emptyView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return ChatAttachAlertLocationLayout.m2168$r8$lambda$NV4s6CRnI_tkfHRJSUIsAp0RZ4(view2, motionEvent);
            }
        });
        ImageView imageView2 = new ImageView(context);
        this.emptyImageView = imageView2;
        imageView2.setImageResource(R.drawable.location_empty);
        this.emptyImageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_dialogEmptyImage), mode));
        this.emptyView.addView(this.emptyImageView, LayoutHelper.createLinear(-2, -2));
        TextView textView = new TextView(context);
        this.emptyTitleTextView = textView;
        int i6 = Theme.key_dialogEmptyText;
        textView.setTextColor(getThemedColor(i6));
        this.emptyTitleTextView.setGravity(17);
        this.emptyTitleTextView.setTypeface(AndroidUtilities.bold());
        this.emptyTitleTextView.setTextSize(1, 17.0f);
        this.emptyTitleTextView.setText(LocaleController.getString(R.string.NoPlacesFound));
        this.emptyView.addView(this.emptyTitleTextView, LayoutHelper.createLinear(-2, -2, 17, 0, 11, 0, 0));
        TextView textView2 = new TextView(context);
        this.emptySubtitleTextView = textView2;
        textView2.setTextColor(getThemedColor(i6));
        this.emptySubtitleTextView.setGravity(17);
        this.emptySubtitleTextView.setTextSize(1, 15.0f);
        this.emptySubtitleTextView.setPadding(AndroidUtilities.dp(40.0f), 0, AndroidUtilities.dp(40.0f), 0);
        this.emptyView.addView(this.emptySubtitleTextView, LayoutHelper.createLinear(-2, -2, 17, 0, 6, 0, 0));
        RecyclerListView recyclerListView = new RecyclerListView(context, resourcesProvider) {
            @Override
            protected void onLayout(boolean z2, int i7, int i8, int i9, int i10) {
                super.onLayout(z2, i7, i8, i9, i10);
                ChatAttachAlertLocationLayout.this.updateClipView();
            }
        };
        this.listView = recyclerListView;
        this.iBlur3Capture = recyclerListView;
        this.iBlur3CaptureView = recyclerListView;
        this.occupyNavigationBar = true;
        recyclerListView.setClipToPadding(false);
        RecyclerListView recyclerListView2 = this.listView;
        int i7 = this.locationType;
        long j = this.dialogId;
        ChatAttachAlert chatAttachAlert4 = this.parentAlert;
        LocationActivityAdapter locationActivityAdapter2 = new LocationActivityAdapter(context, i7, j, true, resourcesProvider, chatAttachAlert4.isStoryLocationPicker, false, chatAttachAlert4.isBizLocationPicker);
        this.adapter = locationActivityAdapter2;
        recyclerListView2.setAdapter(locationActivityAdapter2);
        LocationActivityAdapter locationActivityAdapter3 = this.adapter;
        ChatAttachAlert chatAttachAlert5 = this.parentAlert;
        locationActivityAdapter3.isPollAttach = chatAttachAlert5 != null && (chatAttachAlert5.isPollAttach || chatAttachAlert5.isLocationPicker);
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(350L);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.listView.setItemAnimator(defaultItemAnimator);
        this.adapter.setUpdateRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.updateClipView();
            }
        });
        this.adapter.setMyLocationDenied(this.locationDenied, this.askedForLocation);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setSections();
        RecyclerListView recyclerListView3 = this.listView;
        FillLastLinearLayoutManager fillLastLinearLayoutManager = new FillLastLinearLayoutManager(context, 1, false, 0, recyclerListView3) {
            @Override
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i8) {
                LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) {
                    @Override
                    public int calculateDyToMakeVisible(View view2, int i9) {
                        return super.calculateDyToMakeVisible(view2, i9) - (ChatAttachAlertLocationLayout.this.listView.getPaddingTop() - (ChatAttachAlertLocationLayout.this.mapHeight - ChatAttachAlertLocationLayout.this.overScrollHeight));
                    }

                    @Override
                    protected int calculateTimeForDeceleration(int i9) {
                        return super.calculateTimeForDeceleration(i9) * 4;
                    }
                };
                linearSmoothScroller.setTargetPosition(i8);
                startSmoothScroll(linearSmoothScroller);
            }
        };
        this.layoutManager = fillLastLinearLayoutManager;
        recyclerListView3.setLayoutManager(fillLastLinearLayoutManager);
        addView(this.listView, LayoutHelper.createFrame(-1, -1, 51));
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i8) {
                RecyclerListView.Holder holder;
                ChatAttachAlertLocationLayout.this.scrolling = i8 != 0;
                if (!ChatAttachAlertLocationLayout.this.scrolling && ChatAttachAlertLocationLayout.this.forceUpdate != null) {
                    ChatAttachAlertLocationLayout.this.forceUpdate = null;
                }
                if (i8 == 0) {
                    int iDp2 = AndroidUtilities.dp(13.0f);
                    int backgroundPaddingTop = ChatAttachAlertLocationLayout.this.parentAlert.getBackgroundPaddingTop();
                    if (((ChatAttachAlertLocationLayout.this.parentAlert.scrollOffsetY[0] - backgroundPaddingTop) - iDp2) + backgroundPaddingTop >= ActionBar.getCurrentActionBarHeight() || (holder = (RecyclerListView.Holder) ChatAttachAlertLocationLayout.this.listView.findViewHolderForAdapterPosition(0)) == null || holder.itemView.getTop() <= ChatAttachAlertLocationLayout.this.mapHeight - ChatAttachAlertLocationLayout.this.overScrollHeight) {
                        return;
                    }
                    ChatAttachAlertLocationLayout.this.listView.smoothScrollBy(0, holder.itemView.getTop() - (ChatAttachAlertLocationLayout.this.mapHeight - ChatAttachAlertLocationLayout.this.overScrollHeight));
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i8, int i9) {
                ChatAttachAlertLocationLayout.this.updateClipView();
                if (ChatAttachAlertLocationLayout.this.forceUpdate != null) {
                    ChatAttachAlertLocationLayout.access$2916(ChatAttachAlertLocationLayout.this, i9);
                }
                ChatAttachAlertLocationLayout chatAttachAlertLocationLayout = ChatAttachAlertLocationLayout.this;
                chatAttachAlertLocationLayout.parentAlert.updateLayout(chatAttachAlertLocationLayout, true, i9);
            }
        });
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view2, int i8) {
                ChatAttachAlertLocationLayout.$r8$lambda$Hr7iy_Yi8UrrXJzBf6h_EyPrrdc(this.f$0, chatActivity, resourcesProvider, view2, i8);
            }
        });
        this.adapter.setDelegate(this.dialogId, new BaseLocationAdapter.BaseLocationAdapterDelegate() {
            @Override
            public final void didLoadSearchResult(ArrayList arrayList) {
                this.f$0.updatePlacesMarkers(arrayList);
            }
        });
        this.adapter.setOverScrollHeight(this.overScrollHeight + AndroidUtilities.dp(16.0f));
        addView(this.mapViewClip, LayoutHelper.createFrame(-1, -1, 51));
        IMapsProvider.IMapView iMapViewOnCreateMapView = ApplicationLoader.getMapsProvider().onCreateMapView(context);
        this.mapView = iMapViewOnCreateMapView;
        iMapViewOnCreateMapView.setOnDispatchTouchEventInterceptor(new IMapsProvider.ITouchInterceptor() {
            @Override
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
                return ChatAttachAlertLocationLayout.m2174$r8$lambda$mjNFTcfkICUYYlTs8jX3JGeGyQ(this.f$0, motionEvent, iCallableMethod);
            }
        });
        this.mapView.setOnInterceptTouchEventInterceptor(new IMapsProvider.ITouchInterceptor() {
            @Override
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
                return ChatAttachAlertLocationLayout.m2171$r8$lambda$fYhEZ9lktTX8kb2lmNj7xPxcWI(this.f$0, motionEvent, iCallableMethod);
            }
        });
        final IMapsProvider.IMapView iMapView = this.mapView;
        new Thread(new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlertLocationLayout.m2175$r8$lambda$vJ5fjgybqZH2fRK9xr39Dh2HPo(this.f$0, iMapView);
            }
        }).start();
        ImageView imageView3 = new ImageView(context);
        this.markerImageView = imageView3;
        imageView3.setImageResource(R.drawable.map_pin2);
        this.mapViewClip.addView(this.markerImageView, LayoutHelper.createFrame(28, 48, 49));
        RecyclerListView recyclerListView4 = new RecyclerListView(context, resourcesProvider);
        this.searchListView = recyclerListView4;
        recyclerListView4.setSections(true);
        this.searchListView.setClipToPadding(false);
        this.searchListView.setVisibility(8);
        this.searchListView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        ChatAttachAlert chatAttachAlert6 = this.parentAlert;
        LocationActivitySearchAdapter locationActivitySearchAdapter2 = new LocationActivitySearchAdapter(context, resourcesProvider, chatAttachAlert6.isStoryLocationPicker, chatAttachAlert6.isBizLocationPicker) {
            @Override
            public void notifyDataSetChanged() {
                if (ChatAttachAlertLocationLayout.this.searchItem != null) {
                    ChatAttachAlertLocationLayout.this.searchItem.setShowSearchProgress(ChatAttachAlertLocationLayout.this.searchAdapter.isSearching());
                }
                if (ChatAttachAlertLocationLayout.this.emptySubtitleTextView != null) {
                    ChatAttachAlertLocationLayout.this.emptySubtitleTextView.setText(AndroidUtilities.replaceTags(LocaleController.formatString("NoPlacesFoundInfo", R.string.NoPlacesFoundInfo, ChatAttachAlertLocationLayout.this.searchAdapter.getLastSearchString())));
                }
                super.notifyDataSetChanged();
            }
        };
        this.searchAdapter = locationActivitySearchAdapter2;
        locationActivitySearchAdapter2.setMyLocationDenied(this.locationDenied);
        this.searchAdapter.setDelegate(0L, new BaseLocationAdapter.BaseLocationAdapterDelegate() {
            @Override
            public final void didLoadSearchResult(ArrayList arrayList) {
                ChatAttachAlertLocationLayout.$r8$lambda$mjiicV99NG1sgtALHYbTDsAdCjs(this.f$0, arrayList);
            }
        });
        this.searchListView.setItemAnimator(null);
        addView(this.searchListView, LayoutHelper.createFrame(-1, -1, 51));
        this.searchListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i8) {
                if (i8 == 1 && ChatAttachAlertLocationLayout.this.searching && ChatAttachAlertLocationLayout.this.searchWas) {
                    AndroidUtilities.hideKeyboard(ChatAttachAlertLocationLayout.this.parentAlert.getCurrentFocus());
                }
            }
        });
        this.searchListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view2, int i8) {
                ChatAttachAlertLocationLayout.$r8$lambda$Ht2nGobed2QOoxzBqDrS9RitkmU(this.f$0, chatActivity, resourcesProvider, view2, i8);
            }
        });
        updateEmptyView();
    }

    public static void $r8$lambda$vgK31XspztoAgmg38kEyqB8gjrU(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, View view) {
        chatAttachAlertLocationLayout.showSearchPlacesButton(false);
        chatAttachAlertLocationLayout.adapter.searchPlacesWithQuery(null, chatAttachAlertLocationLayout.userLocation, true, true);
        chatAttachAlertLocationLayout.searchedForCustomLocations = true;
        chatAttachAlertLocationLayout.showResults();
    }

    public static void m2163$r8$lambda$8r3dgrr7wqIuF0pxHO2GaqS714(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, int i) {
        IMapsProvider.IMap iMap = chatAttachAlertLocationLayout.map;
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

    public static void m2172$r8$lambda$hfwbYBs946IprBHQ19YJokaEa4(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, View view) {
        Activity parentActivity;
        if (Build.VERSION.SDK_INT >= 23 && (parentActivity = chatAttachAlertLocationLayout.getParentActivity()) != null && parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            AlertsCreator.createLocationRequiredDialog(chatAttachAlertLocationLayout.getParentActivity(), true).show();
            return;
        }
        if (chatAttachAlertLocationLayout.myLocation != null && chatAttachAlertLocationLayout.map != null) {
            ImageView imageView = chatAttachAlertLocationLayout.locationButton;
            int i = Theme.key_location_actionActiveIcon;
            imageView.setColorFilter(new PorterDuffColorFilter(chatAttachAlertLocationLayout.getThemedColor(i), PorterDuff.Mode.MULTIPLY));
            chatAttachAlertLocationLayout.locationButton.setTag(Integer.valueOf(i));
            chatAttachAlertLocationLayout.adapter.setCustomLocation(null);
            chatAttachAlertLocationLayout.userLocationMoved = false;
            chatAttachAlertLocationLayout.showSearchPlacesButton(false);
            chatAttachAlertLocationLayout.map.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(new IMapsProvider.LatLng(chatAttachAlertLocationLayout.myLocation.getLatitude(), chatAttachAlertLocationLayout.myLocation.getLongitude())));
            if (chatAttachAlertLocationLayout.searchedForCustomLocations) {
                Location location = chatAttachAlertLocationLayout.myLocation;
                if (location != null && chatAttachAlertLocationLayout.locationType != 8) {
                    chatAttachAlertLocationLayout.adapter.searchPlacesWithQuery(null, location, true, true);
                }
                chatAttachAlertLocationLayout.searchedForCustomLocations = false;
                chatAttachAlertLocationLayout.showResults();
            }
        }
        chatAttachAlertLocationLayout.removeInfoView();
    }

    public static void $r8$lambda$Hr7iy_Yi8UrrXJzBf6h_EyPrrdc(final ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, final ChatActivity chatActivity, final Theme.ResourcesProvider resourcesProvider, View view, int i) {
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue;
        TLRPC.TL_messageMediaVenue tL_messageMediaVenue2;
        int i2 = chatAttachAlertLocationLayout.locationType;
        if (i2 == 7) {
            if (i == 1 && (tL_messageMediaVenue2 = chatAttachAlertLocationLayout.adapter.city) != null) {
                chatAttachAlertLocationLayout.delegate.didSelectLocation(tL_messageMediaVenue2, i2, true, 0, 0L);
                chatAttachAlertLocationLayout.parentAlert.dismiss(true);
                return;
            } else if (i == 2 && (tL_messageMediaVenue = chatAttachAlertLocationLayout.adapter.street) != null) {
                chatAttachAlertLocationLayout.delegate.didSelectLocation(tL_messageMediaVenue, i2, true, 0, 0L);
                chatAttachAlertLocationLayout.parentAlert.dismiss(true);
                return;
            }
        } else {
            if (i == 1) {
                if (chatAttachAlertLocationLayout.delegate != null && chatAttachAlertLocationLayout.userLocation != null) {
                    FrameLayout frameLayout = chatAttachAlertLocationLayout.lastPressedMarkerView;
                    if (frameLayout != null) {
                        frameLayout.callOnClick();
                        return;
                    }
                    final TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                    tL_messageMediaGeo.geo = tL_geoPoint;
                    tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(chatAttachAlertLocationLayout.userLocation.getLatitude());
                    tL_messageMediaGeo.geo._long = AndroidUtilities.fixLocationCoord(chatAttachAlertLocationLayout.userLocation.getLongitude());
                    ChatAttachAlert chatAttachAlert = chatAttachAlertLocationLayout.parentAlert;
                    AlertsCreator.ensurePaidMessageConfirmation(chatAttachAlert.currentAccount, chatAttachAlert.getDialogId(), chatAttachAlertLocationLayout.parentAlert.getAdditionalMessagesCount() + 1, new Utilities.Callback() {
                        @Override
                        public final void run(Object obj) {
                            ChatAttachAlertLocationLayout.$r8$lambda$2mhE8pZGWtFDn2P4iw0ul74WLnQ(this.f$0, chatActivity, tL_messageMediaGeo, resourcesProvider, (Long) obj);
                        }
                    });
                    return;
                }
                if (chatAttachAlertLocationLayout.locationDenied) {
                    AlertsCreator.createLocationRequiredDialog(chatAttachAlertLocationLayout.getParentActivity(), true).show();
                    return;
                }
                return;
            }
            if (i == 2 && i2 == 1) {
                if (chatAttachAlertLocationLayout.getLocationController().isSharingLocation(chatAttachAlertLocationLayout.dialogId)) {
                    chatAttachAlertLocationLayout.getLocationController().removeSharingLocation(chatAttachAlertLocationLayout.dialogId);
                    chatAttachAlertLocationLayout.parentAlert.dismiss(true);
                    return;
                } else if (chatAttachAlertLocationLayout.myLocation == null && chatAttachAlertLocationLayout.locationDenied) {
                    AlertsCreator.createLocationRequiredDialog(chatAttachAlertLocationLayout.getParentActivity(), true).show();
                    return;
                } else {
                    chatAttachAlertLocationLayout.openShareLiveLocation();
                    return;
                }
            }
        }
        final Object item = chatAttachAlertLocationLayout.adapter.getItem(i);
        if (item instanceof TLRPC.TL_messageMediaVenue) {
            ChatAttachAlert chatAttachAlert2 = chatAttachAlertLocationLayout.parentAlert;
            AlertsCreator.ensurePaidMessageConfirmation(chatAttachAlert2.currentAccount, chatAttachAlert2.getDialogId(), chatAttachAlertLocationLayout.parentAlert.getAdditionalMessagesCount() + 1, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    ChatAttachAlertLocationLayout.$r8$lambda$Tx8vWZObZSkSLDHXYHv2h0MJgsM(this.f$0, chatActivity, item, resourcesProvider, (Long) obj);
                }
            });
        }
    }

    public static void $r8$lambda$2mhE8pZGWtFDn2P4iw0ul74WLnQ(final ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, ChatActivity chatActivity, final TLRPC.TL_messageMediaGeo tL_messageMediaGeo, Theme.ResourcesProvider resourcesProvider, final Long l) {
        if (chatActivity != null) {
            chatAttachAlertLocationLayout.getClass();
            if (chatActivity.isInScheduleMode()) {
                AlertsCreator.createScheduleDatePickerDialog(chatAttachAlertLocationLayout.getParentActivity(), chatActivity.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                    @Override
                    public final void didSelectDate(boolean z, int i, int i2) {
                        ChatAttachAlertLocationLayout.m2169$r8$lambda$SNaPuyxeNKschRWYTUO8tzlgcA(this.f$0, tL_messageMediaGeo, l, z, i, i2);
                    }
                }, resourcesProvider);
                return;
            }
        }
        chatAttachAlertLocationLayout.delegate.didSelectLocation(tL_messageMediaGeo, chatAttachAlertLocationLayout.locationType, true, 0, l.longValue());
        chatAttachAlertLocationLayout.parentAlert.dismiss(true);
    }

    public static void m2169$r8$lambda$SNaPuyxeNKschRWYTUO8tzlgcA(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, TLRPC.TL_messageMediaGeo tL_messageMediaGeo, Long l, boolean z, int i, int i2) {
        chatAttachAlertLocationLayout.delegate.didSelectLocation(tL_messageMediaGeo, chatAttachAlertLocationLayout.locationType, z, i, l.longValue());
        chatAttachAlertLocationLayout.parentAlert.dismiss(true);
    }

    public static void $r8$lambda$Tx8vWZObZSkSLDHXYHv2h0MJgsM(final ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, ChatActivity chatActivity, final Object obj, Theme.ResourcesProvider resourcesProvider, Long l) {
        if (chatActivity != null) {
            chatAttachAlertLocationLayout.getClass();
            if (chatActivity.isInScheduleMode()) {
                AlertsCreator.createScheduleDatePickerDialog(chatAttachAlertLocationLayout.getParentActivity(), chatActivity.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                    @Override
                    public final void didSelectDate(boolean z, int i, int i2) {
                        ChatAttachAlertLocationLayout.$r8$lambda$X5f41B3ScNV48vC5X_Tn6CAjsG4(this.f$0, obj, z, i, i2);
                    }
                }, resourcesProvider);
                return;
            }
        }
        chatAttachAlertLocationLayout.delegate.didSelectLocation((TLRPC.TL_messageMediaVenue) obj, chatAttachAlertLocationLayout.locationType, true, 0, 0L);
        chatAttachAlertLocationLayout.parentAlert.dismiss(true);
    }

    public static void $r8$lambda$X5f41B3ScNV48vC5X_Tn6CAjsG4(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, Object obj, boolean z, int i, int i2) {
        chatAttachAlertLocationLayout.delegate.didSelectLocation((TLRPC.TL_messageMediaVenue) obj, chatAttachAlertLocationLayout.locationType, z, i, 0L);
        chatAttachAlertLocationLayout.parentAlert.dismiss(true);
    }

    public static boolean m2174$r8$lambda$mjNFTcfkICUYYlTs8jX3JGeGyQ(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        MotionEvent motionEventObtain;
        MotionEvent motionEvent2;
        if (chatAttachAlertLocationLayout.yOffset != 0.0f) {
            motionEventObtain = MotionEvent.obtain(motionEvent);
            motionEventObtain.offsetLocation(0.0f, (-chatAttachAlertLocationLayout.yOffset) / 2.0f);
            motionEvent2 = motionEventObtain;
        } else {
            motionEventObtain = null;
            motionEvent2 = motionEvent;
        }
        boolean zBooleanValue = ((Boolean) iCallableMethod.call(motionEvent2)).booleanValue();
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        return zBooleanValue;
    }

    public static boolean m2171$r8$lambda$fYhEZ9lktTX8kb2lmNj7xPxcWI(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, MotionEvent motionEvent, IMapsProvider.ICallableMethod iCallableMethod) {
        Location location;
        chatAttachAlertLocationLayout.getClass();
        int action = motionEvent.getAction();
        Property property = View.TRANSLATION_Y;
        if (action == 0) {
            AnimatorSet animatorSet = chatAttachAlertLocationLayout.animatorSet;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            chatAttachAlertLocationLayout.animatorSet = animatorSet2;
            animatorSet2.setDuration(200L);
            chatAttachAlertLocationLayout.animatorSet.playTogether(ObjectAnimator.ofFloat(chatAttachAlertLocationLayout.markerImageView, (Property<ImageView, Float>) property, chatAttachAlertLocationLayout.markerTop - AndroidUtilities.dp(10.0f)));
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
            chatAttachAlertLocationLayout.animatorSet.playTogether(ObjectAnimator.ofFloat(chatAttachAlertLocationLayout.markerImageView, (Property<ImageView, Float>) property, chatAttachAlertLocationLayout.markerTop));
            chatAttachAlertLocationLayout.animatorSet.start();
        }
        if (motionEvent.getAction() == 2) {
            if (!chatAttachAlertLocationLayout.userLocationMoved) {
                ImageView imageView = chatAttachAlertLocationLayout.locationButton;
                int i = Theme.key_location_actionIcon;
                imageView.setColorFilter(new PorterDuffColorFilter(chatAttachAlertLocationLayout.getThemedColor(i), PorterDuff.Mode.MULTIPLY));
                chatAttachAlertLocationLayout.locationButton.setTag(Integer.valueOf(i));
                chatAttachAlertLocationLayout.userLocationMoved = true;
            }
            IMapsProvider.IMap iMap = chatAttachAlertLocationLayout.map;
            if (iMap != null && (location = chatAttachAlertLocationLayout.userLocation) != null) {
                location.setLatitude(iMap.getCameraPosition().target.latitude);
                chatAttachAlertLocationLayout.userLocation.setLongitude(chatAttachAlertLocationLayout.map.getCameraPosition().target.longitude);
            }
            chatAttachAlertLocationLayout.adapter.setCustomLocation(chatAttachAlertLocationLayout.userLocation);
        }
        return ((Boolean) iCallableMethod.call(motionEvent)).booleanValue();
    }

    public static void m2175$r8$lambda$vJ5fjgybqZH2fRK9xr39Dh2HPo(final ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, final IMapsProvider.IMapView iMapView) {
        chatAttachAlertLocationLayout.getClass();
        try {
            iMapView.onCreate(null);
        } catch (Exception unused) {
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlertLocationLayout.$r8$lambda$mKso6ytYY3Ncg2S3GDGSzjvlhTg(this.f$0, iMapView);
            }
        });
    }

    public static void $r8$lambda$mKso6ytYY3Ncg2S3GDGSzjvlhTg(final ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, IMapsProvider.IMapView iMapView) {
        if (chatAttachAlertLocationLayout.mapView == null || chatAttachAlertLocationLayout.getParentActivity() == null) {
            return;
        }
        try {
            iMapView.onCreate(null);
            ApplicationLoader.getMapsProvider().initializeMaps(ApplicationLoader.applicationContext);
            chatAttachAlertLocationLayout.mapView.getMapAsync(new Consumer() {
                @Override
                public final void accept(Object obj) {
                    ChatAttachAlertLocationLayout.$r8$lambda$16AY9FIsOFkH7OdQ31Iq8h3JPxE(this.f$0, (IMapsProvider.IMap) obj);
                }
            });
            chatAttachAlertLocationLayout.mapsInitialized = true;
            if (chatAttachAlertLocationLayout.onResumeCalled) {
                chatAttachAlertLocationLayout.mapView.onResume();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void $r8$lambda$16AY9FIsOFkH7OdQ31Iq8h3JPxE(final ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, IMapsProvider.IMap iMap) {
        chatAttachAlertLocationLayout.map = iMap;
        iMap.setOnMapLoadedCallback(new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlertLocationLayout.m2170$r8$lambda$bNlkunpKBAfZDpgGMQkgBanWHk(this.f$0);
            }
        });
        if (chatAttachAlertLocationLayout.isActiveThemeDark()) {
            chatAttachAlertLocationLayout.currentMapStyleDark = true;
            chatAttachAlertLocationLayout.map.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
        }
        chatAttachAlertLocationLayout.onMapInit();
    }

    public static void m2170$r8$lambda$bNlkunpKBAfZDpgGMQkgBanWHk(final ChatAttachAlertLocationLayout chatAttachAlertLocationLayout) {
        chatAttachAlertLocationLayout.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlertLocationLayout.$r8$lambda$rNh_tsi9TYfPg2NNrtV1euVvyrg(this.f$0);
            }
        });
    }

    public static void $r8$lambda$rNh_tsi9TYfPg2NNrtV1euVvyrg(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout) {
        chatAttachAlertLocationLayout.loadingMapView.setTag(1);
        chatAttachAlertLocationLayout.loadingMapView.animate().alpha(0.0f).setDuration(180L).start();
    }

    public static void $r8$lambda$mjiicV99NG1sgtALHYbTDsAdCjs(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, ArrayList arrayList) {
        chatAttachAlertLocationLayout.searchInProgress = false;
        chatAttachAlertLocationLayout.updateEmptyView();
    }

    public static void $r8$lambda$Ht2nGobed2QOoxzBqDrS9RitkmU(final ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, ChatActivity chatActivity, Theme.ResourcesProvider resourcesProvider, View view, int i) {
        final TLRPC.TL_messageMediaVenue item = chatAttachAlertLocationLayout.searchAdapter.getItem(i);
        if (item == null || chatAttachAlertLocationLayout.delegate == null) {
            return;
        }
        if (chatActivity != null && chatActivity.isInScheduleMode()) {
            AlertsCreator.createScheduleDatePickerDialog(chatAttachAlertLocationLayout.getParentActivity(), chatActivity.getDialogId(), new AlertsCreator.ScheduleDatePickerDelegate() {
                @Override
                public final void didSelectDate(boolean z, int i2, int i3) {
                    ChatAttachAlertLocationLayout.$r8$lambda$yWQH0_YlL0kyfDTwCBcLultW8XE(this.f$0, item, z, i2, i3);
                }
            }, resourcesProvider);
        } else {
            chatAttachAlertLocationLayout.delegate.didSelectLocation(item, chatAttachAlertLocationLayout.locationType, true, 0, 0L);
            chatAttachAlertLocationLayout.parentAlert.dismiss(true);
        }
    }

    public static void $r8$lambda$yWQH0_YlL0kyfDTwCBcLultW8XE(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, TLRPC.TL_messageMediaVenue tL_messageMediaVenue, boolean z, int i, int i2) {
        chatAttachAlertLocationLayout.delegate.didSelectLocation(tL_messageMediaVenue, chatAttachAlertLocationLayout.locationType, z, i, 0L);
        chatAttachAlertLocationLayout.parentAlert.dismiss(true);
    }

    @Override
    public boolean shouldHideBottomButtons() {
        return !this.locationDenied;
    }

    @Override
    public void onPause() {
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
    public void onDestroy() {
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionGranted);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.locationPermissionDenied);
        this.doNotDrawMap = true;
        FrameLayout frameLayout = this.mapViewClip;
        if (frameLayout != null) {
            frameLayout.invalidate();
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
        LocationActivitySearchAdapter locationActivitySearchAdapter = this.searchAdapter;
        if (locationActivitySearchAdapter != null) {
            locationActivitySearchAdapter.destroy();
        }
        this.parentAlert.actionBar.closeSearchField();
        this.parentAlert.actionBar.createMenu().removeView(this.searchItem);
    }

    @Override
    public void onHide() {
        this.searchItem.setVisibility(8);
    }

    @Override
    public boolean onDismiss() {
        onDestroy();
        return false;
    }

    @Override
    public int getCurrentItemTop() {
        if (this.listView.getChildCount() <= 0) {
            return Integer.MAX_VALUE;
        }
        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.listView.findViewHolderForAdapterPosition(0);
        return (holder != null ? Math.max(((int) holder.itemView.getY()) - this.nonClipSize, 0) : 0) + AndroidUtilities.dp(56.0f);
    }

    @Override
    public void setTranslationY(float f) {
        super.setTranslationY(f);
        this.parentAlert.getSheetContainer().invalidate();
        updateClipView();
    }

    @Override
    public int getListTopPadding() {
        return this.listView.getPaddingTop();
    }

    @Override
    public int getFirstOffset() {
        return getListTopPadding() + AndroidUtilities.dp(56.0f);
    }

    @Override
    public void onPreMeasure(int i, int i2) {
        int iDp;
        int i3;
        if (this.parentAlert.actionBar.isSearchFieldVisible() || this.parentAlert.sizeNotifierFrameLayout.measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
            iDp = this.mapHeight - this.overScrollHeight;
            this.parentAlert.setAllowNestedScroll(false);
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
            this.parentAlert.setAllowNestedScroll(true);
        }
        this.listView.setPaddingWithoutRequestLayout(0, iDp, 0, this.listPaddingBottom);
        this.searchListView.setPaddingWithoutRequestLayout(0, 0, 0, this.listPaddingBottom);
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            fixLayoutInternal(this.first);
            this.first = false;
        }
    }

    @Override
    public int getButtonsHideOffset() {
        return AndroidUtilities.dp(56.0f);
    }

    @Override
    public void scrollToTop() {
        this.listView.smoothScrollToPosition(0);
    }

    private boolean isActiveThemeDark() {
        return Theme.getActiveTheme().isDark() || AndroidUtilities.computePerceivedBrightness(getThemedColor(Theme.key_windowBackgroundWhite)) < 0.721f;
    }

    public void updateEmptyView() {
        if (this.searching) {
            if (this.searchInProgress) {
                this.searchListView.setEmptyView(null);
                this.emptyView.setVisibility(8);
                return;
            } else {
                this.searchListView.setEmptyView(this.emptyView);
                return;
            }
        }
        this.emptyView.setVisibility(8);
    }

    public void showSearchPlacesButton(boolean z) {
        SearchButton searchButton;
        Location location;
        Location location2;
        if (this.locationDenied) {
            z = false;
        }
        if (z && (searchButton = this.searchAreaButton) != null && searchButton.getTag() == null && ((location = this.myLocation) == null || (location2 = this.userLocation) == null || location2.distanceTo(location) < 300.0f)) {
            z = false;
        }
        if (this.locationType == 8) {
            z = false;
        }
        SearchButton searchButton2 = this.searchAreaButton;
        if (searchButton2 != null) {
            if (!z || searchButton2.getTag() == null) {
                if (z || this.searchAreaButton.getTag() != null) {
                    this.searchAreaButton.setVisibility(z ? 0 : 4);
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

    public void openShareLiveLocation() {
        Activity parentActivity;
        if (this.delegate == null || getParentActivity() == null || this.myLocation == null) {
            return;
        }
        if (this.checkBackgroundPermission && Build.VERSION.SDK_INT >= 29 && (parentActivity = getParentActivity()) != null) {
            this.checkBackgroundPermission = false;
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (Math.abs((System.currentTimeMillis() / 1000) - ((long) globalMainSettings.getInt("backgroundloc", 0))) > 86400 && parentActivity.checkSelfPermission("android.permission.ACCESS_BACKGROUND_LOCATION") != 0) {
                globalMainSettings.edit().putInt("backgroundloc", (int) (System.currentTimeMillis() / 1000)).commit();
                AlertsCreator.createBackgroundLocationPermissionDialog(parentActivity, getMessagesController().getUser(Long.valueOf(getUserConfig().getClientUserId())), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.openShareLiveLocation();
                    }
                }, this.resourcesProvider).show();
                return;
            }
        }
        AlertsCreator.createLocationUpdateDialog(getParentActivity(), false, DialogObject.isUserDialog(this.dialogId) ? this.parentAlert.baseFragment.getMessagesController().getUser(Long.valueOf(this.dialogId)) : null, new MessagesStorage.IntCallback() {
            @Override
            public final void run(int i) {
                ChatAttachAlertLocationLayout.m2164$r8$lambda$9XNva0pYsff9po8Vy1Pn_aQoGA(this.f$0, i);
            }
        }, this.resourcesProvider).show();
    }

    public static void m2164$r8$lambda$9XNva0pYsff9po8Vy1Pn_aQoGA(final ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, final int i) {
        ChatAttachAlert chatAttachAlert = chatAttachAlertLocationLayout.parentAlert;
        AlertsCreator.ensurePaidMessageConfirmation(chatAttachAlert.currentAccount, chatAttachAlert.getDialogId(), chatAttachAlertLocationLayout.parentAlert.getAdditionalMessagesCount() + 1, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ChatAttachAlertLocationLayout.m2166$r8$lambda$J_omEMfuF_LKh6fEC32C7gskBU(this.f$0, i, (Long) obj);
            }
        });
    }

    public static void m2166$r8$lambda$J_omEMfuF_LKh6fEC32C7gskBU(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, int i, Long l) {
        chatAttachAlertLocationLayout.getClass();
        TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
        TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
        tL_messageMediaGeoLive.geo = tL_geoPoint;
        tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(chatAttachAlertLocationLayout.myLocation.getLatitude());
        tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(chatAttachAlertLocationLayout.myLocation.getLongitude());
        tL_messageMediaGeoLive.period = i;
        chatAttachAlertLocationLayout.delegate.didSelectLocation(tL_messageMediaGeoLive, chatAttachAlertLocationLayout.locationType, true, 0, l.longValue());
        chatAttachAlertLocationLayout.parentAlert.dismiss(true);
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

    private MessagesController getMessagesController() {
        return this.parentAlert.baseFragment.getMessagesController();
    }

    private LocationController getLocationController() {
        return this.parentAlert.baseFragment.getLocationController();
    }

    private UserConfig getUserConfig() {
        return this.parentAlert.baseFragment.getUserConfig();
    }

    public Activity getParentActivity() {
        BaseFragment baseFragment;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (chatAttachAlert == null || (baseFragment = chatAttachAlert.baseFragment) == null) {
            return null;
        }
        return baseFragment.getParentActivity();
    }

    private void onMapInit() {
        PackageManager packageManager;
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
        this.map.setOnCameraMoveStartedListener(new IMapsProvider.OnCameraMoveStartedListener() {
            @Override
            public final void onCameraMoveStarted(int i) {
                ChatAttachAlertLocationLayout.$r8$lambda$KXRpSowQB8uZNZnpZc7vvCkCM6c(this.f$0, i);
            }
        });
        this.map.setOnCameraIdleListener(new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlertLocationLayout.$r8$lambda$eSfuRCDvcR6ojHiAGh6rBA0aGTk(this.f$0);
            }
        });
        this.map.setOnMyLocationChangeListener(new Consumer() {
            @Override
            public final void accept(Object obj) {
                ChatAttachAlertLocationLayout.$r8$lambda$iyMvkGZ71sq4636PPrGwbp6fEGM(this.f$0, (Location) obj);
            }
        });
        this.map.setOnMarkerClickListener(new IMapsProvider.OnMarkerClickListener() {
            @Override
            public final boolean onClick(IMapsProvider.IMarker iMarker) {
                return ChatAttachAlertLocationLayout.m2173$r8$lambda$mDapeCUUv6uBgrRkzNVPtzHCw(this.f$0, iMarker);
            }
        });
        this.map.setOnCameraMoveListener(new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlertLocationLayout.$r8$lambda$ee5pTB1emeT2TXHkA8QoEUU2niA(this.f$0);
            }
        });
        positionMarker();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlertLocationLayout.m2162$r8$lambda$727sJqREijb248Mty6pHOwW8i4(this.f$0);
            }
        }, 200L);
        if (this.checkGpsEnabled && getParentActivity() != null) {
            this.checkGpsEnabled = false;
            Activity parentActivity = getParentActivity();
            if (parentActivity != null && (packageManager = parentActivity.getPackageManager()) != null && !packageManager.hasSystemFeature("android.hardware.location.gps")) {
                return;
            }
            try {
                if (!((LocationManager) ApplicationLoader.applicationContext.getSystemService("location")).isProviderEnabled("gps")) {
                    AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity(), this.resourcesProvider);
                    builder.setTopAnimation(R.raw.permission_request_location, 72, false, Theme.getColor(Theme.key_dialogTopBackground, this.resourcesProvider));
                    builder.setMessage(LocaleController.getString(R.string.GpsDisabledAlertText));
                    builder.setPositiveButton(LocaleController.getString(R.string.ConnectingToProxyEnable), new AlertDialog.OnButtonClickListener() {
                        @Override
                        public final void onClick(AlertDialog alertDialog, int i) {
                            ChatAttachAlertLocationLayout.$r8$lambda$urdnMhWQMOQMYjcSkRroYRkoeOk(this.f$0, alertDialog, i);
                        }
                    });
                    builder.setNegativeButton(LocaleController.getString(R.string.Cancel), null);
                    builder.show();
                }
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
        updateClipView();
    }

    public static void $r8$lambda$KXRpSowQB8uZNZnpZc7vvCkCM6c(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, int i) {
        View childAt;
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder;
        if (i != 1) {
            chatAttachAlertLocationLayout.getClass();
            return;
        }
        chatAttachAlertLocationLayout.showSearchPlacesButton(true);
        chatAttachAlertLocationLayout.removeInfoView();
        if (chatAttachAlertLocationLayout.scrolling || chatAttachAlertLocationLayout.listView.getChildCount() <= 0 || (childAt = chatAttachAlertLocationLayout.listView.getChildAt(0)) == null || (viewHolderFindContainingViewHolder = chatAttachAlertLocationLayout.listView.findContainingViewHolder(childAt)) == null || viewHolderFindContainingViewHolder.getAdapterPosition() != 0) {
            return;
        }
        int iDp = chatAttachAlertLocationLayout.locationType == 0 ? 0 : AndroidUtilities.dp(66.0f);
        int top = childAt.getTop();
        if (top < (-iDp)) {
            IMapsProvider.CameraPosition cameraPosition = chatAttachAlertLocationLayout.map.getCameraPosition();
            chatAttachAlertLocationLayout.forceUpdate = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(cameraPosition.target, cameraPosition.zoom);
            chatAttachAlertLocationLayout.listView.smoothScrollBy(0, top + iDp);
        }
    }

    public static void $r8$lambda$eSfuRCDvcR6ojHiAGh6rBA0aGTk(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout) {
        Location location;
        if (chatAttachAlertLocationLayout.ignoreIdleCamera) {
            chatAttachAlertLocationLayout.ignoreIdleCamera = false;
            return;
        }
        IMapsProvider.IMap iMap = chatAttachAlertLocationLayout.map;
        if (iMap != null && (location = chatAttachAlertLocationLayout.userLocation) != null) {
            location.setLatitude(iMap.getCameraPosition().target.latitude);
            chatAttachAlertLocationLayout.userLocation.setLongitude(chatAttachAlertLocationLayout.map.getCameraPosition().target.longitude);
        }
        chatAttachAlertLocationLayout.adapter.setCustomLocation(chatAttachAlertLocationLayout.userLocation);
        chatAttachAlertLocationLayout.adapter.fetchLocationAddress();
    }

    public static void $r8$lambda$iyMvkGZ71sq4636PPrGwbp6fEGM(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, Location location) {
        int i;
        ChatAttachAlert chatAttachAlert = chatAttachAlertLocationLayout.parentAlert;
        if (chatAttachAlert == null || chatAttachAlert.baseFragment == null) {
            return;
        }
        chatAttachAlertLocationLayout.positionMarker(location);
        LocationActivityAdapter locationActivityAdapter = chatAttachAlertLocationLayout.adapter;
        if (locationActivityAdapter != null && (((i = chatAttachAlertLocationLayout.locationType) == 7 || i == 8) && !chatAttachAlertLocationLayout.userLocationMoved)) {
            locationActivityAdapter.setCustomLocation(chatAttachAlertLocationLayout.userLocation);
        }
        chatAttachAlertLocationLayout.getLocationController().setMapLocation(location, chatAttachAlertLocationLayout.isFirstLocation);
        chatAttachAlertLocationLayout.isFirstLocation = false;
    }

    public static boolean m2173$r8$lambda$mDapeCUUv6uBgrRkzNVPtzHCw(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, IMapsProvider.IMarker iMarker) {
        chatAttachAlertLocationLayout.getClass();
        if (!(iMarker.getTag() instanceof VenueLocation)) {
            return true;
        }
        chatAttachAlertLocationLayout.markerImageView.setVisibility(4);
        if (!chatAttachAlertLocationLayout.userLocationMoved) {
            ImageView imageView = chatAttachAlertLocationLayout.locationButton;
            int i = Theme.key_location_actionIcon;
            imageView.setColorFilter(new PorterDuffColorFilter(chatAttachAlertLocationLayout.getThemedColor(i), PorterDuff.Mode.MULTIPLY));
            chatAttachAlertLocationLayout.locationButton.setTag(Integer.valueOf(i));
            chatAttachAlertLocationLayout.userLocationMoved = true;
        }
        chatAttachAlertLocationLayout.overlayView.addInfoView(iMarker);
        return true;
    }

    public static void $r8$lambda$ee5pTB1emeT2TXHkA8QoEUU2niA(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout) {
        MapOverlayView mapOverlayView = chatAttachAlertLocationLayout.overlayView;
        if (mapOverlayView != null) {
            mapOverlayView.updatePositions();
        }
    }

    public static void m2162$r8$lambda$727sJqREijb248Mty6pHOwW8i4(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout) {
        if (chatAttachAlertLocationLayout.loadingMapView.getTag() == null) {
            chatAttachAlertLocationLayout.loadingMapView.animate().alpha(0.0f).setDuration(180L).start();
        }
    }

    public static void $r8$lambda$urdnMhWQMOQMYjcSkRroYRkoeOk(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, AlertDialog alertDialog, int i) {
        if (chatAttachAlertLocationLayout.getParentActivity() == null) {
            return;
        }
        try {
            chatAttachAlertLocationLayout.getParentActivity().startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        } catch (Exception unused) {
        }
    }

    public void resetMapPosition(double d, double d2) {
        IMapsProvider.ICameraUpdate iCameraUpdateNewCameraUpdateLatLngZoom;
        if (this.map == null) {
            return;
        }
        if (d != 0.0d && d2 != 0.0d) {
            Location location = new Location("");
            this.userLocation = location;
            location.reset();
            this.userLocation.setLatitude(d);
            this.userLocation.setLongitude(d2);
        } else {
            Location location2 = new Location("");
            this.myLocation = location2;
            location2.reset();
            this.myLocation.setLatitude(d);
            this.myLocation.setLongitude(d2);
        }
        IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(d, d2);
        if (d != 0.0d && d2 != 0.0d) {
            iCameraUpdateNewCameraUpdateLatLngZoom = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.map.getMaxZoomLevel() - 4.0f);
        } else {
            iCameraUpdateNewCameraUpdateLatLngZoom = ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(latLng, this.map.getMinZoomLevel());
        }
        this.forceUpdate = iCameraUpdateNewCameraUpdateLatLngZoom;
        this.map.moveCamera(iCameraUpdateNewCameraUpdateLatLngZoom);
        if (d != 0.0d && d2 != 0.0d) {
            this.adapter.setCustomLocation(this.userLocation);
        } else {
            this.adapter.setGpsLocation(this.myLocation);
        }
        this.adapter.fetchLocationAddress();
        this.listView.smoothScrollBy(0, 1);
        this.ignoreIdleCamera = true;
        if (d == 0.0d || d2 == 0.0d) {
            return;
        }
        this.userLocationMoved = true;
        showSearchPlacesButton(false);
        if (this.locationType != 8) {
            this.adapter.searchPlacesWithQuery(null, this.userLocation, true, true);
        }
        this.searchedForCustomLocations = true;
        showResults();
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

    private void showResults() {
        if (this.adapter.getItemCount() != 0 && this.layoutManager.findFirstVisibleItemPosition() == 0) {
            int iDp = AndroidUtilities.dp(258.0f) + this.listView.getChildAt(0).getTop();
            if (iDp < 0 || iDp > AndroidUtilities.dp(258.0f)) {
                return;
            }
            this.listView.smoothScrollBy(0, iDp);
        }
    }

    public void updateClipView() {
        int y;
        int iMin;
        IMapsProvider.LatLng latLng;
        Location location;
        IMapsProvider.IMap iMap;
        if (this.mapView == null || this.mapViewClip == null) {
            return;
        }
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
                this.mapView.getView().setTranslationY(y);
                return;
            }
            if (this.mapView.getView().getVisibility() == 4) {
                this.mapView.getView().setVisibility(0);
                this.mapViewClip.setVisibility(0);
                MapOverlayView mapOverlayView2 = this.overlayView;
                if (mapOverlayView2 != null) {
                    mapOverlayView2.setVisibility(0);
                }
            }
            int iMax = Math.max(0, (-((y - this.mapHeight) + this.overScrollHeight)) / 2);
            int iMin2 = this.mapHeight - this.overScrollHeight;
            float fMax = 1.0f - Math.max(0.0f, Math.min(1.0f, (this.listView.getPaddingTop() - y) / (this.listView.getPaddingTop() - iMin2)));
            int i = this.clipSize;
            if (this.locationDenied && isTypeSend()) {
                iMin2 += Math.min(y, this.listView.getPaddingTop());
            }
            this.clipSize = (int) (iMin2 * fMax);
            float f = iMax;
            this.mapView.getView().setTranslationY(f);
            this.nonClipSize = iMin2 - this.clipSize;
            this.mapViewClip.invalidate();
            this.mapViewClip.setTranslationY(y - this.nonClipSize);
            IMapsProvider.IMap iMap2 = this.map;
            if (iMap2 != null) {
                iMap2.setPadding(0, AndroidUtilities.dp(6.0f), 0, this.clipSize + AndroidUtilities.dp(6.0f));
            }
            MapOverlayView mapOverlayView3 = this.overlayView;
            if (mapOverlayView3 != null) {
                mapOverlayView3.setTranslationY(f);
            }
            float fMin = Math.min(Math.max(this.nonClipSize - y, 0), (this.mapHeight - this.mapTypeButton.getMeasuredHeight()) - AndroidUtilities.dp(80.0f));
            this.mapTypeButton.setTranslationY(fMin);
            this.searchAreaButton.setTranslation(fMin);
            this.locationButton.setTranslationY(-this.clipSize);
            ImageView imageView = this.markerImageView;
            int iDp = (((this.mapHeight - this.clipSize) / 2) - AndroidUtilities.dp(48.0f)) + iMax;
            this.markerTop = iDp;
            imageView.setTranslationY(iDp);
            if (i != this.clipSize) {
                IMapsProvider.IMarker iMarker = this.lastPressedMarker;
                if (iMarker != null) {
                    latLng = new IMapsProvider.LatLng(iMarker.getPosition().latitude, this.lastPressedMarker.getPosition().longitude);
                } else if (this.userLocationMoved && (location = this.userLocation) != null) {
                    latLng = new IMapsProvider.LatLng(location.getLatitude(), this.userLocation.getLongitude());
                } else {
                    Location location2 = this.myLocation;
                    latLng = location2 != null ? new IMapsProvider.LatLng(location2.getLatitude(), this.myLocation.getLongitude()) : null;
                }
                if (latLng != null && (iMap = this.map) != null) {
                    iMap.moveCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(latLng));
                }
            }
            if (this.locationDenied && isTypeSend()) {
                int itemCount = this.adapter.getItemCount();
                for (int i2 = 1; i2 < itemCount; i2++) {
                    RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition2 = this.listView.findViewHolderForAdapterPosition(i2);
                    if (viewHolderFindViewHolderForAdapterPosition2 != null) {
                        viewHolderFindViewHolderForAdapterPosition2.itemView.setTranslationY(this.listView.getPaddingTop() - y);
                    }
                }
            }
        }
    }

    private boolean isTypeSend() {
        int i = this.locationType;
        return i == 0 || i == 1;
    }

    private int buttonsHeight() {
        int iDp = AndroidUtilities.dp(66.0f);
        int i = this.locationType;
        return (i == 1 || i == 7 || i == 8) ? iDp + AndroidUtilities.dp(66.0f) : iDp;
    }

    private void fixLayoutInternal(boolean z) {
        FrameLayout.LayoutParams layoutParams;
        if (getMeasuredHeight() == 0 || this.mapView == null) {
            return;
        }
        int currentActionBarHeight = ActionBar.getCurrentActionBarHeight();
        int iButtonsHeight = ((AndroidUtilities.displaySize.y - currentActionBarHeight) - buttonsHeight()) - AndroidUtilities.dp(90.0f);
        int iDp = AndroidUtilities.dp(189.0f);
        this.overScrollHeight = iDp;
        if (!this.locationDenied || !isTypeSend()) {
            iButtonsHeight = Math.min(AndroidUtilities.dp(310.0f), iButtonsHeight);
        }
        this.mapHeight = Math.max(iDp, iButtonsHeight);
        if (this.locationDenied && isTypeSend()) {
            this.overScrollHeight = this.mapHeight;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.listView.getLayoutParams();
        layoutParams2.topMargin = currentActionBarHeight;
        this.listView.setLayoutParams(layoutParams2);
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.mapViewClip.getLayoutParams();
        layoutParams3.topMargin = currentActionBarHeight;
        layoutParams3.height = this.mapHeight;
        this.mapViewClip.setLayoutParams(layoutParams3);
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.searchListView.getLayoutParams();
        layoutParams4.topMargin = currentActionBarHeight;
        this.searchListView.setLayoutParams(layoutParams4);
        this.adapter.setOverScrollHeight(((this.locationDenied && isTypeSend()) ? this.overScrollHeight - this.listView.getPaddingTop() : this.overScrollHeight) + AndroidUtilities.dp(16.0f));
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.mapView.getView().getLayoutParams();
        if (layoutParams5 != null) {
            layoutParams5.height = this.mapHeight + AndroidUtilities.dp(10.0f);
            this.mapView.getView().setLayoutParams(layoutParams5);
        }
        MapOverlayView mapOverlayView = this.overlayView;
        if (mapOverlayView != null && (layoutParams = (FrameLayout.LayoutParams) mapOverlayView.getLayoutParams()) != null) {
            layoutParams.height = this.mapHeight + AndroidUtilities.dp(10.0f);
            this.overlayView.setLayoutParams(layoutParams);
        }
        this.adapter.notifyDataSetChanged();
        updateClipView();
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

    private void positionMarker() {
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        if (chatAttachAlert.isStoryLocationPicker) {
            if (chatAttachAlert.storyLocationPickerLatLong != null) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        ChatAttachAlertLocationLayout.$r8$lambda$fBtaJhuPdR5M5eJ6BA7mNlcvRtE(this.f$0);
                    }
                });
                return;
            }
            if (!this.locationDenied) {
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
                                        String strGroup = matcher.group(1);
                                        String strGroup2 = matcher.group(2);
                                        final double d = Double.parseDouble(strGroup);
                                        final double d2 = Double.parseDouble(strGroup2);
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                this.f$0.resetMapPosition(d, d2);
                                            }
                                        });
                                        return;
                                    }
                                }
                            } catch (NumberFormatException | Exception unused) {
                            }
                        } else {
                            ExifInterface exifInterface = new ExifInterface(file.getAbsolutePath());
                            final float[] fArr = new float[2];
                            if (exifInterface.getLatLong(fArr)) {
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        ChatAttachAlertLocationLayout.m2167$r8$lambda$MV7uuRDYd7K9E6crLSph_UnHQ(this.f$0, fArr);
                                    }
                                });
                                return;
                            }
                        }
                    } catch (NumberFormatException | Exception unused2) {
                    }
                }
                Location lastLocation = getLastLocation();
                this.myLocation = lastLocation;
                positionMarker(lastLocation);
                return;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.resetMapPosition(0.0d, 0.0d);
                }
            });
            return;
        }
        Location lastLocation2 = getLastLocation();
        this.myLocation = lastLocation2;
        positionMarker(lastLocation2);
    }

    public static void $r8$lambda$fBtaJhuPdR5M5eJ6BA7mNlcvRtE(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout) {
        double[] dArr = chatAttachAlertLocationLayout.parentAlert.storyLocationPickerLatLong;
        chatAttachAlertLocationLayout.resetMapPosition(dArr[0], dArr[1]);
    }

    public static void m2167$r8$lambda$MV7uuRDYd7K9E6crLSph_UnHQ(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout, float[] fArr) {
        chatAttachAlertLocationLayout.getClass();
        chatAttachAlertLocationLayout.resetMapPosition(fArr[0], fArr[1]);
    }

    private void positionMarker(Location location) {
        if (location == null) {
            return;
        }
        Location location2 = new Location(location);
        this.myLocation = location2;
        if (this.map != null) {
            IMapsProvider.LatLng latLng = new IMapsProvider.LatLng(location.getLatitude(), location.getLongitude());
            LocationActivityAdapter locationActivityAdapter = this.adapter;
            if (locationActivityAdapter != null) {
                if (!this.searchedForCustomLocations && this.locationType != 8) {
                    locationActivityAdapter.searchPlacesWithQuery(null, this.myLocation, true);
                }
                this.adapter.setGpsLocation(this.myLocation);
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
        this.adapter.setGpsLocation(location2);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.locationPermissionGranted) {
            this.locationDenied = false;
            this.askedForLocation = false;
            positionMarker();
            LocationActivityAdapter locationActivityAdapter = this.adapter;
            if (locationActivityAdapter != null) {
                locationActivityAdapter.setMyLocationDenied(this.locationDenied, this.askedForLocation);
            }
            LocationActivitySearchAdapter locationActivitySearchAdapter = this.searchAdapter;
            if (locationActivitySearchAdapter != null) {
                locationActivitySearchAdapter.setMyLocationDenied(this.locationDenied);
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
            LocationActivityAdapter locationActivityAdapter2 = this.adapter;
            if (locationActivityAdapter2 != null) {
                locationActivityAdapter2.setMyLocationDenied(true, false);
            }
            LocationActivitySearchAdapter locationActivitySearchAdapter2 = this.searchAdapter;
            if (locationActivitySearchAdapter2 != null) {
                locationActivitySearchAdapter2.setMyLocationDenied(this.locationDenied);
            }
        }
        fixLayoutInternal(true);
        this.searchItem.setVisibility(((this.locationDenied && !this.parentAlert.isStoryLocationPicker) || this.parentAlert.isBizLocationPicker) ? 8 : 0);
    }

    @Override
    public void onResume() {
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
    public void onShow(ChatAttachAlert.AttachAlertLayout attachAlertLayout) {
        this.parentAlert.actionBar.setTitle(LocaleController.getString(R.string.ShareLocation));
        if (this.mapView.getView().getParent() == null) {
            this.mapViewClip.addView(this.mapView.getView(), 0, LayoutHelper.createFrame(-1, this.overScrollHeight + AndroidUtilities.dp(10.0f), 51));
            this.mapViewClip.addView(this.overlayView, 1, LayoutHelper.createFrame(-1, this.overScrollHeight + AndroidUtilities.dp(10.0f), 51));
            this.mapViewClip.addView(this.loadingMapView, 2, LayoutHelper.createFrame(-1, -1.0f));
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
        fixLayoutInternal(true);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ChatAttachAlertLocationLayout.m2165$r8$lambda$CY1fVoa049WHS9HDxsDB6k_Q6Q(this.f$0);
            }
        }, this.parentAlert.delegate.needEnterComment() ? 200L : 0L);
        this.layoutManager.scrollToPositionWithOffset(0, 0);
        updateClipView();
    }

    public static void m2165$r8$lambda$CY1fVoa049WHS9HDxsDB6k_Q6Q(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout) {
        int i;
        Activity parentActivity;
        String[] strArr;
        if (!chatAttachAlertLocationLayout.checkPermission || (i = Build.VERSION.SDK_INT) < 23 || (parentActivity = chatAttachAlertLocationLayout.getParentActivity()) == null) {
            return;
        }
        chatAttachAlertLocationLayout.checkPermission = false;
        if (parentActivity.checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") != 0) {
            ChatAttachAlert chatAttachAlert = chatAttachAlertLocationLayout.parentAlert;
            if (chatAttachAlert.isStoryLocationPicker && chatAttachAlert.storyLocationPickerPhotoFile != null && i >= 29) {
                strArr = new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"};
            } else {
                strArr = new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};
            }
            chatAttachAlertLocationLayout.askedForLocation = true;
            LocationActivityAdapter locationActivityAdapter = chatAttachAlertLocationLayout.adapter;
            if (locationActivityAdapter != null) {
                locationActivityAdapter.setMyLocationDenied(chatAttachAlertLocationLayout.locationDenied, true);
            }
            parentActivity.requestPermissions(strArr, 2);
            return;
        }
        if (i >= 29) {
            ChatAttachAlert chatAttachAlert2 = chatAttachAlertLocationLayout.parentAlert;
            if (!chatAttachAlert2.isStoryLocationPicker || chatAttachAlert2.storyLocationPickerPhotoFile == null || parentActivity.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                return;
            }
            chatAttachAlertLocationLayout.askedForLocation = true;
            LocationActivityAdapter locationActivityAdapter2 = chatAttachAlertLocationLayout.adapter;
            if (locationActivityAdapter2 != null) {
                locationActivityAdapter2.setMyLocationDenied(chatAttachAlertLocationLayout.locationDenied, true);
            }
            parentActivity.requestPermissions(new String[]{"android.permission.ACCESS_MEDIA_LOCATION"}, 211);
        }
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
                ChatAttachAlertLocationLayout.$r8$lambda$l9JXN4ny23benBlU64F2KUsnPaU(this.f$0);
            }

            @Override
            public void onAnimationProgress(float f) {
                ThemeDescription.ThemeDescriptionDelegate.CC.$default$onAnimationProgress(this, f);
            }
        };
        arrayList.add(new ThemeDescription(this.mapViewClip, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, Theme.key_dialogBackground));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, Theme.key_dialogScrollGlow));
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        arrayList.add(new ThemeDescription(actionBarMenuItem != null ? actionBarMenuItem.getSearchField() : null, ThemeDescription.FLAG_CURSORCOLOR, null, null, null, null, Theme.key_dialogTextBlack));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        ImageView imageView = this.emptyImageView;
        int i = ThemeDescription.FLAG_IMAGECOLOR;
        int i2 = Theme.key_dialogEmptyImage;
        arrayList.add(new ThemeDescription(imageView, i, null, null, null, null, i2));
        TextView textView = this.emptyTitleTextView;
        int i3 = ThemeDescription.FLAG_TEXTCOLOR;
        int i4 = Theme.key_dialogEmptyText;
        arrayList.add(new ThemeDescription(textView, i3, null, null, null, null, i4));
        arrayList.add(new ThemeDescription(this.emptySubtitleTextView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i4));
        ImageView imageView2 = this.locationButton;
        int i5 = ThemeDescription.FLAG_IMAGECOLOR | ThemeDescription.FLAG_CHECKTAG;
        int i6 = Theme.key_location_actionIcon;
        arrayList.add(new ThemeDescription(imageView2, i5, null, null, null, null, i6));
        ImageView imageView3 = this.locationButton;
        int i7 = ThemeDescription.FLAG_IMAGECOLOR | ThemeDescription.FLAG_CHECKTAG;
        int i8 = Theme.key_location_actionActiveIcon;
        arrayList.add(new ThemeDescription(imageView3, i7, null, null, null, null, i8));
        ImageView imageView4 = this.locationButton;
        int i9 = ThemeDescription.FLAG_BACKGROUNDFILTER;
        int i10 = Theme.key_location_actionBackground;
        arrayList.add(new ThemeDescription(imageView4, i9, null, null, null, null, i10));
        ImageView imageView5 = this.locationButton;
        int i11 = ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE;
        int i12 = Theme.key_location_actionPressedBackground;
        arrayList.add(new ThemeDescription(imageView5, i11, null, null, null, null, i12));
        arrayList.add(new ThemeDescription(this.mapTypeButton, 0, null, null, null, themeDescriptionDelegate, i6));
        arrayList.add(new ThemeDescription(this.mapTypeButton, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, i10));
        arrayList.add(new ThemeDescription(this.mapTypeButton, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, i12));
        arrayList.add(new ThemeDescription(this.searchAreaButton, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, i8));
        arrayList.add(new ThemeDescription(this.searchAreaButton, ThemeDescription.FLAG_BACKGROUNDFILTER, null, null, null, null, i10));
        arrayList.add(new ThemeDescription(this.searchAreaButton, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_DRAWABLESELECTEDSTATE, null, null, null, null, i12));
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
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG | ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE, new Class[]{SendLocationCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_location_sendLiveLocationBackground));
        int i13 = Theme.key_windowBackgroundWhiteGrayText3;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SendLocationCell.class}, new String[]{"accurateTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i13));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{SendLocationCell.class}, new String[]{"titleTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_location_sendLiveLocationText));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CHECKTAG, new Class[]{SendLocationCell.class}, new String[]{"titleTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_location_sendLocationText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationDirectionCell.class}, new String[]{"buttonTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_featuredStickers_buttonText));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE, new Class[]{LocationDirectionCell.class}, new String[]{"frameLayout"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_featuredStickers_addButton));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_DRAWABLESELECTEDSTATE | ThemeDescription.FLAG_USEBACKGROUNDDRAWABLE, new Class[]{LocationDirectionCell.class}, new String[]{"frameLayout"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_featuredStickers_addButtonPressed));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, Theme.key_windowBackgroundGrayShadow));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER | ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{ShadowSectionCell.class}, null, null, null, Theme.key_windowBackgroundGray));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{HeaderCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_dialogTextBlue2));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{LocationCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i13));
        int i14 = Theme.key_windowBackgroundWhiteBlackText;
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i14));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationCell.class}, new String[]{"addressTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i13));
        arrayList.add(new ThemeDescription(this.searchListView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{LocationCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i13));
        arrayList.add(new ThemeDescription(this.searchListView, 0, new Class[]{LocationCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i14));
        arrayList.add(new ThemeDescription(this.searchListView, 0, new Class[]{LocationCell.class}, new String[]{"addressTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i13));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SharingLiveLocationCell.class}, new String[]{"nameTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i14));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{SharingLiveLocationCell.class}, new String[]{"distanceTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i13));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationLoadingCell.class}, new String[]{"progressBar"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, Theme.key_progressCircle));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationLoadingCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i13));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationLoadingCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i13));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationPoweredCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i13));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_IMAGECOLOR, new Class[]{LocationPoweredCell.class}, new String[]{"imageView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i2));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LocationPoweredCell.class}, new String[]{"textView2"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, i4));
        return arrayList;
    }

    public static void $r8$lambda$l9JXN4ny23benBlU64F2KUsnPaU(ChatAttachAlertLocationLayout chatAttachAlertLocationLayout) {
        chatAttachAlertLocationLayout.mapTypeButton.setIconColor(chatAttachAlertLocationLayout.getThemedColor(Theme.key_location_actionIcon));
        chatAttachAlertLocationLayout.mapTypeButton.redrawPopup(chatAttachAlertLocationLayout.getThemedColor(Theme.key_actionBarDefaultSubmenuBackground));
        chatAttachAlertLocationLayout.mapTypeButton.setPopupItemsColor(chatAttachAlertLocationLayout.getThemedColor(Theme.key_actionBarDefaultSubmenuItemIcon), true);
        chatAttachAlertLocationLayout.mapTypeButton.setPopupItemsColor(chatAttachAlertLocationLayout.getThemedColor(Theme.key_actionBarDefaultSubmenuItem), false);
        if (chatAttachAlertLocationLayout.map != null) {
            if (chatAttachAlertLocationLayout.isActiveThemeDark()) {
                if (chatAttachAlertLocationLayout.currentMapStyleDark) {
                    return;
                }
                chatAttachAlertLocationLayout.currentMapStyleDark = true;
                chatAttachAlertLocationLayout.map.setMapStyle(ApplicationLoader.getMapsProvider().loadRawResourceStyle(ApplicationLoader.applicationContext, R.raw.mapstyle_night));
                return;
            }
            if (chatAttachAlertLocationLayout.currentMapStyleDark) {
                chatAttachAlertLocationLayout.currentMapStyleDark = false;
                chatAttachAlertLocationLayout.map.setMapStyle(null);
            }
        }
    }

    @Override
    public void onPanTransitionStart(boolean z, int i) {
        if (z) {
            this.adapter.animated = false;
        }
    }

    @Override
    public void onPanTransitionEnd() {
        LocationActivityAdapter locationActivityAdapter = this.adapter;
        ChatAttachAlert chatAttachAlert = this.parentAlert;
        locationActivityAdapter.animated = (chatAttachAlert == null || chatAttachAlert.isKeyboardVisible()) ? false : true;
    }
}
