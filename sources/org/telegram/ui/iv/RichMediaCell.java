package org.telegram.ui.iv;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzkv;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AndroidUtilities$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Cells.TextSelectionHelper;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadialProgress2;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawableRenderNode;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.spoilers.SpoilerEffect2;
import org.telegram.ui.VoIPFragment$$ExternalSyntheticLambda4;

public final class RichMediaCell extends RichBlockCell implements Theme.Colorable, TextSelectionHelper.ArticleSelectableView, RichCaptionHost {
    public static Paint slideDotPaint;
    public final ImageView addButton;
    public boolean attached;
    public final Paint backgroundPaint;
    public final ChatActivity.AnonymousClass40 blurColors;
    public final BlurredBackgroundSourceRenderNode blurSource;
    public final RichCaptionController caption;
    public final HashMap circleButtonBg;
    public final ArrayList circleButtons;
    public final Path clipPath;
    public int collageH;
    public final ArrayList collageRects;
    public int currentPage;
    public RichEditorListView.AnonymousClass6 delegate;
    public float downX;
    public float downY;
    public boolean dragging;
    public final boolean glass;
    public int imageH;
    public final ArrayList itemRects;
    public final ArrayList items;
    public int lastSwitchIconRes;
    public int maxFlingVelocity;
    public final ArrayList menuButtons;
    public int minFlingVelocity;
    public final AnimatedFloat modeProgress;
    public float pageOffset;
    public int pressedItem;
    public final Theme.ResourcesProvider resourcesProvider;
    public final Paint selectionPaint;
    public ValueAnimator settleAnimator;
    public int slideH;
    public int slideW;
    public SpoilerEffect2 spoilerEffect;
    public final ImageView switchModeButton;
    public int touchSlop;
    public VelocityTracker velocityTracker;

    public final class Factory extends UItem.UItemFactory {
        public static final int $r8$clinit = 0;

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            RichMediaCell richMediaCell = (RichMediaCell) view;
            BlockRow blockRow = (BlockRow) uItem.object;
            RichEditorListView.AnonymousClass6 anonymousClass6 = (RichEditorListView.AnonymousClass6) uItem.object2;
            richMediaCell.currentRow = blockRow;
            richMediaCell.delegate = anonymousClass6;
            richMediaCell.bindBlockInset(blockRow);
            if (blockRow != null) {
                BlockRow blockRow2 = richMediaCell.currentRow;
                if (blockRow2 != null) {
                    TL_iv.PageBlock pageBlock = blockRow2.block;
                    if (!(pageBlock instanceof TL_iv.pageBlockCollage) && !(pageBlock instanceof TL_iv.pageBlockSlideshow)) {
                        if (blockRow.media == null) {
                            blockRow.media = new MediaUploadState();
                        }
                    }
                } else if (blockRow.media == null) {
                    blockRow.media = new MediaUploadState();
                }
            }
            richMediaCell.rebuildItems();
            richMediaCell.caption.bind();
            int i = richMediaCell.currentPage;
            ArrayList arrayList = richMediaCell.items;
            if (i >= arrayList.size()) {
                richMediaCell.currentPage = Math.max(0, arrayList.size() - 1);
            }
            richMediaCell.pageOffset = 0.0f;
            richMediaCell.modeProgress.set(richMediaCell.isSlideshow() ? 1.0f : 0.0f, true);
            richMediaCell.updateSwitchButton(false);
            richMediaCell.requestLayout();
            richMediaCell.invalidate();
        }

        @Override
        public final boolean contentsEquals(UItem uItem, UItem uItem2) {
            return uItem.id == uItem2.id;
        }

