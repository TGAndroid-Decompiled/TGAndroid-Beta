package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_language_id_common.zzii;
import j$.util.Objects;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SavedMessagesController$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuItem;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.ThemeDescription;
import org.telegram.ui.Cells.DividerCell;
import org.telegram.ui.Cells.LetterSectionCell;
import org.telegram.ui.Cells.TextSettingsCell;
import org.telegram.ui.Components.EmptyTextProgressView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Storage.CacheModel$$ExternalSyntheticLambda0;
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda0;

public class CountrySelectActivity extends BaseFragment {
    private CountrySelectActivityDelegate delegate;
    private boolean disableAnonymousNumbers;
    private EmptyTextProgressView emptyView;
    private ArrayList<Country> existingCountries;
    private RecyclerListView listView;
    private CountryAdapter listViewAdapter;
    private boolean needPhoneCode;
    private CountrySearchAdapter searchListViewAdapter;
    private boolean searchWas;
    private boolean searching;

    public class AnonymousClass4 implements View.OnAttachStateChangeListener {
        private NotificationCenter.NotificationCenterDelegate listener;
        final TextSettingsCell val$view;

        public AnonymousClass4(TextSettingsCell textSettingsCell) {
            this.val$view = textSettingsCell;
            this.listener = new CountrySelectActivity$4$$ExternalSyntheticLambda0(textSettingsCell, 0);
        }

        public static void lambda$$0(TextSettingsCell textSettingsCell, int i, int i2, Object[] objArr) {
            if (i == NotificationCenter.emojiLoaded) {
                textSettingsCell.getTextView().invalidate();
            }
        }

        @Override
        public void onViewAttachedToWindow(View view) {
            NotificationCenter.getGlobalInstance().addObserver(this.listener, NotificationCenter.emojiLoaded);
        }

        @Override
        public void onViewDetachedFromWindow(View view) {
            NotificationCenter.getGlobalInstance().removeObserver(this.listener, NotificationCenter.emojiLoaded);
        }
    }

    public static class Country {
        public String code;
        public String defaultName;
        public String name;
        public String shortname;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                Country country = (Country) obj;
                if (Objects.equals(this.name, country.name) && Objects.equals(this.code, country.code)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hash(this.name, this.code);
        }
    }

    public class CountryAdapter extends RecyclerListView.SectionsAdapter {
        private static final int TYPE_COUNTRY = 0;
        private static final int TYPE_DIVIDER = 1;
        private Context mContext;
        private HashMap<String, ArrayList<Country>> countries = new HashMap<>();
        private ArrayList<String> sortedCountries = new ArrayList<>();

