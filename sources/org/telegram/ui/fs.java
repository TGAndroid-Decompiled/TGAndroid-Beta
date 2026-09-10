package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import org.telegram.messenger.AndroidUtilities;
public abstract class fs extends LinearLayout {
    public final Paint f32903a;
    public final Paint f32904b;
    public float f32905c;
    public boolean d;
    public boolean e;
    public hs[] f32906f;

    public fs(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.f32903a = paint;
        this.f32904b = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        setOrientation(0);
    }

    public abstract void a();

    public final void b(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        hs[] hsVarArr = this.f32906f;
        int i15 = 0;
        if (hsVarArr == null || hsVarArr.length != i10) {
            if (hsVarArr != null) {
                for (hs hsVar : hsVarArr) {
                    removeView(hsVar);
                }
            }
            this.f32906f = new hs[i10];
            for (int i16 = 0; i16 < i10; i16++) {
                this.f32906f[i16] = new ds(this, getContext(), i16, i10);
                this.f32906f[i16].setImeOptions(268435461);
                this.f32906f[i16].setTextSize(1, 20.0f);
                this.f32906f[i16].setMaxLines(1);
                this.f32906f[i16].setTypeface(AndroidUtilities.bold());
                this.f32906f[i16].setPadding(0, 0, 0, 0);
                this.f32906f[i16].setGravity(17);
                if (i11 == 3) {
                    this.f32906f[i16].setEnabled(false);
                    this.f32906f[i16].setInputType(0);
                    this.f32906f[i16].setVisibility(8);
                } else {
                    this.f32906f[i16].setInputType(3);
                }
                int i17 = 10;
                if (i11 == 10) {
                    i12 = 42;
                    i13 = 47;
                } else if (i11 == 11) {
                    i17 = 5;
                    i12 = 28;
                    i13 = 34;
                } else {
                    i17 = 7;
                    i12 = 34;
                    i13 = 42;
                }
                hs hsVar2 = this.f32906f[i16];
                if (i16 != i10 - 1) {
                    i14 = i17;
                } else {
                    i14 = 0;
                }
                addView(hsVar2, w7.a6.t(i12, i13, 1, 0, 0, i14, 0));
                this.f32906f[i16].addTextChangedListener(new es(this, i16, i10));
                this.f32906f[i16].setOnEditorActionListener(new ja(this, 3));
            }
            return;
        }
        while (true) {
            hs[] hsVarArr2 = this.f32906f;
            if (i15 < hsVarArr2.length) {
                hsVarArr2[i15].setText("");
                i15++;
            } else {
                return;
            }
        }
    }

    public final void c(String str, boolean z10) {
        if (this.f32906f != null) {
            int i10 = 0;
            if (z10) {
                int i11 = 0;
                while (true) {
                    hs[] hsVarArr = this.f32906f;
                    if (i11 >= hsVarArr.length) {
                        break;
                    } else if (hsVarArr[i11].isFocused()) {
                        i10 = i11;
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            for (int i12 = i10; i12 < Math.min(this.f32906f.length, str.length() + i10); i12++) {
                this.f32906f[i12].setText(Character.toString(str.charAt(i12 - i10)));
            }
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof hs) {
                hs hsVar = (hs) childAt;
                if (!this.e) {
                    if (childAt.isFocused()) {
                        hsVar.j(1.0f);
                    } else if (!childAt.isFocused()) {
                        hsVar.j(0.0f);
                    }
                }
                float successProgress = hsVar.getSuccessProgress();
                int d = i0.a.d(successProgress, i0.a.d(hsVar.getErrorProgress(), i0.a.d(hsVar.getFocusedProgress(), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18055k6, false), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18073l6, false)), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18162q7, false)), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18018i7, false));
                Paint paint = this.f32903a;
                paint.setColor(d);
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(childAt.getLeft(), childAt.getTop(), childAt.getRight(), childAt.getBottom());
                float f7 = this.f32905c;
                rectF.inset(f7, f7);
                if (successProgress != 0.0f) {
                    float f10 = -Math.max(0.0f, (hsVar.getSuccessScaleProgress() - 1.0f) * this.f32905c);
                    rectF.inset(f10, f10);
                }
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), paint);
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j3) {
        if (view instanceof hs) {
            hs hsVar = (hs) view;
            canvas.save();
            float f7 = hsVar.v;
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(view.getX(), view.getY(), view.getX() + view.getMeasuredWidth(), view.getY() + view.getMeasuredHeight());
            float f10 = this.f32905c;
            rectF.inset(f10, f10);
            canvas.clipRect(rectF);
            if (hsVar.f33452x) {
                float f11 = (f7 * 0.5f) + 0.5f;
                view.setAlpha(f7);
                canvas.scale(f11, f11, (hsVar.getMeasuredWidth() / 2.0f) + hsVar.getX(), (hsVar.getMeasuredHeight() / 2.0f) + hsVar.getY());
            } else {
                view.setAlpha(1.0f);
                canvas.translate(0.0f, (1.0f - f7) * view.getMeasuredHeight());
            }
            super.drawChild(canvas, view, j3);
            canvas.restore();
            float f12 = hsVar.f33451w;
            if (f12 < 1.0f) {
                canvas.save();
                float f13 = 1.0f - f12;
                float f14 = (f13 * 0.5f) + 0.5f;
                canvas.scale(f14, f14, (hsVar.getMeasuredWidth() / 2.0f) + hsVar.getX(), (hsVar.getMeasuredHeight() / 2.0f) + hsVar.getY());
                Paint paint = this.f32904b;
                paint.setAlpha((int) (f13 * 255.0f));
                canvas.drawBitmap(hsVar.f33453y, hsVar.getX(), hsVar.getY(), paint);
                canvas.restore();
                return true;
            }
            return true;
        }
        return super.drawChild(canvas, view, j3);
    }

    public String getCode() {
        if (this.f32906f == null) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (true) {
            hs[] hsVarArr = this.f32906f;
            if (i10 < hsVarArr.length) {
                sb2.append(gf.b.d(hsVarArr[i10].getText().toString(), false));
                i10++;
            } else {
                return sb2.toString();
            }
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        float dp = AndroidUtilities.dp(1.5f);
        this.f32905c = dp;
        this.f32903a.setStrokeWidth(dp);
    }

    public void setCode(String str) {
        this.f32906f[0].setText(str);
    }

    public void setText(String str) {
        c(str, false);
    }
}
