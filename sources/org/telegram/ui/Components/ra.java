package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.view.MotionEvent;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
public abstract class ra extends View {
    public final org.telegram.ui.ActionBar.g6 f30133a;
    public final qa[] f30134b;
    public final Paint f30135c;
    public float d;
    public int e;
    public boolean f30136f;
    public final f6 h;
    public Utilities.Callback f30137n;
    public boolean f30138r;

    public ra(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f30135c = new Paint(1);
        this.h = new f6(this, 0L, 210L, bs.h);
        this.f30133a = g6Var;
        wa0 wa0Var = (wa0) this;
        this.f30134b = new qa[]{new qa(wa0Var, 0, R.raw.msg_stories_saved, 20, 40, LocaleController.getString(R.string.ProfileMyStoriesTab)), new qa(wa0Var, 1, R.raw.msg_stories_archive, 0, 0, LocaleController.getString(R.string.ProfileStoriesArchiveTab))};
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        a(0.0f, false);
    }

    public final void a(float f7, boolean z10) {
        float f10;
        boolean z11;
        qa[] qaVarArr = this.f30134b;
        float clamp = Utilities.clamp(f7, qaVarArr.length, 0.0f);
        this.d = clamp;
        this.e = Math.round(clamp);
        for (int i10 = 0; i10 < qaVarArr.length; i10++) {
            qa qaVar = qaVarArr[i10];
            float abs = Math.abs(this.e - i10);
            if (qaVarArr[i10].f29818m) {
                f10 = 0.25f;
            } else {
                f10 = 0.35f;
            }
            if (abs < f10) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i11 = qaVar.f29816k;
            int i12 = qaVar.f29815j;
            yj0 yj0Var = qaVar.f29810b;
            if (qaVar.f29818m != z11) {
                if (qaVar.f29820o.f30134b[qaVar.f29809a].f29815j != 0) {
                    if (z11) {
                        yj0Var.P(i12);
                        if (yj0Var.f32933a0 >= i11 - 2) {
                            yj0Var.N(0, false, false);
                        }
                        if (yj0Var.f32933a0 <= i12) {
                            yj0Var.start();
                        } else {
                            yj0Var.M(i12);
                        }
                    } else if (yj0Var.f32933a0 >= i12 - 1) {
                        yj0Var.P(i11 - 1);
                        yj0Var.start();
                    } else {
                        yj0Var.P(0);
                        yj0Var.M(0);
                    }
                } else if (z11) {
                    yj0Var.M(0);
                    if (z10) {
                        yj0Var.start();
                    }
                }
                qaVar.f29818m = z11;
            }
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f7;
        float f10;
        float f11;
        boolean z10;
        float f12;
        ra raVar = this;
        int i10 = org.telegram.ui.ActionBar.k6.f21183d6;
        org.telegram.ui.ActionBar.g6 g6Var = raVar.f30133a;
        canvas.drawColor(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
        canvas.drawRect(0.0f, 0.0f, raVar.getWidth(), AndroidUtilities.getShadowHeight(), org.telegram.ui.ActionBar.k6.f21304k0);
        int width = (raVar.getWidth() - raVar.getPaddingLeft()) - raVar.getPaddingRight();
        qa[] qaVarArr = raVar.f30134b;
        int length = width / qaVarArr.length;
        int min = Math.min(AndroidUtilities.dp(64.0f), length);
        float e = raVar.h.e(raVar.f30136f);
        int i11 = (e > 0.0f ? 1 : (e == 0.0f ? 0 : -1));
        float f13 = 16.0f;
        Paint paint = raVar.f30135c;
        if (i11 > 0) {
            f10 = 41.0f;
            f11 = 9.0f;
            paint.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, g6Var), (int) (((Math.abs((Math.floor(raVar.d) + 0.5d) - raVar.d) * 1.2000000476837158d) + 0.4000000059604645d) * 18.0d * e)));
            float f14 = length;
            float f15 = f14 / 2.0f;
            f7 = 2.0f;
            float lerp = AndroidUtilities.lerp((((float) Math.floor(raVar.d)) * f14) + f15, (f14 * ((float) Math.ceil(raVar.d))) + f15, raVar.d - ((int) f12)) + raVar.getPaddingLeft();
            RectF rectF = AndroidUtilities.rectTmp;
            float f16 = min / 2.0f;
            rectF.set(lerp - f16, AndroidUtilities.dp(9.0f), lerp + f16, AndroidUtilities.dp(41.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint);
        } else {
            f7 = 2.0f;
            f10 = 41.0f;
            f11 = 9.0f;
        }
        int i12 = 0;
        while (i12 < qaVarArr.length) {
            qa qaVar = qaVarArr[i12];
            int paddingLeft = (i12 * length) + raVar.getPaddingLeft();
            RectF rectF2 = qaVar.h;
            StaticLayout staticLayout = qaVar.e;
            org.telegram.ui.Cells.y yVar = qaVar.f29811c;
            float f17 = f13;
            yj0 yj0Var = qaVar.f29810b;
            int i13 = length;
            qa[] qaVarArr2 = qaVarArr;
            rectF2.set(paddingLeft, 0.0f, paddingLeft + length, raVar.getHeight());
            float min2 = 1.0f - Math.min(1.0f, Math.abs(raVar.d - i12));
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.D6, g6Var);
            int i14 = org.telegram.ui.ActionBar.k6.G6;
            int f18 = i0.a.f(min2, w02, org.telegram.ui.ActionBar.k6.w0(i14, g6Var));
            qaVar.d.setColor(f18);
            if (qaVar.f29819n != f18) {
                qaVar.f29819n = f18;
                yj0Var.setColorFilter(new PorterDuffColorFilter(f18, PorterDuff.Mode.SRC_IN));
            }
            Rect rect = AndroidUtilities.rectTmp2;
            float f19 = min / f7;
            int i15 = min;
            rect.set((int) (rectF2.centerX() - f19), AndroidUtilities.dp(f11), (int) (rectF2.centerX() + f19), AndroidUtilities.dp(f10));
            f6 f6Var = qaVar.f29814i;
            if (min2 > 0.6f) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e7 = f6Var.e(z10);
            if (e < 1.0f) {
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(i14, g6Var), (int) ((1.0f - e) * e7 * 18.0f)));
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(rect);
                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(f17), AndroidUtilities.dp(f17), paint);
            }
            int o12 = org.telegram.ui.ActionBar.k6.o1(0.1f, org.telegram.ui.ActionBar.k6.w0(i14, g6Var));
            if (qaVar.f29817l != o12) {
                qaVar.f29817l = o12;
                org.telegram.ui.ActionBar.k6.E1(yVar, o12, true);
            }
            yVar.setBounds(rect);
            yVar.draw(canvas);
            float dp = AndroidUtilities.dp(29.0f) / f7;
            rect.set((int) (rectF2.centerX() - dp), (int) (AndroidUtilities.dpf2(24.66f) - dp), (int) (rectF2.centerX() + dp), (int) (AndroidUtilities.dpf2(24.66f) + dp));
            yj0Var.setBounds(rect);
            yj0Var.draw(canvas);
            canvas.save();
            canvas.translate((rectF2.centerX() - (qaVar.f29812f / f7)) - qaVar.f29813g, AndroidUtilities.dp(50.0f) - (staticLayout.getHeight() / f7));
            staticLayout.draw(canvas);
            canvas.restore();
            i12++;
            raVar = this;
            f13 = f17;
            length = i13;
            qaVarArr = qaVarArr2;
            min = i15;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.getShadowHeight() + AndroidUtilities.dp(64.0f));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        Utilities.Callback callback;
        if (motionEvent.getAction() == 0) {
            this.f30138r = true;
            return true;
        }
        int action = motionEvent.getAction();
        qa[] qaVarArr = this.f30134b;
        if (action != 1 && motionEvent.getAction() != 2) {
            if (motionEvent.getAction() == 3) {
                for (qa qaVar : qaVarArr) {
                    qaVar.f29811c.setState(new int[0]);
                }
                this.f30138r = false;
                return true;
            }
        } else {
            float x10 = motionEvent.getX();
            int i10 = 0;
            while (true) {
                if (i10 < qaVarArr.length) {
                    RectF rectF = qaVarArr[i10].h;
                    if (rectF.left < x10 && rectF.right > x10) {
                        if (motionEvent.getAction() != 1) {
                            if (this.f30138r) {
                                qaVarArr[i10].f29811c.setState(new int[0]);
                            }
                            qaVarArr[i10].f29811c.setState(new int[]{16842919, 16842910});
                        }
                    } else {
                        i10++;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            }
            for (int i11 = 0; i11 < qaVarArr.length; i11++) {
                if (i11 != i10 || motionEvent.getAction() == 1) {
                    qaVarArr[i11].f29811c.setState(new int[0]);
                }
            }
            if (i10 >= 0 && this.e != i10 && (callback = this.f30137n) != null) {
                callback.run(Integer.valueOf(i10));
            }
            this.f30138r = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTabClick(Utilities.Callback<Integer> callback) {
        this.f30137n = callback;
    }

    public void setProgress(float f7) {
        a(f7, true);
    }

    public void setScrolling(boolean z10) {
        if (this.f30136f == z10) {
            return;
        }
        this.f30136f = z10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        int i10 = 0;
        while (true) {
            qa[] qaVarArr = this.f30134b;
            if (i10 < qaVarArr.length) {
                if (qaVarArr[i10].f29811c == drawable) {
                    return true;
                }
                i10++;
            } else {
                return super.verifyDrawable(drawable);
            }
        }
    }
}
