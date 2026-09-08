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
public final class cz extends FrameLayout {
    public org.telegram.ui.Components.v9 f35598a;
    public org.telegram.ui.Components.v9 f35599b;
    public Drawable f35600c;
    public Drawable d;
    public final Drawable f35601e;
    public Paint f35602f;
    public RectF h;
    public final ViewGroup[] f35603n;
    public final dz f35604r;

    public cz(dz dzVar, Context context) {
        super(context);
        this.f35604r = dzVar;
        this.f35602f = new Paint(1);
        this.h = new RectF();
        this.f35603n = new ViewGroup[2];
        int i10 = 0;
        setWillNotDraw(false);
        setPadding(0, AndroidUtilities.dp(24.0f), 0, AndroidUtilities.dp(24.0f));
        LinearLayout f7 = org.telegram.messenger.wl.f(context, 1);
        addView(f7, w7.x5.e(-2, -2, 17));
        org.telegram.ui.Cells.w0 w0Var = new org.telegram.ui.Cells.w0(context);
        w0Var.setCustomText(LocaleController.getString(R.string.WidgetPreview));
        f7.addView(w0Var, w7.x5.t(-2, -2, 17, 0, 0, 0, 4));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundResource(R.drawable.widget_bg);
        f7.addView(linearLayout, w7.x5.t(-2, -2, 17, 10, 0, 10, 0));
        dzVar.d = new ImageView(context);
        int i11 = dzVar.f35922w;
        if (i11 == 0) {
            while (i10 < 2) {
                this.f35603n[i10] = (ViewGroup) dzVar.getParentActivity().getLayoutInflater().inflate(R.layout.shortcut_widget_item, (ViewGroup) null);
                linearLayout.addView(this.f35603n[i10], w7.x5.n(-1, -2));
                i10++;
            }
            linearLayout.addView(dzVar.d, w7.x5.q(218, 160, 17));
            dzVar.d.setImageResource(R.drawable.chats_widget_preview);
        } else if (i11 == 1) {
            while (i10 < 2) {
                this.f35603n[i10] = (ViewGroup) dzVar.getParentActivity().getLayoutInflater().inflate(R.layout.contacts_widget_item, (ViewGroup) null);
                linearLayout.addView(this.f35603n[i10], w7.x5.n(160, -2));
                i10++;
            }
            linearLayout.addView(dzVar.d, w7.x5.q(160, 160, 17));
            dzVar.d.setImageResource(R.drawable.contacts_widget_preview);
        }
        a();
        this.f35601e = org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f20654b7);
    }

    public final void a() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.cz.a():void");
    }

    @Override
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.ui.Components.v9 v9Var = this.f35598a;
        if (v9Var != null) {
            v9Var.dispose();
            this.f35598a = null;
        }
        org.telegram.ui.Components.v9 v9Var2 = this.f35599b;
        if (v9Var2 != null) {
            v9Var2.dispose();
            this.f35599b = null;
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        Drawable s02 = org.telegram.ui.ActionBar.j6.s0();
        Drawable drawable2 = this.f35600c;
        if (s02 != drawable2 && s02 != null) {
            if (org.telegram.ui.ActionBar.j6.sl != null) {
                this.d = drawable2;
                this.f35599b = this.f35598a;
            } else {
                org.telegram.ui.Components.v9 v9Var = this.f35598a;
                if (v9Var != null) {
                    v9Var.dispose();
                    this.f35598a = null;
                }
            }
            this.f35600c = s02;
        }
        dz dzVar = this.f35604r;
        float themeAnimationValue = dz.W(dzVar).getThemeAnimationValue();
        for (int i10 = 0; i10 < 2; i10++) {
            if (i10 == 0) {
                drawable = this.d;
            } else {
                drawable = this.f35600c;
            }
            if (drawable != null) {
                if (i10 == 1 && this.d != null && dz.X(dzVar) != null) {
                    drawable.setAlpha((int) (255.0f * themeAnimationValue));
                } else {
                    drawable.setAlpha(255);
                }
                if (!(drawable instanceof ColorDrawable) && !(drawable instanceof GradientDrawable) && !(drawable instanceof org.telegram.ui.Components.dc0)) {
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
                    if (drawable instanceof org.telegram.ui.Components.w9) {
                        this.f35598a = ((org.telegram.ui.Components.w9) drawable).c(canvas, this);
                    } else {
                        drawable.draw(canvas);
                    }
                }
                if (i10 == 0 && this.d != null && themeAnimationValue >= 1.0f) {
                    org.telegram.ui.Components.v9 v9Var2 = this.f35599b;
                    if (v9Var2 != null) {
                        v9Var2.dispose();
                        this.f35599b = null;
                    }
                    this.d = null;
                    invalidate();
                }
            }
        }
        int measuredWidth2 = getMeasuredWidth();
        int measuredHeight2 = getMeasuredHeight();
        Drawable drawable3 = this.f35601e;
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
