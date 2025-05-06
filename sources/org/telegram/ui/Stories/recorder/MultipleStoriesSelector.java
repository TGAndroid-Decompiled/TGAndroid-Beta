package org.telegram.ui.Stories.recorder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.ContentUris;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.provider.MediaStore;
import android.text.TextUtils;
import android.util.Size;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Stories.recorder.MultipleStoriesSelector;

public abstract class MultipleStoriesSelector extends FrameLayout {
    private AnimatedFloat animatedHint;
    private final BlurringShader.StoryBlurDrawer backgroundBlur;
    private final BlurringShader.BlurManager blurManager;
    private ButtonBounce buttonBounce;
    private final RectF buttonBounds;
    private final RectF buttonTouchBounds;
    private final Path clipPath;
    private final Path closePath;
    private Text counter;
    private final Paint darkenBackground;
    private final Runnable hideHint;
    private Text hint;
    private final RectF hintArc;
    private final RectF hintBounds;
    private final Path hintClipPath;
    private boolean hintShown;
    private final RectF listBounds;
    private boolean listShown;
    private final UniversalRecyclerView listView;
    private final Theme.ResourcesProvider resourcesProvider;
    private ArrayList selectedOrder;
    private ArrayList selectedStories;
    private int selectedStory;
    private ArrayList stories;
    private final Paint strokePaint;

    public class AnonymousClass1 extends UniversalRecyclerView {
        AnonymousClass1(Context context, int i, int i2, boolean z, Utilities.Callback2 callback2, Utilities.Callback5 callback5, Utilities.Callback5Return callback5Return, Theme.ResourcesProvider resourcesProvider, int i3, int i4) {
            super(context, i, i2, z, callback2, callback5, callback5Return, resourcesProvider, i3, i4);
        }

        public void lambda$swappedElements$0(View view) {
            if (view instanceof EntryView) {
                MultipleStoriesSelector multipleStoriesSelector = MultipleStoriesSelector.this;
                ((EntryView) view).setPosition(multipleStoriesSelector.getPositionOf(multipleStoriesSelector.listView.getChildAdapterPosition(view)));
                view.setPressed(false);
            }
        }

        @Override
        public Integer getSelectorColor(int i) {
            return 0;
        }

        @Override
        protected void swappedElements() {
            AndroidUtilities.forEachViews((RecyclerView) MultipleStoriesSelector.this.listView, new Consumer() {
                @Override
                public final void accept(Object obj) {
                    MultipleStoriesSelector.AnonymousClass1.this.lambda$swappedElements$0((View) obj);
                }
            });
        }
    }

    public static class EntryView extends View {
        private AnimatedFloat animatedChecked;
        private AnimatedFloat animatedSelected;
        private ButtonBounce checkboxBounce;
        private boolean checked;
        private final AnimatedTextView.AnimatedTextDrawable counter;
        private float cx;
        private float cy;
        private final Paint fillPaint;
        private final ImageReceiver imageReceiver;
        private String lastEntryPath;
        private int lastId;
        private View.OnClickListener onCheckboxClick;
        private float r;
        private boolean selected;
        private final Paint strokePaint;

        public static class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            public static UItem asStoryEntry(int i, int i2, StoryEntry storyEntry) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.id = i;
                ofFactory.object = storyEntry;
                ofFactory.intValue = i2;
                return ofFactory;
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z) {
                EntryView entryView = (EntryView) view;
                entryView.set(uItem.id, uItem.intValue, (StoryEntry) uItem.object);
                entryView.setSelected(uItem.checked, false);
                entryView.setChecked(uItem.collapsed, false);
                entryView.setOnCheckboxClick(uItem.clickCallback);
            }

