package org.telegram.ui.Stories;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC$MediaArea;
import org.telegram.tgnet.TLRPC$TL_mediaAreaCoordinates;
import org.telegram.tgnet.TLRPC$TL_mediaAreaGeoPoint;
import org.telegram.tgnet.TLRPC$TL_mediaAreaVenue;
import org.telegram.tgnet.TLRPC$TL_message;
import org.telegram.tgnet.TLRPC$TL_messageMediaGeo;
import org.telegram.tgnet.TLRPC$TL_messageMediaVenue;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AnimatedFloat;
import org.telegram.ui.Components.ColoredImageSpan;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.LocationActivity;
import org.telegram.ui.Stories.StoryMediaAreasView;
import org.telegram.ui.Stories.recorder.HintView2;
public class StoryMediaAreasView extends FrameLayout implements View.OnClickListener {
    private final Paint cutPaint;
    private HintView2 hintView;
    private final FrameLayout hintsContainer;
    private ArrayList<TLRPC$MediaArea> lastMediaAreas;
    private boolean malicious;
    public final AnimatedFloat parentHighlightAlpha;
    private final RectF rectF;
    private Theme.ResourcesProvider resourcesProvider;
    private AreaView selectedArea;
    private boolean shined;

    protected void onHintVisible(boolean z) {
    }

    protected void presentFragment(BaseFragment baseFragment) {
    }

    public StoryMediaAreasView(Context context, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.selectedArea = null;
        this.hintView = null;
        this.rectF = new RectF();
        Paint paint = new Paint(1);
        this.cutPaint = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        this.parentHighlightAlpha = new AnimatedFloat(this, 0L, 120L, new LinearInterpolator());
        this.shined = false;
        this.resourcesProvider = resourcesProvider;
        FrameLayout frameLayout = new FrameLayout(context);
        this.hintsContainer = frameLayout;
        addView(frameLayout);
    }

