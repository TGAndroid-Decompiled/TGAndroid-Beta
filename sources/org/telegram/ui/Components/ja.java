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
public abstract class ja extends View {
    public final org.telegram.ui.ActionBar.g6 f28071a;
    public final ia[] f28072b;
    public final Paint f28073c;
    public float d;
    public int f28074e;
    public boolean f28075f;
    public final z5 h;
    public Utilities.Callback f28076n;
    public boolean f28077r;

    public ja(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f28073c = new Paint(1);
        this.h = new z5(this, 0L, 210L, pr.h);
        this.f28071a = g6Var;
        ea0 ea0Var = (ea0) this;
        this.f28072b = new ia[]{new ia(ea0Var, 0, R.raw.msg_stories_saved, 20, 40, LocaleController.getString(R.string.ProfileMyStoriesTab)), new ia(ea0Var, 1, R.raw.msg_stories_archive, 0, 0, LocaleController.getString(R.string.ProfileStoriesArchiveTab))};
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        a(0.0f, false);
    }

    public final void a(float f10, boolean z4) {
        float f11;
        boolean z10;
        ia[] iaVarArr = this.f28072b;
        float clamp = Utilities.clamp(f10, iaVarArr.length, 0.0f);
        this.d = clamp;
        this.f28074e = Math.round(clamp);
        for (int i10 = 0; i10 < iaVarArr.length; i10++) {
            ia iaVar = iaVarArr[i10];
            float abs = Math.abs(this.f28074e - i10);
            if (iaVarArr[i10].f27763l) {
                f11 = 0.25f;
            } else {
                f11 = 0.35f;
            }
            if (abs < f11) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = iaVar.f27762k;
            int i12 = iaVar.f27761j;
            hj0 hj0Var = iaVar.f27755b;
            if (iaVar.f27763l != z10) {
                if (iaVar.f27765n.f28072b[iaVar.f27754a].f27761j != 0) {
                    if (z10) {
                        hj0Var.N(i12);
                        if (hj0Var.Y >= i11 - 2) {
                            hj0Var.L(0, false, false);
                        }
                        if (hj0Var.Y <= i12) {
                            hj0Var.start();
                        } else {
                            hj0Var.K(i12);
                        }
                    } else if (hj0Var.Y >= i12 - 1) {
                        hj0Var.N(i11 - 1);
                        hj0Var.start();
                    } else {
                        hj0Var.N(0);
                        hj0Var.K(0);
                    }
                } else if (z10) {
                    hj0Var.K(0);
                    if (z4) {
                        hj0Var.start();
                    }
                }
                iaVar.f27763l = z10;
            }
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.g6 g6Var;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z4;
        float f14;
        ja jaVar = this;
        int i10 = org.telegram.ui.ActionBar.k6.f21661d6;
        org.telegram.ui.ActionBar.g6 g6Var2 = jaVar.f28071a;
        canvas.drawColor(org.telegram.ui.ActionBar.k6.v0(i10, g6Var2));
        canvas.drawRect(0.0f, 0.0f, jaVar.getWidth(), AndroidUtilities.getShadowHeight(), org.telegram.ui.ActionBar.k6.f21781k0);
        int width = (jaVar.getWidth() - jaVar.getPaddingLeft()) - jaVar.getPaddingRight();
        ia[] iaVarArr = jaVar.f28072b;
        int length = width / iaVarArr.length;
        int min = Math.min(AndroidUtilities.dp(64.0f), length);
        float e6 = jaVar.h.e(jaVar.f28075f);
        Paint paint = jaVar.f28073c;
        float f15 = 0.0f;
        if (e6 > 0.0f) {
            f10 = 9.0f;
            f11 = 16.0f;
            paint.setColor(i0.a.k(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.G6, g6Var2), (int) (((Math.abs((Math.floor(jaVar.d) + 0.5d) - jaVar.d) * 1.2000000476837158d) + 0.4000000059604645d) * 18.0d * e6)));
            float f16 = length;
            float f17 = f16 / 2.0f;
            g6Var = g6Var2;
            f12 = 41.0f;
            float lerp = AndroidUtilities.lerp((((float) Math.floor(jaVar.d)) * f16) + f17, (f16 * ((float) Math.ceil(jaVar.d))) + f17, jaVar.d - ((int) f14)) + jaVar.getPaddingLeft();
            RectF rectF = AndroidUtilities.rectTmp;
            float f18 = min / 2.0f;
            rectF.set(lerp - f18, AndroidUtilities.dp(9.0f), lerp + f18, AndroidUtilities.dp(41.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint);
        } else {
            g6Var = g6Var2;
            f10 = 9.0f;
            f11 = 16.0f;
            f12 = 41.0f;
        }
        int i11 = 0;
        while (i11 < iaVarArr.length) {
            ia iaVar = iaVarArr[i11];
            int paddingLeft = (i11 * length) + jaVar.getPaddingLeft();
            RectF rectF2 = iaVar.h;
            StaticLayout staticLayout = iaVar.f27757e;
            org.telegram.ui.Cells.z zVar = iaVar.f27756c;
            hj0 hj0Var = iaVar.f27755b;
            int i12 = length;
            rectF2.set(paddingLeft, f15, paddingLeft + length, jaVar.getHeight());
            float min2 = 1.0f - Math.min(1.0f, Math.abs(jaVar.d - i11));
            org.telegram.ui.ActionBar.g6 g6Var3 = g6Var;
            int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.D6, g6Var3);
            int i13 = org.telegram.ui.ActionBar.k6.G6;
            int d = i0.a.d(min2, v02, org.telegram.ui.ActionBar.k6.v0(i13, g6Var3));
            iaVar.d.setColor(d);
            if (iaVar.f27764m != d) {
                iaVar.f27764m = d;
                f13 = min2;
                hj0Var.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            } else {
                f13 = min2;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            float f19 = min / 2.0f;
            ia[] iaVarArr2 = iaVarArr;
            int i14 = min;
            rect.set((int) (rectF2.centerX() - f19), AndroidUtilities.dp(f10), (int) (rectF2.centerX() + f19), AndroidUtilities.dp(f12));
            z5 z5Var = iaVar.f27760i;
            if (f13 > 0.6f) {
                z4 = true;
            } else {
                z4 = false;
            }
            float e10 = z5Var.e(z4);
            if (e6 < 1.0f) {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.k6.v0(i13, g6Var3), (int) ((1.0f - e6) * e10 * 18.0f)));
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(rect);
                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), paint);
            }
            zVar.setBounds(rect);
            zVar.draw(canvas);
            float dp = AndroidUtilities.dp(29.0f) / 2.0f;
            rect.set((int) (rectF2.centerX() - dp), (int) (AndroidUtilities.dpf2(24.66f) - dp), (int) (rectF2.centerX() + dp), (int) (AndroidUtilities.dpf2(24.66f) + dp));
            hj0Var.setBounds(rect);
            hj0Var.draw(canvas);
            canvas.save();
            canvas.translate((rectF2.centerX() - (iaVar.f27758f / 2.0f)) - iaVar.f27759g, AndroidUtilities.dp(50.0f) - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            i11++;
            jaVar = this;
            g6Var = g6Var3;
            length = i12;
            iaVarArr = iaVarArr2;
            min = i14;
            f15 = 0.0f;
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
            this.f28077r = true;
            return true;
        }
        int action = motionEvent.getAction();
        ia[] iaVarArr = this.f28072b;
        if (action != 1 && motionEvent.getAction() != 2) {
            if (motionEvent.getAction() == 3) {
                for (ia iaVar : iaVarArr) {
                    iaVar.f27756c.setState(new int[0]);
                }
                this.f28077r = false;
                return true;
            }
        } else {
            float x10 = motionEvent.getX();
            int i10 = 0;
            while (true) {
                if (i10 < iaVarArr.length) {
                    RectF rectF = iaVarArr[i10].h;
                    if (rectF.left < x10 && rectF.right > x10) {
                        if (motionEvent.getAction() != 1) {
                            if (this.f28077r) {
                                iaVarArr[i10].f27756c.setState(new int[0]);
                            }
                            iaVarArr[i10].f27756c.setState(new int[]{16842919, 16842910});
                        }
                    } else {
                        i10++;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            }
            for (int i11 = 0; i11 < iaVarArr.length; i11++) {
                if (i11 != i10 || motionEvent.getAction() == 1) {
                    iaVarArr[i11].f27756c.setState(new int[0]);
                }
            }
            if (i10 >= 0 && this.f28074e != i10 && (callback = this.f28076n) != null) {
                callback.run(Integer.valueOf(i10));
            }
            this.f28077r = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTabClick(Utilities.Callback<Integer> callback) {
        this.f28076n = callback;
    }

    public void setProgress(float f10) {
        a(f10, true);
    }

    public void setScrolling(boolean z4) {
        if (this.f28075f == z4) {
            return;
        }
        this.f28075f = z4;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        int i10 = 0;
        while (true) {
            ia[] iaVarArr = this.f28072b;
            if (i10 < iaVarArr.length) {
                if (iaVarArr[i10].f27756c == drawable) {
                    return true;
                }
                i10++;
            } else {
                return super.verifyDrawable(drawable);
            }
        }
    }
}
