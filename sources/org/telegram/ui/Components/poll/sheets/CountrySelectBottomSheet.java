package org.telegram.ui.Components.poll.sheets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.utils.GradientProtectionDrawable;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Cells.PhotoPickerPhotoCell;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.FragmentSearchField;
import org.telegram.ui.Components.FragmentSpansContainer;
import org.telegram.ui.Components.GroupCreateSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorCountryCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda8;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;
import org.telegram.ui.iv.RichMediaUploader$$ExternalSyntheticLambda0;
import org.telegram.ui.iv.RichTextCell;
import org.telegram.ui.web.WebActionBar;

public final class CountrySelectBottomSheet extends BottomSheetWithRecyclerListView implements FactorAnimator.Target {
    public static final int $r8$clinit = 0;
    public UniversalAdapter adapter;
    public final FactorAnimator animatorSelectorContainerHeight;
    public final BoolAnimator animatorTopSaveButtonVisibility;
    public final FrameLayout bulletinContainer;
    public final ButtonWithCounterView button;
    public final ArrayList countriesLetters;
    public final ArrayList countriesList;
    public final HashMap countriesMap;
    public HashSet countriesToSelect;
    public GroupCreateSpan currentDeletingSpan;
    public final RichTextCell.AnonymousClass1 doneItem;
    public final GraySectionCell graySectionCell;
    public final Rect listViewClipBounds;
    public Listener listener;
    public final int maxCountriesCount;
    public String query;
    public final PhotoPickerPhotoCell.AnonymousClass1 searchContainer;
    public final HashMap selectedCountries;
    public int selectedCountriesHeight;
    public final FragmentSpansContainer spansContainer;

    public final class Factory extends UItem.UItemFactory {
        public static final int $r8$clinit = 0;

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            SelectorCountryCell selectorCountryCell = (SelectorCountryCell) view;
            selectorCountryCell.country = (TLRPC.TL_help_country) uItem.object;
            selectorCountryCell.setCountryInternal();
            selectorCountryCell.setDivider(z);
            selectorCountryCell.setChecked(uItem.checked, false);
        }

