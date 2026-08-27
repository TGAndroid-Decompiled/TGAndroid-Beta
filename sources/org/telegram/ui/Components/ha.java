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

public abstract class ha extends View {

    public final org.telegram.ui.ActionBar.c6 f28949a;

    public final ga[] f28950b;

    public final Paint f28951c;
    public float d;

    public int f28952e;

    public boolean f28953f;
    public final y5 h;

    public Utilities.Callback f28954n;

    public boolean f28955r;

    public ha(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f28951c = new Paint(1);
        this.h = new y5(this, 0L, 210L, er.h);
        this.f28949a = c6Var;
        n90 n90Var = (n90) this;
        this.f28950b = new ga[]{new ga(n90Var, 0, R.raw.msg_stories_saved, 20, 40, LocaleController.getString(R.string.ProfileMyStoriesTab)), new ga(n90Var, 1, R.raw.msg_stories_archive, 0, 0, LocaleController.getString(R.string.ProfileStoriesArchiveTab))};
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        a(0.0f, false);
    }

    public final void a(float f10, boolean z10) {
        ga[] gaVarArr = this.f28950b;
        float fClamp = Utilities.clamp(f10, gaVarArr.length, 0.0f);
        this.d = fClamp;
        this.f28952e = Math.round(fClamp);
        for (int i10 = 0; i10 < gaVarArr.length; i10++) {
            ga gaVar = gaVarArr[i10];
            boolean z11 = ((float) Math.abs(this.f28952e - i10)) < (gaVarArr[i10].f28566l ? 0.25f : 0.35f);
            int i11 = gaVar.f28565k;
            int i12 = gaVar.f28564j;
            oi0 oi0Var = gaVar.f28558b;
            if (gaVar.f28566l != z11) {
                if (gaVar.f28568n.f28950b[gaVar.f28557a].f28564j != 0) {
                    if (z11) {
                        oi0Var.N(i12);
                        if (oi0Var.X >= i11 - 2) {
                            oi0Var.L(0, false, false);
                        }
                        if (oi0Var.X <= i12) {
                            oi0Var.start();
                        } else {
                            oi0Var.K(i12);
                        }
                    } else if (oi0Var.X >= i12 - 1) {
                        oi0Var.N(i11 - 1);
                        oi0Var.start();
                    } else {
                        oi0Var.N(0);
                        oi0Var.K(0);
                    }
                } else if (z11) {
                    oi0Var.K(0);
                    if (z10) {
                        oi0Var.start();
                    }
                }
                gaVar.f28566l = z11;
            }
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        float f12;
        ha haVar = this;
        int i10 = org.telegram.ui.ActionBar.g6.f23053d6;
        org.telegram.ui.ActionBar.c6 c6Var = haVar.f28949a;
        canvas.drawColor(org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        canvas.drawRect(0.0f, 0.0f, haVar.getWidth(), AndroidUtilities.getShadowHeight(), org.telegram.ui.ActionBar.g6.f23175k0);
        int width = (haVar.getWidth() - haVar.getPaddingLeft()) - haVar.getPaddingRight();
        ga[] gaVarArr = haVar.f28950b;
        int length = width / gaVarArr.length;
        int iMin = Math.min(AndroidUtilities.dp(64.0f), length);
        float fE = haVar.h.e(haVar.f28953f);
        Paint paint = haVar.f28951c;
        float f13 = 0.0f;
        if (fE > 0.0f) {
            f10 = 9.0f;
            f11 = 16.0f;
            paint.setColor(i0.b.k(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var), (int) (((Math.abs((Math.floor(haVar.d) + 0.5d) - ((double) haVar.d)) * 1.2000000476837158d) + 0.4000000059604645d) * 18.0d * ((double) fE))));
            float paddingLeft = haVar.getPaddingLeft();
            float f14 = length;
            float f15 = f14 / 2.0f;
            float fFloor = (((float) Math.floor(haVar.d)) * f14) + f15;
            f12 = 41.0f;
            float fCeil = (f14 * ((float) Math.ceil(haVar.d))) + f15;
            float f16 = haVar.d;
            float fLerp = AndroidUtilities.lerp(fFloor, fCeil, f16 - ((int) f16)) + paddingLeft;
            RectF rectF = AndroidUtilities.rectTmp;
            float f17 = iMin / 2.0f;
            rectF.set(fLerp - f17, AndroidUtilities.dp(9.0f), fLerp + f17, AndroidUtilities.dp(41.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint);
        } else {
            f10 = 9.0f;
            f11 = 16.0f;
            f12 = 41.0f;
        }
        int i11 = 0;
        while (i11 < gaVarArr.length) {
            ga gaVar = gaVarArr[i11];
            int paddingLeft2 = (i11 * length) + haVar.getPaddingLeft();
            RectF rectF2 = gaVar.h;
            StaticLayout staticLayout = gaVar.f28560e;
            org.telegram.ui.Cells.z zVar = gaVar.f28559c;
            oi0 oi0Var = gaVar.f28558b;
            int i12 = length;
            rectF2.set(paddingLeft2, f13, paddingLeft2 + length, haVar.getHeight());
            float fMin = 1.0f - Math.min(1.0f, Math.abs(haVar.d - i11));
            org.telegram.ui.ActionBar.c6 c6Var2 = c6Var;
            int iV0 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.D6, c6Var2);
            int i13 = org.telegram.ui.ActionBar.g6.G6;
            int iD = i0.b.d(fMin, iV0, org.telegram.ui.ActionBar.g6.v0(i13, c6Var2));
            gaVar.d.setColor(iD);
            if (gaVar.f28567m != iD) {
                gaVar.f28567m = iD;
                oi0Var.setColorFilter(new PorterDuffColorFilter(iD, PorterDuff.Mode.SRC_IN));
            }
            Rect rect = AndroidUtilities.rectTmp2;
            float f18 = iMin / 2.0f;
            ga[] gaVarArr2 = gaVarArr;
            int i14 = iMin;
            rect.set((int) (rectF2.centerX() - f18), AndroidUtilities.dp(f10), (int) (rectF2.centerX() + f18), AndroidUtilities.dp(f12));
            float fE2 = gaVar.f28563i.e(fMin > 0.6f);
            if (fE < 1.0f) {
                paint.setColor(i0.b.k(org.telegram.ui.ActionBar.g6.v0(i13, c6Var2), (int) ((1.0f - fE) * fE2 * 18.0f)));
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(rect);
                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), paint);
            }
            zVar.setBounds(rect);
            zVar.draw(canvas);
            float fDp = AndroidUtilities.dp(29.0f) / 2.0f;
            rect.set((int) (rectF2.centerX() - fDp), (int) (AndroidUtilities.dpf2(24.66f) - fDp), (int) (rectF2.centerX() + fDp), (int) (AndroidUtilities.dpf2(24.66f) + fDp));
            oi0Var.setBounds(rect);
            oi0Var.draw(canvas);
            canvas.save();
            canvas.translate((rectF2.centerX() - (gaVar.f28561f / 2.0f)) - gaVar.f28562g, AndroidUtilities.dp(50.0f) - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            i11++;
            haVar = this;
            c6Var = c6Var2;
            length = i12;
            gaVarArr = gaVarArr2;
            iMin = i14;
            f13 = 0.0f;
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
            this.f28955r = true;
            return true;
        }
        int action = motionEvent.getAction();
        ga[] gaVarArr = this.f28950b;
        if (action == 1 || motionEvent.getAction() == 2) {
            float x8 = motionEvent.getX();
            int i10 = 0;
            while (true) {
                if (i10 >= gaVarArr.length) {
                    i10 = -1;
                    break;
                }
                RectF rectF = gaVarArr[i10].h;
                if (rectF.left < x8 && rectF.right > x8) {
                    if (motionEvent.getAction() == 1) {
                        break;
                    }
                    if (this.f28955r) {
                        gaVarArr[i10].f28559c.setState(new int[0]);
                    }
                    gaVarArr[i10].f28559c.setState(new int[]{16842919, 16842910});
                    break;
                }
                i10++;
            }
            for (int i11 = 0; i11 < gaVarArr.length; i11++) {
                if (i11 != i10 || motionEvent.getAction() == 1) {
                    gaVarArr[i11].f28559c.setState(new int[0]);
                }
            }
            if (i10 >= 0 && this.f28952e != i10 && (callback = this.f28954n) != null) {
                callback.run(Integer.valueOf(i10));
            }
            this.f28955r = false;
        } else if (motionEvent.getAction() == 3) {
            for (ga gaVar : gaVarArr) {
                gaVar.f28559c.setState(new int[0]);
            }
            this.f28955r = false;
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTabClick(Utilities.Callback<Integer> callback) {
        this.f28954n = callback;
    }

    public void setProgress(float f10) {
        a(f10, true);
    }

    public void setScrolling(boolean z10) {
        if (this.f28953f == z10) {
            return;
        }
        this.f28953f = z10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        int i10 = 0;
        while (true) {
            ga[] gaVarArr = this.f28950b;
            if (i10 >= gaVarArr.length) {
                return super.verifyDrawable(drawable);
            }
            if (gaVarArr[i10].f28559c == drawable) {
                return true;
            }
            i10++;
        }
    }
}
