package org.telegram.ui.Gifts;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
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
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_common.zzlb;
import j$.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import me.vkryl.android.animator.BoolAnimator;
import me.vkryl.android.animator.FactorAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController$$ExternalSyntheticOutline0;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.utils.tlutils.AmountUtils$Currency;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.AccountFrozenAlert$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.AlertDialog$$ExternalSyntheticLambda1;
import org.telegram.ui.ActionBar.BackDrawable;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.INavigationLayout;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Cells.DialogCell$$ExternalSyntheticLambda6;
import org.telegram.ui.Cells.HeaderCell;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.ChatActivity$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.BackupImageView;
import org.telegram.ui.Components.BottomSheetWithRecyclerListView;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.CheckBox2;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.EditTextCaption;
import org.telegram.ui.Components.EditTextCaption$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.FireworksOverlay;
import org.telegram.ui.Components.FlickerLoadingView;
import org.telegram.ui.Components.FragmentFloatingButton;
import org.telegram.ui.Components.ItemOptions;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.LinkSpanDrawable;
import org.telegram.ui.Components.Paint.ColorPickerBottomSheet;
import org.telegram.ui.Components.RLottieDrawable;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.ScaleStateListAnimator;
import org.telegram.ui.Components.SizeNotifierFrameLayout;
import org.telegram.ui.Components.TypefaceSpan;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.Components.blur3.BlurredBackgroundDrawableViewFactory;
import org.telegram.ui.Components.blur3.drawable.BlurredBackgroundDrawable;
import org.telegram.ui.Components.blur3.drawable.color.impl.BlurredBackgroundProviderImpl;
import org.telegram.ui.Components.blur3.source.BlurredBackgroundSourceColor;
import org.telegram.ui.Components.voip.RateCallLayout$$ExternalSyntheticLambda1;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PeerColorActivity$$ExternalSyntheticLambda12;
import org.telegram.ui.Stars.GiftOfferSheet$$ExternalSyntheticLambda12;
import org.telegram.ui.Stars.StarGiftPreviewSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda95;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stars.StarsIntroActivity;
import org.telegram.ui.Stars.StarsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4;
import org.telegram.ui.Stories.LivePlayer$$ExternalSyntheticLambda1;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda20;
import org.telegram.ui.iv.RichEditor$$ExternalSyntheticLambda30;
import org.telegram.ui.web.HistoryFragment;

public class ResaleGiftsFragment extends BaseFragment implements FactorAnimator.Target {
    public final BoolAnimator animatorClearFiltersButtonVisible;
    public BackDrawable backDrawable;
    public Filter backdropButton;
    public TextView clearFiltersButton;
    public FrameLayout clearFiltersContainer;
    public Utilities.Callback closeParentSheet;
    public final long dialogId;
    public LargeEmptyView emptyView;
    public boolean emptyViewVisible;
    public HorizontalScrollView filterScrollView;
    public LinearLayout filtersContainer;
    public View filtersDivider;
    public boolean filtersShown;
    public FireworksOverlay fireworksOverlay;
    public final String gift_name;
    public BlurredBackgroundDrawableViewFactory iBlur3Factory;
    public BlurredBackgroundSourceColor iBlur3SourceColor;
    public final ResaleGiftsList list;
    public AnonymousClass3 listView;
    public Filter modelButton;
    public FrameLayout onlyStarsContainer;
    public Filter patternButton;
    public Filter sortButton;

    public final class AnonymousClass11 extends AnimatorListenerAdapter {
        public final int $r8$classId;
        public final ResaleGiftsFragment this$0;
        public final boolean val$show;

        public AnonymousClass11(ResaleGiftsFragment resaleGiftsFragment, boolean z, int i) {
            this.$r8$classId = i;
            this.this$0 = resaleGiftsFragment;
            this.val$show = z;
        }

        @Override
        public final void onAnimationEnd(Animator animator) {
            switch (this.$r8$classId) {
                case 0:
                    if (!this.val$show) {
                        this.this$0.filterScrollView.setVisibility(8);
                    }
                    break;
                default:
                    if (!this.val$show) {
                        this.this$0.emptyView.setVisibility(8);
                    }
                    break;
            }
        }
    }

    public final class AnonymousClass3 extends UniversalRecyclerView {
        @Override
        public final Integer getSelectorColor(int i) {
            return 0;
        }
    }

    public final class AnonymousClass5 extends UniversalRecyclerView {
        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (AndroidUtilities.displaySize.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
        }
    }

    public final class AnonymousClass6 implements TextWatcher {
        public final int $r8$classId;
        public final ViewGroup val$listView;
        public Serializable val$query;

        public AnonymousClass6(String[] strArr, UniversalRecyclerView universalRecyclerView, int i) {
            this.$r8$classId = i;
            this.val$query = strArr;
            this.val$listView = universalRecyclerView;
        }

        @Override
        public final void afterTextChanged(Editable editable) {
            ViewGroup viewGroup = this.val$listView;
            switch (this.$r8$classId) {
                case 0:
                    ((String[]) this.val$query)[0] = editable.toString();
                    ((AnonymousClass5) viewGroup).adapter.update(true);
                    break;
                case 1:
                    ColorPickerBottomSheet.SliderCell sliderCell = (ColorPickerBottomSheet.SliderCell) viewGroup;
                    if (!sliderCell.isInvalidatingColor && ((String) this.val$query) != null && editable != null && !TextUtils.isEmpty(editable) && !Objects.equals(((String) this.val$query).toString(), editable.toString())) {
                        int iClamp = MathUtils.clamp(Integer.parseInt(editable.toString()), 0, 255);
                        int i = sliderCell.mode;
                        ColorPickerBottomSheet colorPickerBottomSheet = ColorPickerBottomSheet.this;
                        int iArgb = i != 1 ? i != 2 ? Color.argb(Color.alpha(colorPickerBottomSheet.mColor), iClamp, Color.green(colorPickerBottomSheet.mColor), Color.blue(colorPickerBottomSheet.mColor)) : Color.argb(Color.alpha(colorPickerBottomSheet.mColor), Color.red(colorPickerBottomSheet.mColor), Color.green(colorPickerBottomSheet.mColor), iClamp) : Color.argb(Color.alpha(colorPickerBottomSheet.mColor), Color.red(colorPickerBottomSheet.mColor), iClamp, Color.blue(colorPickerBottomSheet.mColor));
                        int i2 = ColorPickerBottomSheet.$r8$clinit;
                        colorPickerBottomSheet.onSetColor(iArgb, 5);
                    }
                    break;
                case 2:
                    ((String[]) this.val$query)[0] = editable.toString();
                    ((AnonymousClass9) viewGroup).adapter.update(true);
                    break;
                case 3:
                    ((String[]) this.val$query)[0] = editable.toString();
                    ((AnonymousClass7) viewGroup).adapter.update(true);
                    break;
                case 4:
                    ((String[]) this.val$query)[0] = editable.toString();
                    ((SelectGiftSheet.AnonymousClass1) viewGroup).adapter.update(true);
                    break;
                case 5:
                    ((String[]) this.val$query)[0] = editable.toString();
                    ((SelectGiftSheet.AnonymousClass3) viewGroup).adapter.update(true);
                    break;
                default:
                    ((String[]) this.val$query)[0] = editable.toString();
                    ((SelectGiftSheet.AnonymousClass5) viewGroup).adapter.update(true);
                    break;
            }
        }

        @Override
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            switch (this.$r8$classId) {
                case 1:
                    this.val$query = charSequence.toString();
                    break;
            }
        }

