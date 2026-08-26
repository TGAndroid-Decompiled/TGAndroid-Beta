package org.telegram.ui.Stories.recorder;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ActionBar.OKLCH;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.GradientClip;
import org.telegram.ui.Stories.StoryViewer;

public final class CollageLayoutButton extends ToggleButton2 {

    public final class CollageLayoutDrawable extends Drawable {
        public final boolean cross;
        public final Paint crossPaint;
        public final Paint crossXferPaint;
        public final Paint paint;
        public final Path path;
        public final float[] radii;

        public CollageLayoutDrawable(CollageLayout collageLayout, boolean z) {
            CollageLayout collageLayout2 = collageLayout;
            Paint paint = new Paint(1);
            this.paint = paint;
            this.crossXferPaint = new Paint(1);
            this.crossPaint = new Paint(1);
            Path path = new Path();
            this.path = path;
            this.radii = new float[8];
            this.cross = z;
            paint.setColor(-1);
            float fDpf2 = AndroidUtilities.dpf2(13.333333f);
            float fDpf3 = AndroidUtilities.dpf2(18.666666f);
            float fDpf4 = AndroidUtilities.dpf2(3.0f);
            float fDpf5 = AndroidUtilities.dpf2(10.0f);
            float fDpf6 = AndroidUtilities.dpf2(15.333333f);
            float fDpf7 = AndroidUtilities.dpf2(1.0f);
            float fDpf8 = AndroidUtilities.dpf2(1.33f);
            path.setFillType(Path.FillType.EVEN_ODD);
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set((-fDpf2) / 2.0f, (-fDpf3) / 2.0f, fDpf2 / 2.0f, fDpf3 / 2.0f);
            path.addRoundRect(rectF, fDpf4, fDpf4, Path.Direction.CW);
            ArrayList arrayList = collageLayout2.parts;
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                int i3 = i2 + 1;
                CollageLayout.Part part = (CollageLayout.Part) obj;
                int i4 = collageLayout2.columns[part.y];
                int i5 = i4 - 1;
                float fMax = (fDpf5 - (Math.max(i, i5) * fDpf8)) / i4;
                int i6 = collageLayout2.h;
                int i7 = i6 - 1;
                float fMax2 = (fDpf6 - (Math.max(i, i7) * fDpf8)) / i6;
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f = (-fDpf5) / 2.0f;
                int i8 = part.x;
                ArrayList arrayList2 = arrayList;
                float f2 = i8;
                float f3 = (fMax * f2) + f;
                float f4 = f2 * fDpf8;
                int i9 = size;
                float f5 = (-fDpf6) / 2.0f;
                int i10 = part.y;
                float f6 = fDpf5;
                float f7 = i10;
                float f8 = (fMax2 * f7) + f5;
                float f9 = f7 * fDpf8;
                float f10 = fDpf6;
                float f11 = f9 + f8;
                float f12 = fDpf7;
                rectF2.set(f4 + f3, f11, OKLCH.m(fMax, i8 + 1, f, f4), OKLCH.m(fMax2, i10 + 1, f5, f9));
                float[] fArr = this.radii;
                float f13 = 0.0f;
                float f14 = (i8 == 0 && i10 == 0) ? f12 : 0.0f;
                fArr[1] = f14;
                fArr[0] = f14;
                float f15 = (i8 == i5 && i10 == 0) ? f12 : 0.0f;
                fArr[3] = f15;
                fArr[2] = f15;
                float f16 = (i8 == i5 && i10 == i7) ? f12 : 0.0f;
                fArr[5] = f16;
                fArr[4] = f16;
                if (i8 == 0 && i10 == i7) {
                    f13 = f12;
                }
                fArr[7] = f13;
                fArr[6] = f13;
                this.path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                collageLayout2 = collageLayout;
                arrayList = arrayList2;
                i2 = i3;
                size = i9;
                fDpf5 = f6;
                fDpf7 = f12;
                fDpf6 = f10;
                i = 0;
            }
            Paint paint2 = this.crossXferPaint;
            Paint.Style style = Paint.Style.STROKE;
            paint2.setStyle(style);
            this.crossXferPaint.setStrokeWidth(AndroidUtilities.dp(3.33f));
            this.crossXferPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
            this.crossPaint.setStyle(style);
            this.crossPaint.setStrokeWidth(AndroidUtilities.dp(1.33f));
            this.crossPaint.setColor(-1);
            this.crossPaint.setStrokeCap(Paint.Cap.ROUND);
            this.crossPaint.setStrokeJoin(Paint.Join.ROUND);
        }

