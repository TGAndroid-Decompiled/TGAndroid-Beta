package org.telegram.ui.Cells;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.internal.mlkit_language_id_common.zzjd;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline1;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.ArticleViewer;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.SeekBarView;
import org.telegram.ui.DataAutoDownloadActivity;
import org.telegram.ui.PhotoViewer$41$1;
import org.telegram.ui.ThemePreviewActivity;

public abstract class MaxFileSizeCell extends FrameLayout {
    public long currentSize;
    public final AnonymousClass1 seekBarView;
    public final TextView sizeTextView;
    public final TextView textView;

    public final class AnonymousClass1 extends SeekBarView {
        public final int $r8$classId;

        public AnonymousClass1(int i, Context context, Theme.ResourcesProvider resourcesProvider, boolean z) {
            super(context, resourcesProvider, z);
            this.$r8$classId = i;
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
                case 2:
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
            return onTouch(motionEvent);
        }

        public AnonymousClass1(Context context, ThemePreviewActivity.AnonymousClass1 anonymousClass1) {
            super(context, anonymousClass1, false);
            this.$r8$classId = 3;
        }
    }

    public MaxFileSizeCell(Activity activity) {
        super(activity);
        boolean z = false;
        setWillNotDraw(false);
        TextView textView = new TextView(activity);
        this.textView = textView;
        Theme.ResourcesProvider resourcesProvider = null;
        ArticleViewer.IBlock.CC.m(textView, Theme.getColor(null, Theme.key_dialogTextBlack, false), 16.0f, 1, true);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setImportantForAccessibility(2);
        addView(textView, LayoutHelper.createFrame(-1, -1.0f, (LocaleController.isRTL ? 5 : 3) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        TextView textView2 = new TextView(activity);
        this.sizeTextView = textView2;
        ArticleViewer.IBlock.CC.m(textView2, Theme.getColor(null, Theme.key_dialogTextBlue2, false), 16.0f, 1, true);
        textView2.setGravity((LocaleController.isRTL ? 3 : 5) | 48);
        textView2.setImportantForAccessibility(2);
        addView(textView2, LayoutHelper.createFrame(-2, -1.0f, (LocaleController.isRTL ? 3 : 5) | 48, 21.0f, 13.0f, 21.0f, 0.0f));
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(0, activity, resourcesProvider, z);
        this.seekBarView = anonymousClass1;
        anonymousClass1.setReportChanges(true);
        anonymousClass1.setDelegate(new SeekBarView.SeekBarViewDelegate() {
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
                return 0;
            }

            @Override
            public final void onSeekBarDrag(float f, boolean z2) {
                float fM;
                if (f <= 0.25f) {
                    fM = zzjd.m(f, 0.25f, 536576.0f, 512000);
                } else {
                    float f2 = f - 0.25f;
                    if (f2 < 0.25f) {
                        fM = zzjd.m(f2, 0.25f, 9437184.0f, 1048576);
                    } else {
                        float f3 = f2 - 0.25f;
                        fM = f3 <= 0.25f ? zzjd.m(f3, 0.25f, 9.437184E7f, 10485760) : zzjd.m(f3 - 0.25f, 0.25f, 2097152000 - ((long) 104857600), 104857600);
                    }
                }
                int i = (int) fM;
                MaxFileSizeCell maxFileSizeCell = MaxFileSizeCell.this;
                long j = i;
                maxFileSizeCell.sizeTextView.setText(LocaleController.formatString("AutodownloadSizeLimitUpTo", R.string.AutodownloadSizeLimitUpTo, AndroidUtilities.formatFileSize(j)));
                maxFileSizeCell.currentSize = j;
                DataAutoDownloadActivity.AnonymousClass3 anonymousClass3 = (DataAutoDownloadActivity.AnonymousClass3) maxFileSizeCell;
                if (anonymousClass3.val$position == DataAutoDownloadActivity.this.videosRow) {
                    anonymousClass3.val$infoCell.setText(LocaleController.formatString("AutoDownloadPreloadVideoInfo", R.string.AutoDownloadPreloadVideoInfo, AndroidUtilities.formatFileSize(j)));
                    boolean z3 = i > 2097152;
                    TextCheckCell[] textCheckCellArr = anonymousClass3.val$checkCell;
                    if (z3 != textCheckCellArr[0].isEnabled()) {
                        ArrayList arrayList = new ArrayList();
                        textCheckCellArr[0].setEnabled(arrayList, z3);
                        AnimatorSet[] animatorSetArr = anonymousClass3.val$animatorSet;
                        AnimatorSet animatorSet = animatorSetArr[0];
                        if (animatorSet != null) {
                            animatorSet.cancel();
                            animatorSetArr[0] = null;
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSetArr[0] = animatorSet2;
                        animatorSet2.playTogether(arrayList);
                        animatorSetArr[0].addListener(new PhotoViewer$41$1(anonymousClass3, 6));
                        animatorSetArr[0].setDuration(150L);
                        animatorSetArr[0].start();
                    }
                }
            }

            @Override
            public final void onSeekBarPressed() {
            }
        });
        anonymousClass1.setImportantForAccessibility(2);
        addView(anonymousClass1, LayoutHelper.createFrame(-1, 38.0f, 51, 6.0f, 36.0f, 6.0f, 0.0f));
        setImportantForAccessibility(1);
        setAccessibilityDelegate(anonymousClass1.getSeekBarAccessibilityDelegate());
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public long getSize() {
        return this.currentSize;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(20.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(20.0f) : 0), getMeasuredHeight() - 1, Theme.dividerPaint);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return true;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(80.0f), 1073741824));
        setMeasuredDimension(View.MeasureSpec.getSize(i), AndroidUtilities.dp(80.0f));
        int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(42.0f);
        TextView textView = this.sizeTextView;
        textView.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
        this.textView.measure(View.MeasureSpec.makeMeasureSpec(BotFullscreenButtons$$ExternalSyntheticOutline1.m(measuredWidth - textView.getMeasuredWidth(), 8.0f, AndroidUtilities.dp(10.0f)), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
        this.seekBarView.measure(OKLCH.m(getMeasuredWidth(), 20.0f, 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(30.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void setEnabled(ArrayList arrayList, boolean z) {
        super.setEnabled(z);
        TextView textView = this.sizeTextView;
        TextView textView2 = this.textView;
        AnonymousClass1 anonymousClass1 = this.seekBarView;
        if (arrayList != null) {
            arrayList.add(ObjectAnimator.ofFloat(textView2, "alpha", z ? 1.0f : 0.5f));
            arrayList.add(ObjectAnimator.ofFloat(anonymousClass1, "alpha", z ? 1.0f : 0.5f));
            arrayList.add(ObjectAnimator.ofFloat(textView, "alpha", z ? 1.0f : 0.5f));
        } else {
            textView2.setAlpha(z ? 1.0f : 0.5f);
            anonymousClass1.setAlpha(z ? 1.0f : 0.5f);
            textView.setAlpha(z ? 1.0f : 0.5f);
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
