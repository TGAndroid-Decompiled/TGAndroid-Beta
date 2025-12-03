package org.telegram.ui.Stars;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.os.SystemClock;
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
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
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
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.tlutils.TlUtils;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedTextView;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.ExtendedGridLayoutManager;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.DownscaleScrollableNoiseSuppressor;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.BlurredBackgroundColorProviderThemed;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceRenderNode;
import org.telegram.ui.Components.chat.ViewPositionWatcher;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Stars.StarGiftPreviewSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.bots.AffiliateProgramFragment;

public class StarGiftPreviewSheet extends BottomSheetWithRecyclerListView {
    private UniversalAdapter adapter;
    private final ArrayList backdrops;
    private final ArrayList blurredPositions;
    public final Button[] buttons;
    private final LinearLayout buttonsLayout;
    private final int currentAccount;
    private final TL_stars.StarGift gift;
    private final TextView giftNameTextView;
    private final TextView giftStatusTextView;
    private final BlurredBackgroundDrawableViewFactory glassFactory;
    private final BlurredBackgroundSourceColor glassSourceFallback;
    private final BlurredBackgroundSourceRenderNode glassSourceRenderNode;
    private final View gradientTop;
    private boolean gradientVisible;
    private final FrameLayout headerView;
    private final DefaultItemAnimator itemAnimator;
    private int lastBottomInset;
    private final ExtendedGridLayoutManager layoutManager;
    private final ArrayList models;
    private final ArrayList patterns;
    private final BagRandomizer rBackdrops;
    private final BagRandomizer rModels;
    private final BagRandomizer rPatterns;
    private final DownscaleScrollableNoiseSuppressor scrollableViewNoiseSuppressor;
    private final PointF tabsPosP;
    private final RectF tabsRectF;
    private final TabsSelectorView tabsSelectorView;
    private final PointF tmpViewPointF;
    private final RectF tmpViewRectF;
    private final StarGiftSheet.TopView topView;

    public static void lambda$new$0(View view) {
    }

    public static void lambda$new$1(View view) {
    }

    public static void lambda$new$2(View view) {
    }

    public static void lambda$new$3(View view) {
    }

    public static void lambda$new$4(View view) {
    }

    public static void lambda$new$5(View view) {
    }

    @Override
    protected CharSequence getTitle() {
        return null;
    }