        @Override
        public final void draw(Canvas canvas) {
            boolean z = this.cross;
            if (z) {
                canvas.saveLayerAlpha(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, 255, 31);
            } else {
                canvas.save();
            }
            canvas.translate(getBounds().centerX(), getBounds().centerY());
            canvas.drawPath(this.path, this.paint);
            if (z) {
                canvas.drawLine(-AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), this.crossXferPaint);
                canvas.drawLine(-AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), this.crossPaint);
            }
            canvas.restore();
        }

        @Override
        public final int getIntrinsicHeight() {
            return AndroidUtilities.dp(32.0f);
        }

        @Override
        public final int getIntrinsicWidth() {
            return AndroidUtilities.dp(32.0f);
        }

        @Override
        public final int getOpacity() {
            return -2;
        }

        @Override
        public final void setAlpha(int i) {
            this.paint.setAlpha(i);
        }

        @Override
        public final void setColorFilter(ColorFilter colorFilter) {
            this.paint.setColorFilter(colorFilter);
        }
    }

    public final class CollageLayoutListView extends FrameLayout {
        public final AnonymousClass1 listView;
        public Utilities.Callback onLayoutClick;
        public CollageLayout selectedLayout;
        public boolean visible;
        public ValueAnimator visibleAnimator;
        public float visibleProgress;

        public final class Button extends ToggleButton2 {
            public int position;
        }

        public CollageLayoutListView(final Activity activity, final FlashViews flashViews) {
            super(activity);
            ?? r0 = new RecyclerListView(activity) {
                public final GradientClip clip = new GradientClip();

                @Override
                public final void dispatchDraw(Canvas canvas) {
                    float width = getWidth();
                    float height = getHeight();
                    CollageLayoutListView collageLayoutListView = CollageLayoutListView.this;
                    canvas.saveLayerAlpha(0.0f, 0.0f, width, height, (int) (collageLayoutListView.visibleProgress * 255.0f), 31);
                    canvas.save();
                    float paddingLeft = getPaddingLeft();
                    float width2 = getWidth() - getPaddingRight();
                    canvas.clipRect(paddingLeft, 0.0f, width2, getHeight());
                    canvas.translate((1.0f - collageLayoutListView.visibleProgress) * width2, 0.0f);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    canvas.save();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(paddingLeft, 0.0f, AndroidUtilities.dp(12.0f) + paddingLeft, getHeight());
                    float f = collageLayoutListView.visibleProgress;
                    GradientClip gradientClip = this.clip;
                    gradientClip.draw(canvas, rectF, 0, f);
                    rectF.set(width2 - AndroidUtilities.dp(12.0f), 0.0f, width2, getHeight());
                    gradientClip.draw(canvas, rectF, 2, collageLayoutListView.visibleProgress);
                    canvas.restore();
                    canvas.restore();
                }

                @Override
                public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    if (motionEvent.getX() <= getPaddingLeft() || motionEvent.getX() >= getWidth() - getPaddingRight()) {
                        return false;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }

                @Override
                public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    if (motionEvent.getX() <= getPaddingLeft() || motionEvent.getX() >= getWidth() - getPaddingRight()) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return super.onInterceptTouchEvent(motionEvent);
                }
            };
            this.listView = r0;
            r0.setAdapter(new RecyclerView.Adapter() {
                @Override
                public final int getItemCount() {
                    return CollageLayout.getLayouts().size();
                }

                @Override
                public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                    Button button = (Button) viewHolder.itemView;
                    CollageLayout collageLayout = (CollageLayout) CollageLayout.getLayouts().get(i);
                    boolean z = i == button.position;
                    button.setDrawable(new CollageLayoutDrawable(collageLayout, false));
                    button.setSelected(collageLayout.equals(CollageLayoutListView.this.selectedLayout), z);
                    button.position = i;
                }

                @Override
                public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    Button button = new Button(activity);
                    button.setLayoutParams(new RecyclerView.LayoutParams(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(56.0f)));
                    button.setBackground(Theme.createSelectorDrawable(553648127, 1, -1));
                    return new RecyclerListView.Holder(button);
                }

                @Override
                public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
                    Button button = (Button) viewHolder.itemView;
                    FlashViews flashViews2 = flashViews;
                    button.setInvert(flashViews2.invert);
                    flashViews2.invertableViews.add(button);
                    int i = button.position;
                    if (i >= 0 && i < CollageLayout.getLayouts().size()) {
                        CollageLayout collageLayout = (CollageLayout) CollageLayout.getLayouts().get(button.position);
                        button.setDrawable(new CollageLayoutDrawable(collageLayout, false));
                        button.setSelected(collageLayout.equals(CollageLayoutListView.this.selectedLayout), false);
                    }
                    super.onViewAttachedToWindow(viewHolder);
                }

                @Override
                public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
                    flashViews.invertableViews.remove((Button) viewHolder.itemView);
                    super.onViewDetachedFromWindow(viewHolder);
                }
            });
            r0.setLayoutManager(new LinearLayoutManager(0, false));
            r0.setClipToPadding(false);
            r0.setVisibility(8);
            r0.setWillNotDraw(false);
            r0.setOnItemClickListener(new PaintView$$ExternalSyntheticLambda18(this, 1));
            addView((View) r0, LayoutHelper.createFrame(-1, 56.0f));
        }

        public void setOnLayoutClick(Utilities.Callback<CollageLayout> callback) {
            this.onLayoutClick = callback;
        }

        public void setSelected(CollageLayout collageLayout) {
            this.selectedLayout = collageLayout;
            AndroidUtilities.updateVisibleRows(this.listView);
        }

        public final void setVisible(boolean z, boolean z2) {
            int i = 2;
            ValueAnimator valueAnimator = this.visibleAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.visible == z) {
                return;
            }
            this.visible = z;
            AnonymousClass1 anonymousClass1 = this.listView;
            if (!z2) {
                this.visibleProgress = z ? 1.0f : 0.0f;
                anonymousClass1.invalidate();
                anonymousClass1.setVisibility(z ? 0 : 8);
                return;
            }
            anonymousClass1.setVisibility(0);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.visibleProgress, z ? 1.0f : 0.0f);
            this.visibleAnimator = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new HintView2$$ExternalSyntheticLambda1(this, i));
            this.visibleAnimator.addListener(new StoryViewer.AnonymousClass7(this, z, 13));
            this.visibleAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
            this.visibleAnimator.setDuration(340L);
            this.visibleAnimator.start();
        }
    }
}
