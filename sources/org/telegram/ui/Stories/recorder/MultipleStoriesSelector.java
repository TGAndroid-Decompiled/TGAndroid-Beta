package org.telegram.ui.Stories.recorder;

import android.app.Activity;
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
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.util.Consumer;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BlurringShader;
import org.telegram.ui.Components.ButtonBounce;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.Text;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Stories.DarkThemeResourceProvider;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda29;

public abstract class MultipleStoriesSelector extends FrameLayout {
    public final AnimatedFloat animatedHint;
    public final BlurringShader.StoryBlurDrawer backgroundBlur;
    public final ButtonBounce buttonBounce;
    public final RectF buttonBounds;
    public final RectF buttonTouchBounds;
    public final Path clipPath;
    public final Path closePath;
    public Text counter;
    public final Paint darkenBackground;
    public final PreviewView$$ExternalSyntheticLambda12 hideHint;
    public Text hint;
    public final RectF hintArc;
    public final RectF hintBounds;
    public final Path hintClipPath;
    public boolean hintShown;
    public final RectF listBounds;
    public boolean listShown;
    public final AnonymousClass1 listView;
    public ArrayList selectedOrder;
    public ArrayList selectedStories;
    public int selectedStory;
    public ArrayList stories;
    public final Paint strokePaint;

    public final class AnonymousClass1 extends UniversalRecyclerView {
        public final StoryRecorder.AnonymousClass11 this$0;

        public AnonymousClass1(StoryRecorder.AnonymousClass11 anonymousClass11, Activity activity, int i, MultipleStoriesSelector$$ExternalSyntheticLambda1 multipleStoriesSelector$$ExternalSyntheticLambda1, Weather$$ExternalSyntheticLambda7 weather$$ExternalSyntheticLambda7, DarkThemeResourceProvider darkThemeResourceProvider) {
            super(activity, i, 0, false, multipleStoriesSelector$$ExternalSyntheticLambda1, weather$$ExternalSyntheticLambda7, null, darkThemeResourceProvider, -1, 0);
            this.this$0 = anonymousClass11;
        }

        @Override
        public final Integer getSelectorColor(int i) {
            return 0;
        }

        @Override
        public final void swappedElements() {
            StoryRecorder.AnonymousClass11 anonymousClass11 = this.this$0;
            AndroidUtilities.forEachViews((RecyclerView) anonymousClass11.listView, (Consumer) new SelectAudioAlert$$ExternalSyntheticLambda5(this, 2));
        }
    }

