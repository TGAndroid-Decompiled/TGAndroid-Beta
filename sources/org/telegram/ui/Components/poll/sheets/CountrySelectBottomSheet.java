package org.telegram.ui.Components.poll.sheets;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.function.BiConsumer$CC;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.GradientProtectionDrawable;
import org.telegram.messenger.utils.TextWatcherImpl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.GraySectionCell;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.FragmentSearchField;
import org.telegram.ui.Components.FragmentSpansContainer;
import org.telegram.ui.Components.GroupCreateSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
import org.telegram.ui.Components.Premium.boosts.SelectorBottomSheet;
import org.telegram.ui.Components.Premium.boosts.cells.selector.SelectorCountryCell;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class CountrySelectBottomSheet extends BottomSheetWithRecyclerListView implements FactorAnimator.Target {
    private UniversalAdapter adapter;
    private final FactorAnimator animatorSelectorContainerHeight;
    private final BoolAnimator animatorTopSaveButtonVisibility;
    private final FrameLayout bulletinContainer;
    private final ButtonWithCounterView button;
    private final FrameLayout buttonContainer;
    private final List countriesLetters;
    private final List countriesList;
    private final Map countriesMap;
    private Set countriesToSelect;
    private GroupCreateSpan currentDeletingSpan;
    private final TextView doneItem;
    private final GraySectionCell graySectionCell;
    private final Rect listViewClipBounds;
    private Listener listener;
    private final int maxCountriesCount;
    private String query;
    private final FrameLayout searchContainer;
    private final FragmentSearchField searchField;
    private final HashMap selectedCountries;
    private int selectedCountriesHeight;
    private final FragmentSpansContainer spansContainer;

    public interface Listener {
        void onCountrySelected(List list);
    }

    @Override
    public void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
        FactorAnimator.Target.CC.$default$onFactorChangeFinished(this, i, f, factorAnimator);
    }

    public static void access$700(CountrySelectBottomSheet countrySelectBottomSheet, View view) {
        countrySelectBottomSheet.onSpanClick(view);
    }

    public CountrySelectBottomSheet(Context context, final Theme.ResourcesProvider resourcesProvider) {
        super(context, null, true, true, false, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING, resourcesProvider);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        this.animatorSelectorContainerHeight = new FactorAnimator(3, this, cubicBezierInterpolator, 350L);
        this.animatorTopSaveButtonVisibility = new BoolAnimator(4, this, cubicBezierInterpolator, 320L);
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
        recyclerListView.setPadding(i, 0, i, AndroidUtilities.navigationBarHeight + AndroidUtilities.dp(68.0f));
        this.recyclerListView.setClipToPadding(false);
        this.recyclerListView.addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrolled(RecyclerView recyclerView, int i2, int i3) {
                super.onScrolled(recyclerView, i2, i3);
                CountrySelectBottomSheet.this.checkUi_searchFieldY();
            }
        });
        this.recyclerListView.setOnItemClickListener(new AnonymousClass2(resourcesProvider, context));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider);
        this.button = buttonWithCounterView;
        buttonWithCounterView.setRound();
        buttonWithCounterView.setCountFilled(true);
        int i2 = R.string.Save;
        buttonWithCounterView.setText(LocaleController.getString(i2));
        buttonWithCounterView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$0(view);
            }
        });
        TextView textView = new TextView(context) {
            final Paint p = new Paint(1);

            @Override
            protected void onDraw(Canvas canvas) {
                this.p.setColor(CountrySelectBottomSheet.this.getThemedColor(Theme.key_featuredStickers_addButton));
                canvas.drawRoundRect(0.0f, (getHeight() / 2.0f) - AndroidUtilities.dp(14.0f), getWidth(), (getHeight() / 2.0f) + AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f), this.p);
                super.onDraw(canvas);
            }
        };
        this.doneItem = textView;
        textView.setTextColor(getThemedColor(Theme.key_featuredStickers_buttonText));
        textView.setText(LocaleController.getString(i2));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextSize(1, 14.0f);
        textView.setGravity(17);
        textView.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        textView.setVisibility(8);
        ScaleStateListAnimator.apply(textView);
        this.actionBar.createMenu().addView(textView, LayoutHelper.createLinear(-2, 48, 16, 12, 0, 12, 0));
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$1(view);
            }
        });
        FragmentSearchField fragmentSearchField = new FragmentSearchField(context, resourcesProvider);
        this.searchField = fragmentSearchField;
        fragmentSearchField.editText.setHint(LocaleController.getString(R.string.PollV2SearchHint));
        fragmentSearchField.editText.addTextChangedListener(new TextWatcherImpl() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                TextWatcherImpl.CC.$default$beforeTextChanged(this, charSequence, i3, i4, i5);
            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i3, int i4, int i5) {
                TextWatcherImpl.CC.$default$onTextChanged(this, charSequence, i3, i4, i5);
            }

            @Override
            public void afterTextChanged(Editable editable) {
                CountrySelectBottomSheet.this.saveScrollPosition();
                CountrySelectBottomSheet.this.query = editable.toString();
                CountrySelectBottomSheet.this.adapter.update(true);
            }
        });
        FragmentSpansContainer fragmentSpansContainer = new FragmentSpansContainer(context, this.currentAccount);
        this.spansContainer = fragmentSpansContainer;
        fragmentSpansContainer.setDelegate(new FragmentSpansContainer.Delegate() {
            @Override
            public final void onAfterMeasure(int i3) {
                this.f$0.lambda$new$3(i3);
            }
        });
        FrameLayout frameLayout = new FrameLayout(context) {
            final GradientProtectionDrawable gradientProtectionDrawableTop = new GradientProtectionDrawable(2);
            final GradientProtectionDrawable gradientProtectionDrawableBottom = new GradientProtectionDrawable(8);

            @Override
            protected boolean drawChild(Canvas canvas, View view, long j) {
                boolean zDrawChild = super.drawChild(canvas, view, j);
                int factor = (int) CountrySelectBottomSheet.this.animatorSelectorContainerHeight.getFactor();
                if (view == CountrySelectBottomSheet.this.spansContainer && factor > 0) {
                    this.gradientProtectionDrawableTop.setBounds(0, AndroidUtilities.dp(40.0f), getWidth(), AndroidUtilities.dp(48.0f));
                    GradientProtectionDrawable gradientProtectionDrawable = this.gradientProtectionDrawableTop;
                    int i3 = Theme.key_dialogBackground;
                    gradientProtectionDrawable.setColor(Theme.getColor(i3, resourcesProvider));
                    this.gradientProtectionDrawableTop.draw(canvas);
                    int iDp = AndroidUtilities.dp(48.0f) + factor;
                    this.gradientProtectionDrawableBottom.setBounds(0, iDp - AndroidUtilities.dp(8.0f), getWidth(), iDp);
                    this.gradientProtectionDrawableBottom.setColor(Theme.getColor(i3, resourcesProvider));
                    this.gradientProtectionDrawableBottom.draw(canvas);
                }
                return zDrawChild;
            }
        };
        this.searchContainer = frameLayout;
        int i3 = this.backgroundPaddingLeft;
        frameLayout.setPadding(i3, 0, i3, 0);
        frameLayout.addView(fragmentSearchField, LayoutHelper.createFrame(-1, 40.0f, 48, 10.0f, 0.0f, 10.0f, 0.0f));
        frameLayout.addView(fragmentSpansContainer, LayoutHelper.createFrame(-1, 144.0f, 48, -3.0f, 40.0f, -3.0f, 0.0f));
        GraySectionCell graySectionCell = new GraySectionCell(context, 18, resourcesProvider);
        this.graySectionCell = graySectionCell;
        graySectionCell.setTranslationY(AndroidUtilities.dp(48.0f));
        graySectionCell.setText(LocaleController.getString(R.string.SearchCountriesTitle), LocaleController.getString(R.string.DeselectAll), new View.OnClickListener() {
            @Override
            public final void onClick(View view) {
                this.f$0.lambda$new$4(view);
            }
        });
        frameLayout.addView(graySectionCell, LayoutHelper.createFrame(-1, 32, 48));
        this.containerView.addView(frameLayout, LayoutHelper.createFrame(-1, 216, 48));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.buttonContainer = frameLayout2;
        frameLayout2.setPadding(this.backgroundPaddingLeft + AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), this.backgroundPaddingLeft + AndroidUtilities.dp(10.0f), AndroidUtilities.navigationBarHeight + AndroidUtilities.dp(10.0f));
        frameLayout2.addView(buttonWithCounterView, LayoutHelper.createFrame(-1, 48.0f));
        this.containerView.addView(frameLayout2, LayoutHelper.createFrame(-1, -2, 80));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.bulletinContainer = frameLayout3;
        frameLayout3.setTranslationY((-AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(68.0f));
        this.containerView.addView(frameLayout3, LayoutHelper.createFrame(-1, 150, 80));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setDurations(350L);
        defaultItemAnimator.setInterpolator(cubicBezierInterpolator);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setSupportsChangeAnimations(false);
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        this.recyclerListView.addItemDecoration(new RecyclerView.ItemDecoration() {
            final GradientProtectionDrawable gradientProtectionDrawable = new GradientProtectionDrawable(2);

            @Override
            public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
                int iMax = Math.max(0, ((int) CountrySelectBottomSheet.this.searchContainer.getTranslationY()) + AndroidUtilities.dp(80.0f) + ((int) CountrySelectBottomSheet.this.animatorSelectorContainerHeight.getFactor()));
                this.gradientProtectionDrawable.setColor(Theme.getColor(Theme.key_dialogBackground, resourcesProvider));
                this.gradientProtectionDrawable.setBounds(0, iMax, recyclerView.getWidth(), AndroidUtilities.dp(8.0f) + iMax);
                this.gradientProtectionDrawable.draw(canvas);
                CountrySelectBottomSheet.this.checkUi_listViewClip();
                CountrySelectBottomSheet.this.checkUi_searchFieldY();
            }
        });
        loadCountries();
        ViewCompat.setOnApplyWindowInsetsListener(getContainer(), new OnApplyWindowInsetsListener() {
            @Override
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return this.f$0.onApplyWindowInsets(view, windowInsetsCompat);
            }
        });
    }

    class AnonymousClass2 implements RecyclerListView.OnItemClickListener {
        final Context val$context;
        final Theme.ResourcesProvider val$resourcesProvider;

        AnonymousClass2(Theme.ResourcesProvider resourcesProvider, Context context) {
            this.val$resourcesProvider = resourcesProvider;
            this.val$context = context;
        }

        @Override
        public void onItemClick(View view, int i) {
            TLRPC.TL_help_country tL_help_country;
            boolean z = false;
            if (i == 0 || (tL_help_country = (TLRPC.TL_help_country) CountrySelectBottomSheet.this.adapter.getItem(i - 1).object) == null) {
                return;
            }
            if (CountrySelectBottomSheet.this.selectedCountries.containsKey(tL_help_country.iso2)) {
                CountrySelectBottomSheet.this.spansContainer.removeSpan((GroupCreateSpan) CountrySelectBottomSheet.this.selectedCountries.remove(tL_help_country.iso2));
            } else {
                if (CountrySelectBottomSheet.this.selectedCountries.size() >= CountrySelectBottomSheet.this.maxCountriesCount) {
                    BulletinFactory.of(CountrySelectBottomSheet.this.bulletinContainer, this.val$resourcesProvider).createSimpleBulletin(R.raw.info, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.PollV2YouCanAddXCountriesOnly, Integer.valueOf(CountrySelectBottomSheet.this.maxCountriesCount)))).show();
                    return;
                }
                GroupCreateSpan groupCreateSpan = new GroupCreateSpan(this.val$context, tL_help_country);
                final CountrySelectBottomSheet countrySelectBottomSheet = CountrySelectBottomSheet.this;
                groupCreateSpan.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        CountrySelectBottomSheet.access$700(countrySelectBottomSheet, view2);
                    }
                });
                CountrySelectBottomSheet.this.spansContainer.addSpan(groupCreateSpan);
                CountrySelectBottomSheet.this.selectedCountries.put(tL_help_country.iso2, groupCreateSpan);
                z = true;
            }
            if (view instanceof SelectorCountryCell) {
                ((SelectorCountryCell) view).setChecked(z, true);
            }
            CountrySelectBottomSheet.this.adapter.update(true);
            CountrySelectBottomSheet.this.checkUi_buttonCounter();
        }
    }

    public void lambda$new$0(View view) {
        Listener listener = this.listener;
        if (listener != null) {
            listener.onCountrySelected(new ArrayList(this.selectedCountries.keySet()));
        }
        lambda$new$0();
    }

    public void lambda$new$1(View view) {
        Listener listener = this.listener;
        if (listener != null) {
            listener.onCountrySelected(new ArrayList(this.selectedCountries.keySet()));
        }
        lambda$new$0();
    }

    public void lambda$new$3(int i) {
        int iMin = Math.min(i, AndroidUtilities.dp(144.0f));
        if (i > 0) {
            iMin -= AndroidUtilities.dp(8.0f);
        }
        if (this.selectedCountriesHeight != iMin) {
            this.selectedCountriesHeight = iMin;
            this.animatorSelectorContainerHeight.animateTo(iMin);
            this.spansContainer.postOnAnimation(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$new$2();
                }
            });
        }
    }

    public void lambda$new$2() {
        this.adapter.update(true);
    }

    public void lambda$new$4(View view) {
        this.selectedCountries.clear();
        this.spansContainer.removeAllSpans(true);
        this.adapter.update(true);
        checkUi_buttonCounter();
    }

    public WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
        processLegacyContainerInsets(windowInsetsCompat.toWindowInsets());
        this.animatorTopSaveButtonVisibility.setValue(windowInsetsCompat.getInsets(WindowInsetsCompat.Type.ime()).bottom > 0, true);
        return WindowInsetsCompat.CONSUMED;
    }

    public void setListener(Listener listener) {
        this.listener = listener;
    }

    @Override
    protected void onContainerLayout(int i, int i2, int i3, int i4) {
        super.onContainerLayout(i, i2, i3, i4);
        checkUi_listViewClip();
        checkUi_searchFieldY();
    }

    private void loadCountries() {
        BoostRepository.loadCountriesForPolls(new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$loadCountries$6((Pair) obj);
            }
        });
    }

    public void lambda$loadCountries$6(Pair pair) {
        this.countriesMap.putAll((Map) pair.first);
        this.countriesLetters.addAll((Collection) pair.second);
        j$.util.Map.EL.forEach(this.countriesMap, new BiConsumer() {
            @Override
            public final void accept(Object obj, Object obj2) {
                this.f$0.lambda$loadCountries$5((String) obj, (List) obj2);
            }

            public BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        });
        Set set = this.countriesToSelect;
        if (set != null) {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                TLRPC.TL_help_country tL_help_countryFindCountry = findCountry((String) it.next());
                if (tL_help_countryFindCountry != null) {
                    GroupCreateSpan groupCreateSpan = new GroupCreateSpan(getContext(), tL_help_countryFindCountry);
                    groupCreateSpan.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public final void onClick(View view) {
                            this.f$0.onSpanClick(view);
                        }
                    });
                    this.spansContainer.addSpan(groupCreateSpan);
                    this.selectedCountries.put(tL_help_countryFindCountry.iso2, groupCreateSpan);
                }
            }
        }
        this.adapter.update(true);
        checkUi_buttonCounter();
    }

    public void lambda$loadCountries$5(String str, List list) {
        this.countriesList.addAll(list);
    }

    public void prepare(List list) {
        this.query = null;
        this.countriesToSelect = new HashSet(list);
    }

    private boolean isSearching() {
        return !TextUtils.isEmpty(this.query);
    }

    public void checkUi_listViewClip() {
        int currentActionBarHeight = AndroidUtilities.statusBarHeight + ActionBar.getCurrentActionBarHeight() + AndroidUtilities.dp(56.0f) + ((int) this.animatorSelectorContainerHeight.getFactor());
        int measuredHeight = (this.containerView.getMeasuredHeight() - AndroidUtilities.navigationBarHeight) - AndroidUtilities.dp(34.0f);
        Rect rect = this.listViewClipBounds;
        boolean z = (rect.top == currentActionBarHeight && rect.bottom == measuredHeight) ? false : true;
        rect.set(0, currentActionBarHeight, this.containerView.getMeasuredWidth(), measuredHeight);
        this.recyclerListView.setClipBounds(this.listViewClipBounds);
        if (z) {
            this.recyclerListView.invalidate();
        }
    }

    public void checkUi_searchFieldY() {
        float y = AndroidUtilities.displaySize.y;
        for (int i = 0; i < this.recyclerListView.getChildCount(); i++) {
            View childAt = this.recyclerListView.getChildAt(i);
            if (this.recyclerListView.getChildAdapterPosition(childAt) >= 1 && childAt.getY() < y) {
                y = childAt.getY();
            }
        }
        float fMax = Math.max(AndroidUtilities.statusBarHeight + ActionBar.getCurrentActionBarHeight(), y + AndroidUtilities.dp(8.0f));
        if (this.searchContainer.getTranslationY() != fMax) {
            this.searchContainer.setTranslationY(fMax);
            this.recyclerListView.invalidate();
        }
    }

    @Override
    protected CharSequence getTitle() {
        return LocaleController.getString(R.string.BoostingSelectCountry);
    }

    @Override
    protected RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                this.f$0.fillItems((ArrayList) obj, (UniversalAdapter) obj2);
            }
        }, this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        return this.adapter;
    }

    public void onSpanClick(View view) {
        GroupCreateSpan groupCreateSpan = (GroupCreateSpan) view;
        if (groupCreateSpan.isDeleting()) {
            this.currentDeletingSpan = null;
            this.spansContainer.removeSpan(groupCreateSpan);
            this.selectedCountries.remove(groupCreateSpan.getCountryIso2());
            checkUi_buttonCounter();
            this.adapter.update(true);
            return;
        }
        GroupCreateSpan groupCreateSpan2 = this.currentDeletingSpan;
        if (groupCreateSpan2 != null) {
            groupCreateSpan2.cancelDeleteAnimation();
        }
        this.currentDeletingSpan = groupCreateSpan;
        groupCreateSpan.startDeleteAnimation();
    }

    private TLRPC.TL_help_country findCountry(String str) {
        Iterator it = this.countriesLetters.iterator();
        while (it.hasNext()) {
            for (TLRPC.TL_help_country tL_help_country : (List) this.countriesMap.get((String) it.next())) {
                if (TextUtils.equals(str, tL_help_country.iso2)) {
                    return tL_help_country;
                }
            }
        }
        return null;
    }

    public void fillItems(ArrayList arrayList, UniversalAdapter universalAdapter) {
        List list = this.countriesLetters;
        if (list == null || list.isEmpty()) {
            return;
        }
        int currentActionBarHeight = ((AndroidUtilities.displaySize.y - ActionBar.getCurrentActionBarHeight()) - AndroidUtilities.dp(68.0f)) + AndroidUtilities.dp(13.0f);
        int iDp = AndroidUtilities.dp(88.0f) + this.selectedCountriesHeight;
        arrayList.add(UItem.asSpace(0, iDp));
        int iDp2 = currentActionBarHeight - iDp;
        Iterator it = this.countriesLetters.iterator();
        while (it.hasNext()) {
            for (TLRPC.TL_help_country tL_help_country : (List) this.countriesMap.get((String) it.next())) {
                if (!isSearching() || SelectorBottomSheet.matchLocal(tL_help_country, AndroidUtilities.translitSafe(this.query).toLowerCase())) {
                    iDp2 -= AndroidUtilities.dp(44.0f);
                    arrayList.add(Factory.asCountry(tL_help_country, this.selectedCountries.containsKey(tL_help_country.iso2)));
                }
            }
        }
        arrayList.add(UItem.asSpace(1, Math.max(0, iDp2)));
    }

    public void checkUi_buttonCounter() {
        this.button.setCount(this.selectedCountries.size(), true);
    }

    public static class Factory extends UItem.UItemFactory {
        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public SelectorCountryCell createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            SelectorCountryCell selectorCountryCell = new SelectorCountryCell(context, resourcesProvider);
            selectorCountryCell.setBackground(null);
            return selectorCountryCell;
        }

        @Override
        public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            SelectorCountryCell selectorCountryCell = (SelectorCountryCell) view;
            selectorCountryCell.setCountry((TLRPC.TL_help_country) uItem.object, z);
            selectorCountryCell.setChecked(uItem.checked, false);
        }

        public static UItem asCountry(TLRPC.TL_help_country tL_help_country, boolean z) {
            UItem uItemOfFactory = UItem.ofFactory(Factory.class);
            uItemOfFactory.text = tL_help_country.iso2;
            uItemOfFactory.object = tL_help_country;
            uItemOfFactory.checked = z;
            return uItemOfFactory;
        }

        @Override
        public boolean equals(UItem uItem, UItem uItem2) {
            return super.equals(uItem, uItem2);
        }

        @Override
        public boolean contentsEquals(UItem uItem, UItem uItem2) {
            return super.contentsEquals(uItem, uItem2);
        }
    }

    @Override
    public void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 3) {
            checkUi_listViewClip();
            this.graySectionCell.setTranslationY(AndroidUtilities.dp(48.0f) + f);
            this.searchContainer.invalidate();
        } else if (i == 4) {
            FragmentFloatingButton.setAnimatedVisibility(this.doneItem, f);
        }
    }
}
