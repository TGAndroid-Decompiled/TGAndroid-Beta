package org.telegram.p009ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.C0952R;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.p009ui.ActionBar.ActionBarMenuItem;
import org.telegram.p009ui.ActionBar.AlertDialog;
import org.telegram.p009ui.ActionBar.BaseFragment;
import org.telegram.p009ui.ActionBar.C1006ActionBar;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.ActionBar.ThemeDescription;
import org.telegram.p009ui.Cells.HeaderCell;
import org.telegram.p009ui.Cells.LanguageCell;
import org.telegram.p009ui.Cells.ShadowSectionCell;
import org.telegram.p009ui.Cells.TextCheckCell;
import org.telegram.p009ui.Cells.TextInfoPrivacyCell;
import org.telegram.p009ui.Cells.TextRadioCell;
import org.telegram.p009ui.Cells.TextSettingsCell;
import org.telegram.p009ui.Components.CubicBezierInterpolator;
import org.telegram.p009ui.Components.EmptyTextProgressView;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.RecyclerListView;
import org.telegram.p009ui.LanguageSelectActivity;
import p008j$.util.Collection$EL;
import p008j$.util.function.Predicate;

public class LanguageSelectActivity extends BaseFragment implements NotificationCenter.NotificationCenterDelegate {
    private EmptyTextProgressView emptyView;
    private ListAdapter listAdapter;
    private RecyclerListView listView;
    private ListAdapter searchListViewAdapter;
    private ArrayList<LocaleController.LocaleInfo> searchResult;
    private boolean searchWas;
    private boolean searching;
    private ArrayList<LocaleController.LocaleInfo> sortedLanguages;
    private ArrayList<LocaleController.LocaleInfo> unofficialLanguages;