        @Override
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            int i4 = this.$r8$classId;
        }

        public AnonymousClass6(ColorPickerBottomSheet.SliderCell sliderCell) {
            this.$r8$classId = 1;
            this.val$listView = sliderCell;
        }

        private final void beforeTextChanged$org$telegram$ui$Gifts$ResaleGiftsFragment$10(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$Gifts$ResaleGiftsFragment$6(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$Gifts$ResaleGiftsFragment$8(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$Gifts$ResaleGiftsFragment$SelectGiftSheet$2(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$Gifts$ResaleGiftsFragment$SelectGiftSheet$4(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void beforeTextChanged$org$telegram$ui$Gifts$ResaleGiftsFragment$SelectGiftSheet$6(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$Components$Paint$ColorPickerBottomSheet$SliderCell$1(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$Gifts$ResaleGiftsFragment$10(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$Gifts$ResaleGiftsFragment$6(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$Gifts$ResaleGiftsFragment$8(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$Gifts$ResaleGiftsFragment$SelectGiftSheet$2(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$Gifts$ResaleGiftsFragment$SelectGiftSheet$4(int i, int i2, int i3, CharSequence charSequence) {
        }

        private final void onTextChanged$org$telegram$ui$Gifts$ResaleGiftsFragment$SelectGiftSheet$6(int i, int i2, int i3, CharSequence charSequence) {
        }
    }

    public final class AnonymousClass7 extends UniversalRecyclerView {
        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (AndroidUtilities.displaySize.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
        }
    }

    public final class AnonymousClass9 extends UniversalRecyclerView {
        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (AndroidUtilities.displaySize.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
        }
    }

    public final class BackdropItem extends ActionBarMenuSubItem {

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((BackdropItem) view).set((TL_stars.starGiftAttributeBackdrop) uItem.object, uItem.intValue, (String) uItem.text, uItem.checked);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                BackdropItem backdropItem = new BackdropItem(0, context, resourcesProvider, false, false);
                backdropItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
                backdropItem.setColors(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider), Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, resourcesProvider));
                backdropItem.setIconColor(-1, PorterDuff.Mode.MULTIPLY);
                backdropItem.imageView.setTranslationX(AndroidUtilities.dp(2.0f));
                backdropItem.makeCheckView(2);
                backdropItem.setBackground(null);
                return backdropItem;
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
                size = AndroidUtilities.dp(250.0f);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
        }

        public final void set(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop, int i, String str, boolean z) {
            Drawable drawableCreateCircleDrawable = Theme.createCircleDrawable(AndroidUtilities.dp(20.0f), stargiftattributebackdrop.center_color | (-16777216));
            CharSequence charSequenceHighlightText = stargiftattributebackdrop.name;
            if (!TextUtils.isEmpty(str)) {
                charSequenceHighlightText = AndroidUtilities.highlightText(charSequenceHighlightText, str, this.resourcesProvider);
            }
            if (i > 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceHighlightText);
                spannableStringBuilder.append((CharSequence) "  ");
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) Integer.toString(i));
                spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
                charSequenceHighlightText = spannableStringBuilder;
            }
            setTextAndIcon(charSequenceHighlightText, 0, drawableCreateCircleDrawable);
            setChecked(z);
        }
    }

    public final class EmptyView extends LinearLayout {
        public final TextView textView;

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((EmptyView) view).set(uItem.text);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new EmptyView(context, resourcesProvider);
            }
        }

        public EmptyView(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            setOrientation(1);
            BackupImageView backupImageView = new BackupImageView(context);
            backupImageView.setImageDrawable(new RLottieDrawable(R.raw.utyan_empty, "utyan_empty", AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
            addView(backupImageView, LayoutHelper.createLinear(64, 64, 17, 0, 32, 0, 0));
            TextView textView = new TextView(context);
            this.textView = textView;
            OKLCH.m(Theme.key_windowBackgroundWhiteGrayText3, resourcesProvider, textView, 14.0f);
            textView.setGravity(17);
            addView(textView, LayoutHelper.createLinear(-1, -2, 7, 12, 12, 12, 24));
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
                size = AndroidUtilities.dp(250.0f);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
        }

        public void set(CharSequence charSequence) {
            this.textView.setText(charSequence);
        }
    }

    public final class Filter extends TextView {
        public final ColoredImageSpan span;

        public Filter(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            int color = Theme.getColor(Theme.key_actionBarActionModeDefaultIcon, resourcesProvider);
            setTextColor(color);
            setBackground(Theme.createRadSelectorDrawable(Theme.multAlpha(0.08f, color), Theme.multAlpha(0.15f, color), AndroidUtilities.dp(13.0f), AndroidUtilities.dp(13.0f)));
            setPadding(AndroidUtilities.dp(11.0f), 0, AndroidUtilities.dp(11.0f), 0);
            setGravity(17);
            setTypeface(AndroidUtilities.bold());
            ScaleStateListAnimator.apply(this);
            ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.arrows_select);
            this.span = coloredImageSpan;
            coloredImageSpan.spaceScaleX = 0.8f;
            coloredImageSpan.translate(0.0f, AndroidUtilities.dp(1.0f));
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(26.0f), 1073741824));
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
    }

    public final class LargeEmptyView extends FrameLayout {
    }

    public final class ModelItem extends ActionBarMenuSubItem {
        public final int currentAccount;
        public AnonymousClass2 emojiDrawable;
        public long emojiDrawableId;

        public final class AnonymousClass2 extends AnimatedEmojiDrawable {
            @Override
            public final int getIntrinsicHeight() {
                return AndroidUtilities.dp(24.0f);
            }

            @Override
            public final int getIntrinsicWidth() {
                return AndroidUtilities.dp(24.0f);
            }
        }

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((ModelItem) view).set((TL_stars.starGiftAttributeModel) uItem.object, uItem.intValue, (String) uItem.text, uItem.checked);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new ModelItem(context, i, resourcesProvider);
            }
        }

        public ModelItem(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(0, context, resourcesProvider, false, false);
            this.currentAccount = i;
            setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            setColors(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider), Theme.getColor(Theme.key_actionBarDefaultSubmenuItemIcon, resourcesProvider));
            setIconColor(-1);
            this.imageView.setTranslationX(AndroidUtilities.dp(2.0f));
            this.imageView.setScaleX(1.2f);
            this.imageView.setScaleY(1.2f);
            makeCheckView(2);
            setBackground(null);
            this.imageView.addOnAttachStateChangeListener(new StarGiftSheet.Roller.AnonymousClass1(this, 5));
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
                size = AndroidUtilities.dp(250.0f);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
        }

        public final void set(TL_stars.starGiftAttributeModel stargiftattributemodel, int i, String str, boolean z) {
            AnonymousClass2 anonymousClass2 = this.emojiDrawable;
            if (anonymousClass2 == null || this.emojiDrawableId != stargiftattributemodel.document.id) {
                this.emojiDrawableId = stargiftattributemodel.document.id;
                if (anonymousClass2 != null) {
                    anonymousClass2.removeView(this.imageView);
                }
                this.emojiDrawable = new AnonymousClass2(3, this.currentAccount, stargiftattributemodel.document);
            }
            if (this.imageView.isAttachedToWindow()) {
                this.emojiDrawable.addView(this.imageView);
            }
            CharSequence charSequenceHighlightText = stargiftattributemodel.name;
            if (!TextUtils.isEmpty(str)) {
                charSequenceHighlightText = AndroidUtilities.highlightText(charSequenceHighlightText, str, this.resourcesProvider);
            }
            if (i > 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceHighlightText);
                spannableStringBuilder.append((CharSequence) "  ");
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) Integer.toString(i));
                spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
                charSequenceHighlightText = spannableStringBuilder;
            }
            setTextAndIcon(charSequenceHighlightText, 0, this.emojiDrawable);
            setChecked(z);
        }
    }

    public final class PatternItem extends ActionBarMenuSubItem {
        public final int currentAccount;
        public AnonymousClass2 emojiDrawable;
        public long emojiDrawableId;

        public final class AnonymousClass2 extends AnimatedEmojiDrawable {
            @Override
            public final int getIntrinsicHeight() {
                return AndroidUtilities.dp(24.0f);
            }

            @Override
            public final int getIntrinsicWidth() {
                return AndroidUtilities.dp(24.0f);
            }
        }

        public final class Factory extends UItem.UItemFactory {
            public static final int $r8$clinit = 0;

            static {
                UItem.UItemFactory.setup(new Factory());
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                ((PatternItem) view).set((TL_stars.starGiftAttributePattern) uItem.object, uItem.intValue, (String) uItem.text, uItem.checked);
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new PatternItem(context, i, resourcesProvider);
            }
        }

        public PatternItem(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
            super(0, context, resourcesProvider, false, false);
            this.currentAccount = i;
            setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
            int color = Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, resourcesProvider);
            int i2 = Theme.key_actionBarDefaultSubmenuItemIcon;
            setColors(color, Theme.getColor(i2, resourcesProvider));
            setIconColor(Theme.getColor(i2, resourcesProvider), PorterDuff.Mode.SRC_IN);
            this.imageView.setTranslationX(AndroidUtilities.dp(2.0f));
            makeCheckView(2);
            setBackground(null);
            this.imageView.addOnAttachStateChangeListener(new StarGiftSheet.Roller.AnonymousClass1(this, 6));
        }

        @Override
        public final void onMeasure(int i, int i2) {
            int size = View.MeasureSpec.getSize(i);
            if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
                size = AndroidUtilities.dp(250.0f);
            }
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), i2);
        }

        public final void set(TL_stars.starGiftAttributePattern stargiftattributepattern, int i, String str, boolean z) {
            AnonymousClass2 anonymousClass2 = this.emojiDrawable;
            if (anonymousClass2 == null || this.emojiDrawableId != stargiftattributepattern.document.id) {
                this.emojiDrawableId = stargiftattributepattern.document.id;
                if (anonymousClass2 != null) {
                    anonymousClass2.removeView(this.imageView);
                }
                AnonymousClass2 anonymousClass3 = new AnonymousClass2(3, this.currentAccount, stargiftattributepattern.document);
                this.emojiDrawable = anonymousClass3;
                anonymousClass3.setColorFilter(new PorterDuffColorFilter(Theme.getColor(Theme.key_actionBarDefaultSubmenuItem, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            }
            if (this.imageView.isAttachedToWindow()) {
                this.emojiDrawable.addView(this.imageView);
            }
            CharSequence charSequenceHighlightText = stargiftattributepattern.name;
            if (!TextUtils.isEmpty(str)) {
                charSequenceHighlightText = AndroidUtilities.highlightText(charSequenceHighlightText, str, this.resourcesProvider);
            }
            if (i > 0) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceHighlightText);
                spannableStringBuilder.append((CharSequence) "  ");
                int length = spannableStringBuilder.length();
                spannableStringBuilder.append((CharSequence) Integer.toString(i));
                spannableStringBuilder.setSpan(new TypefaceSpan(AndroidUtilities.bold()), length, spannableStringBuilder.length(), 33);
                charSequenceHighlightText = spannableStringBuilder;
            }
            setTextAndIcon(charSequenceHighlightText, 0, this.emojiDrawable);
            setChecked(z);
        }
    }

    public final class ResaleGiftsList implements StarsController.IGiftsList {
        public final int account;
        public long attributes_hash;
        public boolean for_craft;
        public final long gift_id;
        public String last_offset;
        public boolean loading;
        public final Utilities.Callback onUpdate;
        public boolean starsOnly;
        public int totalCount;
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
        public Sorting sorting = Sorting.BY_PRICE;
        public boolean endReached = false;
        public int reqId = -1;

        public enum Sorting {
            BY_PRICE(R.string.ResellGiftFilterSortPrice),
            BY_DATE(R.string.ResellGiftFilterSortDate),
            BY_NUMBER(R.string.ResellGiftFilterSortNumber);

            public final int buttonStringResId;

            Sorting(int i) {
                this.buttonStringResId = i;
            }
        }

        public ResaleGiftsList(long j, int i, Utilities.Callback callback) {
            this.account = i;
            this.gift_id = j;
            this.onUpdate = callback;
        }

        public final void cancel() {
            if (this.reqId >= 0) {
                ConnectionsManager.getInstance(this.account).cancelRequest(this.reqId, true);
                this.reqId = -1;
            }
            this.loading = false;
        }

        @Override
        public final int findGiftToUpgrade(int i) {
            return -1;
        }

        @Override
        public final Object get(int i) {
            return this.gifts.get(i);
        }

        @Override
        public final int getLoadedCount() {
            return this.gifts.size();
        }

        @Override
        public final int getTotalCount() {
            return this.totalCount;
        }

        @Override
        public final int indexOf(Object obj) {
            return this.gifts.indexOf(obj);
        }

        @Override
        public final void load() {
            load(false);
        }

        @Override
        public final void notifyUpdate() {
        }

        public final void reload() {
            cancel();
            this.last_offset = null;
            this.gifts.clear();
            load(true);
            Utilities.Callback callback = this.onUpdate;
            if (callback != null) {
                callback.run(Boolean.TRUE);
            }
        }

        public final void setSorting(Sorting sorting) {
            if (this.sorting != sorting) {
                this.sorting = sorting;
                reload();
            }
        }

        public final void load(boolean z) {
            if (this.loading) {
                return;
            }
            if (z || !this.endReached) {
                this.loading = true;
                TL_stars.getResaleStarGifts getresalestargifts = new TL_stars.getResaleStarGifts();
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
                int i = 0;
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
                ArrayList arrayList = this.patternAttributes;
                ArrayList arrayList2 = this.backdropAttributes;
                ArrayList arrayList3 = this.modelAttributes;
                if (j != 0) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = j;
                } else if (arrayList3.isEmpty() && arrayList2.isEmpty() && arrayList.isEmpty()) {
                    getresalestargifts.flags = 1 | getresalestargifts.flags;
                    getresalestargifts.attributes_hash = 0L;
                }
                HashSet hashSet = this.notSelectedModelAttributes;
                boolean zIsEmpty = hashSet.isEmpty();
                HashSet hashSet2 = this.notSelectedPatternAttributes;
                HashSet hashSet3 = this.notSelectedBackdropAttributes;
                if (!zIsEmpty || !hashSet3.isEmpty() || !hashSet2.isEmpty()) {
                    getresalestargifts.flags |= 8;
                    if (!hashSet.isEmpty()) {
                        int size = arrayList3.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList3.get(i2);
                            i2++;
                            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) obj;
                            if (!hashSet.contains(Long.valueOf(stargiftattributemodel.document.id))) {
                                TL_stars.starGiftAttributeIdModel stargiftattributeidmodel = new TL_stars.starGiftAttributeIdModel();
                                stargiftattributeidmodel.document_id = stargiftattributemodel.document.id;
                                getresalestargifts.attributes.add(stargiftattributeidmodel);
                            }
                        }
                    }
                    if (!hashSet3.isEmpty()) {
                        int size2 = arrayList2.size();
                        int i3 = 0;
                        while (i3 < size2) {
                            Object obj2 = arrayList2.get(i3);
                            i3++;
                            TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) obj2;
                            if (!hashSet3.contains(Integer.valueOf(stargiftattributebackdrop.backdrop_id))) {
                                TL_stars.starGiftAttributeIdBackdrop stargiftattributeidbackdrop = new TL_stars.starGiftAttributeIdBackdrop();
                                stargiftattributeidbackdrop.backdrop_id = stargiftattributebackdrop.backdrop_id;
                                getresalestargifts.attributes.add(stargiftattributeidbackdrop);
                            }
                        }
                    }
                    if (!hashSet2.isEmpty()) {
                        int size3 = arrayList.size();
                        while (i < size3) {
                            Object obj3 = arrayList.get(i);
                            i++;
                            TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) obj3;
                            if (!hashSet2.contains(Long.valueOf(stargiftattributepattern.document.id))) {
                                TL_stars.starGiftAttributeIdPattern stargiftattributeidpattern = new TL_stars.starGiftAttributeIdPattern();
                                stargiftattributeidpattern.document_id = stargiftattributepattern.document.id;
                                getresalestargifts.attributes.add(stargiftattributeidpattern);
                            }
                        }
                    }
                }
                this.reqId = ConnectionsManager.getInstance(this.account).sendRequest(getresalestargifts, new StarGiftSheet$$ExternalSyntheticLambda0(17, this, getresalestargifts));
            }
        }
    }

    public final class SelectGiftSheet extends BottomSheetWithRecyclerListView {
        public static final int $r8$clinit = 0;
        public final StarGiftSheet.ActionView actionView;
        public AnonymousClass9 adapter;
        public final Filter backdropButton;
        public final String collectionName;
        public final HorizontalScrollView filterScrollView;
        public boolean hadResaleGifts;
        public final Filter modelButton;
        public StarGiftSheet$$ExternalSyntheticLambda95 onSelect;
        public final Filter patternButton;
        public final Filter sortButton;
        public final State state;
        public boolean willBeFirst;
        public final HashSet without;

        public final class AnonymousClass1 extends UniversalRecyclerView {
            @Override
            public final void onMeasure(int i, int i2) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (AndroidUtilities.displaySize.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
            }
        }

        public final class AnonymousClass3 extends UniversalRecyclerView {
            @Override
            public final void onMeasure(int i, int i2) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (AndroidUtilities.displaySize.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
            }
        }

        public final class AnonymousClass5 extends UniversalRecyclerView {
            @Override
            public final void onMeasure(int i, int i2) {
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(Math.min((int) (AndroidUtilities.displaySize.y * 0.35f), View.MeasureSpec.getSize(i2)), View.MeasureSpec.getMode(i2)));
            }
        }

        public final class State implements NotificationCenter.NotificationCenterDelegate {
            public boolean attached;
            public final int currentAccount;
            public ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda7 currentListener;
            public final StarsController.GiftsList list;
            public final ResaleGiftsList resaleList;

            public State(int i, long j) {
                this.currentAccount = i;
                StarsController.GiftsList giftsList = new StarsController.GiftsList(i, 0L, false);
                this.list = giftsList;
                giftsList.craftingGiftId = j;
                ResaleGiftsList resaleGiftsList = new ResaleGiftsList(j, i, new DialogCell$$ExternalSyntheticLambda6(this, 24));
                resaleGiftsList.for_craft = true;
                this.resaleList = resaleGiftsList;
            }

            public final void detach() {
                if (this.attached) {
                    NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
                    StarsController.GiftsList giftsList = this.list;
                    if (giftsList.currentRequestId != -1) {
                        ConnectionsManager.getInstance(giftsList.currentAccount).cancelRequest(giftsList.currentRequestId, true);
                        giftsList.currentRequestId = -1;
                    }
                    giftsList.loading = false;
                    this.resaleList.cancel();
                    this.attached = false;
                }
            }

            @Override
            public final void didReceivedNotification(int i, int i2, Object... objArr) {
                ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda7 resaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda7;
                if (i == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.list && (resaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda7 = this.currentListener) != null) {
                    resaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda7.run();
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
            linearLayout.setPadding(AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(11.0f), AndroidUtilities.dp(6.0f));
            linearLayout.setOrientation(0);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            HorizontalScrollView horizontalScrollView = new HorizontalScrollView(context);
            this.filterScrollView = horizontalScrollView;
            horizontalScrollView.setHorizontalScrollBarEnabled(false);
            horizontalScrollView.setClipChildren(false);
            horizontalScrollView.setClipToPadding(false);
            horizontalScrollView.addView(linearLayout);
            Filter filter = new Filter(context, this.resourcesProvider);
            this.sortButton = filter;
            filter.setSorting(state.resaleList.sorting);
            linearLayout.addView(filter, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 6, 0));
            filter.setOnClickListener(new RichEditor$$ExternalSyntheticLambda20(3, this, state));
            Filter filter2 = new Filter(context, this.resourcesProvider);
            this.modelButton = filter2;
            filter2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
            linearLayout.addView(filter2, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 6, 0));
            final int i = 0;
            filter2.setOnClickListener(new View.OnClickListener(this) {
                public final ResaleGiftsFragment.SelectGiftSheet f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i) {
                        case 0:
                            this.f$0.lambda$new$9(state, context);
                            break;
                        case 1:
                            this.f$0.lambda$new$15(state, context);
                            break;
                        default:
                            this.f$0.lambda$new$21(state, context);
                            break;
                    }
                }
            });
            Filter filter3 = new Filter(context, this.resourcesProvider);
            this.backdropButton = filter3;
            filter3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
            linearLayout.addView(filter3, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 6, 0));
            final int i2 = 1;
            filter3.setOnClickListener(new View.OnClickListener(this) {
                public final ResaleGiftsFragment.SelectGiftSheet f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i2) {
                        case 0:
                            this.f$0.lambda$new$9(state, context);
                            break;
                        case 1:
                            this.f$0.lambda$new$15(state, context);
                            break;
                        default:
                            this.f$0.lambda$new$21(state, context);
                            break;
                    }
                }
            });
            Filter filter4 = new Filter(context, this.resourcesProvider);
            this.patternButton = filter4;
            filter4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
            linearLayout.addView(filter4, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 0, 0));
            final int i3 = 2;
            filter4.setOnClickListener(new View.OnClickListener(this) {
                public final ResaleGiftsFragment.SelectGiftSheet f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (i3) {
                        case 0:
                            this.f$0.lambda$new$9(state, context);
                            break;
                        case 1:
                            this.f$0.lambda$new$15(state, context);
                            break;
                        default:
                            this.f$0.lambda$new$21(state, context);
                            break;
                    }
                }
            });
            getContext();
            GridLayoutManager gridLayoutManager = new GridLayoutManager(3);
            gridLayoutManager.setSpanSizeLookup(new StarGiftPreviewSheet.AnonymousClass1(this, 1));
            this.recyclerListView.setLayoutManager(gridLayoutManager);
            this.recyclerListView.setOnItemClickListener(new RateCallLayout$$ExternalSyntheticLambda1(15, this, state));
            this.recyclerListView.setPadding(AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(8.0f) + this.backgroundPaddingLeft, 0);
            this.recyclerListView.setOnScrollListener(new StarGiftSheet.AnonymousClass8(this, 11));
            DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
            defaultItemAnimator.setSupportsChangeAnimations(false);
            defaultItemAnimator.setDelayAnimations(false);
            defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            defaultItemAnimator.setDurations(350L);
            this.recyclerListView.lambda$onCellEnter$52(defaultItemAnimator);
            this.recyclerListView.setItemSelectorColorProvider(new LivePlayer$$ExternalSyntheticLambda1(27));
            StarGiftSheet.ActionView actionView = new StarGiftSheet.ActionView(context);
            this.actionView = actionView;
            int iDp = AndroidUtilities.dp(20.0f);
            int iDp2 = AndroidUtilities.dp(9.0f);
            actionView.px = iDp;
            actionView.py = iDp2;
            actionView.setRoundRadius(AndroidUtilities.dp(22.0f));
            actionView.setFullRect(true);
            AndroidUtilities.makeGlobalBlurBitmap(new DialogCell$$ExternalSyntheticLambda6(actionView, 28), 12.0f, 12, null, new ArrayList());
            actionView.setPivotY(0.0f);
            this.container.addView(actionView, LayoutHelper.createFrame(-1, -2, 55));
            update(false);
            state.currentListener = new ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda7(this, 0);
        }

        @Override
        public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
            ?? r0 = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, new GiftSheet$$ExternalSyntheticLambda8(this, 23), this.resourcesProvider) {
                @Override
                public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    SelectGiftSheet selectGiftSheet = SelectGiftSheet.this;
                    if (i == 0) {
                        return new RecyclerListView.Holder(new HeaderCell(selectGiftSheet.getContext(), Theme.key_windowBackgroundWhiteBlueHeader, 13, 12, 4, false, false, ((BottomSheet) selectGiftSheet).resourcesProvider));
                    }
                    return i == 42 ? new RecyclerListView.Holder(new HeaderCell(selectGiftSheet.getContext(), Theme.key_windowBackgroundWhiteBlueHeader, 13, 12, 4, false, true, ((BottomSheet) selectGiftSheet).resourcesProvider)) : super.onCreateViewHolder(viewGroup, i);
                }
            };
            this.adapter = r0;
            return r0;
        }

        public final void fillItems$21(ArrayList arrayList) {
            StarsController.GiftsList giftsList;
            ResaleGiftsList resaleGiftsList;
            State state = this.state;
            if (state == null || (giftsList = state.list) == null || (resaleGiftsList = state.resaleList) == null) {
                return;
            }
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            arrayList.add(UItem.asHeader(-1, LocaleController.getString(R.string.GiftCraftSelectYour)));
            ArrayList arrayList2 = giftsList.gifts;
            int size = arrayList2.size();
            int i = 0;
            int i2 = 0;
            boolean z = true;
            int i3 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (!this.without.contains(Long.valueOf(savedStarGift.gift.id))) {
                    arrayList.add(GiftSheet.GiftCell.Factory.asStarGift(0, savedStarGift.gift, false, true, false, false, true).setEnabled(savedStarGift.can_craft_at <= currentTime));
                    i3++;
                    z = false;
                }
            }
            if (giftsList.loading || !giftsList.endReached) {
                int i4 = i3 % 3;
                int i5 = 6 - i4;
                for (int i6 = 0; i6 < i5; i6++) {
                    arrayList.add(UItem.asFlicker((i6 - i4) + 1, 35).setSpanCount(1));
                }
            } else if (z) {
                arrayList.add(UItem.asCenterShadow(LocaleController.getString(R.string.GiftCraftSelectYourEmpty)));
            }
            if (resaleGiftsList.totalCount > 0 || this.hadResaleGifts) {
                this.hadResaleGifts = true;
                arrayList.add(UItem.asAnimatedHeader(-2, LocaleController.getString(R.string.GiftCraftSelectResale)));
                HorizontalScrollView horizontalScrollView = this.filterScrollView;
                if (horizontalScrollView != null) {
                    arrayList.add(UItem.asCustom(-3, horizontalScrollView));
                }
                ArrayList arrayList3 = resaleGiftsList.gifts;
                int size2 = arrayList3.size();
                while (i < size2) {
                    Object obj2 = arrayList3.get(i);
                    i++;
                    arrayList.add(GiftSheet.GiftCell.Factory.asStarGift(0, (TL_stars.TL_starGiftUnique) obj2, false, true, false, true, true));
                }
                if (resaleGiftsList.loading || !resaleGiftsList.endReached) {
                    zzlb.m(10, 35, arrayList);
                    zzlb.m(11, 35, arrayList);
                    zzlb.m(12, 35, arrayList);
                    zzlb.m(13, 35, arrayList);
                    zzlb.m(14, 35, arrayList);
                    zzlb.m(15, 35, arrayList);
                }
            }
        }

        @Override
        public final CharSequence getTitle() {
            String str = this.collectionName;
            return str != null ? str : LocaleController.getString(R.string.GiftCraftSelectTitle);
        }

        public final void lambda$buyGift$26(TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, StarGiftSheet.PaymentFormState paymentFormState, Browser.Progress progress) {
            progress.init();
            StarsController.getInstance(this.currentAccount, paymentFormState.currency).buyResellingGift(paymentFormState.form, tL_starGiftUnique, j, null, true, new GiftOfferSheet$$ExternalSyntheticLambda12(this, progress, tL_starGiftUnique, 3));
        }

        public final void lambda$buyGift$27(AlertDialog alertDialog, AmountUtils$Currency amountUtils$Currency, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
            alertDialog.dismiss();
            if (tL_payments_paymentFormStarGift == null) {
                return;
            }
            StarGiftSheet.PaymentFormState paymentFormState = new StarGiftSheet.PaymentFormState(amountUtils$Currency, tL_payments_paymentFormStarGift);
            Context context = getContext();
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            int i = this.currentAccount;
            StringBuilder sb = new StringBuilder();
            sb.append(tL_starGiftUnique.title);
            sb.append(" #");
            new StarGiftSheet.ResaleBuyTransferAlert(context, resourcesProvider, tL_starGiftUnique, paymentFormState, i, j, BillingController$$ExternalSyntheticOutline0.m(tL_starGiftUnique.num, ',', sb), true, new StarsIntroActivity$GiftStarsSheet$$ExternalSyntheticLambda4(this, tL_starGiftUnique, j, 1)).show();
        }

        public final void lambda$new$15(State state, Context context) {
            if (state.resaleList.backdropAttributes.isEmpty()) {
                return;
            }
            ItemOptions itemOptionsNeedsFocus = ItemOptions.makeOptions((ViewGroup) this.container, this.resourcesProvider, (View) this.backdropButton, false, true).setDrawScrim(false).setOnTopOfScrim().translate(0.0f, AndroidUtilities.dp(-8.0f)).needsFocus();
            itemOptionsNeedsFocus.setOnDismiss(new RichEditor$$ExternalSyntheticLambda30(5, itemOptionsNeedsFocus));
            String[] strArr = {""};
            ResaleGiftsList resaleGiftsList = state.resaleList;
            ArrayList arrayList = new ArrayList(resaleGiftsList.backdropAttributes);
            int i = 1;
            Collections.sort(arrayList, new ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda9(state, 1));
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(context, this.currentAccount, 0, new ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda10(strArr, state, arrayList, i), new ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda11(state, itemOptionsNeedsFocus, i), null, this.resourcesProvider);
            anonymousClass3.adapter.setApplyBackground(false);
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
            editTextCaption.addTextChangedListener(new AnonymousClass6(strArr, anonymousClass3, 5));
            if (arrayList.size() > 8) {
                itemOptionsNeedsFocus.addView(frameLayout, LayoutHelper.createLinear(-1, 44));
                itemOptionsNeedsFocus.addGap();
            }
            if (!resaleGiftsList.notSelectedBackdropAttributes.isEmpty()) {
                itemOptionsNeedsFocus.add(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda12(state, 1));
            }
            itemOptionsNeedsFocus.addView(anonymousClass3);
            itemOptionsNeedsFocus.show();
        }

        public final void lambda$new$21(State state, Context context) {
            if (state.resaleList.patternAttributes.isEmpty()) {
                return;
            }
            ItemOptions itemOptionsNeedsFocus = ItemOptions.makeOptions((ViewGroup) this.container, this.resourcesProvider, (View) this.patternButton, false, true).setDrawScrim(false).setOnTopOfScrim().translate(0.0f, AndroidUtilities.dp(-8.0f)).needsFocus();
            itemOptionsNeedsFocus.setOnDismiss(new RichEditor$$ExternalSyntheticLambda30(6, itemOptionsNeedsFocus));
            String[] strArr = {""};
            ResaleGiftsList resaleGiftsList = state.resaleList;
            ArrayList arrayList = new ArrayList(resaleGiftsList.patternAttributes);
            int i = 2;
            Collections.sort(arrayList, new ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda9(state, 2));
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(context, this.currentAccount, 0, new ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda10(strArr, state, arrayList, i), new ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda11(state, itemOptionsNeedsFocus, i), null, this.resourcesProvider);
            anonymousClass5.adapter.setApplyBackground(false);
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
            editTextCaption.addTextChangedListener(new AnonymousClass6(strArr, anonymousClass5, 6));
            if (arrayList.size() > 8) {
                itemOptionsNeedsFocus.addView(frameLayout, LayoutHelper.createLinear(-1, 44));
                itemOptionsNeedsFocus.addGap();
            }
            if (!resaleGiftsList.notSelectedPatternAttributes.isEmpty()) {
                itemOptionsNeedsFocus.add(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda12(state, 2));
            }
            itemOptionsNeedsFocus.addView(anonymousClass5);
            itemOptionsNeedsFocus.show();
        }

        public final void lambda$new$22(State state, int i) {
            TL_stars.SavedStarGift savedStarGift;
            UItem item = getItem(i - 1);
            if (item != null) {
                Object obj = item.object;
                if (obj instanceof TL_stars.StarGift) {
                    TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                    boolean z = item.red;
                    if (!TextUtils.isEmpty(starGift.gift_address) && this.willBeFirst) {
                        ChatActivity$$ExternalSyntheticOutline0.m(R.string.OK, new AlertDialog.Builder(getContext(), 0, this.resourcesProvider).setTitle(LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle)).setMessage(LocaleController.getString(R.string.GiftCraftCantChooseFirst)), null);
                        return;
                    }
                    if (z && (starGift instanceof TL_stars.TL_starGiftUnique)) {
                        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) item.object;
                        AlertDialog alertDialog = new AlertDialog(getContext(), 3, null);
                        AlertDialog$$ExternalSyntheticLambda1 alertDialog$$ExternalSyntheticLambda1 = alertDialog.showRunnable;
                        AndroidUtilities.cancelRunOnUIThread(alertDialog$$ExternalSyntheticLambda1);
                        AndroidUtilities.runOnUIThread(alertDialog$$ExternalSyntheticLambda1, 400L);
                        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
                        AmountUtils$Currency amountUtils$Currency = tL_starGiftUnique.resale_ton_only ? AmountUtils$Currency.TON : AmountUtils$Currency.STARS;
                        StarsController.getInstance(this.currentAccount, amountUtils$Currency).getResellingGiftForm(tL_starGiftUnique, clientUserId, null, true, new PeerColorActivity$$ExternalSyntheticLambda12(this, alertDialog, amountUtils$Currency, tL_starGiftUnique, clientUserId));
                        return;
                    }
                    if (!z) {
                        ArrayList arrayList = state.list.gifts;
                        int size = arrayList.size();
                        int i2 = 0;
                        do {
                            if (i2 >= size) {
                                savedStarGift = null;
                                break;
                            } else {
                                Object obj2 = arrayList.get(i2);
                                i2++;
                                savedStarGift = (TL_stars.SavedStarGift) obj2;
                            }
                        } while (savedStarGift.gift != starGift);
                        if (savedStarGift != null && savedStarGift.can_craft_at > 0 && savedStarGift.can_craft_at > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                            ChatActivity$$ExternalSyntheticOutline0.m(R.string.OK, new AlertDialog.Builder(getContext(), 0, null).setTitle(LocaleController.getString(R.string.GiftCraftUnavailableTitle)).setMessage(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(savedStarGift.can_craft_at, true)))), null);
                            return;
                        }
                    }
                    this.onSelect.run(starGift);
                    lambda$showGiftOfferSheet$15();
                }
            }
        }

        public final void lambda$new$3(State state) {
            ItemOptions.makeOptions(this.container, this.resourcesProvider, this.sortButton).add(R.drawable.menu_sort_value, LocaleController.getString(ResaleGiftsList.Sorting.BY_PRICE.buttonStringResId), new ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda12(state, 3)).add(R.drawable.menu_sort_date, LocaleController.getString(ResaleGiftsList.Sorting.BY_DATE.buttonStringResId), new ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda12(state, 4)).add(R.drawable.menu_sort_number, LocaleController.getString(ResaleGiftsList.Sorting.BY_NUMBER.buttonStringResId), new ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda12(state, 5)).setDrawScrim(false).setOnTopOfScrim().translate(0.0f, AndroidUtilities.dp(-8.0f)).show();
        }

        public final void lambda$new$9(State state, Context context) {
            if (state.resaleList.modelAttributes.isEmpty()) {
                return;
            }
            ItemOptions itemOptionsNeedsFocus = ItemOptions.makeOptions((ViewGroup) this.container, this.resourcesProvider, (View) this.modelButton, false, true).setDrawScrim(false).setOnTopOfScrim().translate(0.0f, AndroidUtilities.dp(-8.0f)).needsFocus();
            itemOptionsNeedsFocus.setOnDismiss(new RichEditor$$ExternalSyntheticLambda30(7, itemOptionsNeedsFocus));
            String[] strArr = {""};
            ResaleGiftsList resaleGiftsList = state.resaleList;
            ArrayList arrayList = new ArrayList(resaleGiftsList.modelAttributes);
            int i = 0;
            Collections.sort(arrayList, new ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda9(state, 0));
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, this.currentAccount, 0, new ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda10(strArr, state, arrayList, i), new ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda11(state, itemOptionsNeedsFocus, i), null, this.resourcesProvider);
            anonymousClass1.adapter.setApplyBackground(false);
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
            editTextCaption.addTextChangedListener(new AnonymousClass6(strArr, anonymousClass1, 4));
            if (arrayList.size() > 8) {
                itemOptionsNeedsFocus.addView(frameLayout, LayoutHelper.createLinear(-1, 44));
                itemOptionsNeedsFocus.addGap();
            }
            if (!resaleGiftsList.notSelectedModelAttributes.isEmpty()) {
                itemOptionsNeedsFocus.add(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new ResaleGiftsFragment$SelectGiftSheet$$ExternalSyntheticLambda12(state, 0));
            }
            itemOptionsNeedsFocus.addView(anonymousClass1);
            itemOptionsNeedsFocus.show();
        }

        public final void onScroll$1() {
            int childAdapterPosition;
            UItem item;
            boolean z = false;
            boolean z2 = false;
            for (int i = 0; i < this.recyclerListView.getChildCount(); i++) {
                View childAt = this.recyclerListView.getChildAt(i);
                if ((childAt instanceof FlickerLoadingView) && (childAdapterPosition = this.recyclerListView.getChildAdapterPosition(childAt) - 1) >= 0 && (item = getItem(childAdapterPosition)) != null) {
                    if (item.id < 10) {
                        z = true;
                    } else {
                        z2 = true;
                    }
                }
            }
            State state = this.state;
            if (z) {
                state.list.load();
            }
            if (z2) {
                state.resaleList.load(false);
            }
        }

        @Override
        public final void onSheetTop(float f) {
            float y = this.containerView.getY() + f;
            StarGiftSheet.ActionView actionView = this.actionView;
            float measuredHeight = y - actionView.getMeasuredHeight();
            float fClamp01 = 1.0f - Utilities.clamp01(Math.max(0.0f, (-measuredHeight) + AndroidUtilities.dp(8.0f)) / actionView.getMeasuredHeight());
            float height = this.container.getHeight() / 2.0f;
            if (measuredHeight > height) {
                fClamp01 = Math.min(fClamp01, Utilities.clamp01(1.0f - ((measuredHeight - height) / AndroidUtilities.dpf2(128.0f))));
            }
            actionView.setScaleX(fClamp01);
            actionView.setScaleY(fClamp01);
            actionView.setAlpha(AndroidUtilities.ilerp(fClamp01, 0.5f, 1.0f));
            actionView.setTranslationY(measuredHeight);
        }
    }

    public ResaleGiftsFragment(long j, String str, long j2, Theme.ResourcesProvider resourcesProvider) {
        super(null);
        this.animatorClearFiltersButtonVisible = new BoolAnimator(0, this, CubicBezierInterpolator.EASE_OUT_QUINT, 380L, false);
        this.filtersShown = true;
        this.dialogId = j;
        this.gift_name = str;
        this.resourceProvider = resourcesProvider;
        ResaleGiftsList resaleGiftsList = new ResaleGiftsList(j2, this.currentAccount, new DialogCell$$ExternalSyntheticLambda6(this, 23));
        this.list = resaleGiftsList;
        resaleGiftsList.load(false);
    }

    @Override
    public final View createView(final Context context) {
        BlurredBackgroundSourceColor blurredBackgroundSourceColor = new BlurredBackgroundSourceColor();
        this.iBlur3SourceColor = blurredBackgroundSourceColor;
        int i = Theme.key_windowBackgroundWhite;
        blurredBackgroundSourceColor.paint.setColor(getThemedColor(i));
        this.iBlur3Factory = new BlurredBackgroundDrawableViewFactory(this.iBlur3SourceColor);
        ActionBar actionBar = this.actionBar;
        BackDrawable backDrawable = new BackDrawable(false);
        this.backDrawable = backDrawable;
        actionBar.setBackButtonDrawable(backDrawable);
        this.backDrawable.animationTime = 240.0f;
        this.actionBar.setCastShadows(false);
        this.actionBar.setAddToContainer(false);
        this.actionBar.setActionBarMenuOnItemClick(new HistoryFragment.AnonymousClass1(this, 13));
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
            public final void onMeasure(int i3, int i4) {
                ResaleGiftsFragment resaleGiftsFragment = ResaleGiftsFragment.this;
                ((FrameLayout.LayoutParams) resaleGiftsFragment.filterScrollView.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight() + (((BaseFragment) resaleGiftsFragment).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                ((FrameLayout.LayoutParams) resaleGiftsFragment.filtersDivider.getLayoutParams()).topMargin = AndroidUtilities.dp(47.0f) + ActionBar.getCurrentActionBarHeight() + (((BaseFragment) resaleGiftsFragment).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                ((FrameLayout.LayoutParams) resaleGiftsFragment.listView.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight() + (((BaseFragment) resaleGiftsFragment).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                ((FrameLayout.LayoutParams) resaleGiftsFragment.emptyView.getLayoutParams()).topMargin = ActionBar.getCurrentActionBarHeight() + (((BaseFragment) resaleGiftsFragment).actionBar.getOccupyStatusBar() ? AndroidUtilities.statusBarHeight : 0);
                super.onMeasure(i3, i4);
            }
        };
        int iBlendOver = Theme.blendOver(Theme.getColor(i, this.resourceProvider), Theme.multAlpha(0.04f, Theme.getColor(i2, this.resourceProvider)));
        sizeNotifierFrameLayout.setBackgroundColor(iBlendOver);
        this.fragmentView = sizeNotifierFrameLayout;
        StarsIntroActivity.StarsBalanceView starsBalanceView = new StarsIntroActivity.StarsBalanceView(context, this.currentAccount, this.resourceProvider);
        starsBalanceView.withTon = true;
        ScaleStateListAnimator.apply(starsBalanceView);
        starsBalanceView.setOnClickListener(new RichEditor$$ExternalSyntheticLambda20(2, this, starsBalanceView));
        this.actionBar.addView(starsBalanceView, LayoutHelper.createFrame(-2, -2.0f, 85, 0.0f, 0.0f, 4.0f, 0.0f));
        AnonymousClass3 anonymousClass3 = new AnonymousClass3(this, new GiftSheet$$ExternalSyntheticLambda8(this, 22), new ResaleGiftsFragment$$ExternalSyntheticLambda4(this), new ResaleGiftsFragment$$ExternalSyntheticLambda4(this));
        this.listView = anonymousClass3;
        anonymousClass3.adapter.setApplyBackground(false);
        this.listView.setSpanCount(3);
        this.listView.addOnScrollListener(new StarGiftSheet.AnonymousClass8(this, 10));
        this.listView.setPadding(0, AndroidUtilities.dp(45.0f), 0, AndroidUtilities.dp(101.0f));
        this.listView.setClipToPadding(false);
        sizeNotifierFrameLayout.addView(this.listView, LayoutHelper.createFrame(-1, -1.0f, 119, 7.33f, 0.0f, 7.33f, -45.0f));
        sizeNotifierFrameLayout.addView(this.actionBar);
        final int i3 = 0;
        View.OnClickListener onClickListener = new View.OnClickListener(this) {
            public final ResaleGiftsFragment f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view) {
                switch (i3) {
                    case 0:
                        ResaleGiftsFragment.ResaleGiftsList resaleGiftsList = this.f$0.list;
                        resaleGiftsList.notSelectedBackdropAttributes.clear();
                        resaleGiftsList.notSelectedModelAttributes.clear();
                        resaleGiftsList.notSelectedPatternAttributes.clear();
                        resaleGiftsList.reload();
                        break;
                    default:
                        ResaleGiftsFragment.ResaleGiftsList resaleGiftsList2 = this.f$0.list;
                        resaleGiftsList2.notSelectedBackdropAttributes.clear();
                        resaleGiftsList2.notSelectedModelAttributes.clear();
                        resaleGiftsList2.notSelectedPatternAttributes.clear();
                        resaleGiftsList2.reload();
                        break;
                }
            }
        };
        Theme.ResourcesProvider resourcesProvider = this.resourceProvider;
        LargeEmptyView largeEmptyView = new LargeEmptyView(context);
        LinearLayout linearLayoutM = AccountFrozenAlert$$ExternalSyntheticOutline0.m(1, context);
        largeEmptyView.addView(linearLayoutM, LayoutHelper.createFrame(-1, -2, 23));
        BackupImageView backupImageView = new BackupImageView(context);
        backupImageView.setImageDrawable(new RLottieDrawable(R.raw.utyan_empty, "utyan_empty", AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
        linearLayoutM.addView(backupImageView, LayoutHelper.createLinear(130, 130, 17));
        TextView textView = new TextView(context);
        OKLCH.m(i2, resourcesProvider, textView, 17.0f);
        textView.setGravity(17);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptyTitle));
        linearLayoutM.addView(textView, LayoutHelper.createLinear(-2, -2, 17, 32, 12, 32, 9));
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
        linksTextView.setTextColor(Theme.getColor(Theme.key_windowBackgroundWhiteGrayText3, resourcesProvider));
        linksTextView.setTextSize(1, 14.0f);
        linksTextView.setGravity(17);
        linksTextView.setText(LocaleController.getString(R.string.Gift2ResaleFiltersEmptySubtitle));
        linksTextView.setMaxWidth(AndroidUtilities.dp(200.0f));
        linearLayoutM.addView(linksTextView, LayoutHelper.createLinear(-2, -2, 17, 32, 0, 32, 12));
        TextView textView2 = new TextView(context);
        int i4 = Theme.key_featuredStickers_addButton;
        textView2.setTextColor(Theme.getColor(i4, resourcesProvider));
        textView2.setBackground(Theme.createRadSelectorDrawable(Theme.multAlpha(0.1f, Theme.getColor(i4, resourcesProvider)), 6, 6));
        textView2.setGravity(17);
        textView2.setPadding(EditTextCaption$$ExternalSyntheticOutline0.m(13.0f, R.string.Gift2ResaleFiltersEmptyClear, textView2), 0, AndroidUtilities.dp(13.0f), 0);
        ScaleStateListAnimator.apply(textView2);
        linearLayoutM.addView(textView2, LayoutHelper.createLinear(-2, 27, 17, 32, 0, 32, 12));
        textView2.setOnClickListener(onClickListener);
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
        TextView textView3 = new TextView(context);
        OKLCH.m(Theme.key_dialogTextBlack, this.resourceProvider, textView3, 14.0f);
        textView3.setText(LocaleController.getString(R.string.GiftResaleStarsOnly));
        linearLayout2.addView(textView3, LayoutHelper.createLinear(-2, -2, 16, 9, 0, 0, 0));
        int iDp = AndroidUtilities.dp(18.0f);
        int iBlendOver2 = Theme.blendOver(getThemedColor(i), Theme.multAlpha(0.1f, getThemedColor(i4)));
        linearLayout2.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp, iDp, iDp, iDp, 0, iBlendOver2, iBlendOver2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.onlyStarsContainer = frameLayout;
        frameLayout.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        View view2 = this.onlyStarsContainer;
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate = this.iBlur3Factory.create(view2, null, false);
        blurredBackgroundDrawableCreate.setColorProvider(BlurredBackgroundProviderImpl.shadow(this.resourceProvider));
        blurredBackgroundDrawableCreate.setPadding(AndroidUtilities.dp(8.0f));
        blurredBackgroundDrawableCreate.setRadius(AndroidUtilities.dp(18.0f));
        view2.setBackground(blurredBackgroundDrawableCreate);
        final int i5 = 0;
        this.onlyStarsContainer.setOnClickListener(new View.OnClickListener(this) {
            public final ResaleGiftsFragment f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view3) {
                switch (i5) {
                    case 0:
                        ResaleGiftsFragment.ResaleGiftsList resaleGiftsList = this.f$0.list;
                        if (resaleGiftsList != null) {
                            boolean z = !resaleGiftsList.starsOnly;
                            resaleGiftsList.starsOnly = z;
                            checkBox2.setChecked(z, true);
                            resaleGiftsList.reload();
                        }
                        break;
                    default:
                        final ResaleGiftsFragment resaleGiftsFragment = this.f$0;
                        if (resaleGiftsFragment.filtersShown) {
                            ItemOptions itemOptionsAddGap = ItemOptions.makeOptions(resaleGiftsFragment, resaleGiftsFragment.sortButton).add(R.drawable.menu_sort_value, LocaleController.getString(ResaleGiftsFragment.ResaleGiftsList.Sorting.BY_PRICE.buttonStringResId), new ResaleGiftsFragment$$ExternalSyntheticLambda16(resaleGiftsFragment, 3)).add(R.drawable.menu_sort_date, LocaleController.getString(ResaleGiftsFragment.ResaleGiftsList.Sorting.BY_DATE.buttonStringResId), new ResaleGiftsFragment$$ExternalSyntheticLambda16(resaleGiftsFragment, 4)).add(R.drawable.menu_sort_number, LocaleController.getString(ResaleGiftsFragment.ResaleGiftsList.Sorting.BY_NUMBER.buttonStringResId), new ResaleGiftsFragment$$ExternalSyntheticLambda16(resaleGiftsFragment, 5)).addGap();
                            ResaleGiftsFragment.ResaleGiftsList resaleGiftsList2 = resaleGiftsFragment.list;
                            boolean z2 = !resaleGiftsList2.starsOnly;
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final CheckBox2 checkBox3 = checkBox2;
                            final int i6 = 0;
                            final int i7 = 1;
                            itemOptionsAddGap.addChecked(z2, string, new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i6) {
                                        case 0:
                                            ResaleGiftsFragment.ResaleGiftsList resaleGiftsList3 = resaleGiftsFragment.list;
                                            if (resaleGiftsList3.starsOnly) {
                                                resaleGiftsList3.starsOnly = false;
                                                checkBox3.setChecked(false, true);
                                                resaleGiftsList3.reload();
                                            }
                                            break;
                                        default:
                                            ResaleGiftsFragment.ResaleGiftsList resaleGiftsList4 = resaleGiftsFragment.list;
                                            if (!resaleGiftsList4.starsOnly) {
                                                resaleGiftsList4.starsOnly = true;
                                                checkBox3.setChecked(true, true);
                                                resaleGiftsList4.reload();
                                            }
                                            break;
                                    }
                                }
                            }).addChecked(resaleGiftsList2.starsOnly, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i7) {
                                        case 0:
                                            ResaleGiftsFragment.ResaleGiftsList resaleGiftsList3 = resaleGiftsFragment.list;
                                            if (resaleGiftsList3.starsOnly) {
                                                resaleGiftsList3.starsOnly = false;
                                                checkBox3.setChecked(false, true);
                                                resaleGiftsList3.reload();
                                            }
                                            break;
                                        default:
                                            ResaleGiftsFragment.ResaleGiftsList resaleGiftsList4 = resaleGiftsFragment.list;
                                            if (!resaleGiftsList4.starsOnly) {
                                                resaleGiftsList4.starsOnly = true;
                                                checkBox3.setChecked(true, true);
                                                resaleGiftsList4.reload();
                                            }
                                            break;
                                    }
                                }
                            }).setDrawScrim(false).setOnTopOfScrim().translate(0.0f, AndroidUtilities.dp(-8.0f)).show();
                            break;
                        }
                        break;
                }
            }
        });
        this.onlyStarsContainer.addView(linearLayout2, LayoutHelper.createFrame(-2, -1.0f));
        ScaleStateListAnimator.apply(this.onlyStarsContainer, 0.04f, 1.5f);
        sizeNotifierFrameLayout.addView(this.onlyStarsContainer, LayoutHelper.createFrame(-2, 52.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        StarsController starsController = StarsController.getInstance(this.currentAccount, true);
        if (starsController.balanceLoaded && !starsController.getBalanceAmount().isZero()) {
            this.onlyStarsContainer.setVisibility(8);
        }
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.clearFiltersContainer = frameLayout2;
        frameLayout2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        View view3 = this.clearFiltersContainer;
        BlurredBackgroundDrawable blurredBackgroundDrawableCreate2 = this.iBlur3Factory.create(view3, null, false);
        blurredBackgroundDrawableCreate2.setColorProvider(BlurredBackgroundProviderImpl.shadow(this.resourceProvider));
        blurredBackgroundDrawableCreate2.setPadding(AndroidUtilities.dp(8.0f));
        blurredBackgroundDrawableCreate2.setRadius(AndroidUtilities.dp(22.0f));
        view3.setBackground(blurredBackgroundDrawableCreate2);
        sizeNotifierFrameLayout.addView(this.clearFiltersContainer, LayoutHelper.createFrame(-2, 60.0f, 81, 0.0f, 0.0f, 0.0f, AndroidUtilities.navigationBarHeight / AndroidUtilities.density));
        this.clearFiltersButton = new TextView(context);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("x");
        spannableStringBuilder.setSpan(new ColoredImageSpan(R.drawable.msg_clearcache), 0, 1, 33);
        spannableStringBuilder.append((CharSequence) " ").append((CharSequence) LocaleController.getString(R.string.Gift2ResaleFiltersClear));
        this.clearFiltersButton.setText(spannableStringBuilder);
        this.clearFiltersButton.setTextColor(getThemedColor(i4));
        this.clearFiltersButton.setTypeface(AndroidUtilities.bold());
        this.clearFiltersButton.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        TextView textView4 = this.clearFiltersButton;
        int iDp2 = AndroidUtilities.dp(22.0f);
        int iBlendOver3 = Theme.blendOver(getThemedColor(i), Theme.multAlpha(0.1f, getThemedColor(i4)));
        textView4.setBackground(Theme.createSimpleSelectorRoundRectDrawable(iDp2, iDp2, iDp2, iDp2, 0, iBlendOver3, iBlendOver3));
        this.clearFiltersButton.setGravity(17);
        final int i6 = 1;
        this.clearFiltersContainer.setOnClickListener(new View.OnClickListener(this) {
            public final ResaleGiftsFragment f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (i6) {
                    case 0:
                        ResaleGiftsFragment.ResaleGiftsList resaleGiftsList = this.f$0.list;
                        resaleGiftsList.notSelectedBackdropAttributes.clear();
                        resaleGiftsList.notSelectedModelAttributes.clear();
                        resaleGiftsList.notSelectedPatternAttributes.clear();
                        resaleGiftsList.reload();
                        break;
                    default:
                        ResaleGiftsFragment.ResaleGiftsList resaleGiftsList2 = this.f$0.list;
                        resaleGiftsList2.notSelectedBackdropAttributes.clear();
                        resaleGiftsList2.notSelectedModelAttributes.clear();
                        resaleGiftsList2.notSelectedPatternAttributes.clear();
                        resaleGiftsList2.reload();
                        break;
                }
            }
        });
        this.clearFiltersContainer.addView(this.clearFiltersButton, LayoutHelper.createFrame(-2, -1.0f));
        this.clearFiltersContainer.setVisibility(8);
        ScaleStateListAnimator.apply(this.clearFiltersContainer, 0.05f, 1.5f);
        Filter filter = new Filter(context, this.resourceProvider);
        this.sortButton = filter;
        filter.setSorting(this.list.sorting);
        this.filtersContainer.addView(this.sortButton, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 6, 0));
        final int i7 = 1;
        this.sortButton.setOnClickListener(new View.OnClickListener(this) {
            public final ResaleGiftsFragment f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (i7) {
                    case 0:
                        ResaleGiftsFragment.ResaleGiftsList resaleGiftsList = this.f$0.list;
                        if (resaleGiftsList != null) {
                            boolean z = !resaleGiftsList.starsOnly;
                            resaleGiftsList.starsOnly = z;
                            checkBox2.setChecked(z, true);
                            resaleGiftsList.reload();
                        }
                        break;
                    default:
                        final ResaleGiftsFragment resaleGiftsFragment = this.f$0;
                        if (resaleGiftsFragment.filtersShown) {
                            ItemOptions itemOptionsAddGap = ItemOptions.makeOptions(resaleGiftsFragment, resaleGiftsFragment.sortButton).add(R.drawable.menu_sort_value, LocaleController.getString(ResaleGiftsFragment.ResaleGiftsList.Sorting.BY_PRICE.buttonStringResId), new ResaleGiftsFragment$$ExternalSyntheticLambda16(resaleGiftsFragment, 3)).add(R.drawable.menu_sort_date, LocaleController.getString(ResaleGiftsFragment.ResaleGiftsList.Sorting.BY_DATE.buttonStringResId), new ResaleGiftsFragment$$ExternalSyntheticLambda16(resaleGiftsFragment, 4)).add(R.drawable.menu_sort_number, LocaleController.getString(ResaleGiftsFragment.ResaleGiftsList.Sorting.BY_NUMBER.buttonStringResId), new ResaleGiftsFragment$$ExternalSyntheticLambda16(resaleGiftsFragment, 5)).addGap();
                            ResaleGiftsFragment.ResaleGiftsList resaleGiftsList2 = resaleGiftsFragment.list;
                            boolean z2 = !resaleGiftsList2.starsOnly;
                            String string = LocaleController.getString(R.string.GiftResaleFilterAllListings);
                            final CheckBox2 checkBox3 = checkBox2;
                            final int i8 = 0;
                            final int i9 = 1;
                            itemOptionsAddGap.addChecked(z2, string, new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i8) {
                                        case 0:
                                            ResaleGiftsFragment.ResaleGiftsList resaleGiftsList3 = resaleGiftsFragment.list;
                                            if (resaleGiftsList3.starsOnly) {
                                                resaleGiftsList3.starsOnly = false;
                                                checkBox3.setChecked(false, true);
                                                resaleGiftsList3.reload();
                                            }
                                            break;
                                        default:
                                            ResaleGiftsFragment.ResaleGiftsList resaleGiftsList4 = resaleGiftsFragment.list;
                                            if (!resaleGiftsList4.starsOnly) {
                                                resaleGiftsList4.starsOnly = true;
                                                checkBox3.setChecked(true, true);
                                                resaleGiftsList4.reload();
                                            }
                                            break;
                                    }
                                }
                            }).addChecked(resaleGiftsList2.starsOnly, LocaleController.getString(R.string.GiftResaleFilterForStarsOnly), new Runnable() {
                                @Override
                                public final void run() {
                                    switch (i9) {
                                        case 0:
                                            ResaleGiftsFragment.ResaleGiftsList resaleGiftsList3 = resaleGiftsFragment.list;
                                            if (resaleGiftsList3.starsOnly) {
                                                resaleGiftsList3.starsOnly = false;
                                                checkBox3.setChecked(false, true);
                                                resaleGiftsList3.reload();
                                            }
                                            break;
                                        default:
                                            ResaleGiftsFragment.ResaleGiftsList resaleGiftsList4 = resaleGiftsFragment.list;
                                            if (!resaleGiftsList4.starsOnly) {
                                                resaleGiftsList4.starsOnly = true;
                                                checkBox3.setChecked(true, true);
                                                resaleGiftsList4.reload();
                                            }
                                            break;
                                    }
                                }
                            }).setDrawScrim(false).setOnTopOfScrim().translate(0.0f, AndroidUtilities.dp(-8.0f)).show();
                            break;
                        }
                        break;
                }
            }
        });
        Filter filter2 = new Filter(context, this.resourceProvider);
        this.modelButton = filter2;
        filter2.setValue(LocaleController.getString(R.string.Gift2AttributeModel));
        this.filtersContainer.addView(this.modelButton, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 6, 0));
        final int i8 = 1;
        this.modelButton.setOnClickListener(new View.OnClickListener(this) {
            public final ResaleGiftsFragment f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (i8) {
                    case 0:
                        this.f$0.lambda$createView$27(context);
                        break;
                    case 1:
                        this.f$0.lambda$createView$15(context);
                        break;
                    default:
                        this.f$0.lambda$createView$21(context);
                        break;
                }
            }
        });
        Filter filter3 = new Filter(context, this.resourceProvider);
        this.backdropButton = filter3;
        filter3.setValue(LocaleController.getString(R.string.Gift2AttributeBackdrop));
        this.filtersContainer.addView(this.backdropButton, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 6, 0));
        final int i9 = 2;
        this.backdropButton.setOnClickListener(new View.OnClickListener(this) {
            public final ResaleGiftsFragment f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (i9) {
                    case 0:
                        this.f$0.lambda$createView$27(context);
                        break;
                    case 1:
                        this.f$0.lambda$createView$15(context);
                        break;
                    default:
                        this.f$0.lambda$createView$21(context);
                        break;
                }
            }
        });
        Filter filter4 = new Filter(context, this.resourceProvider);
        this.patternButton = filter4;
        filter4.setValue(LocaleController.getString(R.string.Gift2AttributeSymbol));
        this.filtersContainer.addView(this.patternButton, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 0, 0));
        final int i10 = 0;
        this.patternButton.setOnClickListener(new View.OnClickListener(this) {
            public final ResaleGiftsFragment f$0;

            {
                this.f$0 = this;
            }

            @Override
            public final void onClick(View view4) {
                switch (i10) {
                    case 0:
                        this.f$0.lambda$createView$27(context);
                        break;
                    case 1:
                        this.f$0.lambda$createView$15(context);
                        break;
                    default:
                        this.f$0.lambda$createView$21(context);
                        break;
                }
            }
        });
        FireworksOverlay fireworksOverlay = new FireworksOverlay(getContext());
        this.fireworksOverlay = fireworksOverlay;
        sizeNotifierFrameLayout.addView(fireworksOverlay, LayoutHelper.createFrame(-1, -1.0f));
        setFiltersShown(false, false);
        return sizeNotifierFrameLayout;
    }

    @Override
    public final boolean isLightStatusBar() {
        if (getLastStoryViewer() == null || getLastStoryViewer().isClosed) {
            int color = Theme.getColor(null, Theme.key_windowBackgroundWhite, false);
            if (this.actionBar.isActionModeShowed()) {
                color = Theme.getColor(null, Theme.key_actionBarActionModeDefault, false);
            }
            if (ColorUtils.calculateLuminance(color) > 0.699999988079071d) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    public final void lambda$createView$15(Context context) {
        if (this.filtersShown) {
            ResaleGiftsList resaleGiftsList = this.list;
            if (resaleGiftsList.modelAttributes.isEmpty()) {
                return;
            }
            ItemOptions itemOptionsNeedsFocus = ItemOptions.makeOptions((BaseFragment) this, (View) this.modelButton, false, true).setDrawScrim(false).setOnTopOfScrim().translate(0.0f, AndroidUtilities.dp(-8.0f)).needsFocus();
            itemOptionsNeedsFocus.setOnDismiss(new RichEditor$$ExternalSyntheticLambda30(4, itemOptionsNeedsFocus));
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(resaleGiftsList.modelAttributes);
            Collections.sort(arrayList, new ResaleGiftsFragment$$ExternalSyntheticLambda13(this, 2));
            AnonymousClass5 anonymousClass5 = new AnonymousClass5(this, new ResaleGiftsFragment$$ExternalSyntheticLambda14(this, strArr, arrayList, 2), new ResaleGiftsFragment$$ExternalSyntheticLambda15(this, itemOptionsNeedsFocus, 2), null);
            anonymousClass5.adapter.setApplyBackground(false);
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
            editTextCaption.addTextChangedListener(new AnonymousClass6(strArr, anonymousClass5, 0));
            if (arrayList.size() > 8) {
                itemOptionsNeedsFocus.addView(frameLayout, LayoutHelper.createLinear(-1, 44));
                itemOptionsNeedsFocus.addGap();
            }
            if (!resaleGiftsList.notSelectedModelAttributes.isEmpty()) {
                itemOptionsNeedsFocus.add(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new ResaleGiftsFragment$$ExternalSyntheticLambda16(this, 2));
            }
            itemOptionsNeedsFocus.addView(anonymousClass5);
            itemOptionsNeedsFocus.show();
        }
    }

    public final void lambda$createView$21(Context context) {
        if (this.filtersShown) {
            ResaleGiftsList resaleGiftsList = this.list;
            if (resaleGiftsList.backdropAttributes.isEmpty()) {
                return;
            }
            ItemOptions itemOptionsNeedsFocus = ItemOptions.makeOptions((BaseFragment) this, (View) this.backdropButton, false, true).setDrawScrim(false).setOnTopOfScrim().translate(0.0f, AndroidUtilities.dp(-8.0f)).needsFocus();
            itemOptionsNeedsFocus.setOnDismiss(new RichEditor$$ExternalSyntheticLambda30(3, itemOptionsNeedsFocus));
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(resaleGiftsList.backdropAttributes);
            Collections.sort(arrayList, new ResaleGiftsFragment$$ExternalSyntheticLambda13(this, 1));
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(this, new ResaleGiftsFragment$$ExternalSyntheticLambda14(this, strArr, arrayList, 1), new ResaleGiftsFragment$$ExternalSyntheticLambda15(this, itemOptionsNeedsFocus, 1), null);
            anonymousClass7.adapter.setApplyBackground(false);
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
            editTextCaption.addTextChangedListener(new AnonymousClass6(strArr, anonymousClass7, 3));
            if (arrayList.size() > 8) {
                itemOptionsNeedsFocus.addView(frameLayout, LayoutHelper.createLinear(-1, 44));
                itemOptionsNeedsFocus.addGap();
            }
            if (!resaleGiftsList.notSelectedBackdropAttributes.isEmpty()) {
                itemOptionsNeedsFocus.add(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new ResaleGiftsFragment$$ExternalSyntheticLambda16(this, 1));
            }
            itemOptionsNeedsFocus.addView(anonymousClass7);
            itemOptionsNeedsFocus.show();
        }
    }

    public final void lambda$createView$27(Context context) {
        if (this.filtersShown) {
            ResaleGiftsList resaleGiftsList = this.list;
            if (resaleGiftsList.patternAttributes.isEmpty()) {
                return;
            }
            ItemOptions itemOptionsNeedsFocus = ItemOptions.makeOptions((BaseFragment) this, (View) this.patternButton, false, true).setDrawScrim(false).setOnTopOfScrim().translate(0.0f, AndroidUtilities.dp(-8.0f)).needsFocus();
            itemOptionsNeedsFocus.setOnDismiss(new RichEditor$$ExternalSyntheticLambda30(2, itemOptionsNeedsFocus));
            String[] strArr = {""};
            ArrayList arrayList = new ArrayList(resaleGiftsList.patternAttributes);
            Collections.sort(arrayList, new ResaleGiftsFragment$$ExternalSyntheticLambda13(this, 0));
            AnonymousClass9 anonymousClass9 = new AnonymousClass9(this, new ResaleGiftsFragment$$ExternalSyntheticLambda14(this, strArr, arrayList, 0), new ResaleGiftsFragment$$ExternalSyntheticLambda15(this, itemOptionsNeedsFocus, 0), null);
            anonymousClass9.adapter.setApplyBackground(false);
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
            editTextCaption.addTextChangedListener(new AnonymousClass6(strArr, anonymousClass9, 2));
            if (arrayList.size() > 8) {
                itemOptionsNeedsFocus.addView(frameLayout, LayoutHelper.createLinear(-1, 44));
                itemOptionsNeedsFocus.addGap();
            }
            if (!resaleGiftsList.notSelectedPatternAttributes.isEmpty()) {
                itemOptionsNeedsFocus.add(R.drawable.msg_select, LocaleController.getString(R.string.SelectAll), new ResaleGiftsFragment$$ExternalSyntheticLambda16(this, 0));
            }
            itemOptionsNeedsFocus.addView(anonymousClass9);
            itemOptionsNeedsFocus.show();
        }
    }

    public final void lambda$onItemClick$28(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j, boolean z) {
        if (j == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
            this.list.gifts.remove(tL_starGiftUnique);
            updateList$1(false);
            if (j == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                BulletinFactory bulletinFactoryOf = BulletinFactory.of(this);
                TLRPC.Document document = tL_starGiftUnique.getDocument();
                String string = LocaleController.getString(R.string.BoughtResoldGiftTitle);
                int i = R.string.BoughtResoldGiftText;
                StringBuilder sb = new StringBuilder();
                sb.append(tL_starGiftUnique.title);
                sb.append(" #");
                bulletinFactoryOf.createSimpleBulletin(document, string, LocaleController.formatString(i, BillingController$$ExternalSyntheticOutline0.m(tL_starGiftUnique.num, ',', sb))).hideAfterBottomSheet(false).show();
            } else {
                BulletinFactory.of(this).createSimpleBulletin(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, j))).hideAfterBottomSheet(false).show();
            }
            this.fireworksOverlay.start(true);
            return;
        }
        Bundle bundle = new Bundle();
        if (j >= 0) {
            bundle.putLong("user_id", j);
        } else {
            bundle.putLong("chat_id", -j);
        }
        ChatActivity chatActivity = new ChatActivity(bundle) {
            public boolean shownToast = false;

            @Override
            public final void onBecomeFullyVisible() {
                super.onBecomeFullyVisible();
                if (this.shownToast) {
                    return;
                }
                this.shownToast = true;
                BulletinFactory.of(this).createSimpleBulletin(tL_starGiftUnique.getDocument(), LocaleController.getString(R.string.BoughtResoldGiftToTitle), LocaleController.formatString(R.string.BoughtResoldGiftToText, DialogObject.getShortName(this.currentAccount, j))).hideAfterBottomSheet(false).show();
                FireworksOverlay fireworksOverlay = this.fireworksOverlay;
                if (fireworksOverlay != null) {
                    fireworksOverlay.start(true);
                }
            }
        };
        INavigationLayout iNavigationLayout = this.parentLayout;
        if (iNavigationLayout == null || !((ActionBarLayout) iNavigationLayout).isSheet) {
            presentFragment(chatActivity, true, z);
        } else {
            Dialog dialog = this.parentDialog;
            if ((dialog instanceof BottomSheet) && z) {
                ((BottomSheet) dialog).skipDismissAnimation();
            }
            finishFragment();
            BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
            if (safeLastFragment != null) {
                safeLastFragment.presentFragment(chatActivity, false, z);
            }
        }
        Utilities.Callback callback = this.closeParentSheet;
        if (callback != null) {
            callback.run(Boolean.valueOf(z));
        }
    }

    @Override
    public final void onFactorChangeFinished(int i, float f, FactorAnimator factorAnimator) {
    }

    @Override
    public final void onFactorChanged(int i, float f, float f2, FactorAnimator factorAnimator) {
        if (i == 0) {
            this.onlyStarsContainer.setTranslationY((-AndroidUtilities.dp(52.0f)) * f);
            FragmentFloatingButton.setAnimatedVisibility(this.clearFiltersContainer, f);
        }
    }

    public final void onItemClick$3(UItem uItem) {
        Object obj = uItem.object;
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            StarGiftSheet starGiftSheet = new StarGiftSheet(this.currentAccount, getContext(), this.resourceProvider, this.dialogId, null);
            starGiftSheet.set(tL_starGiftUnique.slug, tL_starGiftUnique, this.list);
            starGiftSheet.boughtGift = new ResaleGiftsFragment$$ExternalSyntheticLambda4(this);
            showDialog(starGiftSheet);
        }
    }

    public final void setFiltersShown(boolean z, boolean z2) {
        if (this.filtersShown == z) {
            return;
        }
        this.filtersShown = z;
        if (!z2) {
            this.filterScrollView.setVisibility(z ? 0 : 8);
            this.filterScrollView.setTranslationY(z ? 0.0f : -AndroidUtilities.dp(45.0f));
            this.filterScrollView.setAlpha(z ? 1.0f : 0.0f);
            this.filtersDivider.setTranslationY(z ? 0.0f : -AndroidUtilities.dp(45.0f));
            this.listView.setTranslationY(z ? 0.0f : -AndroidUtilities.dp(39.0f));
            return;
        }
        this.filterScrollView.setVisibility(0);
        ViewPropertyAnimator viewPropertyAnimatorAlpha = this.filterScrollView.animate().translationY(z ? 0.0f : -AndroidUtilities.dp(45.0f)).alpha(z ? 1.0f : 0.0f);
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        viewPropertyAnimatorAlpha.setInterpolator(cubicBezierInterpolator).setDuration(420L).setListener(new AnonymousClass11(this, z, 0)).start();
        this.filtersDivider.animate().translationY(z ? 0.0f : -AndroidUtilities.dp(45.0f)).setInterpolator(cubicBezierInterpolator).setDuration(420L).start();
        this.listView.animate().translationY(z ? 0.0f : -AndroidUtilities.dp(39.0f)).setInterpolator(cubicBezierInterpolator).setDuration(420L).start();
    }

    public final void updateList$1(boolean z) {
        UniversalAdapter universalAdapter;
        ResaleGiftsList resaleGiftsList = this.list;
        if (resaleGiftsList.totalCount > 12) {
            setFiltersShown(true, true);
        }
        AnonymousClass3 anonymousClass3 = this.listView;
        boolean z2 = false;
        if (anonymousClass3 != null && (universalAdapter = anonymousClass3.adapter) != null) {
            universalAdapter.update(true);
            if (z) {
                this.listView.scrollToPosition(0);
            }
        }
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.setTitle(this.gift_name);
            ActionBar actionBar2 = this.actionBar;
            int i = resaleGiftsList.totalCount;
            actionBar2.setSubtitle(i <= 0 ? LocaleController.getString(R.string.Gift2ResaleNoCount) : LocaleController.formatPluralStringComma("Gift2ListingsCount", i));
        }
        Filter filter = this.sortButton;
        if (filter != null) {
            filter.setSorting(resaleGiftsList.sorting);
        }
        Filter filter2 = this.modelButton;
        HashSet hashSet = resaleGiftsList.notSelectedModelAttributes;
        if (filter2 != null) {
            ArrayList arrayList = resaleGiftsList.modelAttributes;
            int size = arrayList.size() - hashSet.size();
            this.modelButton.setValue((size <= 0 || size == arrayList.size()) ? LocaleController.getString(R.string.Gift2ResaleFilterModel) : LocaleController.formatPluralStringComma("Gift2ResaleFilterModels", size));
        }
        Filter filter3 = this.backdropButton;
        HashSet hashSet2 = resaleGiftsList.notSelectedBackdropAttributes;
        if (filter3 != null) {
            ArrayList arrayList2 = resaleGiftsList.backdropAttributes;
            int size2 = arrayList2.size() - hashSet2.size();
            this.backdropButton.setValue((size2 <= 0 || size2 == arrayList2.size()) ? LocaleController.getString(R.string.Gift2ResaleFilterBackdrop) : LocaleController.formatPluralStringComma("Gift2ResaleFilterBackdrops", size2));
        }
        Filter filter4 = this.patternButton;
        HashSet hashSet3 = resaleGiftsList.notSelectedPatternAttributes;
        if (filter4 != null) {
            ArrayList arrayList3 = resaleGiftsList.patternAttributes;
            int size3 = arrayList3.size() - hashSet3.size();
            this.patternButton.setValue((size3 <= 0 || size3 == arrayList3.size()) ? LocaleController.getString(R.string.Gift2ResaleFilterSymbol) : LocaleController.formatPluralStringComma("Gift2ResaleFilterSymbols", size3));
        }
        for (int i2 = 0; i2 < this.listView.getChildCount(); i2++) {
            if (this.listView.getChildAt(i2) instanceof FlickerLoadingView) {
                resaleGiftsList.load(false);
                break;
            }
        }
        if ((resaleGiftsList.loading || resaleGiftsList.totalCount > 0) && (!hashSet.isEmpty() || !hashSet2.isEmpty() || !hashSet3.isEmpty())) {
            z2 = true;
        }
        this.animatorClearFiltersButtonVisible.setValue(z2, true);
    }
}
