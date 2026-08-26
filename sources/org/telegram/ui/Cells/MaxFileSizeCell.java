package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_language_id_common.zzir;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline1;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SeekBarView;

public abstract class MaxFileSizeCell extends FrameLayout {
    private long currentSize;
    private SeekBarView seekBarView;
    private TextView sizeTextView;
    private TextView textView;

    public final class AnonymousClass1 extends SeekBarView {
        public final int $r8$classId;

        public AnonymousClass1(Context context, Theme.ResourcesProvider resourcesProvider) {
            super(context, resourcesProvider);
            this.$r8$classId = 2;
        }

        @Override
        public final boolean onTouchEvent(MotionEvent motionEvent) {
            switch (this.$r8$classId) {
                case 0:
                    if (motionEvent.getAction() == 0) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    break;
                case 1:
                    if (motionEvent.getAction() == 0) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    break;
                default:
                    if (motionEvent.getAction() == 0) {
                        getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    break;
            }
            return super.onTouchEvent(motionEvent);
        }

        public AnonymousClass1(Context context, int i) {
            super(context);
            this.$r8$classId = i;
            switch (i) {
                case 1:
                    super(context, true, null);
                    break;
                default:
                    break;
            }
        }
    }

    public MaxFileSizeCell(Context context) {
        super(context);
        setWillNotDraw(false);
        TextView textView = new TextView(context);
        this.textView = textView;
        textView.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlack, false));
        this.textView.setTextSize(1, 16.0f);
        this.textView.setLines(1);
        this.textView.setMaxLines(1);
        this.textView.setSingleLine(true);
        this.textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        this.textView.setEllipsize(TextUtils.TruncateAt.END);
        this.textView.setImportantForAccessibility(2);
        addView(this.textView, LayoutHelper.createFrame(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.sizeTextView = textView2;
        textView2.setTextColor(Theme.getColor(null, Theme.key_dialogTextBlue2, false));
        this.sizeTextView.setTextSize(1, 16.0f);
        this.sizeTextView.setLines(1);
        this.sizeTextView.setMaxLines(1);
        this.sizeTextView.setSingleLine(true);
        this.sizeTextView.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
        this.sizeTextView.setImportantForAccessibility(2);
        addView(this.sizeTextView, LayoutHelper.createFrame(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(context, 0);
        this.seekBarView = anonymousClass1;
        anonymousClass1.setReportChanges(true);
        this.seekBarView.setDelegate(new SeekBarView.SeekBarViewDelegate() {
            @Override
            public final CharSequence getContentDescription() {
                StringBuilder sb = new StringBuilder();
                MaxFileSizeCell maxFileSizeCell = MaxFileSizeCell.this;
                sb.append((Object) maxFileSizeCell.textView.getText());
                sb.append(" ");
                sb.append((Object) maxFileSizeCell.sizeTextView.getText());
                return sb.toString();
            }

            @Override
            public final int getStepsCount() {
                return SeekBarView.SeekBarViewDelegate.CC.$default$getStepsCount(this);
            }

            @Override
            public final boolean needVisuallyDivideSteps() {
                return SeekBarView.SeekBarViewDelegate.CC.$default$needVisuallyDivideSteps(this);
            }

            @Override
            public final void onSeekBarDrag(boolean z, float f) {
                float fM;
                if (f <= 0.25f) {
                    fM = zzir.m(f, 0.25f, 536576.0f, 512000);
                } else {
                    float f2 = f - 0.25f;
                    if (f2 < 0.25f) {
                        fM = zzir.m(f2, 0.25f, 9437184.0f, 1048576);
                    } else {
                        float f3 = f2 - 0.25f;
                        fM = f3 <= 0.25f ? zzir.m(f3, 0.25f, 9.437184E7f, 10485760) : zzir.m(f3 - 0.25f, 0.25f, 2097152000 - ((long) 104857600), 104857600);
                    }
                }
                int i = (int) fM;
                MaxFileSizeCell maxFileSizeCell = MaxFileSizeCell.this;
                long j = i;
                maxFileSizeCell.sizeTextView.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j)));
                maxFileSizeCell.currentSize = j;
                maxFileSizeCell.didChangedSizeValue(i);
            }

            @Override
            public final void onSeekBarPressed(boolean z) {
            }
        });
        this.seekBarView.setImportantForAccessibility(2);
        addView(this.seekBarView, LayoutHelper.createFrame(-1, 38.0f, 51, 6.0f, 36.0f, 6.0f, 0.0f));
        setImportantForAccessibility(1);
        setAccessibilityDelegate(this.seekBarView.getSeekBarAccessibilityDelegate());
    }

    public abstract void didChangedSizeValue(int i);

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public long getSize() {
        return this.currentSize;
    }

    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
        setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(80.0f));
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(42.0f);
        this.sizeTextView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
        this.textView.measure(View.MeasureSpec.makeMeasureSpec(BotFullscreenButtons$$ExternalSyntheticOutline1.m(8.0f, measuredWidth - this.sizeTextView.getMeasuredWidth(), AndroidUtilities.dp(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
        this.seekBarView.measure(OKLCH.m(20.0f, getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setEnabled(boolean z, ArrayList<Animator> arrayList) {
        super.setEnabled(z);
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(this.textView, "alpha", z ? 1.0f : 0.5f));
            arrayList.add(ObjectAnimator.ofFloat(this.seekBarView, "alpha", z ? 1.0f : 0.5f));
            arrayList.add(ObjectAnimator.ofFloat(this.sizeTextView, "alpha", z ? 1.0f : 0.5f));
        } else {
            this.textView.setAlpha(z ? 1.0f : 0.5f);
            this.seekBarView.setAlpha(z ? 1.0f : 0.5f);
            this.sizeTextView.setAlpha(z ? 1.0f : 0.5f);
        }
    }

    public void setSize(long j) {
        float fMax;
        float f;
        float fMax2;
        this.currentSize = j;
        this.sizeTextView.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j)));
        long j2 = j - 512000;
        if (j2 < 536576) {
            fMax2 = Math.max(0.0f, j2 / 536576.0f) * 0.25f;
        } else {
            long j3 = j - 1048576;
            if (j3 < 9437184) {
                fMax2 = (Math.max(0.0f, j3 / 9437184.0f) * 0.25f) + 0.25f;
            } else {
                long j4 = j - 10485760;
                if (j4 < 94371840) {
                    fMax = Math.max(0.0f, j4 / 9.437184E7f) * 0.25f;
                    f = 0.5f;
                } else {
                    fMax = Math.max(0.0f, (j - 104857600) / 1.9922944E9f) * 0.25f;
                    f = 0.75f;
                }
                fMax2 = fMax + f;
            }
        }
        this.seekBarView.setProgress(Math.min(1.0f, fMax2));
    }

    public void setText(String str) {
        this.textView.setText(str);
    }
}
