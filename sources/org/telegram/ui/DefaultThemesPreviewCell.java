package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.graphics.ColorUtils;
import androidx.fragment.app.Fragment$$ExternalSyntheticOutline0;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.EmojiThemes;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ActionBar.theme.ThemeKey;
import org.telegram.ui.Cells.TextCell;
import org.telegram.ui.Components.ChatThemeBottomSheet;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ThemeSmallPreviewView;

public class DefaultThemesPreviewCell extends LinearLayout {
    public static final int TYPE_CUSTOM_GRID = -2;
    public static final int TYPE_CUSTOM_LIST = -1;
    private final ChatThemeBottomSheet.Adapter adapter;
    TextCell browseThemesCell;
    int currentType;
    RLottieDrawable darkThemeDrawable;
    TextCell dayNightCell;
    private LinearLayoutManager layoutManager;
    private ValueAnimator navBarAnimator;
    private int navBarColor;
    BaseFragment parentFragment;
    private final FlickerLoadingView progressView;
    private final RecyclerListView recyclerView;
    private int selectedPosition;
    int themeIndex;
    private Boolean wasPortrait;

    public class AnonymousClass2 implements View.OnClickListener {
        final Context val$context;
        final BaseFragment val$parentFragment;

        public AnonymousClass2(Context context, BaseFragment baseFragment) {
            this.val$context = context;
            this.val$parentFragment = baseFragment;
        }