            @Override
            public EntryView createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new EntryView(context, resourcesProvider);
            }
        }

        public EntryView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            ImageReceiver imageReceiver = new ImageReceiver(this);
            this.imageReceiver = imageReceiver;
            Paint paint = new Paint(1);
            this.strokePaint = paint;
            Paint paint2 = new Paint(1);
            this.fillPaint = paint2;
            AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = new AnimatedTextView.AnimatedTextDrawable();
            this.counter = animatedTextDrawable;
            this.checkboxBounce = new ButtonBounce(this);
            this.lastId = -1;
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            this.animatedSelected = new AnimatedFloat(this, 0L, 320L, cubicBezierInterpolator);
            this.animatedChecked = new AnimatedFloat(this, 0L, 320L, cubicBezierInterpolator);
            animatedTextDrawable.setCallback(this);
            animatedTextDrawable.setTextColor(-1);
            animatedTextDrawable.setGravity(17);
            animatedTextDrawable.setTextSize(AndroidUtilities.dp(16.0f));
            animatedTextDrawable.setTypeface(AndroidUtilities.getTypeface("fonts/num.otf"));
            animatedTextDrawable.setOverrideFullWidth(AndroidUtilities.displaySize.x);
            animatedTextDrawable.setAnimationProperties(0.65f, 0L, 480L, cubicBezierInterpolator);
            animatedTextDrawable.setScaleProperty(0.35f);
            paint.setStyle(Paint.Style.STROKE);
            paint.setColor(-1);
            paint2.setColor(Theme.getColor(Theme.key_featuredStickers_addButton, resourcesProvider));
            imageReceiver.setRoundRadius(AndroidUtilities.dp(6.0f));
            ScaleStateListAnimator.apply(this);
        }

        public void lambda$set$0(Bitmap bitmap) {
            this.imageReceiver.setImageBitmap(bitmap);
        }

        public void lambda$set$1(StoryEntry storyEntry) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(storyEntry.draftThumbFile.getPath(), options);
            StoryEntry.setupScale(options, AndroidUtilities.dp(94.0f), AndroidUtilities.dp(112.0f));
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            options.inDither = true;
            options.inJustDecodeBounds = false;
            final Bitmap decodeFile = BitmapFactory.decodeFile(storyEntry.draftThumbFile.getPath(), options);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MultipleStoriesSelector.EntryView.this.lambda$set$0(decodeFile);
                }
            });
        }

        public void lambda$set$2(Bitmap bitmap) {
            this.imageReceiver.setImageBitmap(bitmap);
        }

        public void lambda$set$3(StoryEntry storyEntry) {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(storyEntry.file.getPath(), options);
            StoryEntry.setupScale(options, AndroidUtilities.dp(94.0f), AndroidUtilities.dp(112.0f));
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            options.inDither = true;
            options.inJustDecodeBounds = false;
            final Bitmap decodeFile = BitmapFactory.decodeFile(storyEntry.file.getPath(), options);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    MultipleStoriesSelector.EntryView.this.lambda$set$2(decodeFile);
                }
            });
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            this.imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(94.0f), AndroidUtilities.dp(112.0f));
            this.imageReceiver.draw(canvas);
            this.strokePaint.setStrokeWidth(AndroidUtilities.dp(1.5f));
            float f = this.animatedSelected.set(this.selected);
            if (f > 0.0f) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(96.0f), AndroidUtilities.dp(116.0f));
                this.strokePaint.setAlpha((int) (f * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), this.strokePaint);
            }
            this.cx = (getWidth() - AndroidUtilities.dp(17.163f)) - AndroidUtilities.dp(3.0f);
            this.cy = AndroidUtilities.dp(17.833f) + AndroidUtilities.dp(3.0f);
            this.r = AndroidUtilities.dp(12.833f);
            float f2 = this.animatedChecked.set(this.checked);
            float scale = this.checkboxBounce.getScale(0.075f);
            canvas.save();
            canvas.scale(scale, scale, this.cx, this.cy);
            if (f2 > 0.0f) {
                this.fillPaint.setAlpha((int) (f2 * 255.0f));
                canvas.drawCircle(this.cx, this.cy, this.r, this.fillPaint);
            }
            this.strokePaint.setAlpha(255);
            canvas.drawCircle(this.cx, this.cy, this.r - AndroidUtilities.dp(1.0f), this.strokePaint);
            if (f2 > 0.0f) {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.counter;
                float f3 = this.cx;
                float f4 = this.r;
                float f5 = this.cy;
                animatedTextDrawable.setBounds(f3 - f4, f5, f3 + f4, f5);
                this.counter.setAlpha((int) (f2 * 255.0f));
                this.counter.draw(canvas);
            }
            canvas.restore();
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.imageReceiver.onAttachedToWindow();
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.imageReceiver.onDetachedFromWindow();
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(98.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), 1073741824));
        }

        @Override
        public boolean onTouchEvent(android.view.MotionEvent r7) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.MultipleStoriesSelector.EntryView.onTouchEvent(android.view.MotionEvent):boolean");
        }

        public void set(int i, int i2, final StoryEntry storyEntry) {
            DispatchQueue dispatchQueue;
            Runnable runnable;
            String str;
            if (this.lastId != i) {
                this.lastEntryPath = null;
                this.imageReceiver.clearImage();
                this.lastId = i;
            }
            this.counter.setText(Integer.toString(i2 + 1), false);
            File file = storyEntry.draftThumbFile;
            if (file != null) {
                if (TextUtils.equals(this.lastEntryPath, file.getPath())) {
                    return;
                }
                this.lastEntryPath = storyEntry.draftThumbFile.getPath();
                dispatchQueue = Utilities.searchQueue;
                runnable = new Runnable() {
                    @Override
                    public final void run() {
                        MultipleStoriesSelector.EntryView.this.lambda$set$1(storyEntry);
                    }
                };
            } else {
                if (storyEntry.isVideo) {
                    Bitmap bitmap = storyEntry.blurredVideoThumb;
                    if (bitmap == null) {
                        bitmap = null;
                    }
                    if (bitmap == null && (str = storyEntry.thumbPath) != null && str.startsWith("vthumb://")) {
                        if (TextUtils.equals(this.lastEntryPath, storyEntry.thumbPath)) {
                            return;
                        }
                        String str2 = storyEntry.thumbPath;
                        this.lastEntryPath = str2;
                        long parseLong = Long.parseLong(str2.substring(9));
                        if (bitmap == null && Build.VERSION.SDK_INT >= 29) {
                            try {
                                bitmap = getContext().getContentResolver().loadThumbnail(ContentUris.withAppendedId(storyEntry.isVideo ? MediaStore.Video.Media.EXTERNAL_CONTENT_URI : MediaStore.Images.Media.EXTERNAL_CONTENT_URI, parseLong), new Size(AndroidUtilities.dp(94.0f), AndroidUtilities.dp(112.0f)), null);
                            } catch (Exception unused) {
                            }
                        }
                    }
                    this.imageReceiver.setImageBitmap(bitmap);
                    return;
                }
                File file2 = storyEntry.file;
                if (file2 == null || TextUtils.equals(this.lastEntryPath, file2.getPath())) {
                    return;
                }
                this.lastEntryPath = storyEntry.file.getPath();
                dispatchQueue = Utilities.searchQueue;
                runnable = new Runnable() {
                    @Override
                    public final void run() {
                        MultipleStoriesSelector.EntryView.this.lambda$set$3(storyEntry);
                    }
                };
            }
            dispatchQueue.postRunnable(runnable);
        }

        public void setChecked(boolean z, boolean z2) {
            if (this.checked == z) {
                return;
            }
            this.checked = z;
            if (!z2) {
                this.animatedChecked.force(z);
            }
            invalidate();
        }

        public void setOnCheckboxClick(View.OnClickListener onClickListener) {
            this.onCheckboxClick = onClickListener;
        }

        public void setPosition(int i) {
            this.counter.setText(i < 0 ? "" : Integer.toString(i + 1), true);
        }

        public void setSelected(boolean z, boolean z2) {
            if (this.selected == z) {
                return;
            }
            this.selected = z;
            if (!z2) {
                this.animatedSelected.force(z);
            }
            invalidate();
        }

        @Override
        protected boolean verifyDrawable(Drawable drawable) {
            return drawable == this.counter || super.verifyDrawable(drawable);
        }
    }

    public MultipleStoriesSelector(Context context, Theme.ResourcesProvider resourcesProvider, BlurringShader.BlurManager blurManager) {
        super(context);
        this.stories = new ArrayList();
        this.selectedOrder = new ArrayList();
        this.selectedStories = new ArrayList();
        this.hideHint = new Runnable() {
            @Override
            public final void run() {
                MultipleStoriesSelector.this.lambda$new$2();
            }
        };
        this.buttonBounce = new ButtonBounce(this);
        this.buttonBounds = new RectF();
        this.buttonTouchBounds = new RectF();
        Paint paint = new Paint(1);
        this.strokePaint = paint;
        Path path = new Path();
        this.closePath = path;
        this.listBounds = new RectF();
        this.darkenBackground = new Paint(1);
        this.hintBounds = new RectF();
        this.hintArc = new RectF();
        this.hintClipPath = new Path();
        this.animatedHint = new AnimatedFloat(this, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.clipPath = new Path();
        this.listShown = true;
        this.resourcesProvider = resourcesProvider;
        this.blurManager = blurManager;
        path.rewind();
        path.moveTo(-AndroidUtilities.dp(4.33f), -AndroidUtilities.dp(4.33f));
        path.lineTo(AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f));
        path.moveTo(-AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f));
        path.lineTo(AndroidUtilities.dp(4.33f), -AndroidUtilities.dp(4.33f));
        this.backgroundBlur = new BlurringShader.StoryBlurDrawer(blurManager, this, 0, !customBlur());
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(44.0f));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, UserConfig.selectedAccount, 0, false, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                MultipleStoriesSelector.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                MultipleStoriesSelector.this.onItemClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        }, null, resourcesProvider, -1, 0);
        this.listView = anonymousClass1;
        anonymousClass1.adapter.setApplyBackground(false);
        anonymousClass1.setClipToPadding(false);
        anonymousClass1.setClipChildren(false);
        anonymousClass1.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        addView(anonymousClass1, LayoutHelper.createFrame(-2, 120, 85));
        anonymousClass1.allowReorder(true);
        anonymousClass1.listenReorder(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                MultipleStoriesSelector.this.whenReordered(((Integer) obj).intValue(), (ArrayList) obj2);
            }
        });
        showList(false, false);
        setWillNotDraw(false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-1);
    }

    private void drawBlur(Canvas canvas, RectF rectF, float f, float f2) {
        Paint paint;
        int i;
        if (f2 < 1.0f) {
            canvas.saveLayerAlpha(rectF, (int) (255.0f * f2), 31);
        }
        if (customBlur()) {
            drawBlur(this.backgroundBlur, canvas, rectF, f, false, 0.0f, 0.0f, true, 1.0f);
            paint = this.darkenBackground;
            i = 38;
        } else {
            Paint[] paints = this.backgroundBlur.getPaints(1.0f, 0.0f, 0.0f);
            if (paints == null || paints[1] == null) {
                paint = this.darkenBackground;
                i = 128;
            } else {
                Paint paint2 = paints[0];
                if (paint2 != null) {
                    canvas.drawRoundRect(rectF, f, f, paint2);
                }
                Paint paint3 = paints[1];
                if (paint3 != null) {
                    canvas.drawRoundRect(rectF, f, f, paint3);
                }
                paint = this.darkenBackground;
                i = (int) (51.0f * f2);
            }
        }
        paint.setAlpha(i);
        canvas.drawRoundRect(rectF, f, f, this.darkenBackground);
        if (f2 < 1.0f) {
            canvas.restore();
        }
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        universalAdapter.reorderSectionStart();
        int i = 0;
        for (int i2 = 0; i2 < this.selectedOrder.size(); i2++) {
            Integer num = (Integer) this.selectedOrder.get(i2);
            final int intValue = num.intValue();
            arrayList.add(EntryView.Factory.asStoryEntry(intValue, i, (StoryEntry) this.stories.get(intValue)).setChecked(this.selectedStory == intValue).setCollapsed(this.selectedStories.contains(num)).setClickCallback(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    MultipleStoriesSelector.this.lambda$fillItems$1(intValue, view);
                }
            }));
            if (this.selectedStories.contains(num)) {
                i++;
            }
        }
        universalAdapter.reorderSectionEnd();
    }

    public int getPositionOf(int i) {
        if (!this.selectedOrder.contains(Integer.valueOf(i))) {
            return -1;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < Math.min(i, this.stories.size()); i3++) {
            if (this.selectedOrder.contains(Integer.valueOf(i3))) {
                i2++;
            }
        }
        return i2;
    }

    public void lambda$fillItems$1(int i, View view) {
        if (!this.selectedStories.contains(Integer.valueOf(i))) {
            this.selectedStories.add(Integer.valueOf(i));
        } else if (this.selectedStories.size() <= 1) {
            return;
        } else {
            this.selectedStories.remove(Integer.valueOf(i));
        }
        updateItemsAnimated();
    }

    public void lambda$new$2() {
        if (this.hintShown) {
            this.hintShown = false;
            invalidate();
        }
    }

    public void lambda$setSelected$3(int i, View view) {
        int childAdapterPosition;
        UItem item;
        if (!(view instanceof EntryView) || (item = this.listView.adapter.getItem((childAdapterPosition = this.listView.getChildAdapterPosition(view)))) == null) {
            return;
        }
        EntryView entryView = (EntryView) view;
        entryView.setPosition(getPositionOf(childAdapterPosition));
        entryView.setSelected(i == item.id, true);
        view.setPressed(false);
    }

    public void lambda$showList$4(ValueAnimator valueAnimator) {
        invalidate();
    }

    public void lambda$updateItemsAnimated$0(View view) {
        int childAdapterPosition;
        UItem item;
        if (!(view instanceof EntryView) || (item = this.listView.adapter.getItem((childAdapterPosition = this.listView.getChildAdapterPosition(view)))) == null) {
            return;
        }
        EntryView entryView = (EntryView) view;
        entryView.setPosition(getPositionOf(childAdapterPosition));
        entryView.setSelected(this.selectedStory == item.id, true);
        entryView.setChecked(this.selectedStories.contains(Integer.valueOf(item.id)), true);
        view.setPressed(false);
    }

    public void onItemClick(UItem uItem, View view, int i, float f, float f2) {
        onSwitchToStory(uItem.id, (StoryEntry) uItem.object);
    }

    private void updateItemsAnimated() {
        AndroidUtilities.forEachViews((RecyclerView) this.listView, new Consumer() {
            @Override
            public final void accept(Object obj) {
                MultipleStoriesSelector.this.lambda$updateItemsAnimated$0((View) obj);
            }
        });
    }

    public void whenReordered(int i, ArrayList arrayList) {
        this.selectedOrder.clear();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.selectedOrder.add(Integer.valueOf(((UItem) it.next()).id));
        }
        updateItemsAnimated();
    }

    protected abstract boolean customBlur();

    @Override
    protected void dispatchDraw(Canvas canvas) {
        float scale = this.buttonBounce.getScale(0.1f);
        canvas.save();
        this.buttonBounds.set(getWidth() - AndroidUtilities.dp(42.0f), getHeight() - AndroidUtilities.dp(34.0f), getWidth() - AndroidUtilities.dp(12.0f), getHeight() - AndroidUtilities.dp(4.0f));
        this.buttonTouchBounds.set(this.buttonBounds);
        this.buttonTouchBounds.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        canvas.scale(scale, scale, this.buttonBounds.centerX(), this.buttonBounds.centerY());
        RectF rectF = this.buttonBounds;
        drawBlur(canvas, rectF, rectF.width() / 2.0f, 1.0f);
        this.strokePaint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        this.strokePaint.setAlpha(255);
        canvas.drawCircle(this.buttonBounds.centerX(), this.buttonBounds.centerY(), (this.buttonBounds.width() / 2.0f) - AndroidUtilities.dp(0.9f), this.strokePaint);
        Text text = this.counter;
        if (text != null) {
            text.draw(canvas, this.buttonBounds.centerX() - (this.counter.getCurrentWidth() / 2.0f), this.buttonBounds.centerY() - AndroidUtilities.dp(0.6f), -1, 1.0f - this.listView.getAlpha());
        }
        if (this.listView.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(this.buttonBounds.centerX(), this.buttonBounds.centerY());
            this.strokePaint.setAlpha((int) (this.listView.getAlpha() * 255.0f));
            canvas.drawPath(this.closePath, this.strokePaint);
            canvas.restore();
        }
        canvas.restore();
        if (this.hint != null) {
            float f = this.animatedHint.set(this.hintShown);
            if (f > 0.0f) {
                float lerp = AndroidUtilities.lerp(0.6f, 1.0f, f);
                float dp = AndroidUtilities.dp(11.0f) + this.hint.getWidth() + AndroidUtilities.dp(11.0f);
                float dp2 = AndroidUtilities.dp(32.0f);
                RectF rectF2 = this.hintBounds;
                RectF rectF3 = this.buttonBounds;
                float f2 = rectF3.right - dp;
                float dp3 = (rectF3.top - AndroidUtilities.dp(9.66f)) - dp2;
                RectF rectF4 = this.buttonBounds;
                rectF2.set(f2, dp3, rectF4.right, rectF4.top - AndroidUtilities.dp(9.66f));
                RectF rectF5 = this.hintBounds;
                float width = rectF5.right - (rectF5.width() * lerp);
                RectF rectF6 = this.hintBounds;
                float height = rectF6.bottom - (rectF6.height() * lerp);
                RectF rectF7 = this.hintBounds;
                rectF5.set(width, height, rectF7.right, rectF7.bottom);
                this.hintBounds.offset(0.0f, AndroidUtilities.dp(4.0f) * (1.0f - f));
                this.hintClipPath.rewind();
                float dp4 = AndroidUtilities.dp(8.0f);
                RectF rectF8 = this.hintArc;
                RectF rectF9 = this.hintBounds;
                float f3 = rectF9.left;
                float f4 = rectF9.top;
                rectF8.set(f3, f4, f3 + dp4, f4 + dp4);
                this.hintClipPath.arcTo(this.hintArc, 180.0f, 90.0f, false);
                RectF rectF10 = this.hintArc;
                RectF rectF11 = this.hintBounds;
                float f5 = rectF11.right;
                float f6 = rectF11.top;
                rectF10.set(f5 - dp4, f6, f5, f6 + dp4);
                this.hintClipPath.arcTo(this.hintArc, 270.0f, 90.0f, false);
                RectF rectF12 = this.hintArc;
                RectF rectF13 = this.hintBounds;
                float f7 = rectF13.right;
                float f8 = rectF13.bottom;
                rectF12.set(f7 - dp4, f8 - dp4, f7, f8);
                this.hintClipPath.arcTo(this.hintArc, 0.0f, 90.0f, false);
                this.hintClipPath.lineTo(this.hintBounds.right - AndroidUtilities.dp(8.0f), this.hintBounds.bottom);
                this.hintClipPath.lineTo(this.hintBounds.right - AndroidUtilities.dp(14.5f), this.hintBounds.bottom + AndroidUtilities.dp(5.66f));
                this.hintClipPath.lineTo(this.hintBounds.right - AndroidUtilities.dp(21.0f), this.hintBounds.bottom);
                RectF rectF14 = this.hintArc;
                RectF rectF15 = this.hintBounds;
                float f9 = rectF15.left;
                float f10 = rectF15.bottom;
                rectF14.set(f9, f10 - dp4, f9 + dp4, f10);
                this.hintClipPath.arcTo(this.hintArc, 90.0f, 90.0f, false);
                this.hintClipPath.close();
                this.hintBounds.bottom += AndroidUtilities.dp(5.66f);
                canvas.save();
                canvas.clipPath(this.hintClipPath);
                drawBlur(canvas, this.hintBounds, dp4, f);
                canvas.restore();
                canvas.save();
                RectF rectF16 = this.hintBounds;
                canvas.scale(lerp, lerp, rectF16.right, rectF16.bottom);
                this.hint.draw(canvas, AndroidUtilities.dp(11.0f) + (this.buttonBounds.right - dp), (this.buttonBounds.top - AndroidUtilities.dp(9.66f)) - (dp2 / 2.0f), -1, f);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    protected abstract void drawBlur(BlurringShader.StoryBlurDrawer storyBlurDrawer, Canvas canvas, RectF rectF, float f, boolean z, float f2, float f3, boolean z2, float f4);

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        UniversalRecyclerView universalRecyclerView = this.listView;
        if (view != universalRecyclerView) {
            return super.drawChild(canvas, view, j);
        }
        this.listBounds.set(universalRecyclerView.getX(), this.listView.getY(), this.listView.getX() + this.listView.getWidth(), this.listView.getY() + this.listView.getHeight());
        AndroidUtilities.scaleRect(this.listBounds, this.listView.getScaleX(), this.listView.getX() + this.listView.getPivotX(), this.listView.getY() + this.listView.getPivotY());
        drawBlur(canvas, this.listBounds, AndroidUtilities.dp(10.0f), this.listView.getAlpha());
        this.clipPath.rewind();
        this.clipPath.addRoundRect(this.listBounds, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(this.clipPath);
        boolean drawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return drawChild;
    }

    public boolean onBackPressed() {
        if (!this.listShown) {
            return false;
        }
        showList(false, true);
        return true;
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.listView.setPivotX(r1.getWidth() - AndroidUtilities.dp(15.0f));
        this.listView.setPivotY(r1.getHeight());
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(176.0f), 1073741824));
    }

    protected abstract void onSwitchToStory(int i, StoryEntry storyEntry);

    @Override
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Stories.recorder.MultipleStoriesSelector.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void set(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        showList(false, false);
        this.stories = arrayList;
        this.selectedOrder = arrayList2;
        this.selectedStories = arrayList3;
        this.counter = new Text(Integer.toString(arrayList.size()), 20.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
        this.hint = new Text(LocaleController.formatPluralStringComma("HintViewStoriesMultiple", arrayList.size()), 14.0f);
        this.listView.adapter.update(false);
    }

    public void setSelected(final int i) {
        if (this.selectedStory == i) {
            return;
        }
        this.selectedStory = i;
        AndroidUtilities.forEachViews((RecyclerView) this.listView, new Consumer() {
            @Override
            public final void accept(Object obj) {
                MultipleStoriesSelector.this.lambda$setSelected$3(i, (View) obj);
            }
        });
    }

    public void showHint() {
        int i;
        if (this.hintShown || this.listShown || (i = MessagesController.getGlobalMainSettings().getInt("multistorieshint", 0)) >= 3) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putInt("multistorieshint", i + 1).apply();
        AndroidUtilities.cancelRunOnUIThread(this.hideHint);
        this.hintShown = true;
        invalidate();
        AndroidUtilities.runOnUIThread(this.hideHint, 5500L);
    }

    public void showList(final boolean z, boolean z2) {
        if (this.listShown == z) {
            return;
        }
        this.listShown = z;
        this.listView.animate().cancel();
        if (z2) {
            this.listView.setVisibility(0);
            this.listView.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.65f).scaleY(z ? 1.0f : 0.65f).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (z) {
                        return;
                    }
                    MultipleStoriesSelector.this.listView.setVisibility(8);
                }
            }).setUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    MultipleStoriesSelector.this.lambda$showList$4(valueAnimator);
                }
            }).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(360L).start();
        } else {
            this.listView.setVisibility(z ? 0 : 8);
            this.listView.setAlpha(z ? 1.0f : 0.0f);
            this.listView.setScaleX(z ? 1.0f : 0.65f);
            this.listView.setScaleY(z ? 1.0f : 0.65f);
            invalidate();
        }
        if (z && this.hintShown) {
            this.hintShown = false;
            invalidate();
        }
    }

    public void update() {
        this.listView.adapter.update(false);
    }
}
