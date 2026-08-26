package org.telegram.ui.Stars;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Comparator$CC;
import j$.util.List;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.function.ToDoubleFunction;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import me.vkryl.core.BitwiseUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLoader$$ExternalSyntheticLambda1;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.utils.tlutils.TlUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Business.ChatAttachAlertQuickRepliesLayout;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EmojiView$$ExternalSyntheticLambda24;
import org.telegram.ui.Components.ExtendedGridLayoutManager;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.ViewGroupPartRenderer;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProviderThemed;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Components.glass.GlassTabView;
import org.telegram.ui.Components.glass.GlassTabsView;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;
import org.telegram.ui.Gifts.ResaleGiftsFragment;
import org.telegram.ui.Stories.recorder.EmojiBottomSheet;
import org.telegram.ui.bots.AffiliateProgramFragment;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda0;
import org.telegram.ui.bots.BotAdView$$ExternalSyntheticLambda2;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda20;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda29;

public final class StarGiftPreviewSheet extends BottomSheetWithRecyclerListView {
    public static final int $r8$clinit = 0;
    public AnonymousClass5 adapter;
    public final ImageView backButton;
    public final ArrayList backdrops;
    public final ArrayList blurredPositions;
    public final Button[] buttons;
    public final LinearLayout buttonsLayout;
    public final boolean crafting;
    public final int currentAccount;
    public final TextView giftStatusTextView;
    public final BlurredBackgroundDrawableViewFactory glassFactory;
    public final BlurredBackgroundSourceRenderNode glassSourceRenderNode;
    public final View gradientTop;
    public boolean gradientVisible;
    public final ImageView headerPlay;
    public final FrameLayout headerView;
    public final AnonymousClass3 itemAnimator;
    public int lastBottomInset;
    public final ExtendedGridLayoutManager layoutManager;
    public int mode;
    public final ArrayList models;
    public final ArrayList patterns;
    public final BagRandomizer rBackdrops;
    public final BagRandomizer rModels;
    public final BagRandomizer rPatterns;
    public final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    public Attributes selectedAttributes;
    public final ArrayList simpleModels;
    public final PointF tabsPosP;
    public final RectF tabsRectF;
    public final TabsSelectorView tabsSelectorView;
    public final AnonymousClass4 topView;
    public final ViewGroupPartRenderer viewGroupPartRenderer;

    public final class AnonymousClass1 extends GridLayoutManager.SpanSizeLookup {
        public final int $r8$classId;
        public final Object this$0;

        public AnonymousClass1(Object obj, int i) {
            this.$r8$classId = i;
            this.this$0 = obj;
        }

        @Override
        public final int getSpanSize(int i) {
            int i2;
            int i3;
            switch (this.$r8$classId) {
                case 0:
                    StarGiftPreviewSheet starGiftPreviewSheet = (StarGiftPreviewSheet) this.this$0;
                    AnonymousClass5 anonymousClass5 = starGiftPreviewSheet.adapter;
                    if (anonymousClass5 == null || i == 0) {
                        return starGiftPreviewSheet.layoutManager.getSpanCount();
                    }
                    UItem item = anonymousClass5.getItem(i - 1);
                    return (item == null || (i2 = item.spanCount) == -1) ? starGiftPreviewSheet.layoutManager.getSpanCount() : i2;
                case 1:
                    UItem item2 = ((ResaleGiftsFragment.SelectGiftSheet) this.this$0).adapter.getItem(i - 1);
                    if (item2 == null || (i3 = item2.spanCount) == -1) {
                        return 3;
                    }
                    return i3;
                case 2:
                    EmojiBottomSheet.GifPage.GifLayoutManager gifLayoutManager = (EmojiBottomSheet.GifPage.GifLayoutManager) this.this$0;
                    return EmojiBottomSheet.GifPage.this.adapter.getItem(i) == null ? gifLayoutManager.getSpanCount() : gifLayoutManager.getSpanSizeForItem(i);
                default:
                    EmojiBottomSheet.Page page = (EmojiBottomSheet.Page) this.this$0;
                    if (page.adapter.getItemViewType(i) != 2) {
                        return page.spanCount;
                    }
                    return 1;
            }
        }
    }

    public final class AnonymousClass3 extends DefaultItemAnimator {
        @Override
        public final float animateByScale(View view) {
            return 0.3f;
        }
    }

    public final class AnonymousClass5 extends UniversalAdapter {
        public AnonymousClass5(RecyclerListView recyclerListView, Context context, int i, GiftSheet$$ExternalSyntheticLambda8 giftSheet$$ExternalSyntheticLambda8, Theme.ResourcesProvider resourcesProvider) {
            super(recyclerListView, context, i, 0, true, giftSheet$$ExternalSyntheticLambda8, resourcesProvider);
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            super.onBindViewHolder(viewHolder, i);
            View view = viewHolder.itemView;
            if (view instanceof GiftAttributeCell) {
                GiftAttributeCell giftAttributeCell = (GiftAttributeCell) view;
                Attributes attributes = giftAttributeCell.attributes;
                boolean zIsSelectedWithCurrentTab = StarGiftPreviewSheet.this.isSelectedWithCurrentTab(attributes);
                giftAttributeCell.cardBackground.setSelected(zIsSelectedWithCurrentTab, false);
                giftAttributeCell.isSelected.setValue(zIsSelectedWithCurrentTab, false);
                giftAttributeCell.setOnClickListener(new RichEditor$$ExternalSyntheticLambda20(8, this, attributes));
            }
        }
    }

    public final class AnonymousClass6 extends RecyclerListView {
        public final int $r8$classId;
        public final KeyEvent.Callback this$0;

        public AnonymousClass6(KeyEvent.Callback callback, Context context, Theme.ResourcesProvider resourcesProvider, int i) {
            super(context, resourcesProvider);
            this.$r8$classId = i;
            this.this$0 = callback;
        }

