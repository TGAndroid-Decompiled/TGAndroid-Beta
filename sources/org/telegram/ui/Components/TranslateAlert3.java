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
import android.text.style.URLSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.DefaultItemAnimator;
import com.google.android.exoplayer2.ext.mediasession.MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzkb;
import com.google.android.gms.internal.mlkit_vision_common.zzkr;
import java.util.ArrayList;
import org.telegram.messenger.AiTonesController$$ExternalSyntheticLambda0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.TranslateController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.XiaomiUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBar;
import org.telegram.ui.ActionBar.ActionBarMenuSubItem;
import org.telegram.ui.ActionBar.ActionBarPopupWindow;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.Premium.PremiumFeatureBottomSheet;
import org.telegram.ui.Components.spoilers.SpoilersTextView;
import org.telegram.ui.GradientClip;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.recorder.ButtonWithCounterView;

public class TranslateAlert3 extends BottomSheetWithRecyclerListView {
    private UniversalAdapter adapter;
    private ButtonWithCounterView button;
    private FrameLayout buttonContainer;
    private ImageView closeView;
    private boolean collapsed;
    private long dialogId;
    private String from_lang;
    private int messageId;
    private boolean noforwards;
    private Utilities.CallbackReturn<URLSpan, Boolean> onLinkPress;
    private Utilities.Callback<CharSequence> onUseListener;
    private int requestId;
    private boolean summarized;
    private CharSequence text;
    private String to_lang;
    private int tone;
    private String[] tones;
    private String[] tonesText;
    private CharSequence translated;
    private boolean translatedLoading;

    public static class Header extends FrameLayout implements Theme.Colorable {
        public final LinearLayout anotherExample;
        public final ImageView anotherExampleIcon;
        public final TextView anotherExampleText;
        public final CheckBox2 emojifyCheckbox;
        public final LinearLayout emojifyContainer;
        public final TextView emojifyTextView;
        public final ImageView imageView;
        public final LinearLayout layout1;
        public final LinearLayout layout2;
        private final Theme.ResourcesProvider resourcesProvider;
        public final TextView text1View;
        public final TextView text2View;
        public final TextView text3View;

        public static class Factory extends UItem.UItemFactory<Header> {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            public static UItem of(int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener) {
                return of(i, charSequence, charSequence2, charSequence3, onClickListener, false, null, null);
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                Header header = (Header) view;
                CharSequence charSequence = uItem.text;
                CharSequence charSequence2 = uItem.subtext;
                CharSequence charSequence3 = uItem.textValue;
                View.OnClickListener onClickListener = uItem.clickCallback;
                boolean z2 = uItem.checked;
                View.OnClickListener onClickListener2 = uItem.clickCallback2;
                Object obj = uItem.object;
                header.set(charSequence, charSequence2, charSequence3, onClickListener, z2, onClickListener2, obj instanceof View.OnClickListener ? (View.OnClickListener) obj : null);
            }

            @Override
            public boolean contentsEquals(UItem uItem, UItem uItem2) {
                return TextUtils.equals(uItem.text, uItem2.text) && TextUtils.equals(uItem.subtext, uItem2.subtext) && TextUtils.equals(uItem.textValue, uItem2.textValue) && uItem.clickCallback2 == uItem2.clickCallback2;
            }

            @Override
            public boolean equals(UItem uItem, UItem uItem2) {
                return uItem.id == uItem2.id;
            }

            @Override
            public boolean isClickable() {
                return false;
            }

            public static UItem of(int i, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.id = i;
                uItemOfFactory.text = charSequence;
                uItemOfFactory.subtext = charSequence2;
                uItemOfFactory.textValue = charSequence3;
                uItemOfFactory.clickCallback = onClickListener;
                uItemOfFactory.checked = z;
                uItemOfFactory.clickCallback2 = onClickListener2;
                uItemOfFactory.object = onClickListener3;
                return uItemOfFactory;
            }

            @Override
            public Header createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new Header(context, resourcesProvider);
            }
        }

