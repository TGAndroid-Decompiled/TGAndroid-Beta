package org.telegram.ui.Gifts;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GenericProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.FireworksOverlay;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.ResaleGiftsFragment;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;

public class ResaleGiftsFragment extends BaseFragment implements FactorAnimator.Target {
    private BackDrawable backDrawable;
    private Filter backdropButton;
    private TextView clearFiltersButton;
    private FrameLayout clearFiltersContainer;
    private Runnable closeParentSheet;
    private final long dialogId;
    private LargeEmptyView emptyView;
    private boolean emptyViewVisible;
    private HorizontalScrollView filterScrollView;
    private LinearLayout filtersContainer;
    private View filtersDivider;
    private FireworksOverlay fireworksOverlay;
    private final long gift_id;
    private final String gift_name;
    private BlurredBackgroundDrawableViewFactory iBlur3Factory;
    private BlurredBackgroundSourceColor iBlur3SourceColor;
    private final ResaleGiftsList list;
    private UniversalRecyclerView listView;
    private Filter modelButton;
    private FrameLayout onlyStarsContainer;
    private Filter patternButton;
    private Filter sortButton;
    private final BoolAnimator animatorClearFiltersButtonVisible = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 380);
    private boolean filtersShown = true;

    public boolean onItemLongClick(UItem uItem, View view, int i, float f, float f2) {
        return false;
    }

    @Override
    public boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
    }

    public ResaleGiftsFragment(long j, String str, long j2, Theme.ResourcesProvider resourcesProvider) {
        this.dialogId = j;
        this.gift_name = str;
        this.gift_id = j2;
        this.resourceProvider = resourcesProvider;
        ResaleGiftsList resaleGiftsList = new ResaleGiftsList(this.currentAccount, j2, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.updateList(((Boolean) obj).booleanValue());
            }
        });
        this.list = resaleGiftsList;
        resaleGiftsList.load();
    }

    public ResaleGiftsFragment setCloseParentSheet(Runnable runnable) {
        this.closeParentSheet = runnable;
        return this;
    }

    @Override
    public View createView(final Context context) {
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        this.iBlur3SourceColor = blurredBackgroundSourceColor;
        int i = Theme.key_windowBackgroundWhite;
        blurredBackgroundSourceColor.setColor(getThemedColor(i));
        this.iBlur3Factory = new BlurredBackgroundDrawableViewFactory(this.iBlur3SourceColor);
        ActionBar actionBar = this.actionBar;
        BackDrawable backDrawable = new BackDrawable(false);
        this.backDrawable = backDrawable;
        actionBar.setBackButtonDrawable(backDrawable);
        this.backDrawable.setAnimationTime(240.0f);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    ResaleGiftsFragment.this.finishFragment();
                }
            }
        });
        this.actionBar.setTitle(this.gift_name);
        this.actionBar.setBackgroundColor(getThemedColor(i));
        ActionBar actionBar2 = this.actionBar;
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        actionBar2.setItemsColor(getThemedColor(i2), false);
        this.actionBar.setItemsColor(getThemedColor(i2), true);
        this.actionBar.setItemsBackgroundColor(getThemedColor(Theme.key_actionBarActionModeDefaultSelector), false);
        this.actionBar.setTitleColor(getThemedColor(i2));
        this.actionBar.setSubtitleColor(getThemedColor(Theme.key_windowBackgroundWhiteGrayText2));
        SizeNotifierFrameLayout sizeNotifierFrameLayout = new SizeNotifierFrameLayout(context) {
            @Override
            protected void onMeasure(int i3, int i4) {
                ((FrameLayout.LayoutParams) ResaleGiftsFragment.this.filterScrollView.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight() + (((BaseFragment) ResaleGiftsFragment.this).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                ((FrameLayout.LayoutParams) ResaleGiftsFragment.this.filtersDivider.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight() + (((BaseFragment) ResaleGiftsFragment.this).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0) + AndroidUtilities.dp(47.0f);
                ((FrameLayout.LayoutParams) ResaleGiftsFragment.this.listView.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight() + (((BaseFragment) ResaleGiftsFragment.this).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                ((FrameLayout.LayoutParams) ResaleGiftsFragment.this.emptyView.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight() + (((BaseFragment) ResaleGiftsFragment.this).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                super.onMeasure(i3, i4);
            }
        };
        int iBlendOver = Theme.blendOver(Theme.getColor(i, this.resourceProvider), Theme.multAlpha(Theme.getColor(i2, this.resourceProvider), 0.04f));
        sizeNotifierFrameLayout.setBackgroundColor(iBlendOver);
        this.fragmentView = sizeNotifierFrameLayout;
        final StarsIntroActivity.StarsBalanceView starsBalanceView = new StarsIntroActivity.StarsBalanceView(context, this.currentAccount, this.resourceProvider);
        starsBalanceView.withTon();
        ScaleStateListAnimator.apply(starsBalanceView);
        starsBalanceView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$createView$0(starsBalanceView, view);
            }
        });
        this.actionBar.addView(starsBalanceView, LayoutHelper.createFrame(-2, -2.0f, 85, 0.0f, 0.0f, 4.0f, 0.0f));
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                this.f$0.onItemClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        }, new Utilities.Callback5Return() {
            @Override
            public final Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return Boolean.valueOf(this.f$0.onItemLongClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue()));
            }
        }) {
            @Override
            public Integer getSelectorColor(int i3) {
                return 0;
            }
        };
        this.listView = universalRecyclerView;
        universalRecyclerView.adapter.setApplyBackground(false);
        this.listView.setSpanCount(3);
        this.listView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i3, int i4) {
                if (ResaleGiftsFragment.this.isLoadingVisible()) {
                    ResaleGiftsFragment.this.list.load();
                }
                ResaleGiftsFragment.this.filtersDivider.animate().alpha((ResaleGiftsFragment.this.filtersShown && ResaleGiftsFragment.this.listView.canScrollVertically(-1)) ? 1.0f : 0.0f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(320L).start();
            }
        });
        this.listView.setPadding(0, AndroidUtilities.dp(45.0f), 0, AndroidUtilities.dp(101.0f));
        this.listView.setClipToPadding(false);
        sizeNotifierFrameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f, 119, 7.33f, 0.0f, 7.33f, -45.0f));
        sizeNotifierFrameLayout.addView(this.actionBar);
        LargeEmptyView largeEmptyView = new LargeEmptyView(context, new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$createView$1(view);
            }
        }, this.resourceProvider);
        this.emptyView = largeEmptyView;
        this.emptyViewVisible = false;
        largeEmptyView.setAlpha(0.0f);
        this.emptyView.setScaleX(0.95f);
        this.emptyView.setScaleY(0.95f);
        this.emptyView.setVisibility(8);
        sizeNotifierFrameLayout.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f, 119, 0.0f, 0.0f, 0.0f, -45.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.filtersContainer = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
        this.filtersContainer.setOrientation(0);
        HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
        this.filterScrollView = horizontalScrollView;
        horizontalScrollView.setHorizontalScrollBarEnabled(false);
        this.filterScrollView.addView(this.filtersContainer);
        this.filterScrollView.setBackgroundColor(iBlendOver);
        this.filterScrollView.setClipChildren(false);
        sizeNotifierFrameLayout.addView(this.filterScrollView, LayoutHelper.createFrame(-1, 47, 55));
        View view = new View(context);
        this.filtersDivider = view;
        view.setBackgroundColor(getThemedColor(Theme.key_divider));
        this.filtersDivider.setAlpha(0.0f);
        sizeNotifierFrameLayout.addView(this.filtersDivider, LayoutHelper.createFrame(-1.0f, 2.0f / AndroidUtilities.density, 55));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(15.0f), 0);
        linearLayout2.setOrientation(0);
        final CheckBox2 checkBox2 = new CheckBox2(context, 24, this.resourceProvider);
        checkBox2.setColor(Theme.key_radioBackgroundChecked, Theme.key_checkboxDisabled, Theme.key_checkboxCheck);
        checkBox2.setDrawUnchecked(true);
        checkBox2.setChecked(false, false);
        checkBox2.setDrawBackgroundAsArc(10);
        checkBox2.setTranslationX(AndroidUtilities.dp(4.0f));
        checkBox2.setScaleX(0.8f);
        checkBox2.setScaleY(0.8f);
        linearLayout2.addView(checkBox2, LayoutHelper.createLinear(26, 26, 16));
        TextView textView = new TextView(context);
        textView.setTextColor(Theme.getColor(Theme.key_dialogTextBlack, this.resourceProvider));
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.GiftResaleStarsOnly));
        linearLayout2.addView(textView, LayoutHelper.createLinear(-2, -2, 16, 9, 0, 0, 0));
        int iDp = AndroidUtilities.dp(18.0f);
        int themedColor = getThemedColor(i);
        int i3 = Theme.key_featuredStickers_addButton;
        linearLayout2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, 0, Theme.blendOver(themedColor, Theme.multAlpha(getThemedColor(i3), 0.1f))));
        FrameLayout frameLayout = new FrameLayout(context);
        this.onlyStarsContainer = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout2 = this.onlyStarsContainer;
        frameLayout2.setBackground(this.iBlur3Factory.create(frameLayout2).setColorProvider(BlurredBackgroundProviderImpl.shadow(this.resourceProvider)).setPadding(AndroidUtilities.dp(8.0f)).setRadius(AndroidUtilities.dp(18.0f)));
        this.onlyStarsContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.lambda$createView$2(checkBox2, view2);
            }
        });
        this.onlyStarsContainer.addView(linearLayout2, LayoutHelper.createFrame(-2, -1.0f));
        ScaleStateListAnimator.apply(this.onlyStarsContainer, 0.04f, 1.5f);
        sizeNotifierFrameLayout.addView(this.onlyStarsContainer, LayoutHelper.createFrame(-2, 52.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        StarsController tonInstance = StarsController.getTonInstance(this.currentAccount);
        if (tonInstance.balanceAvailable() && !tonInstance.getBalanceAmount().isZero()) {
            this.onlyStarsContainer.setVisibility(8);
        }
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.clearFiltersContainer = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        FrameLayout frameLayout4 = this.clearFiltersContainer;
        frameLayout4.setBackground(this.iBlur3Factory.create(frameLayout4).setColorProvider(BlurredBackgroundProviderImpl.shadow(this.resourceProvider)).setPadding(AndroidUtilities.dp(8.0f)).setRadius(AndroidUtilities.dp(22.0f)));
        sizeNotifierFrameLayout.addView(this.clearFiltersContainer, LayoutHelper.createFrame(-2, 60.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        this.clearFiltersButton = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.msg_clearcache), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.Gift2ResaleFiltersClear));
        this.clearFiltersButton.setText(spannableStringBuilder);
        this.clearFiltersButton.setTextColor(getThemedColor(i3));
        this.clearFiltersButton.setTypeface(AndroidUtilities.bold());
        this.clearFiltersButton.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        this.clearFiltersButton.setBackground(Theme.createSimpleSelectorRoundRectDrawable(AndroidUtilities.dp(22.0f), 0, Theme.blendOver(getThemedColor(i), Theme.multAlpha(getThemedColor(i3), 0.1f))));
        this.clearFiltersButton.setGravity(17);
        this.clearFiltersContainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.lambda$createView$3(view2);
            }
        });
        this.clearFiltersContainer.addView(this.clearFiltersButton, LayoutHelper.createFrame(-2, -1.0f));
        this.clearFiltersContainer.setVisibility(8);
        ScaleStateListAnimator.apply(this.clearFiltersContainer, 0.05f, 1.5f);
        Filter filter = new Filter(context, this.resourceProvider);
        this.sortButton = filter;
        filter.setSorting(this.list.getSorting());
        this.filtersContainer.addView(this.sortButton, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 6, 0));
        this.sortButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.lambda$createView$9(checkBox2, view2);
            }
        });
        Filter filter2 = new Filter(context, this.resourceProvider);
        this.modelButton = filter2;
        filter2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        this.filtersContainer.addView(this.modelButton, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 6, 0));
        this.modelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.lambda$createView$15(context, view2);
            }
        });
        Filter filter3 = new Filter(context, this.resourceProvider);
        this.backdropButton = filter3;
        filter3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        this.filtersContainer.addView(this.backdropButton, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 6, 0));
        this.backdropButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.lambda$createView$21(context, view2);
            }
        });
        Filter filter4 = new Filter(context, this.resourceProvider);
        this.patternButton = filter4;
        filter4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        this.filtersContainer.addView(this.patternButton, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 0, 0));
        this.patternButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                this.f$0.lambda$createView$27(context, view2);
            }
        });
        FireworksOverlay fireworksOverlay = new FireworksOverlay(getContext());
        this.fireworksOverlay = fireworksOverlay;
        sizeNotifierFrameLayout.addView(fireworksOverlay, LayoutHelper.createFrame(-1, -1.0f));
        setFiltersShown(false, false);
        return sizeNotifierFrameLayout;
    }

    public void lambda$createView$0(StarsIntroActivity.StarsBalanceView starsBalanceView, View view) {
        if (starsBalanceView.lastBalance <= 0) {
            return;
        }
        presentFragment(new StarsIntroActivity());
    }

    public void lambda$createView$1(View view) {
        this.list.notSelectedBackdropAttributes.clear();
        this.list.notSelectedModelAttributes.clear();
        this.list.notSelectedPatternAttributes.clear();
        this.list.reload();
    }

    public void lambda$createView$2(CheckBox2 checkBox2, View view) {
        ResaleGiftsList resaleGiftsList = this.list;
        if (resaleGiftsList != null) {
            resaleGiftsList.starsOnly = !resaleGiftsList.starsOnly;
            checkBox2.setChecked(this.list.starsOnly, true);
            this.list.reload();
        }
    }

    public void lambda$createView$3(View view) {
        this.list.notSelectedBackdropAttributes.clear();
        this.list.notSelectedModelAttributes.clear();
        this.list.notSelectedPatternAttributes.clear();
        this.list.reload();
    }

    public void lambda$createView$9(final CheckBox2 checkBox2, View view) {
        if (this.filtersShown) {
            ItemOptions.makeOptions(this, this.sortButton).add(R.drawable.menu_sort_value, LocaleController.getString(ResaleGiftsList.Sorting.BY_PRICE.buttonStringResId), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$createView$4();
                }
            }).add(R.drawable.menu_sort_date, LocaleController.getString(ResaleGiftsList.Sorting.BY_DATE.buttonStringResId), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$createView$5();
                }
            }).add(R.drawable.menu_sort_number, LocaleController.getString(ResaleGiftsList.Sorting.BY_NUMBER.buttonStringResId), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$createView$6();
                }
            }).addGap().addChecked(!this.list.starsOnly, LocaleController.getString(R.string.GiftResaleFilterAllListings), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$createView$7(checkBox2);
                }
            }).addChecked(this.list.starsOnly, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$createView$8(checkBox2);
                }
            }).setDrawScrim(false).setOnTopOfScrim().translate(0.0f, AndroidUtilities.dp(-8.0f)).show();
        }
    }

    public void lambda$createView$4() {
        this.list.setSorting(ResaleGiftsList.Sorting.BY_PRICE);
    }

    public void lambda$createView$5() {
        this.list.setSorting(ResaleGiftsList.Sorting.BY_DATE);
    }

    public void lambda$createView$6() {
        this.list.setSorting(ResaleGiftsList.Sorting.BY_NUMBER);
    }

    public void lambda$createView$7(CheckBox2 checkBox2) {
        if (this.list.starsOnly) {
            this.list.starsOnly = false;
            checkBox2.setChecked(false, true);
            this.list.reload();
        }
    }

    public void lambda$createView$8(CheckBox2 checkBox2) {
        if (this.list.starsOnly) {
            return;
        }
        this.list.starsOnly = true;
        checkBox2.setChecked(true, true);
        this.list.reload();
    }

    public void lambda$createView$15(Context context, View view) {
        if (this.filtersShown && !this.list.modelAttributes.isEmpty()) {
            final ItemOptions itemOptionsNeedsFocus = ItemOptions.makeOptions((BaseFragment) this, (View) this.modelButton, false, true).setDrawScrim(false).setOnTopOfScrim().translate(0.0f, AndroidUtilities.dp(-8.0f)).needsFocus();
            itemOptionsNeedsFocus.setOnDismiss(new Runnable() {
                @Override
                public final void run() {
                    ResaleGiftsFragment.lambda$createView$10(itemOptionsNeedsFocus);
                }
            });
            final String[] strArr = {""};
            final ArrayList arrayList = new ArrayList(this.list.modelAttributes);
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return this.f$0.lambda$createView$11((TL_stars.starGiftAttributeModel) obj, (TL_stars.starGiftAttributeModel) obj2);
                }
            });
            final UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    this.f$0.lambda$createView$12(strArr, arrayList, (ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    this.f$0.lambda$createView$13(itemOptionsNeedsFocus, (UItem) obj, (View) obj2, (Integer) obj3, (Float) obj4, (Float) obj5);
                }
            }, null) {
                @Override
                protected void onMeasure(int i, int i2) {
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (AndroidUtilities.displaySize.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                }
            };
            universalRecyclerView.adapter.setApplyBackground(false);
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_actionBarDefaultSubmenuItemIcon), PorterDuff.Mode.SRC_IN));
            frameLayout.addView(imageView, LayoutHelper.createFrame(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            EditTextCaption editTextCaption = new EditTextCaption(context, this.resourceProvider);
            editTextCaption.setTextSize(1, 16.0f);
            editTextCaption.setInputType(573441);
            editTextCaption.setRawInputType(573441);
            editTextCaption.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3, this.resourceProvider));
            editTextCaption.setCursorColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourceProvider));
            editTextCaption.setCursorSize(AndroidUtilities.dp(19.0f));
            editTextCaption.setCursorWidth(1.5f);
            editTextCaption.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
            editTextCaption.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourceProvider));
            editTextCaption.setBackground(null);
            frameLayout.addView(editTextCaption, LayoutHelper.createFrame(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            editTextCaption.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    strArr[0] = editable.toString();
                    universalRecyclerView.adapter.update(true);
                }
            });
            if (arrayList.size() > 8) {
                itemOptionsNeedsFocus.addView(frameLayout, LayoutHelper.createLinear(-1, 44));
                itemOptionsNeedsFocus.addGap();
            }
            if (!this.list.notSelectedModelAttributes.isEmpty()) {
                itemOptionsNeedsFocus.add(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$createView$14();
                    }
                });
            }
            itemOptionsNeedsFocus.addView(universalRecyclerView);
            itemOptionsNeedsFocus.show();
        }
    }

    public static void lambda$createView$10(ItemOptions itemOptions) {
        ActionBarPopupWindow actionBarPopupWindow = itemOptions.actionBarPopupWindow;
        if (actionBarPopupWindow != null) {
            AndroidUtilities.hideKeyboard(actionBarPopupWindow.getContentView());
        }
    }

    public int lambda$createView$11(TL_stars.starGiftAttributeModel stargiftattributemodel, TL_stars.starGiftAttributeModel stargiftattributemodel2) {
        Integer num = (Integer) this.list.modelAttributesCounter.get(Long.valueOf(stargiftattributemodel.document.id));
        Integer num2 = (Integer) this.list.modelAttributesCounter.get(Long.valueOf(stargiftattributemodel2.document.id));
        if (num == null) {
            return 1;
        }
        if (num2 == null) {
            return -1;
        }
        return num2.intValue() - num.intValue();
    }

    public void lambda$createView$12(String[] strArr, ArrayList arrayList, ArrayList arrayList2, UniversalAdapter universalAdapter) {
        String lowerCase = strArr[0].toLowerCase();
        String strTranslitSafe = AndroidUtilities.translitSafe(lowerCase);
        boolean zIsEmpty = this.list.notSelectedModelAttributes.isEmpty();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) it.next();
            boolean zContains = this.list.notSelectedModelAttributes.contains(Long.valueOf(stargiftattributemodel.document.id));
            boolean z = !zContains;
            if (!TextUtils.isEmpty(lowerCase) && !stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) && !stargiftattributemodel.name.toLowerCase().startsWith(strTranslitSafe)) {
                if (!stargiftattributemodel.name.toLowerCase().contains(" " + lowerCase)) {
                    if (stargiftattributemodel.name.toLowerCase().contains(" " + strTranslitSafe)) {
                    }
                }
            }
            Integer num = (Integer) this.list.modelAttributesCounter.get(Long.valueOf(stargiftattributemodel.document.id));
            UItem uItemAsModel = ModelItem.Factory.asModel(stargiftattributemodel, num == null ? 0 : num.intValue(), lowerCase);
            if (!TextUtils.isEmpty(lowerCase)) {
                z = (zIsEmpty || zContains) ? false : true;
            }
            arrayList2.add(uItemAsModel.setChecked(z));
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(EmptyView.Factory.asEmptyView(LocaleController.getString(R.string.Gift2ResaleFiltersModelEmpty)));
        }
    }

    public void lambda$createView$13(ItemOptions itemOptions, UItem uItem, View view, Integer num, Float f, Float f2) {
        long j = ((TL_stars.starGiftAttributeModel) uItem.object).document.id;
        if (!this.list.notSelectedModelAttributes.contains(Long.valueOf(j))) {
            if (this.list.notSelectedModelAttributes.isEmpty()) {
                Iterator it = this.list.modelAttributes.iterator();
                while (it.hasNext()) {
                    long j2 = ((TL_stars.starGiftAttributeModel) it.next()).document.id;
                    if (j2 != j) {
                        this.list.notSelectedModelAttributes.add(Long.valueOf(j2));
                    }
                }
            } else {
                this.list.notSelectedModelAttributes.add(Long.valueOf(j));
            }
        } else {
            this.list.notSelectedModelAttributes.remove(Long.valueOf(j));
        }
        this.list.reload();
        itemOptions.dismiss();
    }

    public void lambda$createView$14() {
        if (this.list.notSelectedModelAttributes.isEmpty()) {
            return;
        }
        this.list.notSelectedModelAttributes.clear();
        this.list.reload();
    }

    public void lambda$createView$21(Context context, View view) {
        if (this.filtersShown && !this.list.backdropAttributes.isEmpty()) {
            final ItemOptions itemOptionsNeedsFocus = ItemOptions.makeOptions((BaseFragment) this, (View) this.backdropButton, false, true).setDrawScrim(false).setOnTopOfScrim().translate(0.0f, AndroidUtilities.dp(-8.0f)).needsFocus();
            itemOptionsNeedsFocus.setOnDismiss(new Runnable() {
                @Override
                public final void run() {
                    ResaleGiftsFragment.lambda$createView$16(itemOptionsNeedsFocus);
                }
            });
            final String[] strArr = {""};
            final ArrayList arrayList = new ArrayList(this.list.backdropAttributes);
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return this.f$0.lambda$createView$17((TL_stars.starGiftAttributeBackdrop) obj, (TL_stars.starGiftAttributeBackdrop) obj2);
                }
            });
            final UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    this.f$0.lambda$createView$18(strArr, arrayList, (ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    this.f$0.lambda$createView$19(itemOptionsNeedsFocus, (UItem) obj, (View) obj2, (Integer) obj3, (Float) obj4, (Float) obj5);
                }
            }, null) {
                @Override
                protected void onMeasure(int i, int i2) {
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (AndroidUtilities.displaySize.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                }
            };
            universalRecyclerView.adapter.setApplyBackground(false);
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_actionBarDefaultSubmenuItemIcon), PorterDuff.Mode.SRC_IN));
            frameLayout.addView(imageView, LayoutHelper.createFrame(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            EditTextCaption editTextCaption = new EditTextCaption(context, this.resourceProvider);
            editTextCaption.setTextSize(1, 16.0f);
            editTextCaption.setInputType(573441);
            editTextCaption.setRawInputType(573441);
            editTextCaption.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3, this.resourceProvider));
            editTextCaption.setCursorColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourceProvider));
            editTextCaption.setCursorSize(AndroidUtilities.dp(19.0f));
            editTextCaption.setCursorWidth(1.5f);
            editTextCaption.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
            editTextCaption.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourceProvider));
            editTextCaption.setBackground(null);
            frameLayout.addView(editTextCaption, LayoutHelper.createFrame(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            editTextCaption.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    strArr[0] = editable.toString();
                    universalRecyclerView.adapter.update(true);
                }
            });
            if (arrayList.size() > 8) {
                itemOptionsNeedsFocus.addView(frameLayout, LayoutHelper.createLinear(-1, 44));
                itemOptionsNeedsFocus.addGap();
            }
            if (!this.list.notSelectedBackdropAttributes.isEmpty()) {
                itemOptionsNeedsFocus.add(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$createView$20();
                    }
                });
            }
            itemOptionsNeedsFocus.addView(universalRecyclerView);
            itemOptionsNeedsFocus.show();
        }
    }

    public static void lambda$createView$16(ItemOptions itemOptions) {
        ActionBarPopupWindow actionBarPopupWindow = itemOptions.actionBarPopupWindow;
        if (actionBarPopupWindow != null) {
            AndroidUtilities.hideKeyboard(actionBarPopupWindow.getContentView());
        }
    }

    public int lambda$createView$17(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop, TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2) {
        Integer num = (Integer) this.list.backdropAttributesCounter.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
        Integer num2 = (Integer) this.list.backdropAttributesCounter.get(Integer.valueOf(stargiftattributebackdrop2.backdrop_id));
        if (num == null) {
            return 1;
        }
        if (num2 == null) {
            return -1;
        }
        return num2.intValue() - num.intValue();
    }

    public void lambda$createView$18(String[] strArr, ArrayList arrayList, ArrayList arrayList2, UniversalAdapter universalAdapter) {
        String lowerCase = strArr[0].toLowerCase();
        String strTranslitSafe = AndroidUtilities.translitSafe(lowerCase);
        boolean zIsEmpty = this.list.notSelectedBackdropAttributes.isEmpty();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) it.next();
            boolean zContains = this.list.notSelectedBackdropAttributes.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
            boolean z = !zContains;
            if (!TextUtils.isEmpty(lowerCase) && !stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase) && !stargiftattributebackdrop.name.toLowerCase().startsWith(strTranslitSafe)) {
                if (!stargiftattributebackdrop.name.toLowerCase().contains(" " + lowerCase)) {
                    if (stargiftattributebackdrop.name.toLowerCase().contains(" " + strTranslitSafe)) {
                    }
                }
            }
            Integer num = (Integer) this.list.backdropAttributesCounter.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
            UItem uItemAsBackdrop = BackdropItem.Factory.asBackdrop(stargiftattributebackdrop, num == null ? 0 : num.intValue(), lowerCase);
            if (!TextUtils.isEmpty(lowerCase)) {
                z = (zIsEmpty || zContains) ? false : true;
            }
            arrayList2.add(uItemAsBackdrop.setChecked(z));
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(EmptyView.Factory.asEmptyView(LocaleController.getString(R.string.Gift2ResaleFiltersBackdropEmpty)));
        }
    }

    public void lambda$createView$19(ItemOptions itemOptions, UItem uItem, View view, Integer num, Float f, Float f2) {
        int i = ((TL_stars.starGiftAttributeBackdrop) uItem.object).backdrop_id;
        if (!this.list.notSelectedBackdropAttributes.contains(Integer.valueOf(i))) {
            if (this.list.notSelectedBackdropAttributes.isEmpty()) {
                Iterator it = this.list.backdropAttributes.iterator();
                while (it.hasNext()) {
                    int i2 = ((TL_stars.starGiftAttributeBackdrop) it.next()).backdrop_id;
                    if (i2 != i) {
                        this.list.notSelectedBackdropAttributes.add(Integer.valueOf(i2));
                    }
                }
            } else {
                this.list.notSelectedBackdropAttributes.add(Integer.valueOf(i));
            }
        } else {
            this.list.notSelectedBackdropAttributes.remove(Integer.valueOf(i));
        }
        this.list.reload();
        itemOptions.dismiss();
    }

    public void lambda$createView$20() {
        if (this.list.notSelectedBackdropAttributes.isEmpty()) {
            return;
        }
        this.list.notSelectedBackdropAttributes.clear();
        this.list.reload();
    }

    public void lambda$createView$27(Context context, View view) {
        if (this.filtersShown && !this.list.patternAttributes.isEmpty()) {
            final ItemOptions itemOptionsNeedsFocus = ItemOptions.makeOptions((BaseFragment) this, (View) this.patternButton, false, true).setDrawScrim(false).setOnTopOfScrim().translate(0.0f, AndroidUtilities.dp(-8.0f)).needsFocus();
            itemOptionsNeedsFocus.setOnDismiss(new Runnable() {
                @Override
                public final void run() {
                    ResaleGiftsFragment.lambda$createView$22(itemOptionsNeedsFocus);
                }
            });
            final String[] strArr = {""};
            final ArrayList arrayList = new ArrayList(this.list.patternAttributes);
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return this.f$0.lambda$createView$23((TL_stars.starGiftAttributePattern) obj, (TL_stars.starGiftAttributePattern) obj2);
                }
            });
            final UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    this.f$0.lambda$createView$24(strArr, arrayList, (ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    this.f$0.lambda$createView$25(itemOptionsNeedsFocus, (UItem) obj, (View) obj2, (Integer) obj3, (Float) obj4, (Float) obj5);
                }
            }, null) {
                @Override
                protected void onMeasure(int i, int i2) {
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (AndroidUtilities.displaySize.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                }
            };
            universalRecyclerView.adapter.setApplyBackground(false);
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_actionBarDefaultSubmenuItemIcon), PorterDuff.Mode.SRC_IN));
            frameLayout.addView(imageView, LayoutHelper.createFrame(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            EditTextCaption editTextCaption = new EditTextCaption(context, this.resourceProvider);
            editTextCaption.setTextSize(1, 16.0f);
            editTextCaption.setInputType(573441);
            editTextCaption.setRawInputType(573441);
            editTextCaption.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3, this.resourceProvider));
            editTextCaption.setCursorColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourceProvider));
            editTextCaption.setCursorSize(AndroidUtilities.dp(19.0f));
            editTextCaption.setCursorWidth(1.5f);
            editTextCaption.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
            editTextCaption.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourceProvider));
            editTextCaption.setBackground(null);
            frameLayout.addView(editTextCaption, LayoutHelper.createFrame(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            editTextCaption.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    strArr[0] = editable.toString();
                    universalRecyclerView.adapter.update(true);
                }
            });
            if (arrayList.size() > 8) {
                itemOptionsNeedsFocus.addView(frameLayout, LayoutHelper.createLinear(-1, 44));
                itemOptionsNeedsFocus.addGap();
            }
            if (!this.list.notSelectedPatternAttributes.isEmpty()) {
                itemOptionsNeedsFocus.add(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$createView$26();
                    }
                });
            }
            itemOptionsNeedsFocus.addView(universalRecyclerView);
            itemOptionsNeedsFocus.show();
        }
    }

    public static void lambda$createView$22(ItemOptions itemOptions) {
        ActionBarPopupWindow actionBarPopupWindow = itemOptions.actionBarPopupWindow;
        if (actionBarPopupWindow != null) {
            AndroidUtilities.hideKeyboard(actionBarPopupWindow.getContentView());
        }
    }

    public int lambda$createView$23(TL_stars.starGiftAttributePattern stargiftattributepattern, TL_stars.starGiftAttributePattern stargiftattributepattern2) {
        Integer num = (Integer) this.list.patternAttributesCounter.get(Long.valueOf(stargiftattributepattern.document.id));
        Integer num2 = (Integer) this.list.patternAttributesCounter.get(Long.valueOf(stargiftattributepattern2.document.id));
        if (num == null) {
            return 1;
        }
        if (num2 == null) {
            return -1;
        }
        return num2.intValue() - num.intValue();
    }

    public void lambda$createView$24(String[] strArr, ArrayList arrayList, ArrayList arrayList2, UniversalAdapter universalAdapter) {
        String lowerCase = strArr[0].toLowerCase();
        String strTranslitSafe = AndroidUtilities.translitSafe(lowerCase);
        boolean zIsEmpty = this.list.notSelectedPatternAttributes.isEmpty();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) it.next();
            boolean zContains = this.list.notSelectedPatternAttributes.contains(Long.valueOf(stargiftattributepattern.document.id));
            boolean z = !zContains;
            if (!TextUtils.isEmpty(lowerCase) && !stargiftattributepattern.name.toLowerCase().startsWith(lowerCase) && !stargiftattributepattern.name.toLowerCase().startsWith(strTranslitSafe)) {
                if (!stargiftattributepattern.name.toLowerCase().contains(" " + lowerCase)) {
                    if (stargiftattributepattern.name.toLowerCase().contains(" " + strTranslitSafe)) {
                    }
                }
            }
            Integer num = (Integer) this.list.patternAttributesCounter.get(Long.valueOf(stargiftattributepattern.document.id));
            UItem uItemAsPattern = PatternItem.Factory.asPattern(stargiftattributepattern, num == null ? 0 : num.intValue(), lowerCase);
            if (!TextUtils.isEmpty(lowerCase)) {
                z = (zIsEmpty || zContains) ? false : true;
            }
            arrayList2.add(uItemAsPattern.setChecked(z));
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(EmptyView.Factory.asEmptyView(LocaleController.getString(R.string.Gift2ResaleFiltersSymbolEmpty)));
        }
    }

    public void lambda$createView$25(ItemOptions itemOptions, UItem uItem, View view, Integer num, Float f, Float f2) {
        long j = ((TL_stars.starGiftAttributePattern) uItem.object).document.id;
        if (!this.list.notSelectedPatternAttributes.contains(Long.valueOf(j))) {
            if (this.list.notSelectedPatternAttributes.isEmpty()) {
                Iterator it = this.list.patternAttributes.iterator();
                while (it.hasNext()) {
                    long j2 = ((TL_stars.starGiftAttributePattern) it.next()).document.id;
                    if (j2 != j) {
                        this.list.notSelectedPatternAttributes.add(Long.valueOf(j2));
                    }
                }
            } else {
                this.list.notSelectedPatternAttributes.add(Long.valueOf(j));
            }
        } else {
            this.list.notSelectedPatternAttributes.remove(Long.valueOf(j));
        }
        this.list.reload();
        itemOptions.dismiss();
    }

    public void lambda$createView$26() {
        if (this.list.notSelectedPatternAttributes.isEmpty()) {
            return;
        }
        this.list.notSelectedPatternAttributes.clear();
        this.list.reload();
    }

    private void setFiltersShown(final boolean z, boolean z2) {
        if (this.filtersShown == z) {
            return;
        }
        this.filtersShown = z;
        if (z2) {
            this.filterScrollView.setVisibility(0);
            ViewPropertyAnimator viewPropertyAnimatorAlpha = this.filterScrollView.animate().translationY(z ? 0.0f : -AndroidUtilities.dp(45.0f)).alpha(z ? 1.0f : 0.0f);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            viewPropertyAnimatorAlpha.setInterpolator(cubicBezierInterpolator).setDuration(420L).setListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    if (z) {
                        return;
                    }
                    ResaleGiftsFragment.this.filterScrollView.setVisibility(8);
                }
            }).start();
            this.filtersDivider.animate().translationY(z ? 0.0f : -AndroidUtilities.dp(45.0f)).setInterpolator(cubicBezierInterpolator).setDuration(420L).start();
            this.listView.animate().translationY(z ? 0.0f : -AndroidUtilities.dp(39.0f)).setInterpolator(cubicBezierInterpolator).setDuration(420L).start();
            return;
        }
        this.filterScrollView.setVisibility(z ? 0 : 8);
        this.filterScrollView.setTranslationY(z ? 0.0f : -AndroidUtilities.dp(45.0f));
        this.filterScrollView.setAlpha(z ? 1.0f : 0.0f);
        this.filtersDivider.setTranslationY(z ? 0.0f : -AndroidUtilities.dp(45.0f));
        this.listView.setTranslationY(z ? 0.0f : -AndroidUtilities.dp(39.0f));
    }

    public void updateList(boolean z) {
        UniversalAdapter universalAdapter;
        if (this.list.getTotalCount() > 12) {
            setFiltersShown(true, true);
        }
        UniversalRecyclerView universalRecyclerView = this.listView;
        boolean z2 = false;
        if (universalRecyclerView != null && (universalAdapter = universalRecyclerView.adapter) != null) {
            universalAdapter.update(true);
            if (z) {
                this.listView.scrollToPosition(0);
            }
        }
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.setTitle(this.gift_name);
            this.actionBar.setSubtitle(this.list.getTotalCount() <= 0 ? LocaleController.getString(R.string.Gift2ResaleNoCount) : LocaleController.formatPluralStringComma("Gift2ListingsCount", this.list.getTotalCount()));
        }
        Filter filter = this.sortButton;
        if (filter != null) {
            filter.setSorting(this.list.getSorting());
        }
        if (this.modelButton != null) {
            int size = this.list.modelAttributes.size() - this.list.notSelectedModelAttributes.size();
            this.modelButton.setValue((size <= 0 || size == this.list.modelAttributes.size()) ? LocaleController.getString(R.string.Gift2ResaleFilterModel) : LocaleController.formatPluralStringComma("Gift2ResaleFilterModels", size));
        }
        if (this.backdropButton != null) {
            int size2 = this.list.backdropAttributes.size() - this.list.notSelectedBackdropAttributes.size();
            this.backdropButton.setValue((size2 <= 0 || size2 == this.list.backdropAttributes.size()) ? LocaleController.getString(R.string.Gift2ResaleFilterBackdrop) : LocaleController.formatPluralStringComma("Gift2ResaleFilterBackdrops", size2));
        }
        if (this.patternButton != null) {
            int size3 = this.list.patternAttributes.size() - this.list.notSelectedPatternAttributes.size();
            this.patternButton.setValue((size3 <= 0 || size3 == this.list.patternAttributes.size()) ? LocaleController.getString(R.string.Gift2ResaleFilterSymbol) : LocaleController.formatPluralStringComma("Gift2ResaleFilterSymbols", size3));
        }
        if (isLoadingVisible()) {
            this.list.load();
        }
        ResaleGiftsList resaleGiftsList = this.list;
        if ((resaleGiftsList.loading || resaleGiftsList.getTotalCount() > 0) && (!this.list.notSelectedModelAttributes.isEmpty() || !this.list.notSelectedBackdropAttributes.isEmpty() || !this.list.notSelectedPatternAttributes.isEmpty())) {
            z2 = true;
        }
        this.animatorClearFiltersButtonVisible.setValue(z2, true);
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        Iterator it = this.list.gifts.iterator();
        while (it.hasNext()) {
            arrayList.add(GiftSheet.GiftCell.Factory.asStarGift(0, (TL_stars.TL_starGiftUnique) it.next(), false, false, false, true, false));
        }
        ResaleGiftsList resaleGiftsList = this.list;
        if (resaleGiftsList.loading || !resaleGiftsList.endReached) {
            arrayList.add(UItem.asFlicker(-1, 34).setSpanCount(1));
            arrayList.add(UItem.asFlicker(-2, 34).setSpanCount(1));
            arrayList.add(UItem.asFlicker(-3, 34).setSpanCount(1));
            if (this.list.gifts.isEmpty()) {
                arrayList.add(UItem.asFlicker(-4, 34).setSpanCount(1));
                arrayList.add(UItem.asFlicker(-5, 34).setSpanCount(1));
                arrayList.add(UItem.asFlicker(-6, 34).setSpanCount(1));
                arrayList.add(UItem.asFlicker(-7, 34).setSpanCount(1));
                arrayList.add(UItem.asFlicker(-8, 34).setSpanCount(1));
                arrayList.add(UItem.asFlicker(-9, 34).setSpanCount(1));
                arrayList.add(UItem.asFlicker(-10, 34).setSpanCount(1));
                arrayList.add(UItem.asFlicker(-11, 34).setSpanCount(1));
                arrayList.add(UItem.asFlicker(-12, 34).setSpanCount(1));
                arrayList.add(UItem.asFlicker(-13, 34).setSpanCount(1));
                arrayList.add(UItem.asFlicker(-14, 34).setSpanCount(1));
                arrayList.add(UItem.asFlicker(-15, 34).setSpanCount(1));
            }
        }
        updateEmptyView(arrayList.isEmpty() && !this.list.loading);
    }

    private void updateEmptyView(final boolean z) {
        if (this.emptyViewVisible == z) {
            return;
        }
        this.emptyViewVisible = z;
        this.emptyView.setVisibility(0);
        this.emptyView.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.95f).scaleY(z ? 1.0f : 0.95f).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(320L).setListener(new AnimatorListenerAdapter() {
            @Override
            public void onAnimationEnd(Animator animator) {
                if (z) {
                    return;
                }
                ResaleGiftsFragment.this.emptyView.setVisibility(8);
            }
        }).start();
    }

    public boolean isLoadingVisible() {
        for (int i = 0; i < this.listView.getChildCount(); i++) {
            if (this.listView.getChildAt(i) instanceof FlickerLoadingView) {
                return true;
            }
        }
        return false;
    }

    public void onItemClick(UItem uItem, View view, int i, float f, float f2) {
        Object obj = uItem.object;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            StarGiftSheet starGiftSheet = new StarGiftSheet(getContext(), this.currentAccount, this.dialogId, this.resourceProvider);
            starGiftSheet.set(tL_starGiftUnique.slug, tL_starGiftUnique, this.list);
            starGiftSheet.setOnBoughtGift(new Utilities.Callback2() {
                @Override
                public final void run(Object obj2, Object obj3) {
                    this.f$0.lambda$onItemClick$28((TL_stars.TL_starGiftUnique) obj2, (Long) obj3);
                }
            });
            showDialog(starGiftSheet);
        }
    }

    public void lambda$onItemClick$28(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final Long l) {
        if (l.longValue() == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
            this.list.gifts.remove(tL_starGiftUnique);
            updateList(false);
            if (l.longValue() == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                BulletinFactory.of(this).createSimpleBulletin(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftTitle), LocaleController.formatString(R.string.BoughtResoldGiftText, tL_starGiftUnique.title + " #" + LocaleController.formatNumber(tL_starGiftUnique.num, ','))).hideAfterBottomSheet(false).show();
            } else {
                BulletinFactory.of(this).createSimpleBulletin(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, l.longValue()))).hideAfterBottomSheet(false).show();
            }
            this.fireworksOverlay.start(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (l.longValue() >= 0) {
            bundle.putLong("user_id", l.longValue());
        } else {
            bundle.putLong("chat_id", -l.longValue());
        }
        ChatActivity chatActivity = new ChatActivity(bundle) {
            private boolean shownToast = false;

            @Override
            public void onBecomeFullyVisible() throws Resources.NotFoundException {
                super.onBecomeFullyVisible();
                if (this.shownToast) {
                    return;
                }
                this.shownToast = true;
                BulletinFactory.of(this).createSimpleBulletin(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, l.longValue()))).hideAfterBottomSheet(false).show();
                FireworksOverlay fireworksOverlay = this.fireworksOverlay;
                if (fireworksOverlay != null) {
                    fireworksOverlay.start(true);
                }
            }
        };
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout != null && iNavigationLayout.isSheet()) {
            finishFragment();
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment != null) {
                safeLastFragment.presentFragment(chatActivity);
            }
        } else {
            presentFragment(chatActivity, true);
        }
        Runnable runnable = this.closeParentSheet;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 0) {
            this.onlyStarsContainer.setTranslationY((-AndroidUtilities.dp(52.0f)) * f);
            FragmentFloatingButton.setAnimatedVisibility(this.clearFiltersContainer, f);
        }
    }

    public static class ResaleGiftsList implements StarsController.IGiftsList {
        private final int account;
        private long attributes_hash;
        private boolean for_craft;
        public final long gift_id;
        private String last_offset;
        public boolean loading;
        private final Utilities.Callback onUpdate;
        private boolean starsOnly;
        private int totalCount;
        public final ArrayList gifts = new ArrayList();
        public final ArrayList modelAttributes = new ArrayList();
        public final ArrayList backdropAttributes = new ArrayList();
        public final ArrayList patternAttributes = new ArrayList();
        public final HashSet notSelectedModelAttributes = new HashSet();
        public final HashSet notSelectedBackdropAttributes = new HashSet();
        public final HashSet notSelectedPatternAttributes = new HashSet();
        public final HashMap modelAttributesCounter = new HashMap();
        public final HashMap backdropAttributesCounter = new HashMap();
        public final HashMap patternAttributesCounter = new HashMap();
        private Sorting sorting = Sorting.BY_PRICE;
        public boolean endReached = false;
        private int reqId = -1;

        @Override
        public int findGiftToUpgrade(int i) {
            return -1;
        }

        @Override
        public void notifyUpdate() {
        }

        public enum Sorting {
            BY_PRICE(R.string.ResellGiftFilterSortPriceShort, R.string.ResellGiftFilterSortPrice),
            BY_DATE(R.string.ResellGiftFilterSortDateShort, R.string.ResellGiftFilterSortDate),
            BY_NUMBER(R.string.ResellGiftFilterSortNumberShort, R.string.ResellGiftFilterSortNumber);

            public int buttonStringResId;
            public int shortResId;

            Sorting(int i, int i2) {
                this.shortResId = i;
                this.buttonStringResId = i2;
            }
        }

        public Sorting getSorting() {
            return this.sorting;
        }

        public void setSorting(Sorting sorting) {
            if (this.sorting != sorting) {
                this.sorting = sorting;
                reload();
            }
        }

        public ResaleGiftsList(int i, long j, Utilities.Callback callback) {
            this.account = i;
            this.gift_id = j;
            this.onUpdate = callback;
        }

        public ResaleGiftsList forCraft() {
            this.for_craft = true;
            return this;
        }

        @Override
        public void load() {
            load(false);
        }

        public void load(boolean z) {
            if (this.loading) {
                return;
            }
            if (z || !this.endReached) {
                this.loading = true;
                final TL_stars.getResaleStarGifts getresalestargifts = new TL_stars.getResaleStarGifts();
                getresalestargifts.gift_id = this.gift_id;
                String str = this.last_offset;
                if (str == null) {
                    str = "";
                }
                getresalestargifts.offset = str;
                getresalestargifts.limit = 15;
                getresalestargifts.for_craft = this.for_craft;
                getresalestargifts.stars_only = this.starsOnly;
                Sorting sorting = this.sorting;
                if (sorting == Sorting.BY_NUMBER) {
                    getresalestargifts.sort_by_num = true;
                    getresalestargifts.sort_by_price = false;
                } else if (sorting == Sorting.BY_DATE) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = false;
                } else if (sorting == Sorting.BY_PRICE) {
                    getresalestargifts.sort_by_num = false;
                    getresalestargifts.sort_by_price = true;
                }
                long j = this.attributes_hash;
                if (j != 0) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = j;
                } else if (this.modelAttributes.isEmpty() && this.backdropAttributes.isEmpty() && this.patternAttributes.isEmpty()) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = 0L;
                }
                if (!this.notSelectedModelAttributes.isEmpty() || !this.notSelectedBackdropAttributes.isEmpty() || !this.notSelectedPatternAttributes.isEmpty()) {
                    getresalestargifts.flags |= 8;
                    if (!this.notSelectedModelAttributes.isEmpty()) {
                        Iterator it = this.modelAttributes.iterator();
                        while (it.hasNext()) {
                            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) it.next();
                            if (!this.notSelectedModelAttributes.contains(Long.valueOf(stargiftattributemodel.document.id))) {
                                TL_stars.starGiftAttributeIdModel stargiftattributeidmodel = new TL_stars.starGiftAttributeIdModel();
                                stargiftattributeidmodel.document_id = stargiftattributemodel.document.id;
                                getresalestargifts.attributes.add(stargiftattributeidmodel);
                            }
                        }
                    }
                    if (!this.notSelectedBackdropAttributes.isEmpty()) {
                        Iterator it2 = this.backdropAttributes.iterator();
                        while (it2.hasNext()) {
                            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) it2.next();
                            if (!this.notSelectedBackdropAttributes.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id))) {
                                TL_stars.starGiftAttributeIdBackdrop stargiftattributeidbackdrop = new TL_stars.starGiftAttributeIdBackdrop();
                                stargiftattributeidbackdrop.backdrop_id = stargiftattributebackdrop.backdrop_id;
                                getresalestargifts.attributes.add(stargiftattributeidbackdrop);
                            }
                        }
                    }
                    if (!this.notSelectedPatternAttributes.isEmpty()) {
                        Iterator it3 = this.patternAttributes.iterator();
                        while (it3.hasNext()) {
                            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) it3.next();
                            if (!this.notSelectedPatternAttributes.contains(Long.valueOf(stargiftattributepattern.document.id))) {
                                TL_stars.starGiftAttributeIdPattern stargiftattributeidpattern = new TL_stars.starGiftAttributeIdPattern();
                                stargiftattributeidpattern.document_id = stargiftattributepattern.document.id;
                                getresalestargifts.attributes.add(stargiftattributeidpattern);
                            }
                        }
                    }
                }
                this.reqId = ConnectionsManager.getInstance(this.account).sendRequest(getresalestargifts, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$load$1(getresalestargifts, tLObject, tL_error);
                    }
                });
            }
        }

        public void lambda$load$1(final TL_stars.getResaleStarGifts getresalestargifts, final TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$load$0(tLObject, getresalestargifts);
                }
            });
        }

        public void lambda$load$0(TLObject tLObject, TL_stars.getResaleStarGifts getresalestargifts) {
            boolean z;
            this.reqId = -1;
            if (tLObject instanceof TL_stars.resaleStarGifts) {
                TL_stars.resaleStarGifts resalestargifts = (TL_stars.resaleStarGifts) tLObject;
                MessagesController.getInstance(this.account).putUsers(resalestargifts.users, false);
                MessagesController.getInstance(this.account).putChats(resalestargifts.chats, false);
                this.totalCount = resalestargifts.count;
                boolean z2 = true;
                if (TextUtils.isEmpty(getresalestargifts.offset)) {
                    this.gifts.clear();
                    z = true;
                } else {
                    z = false;
                }
                Iterator<TL_stars.StarGift> it = resalestargifts.gifts.iterator();
                while (it.hasNext()) {
                    TL_stars.StarGift next = it.next();
                    if (next instanceof TL_stars.TL_starGiftUnique) {
                        this.gifts.add((TL_stars.TL_starGiftUnique) next);
                    }
                }
                if (this.gifts.size() < this.totalCount && !TextUtils.isEmpty(resalestargifts.next_offset)) {
                    z2 = false;
                }
                this.endReached = z2;
                this.last_offset = resalestargifts.next_offset;
                this.loading = false;
                ArrayList<TL_stars.StarGiftAttribute> arrayList = resalestargifts.attributes;
                if (arrayList != null && !arrayList.isEmpty()) {
                    this.modelAttributes.clear();
                    this.backdropAttributes.clear();
                    this.patternAttributes.clear();
                    this.modelAttributes.addAll(StarsController.findAttributes(resalestargifts.attributes, TL_stars.starGiftAttributeModel.class));
                    this.backdropAttributes.addAll(StarsController.findAttributes(resalestargifts.attributes, TL_stars.starGiftAttributeBackdrop.class));
                    this.patternAttributes.addAll(StarsController.findAttributes(resalestargifts.attributes, TL_stars.starGiftAttributePattern.class));
                    this.attributes_hash = resalestargifts.attributes_hash;
                }
                if (!resalestargifts.counters.isEmpty()) {
                    this.backdropAttributesCounter.clear();
                    this.patternAttributesCounter.clear();
                    this.modelAttributesCounter.clear();
                    Iterator<TL_stars.starGiftAttributeCounter> it2 = resalestargifts.counters.iterator();
                    while (it2.hasNext()) {
                        TL_stars.starGiftAttributeCounter next2 = it2.next();
                        TL_stars.StarGiftAttributeId starGiftAttributeId = next2.attribute;
                        if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdBackdrop) {
                            this.backdropAttributesCounter.put(Integer.valueOf(starGiftAttributeId.backdrop_id), Integer.valueOf(next2.count));
                        } else if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdPattern) {
                            this.patternAttributesCounter.put(Long.valueOf(starGiftAttributeId.document_id), Integer.valueOf(next2.count));
                        } else if (starGiftAttributeId instanceof TL_stars.starGiftAttributeIdModel) {
                            this.modelAttributesCounter.put(Long.valueOf(starGiftAttributeId.document_id), Integer.valueOf(next2.count));
                        }
                    }
                }
                Utilities.Callback callback = this.onUpdate;
                if (callback != null) {
                    callback.run(Boolean.valueOf(z));
                }
            }
        }

        public void cancel() {
            if (this.reqId >= 0) {
                ConnectionsManager.getInstance(this.account).cancelRequest(this.reqId, true);
                this.reqId = -1;
            }
            this.loading = false;
        }

        public void reload() {
            cancel();
            this.last_offset = null;
            this.gifts.clear();
            load(true);
            Utilities.Callback callback = this.onUpdate;
            if (callback != null) {
                callback.run(Boolean.TRUE);
            }
        }

        @Override
        public int getTotalCount() {
            return this.totalCount;
        }

        @Override
        public int getLoadedCount() {
            return this.gifts.size();
        }

        @Override
        public Object get(int i) {
            return this.gifts.get(i);
        }

        @Override
        public int indexOf(Object obj) {
            return this.gifts.indexOf(obj);
        }
    }

    @Override
    public boolean isLightStatusBar() {
        if (getLastStoryViewer() != null && getLastStoryViewer().isShown()) {
            return false;
        }
        int color = Theme.getColor(Theme.key_windowBackgroundWhite);
        if (this.actionBar.isActionModeShowed()) {
            color = Theme.getColor(Theme.key_actionBarActionModeDefault);
        }
        return ColorUtils.calculateLuminance(color) > 0.699999988079071d;
    }

    public static class Filter extends TextView {
        private ColoredImageSpan span;

        public Filter(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            int color = Theme.getColor(Theme.key_actionBarActionModeDefaultIcon, resourcesProvider);
            setTextColor(color);
            setBackground(Theme.createRadSelectorDrawable(Theme.multAlpha(color, 0.08f), Theme.multAlpha(color, 0.15f), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f)));
            setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
            setGravity(17);
            setTypeface(AndroidUtilities.bold());
            ScaleStateListAnimator.apply(this);
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.arrows_select);
            this.span = coloredImageSpan;
            coloredImageSpan.spaceScaleX = 0.8f;
            coloredImageSpan.translate(0.0f, AndroidUtilities.dp(1.0f));
        }

        public void setSorting(ResaleGiftsList.Sorting sorting) {
            ColoredImageSpan coloredImageSpan;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("v ");
            if (sorting == ResaleGiftsList.Sorting.BY_DATE) {
                coloredImageSpan = new ColoredImageSpan(R.drawable.mini_gift_sorting_date);
                spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortDateShort));
            } else if (sorting == ResaleGiftsList.Sorting.BY_PRICE) {
                coloredImageSpan = new ColoredImageSpan(R.drawable.mini_gift_sorting_price);
                spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortPriceShort));
            } else if (sorting == ResaleGiftsList.Sorting.BY_NUMBER) {
                coloredImageSpan = new ColoredImageSpan(R.drawable.mini_gift_sorting_num);
                spannableStringBuilder.setSpan(coloredImageSpan, 0, 1, 33);
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.ResellGiftFilterSortNumberShort));
            } else {
                coloredImageSpan = null;
            }
            if (coloredImageSpan != null) {
                coloredImageSpan.translate(0.0f, AndroidUtilities.dp(1.0f));
            }
            setText(spannableStringBuilder);
        }

        public void setValue(CharSequence charSequence) {
            SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
            spannableStringBuilderAppend.setSpan(this.span, spannableStringBuilderAppend.length() - 1, spannableStringBuilderAppend.length(), 33);
            setText(spannableStringBuilderAppend);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(26.0f), 1073741824));
        }
    }

    public static class EmptyView extends LinearLayout {
        private final BackupImageView imageView;
        private final TextView textView;

        public EmptyView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            setOrientation(1);
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.setImageDrawable(new RLottieDrawable(R.raw.utyan_empty, "utyan_empty", AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
            addView(backupImageView, LayoutHelper.createLinear(64, 64, 17, 0, 32, 0, 0));
            TextView textView = new TextView(context);
            this.textView = textView;
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3, resourcesProvider));
            textView.setTextSize(1, 14.0f);
            textView.setGravity(17);
            addView(textView, LayoutHelper.createLinear(-1, -2, 7, 12, 12, 12, 24));
        }

        public void set(CharSequence charSequence) {
            this.textView.setText(charSequence);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
                size = AndroidUtilities.dp(270.0f);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
        }

        public static class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public EmptyView createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new EmptyView(context, resourcesProvider);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((EmptyView) view).set(uItem.text);
            }

            public static UItem asEmptyView(CharSequence charSequence) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.text = charSequence;
                return uItemOfFactory;
            }
        }
    }

    public static class LargeEmptyView extends FrameLayout {
        private final TextView buttonView;
        private final BackupImageView imageView;
        private final LinearLayout layout;
        private final TextView subtitleView;
        private final TextView titleView;

        public LargeEmptyView(Context context, View.OnClickListener onClickListener, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            LinearLayout linearLayout = new LinearLayout(context);
            this.layout = linearLayout;
            linearLayout.setOrientation(1);
            addView(linearLayout, LayoutHelper.createFrame(-1, -2, 23));
            BackupImageView backupImageView = new BackupImageView(context);
            this.imageView = backupImageView;
            backupImageView.setImageDrawable(new RLottieDrawable(R.raw.utyan_empty, "utyan_empty", AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
            linearLayout.addView(backupImageView, LayoutHelper.createLinear(130, 130, 17));
            TextView textView = new TextView(context);
            this.titleView = textView;
            textView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, resourcesProvider));
            textView.setTextSize(1, 17.0f);
            textView.setGravity(17);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptyTitle));
            linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 17, 32, 12, 32, 9));
            LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
            this.subtitleView = linksTextView;
            linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3, resourcesProvider));
            linksTextView.setTextSize(1, 14.0f);
            linksTextView.setGravity(17);
            linksTextView.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptySubtitle));
            linksTextView.setMaxWidth(AndroidUtilities.dp(200.0f));
            linearLayout.addView(linksTextView, LayoutHelper.createLinear(-2, -2, 17, 32, 0, 32, 12));
            TextView textView2 = new TextView(context);
            this.buttonView = textView2;
            int i = Theme.key_featuredStickers_addButton;
            textView2.setTextColor(Theme.getColor(i, resourcesProvider));
            textView2.setBackground(Theme.createRadSelectorDrawable(Theme.multAlpha(Theme.getColor(i, resourcesProvider), 0.1f), 6, 6));
            textView2.setGravity(17);
            textView2.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptyClear));
            textView2.setPadding(AndroidUtilities.dp(13.0f), 0, AndroidUtilities.dp(13.0f), 0);
            ScaleStateListAnimator.apply(textView2);
            linearLayout.addView(textView2, LayoutHelper.createLinear(-2, 27, 17, 32, 0, 32, 12));
            textView2.setOnClickListener(onClickListener);
        }
    }

    public static class ModelItem extends ActionBarMenuSubItem {
        private final int currentAccount;
        private AnimatedEmojiDrawable emojiDrawable;
        private long emojiDrawableId;

        public ModelItem(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context, false, false, resourcesProvider);
            this.currentAccount = i;
            setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            setColors(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider), Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, resourcesProvider));
            setIconColor(-1);
            this.imageView.setTranslationX(AndroidUtilities.dp(2.0f));
            this.imageView.setScaleX(1.2f);
            this.imageView.setScaleY(1.2f);
            makeCheckView(2);
            setBackground(null);
            this.imageView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                @Override
                public void onViewAttachedToWindow(View view) {
                    if (ModelItem.this.emojiDrawable != null) {
                        ModelItem.this.emojiDrawable.addView(ModelItem.this.imageView);
                    }
                }

                @Override
                public void onViewDetachedFromWindow(View view) {
                    if (ModelItem.this.emojiDrawable != null) {
                        ModelItem.this.emojiDrawable.removeView(ModelItem.this.imageView);
                    }
                }
            });
        }

        public void set(TL_stars.starGiftAttributeModel stargiftattributemodel, int i, String str, boolean z) {
            AnimatedEmojiDrawable animatedEmojiDrawable = this.emojiDrawable;
            if (animatedEmojiDrawable == null || this.emojiDrawableId != stargiftattributemodel.document.id) {
                this.emojiDrawableId = stargiftattributemodel.document.id;
                if (animatedEmojiDrawable != null) {
                    animatedEmojiDrawable.removeView(this.imageView);
                }
                this.emojiDrawable = new AnimatedEmojiDrawable(3, this.currentAccount, stargiftattributemodel.document) {
                    @Override
                    public int getIntrinsicHeight() {
                        return AndroidUtilities.dp(24.0f);
                    }

                    @Override
                    public int getIntrinsicWidth() {
                        return AndroidUtilities.dp(24.0f);
                    }
                };
            }
            if (this.imageView.isAttachedToWindow()) {
                this.emojiDrawable.addView(this.imageView);
            }
            CharSequence charSequenceHighlightText = stargiftattributemodel.name;
            if (!TextUtils.isEmpty(str)) {
                charSequenceHighlightText = AndroidUtilities.highlightText(charSequenceHighlightText, str, this.resourcesProvider);
            }
            setTextAndValueAndIcon(charSequenceHighlightText, i > 0 ? Integer.toString(i) : null, 0, this.emojiDrawable);
            setChecked(z);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
                size = AndroidUtilities.dp(270.0f);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
        }

        public static class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public ModelItem createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new ModelItem(context, i, resourcesProvider);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((ModelItem) view).set((TL_stars.starGiftAttributeModel) uItem.object, uItem.intValue, (String) uItem.text, uItem.checked);
            }

            public static UItem asModel(TL_stars.starGiftAttributeModel stargiftattributemodel, int i, String str) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.object = stargiftattributemodel;
                uItemOfFactory.text = str;
                uItemOfFactory.intValue = i;
                return uItemOfFactory;
            }
        }
    }

    public static class PatternItem extends ActionBarMenuSubItem {
        private final int currentAccount;
        private AnimatedEmojiDrawable emojiDrawable;
        private long emojiDrawableId;

        public PatternItem(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(context, false, false, resourcesProvider);
            this.currentAccount = i;
            setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int color = Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider);
            int i2 = Theme.key_actionBarDefaultSubmenuItemIcon;
            setColors(color, Theme.getColor(i2, resourcesProvider));
            setIconColor(Theme.getColor(i2, resourcesProvider), PorterDuff.Mode.SRC_IN);
            this.imageView.setTranslationX(AndroidUtilities.dp(2.0f));
            makeCheckView(2);
            setBackground(null);
            this.imageView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() {
                @Override
                public void onViewAttachedToWindow(View view) {
                    if (PatternItem.this.emojiDrawable != null) {
                        PatternItem.this.emojiDrawable.addView(PatternItem.this.imageView);
                    }
                }

                @Override
                public void onViewDetachedFromWindow(View view) {
                    if (PatternItem.this.emojiDrawable != null) {
                        PatternItem.this.emojiDrawable.removeView(PatternItem.this.imageView);
                    }
                }
            });
        }

        public void set(TL_stars.starGiftAttributePattern stargiftattributepattern, int i, String str, boolean z) {
            AnimatedEmojiDrawable animatedEmojiDrawable = this.emojiDrawable;
            if (animatedEmojiDrawable == null || this.emojiDrawableId != stargiftattributepattern.document.id) {
                this.emojiDrawableId = stargiftattributepattern.document.id;
                if (animatedEmojiDrawable != null) {
                    animatedEmojiDrawable.removeView(this.imageView);
                }
                AnimatedEmojiDrawable animatedEmojiDrawable2 = new AnimatedEmojiDrawable(3, this.currentAccount, stargiftattributepattern.document) {
                    @Override
                    public int getIntrinsicHeight() {
                        return AndroidUtilities.dp(24.0f);
                    }

                    @Override
                    public int getIntrinsicWidth() {
                        return AndroidUtilities.dp(24.0f);
                    }
                };
                this.emojiDrawable = animatedEmojiDrawable2;
                animatedEmojiDrawable2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            }
            if (this.imageView.isAttachedToWindow()) {
                this.emojiDrawable.addView(this.imageView);
            }
            CharSequence charSequenceHighlightText = stargiftattributepattern.name;
            if (!TextUtils.isEmpty(str)) {
                charSequenceHighlightText = AndroidUtilities.highlightText(charSequenceHighlightText, str, this.resourcesProvider);
            }
            setTextAndValueAndIcon(charSequenceHighlightText, i > 0 ? Integer.toString(i) : null, 0, this.emojiDrawable);
            setChecked(z);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
                size = AndroidUtilities.dp(270.0f);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
        }

        public static class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public PatternItem createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new PatternItem(context, i, resourcesProvider);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((PatternItem) view).set((TL_stars.starGiftAttributePattern) uItem.object, uItem.intValue, (String) uItem.text, uItem.checked);
            }

            public static UItem asPattern(TL_stars.starGiftAttributePattern stargiftattributepattern, int i, String str) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.object = stargiftattributepattern;
                uItemOfFactory.text = str;
                uItemOfFactory.intValue = i;
                return uItemOfFactory;
            }
        }
    }

    public static class BackdropItem extends ActionBarMenuSubItem {
        public BackdropItem(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, false, false, resourcesProvider);
            setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            setColors(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider), Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, resourcesProvider));
            setIconColor(-1);
            this.imageView.setTranslationX(AndroidUtilities.dp(2.0f));
            makeCheckView(2);
            setBackground(null);
        }

        public void set(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop, int i, String str, boolean z) {
            ShapeDrawable shapeDrawableCreateCircleDrawable = Theme.createCircleDrawable(AndroidUtilities.dp(20.0f), stargiftattributebackdrop.center_color | (-16777216));
            CharSequence charSequenceHighlightText = stargiftattributebackdrop.name;
            if (!TextUtils.isEmpty(str)) {
                charSequenceHighlightText = AndroidUtilities.highlightText(charSequenceHighlightText, str, this.resourcesProvider);
            }
            setTextAndValueAndIcon(charSequenceHighlightText, i > 0 ? Integer.toString(i) : null, 0, shapeDrawableCreateCircleDrawable);
            setChecked(z);
        }

        @Override
        protected void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
                size = AndroidUtilities.dp(250.0f);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
        }

        public static class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public BackdropItem createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new BackdropItem(context, resourcesProvider);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((BackdropItem) view).set((TL_stars.starGiftAttributeBackdrop) uItem.object, uItem.intValue, (String) uItem.text, uItem.checked);
            }

            public static UItem asBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop, int i, String str) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.object = stargiftattributebackdrop;
                uItemOfFactory.text = str;
                uItemOfFactory.intValue = i;
                return uItemOfFactory;
            }
        }
    }

    public static class SelectGiftSheet extends BottomSheetWithRecyclerListView {
        private StarGiftSheet.ActionView actionView;
        private UniversalAdapter adapter;
        private Filter backdropButton;
        private final String collectionName;
        private HorizontalScrollView filterScrollView;
        private LinearLayout filtersContainer;
        private boolean hadResaleGifts;
        private Filter modelButton;
        private Utilities.Callback onSelect;
        private Filter patternButton;
        private Filter sortButton;
        private final State state;
        private boolean willBeFirst;
        private HashSet without;

        public static class State implements NotificationCenter.NotificationCenterDelegate {
            private boolean attached;
            public final int currentAccount;
            private Runnable currentListener;
            public final long giftId;
            private final StarsController.GiftsList list;
            private final ResaleGiftsList resaleList;

            public State(int i, long j) {
                this.currentAccount = i;
                this.giftId = j;
                StarsController.GiftsList giftsList = new StarsController.GiftsList(i, 0L, false);
                this.list = giftsList;
                giftsList.forCrafting(j);
                this.resaleList = new ResaleGiftsList(i, j, new Utilities.Callback() {
                    @Override
                    public final void run(Object obj) {
                        this.f$0.update(((Boolean) obj).booleanValue());
                    }
                }).forCraft();
            }

            public void update(boolean z) {
                Runnable runnable = this.currentListener;
                if (runnable != null) {
                    runnable.run();
                }
            }

            public void listen(Runnable runnable) {
                this.currentListener = runnable;
            }

            public void attach() {
                if (this.attached) {
                    return;
                }
                NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
                this.list.load();
                this.resaleList.load();
                this.attached = true;
            }

            public void detach() {
                if (this.attached) {
                    NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
                    this.list.cancel();
                    this.resaleList.cancel();
                    this.attached = false;
                }
            }

            @Override
            public void didReceivedNotification(int i, int i2, Object... objArr) {
                if (i == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.list) {
                    update(true);
                }
            }
        }

        public SelectGiftSheet(final Context context, String str, final State state) {
            super(context, null, false, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING, null);
            this.without = new HashSet();
            this.headerMoveTop = AndroidUtilities.dp(12.0f);
            fixNavigationBar();
            this.collectionName = str;
            this.state = state;
            this.actionBar.setTitle(getTitle());
            LinearLayout linearLayout = new LinearLayout(context);
            this.filtersContainer = linearLayout;
            linearLayout.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f));
            this.filtersContainer.setOrientation(0);
            this.filtersContainer.setClipChildren(false);
            this.filtersContainer.setClipToPadding(false);
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
            this.filterScrollView = horizontalScrollView;
            horizontalScrollView.setHorizontalScrollBarEnabled(false);
            this.filterScrollView.setClipChildren(false);
            this.filterScrollView.setClipToPadding(false);
            this.filterScrollView.addView(this.filtersContainer);
            Filter filter = new Filter(context, this.resourcesProvider);
            this.sortButton = filter;
            filter.setSorting(state.resaleList.getSorting());
            this.filtersContainer.addView(this.sortButton, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 6, 0));
            this.sortButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$3(state, view);
                }
            });
            Filter filter2 = new Filter(context, this.resourcesProvider);
            this.modelButton = filter2;
            filter2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
            this.filtersContainer.addView(this.modelButton, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 6, 0));
            this.modelButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$9(state, context, view);
                }
            });
            Filter filter3 = new Filter(context, this.resourcesProvider);
            this.backdropButton = filter3;
            filter3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
            this.filtersContainer.addView(this.backdropButton, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 6, 0));
            this.backdropButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$15(state, context, view);
                }
            });
            Filter filter4 = new Filter(context, this.resourcesProvider);
            this.patternButton = filter4;
            filter4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
            this.filtersContainer.addView(this.patternButton, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 0, 0));
            this.patternButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    this.f$0.lambda$new$21(state, context, view);
                }
            });
            GridLayoutManager gridLayoutManager = new GridLayoutManager(getContext(), 3);
            gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                @Override
                public int getSpanSize(int i) {
                    int i2;
                    UItem item = SelectGiftSheet.this.adapter.getItem(i - 1);
                    if (item == null || (i2 = item.spanCount) == -1) {
                        return 3;
                    }
                    return i2;
                }
            });
            this.recyclerListView.setLayoutManager(gridLayoutManager);
            this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListenerExtended() {
                @Override
                public boolean hasDoubleTap(View view, int i) {
                    return RecyclerListView.OnItemClickListenerExtended.CC.$default$hasDoubleTap(this, view, i);
                }

                @Override
                public void onDoubleTap(View view, int i, float f, float f2) {
                    RecyclerListView.OnItemClickListenerExtended.CC.$default$onDoubleTap(this, view, i, f, f2);
                }

                @Override
                public final void onItemClick(View view, int i, float f, float f2) {
                    this.f$0.lambda$new$22(state, view, i, f, f2);
                }
            });
            this.recyclerListView.setPadding(this.backgroundPaddingLeft + AndroidUtilities.dp(8.0f), 0, this.backgroundPaddingLeft + AndroidUtilities.dp(8.0f), 0);
            this.recyclerListView.setOnScrollListener(new RecyclerView.OnScrollListener() {
                @Override
                public void onScrolled(RecyclerView recyclerView, int i, int i2) {
                    SelectGiftSheet.this.onScroll();
                }
            });
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.setSupportsChangeAnimations(false);
            defaultItemAnimator.setDelayAnimations(false);
            defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            defaultItemAnimator.setDurations(350L);
            this.recyclerListView.setItemAnimator(defaultItemAnimator);
            this.recyclerListView.setItemSelectorColorProvider(new GenericProvider() {
                @Override
                public final Object provide(Object obj) {
                    return ResaleGiftsFragment.SelectGiftSheet.lambda$new$23((Integer) obj);
                }
            });
            StarGiftSheet.ActionView actionView = new StarGiftSheet.ActionView(context);
            this.actionView = actionView;
            actionView.setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(9.0f));
            this.actionView.setRoundRadius(AndroidUtilities.dp(22.0f));
            this.actionView.setFullRect(true);
            this.actionView.prepareBlur(null);
            this.actionView.setPivotY(0.0f);
            this.container.addView(this.actionView, LayoutHelper.createFrame(-1, -2, 55));
            this.adapter.update(false);
            state.listen(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$new$24();
                }
            });
        }

        public void lambda$new$3(final State state, View view) {
            ItemOptions.makeOptions(this.container, this.resourcesProvider, this.sortButton).add(R.drawable.menu_sort_value, LocaleController.getString(ResaleGiftsList.Sorting.BY_PRICE.buttonStringResId), new Runnable() {
                @Override
                public final void run() {
                    ResaleGiftsFragment.SelectGiftSheet.lambda$new$0(state);
                }
            }).add(R.drawable.menu_sort_date, LocaleController.getString(ResaleGiftsList.Sorting.BY_DATE.buttonStringResId), new Runnable() {
                @Override
                public final void run() {
                    ResaleGiftsFragment.SelectGiftSheet.lambda$new$1(state);
                }
            }).add(R.drawable.menu_sort_number, LocaleController.getString(ResaleGiftsList.Sorting.BY_NUMBER.buttonStringResId), new Runnable() {
                @Override
                public final void run() {
                    ResaleGiftsFragment.SelectGiftSheet.lambda$new$2(state);
                }
            }).setDrawScrim(false).setOnTopOfScrim().translate(0.0f, AndroidUtilities.dp(-8.0f)).show();
        }

        public static void lambda$new$0(State state) {
            state.resaleList.setSorting(ResaleGiftsList.Sorting.BY_PRICE);
        }

        public static void lambda$new$1(State state) {
            state.resaleList.setSorting(ResaleGiftsList.Sorting.BY_DATE);
        }

        public static void lambda$new$2(State state) {
            state.resaleList.setSorting(ResaleGiftsList.Sorting.BY_NUMBER);
        }

        public void lambda$new$9(final State state, Context context, View view) {
            if (state.resaleList.modelAttributes.isEmpty()) {
                return;
            }
            final ItemOptions itemOptionsNeedsFocus = ItemOptions.makeOptions(this.container, this.resourcesProvider, this.modelButton, false, true).setDrawScrim(false).setOnTopOfScrim().translate(0.0f, AndroidUtilities.dp(-8.0f)).needsFocus();
            itemOptionsNeedsFocus.setOnDismiss(new Runnable() {
                @Override
                public final void run() {
                    ResaleGiftsFragment.SelectGiftSheet.lambda$new$4(itemOptionsNeedsFocus);
                }
            });
            final String[] strArr = {""};
            final ArrayList arrayList = new ArrayList(state.resaleList.modelAttributes);
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return ResaleGiftsFragment.SelectGiftSheet.lambda$new$5(state, (TL_stars.starGiftAttributeModel) obj, (TL_stars.starGiftAttributeModel) obj2);
                }
            });
            final UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, this.currentAccount, 0, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    ResaleGiftsFragment.SelectGiftSheet.lambda$new$6(strArr, state, arrayList, (ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    ResaleGiftsFragment.SelectGiftSheet.lambda$new$7(state, itemOptionsNeedsFocus, (UItem) obj, (View) obj2, (Integer) obj3, (Float) obj4, (Float) obj5);
                }
            }, null, this.resourcesProvider) {
                @Override
                protected void onMeasure(int i, int i2) {
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (AndroidUtilities.displaySize.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                }
            };
            universalRecyclerView.adapter.setApplyBackground(false);
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_actionBarDefaultSubmenuItemIcon), PorterDuff.Mode.SRC_IN));
            frameLayout.addView(imageView, LayoutHelper.createFrame(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            EditTextCaption editTextCaption = new EditTextCaption(context, this.resourcesProvider);
            editTextCaption.setTextSize(1, 16.0f);
            editTextCaption.setInputType(573441);
            editTextCaption.setRawInputType(573441);
            editTextCaption.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3, this.resourcesProvider));
            editTextCaption.setCursorColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
            editTextCaption.setCursorSize(AndroidUtilities.dp(19.0f));
            editTextCaption.setCursorWidth(1.5f);
            editTextCaption.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
            editTextCaption.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider));
            editTextCaption.setBackground(null);
            frameLayout.addView(editTextCaption, LayoutHelper.createFrame(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            editTextCaption.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    strArr[0] = editable.toString();
                    universalRecyclerView.adapter.update(true);
                }
            });
            if (arrayList.size() > 8) {
                itemOptionsNeedsFocus.addView(frameLayout, LayoutHelper.createLinear(-1, 44));
                itemOptionsNeedsFocus.addGap();
            }
            if (!state.resaleList.notSelectedModelAttributes.isEmpty()) {
                itemOptionsNeedsFocus.add(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new Runnable() {
                    @Override
                    public final void run() {
                        ResaleGiftsFragment.SelectGiftSheet.lambda$new$8(state);
                    }
                });
            }
            itemOptionsNeedsFocus.addView(universalRecyclerView);
            itemOptionsNeedsFocus.show();
        }

        public static void lambda$new$4(ItemOptions itemOptions) {
            ActionBarPopupWindow actionBarPopupWindow = itemOptions.actionBarPopupWindow;
            if (actionBarPopupWindow != null) {
                AndroidUtilities.hideKeyboard(actionBarPopupWindow.getContentView());
            }
        }

        public static int lambda$new$5(State state, TL_stars.starGiftAttributeModel stargiftattributemodel, TL_stars.starGiftAttributeModel stargiftattributemodel2) {
            Integer num = (Integer) state.resaleList.modelAttributesCounter.get(Long.valueOf(stargiftattributemodel.document.id));
            Integer num2 = (Integer) state.resaleList.modelAttributesCounter.get(Long.valueOf(stargiftattributemodel2.document.id));
            if (num == null) {
                return 1;
            }
            if (num2 == null) {
                return -1;
            }
            return num2.intValue() - num.intValue();
        }

        public static void lambda$new$6(String[] strArr, State state, ArrayList arrayList, ArrayList arrayList2, UniversalAdapter universalAdapter) {
            String lowerCase = strArr[0].toLowerCase();
            String strTranslitSafe = AndroidUtilities.translitSafe(lowerCase);
            boolean zIsEmpty = state.resaleList.notSelectedModelAttributes.isEmpty();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) it.next();
                boolean zContains = state.resaleList.notSelectedModelAttributes.contains(Long.valueOf(stargiftattributemodel.document.id));
                boolean z = !zContains;
                if (!TextUtils.isEmpty(lowerCase) && !stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) && !stargiftattributemodel.name.toLowerCase().startsWith(strTranslitSafe)) {
                    if (!stargiftattributemodel.name.toLowerCase().contains(" " + lowerCase)) {
                        if (stargiftattributemodel.name.toLowerCase().contains(" " + strTranslitSafe)) {
                        }
                    }
                }
                Integer num = (Integer) state.resaleList.modelAttributesCounter.get(Long.valueOf(stargiftattributemodel.document.id));
                UItem uItemAsModel = ModelItem.Factory.asModel(stargiftattributemodel, num == null ? 0 : num.intValue(), lowerCase);
                if (!TextUtils.isEmpty(lowerCase)) {
                    z = (zIsEmpty || zContains) ? false : true;
                }
                arrayList2.add(uItemAsModel.setChecked(z));
            }
            if (arrayList2.isEmpty()) {
                arrayList2.add(EmptyView.Factory.asEmptyView(LocaleController.getString(R.string.Gift2ResaleFiltersModelEmpty)));
            }
        }

        public static void lambda$new$7(State state, ItemOptions itemOptions, UItem uItem, View view, Integer num, Float f, Float f2) {
            long j = ((TL_stars.starGiftAttributeModel) uItem.object).document.id;
            if (!state.resaleList.notSelectedModelAttributes.contains(Long.valueOf(j))) {
                if (state.resaleList.notSelectedModelAttributes.isEmpty()) {
                    Iterator it = state.resaleList.modelAttributes.iterator();
                    while (it.hasNext()) {
                        TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) it.next();
                        if (stargiftattributemodel.document.id != j) {
                            state.resaleList.notSelectedModelAttributes.add(Long.valueOf(stargiftattributemodel.document.id));
                        }
                    }
                } else {
                    state.resaleList.notSelectedModelAttributes.add(Long.valueOf(j));
                }
            } else {
                state.resaleList.notSelectedModelAttributes.remove(Long.valueOf(j));
            }
            state.resaleList.reload();
            itemOptions.dismiss();
        }

        public static void lambda$new$8(State state) {
            if (state.resaleList.notSelectedModelAttributes.isEmpty()) {
                return;
            }
            state.resaleList.notSelectedModelAttributes.clear();
            state.resaleList.reload();
        }

        public void lambda$new$15(final State state, Context context, View view) {
            if (state.resaleList.backdropAttributes.isEmpty()) {
                return;
            }
            final ItemOptions itemOptionsNeedsFocus = ItemOptions.makeOptions(this.container, this.resourcesProvider, this.backdropButton, false, true).setDrawScrim(false).setOnTopOfScrim().translate(0.0f, AndroidUtilities.dp(-8.0f)).needsFocus();
            itemOptionsNeedsFocus.setOnDismiss(new Runnable() {
                @Override
                public final void run() {
                    ResaleGiftsFragment.SelectGiftSheet.lambda$new$10(itemOptionsNeedsFocus);
                }
            });
            final String[] strArr = {""};
            final ArrayList arrayList = new ArrayList(state.resaleList.backdropAttributes);
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return ResaleGiftsFragment.SelectGiftSheet.lambda$new$11(state, (TL_stars.starGiftAttributeBackdrop) obj, (TL_stars.starGiftAttributeBackdrop) obj2);
                }
            });
            final UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, this.currentAccount, 0, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    ResaleGiftsFragment.SelectGiftSheet.lambda$new$12(strArr, state, arrayList, (ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    ResaleGiftsFragment.SelectGiftSheet.lambda$new$13(state, itemOptionsNeedsFocus, (UItem) obj, (View) obj2, (Integer) obj3, (Float) obj4, (Float) obj5);
                }
            }, null, this.resourcesProvider) {
                @Override
                protected void onMeasure(int i, int i2) {
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (AndroidUtilities.displaySize.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                }
            };
            universalRecyclerView.adapter.setApplyBackground(false);
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_actionBarDefaultSubmenuItemIcon), PorterDuff.Mode.SRC_IN));
            frameLayout.addView(imageView, LayoutHelper.createFrame(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            EditTextCaption editTextCaption = new EditTextCaption(context, this.resourcesProvider);
            editTextCaption.setTextSize(1, 16.0f);
            editTextCaption.setInputType(573441);
            editTextCaption.setRawInputType(573441);
            editTextCaption.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3, this.resourcesProvider));
            editTextCaption.setCursorColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
            editTextCaption.setCursorSize(AndroidUtilities.dp(19.0f));
            editTextCaption.setCursorWidth(1.5f);
            editTextCaption.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
            editTextCaption.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider));
            editTextCaption.setBackground(null);
            frameLayout.addView(editTextCaption, LayoutHelper.createFrame(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            editTextCaption.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    strArr[0] = editable.toString();
                    universalRecyclerView.adapter.update(true);
                }
            });
            if (arrayList.size() > 8) {
                itemOptionsNeedsFocus.addView(frameLayout, LayoutHelper.createLinear(-1, 44));
                itemOptionsNeedsFocus.addGap();
            }
            if (!state.resaleList.notSelectedBackdropAttributes.isEmpty()) {
                itemOptionsNeedsFocus.add(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new Runnable() {
                    @Override
                    public final void run() {
                        ResaleGiftsFragment.SelectGiftSheet.lambda$new$14(state);
                    }
                });
            }
            itemOptionsNeedsFocus.addView(universalRecyclerView);
            itemOptionsNeedsFocus.show();
        }

        public static void lambda$new$10(ItemOptions itemOptions) {
            ActionBarPopupWindow actionBarPopupWindow = itemOptions.actionBarPopupWindow;
            if (actionBarPopupWindow != null) {
                AndroidUtilities.hideKeyboard(actionBarPopupWindow.getContentView());
            }
        }

        public static int lambda$new$11(State state, TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop, TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2) {
            Integer num = (Integer) state.resaleList.backdropAttributesCounter.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
            Integer num2 = (Integer) state.resaleList.backdropAttributesCounter.get(Integer.valueOf(stargiftattributebackdrop2.backdrop_id));
            if (num == null) {
                return 1;
            }
            if (num2 == null) {
                return -1;
            }
            return num2.intValue() - num.intValue();
        }

        public static void lambda$new$12(String[] strArr, State state, ArrayList arrayList, ArrayList arrayList2, UniversalAdapter universalAdapter) {
            String lowerCase = strArr[0].toLowerCase();
            String strTranslitSafe = AndroidUtilities.translitSafe(lowerCase);
            boolean zIsEmpty = state.resaleList.notSelectedBackdropAttributes.isEmpty();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) it.next();
                boolean zContains = state.resaleList.notSelectedBackdropAttributes.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                boolean z = !zContains;
                if (!TextUtils.isEmpty(lowerCase) && !stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase) && !stargiftattributebackdrop.name.toLowerCase().startsWith(strTranslitSafe)) {
                    if (!stargiftattributebackdrop.name.toLowerCase().contains(" " + lowerCase)) {
                        if (stargiftattributebackdrop.name.toLowerCase().contains(" " + strTranslitSafe)) {
                        }
                    }
                }
                Integer num = (Integer) state.resaleList.backdropAttributesCounter.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                UItem uItemAsBackdrop = BackdropItem.Factory.asBackdrop(stargiftattributebackdrop, num == null ? 0 : num.intValue(), lowerCase);
                if (!TextUtils.isEmpty(lowerCase)) {
                    z = (zIsEmpty || zContains) ? false : true;
                }
                arrayList2.add(uItemAsBackdrop.setChecked(z));
            }
            if (arrayList2.isEmpty()) {
                arrayList2.add(EmptyView.Factory.asEmptyView(LocaleController.getString(R.string.Gift2ResaleFiltersBackdropEmpty)));
            }
        }

        public static void lambda$new$13(State state, ItemOptions itemOptions, UItem uItem, View view, Integer num, Float f, Float f2) {
            int i = ((TL_stars.starGiftAttributeBackdrop) uItem.object).backdrop_id;
            if (!state.resaleList.notSelectedBackdropAttributes.contains(Integer.valueOf(i))) {
                if (state.resaleList.notSelectedBackdropAttributes.isEmpty()) {
                    Iterator it = state.resaleList.backdropAttributes.iterator();
                    while (it.hasNext()) {
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) it.next();
                        if (stargiftattributebackdrop.backdrop_id != i) {
                            state.resaleList.notSelectedBackdropAttributes.add(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
                        }
                    }
                } else {
                    state.resaleList.notSelectedBackdropAttributes.add(Integer.valueOf(i));
                }
            } else {
                state.resaleList.notSelectedBackdropAttributes.remove(Integer.valueOf(i));
            }
            state.resaleList.reload();
            itemOptions.dismiss();
        }

        public static void lambda$new$14(State state) {
            if (state.resaleList.notSelectedBackdropAttributes.isEmpty()) {
                return;
            }
            state.resaleList.notSelectedBackdropAttributes.clear();
            state.resaleList.reload();
        }

        public void lambda$new$21(final State state, Context context, View view) {
            if (state.resaleList.patternAttributes.isEmpty()) {
                return;
            }
            final ItemOptions itemOptionsNeedsFocus = ItemOptions.makeOptions(this.container, this.resourcesProvider, this.patternButton, false, true).setDrawScrim(false).setOnTopOfScrim().translate(0.0f, AndroidUtilities.dp(-8.0f)).needsFocus();
            itemOptionsNeedsFocus.setOnDismiss(new Runnable() {
                @Override
                public final void run() {
                    ResaleGiftsFragment.SelectGiftSheet.lambda$new$16(itemOptionsNeedsFocus);
                }
            });
            final String[] strArr = {""};
            final ArrayList arrayList = new ArrayList(state.resaleList.patternAttributes);
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return ResaleGiftsFragment.SelectGiftSheet.lambda$new$17(state, (TL_stars.starGiftAttributePattern) obj, (TL_stars.starGiftAttributePattern) obj2);
                }
            });
            final UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(context, this.currentAccount, 0, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    ResaleGiftsFragment.SelectGiftSheet.lambda$new$18(strArr, state, arrayList, (ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    ResaleGiftsFragment.SelectGiftSheet.lambda$new$19(state, itemOptionsNeedsFocus, (UItem) obj, (View) obj2, (Integer) obj3, (Float) obj4, (Float) obj5);
                }
            }, null, this.resourcesProvider) {
                @Override
                protected void onMeasure(int i, int i2) {
                    super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (AndroidUtilities.displaySize.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
                }
            };
            universalRecyclerView.adapter.setApplyBackground(false);
            FrameLayout frameLayout = new FrameLayout(context);
            ImageView imageView = new ImageView(context);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageResource(R.drawable.smiles_inputsearch);
            imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(Theme.key_actionBarDefaultSubmenuItemIcon), PorterDuff.Mode.SRC_IN));
            frameLayout.addView(imageView, LayoutHelper.createFrame(24, 24.0f, 19, 10.0f, 0.0f, 0.0f, 0.0f));
            EditTextCaption editTextCaption = new EditTextCaption(context, this.resourcesProvider);
            editTextCaption.setTextSize(1, 16.0f);
            editTextCaption.setInputType(573441);
            editTextCaption.setRawInputType(573441);
            editTextCaption.setHintTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3, this.resourcesProvider));
            editTextCaption.setCursorColor(Theme.getColor(Theme.key_windowBackgroundWhiteBlackText, this.resourcesProvider));
            editTextCaption.setCursorSize(AndroidUtilities.dp(19.0f));
            editTextCaption.setCursorWidth(1.5f);
            editTextCaption.setHint(LocaleController.getString(R.string.Gift2ResaleFiltersSearch));
            editTextCaption.setTextColor(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider));
            editTextCaption.setBackground(null);
            frameLayout.addView(editTextCaption, LayoutHelper.createFrame(-1, -2.0f, 19, 43.0f, 0.0f, 8.0f, 0.0f));
            editTextCaption.addTextChangedListener(new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override
                public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                }

                @Override
                public void afterTextChanged(Editable editable) {
                    strArr[0] = editable.toString();
                    universalRecyclerView.adapter.update(true);
                }
            });
            if (arrayList.size() > 8) {
                itemOptionsNeedsFocus.addView(frameLayout, LayoutHelper.createLinear(-1, 44));
                itemOptionsNeedsFocus.addGap();
            }
            if (!state.resaleList.notSelectedPatternAttributes.isEmpty()) {
                itemOptionsNeedsFocus.add(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new Runnable() {
                    @Override
                    public final void run() {
                        ResaleGiftsFragment.SelectGiftSheet.lambda$new$20(state);
                    }
                });
            }
            itemOptionsNeedsFocus.addView(universalRecyclerView);
            itemOptionsNeedsFocus.show();
        }

        public static void lambda$new$16(ItemOptions itemOptions) {
            ActionBarPopupWindow actionBarPopupWindow = itemOptions.actionBarPopupWindow;
            if (actionBarPopupWindow != null) {
                AndroidUtilities.hideKeyboard(actionBarPopupWindow.getContentView());
            }
        }

        public static int lambda$new$17(State state, TL_stars.starGiftAttributePattern stargiftattributepattern, TL_stars.starGiftAttributePattern stargiftattributepattern2) {
            Integer num = (Integer) state.resaleList.patternAttributesCounter.get(Long.valueOf(stargiftattributepattern.document.id));
            Integer num2 = (Integer) state.resaleList.patternAttributesCounter.get(Long.valueOf(stargiftattributepattern2.document.id));
            if (num == null) {
                return 1;
            }
            if (num2 == null) {
                return -1;
            }
            return num2.intValue() - num.intValue();
        }

        public static void lambda$new$18(String[] strArr, State state, ArrayList arrayList, ArrayList arrayList2, UniversalAdapter universalAdapter) {
            String lowerCase = strArr[0].toLowerCase();
            String strTranslitSafe = AndroidUtilities.translitSafe(lowerCase);
            boolean zIsEmpty = state.resaleList.notSelectedPatternAttributes.isEmpty();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) it.next();
                boolean zContains = state.resaleList.notSelectedPatternAttributes.contains(Long.valueOf(stargiftattributepattern.document.id));
                boolean z = !zContains;
                if (!TextUtils.isEmpty(lowerCase) && !stargiftattributepattern.name.toLowerCase().startsWith(lowerCase) && !stargiftattributepattern.name.toLowerCase().startsWith(strTranslitSafe)) {
                    if (!stargiftattributepattern.name.toLowerCase().contains(" " + lowerCase)) {
                        if (stargiftattributepattern.name.toLowerCase().contains(" " + strTranslitSafe)) {
                        }
                    }
                }
                Integer num = (Integer) state.resaleList.patternAttributesCounter.get(Long.valueOf(stargiftattributepattern.document.id));
                UItem uItemAsPattern = PatternItem.Factory.asPattern(stargiftattributepattern, num == null ? 0 : num.intValue(), lowerCase);
                if (!TextUtils.isEmpty(lowerCase)) {
                    z = (zIsEmpty || zContains) ? false : true;
                }
                arrayList2.add(uItemAsPattern.setChecked(z));
            }
            if (arrayList2.isEmpty()) {
                arrayList2.add(EmptyView.Factory.asEmptyView(LocaleController.getString(R.string.Gift2ResaleFiltersSymbolEmpty)));
            }
        }

        public static void lambda$new$19(State state, ItemOptions itemOptions, UItem uItem, View view, Integer num, Float f, Float f2) {
            long j = ((TL_stars.starGiftAttributePattern) uItem.object).document.id;
            if (!state.resaleList.notSelectedPatternAttributes.contains(Long.valueOf(j))) {
                if (state.resaleList.notSelectedPatternAttributes.isEmpty()) {
                    Iterator it = state.resaleList.patternAttributes.iterator();
                    while (it.hasNext()) {
                        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) it.next();
                        if (stargiftattributepattern.document.id != j) {
                            state.resaleList.notSelectedPatternAttributes.add(Long.valueOf(stargiftattributepattern.document.id));
                        }
                    }
                } else {
                    state.resaleList.notSelectedPatternAttributes.add(Long.valueOf(j));
                }
            } else {
                state.resaleList.notSelectedPatternAttributes.remove(Long.valueOf(j));
            }
            state.resaleList.reload();
            itemOptions.dismiss();
        }

        public static void lambda$new$20(State state) {
            if (state.resaleList.notSelectedPatternAttributes.isEmpty()) {
                return;
            }
            state.resaleList.notSelectedPatternAttributes.clear();
            state.resaleList.reload();
        }

        public void lambda$new$22(State state, View view, int i, float f, float f2) {
            TL_stars.SavedStarGift savedStarGift;
            UItem item = this.adapter.getItem(i - 1);
            if (item == null) {
                return;
            }
            Object obj = item.object;
            if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                boolean z = item.red;
                if (!TextUtils.isEmpty(starGift.gift_address) && this.willBeFirst) {
                    new AlertDialog.Builder(getContext(), this.resourcesProvider).setTitle(LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle)).setMessage(LocaleController.getString(R.string.GiftCraftCantChooseFirst)).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                    return;
                }
                if (z && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                    buyGift((TL_stars.TL_starGiftUnique) item.object);
                    return;
                }
                if (!z) {
                    Iterator it = state.list.gifts.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            savedStarGift = null;
                            break;
                        } else {
                            savedStarGift = (TL_stars.SavedStarGift) it.next();
                            if (savedStarGift.gift == starGift) {
                                break;
                            }
                        }
                    }
                    if (savedStarGift != null && savedStarGift.can_craft_at > 0 && savedStarGift.can_craft_at > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                        new AlertDialog.Builder(getContext()).setTitle(LocaleController.getString(R.string.GiftCraftUnavailableTitle)).setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(savedStarGift.can_craft_at, true)))).setPositiveButton(LocaleController.getString(R.string.OK), null).show();
                        return;
                    }
                }
                this.onSelect.run(starGift);
                lambda$new$0();
            }
        }

        public static Integer lambda$new$23(Integer num) {
            return 0;
        }

        public void lambda$new$24() {
            this.adapter.update(true);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.onScroll();
                }
            }, 150L);
        }

        public void onScroll() {
            int childAdapterPosition;
            UItem item;
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < this.recyclerListView.getChildCount(); i++) {
                View childAt = this.recyclerListView.getChildAt(i);
                if ((childAt instanceof FlickerLoadingView) && (childAdapterPosition = this.recyclerListView.getChildAdapterPosition(childAt) - 1) >= 0 && (item = this.adapter.getItem(childAdapterPosition)) != null) {
                    if (item.id < 10) {
                        z = true;
                    } else {
                        z2 = true;
                    }
                }
            }
            if (z) {
                this.state.list.load();
            }
            if (z2) {
                this.state.resaleList.load();
            }
        }

        private void buyGift(final TL_stars.TL_starGiftUnique tL_starGiftUnique) {
            final AlertDialog alertDialog = new AlertDialog(getContext(), 3);
            alertDialog.showDelayed(400L);
            final long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            final AmountUtils$Currency amountUtils$Currency = tL_starGiftUnique.resale_ton_only ? AmountUtils$Currency.TON : AmountUtils$Currency.STARS;
            StarsController.getInstance(this.currentAccount, amountUtils$Currency).getResellingGiftForm(tL_starGiftUnique, clientUserId, new Utilities.Callback() {
                @Override
                public final void run(Object obj) {
                    this.f$0.lambda$buyGift$27(alertDialog, amountUtils$Currency, tL_starGiftUnique, clientUserId, (TLRPC.TL_payments_paymentFormStarGift) obj);
                }
            });
        }

        public void lambda$buyGift$27(AlertDialog alertDialog, AmountUtils$Currency amountUtils$Currency, final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
            alertDialog.dismiss();
            if (tL_payments_paymentFormStarGift == null) {
                return;
            }
            StarGiftSheet.PaymentFormState paymentFormState = new StarGiftSheet.PaymentFormState(amountUtils$Currency, tL_payments_paymentFormStarGift);
            new StarGiftSheet.ResaleBuyTransferAlert(getContext(), this.resourcesProvider, tL_starGiftUnique, paymentFormState, this.currentAccount, j, tL_starGiftUnique.title + " #" + LocaleController.formatNumber(tL_starGiftUnique.num, ','), true, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    this.f$0.lambda$buyGift$26(tL_starGiftUnique, j, (StarGiftSheet.PaymentFormState) obj, (Browser.Progress) obj2);
                }
            }).show();
        }

        public void lambda$buyGift$26(final TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, StarGiftSheet.PaymentFormState paymentFormState, final Browser.Progress progress) {
            progress.init();
            StarsController.getInstance(this.currentAccount, paymentFormState.currency).buyResellingGift(paymentFormState.form, tL_starGiftUnique, j, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    this.f$0.lambda$buyGift$25(progress, tL_starGiftUnique, (Boolean) obj, (String) obj2);
                }
            });
        }

        public void lambda$buyGift$25(Browser.Progress progress, TL_stars.TL_starGiftUnique tL_starGiftUnique, Boolean bool, String str) {
            progress.end();
            if (bool.booleanValue()) {
                Utilities.Callback callback = this.onSelect;
                if (callback != null) {
                    callback.run(tL_starGiftUnique);
                }
                lambda$new$0();
            }
        }

        @Override
        public void onSheetTop(float f) {
            float y = (f + this.containerView.getY()) - this.actionView.getMeasuredHeight();
            float fClamp01 = 1.0f - Utilities.clamp01(Math.max(0.0f, (-y) + AndroidUtilities.dp(8.0f)) / this.actionView.getMeasuredHeight());
            float height = this.container.getHeight() / 2.0f;
            if (y > height) {
                fClamp01 = Math.min(fClamp01, Utilities.clamp01(1.0f - ((y - height) / AndroidUtilities.dpf2(128.0f))));
            }
            this.actionView.setScaleX(fClamp01);
            this.actionView.setScaleY(fClamp01);
            this.actionView.setAlpha(AndroidUtilities.ilerp(fClamp01, 0.5f, 1.0f));
            this.actionView.setTranslationY(y);
        }

        public SelectGiftSheet setOnSelect(Utilities.Callback callback) {
            this.onSelect = callback;
            return this;
        }

        public SelectGiftSheet without(HashSet hashSet) {
            this.without.addAll(hashSet);
            updateList(false);
            return this;
        }

        public SelectGiftSheet setWillBeFirst(boolean z) {
            this.willBeFirst = z;
            return this;
        }

        public SelectGiftSheet setActionText(CharSequence charSequence) {
            this.actionView.set(charSequence);
            return this;
        }

        private void updateList(boolean z) {
            this.adapter.update(true);
        }

        @Override
        protected CharSequence getTitle() {
            String str = this.collectionName;
            return str != null ? str : LocaleController.getString(R.string.GiftCraftSelectTitle);
        }

        @Override
        protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
            UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, this.resourcesProvider) {
                @Override
                public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    if (i == 0) {
                        return new RecyclerListView.Holder(new HeaderCell(SelectGiftSheet.this.getContext(), Theme.key_windowBackgroundWhiteBlueHeader, 13, 12, 4, false, ((BottomSheet) SelectGiftSheet.this).resourcesProvider));
                    }
                    if (i == 42) {
                        return new RecyclerListView.Holder(new HeaderCell(SelectGiftSheet.this.getContext(), Theme.key_windowBackgroundWhiteBlueHeader, 13, 12, 4, false, true, ((BottomSheet) SelectGiftSheet.this).resourcesProvider));
                    }
                    return super.onCreateViewHolder(viewGroup, i);
                }
            };
            this.adapter = universalAdapter;
            return universalAdapter;
        }

        public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
            State state = this.state;
            if (state == null || state.list == null || this.state.resaleList == null) {
                return;
            }
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            arrayList.add(UItem.asHeader(-1, LocaleController.getString(R.string.GiftCraftSelectYour)));
            Iterator it = this.state.list.gifts.iterator();
            boolean z = true;
            int i = 0;
            while (it.hasNext()) {
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) it.next();
                if (!this.without.contains(Long.valueOf(savedStarGift.gift.id))) {
                    arrayList.add(GiftSheet.GiftCell.Factory.asStarGift(0, savedStarGift.gift, false, true, false, false, true).setEnabled(savedStarGift.can_craft_at <= currentTime));
                    i++;
                    z = false;
                }
            }
            if (this.state.list.loading || !this.state.list.endReached) {
                int i2 = i % 3;
                int i3 = 6 - i2;
                for (int i4 = 0; i4 < i3; i4++) {
                    arrayList.add(UItem.asFlicker((i4 - i2) + 1, 35).setSpanCount(1));
                }
            } else if (z) {
                arrayList.add(UItem.asCenterShadow(LocaleController.getString(R.string.GiftCraftSelectYourEmpty)));
            }
            if (this.state.resaleList.getTotalCount() > 0 || this.hadResaleGifts) {
                this.hadResaleGifts = true;
                arrayList.add(UItem.asAnimatedHeader(-2, LocaleController.getString(R.string.GiftCraftSelectResale)));
                HorizontalScrollView horizontalScrollView = this.filterScrollView;
                if (horizontalScrollView != null) {
                    arrayList.add(UItem.asCustom(-3, horizontalScrollView));
                }
                Iterator it2 = this.state.resaleList.gifts.iterator();
                while (it2.hasNext()) {
                    arrayList.add(GiftSheet.GiftCell.Factory.asStarGift(0, (TL_stars.TL_starGiftUnique) it2.next(), false, true, false, true, true));
                }
                if (this.state.resaleList.loading || !this.state.resaleList.endReached) {
                    arrayList.add(UItem.asFlicker(10, 35).setSpanCount(1));
                    arrayList.add(UItem.asFlicker(11, 35).setSpanCount(1));
                    arrayList.add(UItem.asFlicker(12, 35).setSpanCount(1));
                    arrayList.add(UItem.asFlicker(13, 35).setSpanCount(1));
                    arrayList.add(UItem.asFlicker(14, 35).setSpanCount(1));
                    arrayList.add(UItem.asFlicker(15, 35).setSpanCount(1));
                }
            }
        }
    }
}
