package org.telegram.ui.Stories.recorder;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.MediaStore;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LruCache;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScrollerCustom;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Stories.recorder.GalleryListView;
public class GalleryListView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    private static final MediaController.AlbumEntry draftsAlbum = new MediaController.AlbumEntry(-1, null, null);
    private final ActionBar actionBar;
    private boolean actionBarShown;
    private final AnimatedFloat actionBarT;
    public final Adapter adapter;
    private final Paint backgroundPaint;
    private boolean containsDraftFolder;
    private boolean containsDrafts;
    private final int currentAccount;
    private final ArrayList<StoryEntry> drafts;
    private final TextView dropDown;
    private ArrayList<MediaController.AlbumEntry> dropDownAlbums;
    private final ActionBarMenuItem dropDownContainer;
    private final Drawable dropDownDrawable;
    public boolean firstLayout;
    private HeaderView headerView;
    public boolean ignoreScroll;
    public final GridLayoutManager layoutManager;
    public final RecyclerListView listView;
    private Runnable onBackClickListener;
    private Utilities.Callback2<Object, Bitmap> onSelectListener;
    public final boolean onlyPhotos;
    private Theme.ResourcesProvider resourcesProvider;
    public MediaController.AlbumEntry selectedAlbum;
    public ArrayList<MediaController.PhotoEntry> selectedPhotos;

    protected void firstLayout() {
    }

    protected void onFullScreen(boolean z) {
    }

    protected void onScroll() {
    }

    public GalleryListView(int i, Context context, Theme.ResourcesProvider resourcesProvider, MediaController.AlbumEntry albumEntry, boolean z) {
        super(context);
        Paint paint = new Paint(1);
        this.backgroundPaint = paint;
        this.actionBarT = new AnimatedFloat(this, 0L, 350L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.firstLayout = true;
        ArrayList<StoryEntry> arrayList = new ArrayList<>();
        this.drafts = arrayList;
        this.currentAccount = i;
        this.resourcesProvider = resourcesProvider;
        this.onlyPhotos = z;
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
                Integer lambda$new$0;
                lambda$new$0 = GalleryListView.lambda$new$0((Integer) obj);
                return lambda$new$0;
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
        recyclerListView.addItemDecoration(new RecyclerView.ItemDecoration(this) {
            @Override
            public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
                int dp = AndroidUtilities.dp(5.0f);
                rect.right = dp;
                rect.bottom = dp;
            }
        });
        recyclerListView.setClipToPadding(false);
        addView(recyclerListView, LayoutHelper.createFrame(-1, -1, 119));
        recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                GalleryListView.this.lambda$new$1(view, i2);
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
        ActionBarMenuItem actionBarMenuItem = new ActionBarMenuItem(context, actionBar.createMenu(), 0, 0, resourcesProvider) {
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
                GalleryListView.this.lambda$new$2(view);
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
        textView.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_arrow_drop_down).mutate();
        this.dropDownDrawable = mutate;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
        textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
        textView.setPadding(0, AndroidUtilities.statusBarHeight, AndroidUtilities.dp(10.0f), 0);
        actionBarMenuItem.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        arrayList.clear();
        if (!z) {
            arrayList.addAll(MessagesController.getInstance(i).getStoriesController().getDraftsController().drafts);
        }
        updateAlbumsDropDown();
        if (albumEntry != null && (albumEntry != draftsAlbum || arrayList.size() > 0)) {
            this.selectedAlbum = albumEntry;
        } else {
            ArrayList<MediaController.AlbumEntry> arrayList2 = this.dropDownAlbums;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                this.selectedAlbum = MediaController.allMediaAlbumEntry;
            } else {
                this.selectedAlbum = this.dropDownAlbums.get(0);
            }
        }
        this.selectedPhotos = getPhotoEntries(this.selectedAlbum);
        updateContainsDrafts();
        MediaController.AlbumEntry albumEntry2 = this.selectedAlbum;
        if (albumEntry2 == MediaController.allMediaAlbumEntry) {
            textView.setText(LocaleController.getString("ChatGallery", R.string.ChatGallery));
        } else if (albumEntry2 == draftsAlbum) {
            textView.setText(LocaleController.getString("StoryDraftsAlbum"));
        } else {
            textView.setText(albumEntry2.bucketName);
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
        int i2 = i - 2;
        if (this.containsDraftFolder) {
            if (i2 == 0) {
                selectAlbum(draftsAlbum, true);
                return;
            }
            i2--;
        } else if (this.containsDrafts) {
            if (i2 >= 0 && i2 < this.drafts.size()) {
                StoryEntry storyEntry = this.drafts.get(i2);
                this.onSelectListener.run(storyEntry, storyEntry.isVideo ? prepareBlurredThumb(cell) : null);
                return;
            }
            i2 -= this.drafts.size();
        }
        if (i2 < 0 || i2 >= this.selectedPhotos.size()) {
            return;
        }
        MediaController.PhotoEntry photoEntry = this.selectedPhotos.get(i2);
        this.onSelectListener.run(photoEntry, photoEntry.isVideo ? prepareBlurredThumb(cell) : null);
    }

    public void lambda$new$2(View view) {
        this.dropDownContainer.toggleSubMenu();
    }

    private ArrayList<MediaController.PhotoEntry> getPhotoEntries(MediaController.AlbumEntry albumEntry) {
        if (albumEntry == null) {
            return new ArrayList<>();
        }
        if (!this.onlyPhotos) {
            return albumEntry.photos;
        }
        ArrayList<MediaController.PhotoEntry> arrayList = new ArrayList<>();
        for (int i = 0; i < albumEntry.photos.size(); i++) {
            MediaController.PhotoEntry photoEntry = albumEntry.photos.get(i);
            if (!photoEntry.isVideo) {
                arrayList.add(photoEntry);
            }
        }
        return arrayList;
    }

    @Override
    protected void dispatchDraw(Canvas canvas) {
        float pVar = top();
        boolean z = pVar <= ((float) Math.max(0, (AndroidUtilities.statusBarHeight + ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.dp(32.0f)));
        float f = this.actionBarT.set(z);
        float lerp = AndroidUtilities.lerp(pVar, 0.0f, f);
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
        rectF.set(0.0f, lerp, getWidth(), getHeight() + AndroidUtilities.dp(14.0f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.backgroundPaint);
        canvas.save();
        canvas.clipRect(0.0f, lerp, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public MediaController.AlbumEntry getSelectedAlbum() {
        return this.selectedAlbum;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        float f;
        this.listView.setPinnedSectionOffsetY(AndroidUtilities.statusBarHeight + ActionBar.getCurrentActionBarHeight());
        this.listView.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.statusBarHeight + ActionBar.getCurrentActionBarHeight(), AndroidUtilities.dp(1.0f), AndroidUtilities.navigationBarHeight);
        this.dropDown.setPadding(0, AndroidUtilities.statusBarHeight, AndroidUtilities.dp(10.0f), 0);
        TextView textView = this.dropDown;
        if (!AndroidUtilities.isTablet()) {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                f = 18.0f;
                textView.setTextSize(f);
                super.onMeasure(i, i2);
            }
        }
        f = 20.0f;
        textView.setTextSize(f);
        super.onMeasure(i, i2);
    }

    private Bitmap prepareBlurredThumb(Cell cell) {
        Bitmap bitmap = cell.bitmap;
        if (bitmap == null || bitmap.isRecycled()) {
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

    private void updateAlbumsDropDown() {
        AlbumButton albumButton;
        this.dropDownContainer.removeAllSubItems();
        final ArrayList<MediaController.AlbumEntry> arrayList = MediaController.allMediaAlbums;
        ArrayList<MediaController.AlbumEntry> arrayList2 = new ArrayList<>(arrayList);
        this.dropDownAlbums = arrayList2;
        Collections.sort(arrayList2, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$updateAlbumsDropDown$3;
                lambda$updateAlbumsDropDown$3 = GalleryListView.lambda$updateAlbumsDropDown$3(arrayList, (MediaController.AlbumEntry) obj, (MediaController.AlbumEntry) obj2);
                return lambda$updateAlbumsDropDown$3;
            }
        });
        if (!this.drafts.isEmpty()) {
            ArrayList<MediaController.AlbumEntry> arrayList3 = this.dropDownAlbums;
            arrayList3.add(!arrayList3.isEmpty() ? 1 : 0, draftsAlbum);
        }
        if (this.dropDownAlbums.isEmpty()) {
            this.dropDown.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        this.dropDown.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.dropDownDrawable, (Drawable) null);
        int size = this.dropDownAlbums.size();
        for (int i = 0; i < size; i++) {
            final MediaController.AlbumEntry albumEntry = this.dropDownAlbums.get(i);
            if (albumEntry == draftsAlbum) {
                albumButton = new AlbumButton(getContext(), albumEntry.coverPhoto, LocaleController.getString("StoryDraftsAlbum"), this.drafts.size(), this.resourcesProvider);
            } else {
                ArrayList<MediaController.PhotoEntry> photoEntries = getPhotoEntries(albumEntry);
                if (!photoEntries.isEmpty()) {
                    albumButton = new AlbumButton(getContext(), albumEntry.coverPhoto, albumEntry.bucketName, photoEntries.size(), this.resourcesProvider);
                }
            }
            this.dropDownContainer.getPopupLayout().addView(albumButton);
            albumButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    GalleryListView.this.lambda$updateAlbumsDropDown$4(albumEntry, view);
                }
            });
        }
    }

    public static int lambda$updateAlbumsDropDown$3(ArrayList arrayList, MediaController.AlbumEntry albumEntry, MediaController.AlbumEntry albumEntry2) {
        int indexOf;
        int indexOf2;
        int i = albumEntry.bucketId;
        if (i != 0 || albumEntry2.bucketId == 0) {
            if ((i == 0 || albumEntry2.bucketId != 0) && (indexOf = arrayList.indexOf(albumEntry)) <= (indexOf2 = arrayList.indexOf(albumEntry2))) {
                return indexOf < indexOf2 ? -1 : 0;
            }
            return 1;
        }
        return -1;
    }

    public void lambda$updateAlbumsDropDown$4(MediaController.AlbumEntry albumEntry, View view) {
        selectAlbum(albumEntry, false);
        this.dropDownContainer.closeSubMenu();
    }

    public void selectAlbum(MediaController.AlbumEntry albumEntry, boolean z) {
        this.selectedAlbum = albumEntry;
        this.selectedPhotos = getPhotoEntries(albumEntry);
        updateContainsDrafts();
        MediaController.AlbumEntry albumEntry2 = this.selectedAlbum;
        if (albumEntry2 == MediaController.allMediaAlbumEntry) {
            this.dropDown.setText(LocaleController.getString("ChatGallery", R.string.ChatGallery));
        } else if (albumEntry2 == draftsAlbum) {
            this.dropDown.setText(LocaleController.getString("StoryDraftsAlbum"));
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

    public static class Cell extends View {
        private static int allQueuesIndex;
        private final Paint bgPaint;
        private Bitmap bitmap;
        private final Matrix bitmapMatrix;
        private final Paint bitmapPaint;
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
        private final float[] radii;
        private boolean topLeft;
        private boolean topRight;
        private final Runnable unload;
        private static ArrayList<DispatchQueue> allQueues = new ArrayList<>();
        private static final HashMap<String, Integer> bitmapsUseCounts = new HashMap<>();
        private static final LruCache<String, Bitmap> bitmapsCache = new LruCache<String, Bitmap>(45) {
            @Override
            public void entryRemoved(boolean z, String str, Bitmap bitmap, Bitmap bitmap2) {
                if (bitmap.isRecycled() || Cell.bitmapsUseCounts.containsKey(str)) {
                    return;
                }
                bitmap.recycle();
            }
        };

        public Cell(Context context) {
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
                    GalleryListView.Cell.this.lambda$new$0();
                }
            };
            this.clipPath = new Path();
            this.radii = new float[8];
            paint.setColor(285212671);
            paint2.setColor(1275068416);
            textPaint.setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            textPaint.setTextSize(AndroidUtilities.dpf2(12.66f));
            textPaint.setColor(-1);
            textPaint2.setTextSize(AndroidUtilities.dp(11.33f));
            textPaint2.setColor(-1);
            this.durationPlayDrawable = context.getResources().getDrawable(R.drawable.play_mini_video).mutate();
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
            } else {
                if (storyEntry != null && storyEntry.isDraft) {
                    z = true;
                }
                setDraft(z);
                setDuration((storyEntry == null || !storyEntry.isVideo) ? null : AndroidUtilities.formatShortDuration((int) Math.max(0.0f, (((float) storyEntry.duration) * (storyEntry.right - storyEntry.left)) / 1000.0f)));
            }
            loadBitmap(storyEntry);
        }

        public void set(MediaController.PhotoEntry photoEntry) {
            this.currentObject = photoEntry;
            setDuration((photoEntry == null || !photoEntry.isVideo) ? null : AndroidUtilities.formatShortDuration(photoEntry.duration));
            setDraft(false);
            loadBitmap(photoEntry);
            invalidate();
        }

        private static Bitmap getBitmap(String str) {
            if (str == null) {
                return null;
            }
            Bitmap bitmap = bitmapsCache.get(str);
            if (bitmap != null) {
                HashMap<String, Integer> hashMap = bitmapsUseCounts;
                Integer num = hashMap.get(str);
                hashMap.put(str, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            }
            return bitmap;
        }

        private static void releaseBitmap(String str) {
            HashMap<String, Integer> hashMap;
            Integer num;
            if (str == null || (num = (hashMap = bitmapsUseCounts).get(str)) == null) {
                return;
            }
            Integer valueOf = Integer.valueOf(num.intValue() - 1);
            if (valueOf.intValue() <= 0) {
                hashMap.remove(str);
            } else {
                hashMap.put(str, valueOf);
            }
        }

        private static void putBitmap(String str, Bitmap bitmap) {
            if (str == null || bitmap == null) {
                return;
            }
            bitmapsCache.put(str, bitmap);
            HashMap<String, Integer> hashMap = bitmapsUseCounts;
            Integer num = hashMap.get(str);
            if (num != null) {
                hashMap.put(str, Integer.valueOf(num.intValue() + 1));
            } else {
                hashMap.put(str, 1);
            }
        }

        private static void releaseAllBitmaps() {
            bitmapsUseCounts.clear();
            bitmapsCache.evictAll();
        }

        public static void cleanupQueues() {
            releaseAllBitmaps();
            for (int i = 0; i < allQueues.size(); i++) {
                allQueues.get(i).cleanupQueue();
                allQueues.get(i).recycle();
            }
            allQueues.clear();
        }

        private DispatchQueue getQueue() {
            DispatchQueue dispatchQueue = this.myQueue;
            if (dispatchQueue != null) {
                return dispatchQueue;
            }
            if (allQueues.size() < 4) {
                ArrayList<DispatchQueue> arrayList = allQueues;
                DispatchQueue dispatchQueue2 = new DispatchQueue("gallery_load_" + allQueues.size());
                this.myQueue = dispatchQueue2;
                arrayList.add(dispatchQueue2);
            } else {
                int i = allQueuesIndex + 1;
                allQueuesIndex = i;
                if (i >= allQueues.size()) {
                    allQueuesIndex = 0;
                }
                this.myQueue = allQueues.get(allQueuesIndex);
            }
            return this.myQueue;
        }

        private Pair<Bitmap, int[]> getThumbnail(Object obj) {
            int[] iArr;
            File file;
            int i;
            Bitmap bitmap = null;
            r0 = null;
            r0 = null;
            int[] iArr2 = null;
            if (obj == null) {
                return null;
            }
            int min = (int) Math.min(AndroidUtilities.displaySize.x / 3.0f, AndroidUtilities.dp(330.0f));
            int i2 = (int) (min * 1.39f);
            if (obj instanceof MediaController.PhotoEntry) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                BitmapFactory.Options options = new BitmapFactory.Options();
                options.inJustDecodeBounds = true;
                readBitmap(photoEntry, options);
                StoryEntry.setupScale(options, min, i2);
                options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                options.inDither = true;
                options.inJustDecodeBounds = false;
                Bitmap readBitmap = readBitmap(photoEntry, options);
                if (readBitmap != null && ((float) readBitmap.getHeight()) / ((float) readBitmap.getWidth()) < 1.39f) {
                    if (photoEntry.gradientTopColor == 0 && photoEntry.gradientBottomColor == 0 && readBitmap != null && !readBitmap.isRecycled()) {
                        iArr2 = DominantColors.getColorsSync(true, readBitmap, true);
                        photoEntry.gradientTopColor = iArr2[0];
                        photoEntry.gradientBottomColor = iArr2[1];
                    } else {
                        int i3 = photoEntry.gradientTopColor;
                        if (i3 != 0 && (i = photoEntry.gradientBottomColor) != 0) {
                            iArr2 = new int[]{i3, i};
                        }
                    }
                }
                iArr = iArr2;
                bitmap = readBitmap;
            } else if (!(obj instanceof StoryEntry) || (file = ((StoryEntry) obj).draftThumbFile) == null) {
                iArr = null;
            } else {
                BitmapFactory.Options options2 = new BitmapFactory.Options();
                options2.inJustDecodeBounds = true;
                BitmapFactory.decodeFile(file.getPath(), options2);
                StoryEntry.setupScale(options2, min, i2);
                options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                options2.inDither = true;
                options2.inJustDecodeBounds = false;
                bitmap = BitmapFactory.decodeFile(file.getPath(), options2);
                iArr = null;
            }
            return new Pair<>(bitmap, iArr);
        }

        private void loadBitmap(final Object obj) {
            final String str;
            if (obj == null) {
                releaseBitmap(this.currentKey);
                this.currentKey = null;
                this.bitmap = null;
                invalidate();
                return;
            }
            boolean z = obj instanceof MediaController.PhotoEntry;
            if (z) {
                str = key((MediaController.PhotoEntry) obj);
            } else if (obj instanceof StoryEntry) {
                str = "d" + ((StoryEntry) obj).draftId;
            } else {
                str = null;
            }
            if (TextUtils.equals(str, this.currentKey)) {
                return;
            }
            String str2 = this.currentKey;
            if (str2 != null) {
                this.bitmap = null;
                releaseBitmap(str2);
                invalidate();
            }
            this.currentKey = str;
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
            Bitmap bitmap = getBitmap(str);
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
                    GalleryListView.Cell.this.lambda$loadBitmap$2(obj, str);
                }
            };
            this.loadingBitmap = runnable;
            queue.postRunnable(runnable);
        }

        public void lambda$loadBitmap$2(Object obj, final String str) {
            final Pair<Bitmap, int[]> thumbnail = getThumbnail(obj);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    GalleryListView.Cell.this.lambda$loadBitmap$1(str, thumbnail);
                }
            });
        }

        public void lambda$loadBitmap$1(String str, Pair pair) {
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
                if (bitmap.getHeight() / this.bitmap.getWidth() > 1.29f) {
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
            if (photoEntry.isVideo) {
                return MediaStore.Video.Thumbnails.getThumbnail(getContext().getContentResolver(), photoEntry.imageId, 1, options);
            }
            return MediaStore.Images.Thumbnails.getThumbnail(getContext().getContentResolver(), photoEntry.imageId, 1, options);
        }

        private String key(MediaController.PhotoEntry photoEntry) {
            if (photoEntry == null) {
                return BuildConfig.APP_CENTER_HASH;
            }
            String str = photoEntry.thumbPath;
            if (str != null) {
                return str;
            }
            if (photoEntry.isVideo) {
                return BuildConfig.APP_CENTER_HASH + photoEntry.imageId;
            }
            return photoEntry.path;
        }

        public void setRounding(boolean z, boolean z2) {
            this.topLeft = z;
            this.topRight = z2;
        }

        @Override
        public void draw(Canvas canvas) {
            boolean z = true;
            if (this.topLeft || this.topRight) {
                canvas.save();
                this.clipPath.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                float[] fArr = this.radii;
                float dp = this.topLeft ? AndroidUtilities.dp(6.0f) : 0.0f;
                fArr[1] = dp;
                fArr[0] = dp;
                float[] fArr2 = this.radii;
                float dp2 = this.topRight ? AndroidUtilities.dp(6.0f) : 0.0f;
                fArr2[3] = dp2;
                fArr2[2] = dp2;
                this.clipPath.addRoundRect(rectF, this.radii, Path.Direction.CW);
                canvas.clipPath(this.clipPath);
            } else {
                z = false;
            }
            super.draw(canvas);
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
            if (z) {
                canvas.restore();
            }
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
            setMeasuredDimension(size, (int) (size * 1.39f));
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
            int i3;
            int size = View.MeasureSpec.getSize(i);
            int i4 = this.height;
            if (i4 == -1) {
                if (GalleryListView.this.selectedAlbum == GalleryListView.draftsAlbum) {
                    i3 = GalleryListView.this.drafts.size();
                } else {
                    ArrayList<MediaController.PhotoEntry> arrayList = GalleryListView.this.selectedPhotos;
                    if (arrayList != null) {
                        i3 = arrayList.size() + (GalleryListView.this.containsDraftFolder ? 1 : 0) + (GalleryListView.this.containsDrafts ? GalleryListView.this.drafts.size() : 0);
                    } else {
                        i3 = 0;
                    }
                }
                setMeasuredDimension(size, Math.max(0, (AndroidUtilities.displaySize.y - AndroidUtilities.dp(62.0f)) - (((int) (((int) (size / GalleryListView.this.layoutManager.getSpanCount())) * 1.39f)) * ((int) Math.ceil(i3 / GalleryListView.this.layoutManager.getSpanCount())))));
                return;
            }
            setMeasuredDimension(size, i4);
        }
    }

    private static class HeaderView extends TextView {
        public HeaderView(Context context, boolean z) {
            super(context);
            setTextSize(1, 16.0f);
            setTextColor(-1);
            setTypeface(AndroidUtilities.getTypeface(AndroidUtilities.TYPEFACE_ROBOTO_MEDIUM));
            setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(21.0f), AndroidUtilities.dp(10.0f));
            setText(LocaleController.getString(z ? R.string.AddImage : R.string.ChoosePhotoOrVideo));
        }
    }

    public class Adapter extends RecyclerListView.FastScrollAdapter {
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
                cell = new EmptyView(galleryListView.getContext());
            } else if (i == 1) {
                cell = GalleryListView.this.headerView = new HeaderView(GalleryListView.this.getContext(), GalleryListView.this.onlyPhotos);
            } else {
                cell = new Cell(GalleryListView.this.getContext());
            }
            return new RecyclerListView.Holder(cell);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == 0) {
                ((EmptyView) viewHolder.itemView).setHeight(i == 0 ? GalleryListView.this.getPadding() : -1);
            } else if (itemViewType == 2) {
                Cell cell = (Cell) viewHolder.itemView;
                cell.setRounding(i == 2, i == 4);
                int i2 = i - 2;
                if (GalleryListView.this.containsDraftFolder) {
                    if (i2 == 0) {
                        cell.set((StoryEntry) GalleryListView.this.drafts.get(0), GalleryListView.this.drafts.size());
                        return;
                    }
                    i2--;
                } else if (GalleryListView.this.containsDrafts) {
                    if (i2 < 0 || i2 >= GalleryListView.this.drafts.size()) {
                        i2 -= GalleryListView.this.drafts.size();
                    } else {
                        cell.set((StoryEntry) GalleryListView.this.drafts.get(i2), 0);
                        return;
                    }
                }
                ArrayList<MediaController.PhotoEntry> arrayList = GalleryListView.this.selectedPhotos;
                if (arrayList == null || i2 < 0 || i2 >= arrayList.size()) {
                    return;
                }
                cell.set(GalleryListView.this.selectedPhotos.get(i2));
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
            return getTotalItemsCount() + 2 + 1;
        }

        @Override
        public String getLetter(int i) {
            MediaController.PhotoEntry photoEntry;
            int i2 = i - 2;
            if (GalleryListView.this.containsDraftFolder) {
                if (i2 == 0) {
                    return null;
                }
                i2--;
            } else if (GalleryListView.this.containsDrafts) {
                if (i2 < 0 || i2 >= GalleryListView.this.drafts.size()) {
                    i2 -= GalleryListView.this.drafts.size();
                } else {
                    return LocaleController.formatYearMont(((StoryEntry) GalleryListView.this.drafts.get(i2)).draftDate / 1000, true);
                }
            }
            ArrayList<MediaController.PhotoEntry> arrayList = GalleryListView.this.selectedPhotos;
            if (arrayList == null || i2 < 0 || i2 >= arrayList.size() || (photoEntry = GalleryListView.this.selectedPhotos.get(i2)) == null) {
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
            ArrayList<MediaController.PhotoEntry> arrayList = GalleryListView.this.selectedPhotos;
            int size = arrayList == null ? 0 : arrayList.size();
            return GalleryListView.this.containsDraftFolder ? size + 1 : GalleryListView.this.containsDrafts ? size + GalleryListView.this.drafts.size() : size;
        }

        @Override
        public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            int totalItemsCount = getTotalItemsCount();
            int width = (int) (((int) (((recyclerListView.getWidth() - recyclerListView.getPaddingLeft()) - recyclerListView.getPaddingRight()) / GalleryListView.this.layoutManager.getSpanCount())) * 1.39f);
            int ceil = (int) Math.ceil(totalItemsCount / GalleryListView.this.layoutManager.getSpanCount());
            int i = ceil * width;
            float lerp = (AndroidUtilities.lerp(0, Math.max(0, i - ((AndroidUtilities.displaySize.y - recyclerListView.getPaddingTop()) - recyclerListView.getPaddingBottom())), f) / i) * ceil;
            int round = Math.round(lerp);
            iArr[0] = Math.max(0, GalleryListView.this.layoutManager.getSpanCount() * round) + 2;
            iArr[1] = recyclerListView.getPaddingTop() + ((int) ((lerp - round) * width));
        }

        @Override
        public float getScrollProgress(RecyclerListView recyclerListView) {
            return (Math.max(0, recyclerListView.computeVerticalScrollOffset() - GalleryListView.this.getPadding()) - recyclerListView.getPaddingTop()) / ((((int) Math.ceil(getTotalItemsCount() / GalleryListView.this.layoutManager.getSpanCount())) * ((int) (((int) (((recyclerListView.getWidth() - recyclerListView.getPaddingLeft()) - recyclerListView.getPaddingRight()) / GalleryListView.this.layoutManager.getSpanCount())) * 1.39f))) - (AndroidUtilities.displaySize.y - recyclerListView.getPaddingTop()));
        }
    }

    public int getPadding() {
        return (int) (AndroidUtilities.displaySize.y * 0.35f);
    }

    public int top() {
        RecyclerListView recyclerListView = this.listView;
        if (recyclerListView == null || recyclerListView.getChildCount() <= 0) {
            return getPadding();
        }
        int i = ConnectionsManager.DEFAULT_DATACENTER_ID;
        if (this.listView != null) {
            for (int i2 = 0; i2 < this.listView.getChildCount(); i2++) {
                View childAt = this.listView.getChildAt(i2);
                if (this.listView.getChildAdapterPosition(childAt) > 0) {
                    i = Math.min(i, (int) childAt.getY());
                }
            }
        }
        return Math.max(0, Math.min(i, getHeight()));
    }

    @Override
    protected void onAttachedToWindow() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        super.onAttachedToWindow();
    }

    @Override
    protected void onDetachedFromWindow() {
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
                ArrayList<MediaController.AlbumEntry> arrayList = this.dropDownAlbums;
                if (arrayList == null || arrayList.isEmpty()) {
                    this.selectedAlbum = MediaController.allMediaAlbumEntry;
                } else {
                    this.selectedAlbum = this.dropDownAlbums.get(0);
                }
            }
            this.selectedPhotos = getPhotoEntries(this.selectedAlbum);
            updateContainsDrafts();
            Adapter adapter = this.adapter;
            if (adapter != null) {
                adapter.notifyDataSetChanged();
            }
        } else if (i == NotificationCenter.storiesDraftsUpdated) {
            updateDrafts();
        }
    }

    public void updateDrafts() {
        this.drafts.clear();
        if (!this.onlyPhotos) {
            this.drafts.addAll(MessagesController.getInstance(this.currentAccount).getStoriesController().getDraftsController().drafts);
        }
        updateAlbumsDropDown();
        updateContainsDrafts();
        Adapter adapter = this.adapter;
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    private void updateContainsDrafts() {
        ArrayList<MediaController.AlbumEntry> arrayList;
        ArrayList<MediaController.AlbumEntry> arrayList2 = this.dropDownAlbums;
        boolean z = true;
        boolean z2 = arrayList2 != null && !arrayList2.isEmpty() && this.dropDownAlbums.get(0) == this.selectedAlbum && this.drafts.size() > 2;
        this.containsDraftFolder = z2;
        if (z2 || (this.selectedAlbum != draftsAlbum && ((arrayList = this.dropDownAlbums) == null || arrayList.isEmpty() || this.dropDownAlbums.get(0) != this.selectedAlbum))) {
            z = false;
        }
        this.containsDrafts = z;
    }
}
