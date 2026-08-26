package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.LongSparseArray;
import android.util.Property;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.BaseCell;
import org.telegram.ui.Cells.EmptyCell;
import org.telegram.ui.Cells.StickerEmojiCell;
import org.telegram.ui.Cells.StickerSetNameCell;
import org.telegram.ui.ContentPreviewViewer;
import org.telegram.ui.recyclerview.LinearSmoothScrollerCustom;

public class StickerMasksAlert extends BottomSheet implements NotificationCenter.NotificationCenterDelegate {
    private FrameLayout bottomTabContainer;
    private AnimatorSet bottomTabContainerAnimation;
    private ContentPreviewViewer.ContentPreviewViewerDelegate contentPreviewViewerDelegate;
    private int currentAccount;
    private int currentType;
    private StickerMasksAlertDelegate delegate;
    private ImageView emojiButton;
    private boolean emojiSmoothScrolling;
    private int favTabBum;
    private ArrayList<TLRPC.Document> favouriteStickers;
    private RecyclerListView gridView;
    private boolean ignoreStickersScroll;
    private int lastNotifyHeight;
    private int lastNotifyHeight2;
    private int lastNotifyWidth;
    private String[] lastSearchKeyboardLanguage;
    private ImageView masksButton;
    private ArrayList<TLRPC.Document>[] recentStickers;
    private int recentTabBum;
    private RecyclerAnimationScrollHelper scrollHelper;
    private int scrollOffsetY;
    private int searchFieldHeight;
    private Drawable shadowDrawable;
    private View shadowLine;
    private Drawable[] stickerIcons;
    private ArrayList<TLRPC.TL_messages_stickerSet>[] stickerSets;
    private ImageView stickersButton;
    private StickersGridAdapter stickersGridAdapter;
    private GridLayoutManager stickersLayoutManager;
    private RecyclerListView.OnItemClickListener stickersOnItemClickListener;
    private SearchField stickersSearchField;
    private StickersSearchGridAdapter stickersSearchGridAdapter;
    private ScrollSlidingTabStrip stickersTab;
    private int stickersTabOffset;

    public class DrawingInBackgroundLine extends DrawingInBackgroundThreadDrawable {
        private OvershootInterpolator appearScaleInterpolator;
        ArrayList<ImageViewEmoji> drawInBackgroundViews;
        ArrayList<ImageViewEmoji> imageViewEmojis;
        public int position;
        public int startOffset;

        private DrawingInBackgroundLine() {
            this.drawInBackgroundViews = new ArrayList<>();
            this.appearScaleInterpolator = new OvershootInterpolator(3.0f);
        }

        @Override
        public void draw(Canvas canvas, long j, int i, int i2, float f) {
            ArrayList<ImageViewEmoji> arrayList = this.imageViewEmojis;
            if (arrayList == null) {
                return;
            }
            int i3 = 0;
            boolean z = true;
            boolean z2 = arrayList.size() <= 4 || SharedConfig.getDevicePerformanceClass() == 0 || !LiteMode.isEnabled(16388);
            if (!z2) {
                while (true) {
                    if (i3 >= this.imageViewEmojis.size()) {
                        z = z2;
                        break;
                    }
                    ImageViewEmoji imageViewEmoji = this.imageViewEmojis.get(i3);
                    if (imageViewEmoji.pressedProgress != 0.0f || imageViewEmoji.backAnimator != null) {
                        break;
                    } else {
                        i3++;
                    }
                }
            } else {
                z = z2;
                break;
            }
            if (!z) {
                super.draw(canvas, j, i, i2, f);
                return;
            }
            prepareDraw(System.currentTimeMillis());
            drawInUiThread(canvas, f);
            reset();
        }

        @Override
        public void drawInBackground(Canvas canvas) {
            for (int i = 0; i < this.drawInBackgroundViews.size(); i++) {
                ImageViewEmoji imageViewEmoji = this.drawInBackgroundViews.get(i);
                AnimatedEmojiDrawable animatedEmojiDrawable = imageViewEmoji.drawable;
                if (animatedEmojiDrawable != null) {
                    animatedEmojiDrawable.draw(canvas, imageViewEmoji.backgroundThreadDrawHolder[this.threadIndex], false);
                }
            }
        }

        @Override
        public void drawInUiThread(Canvas canvas, float f) {
            if (this.imageViewEmojis != null) {
                canvas.save();
                canvas.translate(-this.startOffset, 0.0f);
                for (int i = 0; i < this.imageViewEmojis.size(); i++) {
                    ImageViewEmoji imageViewEmoji = this.imageViewEmojis.get(i);
                    AnimatedEmojiDrawable animatedEmojiDrawable = imageViewEmoji.drawable;
                    if (animatedEmojiDrawable != null) {
                        int height = (int) (imageViewEmoji.getHeight() * 0.03f);
                        Rect rect = AndroidUtilities.rectTmp2;
                        rect.set(imageViewEmoji.getPaddingLeft() + imageViewEmoji.getLeft(), height, imageViewEmoji.getRight() - imageViewEmoji.getPaddingRight(), ((imageViewEmoji.getMeasuredHeight() + height) - imageViewEmoji.getPaddingBottom()) - imageViewEmoji.getPaddingTop());
                        float f2 = imageViewEmoji.pressedProgress;
                        float f3 = f2 != 0.0f ? (((1.0f - f2) * 0.2f) + 0.8f) * 1.0f : 1.0f;
                        animatedEmojiDrawable.setAlpha((int) (255.0f * f));
                        animatedEmojiDrawable.setBounds(rect);
                        if (f3 != 1.0f) {
                            canvas.save();
                            canvas.scale(f3, f3, rect.centerX(), rect.centerY());
                            animatedEmojiDrawable.draw(canvas);
                            canvas.restore();
                        } else {
                            animatedEmojiDrawable.draw(canvas);
                        }
                    }
                }
                canvas.restore();
            }
        }

        @Override
        public void onFrameReady() {
            super.onFrameReady();
            for (int i = 0; i < this.drawInBackgroundViews.size(); i++) {
                ImageViewEmoji imageViewEmoji = this.drawInBackgroundViews.get(i);
                if (imageViewEmoji.backgroundThreadDrawHolder != null) {
                    imageViewEmoji.backgroundThreadDrawHolder[this.threadIndex].release();
                }
            }
            StickerMasksAlert.this.gridView.invalidate();
        }

        @Override
        public void prepareDraw(long j) {
            this.drawInBackgroundViews.clear();
            for (int i = 0; i < this.imageViewEmojis.size(); i++) {
                ImageViewEmoji imageViewEmoji = this.imageViewEmojis.get(i);
                AnimatedEmojiDrawable animatedEmojiDrawable = imageViewEmoji.drawable;
                if (animatedEmojiDrawable != null && animatedEmojiDrawable.getImageReceiver() != null) {
                    animatedEmojiDrawable.update(j);
                    ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr = imageViewEmoji.backgroundThreadDrawHolder;
                    int i2 = this.threadIndex;
                    ImageReceiver imageReceiver = animatedEmojiDrawable.getImageReceiver();
                    ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolderArr2 = imageViewEmoji.backgroundThreadDrawHolder;
                    int i3 = this.threadIndex;
                    backgroundThreadDrawHolderArr[i2] = imageReceiver.setDrawInBackgroundThread(backgroundThreadDrawHolderArr2[i3], i3);
                    imageViewEmoji.backgroundThreadDrawHolder[this.threadIndex].time = j;
                    imageViewEmoji.backgroundThreadDrawHolder[this.threadIndex].overrideAlpha = 1.0f;
                    animatedEmojiDrawable.setAlpha(255);
                    int height = (int) (imageViewEmoji.getHeight() * 0.03f);
                    Rect rect = AndroidUtilities.rectTmp2;
                    rect.set((imageViewEmoji.getPaddingLeft() + imageViewEmoji.getLeft()) - this.startOffset, height, (imageViewEmoji.getRight() - imageViewEmoji.getPaddingRight()) - this.startOffset, ((imageViewEmoji.getMeasuredHeight() + height) - imageViewEmoji.getPaddingTop()) - imageViewEmoji.getPaddingBottom());
                    imageViewEmoji.backgroundThreadDrawHolder[this.threadIndex].setBounds(rect);
                    imageViewEmoji.drawable = animatedEmojiDrawable;
                    imageViewEmoji.imageReceiver = animatedEmojiDrawable.getImageReceiver();
                    this.drawInBackgroundViews.add(imageViewEmoji);
                }
            }
        }
    }

    public class ImageViewEmoji extends BackupImageView {
        ValueAnimator backAnimator;
        private ImageReceiver.BackgroundThreadDrawHolder[] backgroundThreadDrawHolder;
        public TLRPC.Document document;
        public AnimatedEmojiDrawable drawable;
        private boolean ignoring;
        public ImageReceiver imageReceiver;
        public boolean isRecent;
        public int position;
        float pressedProgress;

