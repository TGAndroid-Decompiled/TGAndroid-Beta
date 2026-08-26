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
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Comparator$CC;
import j$.util.List;
import j$.util.Objects;
import java.util.ArrayList;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import me.vkryl.core.BitwiseUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
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
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda267;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda68;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.CubicBezierInterpolator;
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
import org.telegram.ui.GroupCreateActivity;
import org.telegram.ui.LinkManager$$ExternalSyntheticLambda1;
import org.telegram.ui.PeerColorActivity;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda52;
import org.telegram.ui.PollItemMenu$$ExternalSyntheticLambda14;
import org.telegram.ui.SettingsActivity;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda13;
import org.telegram.ui.TopicsFragment$$ExternalSyntheticLambda7;
import org.telegram.ui.bots.AffiliateProgramFragment;

public final class StarGiftPreviewSheet extends BottomSheetWithRecyclerListView {
    public static final int $r8$clinit = 0;
    public AnonymousClass5 adapter;
    public final ImageView backButton;
    public final ArrayList backdrops;
    public final ArrayList blurredPositions;
    public final GroupCreateActivity.AnonymousClass7[] buttons;
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

    public final class AnonymousClass3 extends DefaultItemAnimator {
        @Override
        public final float animateByScale(View view) {
            return 0.3f;
        }
    }

    public final class AnonymousClass5 extends UniversalAdapter {
        public AnonymousClass5(RecyclerListView recyclerListView, Context context, int i, LinkManager$$ExternalSyntheticLambda1 linkManager$$ExternalSyntheticLambda1, Theme.ResourcesProvider resourcesProvider) {
            super(recyclerListView, context, i, 0, true, linkManager$$ExternalSyntheticLambda1, resourcesProvider);
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
                giftAttributeCell.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda52(16, this, attributes));
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
                giftAttributeCell.imageView.imageReceiver.clearImage();
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
            FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(i, i, 49, 0.0f, i2 + 17, 0.0f, i2);
            BackupImageView backupImageView = giftAttributeCell.imageView;
            backupImageView.setLayoutParams(layoutParamsCreateFrame);
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
        public final void onFactorChangeFinished(float f, int i) {
        }

