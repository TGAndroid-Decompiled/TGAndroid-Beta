package org.telegram.ui.Stories.recorder;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
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
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.CubicBezierInterpolator;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RecyclerListView;
import org.telegram.ui.GradientClip;

public class CollageLayoutButton extends ToggleButton2 {
    public CollageLayoutButton(Context context) {
        super(context);
    }

    public static class CollageLayoutListView extends FrameLayout {
        public final RecyclerListView listView;
        private Utilities.Callback onLayoutClick;
        private CollageLayout selectedLayout;
        private boolean visible;
        private ValueAnimator visibleAnimator;
        private float visibleProgress;

        public void setSelected(CollageLayout collageLayout) {
            this.selectedLayout = collageLayout;
            AndroidUtilities.updateVisibleRows(this.listView);
        }

        public CollageLayoutListView(final Context context, final FlashViews flashViews) {
            super(context);
            RecyclerListView recyclerListView = new RecyclerListView(context) {
                private final GradientClip clip = new GradientClip();

                @Override
                public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
                    if (motionEvent.getX() <= getPaddingLeft() || motionEvent.getX() >= getWidth() - getPaddingRight()) {
                        return false;
                    }
                    getParent().requestDisallowInterceptTouchEvent(true);
                    return super.onInterceptTouchEvent(motionEvent);
                }

                @Override
                public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                    if (motionEvent.getX() <= getPaddingLeft() || motionEvent.getX() >= getWidth() - getPaddingRight()) {
                        return false;
                    }
                    return super.dispatchTouchEvent(motionEvent);
                }

                @Override
                protected void dispatchDraw(Canvas canvas) {
                    canvas.saveLayerAlpha(0.0f, 0.0f, getWidth(), getHeight(), (int) (CollageLayoutListView.this.visibleProgress * 255.0f), 31);
                    canvas.save();
                    float paddingLeft = getPaddingLeft();
                    float width = getWidth() - getPaddingRight();
                    canvas.clipRect(paddingLeft, 0.0f, width, getHeight());
                    canvas.translate((1.0f - CollageLayoutListView.this.visibleProgress) * width, 0.0f);
                    super.dispatchDraw(canvas);
                    canvas.restore();
                    canvas.save();
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set(paddingLeft, 0.0f, AndroidUtilities.dp(12.0f) + paddingLeft, getHeight());
                    this.clip.draw(canvas, rectF, 0, CollageLayoutListView.this.visibleProgress);
                    rectF.set(width - AndroidUtilities.dp(12.0f), 0.0f, width, getHeight());
                    this.clip.draw(canvas, rectF, 2, CollageLayoutListView.this.visibleProgress);
                    canvas.restore();
                    canvas.restore();
                }
            };
            this.listView = recyclerListView;
            recyclerListView.setAdapter(new RecyclerView.Adapter() {
                @Override
                public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                    Button button = new Button(context);
                    button.setLayoutParams(new RecyclerView.LayoutParams(AndroidUtilities.dp(46.0f), AndroidUtilities.dp(56.0f)));
                    button.setBackground(Theme.createSelectorDrawable(553648127));
                    return new RecyclerListView.Holder(button);
                }

                @Override
                public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
                    Button button = (Button) viewHolder.itemView;
                    CollageLayout collageLayout = (CollageLayout) CollageLayout.getLayouts().get(i);
                    boolean z = i == button.position;
                    button.setDrawable(new CollageLayoutDrawable(collageLayout));
                    button.setSelected(collageLayout.equals(CollageLayoutListView.this.selectedLayout), z);
                    button.position = i;
                }