        public CountryAdapter(Context context, ArrayList<Country> arrayList, boolean z) {
            Comparator cacheModel$$ExternalSyntheticLambda0;
            this.mContext = context;
            if (arrayList != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    Country country = arrayList.get(i);
                    String upperCase = country.name.substring(0, 1).toUpperCase();
                    ArrayList<Country> arrayList2 = this.countries.get(upperCase);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList<>();
                        this.countries.put(upperCase, arrayList2);
                        this.sortedCountries.add(upperCase);
                    }
                    arrayList2.add(country);
                }
            } else {
                try {
                    InputStream inputStreamOpen = ApplicationLoader.applicationContext.getResources().getAssets().open("countries.txt");
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen));
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        String[] strArrSplit = line.split(";");
                        Country country2 = new Country();
                        country2.name = strArrSplit[2];
                        country2.code = strArrSplit[0];
                        String str = strArrSplit[1];
                        country2.shortname = str;
                        if (!str.equals("FT") || !z) {
                            String upperCase2 = country2.name.substring(0, 1).toUpperCase();
                            ArrayList<Country> arrayList3 = this.countries.get(upperCase2);
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList<>();
                                this.countries.put(upperCase2, arrayList3);
                                this.sortedCountries.add(upperCase2);
                            }
                            arrayList3.add(country2);
                        }
                    }
                    bufferedReader.close();
                    inputStreamOpen.close();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                Collator collator = Collator.getInstance(LocaleController.getInstance().getCurrentLocale() != null ? LocaleController.getInstance().getCurrentLocale() : Locale.getDefault());
                Objects.requireNonNull(collator);
                cacheModel$$ExternalSyntheticLambda0 = new TableModel$$ExternalSyntheticLambda0(collator, 4);
            } else {
                cacheModel$$ExternalSyntheticLambda0 = new CacheModel$$ExternalSyntheticLambda0(4);
            }
            Collections.sort(this.sortedCountries, cacheModel$$ExternalSyntheticLambda0);
            Iterator<ArrayList<Country>> it = this.countries.values().iterator();
            while (it.hasNext()) {
                Collections.sort(it.next(), new StickersActivity$$ExternalSyntheticLambda10(cacheModel$$ExternalSyntheticLambda0, 1));
            }
        }

        public static int lambda$new$0(Comparator comparator, Country country, Country country2) {
            return comparator.compare(country.name, country2.name);
        }

        @Override
        public int getCountForSection(int i) {
            int size = this.countries.get(this.sortedCountries.get(i)).size();
            return i != this.sortedCountries.size() + (-1) ? size + 1 : size;
        }

        public HashMap<String, ArrayList<Country>> getCountries() {
            return this.countries;
        }

        @Override
        public int getItemViewType(int i, int i2) {
            return i2 < this.countries.get(this.sortedCountries.get(i)).size() ? 0 : 1;
        }

        @Override
        public String getLetter(int i) {
            int sectionForPosition = getSectionForPosition(i);
            if (sectionForPosition == -1) {
                sectionForPosition = this.sortedCountries.size() - 1;
            }
            return this.sortedCountries.get(sectionForPosition);
        }

        @Override
        public void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            iArr[0] = (int) (getItemCount() * f);
            iArr[1] = 0;
        }

        @Override
        public int getSectionCount() {
            return this.sortedCountries.size();
        }

        @Override
        public View getSectionHeaderView(int i, View view) {
            return null;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder, int i, int i2) {
            return i2 < this.countries.get(this.sortedCountries.get(i)).size();
        }

        @Override
        public void onBindViewHolder(int i, int i2, RecyclerView.ViewHolder viewHolder) {
            String str;
            if (viewHolder.getItemViewType() == 0) {
                Country country = this.countries.get(this.sortedCountries.get(i)).get(i2);
                TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
                CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(CountrySelectActivity.getCountryNameWithFlag(country), textSettingsCell.getTextView().getPaint().getFontMetricsInt(), false);
                if (CountrySelectActivity.this.needPhoneCode) {
                    str = "+" + country.code;
                } else {
                    str = null;
                }
                textSettingsCell.setTextAndValue(charSequenceReplaceEmoji, str, false, false);
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View viewCreateSettingsCell;
            if (i != 0) {
                viewCreateSettingsCell = new DividerCell(this.mContext, null);
                viewCreateSettingsCell.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f));
            } else {
                viewCreateSettingsCell = CountrySelectActivity.createSettingsCell(this.mContext);
            }
            return new RecyclerListView.Holder(viewCreateSettingsCell);
        }

        @Override
        public Country getItem(int i, int i2) {
            if (i >= 0 && i < this.sortedCountries.size()) {
                ArrayList<Country> arrayList = this.countries.get(this.sortedCountries.get(i));
                if (i2 >= 0 && i2 < arrayList.size()) {
                    return arrayList.get(i2);
                }
            }
            return null;
        }
    }

    public class CountrySearchAdapter extends RecyclerListView.SelectionAdapter {
        private List<Country> countryList = new ArrayList();
        private Context mContext;
        private ArrayList<Country> searchResult;
        private Timer searchTimer;

        public CountrySearchAdapter(Context context, HashMap<String, ArrayList<Country>> map) {
            this.mContext = context;
            Iterator<ArrayList<Country>> it = map.values().iterator();
            while (it.hasNext()) {
                Iterator<Country> it2 = it.next().iterator();
                while (it2.hasNext()) {
                    this.countryList.add(it2.next());
                }
            }
        }

        public void lambda$processSearch$0(String str) {
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                updateSearchResults(new ArrayList<>());
                return;
            }
            String strTranslitSafe = AndroidUtilities.translitSafe(lowerCase);
            ArrayList<Country> arrayList = new ArrayList<>();
            for (Country country : this.countryList) {
                String str2 = country.name;
                if (str2 == null) {
                    str2 = "";
                }
                String lowerCase2 = str2.toLowerCase();
                String lowerCase3 = AndroidUtilities.translitSafe(country.name).toLowerCase();
                String str3 = country.defaultName;
                if (str3 == null) {
                    str3 = "";
                }
                String lowerCase4 = str3.toLowerCase();
                String lowerCase5 = AndroidUtilities.translitSafe(country.defaultName).toLowerCase();
                String str4 = country.code;
                if (str4 == null) {
                    str4 = "";
                }
                String strM = TextUtils.isEmpty(str4) ? "" : zzii.m("+", str4);
                if (lowerCase2.startsWith(lowerCase) || lowerCase2.contains(" ".concat(lowerCase)) || lowerCase3.startsWith(strTranslitSafe) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", strTranslitSafe, lowerCase3) || lowerCase4.startsWith(lowerCase) || lowerCase4.contains(" ".concat(lowerCase)) || lowerCase5.startsWith(strTranslitSafe) || SavedMessagesController$$ExternalSyntheticOutline0.m(" ", strTranslitSafe, lowerCase5) || str4.startsWith(lowerCase) || strM.startsWith(lowerCase)) {
                    arrayList.add(country);
                }
            }
            updateSearchResults(arrayList);
        }

        public void lambda$updateSearchResults$1(ArrayList arrayList) {
            if (CountrySelectActivity.this.searching) {
                this.searchResult = arrayList;
                if (CountrySelectActivity.this.searchWas && CountrySelectActivity.this.listView != null && CountrySelectActivity.this.listView.getAdapter() != CountrySelectActivity.this.searchListViewAdapter) {
                    CountrySelectActivity.this.listView.setAdapter(CountrySelectActivity.this.searchListViewAdapter);
                    CountrySelectActivity.this.listView.setFastScrollVisible(false);
                }
                notifyDataSetChanged();
            }
        }

        public void processSearch(String str) {
            Utilities.searchQueue.postRunnable(new ChatActivity$$ExternalSyntheticLambda80(24, this, str));
        }

        private void updateSearchResults(ArrayList<Country> arrayList) {
            AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda80(25, this, arrayList));
        }

        public Country getItem(int i) {
            ArrayList<Country> arrayList = this.searchResult;
            if (arrayList == null || i < 0 || i >= arrayList.size()) {
                return null;
            }
            return this.searchResult.get(i);
        }

        @Override
        public int getItemCount() {
            ArrayList<Country> arrayList = this.searchResult;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }

        @Override
        public int getItemViewType(int i) {
            return 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String str;
            Country country = this.searchResult.get(i);
            TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(CountrySelectActivity.getCountryNameWithFlag(country), textSettingsCell.getTextView().getPaint().getFontMetricsInt(), false);
            if (CountrySelectActivity.this.needPhoneCode) {
                str = "+" + country.code;
            } else {
                str = null;
            }
            textSettingsCell.setTextAndValue(charSequenceReplaceEmoji, str, false, false);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RecyclerListView.Holder(CountrySelectActivity.createSettingsCell(this.mContext));
        }

        public void search(final String str) {
            if (str == null) {
                this.searchResult = null;
                return;
            }
            try {
                Timer timer = this.searchTimer;
                if (timer != null) {
                    timer.cancel();
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            Timer timer2 = new Timer();
            this.searchTimer = timer2;
            timer2.schedule(new TimerTask() {
                @Override
                public void run() {
                    try {
                        CountrySearchAdapter.this.searchTimer.cancel();
                        CountrySearchAdapter.this.searchTimer = null;
                    } catch (Exception e2) {
                        FileLog.e(e2);
                    }
                    CountrySearchAdapter.this.processSearch(str);
                }
            }, 100L, 300L);
        }
    }

    public interface CountrySelectActivityDelegate {
        void didSelectCountry(Country country);
    }

    public CountrySelectActivity(boolean z) {
        this(z, null);
    }

    public static TextSettingsCell createSettingsCell(Context context) {
        TextSettingsCell textSettingsCell = new TextSettingsCell(context, null, 0);
        textSettingsCell.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 16.0f : 12.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 12.0f : 16.0f), 0);
        textSettingsCell.addOnAttachStateChangeListener(new AnonymousClass4(textSettingsCell));
        return textSettingsCell;
    }

    public static CharSequence getCountryNameWithFlag(Country country) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String languageFlag = LocaleController.getLanguageFlag(country.shortname);
        if (languageFlag != null) {
            spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
            spannableStringBuilder.setSpan(new ReplacementSpan() {
                @Override
                public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
                }

                @Override
                public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
                    return AndroidUtilities.dp(16.0f);
                }
            }, languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) country.name);
        return spannableStringBuilder;
    }

    public void lambda$createView$0(View view, int i) {
        Country item;
        CountrySelectActivityDelegate countrySelectActivityDelegate;
        if (this.searching && this.searchWas) {
            item = this.searchListViewAdapter.getItem(i);
        } else {
            int sectionForPosition = this.listViewAdapter.getSectionForPosition(i);
            int positionInSectionForPosition = this.listViewAdapter.getPositionInSectionForPosition(i);
            if (positionInSectionForPosition < 0 || sectionForPosition < 0) {
                return;
            } else {
                item = this.listViewAdapter.getItem(sectionForPosition, positionInSectionForPosition);
            }
        }
        if (i < 0) {
            return;
        }
        finishFragment();
        if (item == null || (countrySelectActivityDelegate = this.delegate) == null) {
            return;
        }
        countrySelectActivityDelegate.didSelectCountry(item);
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseCountry));
        this.actionBar.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        actionBar.setItemsColor(Theme.getColor(null, i, false), false);
        this.actionBar.setItemsBackgroundColor(Theme.getColor(null, Theme.key_actionBarWhiteSelector, false), false);
        this.actionBar.setTitleColor(Theme.getColor(null, i, false));
        this.actionBar.setActionBarMenuOnItemClick(new ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i2) {
                if (i2 == -1) {
                    CountrySelectActivity.this.finishFragment();
                }
            }
        });
        this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
            @Override
            public void onSearchCollapse() {
                CountrySelectActivity.this.searchListViewAdapter.search(null);
                CountrySelectActivity.this.searching = false;
                CountrySelectActivity.this.searchWas = false;
                CountrySelectActivity.this.listView.setAdapter(CountrySelectActivity.this.listViewAdapter);
                CountrySelectActivity.this.listView.setFastScrollVisible(true);
            }

            @Override
            public void onSearchExpand() {
                CountrySelectActivity.this.searching = true;
            }

            @Override
            public void onTextChanged(EditText editText) {
                String string = editText.getText().toString();
                if (TextUtils.isEmpty(string)) {
                    CountrySelectActivity.this.searchListViewAdapter.search(null);
                    CountrySelectActivity.this.searchWas = false;
                    CountrySelectActivity.this.listView.setAdapter(CountrySelectActivity.this.listViewAdapter);
                    CountrySelectActivity.this.listView.setFastScrollVisible(true);
                    return;
                }
                CountrySelectActivity.this.searchListViewAdapter.search(string);
                if (string.length() != 0) {
                    CountrySelectActivity.this.searchWas = true;
                }
            }
        }).setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.actionBar.setSearchTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText, false), true);
        this.actionBar.setSearchTextColor(Theme.getColor(null, i, false), false);
        this.actionBar.setSearchCursorColor(Theme.getColor(null, i, false));
        this.searching = false;
        this.searchWas = false;
        CountryAdapter countryAdapter = new CountryAdapter(context, this.existingCountries, this.disableAnonymousNumbers);
        this.listViewAdapter = countryAdapter;
        this.searchListViewAdapter = new CountrySearchAdapter(context, countryAdapter.getCountries());
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context);
        this.emptyView = emptyTextProgressView;
        emptyTextProgressView.showTextView();
        this.emptyView.setShowAtCenter(true);
        this.emptyView.setText(LocaleController.getString(R.string.NoResult));
        frameLayout.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setSectionsType(3);
        this.listView.setEmptyView(this.emptyView);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setFastScrollEnabled(0);
        this.listView.setFastScrollVisible(true);
        CacheChatsExceptionsFragment$$ExternalSyntheticOutline0.m(1, this.listView, false);
        this.listView.setAdapter(this.listViewAdapter);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda100(this, 12));
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i2) {
                if (i2 == 1) {
                    AndroidUtilities.hideKeyboard(CountrySelectActivity.this.getParentActivity().getCurrentFocus());
                }
            }
        });
        return this.fragmentView;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.fragmentView, 1, null, null, null, null, Theme.key_windowBackgroundWhite));
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_actionBarDefault;
        arrayList.add(new ThemeDescription(actionBar, 1, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.listView, 32768, null, null, null, null, i));
        arrayList.add(new ThemeDescription(this.actionBar, 64, null, null, null, null, Theme.key_actionBarDefaultIcon));
        arrayList.add(new ThemeDescription(this.actionBar, 128, null, null, null, null, Theme.key_actionBarDefaultTitle));
        arrayList.add(new ThemeDescription(this.actionBar, 256, null, null, null, null, Theme.key_actionBarDefaultSelector));
        arrayList.add(new ThemeDescription(this.actionBar, 134217728, null, null, null, null, Theme.key_actionBarDefaultSearch));
        arrayList.add(new ThemeDescription(this.actionBar, 67108864, null, null, null, null, Theme.key_actionBarDefaultSearchPlaceholder));
        arrayList.add(new ThemeDescription(this.listView, 4096, null, null, null, null, Theme.key_listSelector));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, Theme.key_divider));
        arrayList.add(new ThemeDescription(this.listView, 33554432, null, null, null, null, Theme.key_fastScrollActive));
        arrayList.add(new ThemeDescription(this.listView, 33554432, null, null, null, null, Theme.key_fastScrollInactive));
        arrayList.add(new ThemeDescription(this.listView, 33554432, null, null, null, null, Theme.key_fastScrollText));
        arrayList.add(new ThemeDescription(this.emptyView, 4, null, null, null, null, Theme.key_emptyListPlaceholder));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteBlackText));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteValueText));
        arrayList.add(new ThemeDescription(this.listView, 524288, new Class[]{LetterSectionCell.class}, new String[]{"textView"}, null, null, -1, null, Theme.key_windowBackgroundWhiteGrayText4));
        return arrayList;
    }

    @Override
    public boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor(null, Theme.key_windowBackgroundWhite, true)) > 0.699999988079071d;
    }

    @Override
    public boolean onFragmentCreate() {
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
    }

    @Override
    public void onResume() {
        super.onResume();
        CountryAdapter countryAdapter = this.listViewAdapter;
        if (countryAdapter != null) {
            countryAdapter.notifyDataSetChanged();
        }
    }

    public void setCountrySelectActivityDelegate(CountrySelectActivityDelegate countrySelectActivityDelegate) {
        this.delegate = countrySelectActivityDelegate;
    }

    public void setDisableAnonymousNumbers(boolean z) {
        this.disableAnonymousNumbers = z;
    }

    public CountrySelectActivity(boolean z, ArrayList<Country> arrayList) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.existingCountries = new ArrayList<>(arrayList);
        }
        this.needPhoneCode = z;
    }
}