        @Override
        public boolean allowSelectChildAtPosition(float f, float f2) {
            switch (this.$r8$classId) {
                case 1:
                    ChatAttachAlertQuickRepliesLayout chatAttachAlertQuickRepliesLayout = (ChatAttachAlertQuickRepliesLayout) this.this$0;
                    return f2 >= ((float) ((AndroidUtilities.dp(30.0f) + ((ChatAttachAlert.AttachAlertLayout) chatAttachAlertQuickRepliesLayout).parentAlert.scrollOffsetY[0]) + (!((ChatAttachAlert.AttachAlertLayout) chatAttachAlertQuickRepliesLayout).parentAlert.inBubbleMode ? AndroidUtilities.statusBarHeight : 0)));
                default:
                    return super.allowSelectChildAtPosition(f, f2);
            }
        }

        @Override
        public boolean canHighlightChildAt(View view, float f, float f2) {
            switch (this.$r8$classId) {
                case 0:
                    return ((StarGiftPreviewSheet) this.this$0).canHighlightChildAt(view, f, f2);
                default:
                    return super.canHighlightChildAt(view, f, f2);
            }
        }

        @Override
        public void onLayout(boolean z, int i, int i2, int i3, int i4) {
            switch (this.$r8$classId) {
                case 0:
                    StarGiftPreviewSheet starGiftPreviewSheet = (StarGiftPreviewSheet) this.this$0;
                    starGiftPreviewSheet.applyScrolledPosition();
                    super.onLayout(z, i, i2, i3, i4);
                    starGiftPreviewSheet.invalidateMergedVisibleBlurredPositionsAndSourcesImpl(2);
                    break;
                default:
                    super.onLayout(z, i, i2, i3, i4);
                    break;
            }
        }
    }

    public final class Attributes {
        public final TL_stars.starGiftAttributeBackdrop backdrop;
        public final TL_stars.starGiftAttributeModel model;
        public final TL_stars.starGiftAttributePattern pattern;

        public Attributes(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop, TL_stars.starGiftAttributePattern stargiftattributepattern, TL_stars.starGiftAttributeModel stargiftattributemodel) {
            this.backdrop = stargiftattributebackdrop;
            this.pattern = stargiftattributepattern;
            this.model = stargiftattributemodel;
        }
    }

    public final class Button extends FrameLayout {
        public final AnimatedTextView percentView;
        public final TextView textView;
        public final AnimatedTextView titleView;

