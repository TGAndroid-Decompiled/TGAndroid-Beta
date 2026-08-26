package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.BaseMenuWrapper;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.graphics.ColorUtils;
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
import org.telegram.ui.Components.TrendingStickersLayout;

public final class DefaultThemesPreviewCell extends LinearLayout {
    public final ChatThemeBottomSheet.Adapter adapter;
    public final TextCell browseThemesCell;
    public final int currentType;
    public final RLottieDrawable darkThemeDrawable;
    public final TextCell dayNightCell;
    public LinearLayoutManager layoutManager;
    public ValueAnimator navBarAnimator;
    public int navBarColor;
    public final MessageSeenView.AnonymousClass1 recyclerView;
    public int selectedPosition;
    public int themeIndex;
    public Boolean wasPortrait;

    public final class AnonymousClass2 implements View.OnClickListener {
        public final Context val$context;
        public final BaseFragment val$parentFragment;

        public AnonymousClass2(Context context, BaseFragment baseFragment) {
            this.val$context = context;
            this.val$parentFragment = baseFragment;
        }

        @Override
        public final void onClick(View view) {
            boolean zIsDark;
            String str;
            Theme.ThemeInfo themeInfo;
            RLottieDrawable rLottieDrawable;
            int i;
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
                    i = 0;
                } else {
                    i = rLottieDrawable.metaData[0] - 1;
                }
                rLottieDrawable.setCustomEndFrame(i);
                DefaultThemesPreviewCell.this.dayNightCell.getImageView().playAnimation();
                int[] iArr = {(DefaultThemesPreviewCell.this.dayNightCell.getImageView().getMeasuredWidth() / 2) + i, RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(DefaultThemesPreviewCell.this.dayNightCell.getImageView().getMeasuredHeight() / 2, 3.0f, i)};
                DefaultThemesPreviewCell.this.dayNightCell.getImageView().getLocationInWindow(iArr);
                int i2 = iArr[0];
                int i3 = iArr[1];
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
                i = rLottieDrawable.metaData[0] - 1;
            } else {
                i = 0;
            }
            rLottieDrawable.setCustomEndFrame(i);
            DefaultThemesPreviewCell.this.dayNightCell.getImageView().playAnimation();
            int[] iArr2 = {(DefaultThemesPreviewCell.this.dayNightCell.getImageView().getMeasuredWidth() / 2) + i2, RichMessageLayout$RichDetailsEndBlock$$ExternalSyntheticOutline0.m(DefaultThemesPreviewCell.this.dayNightCell.getImageView().getMeasuredHeight() / 2, 3.0f, i3)};
            DefaultThemesPreviewCell.this.dayNightCell.getImageView().getLocationInWindow(iArr2);
            int i4 = iArr2[0];
            int i5 = iArr2[1];
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.needSetDayNightTheme, themeInfo, Boolean.FALSE, iArr2, -1, Boolean.valueOf(z2), DefaultThemesPreviewCell.this.dayNightCell.getImageView(), DefaultThemesPreviewCell.this.dayNightCell, new ChatActivity$70$$ExternalSyntheticLambda0(this, color, this.val$context, color2, z2, this.val$parentFragment));
        }

        public final class AnonymousClass1 implements ValueAnimator.AnimatorUpdateListener {
            public final int $r8$classId;
            public final Object this$1;
            public final int val$iconNewColor;
            public int val$iconOldColor;

            public AnonymousClass1(TrendingStickersLayout trendingStickersLayout, int i) {
                this.$r8$classId = 1;
                this.this$1 = trendingStickersLayout;
                this.val$iconNewColor = i;
                this.val$iconOldColor = 0;
            }

            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                switch (this.$r8$classId) {
                    case 0:
                        DefaultThemesPreviewCell.this.darkThemeDrawable.setColorFilter(new PorterDuffColorFilter(ColorUtils.blendARGB(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.val$iconOldColor, this.val$iconNewColor), PorterDuff.Mode.SRC_IN));
                        break;
                    default:
                        int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * this.val$iconNewColor);
                        TrendingStickersLayout trendingStickersLayout = (TrendingStickersLayout) this.this$1;
                        trendingStickersLayout.scrollFromAnimator = true;
                        trendingStickersLayout.listView.scrollBy(0, iFloatValue - this.val$iconOldColor);
                        trendingStickersLayout.scrollFromAnimator = false;
                        this.val$iconOldColor = iFloatValue;
                        break;
                }
            }

            public AnonymousClass1(AnonymousClass2 anonymousClass2, int i, int i2) {
                this.$r8$classId = 0;
                this.this$1 = anonymousClass2;
                this.val$iconOldColor = i;
                this.val$iconNewColor = i2;
            }
        }
    }

    public final class AnonymousClass3 extends BaseMenuWrapper {
        public final int $r8$classId;

        public AnonymousClass3(int i) {
            this.$r8$classId = i;
        }

        @Override
        public int getSpanIndex(int i, int i2) {
            switch (this.$r8$classId) {
                case 1:
                    return i % i2;
                default:
                    return super.getSpanIndex(i, i2);
            }
        }

        @Override
        public final int getSpanSize(int i) {
            switch (this.$r8$classId) {
            }
            return 1;
        }
    }

    public DefaultThemesPreviewCell(int i, Context context, BaseFragment baseFragment) {
        LinearLayoutManager linearLayoutManager;
        Theme.ThemeInfo themeInfo;
        String string;
        Theme.ThemeInfo themeInfo2;
        super(context);
        Theme.ResourcesProvider resourcesProvider = null;
        this.layoutManager = null;
        this.selectedPosition = -1;
        this.wasPortrait = null;
        this.currentType = i;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, LayoutHelper.createFrame(-2.0f, -1));
        ChatThemeBottomSheet.Adapter adapter = new ChatThemeBottomSheet.Adapter(baseFragment.getCurrentAccount(), 0L, null, (i == 0 || i == -1) ? 0 : 1);
        this.adapter = adapter;
        MessageSeenView.AnonymousClass1 anonymousClass1 = new MessageSeenView.AnonymousClass1(getContext(), 8, resourcesProvider);
        this.recyclerView = anonymousClass1;
        anonymousClass1.setAdapter(adapter);
        anonymousClass1.setSelectorDrawableColor(0);
        anonymousClass1.setClipChildren(false);
        anonymousClass1.setClipToPadding(false);
        anonymousClass1.setHasFixedSize(true);
        anonymousClass1.setItemAnimator(null);
        anonymousClass1.setNestedScrollingEnabled(false);
        updateLayoutManager();
        anonymousClass1.setFocusable(false);
        anonymousClass1.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        anonymousClass1.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda0(14, this, baseFragment));
        FlickerLoadingView flickerLoadingView = new FlickerLoadingView(getContext(), null);
        flickerLoadingView.setViewType(14);
        flickerLoadingView.setVisibility(0);
        if (i == 0 || i == -1) {
            frameLayout.addView(flickerLoadingView, LayoutHelper.createFrame(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(anonymousClass1, LayoutHelper.createFrame(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(flickerLoadingView, LayoutHelper.createFrame(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(anonymousClass1, LayoutHelper.createFrame(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        anonymousClass1.setEmptyView(flickerLoadingView);
        anonymousClass1.animateEmptyView = true;
        anonymousClass1.emptyViewAnimationType = 0;
        if (i == 0) {
            int i2 = R.raw.sun_outline;
            RLottieDrawable rLottieDrawable = new RLottieDrawable(i2, SurfaceContainer$$ExternalSyntheticOutline0.m(i2, ""), AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.darkThemeDrawable = rLottieDrawable;
            rLottieDrawable.playInDirectionOfCustomEndFrame = true;
            rLottieDrawable.applyingLayerColors = true;
            rLottieDrawable.commitApplyLayerColors();
            TextCell textCell = new TextCell(context);
            this.dayNightCell = textCell;
            textCell.setBackground(Theme.createSelectorDrawable(Theme.getColor(null, Theme.key_listSelector, false), 2, -1));
            textCell.imageLeft = 21;
            addView(textCell, LayoutHelper.createFrame(-2.0f, -1));
            TextCell textCell2 = new TextCell(context);
            this.browseThemesCell = textCell2;
            textCell2.setTextAndIcon(R.drawable.msg_colors, (CharSequence) LocaleController.getString(R.string.SettingsBrowseThemes), false);
            addView(textCell2, LayoutHelper.createFrame(-2.0f, -1));
            textCell.setOnClickListener(new AnonymousClass2(context, baseFragment));
            rLottieDrawable.playInDirectionOfCustomEndFrame = true;
            textCell2.setOnClickListener(new GroupCallSheet$$ExternalSyntheticLambda5(baseFragment, 15));
            if (Theme.isCurrentThemeDay()) {
                textCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.SettingsSwitchToNightMode), (Drawable) rLottieDrawable, true);
            } else {
                rLottieDrawable.setCurrentFrame(rLottieDrawable.metaData[0] - 1, true, false);
                textCell.setTextAndIcon((CharSequence) LocaleController.getString(R.string.SettingsSwitchToDayMode), (Drawable) rLottieDrawable, true);
            }
        }
        if (!MediaDataController.getInstance(baseFragment.getCurrentAccount()).defaultEmojiThemes.isEmpty()) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(baseFragment.getCurrentAccount()).defaultEmojiThemes);
            if (i == 0) {
                EmojiThemes emojiThemes = new EmojiThemes(baseFragment.getCurrentAccount());
                emojiThemes.emoji = "🎨";
                emojiThemes.key = new ThemeKey("🎨", null);
                emojiThemes.chatTheme = TLRPC.ChatTheme.ofEmoticon("🎨");
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string2 = sharedPreferences.getString("lastDayCustomTheme", null);
                int i3 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i4 = 99;
                String str = "Blue";
                if (string2 != null) {
                    HashMap map = Theme.themesDict;
                    if (((Theme.ThemeInfo) map.get(string2)) == null) {
                        string2 = sharedPreferences.getString("lastDayTheme", "Blue");
                        themeInfo = (Theme.ThemeInfo) Theme.themesDict.get(string2);
                        if (themeInfo == null) {
                            string2 = "Blue";
                            i3 = 99;
                        } else {
                            i3 = themeInfo.currentAccentId;
                        }
                        sharedPreferences.edit().putString("lastDayCustomTheme", string2).apply();
                    } else if (i3 == -1) {
                        i3 = ((Theme.ThemeInfo) map.get(string2)).lastAccentId;
                    }
                } else {
                    string2 = sharedPreferences.getString("lastDayTheme", "Blue");
                    themeInfo = (Theme.ThemeInfo) Theme.themesDict.get(string2);
                    if (themeInfo == null) {
                        string2 = "Blue";
                        i3 = 99;
                    } else {
                        i3 = themeInfo.currentAccentId;
                    }
                    sharedPreferences.edit().putString("lastDayCustomTheme", string2).apply();
                }
                if (i3 != -1) {
                    str = string2;
                    i4 = i3;
                }
                String string3 = sharedPreferences.getString("lastDarkCustomTheme", null);
                int i5 = sharedPreferences.getInt("lastDarkCustomThemeAccentId", -1);
                String str2 = "Dark Blue";
                if (string3 != null) {
                    HashMap map2 = Theme.themesDict;
                    if (((Theme.ThemeInfo) map2.get(string3)) == null) {
                        string = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                        themeInfo2 = (Theme.ThemeInfo) Theme.themesDict.get(string);
                        if (themeInfo2 == null) {
                            string3 = "Dark Blue";
                            i5 = 0;
                        } else {
                            i5 = themeInfo2.currentAccentId;
                            string3 = string;
                        }
                        sharedPreferences.edit().putString("lastDarkCustomTheme", string3).apply();
                    } else if (i5 == -1) {
                        i5 = ((Theme.ThemeInfo) map2.get(str)).lastAccentId;
                    }
                } else {
                    string = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    themeInfo2 = (Theme.ThemeInfo) Theme.themesDict.get(string);
                    if (themeInfo2 == null) {
                        string3 = "Dark Blue";
                        i5 = 0;
                    } else {
                        i5 = themeInfo2.currentAccentId;
                        string3 = string;
                    }
                    sharedPreferences.edit().putString("lastDarkCustomTheme", string3).apply();
                }
                if (i5 == -1) {
                    i5 = 0;
                } else {
                    str2 = string3;
                }
                EmojiThemes.ThemeItem themeItem = new EmojiThemes.ThemeItem();
                HashMap map3 = Theme.themesDict;
                themeItem.themeInfo = (Theme.ThemeInfo) map3.get(str);
                themeItem.accentId = i4;
                emojiThemes.items.add(themeItem);
                emojiThemes.items.add(null);
                EmojiThemes.ThemeItem themeItem2 = new EmojiThemes.ThemeItem();
                themeItem2.themeInfo = (Theme.ThemeInfo) map3.get(str2);
                themeItem2.accentId = i5;
                emojiThemes.items.add(themeItem2);
                emojiThemes.items.add(null);
                emojiThemes.loadPreviewColors(baseFragment.getCurrentAccount());
                ChatThemeBottomSheet.ChatThemeItem chatThemeItem = new ChatThemeBottomSheet.ChatThemeItem(emojiThemes);
                chatThemeItem.themeIndex = Theme.isCurrentThemeDay() ? 0 : 2;
                arrayList.add(chatThemeItem);
            }
            adapter.items = arrayList;
            adapter.mObservable.notifyChanged();
        }
        updateDayNightMode();
        updateSelectedPosition();
        updateColors();
        int i6 = this.selectedPosition;
        if (i6 < 0 || (linearLayoutManager = this.layoutManager) == null) {
            return;
        }
        linearLayoutManager.scrollToPositionWithOffset(i6, AndroidUtilities.dp(16.0f), linearLayoutManager.mShouldReverseLayout);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        updateLayoutManager();
        super.onMeasure(i, i2);
    }

    @Override
    public void setBackgroundColor(int i) {
        super.setBackgroundColor(i);
        updateColors();
    }

    public final void updateColors() {
        int i = this.currentType;
        if (i == 0 || i == -1) {
            RLottieDrawable rLottieDrawable = this.darkThemeDrawable;
            if (rLottieDrawable != null) {
                rLottieDrawable.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlueText4, false), PorterDuff.Mode.SRC_IN));
            }
            TextCell textCell = this.dayNightCell;
            if (textCell != null) {
                Theme.setSelectorDrawableColor(textCell.getBackground(), Theme.getColor(null, Theme.key_listSelector, false), true);
                textCell.setColors(-1, Theme.key_windowBackgroundWhiteBlueText4);
            }
            TextCell textCell2 = this.browseThemesCell;
            if (textCell2 != null) {
                textCell2.setBackground(Theme.createSelectorWithBackgroundDrawable(Theme.getColor(null, Theme.key_windowBackgroundWhite, false), Theme.getColor(null, Theme.key_listSelector, false)));
                int i2 = Theme.key_windowBackgroundWhiteBlueText4;
                textCell2.setColors(i2, i2);
            }
        }
    }

    public final void updateDayNightMode() {
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
        ChatThemeBottomSheet.Adapter adapter = this.adapter;
        if (adapter.items != null) {
            for (int i4 = 0; i4 < adapter.items.size(); i4++) {
                ((ChatThemeBottomSheet.ChatThemeItem) adapter.items.get(i4)).themeIndex = this.themeIndex;
            }
            adapter.mObservable.notifyItemRangeChanged(0, adapter.items.size(), null);
        }
        updateSelectedPosition();
    }

    public final void updateLayoutManager() {
        Point point = AndroidUtilities.displaySize;
        boolean z = point.y > point.x;
        Boolean bool = this.wasPortrait;
        if (bool == null || bool.booleanValue() != z) {
            MessageSeenView.AnonymousClass1 anonymousClass1 = this.recyclerView;
            int i = this.currentType;
            if (i != 0 && i != -1) {
                int i2 = z ? 3 : 9;
                LinearLayoutManager linearLayoutManager = this.layoutManager;
                if (linearLayoutManager instanceof GridLayoutManager) {
                    ((GridLayoutManager) linearLayoutManager).setSpanCount(i2);
                } else {
                    anonymousClass1.setHasFixedSize(false);
                    getContext();
                    GridLayoutManager gridLayoutManager = new GridLayoutManager(i2);
                    gridLayoutManager.mSpanSizeLookup = new AnonymousClass3(0);
                    this.layoutManager = gridLayoutManager;
                    anonymousClass1.setLayoutManager(gridLayoutManager);
                }
            } else if (this.layoutManager == null) {
                getContext();
                LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(0, false);
                this.layoutManager = linearLayoutManager2;
                anonymousClass1.setLayoutManager(linearLayoutManager2);
            }
            this.wasPortrait = Boolean.valueOf(z);
        }
    }

    public final void updateSelectedPosition() {
        ChatThemeBottomSheet.Adapter adapter = this.adapter;
        if (adapter.items == null) {
            return;
        }
        this.selectedPosition = -1;
        for (int i = 0; i < adapter.items.size(); i++) {
            TLRPC.TL_theme tL_theme = ((EmojiThemes.ThemeItem) ((ChatThemeBottomSheet.ChatThemeItem) adapter.items.get(i)).chatTheme.items.get(this.themeIndex)).tlTheme;
            Theme.ThemeInfo themeInfo = ((EmojiThemes.ThemeItem) ((ChatThemeBottomSheet.ChatThemeItem) adapter.items.get(i)).chatTheme.items.get(this.themeIndex)).themeInfo;
            if (tL_theme != null) {
                if (Theme.currentTheme.name.equals(Theme.getBaseThemeKey(tL_theme.settings.get(((EmojiThemes.ThemeItem) ((ChatThemeBottomSheet.ChatThemeItem) adapter.items.get(i)).chatTheme.items.get(this.themeIndex)).settingsIndex)))) {
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
                    if (((EmojiThemes.ThemeItem) ((ChatThemeBottomSheet.ChatThemeItem) adapter.items.get(i)).chatTheme.items.get(this.themeIndex)).accentId == Theme.currentTheme.currentAccentId) {
                        this.selectedPosition = i;
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        if (this.selectedPosition == -1 && this.currentType != 3) {
            this.selectedPosition = adapter.items.size() - 1;
        }
        int i2 = 0;
        while (i2 < adapter.items.size()) {
            ((ChatThemeBottomSheet.ChatThemeItem) adapter.items.get(i2)).isSelected = i2 == this.selectedPosition;
            i2++;
        }
        adapter.setSelectedItem(this.selectedPosition);
    }
}