        @Override
        public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
            checkPercentageViewBackground();
        }
    }

    public final class TabsSelectorView extends GlassTabsView implements FactorAnimator.Target {
        public static final int $r8$clinit = 0;
        public final FactorAnimator animator;
        public final PollItemMenu$$ExternalSyntheticLambda14 onTabSelectListener;
        public int selectedTab;
        public final GlassTabView[] tabs;

        public TabsSelectorView(Context context, Theme.ResourcesProvider resourcesProvider, PollItemMenu$$ExternalSyntheticLambda14 pollItemMenu$$ExternalSyntheticLambda14) {
            super(context);
            this.animator = new FactorAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 1600L);
            this.onTabSelectListener = pollItemMenu$$ExternalSyntheticLambda14;
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
                    this.linearLayout.addView(glassTabViewArr[i2], LayoutHelper.createLinear(1.0f, 0, -1));
                    this.tabs[i2].setOnClickListener(new ChatActivity$$ExternalSyntheticLambda68(this, i2, 23));
                    i2++;
                }
            }
        }

        @Override
        public final void onFactorChangeFinished(float f, int i) {
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
        this.viewGroupPartRenderer = new ViewGroupPartRenderer(recyclerListView, containerView, new TopicsFragment$$ExternalSyntheticLambda7(recyclerListView, 3));
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
        List.EL.sort(this.backdrops, Comparator$CC.comparingDouble(new StarGiftPreviewSheet$$ExternalSyntheticLambda5(0)));
        List.EL.sort(this.patterns, Comparator$CC.comparingDouble(new StarGiftPreviewSheet$$ExternalSyntheticLambda5(5)));
        List.EL.sort(this.models, Comparator$CC.comparingDouble(new StarGiftPreviewSheet$$ExternalSyntheticLambda5(6)));
        List.EL.sort(this.simpleModels, Comparator$CC.comparingDouble(new StarGiftPreviewSheet$$ExternalSyntheticLambda5(6)));
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
        int i3 = Theme.key_dialogBackgroundGray;
        int themedColor = getThemedColor(i3);
        int i4 = Theme.key_dialogBackground;
        setBackgroundColor(ColorUtils.blendARGB(0.1f, themedColor, getThemedColor(i4)));
        fixNavigationBar();
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        blurredBackgroundSourceColor.paint.setColor(ColorUtils.blendARGB(0.1f, getThemedColor(i3), getThemedColor(i4)));
        if (Build.VERSION.SDK_INT < 31 || !SharedConfig.chatBlurEnabled()) {
            this.scrollableViewNoiseSuppressor = null;
            this.glassSourceRenderNode = null;
            this.glassFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
        } else {
            this.scrollableViewNoiseSuppressor = new DownscaleScrollableNoiseSuppressor(false);
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(blurredBackgroundSourceColor);
            this.glassSourceRenderNode = blurredBackgroundSourceRenderNode;
            final int i5 = 0;
            blurredBackgroundSourceRenderNode.onDrawablesRelativePositionChangeListener = new Runnable(this) {
                public final StarGiftPreviewSheet f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i5) {
                        case 0:
                            int i6 = Build.VERSION.SDK_INT;
                            StarGiftPreviewSheet starGiftPreviewSheet = this.f$0;
                            if (i6 < 31) {
                                starGiftPreviewSheet.getClass();
                                break;
                            } else if (starGiftPreviewSheet.scrollableViewNoiseSuppressor != null) {
                                starGiftPreviewSheet.invalidateMergedVisibleBlurredPositionsAndSourcesImpl$2(2);
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
        ExtendedGridLayoutManager extendedGridLayoutManager = new ExtendedGridLayoutManager(3, false);
        this.layoutManager = extendedGridLayoutManager;
        extendedGridLayoutManager.mSpanSizeLookup = new PeerColorActivity.Page.AnonymousClass2(this, 6);
        this.recyclerListView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f));
        this.recyclerListView.setClipToPadding(false);
        this.recyclerListView.setLayoutManager(extendedGridLayoutManager);
        this.recyclerListView.setSelectorType(9);
        this.recyclerListView.setSelectorDrawableColor(0);
        this.recyclerListView.addOnScrollListener(new SettingsActivity.AnonymousClass5(this, 9));
        AnonymousClass3 anonymousClass3 = new AnonymousClass3();
        this.itemAnimator = anonymousClass3;
        anonymousClass3.delayAnimations = false;
        anonymousClass3.mSupportsChangeAnimations = false;
        anonymousClass3.setDurations(280L);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        anonymousClass3.mAddInterpolator = cubicBezierInterpolator;
        anonymousClass3.mMoveInterpolator = cubicBezierInterpolator;
        anonymousClass3.mRemoveInterpolator = cubicBezierInterpolator;
        anonymousClass3.mChangeInterpolator = cubicBezierInterpolator;
        anonymousClass3.delayIncrement = 30L;
        this.recyclerListView.setItemAnimator(anonymousClass3);
        FrameLayout frameLayout = new FrameLayout(context);
        this.headerView = frameLayout;
        frameLayout.setClipChildren(false);
        final int i6 = 1;
        ?? r5 = new StarGiftSheet.TopView(context, resourcesProvider, new Runnable(this) {
            public final StarGiftPreviewSheet f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void run() {
                switch (i6) {
                    case 0:
                        int i7 = Build.VERSION.SDK_INT;
                        StarGiftPreviewSheet starGiftPreviewSheet = this.f$0;
                        if (i7 < 31) {
                            starGiftPreviewSheet.getClass();
                            break;
                        } else if (starGiftPreviewSheet.scrollableViewNoiseSuppressor != null) {
                            starGiftPreviewSheet.invalidateMergedVisibleBlurredPositionsAndSourcesImpl$2(2);
                            break;
                        }
                        break;
                    default:
                        this.f$0.lambda$openCrafting$8();
                        break;
                }
            }
        }, new ChatActivity$$ExternalSyntheticLambda267(21), new ChatActivity$$ExternalSyntheticLambda267(21), new ChatActivity$$ExternalSyntheticLambda267(21), new ChatActivity$$ExternalSyntheticLambda267(21), new ChatActivity$$ExternalSyntheticLambda267(21), new ChatActivity$$ExternalSyntheticLambda267(21)) {
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
            public final void onSizeChanged(int i7, int i8, int i9, int i10) {
                super.onSizeChanged(i7, i8, i9, i10);
                float fDp = AndroidUtilities.dp(12.0f);
                float[] fArr = this.r;
                fArr[3] = fDp;
                fArr[2] = fDp;
                fArr[1] = fDp;
                fArr[0] = fDp;
                Path path = this.path;
                path.rewind();
                path.addRoundRect(0.0f, 0.0f, i7, i8, this.r, Path.Direction.CW);
            }

            @Override
            public final void onSwitchPage(StarGiftSheet.PageTransition pageTransition) {
                super.onSwitchPage(pageTransition);
                StarGiftPreviewSheet.this.updateHeaderAttributes(true);
            }

            @Override
            public final void updateButtonsBackgrounds(int i7) {
                StarGiftPreviewSheet starGiftPreviewSheet = StarGiftPreviewSheet.this;
                ImageView imageView = starGiftPreviewSheet.backButton;
                if (imageView != null && Theme.setSelectorDrawableColor(imageView.getBackground(), i7, false)) {
                    starGiftPreviewSheet.backButton.invalidate();
                }
                ImageView imageView2 = starGiftPreviewSheet.headerPlay;
                if (imageView2 != null && Theme.setSelectorDrawableColor(imageView2.getBackground(), i7, false)) {
                    starGiftPreviewSheet.headerPlay.invalidate();
                }
                for (GroupCreateActivity.AnonymousClass7 anonymousClass7 : starGiftPreviewSheet.buttons) {
                    if (Theme.setSelectorDrawableColor(anonymousClass7.getBackground(), i7, false)) {
                        anonymousClass7.invalidate();
                    }
                    int iBlendARGB = ColorUtils.blendARGB(0.33f, i7, -1);
                    float[] fArr = this.hsv;
                    Color.colorToHSV(iBlendARGB, fArr);
                    fArr[1] = Math.min(1.0f, fArr[1] * 1.1f);
                    fArr[2] = Math.min(1.0f, fArr[2] * 1.1f);
                    int iHSVToColor = Color.HSVToColor(fArr);
                    AnimatedTextView animatedTextView = (AnimatedTextView) anonymousClass7.this$0;
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
        frameLayout.addView((View) r5, LayoutHelper.createFrame(-1.0f, -1));
        int i7 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i7, 0, i7, 0);
        ImageView imageView = new ImageView(context);
        this.backButton = imageView;
        imageView.setBackground(Theme.createRadSelectorDrawable(0, 285212671, 16, 16));
        imageView.setImageResource(R.drawable.ic_ab_back);
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        imageView.setScaleType(scaleType);
        imageView.setOnClickListener(new TodoItemMenu$$ExternalSyntheticLambda13(this, 9));
        ScaleStateListAnimator.apply(imageView, 0.1f, 1.5f);
        frameLayout.addView(imageView, LayoutHelper.createFrame(32, 32.0f, 51, 12.0f, 14.0f, 0.0f, 0.0f));
        ImageView imageView2 = new ImageView(context);
        this.headerPlay = imageView2;
        imageView2.setBackground(Theme.createRadSelectorDrawable(0, 285212671, 16, 16));
        imageView2.setImageResource(R.drawable.filled_gift_pause_24);
        imageView2.setScaleType(scaleType);
        imageView2.setOnClickListener(new PhotoViewer$$ExternalSyntheticLambda52(15, this, arrayList));
        ScaleStateListAnimator.apply(imageView2, 0.1f, 1.5f);
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
        this.buttons = new GroupCreateActivity.AnonymousClass7[3];
        this.tabsSelectorView = new TabsSelectorView(context, resourcesProvider, new PollItemMenu$$ExternalSyntheticLambda14(this, 29));
        int i8 = 0;
        while (true) {
            GroupCreateActivity.AnonymousClass7[] anonymousClass7Arr = this.buttons;
            if (i8 >= anonymousClass7Arr.length) {
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
                blurredBackgroundDrawableCreate.setColorProvider(new BlurredBackgroundColorProviderThemed(Theme.key_windowBackgroundWhite, resourcesProvider));
                this.tabsSelectorView.setBackground(blurredBackgroundDrawableCreate);
                this.containerView.addView(this.tabsSelectorView, LayoutHelper.createFrame(268, 64.0f, 81, 0.0f, 0.0f, 0.0f, 5.0f));
                this.selectedAttributes = new Attributes((TL_stars.starGiftAttributeBackdrop) TlUtils.findFirstInstance(arrayList, TL_stars.starGiftAttributeBackdrop.class), (TL_stars.starGiftAttributePattern) TlUtils.findFirstInstance(arrayList, TL_stars.starGiftAttributePattern.class), (TL_stars.starGiftAttributeModel) TlUtils.findFirstInstance(arrayList, TL_stars.starGiftAttributeModel.class));
                this.adapter.update(false);
                updateHeaderAttributes(false);
                return;
            }
            anonymousClass7Arr[i8] = new GroupCreateActivity.AnonymousClass7(context);
            if (i8 == 0) {
                ((TextView) this.buttons[i8].rectTmp).setText(LocaleController.getString(R.string.GiftPreviewModel));
            } else if (i8 == 1) {
                ((TextView) this.buttons[i8].rectTmp).setText(LocaleController.getString(R.string.GiftPreviewBackdrop));
            } else if (i8 == 2) {
                ((TextView) this.buttons[i8].rectTmp).setText(LocaleController.getString(R.string.GiftPreviewSymbol));
            }
            ScaleStateListAnimator.apply(this.buttons[i8], 0.1f, 1.5f);
            this.buttons[i8].setOnClickListener(new ChatActivity$$ExternalSyntheticLambda68(this, i8, 22));
            this.buttons[i8].setBackground(Theme.createRadSelectorDrawable(0, 285212671, 10, 10));
            LinearLayout linearLayout2 = this.buttonsLayout;
            GroupCreateActivity.AnonymousClass7[] anonymousClass7Arr2 = this.buttons;
            linearLayout2.addView(anonymousClass7Arr2[i8], LayoutHelper.createLinear(0, 42, 1.0f, 7, 0, 0, i8 != anonymousClass7Arr2.length - 1 ? 11 : 0, 0));
            i8++;
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
        AnonymousClass5 anonymousClass5 = new AnonymousClass5(this.recyclerListView, getContext(), this.currentAccount, new LinkManager$$ExternalSyntheticLambda1(this, 18), this.resourcesProvider);
        this.adapter = anonymousClass5;
        anonymousClass5.applyBackground = false;
        return anonymousClass5;
    }

    @Override
    public final RecyclerListView createRecyclerView(Context context) {
        return new ChatActivity.AnonymousClass34(this, context, this.resourcesProvider, 27);
    }

    @Override
    public final CharSequence getTitle() {
        return null;
    }

    public final void invalidateMergedVisibleBlurredPositionsAndSourcesImpl$2(int i) {
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
        invalidateMergedVisibleBlurredPositionsAndSourcesImpl$2(2);
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
        GroupCreateActivity.AnonymousClass7[] anonymousClass7Arr = this.buttons;
        ((AnimatedTextView) anonymousClass7Arr[0].paint).setText(anonymousClass4.getUpgradeImageViewAttribute().name, z, true);
        ((AnimatedTextView) anonymousClass7Arr[0].this$0).setText(StarGiftSheet.getRarityName(anonymousClass4.getUpgradeImageViewAttribute().rarity, new Integer[1]));
        ((AnimatedTextView) anonymousClass7Arr[1].paint).setText(anonymousClass4.getUpgradeBackdropAttribute().name, z, true);
        ((AnimatedTextView) anonymousClass7Arr[1].this$0).setText(AffiliateProgramFragment.percents(anonymousClass4.getUpgradeBackdropAttribute().getRarityPermille()), z, true);
        ((AnimatedTextView) anonymousClass7Arr[2].paint).setText(anonymousClass4.getUpgradePatternAttribute().name, z, true);
        ((AnimatedTextView) anonymousClass7Arr[2].this$0).setText(AffiliateProgramFragment.percents(anonymousClass4.getUpgradePatternAttribute().getRarityPermille()), z, true);
    }

    public final void updateSelectedForVisibleViews() {
        GiftAttributeCell giftAttributeCell;
        Attributes attributes;
        RecyclerListView recyclerListView = this.recyclerListView;
        int childCount = recyclerListView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerListView.getChildAt(i);
            if ((childAt instanceof GiftAttributeCell) && (attributes = (giftAttributeCell = (GiftAttributeCell) childAt).attributes) != null) {
                boolean zIsSelectedWithCurrentTab = isSelectedWithCurrentTab(attributes);
                giftAttributeCell.cardBackground.setSelected(zIsSelectedWithCurrentTab, true);
                giftAttributeCell.isSelected.setValue(zIsSelectedWithCurrentTab, true);
            }
        }
    }
}