    public final class EntryView extends View {
        public final AnimatedFloat animatedChecked;
        public final AnimatedFloat animatedSelected;
        public final ButtonBounce checkboxBounce;
        public boolean checked;
        public final AnimatedTextView.AnimatedTextDrawable counter;
        public float cx;
        public float cy;
        public final Paint fillPaint;
        public final ImageReceiver imageReceiver;
        public String lastEntryPath;
        public int lastId;
        public View.OnClickListener onCheckboxClick;
        public float r;
        public boolean selected;
        public final Paint strokePaint;

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                String str;
                final EntryView entryView = (EntryView) view;
                int i = uItem.id;
                int i2 = uItem.intValue;
                final StoryEntry storyEntry = (StoryEntry) uItem.object;
                if (entryView.lastId != i) {
                    entryView.lastEntryPath = null;
                    entryView.imageReceiver.clearImage();
                    entryView.lastId = i;
                }
                entryView.counter.setText(Integer.toString(i2 + 1), false);
                File file = storyEntry.draftThumbFile;
                if (file != null) {
                    if (!TextUtils.equals(entryView.lastEntryPath, file.getPath())) {
                        entryView.lastEntryPath = storyEntry.draftThumbFile.getPath();
                        final int i3 = 0;
                        Utilities.searchQueue.postRunnable(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i3) {
                                    case 0:
                                        final MultipleStoriesSelector.EntryView entryView2 = entryView;
                                        entryView2.getClass();
                                        BitmapFactory.Options options = new BitmapFactory.Options();
                                        options.inJustDecodeBounds = true;
                                        StoryEntry storyEntry2 = storyEntry;
                                        BitmapFactory.decodeFile(storyEntry2.draftThumbFile.getPath(), options);
                                        int iDp = AndroidUtilities.dp(94.0f);
                                        AndroidUtilities.dp(112.0f);
                                        StoryEntry.setupScale(options, iDp);
                                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                        options.inDither = true;
                                        options.inJustDecodeBounds = false;
                                        final Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(storyEntry2.draftThumbFile.getPath(), options);
                                        final int i4 = 1;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (i4) {
                                                    case 0:
                                                        entryView2.imageReceiver.setImageBitmap(bitmapDecodeFile);
                                                        break;
                                                    default:
                                                        entryView2.imageReceiver.setImageBitmap(bitmapDecodeFile);
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final MultipleStoriesSelector.EntryView entryView3 = entryView;
                                        entryView3.getClass();
                                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                                        options2.inJustDecodeBounds = true;
                                        StoryEntry storyEntry3 = storyEntry;
                                        BitmapFactory.decodeFile(storyEntry3.file.getPath(), options2);
                                        int iDp2 = AndroidUtilities.dp(94.0f);
                                        AndroidUtilities.dp(112.0f);
                                        StoryEntry.setupScale(options2, iDp2);
                                        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                        options2.inDither = true;
                                        options2.inJustDecodeBounds = false;
                                        final Bitmap bitmapDecodeFile2 = BitmapFactory.decodeFile(storyEntry3.file.getPath(), options2);
                                        final int i5 = 0;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (i5) {
                                                    case 0:
                                                        entryView3.imageReceiver.setImageBitmap(bitmapDecodeFile2);
                                                        break;
                                                    default:
                                                        entryView3.imageReceiver.setImageBitmap(bitmapDecodeFile2);
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                }
                            }
                        });
                    }
                } else if (storyEntry.isVideo) {
                    Bitmap bitmap = storyEntry.blurredVideoThumb;
                    Bitmap bitmapLoadThumbnail = bitmap != null ? bitmap : null;
                    if (bitmapLoadThumbnail != null || (str = storyEntry.thumbPath) == null || !str.startsWith("vthumb://")) {
                        entryView.imageReceiver.setImageBitmap(bitmapLoadThumbnail);
                    } else if (!TextUtils.equals(entryView.lastEntryPath, storyEntry.thumbPath)) {
                        String str2 = storyEntry.thumbPath;
                        entryView.lastEntryPath = str2;
                        long j = Long.parseLong(str2.substring(9));
                        if (bitmapLoadThumbnail == null && Build.VERSION.SDK_INT >= 29) {
                            try {
                                bitmapLoadThumbnail = entryView.getContext().getContentResolver().loadThumbnail(storyEntry.isVideo ? ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, j) : ContentUris.withAppendedId(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, j), new Size(AndroidUtilities.dp(94.0f), AndroidUtilities.dp(112.0f)), null);
                            } catch (Exception unused) {
                            }
                        }
                        entryView.imageReceiver.setImageBitmap(bitmapLoadThumbnail);
                    }
                } else {
                    File file2 = storyEntry.file;
                    if (file2 != null && !TextUtils.equals(entryView.lastEntryPath, file2.getPath())) {
                        entryView.lastEntryPath = storyEntry.file.getPath();
                        final int i4 = 1;
                        Utilities.searchQueue.postRunnable(new Runnable() {
                            @Override
                            public final void run() {
                                switch (i4) {
                                    case 0:
                                        final MultipleStoriesSelector.EntryView entryView2 = entryView;
                                        entryView2.getClass();
                                        BitmapFactory.Options options = new BitmapFactory.Options();
                                        options.inJustDecodeBounds = true;
                                        StoryEntry storyEntry2 = storyEntry;
                                        BitmapFactory.decodeFile(storyEntry2.draftThumbFile.getPath(), options);
                                        int iDp = AndroidUtilities.dp(94.0f);
                                        AndroidUtilities.dp(112.0f);
                                        StoryEntry.setupScale(options, iDp);
                                        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                        options.inDither = true;
                                        options.inJustDecodeBounds = false;
                                        final Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(storyEntry2.draftThumbFile.getPath(), options);
                                        final int i5 = 1;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (i5) {
                                                    case 0:
                                                        entryView2.imageReceiver.setImageBitmap(bitmapDecodeFile);
                                                        break;
                                                    default:
                                                        entryView2.imageReceiver.setImageBitmap(bitmapDecodeFile);
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                    default:
                                        final MultipleStoriesSelector.EntryView entryView3 = entryView;
                                        entryView3.getClass();
                                        BitmapFactory.Options options2 = new BitmapFactory.Options();
                                        options2.inJustDecodeBounds = true;
                                        StoryEntry storyEntry3 = storyEntry;
                                        BitmapFactory.decodeFile(storyEntry3.file.getPath(), options2);
                                        int iDp2 = AndroidUtilities.dp(94.0f);
                                        AndroidUtilities.dp(112.0f);
                                        StoryEntry.setupScale(options2, iDp2);
                                        options2.inPreferredConfig = Bitmap.Config.ARGB_8888;
                                        options2.inDither = true;
                                        options2.inJustDecodeBounds = false;
                                        final Bitmap bitmapDecodeFile2 = BitmapFactory.decodeFile(storyEntry3.file.getPath(), options2);
                                        final int i6 = 0;
                                        AndroidUtilities.runOnUIThread(new Runnable() {
                                            @Override
                                            public final void run() {
                                                switch (i6) {
                                                    case 0:
                                                        entryView3.imageReceiver.setImageBitmap(bitmapDecodeFile2);
                                                        break;
                                                    default:
                                                        entryView3.imageReceiver.setImageBitmap(bitmapDecodeFile2);
                                                        break;
                                                }
                                            }
                                        });
                                        break;
                                }
                            }
                        });
                    }
                }
                boolean z2 = uItem.checked;
                if (entryView.selected != z2) {
                    entryView.selected = z2;
                    entryView.animatedSelected.force(z2);
                    entryView.invalidate();
                }
                boolean z3 = uItem.collapsed;
                if (entryView.checked != z3) {
                    entryView.checked = z3;
                    entryView.animatedChecked.force(z3);
                    entryView.invalidate();
                }
                entryView.setOnCheckboxClick(uItem.clickCallback);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
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

        @Override
        public final void dispatchDraw(Canvas canvas) {
            super.dispatchDraw(canvas);
            ImageReceiver imageReceiver = this.imageReceiver;
            imageReceiver.setImageCoords(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(94.0f), AndroidUtilities.dp(112.0f));
            imageReceiver.draw(canvas);
            Paint paint = this.strokePaint;
            paint.setStrokeWidth(AndroidUtilities.dp(1.5f));
            float f = this.animatedSelected.set(this.selected);
            if (f > 0.0f) {
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(96.0f), AndroidUtilities.dp(116.0f));
                paint.setAlpha((int) (f * 255.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
            }
            this.cx = (getWidth() - AndroidUtilities.dp(17.163f)) - AndroidUtilities.dp(3.0f);
            this.cy = AndroidUtilities.dp(3.0f) + AndroidUtilities.dp(17.833f);
            this.r = AndroidUtilities.dp(12.833f);
            float f2 = this.animatedChecked.set(this.checked);
            float scale = this.checkboxBounce.getScale(0.075f);
            canvas.save();
            canvas.scale(scale, scale, this.cx, this.cy);
            if (f2 > 0.0f) {
                Paint paint2 = this.fillPaint;
                paint2.setAlpha((int) (f2 * 255.0f));
                canvas.drawCircle(this.cx, this.cy, this.r, paint2);
            }
            paint.setAlpha(255);
            canvas.drawCircle(this.cx, this.cy, this.r - AndroidUtilities.dp(1.0f), paint);
            if (f2 > 0.0f) {
                AnimatedTextView.AnimatedTextDrawable animatedTextDrawable = this.counter;
                float f3 = this.cx;
                float f4 = this.r;
                float f5 = this.cy;
                animatedTextDrawable.setBounds(f3 - f4, f5, f3 + f4, f5);
                animatedTextDrawable.setAlpha((int) (f2 * 255.0f));
                animatedTextDrawable.draw(canvas);
            }
            canvas.restore();
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.imageReceiver.onAttachedToWindow();
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.imageReceiver.onDetachedFromWindow();
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(98.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(120.0f), 1073741824));
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            View.OnClickListener onClickListener;
            boolean z = motionEvent.getX() >= this.cx - ((float) AndroidUtilities.dp(14.0f)) && motionEvent.getX() <= this.cx + ((float) AndroidUtilities.dp(14.0f)) && motionEvent.getY() >= this.cy - ((float) AndroidUtilities.dp(14.0f)) && motionEvent.getY() <= this.cy + ((float) AndroidUtilities.dp(14.0f));
            int action = motionEvent.getAction();
            ButtonBounce buttonBounce = this.checkboxBounce;
            if (action == 0) {
                buttonBounce.setPressed(z);
            } else if (motionEvent.getAction() == 1) {
                if (buttonBounce.isPressed() && z && (onClickListener = this.onCheckboxClick) != null) {
                    onClickListener.onClick(this);
                }
                buttonBounce.setPressed(false);
            } else if (motionEvent.getAction() == 3) {
                buttonBounce.setPressed(false);
            }
            return buttonBounce.isPressed() || super.onTouchEvent(motionEvent);
        }

        public void setOnCheckboxClick(View.OnClickListener onClickListener) {
            this.onCheckboxClick = onClickListener;
        }

        public void setPosition(int i) {
            this.counter.setText(i < 0 ? "" : Integer.toString(i + 1), true);
        }

        @Override
        public final boolean verifyDrawable(Drawable drawable) {
            return drawable == this.counter || super.verifyDrawable(drawable);
        }
    }

    public MultipleStoriesSelector(Activity activity, DarkThemeResourceProvider darkThemeResourceProvider, BlurringShader.BlurManager blurManager) {
        super(activity);
        this.stories = new ArrayList();
        this.selectedOrder = new ArrayList();
        this.selectedStories = new ArrayList();
        final StoryRecorder.AnonymousClass11 anonymousClass11 = (StoryRecorder.AnonymousClass11) this;
        this.hideHint = new PreviewView$$ExternalSyntheticLambda12(anonymousClass11, 15);
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
        path.rewind();
        path.moveTo(-AndroidUtilities.dp(4.33f), -AndroidUtilities.dp(4.33f));
        path.lineTo(AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f));
        path.moveTo(-AndroidUtilities.dp(4.33f), AndroidUtilities.dp(4.33f));
        path.lineTo(AndroidUtilities.dp(4.33f), -AndroidUtilities.dp(4.33f));
        StoryRecorder.AnonymousClass11 anonymousClass12 = (StoryRecorder.AnonymousClass11) this;
        this.backgroundBlur = new BlurringShader.StoryBlurDrawer(blurManager, this, 0, !StoryRecorder.this.blurManager.hasRenderNode());
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(44.0f));
        final int i = 0;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(anonymousClass12, activity, UserConfig.selectedAccount, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                int i2 = 0;
                StoryRecorder.AnonymousClass11 anonymousClass13 = anonymousClass11;
                switch (i) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        UniversalAdapter universalAdapter = (UniversalAdapter) obj2;
                        universalAdapter.reorderSectionStart();
                        int i3 = 0;
                        for (int i4 = 0; i4 < anonymousClass13.selectedOrder.size(); i4++) {
                            Integer num = (Integer) anonymousClass13.selectedOrder.get(i4);
                            int iIntValue = num.intValue();
                            StoryEntry storyEntry = (StoryEntry) anonymousClass13.stories.get(iIntValue);
                            int i5 = MultipleStoriesSelector.EntryView.Factory.$r8$clinit;
                            UItem uItemOfFactory = UItem.ofFactory(MultipleStoriesSelector.EntryView.Factory.class);
                            uItemOfFactory.id = iIntValue;
                            uItemOfFactory.object = storyEntry;
                            uItemOfFactory.intValue = i3;
                            arrayList.add(uItemOfFactory.setChecked(anonymousClass13.selectedStory == iIntValue).setCollapsed(anonymousClass13.selectedStories.contains(num)).setClickCallback(new RichEditor$$ExternalSyntheticLambda29(anonymousClass13, iIntValue, 8)));
                            if (anonymousClass13.selectedStories.contains(num)) {
                                i3++;
                            }
                        }
                        universalAdapter.reorderSectionEnd();
                        break;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        anonymousClass13.selectedOrder.clear();
                        int size = arrayList2.size();
                        while (i2 < size) {
                            Object obj3 = arrayList2.get(i2);
                            i2++;
                            anonymousClass13.selectedOrder.add(Integer.valueOf(((UItem) obj3).id));
                        }
                        AndroidUtilities.forEachViews((RecyclerView) anonymousClass13.listView, (Consumer) new SelectAudioAlert$$ExternalSyntheticLambda5(anonymousClass13, 1));
                        break;
                }
            }
        }, new Weather$$ExternalSyntheticLambda7(anonymousClass11, 4), darkThemeResourceProvider);
        this.listView = anonymousClass1;
        anonymousClass1.adapter.setApplyBackground(false);
        anonymousClass1.setClipToPadding(false);
        anonymousClass1.setClipChildren(false);
        anonymousClass1.setPadding(AndroidUtilities.dp(2.0f), 0, AndroidUtilities.dp(2.0f), 0);
        addView(anonymousClass1, LayoutHelper.createFrame(-2, 120, 85));
        anonymousClass1.allowReorder(true);
        final int i2 = 1;
        anonymousClass1.listenReorder(new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                int i3 = 0;
                StoryRecorder.AnonymousClass11 anonymousClass13 = anonymousClass11;
                switch (i2) {
                    case 0:
                        ArrayList arrayList = (ArrayList) obj;
                        UniversalAdapter universalAdapter = (UniversalAdapter) obj2;
                        universalAdapter.reorderSectionStart();
                        int i4 = 0;
                        for (int i5 = 0; i5 < anonymousClass13.selectedOrder.size(); i5++) {
                            Integer num = (Integer) anonymousClass13.selectedOrder.get(i5);
                            int iIntValue = num.intValue();
                            StoryEntry storyEntry = (StoryEntry) anonymousClass13.stories.get(iIntValue);
                            int i6 = MultipleStoriesSelector.EntryView.Factory.$r8$clinit;
                            UItem uItemOfFactory = UItem.ofFactory(MultipleStoriesSelector.EntryView.Factory.class);
                            uItemOfFactory.id = iIntValue;
                            uItemOfFactory.object = storyEntry;
                            uItemOfFactory.intValue = i4;
                            arrayList.add(uItemOfFactory.setChecked(anonymousClass13.selectedStory == iIntValue).setCollapsed(anonymousClass13.selectedStories.contains(num)).setClickCallback(new RichEditor$$ExternalSyntheticLambda29(anonymousClass13, iIntValue, 8)));
                            if (anonymousClass13.selectedStories.contains(num)) {
                                i4++;
                            }
                        }
                        universalAdapter.reorderSectionEnd();
                        break;
                    default:
                        ((Integer) obj).getClass();
                        ArrayList arrayList2 = (ArrayList) obj2;
                        anonymousClass13.selectedOrder.clear();
                        int size = arrayList2.size();
                        while (i3 < size) {
                            Object obj3 = arrayList2.get(i3);
                            i3++;
                            anonymousClass13.selectedOrder.add(Integer.valueOf(((UItem) obj3).id));
                        }
                        AndroidUtilities.forEachViews((RecyclerView) anonymousClass13.listView, (Consumer) new SelectAudioAlert$$ExternalSyntheticLambda5(anonymousClass13, 1));
                        break;
                }
            }
        }, true);
        showList(false, false);
        setWillNotDraw(false);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setColor(-1);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float scale = this.buttonBounce.getScale(0.1f);
        canvas.save();
        RectF rectF = this.buttonBounds;
        rectF.set(getWidth() - AndroidUtilities.dp(42.0f), getHeight() - AndroidUtilities.dp(34.0f), getWidth() - AndroidUtilities.dp(12.0f), getHeight() - AndroidUtilities.dp(4.0f));
        RectF rectF2 = this.buttonTouchBounds;
        rectF2.set(rectF);
        rectF2.inset(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
        canvas.scale(scale, scale, rectF.centerX(), rectF.centerY());
        drawBlur(canvas, rectF, rectF.width() / 2.0f, 1.0f);
        Paint paint = this.strokePaint;
        paint.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint.setAlpha(255);
        canvas.drawCircle(rectF.centerX(), rectF.centerY(), (rectF.width() / 2.0f) - AndroidUtilities.dp(0.9f), paint);
        Text text = this.counter;
        AnonymousClass1 anonymousClass1 = this.listView;
        if (text != null) {
            text.draw(canvas, rectF.centerX() - (this.counter.getCurrentWidth() / 2.0f), rectF.centerY() - AndroidUtilities.dp(0.6f), -1, 1.0f - anonymousClass1.getAlpha());
        }
        if (anonymousClass1.getAlpha() > 0.0f) {
            canvas.save();
            canvas.translate(rectF.centerX(), rectF.centerY());
            paint.setAlpha((int) (anonymousClass1.getAlpha() * 255.0f));
            canvas.drawPath(this.closePath, paint);
            canvas.restore();
        }
        canvas.restore();
        if (this.hint != null) {
            float f = this.animatedHint.set(this.hintShown);
            if (f > 0.0f) {
                float fLerp = AndroidUtilities.lerp(0.6f, 1.0f, f);
                float width = this.hint.getWidth() + AndroidUtilities.dp(11.0f) + AndroidUtilities.dp(11.0f);
                float fDp = AndroidUtilities.dp(32.0f);
                RectF rectF3 = this.hintBounds;
                rectF3.set(rectF.right - width, (rectF.top - AndroidUtilities.dp(9.66f)) - fDp, rectF.right, rectF.top - AndroidUtilities.dp(9.66f));
                rectF3.set(rectF3.right - (rectF3.width() * fLerp), rectF3.bottom - (rectF3.height() * fLerp), rectF3.right, rectF3.bottom);
                rectF3.offset(0.0f, (1.0f - f) * AndroidUtilities.dp(4.0f));
                Path path = this.hintClipPath;
                path.rewind();
                float fDp2 = AndroidUtilities.dp(8.0f);
                RectF rectF4 = this.hintArc;
                float f2 = rectF3.left;
                float f3 = rectF3.top;
                rectF4.set(f2, f3, f2 + fDp2, f3 + fDp2);
                path.arcTo(rectF4, 180.0f, 90.0f, false);
                float f4 = rectF3.right;
                float f5 = rectF3.top;
                rectF4.set(f4 - fDp2, f5, f4, f5 + fDp2);
                path.arcTo(rectF4, 270.0f, 90.0f, false);
                float f6 = rectF3.right;
                float f7 = rectF3.bottom;
                rectF4.set(f6 - fDp2, f7 - fDp2, f6, f7);
                path.arcTo(rectF4, 0.0f, 90.0f, false);
                path.lineTo(rectF3.right - AndroidUtilities.dp(8.0f), rectF3.bottom);
                path.lineTo(rectF3.right - AndroidUtilities.dp(14.5f), rectF3.bottom + AndroidUtilities.dp(5.66f));
                path.lineTo(rectF3.right - AndroidUtilities.dp(21.0f), rectF3.bottom);
                float f8 = rectF3.left;
                float f9 = rectF3.bottom;
                rectF4.set(f8, f9 - fDp2, f8 + fDp2, f9);
                path.arcTo(rectF4, 90.0f, 90.0f, false);
                path.close();
                rectF3.bottom += AndroidUtilities.dp(5.66f);
                canvas.save();
                canvas.clipPath(path);
                drawBlur(canvas, rectF3, fDp2, f);
                canvas.restore();
                canvas.save();
                canvas.scale(fLerp, fLerp, rectF3.right, rectF3.bottom);
                this.hint.draw(canvas, (rectF.right - width) + AndroidUtilities.dp(11.0f), (rectF.top - AndroidUtilities.dp(9.66f)) - (fDp / 2.0f), -1, f);
                canvas.restore();
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void drawBlur(Canvas canvas, RectF rectF, float f, float f2) {
        if (f2 < 1.0f) {
            canvas.saveLayerAlpha(rectF, (int) (255.0f * f2), 31);
        }
        boolean zHasRenderNode = StoryRecorder.this.blurManager.hasRenderNode();
        Paint paint = this.darkenBackground;
        BlurringShader.StoryBlurDrawer storyBlurDrawer = this.backgroundBlur;
        if (zHasRenderNode) {
            StoryRecorder.AnonymousClass11 anonymousClass11 = (StoryRecorder.AnonymousClass11) this;
            if (canvas.isHardwareAccelerated()) {
                canvas.save();
                Path path = anonymousClass11.path;
                path.rewind();
                path.addRoundRect(rectF, f, f, Path.Direction.CW);
                canvas.clipPath(path);
                canvas.translate(0.0f, 0.0f);
                storyBlurDrawer.drawRect(canvas, 0.0f, 0.0f, 1.0f);
                canvas.restore();
            }
            paint.setAlpha(38);
            canvas.drawRoundRect(rectF, f, f, paint);
        } else {
            Paint[] paints = storyBlurDrawer.getPaints(1.0f, 0.0f, 0.0f);
            if (paints == null || paints[1] == null) {
                paint.setAlpha(128);
                canvas.drawRoundRect(rectF, f, f, paint);
            } else {
                Paint paint2 = paints[0];
                if (paint2 != null) {
                    canvas.drawRoundRect(rectF, f, f, paint2);
                }
                Paint paint3 = paints[1];
                if (paint3 != null) {
                    canvas.drawRoundRect(rectF, f, f, paint3);
                }
                paint.setAlpha((int) (f2 * 51.0f));
                canvas.drawRoundRect(rectF, f, f, paint);
            }
        }
        if (f2 < 1.0f) {
            canvas.restore();
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        AnonymousClass1 anonymousClass1 = this.listView;
        if (view != anonymousClass1) {
            return super.drawChild(canvas, view, j);
        }
        RectF rectF = this.listBounds;
        rectF.set(anonymousClass1.getX(), anonymousClass1.getY(), anonymousClass1.getX() + anonymousClass1.getWidth(), anonymousClass1.getY() + anonymousClass1.getHeight());
        AndroidUtilities.scaleRect(rectF, anonymousClass1.getScaleX(), anonymousClass1.getPivotX() + anonymousClass1.getX(), anonymousClass1.getPivotY() + anonymousClass1.getY());
        drawBlur(canvas, rectF, AndroidUtilities.dp(10.0f), anonymousClass1.getAlpha());
        Path path = this.clipPath;
        path.rewind();
        path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
        canvas.save();
        canvas.clipPath(path);
        boolean zDrawChild = super.drawChild(canvas, view, j);
        canvas.restore();
        return zDrawChild;
    }

    public final int getPositionOf(int i) {
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

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        AnonymousClass1 anonymousClass1 = this.listView;
        anonymousClass1.setPivotX(anonymousClass1.getWidth() - AndroidUtilities.dp(15.0f));
        anonymousClass1.setPivotY(anonymousClass1.getHeight());
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(176.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zContains = this.buttonBounds.contains(motionEvent.getX(), motionEvent.getY());
        int action = motionEvent.getAction();
        ButtonBounce buttonBounce = this.buttonBounce;
        if (action == 0) {
            buttonBounce.setPressed(zContains);
            if (this.listShown && !zContains && !this.listBounds.contains(motionEvent.getX(), motionEvent.getY())) {
                showList(false, true);
                return true;
            }
        } else if (motionEvent.getAction() == 2) {
            if (!zContains) {
                buttonBounce.setPressed(false);
            }
        } else if (motionEvent.getAction() == 1) {
            if (buttonBounce.isPressed()) {
                showList(!this.listShown, true);
            }
            buttonBounce.setPressed(false);
        } else if (motionEvent.getAction() == 3) {
            buttonBounce.setPressed(false);
        }
        return buttonBounce.isPressed() || super.onTouchEvent(motionEvent);
    }

    public void setSelected(final int i) {
        if (this.selectedStory == i) {
            return;
        }
        this.selectedStory = i;
        AndroidUtilities.forEachViews((RecyclerView) this.listView, new Consumer() {
            @Override
            public final void accept(Object obj) {
                MultipleStoriesSelector.AnonymousClass1 anonymousClass1;
                int childAdapterPosition;
                UItem item;
                View view = (View) obj;
                MultipleStoriesSelector multipleStoriesSelector = this.f$0;
                multipleStoriesSelector.getClass();
                if (!(view instanceof MultipleStoriesSelector.EntryView) || (item = anonymousClass1.adapter.getItem((childAdapterPosition = (anonymousClass1 = multipleStoriesSelector.listView).getChildAdapterPosition(view)))) == null) {
                    return;
                }
                MultipleStoriesSelector.EntryView entryView = (MultipleStoriesSelector.EntryView) view;
                entryView.setPosition(multipleStoriesSelector.getPositionOf(childAdapterPosition));
                boolean z = i == item.id;
                if (entryView.selected != z) {
                    entryView.selected = z;
                    entryView.invalidate();
                }
                view.setPressed(false);
            }
        });
    }

    public final void showList(boolean z, boolean z2) {
        if (this.listShown == z) {
            return;
        }
        this.listShown = z;
        AnonymousClass1 anonymousClass1 = this.listView;
        anonymousClass1.animate().cancel();
        if (z2) {
            anonymousClass1.setVisibility(0);
            OKLCH.m(anonymousClass1.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.65f).scaleY(z ? 1.0f : 0.65f).setListener(new StoryViewer.AnonymousClass7(this, z, 15)).setUpdateListener(new HintView2$$ExternalSyntheticLambda1(this, 5)), CubicBezierInterpolator.EASE_OUT_QUINT, 360L);
        } else {
            anonymousClass1.setVisibility(z ? 0 : 8);
            anonymousClass1.setAlpha(z ? 1.0f : 0.0f);
            anonymousClass1.setScaleX(z ? 1.0f : 0.65f);
            anonymousClass1.setScaleY(z ? 1.0f : 0.65f);
            invalidate();
        }
        if (z && this.hintShown) {
            this.hintShown = false;
            invalidate();
        }
    }
}
