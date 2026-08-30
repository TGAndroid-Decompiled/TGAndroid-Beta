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
    public final org.telegram.ui.ActionBar.f6 f25942a;
    public final ia[] f25943b;
    public final Paint f25944c;
    public float d;
    public int e;
    public boolean f25945f;
    public final z5 h;
    public Utilities.Callback f25946n;
    public boolean f25947r;

    public ja(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f25944c = new Paint(1);
        this.h = new z5(this, 0L, 210L, nr.h);
        this.f25942a = f6Var;
        ca0 ca0Var = (ca0) this;
        this.f25943b = new ia[]{new ia(ca0Var, 0, R.raw.msg_stories_saved, 20, 40, LocaleController.getString(R.string.ProfileMyStoriesTab)), new ia(ca0Var, 1, R.raw.msg_stories_archive, 0, 0, LocaleController.getString(R.string.ProfileStoriesArchiveTab))};
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        a(0.0f, false);
    }

    public final void a(float f10, boolean z4) {
        float f11;
        boolean z10;
        ia[] iaVarArr = this.f25943b;
        float clamp = Utilities.clamp(f10, iaVarArr.length, 0.0f);
        this.d = clamp;
        this.e = Math.round(clamp);
        for (int i10 = 0; i10 < iaVarArr.length; i10++) {
            ia iaVar = iaVarArr[i10];
            float abs = Math.abs(this.e - i10);
            if (iaVarArr[i10].f25662l) {
                f11 = 0.25f;
            } else {
                f11 = 0.35f;
            }
            if (abs < f11) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i11 = iaVar.f25661k;
            int i12 = iaVar.f25660j;
            gj0 gj0Var = iaVar.f25655b;
            if (iaVar.f25662l != z10) {
                if (iaVar.f25664n.f25943b[iaVar.f25654a].f25660j != 0) {
                    if (z10) {
                        gj0Var.N(i12);
                        if (gj0Var.Y >= i11 - 2) {
                            gj0Var.L(0, false, false);
                        }
                        if (gj0Var.Y <= i12) {
                            gj0Var.start();
                        } else {
                            gj0Var.K(i12);
                        }
                    } else if (gj0Var.Y >= i12 - 1) {
                        gj0Var.N(i11 - 1);
                        gj0Var.start();
                    } else {
                        gj0Var.N(0);
                        gj0Var.K(0);
                    }
                } else if (z10) {
                    gj0Var.K(0);
                    if (z4) {
                        gj0Var.start();
                    }
                }
                iaVar.f25662l = z10;
            }
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.f6 f6Var;
        float f10;
        float f11;
        float f12;
        float f13;
        boolean z4;
        float f14;
        ja jaVar = this;
        int i10 = org.telegram.ui.ActionBar.j6.f19906d6;
        org.telegram.ui.ActionBar.f6 f6Var2 = jaVar.f25942a;
        canvas.drawColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var2));
        canvas.drawRect(0.0f, 0.0f, jaVar.getWidth(), AndroidUtilities.getShadowHeight(), org.telegram.ui.ActionBar.j6.f20025k0);
        int width = (jaVar.getWidth() - jaVar.getPaddingLeft()) - jaVar.getPaddingRight();
        ia[] iaVarArr = jaVar.f25943b;
        int length = width / iaVarArr.length;
        int min = Math.min(AndroidUtilities.dp(64.0f), length);
        float e = jaVar.h.e(jaVar.f25945f);
        Paint paint = jaVar.f25944c;
        float f15 = 0.0f;
        if (e > 0.0f) {
            f10 = 9.0f;
            f11 = 16.0f;
            paint.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var2), (int) (((Math.abs((Math.floor(jaVar.d) + 0.5d) - jaVar.d) * 1.2000000476837158d) + 0.4000000059604645d) * 18.0d * e)));
            float f16 = length;
            float f17 = f16 / 2.0f;
            f6Var = f6Var2;
            f12 = 41.0f;
            float lerp = AndroidUtilities.lerp((((float) Math.floor(jaVar.d)) * f16) + f17, (f16 * ((float) Math.ceil(jaVar.d))) + f17, jaVar.d - ((int) f14)) + jaVar.getPaddingLeft();
            RectF rectF = AndroidUtilities.rectTmp;
            float f18 = min / 2.0f;
            rectF.set(lerp - f18, AndroidUtilities.dp(9.0f), lerp + f18, AndroidUtilities.dp(41.0f));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), paint);
        } else {
            f6Var = f6Var2;
            f10 = 9.0f;
            f11 = 16.0f;
            f12 = 41.0f;
        }
        int i11 = 0;
        while (i11 < iaVarArr.length) {
            ia iaVar = iaVarArr[i11];
            int paddingLeft = (i11 * length) + jaVar.getPaddingLeft();
            RectF rectF2 = iaVar.h;
            StaticLayout staticLayout = iaVar.e;
            org.telegram.ui.Cells.z zVar = iaVar.f25656c;
            gj0 gj0Var = iaVar.f25655b;
            int i12 = length;
            rectF2.set(paddingLeft, f15, paddingLeft + length, jaVar.getHeight());
            float min2 = 1.0f - Math.min(1.0f, Math.abs(jaVar.d - i11));
            org.telegram.ui.ActionBar.f6 f6Var3 = f6Var;
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.D6, f6Var3);
            int i13 = org.telegram.ui.ActionBar.j6.G6;
            int d = i0.a.d(min2, v02, org.telegram.ui.ActionBar.j6.v0(i13, f6Var3));
            iaVar.d.setColor(d);
            if (iaVar.f25663m != d) {
                iaVar.f25663m = d;
                f13 = min2;
                gj0Var.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            } else {
                f13 = min2;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            float f19 = min / 2.0f;
            ia[] iaVarArr2 = iaVarArr;
            int i14 = min;
            rect.set((int) (rectF2.centerX() - f19), AndroidUtilities.dp(f10), (int) (rectF2.centerX() + f19), AndroidUtilities.dp(f12));
            z5 z5Var = iaVar.f25659i;
            if (f13 > 0.6f) {
                z4 = true;
            } else {
                z4 = false;
            }
            float e6 = z5Var.e(z4);
            if (e < 1.0f) {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.v0(i13, f6Var3), (int) ((1.0f - e) * e6 * 18.0f)));
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(rect);
                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(f11), AndroidUtilities.dp(f11), paint);
            }
            zVar.setBounds(rect);
            zVar.draw(canvas);
            float dp = AndroidUtilities.dp(29.0f) / 2.0f;
            rect.set((int) (rectF2.centerX() - dp), (int) (AndroidUtilities.dpf2(24.66f) - dp), (int) (rectF2.centerX() + dp), (int) (AndroidUtilities.dpf2(24.66f) + dp));
            gj0Var.setBounds(rect);
            gj0Var.draw(canvas);
            canvas.save();
            canvas.translate((rectF2.centerX() - (iaVar.f25657f / 2.0f)) - iaVar.f25658g, AndroidUtilities.dp(50.0f) - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            i11++;
            jaVar = this;
            f6Var = f6Var3;
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
            this.f25947r = true;
            return true;
        }
        int action = motionEvent.getAction();
        ia[] iaVarArr = this.f25943b;
        if (action != 1 && motionEvent.getAction() != 2) {
            if (motionEvent.getAction() == 3) {
                for (ia iaVar : iaVarArr) {
                    iaVar.f25656c.setState(new int[0]);
                }
                this.f25947r = false;
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
                            if (this.f25947r) {
                                iaVarArr[i10].f25656c.setState(new int[0]);
                            }
                            iaVarArr[i10].f25656c.setState(new int[]{16842919, 16842910});
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
                    iaVarArr[i11].f25656c.setState(new int[0]);
                }
            }
            if (i10 >= 0 && this.e != i10 && (callback = this.f25946n) != null) {
                callback.run(Integer.valueOf(i10));
            }
            this.f25947r = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTabClick(Utilities.Callback<Integer> callback) {
        this.f25946n = callback;
    }

    public void setProgress(float f10) {
        a(f10, true);
    }

    public void setScrolling(boolean z4) {
        if (this.f25945f == z4) {
            return;
        }
        this.f25945f = z4;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        int i10 = 0;
        while (true) {
            ia[] iaVarArr = this.f25943b;
            if (i10 < iaVarArr.length) {
                if (iaVarArr[i10].f25656c == drawable) {
                    return true;
                }
                i10++;
            } else {
                return super.verifyDrawable(drawable);
            }
        }
    }
}