    public void set(ArrayList<TLRPC$MediaArea> arrayList) {
        ArrayList<TLRPC$MediaArea> arrayList2 = this.lastMediaAreas;
        if (arrayList == arrayList2 && (arrayList == null || arrayList2 == null || arrayList.size() == this.lastMediaAreas.size())) {
            return;
        }
        HintView2 hintView2 = this.hintView;
        if (hintView2 != null) {
            hintView2.hide();
            this.hintView = null;
        }
        int i = 0;
        while (i < getChildCount()) {
            View childAt = getChildAt(i);
            if (childAt != this.hintsContainer) {
                removeView(childAt);
                i--;
            }
            i++;
        }
        this.selectedArea = null;
        invalidate();
        onHintVisible(false);
        this.malicious = false;
        this.lastMediaAreas = arrayList;
        if (arrayList == null) {
            return;
        }
        this.shined = false;
        double d = 0.0d;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            TLRPC$MediaArea tLRPC$MediaArea = arrayList.get(i2);
            if (tLRPC$MediaArea != null && tLRPC$MediaArea.coordinates != null) {
                AreaView areaView = new AreaView(getContext(), this, tLRPC$MediaArea);
                areaView.setOnClickListener(this);
                addView(areaView);
                TLRPC$TL_mediaAreaCoordinates tLRPC$TL_mediaAreaCoordinates = tLRPC$MediaArea.coordinates;
                d += (tLRPC$TL_mediaAreaCoordinates.w / 100.0d) * 1080.0d * (tLRPC$TL_mediaAreaCoordinates.h / 100.0d) * 1920.0d;
            }
        }
        this.malicious = d > 684288.0d;
        this.hintsContainer.bringToFront();
    }

    @Override
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            FrameLayout frameLayout = this.hintsContainer;
            if (childAt == frameLayout) {
                frameLayout.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
            } else if (childAt instanceof AreaView) {
                AreaView areaView = (AreaView) getChildAt(i3);
                double d = size;
                Double.isNaN(d);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) Math.ceil((areaView.mediaArea.coordinates.w / 100.0d) * d), 1073741824);
                double d2 = size2;
                Double.isNaN(d2);
                areaView.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) Math.ceil((areaView.mediaArea.coordinates.h / 100.0d) * d2), 1073741824));
            }
        }
        setMeasuredDimension(size, size2);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        motionEvent.getX();
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override
    public void onClick(View view) {
        if (view instanceof AreaView) {
            AreaView areaView = this.selectedArea;
            if (areaView == view) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        StoryMediaAreasView.this.lambda$onClick$0();
                    }
                }, 200L);
                LocationActivity locationActivity = new LocationActivity(3);
                locationActivity.setResourceProvider(this.resourcesProvider);
                TLRPC$TL_message tLRPC$TL_message = new TLRPC$TL_message();
                TLRPC$MediaArea tLRPC$MediaArea = this.selectedArea.mediaArea;
                if (tLRPC$MediaArea instanceof TLRPC$TL_mediaAreaVenue) {
                    TLRPC$TL_mediaAreaVenue tLRPC$TL_mediaAreaVenue = (TLRPC$TL_mediaAreaVenue) tLRPC$MediaArea;
                    TLRPC$TL_messageMediaVenue tLRPC$TL_messageMediaVenue = new TLRPC$TL_messageMediaVenue();
                    tLRPC$TL_messageMediaVenue.venue_id = tLRPC$TL_mediaAreaVenue.venue_id;
                    tLRPC$TL_messageMediaVenue.venue_type = tLRPC$TL_mediaAreaVenue.venue_type;
                    tLRPC$TL_messageMediaVenue.title = tLRPC$TL_mediaAreaVenue.title;
                    tLRPC$TL_messageMediaVenue.address = tLRPC$TL_mediaAreaVenue.address;
                    tLRPC$TL_messageMediaVenue.provider = tLRPC$TL_mediaAreaVenue.provider;
                    tLRPC$TL_messageMediaVenue.geo = tLRPC$TL_mediaAreaVenue.geo;
                    tLRPC$TL_message.media = tLRPC$TL_messageMediaVenue;
                } else if (tLRPC$MediaArea instanceof TLRPC$TL_mediaAreaGeoPoint) {
                    locationActivity.setInitialMaxZoom(true);
                    TLRPC$TL_messageMediaGeo tLRPC$TL_messageMediaGeo = new TLRPC$TL_messageMediaGeo();
                    tLRPC$TL_messageMediaGeo.geo = ((TLRPC$TL_mediaAreaGeoPoint) this.selectedArea.mediaArea).geo;
                    tLRPC$TL_message.media = tLRPC$TL_messageMediaGeo;
                } else {
                    this.selectedArea = null;
                    invalidate();
                    return;
                }
                locationActivity.setSharingAllowed(false);
                locationActivity.setMessageObject(new MessageObject(UserConfig.selectedAccount, tLRPC$TL_message, false, false));
                presentFragment(locationActivity);
                this.selectedArea = null;
                invalidate();
            } else if (areaView != null && this.malicious) {
                onClickAway();
            } else {
                this.selectedArea = (AreaView) view;
                invalidate();
                HintView2 hintView2 = this.hintView;
                if (hintView2 != null) {
                    hintView2.hide();
                    this.hintView = null;
                }
                boolean z = this.selectedArea.getTranslationY() < ((float) AndroidUtilities.dp(100.0f));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString("StoryViewLocation", R.string.StoryViewLocation));
                SpannableString spannableString = new SpannableString(">");
                ColoredImageSpan coloredImageSpan = new ColoredImageSpan(R.drawable.photos_arrow);
                coloredImageSpan.translate(AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f));
                spannableString.setSpan(coloredImageSpan, 0, spannableString.length(), 33);
                SpannableString spannableString2 = new SpannableString("<");
                ColoredImageSpan coloredImageSpan2 = new ColoredImageSpan(R.drawable.attach_arrow_right);
                coloredImageSpan2.translate(AndroidUtilities.dp(-2.0f), AndroidUtilities.dp(1.0f));
                coloredImageSpan2.setScale(-1.0f, 1.0f);
                spannableString2.setSpan(coloredImageSpan2, 0, spannableString2.length(), 33);
                AndroidUtilities.replaceCharSequence(">", spannableStringBuilder, spannableString);
                AndroidUtilities.replaceCharSequence("<", spannableStringBuilder, spannableString2);
                final HintView2 duration = new HintView2(getContext(), z ? 1 : 3).setText(spannableStringBuilder).setSelectorColor(687865855).setJointPx(0.0f, this.selectedArea.getTranslationX() - AndroidUtilities.dp(8.0f)).setDuration(5000L);
                this.hintView = duration;
                duration.setOnHiddenListener(new Runnable() {
                    @Override
                    public final void run() {
                        StoryMediaAreasView.this.lambda$onClick$1(duration);
                    }
                });
                if (z) {
                    this.hintView.setTranslationY(this.selectedArea.getTranslationY() + (this.selectedArea.getMeasuredHeight() / 2.0f));
                } else {
                    this.hintView.setTranslationY((this.selectedArea.getTranslationY() - (this.selectedArea.getMeasuredHeight() / 2.0f)) - AndroidUtilities.dp(50.0f));
                }
                this.hintView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public final void onClick(View view2) {
                        StoryMediaAreasView.this.lambda$onClick$2(view2);
                    }
                });
                this.hintView.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
                this.hintsContainer.addView(this.hintView, LayoutHelper.createFrame(-1, 50.0f));
                this.hintView.show();
                onHintVisible(true);
            }
        }
    }

    public void lambda$onClick$0() {
        HintView2 hintView2 = this.hintView;
        if (hintView2 != null) {
            hintView2.hide();
            this.hintView = null;
        }
        onHintVisible(false);
    }

    public void lambda$onClick$1(HintView2 hintView2) {
        this.hintsContainer.removeView(hintView2);
        if (hintView2 == this.hintView) {
            this.selectedArea = null;
            invalidate();
            onHintVisible(false);
        }
    }

    public void lambda$onClick$2(View view) {
        onClick(this.selectedArea);
    }

    public void closeHint() {
        HintView2 hintView2 = this.hintView;
        if (hintView2 != null) {
            hintView2.hide();
            this.hintView = null;
        }
        this.selectedArea = null;
        invalidate();
        onHintVisible(false);
    }

    @Override
    public boolean onTouchEvent(MotionEvent motionEvent) {
        HintView2 hintView2;
        if (getChildCount() == 0 || (hintView2 = this.hintView) == null || !hintView2.shown()) {
            return false;
        }
        if (motionEvent.getAction() == 1) {
            onClickAway();
        }
        super.onTouchEvent(motionEvent);
        return true;
    }

    private void onClickAway() {
        HintView2 hintView2 = this.hintView;
        if (hintView2 != null) {
            hintView2.hide();
            this.hintView = null;
        }
        this.selectedArea = null;
        invalidate();
        onHintVisible(false);
        if (this.malicious) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt != this.hintsContainer) {
                    childAt.setClickable(false);
                }
            }
        }
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt == this.hintsContainer) {
                childAt.layout(0, 0, i3 - i, i4 - i2);
            } else if (childAt instanceof AreaView) {
                AreaView areaView = (AreaView) childAt;
                int measuredWidth = areaView.getMeasuredWidth();
                int measuredHeight = areaView.getMeasuredHeight();
                areaView.layout((-measuredWidth) / 2, (-measuredHeight) / 2, measuredWidth / 2, measuredHeight / 2);
                double measuredWidth2 = getMeasuredWidth();
                Double.isNaN(measuredWidth2);
                areaView.setTranslationX((float) ((areaView.mediaArea.coordinates.x / 100.0d) * measuredWidth2));
                double measuredHeight2 = getMeasuredHeight();
                Double.isNaN(measuredHeight2);
                areaView.setTranslationY((float) ((areaView.mediaArea.coordinates.y / 100.0d) * measuredHeight2));
                areaView.setRotation((float) areaView.mediaArea.coordinates.rotation);
            }
        }
    }

    @Override
    protected boolean drawChild(Canvas canvas, View view, long j) {
        if (view == this.hintsContainer) {
            drawHighlight(canvas);
        }
        return super.drawChild(canvas, view, j);
    }

    private void drawHighlight(Canvas canvas) {
        float f = this.parentHighlightAlpha.set(this.selectedArea != null);
        if (f > 0.0f) {
            canvas.saveLayerAlpha(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), 255, 31);
            canvas.drawColor(Theme.multAlpha(402653184, f));
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt != this.hintsContainer) {
                    float f2 = ((AreaView) childAt).highlightAlpha.set(childAt == this.selectedArea);
                    if (f2 > 0.0f) {
                        canvas.save();
                        this.rectF.set(childAt.getX(), childAt.getY(), childAt.getX() + childAt.getMeasuredWidth(), childAt.getY() + childAt.getMeasuredHeight());
                        canvas.rotate(childAt.getRotation(), this.rectF.centerX(), this.rectF.centerY());
                        this.cutPaint.setAlpha((int) (f2 * 255.0f));
                        RectF rectF = this.rectF;
                        canvas.drawRoundRect(rectF, rectF.height() * 0.2f, this.rectF.height() * 0.2f, this.cutPaint);
                        canvas.restore();
                    }
                }
            }
            canvas.restore();
        }
    }

    public void shine() {
        if (this.shined) {
            return;
        }
        this.shined = true;
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof AreaView) {
                ((AreaView) childAt).shine();
            }
        }
    }

    public static class AreaView extends View {
        private LinearGradient gradient;
        private final Matrix gradientMatrix;
        private final Paint gradientPaint;
        public final AnimatedFloat highlightAlpha;
        public final TLRPC$MediaArea mediaArea;
        private final Runnable shineRunnable;
        private boolean shining;
        private long startTime;
        private LinearGradient strokeGradient;
        private final Paint strokeGradientPaint;

        public AreaView(Context context, View view, TLRPC$MediaArea tLRPC$MediaArea) {
            super(context);
            this.gradientPaint = new Paint(1);
            Paint paint = new Paint(1);
            this.strokeGradientPaint = paint;
            this.gradientMatrix = new Matrix();
            this.shining = false;
            this.shineRunnable = new Runnable() {
                @Override
                public final void run() {
                    StoryMediaAreasView.AreaView.this.shineInternal();
                }
            };
            this.mediaArea = tLRPC$MediaArea;
            this.highlightAlpha = new AnimatedFloat(view, 0L, 120L, new LinearInterpolator());
            paint.setStyle(Paint.Style.STROKE);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            if (!this.shining || this.gradient == null) {
                return;
            }
            float measuredWidth = getMeasuredWidth() * 0.7f;
            float currentTimeMillis = ((float) (System.currentTimeMillis() - this.startTime)) / 600.0f;
            float measuredWidth2 = ((getMeasuredWidth() + measuredWidth) * currentTimeMillis) - measuredWidth;
            if (currentTimeMillis >= 1.0f) {
                this.shining = false;
                return;
            }
            this.gradientMatrix.reset();
            this.gradientMatrix.postScale(measuredWidth / 40.0f, 1.0f);
            this.gradientMatrix.postTranslate(measuredWidth2, 0.0f);
            this.gradient.setLocalMatrix(this.gradientMatrix);
            this.gradientPaint.setShader(this.gradient);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            canvas.drawRoundRect(rectF, getMeasuredHeight() * 0.2f, getMeasuredHeight() * 0.2f, this.gradientPaint);
            this.strokeGradient.setLocalMatrix(this.gradientMatrix);
            this.strokeGradientPaint.setShader(this.strokeGradient);
            float dpf2 = AndroidUtilities.dpf2(1.5f);
            this.strokeGradientPaint.setStrokeWidth(dpf2);
            float f = dpf2 / 2.0f;
            rectF.inset(f, f);
            canvas.drawRoundRect(rectF, (getMeasuredHeight() * 0.2f) - f, (getMeasuredHeight() * 0.2f) - f, this.strokeGradientPaint);
            invalidate();
        }

        public void shine() {
            AndroidUtilities.cancelRunOnUIThread(this.shineRunnable);
            AndroidUtilities.runOnUIThread(this.shineRunnable, 400L);
        }

        public void shineInternal() {
            this.shining = true;
            this.startTime = System.currentTimeMillis();
            this.gradient = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 1325400063, 1325400063, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
            this.strokeGradient = new LinearGradient(0.0f, 0.0f, 40.0f, 0.0f, new int[]{16777215, 872415231, 872415231, 16777215}, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, Shader.TileMode.CLAMP);
            invalidate();
        }
    }
}
