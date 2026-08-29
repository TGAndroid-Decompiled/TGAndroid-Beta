package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class ny extends FrameLayout {
    public org.telegram.ui.Components.r9 f40922a;
    public org.telegram.ui.Components.r9 f40923b;
    public Drawable f40924c;
    public Drawable d;
    public final Drawable f40925e;
    public Paint f40926f;
    public RectF h;
    public final ViewGroup[] f40927n;
    public final oy f40928r;

    public ny(oy oyVar, Context context) {
        super(context);
        this.f40928r = oyVar;
        this.f40926f = new Paint(1);
        this.h = new RectF();
        this.f40927n = new ViewGroup[2];
        int i10 = 0;
        setWillNotDraw(false);
        setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f));
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        addView(g10, i7.f6.e(-2, -2, 17));
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context);
        v0Var.setCustomText(LocaleController.getString(R.string.WidgetPreview));
        g10.addView(v0Var, i7.f6.t(-2, -2, 17, 0, 0, 0, 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundResource(R.drawable.widget_bg);
        g10.addView(linearLayout, i7.f6.t(-2, -2, 17, 10, 0, 10, 0));
        oyVar.d = new ImageView(context);
        int i11 = oyVar.f41245w;
        if (i11 == 0) {
            while (i10 < 2) {
                this.f40927n[i10] = (ViewGroup) oyVar.getParentActivity().getLayoutInflater().inflate(R.layout.shortcut_widget_item, (ViewGroup) null);
                linearLayout.addView(this.f40927n[i10], i7.f6.n(-1, -2));
                i10++;
            }
            linearLayout.addView(oyVar.d, i7.f6.q(218, 160, 17));
            oyVar.d.setImageResource(R.drawable.chats_widget_preview);
        } else if (i11 == 1) {
            while (i10 < 2) {
                this.f40927n[i10] = (ViewGroup) oyVar.getParentActivity().getLayoutInflater().inflate(R.layout.contacts_widget_item, (ViewGroup) null);
                linearLayout.addView(this.f40927n[i10], i7.f6.n(160, -2));
                i10++;
            }
            linearLayout.addView(oyVar.d, i7.f6.q(160, 160, 17));
            oyVar.d.setImageResource(R.drawable.contacts_widget_preview);
        }
        a();
        this.f40925e = org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23028b7);
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ny.a():void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.r9 r9Var = this.f40922a;
        if (r9Var != null) {
            r9Var.dispose();
            this.f40922a = null;
        }
        org.telegram.ui.Components.r9 r9Var2 = this.f40923b;
        if (r9Var2 != null) {
            r9Var2.dispose();
            this.f40923b = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        Drawable s02 = org.telegram.ui.ActionBar.g6.s0();
        Drawable drawable2 = this.f40924c;
        if (s02 != drawable2 && s02 != null) {
            if (org.telegram.ui.ActionBar.g6.sl != null) {
                this.d = drawable2;
                this.f40923b = this.f40922a;
            } else {
                org.telegram.ui.Components.r9 r9Var = this.f40922a;
                if (r9Var != null) {
                    r9Var.dispose();
                    this.f40922a = null;
                }
            }
            this.f40924c = s02;
        }
        oy oyVar = this.f40928r;
        float themeAnimationValue = oy.W(oyVar).getThemeAnimationValue();
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                drawable = this.d;
            } else {
                drawable = this.f40924c;
            }
            if (drawable != null) {
                if (i10 == 1 && this.d != null && oy.X(oyVar) != null) {
                    drawable.setAlpha((int) (255.0f * themeAnimationValue));
                } else {
                    drawable.setAlpha(255);
                }
                if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof org.telegram.ui.Components.yb0)) {
                    if (drawable instanceof BitmapDrawable) {
                        if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                            canvas.save();
                            float f9 = 2.0f / AndroidUtilities.density;
                            canvas.scale(f9, f9);
                            drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f9), (int) Math.ceil(getMeasuredHeight() / f9));
                        } else {
                            int measuredHeight = getMeasuredHeight();
                            float max = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), measuredHeight / drawable.getIntrinsicHeight());
                            int ceil = (int) Math.ceil(drawable.getIntrinsicWidth() * max);
                            int ceil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * max);
                            int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                            int i11 = (measuredHeight - ceil2) / 2;
                            canvas.save();
                            canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                            drawable.setBounds(measuredWidth, i11, ceil + measuredWidth, ceil2 + i11);
                        }
                        drawable.draw(canvas);
                        canvas.restore();
                    }
                } else {
                    drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    if (drawable instanceof org.telegram.ui.Components.s9) {
                        this.f40922a = ((org.telegram.ui.Components.s9) drawable).c(canvas, this);
                    } else {
                        drawable.draw(canvas);
                    }
                }
                if (i10 == 0 && this.d != null && themeAnimationValue >= 1.0f) {
                    org.telegram.ui.Components.r9 r9Var2 = this.f40923b;
                    if (r9Var2 != null) {
                        r9Var2.dispose();
                        this.f40923b = null;
                    }
                    this.d = null;
                    invalidate();
                }
            }
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable3 = this.f40925e;
        drawable3.setBounds(0, 0, measuredWidth2, measuredHeight2);
        drawable3.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(264.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void dispatchSetPressed(boolean z10) {
    }
}