    @Override
    public boolean onFragmentCreate() {
        fillLanguages();
        LocaleController.getInstance().loadRemoteLanguages(this.currentAccount);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.suggestedLangpack);
        return super.onFragmentCreate();
    }

    @Override
    public void onFragmentDestroy() {
        super.onFragmentDestroy();
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.suggestedLangpack);
    }

    @Override
    public View createView(Context context) {
        this.searching = false;
        this.actionBar.setBackButtonImage(C0952R.C0953drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString("Language", C0952R.string.Language));
        this.actionBar.setActionBarMenuOnItemClick(new C1006ActionBar.ActionBarMenuOnItemClick() {
            @Override
            public void onItemClick(int i) {
                if (i == -1) {
                    LanguageSelectActivity.this.finishFragment();
                }
            }
        });
        this.actionBar.createMenu().addItem(0, C0952R.C0953drawable.ic_ab_search).setIsSearchField(true).setActionBarMenuItemSearchListener(new ActionBarMenuItem.ActionBarMenuItemSearchListener() {
            @Override
            public void onSearchExpand() {
                LanguageSelectActivity.this.searching = true;
            }

            @Override
            public void onSearchCollapse() {
                LanguageSelectActivity.this.search(null);
                LanguageSelectActivity.this.searching = false;
                LanguageSelectActivity.this.searchWas = false;
                if (LanguageSelectActivity.this.listView != null) {
                    LanguageSelectActivity.this.emptyView.setVisibility(8);
                    LanguageSelectActivity.this.listView.setAdapter(LanguageSelectActivity.this.listAdapter);
                }
            }

            @Override
            public void onTextChanged(EditText editText) {
                String obj = editText.getText().toString();
                LanguageSelectActivity.this.search(obj);
                if (obj.length() != 0) {
                    LanguageSelectActivity.this.searchWas = true;
                    if (LanguageSelectActivity.this.listView != null) {
                        LanguageSelectActivity.this.listView.setAdapter(LanguageSelectActivity.this.searchListViewAdapter);
                        return;
                    }
                    return;
                }
                LanguageSelectActivity.this.searching = false;
                LanguageSelectActivity.this.searchWas = false;
                if (LanguageSelectActivity.this.listView != null) {
                    LanguageSelectActivity.this.emptyView.setVisibility(8);
                    LanguageSelectActivity.this.listView.setAdapter(LanguageSelectActivity.this.listAdapter);
                }
            }
        }).setSearchFieldHint(LocaleController.getString("Search", C0952R.string.Search));
        this.listAdapter = new ListAdapter(context, false);
        this.searchListViewAdapter = new ListAdapter(context, true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.fragmentView = frameLayout;
        frameLayout.setBackgroundColor(Theme.getColor("windowBackgroundGray"));
        FrameLayout frameLayout2 = (FrameLayout) this.fragmentView;
        EmptyTextProgressView emptyTextProgressView = new EmptyTextProgressView(context);
        this.emptyView = emptyTextProgressView;
        emptyTextProgressView.setText(LocaleController.getString("NoResult", C0952R.string.NoResult));
        this.emptyView.showTextView();
        this.emptyView.setShowAtCenter(true);
        frameLayout2.addView(this.emptyView, LayoutHelper.createFrame(-1, -1.0f));
        RecyclerListView recyclerListView = new RecyclerListView(context);
        this.listView = recyclerListView;
        recyclerListView.setEmptyView(this.emptyView);
        this.listView.setLayoutManager(new LinearLayoutManager(context, 1, false));
        this.listView.setVerticalScrollBarEnabled(false);
        this.listView.setAdapter(this.listAdapter);
        frameLayout2.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f));
        this.listView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
            @Override
            public final void onItemClick(View view, int i) {
                LanguageSelectActivity.this.lambda$createView$1(view, i);
            }
        });
        this.listView.setOnItemLongClickListener(new RecyclerListView.OnItemLongClickListener() {
            @Override
            public final boolean onItemClick(View view, int i) {
                boolean lambda$createView$3;
                lambda$createView$3 = LanguageSelectActivity.this.lambda$createView$3(view, i);
                return lambda$createView$3;
            }
        });
        this.listView.setOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i == 1) {
                    AndroidUtilities.hideKeyboard(LanguageSelectActivity.this.getParentActivity().getCurrentFocus());
                }
            }
        });
        return this.fragmentView;
    }

    public void lambda$createView$1(View view, int i) {
        LocaleController.LocaleInfo localeInfo;
        try {
            if (!(getParentActivity() == null || this.parentLayout == null || !(view instanceof TextRadioCell))) {
                boolean z = this.listView.getAdapter() == this.searchListViewAdapter;
                if (!z) {
                    i -= 2;
                }
                if (z) {
                    localeInfo = this.searchResult.get(i);
                } else if (this.unofficialLanguages.isEmpty() || i < 0 || i >= this.unofficialLanguages.size()) {
                    if (!this.unofficialLanguages.isEmpty()) {
                        i -= this.unofficialLanguages.size() + 1;
                    }
                    localeInfo = this.sortedLanguages.get(i);
                } else {
                    localeInfo = this.unofficialLanguages.get(i);
                }
                if (localeInfo != null) {
                    LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
                    LocaleController.getInstance().applyLanguage(localeInfo, true, false, false, true, this.currentAccount);
                    this.parentLayout.rebuildAllFragmentViews(false, false);
                    final String str = localeInfo.pluralLangCode;
                    String str2 = currentLocaleInfo.pluralLangCode;
                    SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
                    HashSet<String> restrictedLanguages = RestrictedLanguagesSelectActivity.getRestrictedLanguages();
                    HashSet hashSet = new HashSet(restrictedLanguages);
                    if (restrictedLanguages.contains(str)) {
                        Collection$EL.removeIf(hashSet, new Predicate() {
                            @Override
                            public Predicate and(Predicate predicate) {
                                return predicate.getClass();
                            }

                            @Override
                            public Predicate negate() {
                                return Predicate.CC.$default$negate(this);
                            }

                            @Override
                            public Predicate mo11or(Predicate predicate) {
                                return predicate.getClass();
                            }

                            @Override
                            public final boolean test(Object obj) {
                                boolean lambda$createView$0;
                                lambda$createView$0 = LanguageSelectActivity.lambda$createView$0(str, (String) obj);
                                return lambda$createView$0;
                            }
                        });
                        if (!restrictedLanguages.contains(str2)) {
                            hashSet.add(str2);
                        }
                    }
                    globalMainSettings.edit().putStringSet("translate_button_restricted_languages", hashSet).apply();
                    finishFragment();
                }
            }
        } catch (Exception e) {
            FileLog.m30e(e);
        }
    }

    public static boolean lambda$createView$0(String str, String str2) {
        return str2 != null && str2.equals(str);
    }

    public boolean lambda$createView$3(View view, int i) {
        final LocaleController.LocaleInfo localeInfo;
        try {
        } catch (Exception e) {
            FileLog.m30e(e);
        }
        if (!(getParentActivity() == null || this.parentLayout == null || !(view instanceof TextRadioCell))) {
            boolean z = this.listView.getAdapter() == this.searchListViewAdapter;
            if (!z) {
                i -= 2;
            }
            if (z) {
                localeInfo = this.searchResult.get(i);
            } else if (this.unofficialLanguages.isEmpty() || i < 0 || i >= this.unofficialLanguages.size()) {
                if (!this.unofficialLanguages.isEmpty()) {
                    i -= this.unofficialLanguages.size() + 1;
                }
                localeInfo = this.sortedLanguages.get(i);
            } else {
                localeInfo = this.unofficialLanguages.get(i);
            }
            if (!(localeInfo == null || localeInfo.pathToFile == null || (localeInfo.isRemote() && localeInfo.serverIndex != Integer.MAX_VALUE))) {
                AlertDialog.Builder builder = new AlertDialog.Builder(getParentActivity());
                builder.setTitle(LocaleController.getString("DeleteLocalizationTitle", C0952R.string.DeleteLocalizationTitle));
                builder.setMessage(AndroidUtilities.replaceTags(LocaleController.formatString("DeleteLocalizationText", C0952R.string.DeleteLocalizationText, localeInfo.name)));
                builder.setPositiveButton(LocaleController.getString("Delete", C0952R.string.Delete), new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        LanguageSelectActivity.this.lambda$createView$2(localeInfo, dialogInterface, i2);
                    }
                });
                builder.setNegativeButton(LocaleController.getString("Cancel", C0952R.string.Cancel), null);
                AlertDialog create = builder.create();
                showDialog(create);
                TextView textView = (TextView) create.getButton(-1);
                if (textView != null) {
                    textView.setTextColor(Theme.getColor("dialogTextRed2"));
                }
                return true;
            }
        }
        return false;
    }

    public void lambda$createView$2(LocaleController.LocaleInfo localeInfo, DialogInterface dialogInterface, int i) {
        if (LocaleController.getInstance().deleteLanguage(localeInfo, this.currentAccount)) {
            fillLanguages();
            ArrayList<LocaleController.LocaleInfo> arrayList = this.searchResult;
            if (arrayList != null) {
                arrayList.remove(localeInfo);
            }
            ListAdapter listAdapter = this.listAdapter;
            if (listAdapter != null) {
                listAdapter.notifyDataSetChanged();
            }
            ListAdapter listAdapter2 = this.searchListViewAdapter;
            if (listAdapter2 != null) {
                listAdapter2.notifyDataSetChanged();
            }
        }
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.suggestedLangpack && this.listAdapter != null) {
            fillLanguages();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LanguageSelectActivity.this.lambda$didReceivedNotification$4();
                }
            });
        }
    }

    public void lambda$didReceivedNotification$4() {
        this.listAdapter.notifyDataSetChanged();
    }

    private void fillLanguages() {
        final LocaleController.LocaleInfo currentLocaleInfo = LocaleController.getInstance().getCurrentLocaleInfo();
        Comparator languageSelectActivity$$ExternalSyntheticLambda4 = new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$fillLanguages$5;
                lambda$fillLanguages$5 = LanguageSelectActivity.lambda$fillLanguages$5(LocaleController.LocaleInfo.this, (LocaleController.LocaleInfo) obj, (LocaleController.LocaleInfo) obj2);
                return lambda$fillLanguages$5;
            }
        };
        this.sortedLanguages = new ArrayList<>();
        this.unofficialLanguages = new ArrayList<>(LocaleController.getInstance().unofficialLanguages);
        ArrayList<LocaleController.LocaleInfo> arrayList = LocaleController.getInstance().languages;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            LocaleController.LocaleInfo localeInfo = arrayList.get(i);
            if (localeInfo.serverIndex != Integer.MAX_VALUE) {
                this.sortedLanguages.add(localeInfo);
            } else {
                this.unofficialLanguages.add(localeInfo);
            }
        }
        Collections.sort(this.sortedLanguages, languageSelectActivity$$ExternalSyntheticLambda4);
        Collections.sort(this.unofficialLanguages, languageSelectActivity$$ExternalSyntheticLambda4);
    }

    public static int lambda$fillLanguages$5(LocaleController.LocaleInfo localeInfo, LocaleController.LocaleInfo localeInfo2, LocaleController.LocaleInfo localeInfo3) {
        if (localeInfo2 == localeInfo) {
            return -1;
        }
        if (localeInfo3 == localeInfo) {
            return 1;
        }
        int i = localeInfo2.serverIndex;
        int i2 = localeInfo3.serverIndex;
        if (i == i2) {
            return localeInfo2.name.compareTo(localeInfo3.name);
        }
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }

    @Override
    public void onResume() {
        super.onResume();
        ListAdapter listAdapter = this.listAdapter;
        if (listAdapter != null) {
            listAdapter.notifyDataSetChanged();
        }
    }

    public void search(String str) {
        if (str == null) {
            this.searching = false;
            this.searchResult = null;
            if (this.listView != null) {
                this.emptyView.setVisibility(8);
                this.listView.setAdapter(this.listAdapter);
                return;
            }
            return;
        }
        processSearch(str);
    }

    private void processSearch(final String str) {
        Utilities.searchQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                LanguageSelectActivity.this.lambda$processSearch$6(str);
            }
        });
    }

    public void lambda$processSearch$6(String str) {
        if (str.trim().toLowerCase().length() == 0) {
            updateSearchResults(new ArrayList<>());
            return;
        }
        System.currentTimeMillis();
        ArrayList<LocaleController.LocaleInfo> arrayList = new ArrayList<>();
        int size = this.unofficialLanguages.size();
        for (int i = 0; i < size; i++) {
            LocaleController.LocaleInfo localeInfo = this.unofficialLanguages.get(i);
            if (localeInfo.name.toLowerCase().startsWith(str) || localeInfo.nameEnglish.toLowerCase().startsWith(str)) {
                arrayList.add(localeInfo);
            }
        }
        int size2 = this.sortedLanguages.size();
        for (int i2 = 0; i2 < size2; i2++) {
            LocaleController.LocaleInfo localeInfo2 = this.sortedLanguages.get(i2);
            if (localeInfo2.name.toLowerCase().startsWith(str) || localeInfo2.nameEnglish.toLowerCase().startsWith(str)) {
                arrayList.add(localeInfo2);
            }
        }
        updateSearchResults(arrayList);
    }

    private void updateSearchResults(final ArrayList<LocaleController.LocaleInfo> arrayList) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LanguageSelectActivity.this.lambda$updateSearchResults$7(arrayList);
            }
        });
    }

    public void lambda$updateSearchResults$7(ArrayList arrayList) {
        this.searchResult = arrayList;
        this.searchListViewAdapter.notifyDataSetChanged();
    }

    public class TranslateSettings extends LinearLayout {
        private TextSettingsCell doNotTranslateCell;
        private HeaderCell header;
        private TextInfoPrivacyCell info;
        private TextInfoPrivacyCell info2;
        private SharedPreferences.OnSharedPreferenceChangeListener listener;
        private TextCheckCell showButtonCheck;
        private ValueAnimator doNotTranslateCellAnimation = null;
        private SharedPreferences preferences = MessagesController.getGlobalMainSettings();

        public TranslateSettings(Context context) {
            super(context);
            boolean z = true;
            setOrientation(1);
            HeaderCell headerCell = new HeaderCell(context);
            this.header = headerCell;
            headerCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            this.header.setText(LocaleController.getString("TranslateMessages", C0952R.string.TranslateMessages));
            addView(this.header, LayoutHelper.createLinear(-1, -2));
            boolean value = getValue();
            TextCheckCell textCheckCell = new TextCheckCell(context);
            this.showButtonCheck = textCheckCell;
            textCheckCell.setBackground(Theme.AdaptiveRipple.filledRect(Theme.getColor("windowBackgroundWhite")));
            this.showButtonCheck.setTextAndCheck(LocaleController.getString("ShowTranslateButton", C0952R.string.ShowTranslateButton), value, value);
            this.showButtonCheck.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    LanguageSelectActivity.TranslateSettings.this.lambda$new$0(view);
                }
            });
            addView(this.showButtonCheck, LayoutHelper.createLinear(-1, -2));
            TextSettingsCell textSettingsCell = new TextSettingsCell(context);
            this.doNotTranslateCell = textSettingsCell;
            textSettingsCell.setBackground(Theme.AdaptiveRipple.filledRect(Theme.getColor("windowBackgroundWhite")));
            this.doNotTranslateCell.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    LanguageSelectActivity.TranslateSettings.this.lambda$new$1(view);
                }
            });
            this.doNotTranslateCell.setClickable((!value || !LanguageDetector.hasSupport()) ? false : z);
            float f = 1.0f;
            this.doNotTranslateCell.setAlpha((!value || !LanguageDetector.hasSupport()) ? 0.0f : 1.0f);
            addView(this.doNotTranslateCell, LayoutHelper.createLinear(-1, -2));
            TextInfoPrivacyCell textInfoPrivacyCell = new TextInfoPrivacyCell(context);
            this.info = textInfoPrivacyCell;
            textInfoPrivacyCell.setTopPadding(11);
            this.info.setBottomPadding(16);
            this.info.setText(LocaleController.getString("TranslateMessagesInfo1", C0952R.string.TranslateMessagesInfo1));
            addView(this.info, LayoutHelper.createLinear(-1, -2));
            TextInfoPrivacyCell textInfoPrivacyCell2 = new TextInfoPrivacyCell(context);
            this.info2 = textInfoPrivacyCell2;
            textInfoPrivacyCell2.setTopPadding(0);
            this.info2.setBottomPadding(16);
            this.info2.setText(LocaleController.getString("TranslateMessagesInfo2", C0952R.string.TranslateMessagesInfo2));
            this.info2.setAlpha(value ? 0.0f : f);
            addView(this.info2, LayoutHelper.createLinear(-1, -2));
            updateHeight();
            update();
        }

        public void lambda$new$0(View view) {
            this.preferences.edit().putBoolean("translate_button", !getValue()).apply();
        }

        public void lambda$new$1(View view) {
            LanguageSelectActivity.this.presentFragment(new RestrictedLanguagesSelectActivity());
            update();
        }

        private boolean getValue() {
            return this.preferences.getBoolean("translate_button", false);
        }

        private ArrayList<String> getRestrictedLanguages() {
            String str = LocaleController.getInstance().getCurrentLocaleInfo().pluralLangCode;
            ArrayList<String> arrayList = new ArrayList<>(RestrictedLanguagesSelectActivity.getRestrictedLanguages());
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
            return arrayList;
        }

        public void update() {
            boolean z = getValue() && LanguageDetector.hasSupport();
            this.showButtonCheck.setChecked(getValue());
            ValueAnimator valueAnimator = this.doNotTranslateCellAnimation;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.showButtonCheck.setDivider(z);
            ArrayList<String> restrictedLanguages = getRestrictedLanguages();
            String str = null;
            if (restrictedLanguages.size() == 1) {
                try {
                    str = LocaleController.getInstance().getLanguageFromDict(restrictedLanguages.get(0)).name;
                } catch (Exception unused) {
                }
            }
            if (str == null) {
                str = String.format(LocaleController.getPluralString("Languages", getRestrictedLanguages().size()), Integer.valueOf(getRestrictedLanguages().size()));
            }
            this.doNotTranslateCell.setTextAndValue(LocaleController.getString("DoNotTranslate", C0952R.string.DoNotTranslate), str, false);
            this.doNotTranslateCell.setClickable(z);
            float[] fArr = new float[2];
            fArr[0] = this.doNotTranslateCell.getAlpha();
            float f = 1.0f;
            fArr[1] = z ? 1.0f : 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
            this.doNotTranslateCellAnimation = ofFloat;
            ofFloat.setInterpolator(CubicBezierInterpolator.DEFAULT);
            this.doNotTranslateCellAnimation.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    LanguageSelectActivity.TranslateSettings.this.lambda$update$2(valueAnimator2);
                }
            });
            ValueAnimator valueAnimator2 = this.doNotTranslateCellAnimation;
            float alpha = this.doNotTranslateCell.getAlpha();
            if (!z) {
                f = 0.0f;
            }
            valueAnimator2.setDuration(Math.abs(alpha - f) * 200.0f);
            this.doNotTranslateCellAnimation.start();
        }

        public void lambda$update$2(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.doNotTranslateCell.setAlpha(floatValue);
            float f = 1.0f - floatValue;
            this.doNotTranslateCell.setTranslationY((-AndroidUtilities.m34dp(8.0f)) * f);
            this.info.setTranslationY((-this.doNotTranslateCell.getHeight()) * f);
            this.info2.setAlpha(f);
            this.info2.setTranslationY((-this.doNotTranslateCell.getHeight()) * f);
        }

        @Override
        protected void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            updateHeight();
        }

        @Override
        protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
            updateHeight();
            super.onLayout(z, i, i2, i3, i4);
        }

        void updateHeight() {
            int i = 0;
            this.header.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), 0);
            this.showButtonCheck.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), 0);
            this.doNotTranslateCell.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), 0);
            this.info.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), 0);
            this.info2.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), 0);
            if (!LanguageSelectActivity.this.searching) {
                i = height();
            }
            if (getLayoutParams() == null) {
                setLayoutParams(new RecyclerView.LayoutParams(-1, i));
            } else if (getLayoutParams().height != i) {
                RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) getLayoutParams();
                ((ViewGroup.MarginLayoutParams) layoutParams).height = i;
                setLayoutParams(layoutParams);
            }
        }

        int height() {
            return Math.max(AndroidUtilities.m34dp(40.0f), this.header.getMeasuredHeight()) + Math.max(AndroidUtilities.m34dp(50.0f), this.showButtonCheck.getMeasuredHeight()) + Math.max(Math.max(AndroidUtilities.m34dp(50.0f), this.doNotTranslateCell.getMeasuredHeight()), this.info2.getMeasuredHeight() <= 0 ? AndroidUtilities.m34dp(51.0f) : this.info2.getMeasuredHeight()) + (this.info.getMeasuredHeight() <= 0 ? AndroidUtilities.m34dp(62.0f) : this.info.getMeasuredHeight());
        }

        @Override
        protected void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            updateHeight();
        }

        @Override
        protected void onAttachedToWindow() {
            super.onAttachedToWindow();
            update();
            SharedPreferences sharedPreferences = this.preferences;
            SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener() {
                @Override
                public void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                    TranslateSettings.this.preferences = sharedPreferences2;
                    TranslateSettings.this.update();
                }
            };
            this.listener = onSharedPreferenceChangeListener;
            sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
            updateHeight();
        }

        @Override
        protected void onDetachedFromWindow() {
            super.onDetachedFromWindow();
            this.preferences.unregisterOnSharedPreferenceChangeListener(this.listener);
        }
    }

    public class ListAdapter extends RecyclerListView.SelectionAdapter {
        private Context mContext;
        private boolean search;

        public ListAdapter(Context context, boolean z) {
            this.mContext = context;
            this.search = z;
        }

        @Override
        public boolean isEnabled(RecyclerView.ViewHolder viewHolder) {
            return viewHolder.getItemViewType() == 0;
        }

        @Override
        public int getItemCount() {
            if (!this.search) {
                int size = LanguageSelectActivity.this.sortedLanguages.size();
                if (size != 0) {
                    size++;
                }
                if (!LanguageSelectActivity.this.unofficialLanguages.isEmpty()) {
                    size += LanguageSelectActivity.this.unofficialLanguages.size() + 1;
                }
                return size + 2;
            } else if (LanguageSelectActivity.this.searchResult == null) {
                return 0;
            } else {
                return LanguageSelectActivity.this.searchResult.size();
            }
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
            View view;
            TextRadioCell textRadioCell;
            if (i != 0) {
                if (i == 2) {
                    view = new TranslateSettings(this.mContext);
                } else if (i != 3) {
                    view = new ShadowSectionCell(this.mContext);
                } else {
                    HeaderCell headerCell = new HeaderCell(this.mContext);
                    headerCell.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
                    headerCell.setText(LocaleController.getString("Language", C0952R.string.Language));
                    textRadioCell = headerCell;
                }
                return new RecyclerListView.Holder(view);
            }
            TextRadioCell textRadioCell2 = new TextRadioCell(this.mContext);
            textRadioCell2.setBackgroundColor(Theme.getColor("windowBackgroundWhite"));
            textRadioCell = textRadioCell2;
            view = textRadioCell;
            return new RecyclerListView.Holder(view);
        }

        @Override
        public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder r11, int r12) {
            throw new UnsupportedOperationException("Method not decompiled: org.telegram.p009ui.LanguageSelectActivity.ListAdapter.onBindViewHolder(androidx.recyclerview.widget.RecyclerView$ViewHolder, int):void");
        }

        @Override
        public int getItemViewType(int i) {
            boolean z = this.search;
            if (!z) {
                i -= 2;
            }
            if (i == -2) {
                return 2;
            }
            if (i == -1) {
                return 3;
            }
            if (z) {
                return 0;
            }
            return ((LanguageSelectActivity.this.unofficialLanguages.isEmpty() || !(i == LanguageSelectActivity.this.unofficialLanguages.size() || i == (LanguageSelectActivity.this.unofficialLanguages.size() + LanguageSelectActivity.this.sortedLanguages.size()) + 1)) && (!LanguageSelectActivity.this.unofficialLanguages.isEmpty() || i != LanguageSelectActivity.this.sortedLanguages.size())) ? 0 : 1;
        }
    }

    @Override
    public ArrayList<ThemeDescription> getThemeDescriptions() {
        ArrayList<ThemeDescription> arrayList = new ArrayList<>();
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_CELLBACKGROUNDCOLOR, new Class[]{LanguageCell.class}, null, null, null, "windowBackgroundWhite"));
        arrayList.add(new ThemeDescription(this.fragmentView, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "windowBackgroundGray"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_BACKGROUND, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_LISTGLOWCOLOR, null, null, null, null, "actionBarDefault"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_ITEMSCOLOR, null, null, null, null, "actionBarDefaultIcon"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_TITLECOLOR, null, null, null, null, "actionBarDefaultTitle"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SELECTORCOLOR, null, null, null, null, "actionBarDefaultSelector"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCH, null, null, null, null, "actionBarDefaultSearch"));
        arrayList.add(new ThemeDescription(this.actionBar, ThemeDescription.FLAG_AB_SEARCHPLACEHOLDER, null, null, null, null, "actionBarDefaultSearchPlaceholder"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_SELECTOR, null, null, null, null, "listSelectorSDK21"));
        arrayList.add(new ThemeDescription(this.emptyView, ThemeDescription.FLAG_TEXTCOLOR, null, null, null, null, "emptyListPlaceholder"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{View.class}, Theme.dividerPaint, null, null, "divider"));
        arrayList.add(new ThemeDescription(this.listView, ThemeDescription.FLAG_BACKGROUNDFILTER, new Class[]{ShadowSectionCell.class}, null, null, null, "windowBackgroundGrayShadow"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LanguageCell.class}, new String[]{"textView"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteBlackText"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LanguageCell.class}, new String[]{"textView2"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "windowBackgroundWhiteGrayText3"));
        arrayList.add(new ThemeDescription(this.listView, 0, new Class[]{LanguageCell.class}, new String[]{"checkImage"}, (Paint[]) null, (Drawable[]) null, (ThemeDescription.ThemeDescriptionDelegate) null, "featuredStickers_addedIcon"));
        return arrayList;
    }
}
