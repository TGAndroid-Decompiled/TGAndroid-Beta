package org.telegram.p009ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Timer;
import java.util.TimerTask;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.C1072R;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.p009ui.ActionBar.ActionBarMenuItem;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.C1133ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ActionBar.ThemeDescription;
import org.telegram.p009ui.Cells.DividerCell;
import org.telegram.p009ui.Cells.LetterSectionCell;
import org.telegram.p009ui.Cells.TextSettingsCell;
import org.telegram.p009ui.Components.EmptyTextProgressView;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.p009ui.CountrySelectActivity;

public class CountrySelectActivity extends BaseFragment {
    private CountrySelectActivityDelegate delegate;
    private EmptyTextProgressView emptyView;
    private ArrayList<Country> existingCountries;
    private RecyclerListView listView;
    private CountryAdapter listViewAdapter;
    private boolean needPhoneCode;
    private CountrySearchAdapter searchListViewAdapter;
    private boolean searchWas;
    private boolean searching;

    public interface CountrySelectActivityDelegate {
        void didSelectCountry(Country country);
    }

    public CountrySelectActivity(boolean z) {
        this(z, null);
    }

    public CountrySelectActivity(boolean z, ArrayList<Country> arrayList) {
        if (arrayList != null && !arrayList.isEmpty()) {
            this.existingCountries = new ArrayList<>(arrayList);
        }
        this.needPhoneCode = z;
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
    public boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor("windowBackgroundWhite", null, true)) > 0.699999988079071d;
    }

    @Override
    public View createView(Context context) {
        this.actionBar.setBackButtonImage(C1072R.C1073drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString("ChooseCountry", C1072R.string.ChooseCountry));
        this.actionBar.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
        this.actionBar.setItemsColor(Theme.getColor("windowBackgroundWhiteBlackText"), false);
        this.actionBar.setItemsBackgroundColor(Theme.getColor("actionBarWhiteSelector"), false);
        this.actionBar.setTitleColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        this.actionBar.setActionBarMenuOnItemClick(new C1133ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    CountrySelectActivity.this.finishFragment();
                }
            }
        });
        this.actionBar.createMenu().addItem(0, C1072R.C1073drawable.ic_ab_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
            @Override
            public void onSearchExpand() {
                CountrySelectActivity.this.searching = true;
            }

            @Override
            public void onSearchCollapse() {
                CountrySelectActivity.this.searchListViewAdapter.search(null);
                CountrySelectActivity.this.searching = false;
                CountrySelectActivity.this.searchWas = false;
                CountrySelectActivity.this.listView.setAdapter(CountrySelectActivity.this.listViewAdapter);
                CountrySelectActivity.this.listView.setFastScrollVisible(true);
            }

            @Override
            public void onTextChanged(EditText editText) {
                String obj = editText.getText().toString();
                if (TextUtils.isEmpty(obj)) {
                    CountrySelectActivity.this.searchListViewAdapter.search(null);
                    CountrySelectActivity.this.searchWas = false;
                    CountrySelectActivity.this.listView.setAdapter(CountrySelectActivity.this.listViewAdapter);
                    CountrySelectActivity.this.listView.setFastScrollVisible(true);
                    return;
                }
                CountrySelectActivity.this.searchListViewAdapter.search(obj);
                if (obj.length() != 0) {
                    CountrySelectActivity.this.searchWas = true;
                }
            }
        }).setSearchFieldHint(LocaleController.getString("Search", C1072R.string.Search));
        this.actionBar.setSearchTextColor(Theme.getColor("windowBackgroundWhiteGrayText"), true);
        this.actionBar.setSearchTextColor(Theme.getColor("windowBackgroundWhiteBlackText"), false);
        this.actionBar.setSearchCursorColor(Theme.getColor("windowBackgroundWhiteBlackText"));
        this.searching = false;
        this.searchWas = false;
        CountryAdapter countryAdapter = new CountryAdapter(context, this.existingCountries);
        this.listViewAdapter = countryAdapter;
        this.searchListViewAdapter = new CountrySearchAdapter(context, countryAdapter.getCountries());
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        FrameLayout frameLayout2 = frameLayout;
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context);
        this.emptyView = emptyTextProgressView;
        emptyTextProgressView.showTextView();
        this.emptyView.setShowAtCenter(true);
        this.emptyView.setText(LocaleController.getString("NoResult", C1072R.string.NoResult));
        frameLayout2.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setSectionsType(3);
        this.listView.setEmptyView(this.emptyView);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setFastScrollEnabled(0);
        this.listView.setFastScrollVisible(true);
        this.listView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.listView.setAdapter(this.listViewAdapter);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                CountrySelectActivity.this.lambda$createView$0(view, i);
            }
        });
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i == 1) {
                    AndroidUtilities.hideKeyboard(CountrySelectActivity.this.getParentActivity().getCurrentFocus());
                }
            }
        });
        return this.fragmentView;
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
            }
            item = this.listViewAdapter.getItem(sectionForPosition, positionInSectionForPosition);
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

    public static class Country {
        public String code;
        public String name;
        public String shortname;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || Country.class != obj.getClass()) {
                return false;
            }
            Country country = (Country) obj;
            return Objects.equals(this.name, country.name) && Objects.equals(this.code, country.code);
        }

        public int hashCode() {
            return Objects.hash(this.name, this.code);
        }
    }

    public class CountryAdapter extends RecyclerListView.SectionsAdapter {
        private Context mContext;
        private HashMap<String, ArrayList<Country>> countries = new HashMap<>();
        private ArrayList<String> sortedCountries = new ArrayList<>();

        @Override
        public View getSectionHeaderView(int i, View view) {
            return null;
        }

        public CountryAdapter(Context context, ArrayList<Country> arrayList) {
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
                    InputStream open = ApplicationLoader.applicationContext.getResources().getAssets().open("countries.txt");
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(open));
                    while (true) {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        String[] split = readLine.split(";");
                        Country country2 = new Country();
                        String str = split[2];
                        country2.name = str;
                        country2.code = split[0];
                        country2.shortname = split[1];
                        String upperCase2 = str.substring(0, 1).toUpperCase();
                        ArrayList<Country> arrayList3 = this.countries.get(upperCase2);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList<>();
                            this.countries.put(upperCase2, arrayList3);
                            this.sortedCountries.add(upperCase2);
                        }
                        arrayList3.add(country2);
                    }
                    bufferedReader.close();
                    open.close();
                } catch (Exception e) {
                    FileLog.m31e(e);
                }
            }
            Collections.sort(this.sortedCountries, CountrySelectActivity$CountryAdapter$$ExternalSyntheticLambda0.INSTANCE);
            for (ArrayList<Country> arrayList4 : this.countries.values()) {
                Collections.sort(arrayList4, CountrySelectActivity$CountryAdapter$$ExternalSyntheticLambda1.INSTANCE);
            }
        }

        public static int lambda$new$0(Country country, Country country2) {
            return country.name.compareTo(country2.name);
        }

        public HashMap<String, ArrayList<Country>> getCountries() {
            return this.countries;
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

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder, int i, int i2) {
            return i2 < this.countries.get(this.sortedCountries.get(i)).size();
        }

        @Override
        public int getSectionCount() {
            return this.sortedCountries.size();
        }

        @Override
        public int getCountForSection(int i) {
            int size = this.countries.get(this.sortedCountries.get(i)).size();
            return i != this.sortedCountries.size() + (-1) ? size + 1 : size;
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View createSettingsCell;
            if (i == 0) {
                createSettingsCell = CountrySelectActivity.createSettingsCell(this.mContext);
            } else {
                createSettingsCell = new DividerCell(this.mContext);
                createSettingsCell.setPadding(AndroidUtilities.m35dp(24.0f), AndroidUtilities.m35dp(8.0f), AndroidUtilities.m35dp(24.0f), AndroidUtilities.m35dp(8.0f));
            }
            return new RecyclerListView.Holder(createSettingsCell);
        }

        @Override
        public void onBindViewHolder(int i, int i2, RecyclerView.ViewHolder viewHolder) {
            String str;
            if (viewHolder.getItemViewType() == 0) {
                Country country = this.countries.get(this.sortedCountries.get(i)).get(i2);
                TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
                CharSequence replaceEmoji = Emoji.replaceEmoji(CountrySelectActivity.getCountryNameWithFlag(country), textSettingsCell.getTextView().getPaint().getFontMetricsInt(), AndroidUtilities.m35dp(20.0f), false);
                if (CountrySelectActivity.this.needPhoneCode) {
                    str = "+" + country.code;
                } else {
                    str = null;
                }
                textSettingsCell.setTextAndValue(replaceEmoji, str, false);
            }
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
    }

    public class CountrySearchAdapter extends RecyclerListView.SelectionAdapter {
        private List<Country> countryList = new ArrayList();
        private Map<Country, List<String>> countrySearchMap = new HashMap();
        private Context mContext;
        private ArrayList<Country> searchResult;
        private Timer searchTimer;

        @Override
        public int getItemViewType(int i) {
            return 0;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        public CountrySearchAdapter(Context context, HashMap<String, ArrayList<Country>> hashMap) {
            this.mContext = context;
            for (ArrayList<Country> arrayList : hashMap.values()) {
                for (Country country : arrayList) {
                    this.countryList.add(country);
                    this.countrySearchMap.put(country, Arrays.asList(country.name.split(" ")));
                }
            }
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
                FileLog.m31e(e);
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
                        FileLog.m31e(e2);
                    }
                    CountrySearchAdapter.this.processSearch(str);
                }
            }, 100L, 300L);
        }

        public void processSearch(final String str) {
            Utilities.searchQueue.postRunnable(new Runnable() {
                @Override
                public final void run() {
                    CountrySelectActivity.CountrySearchAdapter.this.lambda$processSearch$0(str);
                }
            });
        }

        public void lambda$processSearch$0(String str) {
            String lowerCase = str.trim().toLowerCase();
            if (lowerCase.length() == 0) {
                updateSearchResults(new ArrayList<>());
                return;
            }
            ArrayList<Country> arrayList = new ArrayList<>();
            for (Country country : this.countryList) {
                Iterator<String> it = this.countrySearchMap.get(country).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (it.next().toLowerCase().startsWith(lowerCase)) {
                            arrayList.add(country);
                            break;
                        }
                    } else {
                        break;
                    }
                }
            }
            updateSearchResults(arrayList);
        }

        private void updateSearchResults(final ArrayList<Country> arrayList) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    CountrySelectActivity.CountrySearchAdapter.this.lambda$updateSearchResults$1(arrayList);
                }
            });
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

        @Override
        public int getItemCount() {
            ArrayList<Country> arrayList = this.searchResult;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }

        public Country getItem(int i) {
            if (i < 0 || i >= this.searchResult.size()) {
                return null;
            }
            return this.searchResult.get(i);
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RecyclerListView.Holder(CountrySelectActivity.createSettingsCell(this.mContext));
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String str;
            Country country = this.searchResult.get(i);
            TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
            CharSequence replaceEmoji = Emoji.replaceEmoji(CountrySelectActivity.getCountryNameWithFlag(country), textSettingsCell.getTextView().getPaint().getFontMetricsInt(), AndroidUtilities.m35dp(20.0f), false);
            if (CountrySelectActivity.this.needPhoneCode) {
                str = "+" + country.code;
            } else {
                str = null;
            }
            textSettingsCell.setTextAndValue(replaceEmoji, str, false);
        }
    }

    public static TextSettingsCell createSettingsCell(Context context) {
        TextSettingsCell textSettingsCell = new TextSettingsCell(context);
        textSettingsCell.setPadding(AndroidUtilities.m35dp(LocaleController.isRTL ? 16.0f : 12.0f), 0, AndroidUtilities.m35dp(LocaleController.isRTL ? 12.0f : 16.0f), 0);
        textSettingsCell.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC31284(textSettingsCell));
        return textSettingsCell;
    }

    public class View$OnAttachStateChangeListenerC31284 implements View.OnAttachStateChangeListener {
        private NotificationCenter.NotificationCenterDelegate listener;
        final TextSettingsCell val$view;

        View$OnAttachStateChangeListenerC31284(final TextSettingsCell textSettingsCell) {
            this.val$view = textSettingsCell;
            this.listener = new NotificationCenter.NotificationCenterDelegate() {
                @Override
                public final void didReceivedNotification(int i, int i2, Object[] objArr) {
                    CountrySelectActivity.View$OnAttachStateChangeListenerC31284.lambda$$0(TextSettingsCell.this, i, i2, objArr);
                }
            };
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
                    return AndroidUtilities.m35dp(16.0f);
                }
            }, languageFlag.length(), languageFlag.length() + 1, 0);
        }
        spannableStringBuilder.append((CharSequence) country.name);
        return spannableStringBuilder;
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, "actionBarDefaultIcon"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, "actionBarDefaultTitle"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "actionBarDefaultSelector"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCH, null, null, null, null, "actionBarDefaultSearch"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCHPLACEHOLDER, null, null, null, null, "actionBarDefaultSearchPlaceholder"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, "listSelectorSDK21"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, "divider"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_FASTSCROLL, null, null, null, null, "fastScrollActive"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_FASTSCROLL, null, null, null, null, "fastScrollInactive"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_FASTSCROLL, null, null, null, null, "fastScrollText"));
        arrayList.add(new ThemeDescription(this.emptyView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "emptyListPlaceholder"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{TextSettingsCell.class}, new String[]{"valueTextView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteValueText"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SECTIONS, new Class[]{LetterSectionCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText4"));
        return arrayList;
    }
}
