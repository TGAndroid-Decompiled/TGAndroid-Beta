package org.telegram.ui.Stories.recorder;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
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
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.LruCache;
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
import com.google.android.gms.internal.mlkit_vision_common.zzko;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline1;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SvgHelper$SvgDrawable$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticLambda139;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenu;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.DialogCell;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.StickerEmptyView;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.bots.BotWebViewSheet$$ExternalSyntheticLambda2;
import org.telegram.ui.iv.RichEditor;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda20;
import org.telegram.ui.recyclerview.LinearSmoothScrollerCustom;

public abstract class GalleryListView extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final MediaController.AlbumEntry draftsAlbum = new MediaController.AlbumEntry(-1, null, null);
    public final float ASPECT_RATIO;
    public final ActionBar actionBar;
    public boolean actionBarShown;
    public final AnimatedFloat actionBarT;
    public final Adapter adapter;
    public final Paint backgroundPaint;
    public final ButtonWithCounterView button1View;
    public final LinearLayout buttonsLayout;
    public boolean buttonsLayoutVisible;
    public final boolean collaging;
    public boolean containsDraftFolder;
    public boolean containsDrafts;
    public final int currentAccount;
    public final ArrayList drafts;
    public final TextView dropDown;
    public ArrayList dropDownAlbums;
    public final AnonymousClass7 dropDownContainer;
    public final Drawable dropDownDrawable;
    public boolean firstLayout;
    public ActionBar.AnonymousClass8 headerView;
    public boolean ignoreScroll;
    public final KeyboardNotifier keyboardNotifier;
    public final AnonymousClass2 layoutManager;
    public final AnonymousClass1 listView;
    public int maxCount;
    public boolean multipleOnClick;
    public Runnable onBackClickListener;
    public Utilities.Callback2 onSelectListener;
    public Utilities.Callback3 onSelectMultipleListener;
    public final boolean onlyCollaging;
    public final boolean onlyPhotos;
    public ArrayList photos;
    public final DarkThemeResourceProvider resourcesProvider;
    public final AnonymousClass8 searchAdapterImages;
    public final FrameLayout searchContainer;
    public final StickerEmptyView searchEmptyView;
    public final ActionBarMenuItem searchItem;
    public final RecyclerListView searchListView;
    public final ImageView selectButton;
    public MediaController.AlbumEntry selectedAlbum;
    public final ArrayList selectedPhotos;
    public int shiftDp;

    public final class AnonymousClass10 extends RecyclerView.ItemDecoration {
        @Override
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            int iDp = AndroidUtilities.dp(4.0f);
            rect.top = 0;
            rect.bottom = iDp;
            rect.right = iDp;
            rect.left = iDp;
            if (recyclerView.getChildAdapterPosition(view) % 3 != 2) {
                rect.right = 0;
            }
        }
    }

    public final class AnonymousClass11 extends FlickerLoadingView {
        @Override
        public final int getColumnsCount() {
            return 3;
        }
    }

    public final class AnonymousClass12 extends ActionBarMenuItem.ActionBarMenuItemSearchListener {
        public AnimatorSet animatorSet;

        public AnonymousClass12() {
        }

        @Override
        public final void onSearchCollapse() {
            AnimatorSet animatorSet = this.animatorSet;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ArrayList arrayList = new ArrayList();
            GalleryListView galleryListView = GalleryListView.this;
            AnonymousClass7 anonymousClass7 = galleryListView.dropDownContainer;
            anonymousClass7.setVisibility(0);
            Property property = View.SCALE_X;
            arrayList.add(ObjectAnimator.ofFloat(anonymousClass7, (Property<AnonymousClass7, Float>) property, 1.0f));
            Property property2 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(anonymousClass7, (Property<AnonymousClass7, Float>) property2, 1.0f));
            Property property3 = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(anonymousClass7, (Property<AnonymousClass7, Float>) property3, 1.0f));
            EditTextBoldCursor searchField = galleryListView.searchItem.getSearchField();
            if (searchField != null) {
                arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property, 0.8f));
                arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property2, 0.8f));
                arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property3, 0.0f));
            }
            AnonymousClass1 anonymousClass1 = galleryListView.listView;
            anonymousClass1.setVisibility(0);
            arrayList.add(ObjectAnimator.ofFloat(anonymousClass1, (Property<AnonymousClass1, Float>) property3, 1.0f));
            anonymousClass1.setFastScrollVisible(true);
            arrayList.add(ObjectAnimator.ofFloat(galleryListView.searchContainer, (Property<FrameLayout, Float>) property3, 0.0f));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new GalleryListView$12$$ExternalSyntheticLambda0(this, 1));
            arrayList.add(valueAnimatorOfFloat);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.animatorSet = animatorSet2;
            animatorSet2.setDuration(320L);
            this.animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.animatorSet.playTogether(arrayList);
            this.animatorSet.addListener(new RichEditor.AnonymousClass1(17, this, searchField));
            this.animatorSet.start();
        }

        @Override
        public final void onSearchExpand() {
            AnimatorSet animatorSet = this.animatorSet;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            ArrayList arrayList = new ArrayList();
            GalleryListView galleryListView = GalleryListView.this;
            Property property = View.SCALE_X;
            AnonymousClass7 anonymousClass7 = galleryListView.dropDownContainer;
            arrayList.add(ObjectAnimator.ofFloat(anonymousClass7, (Property<AnonymousClass7, Float>) property, 0.8f));
            Property property2 = View.SCALE_Y;
            arrayList.add(ObjectAnimator.ofFloat(anonymousClass7, (Property<AnonymousClass7, Float>) property2, 0.8f));
            Property property3 = View.ALPHA;
            arrayList.add(ObjectAnimator.ofFloat(anonymousClass7, (Property<AnonymousClass7, Float>) property3, 0.0f));
            EditTextBoldCursor searchField = galleryListView.searchItem.getSearchField();
            if (searchField != null) {
                searchField.setVisibility(0);
                searchField.setHandlesColor(-1);
                arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property2, 1.0f));
                arrayList.add(ObjectAnimator.ofFloat(searchField, (Property<EditTextBoldCursor, Float>) property3, 1.0f));
            }
            FrameLayout frameLayout = galleryListView.searchContainer;
            frameLayout.setVisibility(0);
            AnonymousClass1 anonymousClass1 = galleryListView.listView;
            arrayList.add(ObjectAnimator.ofFloat(anonymousClass1, (Property<AnonymousClass1, Float>) property3, 0.0f));
            anonymousClass1.setFastScrollVisible(false);
            arrayList.add(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property3, 1.0f));
            galleryListView.searchEmptyView.setVisibility(0);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new GalleryListView$12$$ExternalSyntheticLambda0(this, 0));
            arrayList.add(valueAnimatorOfFloat);
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.animatorSet = animatorSet2;
            animatorSet2.setDuration(320L);
            this.animatorSet.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.animatorSet.playTogether(arrayList);
            this.animatorSet.addListener(new HintView2.AnonymousClass2(this, 4));
            this.animatorSet.start();
        }

        @Override
        public final void onTextChanged(EditText editText) {
            String string = editText.getText().toString();
            AnonymousClass8 anonymousClass8 = GalleryListView.this.searchAdapterImages;
            if (!TextUtils.equals(anonymousClass8.query, string)) {
                if (anonymousClass8.currentReqId != -1) {
                    ConnectionsManager.getInstance(GalleryListView.this.currentAccount).cancelRequest(anonymousClass8.currentReqId, true);
                    anonymousClass8.currentReqId = -1;
                }
                anonymousClass8.loading = false;
                anonymousClass8.lastOffset = null;
            }
            anonymousClass8.query = string;
            PreviewView$$ExternalSyntheticLambda12 previewView$$ExternalSyntheticLambda12 = anonymousClass8.searchRunnable;
            AndroidUtilities.cancelRunOnUIThread(previewView$$ExternalSyntheticLambda12);
            if (!TextUtils.isEmpty(string)) {
                anonymousClass8.onLoadingUpdate(true);
                AndroidUtilities.runOnUIThread(previewView$$ExternalSyntheticLambda12, 1500L);
            } else {
                anonymousClass8.results.clear();
                anonymousClass8.onLoadingUpdate(false);
                anonymousClass8.notifyDataSetChanged();
            }
        }
    }

    public final class AnonymousClass4 extends RecyclerView.ItemDecoration {
        @Override
        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
            int iDp = AndroidUtilities.dp(5.0f);
            rect.right = iDp;
            rect.bottom = iDp;
        }
    }

    public final class AnonymousClass8 extends SearchAdapter {
        public AnonymousClass8() {
            super();
        }

        @Override
        public final void notifyDataSetChanged() {
            super.notifyDataSetChanged();
            boolean zIsEmpty = TextUtils.isEmpty(this.query);
            GalleryListView galleryListView = GalleryListView.this;
            if (zIsEmpty) {
                galleryListView.searchEmptyView.setStickerType(11);
                galleryListView.searchEmptyView.title.setText(LocaleController.getString(R.string.SearchImagesType));
            } else {
                galleryListView.searchEmptyView.setStickerType(1);
                galleryListView.searchEmptyView.title.setText(LocaleController.formatString(R.string.NoResultFoundFor, this.query));
            }
        }

        @Override
        public final void onLoadingUpdate(boolean z) {
            GalleryListView galleryListView = GalleryListView.this;
            ActionBarMenuItem actionBarMenuItem = galleryListView.searchItem;
            if (actionBarMenuItem != null) {
                actionBarMenuItem.setShowSearchProgress(z);
            }
            galleryListView.searchEmptyView.showProgress(z, true);
        }
    }

    public final class Adapter extends RecyclerListView.FastScrollAdapter {
        public Adapter() {
        }

        @Override
        public final int getItemCount() {
            return getTotalItemsCount() + 3;
        }

        @Override
        public final int getItemViewType(int i) {
            if (i == 0 || i == getTotalItemsCount() + 2) {
                return 0;
            }
            return i == 1 ? 1 : 2;
        }

        @Override
        public final String getLetter(int i) {
            MediaController.PhotoEntry photoEntry;
            int size = i - 2;
            GalleryListView galleryListView = GalleryListView.this;
            if (galleryListView.containsDraftFolder) {
                if (size == 0) {
                    return null;
                }
                size = i - 3;
            } else if (galleryListView.containsDrafts) {
                if (size >= 0 && size < galleryListView.drafts.size()) {
                    return LocaleController.formatYearMont(((StoryEntry) galleryListView.drafts.get(size)).draftDate / 1000, true);
                }
                size -= galleryListView.drafts.size();
            }
            ArrayList arrayList = galleryListView.photos;
            if (arrayList == null || size < 0 || size >= arrayList.size() || (photoEntry = (MediaController.PhotoEntry) galleryListView.photos.get(size)) == null) {
                return null;
            }
            long j = photoEntry.dateTaken;
            if (Build.VERSION.SDK_INT <= 28) {
                j /= 1000;
            }
            return LocaleController.formatYearMont(j, true);
        }

        @Override
        public final void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            int totalItemsCount = getTotalItemsCount();
            float width = (recyclerListView.getWidth() - recyclerListView.getPaddingLeft()) - recyclerListView.getPaddingRight();
            GalleryListView galleryListView = GalleryListView.this;
            int spanCount = (int) (((int) (width / galleryListView.layoutManager.getSpanCount())) * galleryListView.ASPECT_RATIO);
            int iCeil = (int) Math.ceil(totalItemsCount / galleryListView.layoutManager.getSpanCount());
            int i = iCeil * spanCount;
            float fLerp = (AndroidUtilities.lerp(0, Math.max(0, i - ((AndroidUtilities.displaySize.y - recyclerListView.getPaddingTop()) - recyclerListView.getPaddingBottom())), f) / i) * iCeil;
            int iRound = Math.round(fLerp);
            iArr[0] = Math.max(0, galleryListView.layoutManager.getSpanCount() * iRound) + 2;
            iArr[1] = recyclerListView.getPaddingTop() + ((int) ((fLerp - iRound) * spanCount));
        }

        @Override
        public final float getScrollProgress(RecyclerListView recyclerListView) {
            int totalItemsCount = getTotalItemsCount();
            float width = (recyclerListView.getWidth() - recyclerListView.getPaddingLeft()) - recyclerListView.getPaddingRight();
            GalleryListView galleryListView = GalleryListView.this;
            return (Math.max(0, recyclerListView.computeVerticalScrollOffset() - galleryListView.getPadding()) - recyclerListView.getPaddingTop()) / ((((int) Math.ceil(totalItemsCount / galleryListView.layoutManager.getSpanCount())) * ((int) (((int) (width / galleryListView.layoutManager.getSpanCount())) * galleryListView.ASPECT_RATIO))) - (AndroidUtilities.displaySize.y - recyclerListView.getPaddingTop()));
        }

        @Override
        public final int getTotalItemsCount() {
            GalleryListView galleryListView = GalleryListView.this;
            ArrayList arrayList = galleryListView.photos;
            int size = arrayList == null ? 0 : arrayList.size();
            if (galleryListView.containsDraftFolder) {
                return size + 1;
            }
            return galleryListView.containsDrafts ? galleryListView.drafts.size() + size : size;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 2;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            GalleryListView galleryListView = GalleryListView.this;
            if (itemViewType == 0) {
                ((EmptyView) viewHolder.itemView).height = i == 0 ? galleryListView.getPadding() : -1;
                return;
            }
            if (itemViewType == 2) {
                Cell cell = (Cell) viewHolder.itemView;
                boolean z = i == 2;
                boolean z2 = i == 4;
                cell.topLeft = z;
                cell.topRight = z2;
                cell.accessibilityClick = new GalleryListView$Adapter$$ExternalSyntheticLambda0(this, cell, 0);
                cell.accessibilityLongClick = new GalleryListView$Adapter$$ExternalSyntheticLambda0(this, cell, 1);
                int size = i - 2;
                boolean z3 = galleryListView.containsDraftFolder;
                ArrayList arrayList = galleryListView.drafts;
                if (z3) {
                    if (size == 0) {
                        cell.setCheckbox(-1, false, false);
                        cell.set(arrayList.size(), (StoryEntry) arrayList.get(0));
                        return;
                    }
                    size = i - 3;
                } else if (galleryListView.containsDrafts) {
                    if (size >= 0 && size < arrayList.size()) {
                        cell.setCheckbox(-1, false, false);
                        cell.set(0, (StoryEntry) arrayList.get(size));
                        return;
                    }
                    size -= arrayList.size();
                }
                ArrayList arrayList2 = galleryListView.photos;
                if (arrayList2 == null || size < 0 || size >= arrayList2.size()) {
                    return;
                }
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) galleryListView.photos.get(size);
                ArrayList arrayList3 = galleryListView.selectedPhotos;
                cell.setCheckbox(arrayList3.indexOf(photoEntry), !arrayList3.isEmpty() || galleryListView.multipleOnClick, cell.currentObject == photoEntry);
                cell.currentObject = photoEntry;
                cell.setDuration((photoEntry == null || !photoEntry.isVideo || photoEntry.isLivePhoto()) ? null : AndroidUtilities.formatShortDuration(photoEntry.duration));
                cell.draftLayout = null;
                if (photoEntry == null) {
                    cell.accessibilityText = null;
                } else if (photoEntry.isVideo) {
                    StringBuilder sb = new StringBuilder();
                    zzko.m(R.string.AttachVideo, ", ", sb);
                    sb.append(LocaleController.formatDuration(photoEntry.duration));
                    cell.accessibilityText = sb.toString();
                } else {
                    cell.accessibilityText = LocaleController.getString(R.string.AttachPhoto);
                }
                cell.loadBitmap(photoEntry);
                cell.invalidate();
                if (galleryListView.collaging) {
                    cell.checkBoxContainer.setOnClickListener(new PaintView$$ExternalSyntheticLambda9(this, photoEntry, cell, 2));
                }
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View cell;
            GalleryListView galleryListView = GalleryListView.this;
            if (i == 0) {
                cell = galleryListView.new EmptyView(galleryListView.getContext());
            } else if (i == 1) {
                Context context = galleryListView.getContext();
                ActionBar.AnonymousClass8 anonymousClass8 = new ActionBar.AnonymousClass8(context, 9);
                boolean z = galleryListView.onlyPhotos;
                anonymousClass8.setPadding(AndroidUtilities.dp(z ? 14.0f : 16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(10.0f));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setTextColor(-1);
                textView.setTypeface(AndroidUtilities.bold());
                textView.setText(galleryListView.getTitle());
                anonymousClass8.addView(textView, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, z ? 32.0f : 0.0f, 0.0f));
                galleryListView.headerView = anonymousClass8;
                cell = anonymousClass8;
            } else {
                cell = new Cell(galleryListView.getContext(), galleryListView.resourcesProvider, galleryListView.ASPECT_RATIO, galleryListView.collaging);
            }
            return new RecyclerListView.Holder(cell);
        }

        @Override
        public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
            super.onViewAttachedToWindow(viewHolder);
            if (viewHolder.getItemViewType() == 2) {
                Cell cell = (Cell) viewHolder.itemView;
                Object obj = cell.currentObject;
                if (!(obj instanceof MediaController.PhotoEntry)) {
                    cell.setCheckbox(-1, false, false);
                    return;
                }
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                GalleryListView galleryListView = GalleryListView.this;
                cell.setCheckbox(galleryListView.selectedPhotos.indexOf(photoEntry), !galleryListView.selectedPhotos.isEmpty() || galleryListView.multipleOnClick, false);
            }
        }
    }

    public final class Cell extends FrameLayout {
        public static int allQueuesIndex;
        public GalleryListView$Adapter$$ExternalSyntheticLambda0 accessibilityClick;
        public GalleryListView$Adapter$$ExternalSyntheticLambda0 accessibilityLongClick;
        public String accessibilityText;
        public final boolean alwaysShowCheckbox;
        public final float aspectRatio;
        public final Paint bgPaint;
        public Bitmap bitmap;
        public final Matrix bitmapMatrix;
        public final Paint bitmapPaint;
        public final DialogCell.AnonymousClass3 checkBox;
        public final FrameLayout checkBoxContainer;
        public final Path clipPath;
        public String currentKey;
        public Object currentObject;
        public StaticLayout draftLayout;
        public float draftLayoutLeft;
        public float draftLayoutWidth;
        public final TextPaint draftTextPaint;
        public boolean drawDurationPlay;
        public final Paint durationBackgroundPaint;
        public StaticLayout durationLayout;
        public float durationLayoutLeft;
        public float durationLayoutWidth;
        public final Drawable durationPlayDrawable;
        public final TextPaint durationTextPaint;
        public LinearGradient gradient;
        public final Matrix gradientMatrix;
        public final Paint gradientPaint;
        public HintView2$$ExternalSyntheticLambda2 loadingBitmap;
        public DispatchQueue myQueue;
        public final Paint paintUnderCheck;
        public final float[] radii;
        public boolean topLeft;
        public boolean topRight;
        public final PreviewView$$ExternalSyntheticLambda12 unload;
        public static final ArrayList allQueues = new ArrayList();
        public static final HashMap bitmapsUseCounts = new HashMap();
        public static final AnonymousClass2 bitmapsCache = new AnonymousClass2(45);

        public final class AnonymousClass2 extends LruCache {
            @Override
            public final void entryRemoved(boolean z, Object obj, Object obj2, Object obj3) {
                String str = (String) obj;
                Bitmap bitmap = (Bitmap) obj2;
                if (bitmap.isRecycled() || Cell.bitmapsUseCounts.containsKey(str)) {
                    return;
                }
                bitmap.recycle();
            }
        }

        public Cell(Context context, DarkThemeResourceProvider darkThemeResourceProvider, float f, boolean z) {
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
            this.unload = new PreviewView$$ExternalSyntheticLambda12(this, 12);
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
            DialogCell.AnonymousClass3 anonymousClass3 = new DialogCell.AnonymousClass3(this, context, darkThemeResourceProvider);
            this.checkBox = anonymousClass3;
            if (z) {
                anonymousClass3.setDrawBackgroundAsArc(7);
            } else {
                anonymousClass3.setDrawBackgroundAsArc(6);
            }
            anonymousClass3.setColor(Theme.key_chat_attachCheckBoxBackground, Theme.key_chat_attachPhotoBackground, Theme.key_chat_attachCheckBoxCheck);
            anonymousClass3.getCheckBoxBase().setStrokeBackgroundColor(Theme.key_windowBackgroundWhiteBlackText);
            FrameLayout frameLayout = new FrameLayout(context);
            this.checkBoxContainer = frameLayout;
            frameLayout.addView(anonymousClass3, LayoutHelper.createFrame(26, 26, 17));
            addView(frameLayout, LayoutHelper.createFrame(36, 36.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
            frameLayout.setVisibility(0);
            frameLayout.setImportantForAccessibility(2);
            anonymousClass3.setImportantForAccessibility(2);
            setWillNotDraw(false);
        }

        public static void releaseBitmap(String str) {
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

        @Override
        public final void draw(Canvas canvas) {
            boolean z;
            Canvas canvas2;
            boolean z2 = true;
            if (this.topLeft || this.topRight) {
                canvas.save();
                Path path = this.clipPath;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                float fDp = this.topLeft ? AndroidUtilities.dp(6.0f) : 0.0f;
                float[] fArr = this.radii;
                fArr[1] = fDp;
                fArr[0] = fDp;
                float fDp2 = this.topRight ? AndroidUtilities.dp(6.0f) : 0.0f;
                fArr[3] = fDp2;
                fArr[2] = fDp2;
                path.addRoundRect(rectF, fArr, Path.Direction.CW);
                canvas.clipPath(path);
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
                Paint paint = this.paintUnderCheck;
                paint.setColor(218103807);
                canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
                canvas.scale(width, width, getWidth() / 2.0f, getHeight() / 2.0f);
                canvas.clipRect(0, 0, getWidth(), getHeight());
            } else {
                z2 = z;
            }
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.bgPaint);
            if (this.gradient != null) {
                canvas2 = canvas;
                canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.gradientPaint);
            } else {
                canvas2 = canvas;
            }
            Bitmap bitmap = this.bitmap;
            if (bitmap != null && !bitmap.isRecycled()) {
                canvas2.drawBitmap(this.bitmap, this.bitmapMatrix, this.bitmapPaint);
            }
            StaticLayout staticLayout = this.draftLayout;
            Paint paint2 = this.durationBackgroundPaint;
            if (staticLayout != null) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f) + this.draftLayoutWidth + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f) + this.draftLayout.getHeight() + AndroidUtilities.dp(5.0f));
                canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint2);
                canvas2.save();
                canvas2.translate((rectF2.left + AndroidUtilities.dp(6.0f)) - this.draftLayoutLeft, rectF2.top + AndroidUtilities.dp(1.33f));
                this.draftLayout.draw(canvas2);
                canvas2.restore();
            }
            if (this.durationLayout != null) {
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(AndroidUtilities.dp(4.0f), ((getHeight() - AndroidUtilities.dp(4.0f)) - this.durationLayout.getHeight()) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f) + (this.drawDurationPlay ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(4.0f)) + this.durationLayoutWidth + AndroidUtilities.dp(5.0f), getHeight() - AndroidUtilities.dp(4.0f));
                canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint2);
                if (this.drawDurationPlay) {
                    int iDp = (int) (rectF3.left + AndroidUtilities.dp(6.0f));
                    int iCenterY = (int) (rectF3.centerY() - (AndroidUtilities.dp(8.0f) / 2));
                    int iDp2 = (int) (rectF3.left + AndroidUtilities.dp(13.0f));
                    int iCenterY2 = (int) (rectF3.centerY() + (AndroidUtilities.dp(8.0f) / 2));
                    Drawable drawable = this.durationPlayDrawable;
                    drawable.setBounds(iDp, iCenterY, iDp2, iCenterY2);
                    drawable.draw(canvas2);
                }
                canvas2.save();
                canvas2.translate((rectF3.left + (this.drawDurationPlay ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(5.0f))) - this.durationLayoutLeft, rectF3.top + AndroidUtilities.dp(1.0f));
                this.durationLayout.draw(canvas2);
                canvas2.restore();
            }
            if (z2) {
                canvas2.restore();
            }
            super.draw(canvas);
        }

        public final DispatchQueue getQueue() {
            DispatchQueue dispatchQueue = this.myQueue;
            if (dispatchQueue != null) {
                return dispatchQueue;
            }
            ArrayList arrayList = allQueues;
            if (arrayList.size() < 4) {
                DispatchQueue dispatchQueue2 = new DispatchQueue("gallery_load_" + arrayList.size());
                this.myQueue = dispatchQueue2;
                arrayList.add(dispatchQueue2);
            } else {
                int i = allQueuesIndex + 1;
                allQueuesIndex = i;
                if (i >= arrayList.size()) {
                    allQueuesIndex = 0;
                }
                this.myQueue = (DispatchQueue) arrayList.get(allQueuesIndex);
            }
            return this.myQueue;
        }

        public final void loadBitmap(Object obj) {
            String str;
            Bitmap bitmap;
            int i = 2;
            if (obj == null) {
                releaseBitmap(this.currentKey);
                this.currentKey = null;
                this.bitmap = null;
                invalidate();
                return;
            }
            boolean z = obj instanceof MediaController.PhotoEntry;
            if (z) {
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                str = photoEntry.thumbPath;
                if (str == null) {
                    if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                        str = photoEntry.path;
                    } else {
                        str = "" + photoEntry.imageId;
                    }
                }
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
            Paint paint = this.gradientPaint;
            paint.setShader(null);
            this.gradient = null;
            if (z) {
                MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) obj;
                if (photoEntry2.gradientTopColor != 0 && photoEntry2.gradientBottomColor != 0) {
                    LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{photoEntry2.gradientTopColor, photoEntry2.gradientBottomColor}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                    this.gradient = linearGradient;
                    paint.setShader(linearGradient);
                    updateMatrix();
                }
            }
            if (str == null) {
                bitmap = null;
            } else {
                bitmap = (Bitmap) bitmapsCache.get(str);
                if (bitmap != null) {
                    HashMap map = bitmapsUseCounts;
                    Integer num = (Integer) map.get(str);
                    map.put(str, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
                }
            }
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
            HintView2$$ExternalSyntheticLambda2 hintView2$$ExternalSyntheticLambda2 = new HintView2$$ExternalSyntheticLambda2(this, obj, str, i);
            this.loadingBitmap = hintView2$$ExternalSyntheticLambda2;
            queue.postRunnable(hintView2$$ExternalSyntheticLambda2);
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            AndroidUtilities.cancelRunOnUIThread(this.unload);
            Object obj = this.currentObject;
            if (obj != null) {
                loadBitmap(obj);
            }
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            AndroidUtilities.runOnUIThread(this.unload, 250L);
        }

        @Override
        public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            FrameLayout frameLayout = this.checkBoxContainer;
            if (frameLayout == null || frameLayout.getVisibility() != 0) {
                accessibilityNodeInfo.setClassName("android.widget.ImageView");
            } else {
                accessibilityNodeInfo.setClassName("android.widget.CheckBox");
                accessibilityNodeInfo.setCheckable(true);
                DialogCell.AnonymousClass3 anonymousClass3 = this.checkBox;
                accessibilityNodeInfo.setChecked(anonymousClass3 != null && anonymousClass3.isChecked());
            }
            accessibilityNodeInfo.setClickable(true);
            accessibilityNodeInfo.setEnabled(true);
            accessibilityNodeInfo.addAction(16);
            if (this.accessibilityLongClick != null) {
                accessibilityNodeInfo.setLongClickable(true);
                accessibilityNodeInfo.addAction(32);
            }
            String str = this.accessibilityText;
            if (str != null) {
                accessibilityNodeInfo.setContentDescription(str);
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec((int) (size * this.aspectRatio), 1073741824));
            updateMatrix();
        }

        @Override
        public final boolean performAccessibilityAction(int i, Bundle bundle) {
            GalleryListView$Adapter$$ExternalSyntheticLambda0 galleryListView$Adapter$$ExternalSyntheticLambda0;
            GalleryListView$Adapter$$ExternalSyntheticLambda0 galleryListView$Adapter$$ExternalSyntheticLambda1;
            if (i == 16 && (galleryListView$Adapter$$ExternalSyntheticLambda1 = this.accessibilityClick) != null) {
                galleryListView$Adapter$$ExternalSyntheticLambda1.run();
                return true;
            }
            if (i != 32 || (galleryListView$Adapter$$ExternalSyntheticLambda0 = this.accessibilityLongClick) == null) {
                return super.performAccessibilityAction(i, bundle);
            }
            galleryListView$Adapter$$ExternalSyntheticLambda0.run();
            return true;
        }

        public final void set(int i, StoryEntry storyEntry) {
            this.currentObject = storyEntry;
            String shortDuration = null;
            if (i > 0) {
                this.draftLayout = null;
                setDuration(LocaleController.formatPluralString("StoryDrafts", i, new Object[0]));
                this.drawDurationPlay = false;
                this.accessibilityText = LocaleController.formatPluralString("StoryDrafts", i, new Object[0]);
            } else {
                if (storyEntry == null || !storyEntry.isDraft) {
                    this.draftLayout = null;
                } else {
                    StaticLayout staticLayout = new StaticLayout(LocaleController.getString("StoryDraft"), this.draftTextPaint, getMeasuredWidth() > 0 ? getMeasuredWidth() : AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                    this.draftLayout = staticLayout;
                    this.draftLayoutWidth = staticLayout.getLineCount() > 0 ? this.draftLayout.getLineWidth(0) : 0.0f;
                    this.draftLayoutLeft = this.draftLayout.getLineCount() > 0 ? this.draftLayout.getLineLeft(0) : 0.0f;
                }
                if (storyEntry != null && storyEntry.isVideo) {
                    shortDuration = AndroidUtilities.formatShortDuration((int) Math.max(0.0f, ((storyEntry.right - storyEntry.left) * storyEntry.duration) / 1000.0f));
                }
                setDuration(shortDuration);
                if (storyEntry == null || !storyEntry.isVideo) {
                    this.accessibilityText = LocaleController.getString(R.string.StoryDraft);
                } else {
                    int iMax = (int) Math.max(0.0f, ((storyEntry.right - storyEntry.left) * storyEntry.duration) / 1000.0f);
                    StringBuilder sb = new StringBuilder();
                    zzko.m(R.string.StoryDraft, ", ", sb);
                    sb.append(LocaleController.formatDuration(iMax));
                    this.accessibilityText = sb.toString();
                }
            }
            loadBitmap(storyEntry);
        }

        public final void setCheckbox(int i, boolean z, boolean z2) {
            if (this.alwaysShowCheckbox) {
                z = true;
            }
            FrameLayout frameLayout = this.checkBoxContainer;
            DialogCell.AnonymousClass3 anonymousClass3 = this.checkBox;
            if (z2) {
                frameLayout.setVisibility(0);
                OKLCH.m(anonymousClass3.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.7f).scaleY(z ? 1.0f : 0.7f).withEndAction(new FileLoader$$ExternalSyntheticLambda1(this, z, 17)), CubicBezierInterpolator.EASE_OUT_QUINT, 320L);
            } else {
                frameLayout.setVisibility(z ? 0 : 8);
            }
            if (i < 0) {
                anonymousClass3.setChecked(false, z2);
            } else {
                anonymousClass3.setChecked(true, z2);
                anonymousClass3.setNum(i);
            }
        }

        public final void setDuration(String str) {
            if (TextUtils.isEmpty(str)) {
                this.durationLayout = null;
            } else {
                StaticLayout staticLayout = new StaticLayout(str, this.durationTextPaint, getMeasuredWidth() > 0 ? getMeasuredWidth() : AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.durationLayout = staticLayout;
                this.durationLayoutWidth = staticLayout.getLineCount() > 0 ? this.durationLayout.getLineWidth(0) : 0.0f;
                this.durationLayoutLeft = this.durationLayout.getLineCount() > 0 ? this.durationLayout.getLineLeft(0) : 0.0f;
            }
            this.drawDurationPlay = true;
        }

        public final void updateMatrix() {
            Bitmap bitmap;
            if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && (bitmap = this.bitmap) != null) {
                float fMax = ((float) bitmap.getHeight()) / ((float) this.bitmap.getWidth()) > this.aspectRatio - 0.1f ? Math.max(getMeasuredWidth() / this.bitmap.getWidth(), getMeasuredHeight() / this.bitmap.getHeight()) : getMeasuredWidth() / this.bitmap.getWidth();
                Matrix matrix = this.bitmapMatrix;
                matrix.reset();
                matrix.postScale(fMax, fMax);
                matrix.postTranslate(SvgHelper$SvgDrawable$$ExternalSyntheticOutline0.m(fMax, this.bitmap.getWidth(), getMeasuredWidth(), 2.0f), SvgHelper$SvgDrawable$$ExternalSyntheticOutline0.m(fMax, this.bitmap.getHeight(), getMeasuredHeight(), 2.0f));
            }
            if (getMeasuredHeight() > 0) {
                Matrix matrix2 = this.gradientMatrix;
                matrix2.reset();
                matrix2.postScale(1.0f, getMeasuredHeight());
                LinearGradient linearGradient = this.gradient;
                if (linearGradient != null) {
                    linearGradient.setLocalMatrix(matrix2);
                }
            }
        }
    }

    public final class EmptyView extends View {
        public int height;

        public EmptyView(Context context) {
            super(context);
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int size;
            int size2 = View.MeasureSpec.getSize(i);
            int i3 = this.height;
            if (i3 != -1) {
                setMeasuredDimension(size2, i3);
                return;
            }
            GalleryListView galleryListView = GalleryListView.this;
            if (galleryListView.selectedAlbum == GalleryListView.draftsAlbum) {
                size = galleryListView.drafts.size();
            } else {
                ArrayList arrayList = galleryListView.photos;
                if (arrayList != null) {
                    size = arrayList.size() + (galleryListView.containsDraftFolder ? 1 : 0) + (galleryListView.containsDrafts ? galleryListView.drafts.size() : 0);
                } else {
                    size = 0;
                }
            }
            setMeasuredDimension(size2, Math.max(0, (AndroidUtilities.displaySize.y - AndroidUtilities.dp(62.0f)) - (((int) (((int) (size2 / galleryListView.layoutManager.getSpanCount())) * galleryListView.ASPECT_RATIO)) * ((int) Math.ceil(size / galleryListView.layoutManager.getSpanCount())))));
        }
    }

    public abstract class SearchAdapter extends RecyclerListView.SelectionAdapter {
        public TLRPC.User bot;
        public String lastOffset;
        public boolean loading;
        public String query;
        public boolean triedResolvingBot;
        public final ArrayList results = new ArrayList();
        public int currentReqId = -1;
        public final ColorDrawable loadingDrawable = new ColorDrawable(285212671);
        public final PreviewView$$ExternalSyntheticLambda12 searchRunnable = new PreviewView$$ExternalSyntheticLambda12(this, 13);

        public final class AnonymousClass1 extends BackupImageView {
            @Override
            public final void onMeasure(int i, int i2) {
                int size = View.MeasureSpec.getSize(i);
                setMeasuredDimension(size, size);
            }
        }

        public SearchAdapter() {
        }

        @Override
        public final int getItemCount() {
            return this.results.size();
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        public final void loadInternal() {
            if (this.loading) {
                return;
            }
            this.loading = true;
            onLoadingUpdate(true);
            int i = GalleryListView.this.currentAccount;
            MessagesController messagesController = MessagesController.getInstance(i);
            String str = messagesController.imageSearchBot;
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
                this.currentReqId = ConnectionsManager.getInstance(i).sendRequest(tL_contacts_resolveUsername, new StarGiftSheet$$ExternalSyntheticLambda0(29, this, messagesController));
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
                this.currentReqId = ConnectionsManager.getInstance(i).sendRequest(tL_messages_getInlineBotResults, new VoIPService$$ExternalSyntheticLambda139(this, TextUtils.isEmpty(str4), 2));
            }
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            BackupImageView backupImageView = (BackupImageView) viewHolder.itemView;
            TLObject tLObject = (TLObject) this.results.get(i);
            boolean z = tLObject instanceof TLRPC.Document;
            ColorDrawable colorDrawable = this.loadingDrawable;
            if (z) {
                backupImageView.setImage(ImageLocation.getForDocument((TLRPC.Document) tLObject), "200_200", colorDrawable, (Object) null);
                return;
            }
            if (tLObject instanceof TLRPC.Photo) {
                TLRPC.Photo photo = (TLRPC.Photo) tLObject;
                backupImageView.setImage(ImageLocation.getForPhoto(FileLoader.getClosestPhotoSizeWithSize(photo.sizes, 320), photo), "200_200", colorDrawable, (Object) null);
            } else {
                if (!(tLObject instanceof TLRPC.BotInlineResult)) {
                    backupImageView.clearImage();
                    return;
                }
                TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) tLObject;
                TLRPC.WebDocument webDocument = botInlineResult.thumb;
                if (webDocument != null) {
                    backupImageView.setImage(ImageLocation.getForPath(webDocument.url), "200_200", colorDrawable, botInlineResult);
                } else {
                    backupImageView.clearImage();
                }
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RecyclerListView.Holder(new AnonymousClass1(GalleryListView.this.getContext()));
        }

        public abstract void onLoadingUpdate(boolean z);
    }

    public GalleryListView(int i, Context context, DarkThemeResourceProvider darkThemeResourceProvider, MediaController.AlbumEntry albumEntry, boolean z, float f, boolean z2, boolean z3) {
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
        this.resourcesProvider = darkThemeResourceProvider;
        this.onlyPhotos = z;
        this.collaging = z2;
        this.onlyCollaging = z3;
        paint.setColor(-14737633);
        paint.setShadowLayer(AndroidUtilities.dp(2.33f), 0.0f, AndroidUtilities.dp(-0.4f), 134217728);
        ?? r4 = new RecyclerListView(context, darkThemeResourceProvider) {
            @Override
            public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                if (GalleryListView.this.ignoreScroll) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            }

            @Override
            public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (GalleryListView.this.ignoreScroll) {
                    return false;
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        };
        this.listView = r4;
        r4.setItemSelectorColorProvider(new BotWebViewSheet$$ExternalSyntheticLambda2(6));
        Adapter adapter = new Adapter();
        this.adapter = adapter;
        r4.setAdapter(adapter);
        ?? r5 = new GridLayoutManager() {
            @Override
            public final void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
                super.onLayoutChildren(recycler, state);
                GalleryListView galleryListView = GalleryListView.this;
                if (galleryListView.firstLayout) {
                    galleryListView.firstLayout = false;
                    galleryListView.firstLayout();
                }
            }
        };
        this.layoutManager = r5;
        r4.setLayoutManager(r5);
        r4.setFastScrollEnabled(1);
        r4.setFastScrollVisible(true);
        r4.getFastScroll().setAlpha(0.0f);
        r5.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public final int getSpanSize(int i2) {
                return (i2 == 0 || i2 == 1 || i2 == GalleryListView.this.adapter.getTotalItemsCount() + 2) ? 3 : 1;
            }
        });
        r4.addItemDecoration(new AnonymousClass4());
        r4.setClipToPadding(false);
        addView((View) r4, LayoutHelper.createFrame(-1, -1, 119));
        final int i2 = 0;
        r4.setOnItemClickListener(new RecyclerListView.OnItemClickListener(this) {
            public final GalleryListView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onItemClick(View view, int i3) {
                Bitmap bitmap;
                Bitmap bitmap2;
                Utilities.Callback2 callback2;
                switch (i2) {
                    case 0:
                        GalleryListView galleryListView = this.f$0;
                        if (i3 < 2) {
                            galleryListView.getClass();
                            break;
                        } else if (galleryListView.onSelectListener != null && (view instanceof GalleryListView.Cell)) {
                            GalleryListView.Cell cell = (GalleryListView.Cell) view;
                            int size = i3 - 2;
                            Bitmap bitmapStackBlurBitmapWithScaleFactor = null;
                            if (!galleryListView.containsDraftFolder) {
                                if (galleryListView.containsDrafts) {
                                    ArrayList arrayList2 = galleryListView.drafts;
                                    if (size >= 0 && size < arrayList2.size()) {
                                        StoryEntry storyEntry = (StoryEntry) arrayList2.get(size);
                                        Utilities.Callback2 callback3 = galleryListView.onSelectListener;
                                        if (storyEntry.isVideo && cell != null && (bitmap = cell.bitmap) != null && !bitmap.isRecycled()) {
                                            bitmapStackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, 6.0f);
                                        }
                                        callback3.run(storyEntry, bitmapStackBlurBitmapWithScaleFactor);
                                    } else {
                                        size -= arrayList2.size();
                                    }
                                }
                            } else if (size == 0) {
                                galleryListView.selectAlbum(GalleryListView.draftsAlbum, true);
                            } else {
                                size = i3 - 3;
                            }
                            if (size >= 0 && size < galleryListView.photos.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) galleryListView.photos.get(size);
                                ArrayList arrayList3 = galleryListView.selectedPhotos;
                                if (arrayList3.isEmpty() && !galleryListView.multipleOnClick) {
                                    Utilities.Callback2 callback4 = galleryListView.onSelectListener;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto() && cell != null && (bitmap2 = cell.bitmap) != null && !bitmap2.isRecycled()) {
                                        bitmapStackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap2, 6.0f);
                                    }
                                    callback4.run(photoEntry, bitmapStackBlurBitmapWithScaleFactor);
                                } else {
                                    if (arrayList3.contains(photoEntry)) {
                                        arrayList3.remove(photoEntry);
                                    } else if (arrayList3.size() + 1 > galleryListView.maxCount) {
                                        int i4 = -galleryListView.shiftDp;
                                        galleryListView.shiftDp = i4;
                                        AndroidUtilities.shakeViewSpring(cell, i4);
                                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    } else {
                                        arrayList3.add(photoEntry);
                                    }
                                    AndroidUtilities.updateVisibleRows(galleryListView.listView);
                                    galleryListView.updateSelectButtonVisible();
                                }
                                break;
                            }
                            break;
                        }
                        break;
                    default:
                        GalleryListView galleryListView2 = this.f$0;
                        ActionBarMenuItem actionBarMenuItem = galleryListView2.searchItem;
                        if (actionBarMenuItem != null) {
                            AndroidUtilities.hideKeyboard(actionBarMenuItem.getSearchContainer());
                        }
                        if (i3 >= 0) {
                            GalleryListView.AnonymousClass8 anonymousClass8 = galleryListView2.searchAdapterImages;
                            if (i3 < anonymousClass8.results.size() && (callback2 = galleryListView2.onSelectListener) != null) {
                                callback2.run(anonymousClass8.results.get(i3), null);
                            }
                        }
                        break;
                }
            }
        });
        r4.setOnItemLongClickListener(new Weather$$ExternalSyntheticLambda7(this, 3));
        r4.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public final void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                GalleryListView galleryListView = GalleryListView.this;
                galleryListView.getClass();
                galleryListView.invalidate();
            }
        });
        ActionBar actionBar = new ActionBar(context, darkThemeResourceProvider);
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
            public final void onItemClick(int i3) {
                GalleryListView galleryListView = GalleryListView.this;
                if (i3 != -1) {
                    if (i3 >= 10) {
                        galleryListView.selectAlbum((MediaController.AlbumEntry) galleryListView.dropDownAlbums.get(i3 - 10), false);
                    }
                } else {
                    Runnable runnable = galleryListView.onBackClickListener;
                    if (runnable != null) {
                        runnable.run();
                    }
                }
            }
        });
        ActionBarMenu actionBarMenuCreateMenu = actionBar.createMenu();
        ?? r15 = new ActionBarMenuItem(context, actionBarMenuCreateMenu, darkThemeResourceProvider) {
            @Override
            public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(GalleryListView.this.dropDown.getText());
            }
        };
        this.dropDownContainer = r15;
        r15.setSubMenuOpenSide(1);
        actionBar.addView((View) r15, 0, LayoutHelper.createFrame(-2, -1.0f, 51, AndroidUtilities.isTablet() ? 64.0f : 56.0f, 0.0f, 40.0f, 0.0f));
        final int i3 = 0;
        r15.setOnClickListener(new View.OnClickListener(this) {
            public final GalleryListView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        toggleSubMenu();
                        break;
                    case 1:
                        GalleryListView galleryListView = this.f$0;
                        if (galleryListView.buttonsLayout.getAlpha() >= 0.25f) {
                            galleryListView.selectMultiple(false);
                            break;
                        }
                        break;
                    case 2:
                        GalleryListView galleryListView2 = this.f$0;
                        if (galleryListView2.buttonsLayout.getAlpha() >= 0.25f) {
                            galleryListView2.selectMultiple(true);
                            break;
                        }
                        break;
                    default:
                        this.f$0.selectMultiple(false);
                        break;
                }
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
        r15.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 16, 16.0f, 0.0f, 0.0f, 0.0f));
        FrameLayout frameLayout = new FrameLayout(context);
        this.searchContainer = frameLayout;
        frameLayout.setVisibility(8);
        frameLayout.setAlpha(0.0f);
        addView(frameLayout, LayoutHelper.createFrame(-1, -1, 119));
        RecyclerListView recyclerListView = new RecyclerListView(context, darkThemeResourceProvider);
        this.searchListView = recyclerListView;
        recyclerListView.setLayoutManager(new GridLayoutManager(3));
        AnonymousClass8 anonymousClass8 = new AnonymousClass8();
        this.searchAdapterImages = anonymousClass8;
        recyclerListView.setAdapter(anonymousClass8);
        recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public final void onScrolled(RecyclerView recyclerView, int i4, int i5) {
                ActionBarMenuItem actionBarMenuItem;
                GalleryListView galleryListView = GalleryListView.this;
                if (!galleryListView.searchListView.scrollingByUser || (actionBarMenuItem = galleryListView.searchItem) == null || actionBarMenuItem.getSearchField() == null) {
                    return;
                }
                AndroidUtilities.hideKeyboard(galleryListView.searchItem.getSearchContainer());
            }
        });
        recyclerListView.setClipToPadding(true);
        recyclerListView.addItemDecoration(new AnonymousClass10());
        frameLayout.addView(recyclerListView, LayoutHelper.createFrame(-1, -1, 119));
        AnonymousClass11 anonymousClass11 = new AnonymousClass11(context, darkThemeResourceProvider);
        anonymousClass11.setViewType(2);
        anonymousClass11.setAlpha(0.0f);
        anonymousClass11.setVisibility(8);
        frameLayout.addView(anonymousClass11, LayoutHelper.createFrame(-1, -1, 119));
        StickerEmptyView stickerEmptyView = new StickerEmptyView(context, anonymousClass11, 11, darkThemeResourceProvider);
        this.searchEmptyView = stickerEmptyView;
        stickerEmptyView.title.setTextSize(1, 16.0f);
        stickerEmptyView.title.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText, darkThemeResourceProvider));
        stickerEmptyView.title.setTypeface(null);
        stickerEmptyView.title.setText(LocaleController.getString(R.string.SearchImagesType));
        this.keyboardNotifier = new KeyboardNotifier(this, false, new HintView2$$ExternalSyntheticLambda0(this, 5));
        frameLayout.addView(stickerEmptyView, LayoutHelper.createFrame(-1, -1, 119));
        recyclerListView.setEmptyView(stickerEmptyView);
        ActionBarMenuItem actionBarMenuItemSearchListener = actionBarMenuCreateMenu.addItem(0, R.drawable.outline_header_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new AnonymousClass12());
        this.searchItem = actionBarMenuItemSearchListener;
        actionBarMenuItemSearchListener.setVisibility(8);
        actionBarMenuItemSearchListener.setSearchFieldHint(LocaleController.getString(R.string.SearchImagesTitle));
        final int i4 = 1;
        recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener(this) {
            public final GalleryListView f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onItemClick(View view, int i5) {
                Bitmap bitmap;
                Bitmap bitmap2;
                Utilities.Callback2 callback2;
                switch (i4) {
                    case 0:
                        GalleryListView galleryListView = this.f$0;
                        if (i5 < 2) {
                            galleryListView.getClass();
                            break;
                        } else if (galleryListView.onSelectListener != null && (view instanceof GalleryListView.Cell)) {
                            GalleryListView.Cell cell = (GalleryListView.Cell) view;
                            int size = i5 - 2;
                            Bitmap bitmapStackBlurBitmapWithScaleFactor = null;
                            if (!galleryListView.containsDraftFolder) {
                                if (galleryListView.containsDrafts) {
                                    ArrayList arrayList2 = galleryListView.drafts;
                                    if (size >= 0 && size < arrayList2.size()) {
                                        StoryEntry storyEntry = (StoryEntry) arrayList2.get(size);
                                        Utilities.Callback2 callback3 = galleryListView.onSelectListener;
                                        if (storyEntry.isVideo && cell != null && (bitmap = cell.bitmap) != null && !bitmap.isRecycled()) {
                                            bitmapStackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, 6.0f);
                                        }
                                        callback3.run(storyEntry, bitmapStackBlurBitmapWithScaleFactor);
                                    } else {
                                        size -= arrayList2.size();
                                    }
                                }
                            } else if (size == 0) {
                                galleryListView.selectAlbum(GalleryListView.draftsAlbum, true);
                            } else {
                                size = i5 - 3;
                            }
                            if (size >= 0 && size < galleryListView.photos.size()) {
                                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) galleryListView.photos.get(size);
                                ArrayList arrayList3 = galleryListView.selectedPhotos;
                                if (arrayList3.isEmpty() && !galleryListView.multipleOnClick) {
                                    Utilities.Callback2 callback4 = galleryListView.onSelectListener;
                                    if (photoEntry.isVideo && !photoEntry.isLivePhoto() && cell != null && (bitmap2 = cell.bitmap) != null && !bitmap2.isRecycled()) {
                                        bitmapStackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap2, 6.0f);
                                    }
                                    callback4.run(photoEntry, bitmapStackBlurBitmapWithScaleFactor);
                                } else {
                                    if (arrayList3.contains(photoEntry)) {
                                        arrayList3.remove(photoEntry);
                                    } else if (arrayList3.size() + 1 > galleryListView.maxCount) {
                                        int i6 = -galleryListView.shiftDp;
                                        galleryListView.shiftDp = i6;
                                        AndroidUtilities.shakeViewSpring(cell, i6);
                                        BotWebViewVibrationEffect.APP_ERROR.vibrate();
                                    } else {
                                        arrayList3.add(photoEntry);
                                    }
                                    AndroidUtilities.updateVisibleRows(galleryListView.listView);
                                    galleryListView.updateSelectButtonVisible();
                                }
                                break;
                            }
                            break;
                        }
                        break;
                    default:
                        GalleryListView galleryListView2 = this.f$0;
                        ActionBarMenuItem actionBarMenuItem = galleryListView2.searchItem;
                        if (actionBarMenuItem != null) {
                            AndroidUtilities.hideKeyboard(actionBarMenuItem.getSearchContainer());
                        }
                        if (i5 >= 0) {
                            GalleryListView.AnonymousClass8 anonymousClass9 = galleryListView2.searchAdapterImages;
                            if (i5 < anonymousClass9.results.size() && (callback2 = galleryListView2.onSelectListener) != null) {
                                callback2.run(anonymousClass9.results.get(i5), null);
                            }
                        }
                        break;
                }
            }
        });
        arrayList.clear();
        if (!z) {
            ArrayList arrayList2 = MessagesController.getInstance(i).getStoriesController().draftsController.drafts;
            int size = arrayList2.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList2.get(i5);
                i5++;
                StoryEntry storyEntry = (StoryEntry) obj;
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
            linearLayout.setBackgroundColor(Theme.getColor(Theme.key_dialogBackground, darkThemeResourceProvider));
            linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(AndroidUtilities.navigationBarHeight > 0 ? 0.0f : 10.0f) + AndroidUtilities.navigationBarHeight);
            addView(linearLayout, LayoutHelper.createFrame(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 0.0f));
            linearLayout.setAlpha(0.0f);
            linearLayout.setTranslationY(AndroidUtilities.dp(32.0f));
            linearLayout.setVisibility(8);
            ButtonWithCounterView round = new ButtonWithCounterView(context, true, darkThemeResourceProvider).setRound();
            this.button1View = round;
            round.setText(LocaleController.formatPluralStringComma("StoriesCreate", 1), false);
            if (!z3) {
                linearLayout.addView(round, LayoutHelper.createLinear(-1, 48, 0.0f, 0.0f, 0.0f, 8.0f));
                final int i6 = 1;
                round.setOnClickListener(new View.OnClickListener(this) {
                    public final GalleryListView f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (i6) {
                            case 0:
                                toggleSubMenu();
                                break;
                            case 1:
                                GalleryListView galleryListView = this.f$0;
                                if (galleryListView.buttonsLayout.getAlpha() >= 0.25f) {
                                    galleryListView.selectMultiple(false);
                                    break;
                                }
                                break;
                            case 2:
                                GalleryListView galleryListView2 = this.f$0;
                                if (galleryListView2.buttonsLayout.getAlpha() >= 0.25f) {
                                    galleryListView2.selectMultiple(true);
                                    break;
                                }
                                break;
                            default:
                                this.f$0.selectMultiple(false);
                                break;
                        }
                    }
                });
            }
            ButtonWithCounterView round2 = new ButtonWithCounterView(context, z3, darkThemeResourceProvider).setRound();
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v");
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.mini_collage);
            coloredImageSpan.translate(-AndroidUtilities.dp(1.33f), AndroidUtilities.dp(0.66f));
            spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 33);
            spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.StoriesCollage));
            round2.setText(spannableStringBuilder, false);
            linearLayout.addView(round2, LayoutHelper.createLinear(-1, 48, 0.0f, 0.0f, 0.0f, 0.0f));
            final int i7 = 2;
            round2.setOnClickListener(new View.OnClickListener(this) {
                public final GalleryListView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i7) {
                        case 0:
                            toggleSubMenu();
                            break;
                        case 1:
                            GalleryListView galleryListView = this.f$0;
                            if (galleryListView.buttonsLayout.getAlpha() >= 0.25f) {
                                galleryListView.selectMultiple(false);
                                break;
                            }
                            break;
                        case 2:
                            GalleryListView galleryListView2 = this.f$0;
                            if (galleryListView2.buttonsLayout.getAlpha() >= 0.25f) {
                                galleryListView2.selectMultiple(true);
                                break;
                            }
                            break;
                        default:
                            this.f$0.selectMultiple(false);
                            break;
                    }
                }
            });
        } else {
            this.buttonsLayout = null;
            this.button1View = null;
            ImageView imageView = new ImageView(context);
            this.selectButton = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.floating_check);
            imageView.setBackground(Theme.createCircleDrawable(AndroidUtilities.dp(56.0f), Theme.getColor(Theme.key_featuredStickers_addButton, darkThemeResourceProvider)));
            ScaleStateListAnimator.apply(imageView, 0.1f, 1.5f);
            addView(imageView, LayoutHelper.createFrame(-2, -2.0f, 85, 0.0f, 0.0f, 14.0f, 14.0f));
            final int i8 = 3;
            imageView.setOnClickListener(new View.OnClickListener(this) {
                public final GalleryListView f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i8) {
                        case 0:
                            toggleSubMenu();
                            break;
                        case 1:
                            GalleryListView galleryListView = this.f$0;
                            if (galleryListView.buttonsLayout.getAlpha() >= 0.25f) {
                                galleryListView.selectMultiple(false);
                                break;
                            }
                            break;
                        case 2:
                            GalleryListView galleryListView2 = this.f$0;
                            if (galleryListView2.buttonsLayout.getAlpha() >= 0.25f) {
                                galleryListView2.selectMultiple(true);
                                break;
                            }
                            break;
                        default:
                            this.f$0.selectMultiple(false);
                            break;
                    }
                }
            });
            imageView.setAlpha(0.0f);
            imageView.setScaleX(0.7f);
            imageView.setScaleY(0.7f);
        }
        updateAlbumsDropDown();
        MediaController.AlbumEntry albumEntry2 = draftsAlbum;
        if (albumEntry == null || (albumEntry == albumEntry2 && this.drafts.size() <= 0)) {
            ArrayList arrayList3 = this.dropDownAlbums;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                this.selectedAlbum = MediaController.allMediaAlbumEntry;
            } else {
                this.selectedAlbum = (MediaController.AlbumEntry) this.dropDownAlbums.get(0);
            }
        } else {
            this.selectedAlbum = albumEntry;
        }
        this.photos = getPhotoEntries(this.selectedAlbum);
        updateContainsDrafts();
        MediaController.AlbumEntry albumEntry3 = this.selectedAlbum;
        if (albumEntry3 == MediaController.allMediaAlbumEntry) {
            this.dropDown.setText(LocaleController.getString(R.string.ChatGallery));
        } else if (albumEntry3 == albumEntry2) {
            this.dropDown.setText(LocaleController.getString(R.string.StoryDraftsAlbum));
        } else {
            this.dropDown.setText(albumEntry3.bucketName);
        }
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = NotificationCenter.albumsDidLoad;
        Adapter adapter = this.adapter;
        int i4 = 0;
        if (i != i3) {
            if (i == NotificationCenter.storiesDraftsUpdated) {
                ArrayList arrayList = this.drafts;
                arrayList.clear();
                if (!this.onlyPhotos) {
                    ArrayList arrayList2 = MessagesController.getInstance(this.currentAccount).getStoriesController().draftsController.drafts;
                    int size = arrayList2.size();
                    while (i4 < size) {
                        Object obj = arrayList2.get(i4);
                        i4++;
                        StoryEntry storyEntry = (StoryEntry) obj;
                        if (!storyEntry.isEdit && !storyEntry.isError) {
                            arrayList.add(storyEntry);
                        }
                    }
                }
                updateAlbumsDropDown();
                updateContainsDrafts();
                if (adapter != null) {
                    adapter.notifyDataSetChanged();
                    return;
                }
                return;
            }
            return;
        }
        updateAlbumsDropDown();
        if (this.selectedAlbum != null) {
            while (i4 < MediaController.allMediaAlbums.size()) {
                MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i4);
                int i5 = albumEntry.bucketId;
                MediaController.AlbumEntry albumEntry2 = this.selectedAlbum;
                if (i5 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                    this.selectedAlbum = albumEntry;
                    break;
                }
                i4++;
            }
        } else {
            ArrayList arrayList3 = this.dropDownAlbums;
            if (arrayList3 == null || arrayList3.isEmpty()) {
                this.selectedAlbum = MediaController.allMediaAlbumEntry;
            } else {
                this.selectedAlbum = (MediaController.AlbumEntry) this.dropDownAlbums.get(0);
            }
        }
        this.photos = getPhotoEntries(this.selectedAlbum);
        this.selectedPhotos.clear();
        updateContainsDrafts();
        if (adapter != null) {
            adapter.notifyDataSetChanged();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float pVar = top();
        boolean z = pVar <= ((float) BotFullscreenButtons$$ExternalSyntheticOutline1.m(32.0f, ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, 0));
        float f = this.actionBarT.set(z);
        float fLerp = AndroidUtilities.lerp(pVar, 0.0f, f);
        if (z != this.actionBarShown) {
            this.actionBarShown = z;
            onFullScreen(z);
            getFastScroll().animate().alpha(this.actionBarShown ? 1.0f : 0.0f).start();
        }
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.setAlpha(f);
            int i = f <= 0.0f ? 8 : 0;
            if (actionBar.getVisibility() != i) {
                actionBar.setVisibility(i);
            }
        }
        ActionBar.AnonymousClass8 anonymousClass8 = this.headerView;
        if (anonymousClass8 != null) {
            anonymousClass8.setAlpha(1.0f - f);
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, fLerp, getWidth(), AndroidUtilities.dp(14.0f) + getHeight());
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.backgroundPaint);
        canvas.save();
        canvas.clipRect(0.0f, fLerp, getWidth(), getHeight());
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    public void firstLayout() {
    }

    public int getPadding() {
        return (int) (AndroidUtilities.displaySize.y * 0.35f);
    }

    public final ArrayList getPhotoEntries(MediaController.AlbumEntry albumEntry) {
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

    public MediaController.AlbumEntry getSelectedAlbum() {
        return this.selectedAlbum;
    }

    public String getTitle() {
        return LocaleController.getString(this.onlyPhotos ? R.string.AddImage : R.string.ChoosePhotoOrVideo);
    }

    @Override
    public final void onAttachedToWindow() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        super.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
        Cell.bitmapsUseCounts.clear();
        Cell.bitmapsCache.evictAll();
        int i = 0;
        while (true) {
            ArrayList arrayList = Cell.allQueues;
            if (i >= arrayList.size()) {
                arrayList.clear();
                return;
            } else {
                ((DispatchQueue) arrayList.get(i)).cleanupQueue();
                ((DispatchQueue) arrayList.get(i)).recycle();
                i++;
            }
        }
    }

    public void onFullScreen(boolean z) {
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int iDp;
        float f;
        int currentActionBarHeight = ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        AnonymousClass1 anonymousClass1 = this.listView;
        anonymousClass1.setPinnedSectionOffsetY(currentActionBarHeight);
        int iDp2 = AndroidUtilities.dp(6.0f);
        int currentActionBarHeight2 = ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        int iDp3 = AndroidUtilities.dp(1.0f);
        LinearLayout linearLayout = this.buttonsLayout;
        if (linearLayout == null) {
            iDp = 0;
        } else {
            iDp = AndroidUtilities.dp((AndroidUtilities.navigationBarHeight > 0 ? 0 : 10) + 114);
        }
        anonymousClass1.setPadding(iDp2, currentActionBarHeight2, iDp3, iDp + AndroidUtilities.navigationBarHeight);
        ImageView imageView = this.selectButton;
        if (imageView != null) {
            imageView.setTranslationY(-AndroidUtilities.navigationBarHeight);
        }
        if (linearLayout != null) {
            linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(AndroidUtilities.navigationBarHeight > 0 ? 0.0f : 10.0f) + AndroidUtilities.navigationBarHeight);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.searchContainer.getLayoutParams();
        layoutParams.leftMargin = 0;
        layoutParams.topMargin = ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight;
        layoutParams.rightMargin = 0;
        layoutParams.bottomMargin = AndroidUtilities.navigationBarHeight;
        TextView textView = this.dropDown;
        textView.setPadding(0, AndroidUtilities.statusBarHeight, AndroidUtilities.dp(10.0f), 0);
        if (AndroidUtilities.isTablet()) {
            f = 20.0f;
        } else {
            Point point = AndroidUtilities.displaySize;
            if (point.x > point.y) {
                f = 18.0f;
            } else {
                f = 20.0f;
            }
        }
        textView.setTextSize(f);
        super.onMeasure(i, i2);
    }

    public final void selectAlbum(MediaController.AlbumEntry albumEntry, boolean z) {
        this.selectedAlbum = albumEntry;
        this.photos = getPhotoEntries(albumEntry);
        this.selectedPhotos.clear();
        updateContainsDrafts();
        MediaController.AlbumEntry albumEntry2 = this.selectedAlbum;
        MediaController.AlbumEntry albumEntry3 = MediaController.allMediaAlbumEntry;
        TextView textView = this.dropDown;
        if (albumEntry2 == albumEntry3) {
            textView.setText(LocaleController.getString(R.string.ChatGallery));
        } else if (albumEntry2 == draftsAlbum) {
            textView.setText(LocaleController.getString(R.string.StoryDraftsAlbum));
        } else {
            textView.setText(albumEntry2.bucketName);
        }
        this.adapter.notifyDataSetChanged();
        AnonymousClass2 anonymousClass2 = this.layoutManager;
        if (!z) {
            anonymousClass2.scrollToPositionWithOffset(1, AndroidUtilities.dp(16.0f) + (-ActionBar.getCurrentActionBarHeight()));
            return;
        }
        LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(getContext(), 2);
        linearSmoothScrollerCustom.setTargetPosition(1);
        linearSmoothScrollerCustom.setOffset(AndroidUtilities.dp(16.0f) + (-ActionBar.getCurrentActionBarHeight()));
        anonymousClass2.startSmoothScroll(linearSmoothScrollerCustom);
    }

    public final void selectMultiple(boolean z) {
        Bitmap bitmapStackBlurBitmapWithScaleFactor;
        Cell cell;
        Bitmap bitmap;
        if (this.onSelectMultipleListener == null) {
            return;
        }
        ArrayList arrayList = this.selectedPhotos;
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() == 1) {
            this.onSelectListener.run((MediaController.PhotoEntry) arrayList.get(0), null);
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i = 0;
        while (true) {
            AnonymousClass1 anonymousClass1 = this.listView;
            if (i >= size) {
                this.onSelectMultipleListener.run(Boolean.valueOf(z), new ArrayList(arrayList), arrayList2);
                arrayList.clear();
                AndroidUtilities.updateVisibleRows(anonymousClass1);
                updateSelectButtonVisible();
                return;
            }
            Object obj = arrayList.get(i);
            i++;
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
            if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                bitmapStackBlurBitmapWithScaleFactor = null;
            } else {
                int i2 = 0;
                while (true) {
                    if (i2 >= anonymousClass1.getChildCount()) {
                        cell = null;
                        break;
                    }
                    View childAt = anonymousClass1.getChildAt(i2);
                    if (childAt instanceof Cell) {
                        cell = (Cell) childAt;
                        if (cell.currentObject == photoEntry) {
                            break;
                        }
                    }
                    i2++;
                }
                if (cell == null || (bitmap = cell.bitmap) == null || bitmap.isRecycled()) {
                    bitmapStackBlurBitmapWithScaleFactor = null;
                } else {
                    bitmapStackBlurBitmapWithScaleFactor = Utilities.stackBlurBitmapWithScaleFactor(bitmap, 6.0f);
                }
            }
            arrayList2.add(bitmapStackBlurBitmapWithScaleFactor);
        }
    }

    public void setMaxCount(int i) {
        this.maxCount = i;
    }

    public void setMultipleOnClick(boolean z) {
        if (this.multipleOnClick != z) {
            this.multipleOnClick = z;
            AndroidUtilities.updateVisibleRows(this.listView);
        }
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

    public final int top() {
        int padding;
        AnonymousClass1 anonymousClass1 = this.listView;
        if (anonymousClass1 == null || anonymousClass1.getChildCount() <= 0) {
            padding = getPadding();
        } else {
            int iMin = Integer.MAX_VALUE;
            if (anonymousClass1 != null) {
                for (int i = 0; i < anonymousClass1.getChildCount(); i++) {
                    View childAt = anonymousClass1.getChildAt(i);
                    if (anonymousClass1.getChildAdapterPosition(childAt) > 0) {
                        iMin = Math.min(iMin, (int) childAt.getY());
                    }
                }
            }
            padding = Math.max(0, Math.min(iMin, getHeight()));
        }
        return anonymousClass1 == null ? padding : AndroidUtilities.lerp(0, padding, anonymousClass1.getAlpha());
    }

    public final void updateAlbumsDropDown() {
        AlbumButton albumButton;
        AnonymousClass7 anonymousClass7 = this.dropDownContainer;
        anonymousClass7.removeAllSubItems();
        final ArrayList<MediaController.AlbumEntry> arrayList = MediaController.allMediaAlbums;
        ArrayList arrayList2 = new ArrayList(arrayList);
        this.dropDownAlbums = arrayList2;
        Collections.sort(arrayList2, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                ArrayList arrayList3;
                int iIndexOf;
                int iIndexOf2;
                MediaController.AlbumEntry albumEntry = (MediaController.AlbumEntry) obj;
                MediaController.AlbumEntry albumEntry2 = (MediaController.AlbumEntry) obj2;
                int i = albumEntry.bucketId;
                if (i == 0 && albumEntry2.bucketId != 0) {
                    return -1;
                }
                if ((i == 0 || albumEntry2.bucketId != 0) && (iIndexOf = (arrayList3 = arrayList).indexOf(albumEntry)) <= (iIndexOf2 = arrayList3.indexOf(albumEntry2))) {
                    return iIndexOf < iIndexOf2 ? -1 : 0;
                }
                return 1;
            }
        });
        ArrayList arrayList3 = this.drafts;
        boolean zIsEmpty = arrayList3.isEmpty();
        MediaController.AlbumEntry albumEntry = draftsAlbum;
        if (!zIsEmpty) {
            ArrayList arrayList4 = this.dropDownAlbums;
            arrayList4.add(!arrayList4.isEmpty() ? 1 : 0, albumEntry);
        }
        boolean zIsEmpty2 = this.dropDownAlbums.isEmpty();
        TextView textView = this.dropDown;
        if (zIsEmpty2) {
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            return;
        }
        textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, this.dropDownDrawable, (Drawable) null);
        int size = this.dropDownAlbums.size();
        for (int i = 0; i < size; i++) {
            MediaController.AlbumEntry albumEntry2 = (MediaController.AlbumEntry) this.dropDownAlbums.get(i);
            DarkThemeResourceProvider darkThemeResourceProvider = this.resourcesProvider;
            if (albumEntry2 == albumEntry) {
                albumButton = new AlbumButton(getContext(), albumEntry2.coverPhoto, LocaleController.getString("StoryDraftsAlbum"), arrayList3.size(), darkThemeResourceProvider);
            } else {
                ArrayList photoEntries = getPhotoEntries(albumEntry2);
                if (!photoEntries.isEmpty()) {
                    albumButton = new AlbumButton(getContext(), albumEntry2.coverPhoto, albumEntry2.bucketName, photoEntries.size(), darkThemeResourceProvider);
                }
            }
            anonymousClass7.getPopupLayout().addView(albumButton);
            albumButton.setOnClickListener(new RichEditor$$ExternalSyntheticLambda20(17, this, albumEntry2));
        }
    }

    public final void updateContainsDrafts() {
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

    public final void updateSelectButtonVisible() {
        ArrayList arrayList = this.selectedPhotos;
        boolean zIsEmpty = arrayList.isEmpty();
        boolean z = !zIsEmpty;
        ImageView imageView = this.selectButton;
        if (imageView != null) {
            OKLCH.m(imageView.animate().alpha(!zIsEmpty ? 1.0f : 0.0f).scaleX(!zIsEmpty ? 1.0f : 0.7f).scaleY(zIsEmpty ? 0.7f : 1.0f).translationY(!zIsEmpty ? -AndroidUtilities.navigationBarHeight : AndroidUtilities.dp(8.0f)), CubicBezierInterpolator.EASE_OUT_QUINT, 320L);
        }
        LinearLayout linearLayout = this.buttonsLayout;
        if (linearLayout != null) {
            ButtonWithCounterView buttonWithCounterView = this.button1View;
            if (buttonWithCounterView != null) {
                buttonWithCounterView.setText(LocaleController.formatPluralStringComma("StoriesCreate", Math.max(1, arrayList.size())), true);
            }
            linearLayout.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(AndroidUtilities.navigationBarHeight > 0 ? 0.0f : 10.0f) + AndroidUtilities.navigationBarHeight);
            if (this.buttonsLayoutVisible != z) {
                this.buttonsLayoutVisible = z;
                linearLayout.setVisibility(0);
                linearLayout.animate().alpha(zIsEmpty ? 0.0f : 1.0f).translationY(zIsEmpty ? AndroidUtilities.dp(32.0f) : 0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(320L).setListener(new StoryViewer.AnonymousClass7(this, z, 14)).start();
            }
        }
    }
}
