package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import com.google.android.gms.internal.mlkit_vision_common.zzkf;
import com.google.android.gms.internal.mlkit_vision_common.zzkk;
import com.google.android.gms.internal.mlkit_vision_common.zzlj;
import com.google.android.gms.internal.mlkit_vision_common.zzlm;
import com.google.android.gms.internal.mlkit_vision_common.zzlu;
import java.util.ArrayList;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.XiaomiUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.BoostsActivity$$ExternalSyntheticLambda0;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.ContactAddActivity$$ExternalSyntheticLambda8;
import org.telegram.ui.GradientClip;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.OAuthSheet$$ExternalSyntheticLambda17;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public final class TranslateAlert3 extends BottomSheetWithRecyclerListView {
    public UniversalAdapter adapter;
    public final ButtonWithCounterView button;
    public final FrameLayout buttonContainer;
    public final ImageView closeView;
    public boolean collapsed;
    public String from_lang;
    public EditTextCaption$$ExternalSyntheticLambda0 onUseListener;
    public int requestId;
    public CharSequence text;
    public String to_lang;
    public int tone;
    public final String[] tones;
    public final String[] tonesText;
    public CharSequence translated;
    public boolean translatedLoading;

    public final class Header extends FrameLayout implements Theme.Colorable {
        public final LinearLayout anotherExample;
        public final ImageView anotherExampleIcon;
        public final TextView anotherExampleText;
        public final CheckBox2 emojifyCheckbox;
        public final LinearLayout emojifyContainer;
        public final ImageView imageView;
        public final LinearLayout layout2;
        public final Theme.ResourcesProvider resourcesProvider;
        public final TextView text1View;
        public final TextView text2View;
        public final TextView text3View;

        public final class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            public static UItem of(int i, String str, String str2, String str3, View.OnClickListener onClickListener, boolean z, View.OnClickListener onClickListener2, AIEditorAlert$AiStyleAlert$$ExternalSyntheticLambda1 aIEditorAlert$AiStyleAlert$$ExternalSyntheticLambda1) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.id = i;
                uItemOfFactory.text = str;
                uItemOfFactory.subtext = str2;
                uItemOfFactory.textValue = str3;
                uItemOfFactory.clickCallback = onClickListener;
                uItemOfFactory.checked = z;
                uItemOfFactory.clickCallback2 = onClickListener2;
                uItemOfFactory.object = aIEditorAlert$AiStyleAlert$$ExternalSyntheticLambda1;
                return uItemOfFactory;
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                Header header = (Header) view;
                CharSequence charSequence = uItem.text;
                CharSequence charSequence2 = uItem.subtext;
                CharSequence charSequence3 = uItem.textValue;
                View.OnClickListener onClickListener = uItem.clickCallback;
                boolean z2 = uItem.checked;
                View.OnClickListener onClickListener2 = uItem.clickCallback2;
                Object obj = uItem.object;
                View.OnClickListener onClickListener3 = obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null;
                header.text1View.setText(charSequence);
                header.text2View.setText(charSequence2);
                header.text3View.setText(charSequence3);
                header.imageView.setVisibility(onClickListener != null ? 0 : 8);
                LinearLayout linearLayout = header.layout2;
                linearLayout.setOnClickListener(onClickListener);
                linearLayout.setClickable(onClickListener != null);
                header.emojifyCheckbox.checkBoxBase.setChecked(-1, z2, false);
                LinearLayout linearLayout2 = header.emojifyContainer;
                linearLayout2.setVisibility(onClickListener2 != null ? 0 : 8);
                linearLayout2.setOnClickListener(onClickListener2);
                LinearLayout linearLayout3 = header.anotherExample;
                linearLayout3.setVisibility(onClickListener3 != null ? 0 : 8);
                linearLayout3.setOnClickListener(new ContactAddActivity$$ExternalSyntheticLambda8(21, header, onClickListener3));
                header.updateColors$1();
            }

            @Override
            public final boolean contentsEquals(UItem uItem, UItem uItem2) {
                return TextUtils.equals(uItem.text, uItem2.text) && TextUtils.equals(uItem.subtext, uItem2.subtext) && TextUtils.equals(uItem.textValue, uItem2.textValue) && uItem.clickCallback2 == uItem2.clickCallback2;
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new Header(context, resourcesProvider);
            }

            @Override
            public final boolean equals(UItem uItem, UItem uItem2) {
                return uItem.id == uItem2.id;
            }

            @Override
            public final boolean isClickable() {
                return false;
            }
        }

        public Header(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            setClipToPadding(false);
            setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(6.0f));
            LinearLayout linearLayoutM = zzkf.m(context, 0);
            addView(linearLayoutM, LayoutHelper.createFrame(-2, -2, 19));
            TextView textView = new TextView(context);
            this.text1View = textView;
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.getTypeface("fonts/rextrabold.ttf"));
            linearLayoutM.addView(textView, LayoutHelper.createLinear(-2, -2, 19, 0, 0, 0, 0));
            LinearLayout linearLayout = new LinearLayout(context);
            this.layout2 = linearLayout;
            linearLayout.setOrientation(0);
            linearLayout.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
            ScaleStateListAnimator.apply(linearLayout, 0.1f, 1.5f);
            linearLayoutM.addView(linearLayout, LayoutHelper.createFrame(-2, -2.0f, 19, -6.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.text2View = textView2;
            textView2.setTextSize(1, 14.0f);
            textView2.setTypeface(AndroidUtilities.getTypeface("fonts/rextrabold.ttf"));
            linearLayout.addView(textView2, LayoutHelper.createLinear(-2, -2, 19, 0, 0, 0, 0));
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setImageResource(R.drawable.arrows_select);
            linearLayout.addView(imageView, LayoutHelper.createLinear(16, 16, 19, 1, 0, 0, 0));
            imageView.setTranslationY(AndroidUtilities.dp(1.0f));
            TextView textView3 = new TextView(context);
            this.text3View = textView3;
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(AndroidUtilities.getTypeface("fonts/rextrabold.ttf"));
            linearLayoutM.addView(textView3, LayoutHelper.createLinear(-2, -2, 19, -6, 0, 0, 0));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.emojifyContainer = linearLayout2;
            linearLayout2.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f));
            linearLayout2.setClipToPadding(false);
            linearLayout2.setOrientation(0);
            CheckBox2 checkBox2 = new CheckBox2(context, 20, resourcesProvider);
            this.emojifyCheckbox = checkBox2;
            int i = Theme.key_radioBackgroundChecked;
            int i2 = Theme.key_checkboxDisabled;
            int i3 = Theme.key_checkboxCheck;
            CheckBoxBase checkBoxBase = checkBox2.checkBoxBase;
            checkBoxBase.setColor(i, i2, i3);
            checkBox2.setDrawUnchecked(true);
            checkBoxBase.setChecked(-1, false, false);
            checkBox2.setDrawBackgroundAsArc(10);
            linearLayout2.addView(checkBox2, LayoutHelper.createLinear(22, 22, 16, 0, 0, 0, 0));
            TextView textView4 = new TextView(context);
            zzlj.m(Theme.key_dialogTextBlack, resourcesProvider, textView4, 14.0f);
            textView4.setText(LocaleController.getString(R.string.AIEditorEmojify));
            linearLayout2.addView(textView4, LayoutHelper.createLinear(-2, -2, 16, 3, -1, 2, 0));
            addView(linearLayout2, LayoutHelper.createFrame(-2, -2.0f, 21, 0.0f, -3.0f, -6.0f, -3.0f));
            ScaleStateListAnimator.apply(linearLayout2, 0.025f, 1.5f);
            LinearLayout linearLayout3 = new LinearLayout(context);
            this.anotherExample = linearLayout3;
            linearLayout3.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f));
            linearLayout3.setOrientation(0);
            linearLayout3.setVisibility(8);
            addView(linearLayout3, LayoutHelper.createFrame(-2, -2.0f, 53, 0.0f, 0.0f, -6.0f, 0.0f));
            ScaleStateListAnimator.apply(linearLayout3, 0.025f, 1.5f);
            ImageView imageView2 = new ImageView(context);
            this.anotherExampleIcon = imageView2;
            imageView2.setImageResource(R.drawable.mini_replace2);
            linearLayout3.addView(imageView2, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 4, 0));
            TextView textView5 = new TextView(context);
            this.anotherExampleText = textView5;
            zzkk.m(14.0f, 1, textView5);
            textView5.setText(LocaleController.getString(R.string.AIEditorAnotherExample));
            linearLayout3.addView(textView5, LayoutHelper.createLinear(-2, -2, 16));
            updateColors$1();
        }

        public int[] getColorKeys() {
            return null;
        }

        @Override
        public final void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }

        @Override
        public final void updateColors$1() {
            int i = Theme.key_windowBackgroundWhiteBlackText;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            this.text1View.setTextColor(Theme.getColor(i, resourcesProvider));
            int i2 = Theme.key_windowBackgroundWhiteBlueHeader;
            this.text2View.setTextColor(Theme.getColor(i2, resourcesProvider));
            this.text3View.setTextColor(Theme.getColor(i, resourcesProvider));
            this.imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, resourcesProvider), PorterDuff.Mode.MULTIPLY));
            LinearLayout linearLayout = this.layout2;
            linearLayout.setBackground(linearLayout.isClickable() ? Theme.createRadSelectorDrawable(Theme.multAlpha(0.1f, Theme.getColor(null, i2, false)), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f)) : null);
            if (linearLayout.isClickable()) {
                ScaleStateListAnimator.apply(linearLayout, 0.1f, 1.5f);
            } else {
                linearLayout.setStateListAnimator(null);
            }
            this.emojifyContainer.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, resourcesProvider), 24, 24));
            int i3 = Theme.key_featuredStickers_addButton;
            this.anotherExampleIcon.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i3, resourcesProvider), PorterDuff.Mode.SRC_IN));
            this.anotherExampleText.setTextColor(Theme.getColor(i3, resourcesProvider));
            this.anotherExample.setBackground(Theme.createRadSelectorDrawable(Theme.multAlpha(0.1f, Theme.getColor(i3, resourcesProvider)), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f)));
        }
    }

    public final class Text extends FrameLayout implements Theme.Colorable {
        public final AnimatedFloat animatedClipHeight;
        public int clipHeight;
        public boolean collapsed;
        public final ImageView copyButton;
        public final TextView moreView;
        public boolean needDivider;
        public final Theme.ResourcesProvider resourcesProvider;
        public final AnonymousClass1 shortTextView;
        public final AnonymousClass2 textView;
        public final FrameLayout.LayoutParams textViewLayoutParams;

        public final class AnonymousClass2 extends SpoilersTextView {
            @Override
            public final void onDraw(Canvas canvas) {
                super.onDraw(canvas);
                canvas.save();
                canvas.translate(getPaddingLeft(), getPaddingTop());
                SquigglyLinesSpan.drawOnText(canvas, getLayout());
                canvas.restore();
            }
        }

        public final class Factory extends UItem.UItemFactory {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            public static UItem of(int i, CharSequence charSequence, boolean z, View.OnClickListener onClickListener, LinkSpanDrawable.LinksTextView.OnLinkPress onLinkPress, View.OnClickListener onClickListener2) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.id = i;
                uItemOfFactory.text = charSequence;
                uItemOfFactory.collapsed = z;
                uItemOfFactory.locked = false;
                uItemOfFactory.clickCallback = onClickListener;
                uItemOfFactory.object = onLinkPress;
                uItemOfFactory.clickCallback2 = onClickListener2;
                return uItemOfFactory;
            }

            @Override
            public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                Text text = (Text) view;
                CharSequence charSequence = uItem.text;
                boolean z2 = uItem.collapsed;
                View.OnClickListener onClickListener = uItem.clickCallback;
                Object obj = uItem.object;
                LinkSpanDrawable.LinksTextView.OnLinkPress onLinkPress = obj != null ? (LinkSpanDrawable.LinksTextView.OnLinkPress) obj : null;
                boolean z3 = uItem.locked;
                View.OnClickListener onClickListener2 = uItem.clickCallback2;
                text.getClass();
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : AnimatedEmojiSpan.cloneSpans(charSequence));
                LoadingSpan[] loadingSpanArr = (LoadingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), LoadingSpan.class);
                AnonymousClass2 anonymousClass2 = text.textView;
                if (loadingSpanArr != null) {
                    int i = 0;
                    while (i < loadingSpanArr.length) {
                        int spanStart = spannableStringBuilder.getSpanStart(loadingSpanArr[i]);
                        int spanEnd = spannableStringBuilder.getSpanEnd(loadingSpanArr[i]);
                        spannableStringBuilder.removeSpan(loadingSpanArr[i]);
                        LoadingSpan loadingSpan = loadingSpanArr[i];
                        boolean z4 = z3;
                        LoadingSpan loadingSpan2 = new LoadingSpan(loadingSpan.size, loadingSpan.yOffset, anonymousClass2, null);
                        LoadingSpan loadingSpan3 = loadingSpanArr[i];
                        loadingSpan2.height = loadingSpan3.height;
                        loadingSpan2.alpha = loadingSpan3.alpha;
                        loadingSpan2.fullWidth = loadingSpan3.fullWidth;
                        spannableStringBuilder.setSpan(loadingSpan2, spanStart, spanEnd, 33);
                        i++;
                        z3 = z4;
                    }
                }
                boolean z5 = z3;
                boolean z6 = text.collapsed;
                AnonymousClass1 anonymousClass1 = text.shortTextView;
                if (!z6 || z2) {
                    anonymousClass1.setVisibility(z2 ? 0 : 8);
                    anonymousClass2.setVisibility(!z2 ? 0 : 8);
                } else {
                    anonymousClass1.setVisibility(0);
                    anonymousClass2.setVisibility(0);
                    ViewPropertyAnimator viewPropertyAnimatorWithEndAction = anonymousClass1.animate().alpha(0.0f).withEndAction(new Tooltip$$ExternalSyntheticLambda0(text, 4));
                    CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                    OKLCH.m(viewPropertyAnimatorWithEndAction, cubicBezierInterpolator, 320L);
                    anonymousClass2.animate().alpha(1.0f).setInterpolator(cubicBezierInterpolator).setDuration(320L).start();
                }
                text.collapsed = z2;
                TextView textView = text.moreView;
                textView.setVisibility(z2 ? 0 : 8);
                textView.setOnClickListener(onClickListener);
                text.setClipChildren(z2);
                anonymousClass1.setText(spannableStringBuilder);
                anonymousClass2.setText(spannableStringBuilder);
                anonymousClass2.setTextIsSelectable(!z5 && (loadingSpanArr == null || loadingSpanArr.length == 0));
                anonymousClass2.setOnLinkPressListener(onLinkPress);
                ImageView imageView = text.copyButton;
                imageView.setVisibility(onClickListener2 != null ? 0 : 8);
                imageView.setOnClickListener(onClickListener2);
                text.needDivider = z;
                text.setWillNotDraw(!z);
            }

            @Override
            public final boolean contentsEquals(UItem uItem, UItem uItem2) {
                return TextUtils.equals(uItem.text, uItem2.text) && uItem.collapsed == uItem2.collapsed;
            }

            @Override
            public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new Text(context, resourcesProvider);
            }

            @Override
            public final boolean equals(UItem uItem, UItem uItem2) {
                return uItem.id == uItem2.id;
            }

            @Override
            public final boolean isClickable() {
                return false;
            }
        }

        public Text(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.clipHeight = -1;
            this.animatedClipHeight = new AnimatedFloat(this, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.resourcesProvider = resourcesProvider;
            setClipToPadding(false);
            setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
            ?? r2 = new SpoilersTextView(context) {
                public final GradientClip clip = new GradientClip();

                @Override
                public final void onDraw(Canvas canvas) {
                    int iDp = AndroidUtilities.dp(8.0f) + Text.this.moreView.getWidth();
                    canvas.saveLayerAlpha(getScrollX(), 0.0f, (getWidth() + getScrollX()) - iDp, getHeight(), 255, 31);
                    super.onDraw(canvas);
                    canvas.save();
                    canvas.translate(getPaddingLeft(), getPaddingTop());
                    SquigglyLinesSpan.drawOnText(canvas, getLayout());
                    canvas.restore();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set((getWidth() - iDp) - AndroidUtilities.dp(24.0f), 0.0f, getWidth() - iDp, getHeight());
                    this.clip.draw(canvas, rectF, 2, 1.0f);
                    canvas.restore();
                }
            };
            this.shortTextView = r2;
            NotificationCenter.listenEmojiLoading(r2);
            r2.setTextSize(1, 16.0f);
            r2.setMaxLines(1);
            r2.setSingleLine();
            r2.setEllipsize(TextUtils.TruncateAt.END);
            addView((View) r2, LayoutHelper.createFrame(-2.0f, -1));
            TextView textView = new TextView(context);
            this.moreView = textView;
            textView.setPadding(zzlm.m(8.0f, R.string.DescriptionMore, textView), 0, AndroidUtilities.dp(8.0f), 0);
            textView.setGravity(17);
            ScaleStateListAnimator.apply(textView, 0.1f, 1.5f);
            addView(textView, LayoutHelper.createFrame(-2, 18.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(context, null, true);
            this.textView = anonymousClass2;
            NotificationCenter.listenEmojiLoading(anonymousClass2);
            anonymousClass2.setTextSize(1, 16.0f);
            anonymousClass2.setTextIsSelectable(true);
            FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-2.0f, -1);
            this.textViewLayoutParams = layoutParamsCreateFrame;
            addView(anonymousClass2, layoutParamsCreateFrame);
            ImageView imageView = new ImageView(context);
            this.copyButton = imageView;
            imageView.setImageResource(R.drawable.msg_copy);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setContentDescription(LocaleController.getString(R.string.Copy));
            ScaleStateListAnimator.apply(imageView, 0.1f, 1.5f);
            addView(imageView, LayoutHelper.createFrame(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
            imageView.setVisibility(8);
            updateColors$1();
        }

        @Override
        public final void dispatchDraw(Canvas canvas) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getWidth(), this.animatedClipHeight.set(this.clipHeight, false));
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        public int[] getColorKeys() {
            return null;
        }

        @Override
        public final void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.needDivider) {
                View view = this.collapsed ? this.shortTextView : this.textView;
                Paint themePaint = Theme.getThemePaint("paintDivider", this.resourcesProvider);
                if (themePaint == null) {
                    themePaint = Theme.dividerPaint;
                }
                Paint paint = themePaint;
                if (LocaleController.isRTL) {
                    canvas.drawRect(0.0f, getMeasuredHeight() - 1, view.getRight(), getMeasuredHeight(), paint);
                } else {
                    canvas.drawRect(view.getLeft(), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), paint);
                }
            }
        }

        @Override
        public final void onMeasure(int i, int i2) {
            this.clipHeight = getMeasuredHeight();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
            FrameLayout.LayoutParams layoutParams = this.textViewLayoutParams;
            layoutParams.bottomMargin = 0;
            super.onMeasure(iMakeMeasureSpec, i2);
            if (this.copyButton.getVisibility() == 0) {
                Layout layout = this.textView.getLayout();
                if (layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > layout.getWidth() - AndroidUtilities.dp(42.0f)) {
                    layoutParams.bottomMargin = AndroidUtilities.dp(26.0f);
                    super.onMeasure(iMakeMeasureSpec, i2);
                }
            }
            if (getMeasuredHeight() > this.clipHeight && !this.collapsed) {
                this.clipHeight = getMeasuredHeight();
                invalidate();
            } else {
                int measuredHeight = getMeasuredHeight();
                this.clipHeight = measuredHeight;
                this.animatedClipHeight.set(measuredHeight, true);
            }
        }

        public void setHandlesColor(int i) {
            AnonymousClass2 anonymousClass2 = this.textView;
            if (Build.VERSION.SDK_INT < 29 || XiaomiUtilities.isMIUI()) {
                return;
            }
            try {
                Drawable textSelectHandleLeft = anonymousClass2.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(i, mode);
                anonymousClass2.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandle = anonymousClass2.getTextSelectHandle();
                textSelectHandle.setColorFilter(i, mode);
                anonymousClass2.setTextSelectHandle(textSelectHandle);
                Drawable textSelectHandleRight = anonymousClass2.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(i, mode);
                anonymousClass2.setTextSelectHandleRight(textSelectHandleRight);
            } catch (Exception unused) {
            }
        }

        @Override
        public final void updateColors$1() {
            int i = Theme.key_windowBackgroundWhiteBlackText;
            Theme.ResourcesProvider resourcesProvider = this.resourcesProvider;
            setTextColor(Theme.getColor(i, resourcesProvider));
            int i2 = Theme.key_windowBackgroundWhiteBlueHeader;
            int color = Theme.getColor(i2, resourcesProvider);
            TextView textView = this.moreView;
            textView.setTextColor(color);
            textView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(9.0f), Theme.multAlpha(0.1f, Theme.getColor(i2, resourcesProvider))));
            int color2 = Theme.getColor(i, resourcesProvider);
            AnonymousClass2 anonymousClass2 = this.textView;
            anonymousClass2.setTextColor(color2);
            anonymousClass2.setLinkTextColor(Theme.getColor(i2, resourcesProvider));
            anonymousClass2.setHighlightColor(Theme.getColor(Theme.key_chat_inTextSelectionHighlight, resourcesProvider));
            setHandlesColor(Theme.getColor(Theme.key_chat_TextSelectionCursor, resourcesProvider));
            int i3 = Theme.key_featuredStickers_addButton;
            PorterDuffColorFilter porterDuffColorFilter = new PorterDuffColorFilter(Theme.getColor(i3, resourcesProvider), PorterDuff.Mode.SRC_IN);
            ImageView imageView = this.copyButton;
            imageView.setColorFilter(porterDuffColorFilter);
            imageView.setBackground(Theme.createSelectorDrawable(Theme.multAlpha(0.1f, Theme.getColor(i3, resourcesProvider)), 1, -1));
        }
    }

    public TranslateAlert3(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, null, false, false, false, false, false, 2, resourcesProvider);
        this.tone = 1;
        this.tones = new String[]{"formal", "neutral", "casual"};
        this.tonesText = new String[]{"Formal", "Neutral", "Casual"};
        this.collapsed = true;
        this.requestId = -1;
        ImageView imageView = new ImageView(context);
        this.closeView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.ic_close_white);
        int i = Theme.key_windowBackgroundWhiteBlackText;
        imageView.setColorFilter(getThemedColor(i));
        imageView.setBackground(Theme.createSelectorDrawable(Theme.multAlpha(0.1f, getThemedColor(i)), 1, -1));
        this.actionBar.addView(imageView, LayoutHelper.createFrame(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        ScaleStateListAnimator.apply(imageView, 0.1f, 1.5f);
        imageView.setOnClickListener(new TranslateAlert3$$ExternalSyntheticLambda3(this, 0));
        String toLanguage = TranslateAlert2.getToLanguage();
        this.to_lang = toLanguage;
        if (toLanguage == null) {
            this.to_lang = TranslateController.currentLanguage();
        }
        this.ignoreTouchActionBar = false;
        this.headerMoveTop = AndroidUtilities.dp(12.0f);
        int i2 = Theme.key_windowBackgroundGray;
        setBackgroundColor(getThemedColor(i2));
        FrameLayout frameLayout = new FrameLayout(context);
        this.buttonContainer = frameLayout;
        frameLayout.setBackground(new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{Theme.multAlpha(0.0f, getThemedColor(i2)), getThemedColor(i2), getThemedColor(i2)}));
        ButtonWithCounterView buttonWithCounterView = new ButtonWithCounterView(context, resourcesProvider, true);
        buttonWithCounterView.setRoundRadius(24);
        this.button = buttonWithCounterView;
        buttonWithCounterView.setText(LocaleController.getString(R.string.OK));
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, 48.0f, 119, 12.0f, 6.0f, 12.0f, 12.0f);
        int i3 = layoutParamsCreateFrame.leftMargin;
        int i4 = this.backgroundPaddingLeft;
        layoutParamsCreateFrame.leftMargin = i3 + i4;
        layoutParamsCreateFrame.rightMargin += i4;
        frameLayout.addView(buttonWithCounterView, layoutParamsCreateFrame);
        this.containerView.addView(frameLayout, LayoutHelper.createFrame(-1, -2, 80));
        RecyclerListView recyclerListView = this.recyclerListView;
        int i5 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i5, 0, i5, AndroidUtilities.dp(66.0f));
        this.recyclerListView.setClipToPadding(false);
        this.recyclerListView.setSections();
        this.recyclerListView.setOnItemClickListener(new BoostsActivity$$ExternalSyntheticLambda0(13, this, resourcesProvider));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.mSupportsChangeAnimations = false;
        defaultItemAnimator.delayAnimations = false;
        CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
        defaultItemAnimator.mAddInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mMoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mRemoveInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.mChangeInterpolator = cubicBezierInterpolator;
        defaultItemAnimator.setDurations(350L);
        this.recyclerListView.setItemAnimator(defaultItemAnimator);
        this.adapter.update(false);
    }

    public final void addChecked$1(ItemOptions itemOptions, LinearLayout linearLayout, boolean z, String str, Runnable runnable) {
        int i = Theme.key_actionBarDefaultSubmenuItem;
        int i2 = Theme.key_actionBarDefaultSubmenuItemIcon;
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(1, getContext(), this.resourcesProvider, false, false);
        actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        actionBarMenuSubItem.setText(str);
        actionBarMenuSubItem.setChecked(z);
        int color = Theme.getColor(i, this.resourcesProvider);
        int color2 = Theme.getColor(i2, this.resourcesProvider);
        actionBarMenuSubItem.setTextColor(color);
        actionBarMenuSubItem.setIconColor(color2);
        actionBarMenuSubItem.setSelectorColor(Theme.multAlpha(0.12f, Theme.getColor(i, this.resourcesProvider)));
        actionBarMenuSubItem.setOnClickListener(new AIEditorAlert$$ExternalSyntheticLambda40(itemOptions, z, runnable, 1));
        linearLayout.addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, -2));
    }

    @Override
    public final RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, new TranslateAlert3$$ExternalSyntheticLambda2(this, 0), this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.applyBackground = false;
        return universalAdapter;
    }

    @Override
    public final CharSequence getTitle() {
        return "Translate";
    }

    public final void lambda$new$1$1(int i, Theme.ResourcesProvider resourcesProvider) {
        UItem item = this.adapter.getItem(i - 1);
        if (item == null) {
            return;
        }
        int i2 = item.id;
        if (i2 == 1) {
            CharSequence charSequence = this.translated;
            if (charSequence == null || this.translatedLoading) {
                return;
            }
            AndroidUtilities.addToClipboard(charSequence);
            return;
        }
        if (i2 == 2) {
            if (UserConfig.getInstance(this.currentAccount).isPremium()) {
                MessagesController.getInstance(this.currentAccount).getTranslateController().toggleTranslatingDialog(0L);
                lambda$showGiftOfferSheet$15();
            } else {
                if (LaunchActivity.getSafeLastFragment() == null) {
                    return;
                }
                new PremiumFeatureBottomSheet(getContext(), 13, resourcesProvider).show();
            }
        }
    }

    public final void lambda$onToLangMenu$4(int i) {
        if (this.requestId >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestId, true);
            this.requestId = -1;
        }
        this.tone = i;
        TranslateAlert2.setToLanguage(this.to_lang);
        requestTranslate();
    }

    public final void lambda$onToLangMenu$5(TranslateController.Language language) {
        if (this.requestId >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestId, true);
            this.requestId = -1;
        }
        String str = language.code;
        this.to_lang = str;
        TranslateAlert2.setToLanguage(str);
        requestTranslate();
    }

    public final void lambda$onToLangMenu$6(TranslateController.Language language) {
        if (this.requestId >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestId, true);
            this.requestId = -1;
        }
        String str = language.code;
        this.to_lang = str;
        TranslateAlert2.setToLanguage(str);
        requestTranslate();
    }

    public final void lambda$requestTranslate$14(TLRPC.TL_messages_translateResult tL_messages_translateResult, TLRPC.TL_error tL_error) {
        this.requestId = -1;
        ButtonWithCounterView buttonWithCounterView = this.button;
        buttonWithCounterView.setLoading(false);
        if (tL_error != null) {
            zzlu.m(this.topBulletinContainer, this.resourcesProvider, tL_error);
            buttonWithCounterView.setText(LocaleController.getString(R.string.OK));
            buttonWithCounterView.setOnClickListener(new TranslateAlert3$$ExternalSyntheticLambda3(this, 1));
        } else if (tL_messages_translateResult == null || tL_messages_translateResult.result.isEmpty()) {
            buttonWithCounterView.setText(LocaleController.getString(R.string.OK));
            buttonWithCounterView.setOnClickListener(new TranslateAlert3$$ExternalSyntheticLambda3(this, 2));
        } else {
            this.translated = MessageObject.formatTextWithEntities(tL_messages_translateResult.result.get(0));
            this.translatedLoading = false;
            this.adapter.update(true);
        }
    }

    @Override
    public final void onActionBarAlpha(float f) {
        ImageView imageView = this.closeView;
        float f2 = 1.0f - f;
        imageView.setAlpha(f2);
        imageView.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f2));
        imageView.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f2));
    }

    @Override
    public final void onContainerViewTranslation() {
        checkBackDrawableInsets();
        ValueAnimator valueAnimator = this.keyboardContentAnimator;
        FrameLayout frameLayout = this.buttonContainer;
        if (valueAnimator != null) {
            frameLayout.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            frameLayout.setTranslationY(0.0f);
        }
    }

    public final void onLinkPressed(ClickableSpan clickableSpan) {
        if (clickableSpan == null) {
            return;
        }
        clickableSpan.onClick(this.containerView);
    }

    public final void onToLangMenu$1(View view) {
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.container, this.resourcesProvider, view);
        itemOptionsMakeOptions.maxHeight = AndroidUtilities.dp(450.0f);
        int i = 0;
        itemOptionsMakeOptions.drawScrim = false;
        itemOptionsMakeOptions.onTopOfScrim = true;
        ScrollView scrollView = new ScrollView(getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        itemOptionsMakeOptions.addView(scrollView);
        int i2 = 0;
        while (i2 < this.tones.length) {
            addChecked$1(itemOptionsMakeOptions, linearLayout, this.tone == i2, this.tonesText[i2], new OAuthSheet$$ExternalSyntheticLambda17(this, i2, 8));
            i2++;
        }
        TranslateAlert3 translateAlert3 = this;
        ActionBarPopupWindow.GapView gapView = new ActionBarPopupWindow.GapView(getContext(), Theme.key_actionBarDefaultSubmenuSeparator, translateAlert3.resourcesProvider);
        gapView.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(gapView, LayoutHelper.createLinear(-1, 8));
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (!TextUtils.isEmpty(translateAlert3.to_lang)) {
            translateAlert3.addChecked$1(itemOptionsMakeOptions, linearLayout, true, TranslateAlert2.capitalFirst(TranslateAlert2.languageName(translateAlert3.to_lang, null, null)), null);
        }
        int size = suggestedLanguages.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + 1;
            final TranslateController.Language language = suggestedLanguages.get(i3);
            if (!TextUtils.equals(language.code, translateAlert3.to_lang)) {
                final int i5 = 0;
                translateAlert3.addChecked$1(itemOptionsMakeOptions, linearLayout, false, language.displayName, new Runnable(this) {
                    public final TranslateAlert3 f$0;

                    {
                        this.f$0 = this;
                    }

                    @Override
                    public final void run() {
                        switch (i5) {
                            case 0:
                                this.f$0.lambda$onToLangMenu$5(language);
                                break;
                            default:
                                this.f$0.lambda$onToLangMenu$6(language);
                                break;
                        }
                    }
                });
            }
            i3 = i4;
        }
        ActionBarPopupWindow.GapView gapView2 = new ActionBarPopupWindow.GapView(getContext(), Theme.key_actionBarDefaultSubmenuSeparator, translateAlert3.resourcesProvider);
        gapView2.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(gapView2, LayoutHelper.createLinear(-1, 8));
        int size2 = languages.size();
        while (i < size2) {
            TranslateController.Language language2 = languages.get(i);
            i++;
            final TranslateController.Language language3 = language2;
            final int i6 = 1;
            translateAlert3.addChecked$1(itemOptionsMakeOptions, linearLayout, TextUtils.equals(language3.code, translateAlert3.to_lang), language3.displayName, new Runnable(this) {
                public final TranslateAlert3 f$0;

                {
                    this.f$0 = this;
                }

                @Override
                public final void run() {
                    switch (i6) {
                        case 0:
                            this.f$0.lambda$onToLangMenu$5(language3);
                            break;
                        default:
                            this.f$0.lambda$onToLangMenu$6(language3);
                            break;
                    }
                }
            });
            translateAlert3 = this;
        }
        itemOptionsMakeOptions.show();
    }

    public final void requestTranslate() {
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        int i = 1;
        CharSequence[] charSequenceArr = {this.text};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CharSequence charSequence = charSequenceArr[0];
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        if (this.onUseListener != null) {
            this.button.setLoading(true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
        spannableStringBuilder.setSpan(new LoadingSpan(AndroidUtilities.dp(120.0f), 0, null, null), 0, spannableStringBuilder.length(), 33);
        this.translated = spannableStringBuilder;
        this.translatedLoading = true;
        TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
        tL_messages_translateText.to_lang = this.to_lang;
        tL_messages_translateText.flags |= 2;
        tL_messages_translateText.text.add(tL_textWithEntities);
        int i2 = this.tone;
        if (i2 != 1) {
            tL_messages_translateText.flags |= 4;
            tL_messages_translateText.tone = this.tones[i2];
        }
        this.requestId = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_translateText, new AiTonesController$$ExternalSyntheticLambda0(), new TranslateAlert3$$ExternalSyntheticLambda2(this, i));
        this.adapter.update(true);
    }

    @Override
    public final void show() {
        super.show();
        BottomSheetWithRecyclerListView.AnonymousClass4 anonymousClass4 = this.actionBar;
        if (anonymousClass4 != null) {
            anonymousClass4.setTitle("Translate");
        }
        this.adapter.update(false);
        requestTranslate();
        if (this.onUseListener != null) {
            ButtonWithCounterView buttonWithCounterView = this.button;
            buttonWithCounterView.setText("Use This Translation");
            buttonWithCounterView.setOnClickListener(new TranslateAlert3$$ExternalSyntheticLambda3(this, 3));
        }
    }
}