        @Override
        public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            SelectorCountryCell selectorCountryCell = new SelectorCountryCell(context, resourcesProvider);
            selectorCountryCell.setBackground(null);
            return selectorCountryCell;
        }
    }

    public interface Listener {
        void onCountrySelected(List list);
    }

    public CountrySelectBottomSheet(final Context context, final Theme.ResourcesProvider resourcesProvider) {
        super(context, null, true, true, false, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING, resourcesProvider);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorSelectorContainerHeight = new FactorAnimator(3, this, cubicBezierInterpolator, 350L);
        this.animatorTopSaveButtonVisibility = new BoolAnimator(4, this, cubicBezierInterpolator, 320L, false);
        this.countriesMap = new HashMap();
        this.countriesLetters = new ArrayList();
        this.countriesList = new ArrayList();
        this.selectedCountries = new HashMap();
        this.listViewClipBounds = new Rect();
        this.occupyNavigationBar = true;
        this.drawNavigationBar = false;
        this.ignoreTouchActionBar = false;
        this.showShadow = false;
        this.maxCountriesCount = MessagesController.getInstance(this.currentAccount).config.pollCountriesMax.get();
        AndroidUtilities.enableEdgeToEdge(getWindow());
        RecyclerListView recyclerListView = this.recyclerListView;
        int i = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i, 0, i, AndroidUtilities.dp(68.0f) + AndroidUtilities.navigationBarHeight);
        this.recyclerListView.setClipToPadding(false);
        this.recyclerListView.addOnScrollListener(new StarGiftSheet.AnonymousClass8(this, 8));
        this.recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i2) {
                boolean z = false;
                if (i2 == 0) {
                    return;
                }
                CountrySelectBottomSheet countrySelectBottomSheet = this;
                TLRPC.TL_help_country tL_help_country = (TLRPC.TL_help_country) countrySelectBottomSheet.adapter.getItem(i2 - 1).object;
                if (tL_help_country == null) {
                    return;
                }
                HashMap map = countrySelectBottomSheet.selectedCountries;
                boolean zContainsKey = map.containsKey(tL_help_country.iso2);
                FragmentSpansContainer fragmentSpansContainer = countrySelectBottomSheet.spansContainer;
                if (zContainsKey) {
                    fragmentSpansContainer.removeSpan((GroupCreateSpan) map.remove(tL_help_country.iso2));
                } else {
                    int size = map.size();
                    int i3 = countrySelectBottomSheet.maxCountriesCount;
                    if (size >= i3) {
                        BulletinFactory.of(countrySelectBottomSheet.bulletinContainer, resourcesProvider).createSimpleBulletin(R.raw.info, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(i3)))).show();
                        return;
                    }
                    GroupCreateSpan groupCreateSpan = new GroupCreateSpan(context, tL_help_country);
                    groupCreateSpan.setOnClickListener(new CountrySelectBottomSheet$$ExternalSyntheticLambda0(countrySelectBottomSheet, 4));
                    fragmentSpansContainer.addSpan(groupCreateSpan);
                    map.put(tL_help_country.iso2, groupCreateSpan);
                    z = true;
                }
                if (view instanceof SelectorCountryCell) {
                    ((SelectorCountryCell) view).setChecked(z, true);
                }
                countrySelectBottomSheet.adapter.update(true);
                countrySelectBottomSheet.button.setCount(map.size(), true);
            }
        });
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, true, resourcesProvider);
        this.button = buttonWithCounterView;
        buttonWithCounterView.setRound();
        buttonWithCounterView.setCountFilled(true);
        int i2 = R.string.Save;
        buttonWithCounterView.setText(LocaleController.getString(i2));
        buttonWithCounterView.setOnClickListener(new CountrySelectBottomSheet$$ExternalSyntheticLambda0(this, 0));
        RichTextCell.AnonymousClass1 anonymousClass1 = new RichTextCell.AnonymousClass1(this, context);
        this.doneItem = anonymousClass1;
        anonymousClass1.setTextColor(getThemedColor(Theme.key_featuredStickers_buttonText));
        anonymousClass1.setText(LocaleController.getString(i2));
        anonymousClass1.setTypeface(AndroidUtilities.bold());
        anonymousClass1.setTextSize(1, 14.0f);
        anonymousClass1.setGravity(17);
        anonymousClass1.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        anonymousClass1.setVisibility(8);
        ScaleStateListAnimator.apply(anonymousClass1);
        this.actionBar.createMenu().addView(anonymousClass1, LayoutHelper.createLinear(-2, 48, 16, 12, 0, 12, 0));
        anonymousClass1.setOnClickListener(new CountrySelectBottomSheet$$ExternalSyntheticLambda0(this, 1));
        FragmentSearchField fragmentSearchField = new FragmentSearchField(context, resourcesProvider);
        fragmentSearchField.editText.setHint(LocaleController.getString(R.string.PollV2SearchHint));
        fragmentSearchField.editText.addTextChangedListener(new WebActionBar.AnonymousClass5(this, 6));
        FragmentSpansContainer fragmentSpansContainer = new FragmentSpansContainer(context, this.currentAccount);
        this.spansContainer = fragmentSpansContainer;
        fragmentSpansContainer.setDelegate(new CountrySelectBottomSheet$$ExternalSyntheticLambda2(this));
        PhotoPickerPhotoCell.AnonymousClass1 anonymousClass2 = new PhotoPickerPhotoCell.AnonymousClass1(context, resourcesProvider, this);
        this.searchContainer = anonymousClass2;
        int i3 = this.backgroundPaddingLeft;
        anonymousClass2.setPadding(i3, 0, i3, 0);
        anonymousClass2.addView(fragmentSearchField, LayoutHelper.createFrame(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        anonymousClass2.addView(fragmentSpansContainer, LayoutHelper.createFrame(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        GraySectionCell graySectionCell = new GraySectionCell(context, 18, resourcesProvider);
        this.graySectionCell = graySectionCell;
        graySectionCell.setTranslationY(AndroidUtilities.dp(48.0f));
        graySectionCell.setText(LocaleController.getString(R.string.SearchCountriesTitle), LocaleController.getString(R.string.DeselectAll), new CountrySelectBottomSheet$$ExternalSyntheticLambda0(this, 2));
        anonymousClass2.addView(graySectionCell, LayoutHelper.createFrame(-1, 32, 48));
        this.containerView.addView(anonymousClass2, LayoutHelper.createFrame(-1, 216, 48));
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setPadding(AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f) + AndroidUtilities.navigationBarHeight);
        frameLayout.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f));
        this.containerView.addView(frameLayout, LayoutHelper.createFrame(-1, -2, 80));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.bulletinContainer = frameLayout2;
        frameLayout2.setTranslationY((-AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(68.0f));
        this.containerView.addView(frameLayout2, LayoutHelper.createFrame(-1, 150, 80));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(350L);
        defaultItemAnimator.setInterpolator(cubicBezierInterpolator);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.recyclerListView.lambda$onCellEnter$52(defaultItemAnimator);
        this.recyclerListView.addItemDecoration(new RecyclerView.ItemDecoration() {
            public final GradientProtectionDrawable gradientProtectionDrawable = new GradientProtectionDrawable(2);

            @Override
            public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
                CountrySelectBottomSheet countrySelectBottomSheet = CountrySelectBottomSheet.this;
                int iMax = Math.max(0, AndroidUtilities.dp(80.0f) + ((int) countrySelectBottomSheet.searchContainer.getTranslationY()) + ((int) countrySelectBottomSheet.animatorSelectorContainerHeight.factor));
                int color = Theme.getColor(Theme.key_dialogBackground, resourcesProvider);
                GradientProtectionDrawable gradientProtectionDrawable = this.gradientProtectionDrawable;
                gradientProtectionDrawable.setColor(color);
                gradientProtectionDrawable.setBounds(0, iMax, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + iMax);
                gradientProtectionDrawable.draw(canvas);
                countrySelectBottomSheet.checkUi_listViewClip();
                countrySelectBottomSheet.checkUi_searchFieldY();
            }
        });
        DialogCell$$ExternalSyntheticLambda6 dialogCell$$ExternalSyntheticLambda6 = new DialogCell$$ExternalSyntheticLambda6(this, 20);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_help_getCountriesList tL_help_getCountriesList = new TLRPC.TL_help_getCountriesList();
        tL_help_getCountriesList.lang_code = LocaleController.getInstance().getCurrentLocaleInfo() != null ? LocaleController.getInstance().getCurrentLocaleInfo().getLangCode() : Locale.getDefault().getCountry();
        connectionsManager.sendRequest(tL_help_getCountriesList, new RichMediaUploader$$ExternalSyntheticLambda0(dialogCell$$ExternalSyntheticLambda6, 13));
        ViewCompat.Api21Impl.setOnApplyWindowInsetsListener(getContainer(), new CountrySelectBottomSheet$$ExternalSyntheticLambda2(this));
    }

    public final void checkUi_listViewClip() {
        int iDp = AndroidUtilities.dp(56.0f) + ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) this.animatorSelectorContainerHeight.factor);
        int measuredHeight = (this.containerView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(34.0f);
        Rect rect = this.listViewClipBounds;
        boolean z = (rect.top == iDp && rect.bottom == measuredHeight) ? false : true;
        rect.set(0, iDp, this.containerView.getMeasuredWidth(), measuredHeight);
        this.recyclerListView.setClipBounds(rect);
        if (z) {
            this.recyclerListView.invalidate();
        }
    }

    public final void checkUi_searchFieldY() {
        float y = AndroidUtilities.displaySize.y;
        for (int i = 0; i < this.recyclerListView.getChildCount(); i++) {
            View childAt = this.recyclerListView.getChildAt(i);
            if (this.recyclerListView.getChildAdapterPosition(childAt) >= 1 && childAt.getY() < y) {
                y = childAt.getY();
            }
        }
        float fMax = Math.max(ActionBar.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight, y + AndroidUtilities.dp(8.0f));
        PhotoPickerPhotoCell.AnonymousClass1 anonymousClass1 = this.searchContainer;
        if (anonymousClass1.getTranslationY() != fMax) {
            anonymousClass1.setTranslationY(fMax);
            this.recyclerListView.invalidate();
        }
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, new GiftSheet$$ExternalSyntheticLambda8(this, 12), this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        return this.adapter;
    }

    @Override
    public final CharSequence getTitle() {
        return LocaleController.getString(R.string.BoostingSelectCountry);
    }

    @Override
    public final void onContainerLayout(int i, int i2, int i3, int i4) {
        super.onContainerLayout(i, i2, i3, i4);
        checkUi_listViewClip();
        checkUi_searchFieldY();
    }

    @Override
    public final void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i != 3) {
            if (i == 4) {
                FragmentFloatingButton.setAnimatedVisibility(this.doneItem, f);
            }
        } else {
            checkUi_listViewClip();
            this.graySectionCell.setTranslationY(AndroidUtilities.dp(48.0f) + f);
            this.searchContainer.invalidate();
        }
    }

    public final void onSpanClick(View view) {
        GroupCreateSpan groupCreateSpan = (GroupCreateSpan) view;
        if (!groupCreateSpan.isDeleting()) {
            GroupCreateSpan groupCreateSpan2 = this.currentDeletingSpan;
            if (groupCreateSpan2 != null) {
                groupCreateSpan2.cancelDeleteAnimation();
            }
            this.currentDeletingSpan = groupCreateSpan;
            groupCreateSpan.startDeleteAnimation();
            return;
        }
        this.currentDeletingSpan = null;
        this.spansContainer.removeSpan(groupCreateSpan);
        HashMap map = this.selectedCountries;
        map.remove(groupCreateSpan.getCountryIso2());
        this.button.setCount(map.size(), true);
        this.adapter.update(true);
    }
}