        @Override
        public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            RichMediaCell richMediaCell = new RichMediaCell(context, resourcesProvider);
            richMediaCell.setBackground(new RichEditor.DraggingDrawable(Theme.getColor(Theme.key_windowBackgroundWhite, resourcesProvider)));
            return richMediaCell;
        }

        @Override
        public final boolean equals(UItem uItem, UItem uItem2) {
            return uItem.id == uItem2.id;
        }

        @Override
        public final boolean isClickable() {
            return false;
        }
    }

    public RichMediaCell(Context context, Theme.ResourcesProvider resourcesProvider) {
        RenderEffect renderEffectCreateBlurEffect;
        super(context);
        this.backgroundPaint = new Paint(1);
        this.selectionPaint = new Paint(1);
        this.items = new ArrayList();
        this.menuButtons = new ArrayList();
        this.collageRects = new ArrayList();
        this.itemRects = new ArrayList();
        int i = Build.VERSION.SDK_INT;
        boolean z = i >= 31 && SharedConfig.chatBlurEnabled();
        this.glass = z;
        this.circleButtons = new ArrayList();
        this.circleButtonBg = new HashMap();
        this.pressedItem = -1;
        this.modeProgress = new AnimatedFloat(this, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
        this.clipPath = new Path();
        this.resourcesProvider = resourcesProvider;
        setWillNotDraw(false);
        setBlockPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(4.0f));
        RichCaptionController richCaptionController = new RichCaptionController(context, resourcesProvider, new RichEditor.AnonymousClass3(this, 3));
        this.caption = richCaptionController;
        addView(richCaptionController.editText, LayoutHelper.createFrame(-2, -2, 51));
        setClipChildren(false);
        setClipToPadding(false);
        if (z && i >= 31) {
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(new BlurredBackgroundSourceColor());
            this.blurSource = blurredBackgroundSourceRenderNode;
            float fDp = AndroidUtilities.dp(24.0f);
            RenderNode renderNode = blurredBackgroundSourceRenderNode.renderNode;
            if (fDp > 0.0f) {
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                renderEffectCreateBlurEffect = RenderEffect.createBlurEffect(fDp, fDp, Shader.TileMode.CLAMP);
            } else {
                renderEffectCreateBlurEffect = null;
            }
            renderNode.setRenderEffect(renderEffectCreateBlurEffect);
            this.blurColors = new ChatActivity.AnonymousClass40(27);
        }
        ImageView imageViewCreateCircleButton = createCircleButton();
        this.addButton = imageViewCreateCircleButton;
        imageViewCreateCircleButton.setImageResource(R.drawable.iv_media_add);
        addView(imageViewCreateCircleButton, LayoutHelper.createFrame(32, 32.0f, 53, 12.0f, 12.0f, 12.0f, 12.0f));
        imageViewCreateCircleButton.setOnClickListener(new RichMediaCell$$ExternalSyntheticLambda0(this, 1));
        ImageView imageViewCreateCircleButton2 = createCircleButton();
        this.switchModeButton = imageViewCreateCircleButton2;
        imageViewCreateCircleButton2.setVisibility(8);
        addView(imageViewCreateCircleButton2, LayoutHelper.createFrame(32, 32.0f, 53, 12.0f, 12.0f, 66.0f, 12.0f));
        imageViewCreateCircleButton2.setOnClickListener(new RichMediaCell$$ExternalSyntheticLambda0(this, 2));
        updateColors$1();
    }

    private SpoilerEffect2 getSpoilerEffect() {
        if (!this.attached) {
            return null;
        }
        SpoilerEffect2 spoilerEffect2 = this.spoilerEffect;
        if (spoilerEffect2 != null && spoilerEffect2.destroyed) {
            this.spoilerEffect = null;
        }
        if (this.spoilerEffect == null) {
            this.spoilerEffect = SpoilerEffect2.getInstance(this);
        }
        return this.spoilerEffect;
    }

    private void settle(float f) {
        int i;
        int size = this.items.size();
        if (f < 0.0f && this.currentPage < size - 1) {
            i = 1;
        } else if (f <= 0.0f || this.currentPage <= 0) {
            float f2 = this.pageOffset;
            if (f2 > 0.5f && this.currentPage < size - 1) {
                i = 1;
            } else if (f2 >= -0.5f || this.currentPage <= 0) {
                i = 0;
            } else {
                i = -1;
            }
        } else {
            i = -1;
        }
        int i2 = this.currentPage;
        int i3 = i + i2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.pageOffset, i3 - i2);
        this.settleAnimator = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(220L);
        this.settleAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        this.settleAnimator.addUpdateListener(new VoIPFragment$$ExternalSyntheticLambda4(this, 24));
        this.settleAnimator.addListener(new ArticleViewer.AnonymousClass3(this, i3, 16));
        this.settleAnimator.start();
    }

    public final ImageView createCircleButton() {
        ImageView imageView = new ImageView(getContext());
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        if (!this.glass || Build.VERSION.SDK_INT < 31) {
            int i = Theme.key_windowBackgroundWhiteBlackText;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i, resourcesProvider), PorterDuff.Mode.SRC_IN));
            int i2 = Theme.key_windowBackgroundWhite;
            imageView.setBackground(new RichEditor.ShadowWrapperDrawable(Theme.createRadSelectorDrawable(Theme.getColor(i2, resourcesProvider), Theme.blendOver(Theme.getColor(i2, resourcesProvider), Theme.getColor(Theme.key_listSelector, resourcesProvider)), 20, 20)));
        } else {
            imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = this.blurSource;
            blurredBackgroundSourceRenderNode.getClass();
            BlurredBackgroundDrawableRenderNode blurredBackgroundDrawableRenderNode = new BlurredBackgroundDrawableRenderNode(blurredBackgroundSourceRenderNode);
            blurredBackgroundSourceRenderNode.drawables.add(blurredBackgroundDrawableRenderNode);
            blurredBackgroundDrawableRenderNode.setColorProvider(this.blurColors);
            blurredBackgroundDrawableRenderNode.setRadius(AndroidUtilities.dp(16.0f));
            this.circleButtonBg.put(imageView, blurredBackgroundDrawableRenderNode);
        }
        ScaleStateListAnimator.apply(imageView, 0.1f, 1.5f);
        this.circleButtons.add(imageView);
        return imageView;
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        this.caption.drawSelection(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        if (this.menuButtons.contains(view)) {
            BlockRow blockRow = this.currentRow;
            if ((blockRow == null ? 0 : blockRow.quoteIds.size()) > 0) {
                canvas.save();
                Path path = this.clipPath;
                path.rewind();
                path.addRoundRect(getPaddingLeft(), getPaddingTop(), Math.max(0, (getWidth() - getPaddingLeft()) - getPaddingRight()) + getPaddingLeft(), getPaddingTop() + this.imageH, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas.clipPath(path);
                boolean zDrawChild = super.drawChild(canvas, view, j);
                canvas.restore();
                return zDrawChild;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    public final void drawGlassButton(Canvas canvas, ImageView imageView) {
        BlurredBackgroundDrawableRenderNode blurredBackgroundDrawableRenderNode;
        if (imageView.getVisibility() == 0 && (blurredBackgroundDrawableRenderNode = (BlurredBackgroundDrawableRenderNode) this.circleButtonBg.get(imageView)) != null) {
            blurredBackgroundDrawableRenderNode.setBounds(imageView.getLeft(), imageView.getTop(), imageView.getRight(), imageView.getBottom());
            blurredBackgroundDrawableRenderNode.setAlpha((int) (imageView.getAlpha() * 255.0f));
            blurredBackgroundDrawableRenderNode.renderNodeInvalidated = true;
            blurredBackgroundDrawableRenderNode.draw(canvas);
        }
    }

    public final void drawMedia(Canvas canvas) {
        int i;
        RichMediaCell richMediaCell = this;
        Canvas canvas2 = canvas;
        int paddingTop = richMediaCell.getPaddingTop();
        int paddingLeft = richMediaCell.getPaddingLeft();
        int i2 = 0;
        int iMax = Math.max(0, (richMediaCell.getWidth() - paddingLeft) - richMediaCell.getPaddingRight());
        canvas2.save();
        canvas2.translate(paddingLeft, 0.0f);
        BlockRow blockRow = richMediaCell.currentRow;
        if ((blockRow == null ? 0 : blockRow.quoteIds.size()) > 0) {
            Path path = richMediaCell.clipPath;
            path.rewind();
            path.addRoundRect(0.0f, paddingTop, iMax, richMediaCell.imageH + paddingTop, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
            canvas2.clipPath(path);
        } else {
            canvas2.clipRect(0, paddingTop, iMax, richMediaCell.imageH + paddingTop);
        }
        boolean zIsSlideshow = richMediaCell.isSlideshow();
        ArrayList arrayList = richMediaCell.items;
        boolean z = zIsSlideshow && arrayList.size() >= 2;
        BlockRow blockRow2 = richMediaCell.currentRow;
        int iDp = (blockRow2 == null ? 0 : blockRow2.quoteIds.size()) > 0 ? AndroidUtilities.dp(8.0f) : 0;
        Paint paint = richMediaCell.backgroundPaint;
        if (z && (((i = richMediaCell.currentPage) == 0 && richMediaCell.pageOffset < 0.0f) || (i == arrayList.size() - 1 && richMediaCell.pageOffset > 0.0f))) {
            canvas2.drawRect(0.0f, paddingTop, iMax, richMediaCell.imageH + paddingTop, paint);
        }
        int size = arrayList.size();
        ArrayList arrayList2 = richMediaCell.itemRects;
        if (size == 1 && arrayList2.size() == 1) {
            RectF rectF = (RectF) arrayList2.get(0);
            if (rectF.left > 0.5f || rectF.right < iMax - 0.5f) {
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(0.0f, paddingTop, iMax, paddingTop + richMediaCell.imageH);
                RichMediaItem richMediaItem = (RichMediaItem) arrayList.get(0);
                if (richMediaItem.ensureBlur()) {
                    ImageReceiver imageReceiver = richMediaItem.blurImageReceiver;
                    imageReceiver.setImageCoords(rectF2);
                    imageReceiver.setAlpha(richMediaItem.imageReceiver.getCurrentAlpha());
                    imageReceiver.draw(canvas2);
                }
            }
        }
        int i3 = 0;
        while (i3 < arrayList.size() && i3 < arrayList2.size()) {
            RichMediaItem richMediaItem2 = (RichMediaItem) arrayList.get(i3);
            RectF rectF3 = (RectF) arrayList2.get(i3);
            if (z) {
                int i4 = i3 == 0 ? iDp : 0;
                int i5 = i3 == arrayList.size() - 1 ? iDp : 0;
                int i6 = i3 == arrayList.size() - 1 ? iDp : 0;
                int i7 = i3 == 0 ? iDp : 0;
                richMediaItem2.imageReceiver.setRoundRadius(i4, i5, i6, i7);
                richMediaItem2.blurImageReceiver.setRoundRadius(i4, i5, i6, i7);
            } else {
                richMediaItem2.imageReceiver.setRoundRadius(i2, i2, i2, i2);
                richMediaItem2.blurImageReceiver.setRoundRadius(i2, i2, i2, i2);
            }
            if (!richMediaItem2.hasImage()) {
                canvas2.drawRect(rectF3, paint);
            }
            int iRound = Math.round(rectF3.left);
            int iRound2 = Math.round(rectF3.top);
            int iRound3 = Math.round(rectF3.width());
            int iRound4 = Math.round(rectF3.height());
            ImageReceiver imageReceiver2 = richMediaItem2.imageReceiver;
            imageReceiver2.setImageCoords(iRound, iRound2, iRound3, iRound4);
            if (richMediaItem2.hasImage()) {
                imageReceiver2.draw(canvas2);
            }
            MediaUploadState mediaUploadState = richMediaItem2.media;
            if (mediaUploadState != null && mediaUploadState.isPending()) {
                int iDp2 = AndroidUtilities.dp(48.0f);
                int iRound5 = Math.round(rectF3.centerX());
                int iRound6 = Math.round(rectF3.centerY());
                int i8 = iDp2 / 2;
                int i9 = iRound5 - i8;
                int i10 = iRound6 - i8;
                int i11 = iRound5 + i8;
                int i12 = iRound6 + i8;
                RadialProgress2 radialProgress2 = richMediaItem2.radialProgress;
                radialProgress2.setProgressRect(i9, i10, i11, i12);
                radialProgress2.setProgress(richMediaItem2.media.progress, true);
                radialProgress2.draw(canvas2);
            }
            MediaUploadState mediaUploadState2 = richMediaItem2.media;
            if (mediaUploadState2 != null && mediaUploadState2.hasSpoiler && richMediaItem2.hasImage()) {
                SpoilerEffect2 spoilerEffect = richMediaCell.getSpoilerEffect();
                canvas2.save();
                canvas2.clipRect(rectF3);
                if (richMediaItem2.ensureBlur()) {
                    ImageReceiver imageReceiver3 = richMediaItem2.blurImageReceiver;
                    imageReceiver3.setImageCoords(rectF3);
                    imageReceiver3.setAlpha(imageReceiver2.getCurrentAlpha());
                    imageReceiver3.draw(canvas2);
                }
                if (spoilerEffect != null) {
                    canvas2.translate(rectF3.left, rectF3.top);
                    spoilerEffect.draw(canvas2, richMediaCell, Math.round(rectF3.width()), Math.round(rectF3.height()), imageReceiver2.getCurrentAlpha(), false);
                }
                canvas.restore();
            }
            i3++;
            richMediaCell = this;
            canvas2 = canvas;
            i2 = 0;
        }
        canvas.restore();
    }

    @Override
    public final void fillTextLayoutBlocks(ArrayList arrayList) {
        this.caption.fillTextLayoutBlocks(arrayList);
    }

    @Override
    public RichEditText getCaptionEditText() {
        return this.caption.editText;
    }

    public int[] getColorKeys() {
        return null;
    }

    @Override
    public BlockRow getRow() {
        return this.currentRow;
    }

    public final void handleTap(int i) {
        if (this.delegate == null || this.currentRow == null) {
            return;
        }
        List listMedias = medias();
        if (listMedias.isEmpty() || (listMedias.size() == 1 && ((MediaUploadState) listMedias.get(0)).state == 0)) {
            RichEditorListView.AnonymousClass6 anonymousClass6 = this.delegate;
            BlockRow blockRow = this.currentRow;
            RichEditorListView richEditorListView = RichEditorListView.this;
            richEditorListView.pendingMediaRow = blockRow;
            richEditorListView.delegate.onOpenAttachRequest(0);
            return;
        }
        if (i < 0 || i >= listMedias.size() || !((MediaUploadState) listMedias.get(i)).isPending()) {
            return;
        }
        RichEditorListView.access$3500(this.currentRow, (MediaUploadState) listMedias.get(i), RichEditorListView.this);
    }

    @Override
    public final boolean isPressOnCaption(int i, int i2) {
        return this.caption.isPressOnCaption(i, i2);
    }

    public final boolean isSlideshow() {
        BlockRow blockRow = this.currentRow;
        return blockRow != null && (blockRow.block instanceof TL_iv.pageBlockSlideshow);
    }

    public final List medias() {
        BlockRow blockRow = this.currentRow;
        if (blockRow == null) {
            return Collections.EMPTY_LIST;
        }
        TL_iv.PageBlock pageBlock = blockRow.block;
        if ((pageBlock instanceof TL_iv.pageBlockCollage) || (pageBlock instanceof TL_iv.pageBlockSlideshow)) {
            ArrayList arrayList = blockRow.medias;
            return arrayList != null ? arrayList : Collections.EMPTY_LIST;
        }
        MediaUploadState mediaUploadState = blockRow.media;
        return mediaUploadState != null ? Collections.singletonList(mediaUploadState) : Collections.EMPTY_LIST;
    }

    @Override
    public final int nestedContentMargin() {
        return AndroidUtilities.dp(16.0f);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        int i = 0;
        while (true) {
            ArrayList arrayList = this.items;
            if (i >= arrayList.size()) {
                return;
            }
            RichMediaItem richMediaItem = (RichMediaItem) arrayList.get(i);
            richMediaItem.imageReceiver.onAttachedToWindow();
            richMediaItem.blurImageReceiver.onAttachedToWindow();
            richMediaItem.applyImage();
            i++;
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = 0;
        this.attached = false;
        if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(false);
        }
        VelocityTracker velocityTracker = this.velocityTracker;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.velocityTracker = null;
        }
        this.dragging = false;
        while (true) {
            ArrayList arrayList = this.items;
            if (i >= arrayList.size()) {
                break;
            }
            RichMediaItem richMediaItem = (RichMediaItem) arrayList.get(i);
            richMediaItem.imageReceiver.onDetachedFromWindow();
            richMediaItem.blurImageReceiver.onDetachedFromWindow();
            richMediaItem.blurSource = null;
            i++;
        }
        SpoilerEffect2 spoilerEffect2 = this.spoilerEffect;
        if (spoilerEffect2 != null) {
            spoilerEffect2.detach(this);
            this.spoilerEffect = null;
        }
        ValueAnimator valueAnimator = this.settleAnimator;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.settleAnimator = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode;
        ImageView imageView;
        ImageView imageView2;
        TextSelectionHelper.ArticleTextSelectionHelper textSelectionHelper;
        float f;
        float f2;
        float f3;
        float fClamp;
        int paddingTop = getPaddingTop();
        drawMedia(canvas);
        AnimatedFloat animatedFloat = this.modeProgress;
        float f4 = animatedFloat.value;
        ArrayList arrayList = this.items;
        if (arrayList.size() >= 2 && f4 > 0.001f) {
            if (slideDotPaint == null) {
                Paint paint = new Paint(1);
                slideDotPaint = paint;
                paint.setColor(-1);
                slideDotPaint.setShadowLayer(AndroidUtilities.dpf2(3.0f), 0.0f, AndroidUtilities.dpf2(1.0f), Integer.MIN_VALUE);
            }
            int size = arrayList.size();
            float fDp = AndroidUtilities.dp(5.0f) + ((getPaddingTop() + this.imageH) - AndroidUtilities.dp(23.0f));
            int iDp = AndroidUtilities.dp(4.0f) + RichMessageLayout$RichMathBlock$$ExternalSyntheticOutline0.m(size - 1, 6.0f, AndroidUtilities.dp(7.0f) * size);
            int paddingLeft = getPaddingLeft();
            int iMax = Math.max(0, (getWidth() - paddingLeft) - getPaddingRight());
            float f5 = this.currentPage + this.pageOffset;
            if (iDp < iMax) {
                f = 13.0f;
                fClamp = ((iMax - iDp) / 2.0f) + paddingLeft;
                f2 = 23.0f;
                f3 = 4.0f;
            } else {
                f = 13.0f;
                float fDp2 = AndroidUtilities.dp(4.0f) + paddingLeft;
                int iDp2 = AndroidUtilities.dp(13.0f);
                f2 = 23.0f;
                int iDp3 = ((iMax - AndroidUtilities.dp(8.0f)) / 2) / iDp2;
                f3 = 4.0f;
                fClamp = fDp2 - (Utilities.clamp(f5 - iDp3, Math.max(0, (size - (iDp3 * 2)) - 1), 0.0f) * iDp2);
            }
            canvas.save();
            canvas.clipRect(paddingLeft, (getPaddingTop() + this.imageH) - AndroidUtilities.dp(f2), iMax + paddingLeft, getPaddingTop() + this.imageH);
            for (int i = 0; i < size; i++) {
                float fMax = Math.max(0.0f, 1.0f - Math.abs(i - f5));
                float fDp3 = (AndroidUtilities.dp(1.0f) * fMax) + AndroidUtilities.dp(2.0f);
                slideDotPaint.setAlpha((int) AndroidUtilities$$ExternalSyntheticOutline0.m(fMax, 95.0f, 160.0f, f4));
                canvas.drawCircle(AndroidUtilities.dp(f3) + fClamp + (AndroidUtilities.dp(f) * i), fDp, fDp3, slideDotPaint);
            }
            canvas.restore();
        }
        RichEditorListView.AnonymousClass6 anonymousClass6 = this.delegate;
        if (anonymousClass6 != null && (textSelectionHelper = RichEditorListView.this.getTextSelectionHelper()) != null && textSelectionHelper.isInSelectionMode() && (getParent() instanceof RecyclerView)) {
            ((RecyclerView) getParent()).getClass();
            int childAdapterPosition = RecyclerView.getChildAdapterPosition(this);
            if (childAdapterPosition >= 0 && childAdapterPosition > textSelectionHelper.startViewPosition && childAdapterPosition <= textSelectionHelper.endViewPosition) {
                canvas.drawRect(getPaddingLeft(), paddingTop, getWidth() - getPaddingRight(), paddingTop + this.imageH, this.selectionPaint);
            }
        }
        if (this.glass && (blurredBackgroundSourceRenderNode = this.blurSource) != null && Build.VERSION.SDK_INT >= 31) {
            int width = getWidth();
            int height = getHeight();
            if (width > 0 && height > 0) {
                if (canvas.isHardwareAccelerated() && !blurredBackgroundSourceRenderNode.inRecording) {
                    try {
                        drawMedia(blurredBackgroundSourceRenderNode.beginRecording(width, height));
                        blurredBackgroundSourceRenderNode.endRecording();
                    } catch (Throwable th) {
                        blurredBackgroundSourceRenderNode.endRecording();
                        throw th;
                    }
                }
                int i2 = 0;
                while (true) {
                    ArrayList arrayList2 = this.circleButtons;
                    int size2 = arrayList2.size();
                    imageView = this.switchModeButton;
                    imageView2 = this.addButton;
                    if (i2 >= size2) {
                        break;
                    }
                    ImageView imageView3 = (ImageView) arrayList2.get(i2);
                    if (imageView3 != imageView2 && imageView3 != imageView) {
                        drawGlassButton(canvas, imageView3);
                    }
                    i2++;
                }
                drawGlassButton(canvas, imageView);
                drawGlassButton(canvas, imageView2);
            }
        }
        if (animatedFloat.transition) {
            requestLayout();
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iDp;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i5 = i3 - i;
        int iMax = Math.max(0, (i5 - paddingLeft) - paddingRight);
        int i6 = i5 - paddingRight;
        BlockRow blockRow = this.currentRow;
        if (blockRow == null) {
            iDp = 0;
        } else {
            int size = blockRow.quoteIds.size();
            int iDp2 = size <= 0 ? 0 : AndroidUtilities.dp(zzkv.m(size, 1, 16, 12));
            int iMax2 = Math.max(0, blockRow.level);
            iDp = iDp2 + (iMax2 <= 0 ? 0 : AndroidUtilities.dp(zzkv.m(iMax2, 1, 24, 28)));
        }
        int iDp3 = iDp > 0 ? AndroidUtilities.dp(16.0f) : 0;
        this.caption.layout(paddingLeft - iDp3, paddingRight - iDp3, i5, getPaddingTop() + this.imageH);
        int iDp4 = AndroidUtilities.dp(6.0f);
        ImageView imageView = this.addButton;
        int i7 = i6 - iDp4;
        imageView.layout(i7 - imageView.getMeasuredWidth(), getPaddingTop() + iDp4, i7, imageView.getMeasuredHeight() + getPaddingTop() + iDp4);
        ImageView imageView2 = this.switchModeButton;
        int i8 = i7 - iDp4;
        imageView2.layout((i8 - imageView.getMeasuredWidth()) - imageView2.getMeasuredWidth(), getPaddingTop() + iDp4, i8 - imageView.getMeasuredWidth(), imageView.getMeasuredHeight() + getPaddingTop() + iDp4);
        List listMedias = medias();
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.menuButtons;
            if (i9 >= arrayList.size()) {
                return;
            }
            ImageView imageView3 = (ImageView) arrayList.get(i9);
            if (i9 >= listMedias.size() || ((MediaUploadState) listMedias.get(i9)).state == 0) {
                imageView3.setVisibility(8);
            } else {
                ArrayList arrayList2 = this.itemRects;
                if (i9 >= arrayList2.size()) {
                    imageView3.setVisibility(8);
                } else {
                    RectF rectF = (RectF) arrayList2.get(i9);
                    if (rectF.right <= 0.0f || rectF.left >= iMax || rectF.bottom <= getPaddingTop() || rectF.top >= getPaddingTop() + this.imageH) {
                        imageView3.setVisibility(8);
                    } else {
                        int i10 = ((int) rectF.left) + iDp4 + paddingLeft;
                        int i11 = ((int) rectF.top) + iDp4;
                        imageView3.layout(i10, i11, imageView3.getMeasuredWidth() + i10, imageView3.getMeasuredHeight() + i11);
                        float fMax = 1.0f;
                        if (this.glass) {
                            int left = (imageView2.getVisibility() == 0 ? imageView2.getLeft() : imageView.getLeft()) - AndroidUtilities.dp(4.0f);
                            int measuredWidth = imageView3.getMeasuredWidth() + i10;
                            if (measuredWidth > left) {
                                fMax = Math.max(0.0f, 1.0f - ((measuredWidth - left) / imageView3.getMeasuredWidth()));
                            }
                        }
                        imageView3.setAlpha(fMax);
                        imageView3.setVisibility(fMax > 0.01f ? 0 : 8);
                    }
                }
            }
            i9++;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        MediaUploadState mediaUploadState;
        int i5;
        int i6;
        MessageObject.GroupedMessagePosition[] groupedMessagePositionArr;
        int iRound;
        MessageObject.GroupedMessagePosition[] groupedMessagePositionArr2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        MediaUploadState mediaUploadState2;
        int i14;
        int iDp;
        int iMax;
        MediaUploadState mediaUploadState3;
        int i15;
        ArrayList arrayList;
        int size;
        BlockRow blockRow;
        int size2;
        int i16;
        int iDp2;
        int i17;
        int iMax2;
        int iDp3;
        int i18;
        int iDp4;
        ArrayList arrayList2;
        int paddingTop;
        float f;
        int i19;
        int size3 = View.MeasureSpec.getSize(i);
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int iMax3 = Math.max(0, (size3 - paddingLeft) - paddingRight);
        float f2 = isSlideshow() ? 1.0f : 0.0f;
        AnimatedFloat animatedFloat = this.modeProgress;
        float f3 = animatedFloat.set(f2, false);
        ArrayList arrayList3 = this.collageRects;
        arrayList3.clear();
        int paddingTop2 = getPaddingTop();
        ArrayList arrayList4 = this.items;
        int size4 = arrayList4.size();
        if (size4 != 0) {
            if (size4 == 1) {
                RichMediaItem richMediaItem = (RichMediaItem) arrayList4.get(0);
                MediaUploadState mediaUploadState4 = richMediaItem.media;
                int i20 = mediaUploadState4 != null ? (mediaUploadState4.isVideo || mediaUploadState4.isReady() || !((i15 = (mediaUploadState3 = richMediaItem.media).orientation) == 90 || i15 == 270)) ? richMediaItem.media.width : mediaUploadState3.height : 0;
                MediaUploadState mediaUploadState5 = richMediaItem.media;
                int i21 = mediaUploadState5 == null ? 0 : (mediaUploadState5.isVideo || mediaUploadState5.isReady() || !((i14 = (mediaUploadState2 = richMediaItem.media).orientation) == 90 || i14 == 270)) ? richMediaItem.media.height : mediaUploadState2.width;
                if (i20 <= 0 || i21 <= 0) {
                    iDp = (AndroidUtilities.dp(200.0f) - getPaddingTop()) - getPaddingBottom();
                } else {
                    iDp = (int) ((iMax3 / Math.max(1, i20)) * i21);
                    Point point = AndroidUtilities.displaySize;
                    int iMax4 = (int) (Math.max(point.x, point.y) * 0.55f);
                    if (iDp > iMax4) {
                        iMax = (int) ((iMax4 / Math.max(1, i21)) * i20);
                        iDp = iMax4;
                    }
                    int i22 = (iMax3 - iMax) / 2;
                    arrayList3.add(new RectF(i22, paddingTop2, i22 + iMax, paddingTop2 + iDp));
                    this.collageH = iDp;
                    this.slideW = iMax;
                    this.slideH = iDp;
                }
                iMax = iMax3;
                int i23 = (iMax3 - iMax) / 2;
                arrayList3.add(new RectF(i23, paddingTop2, i23 + iMax, paddingTop2 + iDp));
                this.collageH = iDp;
                this.slideW = iMax;
                this.slideH = iDp;
            } else {
                float[] fArr = new float[size4];
                int i24 = 0;
                while (i24 < size4) {
                    RichMediaItem richMediaItem2 = (RichMediaItem) arrayList4.get(i24);
                    MediaUploadState mediaUploadState6 = richMediaItem2.media;
                    if (mediaUploadState6 == null) {
                        i10 = paddingLeft;
                        i11 = 0;
                    } else {
                        if (mediaUploadState6.isVideo || mediaUploadState6.isReady()) {
                            i10 = paddingLeft;
                        } else {
                            MediaUploadState mediaUploadState7 = richMediaItem2.media;
                            int i25 = mediaUploadState7.orientation;
                            i10 = paddingLeft;
                            if (i25 == 90 || i25 == 270) {
                                i11 = mediaUploadState7.height;
                            }
                        }
                        i11 = richMediaItem2.media.width;
                    }
                    MediaUploadState mediaUploadState8 = richMediaItem2.media;
                    if (mediaUploadState8 == null) {
                        i12 = paddingRight;
                        i13 = 0;
                    } else {
                        if (mediaUploadState8.isVideo || mediaUploadState8.isReady()) {
                            i12 = paddingRight;
                        } else {
                            MediaUploadState mediaUploadState9 = richMediaItem2.media;
                            int i26 = mediaUploadState9.orientation;
                            i12 = paddingRight;
                            if (i26 == 90 || i26 == 270) {
                                i13 = mediaUploadState9.width;
                            }
                        }
                        i13 = richMediaItem2.media.height;
                    }
                    fArr[i24] = (i11 <= 0 || i13 <= 0) ? 1.0f : i11 / i13;
                    i24++;
                    paddingLeft = i10;
                    paddingRight = i12;
                }
                i3 = paddingLeft;
                i4 = paddingRight;
                MessageObject.GroupedMessagePosition[] groupedMessagePositionArrComputeGrouped = RichMessageLayout.computeGrouped(fArr);
                int iMax5 = 0;
                for (MessageObject.GroupedMessagePosition groupedMessagePosition : groupedMessagePositionArrComputeGrouped) {
                    iMax5 = Math.max(iMax5, (int) groupedMessagePosition.maxY);
                }
                int i27 = iMax5 + 1;
                float[] fArr2 = new float[i27];
                int length = groupedMessagePositionArrComputeGrouped.length;
                int i28 = 0;
                while (i28 < length) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition2 = groupedMessagePositionArrComputeGrouped[i28];
                    int i29 = i27;
                    byte b = groupedMessagePosition2.minY;
                    float[] fArr3 = fArr2;
                    if (b == groupedMessagePosition2.maxY) {
                        fArr3[b] = Math.max(fArr3[b], groupedMessagePosition2.ph);
                    }
                    i28++;
                    i27 = i29;
                    fArr2 = fArr3;
                }
                int i30 = i27;
                float[] fArr4 = fArr2;
                int length2 = groupedMessagePositionArrComputeGrouped.length;
                int i31 = 0;
                while (i31 < length2) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition3 = groupedMessagePositionArrComputeGrouped[i31];
                    int i32 = groupedMessagePosition3.minY;
                    byte b2 = groupedMessagePosition3.maxY;
                    if (i32 != b2) {
                        int i33 = (b2 - i32) + 1;
                        i8 = length2;
                        float[] fArr5 = groupedMessagePosition3.siblingHeights;
                        if (fArr5 == null || fArr5.length != i33) {
                            i9 = i31;
                            float f4 = groupedMessagePosition3.ph / i33;
                            while (i32 <= groupedMessagePosition3.maxY) {
                                fArr4[i32] = Math.max(fArr4[i32], f4);
                                i32++;
                            }
                        } else {
                            int i34 = 0;
                            while (i34 < i33) {
                                int i35 = groupedMessagePosition3.minY + i34;
                                int i36 = i34;
                                fArr4[i35] = Math.max(fArr4[i35], groupedMessagePosition3.siblingHeights[i36]);
                                i34 = i36 + 1;
                                i31 = i31;
                            }
                        }
                        i31 = i9 + 1;
                        length2 = i8;
                    } else {
                        i8 = length2;
                    }
                    i9 = i31;
                    i31 = i9 + 1;
                    length2 = i8;
                }
                Point point2 = AndroidUtilities.displaySize;
                float fMax = Math.max(point2.x, point2.y) * 0.5f;
                int[] iArr = new int[iMax5 + 2];
                float f5 = 0.0f;
                for (int i37 = 0; i37 <= iMax5; i37++) {
                    iArr[i37] = Math.round(f5 * fMax);
                    f5 += fArr4[i37];
                }
                iArr[i30] = Math.round(f5 * fMax);
                int iDp5 = AndroidUtilities.dp(2.0f);
                int i38 = 0;
                while (i38 < groupedMessagePositionArrComputeGrouped.length) {
                    MessageObject.GroupedMessagePosition groupedMessagePosition4 = groupedMessagePositionArrComputeGrouped[i38];
                    int i39 = iArr[groupedMessagePosition4.minY];
                    int i40 = iArr[groupedMessagePosition4.maxY + 1] - i39;
                    int i41 = iDp5;
                    int i42 = groupedMessagePosition4.leftSpanOffset;
                    if (i42 > 0) {
                        iRound = Math.round((i42 * iMax3) / 1000.0f);
                        groupedMessagePositionArr = groupedMessagePositionArrComputeGrouped;
                    } else {
                        int i43 = 0;
                        int i44 = 0;
                        while (i43 < groupedMessagePositionArrComputeGrouped.length) {
                            if (i43 == i38) {
                                groupedMessagePositionArr2 = groupedMessagePositionArrComputeGrouped;
                                i7 = i43;
                            } else {
                                MessageObject.GroupedMessagePosition groupedMessagePosition5 = groupedMessagePositionArrComputeGrouped[i43];
                                groupedMessagePositionArr2 = groupedMessagePositionArrComputeGrouped;
                                byte b3 = groupedMessagePosition5.minY;
                                i7 = i43;
                                byte b4 = groupedMessagePosition4.minY;
                                if (b3 <= b4 && groupedMessagePosition5.maxY >= b4 && groupedMessagePosition5.minX < groupedMessagePosition4.minX) {
                                    i44 += groupedMessagePosition5.pw;
                                }
                            }
                            i43 = i7 + 1;
                            groupedMessagePositionArrComputeGrouped = groupedMessagePositionArr2;
                        }
                        groupedMessagePositionArr = groupedMessagePositionArrComputeGrouped;
                        iRound = Math.round((i44 * iMax3) / 1000.0f);
                    }
                    int i45 = i39 + paddingTop2;
                    arrayList3.add(new RectF(iRound, i45, Math.max(0, (groupedMessagePosition4.flags & 2) != 0 ? iMax3 - iRound : Math.round((groupedMessagePosition4.pw * iMax3) / 1000.0f) - i41) + iRound, Math.max(0, (groupedMessagePosition4.flags & 8) == 0 ? i40 - i41 : i40) + i45));
                    i38++;
                    iDp5 = i41;
                    iArr = iArr;
                    groupedMessagePositionArrComputeGrouped = groupedMessagePositionArr;
                }
                this.collageH = iArr[i30];
                this.slideW = iMax3;
                float f6 = 0.0f;
                for (int i46 = 0; i46 < size4; i46++) {
                    RichMediaItem richMediaItem3 = (RichMediaItem) arrayList4.get(i46);
                    MediaUploadState mediaUploadState10 = richMediaItem3.media;
                    int i47 = mediaUploadState10 == null ? 0 : (mediaUploadState10.isVideo || mediaUploadState10.isReady() || !((i5 = (mediaUploadState = richMediaItem3.media).orientation) == 90 || i5 == 270)) ? richMediaItem3.media.width : mediaUploadState.height;
                    MediaUploadState mediaUploadState11 = richMediaItem3.media;
                    if (mediaUploadState11 == null) {
                        i6 = 0;
                    } else {
                        if (!mediaUploadState11.isVideo && !mediaUploadState11.isReady()) {
                            MediaUploadState mediaUploadState12 = richMediaItem3.media;
                            int i48 = mediaUploadState12.orientation;
                            if (i48 == 90 || i48 == 270) {
                                i6 = mediaUploadState12.width;
                            }
                        }
                        i6 = richMediaItem3.media.height;
                    }
                    f6 += (i47 <= 0 || i6 <= 0) ? 1.0f : i47 / i6;
                }
                int iMax6 = (int) (this.slideW / Math.max(0.5f, f6 / size4));
                Point point3 = AndroidUtilities.displaySize;
                int iMax7 = (int) (Math.max(point3.x, point3.y) * 0.55f);
                if (iMax6 > iMax7) {
                    iMax6 = iMax7;
                }
                this.slideH = iMax6;
            }
            this.imageH = Math.round(AndroidUtilities.lerp(this.collageH, this.slideH, f3));
            arrayList = this.itemRects;
            arrayList.clear();
            size = arrayList4.size();
            if (size != 0) {
                paddingTop = getPaddingTop();
                if (size == 1) {
                    arrayList.add(new RectF((RectF) arrayList3.get(0)));
                } else {
                    f = (-this.pageOffset) * this.slideW;
                    i19 = 0;
                    while (i19 < size && i19 < arrayList3.size()) {
                        RectF rectF = (RectF) arrayList3.get(i19);
                        float f7 = ((i19 - this.currentPage) * this.slideW) + f;
                        arrayList.add(new RectF(AndroidUtilities.lerp(rectF.left, f7, f3), AndroidUtilities.lerp(rectF.top, paddingTop, f3), AndroidUtilities.lerp(rectF.right, f7 + this.slideW, f3), AndroidUtilities.lerp(rectF.bottom, this.slideH + paddingTop, f3)));
                        i19++;
                        size = size;
                    }
                }
            }
            blockRow = this.currentRow;
            if (blockRow == null) {
                i17 = 0;
                i18 = 0;
            } else {
                size2 = blockRow.quoteIds.size();
                if (size2 <= 0) {
                    iDp2 = 0;
                    i16 = 1;
                } else {
                    i16 = 1;
                    iDp2 = AndroidUtilities.dp(zzkv.m(size2, 1, 16, 12));
                }
                i17 = 0;
                iMax2 = Math.max(0, blockRow.level);
                if (iMax2 <= 0) {
                    iDp3 = 0;
                } else {
                    iDp3 = AndroidUtilities.dp(zzkv.m(iMax2, i16, 24, 28));
                }
                i18 = iDp2 + iDp3;
            }
            if (i18 > 0) {
                iDp4 = AndroidUtilities.dp(16.0f);
            } else {
                iDp4 = 0;
            }
            setMeasuredDimension(size3, getPaddingBottom() + getPaddingTop() + this.imageH + this.caption.measure(i3 - iDp4, i4 - iDp4, size3));
            this.addButton.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
            this.switchModeButton.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
            while (true) {
                arrayList2 = this.menuButtons;
                if (i17 < arrayList2.size()) {
                    break;
                }
                ((ImageView) arrayList2.get(i17)).measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                i17++;
            }
            if (animatedFloat.transition) {
                requestLayout();
            }
        }
        int iDp6 = (AndroidUtilities.dp(200.0f) - getPaddingTop()) - getPaddingBottom();
        this.slideH = iDp6;
        this.collageH = iDp6;
        this.slideW = iMax3;
        i3 = paddingLeft;
        i4 = paddingRight;
        this.imageH = Math.round(AndroidUtilities.lerp(this.collageH, this.slideH, f3));
        arrayList = this.itemRects;
        arrayList.clear();
        size = arrayList4.size();
        if (size != 0) {
            paddingTop = getPaddingTop();
            if (size == 1) {
                arrayList.add(new RectF((RectF) arrayList3.get(0)));
            } else {
                f = (-this.pageOffset) * this.slideW;
                i19 = 0;
                while (i19 < size) {
                    RectF rectF2 = (RectF) arrayList3.get(i19);
                    float f8 = ((i19 - this.currentPage) * this.slideW) + f;
                    arrayList.add(new RectF(AndroidUtilities.lerp(rectF2.left, f8, f3), AndroidUtilities.lerp(rectF2.top, paddingTop, f3), AndroidUtilities.lerp(rectF2.right, f8 + this.slideW, f3), AndroidUtilities.lerp(rectF2.bottom, this.slideH + paddingTop, f3)));
                    i19++;
                    size = size;
                }
            }
        }
        blockRow = this.currentRow;
        if (blockRow == null) {
            i17 = 0;
            i18 = 0;
        } else {
            size2 = blockRow.quoteIds.size();
            if (size2 <= 0) {
                iDp2 = 0;
                i16 = 1;
            } else {
                i16 = 1;
                iDp2 = AndroidUtilities.dp(zzkv.m(size2, 1, 16, 12));
            }
            i17 = 0;
            iMax2 = Math.max(0, blockRow.level);
            if (iMax2 <= 0) {
                iDp3 = 0;
            } else {
                iDp3 = AndroidUtilities.dp(zzkv.m(iMax2, i16, 24, 28));
            }
            i18 = iDp2 + iDp3;
        }
        if (i18 > 0) {
            iDp4 = AndroidUtilities.dp(16.0f);
        } else {
            iDp4 = 0;
        }
        setMeasuredDimension(size3, getPaddingBottom() + getPaddingTop() + this.imageH + this.caption.measure(i3 - iDp4, i4 - iDp4, size3));
        this.addButton.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
        this.switchModeButton.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
        while (true) {
            arrayList2 = this.menuButtons;
            if (i17 < arrayList2.size()) {
                break;
                break;
            } else {
                ((ImageView) arrayList2.get(i17)).measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(32.0f), 1073741824));
                i17++;
            }
        }
        if (animatedFloat.transition) {
            requestLayout();
        }
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ArrayList arrayList;
        boolean z;
        int i;
        int i2;
        VelocityTracker velocityTracker;
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        int actionMasked = motionEvent.getActionMasked();
        boolean z2 = y >= ((float) getPaddingTop()) && y < ((float) (getPaddingTop() + this.imageH));
        int i3 = -1;
        if (!isSlideshow() || this.modeProgress.transition) {
            arrayList = this.itemRects;
            if (actionMasked == 0) {
                if (!z2) {
                    return super.onTouchEvent(motionEvent);
                }
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    if (((RectF) arrayList.get(i4)).contains(x, y)) {
                        i3 = i4;
                        break;
                    }
                }
                this.pressedItem = i3;
                return true;
            }
            if (actionMasked == 1) {
                if (actionMasked == 3) {
                    this.pressedItem = -1;
                }
                return super.onTouchEvent(motionEvent);
            }
            if (z2) {
                i = 0;
                while (true) {
                    if (i < arrayList.size()) {
                        i = -1;
                        break;
                    }
                    if (((RectF) arrayList.get(i)).contains(x, y)) {
                        break;
                    }
                    i++;
                }
                i2 = this.pressedItem;
                if (i == i2) {
                    handleTap(i2);
                }
            }
            if (this.pressedItem == -1 || z2) {
                z = true;
            } else {
                z = false;
            }
            this.pressedItem = -1;
            if (z && !super.onTouchEvent(motionEvent)) {
                return false;
            }
        } else {
            ArrayList arrayList2 = this.items;
            if (arrayList2.size() < 2) {
                arrayList = this.itemRects;
                if (actionMasked == 0) {
                    if (!z2) {
                        return super.onTouchEvent(motionEvent);
                    }
                    while (i4 < arrayList.size()) {
                        if (((RectF) arrayList.get(i4)).contains(x, y)) {
                            i3 = i4;
                            break;
                        }
                    }
                    this.pressedItem = i3;
                    return true;
                }
                if (actionMasked == 1) {
                    if (actionMasked == 3) {
                        this.pressedItem = -1;
                    }
                    return super.onTouchEvent(motionEvent);
                }
                if (z2) {
                    i = 0;
                    while (true) {
                        if (i < arrayList.size()) {
                            i = -1;
                            break;
                        }
                        if (((RectF) arrayList.get(i)).contains(x, y)) {
                            break;
                            break;
                        }
                        i++;
                    }
                    i2 = this.pressedItem;
                    if (i == i2) {
                        handleTap(i2);
                    }
                }
                if (this.pressedItem == -1) {
                    z = true;
                } else {
                    z = true;
                }
                this.pressedItem = -1;
                if (z) {
                }
            } else {
                if (actionMasked == 0) {
                    if (!z2) {
                        return super.onTouchEvent(motionEvent);
                    }
                    if (this.touchSlop == 0) {
                        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                        this.touchSlop = viewConfiguration.getScaledTouchSlop();
                        this.minFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
                        this.maxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
                    }
                    this.downX = x;
                    this.downY = y;
                    this.dragging = false;
                    VelocityTracker velocityTracker2 = this.velocityTracker;
                    if (velocityTracker2 == null) {
                        this.velocityTracker = VelocityTracker.obtain();
                    } else {
                        velocityTracker2.clear();
                    }
                    this.velocityTracker.addMovement(motionEvent);
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    ValueAnimator valueAnimator = this.settleAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.settleAnimator = null;
                    }
                    this.pressedItem = this.currentPage;
                    return true;
                }
                float f = 0.0f;
                if (actionMasked == 2) {
                    VelocityTracker velocityTracker3 = this.velocityTracker;
                    if (velocityTracker3 != null) {
                        velocityTracker3.addMovement(motionEvent);
                    }
                    float f2 = x - this.downX;
                    float f3 = y - this.downY;
                    if (!this.dragging && Math.abs(f2) > this.touchSlop && Math.abs(f2) > Math.abs(f3)) {
                        this.dragging = true;
                        this.pressedItem = -1;
                    }
                    if (this.dragging) {
                        float f4 = (-f2) / this.slideW;
                        int i5 = this.currentPage;
                        if (i5 == 0 && f4 < 0.0f) {
                            f4 *= 0.3f;
                        }
                        if (i5 == arrayList2.size() - 1 && f4 > 0.0f) {
                            f4 *= 0.3f;
                        }
                        this.pageOffset = f4;
                        requestLayout();
                        invalidate();
                        return true;
                    }
                } else if (actionMasked == 1 || actionMasked == 3) {
                    if (actionMasked == 1 && (velocityTracker = this.velocityTracker) != null) {
                        velocityTracker.addMovement(motionEvent);
                        this.velocityTracker.computeCurrentVelocity(1000, this.maxFlingVelocity);
                        float xVelocity = this.velocityTracker.getXVelocity();
                        float yVelocity = this.velocityTracker.getYVelocity();
                        if (Math.abs(xVelocity) >= this.minFlingVelocity && Math.abs(xVelocity) > Math.abs(yVelocity)) {
                            f = xVelocity;
                        }
                    }
                    VelocityTracker velocityTracker4 = this.velocityTracker;
                    if (velocityTracker4 != null) {
                        velocityTracker4.recycle();
                        this.velocityTracker = null;
                    }
                    if (getParent() != null) {
                        getParent().requestDisallowInterceptTouchEvent(false);
                    }
                    if (this.dragging) {
                        this.dragging = false;
                        settle(f);
                    } else if (actionMasked == 1) {
                        int i6 = this.pressedItem;
                        int i7 = this.currentPage;
                        if (i6 == i7) {
                            handleTap(i7);
                        }
                    }
                    this.pressedItem = -1;
                    return true;
                }
            }
        }
        return true;
    }

    @Override
    public final void persistCaption() {
        this.caption.persist();
    }

    public final void rebuildItems() {
        ArrayList arrayList;
        ArrayList arrayList2;
        List listMedias = medias();
        while (true) {
            arrayList = this.items;
            if (arrayList.size() >= listMedias.size()) {
                break;
            }
            RichMediaItem richMediaItem = new RichMediaItem(this, this.resourcesProvider);
            if (this.attached) {
                richMediaItem.imageReceiver.onAttachedToWindow();
                richMediaItem.blurImageReceiver.onAttachedToWindow();
                richMediaItem.applyImage();
            }
            arrayList.add(richMediaItem);
        }
        while (arrayList.size() > listMedias.size()) {
            RichMediaItem richMediaItem2 = (RichMediaItem) arrayList.remove(arrayList.size() - 1);
            richMediaItem2.imageReceiver.onDetachedFromWindow();
            richMediaItem2.blurImageReceiver.onDetachedFromWindow();
            richMediaItem2.blurSource = null;
        }
        for (int i = 0; i < listMedias.size(); i++) {
            RichMediaItem richMediaItem3 = (RichMediaItem) arrayList.get(i);
            richMediaItem3.media = (MediaUploadState) listMedias.get(i);
            richMediaItem3.applyImage();
        }
        while (true) {
            arrayList2 = this.menuButtons;
            if (arrayList2.size() >= listMedias.size()) {
                break;
            }
            ImageView imageViewCreateCircleButton = createCircleButton();
            imageViewCreateCircleButton.setImageResource(R.drawable.iv_media_dots);
            imageViewCreateCircleButton.setOnClickListener(new RichMediaCell$$ExternalSyntheticLambda0(this, 0));
            addView(imageViewCreateCircleButton, LayoutHelper.createFrame(32, 32, 51));
            arrayList2.add(imageViewCreateCircleButton);
        }
        this.addButton.bringToFront();
        this.switchModeButton.bringToFront();
        while (arrayList2.size() > listMedias.size()) {
            ImageView imageView = (ImageView) arrayList2.remove(arrayList2.size() - 1);
            removeView(imageView);
            this.circleButtons.remove(imageView);
            this.circleButtonBg.remove(imageView);
        }
        if (this.spoilerEffect != null) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                MediaUploadState mediaUploadState = ((RichMediaItem) arrayList.get(i2)).media;
                if (mediaUploadState != null && mediaUploadState.hasSpoiler) {
                    return;
                }
            }
            this.spoilerEffect.detach(this);
            this.spoilerEffect = null;
        }
    }

    @Override
    public final void updateColors$1() {
        int i = Theme.key_chat_inFileBackground;
        Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
        this.backgroundPaint.setColor(Theme.getColor(i, resourcesProvider));
        this.selectionPaint.setColor(Theme.getColor(Theme.key_chat_inTextSelectionHighlight, resourcesProvider));
        RichCaptionController richCaptionController = this.caption;
        if (richCaptionController != null) {
            richCaptionController.applyColors();
        }
    }

    public final void updateSwitchButton(boolean z) {
        boolean z2 = this.items.size() >= 2;
        int i = z2 ? 0 : 8;
        ImageView imageView = this.switchModeButton;
        imageView.setVisibility(i);
        if (z2) {
            int i2 = isSlideshow() ? R.drawable.iv_media_slideshow : R.drawable.iv_media_collage;
            if (i2 == this.lastSwitchIconRes) {
                return;
            }
            this.lastSwitchIconRes = i2;
            if (z) {
                AndroidUtilities.updateImageViewImageAnimated(imageView, i2);
            } else {
                imageView.setImageResource(i2);
            }
        }
    }
}
