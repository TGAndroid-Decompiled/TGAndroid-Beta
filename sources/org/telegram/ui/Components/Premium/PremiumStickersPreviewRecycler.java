package org.telegram.ui.Components.Premium;

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Storage.CacheModel$$ExternalSyntheticLambda0;
import org.telegram.ui.Stories.PeerStoriesView;

public abstract class PremiumStickersPreviewRecycler extends RecyclerListView implements NotificationCenter.NotificationCenterDelegate, PagerHeaderView {
    public boolean autoPlayEnabled;
    public final PeerStoriesView.AnonymousClass34 autoScrollRunnable;
    public boolean checkEffect;
    public final CacheModel$$ExternalSyntheticLambda0 comparator;
    public final int currentAccount;
    public boolean firstDraw;
    public boolean firstMeasure;
    public boolean haptic;
    public boolean hasSelectedView;
    public final CubicBezierInterpolator interpolator;
    public boolean isVisible;
    public final LinearLayoutManager layoutManager;
    public View oldSelectedView;
    public final ArrayList premiumStickers;
    public int selectStickerOnNextLayout;
    public int size;
    public final ArrayList sortedView;

    public final class Adapter extends RecyclerListView.SelectionAdapter {
        public final PremiumFeatureBottomSheet.AnonymousClass11 this$0;

        public Adapter(PremiumFeatureBottomSheet.AnonymousClass11 anonymousClass11) {
            this.this$0 = anonymousClass11;
        }

        @Override
        public final int getItemCount() {
            return Integer.MAX_VALUE;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return false;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            PremiumFeatureBottomSheet.AnonymousClass11 anonymousClass11 = this.this$0;
            if (anonymousClass11.premiumStickers.isEmpty()) {
                return;
            }
            StickerView stickerView = (StickerView) viewHolder.itemView;
            ArrayList arrayList = anonymousClass11.premiumStickers;
            stickerView.document = (TLRPC.Document) arrayList.get(i % arrayList.size());
            stickerView.update = true;
            stickerView.setDrawImage(true ^ anonymousClass11.hasSelectedView, false, false);
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            StickerView stickerView = new StickerView(this.this$0, viewGroup.getContext());
            stickerView.setLayoutParams(new RecyclerView.LayoutParams(-1, -2));
            return new RecyclerListView.Holder(stickerView);
        }
    }

    public final class StickerView extends FrameLayout {
        public boolean animateImage;
        public float animateImageProgress;
        public final ImageReceiver centerImage;
        public TLRPC.Document document;
        public boolean drawEffect;
        public final ImageReceiver effectImage;
        public float effectProgress;
        public float progress;
        public final PremiumFeatureBottomSheet.AnonymousClass11 this$0;
        public boolean update;
        public final AnonymousClass1 view;