        public Button(Context context) {
            super(context);
            setClipChildren(false);
            AnimatedTextView animatedTextView = new AnimatedTextView(context, true, false, false);
            this.titleView = animatedTextView;
            animatedTextView.setTypeface(AndroidUtilities.bold());
            animatedTextView.setTextSize(AndroidUtilities.dp(13.0f));
            animatedTextView.setTextColor(-1);
            animatedTextView.setGravity(17);
            addView(animatedTextView, LayoutHelper.createFrame(-1, 16.0f, 49, 4.0f, 6.0f, 4.0f, 0.0f));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 12.0f);
            textView.setTextColor(-1879048193);
            textView.setGravity(17);
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 49, 4.0f, 20.0f, 4.0f, 0.0f));
            AnimatedTextView animatedTextView2 = new AnimatedTextView(context);
            this.percentView = animatedTextView2;
            animatedTextView2.setTypeface(AndroidUtilities.bold());
            animatedTextView2.setTextColor(-1);
            animatedTextView2.setGravity(5);
            animatedTextView2.getDrawable().centerY = true;
            animatedTextView2.setTextSize(AndroidUtilities.dp(11.0f));
            animatedTextView2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f));
            animatedTextView2.setSizeableBackground(new StarGiftSheet.RoundRectStrokeDrawable(AndroidUtilities.dp(10.0f), 285212671));
            addView(animatedTextView2, LayoutHelper.createFrame(-1, 16.0f, 53, 0.0f, -9.0f, -4.0f, 0.0f));
        }
    }

    public final class GiftAttributeCell extends FrameLayout implements FactorAnimator.Target {
        public Attributes attributes;
        public final GiftSheet.CardBackground cardBackground;
        public final FrameLayout cardBackgroundView;
        public final BackupImageView imageView;
        public final BoolAnimator isSelected;
        public TLRPC.Document lastDocument;
        public boolean noPercentageBackground;
        public final TextView percentageView;
        public Integer rarityColor;
        public final Theme.ResourcesProvider resourcesProvider;
        public final TextView textView;

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                String rarityName;
                GiftAttributeCell giftAttributeCell = (GiftAttributeCell) view;
                Attributes attributes = (Attributes) uItem.object;
                int i = uItem.intValue;
                Integer[] numArr = new Integer[1];
                giftAttributeCell.noPercentageBackground = i == 0;
                giftAttributeCell.attributes = attributes;
                BackupImageView backupImageView = giftAttributeCell.imageView;
                TextView textView = giftAttributeCell.textView;
                GiftSheet.CardBackground cardBackground = giftAttributeCell.cardBackground;
                if (i == 0) {
                    cardBackground.setBackdrop(null);
                    cardBackground.setPattern(null);
                    textView.setText(attributes.model.name);
                    TL_stars.starGiftAttributeModel stargiftattributemodel = attributes.model;
                    GiftAttributeCell.access$1900(giftAttributeCell, stargiftattributemodel.document, 80, uItem.object, true);
                    backupImageView.setColorFilter(null);
                    cardBackground.selectedColorKey = Theme.key_featuredStickers_addButton;
                    rarityName = StarGiftSheet.getRarityName(stargiftattributemodel.rarity, numArr);
                } else if (i == 1) {
                    cardBackground.setBackdrop(attributes.backdrop);
                    TL_stars.starGiftAttributePattern stargiftattributepattern = attributes.pattern;
                    cardBackground.setPattern(stargiftattributepattern);
                    cardBackground.selectedColorKey = Theme.key_windowBackgroundWhite;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = attributes.backdrop;
                    textView.setText(stargiftattributebackdrop.name);
                    GiftAttributeCell.access$1900(giftAttributeCell, stargiftattributepattern.document, 48, uItem.object, false);
                    backupImageView.setColorFilter(new PorterDuffColorFilter(ColorUtils.setAlphaComponent(stargiftattributebackdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
                    rarityName = StarGiftSheet.getRarityName(stargiftattributebackdrop.rarity, numArr);
                } else if (i == 2) {
                    cardBackground.setBackdrop(attributes.backdrop);
                    TL_stars.starGiftAttributePattern stargiftattributepattern2 = attributes.pattern;
                    cardBackground.setPattern(stargiftattributepattern2);
                    cardBackground.selectedColorKey = Theme.key_windowBackgroundWhite;
                    textView.setText(stargiftattributepattern2.name);
                    GiftAttributeCell.access$1900(giftAttributeCell, stargiftattributepattern2.document, 64, uItem.object, false);
                    backupImageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                    rarityName = StarGiftSheet.getRarityName(stargiftattributepattern2.rarity, numArr);
                } else {
                    rarityName = "";
                }
                textView.setTextColor(i == 0 ? Theme.getColor(Theme.key_dialogTextBlack, giftAttributeCell.resourcesProvider) : -1);
                giftAttributeCell.percentageView.setText(rarityName);
                giftAttributeCell.rarityColor = numArr[0];
                giftAttributeCell.checkPercentageViewBackground();
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new GiftAttributeCell(context, resourcesProvider);
            }
        }

        public GiftAttributeCell(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.isSelected = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 320L, false);
            this.resourcesProvider = resourcesProvider;
            FrameLayout frameLayout = new FrameLayout(context);
            this.cardBackgroundView = frameLayout;
            GiftSheet.CardBackground cardBackground = new GiftSheet.CardBackground(frameLayout, resourcesProvider, true);
            this.cardBackground = cardBackground;
            frameLayout.setBackground(cardBackground);
            cardBackground.selectionStyle = 1;
            addView(frameLayout, LayoutHelper.createFrame(-1, -1, 119));
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.getImageReceiver().setAutoRepeat(0);
            addView(backupImageView, LayoutHelper.createFrame(80, 80.0f, 49, 0.0f, 17.0f, 0.0f, 0.0f));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTypeface(AndroidUtilities.bold());
            textView.setTextSize(1, 13.0f);
            textView.setGravity(17);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setTextColor(-1);
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 0, 12.0f, 106.0f, 12.0f, 14.0f));
            TextView textView2 = new TextView(context);
            this.percentageView = textView2;
            textView2.setClickable(false);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextSize(1, 11.0f);
            textView2.setPadding(AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f));
            textView2.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(10.0f), 285212671));
            addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 53, 0.0f, 10.0f, 10.0f, 0.0f));
        }

        public static void access$1900(GiftAttributeCell giftAttributeCell, TLRPC.Document document, int i, Object obj, boolean z) {
            if (document == null) {
                giftAttributeCell.imageView.clearImage();
                giftAttributeCell.lastDocument = null;
                return;
            }
            if (giftAttributeCell.lastDocument == document) {
                return;
            }
            giftAttributeCell.lastDocument = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f);
            StringBuilder sb = new StringBuilder();
            sb.append(i);
            sb.append("_");
            sb.append(i);
            sb.append(z ? "_nolimit_pcache" : "");
            String string = sb.toString();
            int i2 = (80 - i) / 2;
            BackupImageView backupImageView = giftAttributeCell.imageView;
            backupImageView.setLayoutParams(LayoutHelper.createFrame(i, i, 49, 0.0f, i2 + 17, 0.0f, i2));
            backupImageView.setImage(ImageLocation.getForDocument(document), string, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), string, svgThumb, obj);
        }

        public final void checkPercentageViewBackground() {
            int iBlendARGB;
            GiftSheet.CardBackground cardBackground = this.cardBackground;
            cardBackground.selectedColor = null;
            Integer num = this.rarityColor;
            BoolAnimator boolAnimator = this.isSelected;
            TextView textView = this.percentageView;
            if (num != null) {
                iBlendARGB = Theme.blendOver(Theme.getColor(null, Theme.key_windowBackgroundWhite, false), Theme.multAlpha(AndroidUtilities.lerp(0.15f, 1.0f, boolAnimator.floatValue), this.rarityColor.intValue()));
                cardBackground.selectedColor = this.rarityColor;
                this.cardBackgroundView.invalidate();
                textView.setTextColor(ColorUtils.blendARGB(boolAnimator.floatValue, this.rarityColor.intValue(), -1));
            } else if (this.noPercentageBackground) {
                int i = Theme.key_windowBackgroundWhite;
                int color = Theme.getColor(null, i, false);
                int i2 = Theme.key_windowBackgroundWhiteBlackText;
                int iBlendARGB2 = ColorUtils.blendARGB(boolAnimator.floatValue, ColorUtils.blendARGB(0.05f, color, Theme.getColor(null, i2, false)), Theme.getColor(null, Theme.key_featuredStickers_addButton, false));
                textView.setTextColor(ColorUtils.blendARGB(boolAnimator.floatValue, ColorUtils.blendARGB(0.5f, Theme.getColor(null, i, false), Theme.getColor(null, i2, false)), -1));
                iBlendARGB = iBlendARGB2;
            } else {
                iBlendARGB = ColorUtils.blendARGB(0.5f, ColorUtils.setAlphaComponent(this.attributes.backdrop.center_color, 255), ColorUtils.setAlphaComponent(this.attributes.backdrop.pattern_color, 255));
                textView.setTextColor(-1);
            }
            if (textView.getBackground() instanceof ShapeDrawable) {
                ((ShapeDrawable) textView.getBackground()).getPaint().setColor(iBlendARGB);
                textView.invalidate();
            } else if (Theme.setSelectorDrawableColor(textView.getBackground(), iBlendARGB, false)) {
                textView.invalidate();
            }
        }

        @Override
        public final void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        }

        @Override
        public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
            checkPercentageViewBackground();
        }
    }

    public final class TabsSelectorView extends GlassTabsView implements FactorAnimator.Target {
        public static final int $r8$clinit = 0;
        public final FactorAnimator animator;
        public final DialogCell$$ExternalSyntheticLambda6 onTabSelectListener;
        public int selectedTab;
        public final GlassTabView[] tabs;

        public TabsSelectorView(Context context, Theme.ResourcesProvider resourcesProvider, DialogCell$$ExternalSyntheticLambda6 dialogCell$$ExternalSyntheticLambda6) {
            super(context);
            this.animator = new FactorAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 1600L);
            this.onTabSelectListener = dialogCell$$ExternalSyntheticLambda6;
            int i = Theme.key_glass_defaultIcon;
            int iMultAlpha = Theme.multAlpha(0.09411765f, Theme.getColor(i, resourcesProvider));
            Theme.multAlpha(0.1254902f, Theme.getColor(i, resourcesProvider));
            this.lensPaint.setColor(iMultAlpha);
            this.tabs = new GlassTabView[]{GlassTabView.createMainTab(context, resourcesProvider, GlassTabView.TabAnimation.MODELS, R.string.GiftPreviewModels), GlassTabView.createMainTab(context, resourcesProvider, GlassTabView.TabAnimation.COLORS, R.string.GiftPreviewBackdrops), GlassTabView.createMainTab(context, resourcesProvider, GlassTabView.TabAnimation.SYMBOLS, R.string.GiftPreviewSymbols)};
            int i2 = 0;
            while (true) {
                GlassTabView[] glassTabViewArr = this.tabs;
                if (i2 >= glassTabViewArr.length) {
                    glassTabViewArr[0].setSelected(true, false);
                    return;
                } else {
                    this.linearLayout.addView(glassTabViewArr[i2], LayoutHelper.createLinear(0, -1, 1.0f));
                    this.tabs[i2].setOnClickListener(new RichEditor$$ExternalSyntheticLambda29(this, i2, 7));
                    i2++;
                }
            }
        }

        @Override
        public final void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        }

        @Override
        public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
            updateLens();
            invalidate();
        }

        @Override
        public final void onSizeChanged(int i, int i2, int i3, int i4) {
            super.onSizeChanged(i, i2, i3, i4);
            updateLens();
        }

        public final void updateLens() {
            float f = this.animator.factor;
            float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), f / 3.0f);
            float fLerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), (f + 1.0f) / 3.0f);
            int measuredHeight = getMeasuredHeight() - AndroidUtilities.dp(8.0f);
            Rect rect = this.lensBounds;
            rect.set((int) fLerp, AndroidUtilities.dp(8.0f), (int) fLerp2, measuredHeight);
            int iDp = AndroidUtilities.dp(this.lensVisibility * 7.0f);
            Rect rect2 = this.lensBoundsForeground;
            rect2.set(rect);
            int i = -iDp;
            rect2.inset(i, i);
            Math.abs(f - 1.0f);
        }
    }

    public StarGiftPreviewSheet(Context context, Theme.ResourcesProvider resourcesProvider, int i, String str, ArrayList arrayList, boolean z) {
        super(context, null, false, false, false, resourcesProvider);
        this.mode = 1;
        RectF rectF = new RectF();
        this.tabsRectF = rectF;
        this.tabsPosP = new PointF();
        ArrayList arrayList2 = new ArrayList(1);
        this.blurredPositions = arrayList2;
        arrayList2.add(rectF);
        this.currentAccount = i;
        this.crafting = z;
        RecyclerListView recyclerListView = this.recyclerListView;
        BottomSheet.ContainerView containerView = this.container;
        Objects.requireNonNull(recyclerListView);
        this.viewGroupPartRenderer = new ViewGroupPartRenderer(recyclerListView, containerView, new EmojiView$$ExternalSyntheticLambda24(recyclerListView));
        ArrayList arrayListFindAllInstances = TlUtils.findAllInstances(arrayList, TL_stars.starGiftAttributeBackdrop.class);
        this.backdrops = arrayListFindAllInstances;
        BagRandomizer bagRandomizer = new BagRandomizer(arrayListFindAllInstances);
        this.rBackdrops = bagRandomizer;
        bagRandomizer.reshuffleIfEnd = false;
        ArrayList arrayListFindAllInstances2 = TlUtils.findAllInstances(arrayList, TL_stars.starGiftAttributePattern.class);
        this.patterns = arrayListFindAllInstances2;
        BagRandomizer bagRandomizer2 = new BagRandomizer(arrayListFindAllInstances2);
        this.rPatterns = bagRandomizer2;
        bagRandomizer2.reshuffleIfEnd = false;
        this.models = TlUtils.findAllInstances(arrayList, TL_stars.starGiftAttributeModel.class);
        ArrayList arrayList3 = new ArrayList();
        this.simpleModels = arrayList3;
        if (z) {
            int i2 = 0;
            while (i2 < this.models.size()) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) this.models.get(i2);
                if (stargiftattributemodel.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                    this.simpleModels.add(stargiftattributemodel);
                    this.models.remove(i2);
                    i2--;
                }
                i2++;
            }
        } else {
            arrayList3.clear();
        }
        final int i3 = 0;
        List.EL.sort(this.backdrops, Comparator$CC.comparingDouble(new ToDoubleFunction() {
            @Override
            public final double applyAsDouble(Object obj) {
                switch (i3) {
                    case 0:
                        return StarGiftPreviewSheet.getRarityIndex((TL_stars.starGiftAttributeBackdrop) obj);
                    case 1:
                        return StarGiftPreviewSheet.getRarityIndex((TL_stars.starGiftAttributePattern) obj);
                    default:
                        return StarGiftPreviewSheet.getRarityIndex((TL_stars.starGiftAttributeModel) obj);
                }
            }
        }));
        final int i4 = 1;
        List.EL.sort(this.patterns, Comparator$CC.comparingDouble(new ToDoubleFunction() {
            @Override
            public final double applyAsDouble(Object obj) {
                switch (i4) {
                    case 0:
                        return StarGiftPreviewSheet.getRarityIndex((TL_stars.starGiftAttributeBackdrop) obj);
                    case 1:
                        return StarGiftPreviewSheet.getRarityIndex((TL_stars.starGiftAttributePattern) obj);
                    default:
                        return StarGiftPreviewSheet.getRarityIndex((TL_stars.starGiftAttributeModel) obj);
                }
            }
        }));
        final int i5 = 2;
        List.EL.sort(this.models, Comparator$CC.comparingDouble(new ToDoubleFunction() {
            @Override
            public final double applyAsDouble(Object obj) {
                switch (i5) {
                    case 0:
                        return StarGiftPreviewSheet.getRarityIndex((TL_stars.starGiftAttributeBackdrop) obj);
                    case 1:
                        return StarGiftPreviewSheet.getRarityIndex((TL_stars.starGiftAttributePattern) obj);
                    default:
                        return StarGiftPreviewSheet.getRarityIndex((TL_stars.starGiftAttributeModel) obj);
                }
            }
        }));
        final int i6 = 2;
        List.EL.sort(this.simpleModels, Comparator$CC.comparingDouble(new ToDoubleFunction() {
            @Override
            public final double applyAsDouble(Object obj) {
                switch (i6) {
                    case 0:
                        return StarGiftPreviewSheet.getRarityIndex((TL_stars.starGiftAttributeBackdrop) obj);
                    case 1:
                        return StarGiftPreviewSheet.getRarityIndex((TL_stars.starGiftAttributePattern) obj);
                    default:
                        return StarGiftPreviewSheet.getRarityIndex((TL_stars.starGiftAttributeModel) obj);
                }
            }
        }));
        BagRandomizer bagRandomizer3 = new BagRandomizer(this.models);
        this.rModels = bagRandomizer3;
        bagRandomizer3.reshuffleIfEnd = false;
        ViewParent parent = this.actionBar.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.actionBar);
        }
        this.ignoreTouchActionBar = false;
        this.headerMoveTop = AndroidUtilities.dp(6.0f);
        this.occupyNavigationBar = true;
        int i7 = Theme.key_dialogBackgroundGray;
        int themedColor = getThemedColor(i7);
        int i8 = Theme.key_dialogBackground;
        setBackgroundColor(ColorUtils.blendARGB(0.1f, themedColor, getThemedColor(i8)));
        fixNavigationBar();
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        blurredBackgroundSourceColor.paint.setColor(ColorUtils.blendARGB(0.1f, getThemedColor(i7), getThemedColor(i8)));
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.chatBlurEnabled()) {
            this.scrollableViewNoiseSuppressor = null;
            this.glassSourceRenderNode = null;
            this.glassFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
        } else {
            this.scrollableViewNoiseSuppressor = new DownscaleScrollableNoiseSuppressor(false);
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(blurredBackgroundSourceColor);
            this.glassSourceRenderNode = blurredBackgroundSourceRenderNode;
            final int i9 = 0;
            blurredBackgroundSourceRenderNode.onDrawablesRelativePositionChangeListener = new Runnable(this) {
                public final StarGiftPreviewSheet f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i9) {
                        case 0:
                            int i10 = Build.VERSION.SDK_INT;
                            StarGiftPreviewSheet starGiftPreviewSheet = this.f$0;
                            if (i10 < 31) {
                                starGiftPreviewSheet.getClass();
                                break;
                            } else if (starGiftPreviewSheet.scrollableViewNoiseSuppressor != null) {
                                starGiftPreviewSheet.invalidateMergedVisibleBlurredPositionsAndSourcesImpl(2);
                                break;
                            }
                            break;
                        default:
                            this.f$0.lambda$openCrafting$8();
                            break;
                    }
                }
            };
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode);
            this.glassFactory = blurredBackgroundDrawableViewFactory;
            blurredBackgroundDrawableViewFactory.isLiquidGlassEffectAllowed = LiteMode.isEnabled(262144);
        }
        ViewPositionWatcher viewPositionWatcher = new ViewPositionWatcher(this.container);
        BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory2 = this.glassFactory;
        BottomSheet.ContainerView containerView2 = this.container;
        blurredBackgroundDrawableViewFactory2.viewPositionWatcher = viewPositionWatcher;
        blurredBackgroundDrawableViewFactory2.parent = containerView2;
        ExtendedGridLayoutManager extendedGridLayoutManager = new ExtendedGridLayoutManager(context, 3);
        this.layoutManager = extendedGridLayoutManager;
        extendedGridLayoutManager.setSpanSizeLookup(new AnonymousClass1(this, 0));
        this.recyclerListView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f));
        this.recyclerListView.setClipToPadding(false);
        this.recyclerListView.setLayoutManager(extendedGridLayoutManager);
        this.recyclerListView.setSelectorType(9);
        this.recyclerListView.setSelectorDrawableColor(0);
        this.recyclerListView.addOnScrollListener(new StarGiftSheet.AnonymousClass8(this, 13));
        AnonymousClass3 anonymousClass3 = new AnonymousClass3();
        this.itemAnimator = anonymousClass3;
        anonymousClass3.setDelayAnimations(false);
        anonymousClass3.setSupportsChangeAnimations(false);
        anonymousClass3.setDurations(280L);
        anonymousClass3.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        anonymousClass3.setDelayIncrement(30L);
        this.recyclerListView.lambda$onCellEnter$52(anonymousClass3);
        FrameLayout frameLayout = new FrameLayout(context);
        this.headerView = frameLayout;
        frameLayout.setClipChildren(false);
        final int i10 = 1;
        ?? r5 = new StarGiftSheet.TopView(context, resourcesProvider, new Runnable(this) {
            public final StarGiftPreviewSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i10) {
                    case 0:
                        int i11 = Build.VERSION.SDK_INT;
                        StarGiftPreviewSheet starGiftPreviewSheet = this.f$0;
                        if (i11 < 31) {
                            starGiftPreviewSheet.getClass();
                            break;
                        } else if (starGiftPreviewSheet.scrollableViewNoiseSuppressor != null) {
                            starGiftPreviewSheet.invalidateMergedVisibleBlurredPositionsAndSourcesImpl(2);
                            break;
                        }
                        break;
                    default:
                        this.f$0.lambda$openCrafting$8();
                        break;
                }
            }
        }, new BotAdView$$ExternalSyntheticLambda0(11), new BotAdView$$ExternalSyntheticLambda0(11), new BotAdView$$ExternalSyntheticLambda0(11), new BotAdView$$ExternalSyntheticLambda0(11), new BotAdView$$ExternalSyntheticLambda0(11), new BotAdView$$ExternalSyntheticLambda0(11)) {
            public final float[] hsv = new float[3];
            public final Path path = new Path();
            public final float[] r = new float[8];

            @Override
            public final void dispatchDraw(Canvas canvas) {
                canvas.save();
                canvas.clipPath(this.path);
                super.dispatchDraw(canvas);
                canvas.restore();
            }

            @Override
            public final int getFinalHeight() {
                return AndroidUtilities.dp(315.0f);
            }

            @Override
            public final float getRealHeight() {
                return AndroidUtilities.dp(315.0f);
            }

            @Override
            public final void onSizeChanged(int i11, int i12, int i13, int i14) {
                super.onSizeChanged(i11, i12, i13, i14);
                float fDp = AndroidUtilities.dp(12.0f);
                float[] fArr = this.r;
                fArr[3] = fDp;
                fArr[2] = fDp;
                fArr[1] = fDp;
                fArr[0] = fDp;
                Path path = this.path;
                path.rewind();
                path.addRoundRect(0.0f, 0.0f, i11, i12, this.r, Path.Direction.CW);
            }

            @Override
            public final void onSwitchPage(StarGiftSheet.PageTransition pageTransition) {
                super.onSwitchPage(pageTransition);
                StarGiftPreviewSheet.this.updateHeaderAttributes(true);
            }

            @Override
            public final void updateButtonsBackgrounds(int i11) {
                StarGiftPreviewSheet starGiftPreviewSheet = StarGiftPreviewSheet.this;
                ImageView imageView = starGiftPreviewSheet.backButton;
                if (imageView != null && Theme.setSelectorDrawableColor(imageView.getBackground(), i11, false)) {
                    starGiftPreviewSheet.backButton.invalidate();
                }
                ImageView imageView2 = starGiftPreviewSheet.headerPlay;
                if (imageView2 != null && Theme.setSelectorDrawableColor(imageView2.getBackground(), i11, false)) {
                    starGiftPreviewSheet.headerPlay.invalidate();
                }
                for (Button button : starGiftPreviewSheet.buttons) {
                    if (Theme.setSelectorDrawableColor(button.getBackground(), i11, false)) {
                        button.invalidate();
                    }
                    int iBlendARGB = ColorUtils.blendARGB(0.33f, i11, -1);
                    float[] fArr = this.hsv;
                    Color.colorToHSV(iBlendARGB, fArr);
                    fArr[1] = Math.min(1.0f, fArr[1] * 1.1f);
                    fArr[2] = Math.min(1.0f, fArr[2] * 1.1f);
                    int iHSVToColor = Color.HSVToColor(fArr);
                    AnimatedTextView animatedTextView = button.percentView;
                    if (animatedTextView.getSizeableBackground() instanceof StarGiftSheet.RoundRectStrokeDrawable) {
                        ((StarGiftSheet.RoundRectStrokeDrawable) animatedTextView.getSizeableBackground()).paint.setColor(iHSVToColor);
                        animatedTextView.invalidate();
                    } else if (Theme.setSelectorDrawableColor(animatedTextView.getSizeableBackground(), iHSVToColor, false)) {
                        animatedTextView.invalidate();
                    }
                }
            }
        };
        this.topView = r5;
        r5.onSwitchPage(new StarGiftSheet.PageTransition(1, 1));
        r5.setPreviewingAttributes(arrayList);
        r5.removeView(r5.closeView);
        frameLayout.addView((View) r5, LayoutHelper.createFrame(-1, -1.0f));
        int i11 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i11, 0, i11, 0);
        ImageView imageView = new ImageView(context);
        this.backButton = imageView;
        imageView.setBackground(Theme.createRadSelectorDrawable(0, 285212671, 16, 16));
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new BotAdView$$ExternalSyntheticLambda2(this, 7));
        ScaleStateListAnimator.apply(imageView);
        frameLayout.addView(imageView, LayoutHelper.createFrame(32, 32.0f, 51, 12.0f, 14.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.headerPlay = imageView2;
        imageView2.setBackground(Theme.createRadSelectorDrawable(0, 285212671, 16, 16));
        imageView2.setImageResource(R.drawable.filled_gift_pause_24);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new RichEditor$$ExternalSyntheticLambda20(7, this, arrayList));
        ScaleStateListAnimator.apply(imageView2);
        frameLayout.addView(imageView2, LayoutHelper.createFrame(32, 32.0f, 53, 0.0f, 14.0f, 12.0f, 0.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 21.0f);
        textView.setText(str);
        textView.setGravity(17);
        textView.setTextColor(-1);
        frameLayout.addView(textView, LayoutHelper.createFrame(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 102.0f));
        TextView textView2 = new TextView(context);
        this.giftStatusTextView = textView2;
        textView2.setTextSize(1, 13.0f);
        textView2.setText(LocaleController.getString(R.string.Gift2PreviewRandomTraits));
        textView2.setGravity(17);
        textView2.setTextColor(-1879048193);
        frameLayout.addView(textView2, LayoutHelper.createFrame(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 82.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.buttonsLayout = linearLayout;
        linearLayout.setOrientation(0);
        linearLayout.setClipChildren(false);
        this.buttons = new Button[3];
        this.tabsSelectorView = new TabsSelectorView(context, resourcesProvider, new DialogCell$$ExternalSyntheticLambda6(this, 27));
        int i12 = 0;
        while (true) {
            Button[] buttonArr = this.buttons;
            if (i12 >= buttonArr.length) {
                this.headerView.addView(this.buttonsLayout, LayoutHelper.createFrame(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 18.0f));
                this.containerView.addView(this.headerView, LayoutHelper.createFrame(-1, 315, 55));
                int iBlendARGB = ColorUtils.blendARGB(0.1f, getThemedColor(Theme.key_dialogBackgroundGray), getThemedColor(Theme.key_dialogBackground));
                View view = new View(context);
                this.gradientTop = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{ColorUtils.setAlphaComponent(iBlendARGB, 160), iBlendARGB & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, 0, 48);
                layoutParamsCreateFrame.height = AndroidUtilities.statusBarHeight;
                this.containerView.addView(view, layoutParamsCreateFrame);
                this.tabsSelectorView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                BlurredBackgroundDrawable blurredBackgroundDrawableCreate = this.glassFactory.create(this.tabsSelectorView, null, false);
                blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(4.0f));
                blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(28.0f));
                blurredBackgroundDrawableCreate.setColorProvider(new BlurredBackgroundColorProviderThemed(resourcesProvider, Theme.key_windowBackgroundWhite));
                this.tabsSelectorView.setBackground(blurredBackgroundDrawableCreate);
                this.containerView.addView(this.tabsSelectorView, LayoutHelper.createFrame(268, 64.0f, 81, 0.0f, 0.0f, 0.0f, 5.0f));
                this.selectedAttributes = new Attributes((TL_stars.starGiftAttributeBackdrop) TlUtils.findFirstInstance(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) TlUtils.findFirstInstance(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) TlUtils.findFirstInstance(arrayList, TL_stars.starGiftAttributeModel.class));
                this.adapter.update(false);
                updateHeaderAttributes(false);
                return;
            }
            buttonArr[i12] = new Button(context);
            if (i12 == 0) {
                this.buttons[i12].textView.setText(LocaleController.getString(R.string.GiftPreviewModel));
            } else if (i12 == 1) {
                this.buttons[i12].textView.setText(LocaleController.getString(R.string.GiftPreviewBackdrop));
            } else if (i12 == 2) {
                this.buttons[i12].textView.setText(LocaleController.getString(R.string.GiftPreviewSymbol));
            }
            ScaleStateListAnimator.apply(this.buttons[i12]);
            this.buttons[i12].setOnClickListener(new RichEditor$$ExternalSyntheticLambda29(this, i12, 6));
            this.buttons[i12].setBackground(Theme.createRadSelectorDrawable(0, 285212671, 10, 10));
            LinearLayout linearLayout2 = this.buttonsLayout;
            Button[] buttonArr2 = this.buttons;
            linearLayout2.addView(buttonArr2[i12], LayoutHelper.createLinear(0, 42, 1.0f, 7, 0, 0, i12 != buttonArr2.length - 1 ? 11 : 0, 0));
            i12++;
        }
    }

    public static double getRarityIndex(TL_stars.StarGiftAttribute starGiftAttribute) {
        TL_stars.StarGiftAttributeRarity starGiftAttributeRarity = starGiftAttribute.rarity;
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarity) {
            return ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            return 0.01d;
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            return 0.02d;
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            return 0.03d;
        }
        return starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon ? 0.04d : 0.0d;
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.recyclerListView, getContext(), this.currentAccount, new GiftSheet$$ExternalSyntheticLambda8(this, 27), this.resourcesProvider);
        this.adapter = anonymousClass5;
        anonymousClass5.setApplyBackground(false);
        return this.adapter;
    }

    @Override
    public final RecyclerListView createRecyclerView(Context context) {
        return new AnonymousClass6(this, context, this.resourcesProvider, 0);
    }

    @Override
    public final CharSequence getTitle() {
        return null;
    }

    public final void invalidateMergedVisibleBlurredPositionsAndSourcesImpl(int i) {
        DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
        if (Build.VERSION.SDK_INT < 31 || (downscaleScrollableNoiseSuppressor = this.scrollableViewNoiseSuppressor) == null) {
            return;
        }
        if (BitwiseUtils.hasFlag(i, 2)) {
            BottomSheet.ContainerView containerView = this.container;
            PointF pointF = this.tabsPosP;
            TabsSelectorView tabsSelectorView = this.tabsSelectorView;
            ViewPositionWatcher.computeCoordinatesInParent(tabsSelectorView, containerView, pointF);
            RectF rectF = this.tabsRectF;
            float f = pointF.x;
            rectF.left = f;
            rectF.top = pointF.y;
            rectF.right = f + tabsSelectorView.getMeasuredWidth();
            rectF.bottom = Math.min(rectF.top + tabsSelectorView.getMeasuredHeight(), this.container.getMeasuredHeight());
            if (rectF.isEmpty()) {
                return;
            }
            float f2 = -(LiteMode.isEnabled(262144) ? 0 : AndroidUtilities.dp(48.0f));
            rectF.inset(f2, f2);
            downscaleScrollableNoiseSuppressor.setupRenderNodes(1, this.blurredPositions);
        }
        if (downscaleScrollableNoiseSuppressor.rectRenderNodesCount == 0) {
            return;
        }
        downscaleScrollableNoiseSuppressor.invalidateResultRenderNodes(this.viewGroupPartRenderer, this.container.getWidth(), this.container.getHeight());
    }

    public final boolean isSelectedWithCurrentTab(Attributes attributes) {
        if (this.mode == 1) {
            return false;
        }
        int i = this.tabsSelectorView.selectedTab;
        Attributes attributes2 = this.selectedAttributes;
        if (attributes2 == null) {
            return false;
        }
        if (i == 1) {
            if (attributes.backdrop != attributes2.backdrop) {
                return false;
            }
        } else if (i == 2) {
            if (attributes.pattern != attributes2.pattern) {
                return false;
            }
        } else if (i != 0 || attributes.model != attributes2.model) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean isTouchOutside(float f, float f2) {
        FrameLayout frameLayout = this.headerView;
        return frameLayout.getVisibility() == 0 && frameLayout.getY() > f2;
    }

    @Override
    public final void mainContainerDispatchDraw(Canvas canvas) {
        DownscaleScrollableNoiseSuppressor downscaleScrollableNoiseSuppressor;
        BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode;
        super.mainContainerDispatchDraw(canvas);
        int width = this.container.getWidth();
        int height = this.container.getHeight();
        if (Build.VERSION.SDK_INT < 31 || !canvas.isHardwareAccelerated() || (downscaleScrollableNoiseSuppressor = this.scrollableViewNoiseSuppressor) == null || (blurredBackgroundSourceRenderNode = this.glassSourceRenderNode) == null || blurredBackgroundSourceRenderNode.inRecording || !blurredBackgroundSourceRenderNode.needUpdateDisplayList(width, height)) {
            return;
        }
        RecordingCanvas recordingCanvasBeginRecording = blurredBackgroundSourceRenderNode.beginRecording(width, height);
        recordingCanvasBeginRecording.drawColor(getThemedColor(Theme.key_dialogBackgroundGray));
        downscaleScrollableNoiseSuppressor.draw(recordingCanvasBeginRecording, LiteMode.isEnabled(262144) ? -2 : -3);
        blurredBackgroundSourceRenderNode.endRecording();
    }

    @Override
    public final void onInsetsChanged() {
        super.onInsetsChanged();
        int systemBottomInset = getSystemBottomInset();
        if (this.lastBottomInset != systemBottomInset) {
            this.lastBottomInset = systemBottomInset;
            this.recyclerListView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f) + systemBottomInset);
            TabsSelectorView tabsSelectorView = this.tabsSelectorView;
            ((ViewGroup.MarginLayoutParams) tabsSelectorView.getLayoutParams()).bottomMargin = AndroidUtilities.dp(5.0f) + this.lastBottomInset;
            tabsSelectorView.requestLayout();
        }
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        invalidateMergedVisibleBlurredPositionsAndSourcesImpl(2);
    }

    public final void setMode(int i) {
        if (this.mode == i) {
            return;
        }
        this.mode = i;
        this.headerPlay.setImageResource(i == 2 ? R.drawable.filled_gift_play_24 : R.drawable.filled_gift_pause_24);
        this.giftStatusTextView.setText(LocaleController.getString(i == 2 ? R.string.Gift2PreviewSelectedTraits : R.string.Gift2PreviewRandomTraits));
        updateSelectedForVisibleViews();
    }

    public final void updateHeaderAttributes(boolean z) {
        AnonymousClass4 anonymousClass4 = this.topView;
        if (anonymousClass4.getUpgradeImageViewAttribute() == null || anonymousClass4.getUpgradeBackdropAttribute() == null || anonymousClass4.getUpgradePatternAttribute() == null) {
            return;
        }
        Button[] buttonArr = this.buttons;
        buttonArr[0].titleView.setText(anonymousClass4.getUpgradeImageViewAttribute().name, z);
        buttonArr[0].percentView.setText(StarGiftSheet.getRarityName(anonymousClass4.getUpgradeImageViewAttribute().rarity, new Integer[1]));
        buttonArr[1].titleView.setText(anonymousClass4.getUpgradeBackdropAttribute().name, z);
        buttonArr[1].percentView.setText(AffiliateProgramFragment.percents(anonymousClass4.getUpgradeBackdropAttribute().getRarityPermille()), z);
        buttonArr[2].titleView.setText(anonymousClass4.getUpgradePatternAttribute().name, z);
        buttonArr[2].percentView.setText(AffiliateProgramFragment.percents(anonymousClass4.getUpgradePatternAttribute().getRarityPermille()), z);
    }

    public final void updateSelectedForVisibleViews() {
        GiftAttributeCell giftAttributeCell;
        Attributes attributes;
        int childCount = this.recyclerListView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.recyclerListView.getChildAt(i);
            if ((childAt instanceof GiftAttributeCell) && (attributes = (giftAttributeCell = (GiftAttributeCell) childAt).attributes) != null) {
                boolean zIsSelectedWithCurrentTab = isSelectedWithCurrentTab(attributes);
                giftAttributeCell.cardBackground.setSelected(zIsSelectedWithCurrentTab, true);
                giftAttributeCell.isSelected.setValue(zIsSelectedWithCurrentTab, true);
            }
        }
    }

    public final void updateTranslationHeader() {
        float y;
        boolean z;
        float y2;
        int measuredHeight;
        boolean z2 = true;
        int childCount = this.recyclerListView.getChildCount() - 1;
        while (true) {
            FrameLayout frameLayout = this.headerView;
            if (childCount >= 0) {
                View childAt = this.recyclerListView.getChildAt(childCount);
                int childAdapterPosition = this.recyclerListView.getChildAdapterPosition(childAt);
                if (childAdapterPosition >= 0) {
                    if (childAdapterPosition == 2) {
                        y2 = childAt.getY();
                        measuredHeight = frameLayout.getMeasuredHeight();
                    } else {
                        if (childAdapterPosition == 1) {
                            y = childAt.getY();
                        } else if (childAdapterPosition == 0) {
                            y2 = childAt.getY();
                            measuredHeight = frameLayout.getMeasuredHeight();
                        }
                        z = true;
                    }
                    y = y2 - measuredHeight;
                    z = true;
                }
                childCount--;
            } else {
                y = 0.0f;
                z = false;
            }
            float height = frameLayout.getHeight() + y;
            if (z && height >= 0.0f) {
                z2 = false;
            }
            if (this.gradientVisible != z2) {
                this.gradientVisible = z2;
                View view = this.gradientTop;
                if (z2) {
                    view.setVisibility(0);
                }
                view.animate().alpha(z2 ? 1.0f : 0.0f).setDuration(200L).withEndAction(new FileLoader$$ExternalSyntheticLambda1(this, z2, 13)).start();
            }
            this.headerMoveTop = y <= 0.0f ? 0 : AndroidUtilities.dp(6.0f);
            frameLayout.setVisibility(z ? 0 : 8);
            frameLayout.setTranslationY(y);
            return;
        }
    }
}