        public Header(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.resourcesProvider = resourcesProvider;
            setClipToPadding(false);
            setPadding(AndroidUtilities.dp(20.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(6.0f));
            LinearLayout linearLayout = new LinearLayout(context);
            this.layout1 = linearLayout;
            linearLayout.setOrientation(0);
            addView(linearLayout, LayoutHelper.createFrame(-2, -2, 19));
            TextView textView = new TextView(context);
            this.text1View = textView;
            textView.setTextSize(1, 14.0f);
            textView.setTypeface(AndroidUtilities.getTypeface("fonts/rextrabold.ttf"));
            linearLayout.addView(textView, LayoutHelper.createLinear(-2, -2, 19, 0, 0, 0, 0));
            LinearLayout linearLayout2 = new LinearLayout(context);
            this.layout2 = linearLayout2;
            linearLayout2.setOrientation(0);
            linearLayout2.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(1.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
            ScaleStateListAnimator.apply(linearLayout2);
            linearLayout.addView(linearLayout2, LayoutHelper.createFrame(-2, -2.0f, 19, -6.0f, 0.0f, 0.0f, 0.0f));
            TextView textView2 = new TextView(context);
            this.text2View = textView2;
            textView2.setTextSize(1, 14.0f);
            textView2.setTypeface(AndroidUtilities.getTypeface("fonts/rextrabold.ttf"));
            linearLayout2.addView(textView2, LayoutHelper.createLinear(-2, -2, 19, 0, 0, 0, 0));
            ImageView imageView = new ImageView(context);
            this.imageView = imageView;
            imageView.setImageResource(R.drawable.arrows_select);
            linearLayout2.addView(imageView, LayoutHelper.createLinear(16, 16, 19, 1, 0, 0, 0));
            imageView.setTranslationY(AndroidUtilities.dp(1.0f));
            TextView textView3 = new TextView(context);
            this.text3View = textView3;
            textView3.setTextSize(1, 14.0f);
            textView3.setTypeface(AndroidUtilities.getTypeface("fonts/rextrabold.ttf"));
            linearLayout.addView(textView3, LayoutHelper.createLinear(-2, -2, 19, -6, 0, 0, 0));
            LinearLayout linearLayout3 = new LinearLayout(context);
            this.emojifyContainer = linearLayout3;
            linearLayout3.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(3.0f));
            linearLayout3.setClipToPadding(false);
            linearLayout3.setOrientation(0);
            CheckBox2 checkBox2 = new CheckBox2(context, 20, resourcesProvider);
            this.emojifyCheckbox = checkBox2;
            checkBox2.setColor(Theme.key_radioBackgroundChecked, Theme.key_checkboxDisabled, Theme.key_checkboxCheck);
            checkBox2.setDrawUnchecked(true);
            checkBox2.setChecked(false, false);
            checkBox2.setDrawBackgroundAsArc(10);
            linearLayout3.addView(checkBox2, LayoutHelper.createLinear(22, 22, 16, 0, 0, 0, 0));
            TextView textView4 = new TextView(context);
            this.emojifyTextView = textView4;
            zzkr.m(Theme.key_dialogTextBlack, resourcesProvider, textView4, 14.0f);
            textView4.setText(LocaleController.getString(R.string.AIEditorEmojify));
            linearLayout3.addView(textView4, LayoutHelper.createLinear(-2, -2, 16, 3, -1, 2, 0));
            addView(linearLayout3, LayoutHelper.createFrame(-2, -2.0f, 21, 0.0f, -3.0f, -6.0f, -3.0f));
            ScaleStateListAnimator.apply(linearLayout3, 0.025f, 1.5f);
            LinearLayout linearLayout4 = new LinearLayout(context);
            this.anotherExample = linearLayout4;
            linearLayout4.setPadding(AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f), AndroidUtilities.dp(6.0f), AndroidUtilities.dp(3.0f));
            linearLayout4.setOrientation(0);
            linearLayout4.setVisibility(8);
            addView(linearLayout4, LayoutHelper.createFrame(-2, -2.0f, 53, 0.0f, 0.0f, -6.0f, 0.0f));
            ScaleStateListAnimator.apply(linearLayout4, 0.025f, 1.5f);
            ImageView imageView2 = new ImageView(context);
            this.anotherExampleIcon = imageView2;
            imageView2.setImageResource(R.drawable.mini_replace2);
            linearLayout4.addView(imageView2, LayoutHelper.createLinear(-2, -2, 16, 0, 0, 4, 0));
            TextView textView5 = new TextView(context);
            this.anotherExampleText = textView5;
            zzkb.m(14.0f, 1, textView5);
            textView5.setText(LocaleController.getString(R.string.AIEditorAnotherExample));
            linearLayout4.addView(textView5, LayoutHelper.createLinear(-2, -2, 16));
            updateColors();
        }