        public StickerView(PremiumFeatureBottomSheet.AnonymousClass11 anonymousClass11, Context context) {
            super(context);
            this.this$0 = anonymousClass11;
            this.animateImage = true;
            ?? r3 = new View(context) {
                @Override
                public final void draw(Canvas canvas) {
                    ImageReceiver imageReceiver;
                    float f;
                    float f2;
                    super.draw(canvas);
                    StickerView stickerView = StickerView.this;
                    boolean z = stickerView.update;
                    ImageReceiver imageReceiver2 = stickerView.centerImage;
                    ImageReceiver imageReceiver3 = stickerView.effectImage;
                    if (z) {
                        imageReceiver2.setImage(ImageLocation.getForDocument(stickerView.document), null, DocumentObject.getSvgThumb(stickerView.document, Theme.key_windowBackgroundGray, 0.5f), "webp", null, 1);
                        if (MessageObject.isPremiumSticker(stickerView.document)) {
                            imageReceiver = imageReceiver3;
                            imageReceiver.setImage(ImageLocation.getForDocument(MessageObject.getPremiumStickerAnimation(stickerView.document), stickerView.document), "140_140", (ImageLocation) null, (String) null, "tgs", (Object) null, 1);
                        } else {
                            imageReceiver = imageReceiver3;
                        }
                    } else {
                        imageReceiver = imageReceiver3;
                    }
                    boolean z2 = stickerView.drawEffect;
                    PremiumFeatureBottomSheet.AnonymousClass11 anonymousClass12 = stickerView.this$0;
                    if (z2) {
                        if (stickerView.effectProgress == 0.0f) {
                            stickerView.effectProgress = 1.0f;
                            if (imageReceiver.getLottieAnimation() != null) {
                                imageReceiver.getLottieAnimation().setCurrentFrame(0, false);
                            }
                        }
                        if (imageReceiver.getLottieAnimation() != null) {
                            imageReceiver.getLottieAnimation().start();
                        }
                        if (imageReceiver.getLottieAnimation() != null && imageReceiver.getLottieAnimation().isLastFrame() && anonymousClass12.autoPlayEnabled) {
                            AndroidUtilities.cancelRunOnUIThread(anonymousClass12.autoScrollRunnable);
                            AndroidUtilities.runOnUIThread(anonymousClass12.autoScrollRunnable, 0L);
                        }
                    } else if (imageReceiver.getLottieAnimation() != null) {
                        imageReceiver.getLottieAnimation().stop();
                    }
                    if (stickerView.animateImage) {
                        if (imageReceiver2.getLottieAnimation() != null) {
                            imageReceiver2.getLottieAnimation().start();
                        }
                    } else if (imageReceiver2.getLottieAnimation() != null) {
                        imageReceiver2.getLottieAnimation().stop();
                    }
                    boolean z3 = stickerView.animateImage;
                    if (z3) {
                        float f3 = stickerView.animateImageProgress;
                        if (f3 != 1.0f) {
                            stickerView.animateImageProgress = f3 + 0.10666667f;
                            invalidate();
                        } else if (!z3) {
                            f = stickerView.animateImageProgress;
                            if (f != 0.0f) {
                                stickerView.animateImageProgress = f - 0.10666667f;
                                invalidate();
                            }
                        }
                    } else if (!z3) {
                        f = stickerView.animateImageProgress;
                        if (f != 0.0f) {
                            stickerView.animateImageProgress = f - 0.10666667f;
                            invalidate();
                        }
                    }
                    stickerView.animateImageProgress = Utilities.clamp(stickerView.animateImageProgress, 1.0f, 0.0f);
                    boolean z4 = stickerView.drawEffect;
                    if (z4) {
                        float f4 = stickerView.effectProgress;
                        if (f4 != 1.0f) {
                            stickerView.effectProgress = f4 + 0.10666667f;
                            invalidate();
                        } else if (!z4) {
                            f2 = stickerView.effectProgress;
                            if (f2 != 0.0f) {
                                stickerView.effectProgress = f2 - 0.10666667f;
                                invalidate();
                            }
                        }
                    } else if (!z4) {
                        f2 = stickerView.effectProgress;
                        if (f2 != 0.0f) {
                            stickerView.effectProgress = f2 - 0.10666667f;
                            invalidate();
                        }
                    }
                    stickerView.effectProgress = Utilities.clamp(stickerView.effectProgress, 1.0f, 0.0f);
                    float f5 = anonymousClass12.size * 0.45f;
                    float f6 = 1.499267f * f5;
                    float measuredWidth = getMeasuredWidth() - f6;
                    float measuredHeight = (getMeasuredHeight() - f6) / 2.0f;
                    float f7 = f6 - f5;
                    imageReceiver2.setImageCoords((f7 - (0.02f * f6)) + measuredWidth, (f7 / 2.0f) + measuredHeight, f5, f5);
                    imageReceiver2.setAlpha((stickerView.animateImageProgress * 0.7f) + 0.3f);
                    imageReceiver2.draw(canvas);
                    if (stickerView.effectProgress != 0.0f) {
                        imageReceiver.setImageCoords(measuredWidth, measuredHeight, f6, f6);
                        imageReceiver.setAlpha(stickerView.effectProgress);
                        imageReceiver.draw(canvas);
                    }
                }
            };
            this.view = r3;
            ImageReceiver imageReceiver = new ImageReceiver(r3);
            this.centerImage = imageReceiver;
            ImageReceiver imageReceiver2 = new ImageReceiver(r3);
            this.effectImage = imageReceiver2;
            imageReceiver.setAllowStartAnimation(false);
            imageReceiver2.setAllowStartAnimation(false);
            setClipChildren(false);
            addView((View) r3, LayoutHelper.createFrame(-1, -2, 21));
        }

