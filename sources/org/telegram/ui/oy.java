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

public final class oy extends FrameLayout {

    public org.telegram.ui.Components.l9 f41207a;

    public org.telegram.ui.Components.l9 f41208b;

    public Drawable f41209c;
    public Drawable d;

    public final Drawable f41210e;

    public Paint f41211f;
    public RectF h;

    public final ViewGroup[] f41212n;

    public final py f41213r;

    public oy(py pyVar, Context context) {
        super(context);
        this.f41213r = pyVar;
        this.f41211f = new Paint(1);
        this.h = new RectF();
        this.f41212n = new ViewGroup[2];
        int i10 = 0;
        setWillNotDraw(false);
        setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f));
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
        addView(linearLayoutG, h7.z5.e(-2, -2, 17));
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context);
        v0Var.setCustomText(LocaleController.getString(R.string.WidgetPreview));
        linearLayoutG.addView(v0Var, h7.z5.t(-2, -2, 17, 0, 0, 0, 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundResource(R.drawable.widget_bg);
        linearLayoutG.addView(linearLayout, h7.z5.t(-2, -2, 17, 10, 0, 10, 0));
        pyVar.d = new ImageView(context);
        int i11 = pyVar.f41450w;
        if (i11 == 0) {
            while (i10 < 2) {
                this.f41212n[i10] = (ViewGroup) pyVar.getParentActivity().getLayoutInflater().inflate(R.layout.shortcut_widget_item, (ViewGroup) null);
                linearLayout.addView(this.f41212n[i10], h7.z5.n(-1, -2));
                i10++;
            }
            linearLayout.addView(pyVar.d, h7.z5.q(218, 160, 17));
            pyVar.d.setImageResource(R.drawable.chats_widget_preview);
        } else if (i11 == 1) {
            while (i10 < 2) {
                this.f41212n[i10] = (ViewGroup) pyVar.getParentActivity().getLayoutInflater().inflate(R.layout.contacts_widget_item, (ViewGroup) null);
                linearLayout.addView(this.f41212n[i10], h7.z5.n(160, -2));
                i10++;
            }
            linearLayout.addView(pyVar.d, h7.z5.q(160, 160, 17));
            pyVar.d.setImageResource(R.drawable.contacts_widget_preview);
        }
        a();
        this.f41210e = org.telegram.ui.ActionBar.g6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f23018b7);
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.oy.a():void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.l9 l9Var = this.f41207a;
        if (l9Var != null) {
            l9Var.dispose();
            this.f41207a = null;
        }
        org.telegram.ui.Components.l9 l9Var2 = this.f41208b;
        if (l9Var2 != null) {
            l9Var2.dispose();
            this.f41208b = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawableS0 = org.telegram.ui.ActionBar.g6.s0();
        Drawable drawable = this.f41209c;
        if (drawableS0 != drawable && drawableS0 != null) {
            if (org.telegram.ui.ActionBar.g6.sl != null) {
                this.d = drawable;
                this.f41208b = this.f41207a;
            } else {
                org.telegram.ui.Components.l9 l9Var = this.f41207a;
                if (l9Var != null) {
                    l9Var.dispose();
                    this.f41207a = null;
                }
            }
            this.f41209c = drawableS0;
        }
        py pyVar = this.f41213r;
        float themeAnimationValue = ((org.telegram.ui.ActionBar.n2) pyVar).parentLayout.getThemeAnimationValue();
        int i10 = 0;
        while (i10 < 2) {
            Drawable drawable2 = i10 == 0 ? this.d : this.f41209c;
            if (drawable2 != null) {
                if (i10 != 1 || this.d == null || ((org.telegram.ui.ActionBar.n2) pyVar).parentLayout == null) {
                    drawable2.setAlpha(255);
                } else {
                    drawable2.setAlpha((int) (255.0f * themeAnimationValue));
                }
                if ((drawable2 instanceof ColorDrawable) || (drawable2 instanceof GradientDrawable) || (drawable2 instanceof org.telegram.ui.Components.nb0)) {
                    drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
                    if (drawable2 instanceof org.telegram.ui.Components.m9) {
                        this.f41207a = ((org.telegram.ui.Components.m9) drawable2).c(canvas, this);
                    } else {
                        drawable2.draw(canvas);
                    }
                } else if (drawable2 instanceof BitmapDrawable) {
                    if (((BitmapDrawable) drawable2).getTileModeX() == Shader.TileMode.REPEAT) {
                        canvas.save();
                        float f10 = 2.0f / AndroidUtilities.density;
                        canvas.scale(f10, f10);
                        drawable2.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f10), (int) Math.ceil(getMeasuredHeight() / f10));
                    } else {
                        int measuredHeight = getMeasuredHeight();
                        float fMax = Math.max(getMeasuredWidth() / drawable2.getIntrinsicWidth(), measuredHeight / drawable2.getIntrinsicHeight());
                        int iCeil = (int) Math.ceil(drawable2.getIntrinsicWidth() * fMax);
                        int iCeil2 = (int) Math.ceil(drawable2.getIntrinsicHeight() * fMax);
                        int measuredWidth = (getMeasuredWidth() - iCeil) / 2;
                        int i11 = (measuredHeight - iCeil2) / 2;
                        canvas.save();
                        canvas.clipRect(0, 0, iCeil, getMeasuredHeight());
                        drawable2.setBounds(measuredWidth, i11, iCeil + measuredWidth, iCeil2 + i11);
                    }
                    drawable2.draw(canvas);
                    canvas.restore();
                }
                if (i10 == 0 && this.d != null && themeAnimationValue >= 1.0f) {
                    org.telegram.ui.Components.l9 l9Var2 = this.f41208b;
                    if (l9Var2 != null) {
                        l9Var2.dispose();
                        this.f41208b = null;
                    }
                    this.d = null;
                    invalidate();
                }
            }
            i10++;
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable3 = this.f41210e;
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
