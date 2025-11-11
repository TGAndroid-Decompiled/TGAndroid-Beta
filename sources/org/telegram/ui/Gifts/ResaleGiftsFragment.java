package org.telegram.ui.Gifts;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.FireworksOverlay;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Gifts.ResaleGiftsFragment;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;

public class ResaleGiftsFragment extends BaseFragment {
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
    private final ResaleGiftsList list;
    private UniversalRecyclerView listView;
    private Filter modelButton;
    private Filter patternButton;
    private Filter sortButton;
    private boolean filtersShown = true;
    private boolean clearFiltersShown = true;

    public boolean onItemLongClick(UItem uItem, View view, int i, float f, float f2) {
        return false;
    }

    public ResaleGiftsFragment(long j, String str, long j2, Theme.ResourcesProvider resourcesProvider) {
        this.dialogId = j;
        this.gift_name = str;
        this.gift_id = j2;
        this.resourceProvider = resourcesProvider;
        ResaleGiftsList resaleGiftsList = new ResaleGiftsList(this.currentAccount, j2, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                ResaleGiftsFragment.this.updateList(((Boolean) obj).booleanValue());
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
        ActionBar actionBar = this.actionBar;
        BackDrawable backDrawable = new BackDrawable(false);
        this.backDrawable = backDrawable;
        actionBar.setBackButtonDrawable(backDrawable);
        this.backDrawable.setAnimationTime(240.0f);
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    ResaleGiftsFragment.this.lambda$onBackPressed$340();
                }
            }
        });
        this.actionBar.setTitle(this.gift_name);
        ActionBar actionBar2 = this.actionBar;
        int i = Theme.key_windowBackgroundWhite;
        actionBar2.setBackgroundColor(getThemedColor(i));
        ActionBar actionBar3 = this.actionBar;
        int i2 = Theme.key_windowBackgroundWhiteBlackText;
        actionBar3.setItemsColor(getThemedColor(i2), false);
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
        int blendOver = Theme.blendOver(Theme.getColor(i, this.resourceProvider), Theme.multAlpha(Theme.getColor(i2, this.resourceProvider), 0.04f));
        sizeNotifierFrameLayout.setBackgroundColor(blendOver);
        this.fragmentView = sizeNotifierFrameLayout;
        final StarsIntroActivity.StarsBalanceView starsBalanceView = new StarsIntroActivity.StarsBalanceView(context, this.currentAccount, this.resourceProvider);
        ScaleStateListAnimator.apply(starsBalanceView);
        starsBalanceView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                ResaleGiftsFragment.this.lambda$createView$0(starsBalanceView, view);
            }
        });
        this.actionBar.addView(starsBalanceView, LayoutHelper.createFrame(-2, -2.0f, 85, 0.0f, 0.0f, 4.0f, 0.0f));
        UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                ResaleGiftsFragment.this.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, new Utilities.Callback5() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                ResaleGiftsFragment.this.onItemClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
            }
        }, new Utilities.Callback5Return() {
            @Override
            public final Object run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                boolean onItemLongClick;
                onItemLongClick = ResaleGiftsFragment.this.onItemLongClick((UItem) obj, (View) obj2, ((Integer) obj3).intValue(), ((Float) obj4).floatValue(), ((Float) obj5).floatValue());
                return Boolean.valueOf(onItemLongClick);
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
                ResaleGiftsFragment.this.lambda$createView$1(view);
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
        this.filterScrollView.setBackgroundColor(blendOver);
        sizeNotifierFrameLayout.addView(this.filterScrollView, LayoutHelper.createFrame(-1, 47, 55));
        View view = new View(context);
        this.filtersDivider = view;
        int i3 = Theme.key_divider;
        view.setBackgroundColor(getThemedColor(i3));
        this.filtersDivider.setAlpha(0.0f);
        sizeNotifierFrameLayout.addView(this.filtersDivider, LayoutHelper.createFrame(-1.0f, 2.0f / AndroidUtilities.density, 55));
        FrameLayout frameLayout = new FrameLayout(context);
        this.clearFiltersContainer = frameLayout;
        sizeNotifierFrameLayout.addView(frameLayout, LayoutHelper.createFrame(-1, 49, 87));
        this.clearFiltersButton = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.msg_clearcache), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.Gift2ResaleFiltersClear));
        this.clearFiltersButton.setText(spannableStringBuilder);
        TextView textView = this.clearFiltersButton;
        int i4 = Theme.key_featuredStickers_addButton;
        textView.setTextColor(getThemedColor(i4));
        this.clearFiltersButton.setTypeface(AndroidUtilities.bold());
        this.clearFiltersButton.setBackground(Theme.createSimpleSelectorRoundRectDrawable(0, getThemedColor(i), Theme.blendOver(getThemedColor(i), Theme.multAlpha(getThemedColor(i4), 0.1f))));
        this.clearFiltersButton.setGravity(17);
        this.clearFiltersButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view2) {
                ResaleGiftsFragment.this.lambda$createView$2(view2);
            }
        });
        this.clearFiltersContainer.addView(this.clearFiltersButton, LayoutHelper.createFrame(-1, -1, 119));
        View view2 = new View(context);
        view2.setBackgroundColor(getThemedColor(i3));
        this.clearFiltersContainer.addView(view2, LayoutHelper.createFrame(-1.0f, 1.0f / AndroidUtilities.density, 55));
        setClearFiltersShown(false, false);
        Filter filter = new Filter(context, this.resourceProvider);
        this.sortButton = filter;
        filter.setSorting(this.list.getSorting());
        this.filtersContainer.addView(this.sortButton, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 6, 0));
        this.sortButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                ResaleGiftsFragment.this.lambda$createView$6(view3);
            }
        });
        Filter filter2 = new Filter(context, this.resourceProvider);
        this.modelButton = filter2;
        filter2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        this.filtersContainer.addView(this.modelButton, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 6, 0));
        this.modelButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                ResaleGiftsFragment.this.lambda$createView$12(context, view3);
            }
        });
        Filter filter3 = new Filter(context, this.resourceProvider);
        this.backdropButton = filter3;
        filter3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        this.filtersContainer.addView(this.backdropButton, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 6, 0));
        this.backdropButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                ResaleGiftsFragment.this.lambda$createView$18(context, view3);
            }
        });
        Filter filter4 = new Filter(context, this.resourceProvider);
        this.patternButton = filter4;
        filter4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        this.filtersContainer.addView(this.patternButton, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 0, 0));
        this.patternButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view3) {
                ResaleGiftsFragment.this.lambda$createView$24(context, view3);
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

    public void lambda$createView$2(View view) {
        this.list.notSelectedBackdropAttributes.clear();
        this.list.notSelectedModelAttributes.clear();
        this.list.notSelectedPatternAttributes.clear();
        this.list.reload();
    }

    public void lambda$createView$6(View view) {
        if (this.filtersShown) {
            ItemOptions.makeOptions(this, this.sortButton).add(R.drawable.menu_sort_value, LocaleController.getString(ResaleGiftsList.Sorting.BY_PRICE.buttonStringResId), new Runnable() {
                @Override
                public final void run() {
                    ResaleGiftsFragment.this.lambda$createView$3();
                }
            }).add(R.drawable.menu_sort_date, LocaleController.getString(ResaleGiftsList.Sorting.BY_DATE.buttonStringResId), new Runnable() {
                @Override
                public final void run() {
                    ResaleGiftsFragment.this.lambda$createView$4();
                }
            }).add(R.drawable.menu_sort_number, LocaleController.getString(ResaleGiftsList.Sorting.BY_NUMBER.buttonStringResId), new Runnable() {
                @Override
                public final void run() {
                    ResaleGiftsFragment.this.lambda$createView$5();
                }
            }).setDrawScrim(false).setOnTopOfScrim().translate(0.0f, AndroidUtilities.dp(-8.0f)).show();
        }
    }

    public void lambda$createView$3() {
        this.list.setSorting(ResaleGiftsList.Sorting.BY_PRICE);
    }

    public void lambda$createView$4() {
        this.list.setSorting(ResaleGiftsList.Sorting.BY_DATE);
    }

    public void lambda$createView$5() {
        this.list.setSorting(ResaleGiftsList.Sorting.BY_NUMBER);
    }

    public void lambda$createView$12(Context context, View view) {
        if (this.filtersShown && !this.list.modelAttributes.isEmpty()) {
            final ItemOptions needsFocus = ItemOptions.makeOptions((BaseFragment) this, (View) this.modelButton, false, true).setDrawScrim(false).setOnTopOfScrim().translate(0.0f, AndroidUtilities.dp(-8.0f)).needsFocus();
            needsFocus.setOnDismiss(new Runnable() {
                @Override
                public final void run() {
                    ResaleGiftsFragment.lambda$createView$7(ItemOptions.this);
                }
            });
            final String[] strArr = {""};
            final ArrayList arrayList = new ArrayList(this.list.modelAttributes);
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    int lambda$createView$8;
                    lambda$createView$8 = ResaleGiftsFragment.this.lambda$createView$8((TL_stars.starGiftAttributeModel) obj, (TL_stars.starGiftAttributeModel) obj2);
                    return lambda$createView$8;
                }
            });
            final UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    ResaleGiftsFragment.this.lambda$createView$9(strArr, arrayList, (ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    ResaleGiftsFragment.this.lambda$createView$10(needsFocus, (UItem) obj, (View) obj2, (Integer) obj3, (Float) obj4, (Float) obj5);
                }
            }, null) {
                @Override
                public void onMeasure(int i, int i2) {
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
                needsFocus.addView(frameLayout, LayoutHelper.createLinear(-1, 44));
                needsFocus.addGap();
            }
            if (!this.list.notSelectedModelAttributes.isEmpty()) {
                needsFocus.add(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new Runnable() {
                    @Override
                    public final void run() {
                        ResaleGiftsFragment.this.lambda$createView$11();
                    }
                });
            }
            needsFocus.addView(universalRecyclerView);
            needsFocus.show();
        }
    }

    public static void lambda$createView$7(ItemOptions itemOptions) {
        ActionBarPopupWindow actionBarPopupWindow = itemOptions.actionBarPopupWindow;
        if (actionBarPopupWindow != null) {
            AndroidUtilities.hideKeyboard(actionBarPopupWindow.getContentView());
        }
    }

    public int lambda$createView$8(TL_stars.starGiftAttributeModel stargiftattributemodel, TL_stars.starGiftAttributeModel stargiftattributemodel2) {
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

    public void lambda$createView$9(String[] strArr, ArrayList arrayList, ArrayList arrayList2, UniversalAdapter universalAdapter) {
        String lowerCase = strArr[0].toLowerCase();
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        boolean isEmpty = this.list.notSelectedModelAttributes.isEmpty();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) it.next();
            boolean contains = this.list.notSelectedModelAttributes.contains(Long.valueOf(stargiftattributemodel.document.id));
            boolean z = !contains;
            if (!TextUtils.isEmpty(lowerCase) && !stargiftattributemodel.name.toLowerCase().startsWith(lowerCase) && !stargiftattributemodel.name.toLowerCase().startsWith(translitSafe)) {
                if (!stargiftattributemodel.name.toLowerCase().contains(" " + lowerCase)) {
                    if (stargiftattributemodel.name.toLowerCase().contains(" " + translitSafe)) {
                    }
                }
            }
            Integer num = (Integer) this.list.modelAttributesCounter.get(Long.valueOf(stargiftattributemodel.document.id));
            UItem asModel = ModelItem.Factory.asModel(stargiftattributemodel, num == null ? 0 : num.intValue(), lowerCase);
            if (!TextUtils.isEmpty(lowerCase)) {
                z = (isEmpty || contains) ? false : true;
            }
            arrayList2.add(asModel.setChecked(z));
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(EmptyView.Factory.asEmptyView(LocaleController.getString(R.string.Gift2ResaleFiltersModelEmpty)));
        }
    }

    public void lambda$createView$10(ItemOptions itemOptions, UItem uItem, View view, Integer num, Float f, Float f2) {
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

    public void lambda$createView$11() {
        if (this.list.notSelectedModelAttributes.isEmpty()) {
            return;
        }
        this.list.notSelectedModelAttributes.clear();
        this.list.reload();
    }

    public void lambda$createView$18(Context context, View view) {
        if (this.filtersShown && !this.list.backdropAttributes.isEmpty()) {
            final ItemOptions needsFocus = ItemOptions.makeOptions((BaseFragment) this, (View) this.backdropButton, false, true).setDrawScrim(false).setOnTopOfScrim().translate(0.0f, AndroidUtilities.dp(-8.0f)).needsFocus();
            needsFocus.setOnDismiss(new Runnable() {
                @Override
                public final void run() {
                    ResaleGiftsFragment.lambda$createView$13(ItemOptions.this);
                }
            });
            final String[] strArr = {""};
            final ArrayList arrayList = new ArrayList(this.list.backdropAttributes);
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    int lambda$createView$14;
                    lambda$createView$14 = ResaleGiftsFragment.this.lambda$createView$14((TL_stars.starGiftAttributeBackdrop) obj, (TL_stars.starGiftAttributeBackdrop) obj2);
                    return lambda$createView$14;
                }
            });
            final UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    ResaleGiftsFragment.this.lambda$createView$15(strArr, arrayList, (ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    ResaleGiftsFragment.this.lambda$createView$16(needsFocus, (UItem) obj, (View) obj2, (Integer) obj3, (Float) obj4, (Float) obj5);
                }
            }, null) {
                @Override
                public void onMeasure(int i, int i2) {
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
                needsFocus.addView(frameLayout, LayoutHelper.createLinear(-1, 44));
                needsFocus.addGap();
            }
            if (!this.list.notSelectedBackdropAttributes.isEmpty()) {
                needsFocus.add(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new Runnable() {
                    @Override
                    public final void run() {
                        ResaleGiftsFragment.this.lambda$createView$17();
                    }
                });
            }
            needsFocus.addView(universalRecyclerView);
            needsFocus.show();
        }
    }

    public static void lambda$createView$13(ItemOptions itemOptions) {
        ActionBarPopupWindow actionBarPopupWindow = itemOptions.actionBarPopupWindow;
        if (actionBarPopupWindow != null) {
            AndroidUtilities.hideKeyboard(actionBarPopupWindow.getContentView());
        }
    }

    public int lambda$createView$14(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop, TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2) {
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

    public void lambda$createView$15(String[] strArr, ArrayList arrayList, ArrayList arrayList2, UniversalAdapter universalAdapter) {
        String lowerCase = strArr[0].toLowerCase();
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        boolean isEmpty = this.list.notSelectedBackdropAttributes.isEmpty();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) it.next();
            boolean contains = this.list.notSelectedBackdropAttributes.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
            boolean z = !contains;
            if (!TextUtils.isEmpty(lowerCase) && !stargiftattributebackdrop.name.toLowerCase().startsWith(lowerCase) && !stargiftattributebackdrop.name.toLowerCase().startsWith(translitSafe)) {
                if (!stargiftattributebackdrop.name.toLowerCase().contains(" " + lowerCase)) {
                    if (stargiftattributebackdrop.name.toLowerCase().contains(" " + translitSafe)) {
                    }
                }
            }
            Integer num = (Integer) this.list.backdropAttributesCounter.get(Integer.valueOf(stargiftattributebackdrop.backdrop_id));
            UItem asBackdrop = BackdropItem.Factory.asBackdrop(stargiftattributebackdrop, num == null ? 0 : num.intValue(), lowerCase);
            if (!TextUtils.isEmpty(lowerCase)) {
                z = (isEmpty || contains) ? false : true;
            }
            arrayList2.add(asBackdrop.setChecked(z));
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(EmptyView.Factory.asEmptyView(LocaleController.getString(R.string.Gift2ResaleFiltersBackdropEmpty)));
        }
    }

    public void lambda$createView$16(ItemOptions itemOptions, UItem uItem, View view, Integer num, Float f, Float f2) {
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

    public void lambda$createView$17() {
        if (this.list.notSelectedBackdropAttributes.isEmpty()) {
            return;
        }
        this.list.notSelectedBackdropAttributes.clear();
        this.list.reload();
    }

    public void lambda$createView$24(Context context, View view) {
        if (this.filtersShown && !this.list.patternAttributes.isEmpty()) {
            final ItemOptions needsFocus = ItemOptions.makeOptions((BaseFragment) this, (View) this.patternButton, false, true).setDrawScrim(false).setOnTopOfScrim().translate(0.0f, AndroidUtilities.dp(-8.0f)).needsFocus();
            needsFocus.setOnDismiss(new Runnable() {
                @Override
                public final void run() {
                    ResaleGiftsFragment.lambda$createView$19(ItemOptions.this);
                }
            });
            final String[] strArr = {""};
            final ArrayList arrayList = new ArrayList(this.list.patternAttributes);
            Collections.sort(arrayList, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    int lambda$createView$20;
                    lambda$createView$20 = ResaleGiftsFragment.this.lambda$createView$20((TL_stars.starGiftAttributePattern) obj, (TL_stars.starGiftAttributePattern) obj2);
                    return lambda$createView$20;
                }
            });
            final UniversalRecyclerView universalRecyclerView = new UniversalRecyclerView(this, new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    ResaleGiftsFragment.this.lambda$createView$21(strArr, arrayList, (ArrayList) obj, (UniversalAdapter) obj2);
                }
            }, new Utilities.Callback5() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                    ResaleGiftsFragment.this.lambda$createView$22(needsFocus, (UItem) obj, (View) obj2, (Integer) obj3, (Float) obj4, (Float) obj5);
                }
            }, null) {
                @Override
                public void onMeasure(int i, int i2) {
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
                needsFocus.addView(frameLayout, LayoutHelper.createLinear(-1, 44));
                needsFocus.addGap();
            }
            if (!this.list.notSelectedPatternAttributes.isEmpty()) {
                needsFocus.add(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new Runnable() {
                    @Override
                    public final void run() {
                        ResaleGiftsFragment.this.lambda$createView$23();
                    }
                });
            }
            needsFocus.addView(universalRecyclerView);
            needsFocus.show();
        }
    }

    public static void lambda$createView$19(ItemOptions itemOptions) {
        ActionBarPopupWindow actionBarPopupWindow = itemOptions.actionBarPopupWindow;
        if (actionBarPopupWindow != null) {
            AndroidUtilities.hideKeyboard(actionBarPopupWindow.getContentView());
        }
    }

    public int lambda$createView$20(TL_stars.starGiftAttributePattern stargiftattributepattern, TL_stars.starGiftAttributePattern stargiftattributepattern2) {
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

    public void lambda$createView$21(String[] strArr, ArrayList arrayList, ArrayList arrayList2, UniversalAdapter universalAdapter) {
        String lowerCase = strArr[0].toLowerCase();
        String translitSafe = AndroidUtilities.translitSafe(lowerCase);
        boolean isEmpty = this.list.notSelectedPatternAttributes.isEmpty();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) it.next();
            boolean contains = this.list.notSelectedPatternAttributes.contains(Long.valueOf(stargiftattributepattern.document.id));
            boolean z = !contains;
            if (!TextUtils.isEmpty(lowerCase) && !stargiftattributepattern.name.toLowerCase().startsWith(lowerCase) && !stargiftattributepattern.name.toLowerCase().startsWith(translitSafe)) {
                if (!stargiftattributepattern.name.toLowerCase().contains(" " + lowerCase)) {
                    if (stargiftattributepattern.name.toLowerCase().contains(" " + translitSafe)) {
                    }
                }
            }
            Integer num = (Integer) this.list.patternAttributesCounter.get(Long.valueOf(stargiftattributepattern.document.id));
            UItem asPattern = PatternItem.Factory.asPattern(stargiftattributepattern, num == null ? 0 : num.intValue(), lowerCase);
            if (!TextUtils.isEmpty(lowerCase)) {
                z = (isEmpty || contains) ? false : true;
            }
            arrayList2.add(asPattern.setChecked(z));
        }
        if (arrayList2.isEmpty()) {
            arrayList2.add(EmptyView.Factory.asEmptyView(LocaleController.getString(R.string.Gift2ResaleFiltersSymbolEmpty)));
        }
    }

    public void lambda$createView$22(ItemOptions itemOptions, UItem uItem, View view, Integer num, Float f, Float f2) {
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

    public void lambda$createView$23() {
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
            ViewPropertyAnimator alpha = this.filterScrollView.animate().translationY(z ? 0.0f : -AndroidUtilities.dp(45.0f)).alpha(z ? 1.0f : 0.0f);
            CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
            alpha.setInterpolator(cubicBezierInterpolator).setDuration(420L).setListener(new AnimatorListenerAdapter() {
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

    private void setClearFiltersShown(boolean z, boolean z2) {
        if (this.clearFiltersShown == z) {
            return;
        }
        this.clearFiltersShown = z;
        if (z2) {
            this.clearFiltersContainer.animate().translationY(z ? 0.0f : AndroidUtilities.dp(49.0f)).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).setDuration(420L).start();
        } else {
            this.clearFiltersContainer.setTranslationY(z ? 0.0f : AndroidUtilities.dp(49.0f));
        }
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
            this.actionBar.setSubtitle(this.list.getTotalCount() <= 0 ? LocaleController.getString(R.string.Gift2ResaleNoCount) : LocaleController.formatPluralStringComma("Gift2ResaleCount", this.list.getTotalCount()));
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
        setClearFiltersShown(z2, true);
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        Iterator it = this.list.gifts.iterator();
        while (it.hasNext()) {
            arrayList.add(GiftSheet.GiftCell.Factory.asStarGift(0, (TL_stars.TL_starGiftUnique) it.next(), false, false, false, true));
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
                    ResaleGiftsFragment.this.lambda$onItemClick$25((TL_stars.TL_starGiftUnique) obj2, (Long) obj3);
                }
            });
            showDialog(starGiftSheet);
        }
    }

    public void lambda$onItemClick$25(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final Long l) {
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
        presentFragment(new ChatActivity(bundle) {
            private boolean shownToast = false;

            @Override
            public void onBecomeFullyVisible() {
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
        }, true);
        Runnable runnable = this.closeParentSheet;
        if (runnable != null) {
            runnable.run();
        }
    }

    public static class ResaleGiftsList implements StarsController.IGiftsList {
        private final int account;
        private long attributes_hash;
        public final long gift_id;
        private String last_offset;
        public boolean loading;
        private final Utilities.Callback onUpdate;
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
                        ResaleGiftsFragment.ResaleGiftsList.this.lambda$load$1(getresalestargifts, tLObject, tL_error);
                    }
                });
            }
        }

        public void lambda$load$1(final TL_stars.getResaleStarGifts getresalestargifts, final TLObject tLObject, TLRPC.TL_error tL_error) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    ResaleGiftsFragment.ResaleGiftsList.this.lambda$load$0(tLObject, getresalestargifts);
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
            SpannableStringBuilder append = new SpannableStringBuilder(charSequence).append((CharSequence) " v");
            append.setSpan(this.span, append.length() - 1, append.length(), 33);
            setText(append);
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
                size = AndroidUtilities.dp(250.0f);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
        }

        public static class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public EmptyView createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new EmptyView(context, resourcesProvider);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((EmptyView) view).set(uItem.text);
            }

            public static UItem asEmptyView(CharSequence charSequence) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.text = charSequence;
                return ofFactory;
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
            CharSequence charSequence = stargiftattributemodel.name;
            if (!TextUtils.isEmpty(str)) {
                charSequence = AndroidUtilities.highlightText(charSequence, str, this.resourcesProvider);
            }
            if (i > 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                spannableStringBuilder.append((CharSequence) "  ");
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) Integer.toString(i));
                spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
                charSequence = spannableStringBuilder;
            }
            setTextAndIcon(charSequence, 0, this.emojiDrawable);
            setChecked(z);
        }

        @Override
        public void onMeasure(int i, int i2) {
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
            public ModelItem createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new ModelItem(context, i, resourcesProvider);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((ModelItem) view).set((TL_stars.starGiftAttributeModel) uItem.object, uItem.intValue, (String) uItem.text, uItem.checked);
            }

            public static UItem asModel(TL_stars.starGiftAttributeModel stargiftattributemodel, int i, String str) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.object = stargiftattributemodel;
                ofFactory.text = str;
                ofFactory.intValue = i;
                return ofFactory;
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
            setColors(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider), Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, resourcesProvider));
            setIconColor(-1);
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
            CharSequence charSequence = stargiftattributepattern.name;
            if (!TextUtils.isEmpty(str)) {
                charSequence = AndroidUtilities.highlightText(charSequence, str, this.resourcesProvider);
            }
            if (i > 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                spannableStringBuilder.append((CharSequence) "  ");
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) Integer.toString(i));
                spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
                charSequence = spannableStringBuilder;
            }
            setTextAndIcon(charSequence, 0, this.emojiDrawable);
            setChecked(z);
        }

        @Override
        public void onMeasure(int i, int i2) {
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
            public PatternItem createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new PatternItem(context, i, resourcesProvider);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((PatternItem) view).set((TL_stars.starGiftAttributePattern) uItem.object, uItem.intValue, (String) uItem.text, uItem.checked);
            }

            public static UItem asPattern(TL_stars.starGiftAttributePattern stargiftattributepattern, int i, String str) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.object = stargiftattributepattern;
                ofFactory.text = str;
                ofFactory.intValue = i;
                return ofFactory;
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
            ShapeDrawable createCircleDrawable = Theme.createCircleDrawable(AndroidUtilities.dp(20.0f), stargiftattributebackdrop.center_color | (-16777216));
            CharSequence charSequence = stargiftattributebackdrop.name;
            if (!TextUtils.isEmpty(str)) {
                charSequence = AndroidUtilities.highlightText(charSequence, str, this.resourcesProvider);
            }
            if (i > 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                spannableStringBuilder.append((CharSequence) "  ");
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) Integer.toString(i));
                spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
                charSequence = spannableStringBuilder;
            }
            setTextAndIcon(charSequence, 0, createCircleDrawable);
            setChecked(z);
        }

        @Override
        public void onMeasure(int i, int i2) {
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
            public BackdropItem createView(Context context, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new BackdropItem(context, resourcesProvider);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((BackdropItem) view).set((TL_stars.starGiftAttributeBackdrop) uItem.object, uItem.intValue, (String) uItem.text, uItem.checked);
            }

            public static UItem asBackdrop(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop, int i, String str) {
                UItem ofFactory = UItem.ofFactory(Factory.class);
                ofFactory.object = stargiftattributebackdrop;
                ofFactory.text = str;
                ofFactory.intValue = i;
                return ofFactory;
            }
        }
    }
}