        @Override
        public final void onAttachedToWindow() {
            super.onAttachedToWindow();
            this.centerImage.onAttachedToWindow();
            this.effectImage.onAttachedToWindow();
        }

        @Override
        public final void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.centerImage.onDetachedFromWindow();
            this.effectImage.onDetachedFromWindow();
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int i3 = (int) (this.this$0.size * 0.6f);
            AnonymousClass1 anonymousClass1 = this.view;
            ViewGroup.LayoutParams layoutParams = anonymousClass1.getLayoutParams();
            ViewGroup.LayoutParams layoutParams2 = anonymousClass1.getLayoutParams();
            int iDp = i3 - AndroidUtilities.dp(16.0f);
            layoutParams2.height = iDp;
            layoutParams.width = iDp;
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec((int) (i3 * 0.7f), 1073741824));
        }

        public final void setDrawImage(boolean z, boolean z2, boolean z3) {
            boolean z4 = this.drawEffect;
            AnonymousClass1 anonymousClass1 = this.view;
            if (z4 != z2) {
                this.drawEffect = z2;
                if (!z3) {
                    this.effectProgress = z2 ? 1.0f : 0.0f;
                }
                anonymousClass1.invalidate();
            }
            if (this.animateImage != z) {
                this.animateImage = z;
                if (!z3) {
                    this.animateImageProgress = z ? 1.0f : 0.0f;
                }
                anonymousClass1.invalidate();
            }
        }
    }

    public PremiumStickersPreviewRecycler(Context context, int i) {
        super(context);
        ArrayList arrayList = new ArrayList();
        this.premiumStickers = arrayList;
        this.firstMeasure = true;
        this.firstDraw = true;
        PremiumFeatureBottomSheet.AnonymousClass11 anonymousClass11 = (PremiumFeatureBottomSheet.AnonymousClass11) this;
        this.autoScrollRunnable = new PeerStoriesView.AnonymousClass34(anonymousClass11, 1);
        this.interpolator = new CubicBezierInterpolator(0.0f, 0.5f, 0.5f, 1.0f);
        this.sortedView = new ArrayList();
        this.comparator = new CacheModel$$ExternalSyntheticLambda0(3);
        this.selectStickerOnNextLayout = -1;
        this.currentAccount = i;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1, false);
        this.layoutManager = linearLayoutManager;
        setLayoutManager(linearLayoutManager);
        setAdapter(new Adapter(anonymousClass11));
        setClipChildren(false);
        setOnScrollListener(new StarGiftSheet.AnonymousClass8(anonymousClass11, 5));
        setOnItemClickListener(new LimitReachedBottomSheet$$ExternalSyntheticLambda24((PremiumFeatureBottomSheet.AnonymousClass11) this, 1));
        MediaDataController.getInstance(i).preloadPremiumPreviewStickers();
        arrayList.clear();
        arrayList.addAll(MediaDataController.getInstance(i).premiumPreviewStickers);
        getAdapter().notifyDataSetChanged();
        invalidate();
    }

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.premiumStickersPreviewLoaded) {
            ArrayList arrayList = this.premiumStickers;
            arrayList.clear();
            arrayList.addAll(MediaDataController.getInstance(this.currentAccount).premiumPreviewStickers);
            getAdapter().notifyDataSetChanged();
            invalidate();
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        if (this.isVisible) {
            ArrayList arrayList = this.sortedView;
            arrayList.clear();
            for (int i = 0; i < getChildCount(); i++) {
                StickerView stickerView = (StickerView) getChildAt(i);
                float measuredHeight = ((stickerView.getMeasuredHeight() + stickerView.getTop()) + (stickerView.getMeasuredHeight() >> 1)) / (stickerView.getMeasuredHeight() + (getMeasuredHeight() >> 1));
                if (measuredHeight > 1.0f) {
                    measuredHeight = 2.0f - measuredHeight;
                }
                float fClamp = Utilities.clamp(measuredHeight, 1.0f, 0.0f);
                stickerView.progress = fClamp;
                stickerView.view.setTranslationX((1.0f - this.interpolator.getInterpolation(fClamp)) * (-getMeasuredWidth()) * 2.0f);
                arrayList.add(stickerView);
            }
            Collections.sort(arrayList, this.comparator);
            if ((this.firstDraw || this.checkEffect) && arrayList.size() > 0 && !this.premiumStickers.isEmpty()) {
                View view = (View) Fragment$$ExternalSyntheticOutline0.m(1, arrayList);
                this.oldSelectedView = view;
                drawEffectForView(view, !this.firstDraw);
                this.firstDraw = false;
                this.checkEffect = false;
            } else if (this.oldSelectedView != Fragment$$ExternalSyntheticOutline0.m(1, arrayList)) {
                this.oldSelectedView = (View) Fragment$$ExternalSyntheticOutline0.m(1, arrayList);
                if (this.haptic) {
                    try {
                        performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                canvas.save();
                canvas.translate(((StickerView) arrayList.get(i2)).getX(), ((StickerView) arrayList.get(i2)).getY());
                ((StickerView) arrayList.get(i2)).draw(canvas);
                canvas.restore();
            }
        }
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j) {
        return true;
    }

    public final void drawEffectForView(View view, boolean z) {
        this.hasSelectedView = view != null;
        for (int i = 0; i < getChildCount(); i++) {
            StickerView stickerView = (StickerView) getChildAt(i);
            if (stickerView == view) {
                stickerView.setDrawImage(true, true, z);
            } else {
                stickerView.setDrawImage(!this.hasSelectedView, false, z);
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
        if (this.autoPlayEnabled) {
            PeerStoriesView.AnonymousClass34 anonymousClass34 = this.autoScrollRunnable;
            AndroidUtilities.cancelRunOnUIThread(anonymousClass34);
            AndroidUtilities.runOnUIThread(anonymousClass34, 2700L);
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.premiumStickersPreviewLoaded);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.firstMeasure && !this.premiumStickers.isEmpty() && getChildCount() > 0) {
            this.firstMeasure = false;
            AndroidUtilities.runOnUIThread(new PremiumButtonView$$ExternalSyntheticLambda1(this, 3));
        }
        int i5 = this.selectStickerOnNextLayout;
        if (i5 > 0) {
            RecyclerView.ViewHolder viewHolderFindViewHolderForAdapterPosition = findViewHolderForAdapterPosition(i5);
            if (viewHolderFindViewHolderForAdapterPosition != null) {
                drawEffectForView(viewHolderFindViewHolderForAdapterPosition.itemView, false);
            }
            this.selectStickerOnNextLayout = -1;
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getSize(i2) > View.MeasureSpec.getSize(i)) {
            this.size = View.MeasureSpec.getSize(i);
        } else {
            this.size = View.MeasureSpec.getSize(i2);
        }
        super.onMeasure(i, i2);
    }

    public void setAutoPlayEnabled(boolean z) {
        if (this.autoPlayEnabled != z) {
            this.autoPlayEnabled = z;
            PeerStoriesView.AnonymousClass34 anonymousClass34 = this.autoScrollRunnable;
            if (!z) {
                AndroidUtilities.cancelRunOnUIThread(anonymousClass34);
                drawEffectForView(null, true);
                return;
            }
            if (z) {
                AndroidUtilities.cancelRunOnUIThread(anonymousClass34);
                AndroidUtilities.runOnUIThread(anonymousClass34, 2700L);
            }
            this.checkEffect = true;
            invalidate();
        }
    }

    public void setOffset(float f) {
        boolean z = Math.abs(f / ((float) getMeasuredWidth())) < 1.0f;
        if (this.isVisible != z) {
            this.isVisible = z;
            invalidate();
        }
    }
}