    public StarGiftPreviewSheet(Context context, Theme.ResourcesProvider resourcesProvider, int i, TL_stars.StarGift starGift, ArrayList arrayList) {
        super(context, null, false, false, false, resourcesProvider);
        RectF rectF = new RectF();
        this.tabsRectF = rectF;
        this.tabsPosP = new PointF();
        ArrayList arrayList2 = new ArrayList(1);
        this.blurredPositions = arrayList2;
        arrayList2.add(rectF);
        this.tmpViewRectF = new RectF();
        this.tmpViewPointF = new PointF();
        this.currentAccount = i;
        this.gift = starGift;
        ArrayList findAllInstances = TlUtils.findAllInstances(arrayList, TL_stars.starGiftAttributeBackdrop.class);
        this.backdrops = findAllInstances;
        BagRandomizer bagRandomizer = new BagRandomizer(findAllInstances);
        this.rBackdrops = bagRandomizer;
        bagRandomizer.setReshuffleIfEnd(false);
        ArrayList findAllInstances2 = TlUtils.findAllInstances(arrayList, TL_stars.starGiftAttributePattern.class);
        this.patterns = findAllInstances2;
        BagRandomizer bagRandomizer2 = new BagRandomizer(findAllInstances2);
        this.rPatterns = bagRandomizer2;
        bagRandomizer2.setReshuffleIfEnd(false);
        ArrayList findAllInstances3 = TlUtils.findAllInstances(arrayList, TL_stars.starGiftAttributeModel.class);
        this.models = findAllInstances3;
        BagRandomizer bagRandomizer3 = new BagRandomizer(findAllInstances3);
        this.rModels = bagRandomizer3;
        bagRandomizer3.setReshuffleIfEnd(false);
        ViewParent parent = this.actionBar.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.actionBar);
        }
        this.ignoreTouchActionBar = false;
        this.headerMoveTop = AndroidUtilities.dp(64.0f);
        this.occupyNavigationBar = true;
        setBackgroundColor(getBackgroundColor());
        fixNavigationBar();
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        this.glassSourceFallback = blurredBackgroundSourceColor;
        blurredBackgroundSourceColor.setColor(getBackgroundColor());
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            this.scrollableViewNoiseSuppressor = new DownscaleScrollableNoiseSuppressor();
            BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode = new BlurredBackgroundSourceRenderNode(blurredBackgroundSourceColor);
            this.glassSourceRenderNode = blurredBackgroundSourceRenderNode;
            blurredBackgroundSourceRenderNode.setOnDrawablesRelativePositionChangeListener(new Runnable() {
                @Override
                public final void run() {
                    StarGiftPreviewSheet.this.invalidateMergedVisibleBlurredPositionsAndSourcesPositions();
                }
            });
            BlurredBackgroundDrawableViewFactory blurredBackgroundDrawableViewFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceRenderNode);
            this.glassFactory = blurredBackgroundDrawableViewFactory;
            blurredBackgroundDrawableViewFactory.setLiquidGlassEffectAllowed(LiteMode.isEnabled(262144));
        } else {
            this.scrollableViewNoiseSuppressor = null;
            this.glassSourceRenderNode = null;
            this.glassFactory = new BlurredBackgroundDrawableViewFactory(blurredBackgroundSourceColor);
        }
        this.glassFactory.setSourceRootView(new ViewPositionWatcher(this.container), this.container);
        ExtendedGridLayoutManager extendedGridLayoutManager = new ExtendedGridLayoutManager(context, 3);
        this.layoutManager = extendedGridLayoutManager;
        extendedGridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
            @Override
            public int getSpanSize(int i2) {
                int i3;
                if (StarGiftPreviewSheet.this.adapter == null || i2 == 0) {
                    return StarGiftPreviewSheet.this.layoutManager.getSpanCount();
                }
                UItem item = StarGiftPreviewSheet.this.adapter.getItem(i2 - 1);
                return (item == null || (i3 = item.spanCount) == -1) ? StarGiftPreviewSheet.this.layoutManager.getSpanCount() : i3;
            }
        });
        this.recyclerListView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(74.0f));
        this.recyclerListView.setClipToPadding(false);
        this.recyclerListView.setLayoutManager(extendedGridLayoutManager);
        this.recyclerListView.setSelectorType(9);
        this.recyclerListView.setSelectorDrawableColor(0);
        this.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                super.onScrolled(recyclerView, i2, i3);
                StarGiftPreviewSheet.this.updateTranslationHeader();
                if (Build.VERSION.SDK_INT < 31 || StarGiftPreviewSheet.this.scrollableViewNoiseSuppressor == null) {
                    return;
                }
                StarGiftPreviewSheet.this.scrollableViewNoiseSuppressor.onScrolled(i2, i3);
                StarGiftPreviewSheet.this.invalidateMergedVisibleBlurredPositionsAndSources(1);
            }
        });
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator() {
            @Override
            protected float animateByScale(View view) {
                return 0.3f;
            }
        };
        this.itemAnimator = defaultItemAnimator;
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDurations(280L);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDelayIncrement(30L);
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        FrameLayout frameLayout = new FrameLayout(context);
        this.headerView = frameLayout;
        frameLayout.setClipChildren(false);
        StarGiftSheet.TopView topView = new StarGiftSheet.TopView(context, resourcesProvider, new Runnable() {
            @Override
            public final void run() {
                StarGiftPreviewSheet.this.onBackPressed();
            }
        }, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StarGiftPreviewSheet.lambda$new$0(view);
            }
        }, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StarGiftPreviewSheet.lambda$new$1(view);
            }
        }, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StarGiftPreviewSheet.lambda$new$2(view);
            }
        }, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StarGiftPreviewSheet.lambda$new$3(view);
            }
        }, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StarGiftPreviewSheet.lambda$new$4(view);
            }
        }, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                StarGiftPreviewSheet.lambda$new$5(view);
            }
        }) {
            final float[] hsv = new float[3];
            Path path = new Path();
            float[] r = new float[8];

            @Override
            public float getRealHeight() {
                return AndroidUtilities.dp(315.0f);
            }

            @Override
            public int getFinalHeight() {
                return AndroidUtilities.dp(315.0f);
            }

            @Override
            public void updateButtonsBackgrounds(int i2) {
                super.updateButtonsBackgrounds(i2);
                for (Button button : StarGiftPreviewSheet.this.buttons) {
                    if (Theme.setSelectorDrawableColor(button.getBackground(), i2, false)) {
                        button.invalidate();
                    }
                    Color.colorToHSV(ColorUtils.blendARGB(i2, -1, 0.33f), this.hsv);
                    float[] fArr = this.hsv;
                    fArr[1] = Math.min(1.0f, fArr[1] * 1.1f);
                    float[] fArr2 = this.hsv;
                    fArr2[2] = Math.min(1.0f, fArr2[2] * 1.1f);
                    if (Theme.setSelectorDrawableColor(button.percentView.getSizeableBackground(), Color.HSVToColor(this.hsv), false)) {
                        button.percentView.invalidate();
                    }
                }
            }

            @Override
            public void onSwitchPage(StarGiftSheet.PageTransition pageTransition) {
                super.onSwitchPage(pageTransition);
                StarGiftPreviewSheet.this.updateHeaderAttributes(true);
            }

            @Override
            protected void onSizeChanged(int i2, int i3, int i4, int i5) {
                super.onSizeChanged(i2, i3, i4, i5);
                float[] fArr = this.r;
                float dp = AndroidUtilities.dp(12.0f);
                fArr[3] = dp;
                fArr[2] = dp;
                fArr[1] = dp;
                fArr[0] = dp;
                this.path.rewind();
                this.path.addRoundRect(0.0f, 0.0f, i2, i3, this.r, Path.Direction.CW);
            }

            @Override
            public void dispatchDraw(Canvas canvas) {
                canvas.save();
                canvas.clipPath(this.path);
                super.dispatchDraw(canvas);
                canvas.restore();
            }
        };
        this.topView = topView;
        topView.onSwitchPage(new StarGiftSheet.PageTransition(1, 1, 1.0f));
        topView.setPreviewingAttributes(arrayList);
        topView.hideCloseButton();
        frameLayout.addView(topView, LayoutHelper.createFrame(-1, -1.0f));
        int i2 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i2, 0, i2, 0);
        TextView textView = new TextView(context);
        this.giftNameTextView = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 21.0f);
        textView.setText(starGift.title);
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
        int i3 = 0;
        while (true) {
            Button[] buttonArr = this.buttons;
            if (i3 < buttonArr.length) {
                buttonArr[i3] = new Button(context);
                if (i3 == 0) {
                    this.buttons[i3].textView.setText(LocaleController.getString(R.string.GiftPreviewModel));
                } else if (i3 == 1) {
                    this.buttons[i3].textView.setText(LocaleController.getString(R.string.GiftPreviewBackdrop));
                } else if (i3 == 2) {
                    this.buttons[i3].textView.setText(LocaleController.getString(R.string.GiftPreviewSymbol));
                }
                this.buttons[i3].setBackground(Theme.createRadSelectorDrawable(0, 285212671, 10, 10));
                LinearLayout linearLayout2 = this.buttonsLayout;
                Button[] buttonArr2 = this.buttons;
                linearLayout2.addView(buttonArr2[i3], LayoutHelper.createLinear(0, 42, 1.0f, 7, 0, 0, i3 != buttonArr2.length - 1 ? 11 : 0, 0));
                i3++;
            } else {
                this.headerView.addView(this.buttonsLayout, LayoutHelper.createFrame(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 18.0f));
                this.containerView.addView(this.headerView, 0, LayoutHelper.createFrame(-1, 315, 55));
                int backgroundColor = getBackgroundColor();
                View view = new View(context);
                this.gradientTop = view;
                view.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{ColorUtils.setAlphaComponent(backgroundColor, 160), backgroundColor & 16777215}));
                view.setAlpha(0.0f);
                FrameLayout.LayoutParams createFrame = LayoutHelper.createFrame(-1, 0, 48);
                createFrame.height = AndroidUtilities.statusBarHeight;
                this.containerView.addView(view, createFrame);
                TabsSelectorView tabsSelectorView = new TabsSelectorView(context, resourcesProvider, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        StarGiftPreviewSheet.this.lambda$new$6((Integer) obj);
                    }
                });
                this.tabsSelectorView = tabsSelectorView;
                tabsSelectorView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                BlurredBackgroundDrawable create = this.glassFactory.create(tabsSelectorView);
                create.setPadding(AndroidUtilities.dp(4.0f));
                create.setRadius(AndroidUtilities.dp(28.0f));
                create.setColorProvider(new BlurredBackgroundColorProviderThemed(resourcesProvider, Theme.key_windowBackgroundWhite));
                tabsSelectorView.setBackground(create);
                this.containerView.addView(tabsSelectorView, LayoutHelper.createFrame(268, 64.0f, 81, 0.0f, 0.0f, 0.0f, 5.0f));
                this.adapter.update(false);
                updateHeaderAttributes(false);
                return;
            }
        }
    }

    public void lambda$new$6(Integer num) {
        this.itemAnimator.endAnimations();
        this.adapter.update(true);
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(this.recyclerListView, getContext(), this.currentAccount, 0, true, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                StarGiftPreviewSheet.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        return this.adapter;
    }

    public void updateTranslationHeader() {
        float f;
        boolean z;
        float y;
        int measuredHeight;
        boolean z2 = true;
        int childCount = this.recyclerListView.getChildCount() - 1;
        while (true) {
            if (childCount < 0) {
                f = 0.0f;
                z = false;
                break;
            }
            View childAt = this.recyclerListView.getChildAt(childCount);
            int childAdapterPosition = this.recyclerListView.getChildAdapterPosition(childAt);
            if (childAdapterPosition >= 0) {
                if (childAdapterPosition == 2) {
                    y = childAt.getY();
                    measuredHeight = this.headerView.getMeasuredHeight();
                    break;
                } else if (childAdapterPosition == 1) {
                    f = childAt.getY();
                    break;
                } else if (childAdapterPosition == 0) {
                    y = childAt.getY();
                    measuredHeight = this.headerView.getMeasuredHeight();
                    break;
                }
            }
            childCount--;
        }
        f = y - measuredHeight;
        z = true;
        float height = this.headerView.getHeight() + f;
        if (z && height >= 0.0f) {
            z2 = false;
        }
        if (this.gradientVisible != z2) {
            this.gradientVisible = z2;
            this.gradientTop.animate().alpha(z2 ? 1.0f : 0.0f).setDuration(200L).start();
        }
        this.headerMoveTop = f <= 0.0f ? 0 : AndroidUtilities.dp(64.0f);
        this.headerView.setVisibility(z ? 0 : 8);
        this.headerView.setTranslationY(f);
    }

    public void updateHeaderAttributes(boolean z) {
        if (this.topView.getUpgradeImageViewAttribute() == null || this.topView.getUpgradeBackdropAttribute() == null || this.topView.getUpgradePatternAttribute() == null) {
            return;
        }
        this.buttons[0].titleView.setText(this.topView.getUpgradeImageViewAttribute().name, z);
        this.buttons[0].percentView.setText(AffiliateProgramFragment.percents(this.topView.getUpgradeImageViewAttribute().rarity_permille), z);
        this.buttons[1].titleView.setText(this.topView.getUpgradeBackdropAttribute().name, z);
        this.buttons[1].percentView.setText(AffiliateProgramFragment.percents(this.topView.getUpgradeBackdropAttribute().rarity_permille), z);
        this.buttons[2].titleView.setText(this.topView.getUpgradePatternAttribute().name, z);
        this.buttons[2].percentView.setText(AffiliateProgramFragment.percents(this.topView.getUpgradePatternAttribute().rarity_permille), z);
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        if (this.models == null || this.backdrops == null || this.patterns == null) {
            return;
        }
        arrayList.add(UItem.asSpace(AndroidUtilities.dp(315.0f)));
        this.rBackdrops.reset();
        this.rPatterns.reset();
        this.rModels.reset();
        int selectedTab = this.tabsSelectorView.getSelectedTab();
        if (selectedTab == 0) {
            arrayList.add(UItem.asCenterShadow(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountModels", this.models.size()))));
            Iterator it = this.models.iterator();
            while (it.hasNext()) {
                arrayList.add(GiftAttributeCell.Factory.asAttribute(selectedTab, new Attributes((TL_stars.starGiftAttributeBackdrop) this.rBackdrops.next(), (TL_stars.starGiftAttributePattern) this.rPatterns.next(), (TL_stars.starGiftAttributeModel) it.next())));
            }
            return;
        }
        if (selectedTab == 1) {
            arrayList.add(UItem.asCenterShadow(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountBackdrops", this.backdrops.size()))));
            Iterator it2 = this.backdrops.iterator();
            while (it2.hasNext()) {
                arrayList.add(GiftAttributeCell.Factory.asAttribute(selectedTab, new Attributes((TL_stars.starGiftAttributeBackdrop) it2.next(), (TL_stars.starGiftAttributePattern) this.rPatterns.next(), (TL_stars.starGiftAttributeModel) this.rModels.next())));
            }
            return;
        }
        if (selectedTab == 2) {
            arrayList.add(UItem.asCenterShadow(AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("GiftPreviewCountSymbols", this.patterns.size()))));
            Iterator it3 = this.patterns.iterator();
            while (it3.hasNext()) {
                arrayList.add(GiftAttributeCell.Factory.asAttribute(selectedTab, new Attributes((TL_stars.starGiftAttributeBackdrop) this.rBackdrops.next(), (TL_stars.starGiftAttributePattern) it3.next(), (TL_stars.starGiftAttributeModel) this.rModels.next())));
            }
        }
    }

    public static class Attributes {
        public final TL_stars.starGiftAttributeBackdrop backdrop;
        public final TL_stars.starGiftAttributeModel model;
        public final TL_stars.starGiftAttributePattern pattern;

        public Attributes(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop, TL_stars.starGiftAttributePattern stargiftattributepattern, TL_stars.starGiftAttributeModel stargiftattributemodel) {
            this.backdrop = stargiftattributebackdrop;
            this.pattern = stargiftattributepattern;
            this.model = stargiftattributemodel;
        }
    }

    public static class GiftAttributeCell extends FrameLayout {
        private final GiftSheet.CardBackground cardBackground;
        private final FrameLayout cardBackgroundView;
        private final int currentAccount;
        private final BackupImageView imageView;
        private TLRPC.Document lastDocument;
        private final TextView percentageView;
        private final Theme.ResourcesProvider resourcesProvider;
        private final TextView textView;

        public GiftAttributeCell(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.currentAccount = i;
            this.resourcesProvider = resourcesProvider;
            FrameLayout frameLayout = new FrameLayout(context);
            this.cardBackgroundView = frameLayout;
            GiftSheet.CardBackground cardBackground = new GiftSheet.CardBackground(frameLayout, resourcesProvider, true);
            this.cardBackground = cardBackground;
            frameLayout.setBackground(cardBackground);
            addView(frameLayout, LayoutHelper.createFrame(-1, -1, 119));
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.getImageReceiver().setAutoRepeat(0);
            addView(backupImageView, LayoutHelper.createFrame(90, 90.0f, 49, 0.0f, 12.0f, 0.0f, 0.0f));
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
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextSize(1, 11.0f);
            textView2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(5.0f), AndroidUtilities.dp(1.0f));
            textView2.setBackground(Theme.createRadSelectorDrawable(0, 285212671, 10, 10));
            addView(textView2, LayoutHelper.createFrame(-2, -2.0f, 53, 0.0f, 10.0f, 10.0f, 0.0f));
        }

        public void setSticker(TLRPC.Document document, int i, Object obj) {
            if (document == null) {
                this.imageView.clearImage();
                this.lastDocument = null;
                return;
            }
            if (this.lastDocument == document) {
                return;
            }
            this.lastDocument = document;
            TLRPC.PhotoSize closestPhotoSizeWithSize = FileLoader.getClosestPhotoSizeWithSize(document.thumbs, AndroidUtilities.dp(100.0f));
            SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(document, Theme.key_windowBackgroundGray, 0.3f);
            String str = i + "_" + i;
            this.imageView.setLayoutParams(LayoutHelper.createFrame(i, i, 49, 0.0f, r3 + 12, 0.0f, (90 - i) / 2));
            this.imageView.setImage(ImageLocation.getForDocument(document), str, ImageLocation.getForDocument(closestPhotoSizeWithSize, document), str, svgThumb, obj);
        }

        public static class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public GiftAttributeCell createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new GiftAttributeCell(context, i, resourcesProvider);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                int i;
                GiftAttributeCell giftAttributeCell = (GiftAttributeCell) view;
                Attributes attributes = (Attributes) uItem.object;
                int i2 = uItem.intValue;
                boolean z2 = i2 == 0;
                if (i2 == 0) {
                    giftAttributeCell.cardBackground.setBackdrop(null);
                    giftAttributeCell.cardBackground.setPattern(null);
                    giftAttributeCell.textView.setText(attributes.model.name);
                    giftAttributeCell.setSticker(attributes.model.document, 90, uItem.object);
                    giftAttributeCell.imageView.setColorFilter(null);
                    i = attributes.model.rarity_permille;
                } else if (i2 == 1) {
                    giftAttributeCell.cardBackground.setBackdrop(attributes.backdrop);
                    giftAttributeCell.cardBackground.setPattern(attributes.pattern);
                    giftAttributeCell.textView.setText(attributes.backdrop.name);
                    giftAttributeCell.setSticker(attributes.pattern.document, 48, uItem.object);
                    giftAttributeCell.imageView.setColorFilter(new PorterDuffColorFilter(ColorUtils.setAlphaComponent(attributes.backdrop.pattern_color, 64), PorterDuff.Mode.SRC_IN));
                    i = attributes.backdrop.rarity_permille;
                } else if (i2 == 2) {
                    giftAttributeCell.cardBackground.setBackdrop(attributes.backdrop);
                    giftAttributeCell.cardBackground.setPattern(attributes.pattern);
                    giftAttributeCell.textView.setText(attributes.pattern.name);
                    giftAttributeCell.setSticker(attributes.pattern.document, 64, uItem.object);
                    giftAttributeCell.imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                    i = attributes.pattern.rarity_permille;
                } else {
                    i = 0;
                }
                giftAttributeCell.textView.setTextColor(i2 == 0 ? Theme.getColor(Theme.key_dialogTextBlack, giftAttributeCell.resourcesProvider) : -1);
                giftAttributeCell.percentageView.setText(AffiliateProgramFragment.percents(i));
                if (z2) {
                    TextView textView = giftAttributeCell.percentageView;
                    int i3 = Theme.key_windowBackgroundWhite;
                    int color = Theme.getColor(i3);
                    int i4 = Theme.key_windowBackgroundWhiteBlackText;
                    textView.setTextColor(ColorUtils.blendARGB(color, Theme.getColor(i4), 0.5f));
                    Theme.setSelectorDrawableColor(giftAttributeCell.percentageView.getBackground(), ColorUtils.blendARGB(Theme.getColor(i3), Theme.getColor(i4), 0.05f), false);
                    return;
                }
                giftAttributeCell.percentageView.setTextColor(-1);
                Theme.setSelectorDrawableColor(giftAttributeCell.percentageView.getBackground(), ColorUtils.blendARGB(ColorUtils.setAlphaComponent(attributes.backdrop.center_color, 255), ColorUtils.setAlphaComponent(attributes.backdrop.pattern_color, 255), 0.5f), false);
            }

            public static UItem asAttribute(int i, Attributes attributes) {
                UItem spanCount = UItem.ofFactory(Factory.class).setSpanCount(1);
                spanCount.intValue = i;
                spanCount.object = attributes;
                return spanCount;
            }
        }
    }

    @Override
    protected RecyclerListView createRecyclerView(Context context) {
        return new RecyclerListView(context, this.resourcesProvider) {
            @Override
            public void onLayout(boolean z, int i, int i2, int i3, int i4) {
                StarGiftPreviewSheet.this.applyScrolledPosition();
                super.onLayout(z, i, i2, i3, i4);
                StarGiftPreviewSheet.this.invalidateMergedVisibleBlurredPositionsAndSourcesImpl(2);
            }

            @Override
            public boolean canHighlightChildAt(View view, float f, float f2) {
                return StarGiftPreviewSheet.this.canHighlightChildAt(view, f, f2);
            }
        };
    }

    @Override
    public void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        invalidateMergedVisibleBlurredPositionsAndSourcesImpl(2);
    }

    @Override
    public void mainContainerDispatchDraw(Canvas canvas) {
        BlurredBackgroundSourceRenderNode blurredBackgroundSourceRenderNode;
        super.mainContainerDispatchDraw(canvas);
        int width = this.container.getWidth();
        int height = this.container.getHeight();
        if (Build.VERSION.SDK_INT < 31 || !canvas.isHardwareAccelerated() || this.scrollableViewNoiseSuppressor == null || (blurredBackgroundSourceRenderNode = this.glassSourceRenderNode) == null || blurredBackgroundSourceRenderNode.inRecording() || !this.glassSourceRenderNode.needUpdateDisplayList(width, height)) {
            return;
        }
        RecordingCanvas beginRecording = this.glassSourceRenderNode.beginRecording(width, height);
        beginRecording.drawColor(getThemedColor(Theme.key_dialogBackgroundGray));
        this.scrollableViewNoiseSuppressor.draw(beginRecording, LiteMode.isEnabled(262144) ? -2 : -3);
        this.glassSourceRenderNode.endRecording();
    }

    private void drawList(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewPositionWatcher.computeCoordinatesInParent(this.recyclerListView, this.container, this.tmpViewPointF);
        canvas.save();
        canvas.clipRect(rectF);
        PointF pointF = this.tmpViewPointF;
        canvas.translate(pointF.x, pointF.y);
        for (int i = 0; i < this.recyclerListView.getChildCount(); i++) {
            View childAt = this.recyclerListView.getChildAt(i);
            ViewPositionWatcher.computeCoordinatesInParent(childAt, this.container, this.tmpViewPointF);
            RectF rectF2 = this.tmpViewRectF;
            PointF pointF2 = this.tmpViewPointF;
            float f = pointF2.x;
            rectF2.set(f, pointF2.y, childAt.getWidth() + f, this.tmpViewPointF.y + childAt.getHeight());
            if (this.tmpViewRectF.intersect(rectF)) {
                this.recyclerListView.drawChild(canvas, childAt, uptimeMillis);
            }
        }
        canvas.restore();
    }

    public void invalidateMergedVisibleBlurredPositionsAndSourcesPositions() {
        invalidateMergedVisibleBlurredPositionsAndSources(2);
    }

    public void invalidateMergedVisibleBlurredPositionsAndSources(int i) {
        if (Build.VERSION.SDK_INT < 31 || this.scrollableViewNoiseSuppressor == null) {
            return;
        }
        invalidateMergedVisibleBlurredPositionsAndSourcesImpl(i);
    }

    public void invalidateMergedVisibleBlurredPositionsAndSourcesImpl(int i) {
        if (Build.VERSION.SDK_INT < 31 || this.scrollableViewNoiseSuppressor == null) {
            return;
        }
        if (BitwiseUtils.hasFlag(i, 2)) {
            ViewPositionWatcher.computeCoordinatesInParent(this.tabsSelectorView, this.container, this.tabsPosP);
            RectF rectF = this.tabsRectF;
            PointF pointF = this.tabsPosP;
            float f = pointF.x;
            rectF.left = f;
            rectF.top = pointF.y;
            rectF.right = f + this.tabsSelectorView.getMeasuredWidth();
            RectF rectF2 = this.tabsRectF;
            rectF2.bottom = Math.min(rectF2.top + this.tabsSelectorView.getMeasuredHeight(), this.container.getMeasuredHeight());
            if (this.tabsRectF.isEmpty()) {
                return;
            }
            float f2 = -(LiteMode.isEnabled(262144) ? 0 : AndroidUtilities.dp(48.0f));
            this.tabsRectF.inset(f2, f2);
            this.scrollableViewNoiseSuppressor.setupRenderNodes(this.blurredPositions, 1);
        }
        if (this.scrollableViewNoiseSuppressor.getRenderNodesCount() == 0) {
            return;
        }
        RectF position = this.scrollableViewNoiseSuppressor.getPosition(0);
        RecordingCanvas beginRecordingRect = this.scrollableViewNoiseSuppressor.beginRecordingRect(0);
        beginRecordingRect.save();
        beginRecordingRect.translate(-position.left, -position.top);
        drawList(beginRecordingRect, position);
        beginRecordingRect.restore();
        this.scrollableViewNoiseSuppressor.endRecordingRect();
        this.scrollableViewNoiseSuppressor.invalidateResultRenderNodes(this.container.getWidth(), this.container.getHeight());
    }

    @Override
    public void onInsetsChanged() {
        super.onInsetsChanged();
        applyBottomInset();
    }

    private void applyBottomInset() {
        int systemBottomInset = getSystemBottomInset();
        if (this.lastBottomInset != systemBottomInset) {
            this.lastBottomInset = systemBottomInset;
            this.recyclerListView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), systemBottomInset + AndroidUtilities.dp(74.0f));
            ((ViewGroup.MarginLayoutParams) this.tabsSelectorView.getLayoutParams()).bottomMargin = this.lastBottomInset + AndroidUtilities.dp(5.0f);
            this.tabsSelectorView.requestLayout();
        }
    }

    private int getBackgroundColor() {
        return ColorUtils.blendARGB(getThemedColor(Theme.key_dialogBackgroundGray), getThemedColor(Theme.key_dialogBackground), 0.1f);
    }

    public static class Button extends FrameLayout {
        public AnimatedTextView percentView;
        public TextView textView;
        public AnimatedTextView titleView;

        public Button(Context context) {
            super(context);
            setClipChildren(false);
            AnimatedTextView animatedTextView = new AnimatedTextView(context, true, false, false);
            this.titleView = animatedTextView;
            animatedTextView.setTypeface(AndroidUtilities.bold());
            this.titleView.setTextSize(AndroidUtilities.dp(13.0f));
            this.titleView.setTextColor(-1);
            this.titleView.setGravity(17);
            addView(this.titleView, LayoutHelper.createFrame(-1, 16.0f, 49, 4.0f, 6.0f, 4.0f, 0.0f));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 12.0f);
            this.textView.setTextColor(-1879048193);
            this.textView.setGravity(17);
            addView(this.textView, LayoutHelper.createFrame(-1, -2.0f, 49, 4.0f, 20.0f, 4.0f, 0.0f));
            AnimatedTextView animatedTextView2 = new AnimatedTextView(context);
            this.percentView = animatedTextView2;
            animatedTextView2.setText("WTF");
            this.percentView.setTypeface(AndroidUtilities.bold());
            this.percentView.setTextColor(-1);
            this.percentView.setGravity(5);
            this.percentView.setTextSize(AndroidUtilities.dp(11.0f));
            this.percentView.setPadding(AndroidUtilities.dp(3.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(1.0f));
            this.percentView.setSizeableBackground(Theme.createRadSelectorDrawable(0, 285212671, 10, 10));
            addView(this.percentView, LayoutHelper.createFrame(-1, 16.0f, 53, 0.0f, -9.0f, -4.0f, 0.0f));
        }
    }

    public static class Tab extends FrameLayout implements FactorAnimator.Target {
        private int color;
        private final ImageView imageView;
        private final BoolAnimator isSelectedAnimator;
        private final TextView textView;

        @Override
        public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
            FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
        }

        public Tab(Context context) {
            super(context);
            this.isSelectedAnimator = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 300L);
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            addView(imageView, LayoutHelper.createFrame(24, 24.0f, 49, 0.0f, 6.0f, 0.0f, 0.0f));
            imageView.setColorFilter(new PorterDuffColorFilter(-16777216, PorterDuff.Mode.SRC_IN));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextSize(1, 11.0f);
            textView.setSingleLine();
            textView.setLines(1);
            textView.setEllipsize(TextUtils.TruncateAt.END);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            addView(textView, LayoutHelper.createFrame(-1, -2.0f, 49, 0.0f, 30.0f, 0.0f, 0.0f));
        }

        public static Tab create(Context context, Theme.ResourcesProvider resourcesProvider, int i, int i2, final Runnable runnable) {
            Tab tab = new Tab(context);
            tab.textView.setText(LocaleController.getString(i2));
            tab.imageView.setImageResource(i);
            tab.color = Theme.getColor(Theme.key_glass_defaultIcon, resourcesProvider);
            tab.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    runnable.run();
                }
            });
            tab.updateColors();
            return tab;
        }

        @Override
        public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
            updateColors();
        }

        private void updateColors() {
            int lerp = AndroidUtilities.lerp(153, 255, this.isSelectedAnimator.getFloatValue());
            this.imageView.setColorFilter(new PorterDuffColorFilter(ColorUtils.setAlphaComponent(this.color, lerp), PorterDuff.Mode.SRC_IN));
            this.textView.setTextColor(ColorUtils.setAlphaComponent(this.color, lerp));
        }
    }

    public static class TabsSelectorView extends LinearLayout implements FactorAnimator.Target {
        public final FactorAnimator animator;
        public final Utilities.Callback onTabSelectListener;
        private final Paint paint;
        private int selectedTab;
        private final Tab[] tabs;

        @Override
        public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
            FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
        }

        public TabsSelectorView(Context context, Theme.ResourcesProvider resourcesProvider, Utilities.Callback callback) {
            super(context);
            this.animator = new FactorAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 320L);
            Paint paint = new Paint(1);
            this.paint = paint;
            setOrientation(0);
            this.onTabSelectListener = callback;
            paint.setColor(Theme.getColor(Theme.key_glass_defaultIcon, resourcesProvider));
            paint.setAlpha(16);
            Tab[] tabArr = {Tab.create(context, resourcesProvider, R.drawable.filled_gift_models_24, R.string.GiftPreviewModels, new Runnable() {
                @Override
                public final void run() {
                    StarGiftPreviewSheet.TabsSelectorView.this.lambda$new$0();
                }
            }), Tab.create(context, resourcesProvider, R.drawable.filled_gift_palette_24, R.string.GiftPreviewBackdrops, new Runnable() {
                @Override
                public final void run() {
                    StarGiftPreviewSheet.TabsSelectorView.this.lambda$new$1();
                }
            }), Tab.create(context, resourcesProvider, R.drawable.filled_gift_symbols_24, R.string.GiftPreviewSymbols, new Runnable() {
                @Override
                public final void run() {
                    StarGiftPreviewSheet.TabsSelectorView.this.lambda$new$2();
                }
            })};
            this.tabs = tabArr;
            addView(tabArr[0], LayoutHelper.createLinear(0, -1, 1.0f));
            addView(tabArr[1], LayoutHelper.createLinear(0, -1, 1.0f));
            addView(tabArr[2], LayoutHelper.createLinear(0, -1, 1.0f));
            tabArr[0].isSelectedAnimator.setValue(true, false);
        }

        public void lambda$new$0() {
            selectTab(0);
        }

        public void lambda$new$1() {
            selectTab(1);
        }

        public void lambda$new$2() {
            selectTab(2);
        }

        private void selectTab(int i) {
            int i2 = this.selectedTab;
            if (i2 != i) {
                this.tabs[i2].isSelectedAnimator.setValue(false, true);
                this.tabs[i].isSelectedAnimator.setValue(true, true);
                this.selectedTab = i;
                this.animator.animateTo(i);
                this.onTabSelectListener.run(Integer.valueOf(i));
            }
        }

        public int getSelectedTab() {
            return this.selectedTab;
        }

        @Override
        protected void dispatchDraw(Canvas canvas) {
            float factor = this.animator.getFactor();
            canvas.drawRoundRect(AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), factor / 3.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.lerp(AndroidUtilities.dp(8.0f), getMeasuredWidth() - AndroidUtilities.dp(8.0f), (factor + 1.0f) / 3.0f), getMeasuredHeight() - AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f), this.paint);
            super.dispatchDraw(canvas);
        }

        @Override
        public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
            invalidate();
        }
    }
}