        public void lambda$set$0(View.OnClickListener onClickListener, View view) {
            this.anotherExampleIcon.animate().rotation(this.anotherExampleIcon.getRotation() + 180.0f).setDuration(380L).setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT).start();
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }

        public int[] getColorKeys() {
            return null;
        }

        @Override
        public void onMeasure(int i, int i2) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), i2);
        }

        public void set(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, View.OnClickListener onClickListener, boolean z, View.OnClickListener onClickListener2, View.OnClickListener onClickListener3) {
            this.text1View.setText(charSequence);
            this.text2View.setText(charSequence2);
            this.text3View.setText(charSequence3);
            this.imageView.setVisibility(onClickListener != null ? 0 : 8);
            this.layout2.setOnClickListener(onClickListener);
            this.layout2.setClickable(onClickListener != null);
            this.emojifyCheckbox.setChecked(z, false);
            this.emojifyContainer.setVisibility(onClickListener2 != null ? 0 : 8);
            this.emojifyContainer.setOnClickListener(onClickListener2);
            this.anotherExample.setVisibility(onClickListener3 != null ? 0 : 8);
            this.anotherExample.setOnClickListener(new UndoView$$ExternalSyntheticLambda6(10, this, onClickListener3));
            updateColors();
        }

        @Override
        public void updateColors() {
            TextView textView = this.text1View;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            textView.setTextColor(Theme.getColor(i, this.resourcesProvider));
            TextView textView2 = this.text2View;
            int i2 = Theme.key_windowBackgroundWhiteBlueHeader;
            textView2.setTextColor(Theme.getColor(i2, this.resourcesProvider));
            this.text3View.setTextColor(Theme.getColor(i, this.resourcesProvider));
            this.imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i2, this.resourcesProvider), PorterDuff.Mode.MULTIPLY));
            LinearLayout linearLayout = this.layout2;
            linearLayout.setBackground(linearLayout.isClickable() ? Theme.createRadSelectorDrawable(Theme.multAlpha(0.1f, Theme.getColor(null, i2, false)), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f)) : null);
            if (this.layout2.isClickable()) {
                ScaleStateListAnimator.apply(this.layout2);
            } else {
                ScaleStateListAnimator.reset(this.layout2);
            }
            this.emojifyContainer.setBackground(Theme.createRadSelectorDrawable(Theme.getColor(Theme.key_listSelector, this.resourcesProvider), 24, 24));
            ImageView imageView = this.anotherExampleIcon;
            int i3 = Theme.key_featuredStickers_addButton;
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i3, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            this.anotherExampleText.setTextColor(Theme.getColor(i3, this.resourcesProvider));
            this.anotherExample.setBackground(Theme.createRadSelectorDrawable(Theme.multAlpha(0.1f, Theme.getColor(i3, this.resourcesProvider)), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f)));
        }
    }

    public static class Text extends FrameLayout implements Theme.Colorable {
        private final AnimatedFloat animatedClipHeight;
        private int clipHeight;
        public boolean collapsed;
        public final ImageView copyButton;
        public TextView moreView;
        public boolean needDivider;
        private final Theme.ResourcesProvider resourcesProvider;
        public SpoilersTextView shortTextView;
        public SpoilersTextView textView;
        private FrameLayout.LayoutParams textViewLayoutParams;

        public static class Factory extends UItem.UItemFactory<Text> {
            static {
                UItem.UItemFactory.setup(new Factory());
            }

            public static UItem of(int i, CharSequence charSequence, boolean z, boolean z2, View.OnClickListener onClickListener, LinkSpanDrawable.LinksTextView.OnLinkPress onLinkPress, View.OnClickListener onClickListener2) {
                UItem uItemOfFactory = UItem.ofFactory(Factory.class);
                uItemOfFactory.id = i;
                uItemOfFactory.text = charSequence;
                uItemOfFactory.collapsed = z;
                uItemOfFactory.locked = z2;
                uItemOfFactory.clickCallback = onClickListener;
                uItemOfFactory.object = onLinkPress;
                uItemOfFactory.clickCallback2 = onClickListener2;
                return uItemOfFactory;
            }

            @Override
            public void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
                Text text = (Text) view;
                CharSequence charSequence = uItem.text;
                boolean z2 = uItem.collapsed;
                View.OnClickListener onClickListener = uItem.clickCallback;
                Object obj = uItem.object;
                text.set(charSequence, z2, onClickListener, obj != null ? (LinkSpanDrawable.LinksTextView.OnLinkPress) obj : null, uItem.locked, uItem.clickCallback2, z);
            }

            @Override
            public boolean contentsEquals(UItem uItem, UItem uItem2) {
                return TextUtils.equals(uItem.text, uItem2.text) && uItem.collapsed == uItem2.collapsed;
            }

            @Override
            public boolean equals(UItem uItem, UItem uItem2) {
                return uItem.id == uItem2.id;
            }

            @Override
            public boolean isClickable() {
                return false;
            }

            @Override
            public Text createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
                return new Text(context, resourcesProvider);
            }
        }

        public Text(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context);
            this.clipHeight = -1;
            this.animatedClipHeight = new AnimatedFloat(this, 0L, 320L, CubicBezierInterpolator.EASE_OUT_QUINT);
            this.resourcesProvider = resourcesProvider;
            setClipToPadding(false);
            setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f));
            SpoilersTextView spoilersTextView = new SpoilersTextView(context) {
                private GradientClip clip = new GradientClip();

                @Override
                public void onDraw(Canvas canvas) {
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
            this.shortTextView = spoilersTextView;
            NotificationCenter.listenEmojiLoading(spoilersTextView);
            this.shortTextView.setTextSize(1, 16.0f);
            this.shortTextView.setMaxLines(1);
            this.shortTextView.setSingleLine();
            this.shortTextView.setEllipsize(TextUtils.TruncateAt.END);
            addView(this.shortTextView, LayoutHelper.createFrame(-1, -2.0f));
            TextView textView = new TextView(context);
            this.moreView = textView;
            textView.setText(LocaleController.getString(R.string.DescriptionMore));
            this.moreView.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
            this.moreView.setGravity(17);
            ScaleStateListAnimator.apply(this.moreView);
            addView(this.moreView, LayoutHelper.createFrame(-2, 18.0f, 53, 0.0f, 1.0f, 0.0f, 0.0f));
            SpoilersTextView spoilersTextView2 = new SpoilersTextView(context) {
                @Override
                public void onDraw(Canvas canvas) {
                    super.onDraw(canvas);
                    canvas.save();
                    canvas.translate(getPaddingLeft(), getPaddingTop());
                    SquigglyLinesSpan.drawOnText(canvas, getLayout());
                    canvas.restore();
                }
            };
            this.textView = spoilersTextView2;
            NotificationCenter.listenEmojiLoading(spoilersTextView2);
            this.textView.setTextSize(1, 16.0f);
            this.textView.setTextIsSelectable(true);
            View view = this.textView;
            FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, -2.0f);
            this.textViewLayoutParams = layoutParamsCreateFrame;
            addView(view, layoutParamsCreateFrame);
            ImageView imageView = new ImageView(context);
            this.copyButton = imageView;
            imageView.setImageResource(R.drawable.msg_copy);
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setContentDescription(LocaleController.getString(R.string.Copy));
            ScaleStateListAnimator.apply(imageView);
            addView(imageView, LayoutHelper.createFrame(38, 38.0f, 85, 0.0f, 0.0f, -16.0f, -12.0f));
            imageView.setVisibility(8);
            updateColors();
        }

        public void lambda$set$0() {
            this.shortTextView.setVisibility(8);
        }

        private boolean needsBottomMargin() {
            if (this.copyButton.getVisibility() != 0) {
                return false;
            }
            Layout layout = this.textView.getLayout();
            return layout.getLineCount() > 0 && layout.getLineRight(layout.getLineCount() - 1) > ((float) (layout.getWidth() - AndroidUtilities.dp(42.0f)));
        }

        @Override
        public void dispatchDraw(Canvas canvas) {
            canvas.save();
            canvas.clipRect(0.0f, 0.0f, getWidth(), this.animatedClipHeight.set(this.clipHeight));
            super.dispatchDraw(canvas);
            canvas.restore();
        }

        public int[] getColorKeys() {
            return null;
        }

        @Override
        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (this.needDivider) {
                SpoilersTextView spoilersTextView = this.collapsed ? this.shortTextView : this.textView;
                Paint themePaint = Theme.getThemePaint("paintDivider", this.resourcesProvider);
                if (themePaint == null) {
                    themePaint = Theme.dividerPaint;
                }
                Paint paint = themePaint;
                if (LocaleController.isRTL) {
                    canvas.drawRect(0.0f, getMeasuredHeight() - 1, spoilersTextView.getRight(), getMeasuredHeight(), paint);
                } else {
                    canvas.drawRect(spoilersTextView.getLeft(), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), paint);
                }
            }
        }

        @Override
        public void onMeasure(int i, int i2) {
            this.clipHeight = getMeasuredHeight();
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824);
            this.textViewLayoutParams.bottomMargin = 0;
            super.onMeasure(iMakeMeasureSpec, i2);
            if (needsBottomMargin()) {
                this.textViewLayoutParams.bottomMargin = AndroidUtilities.dp(26.0f);
                super.onMeasure(iMakeMeasureSpec, i2);
            }
            if (getMeasuredHeight() > this.clipHeight && !this.collapsed) {
                this.clipHeight = getMeasuredHeight();
                invalidate();
            } else {
                AnimatedFloat animatedFloat = this.animatedClipHeight;
                int measuredHeight = getMeasuredHeight();
                this.clipHeight = measuredHeight;
                animatedFloat.force(measuredHeight);
            }
        }

        public void set(CharSequence charSequence, boolean z, View.OnClickListener onClickListener, LinkSpanDrawable.LinksTextView.OnLinkPress onLinkPress, boolean z2, View.OnClickListener onClickListener2, boolean z3) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence == null ? "" : AnimatedEmojiSpan.cloneSpans(charSequence));
            LoadingSpan[] loadingSpanArr = (LoadingSpan[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), LoadingSpan.class);
            if (loadingSpanArr != null) {
                for (int i = 0; i < loadingSpanArr.length; i++) {
                    int spanStart = spannableStringBuilder.getSpanStart(loadingSpanArr[i]);
                    int spanEnd = spannableStringBuilder.getSpanEnd(loadingSpanArr[i]);
                    spannableStringBuilder.removeSpan(loadingSpanArr[i]);
                    SpoilersTextView spoilersTextView = this.textView;
                    LoadingSpan loadingSpan = loadingSpanArr[i];
                    spannableStringBuilder.setSpan(new LoadingSpan(spoilersTextView, loadingSpan.size, loadingSpan.yOffset).setHeight(loadingSpanArr[i].height).setAlpha(loadingSpanArr[i].alpha).setFullWidth(loadingSpanArr[i].fullWidth), spanStart, spanEnd, 33);
                }
            }
            if (!this.collapsed || z) {
                this.shortTextView.setVisibility(z ? 0 : 8);
                this.textView.setVisibility(!z ? 0 : 8);
            } else {
                this.shortTextView.setVisibility(0);
                this.textView.setVisibility(0);
                ViewPropertyAnimator viewPropertyAnimatorWithEndAction = this.shortTextView.animate().alpha(0.0f).withEndAction(new Tooltip$$ExternalSyntheticLambda0(this, 26));
                CubicBezierInterpolator cubicBezierInterpolator = CubicBezierInterpolator.EASE_OUT_QUINT;
                OKLCH.m(viewPropertyAnimatorWithEndAction, cubicBezierInterpolator, 320L);
                this.textView.animate().alpha(1.0f).setInterpolator(cubicBezierInterpolator).setDuration(320L).start();
            }
            this.collapsed = z;
            this.moreView.setVisibility(z ? 0 : 8);
            this.moreView.setOnClickListener(onClickListener);
            setClipChildren(z);
            this.shortTextView.setText(spannableStringBuilder);
            this.textView.setText(spannableStringBuilder);
            this.textView.setTextIsSelectable(!z2 && (loadingSpanArr == null || loadingSpanArr.length == 0));
            this.textView.setOnLinkPressListener(onLinkPress);
            this.copyButton.setVisibility(onClickListener2 == null ? 8 : 0);
            this.copyButton.setOnClickListener(onClickListener2);
            this.needDivider = z3;
            setWillNotDraw(!z3);
        }

        public void setHandlesColor(int i) {
            if (Build.VERSION.SDK_INT < 29 || XiaomiUtilities.isMIUI()) {
                return;
            }
            try {
                Drawable textSelectHandleLeft = this.textView.getTextSelectHandleLeft();
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                textSelectHandleLeft.setColorFilter(i, mode);
                this.textView.setTextSelectHandleLeft(textSelectHandleLeft);
                Drawable textSelectHandle = this.textView.getTextSelectHandle();
                textSelectHandle.setColorFilter(i, mode);
                this.textView.setTextSelectHandle(textSelectHandle);
                Drawable textSelectHandleRight = this.textView.getTextSelectHandleRight();
                textSelectHandleRight.setColorFilter(i, mode);
                this.textView.setTextSelectHandleRight(textSelectHandleRight);
            } catch (Exception unused) {
            }
        }

        @Override
        public void updateColors() {
            SpoilersTextView spoilersTextView = this.shortTextView;
            int i = Theme.key_windowBackgroundWhiteBlackText;
            spoilersTextView.setTextColor(Theme.getColor(i, this.resourcesProvider));
            TextView textView = this.moreView;
            int i2 = Theme.key_windowBackgroundWhiteBlueHeader;
            textView.setTextColor(Theme.getColor(i2, this.resourcesProvider));
            this.moreView.setBackground(Theme.createRoundRectDrawable(AndroidUtilities.dp(9.0f), Theme.multAlpha(0.1f, Theme.getColor(i2, this.resourcesProvider))));
            this.textView.setTextColor(Theme.getColor(i, this.resourcesProvider));
            this.textView.setLinkTextColor(Theme.getColor(i2, this.resourcesProvider));
            this.textView.setHighlightColor(Theme.getColor(Theme.key_chat_inTextSelectionHighlight, this.resourcesProvider));
            setHandlesColor(Theme.getColor(Theme.key_chat_TextSelectionCursor, this.resourcesProvider));
            ImageView imageView = this.copyButton;
            int i3 = Theme.key_featuredStickers_addButton;
            imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(i3, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
            this.copyButton.setBackground(Theme.createSelectorDrawable(Theme.multAlpha(0.1f, Theme.getColor(i3, this.resourcesProvider)), 1, -1));
        }
    }

    public TranslateAlert3(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context, null, false, false, false, false, BottomSheetWithRecyclerListView.ActionBarType.SLIDING, resourcesProvider);
        this.tone = 1;
        this.tones = new String[]{"formal", "neutral", "casual"};
        this.tonesText = new String[]{"Formal", "Neutral", "Casual"};
        this.collapsed = true;
        this.requestId = -1;
        ImageView imageView = new ImageView(context);
        this.closeView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        this.closeView.setImageResource(R.drawable.ic_close_white);
        ImageView imageView2 = this.closeView;
        int i = Theme.key_windowBackgroundWhiteBlackText;
        imageView2.setColorFilter(getThemedColor(i));
        this.closeView.setBackground(Theme.createSelectorDrawable(Theme.multAlpha(0.1f, getThemedColor(i)), 1, -1));
        this.actionBar.addView(this.closeView, LayoutHelper.createFrame(54, 54.0f, 85, 0.0f, 0.0f, 8.0f, 0.0f));
        ScaleStateListAnimator.apply(this.closeView, 0.1f, 1.5f);
        this.closeView.setOnClickListener(new TranslateAlert3$$ExternalSyntheticLambda2(this, 3));
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
        ButtonWithCounterView round = new ButtonWithCounterView(context, true, resourcesProvider).setRound();
        this.button = round;
        round.setText(LocaleController.getString(R.string.OK));
        FrameLayout.LayoutParams layoutParamsCreateFrame = LayoutHelper.createFrame(-1, 48.0f, 119, 12.0f, 6.0f, 12.0f, 12.0f);
        int i3 = layoutParamsCreateFrame.leftMargin;
        int i4 = this.backgroundPaddingLeft;
        layoutParamsCreateFrame.leftMargin = i3 + i4;
        layoutParamsCreateFrame.rightMargin += i4;
        this.buttonContainer.addView(this.button, layoutParamsCreateFrame);
        this.containerView.addView(this.buttonContainer, LayoutHelper.createFrame(-1, -2, 80));
        RecyclerListView recyclerListView = this.recyclerListView;
        int i5 = this.backgroundPaddingLeft;
        recyclerListView.setPadding(i5, 0, i5, AndroidUtilities.dp(66.0f));
        this.recyclerListView.setClipToPadding(false);
        this.recyclerListView.setSections();
        this.recyclerListView.setOnItemClickListener(new JoinCallAlert$$ExternalSyntheticLambda5(this, resourcesProvider, 6));
        DefaultItemAnimator defaultItemAnimator = new DefaultItemAnimator();
        defaultItemAnimator.setSupportsChangeAnimations(false);
        defaultItemAnimator.setDelayAnimations(false);
        defaultItemAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
        defaultItemAnimator.setDurations(350L);
        this.recyclerListView.lambda$onCellEnter$52(defaultItemAnimator);
        this.adapter.update(false);
    }

    private void addChecked(ItemOptions itemOptions, LinearLayout linearLayout, boolean z, CharSequence charSequence, Runnable runnable) {
        int i = Theme.key_actionBarDefaultSubmenuItem;
        int i2 = Theme.key_actionBarDefaultSubmenuItemIcon;
        ActionBarMenuSubItem actionBarMenuSubItem = new ActionBarMenuSubItem(1, getContext(), this.resourcesProvider, false, false);
        actionBarMenuSubItem.setPadding(AndroidUtilities.dp(18.0f), 0, AndroidUtilities.dp(18.0f), 0);
        actionBarMenuSubItem.setText(charSequence);
        actionBarMenuSubItem.setChecked(z);
        actionBarMenuSubItem.setColors(Theme.getColor(i, this.resourcesProvider), Theme.getColor(i2, this.resourcesProvider));
        actionBarMenuSubItem.setSelectorColor(Theme.multAlpha(0.12f, Theme.getColor(i, this.resourcesProvider)));
        actionBarMenuSubItem.setOnClickListener(new AIEditorAlert$$ExternalSyntheticLambda33(itemOptions, z, runnable, 1));
        linearLayout.addView(actionBarMenuSubItem, LayoutHelper.createLinear(-1, -2));
    }

    private void cancelRequest() {
        if (this.requestId >= 0) {
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.requestId, true);
            this.requestId = -1;
        }
    }

    public void fillItems(ArrayList<UItem> arrayList, UniversalAdapter universalAdapter) {
        arrayList.add(UItem.asShadow(null));
        universalAdapter.itemsOffset = 1;
        universalAdapter.whiteSectionStart();
        String str = this.from_lang;
        arrayList.add(Header.Factory.of(3, "", str != null ? TranslateAlert2.capitalFirst(TranslateAlert2.languageName(str)) : LocaleController.getString(R.string.AIEditorOriginalText), null, null));
        arrayList.add(Text.Factory.of(4, this.text, this.collapsed, this.noforwards, new UndoView$$ExternalSyntheticLambda6(9, this, universalAdapter), new LinkSpanDrawable.LinksTextView.OnLinkPress() {
            @Override
            public final void run(ClickableSpan clickableSpan) {
                this.f$0.onLinkPressed(clickableSpan);
            }
        }, null));
        StringBuilder sb = new StringBuilder();
        sb.append(TranslateAlert2.languageName(this.to_lang));
        sb.append((this.tone == 1 || this.tonesText == null) ? "" : MediaSessionConnector$DefaultMediaMetadataProvider$$ExternalSyntheticOutline0.m(new StringBuilder(" ("), this.tonesText[this.tone], ")"));
        arrayList.add(Header.Factory.of(5, "", TranslateAlert2.capitalFirst(sb.toString()), null, new TranslateAlert3$$ExternalSyntheticLambda2(this, 0)));
        arrayList.add(Text.Factory.of(6, this.translated, false, this.noforwards, null, new LinkSpanDrawable.LinksTextView.OnLinkPress() {
            @Override
            public final void run(ClickableSpan clickableSpan) {
                this.f$0.onLinkPressed(clickableSpan);
            }
        }, null));
        universalAdapter.whiteSectionEnd();
        arrayList.add(UItem.asShadow(null));
        universalAdapter.whiteSectionStart();
        if (!this.noforwards) {
            arrayList.add(UItem.asButton(1, R.drawable.msg_copy, LocaleController.getString(R.string.TranslateCopy)));
        }
        if (this.dialogId != 0 && !MessagesController.getInstance(this.currentAccount).getTranslateController().isTranslatingDialog(this.dialogId)) {
            arrayList.add(UItem.asButton(2, R.drawable.msg_translate, LocaleController.getString(R.string.TranslateEntireChat)));
        }
        universalAdapter.whiteSectionEnd();
    }

    public static void lambda$addChecked$7(ItemOptions itemOptions, boolean z, Runnable runnable, View view) {
        itemOptions.dismiss();
        if (z || runnable == null) {
            return;
        }
        runnable.run();
    }

    public void lambda$fillItems$8(UniversalAdapter universalAdapter, View view) {
        this.collapsed = false;
        saveScrollPosition();
        universalAdapter.update(true);
        applyScrolledPosition(true);
    }

    public void lambda$new$0(View view) {
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$new$1(Theme.ResourcesProvider resourcesProvider, View view, int i) {
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
                MessagesController.getInstance(this.currentAccount).getTranslateController().toggleTranslatingDialog(this.dialogId);
                lambda$showGiftOfferSheet$15();
            } else {
                if (LaunchActivity.getSafeLastFragment() == null) {
                    return;
                }
                new PremiumFeatureBottomSheet(getContext(), 13, resourcesProvider).show();
            }
        }
    }

    public void lambda$onToLangMenu$4(int i) {
        cancelRequest();
        this.tone = i;
        TranslateAlert2.setToLanguage(this.to_lang);
        requestTranslate();
    }

    public void lambda$onToLangMenu$5(TranslateController.Language language) {
        cancelRequest();
        String str = language.code;
        this.to_lang = str;
        TranslateAlert2.setToLanguage(str);
        requestTranslate();
    }

    public void lambda$onToLangMenu$6(TranslateController.Language language) {
        cancelRequest();
        String str = language.code;
        this.to_lang = str;
        TranslateAlert2.setToLanguage(str);
        requestTranslate();
    }

    public void lambda$requestTranslate$10(View view) {
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$requestTranslate$11(TLRPC.TL_textWithEntities tL_textWithEntities, TLRPC.TL_error tL_error) {
        this.requestId = -1;
        this.button.setLoading(false);
        if (tL_error != null) {
            BulletinFactory.of(this.topBulletinContainer, this.resourcesProvider).showForError(tL_error);
            this.button.setText(LocaleController.getString(R.string.OK));
            this.button.setOnClickListener(new TranslateAlert3$$ExternalSyntheticLambda2(this, 5));
        } else {
            this.translated = MessageObject.formatTextWithEntities(tL_textWithEntities);
            this.translatedLoading = false;
            this.adapter.update(true);
        }
    }

    public void lambda$requestTranslate$12(View view) {
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$requestTranslate$13(View view) {
        lambda$showGiftOfferSheet$15();
    }

    public void lambda$requestTranslate$14(TLRPC.TL_messages_translateResult tL_messages_translateResult, TLRPC.TL_error tL_error) {
        this.requestId = -1;
        this.button.setLoading(false);
        if (tL_error != null) {
            BulletinFactory.of(this.topBulletinContainer, this.resourcesProvider).showForError(tL_error);
            this.button.setText(LocaleController.getString(R.string.OK));
            this.button.setOnClickListener(new TranslateAlert3$$ExternalSyntheticLambda2(this, 1));
        } else if (tL_messages_translateResult == null || tL_messages_translateResult.result.isEmpty()) {
            this.button.setText(LocaleController.getString(R.string.OK));
            this.button.setOnClickListener(new TranslateAlert3$$ExternalSyntheticLambda2(this, 2));
        } else {
            this.translated = MessageObject.formatTextWithEntities(tL_messages_translateResult.result.get(0));
            this.translatedLoading = false;
            this.adapter.update(true);
        }
    }

    public void lambda$setText$2(String str) {
        this.from_lang = str;
        this.adapter.update(true);
    }

    public void lambda$show$9(View view) {
        CharSequence charSequence = this.translated;
        if (charSequence != null) {
            this.onUseListener.run(charSequence);
        }
        lambda$showGiftOfferSheet$15();
    }

    public void onLinkPressed(ClickableSpan clickableSpan) {
        if (clickableSpan == null) {
            return;
        }
        Utilities.CallbackReturn<URLSpan, Boolean> callbackReturn = this.onLinkPress;
        if (callbackReturn != null && (clickableSpan instanceof URLSpan) && callbackReturn.run((URLSpan) clickableSpan).booleanValue()) {
            return;
        }
        clickableSpan.onClick(this.containerView);
    }

    public void onToLangMenu(View view) {
        ItemOptions itemOptionsMakeOptions = ItemOptions.makeOptions(this.container, this.resourcesProvider, view);
        itemOptionsMakeOptions.setMaxHeight(AndroidUtilities.dp(450.0f));
        int i = 0;
        itemOptionsMakeOptions.setDrawScrim(false);
        itemOptionsMakeOptions.setOnTopOfScrim();
        ScrollView scrollView = new ScrollView(getContext());
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        scrollView.addView(linearLayout);
        itemOptionsMakeOptions.addView(scrollView);
        int i2 = 0;
        while (i2 < this.tones.length) {
            addChecked(itemOptionsMakeOptions, linearLayout, this.tone == i2, this.tonesText[i2], new EmojiView$$ExternalSyntheticLambda9(this, i2, 16));
            i2++;
        }
        TranslateAlert3 translateAlert3 = this;
        ActionBarPopupWindow.GapView gapView = new ActionBarPopupWindow.GapView(getContext(), translateAlert3.resourcesProvider, Theme.key_actionBarDefaultSubmenuSeparator);
        gapView.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(gapView, LayoutHelper.createLinear(-1, 8));
        ArrayList<TranslateController.Language> suggestedLanguages = TranslateController.getSuggestedLanguages(null);
        ArrayList<TranslateController.Language> languages = TranslateController.getLanguages();
        if (!TextUtils.isEmpty(translateAlert3.to_lang)) {
            translateAlert3.addChecked(itemOptionsMakeOptions, linearLayout, true, TranslateAlert2.capitalFirst(TranslateAlert2.languageName(translateAlert3.to_lang)), null);
        }
        int size = suggestedLanguages.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = i3 + 1;
            final TranslateController.Language language = suggestedLanguages.get(i3);
            if (!TextUtils.equals(language.code, translateAlert3.to_lang)) {
                final int i5 = 0;
                translateAlert3.addChecked(itemOptionsMakeOptions, linearLayout, false, language.displayName, new Runnable(this) {
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
        ActionBarPopupWindow.GapView gapView2 = new ActionBarPopupWindow.GapView(getContext(), translateAlert3.resourcesProvider, Theme.key_actionBarDefaultSubmenuSeparator);
        gapView2.setTag(R.id.fit_width_tag, 1);
        linearLayout.addView(gapView2, LayoutHelper.createLinear(-1, 8));
        int size2 = languages.size();
        while (i < size2) {
            TranslateController.Language language2 = languages.get(i);
            i++;
            final TranslateController.Language language3 = language2;
            final int i6 = 1;
            translateAlert3.addChecked(itemOptionsMakeOptions, linearLayout, TextUtils.equals(language3.code, translateAlert3.to_lang), language3.displayName, new Runnable(this) {
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

    private void requestTranslate() {
        int i = 2;
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        int i2 = 1;
        CharSequence[] charSequenceArr = {this.text};
        tL_textWithEntities.entities = MediaDataController.getInstance(this.currentAccount).getEntities(charSequenceArr, true);
        CharSequence charSequence = charSequenceArr[0];
        tL_textWithEntities.text = charSequence == null ? "" : charSequence.toString();
        if (this.onUseListener != null) {
            this.button.setLoading(true);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Loading));
        spannableStringBuilder.setSpan(new LoadingSpan(null, AndroidUtilities.dp(120.0f), 0), 0, spannableStringBuilder.length(), 33);
        this.translated = spannableStringBuilder;
        this.translatedLoading = true;
        if (!this.summarized || this.dialogId == 0 || this.messageId == 0) {
            TLRPC.TL_messages_translateText tL_messages_translateText = new TLRPC.TL_messages_translateText();
            tL_messages_translateText.to_lang = this.to_lang;
            if (this.dialogId == 0 || this.messageId == 0) {
                tL_messages_translateText.flags |= 2;
                tL_messages_translateText.text.add(tL_textWithEntities);
            } else {
                tL_messages_translateText.flags |= 1;
                tL_messages_translateText.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
                tL_messages_translateText.id.add(Integer.valueOf(this.messageId));
            }
            int i3 = this.tone;
            if (i3 != 1) {
                tL_messages_translateText.flags |= 4;
                tL_messages_translateText.tone = this.tones[i3];
            }
            this.requestId = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_translateText, new AiTonesController$$ExternalSyntheticLambda0(), new TranslateAlert3$$ExternalSyntheticLambda9(this, i));
        } else {
            TLRPC.TL_messages_summarizeText tL_messages_summarizeText = new TLRPC.TL_messages_summarizeText();
            tL_messages_summarizeText.flags |= 1;
            tL_messages_summarizeText.to_lang = this.to_lang;
            tL_messages_summarizeText.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
            tL_messages_summarizeText.id = this.messageId;
            int i4 = this.tone;
            if (i4 != 1) {
                tL_messages_summarizeText.flags |= 4;
                tL_messages_summarizeText.tone = this.tones[i4];
            }
            this.requestId = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(tL_messages_summarizeText, new AiTonesController$$ExternalSyntheticLambda0(), new TranslateAlert3$$ExternalSyntheticLambda9(this, i2));
        }
        this.adapter.update(true);
    }

    @Override
    public RecyclerListView.SelectionAdapter createAdapter(RecyclerListView recyclerListView) {
        UniversalAdapter universalAdapter = new UniversalAdapter(recyclerListView, getContext(), this.currentAccount, 0, true, new TranslateAlert3$$ExternalSyntheticLambda9(this, 0), this.resourcesProvider);
        this.adapter = universalAdapter;
        universalAdapter.setApplyBackground(false);
        return this.adapter;
    }

    @Override
    public CharSequence getTitle() {
        return (this.dialogId == 0 || this.messageId == 0 || !this.summarized) ? "Translate" : "Summarize & Translate";
    }

    @Override
    public void onActionBarAlpha(float f) {
        float f2 = 1.0f - f;
        this.closeView.setAlpha(f2);
        this.closeView.setScaleX(AndroidUtilities.lerp(0.6f, 1.0f, f2));
        this.closeView.setScaleY(AndroidUtilities.lerp(0.6f, 1.0f, f2));
    }

    @Override
    public void onContainerViewTranslation() {
        super.onContainerViewTranslation();
        ValueAnimator valueAnimator = this.keyboardContentAnimator;
        if (valueAnimator != null) {
            this.buttonContainer.setTranslationY(-((Float) valueAnimator.getAnimatedValue()).floatValue());
        } else {
            this.buttonContainer.setTranslationY(0.0f);
        }
    }

    @Override
    public void setLastVisible(boolean z) {
    }

    public TranslateAlert3 setMessage(long j, int i) {
        this.dialogId = j;
        this.messageId = i;
        return this;
    }

    public TranslateAlert3 setNoforwards(boolean z) {
        this.noforwards = z;
        return this;
    }

    public TranslateAlert3 setOnLinkPress(Utilities.CallbackReturn<URLSpan, Boolean> callbackReturn) {
        this.onLinkPress = callbackReturn;
        return this;
    }

    public TranslateAlert3 setOnUse(Utilities.Callback<CharSequence> callback) {
        this.onUseListener = callback;
        return this;
    }

    public TranslateAlert3 setText(String str, CharSequence charSequence) {
        this.text = charSequence;
        this.from_lang = str;
        return this;
    }

    public TranslateAlert3 setToLanguage(String str) {
        this.to_lang = str;
        return this;
    }

    @Override
    public void show() {
        super.show();
        ActionBar actionBar = this.actionBar;
        if (actionBar != null) {
            actionBar.setTitle(getTitle());
        }
        this.adapter.update(false);
        requestTranslate();
        if (this.onUseListener != null) {
            this.button.setText("Use This Translation");
            this.button.setOnClickListener(new TranslateAlert3$$ExternalSyntheticLambda2(this, 4));
        }
    }

    public TranslateAlert3 setMessage(long j, int i, boolean z) {
        this.dialogId = j;
        this.messageId = i;
        this.summarized = z;
        return this;
    }

    public TranslateAlert3 setText(CharSequence charSequence) {
        this.text = charSequence;
        if (LanguageDetector.hasSupport()) {
            LanguageDetector.detectLanguage(charSequence.toString(), new ColorPicker$$ExternalSyntheticLambda5(this, 21), new ShareAlert$$ExternalSyntheticLambda26(13));
        }
        return this;
    }
}
