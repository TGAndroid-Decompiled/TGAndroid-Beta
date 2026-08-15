package org.telegram.ui.Stories.recorder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.Pair;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.AdjustPanLayoutHelper;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.recyclerview.LinearSmoothScrollerCustom;

public abstract class GalleryListView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private static final MediaController.AlbumEntry draftsAlbum = new MediaController.AlbumEntry(-1, null, null);
    private final float ASPECT_RATIO;
    public final ActionBar actionBar;
    public boolean actionBarShown;
    private final AnimatedFloat actionBarT;
    public final Adapter adapter;
    private final Paint backgroundPaint;
    private final ButtonWithCounterView button1View;
    private final ButtonWithCounterView button2View;
    private final LinearLayout buttonsLayout;
    private boolean buttonsLayoutVisible;
    public final boolean collaging;
    private boolean containsDraftFolder;
    private boolean containsDrafts;
    private final int currentAccount;
    private final ArrayList drafts;
    private final TextView dropDown;
    private ArrayList dropDownAlbums;
    private final ActionBarMenuItem dropDownContainer;
    private final Drawable dropDownDrawable;
    public boolean firstLayout;
    private HeaderView headerView;
    public boolean ignoreScroll;
    private final KeyboardNotifier keyboardNotifier;
    public final GridLayoutManager layoutManager;
    public final RecyclerListView listView;
    private int maxCount;
    private boolean multipleOnClick;
    private Runnable onBackClickListener;
    private Utilities.Callback2 onSelectListener;
    private Utilities.Callback3 onSelectMultipleListener;
    public final boolean onlyCollaging;
    public final boolean onlyPhotos;
    public ArrayList photos;
    private final Theme.ResourcesProvider resourcesProvider;
    private final SearchAdapter searchAdapterImages;
    private final FrameLayout searchContainer;
    private final StickerEmptyView searchEmptyView;
    private final ActionBarMenuItem searchItem;
    private final GridLayoutManager searchLayoutManager;
    private final RecyclerListView searchListView;
    private final ImageView selectButton;
    public MediaController.AlbumEntry selectedAlbum;
    public final ArrayList selectedPhotos;
    private int shiftDp;

    protected void firstLayout() {
    }

    protected void onFullScreen(boolean z) {
    }

    protected void onScroll() {
    }

    public GalleryListView(int i, Context context, Theme.ResourcesProvider resourcesProvider, MediaController.AlbumEntry albumEntry, boolean z, float f, boolean z2, boolean z3) {
        super(context);
        Paint paint = new Paint(1);
        this.backgroundPaint = paint;
        this.shiftDp = -2;
        this.actionBarT = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.firstLayout = true;
        ArrayList arrayList = new ArrayList();
        this.drafts = arrayList;
        this.selectedPhotos = new ArrayList();
        this.ASPECT_RATIO = f;
        this.currentAccount = i;
        this.resourcesProvider = resourcesProvider;
        this.onlyPhotos = z;
        this.collaging = z2;
        this.onlyCollaging = z3;
        paint.setColor(-14737633);
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(-0.4f), 134217728);
        RecyclerListView recyclerListView = new RecyclerListView(context, resourcesProvider) {
            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (GalleryListView.this.ignoreScroll) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (GalleryListView.this.ignoreScroll) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            }
        };
        this.listView = recyclerListView;
        recyclerListView.setItemSelectorColorProvider(new GenericProvider() {
            @Override
            public final Object provide(Object obj) {
                return GalleryListView.lambda$new$0((Integer) obj);
            }
        });
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        recyclerListView.setAdapter(adapter);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 3) {
            @Override
            public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
                super.onLayoutChildren(recycler, state);
                GalleryListView galleryListView = GalleryListView.this;
                if (galleryListView.firstLayout) {
                    galleryListView.firstLayout = false;
                    galleryListView.firstLayout();
                }
            }
        };
        this.layoutManager = gridLayoutManager;
        recyclerListView.setLayoutManager(gridLayoutManager);
        recyclerListView.setFastScrollEnabled(1);
        recyclerListView.setFastScrollVisible(true);
        recyclerListView.getFastScroll().setAlpha(0.0f);
        gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i2) {
                return (i2 == 0 || i2 == 1 || i2 == GalleryListView.this.adapter.getItemCount() - 1) ? 3 : 1;
            }
        });
        recyclerListView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                int iDp = AndroidUtilities.dp(5.0f);
                rect.right = iDp;
                rect.bottom = iDp;
            }
        });
        recyclerListView.setClipToPadding(false);
        addView(recyclerListView, LayoutHelper.createFrame(-1, -1, 119));
        recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                this.f$0.lambda$new$1(view, i2);
            }
        });
        recyclerListView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i2) {
                return this.f$0.lambda$new$2(view, i2);
            }
        });
        recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                GalleryListView.this.onScroll();
                GalleryListView.this.invalidate();
            }
        });
        ActionBar actionBar = new ActionBar(context, resourcesProvider);
        this.actionBar = actionBar;
        actionBar.setBackgroundColor(-14737633);
        actionBar.setTitleColor(-1);
        actionBar.setAlpha(0.0f);
        actionBar.setVisibility(8);
        actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        actionBar.setItemsBackgroundColor(436207615, false);
        actionBar.setItemsColor(-1, false);
        actionBar.setItemsColor(-1, true);
        addView(actionBar, LayoutHelper.createFrame(-1, -2, 55));
        actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    if (GalleryListView.this.onBackClickListener != null) {
                        GalleryListView.this.onBackClickListener.run();
                    }
                } else if (i2 >= 10) {
                    GalleryListView galleryListView = GalleryListView.this;
                    galleryListView.selectAlbum((MediaController.AlbumEntry) galleryListView.dropDownAlbums.get(i2 - 10), false);
                }
            }
        });
        ActionBarMenu actionBarMenuCreateMenu = actionBar.createMenu();
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, actionBarMenuCreateMenu, 0, 0, resourcesProvider) {
            @Override
            public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(GalleryListView.this.dropDown.getText());
            }
        };
        this.dropDownContainer = actionBarMenuItem;
        actionBarMenuItem.setSubMenuOpenSide(1);
        actionBar.addView(actionBarMenuItem, 0, LayoutHelper.createFrame(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
        actionBarMenuItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$3(view);
            }
        });
        TextView textView = new TextView(context);
        this.dropDown = textView;
        textView.setImportantForAccessibility(2);
        textView.setGravity(3);
        textView.setSingleLine(true);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setTextColor(-1);
        textView.setTypeface(AndroidUtilities.bold());
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
        this.dropDownDrawable = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
        textView.setPadding(0, AndroidUtilities.statusBarHeight, AndroidUtilities.dp(10.0f), 0);
        actionBarMenuItem.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.searchContainer = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, LayoutHelper.createFrame(-1, -1, 119));
        RecyclerListView recyclerListView2 = new RecyclerListView(context, resourcesProvider);
        this.searchListView = recyclerListView2;
        GridLayoutManager gridLayoutManager2 = new GridLayoutManager(context, 3);
        this.searchLayoutManager = gridLayoutManager2;
        recyclerListView2.setLayoutManager(gridLayoutManager2);
        SearchAdapter searchAdapter = new SearchAdapter() {
            @Override
            protected void onLoadingUpdate(boolean z4) {
                if (GalleryListView.this.searchItem != null) {
                    GalleryListView.this.searchItem.setShowSearchProgress(z4);
                }
                GalleryListView.this.searchEmptyView.showProgress(z4, true);
            }

            @Override
            public void notifyDataSetChanged() {
                super.notifyDataSetChanged();
                if (TextUtils.isEmpty(this.query)) {
                    GalleryListView.this.searchEmptyView.setStickerType(11);
                    GalleryListView.this.searchEmptyView.title.setText(LocaleController.getString(R.string.SearchImagesType));
                } else {
                    GalleryListView.this.searchEmptyView.setStickerType(1);
                    GalleryListView.this.searchEmptyView.title.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.query));
                }
            }
        };
        this.searchAdapterImages = searchAdapter;
        recyclerListView2.setAdapter(searchAdapter);
        recyclerListView2.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                if (!GalleryListView.this.searchListView.scrollingByUser || GalleryListView.this.searchItem == null || GalleryListView.this.searchItem.getSearchField() == null) {
                    return;
                }
                AndroidUtilities.hideKeyboard(GalleryListView.this.searchItem.getSearchContainer());
            }
        });
        recyclerListView2.setClipToPadding(true);
        recyclerListView2.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                int iDp = AndroidUtilities.dp(4.0f);
                rect.top = 0;
                rect.bottom = iDp;
                rect.right = iDp;
                rect.left = iDp;
                if (recyclerView.getChildAdapterPosition(view) % 3 != 2) {
                    rect.right = 0;
                }
            }
        });
        frameLayout.addView(recyclerListView2, LayoutHelper.createFrame(-1, -1, 119));
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(context, resourcesProvider) {
            @Override
            public int getColumnsCount() {
                return 3;
            }
        };
        flickerLoadingView.setViewType(2);
        flickerLoadingView.setAlpha(0.0f);
        flickerLoadingView.setVisibility(8);
        frameLayout.addView(flickerLoadingView, LayoutHelper.createFrame(-1, -1, 119));
        StickerEmptyView stickerEmptyView = new StickerEmptyView(context, flickerLoadingView, 11, resourcesProvider);
        this.searchEmptyView = stickerEmptyView;
        stickerEmptyView.title.setTextSize(1, 16.0f);
        stickerEmptyView.title.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, resourcesProvider));
        stickerEmptyView.title.setTypeface(null);
        stickerEmptyView.title.setText(LocaleController.getString(R.string.SearchImagesType));
        this.keyboardNotifier = new KeyboardNotifier(this, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$new$4((Integer) obj);
            }
        });
        frameLayout.addView(stickerEmptyView, LayoutHelper.createFrame(-1, -1, 119));
        recyclerListView2.setEmptyView(stickerEmptyView);
        ActionBarMenuItem actionBarMenuItemSearchListener = actionBarMenuCreateMenu.addItem(0, R.drawable.outline_header_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new AnonymousClass12());
        this.searchItem = actionBarMenuItemSearchListener;
        actionBarMenuItemSearchListener.setVisibility(8);
        actionBarMenuItemSearchListener.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        recyclerListView2.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                this.f$0.lambda$new$5(view, i2);
            }
        });
        arrayList.clear();
        if (!z) {
            Iterator it = MessagesController.getInstance(i).getStoriesController().getDraftsController().drafts.iterator();
            while (it.hasNext()) {
                StoryEntry storyEntry = (StoryEntry) it.next();
                if (!storyEntry.isEdit && !storyEntry.isError) {
                    this.drafts.add(storyEntry);
                }
            }
        }
        if (z2) {
            this.selectButton = null;
            LinearLayout linearLayout = new LinearLayout(context);
            this.buttonsLayout = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
            linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(AndroidUtilities.navigationBarHeight > 0 ? 0.0f : 10.0f) + AndroidUtilities.navigationBarHeight);
            addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(AndroidUtilities.dp(32.0f));
            linearLayout.setVisibility(8);
            ButtonWithCounterView round = new ButtonWithCounterView(context, true, resourcesProvider).setRound();
            this.button1View = round;
            round.setText(LocaleController.formatPluralStringComma("StoriesCreate", 1), false);
            if (!z3) {
                linearLayout.addView(round, LayoutHelper.createLinear(-1, 48, 0.0f, 0.0f, 0.0f, 8.0f));
                round.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view) {
                        this.f$0.lambda$new$6(view);
                    }
                });
            }
            ButtonWithCounterView round2 = new ButtonWithCounterView(context, z3, resourcesProvider).setRound();
            this.button2View = round2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_collage);
            coloredImageSpan.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(0.66f));
            spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.StoriesCollage));
            round2.setText(spannableStringBuilder, false);
            linearLayout.addView(round2, LayoutHelper.createLinear(-1, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            round2.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$7(view);
                }
            });
        } else {
            this.buttonsLayout = null;
            this.button1View = null;
            this.button2View = null;
            ImageView imageView = new ImageView(context);
            this.selectButton = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.floating_check);
            imageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(56.0f), Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider)));
            ScaleStateListAnimator.apply(imageView, 0.1f, 1.5f);
            addView(imageView, LayoutHelper.createFrame(-2, -2.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$8(view);
                }
            });
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.7f);
            imageView.setScaleY(0.7f);
        }
        updateAlbumsDropDown();
        if (albumEntry != null && (albumEntry != draftsAlbum || this.drafts.size() > 0)) {
            this.selectedAlbum = albumEntry;
        } else {
            ArrayList arrayList2 = this.dropDownAlbums;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                this.selectedAlbum = MediaController.allMediaAlbumEntry;
            } else {
                this.selectedAlbum = (MediaController.AlbumEntry) this.dropDownAlbums.get(0);
            }
        }
        this.photos = getPhotoEntries(this.selectedAlbum);
        updateContainsDrafts();
        MediaController.AlbumEntry albumEntry2 = this.selectedAlbum;
        if (albumEntry2 == MediaController.allMediaAlbumEntry) {
            this.dropDown.setText(LocaleController.getString(R.string.ChatGallery));
        } else if (albumEntry2 == draftsAlbum) {
            this.dropDown.setText(LocaleController.getString(R.string.StoryDraftsAlbum));
        } else {
            this.dropDown.setText(albumEntry2.bucketName);
        }
    }

    public static Integer lambda$new$0(Integer num) {
        return 0;
    }

    public void lambda$new$1(View view, int i) {
        if (i < 2 || this.onSelectListener == null || !(view instanceof Cell)) {
            return;
        }
        Cell cell = (Cell) view;
        int size = i - 2;
        if (this.containsDraftFolder) {
            if (size == 0) {
                selectAlbum(draftsAlbum, true);
                return;
            }
            size = i - 3;
        } else if (this.containsDrafts) {
            if (size >= 0 && size < this.drafts.size()) {
                StoryEntry storyEntry = (StoryEntry) this.drafts.get(size);
                this.onSelectListener.run(storyEntry, storyEntry.isVideo ? prepareBlurredThumb(cell) : null);
                return;
            }
            size -= this.drafts.size();
        }
        if (size < 0 || size >= this.photos.size()) {
            return;
        }
        MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.photos.get(size);
        if (isMultiple()) {
            if (this.selectedPhotos.contains(photoEntry)) {
                this.selectedPhotos.remove(photoEntry);
            } else {
                if (this.selectedPhotos.size() + 1 > this.maxCount) {
                    int i2 = -this.shiftDp;
                    this.shiftDp = i2;
                    AndroidUtilities.shakeViewSpring(cell, i2);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                }
                this.selectedPhotos.add(photoEntry);
            }
            AndroidUtilities.updateVisibleRows(this.listView);
            updateSelectButtonVisible();
            return;
        }
        Utilities.Callback2 callback2 = this.onSelectListener;
        if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
            bitmapPrepareBlurredThumb = prepareBlurredThumb(cell);
        }
        callback2.run(photoEntry, bitmapPrepareBlurredThumb);
    }

    public boolean lambda$new$2(View view, int i) {
        boolean z = false;
        if (i >= 2 && this.onSelectListener != null && (view instanceof Cell)) {
            int size = i - 2;
            if (this.containsDraftFolder) {
                if (size == 0) {
                    return false;
                }
                size = i - 3;
            } else if (this.containsDrafts) {
                if (size >= 0 && size < this.drafts.size()) {
                    return false;
                }
                size -= this.drafts.size();
            }
            if (size >= 0 && size < this.photos.size()) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) this.photos.get(size);
                if (this.selectedPhotos.isEmpty() && !this.multipleOnClick) {
                    z = true;
                    if (this.selectedPhotos.contains(photoEntry)) {
                        this.selectedPhotos.remove(photoEntry);
                    } else {
                        if (this.selectedPhotos.size() + 1 > this.maxCount) {
                            int i2 = -this.shiftDp;
                            this.shiftDp = i2;
                            AndroidUtilities.shakeViewSpring(view, i2);
                            BotWebViewVibrationEffect.APP_ERROR.vibrate();
                            return true;
                        }
                        this.selectedPhotos.add(photoEntry);
                    }
                    AndroidUtilities.updateVisibleRows(this.listView);
                    updateSelectButtonVisible();
                }
            }
        }
        return z;
    }

    public void lambda$new$3(View view) {
        this.dropDownContainer.toggleSubMenu();
    }

    public void lambda$new$4(Integer num) {
        this.searchEmptyView.animate().translationY(((-num.intValue()) / 2.0f) + AndroidUtilities.dp(80.0f)).setDuration(250L).setInterpolator(AdjustPanLayoutHelper.keyboardInterpolator).start();
    }

    class AnonymousClass12 extends ActionBarMenuItem.ActionBarMenuItemSearchListener {
        private AnimatorSet animatorSet;

        AnonymousClass12() {
        }

        @Override
        public void onSearchCollapse() {
            AnimatorSet animatorSet = this.animatorSet;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ArrayList arrayList = new ArrayList();
            GalleryListView.this.dropDownContainer.setVisibility(0);
            ActionBarMenuItem actionBarMenuItem = GalleryListView.this.dropDownContainer;
            Property property = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem, (Property<ActionBarMenuItem, Float>) property, 1.0f));
            ActionBarMenuItem actionBarMenuItem2 = GalleryListView.this.dropDownContainer;
            Property property2 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem2, (Property<ActionBarMenuItem, Float>) property2, 1.0f));
            ActionBarMenuItem actionBarMenuItem3 = GalleryListView.this.dropDownContainer;
            Property property3 = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem3, (Property<ActionBarMenuItem, Float>) property3, 1.0f));
            final EditTextBoldCursor searchField = GalleryListView.this.searchItem.getSearchField();
            if (searchField != null) {
                arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property, 0.8f));
                arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property2, 0.8f));
                arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property3, 0.0f));
            }
            GalleryListView.this.listView.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(GalleryListView.this.listView, (Property<RecyclerListView, Float>) property3, 1.0f));
            GalleryListView.this.listView.setFastScrollVisible(true);
            arrayList.add(ObjectAnimator.ofFloat(GalleryListView.this.searchContainer, (Property<FrameLayout, Float>) property3, 0.0f));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$onSearchCollapse$0(valueAnimator);
                }
            });
            arrayList.add(valueAnimatorOfFloat);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.animatorSet = animatorSet2;
            animatorSet2.setDuration(320L);
            this.animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.animatorSet.playTogether(arrayList);
            this.animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    View view = searchField;
                    if (view != null) {
                        view.setVisibility(4);
                    }
                    GalleryListView.this.searchContainer.setVisibility(8);
                }
            });
            this.animatorSet.start();
        }

        public void lambda$onSearchCollapse$0(ValueAnimator valueAnimator) {
            GalleryListView.this.invalidate();
        }

        @Override
        public void onSearchExpand() {
            AnimatorSet animatorSet = this.animatorSet;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ArrayList arrayList = new ArrayList();
            ActionBarMenuItem actionBarMenuItem = GalleryListView.this.dropDownContainer;
            Property property = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem, (Property<ActionBarMenuItem, Float>) property, 0.8f));
            ActionBarMenuItem actionBarMenuItem2 = GalleryListView.this.dropDownContainer;
            Property property2 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem2, (Property<ActionBarMenuItem, Float>) property2, 0.8f));
            ActionBarMenuItem actionBarMenuItem3 = GalleryListView.this.dropDownContainer;
            Property property3 = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(actionBarMenuItem3, (Property<ActionBarMenuItem, Float>) property3, 0.0f));
            EditTextBoldCursor searchField = GalleryListView.this.searchItem.getSearchField();
            if (searchField != null) {
                searchField.setVisibility(0);
                searchField.setHandlesColor(-1);
                arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property3, 1.0f));
            }
            GalleryListView.this.searchContainer.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(GalleryListView.this.listView, (Property<RecyclerListView, Float>) property3, 0.0f));
            GalleryListView.this.listView.setFastScrollVisible(false);
            arrayList.add(ObjectAnimator.ofFloat(GalleryListView.this.searchContainer, (Property<FrameLayout, Float>) property3, 1.0f));
            GalleryListView.this.searchEmptyView.setVisibility(0);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    this.f$0.lambda$onSearchExpand$1(valueAnimator);
                }
            });
            arrayList.add(valueAnimatorOfFloat);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.animatorSet = animatorSet2;
            animatorSet2.setDuration(320L);
            this.animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.animatorSet.playTogether(arrayList);
            this.animatorSet.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    GalleryListView.this.dropDownContainer.setVisibility(8);
                    GalleryListView.this.listView.setVisibility(8);
                }
            });
            this.animatorSet.start();
        }

        public void lambda$onSearchExpand$1(ValueAnimator valueAnimator) {
            GalleryListView.this.invalidate();
        }

        @Override
        public void onTextChanged(EditText editText) {
            GalleryListView.this.searchAdapterImages.load(editText.getText().toString());
        }
    }

    public void lambda$new$5(View view, int i) {
        Utilities.Callback2 callback2;
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        if (actionBarMenuItem != null) {
            AndroidUtilities.hideKeyboard(actionBarMenuItem.getSearchContainer());
        }
        if (i < 0 || i >= this.searchAdapterImages.results.size() || (callback2 = this.onSelectListener) == null) {
            return;
        }
        callback2.run(this.searchAdapterImages.results.get(i), null);
    }

    public void lambda$new$6(View view) {
        if (this.buttonsLayout.getAlpha() < 0.25f) {
            return;
        }
        selectMultiple(false);
    }

    public void lambda$new$7(View view) {
        if (this.buttonsLayout.getAlpha() < 0.25f) {
            return;
        }
        selectMultiple(true);
    }

    public void lambda$new$8(View view) {
        selectMultiple(false);
    }

    public void setMultipleOnClick(boolean z) {
        if (this.multipleOnClick != z) {
            this.multipleOnClick = z;
            AndroidUtilities.updateVisibleRows(this.listView);
        }
    }

    public void setMaxCount(int i) {
        this.maxCount = i;
    }

    public boolean isMultiple() {
        return !this.selectedPhotos.isEmpty() || this.multipleOnClick;
    }

    public void allowSearch(boolean z) {
        this.searchItem.setVisibility(z ? 0 : 8);
    }

    private ArrayList getPhotoEntries(MediaController.AlbumEntry albumEntry) {
        if (albumEntry == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < albumEntry.photos.size(); i++) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i);
            if (!this.onlyPhotos || !photoEntry.isVideo) {
                arrayList.add(photoEntry);
            }
        }
        return arrayList;
    }

    public boolean onBackPressed() {
        ActionBarMenuItem actionBarMenuItem = this.searchItem;
        if (actionBarMenuItem == null || !actionBarMenuItem.isSearchFieldVisible()) {
            return false;
        }
        EditTextBoldCursor searchField = this.searchItem.getSearchField();
        if (this.keyboardNotifier.keyboardVisible()) {
            AndroidUtilities.hideKeyboard(searchField);
            return true;
        }
        this.actionBar.onSearchFieldVisibilityChanged(this.searchItem.toggleSearch(true));
        return true;
    }

    private void selectMultiple(boolean z) {
        if (this.onSelectMultipleListener == null || this.selectedPhotos.isEmpty()) {
            return;
        }
        if (this.selectedPhotos.size() == 1) {
            this.onSelectListener.run((MediaController.PhotoEntry) this.selectedPhotos.get(0), null);
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.selectedPhotos.iterator();
        while (it.hasNext()) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) it.next();
            arrayList.add((!photoEntry.isVideo || photoEntry.isLivePhoto()) ? null : prepareBlurredThumb(findCell(photoEntry)));
        }
        this.onSelectMultipleListener.run(Boolean.valueOf(z), new ArrayList(this.selectedPhotos), arrayList);
        this.selectedPhotos.clear();
        AndroidUtilities.updateVisibleRows(this.listView);
        updateSelectButtonVisible();
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        float pVar = top();
        boolean z = pVar <= ((float) Math.max(0, (AndroidUtilities.statusBarHeight + ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.dp(32.0f)));
        float f = this.actionBarT.set(z);
        float fLerp = AndroidUtilities.lerp(pVar, 0.0f, f);
        if (z != this.actionBarShown) {
            this.actionBarShown = z;
            onFullScreen(z);
            this.listView.getFastScroll().animate().alpha(this.actionBarShown ? 1.0f : 0.0f).start();
        }
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.setAlpha(f);
            int i = f <= 0.0f ? 8 : 0;
            if (this.actionBar.getVisibility() != i) {
                this.actionBar.setVisibility(i);
            }
        }
        HeaderView headerView = this.headerView;
        if (headerView != null) {
            headerView.setAlpha(1.0f - f);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, fLerp, getWidth(), getHeight() + AndroidUtilities.dp(14.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.backgroundPaint);
        canvas.save();
        canvas.clipRect(0.0f, fLerp, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public MediaController.AlbumEntry getSelectedAlbum() {
        return this.selectedAlbum;
    }

    @Override
    protected void onMeasure(int r9, int r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.GalleryListView.onMeasure(int, int):void");
    }

    public void updateSelectButtonVisible() {
        boolean zIsEmpty = this.selectedPhotos.isEmpty();
        final boolean z = !zIsEmpty;
        ImageView imageView = this.selectButton;
        if (imageView != null) {
            imageView.animate().alpha(!zIsEmpty ? 1.0f : 0.0f).scaleX(!zIsEmpty ? 1.0f : 0.7f).scaleY(zIsEmpty ? 0.7f : 1.0f).translationY(!zIsEmpty ? -AndroidUtilities.navigationBarHeight : AndroidUtilities.dp(8.0f)).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(320L).start();
        }
        if (this.buttonsLayout != null) {
            ButtonWithCounterView buttonWithCounterView = this.button1View;
            if (buttonWithCounterView != null) {
                buttonWithCounterView.setText(LocaleController.formatPluralStringComma("StoriesCreate", Math.max(1, this.selectedPhotos.size())), true);
            }
            this.buttonsLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(AndroidUtilities.navigationBarHeight > 0 ? 0.0f : 10.0f) + AndroidUtilities.navigationBarHeight);
            if (this.buttonsLayoutVisible != z) {
                this.buttonsLayoutVisible = z;
                this.buttonsLayout.setVisibility(0);
                this.buttonsLayout.animate().alpha(zIsEmpty ? 0.0f : 1.0f).translationY(zIsEmpty ? AndroidUtilities.dp(32.0f) : 0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(320L).setListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        if (z) {
                            return;
                        }
                        GalleryListView.this.buttonsLayout.setVisibility(8);
                    }
                }).start();
            }
        }
    }

    private Cell findCell(MediaController.PhotoEntry photoEntry) {
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            View childAt = this.listView.getChildAt(i);
            if (childAt instanceof Cell) {
                Cell cell = (Cell) childAt;
                if (cell.currentObject == photoEntry) {
                    return cell;
                }
            }
        }
        return null;
    }

    private Bitmap prepareBlurredThumb(Cell cell) {
        Bitmap bitmap;
        if (cell == null || (bitmap = cell.bitmap) == null || bitmap.isRecycled()) {
            return null;
        }
        return Utilities.stackBlurBitmapWithScaleFactor(bitmap, 6.0f);
    }

    public void setOnBackClickListener(Runnable runnable) {
        this.onBackClickListener = runnable;
    }

    public void setOnSelectListener(Utilities.Callback2<Object, Bitmap> callback2) {
        this.onSelectListener = callback2;
    }

    public void setOnSelectMultipleListener(Utilities.Callback3<Boolean, ArrayList<MediaController.PhotoEntry>, ArrayList<Bitmap>> callback3) {
        this.onSelectMultipleListener = callback3;
    }

    private void updateAlbumsDropDown() {
        AlbumButton albumButton;
        this.dropDownContainer.removeAllSubItems();
        final ArrayList<MediaController.AlbumEntry> arrayList = MediaController.allMediaAlbums;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.dropDownAlbums = arrayList2;
        Collections.sort(arrayList2, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return GalleryListView.lambda$updateAlbumsDropDown$9(arrayList, (MediaController.AlbumEntry) obj, (MediaController.AlbumEntry) obj2);
            }
        });
        if (!this.drafts.isEmpty()) {
            ArrayList arrayList3 = this.dropDownAlbums;
            arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, draftsAlbum);
        }
        if (this.dropDownAlbums.isEmpty()) {
            this.dropDown.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        this.dropDown.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.dropDownDrawable, (Drawable) null);
        int size = this.dropDownAlbums.size();
        for (int i = 0; i < size; i++) {
            final MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) this.dropDownAlbums.get(i);
            if (albumEntry == draftsAlbum) {
                albumButton = new AlbumButton(getContext(), albumEntry.coverPhoto, LocaleController.getString("StoryDraftsAlbum"), this.drafts.size(), this.resourcesProvider);
            } else {
                ArrayList photoEntries = getPhotoEntries(albumEntry);
                if (!photoEntries.isEmpty()) {
                    albumButton = new AlbumButton(getContext(), albumEntry.coverPhoto, albumEntry.bucketName, photoEntries.size(), this.resourcesProvider);
                }
            }
            this.dropDownContainer.getPopupLayout().addView(albumButton);
            albumButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$updateAlbumsDropDown$10(albumEntry, view);
                }
            });
        }
    }

    public static int lambda$updateAlbumsDropDown$9(ArrayList arrayList, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2) {
        int iIndexOf;
        int iIndexOf2;
        int i = albumEntry.bucketId;
        if (i == 0 && albumEntry2.bucketId != 0) {
            return -1;
        }
        if ((i == 0 || albumEntry2.bucketId != 0) && (iIndexOf = arrayList.indexOf(albumEntry)) <= (iIndexOf2 = arrayList.indexOf(albumEntry2))) {
            return iIndexOf < iIndexOf2 ? -1 : 0;
        }
        return 1;
    }

    public void lambda$updateAlbumsDropDown$10(MediaController.AlbumEntry albumEntry, View view) {
        selectAlbum(albumEntry, false);
        this.dropDownContainer.closeSubMenu();
    }

    public void selectAlbum(MediaController.AlbumEntry albumEntry, boolean z) {
        this.selectedAlbum = albumEntry;
        this.photos = getPhotoEntries(albumEntry);
        this.selectedPhotos.clear();
        updateContainsDrafts();
        MediaController.AlbumEntry albumEntry2 = this.selectedAlbum;
        if (albumEntry2 == MediaController.allMediaAlbumEntry) {
            this.dropDown.setText(LocaleController.getString(R.string.ChatGallery));
        } else if (albumEntry2 == draftsAlbum) {
            this.dropDown.setText(LocaleController.getString(R.string.StoryDraftsAlbum));
        } else {
            this.dropDown.setText(albumEntry2.bucketName);
        }
        this.adapter.notifyDataSetChanged();
        if (z) {
            LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(getContext(), 2);
            linearSmoothScrollerCustom.setTargetPosition(1);
            linearSmoothScrollerCustom.setOffset((-ActionBar.getCurrentActionBarHeight()) + AndroidUtilities.dp(16.0f));
            this.layoutManager.startSmoothScroll(linearSmoothScrollerCustom);
            return;
        }
        this.layoutManager.scrollToPositionWithOffset(1, (-ActionBar.getCurrentActionBarHeight()) + AndroidUtilities.dp(16.0f));
    }

    static class Cell extends FrameLayout {
        private static int allQueuesIndex;
        public Runnable accessibilityClick;
        public Runnable accessibilityLongClick;
        private CharSequence accessibilityText;
        private final boolean alwaysShowCheckbox;
        private float aspectRatio;
        private final Paint bgPaint;
        private Bitmap bitmap;
        private final Matrix bitmapMatrix;
        private final Paint bitmapPaint;
        public CheckBox2 checkBox;
        public FrameLayout checkBoxContainer;
        private final Path clipPath;
        private String currentKey;
        private Object currentObject;
        private StaticLayout draftLayout;
        private float draftLayoutLeft;
        private float draftLayoutWidth;
        private final TextPaint draftTextPaint;
        private boolean drawDurationPlay;
        private final Paint durationBackgroundPaint;
        private StaticLayout durationLayout;
        private float durationLayoutLeft;
        private float durationLayoutWidth;
        private final Drawable durationPlayDrawable;
        private final TextPaint durationTextPaint;
        private LinearGradient gradient;
        private final Matrix gradientMatrix;
        private final Paint gradientPaint;
        private Runnable loadingBitmap;
        private DispatchQueue myQueue;
        private final Paint paintUnderCheck;
        private final float[] radii;
        private boolean topLeft;
        private boolean topRight;
        private final Runnable unload;
        private static ArrayList allQueues = new ArrayList();
        private static final HashMap bitmapsUseCounts = new HashMap();
        private static final LruCache bitmapsCache = new LruCache(45) {
            @Override
            public void entryRemoved(boolean z, String str, Bitmap bitmap, Bitmap bitmap2) {
                if (bitmap.isRecycled() || Cell.bitmapsUseCounts.containsKey(str)) {
                    return;
                }
                bitmap.recycle();
            }
        };

        public Cell(Context context, Theme.ResourcesProvider resourcesProvider, float f, boolean z) {
            super(context);
            this.bitmapPaint = new Paint(3);
            Paint paint = new Paint(1);
            this.bgPaint = paint;
            this.gradientPaint = new Paint(1);
            this.bitmapMatrix = new Matrix();
            this.gradientMatrix = new Matrix();
            Paint paint2 = new Paint(1);
            this.durationBackgroundPaint = paint2;
            TextPaint textPaint = new TextPaint(1);
            this.durationTextPaint = textPaint;
            TextPaint textPaint2 = new TextPaint(1);
            this.draftTextPaint = textPaint2;
            this.unload = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$new$0();
                }
            };
            this.clipPath = new Path();
            this.radii = new float[8];
            this.paintUnderCheck = new Paint(1);
            this.aspectRatio = f;
            this.alwaysShowCheckbox = z;
            paint.setColor(285212671);
            paint2.setColor(1275068416);
            textPaint.setTypeface(AndroidUtilities.bold());
            textPaint.setTextSize(AndroidUtilities.dpf2(12.66f));
            textPaint.setColor(-1);
            textPaint2.setTextSize(AndroidUtilities.dp(11.33f));
            textPaint2.setColor(-1);
            this.durationPlayDrawable = context.getResources().getDrawable(R.drawable.play_mini_video).mutate();
            CheckBox2 checkBox2 = new CheckBox2(context, 24, resourcesProvider) {
                @Override
                public void invalidate() {
                    super.invalidate();
                    Cell.this.invalidate();
                }
            };
            this.checkBox = checkBox2;
            if (!z) {
                checkBox2.setDrawBackgroundAsArc(6);
            } else {
                checkBox2.setDrawBackgroundAsArc(7);
            }
            this.checkBox.setColor(Theme.key_chat_attachCheckBoxBackground, Theme.key_chat_attachPhotoBackground, Theme.key_chat_attachCheckBoxCheck);
            this.checkBox.getCheckBoxBase().setStrokeBackgroundColor(Theme.key_windowBackgroundWhiteBlackText);
            FrameLayout frameLayout = new FrameLayout(context);
            this.checkBoxContainer = frameLayout;
            frameLayout.addView(this.checkBox, LayoutHelper.createFrame(26, 26, 17));
            addView(this.checkBoxContainer, LayoutHelper.createFrame(36, 36.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
            this.checkBoxContainer.setVisibility(0);
            this.checkBoxContainer.setImportantForAccessibility(2);
            this.checkBox.setImportantForAccessibility(2);
            setWillNotDraw(false);
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            AndroidUtilities.cancelRunOnUIThread(this.unload);
            Object obj = this.currentObject;
            if (obj != null) {
                loadBitmap(obj);
            }
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            AndroidUtilities.runOnUIThread(this.unload, 250L);
        }

        public void lambda$new$0() {
            loadBitmap(null);
        }

        public void set(StoryEntry storyEntry, int i) {
            this.currentObject = storyEntry;
            boolean z = false;
            if (i > 0) {
                setDraft(false);
                setDuration(LocaleController.formatPluralString("StoryDrafts", i, new Object[0]));
                this.drawDurationPlay = false;
                this.accessibilityText = LocaleController.formatPluralString("StoryDrafts", i, new Object[0]);
            } else {
                if (storyEntry != null && storyEntry.isDraft) {
                    z = true;
                }
                setDraft(z);
                setDuration((storyEntry == null || !storyEntry.isVideo) ? null : AndroidUtilities.formatShortDuration((int) Math.max(0.0f, (storyEntry.duration * (storyEntry.right - storyEntry.left)) / 1000.0f)));
                if (storyEntry != null && storyEntry.isVideo) {
                    this.accessibilityText = LocaleController.getString(R.string.StoryDraft) + ", " + LocaleController.formatDuration((int) Math.max(0.0f, (storyEntry.duration * (storyEntry.right - storyEntry.left)) / 1000.0f));
                } else {
                    this.accessibilityText = LocaleController.getString(R.string.StoryDraft);
                }
            }
            loadBitmap(storyEntry);
        }

        public void set(MediaController.PhotoEntry photoEntry) {
            this.currentObject = photoEntry;
            setDuration((photoEntry == null || !photoEntry.isVideo || photoEntry.isLivePhoto()) ? null : AndroidUtilities.formatShortDuration(photoEntry.duration));
            setDraft(false);
            if (photoEntry == null) {
                this.accessibilityText = null;
            } else if (photoEntry.isVideo) {
                this.accessibilityText = LocaleController.getString(R.string.AttachVideo) + ", " + LocaleController.formatDuration(photoEntry.duration);
            } else {
                this.accessibilityText = LocaleController.getString(R.string.AttachPhoto);
            }
            loadBitmap(photoEntry);
            invalidate();
        }

        @Override
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            FrameLayout frameLayout = this.checkBoxContainer;
            if (frameLayout != null && frameLayout.getVisibility() == 0) {
                accessibilityNodeInfo.setClassName("android.widget.CheckBox");
                accessibilityNodeInfo.setCheckable(true);
                CheckBox2 checkBox2 = this.checkBox;
                accessibilityNodeInfo.setChecked(checkBox2 != null && checkBox2.isChecked());
            } else {
                accessibilityNodeInfo.setClassName("android.widget.ImageView");
            }
            accessibilityNodeInfo.setClickable(true);
            accessibilityNodeInfo.setEnabled(true);
            accessibilityNodeInfo.addAction(16);
            if (this.accessibilityLongClick != null) {
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.addAction(32);
            }
            CharSequence charSequence = this.accessibilityText;
            if (charSequence != null) {
                accessibilityNodeInfo.setContentDescription(charSequence);
            }
        }

        @Override
        public boolean performAccessibilityAction(int i, Bundle bundle) {
            Runnable runnable;
            Runnable runnable2;
            if (i == 16 && (runnable2 = this.accessibilityClick) != null) {
                runnable2.run();
                return true;
            }
            if (i == 32 && (runnable = this.accessibilityLongClick) != null) {
                runnable.run();
                return true;
            }
            return super.performAccessibilityAction(i, bundle);
        }

        public void setCheckbox(final boolean z, int i, boolean z2) {
            if (this.alwaysShowCheckbox) {
                z = true;
            }
            if (!z2) {
                this.checkBoxContainer.setVisibility(z ? 0 : 8);
            } else {
                this.checkBoxContainer.setVisibility(0);
                this.checkBox.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.7f).scaleY(z ? 1.0f : 0.7f).withEndAction(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$setCheckbox$1(z);
                    }
                }).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(320L).start();
            }
            if (i >= 0) {
                this.checkBox.setChecked(true, z2);
                this.checkBox.setNum(i);
            } else {
                this.checkBox.setChecked(false, z2);
            }
        }

        public void lambda$setCheckbox$1(boolean z) {
            if (z) {
                return;
            }
            this.checkBoxContainer.setVisibility(8);
        }

        private static Bitmap getBitmap(String str) {
            if (str == null) {
                return null;
            }
            Bitmap bitmap = (Bitmap) bitmapsCache.get(str);
            if (bitmap != null) {
                HashMap map = bitmapsUseCounts;
                Integer num = (Integer) map.get(str);
                map.put(str, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            }
            return bitmap;
        }

        private static void releaseBitmap(String str) {
            if (str == null) {
                return;
            }
            HashMap map = bitmapsUseCounts;
            Integer num = (Integer) map.get(str);
            if (num != null) {
                int iIntValue = num.intValue() - 1;
                Integer numValueOf = Integer.valueOf(iIntValue);
                if (iIntValue <= 0) {
                    map.remove(str);
                } else {
                    map.put(str, numValueOf);
                }
            }
        }

        private static void putBitmap(String str, Bitmap bitmap) {
            if (str == null || bitmap == null) {
                return;
            }
            bitmapsCache.put(str, bitmap);
            HashMap map = bitmapsUseCounts;
            Integer num = (Integer) map.get(str);
            if (num != null) {
                map.put(str, Integer.valueOf(num.intValue() + 1));
            } else {
                map.put(str, 1);
            }
        }

        private static void releaseAllBitmaps() {
            bitmapsUseCounts.clear();
            bitmapsCache.evictAll();
        }

        public static void cleanupQueues() throws InterruptedException {
            releaseAllBitmaps();
            for (int i = 0; i < allQueues.size(); i++) {
                ((DispatchQueue) allQueues.get(i)).cleanupQueue();
                ((DispatchQueue) allQueues.get(i)).recycle();
            }
            allQueues.clear();
        }

        private DispatchQueue getQueue() {
            DispatchQueue dispatchQueue = this.myQueue;
            if (dispatchQueue != null) {
                return dispatchQueue;
            }
            if (allQueues.size() < 4) {
                ArrayList arrayList = allQueues;
                DispatchQueue dispatchQueue2 = new DispatchQueue("gallery_load_" + allQueues.size());
                this.myQueue = dispatchQueue2;
                arrayList.add(dispatchQueue2);
            } else {
                int i = allQueuesIndex + 1;
                allQueuesIndex = i;
                if (i >= allQueues.size()) {
                    allQueuesIndex = 0;
                }
                this.myQueue = (DispatchQueue) allQueues.get(allQueuesIndex);
            }
            return this.myQueue;
        }

        private Pair getThumbnail(Object obj) {
            int[] iArr;
            File file;
            int i;
            Bitmap bitmapDecodeFile = null;
            colorsSync = null;
            colorsSync = null;
            colorsSync = null;
            int[] colorsSync = null;
            if (obj == null) {
                return null;
            }
            int iMin = (int) Math.min(AndroidUtilities.displaySize.x / 3.0f, AndroidUtilities.dp(330.0f));
            int i2 = (int) (iMin * this.aspectRatio);
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                readBitmap(photoEntry, options);
                StoryEntry.setupScale(options, iMin, i2);
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                options.inDither = true;
                options.inJustDecodeBounds = false;
                Bitmap bitmap = readBitmap(photoEntry, options);
                if (bitmap != null && bitmap.getHeight() / bitmap.getWidth() < this.aspectRatio) {
                    if (photoEntry.gradientTopColor == 0 && photoEntry.gradientBottomColor == 0 && !bitmap.isRecycled()) {
                        colorsSync = DominantColors.getColorsSync(true, bitmap, true);
                        photoEntry.gradientTopColor = colorsSync[0];
                        photoEntry.gradientBottomColor = colorsSync[1];
                    } else {
                        int i3 = photoEntry.gradientTopColor;
                        if (i3 != 0 && (i = photoEntry.gradientBottomColor) != 0) {
                            colorsSync = new int[]{i3, i};
                        }
                    }
                }
                iArr = colorsSync;
                bitmapDecodeFile = bitmap;
            } else if (!(obj instanceof StoryEntry) || (file = ((StoryEntry) obj).draftThumbFile) == null) {
                iArr = null;
            } else {
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(file.getPath(), options2);
                StoryEntry.setupScale(options2, iMin, i2);
                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                options2.inDither = true;
                options2.inJustDecodeBounds = false;
                bitmapDecodeFile = BitmapFactory.decodeFile(file.getPath(), options2);
                iArr = null;
            }
            return new Pair(bitmapDecodeFile, iArr);
        }

        private void loadBitmap(final Object obj) {
            final String strKey;
            if (obj == null) {
                releaseBitmap(this.currentKey);
                this.currentKey = null;
                this.bitmap = null;
                invalidate();
                return;
            }
            boolean z = obj instanceof MediaController.PhotoEntry;
            if (z) {
                strKey = key((MediaController.PhotoEntry) obj);
            } else if (obj instanceof StoryEntry) {
                strKey = "d" + ((StoryEntry) obj).draftId;
            } else {
                strKey = null;
            }
            if (TextUtils.equals(strKey, this.currentKey)) {
                return;
            }
            String str = this.currentKey;
            if (str != null) {
                this.bitmap = null;
                releaseBitmap(str);
                invalidate();
            }
            this.currentKey = strKey;
            this.gradientPaint.setShader(null);
            this.gradient = null;
            if (z) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                if (photoEntry.gradientTopColor != 0 && photoEntry.gradientBottomColor != 0) {
                    Paint paint = this.gradientPaint;
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{photoEntry.gradientTopColor, photoEntry.gradientBottomColor}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.gradient = linearGradient;
                    paint.setShader(linearGradient);
                    updateMatrix();
                }
            }
            Bitmap bitmap = getBitmap(strKey);
            this.bitmap = bitmap;
            if (bitmap != null) {
                invalidate();
                return;
            }
            if (this.loadingBitmap != null) {
                getQueue().cancelRunnable(this.loadingBitmap);
                this.loadingBitmap = null;
            }
            DispatchQueue queue = getQueue();
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$loadBitmap$3(obj, strKey);
                }
            };
            this.loadingBitmap = runnable;
            queue.postRunnable(runnable);
        }

        public void lambda$loadBitmap$3(Object obj, final String str) {
            final Pair thumbnail = getThumbnail(obj);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$loadBitmap$2(str, thumbnail);
                }
            });
        }

        public void lambda$loadBitmap$2(String str, Pair pair) {
            afterLoad(str, (Bitmap) pair.first, (int[]) pair.second);
        }

        private void afterLoad(String str, Bitmap bitmap, int[] iArr) {
            if (bitmap == null) {
                return;
            }
            putBitmap(str, bitmap);
            if (!TextUtils.equals(str, this.currentKey)) {
                releaseBitmap(str);
                return;
            }
            this.bitmap = bitmap;
            if (iArr == null) {
                this.gradientPaint.setShader(null);
                this.gradient = null;
            } else {
                Paint paint = this.gradientPaint;
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.gradient = linearGradient;
                paint.setShader(linearGradient);
            }
            updateMatrix();
            invalidate();
        }

        private void updateMatrix() {
            Bitmap bitmap;
            float measuredWidth;
            if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && (bitmap = this.bitmap) != null) {
                if (bitmap.getHeight() / this.bitmap.getWidth() > this.aspectRatio - 0.1f) {
                    measuredWidth = Math.max(getMeasuredWidth() / this.bitmap.getWidth(), getMeasuredHeight() / this.bitmap.getHeight());
                } else {
                    measuredWidth = getMeasuredWidth() / this.bitmap.getWidth();
                }
                this.bitmapMatrix.reset();
                this.bitmapMatrix.postScale(measuredWidth, measuredWidth);
                this.bitmapMatrix.postTranslate((getMeasuredWidth() - (this.bitmap.getWidth() * measuredWidth)) / 2.0f, (getMeasuredHeight() - (measuredWidth * this.bitmap.getHeight())) / 2.0f);
            }
            if (getMeasuredHeight() > 0) {
                this.gradientMatrix.reset();
                this.gradientMatrix.postScale(1.0f, getMeasuredHeight());
                LinearGradient linearGradient = this.gradient;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(this.gradientMatrix);
                }
            }
        }

        private Bitmap readBitmap(MediaController.PhotoEntry photoEntry, BitmapFactory.Options options) {
            if (photoEntry == null) {
                return null;
            }
            String str = photoEntry.thumbPath;
            if (str != null) {
                return BitmapFactory.decodeFile(str, options);
            }
            if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                return MediaStore.Video.Thumbnails.getThumbnail(getContext().getContentResolver(), photoEntry.imageId, 1, options);
            }
            return MediaStore.Images.Thumbnails.getThumbnail(getContext().getContentResolver(), photoEntry.imageId, 1, options);
        }

        private String key(MediaController.PhotoEntry photoEntry) {
            if (photoEntry == null) {
                return "";
            }
            String str = photoEntry.thumbPath;
            if (str != null) {
                return str;
            }
            if (photoEntry.isVideo && !photoEntry.isLivePhoto()) {
                return "" + photoEntry.imageId;
            }
            return photoEntry.path;
        }

        public void setRounding(boolean z, boolean z2) {
            this.topLeft = z;
            this.topRight = z2;
        }

        @Override
        public void draw(Canvas canvas) {
            boolean z;
            boolean z2 = true;
            if (this.topLeft || this.topRight) {
                canvas.save();
                this.clipPath.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                float[] fArr = this.radii;
                float fDp = this.topLeft ? AndroidUtilities.dp(6.0f) : 0.0f;
                fArr[1] = fDp;
                fArr[0] = fDp;
                float[] fArr2 = this.radii;
                float fDp2 = this.topRight ? AndroidUtilities.dp(6.0f) : 0.0f;
                fArr2[3] = fDp2;
                fArr2[2] = fDp2;
                this.clipPath.addRoundRect(rectF, this.radii, Path.Direction.CW);
                canvas.clipPath(this.clipPath);
                z = true;
            } else {
                z = false;
            }
            float progress = this.checkBox.getProgress() * AndroidUtilities.dp(12.66f);
            if (progress > 0.0f) {
                if (!z) {
                    canvas.save();
                }
                float width = (getWidth() - (progress * 2.0f)) / getWidth();
                this.paintUnderCheck.setColor(218103807);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.paintUnderCheck);
                canvas.scale(width, width, getWidth() / 2.0f, getHeight() / 2.0f);
                canvas.clipRect(0, 0, getWidth(), getHeight());
            } else {
                z2 = z;
            }
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.bgPaint);
            if (this.gradient != null) {
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.gradientPaint);
            }
            Bitmap bitmap = this.bitmap;
            if (bitmap != null && !bitmap.isRecycled()) {
                canvas.drawBitmap(this.bitmap, this.bitmapMatrix, this.bitmapPaint);
            }
            if (this.draftLayout != null) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f) + this.draftLayoutWidth + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(5.0f) + this.draftLayout.getHeight() + AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.durationBackgroundPaint);
                canvas.save();
                canvas.translate((rectF2.left + AndroidUtilities.dp(6.0f)) - this.draftLayoutLeft, rectF2.top + AndroidUtilities.dp(1.33f));
                this.draftLayout.draw(canvas);
                canvas.restore();
            }
            if (this.durationLayout != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(AndroidUtilities.dp(4.0f), ((getHeight() - AndroidUtilities.dp(4.0f)) - this.durationLayout.getHeight()) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f) + (this.drawDurationPlay ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(4.0f)) + this.durationLayoutWidth + AndroidUtilities.dp(5.0f), getHeight() - AndroidUtilities.dp(4.0f));
                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.durationBackgroundPaint);
                if (this.drawDurationPlay) {
                    this.durationPlayDrawable.setBounds((int) (rectF3.left + AndroidUtilities.dp(6.0f)), (int) (rectF3.centerY() - (AndroidUtilities.dp(8.0f) / 2)), (int) (rectF3.left + AndroidUtilities.dp(13.0f)), (int) (rectF3.centerY() + (AndroidUtilities.dp(8.0f) / 2)));
                    this.durationPlayDrawable.draw(canvas);
                }
                canvas.save();
                canvas.translate((rectF3.left + (this.drawDurationPlay ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(5.0f))) - this.durationLayoutLeft, rectF3.top + AndroidUtilities.dp(1.0f));
                this.durationLayout.draw(canvas);
                canvas.restore();
            }
            if (z2) {
                canvas.restore();
            }
            super.draw(canvas);
        }

        private void setDuration(String str) {
            if (!TextUtils.isEmpty(str)) {
                StaticLayout staticLayout = new StaticLayout(str, this.durationTextPaint, getMeasuredWidth() > 0 ? getMeasuredWidth() : AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.durationLayout = staticLayout;
                this.durationLayoutWidth = staticLayout.getLineCount() > 0 ? this.durationLayout.getLineWidth(0) : 0.0f;
                this.durationLayoutLeft = this.durationLayout.getLineCount() > 0 ? this.durationLayout.getLineLeft(0) : 0.0f;
            } else {
                this.durationLayout = null;
            }
            this.drawDurationPlay = true;
        }

        private void setDraft(boolean z) {
            if (z) {
                StaticLayout staticLayout = new StaticLayout(LocaleController.getString("StoryDraft"), this.draftTextPaint, getMeasuredWidth() > 0 ? getMeasuredWidth() : AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.draftLayout = staticLayout;
                this.draftLayoutWidth = staticLayout.getLineCount() > 0 ? this.draftLayout.getLineWidth(0) : 0.0f;
                this.draftLayoutLeft = this.draftLayout.getLineCount() > 0 ? this.draftLayout.getLineLeft(0) : 0.0f;
                return;
            }
            this.draftLayout = null;
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * this.aspectRatio), 1073741824));
            updateMatrix();
        }
    }

    private class EmptyView extends View {
        int height;

        public EmptyView(Context context) {
            super(context);
        }

        public void setHeight(int i) {
            this.height = i;
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size;
            int size2 = View.MeasureSpec.getSize(i);
            int i3 = this.height;
            if (i3 == -1) {
                if (GalleryListView.this.selectedAlbum == GalleryListView.draftsAlbum) {
                    size = GalleryListView.this.drafts.size();
                } else {
                    ArrayList arrayList = GalleryListView.this.photos;
                    if (arrayList != null) {
                        size = arrayList.size() + (GalleryListView.this.containsDraftFolder ? 1 : 0) + (GalleryListView.this.containsDrafts ? GalleryListView.this.drafts.size() : 0);
                    } else {
                        size = 0;
                    }
                }
                setMeasuredDimension(size2, Math.max(0, (AndroidUtilities.displaySize.y - AndroidUtilities.dp(62.0f)) - (((int) (((int) (size2 / GalleryListView.this.layoutManager.getSpanCount())) * GalleryListView.this.ASPECT_RATIO)) * ((int) Math.ceil(size / GalleryListView.this.layoutManager.getSpanCount())))));
                return;
            }
            setMeasuredDimension(size2, i3);
        }
    }

    private class HeaderView extends FrameLayout {
        public TextView textView;

        public HeaderView(Context context, boolean z) {
            super(context);
            setPadding(AndroidUtilities.dp(z ? 14.0f : 16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 16.0f);
            this.textView.setTextColor(-1);
            this.textView.setTypeface(AndroidUtilities.bold());
            this.textView.setText(GalleryListView.this.getTitle());
            addView(this.textView, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, z ? 32.0f : 0.0f, 0.0f));
        }
    }

    public String getTitle() {
        return LocaleController.getString(this.onlyPhotos ? R.string.AddImage : R.string.ChoosePhotoOrVideo);
    }

    class Adapter extends RecyclerListView.FastScrollAdapter {
        private Adapter() {
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 2;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View cell;
            if (i == 0) {
                GalleryListView galleryListView = GalleryListView.this;
                cell = galleryListView.new EmptyView(galleryListView.getContext());
            } else if (i == 1) {
                GalleryListView galleryListView2 = GalleryListView.this;
                GalleryListView galleryListView3 = GalleryListView.this;
                cell = galleryListView2.headerView = galleryListView3.new HeaderView(galleryListView3.getContext(), GalleryListView.this.onlyPhotos);
            } else {
                cell = new Cell(GalleryListView.this.getContext(), GalleryListView.this.resourcesProvider, GalleryListView.this.ASPECT_RATIO, GalleryListView.this.collaging);
            }
            return new RecyclerListView.Holder(cell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                ((EmptyView) viewHolder.itemView).setHeight(i == 0 ? GalleryListView.this.getPadding() : -1);
                return;
            }
            if (itemViewType == 2) {
                final Cell cell = (Cell) viewHolder.itemView;
                cell.setRounding(i == 2, i == 4);
                cell.accessibilityClick = new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onBindViewHolder$0(cell);
                    }
                };
                cell.accessibilityLongClick = new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onBindViewHolder$1(cell);
                    }
                };
                int size = i - 2;
                if (GalleryListView.this.containsDraftFolder) {
                    if (size == 0) {
                        cell.setCheckbox(false, -1, false);
                        cell.set((StoryEntry) GalleryListView.this.drafts.get(0), GalleryListView.this.drafts.size());
                        return;
                    }
                    size = i - 3;
                } else if (GalleryListView.this.containsDrafts) {
                    if (size < 0 || size >= GalleryListView.this.drafts.size()) {
                        size -= GalleryListView.this.drafts.size();
                    } else {
                        cell.setCheckbox(false, -1, false);
                        cell.set((StoryEntry) GalleryListView.this.drafts.get(size), 0);
                        return;
                    }
                }
                ArrayList arrayList = GalleryListView.this.photos;
                if (arrayList == null || size < 0 || size >= arrayList.size()) {
                    return;
                }
                final MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) GalleryListView.this.photos.get(size);
                cell.setCheckbox(GalleryListView.this.isMultiple(), GalleryListView.this.selectedPhotos.indexOf(photoEntry), cell.currentObject == photoEntry);
                cell.set(photoEntry);
                if (GalleryListView.this.collaging) {
                    cell.checkBoxContainer.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            this.f$0.lambda$onBindViewHolder$2(photoEntry, cell, view);
                        }
                    });
                }
            }
        }

        public void lambda$onBindViewHolder$0(Cell cell) {
            int childAdapterPosition = GalleryListView.this.listView.getChildAdapterPosition(cell);
            if (childAdapterPosition != -1) {
                GalleryListView.this.listView.clickItem(cell, childAdapterPosition);
            }
        }

        public void lambda$onBindViewHolder$1(Cell cell) {
            int childAdapterPosition = GalleryListView.this.listView.getChildAdapterPosition(cell);
            if (childAdapterPosition != -1) {
                GalleryListView.this.listView.longClickItem(cell, childAdapterPosition);
            }
        }

        public void lambda$onBindViewHolder$2(MediaController.PhotoEntry photoEntry, Cell cell, View view) {
            if (!GalleryListView.this.selectedPhotos.contains(photoEntry)) {
                if (GalleryListView.this.selectedPhotos.size() + 1 > GalleryListView.this.maxCount) {
                    GalleryListView galleryListView = GalleryListView.this;
                    AndroidUtilities.shakeViewSpring(cell, galleryListView.shiftDp = -galleryListView.shiftDp);
                    BotWebViewVibrationEffect.APP_ERROR.vibrate();
                    return;
                }
                GalleryListView.this.selectedPhotos.add(photoEntry);
            } else {
                GalleryListView.this.selectedPhotos.remove(photoEntry);
            }
            AndroidUtilities.updateVisibleRows(GalleryListView.this.listView);
            GalleryListView.this.updateSelectButtonVisible();
        }

        @Override
        public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            super.onViewAttachedToWindow(viewHolder);
            if (viewHolder.getItemViewType() == 2) {
                Cell cell = (Cell) viewHolder.itemView;
                if (cell.currentObject instanceof MediaController.PhotoEntry) {
                    cell.setCheckbox(GalleryListView.this.isMultiple(), GalleryListView.this.selectedPhotos.indexOf((MediaController.PhotoEntry) cell.currentObject), false);
                } else {
                    cell.setCheckbox(false, -1, false);
                }
            }
        }

        @Override
        public int getItemViewType(int i) {
            if (i == 0 || i == getItemCount() - 1) {
                return 0;
            }
            return i == 1 ? 1 : 2;
        }

        @Override
        public int getItemCount() {
            return getTotalItemsCount() + 3;
        }

        @Override
        public String getLetter(int i) {
            MediaController.PhotoEntry photoEntry;
            int size = i - 2;
            if (GalleryListView.this.containsDraftFolder) {
                if (size == 0) {
                    return null;
                }
                size = i - 3;
            } else if (GalleryListView.this.containsDrafts) {
                if (size < 0 || size >= GalleryListView.this.drafts.size()) {
                    size -= GalleryListView.this.drafts.size();
                } else {
                    return LocaleController.formatYearMont(((StoryEntry) GalleryListView.this.drafts.get(size)).draftDate / 1000, true);
                }
            }
            ArrayList arrayList = GalleryListView.this.photos;
            if (arrayList == null || size < 0 || size >= arrayList.size() || (photoEntry = (MediaController.PhotoEntry) GalleryListView.this.photos.get(size)) == null) {
                return null;
            }
            long j = photoEntry.dateTaken;
            if (Build.VERSION.SDK_INT <= 28) {
                j /= 1000;
            }
            return LocaleController.formatYearMont(j, true);
        }

        @Override
        public int getTotalItemsCount() {
            ArrayList arrayList = GalleryListView.this.photos;
            int size = arrayList == null ? 0 : arrayList.size();
            return GalleryListView.this.containsDraftFolder ? size + 1 : GalleryListView.this.containsDrafts ? size + GalleryListView.this.drafts.size() : size;
        }

        @Override
        public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            int totalItemsCount = getTotalItemsCount();
            int width = (int) (((int) (((recyclerListView.getWidth() - recyclerListView.getPaddingLeft()) - recyclerListView.getPaddingRight()) / GalleryListView.this.layoutManager.getSpanCount())) * GalleryListView.this.ASPECT_RATIO);
            int iCeil = (int) Math.ceil(totalItemsCount / GalleryListView.this.layoutManager.getSpanCount());
            float fLerp = (AndroidUtilities.lerp(0, Math.max(0, r2 - ((AndroidUtilities.displaySize.y - recyclerListView.getPaddingTop()) - recyclerListView.getPaddingBottom())), f) / (iCeil * width)) * iCeil;
            int iRound = Math.round(fLerp);
            iArr[0] = Math.max(0, GalleryListView.this.layoutManager.getSpanCount() * iRound) + 2;
            iArr[1] = recyclerListView.getPaddingTop() + ((int) ((fLerp - iRound) * width));
        }

        @Override
        public float getScrollProgress(RecyclerListView recyclerListView) {
            int totalItemsCount = getTotalItemsCount();
            return (Math.max(0, recyclerListView.computeVerticalScrollOffset() - GalleryListView.this.getPadding()) - recyclerListView.getPaddingTop()) / ((((int) Math.ceil(totalItemsCount / GalleryListView.this.layoutManager.getSpanCount())) * ((int) (((int) (((recyclerListView.getWidth() - recyclerListView.getPaddingLeft()) - recyclerListView.getPaddingRight()) / GalleryListView.this.layoutManager.getSpanCount())) * GalleryListView.this.ASPECT_RATIO))) - (AndroidUtilities.displaySize.y - recyclerListView.getPaddingTop()));
        }
    }

    public int getPadding() {
        return (int) (AndroidUtilities.displaySize.y * 0.35f);
    }

    public int top() {
        int padding;
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView == null || recyclerListView.getChildCount() <= 0) {
            padding = getPadding();
        } else {
            int iMin = Integer.MAX_VALUE;
            if (this.listView != null) {
                for (int i = 0; i < this.listView.getChildCount(); i++) {
                    View childAt = this.listView.getChildAt(i);
                    if (this.listView.getChildAdapterPosition(childAt) > 0) {
                        iMin = Math.min(iMin, (int) childAt.getY());
                    }
                }
            }
            padding = Math.max(0, Math.min(iMin, getHeight()));
        }
        RecyclerListView recyclerListView2 = this.listView;
        return recyclerListView2 == null ? padding : AndroidUtilities.lerp(0, padding, recyclerListView2.getAlpha());
    }

    @Override
    protected void onAttachedToWindow() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        super.onAttachedToWindow();
    }

    @Override
    protected void onDetachedFromWindow() throws InterruptedException {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
        Cell.cleanupQueues();
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.albumsDidLoad) {
            updateAlbumsDropDown();
            int i3 = 0;
            if (this.selectedAlbum != null) {
                while (true) {
                    if (i3 >= MediaController.allMediaAlbums.size()) {
                        break;
                    }
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i3);
                    int i4 = albumEntry.bucketId;
                    MediaController.AlbumEntry albumEntry2 = this.selectedAlbum;
                    if (i4 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                        this.selectedAlbum = albumEntry;
                        break;
                    }
                    i3++;
                }
            } else {
                ArrayList arrayList = this.dropDownAlbums;
                if (arrayList == null || arrayList.isEmpty()) {
                    this.selectedAlbum = MediaController.allMediaAlbumEntry;
                } else {
                    this.selectedAlbum = (MediaController.AlbumEntry) this.dropDownAlbums.get(0);
                }
            }
            this.photos = getPhotoEntries(this.selectedAlbum);
            this.selectedPhotos.clear();
            updateContainsDrafts();
            Adapter adapter = this.adapter;
            if (adapter != null) {
                adapter.notifyDataSetChanged();
                return;
            }
            return;
        }
        if (i == NotificationCenter.storiesDraftsUpdated) {
            updateDrafts();
        }
    }

    public void updateDrafts() {
        this.drafts.clear();
        if (!this.onlyPhotos) {
            Iterator it = MessagesController.getInstance(this.currentAccount).getStoriesController().getDraftsController().drafts.iterator();
            while (it.hasNext()) {
                StoryEntry storyEntry = (StoryEntry) it.next();
                if (!storyEntry.isEdit && !storyEntry.isError) {
                    this.drafts.add(storyEntry);
                }
            }
        }
        updateAlbumsDropDown();
        updateContainsDrafts();
        Adapter adapter = this.adapter;
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    private void updateContainsDrafts() {
        ArrayList arrayList;
        ArrayList arrayList2 = this.dropDownAlbums;
        boolean z = true;
        boolean z2 = arrayList2 != null && !arrayList2.isEmpty() && this.dropDownAlbums.get(0) == this.selectedAlbum && this.drafts.size() > 2;
        this.containsDraftFolder = z2;
        if (z2 || (this.selectedAlbum != draftsAlbum && ((arrayList = this.dropDownAlbums) == null || arrayList.isEmpty() || this.dropDownAlbums.get(0) != this.selectedAlbum))) {
            z = false;
        }
        this.containsDrafts = z;
    }

    class SearchAdapter extends RecyclerListView.SelectionAdapter {
        private TLRPC.User bot;
        private int currentReqId;
        private String lastOffset;
        private boolean loading;
        private Drawable loadingDrawable;
        public String query;
        public ArrayList results;
        private final Runnable searchRunnable;
        private boolean triedResolvingBot;
        public int type;

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        protected abstract void onLoadingUpdate(boolean z);

        private SearchAdapter() {
            this.results = new ArrayList();
            this.currentReqId = -1;
            this.loadingDrawable = new ColorDrawable(285212671);
            this.searchRunnable = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.loadInternal();
                }
            };
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RecyclerListView.Holder(new BackupImageView(GalleryListView.this.getContext()) {
                @Override
                protected void onMeasure(int i2, int i3) {
                    int size = View.MeasureSpec.getSize(i2);
                    setMeasuredDimension(size, size);
                }
            });
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            BackupImageView backupImageView = (BackupImageView) viewHolder.itemView;
            TLObject tLObject = (TLObject) this.results.get(i);
            if (tLObject instanceof TLRPC.Document) {
                backupImageView.setImage(ImageLocation.getForDocument((TLRPC.Document) tLObject), "200_200", this.loadingDrawable, (Object) null);
                return;
            }
            if (tLObject instanceof TLRPC.Photo) {
                TLRPC.Photo photo = (TLRPC.Photo) tLObject;
                backupImageView.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 320), photo), "200_200", this.loadingDrawable, (Object) null);
            } else {
                if (tLObject instanceof TLRPC.BotInlineResult) {
                    TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) tLObject;
                    TLRPC.WebDocument webDocument = botInlineResult.thumb;
                    if (webDocument != null) {
                        backupImageView.setImage(ImageLocation.getForPath(webDocument.url), "200_200", this.loadingDrawable, botInlineResult);
                        return;
                    } else {
                        backupImageView.clearImage();
                        return;
                    }
                }
                backupImageView.clearImage();
            }
        }

        @Override
        public int getItemCount() {
            return this.results.size();
        }

        public void load(String str) {
            if (!TextUtils.equals(this.query, str)) {
                if (this.currentReqId != -1) {
                    ConnectionsManager.getInstance(GalleryListView.this.currentAccount).cancelRequest(this.currentReqId, true);
                    this.currentReqId = -1;
                }
                this.loading = false;
                this.lastOffset = null;
            }
            this.query = str;
            AndroidUtilities.cancelRunOnUIThread(this.searchRunnable);
            if (TextUtils.isEmpty(str)) {
                this.results.clear();
                onLoadingUpdate(false);
                notifyDataSetChanged();
            } else {
                onLoadingUpdate(true);
                AndroidUtilities.runOnUIThread(this.searchRunnable, 1500L);
            }
        }

        public void loadInternal() {
            if (this.loading) {
                return;
            }
            this.loading = true;
            onLoadingUpdate(true);
            final MessagesController messagesController = MessagesController.getInstance(GalleryListView.this.currentAccount);
            String str = this.type == 1 ? messagesController.gifSearchBot : messagesController.imageSearchBot;
            if (this.bot == null) {
                TLObject userOrChat = messagesController.getUserOrChat(str);
                if (userOrChat instanceof TLRPC.User) {
                    this.bot = (TLRPC.User) userOrChat;
                }
            }
            TLRPC.User user = this.bot;
            if (user == null && !this.triedResolvingBot) {
                TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                tL_contacts_resolveUsername.username = str;
                this.currentReqId = ConnectionsManager.getInstance(GalleryListView.this.currentAccount).sendRequest(tL_contacts_resolveUsername, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$loadInternal$1(messagesController, tLObject, tL_error);
                    }
                });
            } else {
                if (user == null) {
                    return;
                }
                TLRPC.TL_messages_getInlineBotResults tL_messages_getInlineBotResults = new TLRPC.TL_messages_getInlineBotResults();
                tL_messages_getInlineBotResults.bot = messagesController.getInputUser(this.bot);
                String str2 = this.query;
                if (str2 == null) {
                    str2 = "";
                }
                tL_messages_getInlineBotResults.query = str2;
                tL_messages_getInlineBotResults.peer = new TLRPC.TL_inputPeerEmpty();
                String str3 = this.lastOffset;
                String str4 = str3 != null ? str3 : "";
                tL_messages_getInlineBotResults.offset = str4;
                final boolean zIsEmpty = TextUtils.isEmpty(str4);
                this.currentReqId = ConnectionsManager.getInstance(GalleryListView.this.currentAccount).sendRequest(tL_messages_getInlineBotResults, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$loadInternal$3(zIsEmpty, tLObject, tL_error);
                    }
                });
            }
        }

        public void lambda$loadInternal$1(final MessagesController messagesController, final TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$loadInternal$0(tLObject, messagesController);
                }
            });
        }

        public void lambda$loadInternal$0(TLObject tLObject, MessagesController messagesController) {
            this.triedResolvingBot = true;
            this.loading = false;
            if (tLObject instanceof TLRPC.TL_contacts_resolvedPeer) {
                TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
                messagesController.putUsers(tL_contacts_resolvedPeer.users, false);
                messagesController.putChats(tL_contacts_resolvedPeer.chats, false);
                MessagesStorage.getInstance(GalleryListView.this.currentAccount).putUsersAndChats(tL_contacts_resolvedPeer.users, tL_contacts_resolvedPeer.chats, true, true);
                loadInternal();
            }
        }

        public void lambda$loadInternal$3(final boolean z, final TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$loadInternal$2(tLObject, z);
                }
            });
        }

        public void lambda$loadInternal$2(TLObject tLObject, boolean z) {
            if (tLObject instanceof TLRPC.messages_BotResults) {
                TLRPC.messages_BotResults messages_botresults = (TLRPC.messages_BotResults) tLObject;
                this.lastOffset = messages_botresults.next_offset;
                if (z) {
                    this.results.clear();
                }
                for (int i = 0; i < messages_botresults.results.size(); i++) {
                    TLRPC.BotInlineResult botInlineResult = messages_botresults.results.get(i);
                    TLRPC.Document document = botInlineResult.document;
                    if (document != null) {
                        this.results.add(document);
                    } else {
                        TLRPC.Photo photo = botInlineResult.photo;
                        if (photo != null) {
                            this.results.add(photo);
                        } else if (botInlineResult.content != null) {
                            this.results.add(botInlineResult);
                        }
                    }
                }
                this.loading = false;
                onLoadingUpdate(false);
                notifyDataSetChanged();
            }
        }
    }
}
