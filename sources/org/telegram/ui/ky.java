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
public final class ky extends FrameLayout {
    public org.telegram.ui.Components.w9 f41083a;
    public org.telegram.ui.Components.w9 f41084b;
    public Drawable f41085c;
    public Drawable d;
    public final Drawable e;
    public Paint f41086f;
    public RectF h;
    public final ViewGroup[] f41087n;
    public final ly f41088r;

    public ky(ly lyVar, Context context) {
        super(context);
        this.f41088r = lyVar;
        this.f41086f = new Paint(1);
        this.h = new RectF();
        this.f41087n = new ViewGroup[2];
        int i10 = 0;
        setWillNotDraw(false);
        setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f));
        LinearLayout d = org.telegram.messenger.vh.d(context, 1);
        addView(d, org.telegram.ui.Components.gb1.i(-2, -2, 17));
        org.telegram.ui.Cells.v0 v0Var = new org.telegram.ui.Cells.v0(context);
        v0Var.setCustomText(LocaleController.getString(R.string.WidgetPreview));
        d.addView(v0Var, org.telegram.ui.Components.gb1.x(-2, -2, 17, 0, 0, 0, 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundResource(R.drawable.widget_bg);
        d.addView(linearLayout, org.telegram.ui.Components.gb1.x(-2, -2, 17, 10, 0, 10, 0));
        lyVar.d = new ImageView(context);
        int i11 = lyVar.f41399w;
        if (i11 == 0) {
            while (i10 < 2) {
                this.f41087n[i10] = (ViewGroup) lyVar.getParentActivity().getLayoutInflater().inflate(R.layout.shortcut_widget_item, (ViewGroup) null);
                linearLayout.addView(this.f41087n[i10], org.telegram.ui.Components.gb1.r(-1, -2));
                i10++;
            }
            linearLayout.addView(lyVar.d, org.telegram.ui.Components.gb1.u(218, 160, 17));
            lyVar.d.setImageResource(R.drawable.chats_widget_preview);
        } else if (i11 == 1) {
            while (i10 < 2) {
                this.f41087n[i10] = (ViewGroup) lyVar.getParentActivity().getLayoutInflater().inflate(R.layout.contacts_widget_item, (ViewGroup) null);
                linearLayout.addView(this.f41087n[i10], org.telegram.ui.Components.gb1.r(160, -2));
                i10++;
            }
            linearLayout.addView(lyVar.d, org.telegram.ui.Components.gb1.u(160, 160, 17));
            lyVar.d.setImageResource(R.drawable.contacts_widget_preview);
        }
        a();
        this.e = org.telegram.ui.ActionBar.y6.X0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.y6.f23318b7);
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ky.a():void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.w9 w9Var = this.f41083a;
        if (w9Var != null) {
            w9Var.dispose();
            this.f41083a = null;
        }
        org.telegram.ui.Components.w9 w9Var2 = this.f41084b;
        if (w9Var2 != null) {
            w9Var2.dispose();
            this.f41084b = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        Drawable t02 = org.telegram.ui.ActionBar.y6.t0();
        if (t02 != this.f41085c && t02 != null) {
            if (org.telegram.ui.ActionBar.y6.g1()) {
                this.d = this.f41085c;
                this.f41084b = this.f41083a;
            } else {
                org.telegram.ui.Components.w9 w9Var = this.f41083a;
                if (w9Var != null) {
                    w9Var.dispose();
                    this.f41083a = null;
                }
            }
            this.f41085c = t02;
        }
        ly lyVar = this.f41088r;
        float themeAnimationValue = ly.X(lyVar).getThemeAnimationValue();
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                drawable = this.d;
            } else {
                drawable = this.f41085c;
            }
            if (drawable != null) {
                if (i10 == 1 && this.d != null && ly.Y(lyVar) != null) {
                    drawable.setAlpha((int) (255.0f * themeAnimationValue));
                } else {
                    drawable.setAlpha(255);
                }
                if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof org.telegram.ui.Components.uc0)) {
                    if (drawable instanceof BitmapDrawable) {
                        if (((BitmapDrawable) drawable).getTileModeX() == Shader.TileMode.REPEAT) {
                            canvas.save();
                            float f7 = 2.0f / AndroidUtilities.density;
                            canvas.scale(f7, f7);
                            drawable.setBounds(0, 0, (int) Math.ceil(getMeasuredWidth() / f7), (int) Math.ceil(getMeasuredHeight() / f7));
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
                    if (drawable instanceof org.telegram.ui.Components.x9) {
                        this.f41083a = ((org.telegram.ui.Components.x9) drawable).c(canvas, this);
                    } else {
                        drawable.draw(canvas);
                    }
                }
                if (i10 == 0 && this.d != null && themeAnimationValue >= 1.0f) {
                    org.telegram.ui.Components.w9 w9Var2 = this.f41084b;
                    if (w9Var2 != null) {
                        w9Var2.dispose();
                        this.f41084b = null;
                    }
                    this.d = null;
                    invalidate();
                }
            }
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable2 = this.e;
        drawable2.setBounds(0, 0, measuredWidth2, measuredHeight2);
        drawable2.draw(canvas);
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
