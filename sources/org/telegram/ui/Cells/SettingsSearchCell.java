package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.Components.TranscribeButton;
import org.telegram.ui.Components.UItem;
import org.telegram.ui.Components.UniversalAdapter;
import org.telegram.ui.Components.UniversalRecyclerView;
import org.telegram.ui.ProfileActivity;

public final class SettingsSearchCell extends FrameLayout {
    public final ImageView imageView;
    public int left;
    public boolean needDivider;
    public final TextView textView;
    public final TextView valueTextView;

    public final class Factory extends UItem.UItemFactory {
        public static final int $r8$clinit = 0;

        static {
            UItem.UItemFactory.setup(new Factory());
        }

        @Override
        public final void bindView(View view, UItem uItem, boolean z, UniversalAdapter universalAdapter, UniversalRecyclerView universalRecyclerView) {
            Object obj = uItem.object;
            if (obj instanceof ProfileActivity.SearchAdapter.SearchResult) {
                ProfileActivity.SearchAdapter.SearchResult searchResult = (ProfileActivity.SearchAdapter.SearchResult) obj;
                ((SettingsSearchCell) view).setTextAndValueAndIcon(uItem.text, searchResult.path, searchResult.iconResId, z);
            } else if (obj instanceof MessagesController.FaqSearchResult) {
                ((SettingsSearchCell) view).setTextAndValue(uItem.text, ((MessagesController.FaqSearchResult) obj).path, true, z);
            }
        }

        @Override
        public final View createView(Context context, RecyclerListView recyclerListView, int i, int i2, Theme.ResourcesProvider resourcesProvider) {
            return new SettingsSearchCell(context);
        }
    }

    public final class VerticalImageSpan extends ImageSpan {
        public static TranscribeButton.LoadingPointsDrawable drawable;
        public final int $r8$classId = 1;

        public VerticalImageSpan(Drawable drawable2) {
            super(drawable2);
        }

        @Override
        public void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            switch (this.$r8$classId) {
                case 0:
                    Drawable drawable2 = getDrawable();
                    canvas.save();
                    Paint.FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
                    int i6 = fontMetricsInt.descent;
                    canvas.translate(f, ((i4 + i6) - ((i6 - fontMetricsInt.ascent) / 2)) - ((drawable2.getBounds().bottom - drawable2.getBounds().top) / 2));
                    if (LocaleController.isRTL) {
                        canvas.scale(-1.0f, 1.0f, drawable2.getIntrinsicWidth() / 2, drawable2.getIntrinsicHeight() / 2);
                    }
                    drawable2.draw(canvas);
                    canvas.restore();
                    break;
                default:
                    super.draw(canvas, charSequence, i, i2, f, i3, i4, i5, paint);
                    break;
            }
        }

