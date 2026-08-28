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
public final class ly extends FrameLayout {
    public org.telegram.ui.Components.m9 f40246a;
    public org.telegram.ui.Components.m9 f40247b;
    public Drawable f40248c;
    public Drawable d;
    public final Drawable f40249e;
    public Paint f40250f;
    public RectF h;
    public final ViewGroup[] f40251n;
    public final my f40252r;

    public ly(my myVar, Context context) {
        super(context);
        this.f40252r = myVar;
        this.f40250f = new Paint(1);
        this.h = new RectF();
        this.f40251n = new ViewGroup[2];
        int i9 = 0;
        setWillNotDraw(false);
        setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f));
        LinearLayout f10 = org.telegram.messenger.ll.f(context, 1);
        addView(f10, g7.e6.e(-2, -2, 17));
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context);
        w0Var.setCustomText(LocaleController.getString(R.string.WidgetPreview));
        f10.addView(w0Var, g7.e6.t(-2, -2, 17, 0, 0, 0, 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundResource(R.drawable.widget_bg);
        f10.addView(linearLayout, g7.e6.t(-2, -2, 17, 10, 0, 10, 0));
        myVar.d = new ImageView(context);
        int i10 = myVar.f40554w;
        if (i10 == 0) {
            while (i9 < 2) {
                this.f40251n[i9] = (ViewGroup) myVar.getParentActivity().getLayoutInflater().inflate(R.layout.shortcut_widget_item, (ViewGroup) null);
                linearLayout.addView(this.f40251n[i9], g7.e6.n(-1, -2));
                i9++;
            }
            linearLayout.addView(myVar.d, g7.e6.q(218, 160, 17));
            myVar.d.setImageResource(R.drawable.chats_widget_preview);
        } else if (i10 == 1) {
            while (i9 < 2) {
                this.f40251n[i9] = (ViewGroup) myVar.getParentActivity().getLayoutInflater().inflate(R.layout.contacts_widget_item, (ViewGroup) null);
                linearLayout.addView(this.f40251n[i9], g7.e6.n(160, -2));
                i9++;
            }
            linearLayout.addView(myVar.d, g7.e6.q(160, 160, 17));
            myVar.d.setImageResource(R.drawable.contacts_widget_preview);
        }
        a();
        this.f40249e = org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.f22966b7);
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ly.a():void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.m9 m9Var = this.f40246a;
        if (m9Var != null) {
            m9Var.dispose();
            this.f40246a = null;
        }
        org.telegram.ui.Components.m9 m9Var2 = this.f40247b;
        if (m9Var2 != null) {
            m9Var2.dispose();
            this.f40247b = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        Drawable s02 = org.telegram.ui.ActionBar.f6.s0();
        Drawable drawable2 = this.f40248c;
        if (s02 != drawable2 && s02 != null) {
            if (org.telegram.ui.ActionBar.f6.sl != null) {
                this.d = drawable2;
                this.f40247b = this.f40246a;
            } else {
                org.telegram.ui.Components.m9 m9Var = this.f40246a;
                if (m9Var != null) {
                    m9Var.dispose();
                    this.f40246a = null;
                }
            }
            this.f40248c = s02;
        }
        my myVar = this.f40252r;
        float themeAnimationValue = my.V(myVar).getThemeAnimationValue();
        for (int i9 = 0; i9 < 2; i9++) {
            if (i9 == 0) {
                drawable = this.d;
            } else {
                drawable = this.f40248c;
            }
            if (drawable != null) {
                if (i9 == 1 && this.d != null && my.W(myVar) != null) {
                    drawable.setAlpha((int) (255.0f * themeAnimationValue));
                } else {
                    drawable.setAlpha(255);
                }
                if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof org.telegram.ui.Components.jb0)) {
                    if (drawable instanceof BitmapDrawable) {
                        if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                            canvas.save();
                            float f10 = 2.0f / AndroidUtilities.density;
                            canvas.scale(f10, f10);
                            drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f10), (int) Math.ceil(getMeasuredHeight() / f10));
                        } else {
                            int measuredHeight = getMeasuredHeight();
                            float max = Math.max(getMeasuredWidth() / drawable.getIntrinsicWidth(), measuredHeight / drawable.getIntrinsicHeight());
                            int ceil = (int) Math.ceil(drawable.getIntrinsicWidth() * max);
                            int ceil2 = (int) Math.ceil(drawable.getIntrinsicHeight() * max);
                            int measuredWidth = (getMeasuredWidth() - ceil) / 2;
                            int i10 = (measuredHeight - ceil2) / 2;
                            canvas.save();
                            canvas.clipRect(0, 0, ceil, getMeasuredHeight());
                            drawable.setBounds(measuredWidth, i10, ceil + measuredWidth, ceil2 + i10);
                        }
                        drawable.draw(canvas);
                        canvas.restore();
                    }
                } else {
                    drawable.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    if (drawable instanceof org.telegram.ui.Components.n9) {
                        this.f40246a = ((org.telegram.ui.Components.n9) drawable).c(canvas, this);
                    } else {
                        drawable.draw(canvas);
                    }
                }
                if (i9 == 0 && this.d != null && themeAnimationValue >= 1.0f) {
                    org.telegram.ui.Components.m9 m9Var2 = this.f40247b;
                    if (m9Var2 != null) {
                        m9Var2.dispose();
                        this.f40247b = null;
                    }
                    this.d = null;
                    invalidate();
                }
            }
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable3 = this.f40249e;
        drawable3.setBounds(0, 0, measuredWidth2, measuredHeight2);
        drawable3.draw(canvas);
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(264.0f), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void dispatchSetPressed(boolean z10) {
    }
}
