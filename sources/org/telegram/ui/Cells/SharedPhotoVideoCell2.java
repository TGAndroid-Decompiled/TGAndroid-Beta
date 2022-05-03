package org.telegram.ui.Cells;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.SparseArray;
import android.view.View;
import androidx.core.content.ContextCompat;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DownloadController;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.FlickerLoadingView;

public class SharedPhotoVideoCell2 extends View {
    static boolean lastAutoDownload;
    static long lastUpdateDownloadSettingsTime;
    ValueAnimator animator;
    private boolean attached;
    CheckBoxBase checkBoxBase;
    float checkBoxProgress;
    float crossfadeProgress;
    float crossfadeToColumnsCount;
    SharedPhotoVideoCell2 crossfadeView;
    int currentAccount;
    MessageObject currentMessageObject;
    int currentParentColumnsCount;
    FlickerLoadingView globalGradientView;
    float highlightProgress;
    SharedResources sharedResources;
    boolean showVideoLayout;
    StaticLayout videoInfoLayot;
    String videoText;
    public ImageReceiver imageReceiver = new ImageReceiver();
    float imageAlpha = 1.0f;
    float imageScale = 1.0f;

    public SharedPhotoVideoCell2(Context context, SharedResources sharedResources, int i) {
        super(context);
        this.sharedResources = sharedResources;
        this.currentAccount = i;
        setChecked(false, false);
        this.imageReceiver.setParentView(this);
    }

    public void setMessageObject(org.telegram.messenger.MessageObject r16, int r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.SharedPhotoVideoCell2.setMessageObject(org.telegram.messenger.MessageObject, int):void");
    }

    private boolean canAutoDownload(MessageObject messageObject) {
        if (System.currentTimeMillis() - lastUpdateDownloadSettingsTime > 5000) {
            lastUpdateDownloadSettingsTime = System.currentTimeMillis();
            lastAutoDownload = DownloadController.getInstance(this.currentAccount).canDownloadMedia(messageObject);
        }
        return lastAutoDownload;
    }

    @Override
    protected void onDraw(android.graphics.Canvas r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.SharedPhotoVideoCell2.onDraw(android.graphics.Canvas):void");
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.attached = true;
        CheckBoxBase checkBoxBase = this.checkBoxBase;
        if (checkBoxBase != null) {
            checkBoxBase.onAttachedToWindow();
        }
        if (this.currentMessageObject != null) {
            this.imageReceiver.onAttachedToWindow();
        }
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.attached = false;
        CheckBoxBase checkBoxBase = this.checkBoxBase;
        if (checkBoxBase != null) {
            checkBoxBase.onDetachedFromWindow();
        }
        if (this.currentMessageObject != null) {
            this.imageReceiver.onDetachedFromWindow();
        }
    }

    public void setGradientView(FlickerLoadingView flickerLoadingView) {
        this.globalGradientView = flickerLoadingView;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824));
    }

    public int getMessageId() {
        MessageObject messageObject = this.currentMessageObject;
        if (messageObject != null) {
            return messageObject.getId();
        }
        return 0;
    }

    public MessageObject getMessageObject() {
        return this.currentMessageObject;
    }

    public void setImageAlpha(float f, boolean z) {
        if (this.imageAlpha != f) {
            this.imageAlpha = f;
            if (z) {
                invalidate();
            }
        }
    }

    public void setImageScale(float f, boolean z) {
        if (this.imageScale != f) {
            this.imageScale = f;
            if (z) {
                invalidate();
            }
        }
    }

    public void setCrossfadeView(SharedPhotoVideoCell2 sharedPhotoVideoCell2, float f, int i) {
        this.crossfadeView = sharedPhotoVideoCell2;
        this.crossfadeProgress = f;
        this.crossfadeToColumnsCount = i;
    }

    public void drawCrossafadeImage(Canvas canvas) {
        if (this.crossfadeView != null) {
            canvas.save();
            canvas.translate(getX(), getY());
            this.crossfadeView.setImageScale(((getMeasuredWidth() - AndroidUtilities.dp(2.0f)) * this.imageScale) / (this.crossfadeView.getMeasuredWidth() - AndroidUtilities.dp(2.0f)), false);
            this.crossfadeView.draw(canvas);
            canvas.restore();
        }
    }

    public View getCrossfadeView() {
        return this.crossfadeView;
    }

    public void setChecked(final boolean z, boolean z2) {
        CheckBoxBase checkBoxBase = this.checkBoxBase;
        if ((checkBoxBase != null && checkBoxBase.isChecked()) != z) {
            if (this.checkBoxBase == null) {
                CheckBoxBase checkBoxBase2 = new CheckBoxBase(this, 21, null);
                this.checkBoxBase = checkBoxBase2;
                checkBoxBase2.setColor(null, "sharedMedia_photoPlaceholder", "checkboxCheck");
                this.checkBoxBase.setDrawUnchecked(false);
                this.checkBoxBase.setBackgroundType(1);
                this.checkBoxBase.setBounds(0, 0, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(24.0f));
                if (this.attached) {
                    this.checkBoxBase.onAttachedToWindow();
                }
            }
            this.checkBoxBase.setChecked(z, z2);
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                this.animator = null;
                valueAnimator.cancel();
            }
            float f = 1.0f;
            if (z2) {
                float[] fArr = new float[2];
                fArr[0] = this.checkBoxProgress;
                if (!z) {
                    f = 0.0f;
                }
                fArr[1] = f;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
                this.animator = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        SharedPhotoVideoCell2.this.checkBoxProgress = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                        SharedPhotoVideoCell2.this.invalidate();
                    }
                });
                this.animator.setDuration(200L);
                this.animator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        ValueAnimator valueAnimator2 = SharedPhotoVideoCell2.this.animator;
                        if (valueAnimator2 != null && valueAnimator2.equals(animator)) {
                            SharedPhotoVideoCell2 sharedPhotoVideoCell2 = SharedPhotoVideoCell2.this;
                            sharedPhotoVideoCell2.checkBoxProgress = z ? 1.0f : 0.0f;
                            sharedPhotoVideoCell2.animator = null;
                        }
                    }
                });
                this.animator.start();
            } else {
                if (!z) {
                    f = 0.0f;
                }
                this.checkBoxProgress = f;
            }
            invalidate();
        }
    }

    public void setHighlightProgress(float f) {
        if (this.highlightProgress != f) {
            this.highlightProgress = f;
            invalidate();
        }
    }

    public static class SharedResources {
        Drawable playDrawable;
        TextPaint textPaint = new TextPaint(1);
        private Paint backgroundPaint = new Paint();
        Paint highlightPaint = new Paint();
        SparseArray<String> imageFilters = new SparseArray<>();

        public SharedResources(Context context) {
            this.textPaint.setTextSize(AndroidUtilities.dp(12.0f));
            this.textPaint.setColor(-1);
            this.textPaint.setTypeface(AndroidUtilities.getTypeface("fonts/rmedium.ttf"));
            Drawable drawable = ContextCompat.getDrawable(context, R.drawable.play_mini_video);
            this.playDrawable = drawable;
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.playDrawable.getIntrinsicHeight());
            this.backgroundPaint.setColor(Theme.getColor("sharedMedia_photoPlaceholder"));
        }

        public String getFilterString(int i) {
            String str = this.imageFilters.get(i);
            if (str != null) {
                return str;
            }
            String str2 = i + "_" + i + "_isc";
            this.imageFilters.put(i, str2);
            return str2;
        }
    }
}