        public ImageViewEmoji(Context context) {
            super(context);
            this.backgroundThreadDrawHolder = new ImageReceiver.BackgroundThreadDrawHolder[2];
            setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f));
            setBackground(Theme.createRadSelectorDrawable(StickerMasksAlert.this.getThemedColor(Theme.key_listSelector), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f)));
        }

        public void lambda$setPressed$0(ValueAnimator valueAnimator) {
            this.pressedProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            invalidate();
        }

        public void setDocument(TLRPC.Document document) {
            setDrawable(AnimatedEmojiDrawable.make(StickerMasksAlert.this.currentAccount, 2, document));
        }

        private void setDrawable(AnimatedEmojiDrawable animatedEmojiDrawable) {
            AnimatedEmojiDrawable animatedEmojiDrawable2 = this.drawable;
            if (animatedEmojiDrawable2 != null) {
                animatedEmojiDrawable2.removeView(this);
            }
            this.drawable = animatedEmojiDrawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.addView(this);
            }
        }

        @Override
        public void onAttachedToWindow() {
            super.onAttachedToWindow();
            AnimatedEmojiDrawable animatedEmojiDrawable = this.drawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.addView(this);
            }
        }

        @Override
        public void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            AnimatedEmojiDrawable animatedEmojiDrawable = this.drawable;
            if (animatedEmojiDrawable != null) {
                animatedEmojiDrawable.removeView(this);
            }
        }

        @Override
        public void onDraw(Canvas canvas) {
            if (isPressed()) {
                float f = this.pressedProgress;
                if (f != 1.0f) {
                    float fMin = (Math.min(40.0f, 1000.0f / AndroidUtilities.screenRefreshRate) / 100.0f) + f;
                    this.pressedProgress = fMin;
                    this.pressedProgress = Utilities.clamp(fMin, 1.0f, 0.0f);
                    invalidate();
                }
            }
            float f2 = ((1.0f - this.pressedProgress) * 0.2f) + 0.8f;
            canvas.save();
            canvas.scale(f2, f2, getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f);
            super.onDraw(canvas);
            canvas.restore();
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i);
        }

        @Override
        public void setPressed(boolean z) {
            ValueAnimator valueAnimator;
            if (isPressed() != z) {
                super.setPressed(z);
                invalidate();
                if (z && (valueAnimator = this.backAnimator) != null) {
                    valueAnimator.removeAllListeners();
                    this.backAnimator.cancel();
                }
                if (z) {
                    return;
                }
                float f = this.pressedProgress;
                if (f != 0.0f) {
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f, 0.0f);
                    this.backAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new ButtonBounce$$ExternalSyntheticLambda0(this, 19));
                    this.backAnimator.addListener(new AnimatorListenerAdapter() {
                        @Override
                        public void onAnimationEnd(Animator animator) {
                            super.onAnimationEnd(animator);
                            ImageViewEmoji.this.backAnimator = null;
                        }
                    });
                    zzkk.m(5.0f, this.backAnimator);
                    this.backAnimator.setDuration(350L);
                    this.backAnimator.start();
                }
            }
        }
    }

    public class SearchField extends FrameLayout {
        private ImageView clearSearchImageView;
        private CloseProgressDrawable2 progressDrawable;
        private EditTextBoldCursor searchEditText;
        private AnimatorSet shadowAnimator;

        public SearchField(Context context, int i) {
            super(context);
            View view = new View(context);
            view.setBackgroundColor(-14342875);
            addView(view, new FrameLayout.LayoutParams(-1, StickerMasksAlert.this.searchFieldHeight));
            View view2 = new View(context);
            view2.setBackgroundDrawable(Theme.createRoundRectDrawable(AndroidUtilities.dp(18.0f), -13224394));
            addView(view2, LayoutHelper.createFrame(-1, 36.0f, 51, 14.0f, 14.0f, 14.0f, 0.0f));
            ImageView imageView = new ImageView(context);
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView.setScaleType(scaleType);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            imageView.setColorFilter(new PorterDuffColorFilter(-8947849, PorterDuff.Mode.MULTIPLY));
            addView(imageView, LayoutHelper.createFrame(36, 36.0f, 51, 16.0f, 14.0f, 0.0f, 0.0f));
            ImageView imageView2 = new ImageView(context);
            this.clearSearchImageView = imageView2;
            imageView2.setScaleType(scaleType);
            ImageView imageView3 = this.clearSearchImageView;
            CloseProgressDrawable2 closeProgressDrawable2 = new CloseProgressDrawable2() {
                @Override
                public int getCurrentColor() {
                    return -8947849;
                }
            };
            this.progressDrawable = closeProgressDrawable2;
            imageView3.setImageDrawable(closeProgressDrawable2);
            this.progressDrawable.setSide(AndroidUtilities.dp(7.0f));
            this.clearSearchImageView.setScaleX(0.1f);
            this.clearSearchImageView.setScaleY(0.1f);
            this.clearSearchImageView.setAlpha(0.0f);
            addView(this.clearSearchImageView, LayoutHelper.createFrame(36, 36.0f, 53, 14.0f, 14.0f, 14.0f, 0.0f));
            this.clearSearchImageView.setOnClickListener(new HintView$$ExternalSyntheticLambda0(this, 7));
            EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context) {
                @Override
                public boolean onTouchEvent(MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        SearchField.this.searchEditText.requestFocus();
                        AndroidUtilities.showKeyboard(SearchField.this.searchEditText);
                    }
                    return super.onTouchEvent(motionEvent);
                }
            };
            this.searchEditText = editTextBoldCursor;
            editTextBoldCursor.setTextSize(1, 16.0f);
            this.searchEditText.setHintTextColor(-8947849);
            this.searchEditText.setTextColor(-1);
            this.searchEditText.setBackgroundDrawable(null);
            this.searchEditText.setPadding(0, 0, 0, 0);
            this.searchEditText.setMaxLines(1);
            this.searchEditText.setLines(1);
            this.searchEditText.setSingleLine(true);
            this.searchEditText.setImeOptions(268435459);
            if (i == 0) {
                this.searchEditText.setHint(LocaleController.getString(R.string.SearchStickersHint));
            } else if (i == 1) {
                this.searchEditText.setHint(LocaleController.getString(R.string.SearchEmojiHint));
            } else if (i == 2) {
                this.searchEditText.setHint(LocaleController.getString(R.string.SearchGifsTitle));
            }
            this.searchEditText.setCursorColor(-1);
            this.searchEditText.setCursorSize(AndroidUtilities.dp(20.0f));
            this.searchEditText.setCursorWidth(1.5f);
            addView(this.searchEditText, LayoutHelper.createFrame(-1, 40.0f, 51, 54.0f, 12.0f, 46.0f, 0.0f));
            this.searchEditText.addTextChangedListener(new TextWatcher() {
                @Override
                public void afterTextChanged(Editable editable) {
                    boolean z = SearchField.this.searchEditText.length() > 0;
                    if (z != (SearchField.this.clearSearchImageView.getAlpha() != 0.0f)) {
                        SearchField.this.clearSearchImageView.animate().alpha(z ? 1.0f : 0.0f).setDuration(150L).scaleX(z ? 1.0f : 0.1f).scaleY(z ? 1.0f : 0.1f).start();
                    }
                    StickerMasksAlert.this.stickersSearchGridAdapter.search(SearchField.this.searchEditText.getText().toString());
                }

                @Override
                public void beforeTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i2, int i3, int i4) {
                }
            });
        }

        public void lambda$new$0(View view) {
            this.searchEditText.setText("");
            AndroidUtilities.showKeyboard(this.searchEditText);
        }

        public void showShadow(boolean z, boolean z2) {
        }

        public void hideKeyboard() {
            AndroidUtilities.hideKeyboard(this.searchEditText);
        }
    }

    public interface StickerMasksAlertDelegate {
        void onStickerSelected(Object obj, TLRPC.Document document);
    }

    public class StickersGridAdapter extends RecyclerListView.SelectionAdapter {
        private Context context;
        private int stickersPerRow;
        private int stickersPerRowType;
        private int totalItems;
        private SparseArray<Object> rowStartPack = new SparseArray<>();
        private HashMap<Object, Integer> packStartPosition = new HashMap<>();
        private SparseArray<Object> cache = new SparseArray<>();
        private SparseArray<Object> cacheParents = new SparseArray<>();
        private SparseIntArray positionToRow = new SparseIntArray();

        public StickersGridAdapter(Context context) {
            this.context = context;
        }

        public Object getItem(int i) {
            return this.cache.get(i);
        }

        @Override
        public int getItemCount() {
            int i = this.totalItems;
            if (i != 0) {
                return i + 1;
            }
            return 0;
        }

        @Override
        public int getItemViewType(int i) {
            if (i == 0) {
                return 4;
            }
            Object obj = this.cache.get(i);
            if (obj == null) {
                return 1;
            }
            if (obj instanceof TLRPC.Document) {
                return StickerMasksAlert.this.currentType == 5 ? -1 : 0;
            }
            return 2;
        }

        public int getPositionForPack(Object obj) {
            Integer num = this.packStartPosition.get(obj);
            if (num == null) {
                return -1;
            }
            return num.intValue();
        }

        public int getTabForPosition(int i) {
            int iIndexOf;
            int i2;
            if (i == 0) {
                i = 1;
            }
            if (this.stickersPerRow == 0 || this.stickersPerRowType != StickerMasksAlert.this.currentType) {
                int measuredWidth = StickerMasksAlert.this.gridView.getMeasuredWidth();
                if (measuredWidth == 0) {
                    measuredWidth = AndroidUtilities.displaySize.x;
                }
                this.stickersPerRow = measuredWidth / AndroidUtilities.dp(StickerMasksAlert.this.currentType == 5 ? 45.0f : 72.0f);
                this.stickersPerRowType = StickerMasksAlert.this.currentType;
            }
            int i3 = this.positionToRow.get(i, Integer.MIN_VALUE);
            if (i3 == Integer.MIN_VALUE) {
                ArrayList[] arrayListArr = StickerMasksAlert.this.stickerSets;
                StickerMasksAlert stickerMasksAlert = StickerMasksAlert.this;
                iIndexOf = arrayListArr[stickerMasksAlert.typeIndex(stickerMasksAlert.currentType)].size() - 1;
                i2 = StickerMasksAlert.this.stickersTabOffset;
            } else {
                Object obj = this.rowStartPack.get(i3);
                if (obj instanceof String) {
                    return "recent".equals(obj) ? StickerMasksAlert.this.recentTabBum : StickerMasksAlert.this.favTabBum;
                }
                ArrayList[] arrayListArr2 = StickerMasksAlert.this.stickerSets;
                StickerMasksAlert stickerMasksAlert2 = StickerMasksAlert.this;
                iIndexOf = arrayListArr2[stickerMasksAlert2.typeIndex(stickerMasksAlert2.currentType)].indexOf((TLRPC.TL_messages_stickerSet) obj);
                i2 = StickerMasksAlert.this.stickersTabOffset;
            }
            return i2 + iIndexOf;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return itemViewType == 0 || itemViewType == -1;
        }

        @Override
        public void notifyDataSetChanged() {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
            Object obj;
            int i;
            int measuredWidth = StickerMasksAlert.this.gridView.getMeasuredWidth();
            if (measuredWidth == 0) {
                measuredWidth = AndroidUtilities.displaySize.x;
            }
            this.stickersPerRow = measuredWidth / AndroidUtilities.dp(StickerMasksAlert.this.currentType == 5 ? 45.0f : 72.0f);
            StickerMasksAlert.this.stickersLayoutManager.setSpanCount(this.stickersPerRow);
            this.rowStartPack.clear();
            this.packStartPosition.clear();
            this.positionToRow.clear();
            this.cache.clear();
            this.totalItems = 0;
            ArrayList[] arrayListArr = StickerMasksAlert.this.stickerSets;
            StickerMasksAlert stickerMasksAlert = StickerMasksAlert.this;
            ArrayList arrayList = arrayListArr[stickerMasksAlert.typeIndex(stickerMasksAlert.currentType)];
            int i2 = -3;
            int i3 = -3;
            int i4 = 0;
            while (i3 < arrayList.size()) {
                if (i3 == i2) {
                    SparseArray<Object> sparseArray = this.cache;
                    int i5 = this.totalItems;
                    this.totalItems = i5 + 1;
                    sparseArray.put(i5, "search");
                    i4++;
                } else {
                    ArrayList<TLRPC.Document> arrayList2 = null;
                    if (i3 == -2) {
                        if (StickerMasksAlert.this.currentType == 0) {
                            ArrayList<TLRPC.Document> arrayList3 = StickerMasksAlert.this.favouriteStickers;
                            this.packStartPosition.put("fav", Integer.valueOf(this.totalItems));
                            arrayList2 = arrayList3;
                            tL_messages_stickerSet = null;
                            obj = "fav";
                        } else {
                            tL_messages_stickerSet = null;
                            obj = null;
                        }
                    } else if (i3 == -1) {
                        ArrayList<TLRPC.Document>[] arrayListArr2 = StickerMasksAlert.this.recentStickers;
                        StickerMasksAlert stickerMasksAlert2 = StickerMasksAlert.this;
                        ArrayList<TLRPC.Document> arrayList4 = arrayListArr2[stickerMasksAlert2.typeIndex(stickerMasksAlert2.currentType)];
                        this.packStartPosition.put("recent", Integer.valueOf(this.totalItems));
                        arrayList2 = arrayList4;
                        tL_messages_stickerSet = null;
                        obj = "recent";
                    } else {
                        tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i3);
                        ArrayList<TLRPC.Document> arrayList5 = tL_messages_stickerSet.documents;
                        this.packStartPosition.put(tL_messages_stickerSet, Integer.valueOf(this.totalItems));
                        obj = null;
                        arrayList2 = arrayList5;
                    }
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        int iCeil = (int) Math.ceil(arrayList2.size() / this.stickersPerRow);
                        if (tL_messages_stickerSet != null) {
                            this.cache.put(this.totalItems, tL_messages_stickerSet);
                        } else {
                            this.cache.put(this.totalItems, arrayList2);
                        }
                        this.positionToRow.put(this.totalItems, i4);
                        int i6 = 0;
                        while (i6 < arrayList2.size()) {
                            int i7 = i6 + 1;
                            int i8 = this.totalItems + i7;
                            this.cache.put(i8, arrayList2.get(i6));
                            if (tL_messages_stickerSet != null) {
                                this.cacheParents.put(i8, tL_messages_stickerSet);
                            } else {
                                this.cacheParents.put(i8, obj);
                            }
                            this.positionToRow.put(this.totalItems + i7, (i6 / this.stickersPerRow) + i4 + 1);
                            i6 = i7;
                        }
                        int i9 = 0;
                        while (true) {
                            i = iCeil + 1;
                            if (i9 >= i) {
                                break;
                            }
                            if (tL_messages_stickerSet != null) {
                                this.rowStartPack.put(i4 + i9, tL_messages_stickerSet);
                            } else {
                                this.rowStartPack.put(i4 + i9, i3 == -1 ? "recent" : "fav");
                            }
                            i9++;
                        }
                        this.totalItems = (iCeil * this.stickersPerRow) + 1 + this.totalItems;
                        i4 += i;
                    }
                }
                i3++;
                i2 = -3;
            }
            super.notifyDataSetChanged();
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            ArrayList<TLRPC.Document> arrayList;
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == -1) {
                TLRPC.Document document = (TLRPC.Document) this.cache.get(i);
                ImageViewEmoji imageViewEmoji = (ImageViewEmoji) viewHolder.itemView;
                imageViewEmoji.position = i;
                imageViewEmoji.document = document;
                imageViewEmoji.setDocument(document);
                ArrayList[] arrayListArr = StickerMasksAlert.this.recentStickers;
                StickerMasksAlert stickerMasksAlert = StickerMasksAlert.this;
                imageViewEmoji.isRecent = arrayListArr[stickerMasksAlert.typeIndex(stickerMasksAlert.currentType)].contains(document) || StickerMasksAlert.this.favouriteStickers.contains(document);
                return;
            }
            if (itemViewType == 0) {
                TLRPC.Document document2 = (TLRPC.Document) this.cache.get(i);
                StickerEmojiCell stickerEmojiCell = (StickerEmojiCell) viewHolder.itemView;
                stickerEmojiCell.setSticker(document2, this.cacheParents.get(i), false);
                ArrayList[] arrayListArr2 = StickerMasksAlert.this.recentStickers;
                StickerMasksAlert stickerMasksAlert2 = StickerMasksAlert.this;
                stickerEmojiCell.setRecent(arrayListArr2[stickerMasksAlert2.typeIndex(stickerMasksAlert2.currentType)].contains(document2));
                return;
            }
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    return;
                }
                StickerSetNameCell stickerSetNameCell = (StickerSetNameCell) viewHolder.itemView;
                Object obj = this.cache.get(i);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.StickerSet stickerSet = ((TLRPC.TL_messages_stickerSet) obj).set;
                    if (stickerSet != null) {
                        stickerSetNameCell.setText(stickerSet.title, 0, null, 0, 0);
                        return;
                    }
                    return;
                }
                ArrayList[] arrayListArr3 = StickerMasksAlert.this.recentStickers;
                StickerMasksAlert stickerMasksAlert3 = StickerMasksAlert.this;
                if (obj == arrayListArr3[stickerMasksAlert3.typeIndex(stickerMasksAlert3.currentType)]) {
                    stickerSetNameCell.setText(LocaleController.getString(R.string.RecentStickers), 0, null, 0, 0);
                    return;
                } else {
                    if (obj == StickerMasksAlert.this.favouriteStickers) {
                        stickerSetNameCell.setText(LocaleController.getString(R.string.FavoriteStickers), 0, null, 0, 0);
                        return;
                    }
                    return;
                }
            }
            EmptyCell emptyCell = (EmptyCell) viewHolder.itemView;
            if (i != this.totalItems) {
                emptyCell.setHeight(AndroidUtilities.dp(82.0f));
                return;
            }
            int i2 = this.positionToRow.get(i - 1, Integer.MIN_VALUE);
            if (i2 == Integer.MIN_VALUE) {
                emptyCell.setHeight(1);
                return;
            }
            Object obj2 = this.rowStartPack.get(i2);
            if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                arrayList = ((TLRPC.TL_messages_stickerSet) obj2).documents;
            } else if (!(obj2 instanceof String)) {
                arrayList = null;
            } else if ("recent".equals(obj2)) {
                ArrayList<TLRPC.Document>[] arrayListArr4 = StickerMasksAlert.this.recentStickers;
                StickerMasksAlert stickerMasksAlert4 = StickerMasksAlert.this;
                arrayList = arrayListArr4[stickerMasksAlert4.typeIndex(stickerMasksAlert4.currentType)];
            } else {
                arrayList = StickerMasksAlert.this.favouriteStickers;
            }
            if (arrayList == null) {
                emptyCell.setHeight(1);
            } else if (arrayList.isEmpty()) {
                emptyCell.setHeight(AndroidUtilities.dp(8.0f));
            } else {
                int iM$3 = OKLCH.m$3(82.0f, (int) Math.ceil(arrayList.size() / this.stickersPerRow), StickerMasksAlert.this.gridView.getHeight());
                emptyCell.setHeight(iM$3 > 0 ? iM$3 : 1);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View emptyCell;
            if (i == -1) {
                ImageViewEmoji imageViewEmoji = StickerMasksAlert.this.new ImageViewEmoji(this.context);
                imageViewEmoji.getImageReceiver().setLayerNum(((BottomSheet) StickerMasksAlert.this).playingImagesLayerNum);
                emptyCell = imageViewEmoji;
            } else if (i == 0) {
                StickerEmojiCell stickerEmojiCell = new StickerEmojiCell(this.context, false, ((BottomSheet) StickerMasksAlert.this).resourcesProvider) {
                    @Override
                    public void onMeasure(int i2, int i3) {
                        if (StickerMasksAlert.this.currentType == 5) {
                            super.onMeasure(i2, i2);
                        } else {
                            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(82.0f), 1073741824));
                        }
                    }
                };
                stickerEmojiCell.getImageView().setLayerNum(((BottomSheet) StickerMasksAlert.this).playingImagesLayerNum);
                emptyCell = stickerEmojiCell;
            } else if (i == 1) {
                emptyCell = new EmptyCell(this.context);
            } else if (i == 2) {
                StickerSetNameCell stickerSetNameCell = new StickerSetNameCell(this.context, false, false, ((BottomSheet) StickerMasksAlert.this).resourcesProvider, false);
                stickerSetNameCell.setTitleColor(-7829368);
                emptyCell = stickerSetNameCell;
            } else if (i != 4) {
                emptyCell = null;
            } else {
                View view = new View(this.context);
                view.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(48.0f) + StickerMasksAlert.this.searchFieldHeight));
                emptyCell = view;
            }
            return new RecyclerListView.Holder(emptyCell);
        }
    }

    public class StickersSearchGridAdapter extends RecyclerListView.SelectionAdapter {
        boolean cleared;
        private Context context;
        private int emojiSearchId;
        private int reqId2;
        private String searchQuery;
        private int totalItems;
        private SparseArray<Object> rowStartPack = new SparseArray<>();
        private SparseArray<Object> cache = new SparseArray<>();
        private SparseArray<Object> cacheParent = new SparseArray<>();
        private SparseIntArray positionToRow = new SparseIntArray();
        private SparseArray<String> positionToEmoji = new SparseArray<>();
        private ArrayList<TLRPC.TL_messages_stickerSet> localPacks = new ArrayList<>();
        private HashMap<TLRPC.TL_messages_stickerSet, Boolean> localPacksByShortName = new HashMap<>();
        private HashMap<TLRPC.TL_messages_stickerSet, Integer> localPacksByName = new HashMap<>();
        private HashMap<ArrayList<TLRPC.Document>, String> emojiStickers = new HashMap<>();
        private ArrayList<ArrayList<TLRPC.Document>> emojiArrays = new ArrayList<>();
        private Runnable searchRunnable = new AnonymousClass1();

        public class AnonymousClass1 implements Runnable {
            public AnonymousClass1() {
            }

            private void clear() {
                StickersSearchGridAdapter stickersSearchGridAdapter = StickersSearchGridAdapter.this;
                if (stickersSearchGridAdapter.cleared) {
                    return;
                }
                stickersSearchGridAdapter.cleared = true;
                stickersSearchGridAdapter.emojiStickers.clear();
                StickersSearchGridAdapter.this.emojiArrays.clear();
                StickersSearchGridAdapter.this.localPacks.clear();
                StickersSearchGridAdapter.this.localPacksByShortName.clear();
                StickersSearchGridAdapter.this.localPacksByName.clear();
            }

            public void lambda$run$0(int i, HashMap map, ArrayList arrayList, String str) {
                if (i != StickersSearchGridAdapter.this.emojiSearchId) {
                    return;
                }
                int size = arrayList.size();
                boolean z = false;
                for (int i2 = 0; i2 < size; i2++) {
                    String str2 = ((MediaDataController.KeywordResult) arrayList.get(i2)).emoji;
                    ArrayList arrayList2 = map != null ? (ArrayList) map.get(str2) : null;
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        clear();
                        if (!StickersSearchGridAdapter.this.emojiStickers.containsKey(arrayList2)) {
                            StickersSearchGridAdapter.this.emojiStickers.put(arrayList2, str2);
                            StickersSearchGridAdapter.this.emojiArrays.add(arrayList2);
                            z = true;
                        }
                    }
                }
                if (z) {
                    StickersSearchGridAdapter.this.notifyDataSetChanged();
                } else if (StickersSearchGridAdapter.this.reqId2 == 0) {
                    clear();
                    StickersSearchGridAdapter.this.notifyDataSetChanged();
                }
            }

            public void lambda$run$1(TLRPC.TL_messages_getStickers tL_messages_getStickers, TLObject tLObject, ArrayList arrayList, LongSparseArray longSparseArray) {
                if (tL_messages_getStickers.emoticon.equals(StickersSearchGridAdapter.this.searchQuery)) {
                    StickerMasksAlert.this.stickersSearchField.progressDrawable.stopAnimation();
                    StickersSearchGridAdapter.this.reqId2 = 0;
                    if (tLObject instanceof TLRPC.TL_messages_stickers) {
                        TLRPC.TL_messages_stickers tL_messages_stickers = (TLRPC.TL_messages_stickers) tLObject;
                        int size = arrayList.size();
                        int size2 = tL_messages_stickers.stickers.size();
                        for (int i = 0; i < size2; i++) {
                            TLRPC.Document document = tL_messages_stickers.stickers.get(i);
                            if (longSparseArray.indexOfKey(document.id) < 0) {
                                arrayList.add(document);
                            }
                        }
                        if (size != arrayList.size()) {
                            StickersSearchGridAdapter.this.emojiStickers.put(arrayList, StickersSearchGridAdapter.this.searchQuery);
                            if (size == 0) {
                                StickersSearchGridAdapter.this.emojiArrays.add(arrayList);
                            }
                            StickersSearchGridAdapter.this.notifyDataSetChanged();
                        }
                        if (StickerMasksAlert.this.gridView.getAdapter() != StickerMasksAlert.this.stickersSearchGridAdapter) {
                            StickerMasksAlert.this.gridView.setAdapter(StickerMasksAlert.this.stickersSearchGridAdapter);
                        }
                    }
                }
            }

            public void lambda$run$2(TLRPC.TL_messages_getStickers tL_messages_getStickers, ArrayList arrayList, LongSparseArray longSparseArray, TLObject tLObject, TLRPC.TL_error tL_error) {
                AndroidUtilities.runOnUIThread(new GroupCallPip$9$$ExternalSyntheticLambda0(this, tL_messages_getStickers, tLObject, arrayList, longSparseArray, 1));
            }

            @Override
            public void run() {
                int iIndexOfIgnoreCase;
                int iIndexOfIgnoreCase2;
                String str;
                CharSequence charSequenceConcat;
                int i;
                int i2 = 1;
                if (TextUtils.isEmpty(StickersSearchGridAdapter.this.searchQuery)) {
                    return;
                }
                StickersSearchGridAdapter stickersSearchGridAdapter = StickersSearchGridAdapter.this;
                stickersSearchGridAdapter.cleared = false;
                int iAccess$5904 = StickersSearchGridAdapter.access$5904(stickersSearchGridAdapter);
                ArrayList arrayList = new ArrayList(0);
                LongSparseArray longSparseArray = new LongSparseArray(0);
                HashMap<String, ArrayList<TLRPC.Document>> allStickers = MediaDataController.getInstance(StickerMasksAlert.this.currentAccount).getAllStickers();
                if (StickersSearchGridAdapter.this.searchQuery.length() <= 14) {
                    str = StickersSearchGridAdapter.this.searchQuery;
                    int length = str.length();
                    int i3 = 0;
                    while (i3 < length) {
                        if (i3 >= length - 1) {
                            charSequenceConcat = str;
                            if (charSequenceConcat.charAt(i3) == 65039) {
                                length--;
                                charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i3), charSequenceConcat.subSequence(i3 + 1, charSequenceConcat.length()));
                                i3--;
                            }
                        } else if (charSequenceConcat.charAt(i3) == 55356) {
                            int i4 = i3 + 1;
                            if (charSequenceConcat.charAt(i4) < 57339 || charSequenceConcat.charAt(i4) > 57343) {
                                charSequenceConcat = str;
                                charSequenceConcat = str;
                                charSequenceConcat = str;
                                if (charSequenceConcat.charAt(i3) == 8205) {
                                    i = i3 + 1;
                                    if (charSequenceConcat.charAt(i) != 9792 || charSequenceConcat.charAt(i) == 9794) {
                                    }
                                    i3--;
                                }
                                charSequenceConcat = str;
                                if (charSequenceConcat.charAt(i3) == 65039) {
                                    length--;
                                    charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i3), charSequenceConcat.subSequence(i3 + 1, charSequenceConcat.length()));
                                    i3--;
                                }
                            }
                            charSequenceConcat = str;
                            length -= 2;
                            charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i3), charSequenceConcat.subSequence(i3 + 2, charSequenceConcat.length()));
                            i3--;
                        } else {
                            charSequenceConcat = str;
                            charSequenceConcat = str;
                            charSequenceConcat = str;
                            if (charSequenceConcat.charAt(i3) == 8205) {
                                i = i3 + 1;
                                if (charSequenceConcat.charAt(i) != 9792) {
                                }
                                charSequenceConcat = str;
                                length -= 2;
                                charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i3), charSequenceConcat.subSequence(i3 + 2, charSequenceConcat.length()));
                                i3--;
                            }
                            charSequenceConcat = str;
                            if (charSequenceConcat.charAt(i3) == 65039) {
                                length--;
                                charSequenceConcat = TextUtils.concat(charSequenceConcat.subSequence(0, i3), charSequenceConcat.subSequence(i3 + 1, charSequenceConcat.length()));
                                i3--;
                            }
                        }
                        i3++;
                        charSequenceConcat = charSequenceConcat;
                    }
                    ArrayList<TLRPC.Document> arrayList2 = allStickers != null ? allStickers.get(charSequenceConcat.toString()) : null;
                    if (arrayList2 != null) {
                        charSequenceConcat = str;
                        if (!arrayList2.isEmpty()) {
                            clear();
                            arrayList.addAll(arrayList2);
                            int size = arrayList2.size();
                            for (int i5 = 0; i5 < size; i5++) {
                                charSequenceConcat = str;
                                TLRPC.Document document = arrayList2.get(i5);
                                longSparseArray.put(document.id, document);
                            }
                            charSequenceConcat = str;
                            StickersSearchGridAdapter.this.emojiStickers.put(arrayList, StickersSearchGridAdapter.this.searchQuery);
                            StickersSearchGridAdapter.this.emojiArrays.add(arrayList);
                        }
                    }
                }
                if (allStickers != null && !allStickers.isEmpty() && StickersSearchGridAdapter.this.searchQuery.length() > 1) {
                    String[] currentKeyboardLanguage = AndroidUtilities.getCurrentKeyboardLanguage();
                    if (!Arrays.equals(StickerMasksAlert.this.lastSearchKeyboardLanguage, currentKeyboardLanguage)) {
                        MediaDataController.getInstance(StickerMasksAlert.this.currentAccount).fetchNewEmojiKeywords(currentKeyboardLanguage);
                    }
                    StickerMasksAlert.this.lastSearchKeyboardLanguage = currentKeyboardLanguage;
                    MediaDataController.getInstance(StickerMasksAlert.this.currentAccount).getEmojiSuggestions(StickerMasksAlert.this.lastSearchKeyboardLanguage, StickersSearchGridAdapter.this.searchQuery, false, new SearchTagsList$$ExternalSyntheticLambda3(this, iAccess$5904, allStickers, i2), false);
                }
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(StickerMasksAlert.this.currentAccount).getStickerSets(StickerMasksAlert.this.currentType);
                int size2 = stickerSets.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i6);
                    int iIndexOfIgnoreCase3 = AndroidUtilities.indexOfIgnoreCase(tL_messages_stickerSet.set.title, StickersSearchGridAdapter.this.searchQuery);
                    if (iIndexOfIgnoreCase3 < 0) {
                        String str2 = tL_messages_stickerSet.set.short_name;
                        if (str2 != null && (iIndexOfIgnoreCase2 = AndroidUtilities.indexOfIgnoreCase(str2, StickersSearchGridAdapter.this.searchQuery)) >= 0 && (iIndexOfIgnoreCase2 == 0 || tL_messages_stickerSet.set.short_name.charAt(iIndexOfIgnoreCase2 - 1) == ' ')) {
                            clear();
                            StickersSearchGridAdapter.this.localPacks.add(tL_messages_stickerSet);
                            StickersSearchGridAdapter.this.localPacksByShortName.put(tL_messages_stickerSet, Boolean.TRUE);
                        }
                    } else if (iIndexOfIgnoreCase3 == 0 || tL_messages_stickerSet.set.title.charAt(iIndexOfIgnoreCase3 - 1) == ' ') {
                        clear();
                        StickersSearchGridAdapter.this.localPacks.add(tL_messages_stickerSet);
                        StickersSearchGridAdapter.this.localPacksByName.put(tL_messages_stickerSet, Integer.valueOf(iIndexOfIgnoreCase3));
                    }
                }
                ArrayList<TLRPC.TL_messages_stickerSet> stickerSets2 = MediaDataController.getInstance(StickerMasksAlert.this.currentAccount).getStickerSets(3);
                int size3 = stickerSets2.size();
                for (int i7 = 0; i7 < size3; i7++) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = stickerSets2.get(i7);
                    int iIndexOfIgnoreCase4 = AndroidUtilities.indexOfIgnoreCase(tL_messages_stickerSet2.set.title, StickersSearchGridAdapter.this.searchQuery);
                    if (iIndexOfIgnoreCase4 < 0) {
                        String str3 = tL_messages_stickerSet2.set.short_name;
                        if (str3 != null && (iIndexOfIgnoreCase = AndroidUtilities.indexOfIgnoreCase(str3, StickersSearchGridAdapter.this.searchQuery)) >= 0 && (iIndexOfIgnoreCase == 0 || tL_messages_stickerSet2.set.short_name.charAt(iIndexOfIgnoreCase - 1) == ' ')) {
                            clear();
                            StickersSearchGridAdapter.this.localPacks.add(tL_messages_stickerSet2);
                            StickersSearchGridAdapter.this.localPacksByShortName.put(tL_messages_stickerSet2, Boolean.TRUE);
                        }
                    } else if (iIndexOfIgnoreCase4 == 0 || tL_messages_stickerSet2.set.title.charAt(iIndexOfIgnoreCase4 - 1) == ' ') {
                        clear();
                        StickersSearchGridAdapter.this.localPacks.add(tL_messages_stickerSet2);
                        StickersSearchGridAdapter.this.localPacksByName.put(tL_messages_stickerSet2, Integer.valueOf(iIndexOfIgnoreCase4));
                    }
                }
                boolean zIsValidEmoji = Emoji.isValidEmoji(StickersSearchGridAdapter.this.searchQuery);
                if (zIsValidEmoji) {
                    StickerMasksAlert.this.stickersSearchField.progressDrawable.startAnimation();
                    TLRPC.TL_messages_getStickers tL_messages_getStickers = new TLRPC.TL_messages_getStickers();
                    tL_messages_getStickers.emoticon = StickersSearchGridAdapter.this.searchQuery;
                    tL_messages_getStickers.hash = 0L;
                    StickersSearchGridAdapter stickersSearchGridAdapter2 = StickersSearchGridAdapter.this;
                    stickersSearchGridAdapter2.reqId2 = ConnectionsManager.getInstance(StickerMasksAlert.this.currentAccount).sendRequest(tL_messages_getStickers, new StickersAlert$$ExternalSyntheticLambda44(1, this, tL_messages_getStickers, arrayList, longSparseArray));
                }
                if ((!zIsValidEmoji || !StickersSearchGridAdapter.this.localPacks.isEmpty() || !StickersSearchGridAdapter.this.emojiStickers.isEmpty()) && StickerMasksAlert.this.gridView.getAdapter() != StickerMasksAlert.this.stickersSearchGridAdapter) {
                    StickerMasksAlert.this.gridView.setAdapter(StickerMasksAlert.this.stickersSearchGridAdapter);
                }
                StickersSearchGridAdapter.this.notifyDataSetChanged();
            }
        }

        public StickersSearchGridAdapter(Context context) {
            this.context = context;
        }

        public static int access$5904(StickersSearchGridAdapter stickersSearchGridAdapter) {
            int i = stickersSearchGridAdapter.emojiSearchId + 1;
            stickersSearchGridAdapter.emojiSearchId = i;
            return i;
        }

        public Object getItem(int i) {
            return this.cache.get(i);
        }

        @Override
        public int getItemCount() {
            int i = this.totalItems;
            if (i != 1) {
                return i + 1;
            }
            return 2;
        }

        @Override
        public int getItemViewType(int i) {
            if (i == 0) {
                return 4;
            }
            if (i == 1 && this.totalItems == 1) {
                return 5;
            }
            Object obj = this.cache.get(i);
            if (obj == null) {
                return 1;
            }
            if (obj instanceof TLRPC.Document) {
                return StickerMasksAlert.this.currentType == 5 ? -1 : 0;
            }
            return 2;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            int itemViewType = viewHolder.getItemViewType();
            return itemViewType == 0 || itemViewType == -1;
        }

        @Override
        public void notifyDataSetChanged() {
            int i;
            this.rowStartPack.clear();
            this.positionToRow.clear();
            this.cache.clear();
            this.positionToEmoji.clear();
            this.totalItems = 0;
            int size = this.localPacks.size();
            int i2 = !this.emojiArrays.isEmpty() ? 1 : 0;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            while (i4 < size + i2) {
                if (i4 == i3) {
                    SparseArray<Object> sparseArray = this.cache;
                    int i6 = this.totalItems;
                    this.totalItems = i6 + 1;
                    sparseArray.put(i6, "search");
                    i5++;
                } else {
                    if (i4 < size) {
                        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = this.localPacks.get(i4);
                        ArrayList<TLRPC.Document> arrayList = tL_messages_stickerSet.documents;
                        if (!arrayList.isEmpty()) {
                            int iCeil = (int) Math.ceil(arrayList.size() / StickerMasksAlert.this.stickersGridAdapter.stickersPerRow);
                            this.cache.put(this.totalItems, tL_messages_stickerSet);
                            this.positionToRow.put(this.totalItems, i5);
                            int size2 = arrayList.size();
                            int i7 = 0;
                            while (i7 < size2) {
                                int i8 = i7 + 1;
                                int i9 = this.totalItems + i8;
                                int i10 = (i7 / StickerMasksAlert.this.stickersGridAdapter.stickersPerRow) + i5 + 1;
                                this.cache.put(i9, arrayList.get(i7));
                                this.cacheParent.put(i9, tL_messages_stickerSet);
                                this.positionToRow.put(i9, i10);
                                i7 = i8;
                            }
                            int i11 = iCeil + 1;
                            for (int i12 = 0; i12 < i11; i12++) {
                                this.rowStartPack.put(i5 + i12, tL_messages_stickerSet);
                            }
                            this.totalItems = (iCeil * StickerMasksAlert.this.stickersGridAdapter.stickersPerRow) + 1 + this.totalItems;
                            i5 += i11;
                        }
                    } else {
                        int size3 = this.emojiArrays.size();
                        String str = "";
                        int i13 = 0;
                        for (int i14 = 0; i14 < size3; i14++) {
                            ArrayList<TLRPC.Document> arrayList2 = this.emojiArrays.get(i14);
                            String str2 = this.emojiStickers.get(arrayList2);
                            if (str2 != null && !str.equals(str2)) {
                                this.positionToEmoji.put(this.totalItems + i13, str2);
                                str = str2;
                            }
                            int size4 = arrayList2.size();
                            int i15 = 0;
                            while (i15 < size4) {
                                int i16 = this.totalItems + i13;
                                int i17 = (i13 / StickerMasksAlert.this.stickersGridAdapter.stickersPerRow) + i5;
                                TLRPC.Document document = arrayList2.get(i15);
                                this.cache.put(i16, document);
                                int i18 = size;
                                TLRPC.TL_messages_stickerSet stickerSetById = MediaDataController.getInstance(StickerMasksAlert.this.currentAccount).getStickerSetById(MediaDataController.getStickerSetId(document));
                                if (stickerSetById != null) {
                                    this.cacheParent.put(i16, stickerSetById);
                                }
                                this.positionToRow.put(i16, i17);
                                i13++;
                                i15++;
                                size = i18;
                            }
                        }
                        i = size;
                        int iCeil2 = (int) Math.ceil(i13 / StickerMasksAlert.this.stickersGridAdapter.stickersPerRow);
                        for (int i19 = 0; i19 < iCeil2; i19++) {
                            this.rowStartPack.put(i5 + i19, Integer.valueOf(i13));
                        }
                        this.totalItems = (StickerMasksAlert.this.stickersGridAdapter.stickersPerRow * iCeil2) + this.totalItems;
                        i5 += iCeil2;
                    }
                    i4++;
                    size = i;
                    i3 = -1;
                }
                i = size;
                i4++;
                size = i;
                i3 = -1;
            }
            super.notifyDataSetChanged();
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            int itemViewType = viewHolder.getItemViewType();
            if (itemViewType == -1) {
                TLRPC.Document document = (TLRPC.Document) this.cache.get(i);
                ImageViewEmoji imageViewEmoji = (ImageViewEmoji) viewHolder.itemView;
                imageViewEmoji.position = i;
                imageViewEmoji.document = document;
                imageViewEmoji.setDocument(document);
                ArrayList[] arrayListArr = StickerMasksAlert.this.recentStickers;
                StickerMasksAlert stickerMasksAlert = StickerMasksAlert.this;
                imageViewEmoji.isRecent = arrayListArr[stickerMasksAlert.typeIndex(stickerMasksAlert.currentType)].contains(document) || StickerMasksAlert.this.favouriteStickers.contains(document);
                return;
            }
            if (itemViewType == 0) {
                TLRPC.Document document2 = (TLRPC.Document) this.cache.get(i);
                StickerEmojiCell stickerEmojiCell = (StickerEmojiCell) viewHolder.itemView;
                stickerEmojiCell.setSticker(document2, null, this.cacheParent.get(i), this.positionToEmoji.get(i), false);
                ArrayList[] arrayListArr2 = StickerMasksAlert.this.recentStickers;
                StickerMasksAlert stickerMasksAlert2 = StickerMasksAlert.this;
                stickerEmojiCell.setRecent(arrayListArr2[stickerMasksAlert2.typeIndex(stickerMasksAlert2.currentType)].contains(document2) || StickerMasksAlert.this.favouriteStickers.contains(document2));
                return;
            }
            Integer numValueOf = null;
            if (itemViewType != 1) {
                if (itemViewType != 2) {
                    return;
                }
                StickerSetNameCell stickerSetNameCell = (StickerSetNameCell) viewHolder.itemView;
                Object obj = this.cache.get(i);
                if (obj instanceof TLRPC.TL_messages_stickerSet) {
                    TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) obj;
                    if (!TextUtils.isEmpty(this.searchQuery) && this.localPacksByShortName.containsKey(tL_messages_stickerSet)) {
                        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
                        if (stickerSet != null) {
                            stickerSetNameCell.setText(stickerSet.title, 0, null, 0, 0);
                        }
                        stickerSetNameCell.setUrl(this.searchQuery.length(), tL_messages_stickerSet.set.short_name);
                        return;
                    }
                    Integer num = this.localPacksByName.get(tL_messages_stickerSet);
                    TLRPC.StickerSet stickerSet2 = tL_messages_stickerSet.set;
                    if (stickerSet2 != null && num != null) {
                        stickerSetNameCell.setText(stickerSet2.title, 0, null, num.intValue(), !TextUtils.isEmpty(this.searchQuery) ? this.searchQuery.length() : 0);
                    }
                    stickerSetNameCell.setUrl(0, null);
                    return;
                }
                return;
            }
            EmptyCell emptyCell = (EmptyCell) viewHolder.itemView;
            if (i != this.totalItems) {
                emptyCell.setHeight(AndroidUtilities.dp(82.0f));
                return;
            }
            int i2 = this.positionToRow.get(i - 1, Integer.MIN_VALUE);
            if (i2 == Integer.MIN_VALUE) {
                emptyCell.setHeight(1);
                return;
            }
            Object obj2 = this.rowStartPack.get(i2);
            if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                numValueOf = Integer.valueOf(((TLRPC.TL_messages_stickerSet) obj2).documents.size());
            } else if (obj2 instanceof Integer) {
                numValueOf = (Integer) obj2;
            }
            if (numValueOf == null) {
                emptyCell.setHeight(1);
            } else if (numValueOf.intValue() == 0) {
                emptyCell.setHeight(AndroidUtilities.dp(8.0f));
            } else {
                int iM$3 = OKLCH.m$3(82.0f, (int) Math.ceil(numValueOf.intValue() / StickerMasksAlert.this.stickersGridAdapter.stickersPerRow), StickerMasksAlert.this.gridView.getHeight());
                emptyCell.setHeight(iM$3 > 0 ? iM$3 : 1);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View stickerSetNameCell;
            View view;
            if (i == -1) {
                ImageViewEmoji imageViewEmoji = StickerMasksAlert.this.new ImageViewEmoji(this.context);
                imageViewEmoji.getImageReceiver().setLayerNum(((BottomSheet) StickerMasksAlert.this).playingImagesLayerNum);
                stickerSetNameCell = imageViewEmoji;
            } else if (i == 0) {
                StickerEmojiCell stickerEmojiCell = new StickerEmojiCell(this.context, false, ((BottomSheet) StickerMasksAlert.this).resourcesProvider) {
                    @Override
                    public void onMeasure(int i2, int i3) {
                        if (StickerMasksAlert.this.currentType == 5) {
                            super.onMeasure(i2, i2);
                        } else {
                            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(82.0f), 1073741824));
                        }
                    }
                };
                stickerEmojiCell.getImageView().setLayerNum(((BottomSheet) StickerMasksAlert.this).playingImagesLayerNum);
                stickerSetNameCell = stickerEmojiCell;
            } else if (i == 1) {
                stickerSetNameCell = new EmptyCell(this.context);
            } else if (i != 2) {
                if (i == 4) {
                    View view2 = new View(this.context);
                    view2.setLayoutParams(new RecyclerView.LayoutParams(-1, AndroidUtilities.dp(48.0f) + StickerMasksAlert.this.searchFieldHeight));
                    view = view2;
                } else if (i != 5) {
                    stickerSetNameCell = null;
                } else {
                    FrameLayout frameLayout = new FrameLayout(this.context) {
                        @Override
                        public void onMeasure(int i2, int i3) {
                            super.onMeasure(i2, OKLCH.m(48.0f, (StickerMasksAlert.this.gridView.getMeasuredHeight() - StickerMasksAlert.this.searchFieldHeight) - AndroidUtilities.dp(48.0f), 1073741824));
                        }
                    };
                    ImageView imageView = new ImageView(this.context);
                    imageView.setScaleType(ImageView.ScaleType.CENTER);
                    imageView.setImageResource(R.drawable.stickers_empty);
                    imageView.setColorFilter(new PorterDuffColorFilter(-7038047, PorterDuff.Mode.MULTIPLY));
                    frameLayout.addView(imageView, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 50.0f));
                    TextView textView = new TextView(this.context);
                    textView.setText(LocaleController.getString(R.string.NoStickersFound));
                    textView.setTextSize(1, 16.0f);
                    textView.setTextColor(-7038047);
                    frameLayout.addView(textView, LayoutHelper.createFrame(-2, -2.0f, 17, 0.0f, 0.0f, 0.0f, 0.0f));
                    frameLayout.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
                    view = frameLayout;
                }
                stickerSetNameCell = view;
            } else {
                stickerSetNameCell = new StickerSetNameCell(this.context, false, false, ((BottomSheet) StickerMasksAlert.this).resourcesProvider, false);
            }
            return new RecyclerListView.Holder(stickerSetNameCell);
        }

        public void search(String str) {
            if (this.reqId2 != 0) {
                ConnectionsManager.getInstance(StickerMasksAlert.this.currentAccount).cancelRequest(this.reqId2, true);
                this.reqId2 = 0;
            }
            if (TextUtils.isEmpty(str)) {
                this.searchQuery = null;
                this.localPacks.clear();
                this.emojiStickers.clear();
                if (StickerMasksAlert.this.gridView.getAdapter() != StickerMasksAlert.this.stickersGridAdapter) {
                    StickerMasksAlert.this.gridView.setAdapter(StickerMasksAlert.this.stickersGridAdapter);
                }
                notifyDataSetChanged();
            } else {
                this.searchQuery = str.toLowerCase();
            }
            AndroidUtilities.cancelRunOnUIThread(this.searchRunnable);
            AndroidUtilities.runOnUIThread(this.searchRunnable, 300L);
        }
    }

    public StickerMasksAlert(Context context, boolean z, Theme.ResourcesProvider resourcesProvider) {
        super(context, true, false, resourcesProvider);
        final int i = 1;
        this.currentAccount = UserConfig.selectedAccount;
        final int i2 = 2;
        this.stickerSets = new ArrayList[]{new ArrayList<>(), new ArrayList<>(), new ArrayList<>()};
        this.recentStickers = new ArrayList[]{new ArrayList<>(), new ArrayList<>(), new ArrayList<>()};
        this.favouriteStickers = new ArrayList<>();
        this.recentTabBum = -2;
        this.favTabBum = -2;
        this.contentPreviewViewerDelegate = new ContentPreviewViewer.ContentPreviewViewerDelegate() {
            @Override
            public final void addCaptionToGif(Object obj, Object obj2, boolean z2, int i3, int i4) {
                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$addCaptionToGif(this, obj, obj2, z2, i3, i4);
            }

            @Override
            public final void addToFavoriteSelected(String str) {
                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$addToFavoriteSelected(this, str);
            }

            @Override
            public final boolean can() {
                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$can(this);
            }

            @Override
            public final boolean canAddCaption(TLRPC.Document document) {
                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canAddCaption(this, document);
            }

            @Override
            public final boolean canDeleteSticker(TLRPC.Document document) {
                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canDeleteSticker(this, document);
            }

            @Override
            public final boolean canEditSticker() {
                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canEditSticker(this);
            }

            @Override
            public boolean canSchedule() {
                return false;
            }

            @Override
            public final boolean canSendSticker() {
                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canSendSticker(this);
            }

            @Override
            public final Boolean canSetAsStatus(TLRPC.Document document) {
                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$canSetAsStatus(this, document);
            }

            @Override
            public final void copyEmoji(TLRPC.Document document) {
                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$copyEmoji(this, document);
            }

            @Override
            public final void deleteSticker(TLRPC.Document document) {
                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$deleteSticker(this, document);
            }

            @Override
            public final void editSticker(TLRPC.Document document) {
                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$editSticker(this, document);
            }

            @Override
            public final ItemOptions getCustomItemOptions(ViewGroup viewGroup, View view) {
                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getCustomItemOptions(this, viewGroup, view);
            }

            @Override
            public long getDialogId() {
                return 0L;
            }

            @Override
            public final TLRPC.TL_messageMediaPoll getPoll() {
                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getPoll(this);
            }

            @Override
            public final TLRPC.PollAnswer getPollAnswer() {
                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getPollAnswer(this);
            }

            @Override
            public final MessageObject getPollMessageObject() {
                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getPollMessageObject(this);
            }

            @Override
            public final String getQuery(boolean z2) {
                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$getQuery(this, z2);
            }

            @Override
            public final void gifAddedOrDeleted() {
                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$gifAddedOrDeleted(this);
            }

            @Override
            public boolean isInScheduleMode() {
                return false;
            }

            @Override
            public final boolean isPhotoEditor() {
                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isPhotoEditor(this);
            }

            @Override
            public final boolean isReplacedSticker() {
                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isReplacedSticker(this);
            }

            @Override
            public final boolean isSettingIntroSticker() {
                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isSettingIntroSticker(this);
            }

            @Override
            public final boolean isStickerEditor() {
                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$isStickerEditor(this);
            }

            @Override
            public final boolean needCopy(TLRPC.Document document) {
                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needCopy(this, document);
            }

            @Override
            public boolean needMenu() {
                return false;
            }

            @Override
            public final boolean needOpen() {
                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needOpen(this);
            }

            @Override
            public final boolean needRemove() {
                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needRemove(this);
            }

            @Override
            public final boolean needRemoveFromRecent(TLRPC.Document document) {
                return ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$needRemoveFromRecent(this, document);
            }

            @Override
            public boolean needSend(int i3) {
                return false;
            }

            @Override
            public final void newStickerPackSelected(CharSequence charSequence, String str, Utilities.Callback callback) {
                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$newStickerPackSelected(this, charSequence, str, callback);
            }

            @Override
            public void openSet(TLRPC.InputStickerSet inputStickerSet, boolean z2) {
            }

            @Override
            public final void remove(SendMessagesHelper.ImportingSticker importingSticker) {
                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$remove(this, importingSticker);
            }

            @Override
            public final void removeFromRecent(TLRPC.Document document) {
                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$removeFromRecent(this, document);
            }

            @Override
            public final void resetTouch() {
                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$resetTouch(this);
            }

            @Override
            public final void retractVote() {
                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$retractVote(this);
            }

            @Override
            public final void sendEmoji(TLRPC.Document document) {
                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendEmoji(this, document);
            }

            @Override
            public final void sendGif(Object obj, Object obj2, boolean z2, int i3, int i4) {
                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendGif(this, obj, obj2, z2, i3, i4);
            }

            @Override
            public final void sendIntroSticker() {
                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendIntroSticker(this);
            }

            @Override
            public final void sendSticker(String str) {
                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendSticker(this, str);
            }

            @Override
            public final void sendVote() {
                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$sendVote(this);
            }

            @Override
            public final void setAsEmojiStatus(TLRPC.Document document, Integer num) {
                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$setAsEmojiStatus(this, document, num);
            }

            @Override
            public final void setIntroSticker(String str) {
                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$setIntroSticker(this, str);
            }

            @Override
            public final void stickerSetSelected(TLRPC.StickerSet stickerSet, String str) {
                ContentPreviewViewer.ContentPreviewViewerDelegate.CC.$default$stickerSetSelected(this, stickerSet, str);
            }

            @Override
            public void sendSticker(TLRPC.Document document, String str, Object obj, boolean z2, int i3, int i4) {
                StickerMasksAlert.this.delegate.onStickerSelected(obj, document);
            }
        };
        this.behindKeyboardColorKey = -1;
        this.behindKeyboardColor = -14342875;
        this.useLightStatusBar = false;
        fixNavigationBar(-14342875);
        this.currentType = 0;
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.recentDocumentsDidLoad);
        MediaDataController.getInstance(this.currentAccount).loadRecents(0, false, true, false);
        MediaDataController.getInstance(this.currentAccount).loadRecents(1, false, true, false);
        MediaDataController.getInstance(this.currentAccount).loadRecents(2, false, true, false);
        Drawable drawableMutate = context.getResources().getDrawable(R.drawable.sheet_shadow_round).mutate();
        this.shadowDrawable = drawableMutate;
        drawableMutate.setColorFilter(new PorterDuffColorFilter(-14342875, PorterDuff.Mode.MULTIPLY));
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
            private long lastUpdateTime;
            private float statusBarProgress;
            private boolean ignoreLayout = false;
            private RectF rect = new RectF();

            @Override
            public void onDraw(Canvas canvas) {
                float f;
                int iDp = AndroidUtilities.dp(13.0f);
                int translationY = (StickerMasksAlert.this.scrollOffsetY - ((BottomSheet) StickerMasksAlert.this).backgroundPaddingTop) - iDp;
                if (((BottomSheet) StickerMasksAlert.this).currentSheetAnimationType == 1) {
                    translationY = (int) (StickerMasksAlert.this.gridView.getTranslationY() + translationY);
                }
                int iDp2 = AndroidUtilities.dp(20.0f) + translationY;
                int iDp3 = ((BottomSheet) StickerMasksAlert.this).backgroundPaddingTop + AndroidUtilities.dp(15.0f) + getMeasuredHeight();
                int iDp4 = AndroidUtilities.dp(12.0f);
                if (((BottomSheet) StickerMasksAlert.this).backgroundPaddingTop + translationY < iDp4) {
                    float fDp = AndroidUtilities.dp(4.0f) + iDp;
                    float fMin = Math.min(1.0f, ((iDp4 - translationY) - ((BottomSheet) StickerMasksAlert.this).backgroundPaddingTop) / fDp);
                    int i3 = (int) ((iDp4 - fDp) * fMin);
                    translationY -= i3;
                    iDp2 -= i3;
                    iDp3 += i3;
                    f = 1.0f - fMin;
                } else {
                    f = 1.0f;
                }
                int i4 = AndroidUtilities.statusBarHeight;
                int i5 = translationY + i4;
                int i6 = iDp2 + i4;
                StickerMasksAlert.this.shadowDrawable.setBounds(0, i5, getMeasuredWidth(), iDp3);
                StickerMasksAlert.this.shadowDrawable.draw(canvas);
                if (f != 1.0f) {
                    Theme.dialogs_onlineCirclePaint.setColor(-14342875);
                    this.rect.set(((BottomSheet) StickerMasksAlert.this).backgroundPaddingLeft, ((BottomSheet) StickerMasksAlert.this).backgroundPaddingTop + i5, getMeasuredWidth() - ((BottomSheet) StickerMasksAlert.this).backgroundPaddingLeft, AndroidUtilities.dp(24.0f) + ((BottomSheet) StickerMasksAlert.this).backgroundPaddingTop + i5);
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(12.0f) * f, AndroidUtilities.dp(12.0f) * f, Theme.dialogs_onlineCirclePaint);
                }
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j = jElapsedRealtime - this.lastUpdateTime;
                if (j > 18) {
                    j = 18;
                }
                this.lastUpdateTime = jElapsedRealtime;
                if (f > 0.0f) {
                    int iDp5 = AndroidUtilities.dp(36.0f);
                    this.rect.set((getMeasuredWidth() - iDp5) / 2, i6, (getMeasuredWidth() + iDp5) / 2, AndroidUtilities.dp(4.0f) + i6);
                    int iAlpha = Color.alpha(-11842741);
                    Theme.dialogs_onlineCirclePaint.setColor(-11842741);
                    Theme.dialogs_onlineCirclePaint.setAlpha((int) (iAlpha * 1.0f * f));
                    canvas.drawRoundRect(this.rect, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(2.0f), Theme.dialogs_onlineCirclePaint);
                    float f2 = this.statusBarProgress;
                    if (f2 > 0.0f) {
                        float f3 = f2 - (j / 180.0f);
                        this.statusBarProgress = f3;
                        if (f3 < 0.0f) {
                            this.statusBarProgress = 0.0f;
                        } else {
                            invalidate();
                        }
                    }
                } else {
                    float f4 = this.statusBarProgress;
                    if (f4 < 1.0f) {
                        float f5 = (j / 180.0f) + f4;
                        this.statusBarProgress = f5;
                        if (f5 > 1.0f) {
                            this.statusBarProgress = 1.0f;
                        } else {
                            invalidate();
                        }
                    }
                }
                Theme.dialogs_onlineCirclePaint.setColor(Color.argb((int) (this.statusBarProgress * 255.0f), (int) (Color.red(-14342875) * 0.8f), (int) (Color.green(-14342875) * 0.8f), (int) (Color.blue(-14342875) * 0.8f)));
                canvas.drawRect(((BottomSheet) StickerMasksAlert.this).backgroundPaddingLeft, 0.0f, getMeasuredWidth() - ((BottomSheet) StickerMasksAlert.this).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, Theme.dialogs_onlineCirclePaint);
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (motionEvent.getAction() == 0 && StickerMasksAlert.this.scrollOffsetY != 0) {
                    if (motionEvent.getY() < AndroidUtilities.dp(12.0f) + StickerMasksAlert.this.scrollOffsetY) {
                        StickerMasksAlert.this.lambda$showGiftOfferSheet$15();
                        return true;
                    }
                }
                return super.onInterceptTouchEvent(motionEvent);
            }

            @Override
            public void onLayout(boolean z2, int i3, int i4, int i5, int i6) {
                super.onLayout(z2, i3, i4, i5, i6);
                StickerMasksAlert.this.updateLayout(false);
            }

            @Override
            public void onMeasure(int i3, int i4) {
                int iDp;
                int size = View.MeasureSpec.getSize(i4);
                if (!((BottomSheet) StickerMasksAlert.this).isFullscreen) {
                    this.ignoreLayout = true;
                    setPadding(((BottomSheet) StickerMasksAlert.this).backgroundPaddingLeft, AndroidUtilities.statusBarHeight, ((BottomSheet) StickerMasksAlert.this).backgroundPaddingLeft, 0);
                    this.ignoreLayout = false;
                }
                int paddingTop = size - getPaddingTop();
                if (measureKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
                    this.statusBarProgress = 1.0f;
                    iDp = 0;
                } else {
                    iDp = AndroidUtilities.dp(16.0f) + (paddingTop - ((paddingTop / 5) * 3));
                }
                if (StickerMasksAlert.this.gridView.getPaddingTop() != iDp) {
                    this.ignoreLayout = true;
                    StickerMasksAlert.this.gridView.setPinnedSectionOffsetY(-iDp);
                    StickerMasksAlert.this.gridView.setPadding(AndroidUtilities.dp(4.0f), iDp, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(48.0f));
                    this.ignoreLayout = false;
                }
                super.onMeasure(i3, View.MeasureSpec.makeMeasureSpec(size, 1073741824));
            }

            @Override
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return !StickerMasksAlert.this.isDismissed() && super.onTouchEvent(motionEvent);
            }

            @Override
            public void requestLayout() {
                if (this.ignoreLayout) {
                    return;
                }
                super.requestLayout();
            }
        };
        this.containerView = sizeNotifierFrameLayout;
        sizeNotifierFrameLayout.setWillNotDraw(false);
        ViewGroup viewGroup = this.containerView;
        int i3 = this.backgroundPaddingLeft;
        viewGroup.setPadding(i3, 0, i3, 0);
        this.searchFieldHeight = AndroidUtilities.dp(64.0f);
        this.stickerIcons = new Drawable[]{Theme.createEmojiIconSelectorDrawable(context, R.drawable.stickers_recent, -11842741, -9520403), Theme.createEmojiIconSelectorDrawable(context, R.drawable.stickers_favorites, -11842741, -9520403)};
        MediaDataController.getInstance(this.currentAccount).checkStickers(0);
        MediaDataController.getInstance(this.currentAccount).checkStickers(1);
        MediaDataController.getInstance(this.currentAccount).checkFeaturedStickers();
        RecyclerListView recyclerListView = new RecyclerListView(context) {
            SparseArray<ArrayList<ImageViewEmoji>> viewsGroupedByLines = new SparseArray<>();
            ArrayList<DrawingInBackgroundLine> lineDrawables = new ArrayList<>();
            ArrayList<DrawingInBackgroundLine> lineDrawablesTmp = new ArrayList<>();
            ArrayList<ArrayList<ImageViewEmoji>> unusedArrays = new ArrayList<>();
            ArrayList<DrawingInBackgroundLine> unusedLineDrawables = new ArrayList<>();

            @Override
            public boolean allowSelectChildAtPosition(float f, float f2) {
                return f2 >= ((float) (StickerMasksAlert.this.scrollOffsetY + AndroidUtilities.statusBarHeight));
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                DrawingInBackgroundLine drawingInBackgroundLine;
                super.dispatchDraw(canvas);
                for (int i4 = 0; i4 < this.viewsGroupedByLines.size(); i4++) {
                    ArrayList<ImageViewEmoji> arrayListValueAt = this.viewsGroupedByLines.valueAt(i4);
                    arrayListValueAt.clear();
                    this.unusedArrays.add(arrayListValueAt);
                }
                this.viewsGroupedByLines.clear();
                for (int i5 = 0; i5 < getChildCount(); i5++) {
                    View childAt = getChildAt(i5);
                    if (childAt instanceof ImageViewEmoji) {
                        int top = childAt.getTop() + ((int) childAt.getTranslationY());
                        ArrayList<ImageViewEmoji> arrayList = this.viewsGroupedByLines.get(top);
                        if (arrayList == null) {
                            arrayList = !this.unusedArrays.isEmpty() ? (ArrayList) DiffUtil.m(this.unusedArrays) : new ArrayList<>();
                            this.viewsGroupedByLines.put(top, arrayList);
                        }
                        arrayList.add((ImageViewEmoji) childAt);
                    }
                }
                this.lineDrawablesTmp.clear();
                this.lineDrawablesTmp.addAll(this.lineDrawables);
                this.lineDrawables.clear();
                long jCurrentTimeMillis = System.currentTimeMillis();
                int i6 = 0;
                while (true) {
                    if (i6 >= this.viewsGroupedByLines.size()) {
                        break;
                    }
                    ArrayList<ImageViewEmoji> arrayListValueAt2 = this.viewsGroupedByLines.valueAt(i6);
                    ImageViewEmoji imageViewEmoji = arrayListValueAt2.get(0);
                    int i7 = imageViewEmoji.position;
                    int i8 = 0;
                    while (true) {
                        if (i8 >= this.lineDrawablesTmp.size()) {
                            drawingInBackgroundLine = null;
                            break;
                        } else {
                            if (this.lineDrawablesTmp.get(i8).position == i7) {
                                drawingInBackgroundLine = this.lineDrawablesTmp.get(i8);
                                this.lineDrawablesTmp.remove(i8);
                                break;
                            }
                            i8++;
                        }
                    }
                    if (drawingInBackgroundLine == null) {
                        drawingInBackgroundLine = !this.unusedLineDrawables.isEmpty() ? (DrawingInBackgroundLine) DiffUtil.m(this.unusedLineDrawables) : new DrawingInBackgroundLine();
                        drawingInBackgroundLine.position = i7;
                        drawingInBackgroundLine.onAttachToWindow();
                    }
                    this.lineDrawables.add(drawingInBackgroundLine);
                    drawingInBackgroundLine.imageViewEmojis = arrayListValueAt2;
                    canvas.save();
                    canvas.translate(imageViewEmoji.getLeft(), imageViewEmoji.getY() + imageViewEmoji.getPaddingTop());
                    drawingInBackgroundLine.startOffset = imageViewEmoji.getLeft();
                    int measuredWidth = getMeasuredWidth() - (imageViewEmoji.getLeft() * 2);
                    int measuredHeight = imageViewEmoji.getMeasuredHeight() - imageViewEmoji.getPaddingBottom();
                    if (measuredWidth > 0 && measuredHeight > 0) {
                        drawingInBackgroundLine.draw(canvas, jCurrentTimeMillis, measuredWidth, measuredHeight, 1.0f);
                    }
                    canvas.restore();
                    i6++;
                }
                for (int i9 = 0; i9 < this.lineDrawablesTmp.size(); i9++) {
                    if (this.unusedLineDrawables.size() < 3) {
                        this.unusedLineDrawables.add(this.lineDrawablesTmp.get(i9));
                        this.lineDrawablesTmp.get(i9).imageViewEmojis = null;
                        this.lineDrawablesTmp.get(i9).reset();
                    } else {
                        this.lineDrawablesTmp.get(i9).onDetachFromWindow();
                    }
                }
                this.lineDrawablesTmp.clear();
            }

            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                return super.onInterceptTouchEvent(motionEvent) || ContentPreviewViewer.getInstance().onInterceptTouchEvent(motionEvent, StickerMasksAlert.this.gridView, ((BottomSheet) StickerMasksAlert.this).containerView.getMeasuredHeight(), StickerMasksAlert.this.contentPreviewViewerDelegate, this.resourcesProvider);
            }
        };
        this.gridView = recyclerListView;
        GridLayoutManager gridLayoutManager = new GridLayoutManager(context, 5) {
            {
                super(i);
            }

            @Override
            public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i4) {
                LinearSmoothScroller linearSmoothScroller = new LinearSmoothScroller(recyclerView.getContext()) {
                    @Override
                    public int calculateDyToMakeVisible(View view, int i5) {
                        return super.calculateDyToMakeVisible(view, i5) - (StickerMasksAlert.this.gridView.getPaddingTop() - AndroidUtilities.dp(7.0f));
                    }

                    @Override
                    public int calculateTimeForDeceleration(int i5) {
                        return super.calculateTimeForDeceleration(i5) * 4;
                    }
                };
                linearSmoothScroller.setTargetPosition(i4);
                startSmoothScroll(linearSmoothScroller);
            }
        };
        this.stickersLayoutManager = gridLayoutManager;
        recyclerListView.setLayoutManager(gridLayoutManager);
        this.stickersLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i4) {
                if (StickerMasksAlert.this.gridView.getAdapter() != StickerMasksAlert.this.stickersGridAdapter) {
                    if (i4 == StickerMasksAlert.this.stickersSearchGridAdapter.totalItems || !(StickerMasksAlert.this.stickersSearchGridAdapter.cache.get(i4) == null || (StickerMasksAlert.this.stickersSearchGridAdapter.cache.get(i4) instanceof TLRPC.Document))) {
                        return StickerMasksAlert.this.stickersGridAdapter.stickersPerRow;
                    }
                    return 1;
                }
                if (i4 == 0) {
                    return StickerMasksAlert.this.stickersGridAdapter.stickersPerRow;
                }
                if (i4 == StickerMasksAlert.this.stickersGridAdapter.totalItems || !(StickerMasksAlert.this.stickersGridAdapter.cache.get(i4) == null || (StickerMasksAlert.this.stickersGridAdapter.cache.get(i4) instanceof TLRPC.Document))) {
                    return StickerMasksAlert.this.stickersGridAdapter.stickersPerRow;
                }
                return 1;
            }
        });
        RecyclerAnimationScrollHelper recyclerAnimationScrollHelper = new RecyclerAnimationScrollHelper(this.gridView, this.stickersLayoutManager);
        this.scrollHelper = recyclerAnimationScrollHelper;
        recyclerAnimationScrollHelper.setAnimationCallback(new RecyclerAnimationScrollHelper.AnimationCallback() {
            @Override
            public void ignoreView(View view, boolean z2) {
                if (view instanceof ImageViewEmoji) {
                    ((ImageViewEmoji) view).ignoring = z2;
                }
            }

            @Override
            public void onEndAnimation() {
                StickerMasksAlert.this.emojiSmoothScrolling = false;
            }

            @Override
            public void onPreAnimation() {
                StickerMasksAlert.this.emojiSmoothScrolling = true;
            }
        });
        this.gridView.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(56.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(48.0f));
        this.gridView.setClipToPadding(false);
        this.gridView.setHorizontalScrollBarEnabled(false);
        this.gridView.setVerticalScrollBarEnabled(false);
        this.gridView.setGlowColor(-14342875);
        this.gridView.setSelectorDrawableColor(0);
        this.stickersSearchGridAdapter = new StickersSearchGridAdapter(context);
        RecyclerListView recyclerListView2 = this.gridView;
        StickersGridAdapter stickersGridAdapter = new StickersGridAdapter(context);
        this.stickersGridAdapter = stickersGridAdapter;
        recyclerListView2.setAdapter(stickersGridAdapter);
        this.gridView.setOnTouchListener(new AlertsCreator$$ExternalSyntheticLambda66(3, this, resourcesProvider));
        StarAppsSheet$$ExternalSyntheticLambda0 starAppsSheet$$ExternalSyntheticLambda0 = new StarAppsSheet$$ExternalSyntheticLambda0(this, 16);
        this.stickersOnItemClickListener = starAppsSheet$$ExternalSyntheticLambda0;
        this.gridView.setOnItemClickListener(starAppsSheet$$ExternalSyntheticLambda0);
        this.containerView.addView(this.gridView, LayoutHelper.createFrame(-1, -1.0f));
        this.stickersTab = new ScrollSlidingTabStrip(context, resourcesProvider, false) {
            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        };
        SearchField searchField = new SearchField(context, 0);
        this.stickersSearchField = searchField;
        this.containerView.addView(searchField, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + this.searchFieldHeight));
        this.stickersTab.setType(ScrollSlidingTabStrip.Type.TAB);
        this.stickersTab.setUnderlineHeight(AndroidUtilities.getShadowHeight());
        this.stickersTab.setIndicatorColor(-9520403);
        this.stickersTab.setUnderlineColor(0);
        this.stickersTab.setBackgroundColor(-14342875);
        this.containerView.addView(this.stickersTab, LayoutHelper.createFrame(-1, 42, 51));
        this.stickersTab.setDelegate(new ColorPicker$$ExternalSyntheticLambda5(this, 19));
        this.gridView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i4) {
                if (i4 == 1) {
                    StickerMasksAlert.this.stickersSearchField.hideKeyboard();
                }
            }

            @Override
            public void onScrolled(RecyclerView recyclerView, int i4, int i5) {
                StickerMasksAlert.this.updateLayout(true);
            }
        });
        this.bottomTabContainer = new FrameLayout(context) {
            @Override
            public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(true);
                }
                return super.onInterceptTouchEvent(motionEvent);
            }
        };
        View view = new View(context);
        this.shadowLine = view;
        view.setBackgroundColor(301989888);
        this.bottomTabContainer.addView(this.shadowLine, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight()));
        View view2 = new View(context);
        view2.setBackgroundColor(-14342875);
        this.bottomTabContainer.addView(view2, new FrameLayout.LayoutParams(-1, AndroidUtilities.dp(48.0f), 83));
        this.containerView.addView(this.bottomTabContainer, new FrameLayout.LayoutParams(-1, AndroidUtilities.getShadowHeight() + AndroidUtilities.dp(48.0f), 83));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        ImageView imageView = new ImageView(context) {
            @Override
            public void setSelected(boolean z2) {
                super.setSelected(z2);
                Drawable background = getBackground();
                if (background != null) {
                    int i4 = z2 ? -9520403 : 520093695;
                    Theme.setSelectorDrawableColor(background, Color.argb(30, Color.red(i4), Color.green(i4), Color.blue(i4)), true);
                }
            }
        };
        this.emojiButton = imageView;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        this.emojiButton.setImageDrawable(Theme.createEmojiIconSelectorDrawable(context, R.drawable.smiles_tab_smiles, -1, -9520403));
        BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSelectorDrawable = Theme.createSelectorDrawable(520093695, 1, -1);
        Theme.setRippleDrawableForceSoftware(rippleDrawableSafeCreateSelectorDrawable);
        this.emojiButton.setBackground(rippleDrawableSafeCreateSelectorDrawable);
        linearLayout.addView(this.emojiButton, LayoutHelper.createLinear(70, 48));
        ImageView imageView2 = this.emojiButton;
        final Object[] objArr = 0 == true ? 1 : 0;
        imageView2.setOnClickListener(new View.OnClickListener(this) {
            public final StickerMasksAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (objArr) {
                    case 0:
                        this.f$0.lambda$new$3(view3);
                        break;
                    case 1:
                        this.f$0.lambda$new$4(view3);
                        break;
                    default:
                        this.f$0.lambda$new$5(view3);
                        break;
                }
            }
        });
        ImageView imageView3 = new ImageView(context) {
            @Override
            public void setSelected(boolean z2) {
                super.setSelected(z2);
                Drawable background = getBackground();
                if (background != null) {
                    int i4 = z2 ? -9520403 : 520093695;
                    Theme.setSelectorDrawableColor(background, Color.argb(30, Color.red(i4), Color.green(i4), Color.blue(i4)), true);
                }
            }
        };
        this.stickersButton = imageView3;
        imageView3.setScaleType(scaleType);
        this.stickersButton.setImageDrawable(Theme.createEmojiIconSelectorDrawable(context, R.drawable.smiles_tab_stickers, -1, -9520403));
        BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSelectorDrawable2 = Theme.createSelectorDrawable(520093695, 1, -1);
        Theme.setRippleDrawableForceSoftware(rippleDrawableSafeCreateSelectorDrawable2);
        this.stickersButton.setBackground(rippleDrawableSafeCreateSelectorDrawable2);
        linearLayout.addView(this.stickersButton, LayoutHelper.createLinear(70, 48));
        this.stickersButton.setOnClickListener(new View.OnClickListener(this) {
            public final StickerMasksAlert f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (i) {
                    case 0:
                        this.f$0.lambda$new$3(view3);
                        break;
                    case 1:
                        this.f$0.lambda$new$4(view3);
                        break;
                    default:
                        this.f$0.lambda$new$5(view3);
                        break;
                }
            }
        });
        if (!z) {
            ImageView imageView4 = new ImageView(context) {
                @Override
                public void setSelected(boolean z2) {
                    super.setSelected(z2);
                    Drawable background = getBackground();
                    if (background != null) {
                        int i4 = z2 ? -9520403 : 520093695;
                        Theme.setSelectorDrawableColor(background, Color.argb(30, Color.red(i4), Color.green(i4), Color.blue(i4)), true);
                    }
                }
            };
            this.masksButton = imageView4;
            imageView4.setScaleType(scaleType);
            this.masksButton.setImageDrawable(Theme.createEmojiIconSelectorDrawable(context, R.drawable.ic_masks_msk1, -1, -9520403));
            BaseCell.RippleDrawableSafe rippleDrawableSafeCreateSelectorDrawable3 = Theme.createSelectorDrawable(520093695, 1, -1);
            Theme.setRippleDrawableForceSoftware(rippleDrawableSafeCreateSelectorDrawable3);
            this.masksButton.setBackground(rippleDrawableSafeCreateSelectorDrawable3);
            linearLayout.addView(this.masksButton, LayoutHelper.createLinear(70, 48));
            this.masksButton.setOnClickListener(new View.OnClickListener(this) {
                public final StickerMasksAlert f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view3) {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$new$3(view3);
                            break;
                        case 1:
                            this.f$0.lambda$new$4(view3);
                            break;
                        default:
                            this.f$0.lambda$new$5(view3);
                            break;
                    }
                }
            });
        }
        this.bottomTabContainer.addView(linearLayout, LayoutHelper.createFrame(-2, 48, 81));
        checkDocuments(true);
        reloadStickersAdapter();
    }

    private void checkDocuments(boolean z) {
        int size = this.recentStickers[typeIndex(this.currentType)].size();
        int size2 = this.favouriteStickers.size();
        this.recentStickers[typeIndex(this.currentType)] = MediaDataController.getInstance(this.currentAccount).getRecentStickers(this.currentType);
        this.favouriteStickers = MediaDataController.getInstance(this.currentAccount).getRecentStickers(2);
        if (this.currentType == 0) {
            for (int i = 0; i < this.favouriteStickers.size(); i++) {
                TLRPC.Document document = this.favouriteStickers.get(i);
                for (int i2 = 0; i2 < this.recentStickers[typeIndex(this.currentType)].size(); i2++) {
                    TLRPC.Document document2 = this.recentStickers[typeIndex(this.currentType)].get(i2);
                    if (document2.dc_id == document.dc_id && document2.id == document.id) {
                        this.recentStickers[typeIndex(this.currentType)].remove(i2);
                        break;
                    }
                }
            }
        }
        if (z || size != this.recentStickers[typeIndex(this.currentType)].size() || size2 != this.favouriteStickers.size()) {
            updateStickerTabs();
        }
        StickersGridAdapter stickersGridAdapter = this.stickersGridAdapter;
        if (stickersGridAdapter != null) {
            stickersGridAdapter.notifyDataSetChanged();
        }
        if (z) {
            return;
        }
        checkPanels();
    }

    private void checkPanels() {
        if (this.stickersTab == null) {
            return;
        }
        int childCount = this.gridView.getChildCount();
        View childAt = null;
        for (int i = 0; i < childCount; i++) {
            childAt = this.gridView.getChildAt(i);
            if (childAt.getBottom() > AndroidUtilities.dp(48.0f) + this.searchFieldHeight) {
                break;
            }
        }
        if (childAt == null) {
            return;
        }
        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.gridView.findContainingViewHolder(childAt);
        int adapterPosition = holder != null ? holder.getAdapterPosition() : -1;
        if (adapterPosition != -1) {
            int i2 = this.favTabBum;
            if (i2 <= 0 && (i2 = this.recentTabBum) <= 0) {
                i2 = this.stickersTabOffset;
            }
            this.stickersTab.onPageScrolled(this.stickersGridAdapter.getTabForPosition(adapterPosition), i2);
        }
    }

    private int getCurrentTop() {
        if (this.gridView.getChildCount() == 0) {
            return -1000;
        }
        int top = 0;
        View childAt = this.gridView.getChildAt(0);
        RecyclerListView.Holder holder = (RecyclerListView.Holder) this.gridView.findContainingViewHolder(childAt);
        if (holder == null) {
            return -1000;
        }
        int paddingTop = this.gridView.getPaddingTop();
        if (holder.getAdapterPosition() == 0 && childAt.getTop() >= 0) {
            top = childAt.getTop();
        }
        return paddingTop - top;
    }

    public boolean lambda$new$0(Theme.ResourcesProvider resourcesProvider, View view, MotionEvent motionEvent) {
        return ContentPreviewViewer.getInstance().onTouch(motionEvent, this.gridView, this.containerView.getMeasuredHeight(), this.stickersOnItemClickListener, this.contentPreviewViewerDelegate, resourcesProvider);
    }

    public void lambda$new$1(View view, int i) {
        if (view instanceof ImageViewEmoji) {
            ContentPreviewViewer.getInstance().reset();
            this.delegate.onStickerSelected(null, ((ImageViewEmoji) view).document);
            lambda$showGiftOfferSheet$15();
        } else if (view instanceof StickerEmojiCell) {
            ContentPreviewViewer.getInstance().reset();
            StickerEmojiCell stickerEmojiCell = (StickerEmojiCell) view;
            this.delegate.onStickerSelected(stickerEmojiCell.getParentObject(), stickerEmojiCell.getSticker());
            lambda$showGiftOfferSheet$15();
        }
    }

    public void lambda$new$2(int i) {
        int positionForPack;
        if (i == this.recentTabBum) {
            positionForPack = this.stickersGridAdapter.getPositionForPack("recent");
            ScrollSlidingTabStrip scrollSlidingTabStrip = this.stickersTab;
            int i2 = this.recentTabBum;
            scrollSlidingTabStrip.onPageScrolled(i2, i2 > 0 ? i2 : this.stickersTabOffset);
        } else if (i == this.favTabBum) {
            positionForPack = this.stickersGridAdapter.getPositionForPack("fav");
            ScrollSlidingTabStrip scrollSlidingTabStrip2 = this.stickersTab;
            int i3 = this.favTabBum;
            scrollSlidingTabStrip2.onPageScrolled(i3, i3 > 0 ? i3 : this.stickersTabOffset);
        } else {
            int size = i - this.stickersTabOffset;
            if (size >= this.stickerSets[typeIndex(this.currentType)].size()) {
                return;
            }
            if (size >= this.stickerSets[typeIndex(this.currentType)].size()) {
                size = this.stickerSets[typeIndex(this.currentType)].size() - 1;
            }
            positionForPack = this.stickersGridAdapter.getPositionForPack(this.stickerSets[typeIndex(this.currentType)].get(size));
        }
        if (this.stickersLayoutManager.findFirstVisibleItemPosition() == positionForPack) {
            return;
        }
        scrollEmojisToPosition(positionForPack, AndroidUtilities.dp(48.0f) + (-this.gridView.getPaddingTop()) + this.searchFieldHeight);
    }

    public void lambda$new$3(View view) {
        if (this.currentType == 5) {
            return;
        }
        this.currentType = 5;
        updateType();
    }

    public void lambda$new$4(View view) {
        if (this.currentType == 0) {
            return;
        }
        this.currentType = 0;
        updateType();
    }

    public void lambda$new$5(View view) {
        if (this.currentType == 1) {
            return;
        }
        this.currentType = 1;
        updateType();
    }

    private void reloadStickersAdapter() {
        StickersGridAdapter stickersGridAdapter = this.stickersGridAdapter;
        if (stickersGridAdapter != null) {
            stickersGridAdapter.notifyDataSetChanged();
        }
        StickersSearchGridAdapter stickersSearchGridAdapter = this.stickersSearchGridAdapter;
        if (stickersSearchGridAdapter != null) {
            stickersSearchGridAdapter.notifyDataSetChanged();
        }
        if (ContentPreviewViewer.getInstance().isVisible()) {
            ContentPreviewViewer.getInstance().close();
        }
        ContentPreviewViewer.getInstance().reset();
    }

    private void scrollEmojisToPosition(int i, int i2) {
        View viewFindViewByPosition = this.stickersLayoutManager.findViewByPosition(i);
        int iFindFirstVisibleItemPosition = this.stickersLayoutManager.findFirstVisibleItemPosition();
        if ((viewFindViewByPosition == null && Math.abs(i - iFindFirstVisibleItemPosition) > this.stickersLayoutManager.getSpanCount() * 9.0f) || !SharedConfig.animationsEnabled()) {
            this.scrollHelper.setScrollDirection(this.stickersLayoutManager.findFirstVisibleItemPosition() < i ? 0 : 1);
            this.scrollHelper.scrollToPosition(i, i2, false, true);
            return;
        }
        this.ignoreStickersScroll = true;
        LinearSmoothScrollerCustom linearSmoothScrollerCustom = new LinearSmoothScrollerCustom(getContext(), 2) {
            @Override
            public void onEnd() {
                StickerMasksAlert.this.emojiSmoothScrolling = false;
            }

            @Override
            public void onStart() {
                StickerMasksAlert.this.emojiSmoothScrolling = true;
            }
        };
        linearSmoothScrollerCustom.setTargetPosition(i);
        linearSmoothScrollerCustom.setOffset(i2);
        this.stickersLayoutManager.startSmoothScroll(linearSmoothScrollerCustom);
    }

    private void showBottomTab(boolean z, boolean z2) {
        if (z && this.bottomTabContainer.getTag() == null) {
            return;
        }
        if (z || this.bottomTabContainer.getTag() == null) {
            AnimatorSet animatorSet = this.bottomTabContainerAnimation;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.bottomTabContainerAnimation = null;
            }
            this.bottomTabContainer.setTag(z ? null : 1);
            if (!z2) {
                this.bottomTabContainer.setTranslationY(z ? 0.0f : AndroidUtilities.dp(49.0f));
                this.shadowLine.setTranslationY(z ? 0.0f : AndroidUtilities.dp(49.0f));
                return;
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.bottomTabContainerAnimation = animatorSet2;
            FrameLayout frameLayout = this.bottomTabContainer;
            Property property = View.TRANSLATION_Y;
            animatorSet2.playTogether(ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) property, z ? 0.0f : AndroidUtilities.dp(49.0f)), ObjectAnimator.ofFloat(this.shadowLine, (Property<View, Float>) property, z ? 0.0f : AndroidUtilities.dp(49.0f)));
            this.bottomTabContainerAnimation.setDuration(200L);
            this.bottomTabContainerAnimation.setInterpolator(CubicBezierInterpolator.EASE_OUT);
            this.bottomTabContainerAnimation.start();
        }
    }

    public int typeIndex(int i) {
        if (i != 0) {
            return i != 1 ? 2 : 1;
        }
        return 0;
    }

    public void updateLayout(boolean z) {
        RecyclerListView.Holder holder;
        if (this.gridView.getChildCount() <= 0) {
            RecyclerListView recyclerListView = this.gridView;
            int paddingTop = recyclerListView.getPaddingTop();
            this.scrollOffsetY = paddingTop;
            recyclerListView.setTopGlowOffset(paddingTop);
            this.containerView.invalidate();
            return;
        }
        View childAt = this.gridView.getChildAt(0);
        RecyclerListView.Holder holder2 = (RecyclerListView.Holder) this.gridView.findContainingViewHolder(childAt);
        int top = childAt.getTop();
        int iDp = AndroidUtilities.dp(7.0f);
        if (top < AndroidUtilities.dp(7.0f) || holder2 == null || holder2.getAdapterPosition() != 0) {
            top = iDp;
        }
        int i = top + (-AndroidUtilities.dp(11.0f));
        if (this.scrollOffsetY != i) {
            RecyclerListView recyclerListView2 = this.gridView;
            this.scrollOffsetY = i;
            recyclerListView2.setTopGlowOffset(i);
            this.stickersTab.setTranslationY(i);
            this.stickersSearchField.setTranslationY(AndroidUtilities.dp(32.0f) + i);
            this.containerView.invalidate();
        }
        RecyclerListView.Holder holder3 = (RecyclerListView.Holder) this.gridView.findViewHolderForAdapterPosition(0);
        if (holder3 == null) {
            this.stickersSearchField.showShadow(true, z);
        } else {
            this.stickersSearchField.showShadow(holder3.itemView.getTop() < this.gridView.getPaddingTop(), z);
        }
        RecyclerView.Adapter adapter = this.gridView.getAdapter();
        StickersSearchGridAdapter stickersSearchGridAdapter = this.stickersSearchGridAdapter;
        if (adapter == stickersSearchGridAdapter && (holder = (RecyclerListView.Holder) this.gridView.findViewHolderForAdapterPosition(stickersSearchGridAdapter.getItemCount() - 1)) != null && holder.getItemViewType() == 5) {
            FrameLayout frameLayout = (FrameLayout) holder.itemView;
            int childCount = frameLayout.getChildCount();
            float f = (-((frameLayout.getTop() - this.searchFieldHeight) - AndroidUtilities.dp(48.0f))) / 2;
            for (int i2 = 0; i2 < childCount; i2++) {
                frameLayout.getChildAt(i2).setTranslationY(f);
            }
        }
        checkPanels();
    }

    private void updateStickerTabs() {
        ArrayList<TLRPC.Document> arrayList;
        if (this.stickersTab == null) {
            return;
        }
        if (this.stickersButton != null) {
            this.emojiButton.setSelected(this.currentType == 5);
            this.stickersButton.setSelected(this.currentType == 0);
            ImageView imageView = this.masksButton;
            if (imageView != null) {
                imageView.setSelected(this.currentType == 1);
            }
        }
        this.recentTabBum = -2;
        this.favTabBum = -2;
        this.stickersTabOffset = 0;
        int currentPosition = this.stickersTab.getCurrentPosition();
        this.stickersTab.beginUpdate(false);
        if (this.currentType == 0 && !this.favouriteStickers.isEmpty()) {
            int i = this.stickersTabOffset;
            this.favTabBum = i;
            this.stickersTabOffset = i + 1;
            this.stickersTab.addIconTab(1, this.stickerIcons[1]).setContentDescription(LocaleController.getString(R.string.FavoriteStickers));
        }
        if (!this.recentStickers[typeIndex(this.currentType)].isEmpty()) {
            int i2 = this.stickersTabOffset;
            this.recentTabBum = i2;
            this.stickersTabOffset = i2 + 1;
            this.stickersTab.addIconTab(0, this.stickerIcons[0]).setContentDescription(LocaleController.getString(R.string.RecentStickers));
        }
        this.stickerSets[typeIndex(this.currentType)].clear();
        ArrayList<TLRPC.TL_messages_stickerSet> stickerSets = MediaDataController.getInstance(this.currentAccount).getStickerSets(this.currentType);
        for (int i3 = 0; i3 < stickerSets.size(); i3++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet = stickerSets.get(i3);
            if (!tL_messages_stickerSet.set.archived && (arrayList = tL_messages_stickerSet.documents) != null && !arrayList.isEmpty()) {
                this.stickerSets[typeIndex(this.currentType)].add(tL_messages_stickerSet);
            }
        }
        for (int i4 = 0; i4 < this.stickerSets[typeIndex(this.currentType)].size(); i4++) {
            TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = this.stickerSets[typeIndex(this.currentType)].get(i4);
            TLRPC.Document document = tL_messages_stickerSet2.documents.get(0);
            TLObject closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(tL_messages_stickerSet2.set.thumbs, 90);
            if (closestPhotoSizeWithSize == null) {
                closestPhotoSizeWithSize = document;
            }
            this.stickersTab.addStickerTab(closestPhotoSizeWithSize, document, tL_messages_stickerSet2).setContentDescription(tL_messages_stickerSet2.set.title + ", " + LocaleController.getString(R.string.AccDescrStickerSet));
        }
        this.stickersTab.commitUpdate();
        this.stickersTab.updateTabStyles();
        if (currentPosition != 0) {
            this.stickersTab.onPageScrolled(currentPosition, currentPosition);
        }
        checkPanels();
    }

    private void updateType() {
        View childAt;
        RecyclerView.ViewHolder viewHolderFindContainingViewHolder;
        if (this.currentType == 5) {
            this.stickersLayoutManager.setSpanCount(8);
        } else {
            this.stickersLayoutManager.setSpanCount(5);
        }
        this.stickersLayoutManager.requestLayout();
        if (this.gridView.getChildCount() > 0 && (viewHolderFindContainingViewHolder = this.gridView.findContainingViewHolder((childAt = this.gridView.getChildAt(0)))) != null) {
            this.stickersLayoutManager.scrollToPositionWithOffset(0, viewHolderFindContainingViewHolder.getAdapterPosition() != 0 ? -this.gridView.getPaddingTop() : childAt.getTop() + (-this.gridView.getPaddingTop()));
        }
        checkDocuments(true);
    }

    public void addRecentSticker(TLRPC.Document document) {
        if (document == null) {
            return;
        }
        MediaDataController.getInstance(this.currentAccount).addRecentSticker(this.currentType, null, document, (int) (System.currentTimeMillis() / 1000), false);
        boolean zIsEmpty = this.recentStickers[typeIndex(this.currentType)].isEmpty();
        this.recentStickers[typeIndex(this.currentType)] = MediaDataController.getInstance(this.currentAccount).getRecentStickers(this.currentType);
        StickersGridAdapter stickersGridAdapter = this.stickersGridAdapter;
        if (stickersGridAdapter != null) {
            stickersGridAdapter.notifyDataSetChanged();
        }
        if (zIsEmpty) {
            updateStickerTabs();
        }
    }

    @Override
    public boolean canDismissWithSwipe() {
        return false;
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        RecyclerListView recyclerListView;
        if (i == NotificationCenter.stickersDidLoad) {
            if (((Integer) objArr[0]).intValue() == this.currentType) {
                updateStickerTabs();
                reloadStickersAdapter();
                checkPanels();
                return;
            }
            return;
        }
        if (i == NotificationCenter.recentDocumentsDidLoad) {
            boolean zBooleanValue = ((Boolean) objArr[0]).booleanValue();
            int iIntValue = ((Integer) objArr[1]).intValue();
            if (zBooleanValue) {
                return;
            }
            if (iIntValue == this.currentType || iIntValue == 2) {
                checkDocuments(false);
                return;
            }
            return;
        }
        if (i != NotificationCenter.emojiLoaded || (recyclerListView = this.gridView) == null) {
            return;
        }
        int childCount = recyclerListView.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = this.gridView.getChildAt(i3);
            if ((childAt instanceof StickerSetNameCell) || (childAt instanceof StickerEmojiCell)) {
                childAt.invalidate();
            }
        }
    }

    @Override
    public void dismissInternal() {
        super.dismissInternal();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.stickersDidLoad);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.recentDocumentsDidLoad);
    }

    public void setDelegate(StickerMasksAlertDelegate stickerMasksAlertDelegate) {
        this.delegate = stickerMasksAlertDelegate;
    }

    @Override
    public void setImageReceiverNumLevel(int i, int i2) {
        super.setImageReceiverNumLevel(i, i2);
        this.stickersTab.setImageReceiversLayerNum(i);
    }

    @Override
    public void setLastVisible(boolean z) {
    }
}