        @Override
        public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            switch (this.$r8$classId) {
                case 0:
                    Rect bounds = getDrawable().getBounds();
                    if (fontMetricsInt != null) {
                        Paint.FontMetricsInt fontMetricsInt2 = paint.getFontMetricsInt();
                        int i3 = fontMetricsInt2.descent;
                        int i4 = fontMetricsInt2.ascent;
                        int i5 = ((i3 - i4) / 2) + i4;
                        int i6 = (bounds.bottom - bounds.top) / 2;
                        int i7 = i5 - i6;
                        fontMetricsInt.ascent = i7;
                        fontMetricsInt.top = i7;
                        int i8 = i5 + i6;
                        fontMetricsInt.bottom = i8;
                        fontMetricsInt.descent = i8;
                    }
                    return bounds.right;
                default:
                    return super.getSize(paint, charSequence, i, i2, fontMetricsInt);
            }
        }

        @Override
        public void updateDrawState(TextPaint textPaint) {
            switch (this.$r8$classId) {
                case 1:
                    float textSize = textPaint.getTextSize() * 0.89f;
                    int i = (int) (0.02f * textSize);
                    getDrawable().setBounds(0, i, (int) textSize, ((int) (textSize * 1.25f)) + i);
                    super.updateDrawState(textPaint);
                    break;
                default:
                    super.updateDrawState(textPaint);
                    break;
            }
        }

        public VerticalImageSpan() {
            TranscribeButton.LoadingPointsDrawable loadingPointsDrawable = drawable;
            if (loadingPointsDrawable == null) {
                loadingPointsDrawable = new TranscribeButton.LoadingPointsDrawable(Theme.chat_msgTextPaint);
                drawable = loadingPointsDrawable;
            }
            super(loadingPointsDrawable, 0);
            float textSize = Theme.chat_msgTextPaint.getTextSize() * 0.89f;
            int i = (int) (0.02f * textSize);
            getDrawable().setBounds(0, i, (int) textSize, ((int) (textSize * 1.25f)) + i);
        }
    }

    public SettingsSearchCell(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTextColor(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity(LocaleController.isRTL ? 5 : 3);
        textView.setLines(1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        boolean z = LocaleController.isRTL;
        addView(textView, LayoutHelper.createFrame(-2, -2.0f, z ? 5 : 3, z ? 16.0f : 71.0f, 10.0f, z ? 71.0f : 16.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.valueTextView = textView2;
        ArticleViewer.IBlock.CC.m(textView2, Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText2, false), 13.0f, 1, true);
        textView2.setGravity(LocaleController.isRTL ? 5 : 3);
        boolean z2 = LocaleController.isRTL;
        addView(textView2, LayoutHelper.createFrame(-2, -2.0f, z2 ? 5 : 3, z2 ? 16.0f : 71.0f, 33.0f, z2 ? 71.0f : 16.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        this.imageView = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayIcon, false), PorterDuff.Mode.MULTIPLY));
        addView(imageView, LayoutHelper.createFrame(48, 48.0f, LocaleController.isRTL ? 5 : 3, 10.0f, 8.0f, 10.0f, 0.0f));
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.needDivider) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(this.left), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(this.left) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(64.0f) + (this.needDivider ? 1 : 0), 1073741824));
    }

    public final void setTextAndValue(CharSequence charSequence, String[] strArr, boolean z, boolean z2) {
        TextView textView = this.textView;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        TextView textView2 = this.valueTextView;
        if (z) {
            textView2.setText(charSequence);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i = 0; i < strArr.length; i++) {
                if (i != 0) {
                    spannableStringBuilder.append((CharSequence) " > ");
                    Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.settings_arrow).mutate();
                    drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight());
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteBlackText, false), PorterDuff.Mode.MULTIPLY));
                    spannableStringBuilder.setSpan(new VerticalImageSpan(drawableMutate), spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 33);
                }
                spannableStringBuilder.append((CharSequence) strArr[i]);
            }
            textView.setText(spannableStringBuilder);
            textView2.setVisibility(0);
            layoutParams.topMargin = AndroidUtilities.dp(10.0f);
        } else {
            textView.setText(charSequence);
            if (strArr != null) {
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    if (i2 != 0) {
                        spannableStringBuilder2.append((CharSequence) " > ");
                        Drawable drawableMutate2 = getContext().getResources().getDrawable(R.drawable.settings_arrow).mutate();
                        drawableMutate2.setBounds(0, 0, drawableMutate2.getIntrinsicWidth(), drawableMutate2.getIntrinsicHeight());
                        drawableMutate2.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText2, false), PorterDuff.Mode.MULTIPLY));
                        spannableStringBuilder2.setSpan(new VerticalImageSpan(drawableMutate2), spannableStringBuilder2.length() - 2, spannableStringBuilder2.length() - 1, 33);
                    }
                    spannableStringBuilder2.append((CharSequence) strArr[i2]);
                }
                textView2.setText(spannableStringBuilder2);
                textView2.setVisibility(0);
                layoutParams.topMargin = AndroidUtilities.dp(10.0f);
            } else {
                layoutParams.topMargin = AndroidUtilities.dp(21.0f);
                textView2.setVisibility(8);
            }
        }
        int iDp = AndroidUtilities.dp(16.0f);
        layoutParams.rightMargin = iDp;
        layoutParams.leftMargin = iDp;
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
        int iDp2 = AndroidUtilities.dp(16.0f);
        layoutParams2.rightMargin = iDp2;
        layoutParams2.leftMargin = iDp2;
        this.imageView.setVisibility(8);
        this.needDivider = z2;
        setWillNotDraw(!z2);
        this.left = 16;
    }

    public final void setTextAndValueAndIcon(CharSequence charSequence, String[] strArr, int i, boolean z) {
        TextView textView = this.textView;
        textView.setText(charSequence);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 16.0f : 71.0f);
        layoutParams.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? 71.0f : 16.0f);
        TextView textView2 = this.valueTextView;
        if (strArr != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i2 = 0; i2 < strArr.length; i2++) {
                if (i2 != 0) {
                    spannableStringBuilder.append((CharSequence) " > ");
                    Drawable drawableMutate = getContext().getResources().getDrawable(R.drawable.settings_arrow).mutate();
                    drawableMutate.setBounds(0, 0, drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight());
                    drawableMutate.setColorFilter(new PorterDuffColorFilter(Theme.getColor(null, Theme.key_windowBackgroundWhiteGrayText2, false), PorterDuff.Mode.MULTIPLY));
                    spannableStringBuilder.setSpan(new VerticalImageSpan(drawableMutate), spannableStringBuilder.length() - 2, spannableStringBuilder.length() - 1, 33);
                }
                spannableStringBuilder.append((CharSequence) strArr[i2]);
            }
            textView2.setText(spannableStringBuilder);
            textView2.setVisibility(0);
            layoutParams.topMargin = AndroidUtilities.dp(10.0f);
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) textView2.getLayoutParams();
            layoutParams2.leftMargin = AndroidUtilities.dp(LocaleController.isRTL ? 16.0f : 71.0f);
            layoutParams2.rightMargin = AndroidUtilities.dp(LocaleController.isRTL ? 71.0f : 16.0f);
        } else {
            layoutParams.topMargin = AndroidUtilities.dp(21.0f);
            textView2.setVisibility(8);
        }
        ImageView imageView = this.imageView;
        if (i != 0) {
            imageView.setImageResource(i);
            imageView.setVisibility(0);
        } else {
            imageView.setVisibility(8);
        }
        this.left = 69;
        this.needDivider = z;
        setWillNotDraw(!z);
    }
}