                @Override
                public void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
                    Button button = (Button) viewHolder.itemView;
                    flashViews.add(button);
                    int i = button.position;
                    if (i >= 0 && i < CollageLayout.getLayouts().size()) {
                        CollageLayout collageLayout = (CollageLayout) CollageLayout.getLayouts().get(button.position);
                        button.setDrawable(new CollageLayoutDrawable(collageLayout));
                        button.setSelected(collageLayout.equals(CollageLayoutListView.this.selectedLayout), false);
                    }
                    super.onViewAttachedToWindow(viewHolder);
                }

                @Override
                public void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
                    flashViews.remove((Button) viewHolder.itemView);
                    super.onViewDetachedFromWindow(viewHolder);
                }

                @Override
                public int getItemCount() {
                    return CollageLayout.getLayouts().size();
                }
            });
            recyclerListView.setLayoutManager(new LinearLayoutManager(context, 0, false));
            recyclerListView.setClipToPadding(false);
            recyclerListView.setVisibility(8);
            recyclerListView.setWillNotDraw(false);
            recyclerListView.setOnItemClickListener(new RecyclerListView.OnItemClickListener() {
                @Override
                public final void onItemClick(View view, int i) {
                    CollageLayoutButton.CollageLayoutListView.m4468$r8$lambda$RXEKyEE9da3xj1oSzU_3fBV6HM(this.f$0, view, i);
                }
            });
            addView(recyclerListView, LayoutHelper.createFrame(-1, 56.0f));
        }

        public static void m4468$r8$lambda$RXEKyEE9da3xj1oSzU_3fBV6HM(CollageLayoutListView collageLayoutListView, View view, int i) {
            Utilities.Callback callback = collageLayoutListView.onLayoutClick;
            if (callback != null) {
                callback.run((CollageLayout) CollageLayout.getLayouts().get(i));
            }
        }

        private static class Button extends ToggleButton2 {
            public int position;

            public Button(Context context) {
                super(context);
            }
        }

        public void setOnLayoutClick(Utilities.Callback<CollageLayout> callback) {
            this.onLayoutClick = callback;
        }

        public void setBounds(float f, float f2) {
            this.listView.setPadding((int) f, 0, (int) f2, 0);
            this.listView.invalidate();
        }

        public boolean isVisible() {
            return this.visible;
        }

        public void setVisible(final boolean z, boolean z2) {
            ValueAnimator valueAnimator = this.visibleAnimator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (this.visible == z) {
                return;
            }
            this.visible = z;
            if (z2) {
                this.listView.setVisibility(0);
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.visibleProgress, z ? 1.0f : 0.0f);
                this.visibleAnimator = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        CollageLayoutButton.CollageLayoutListView.m4469$r8$lambda$_GBIt8Plj4l0VSEWFSXYpMd9Hc(this.f$0, valueAnimator2);
                    }
                });
                this.visibleAnimator.addListener(new AnimatorListenerAdapter() {
                    @Override
                    public void onAnimationEnd(Animator animator) {
                        CollageLayoutListView.this.visibleProgress = z ? 1.0f : 0.0f;
                        CollageLayoutListView.this.listView.invalidate();
                        CollageLayoutListView.this.listView.setVisibility(z ? 0 : 8);
                    }
                });
                this.visibleAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                this.visibleAnimator.setDuration(340L);
                this.visibleAnimator.start();
                return;
            }
            this.visibleProgress = z ? 1.0f : 0.0f;
            this.listView.invalidate();
            this.listView.setVisibility(z ? 0 : 8);
        }

        public static void m4469$r8$lambda$_GBIt8Plj4l0VSEWFSXYpMd9Hc(CollageLayoutListView collageLayoutListView, ValueAnimator valueAnimator) {
            collageLayoutListView.getClass();
            collageLayoutListView.visibleProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            collageLayoutListView.listView.invalidate();
        }
    }

    public static class CollageLayoutDrawable extends Drawable {
        private boolean cross;
        public final Paint crossPaint;
        public final Paint crossXferPaint;
        public final Paint paint;
        public final Path path;
        private final float[] radii;

        @Override
        public int getOpacity() {
            return -2;
        }

        public CollageLayoutDrawable(CollageLayout collageLayout) {
            this(collageLayout, false);
        }

        public CollageLayoutDrawable(CollageLayout collageLayout, boolean z) {
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
            ArrayList arrayList = collageLayout.parts;
            int size = arrayList.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                CollageLayout.Part part = (CollageLayout.Part) obj;
                int i3 = collageLayout.columns[part.y];
                int i4 = i3 - 1;
                float fMax = (fDpf5 - (Math.max(i, i4) * fDpf8)) / i3;
                float fMax2 = (fDpf6 - (Math.max(i, collageLayout.h - 1) * fDpf8)) / collageLayout.h;
                RectF rectF2 = AndroidUtilities.rectTmp;
                float f = (-fDpf5) / 2.0f;
                int i5 = part.x;
                ArrayList arrayList2 = arrayList;
                float f2 = i5;
                float f3 = f + (fMax * f2);
                float f4 = f2 * fDpf8;
                float f5 = f3 + f4;
                int i6 = size;
                float f6 = (-fDpf6) / 2.0f;
                int i7 = part.y;
                float f7 = i7;
                float f8 = f6 + (fMax2 * f7);
                float f9 = f7 * fDpf8;
                rectF2.set(f5, f8 + f9, f + (fMax * (i5 + 1)) + f4, f6 + (fMax2 * (i7 + 1)) + f9);
                float[] fArr = this.radii;
                int i8 = part.x;
                float f10 = 0.0f;
                float f11 = (i8 == 0 && part.y == 0) ? fDpf7 : 0.0f;
                fArr[1] = f11;
                fArr[0] = f11;
                float f12 = (i8 == i4 && part.y == 0) ? fDpf7 : 0.0f;
                fArr[3] = f12;
                fArr[2] = f12;
                float f13 = (i8 == i4 && part.y == collageLayout.h + (-1)) ? fDpf7 : 0.0f;
                fArr[5] = f13;
                fArr[4] = f13;
                if (i8 == 0 && part.y == collageLayout.h - 1) {
                    f10 = fDpf7;
                }
                fArr[7] = f10;
                fArr[6] = f10;
                this.path.addRoundRect(rectF2, fArr, Path.Direction.CW);
                arrayList = arrayList2;
                size = i6;
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
        public void draw(Canvas canvas) {
            Canvas canvas2;
            if (this.cross) {
                canvas.saveLayerAlpha(getBounds().left, getBounds().top, getBounds().right, getBounds().bottom, 255, 31);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.save();
            }
            canvas2.translate(getBounds().centerX(), getBounds().centerY());
            canvas2.drawPath(this.path, this.paint);
            if (this.cross) {
                canvas2.drawLine(-AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), this.crossXferPaint);
                canvas2.drawLine(-AndroidUtilities.dp(8.66f), -AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), AndroidUtilities.dp(8.66f), this.crossPaint);
            }
            canvas2.restore();
        }

        @Override
        public void setAlpha(int i) {
            this.paint.setAlpha(i);
        }

        @Override
        public void setColorFilter(ColorFilter colorFilter) {
            this.paint.setColorFilter(colorFilter);
        }

        @Override
        public int getIntrinsicWidth() {
            return AndroidUtilities.dp(32.0f);
        }

        @Override
        public int getIntrinsicHeight() {
            return AndroidUtilities.dp(32.0f);
        }
    }
}
