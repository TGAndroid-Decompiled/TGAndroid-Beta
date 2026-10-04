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
public abstract class sa extends View {
    public final org.telegram.ui.ActionBar.d6 f30669a;
    public final ra[] f30670b;
    public final Paint f30671c;
    public float d;
    public int f30672e;
    public boolean f30673f;
    public final e6 h;
    public Utilities.Callback f30674n;
    public boolean f30675r;

    public sa(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f30671c = new Paint(1);
        this.h = new e6(this, 0L, 210L, tr.h);
        this.f30669a = d6Var;
        oa0 oa0Var = (oa0) this;
        this.f30670b = new ra[]{new ra(oa0Var, 0, R.raw.msg_stories_saved, 20, 40, LocaleController.getString(R.string.ProfileMyStoriesTab)), new ra(oa0Var, 1, R.raw.msg_stories_archive, 0, 0, LocaleController.getString(R.string.ProfileStoriesArchiveTab))};
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        a(0.0f, false);
    }

    public final void a(float f7, boolean z10) {
        float f10;
        boolean z11;
        ra[] raVarArr = this.f30670b;
        float clamp = Utilities.clamp(f7, raVarArr.length, 0.0f);
        this.d = clamp;
        this.f30672e = Math.round(clamp);
        for (int i10 = 0; i10 < raVarArr.length; i10++) {
            ra raVar = raVarArr[i10];
            float abs = Math.abs(this.f30672e - i10);
            if (raVarArr[i10].f30327l) {
                f10 = 0.25f;
            } else {
                f10 = 0.35f;
            }
            if (abs < f10) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i11 = raVar.f30326k;
            int i12 = raVar.f30325j;
            kj0 kj0Var = raVar.f30319b;
            if (raVar.f30327l != z11) {
                if (raVar.f30329n.f30670b[raVar.f30318a].f30325j != 0) {
                    if (z11) {
                        kj0Var.P(i12);
                        if (kj0Var.f28119a0 >= i11 - 2) {
                            kj0Var.N(0, false, false);
                        }
                        if (kj0Var.f28119a0 <= i12) {
                            kj0Var.start();
                        } else {
                            kj0Var.M(i12);
                        }
                    } else if (kj0Var.f28119a0 >= i12 - 1) {
                        kj0Var.P(i11 - 1);
                        kj0Var.start();
                    } else {
                        kj0Var.P(0);
                        kj0Var.M(0);
                    }
                } else if (z11) {
                    kj0Var.M(0);
                    if (z10) {
                        kj0Var.start();
                    }
                }
                raVar.f30327l = z11;
            }
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.d6 d6Var;
        float f7;
        float f10;
        float f11;
        float f12;
        boolean z10;
        float f13;
        sa saVar = this;
        int i10 = org.telegram.ui.ActionBar.i6.f20818d6;
        org.telegram.ui.ActionBar.d6 d6Var2 = saVar.f30669a;
        canvas.drawColor(org.telegram.ui.ActionBar.i6.v0(i10, d6Var2));
        canvas.drawRect(0.0f, 0.0f, saVar.getWidth(), AndroidUtilities.getShadowHeight(), org.telegram.ui.ActionBar.i6.f20941k0);
        int width = (saVar.getWidth() - saVar.getPaddingLeft()) - saVar.getPaddingRight();
        ra[] raVarArr = saVar.f30670b;
        int length = width / raVarArr.length;
        int min = Math.min(AndroidUtilities.dp(64.0f), length);
        float e7 = saVar.h.e(saVar.f30673f);
        Paint paint = saVar.f30671c;
        float f14 = 0.0f;
        if (e7 > 0.0f) {
            f7 = 9.0f;
            f10 = 16.0f;
            paint.setColor(i0.a.k(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.G6, d6Var2), (int) (((Math.abs((Math.floor(saVar.d) + 0.5d) - saVar.d) * 1.2000000476837158d) + 0.4000000059604645d) * 18.0d * e7)));
            float f15 = length;
            float f16 = f15 / 2.0f;
            d6Var = d6Var2;
            f11 = 41.0f;
            float lerp = AndroidUtilities.lerp((((float) Math.floor(saVar.d)) * f15) + f16, (f15 * ((float) Math.ceil(saVar.d))) + f16, saVar.d - ((int) f13)) + saVar.getPaddingLeft();
            RectF rectF = AndroidUtilities.rectTmp;
            float f17 = min / 2.0f;
            rectF.set(lerp - f17, AndroidUtilities.dp(9.0f), lerp + f17, AndroidUtilities.dp(41.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint);
        } else {
            d6Var = d6Var2;
            f7 = 9.0f;
            f10 = 16.0f;
            f11 = 41.0f;
        }
        int i11 = 0;
        while (i11 < raVarArr.length) {
            ra raVar = raVarArr[i11];
            int paddingLeft = (i11 * length) + saVar.getPaddingLeft();
            RectF rectF2 = raVar.h;
            StaticLayout staticLayout = raVar.f30321e;
            org.telegram.ui.Cells.z zVar = raVar.f30320c;
            kj0 kj0Var = raVar.f30319b;
            int i12 = length;
            rectF2.set(paddingLeft, f14, paddingLeft + length, saVar.getHeight());
            float min2 = 1.0f - Math.min(1.0f, Math.abs(saVar.d - i11));
            org.telegram.ui.ActionBar.d6 d6Var3 = d6Var;
            int v02 = org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.D6, d6Var3);
            int i13 = org.telegram.ui.ActionBar.i6.G6;
            int d = i0.a.d(min2, v02, org.telegram.ui.ActionBar.i6.v0(i13, d6Var3));
            raVar.d.setColor(d);
            if (raVar.f30328m != d) {
                raVar.f30328m = d;
                f12 = min2;
                kj0Var.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            } else {
                f12 = min2;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            float f18 = min / 2.0f;
            ra[] raVarArr2 = raVarArr;
            int i14 = min;
            rect.set((int) (rectF2.centerX() - f18), AndroidUtilities.dp(f7), (int) (rectF2.centerX() + f18), AndroidUtilities.dp(f11));
            e6 e6Var = raVar.f30324i;
            if (f12 > 0.6f) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e10 = e6Var.e(z10);
            if (e7 < 1.0f) {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.i6.v0(i13, d6Var3), (int) ((1.0f - e7) * e10 * 18.0f)));
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(rect);
                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), paint);
            }
            zVar.setBounds(rect);
            zVar.draw(canvas);
            float dp = AndroidUtilities.dp(29.0f) / 2.0f;
            rect.set((int) (rectF2.centerX() - dp), (int) (AndroidUtilities.dpf2(24.66f) - dp), (int) (rectF2.centerX() + dp), (int) (AndroidUtilities.dpf2(24.66f) + dp));
            kj0Var.setBounds(rect);
            kj0Var.draw(canvas);
            canvas.save();
            canvas.translate((rectF2.centerX() - (raVar.f30322f / 2.0f)) - raVar.f30323g, AndroidUtilities.dp(50.0f) - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            i11++;
            saVar = this;
            d6Var = d6Var3;
            length = i12;
            raVarArr = raVarArr2;
            min = i14;
            f14 = 0.0f;
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
            this.f30675r = true;
            return true;
        }
        int action = motionEvent.getAction();
        ra[] raVarArr = this.f30670b;
        if (action != 1 && motionEvent.getAction() != 2) {
            if (motionEvent.getAction() == 3) {
                for (ra raVar : raVarArr) {
                    raVar.f30320c.setState(new int[0]);
                }
                this.f30675r = false;
                return true;
            }
        } else {
            float x10 = motionEvent.getX();
            int i10 = 0;
            while (true) {
                if (i10 < raVarArr.length) {
                    RectF rectF = raVarArr[i10].h;
                    if (rectF.left < x10 && rectF.right > x10) {
                        if (motionEvent.getAction() != 1) {
                            if (this.f30675r) {
                                raVarArr[i10].f30320c.setState(new int[0]);
                            }
                            raVarArr[i10].f30320c.setState(new int[]{16842919, 16842910});
                        }
                    } else {
                        i10++;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            }
            for (int i11 = 0; i11 < raVarArr.length; i11++) {
                if (i11 != i10 || motionEvent.getAction() == 1) {
                    raVarArr[i11].f30320c.setState(new int[0]);
                }
            }
            if (i10 >= 0 && this.f30672e != i10 && (callback = this.f30674n) != null) {
                callback.run(Integer.valueOf(i10));
            }
            this.f30675r = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTabClick(Utilities.Callback<Integer> callback) {
        this.f30674n = callback;
    }

    public void setProgress(float f7) {
        a(f7, true);
    }

    public void setScrolling(boolean z10) {
        if (this.f30673f == z10) {
            return;
        }
        this.f30673f = z10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        int i10 = 0;
        while (true) {
            ra[] raVarArr = this.f30670b;
            if (i10 < raVarArr.length) {
                if (raVarArr[i10].f30320c == drawable) {
                    return true;
                }
                i10++;
            } else {
                return super.verifyDrawable(drawable);
            }
        }
    }
}