        public void lambda$onClick$0(final int i, Context context, int i2, boolean z, BaseFragment baseFragment) {
            DefaultThemesPreviewCell.this.updateDayNightMode();
            DefaultThemesPreviewCell.this.updateSelectedPosition();
            final int color = Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false);
            DefaultThemesPreviewCell.this.darkThemeDrawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                @Override
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    DefaultThemesPreviewCell.this.darkThemeDrawable.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(((Float) valueAnimator.getAnimatedValue()).floatValue(), i, color), PorterDuff.Mode.SRC_IN));
                }
            });
            valueAnimatorOfFloat.addListener(new AnimatorListenerAdapter() {
                @Override
                public void onAnimationEnd(Animator animator) {
                    DefaultThemesPreviewCell.this.darkThemeDrawable.setColorFilter(new PorterDuffColorFilter(color, PorterDuff.Mode.SRC_IN));
                    super.onAnimationEnd(animator);
                }
            });
            valueAnimatorOfFloat.setDuration(350L);
            valueAnimatorOfFloat.start();
            final int color2 = Theme.getColor(null, Theme.key_windowBackgroundGray, false);
            final Activity activity = context instanceof Activity ? (Activity) context : null;
            if ((activity != null ? activity.getWindow() : null) != null) {
                if (DefaultThemesPreviewCell.this.navBarAnimator != null && DefaultThemesPreviewCell.this.navBarAnimator.isRunning()) {
                    DefaultThemesPreviewCell.this.navBarAnimator.cancel();
                }
                int i3 = (DefaultThemesPreviewCell.this.navBarAnimator == null || !DefaultThemesPreviewCell.this.navBarAnimator.isRunning()) ? i2 : DefaultThemesPreviewCell.this.navBarColor;
                DefaultThemesPreviewCell.this.navBarAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
                final float f = z ? 50.0f : 200.0f;
                final int i4 = i3;
                final float f2 = 350.0f;
                final float f3 = 150.0f;
                DefaultThemesPreviewCell.this.navBarAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        DefaultThemesPreviewCell.this.navBarColor = ColorUtils.blendARGB(Math.max(0.0f, Math.min(1.0f, ((((Float) valueAnimator.getAnimatedValue()).floatValue() * f2) - f) / f3)), i4, color2);
                        AndroidUtilities.setNavigationBarColor(activity, DefaultThemesPreviewCell.this.navBarColor, false);
                        AndroidUtilities.setLightNavigationBar(activity, AndroidUtilities.computePerceivedBrightness(DefaultThemesPreviewCell.this.navBarColor) >= 0.721f);
                    }
                });
                DefaultThemesPreviewCell.this.navBarAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        AndroidUtilities.setNavigationBarColor(activity, color2, false);
                        AndroidUtilities.setLightNavigationBar(activity, AndroidUtilities.computePerceivedBrightness(color2) >= 0.721f);
                    }
                });
                DefaultThemesPreviewCell.this.navBarAnimator.setDuration(350L);
                DefaultThemesPreviewCell.this.navBarAnimator.start();
            }
            if (Theme.isCurrentThemeDay()) {
                DefaultThemesPreviewCell.this.dayNightCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.SettingsSwitchToNightMode), (Drawable) DefaultThemesPreviewCell.this.darkThemeDrawable, true);
            } else {
                DefaultThemesPreviewCell.this.dayNightCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.SettingsSwitchToDayMode), (Drawable) DefaultThemesPreviewCell.this.darkThemeDrawable, true);
            }
            Theme.turnOffAutoNight(baseFragment);
        }

        @Override
        public void onClick(View view) {
            boolean zIsDark;
            String str;
            Theme.ThemeInfo themeInfo;
            RLottieDrawable rLottieDrawable;
            int framesCount;
            if (DialogsActivity.switchingTheme) {
                return;
            }
            int color = Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false);
            int color2 = Theme.getColor(null, Theme.key_windowBackgroundGray, false);
            DialogsActivity.switchingTheme = true;
            SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
            String str2 = "Blue";
            String string = sharedPreferences.getString("lastDayTheme", "Blue");
            HashMap map = Theme.themesDict;
            if (((Theme.ThemeInfo) map.get(string)) == null || ((Theme.ThemeInfo) map.get(string)).isDark()) {
                string = "Blue";
            }
            String str3 = "Dark Blue";
            String string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
            if (((Theme.ThemeInfo) map.get(string2)) == null || !((Theme.ThemeInfo) map.get(string2)).isDark()) {
                string2 = "Dark Blue";
            }
            Theme.ThemeInfo themeInfo2 = Theme.currentTheme;
            if (string.equals(string2)) {
                if (themeInfo2.isDark() || string.equals("Dark Blue") || string.equals("Night")) {
                    str3 = string2;
                }
                zIsDark = Theme.currentTheme.isDark();
                str = str3;
                boolean z = !zIsDark;
                if (zIsDark) {
                    themeInfo = (Theme.ThemeInfo) map.get(str2);
                } else {
                    themeInfo = (Theme.ThemeInfo) map.get(str);
                }
                rLottieDrawable = DefaultThemesPreviewCell.this.darkThemeDrawable;
                if (zIsDark) {
                    framesCount = 0;
                } else {
                    framesCount = rLottieDrawable.getFramesCount() - 1;
                }
                rLottieDrawable.setCustomEndFrame(framesCount);
                DefaultThemesPreviewCell.this.dayNightCell.getImageView().playAnimation();
                int[] iArr = {(DefaultThemesPreviewCell.this.dayNightCell.getImageView().getMeasuredWidth() / 2) + i, RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(3.0f, DefaultThemesPreviewCell.this.dayNightCell.getImageView().getMeasuredHeight() / 2, i)};
                DefaultThemesPreviewCell.this.dayNightCell.getImageView().getLocationInWindow(iArr);
                int i = iArr[0];
                int i2 = iArr[1];
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, themeInfo, Boolean.FALSE, iArr, -1, Boolean.valueOf(z), DefaultThemesPreviewCell.this.dayNightCell.getImageView(), DefaultThemesPreviewCell.this.dayNightCell, new ChatActivity$70$$ExternalSyntheticLambda0(this, color, this.val$context, color2, z, this.val$parentFragment));
            }
            str3 = string2;
            str2 = string;
            zIsDark = Theme.currentTheme.isDark();
            str = str3;
            boolean z2 = !zIsDark;
            if (zIsDark) {
                themeInfo = (Theme.ThemeInfo) map.get(str);
            } else {
                themeInfo = (Theme.ThemeInfo) map.get(str2);
            }
            rLottieDrawable = DefaultThemesPreviewCell.this.darkThemeDrawable;
            if (zIsDark) {
                framesCount = rLottieDrawable.getFramesCount() - 1;
            } else {
                framesCount = 0;
            }
            rLottieDrawable.setCustomEndFrame(framesCount);
            DefaultThemesPreviewCell.this.dayNightCell.getImageView().playAnimation();
            int[] iArr2 = {(DefaultThemesPreviewCell.this.dayNightCell.getImageView().getMeasuredWidth() / 2) + i, RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(3.0f, DefaultThemesPreviewCell.this.dayNightCell.getImageView().getMeasuredHeight() / 2, i2)};
            DefaultThemesPreviewCell.this.dayNightCell.getImageView().getLocationInWindow(iArr2);
            int i3 = iArr2[0];
            int i4 = iArr2[1];
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, themeInfo, Boolean.FALSE, iArr2, -1, Boolean.valueOf(z2), DefaultThemesPreviewCell.this.dayNightCell.getImageView(), DefaultThemesPreviewCell.this.dayNightCell, new ChatActivity$70$$ExternalSyntheticLambda0(this, color, this.val$context, color2, z2, this.val$parentFragment));
        }
    }

    public DefaultThemesPreviewCell(Context context, BaseFragment baseFragment, int i) {
        LinearLayoutManager linearLayoutManager;
        Theme.ThemeInfo themeInfo;
        String string;
        Theme.ThemeInfo themeInfo2;
        super(context);
        this.layoutManager = null;
        this.selectedPosition = -1;
        this.wasPortrait = null;
        this.currentType = i;
        this.parentFragment = baseFragment;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, LayoutHelper.createFrame(-1, -2.0f));
        int currentAccount = baseFragment.getCurrentAccount();
        int i2 = this.currentType;
        ChatThemeBottomSheet.Adapter adapter = new ChatThemeBottomSheet.Adapter(currentAccount, null, (i2 == 0 || i2 == -1) ? 0 : 1);
        this.adapter = adapter;
        RecyclerListView recyclerListView = new RecyclerListView(getContext()) {
            @Override
            public Integer getSelectorColor(int i3) {
                return 0;
            }
        };
        this.recyclerView = recyclerListView;
        recyclerListView.setAdapter(adapter);
        recyclerListView.setSelectorDrawableColor(0);
        recyclerListView.setClipChildren(false);
        recyclerListView.setClipToPadding(false);
        recyclerListView.setHasFixedSize(true);
        recyclerListView.lambda$onCellEnter$52(null);
        recyclerListView.setNestedScrollingEnabled(false);
        updateLayoutManager();
        recyclerListView.setFocusable(false);
        recyclerListView.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        recyclerListView.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda5(6, this, baseFragment));
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(getContext(), null);
        this.progressView = flickerLoadingView;
        flickerLoadingView.setViewType(14);
        flickerLoadingView.setVisibility(0);
        int i3 = this.currentType;
        if (i3 == 0 || i3 == -1) {
            frameLayout.addView(flickerLoadingView, LayoutHelper.createFrame(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(recyclerListView, LayoutHelper.createFrame(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(flickerLoadingView, LayoutHelper.createFrame(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(recyclerListView, LayoutHelper.createFrame(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        recyclerListView.setEmptyView(flickerLoadingView);
        recyclerListView.setAnimateEmptyView(true, 0);
        if (this.currentType == 0) {
            int i4 = R.raw.sun_outline;
            RLottieDrawable rLottieDrawable = new RLottieDrawable(i4, Fragment$$ExternalSyntheticOutline0.m(i4, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.darkThemeDrawable = rLottieDrawable;
            rLottieDrawable.setPlayInDirectionOfCustomEndFrame(true);
            this.darkThemeDrawable.beginApplyLayerColors();
            this.darkThemeDrawable.commitApplyLayerColors();
            TextCell textCell = new TextCell(context);
            this.dayNightCell = textCell;
            textCell.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 2, -1));
            TextCell textCell2 = this.dayNightCell;
            textCell2.imageLeft = 21;
            addView(textCell2, LayoutHelper.createFrame(-1, -2.0f));
            TextCell textCell3 = new TextCell(context);
            this.browseThemesCell = textCell3;
            textCell3.setTextAndIcon((CharSequence) LocaleController.getString(R.string.SettingsBrowseThemes), R.drawable.msg_colors, false);
            addView(this.browseThemesCell, LayoutHelper.createFrame(-1, -2.0f));
            this.dayNightCell.setOnClickListener(new AnonymousClass2(context, baseFragment));
            this.darkThemeDrawable.setPlayInDirectionOfCustomEndFrame(true);
            this.browseThemesCell.setOnClickListener(new OAuthSheet$$ExternalSyntheticLambda11(baseFragment, 8));
            if (Theme.isCurrentThemeDay()) {
                this.dayNightCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.SettingsSwitchToNightMode), (Drawable) this.darkThemeDrawable, true);
            } else {
                RLottieDrawable rLottieDrawable2 = this.darkThemeDrawable;
                rLottieDrawable2.setCurrentFrame(rLottieDrawable2.getFramesCount() - 1);
                this.dayNightCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.SettingsSwitchToDayMode), (Drawable) this.darkThemeDrawable, true);
            }
        }
        if (!MediaDataController.getInstance(baseFragment.getCurrentAccount()).defaultEmojiThemes.isEmpty()) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(baseFragment.getCurrentAccount()).defaultEmojiThemes);
            if (this.currentType == 0) {
                EmojiThemes emojiThemes = new EmojiThemes(baseFragment.getCurrentAccount());
                emojiThemes.emoji = "🎨";
                emojiThemes.key = new ThemeKey("🎨", null);
                emojiThemes.chatTheme = TLRPC.ChatTheme.ofEmoticon("🎨");
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string2 = sharedPreferences.getString("lastDayCustomTheme", null);
                int i5 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i6 = 99;
                String str = "Blue";
                if (string2 != null) {
                    HashMap map = Theme.themesDict;
                    if (((Theme.ThemeInfo) map.get(string2)) == null) {
                        string2 = sharedPreferences.getString("lastDayTheme", "Blue");
                        themeInfo = (Theme.ThemeInfo) Theme.themesDict.get(string2);
                        if (themeInfo == null) {
                            string2 = "Blue";
                            i5 = 99;
                        } else {
                            i5 = themeInfo.currentAccentId;
                        }
                        sharedPreferences.edit().putString("lastDayCustomTheme", string2).apply();
                    } else if (i5 == -1) {
                        i5 = ((Theme.ThemeInfo) map.get(string2)).lastAccentId;
                    }
                } else {
                    string2 = sharedPreferences.getString("lastDayTheme", "Blue");
                    themeInfo = (Theme.ThemeInfo) Theme.themesDict.get(string2);
                    if (themeInfo == null) {
                        string2 = "Blue";
                        i5 = 99;
                    } else {
                        i5 = themeInfo.currentAccentId;
                    }
                    sharedPreferences.edit().putString("lastDayCustomTheme", string2).apply();
                }
                if (i5 != -1) {
                    str = string2;
                    i6 = i5;
                }
                String string3 = sharedPreferences.getString("lastDarkCustomTheme", null);
                int i7 = sharedPreferences.getInt("lastDarkCustomThemeAccentId", -1);
                String str2 = "Dark Blue";
                if (string3 != null) {
                    HashMap map2 = Theme.themesDict;
                    if (((Theme.ThemeInfo) map2.get(string3)) == null) {
                        string = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                        themeInfo2 = (Theme.ThemeInfo) Theme.themesDict.get(string);
                        if (themeInfo2 == null) {
                            string3 = "Dark Blue";
                            i7 = 0;
                        } else {
                            i7 = themeInfo2.currentAccentId;
                            string3 = string;
                        }
                        sharedPreferences.edit().putString("lastDarkCustomTheme", string3).apply();
                    } else if (i7 == -1) {
                        i7 = ((Theme.ThemeInfo) map2.get(str)).lastAccentId;
                    }
                } else {
                    string = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    themeInfo2 = (Theme.ThemeInfo) Theme.themesDict.get(string);
                    if (themeInfo2 == null) {
                        string3 = "Dark Blue";
                        i7 = 0;
                    } else {
                        i7 = themeInfo2.currentAccentId;
                        string3 = string;
                    }
                    sharedPreferences.edit().putString("lastDarkCustomTheme", string3).apply();
                }
                if (i7 == -1) {
                    i7 = 0;
                } else {
                    str2 = string3;
                }
                EmojiThemes.ThemeItem themeItem = new EmojiThemes.ThemeItem();
                HashMap map3 = Theme.themesDict;
                themeItem.themeInfo = (Theme.ThemeInfo) map3.get(str);
                themeItem.accentId = i6;
                emojiThemes.items.add(themeItem);
                emojiThemes.items.add(null);
                EmojiThemes.ThemeItem themeItem2 = new EmojiThemes.ThemeItem();
                themeItem2.themeInfo = (Theme.ThemeInfo) map3.get(str2);
                themeItem2.accentId = i7;
                emojiThemes.items.add(themeItem2);
                emojiThemes.items.add(null);
                emojiThemes.loadPreviewColors(baseFragment.getCurrentAccount());
                ChatThemeBottomSheet.ChatThemeItem chatThemeItem = new ChatThemeBottomSheet.ChatThemeItem(emojiThemes);
                chatThemeItem.themeIndex = Theme.isCurrentThemeDay() ? 0 : 2;
                arrayList.add(chatThemeItem);
            }
            adapter.setItems(arrayList);
        }
        updateDayNightMode();
        updateSelectedPosition();
        updateColors();
        int i8 = this.selectedPosition;
        if (i8 < 0 || (linearLayoutManager = this.layoutManager) == null) {
            return;
        }
        linearLayoutManager.scrollToPositionWithOffset(i8, AndroidUtilities.dp(16.0f));
    }

    public void lambda$new$0(BaseFragment baseFragment, View view, int i) {
        String str;
        int i2;
        String str2;
        ChatThemeBottomSheet.ChatThemeItem chatThemeItem = this.adapter.items.get(i);
        Theme.ThemeInfo themeInfo = ((EmojiThemes.ThemeItem) chatThemeItem.chatTheme.items.get(this.themeIndex)).themeInfo;
        ThemeKey themeKey = chatThemeItem.chatTheme.key;
        if (themeKey == null) {
            str = null;
        } else {
            str = themeKey.giftSlug;
            if (str == null) {
                str = themeKey.emoticon;
            }
        }
        if (str.equals("🏠")) {
            i2 = ((EmojiThemes.ThemeItem) chatThemeItem.chatTheme.items.get(this.themeIndex)).accentId;
        } else {
            ThemeKey themeKey2 = chatThemeItem.chatTheme.key;
            if (themeKey2 == null) {
                str2 = null;
            } else {
                str2 = themeKey2.giftSlug;
                if (str2 == null) {
                    str2 = themeKey2.emoticon;
                }
            }
            if (str2.equals("🎨")) {
                i2 = ((EmojiThemes.ThemeItem) chatThemeItem.chatTheme.items.get(this.themeIndex)).accentId;
            } else {
                i2 = -1;
            }
        }
        if (themeInfo == null) {
            TLRPC.TL_theme tL_theme = ((EmojiThemes.ThemeItem) chatThemeItem.chatTheme.items.get(this.themeIndex)).tlTheme;
            Theme.ThemeInfo themeInfo2 = (Theme.ThemeInfo) Theme.themesDict.get(Theme.getBaseThemeKey(tL_theme.settings.get(((EmojiThemes.ThemeItem) chatThemeItem.chatTheme.items.get(this.themeIndex)).settingsIndex)));
            if (themeInfo2 != null) {
                Theme.ThemeAccent themeAccentCreateNewAccent = (Theme.ThemeAccent) themeInfo2.accentsByThemeId.get(tL_theme.id);
                if (themeAccentCreateNewAccent == null) {
                    themeAccentCreateNewAccent = themeInfo2.createNewAccent(tL_theme, baseFragment.getCurrentAccount(), 0);
                }
                i2 = themeAccentCreateNewAccent.id;
                themeInfo2.setCurrentAccentId(i2);
            }
            themeInfo = themeInfo2;
        }
        NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, themeInfo, Boolean.FALSE, null, Integer.valueOf(i2));
        this.selectedPosition = i;
        int i3 = 0;
        while (i3 < this.adapter.items.size()) {
            this.adapter.items.get(i3).isSelected = i3 == this.selectedPosition;
            i3++;
        }
        this.adapter.setSelectedItem(this.selectedPosition);
        for (int i4 = 0; i4 < this.recyclerView.getChildCount(); i4++) {
            ThemeSmallPreviewView themeSmallPreviewView = (ThemeSmallPreviewView) this.recyclerView.getChildAt(i4);
            if (themeSmallPreviewView != view) {
                themeSmallPreviewView.cancelAnimation();
            }
        }
        ((ThemeSmallPreviewView) view).playEmojiAnimation();
        if (themeInfo != null) {
            SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
            editorEdit.putString((this.currentType == 1 || themeInfo.isDark()) ? "lastDarkTheme" : "lastDayTheme", themeInfo.getKey());
            editorEdit.commit();
        }
        Theme.turnOffAutoNight(baseFragment);
    }

    public void updateSelectedPosition() {
        if (this.adapter.items == null) {
            return;
        }
        this.selectedPosition = -1;
        for (int i = 0; i < this.adapter.items.size(); i++) {
            TLRPC.TL_theme tL_theme = ((EmojiThemes.ThemeItem) this.adapter.items.get(i).chatTheme.items.get(this.themeIndex)).tlTheme;
            Theme.ThemeInfo themeInfo = ((EmojiThemes.ThemeItem) this.adapter.items.get(i).chatTheme.items.get(this.themeIndex)).themeInfo;
            if (tL_theme != null) {
                if (Theme.currentTheme.name.equals(Theme.getBaseThemeKey(tL_theme.settings.get(((EmojiThemes.ThemeItem) this.adapter.items.get(i).chatTheme.items.get(this.themeIndex)).settingsIndex)))) {
                    LongSparseArray longSparseArray = Theme.currentTheme.accentsByThemeId;
                    if (longSparseArray == null) {
                        this.selectedPosition = i;
                        break;
                    }
                    Theme.ThemeAccent themeAccent = (Theme.ThemeAccent) longSparseArray.get(tL_theme.id);
                    if (themeAccent != null && themeAccent.id == Theme.currentTheme.currentAccentId) {
                        this.selectedPosition = i;
                        break;
                    }
                } else {
                    continue;
                }
            } else {
                if (themeInfo == null) {
                    continue;
                } else if (Theme.currentTheme.name.equals(themeInfo.getKey())) {
                    if (((EmojiThemes.ThemeItem) this.adapter.items.get(i).chatTheme.items.get(this.themeIndex)).accentId == Theme.currentTheme.currentAccentId) {
                        this.selectedPosition = i;
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        if (this.selectedPosition == -1 && this.currentType != 3) {
            this.selectedPosition = this.adapter.items.size() - 1;
        }
        int i2 = 0;
        while (i2 < this.adapter.items.size()) {
            this.adapter.items.get(i2).isSelected = i2 == this.selectedPosition;
            i2++;
        }
        this.adapter.setSelectedItem(this.selectedPosition);
    }

    @Override
    public void onMeasure(int i, int i2) {
        updateLayoutManager();
        super.onMeasure(i, i2);
    }

    public void selectTheme(Theme.ThemeInfo themeInfo) {
        if (themeInfo.info == null || themeInfo.themeLoaded) {
            if (!TextUtils.isEmpty(themeInfo.assetName)) {
                Theme.PatternsLoader.createLoader(false);
            }
            if (this.currentType != 2) {
                SharedPreferences.Editor editorEdit = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0).edit();
                editorEdit.putString((this.currentType == 1 || themeInfo.isDark()) ? "lastDarkTheme" : "lastDayTheme", themeInfo.getKey());
                editorEdit.commit();
            }
            if (this.currentType != 1) {
                if (themeInfo == Theme.currentTheme) {
                    return;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, themeInfo, Boolean.FALSE, null, -1);
            } else {
                if (themeInfo == Theme.currentNightTheme) {
                    return;
                }
                boolean z = Theme.currentTheme == Theme.currentNightTheme;
                Theme.currentNightTheme = themeInfo;
                if (z) {
                    Theme.applyDayNightThemeMaybe(true);
                }
            }
        }
    }

    @Override
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        updateColors();
    }

    public void updateColors() {
        int i = this.currentType;
        if (i == 0 || i == -1) {
            RLottieDrawable rLottieDrawable = this.darkThemeDrawable;
            if (rLottieDrawable != null) {
                rLottieDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false), PorterDuff.Mode.SRC_IN));
            }
            TextCell textCell = this.dayNightCell;
            if (textCell != null) {
                Theme.setSelectorDrawableColor(textCell.getBackground(), Theme.getColor(null, Theme.key_listSelector, false), true);
                this.dayNightCell.setColors(-1, Theme.key_windowBackgroundWhiteBlueText4);
            }
            TextCell textCell2 = this.browseThemesCell;
            if (textCell2 != null) {
                textCell2.setBackground(Theme.createSelectorWithBackgroundDrawable(Theme.getColor(null, Theme.key_windowBackgroundWhite, false), Theme.getColor(null, Theme.key_listSelector, false)));
                TextCell textCell3 = this.browseThemesCell;
                int i2 = Theme.key_windowBackgroundWhiteBlueText4;
                textCell3.setColors(i2, i2);
            }
        }
    }

    public void updateDayNightMode() {
        int i;
        int i2;
        int i3 = this.currentType;
        if (i3 == 0 || i3 == -1) {
            this.themeIndex = Theme.isCurrentThemeDay() ? 0 : 2;
        } else if (Theme.currentTheme.getKey().equals("Blue")) {
            this.themeIndex = 0;
        } else if (Theme.currentTheme.getKey().equals("Day")) {
            this.themeIndex = 1;
        } else if (Theme.currentTheme.getKey().equals("Night")) {
            this.themeIndex = 2;
        } else if (Theme.currentTheme.getKey().equals("Dark Blue")) {
            this.themeIndex = 3;
        } else {
            if (Theme.isCurrentThemeDay() && ((i2 = this.themeIndex) == 2 || i2 == 3)) {
                this.themeIndex = 0;
            }
            if (!Theme.isCurrentThemeDay() && ((i = this.themeIndex) == 0 || i == 1)) {
                this.themeIndex = 2;
            }
        }
        if (this.adapter.items != null) {
            for (int i4 = 0; i4 < this.adapter.items.size(); i4++) {
                this.adapter.items.get(i4).themeIndex = this.themeIndex;
            }
            ChatThemeBottomSheet.Adapter adapter = this.adapter;
            adapter.notifyItemRangeChanged(0, adapter.items.size());
        }
        updateSelectedPosition();
    }

    public void updateLayoutManager() {
        Point point = AndroidUtilities.displaySize;
        boolean z = point.y > point.x;
        Boolean bool = this.wasPortrait;
        if (bool == null || bool.booleanValue() != z) {
            int i = this.currentType;
            if (i != 0 && i != -1) {
                int i2 = z ? 3 : 9;
                LinearLayoutManager linearLayoutManager = this.layoutManager;
                if (linearLayoutManager instanceof GridLayoutManager) {
                    ((GridLayoutManager) linearLayoutManager).setSpanCount(i2);
                } else {
                    this.recyclerView.setHasFixedSize(false);
                    getContext();
                    GridLayoutManager gridLayoutManager = new GridLayoutManager(i2);
                    gridLayoutManager.setSpanSizeLookup(new GridLayoutManager.SpanSizeLookup() {
                        @Override
                        public int getSpanSize(int i3) {
                            return 1;
                        }
                    });
                    RecyclerListView recyclerListView = this.recyclerView;
                    this.layoutManager = gridLayoutManager;
                    recyclerListView.setLayoutManager(gridLayoutManager);
                }
            } else if (this.layoutManager == null) {
                RecyclerListView recyclerListView2 = this.recyclerView;
                getContext();
                LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(0, false);
                this.layoutManager = linearLayoutManager2;
                recyclerListView2.setLayoutManager(linearLayoutManager2);
            }
            this.wasPortrait = Boolean.valueOf(z);
        }
    }
}
