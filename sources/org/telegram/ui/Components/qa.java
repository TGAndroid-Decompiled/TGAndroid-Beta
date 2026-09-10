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
public abstract class qa extends View {
    public final org.telegram.ui.ActionBar.f6 f26377a;
    public final pa[] f26378b;
    public final Paint f26379c;
    public float d;
    public int e;
    public boolean f26380f;
    public final d6 h;
    public Utilities.Callback f26381n;
    public boolean f26382r;

    public qa(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f26379c = new Paint(1);
        this.h = new d6(this, 0L, 210L, wr.h);
        this.f26377a = f6Var;
        ka0 ka0Var = (ka0) this;
        this.f26378b = new pa[]{new pa(ka0Var, 0, R.raw.msg_stories_saved, 20, 40, LocaleController.getString(R.string.ProfileMyStoriesTab)), new pa(ka0Var, 1, R.raw.msg_stories_archive, 0, 0, LocaleController.getString(R.string.ProfileStoriesArchiveTab))};
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        a(0.0f, false);
    }

    public final void a(float f7, boolean z10) {
        float f10;
        boolean z11;
        pa[] paVarArr = this.f26378b;
        float clamp = Utilities.clamp(f7, paVarArr.length, 0.0f);
        this.d = clamp;
        this.e = Math.round(clamp);
        for (int i10 = 0; i10 < paVarArr.length; i10++) {
            pa paVar = paVarArr[i10];
            float abs = Math.abs(this.e - i10);
            if (paVarArr[i10].f26070l) {
                f10 = 0.25f;
            } else {
                f10 = 0.35f;
            }
            if (abs < f10) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i11 = paVar.f26069k;
            int i12 = paVar.f26068j;
            hj0 hj0Var = paVar.f26063b;
            if (paVar.f26070l != z11) {
                if (paVar.f26072n.f26378b[paVar.f26062a].f26068j != 0) {
                    if (z11) {
                        hj0Var.P(i12);
                        if (hj0Var.f23648b0 >= i11 - 2) {
                            hj0Var.N(0, false, false);
                        }
                        if (hj0Var.f23648b0 <= i12) {
                            hj0Var.start();
                        } else {
                            hj0Var.M(i12);
                        }
                    } else if (hj0Var.f23648b0 >= i12 - 1) {
                        hj0Var.P(i11 - 1);
                        hj0Var.start();
                    } else {
                        hj0Var.P(0);
                        hj0Var.M(0);
                    }
                } else if (z11) {
                    hj0Var.M(0);
                    if (z10) {
                        hj0Var.start();
                    }
                }
                paVar.f26070l = z11;
            }
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f6 f6Var;
        float f7;
        float f10;
        float f11;
        float f12;
        boolean z10;
        float f13;
        qa qaVar = this;
        int i10 = org.telegram.ui.ActionBar.j6.f17928d6;
        org.telegram.ui.ActionBar.f6 f6Var2 = qaVar.f26377a;
        canvas.drawColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var2));
        canvas.drawRect(0.0f, 0.0f, qaVar.getWidth(), AndroidUtilities.getShadowHeight(), org.telegram.ui.ActionBar.j6.f18049k0);
        int width = (qaVar.getWidth() - qaVar.getPaddingLeft()) - qaVar.getPaddingRight();
        pa[] paVarArr = qaVar.f26378b;
        int length = width / paVarArr.length;
        int min = Math.min(AndroidUtilities.dp(64.0f), length);
        float e = qaVar.h.e(qaVar.f26380f);
        Paint paint = qaVar.f26379c;
        float f14 = 0.0f;
        if (e > 0.0f) {
            f7 = 9.0f;
            f10 = 16.0f;
            paint.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var2), (int) (((Math.abs((Math.floor(qaVar.d) + 0.5d) - qaVar.d) * 1.2000000476837158d) + 0.4000000059604645d) * 18.0d * e)));
            float f15 = length;
            float f16 = f15 / 2.0f;
            f6Var = f6Var2;
            f11 = 41.0f;
            float lerp = AndroidUtilities.lerp((((float) Math.floor(qaVar.d)) * f15) + f16, (f15 * ((float) Math.ceil(qaVar.d))) + f16, qaVar.d - ((int) f13)) + qaVar.getPaddingLeft();
            RectF rectF = AndroidUtilities.rectTmp;
            float f17 = min / 2.0f;
            rectF.set(lerp - f17, AndroidUtilities.dp(9.0f), lerp + f17, AndroidUtilities.dp(41.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint);
        } else {
            f6Var = f6Var2;
            f7 = 9.0f;
            f10 = 16.0f;
            f11 = 41.0f;
        }
        int i11 = 0;
        while (i11 < paVarArr.length) {
            pa paVar = paVarArr[i11];
            int paddingLeft = (i11 * length) + qaVar.getPaddingLeft();
            RectF rectF2 = paVar.h;
            StaticLayout staticLayout = paVar.e;
            org.telegram.ui.Cells.z zVar = paVar.f26064c;
            hj0 hj0Var = paVar.f26063b;
            int i12 = length;
            rectF2.set(paddingLeft, f14, paddingLeft + length, qaVar.getHeight());
            float min2 = 1.0f - Math.min(1.0f, Math.abs(qaVar.d - i11));
            org.telegram.ui.ActionBar.f6 f6Var3 = f6Var;
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.D6, f6Var3);
            int i13 = org.telegram.ui.ActionBar.j6.G6;
            int d = i0.a.d(min2, v02, org.telegram.ui.ActionBar.j6.v0(i13, f6Var3));
            paVar.d.setColor(d);
            if (paVar.f26071m != d) {
                paVar.f26071m = d;
                f12 = min2;
                hj0Var.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            } else {
                f12 = min2;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            float f18 = min / 2.0f;
            pa[] paVarArr2 = paVarArr;
            int i14 = min;
            rect.set((int) (rectF2.centerX() - f18), AndroidUtilities.dp(f7), (int) (rectF2.centerX() + f18), AndroidUtilities.dp(f11));
            d6 d6Var = paVar.f26067i;
            if (f12 > 0.6f) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e7 = d6Var.e(z10);
            if (e < 1.0f) {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.v0(i13, f6Var3), (int) ((1.0f - e) * e7 * 18.0f)));
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(rect);
                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), paint);
            }
            zVar.setBounds(rect);
            zVar.draw(canvas);
            float dp = AndroidUtilities.dp(29.0f) / 2.0f;
            rect.set((int) (rectF2.centerX() - dp), (int) (AndroidUtilities.dpf2(24.66f) - dp), (int) (rectF2.centerX() + dp), (int) (AndroidUtilities.dpf2(24.66f) + dp));
            hj0Var.setBounds(rect);
            hj0Var.draw(canvas);
            canvas.save();
            canvas.translate((rectF2.centerX() - (paVar.f26065f / 2.0f)) - paVar.f26066g, AndroidUtilities.dp(50.0f) - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            i11++;
            qaVar = this;
            f6Var = f6Var3;
            length = i12;
            paVarArr = paVarArr2;
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
            this.f26382r = true;
            return true;
        }
        int action = motionEvent.getAction();
        pa[] paVarArr = this.f26378b;
        if (action != 1 && motionEvent.getAction() != 2) {
            if (motionEvent.getAction() == 3) {
                for (pa paVar : paVarArr) {
                    paVar.f26064c.setState(new int[0]);
                }
                this.f26382r = false;
                return true;
            }
        } else {
            float x10 = motionEvent.getX();
            int i10 = 0;
            while (true) {
                if (i10 < paVarArr.length) {
                    RectF rectF = paVarArr[i10].h;
                    if (rectF.left < x10 && rectF.right > x10) {
                        if (motionEvent.getAction() != 1) {
                            if (this.f26382r) {
                                paVarArr[i10].f26064c.setState(new int[0]);
                            }
                            paVarArr[i10].f26064c.setState(new int[]{16842919, 16842910});
                        }
                    } else {
                        i10++;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            }
            for (int i11 = 0; i11 < paVarArr.length; i11++) {
                if (i11 != i10 || motionEvent.getAction() == 1) {
                    paVarArr[i11].f26064c.setState(new int[0]);
                }
            }
            if (i10 >= 0 && this.e != i10 && (callback = this.f26381n) != null) {
                callback.run(Integer.valueOf(i10));
            }
            this.f26382r = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTabClick(Utilities.Callback<Integer> callback) {
        this.f26381n = callback;
    }

    public void setProgress(float f7) {
        a(f7, true);
    }

    public void setScrolling(boolean z10) {
        if (this.f26380f == z10) {
            return;
        }
        this.f26380f = z10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        int i10 = 0;
        while (true) {
            pa[] paVarArr = this.f26378b;
            if (i10 < paVarArr.length) {
                if (paVarArr[i10].f26064c == drawable) {
                    return true;
                }
                i10++;
            } else {
                return super.verifyDrawable(drawable);
            }
        }
    }
}
