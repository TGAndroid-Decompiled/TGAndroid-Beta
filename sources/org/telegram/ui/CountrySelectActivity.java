package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.text.SpannableStringBuilder;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzku;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
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
import org.telegram.ui.iv.TableModel$$ExternalSyntheticLambda0;

public final class CountrySelectActivity extends BaseFragment {
    public CountrySelectActivityDelegate delegate;
    public boolean disableAnonymousNumbers;
    public EmptyTextProgressView emptyView;
    public final ArrayList existingCountries;
    public RecyclerListView listView;
    public CountryAdapter listViewAdapter;
    public final boolean needPhoneCode;
    public CountrySearchAdapter searchListViewAdapter;
    public boolean searchWas;
    public boolean searching;

    public final class AnonymousClass5 extends ReplacementSpan {
        public final int $r8$classId;

        public AnonymousClass5(int i) {
            this.$r8$classId = i;
        }

        @Override
        public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            int i6 = this.$r8$classId;
        }

        @Override
        public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            switch (this.$r8$classId) {
                case 0:
                    return AndroidUtilities.dp(16.0f);
                case 1:
                    return (int) paint.measureText(charSequence, i, i2);
                case 2:
                    return AndroidUtilities.dp(12.0f);
                case 3:
                    return AndroidUtilities.dp(12.0f);
                default:
                    return AndroidUtilities.dp(16.0f);
            }
        }

        public AnonymousClass5(boolean z) {
            this.$r8$classId = 1;
        }

        private final void draw$org$telegram$ui$Components$EmptyStubSpan(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        }

        private final void draw$org$telegram$ui$CountrySelectActivity$5(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        }

        private final void draw$org$telegram$ui$LoginActivity$LoginActivityEmailCodeView$2(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        }

        private final void draw$org$telegram$ui$LoginActivity$LoginActivitySetupEmail$1(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        }

        private final void draw$org$telegram$ui$LoginActivity$PhoneView$5(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        }
    }

    public final class Country {
        public String code;
        public String defaultName;
        public String name;
        public String shortname;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && Country.class == obj.getClass()) {
                Country country = (Country) obj;
                if (Objects.equals(this.name, country.name) && Objects.equals(this.code, country.code)) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return Objects.hash(this.name, this.code);
        }
    }

    public final class CountryAdapter extends RecyclerListView.SectionsAdapter {
        public final Context mContext;
        public final HashMap countries = new HashMap();
        public final ArrayList sortedCountries = new ArrayList();

        public CountryAdapter(Context context, ArrayList arrayList, boolean z) {
            Comparator chatActivity$$ExternalSyntheticLambda18;
            this.mContext = context;
            if (arrayList != null) {
                for (int i = 0; i < arrayList.size(); i++) {
                    Country country = (Country) arrayList.get(i);
                    String upperCase = country.name.substring(0, 1).toUpperCase();
                    ArrayList arrayList2 = (ArrayList) this.countries.get(upperCase);
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
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
                            ArrayList arrayList3 = (ArrayList) this.countries.get(upperCase2);
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
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
                chatActivity$$ExternalSyntheticLambda18 = new TableModel$$ExternalSyntheticLambda0(collator, 6);
            } else {
                chatActivity$$ExternalSyntheticLambda18 = new ChatActivity$$ExternalSyntheticLambda18(18);
            }
            Collections.sort(this.sortedCountries, chatActivity$$ExternalSyntheticLambda18);
            Iterator it = this.countries.values().iterator();
            while (it.hasNext()) {
                Collections.sort((ArrayList) it.next(), new CountrySelectActivity$CountryAdapter$$ExternalSyntheticLambda0(chatActivity$$ExternalSyntheticLambda18, 0));
            }
        }

        @Override
        public final int getCountForSection(int i) {
            HashMap map = this.countries;
            ArrayList arrayList = this.sortedCountries;
            int size = ((ArrayList) map.get(arrayList.get(i))).size();
            return i != arrayList.size() + (-1) ? size + 1 : size;
        }

        @Override
        public final Object getItem(int i, int i2) {
            if (i >= 0) {
                ArrayList arrayList = this.sortedCountries;
                if (i < arrayList.size()) {
                    ArrayList arrayList2 = (ArrayList) this.countries.get(arrayList.get(i));
                    if (i2 >= 0 && i2 < arrayList2.size()) {
                        return (Country) arrayList2.get(i2);
                    }
                }
            }
            return null;
        }

        @Override
        public final int getItemViewType(int i, int i2) {
            return i2 < ((ArrayList) this.countries.get(this.sortedCountries.get(i))).size() ? 0 : 1;
        }

        @Override
        public final String getLetter(int i) {
            int sectionForPosition = getSectionForPosition(i);
            ArrayList arrayList = this.sortedCountries;
            if (sectionForPosition == -1) {
                sectionForPosition = arrayList.size() - 1;
            }
            return (String) arrayList.get(sectionForPosition);
        }

        @Override
        public final void getPositionForScrollProgress(RecyclerListView recyclerListView, float f, int[] iArr) {
            iArr[0] = (int) (getItemCount() * f);
            iArr[1] = 0;
        }

        @Override
        public final int getSectionCount() {
            return this.sortedCountries.size();
        }

        @Override
        public final View getSectionHeaderView$1(int i, View view) {
            return null;
        }

        @Override
        public final boolean isEnabled(int i, int i2, RecyclerView.ViewHolder viewHolder) {
            return i2 < ((ArrayList) this.countries.get(this.sortedCountries.get(i))).size();
        }

        @Override
        public final void onBindViewHolder(int i, int i2, RecyclerView.ViewHolder viewHolder) {
            String str;
            if (viewHolder.mItemViewType == 0) {
                Country country = (Country) ((ArrayList) this.countries.get(this.sortedCountries.get(i))).get(i2);
                TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                String languageFlag = LocaleController.getLanguageFlag(country.shortname);
                if (languageFlag != null) {
                    spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
                    spannableStringBuilder.setSpan(new AnonymousClass5(0), languageFlag.length(), languageFlag.length() + 1, 0);
                }
                spannableStringBuilder.append((CharSequence) country.name);
                CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textSettingsCell.getTextView().getPaint().getFontMetricsInt(), false);
                if (CountrySelectActivity.this.needPhoneCode) {
                    str = "+" + country.code;
                } else {
                    str = null;
                }
                textSettingsCell.setTextAndValue(charSequenceReplaceEmoji, str, false, false);
            }
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View viewAccess$500;
            Context context = this.mContext;
            if (i != 0) {
                viewAccess$500 = new DividerCell(context, null);
                viewAccess$500.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(8.0f));
            } else {
                viewAccess$500 = CountrySelectActivity.access$500(context);
            }
            return new RecyclerListView.Holder(viewAccess$500);
        }
    }

    public final class CountrySearchAdapter extends RecyclerListView.SelectionAdapter {
        public final ArrayList countryList = new ArrayList();
        public final Context mContext;
        public ArrayList searchResult;
        public Timer searchTimer;

        public CountrySearchAdapter(Context context, HashMap map) {
            this.mContext = context;
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                Iterator it2 = ((List) it.next()).iterator();
                while (it2.hasNext()) {
                    this.countryList.add((Country) it2.next());
                }
            }
        }

        @Override
        public final int getItemCount() {
            ArrayList arrayList = this.searchResult;
            if (arrayList == null) {
                return 0;
            }
            return arrayList.size();
        }

        @Override
        public final int getItemViewType(int i) {
            return 0;
        }

        @Override
        public final boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return true;
        }

        @Override
        public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
            String str;
            Country country = (Country) this.searchResult.get(i);
            TextSettingsCell textSettingsCell = (TextSettingsCell) viewHolder.itemView;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            String languageFlag = LocaleController.getLanguageFlag(country.shortname);
            if (languageFlag != null) {
                spannableStringBuilder.append((CharSequence) languageFlag).append((CharSequence) " ");
                spannableStringBuilder.setSpan(new AnonymousClass5(0), languageFlag.length(), languageFlag.length() + 1, 0);
            }
            spannableStringBuilder.append((CharSequence) country.name);
            CharSequence charSequenceReplaceEmoji = Emoji.replaceEmoji(spannableStringBuilder, textSettingsCell.getTextView().getPaint().getFontMetricsInt(), false);
            if (CountrySelectActivity.this.needPhoneCode) {
                str = "+" + country.code;
            } else {
                str = null;
            }
            textSettingsCell.setTextAndValue(charSequenceReplaceEmoji, str, false, false);
        }

        @Override
        public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new RecyclerListView.Holder(CountrySelectActivity.access$500(this.mContext));
        }
    }

    public interface CountrySelectActivityDelegate {
        void didSelectCountry(Country country);
    }

    public CountrySelectActivity(ArrayList arrayList, boolean z) {
        super(null);
        if (arrayList != null && !arrayList.isEmpty()) {
            this.existingCountries = new ArrayList(arrayList);
        }
        this.needPhoneCode = z;
    }

    public static TextSettingsCell access$500(Context context) {
        TextSettingsCell textSettingsCell = new TextSettingsCell(context, 0, null);
        textSettingsCell.setPadding(AndroidUtilities.dp(LocaleController.isRTL ? 16.0f : 12.0f), 0, AndroidUtilities.dp(LocaleController.isRTL ? 12.0f : 16.0f), 0);
        textSettingsCell.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(textSettingsCell) {
            public final CountrySelectActivity$4$$ExternalSyntheticLambda0 listener;

            {
                this.listener = new CountrySelectActivity$4$$ExternalSyntheticLambda0(0, textSettingsCell);
            }

            @Override
            public final void onViewAttachedToWindow(View view) {
                NotificationCenter.getGlobalInstance().addObserver(this.listener, NotificationCenter.emojiLoaded);
            }

            @Override
            public final void onViewDetachedFromWindow(View view) {
                NotificationCenter.getGlobalInstance().removeObserver(this.listener, NotificationCenter.emojiLoaded);
            }
        });
        return textSettingsCell;
    }

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(false);
        this.actionBar.setTitle(LocaleController.getString(R.string.ChooseCountry));
        this.actionBar.setBackgroundColor(Theme.getColor(null, Theme.key_windowBackgroundWhite, false));
        ActionBar actionBar = this.actionBar;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        actionBar.setItemsColor(Theme.getColor(null, i, false), false);
        this.actionBar.setItemsBackgroundColor(Theme.getColor(null, Theme.key_actionBarWhiteSelector, false), false);
        this.actionBar.setTitleColor(Theme.getColor(null, i, false));
        this.actionBar.setActionBarMenuOnItemClick(new LoginActivity.AnonymousClass1(this, 10));
        ActionBarMenuItem actionBarMenuItemAddItem = this.actionBar.createMenu().addItem(0, R.drawable.outline_header_search);
        actionBarMenuItemAddItem.setIsSearchField$1();
        actionBarMenuItemAddItem.listener = new TopicsFragment.AnonymousClass3(this, 9);
        actionBarMenuItemAddItem.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.actionBar.setSearchTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText, false), true);
        this.actionBar.setSearchTextColor(Theme.getColor(null, i, false), false);
        this.actionBar.setSearchCursorColor(Theme.getColor(null, i, false));
        this.searching = false;
        this.searchWas = false;
        CountryAdapter countryAdapter = new CountryAdapter(context, this.existingCountries, this.disableAnonymousNumbers);
        this.listViewAdapter = countryAdapter;
        this.searchListViewAdapter = new CountrySearchAdapter(context, countryAdapter.countries);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context, null);
        this.emptyView = emptyTextProgressView;
        emptyTextProgressView.showTextView();
        this.emptyView.setShowAtCenter(true);
        this.emptyView.setText(LocaleController.getString(R.string.NoResult));
        frameLayout.addView(this.emptyView, LayoutHelper.createFrame(-1.0f, -1));
        RecyclerListView recyclerListView = new RecyclerListView(context, null);
        this.listView = recyclerListView;
        recyclerListView.setSectionsType(3);
        this.listView.setEmptyView(this.emptyView);
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setFastScrollEnabled(0);
        this.listView.setFastScrollVisible(true);
        zzku.m(this.listView);
        this.listView.setAdapter(this.listViewAdapter);
        this.listView.setVerticalScrollbarPosition(LocaleController.isRTL ? 1 : 2);
        frameLayout.addView(this.listView, LayoutHelper.createFrame(-1.0f, -1));
        this.listView.setOnItemClickListener(new PhotoViewer$$ExternalSyntheticLambda61(this, 6));
        this.listView.setOnScrollListener(new LocationActivity.AnonymousClass10(this, 14));
        return this.fragmentView;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        ArrayList arrayList = new ArrayList();
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
    public final boolean isLightStatusBar() {
        return ColorUtils.calculateLuminance(Theme.getColor(null, Theme.key_windowBackgroundWhite, true)) > 0.699999988079071d;
    }

    @Override
    public final void onResume() {
        super.onResume();
        CountryAdapter countryAdapter = this.listViewAdapter;
        if (countryAdapter != null) {
            countryAdapter.update(false);
        }
    }
}
