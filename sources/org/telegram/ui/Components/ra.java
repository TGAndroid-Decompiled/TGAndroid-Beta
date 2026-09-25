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
    public final org.telegram.ui.ActionBar.d6 f27934a;
    public final qa[] f27935b;
    public final Paint f27936c;
    public float d;
    public int e;
    public boolean f27937f;
    public final e6 h;
    public Utilities.Callback f27938n;
    public boolean f27939r;

    public ra(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f27936c = new Paint(1);
        this.h = new e6(this, 0L, 210L, rr.h);
        this.f27934a = d6Var;
        ma0 ma0Var = (ma0) this;
        this.f27935b = new qa[]{new qa(ma0Var, 0, R.raw.msg_stories_saved, 20, 40, LocaleController.getString(R.string.ProfileMyStoriesTab)), new qa(ma0Var, 1, R.raw.msg_stories_archive, 0, 0, LocaleController.getString(R.string.ProfileStoriesArchiveTab))};
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        a(0.0f, false);
    }

    public final void a(float f7, boolean z10) {
        float f10;
        boolean z11;
        qa[] qaVarArr = this.f27935b;
        float clamp = Utilities.clamp(f7, qaVarArr.length, 0.0f);
        this.d = clamp;
        this.e = Math.round(clamp);
        for (int i10 = 0; i10 < qaVarArr.length; i10++) {
            qa qaVar = qaVarArr[i10];
            float abs = Math.abs(this.e - i10);
            if (qaVarArr[i10].f27564l) {
                f10 = 0.25f;
            } else {
                f10 = 0.35f;
            }
            if (abs < f10) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i11 = qaVar.f27563k;
            int i12 = qaVar.f27562j;
            ij0 ij0Var = qaVar.f27557b;
            if (qaVar.f27564l != z11) {
                if (qaVar.f27566n.f27935b[qaVar.f27556a].f27562j != 0) {
                    if (z11) {
                        ij0Var.P(i12);
                        if (ij0Var.f25069a0 >= i11 - 2) {
                            ij0Var.N(0, false, false);
                        }
                        if (ij0Var.f25069a0 <= i12) {
                            ij0Var.start();
                        } else {
                            ij0Var.M(i12);
                        }
                    } else if (ij0Var.f25069a0 >= i12 - 1) {
                        ij0Var.P(i11 - 1);
                        ij0Var.start();
                    } else {
                        ij0Var.P(0);
                        ij0Var.M(0);
                    }
                } else if (z11) {
                    ij0Var.M(0);
                    if (z10) {
                        ij0Var.start();
                    }
                }
                qaVar.f27564l = z11;
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
        ra raVar = this;
        int i10 = org.telegram.ui.ActionBar.h6.f19060d6;
        org.telegram.ui.ActionBar.d6 d6Var2 = raVar.f27934a;
        canvas.drawColor(org.telegram.ui.ActionBar.h6.v0(i10, d6Var2));
        canvas.drawRect(0.0f, 0.0f, raVar.getWidth(), AndroidUtilities.getShadowHeight(), org.telegram.ui.ActionBar.h6.f19181k0);
        int width = (raVar.getWidth() - raVar.getPaddingLeft()) - raVar.getPaddingRight();
        qa[] qaVarArr = raVar.f27935b;
        int length = width / qaVarArr.length;
        int min = Math.min(AndroidUtilities.dp(64.0f), length);
        float e = raVar.h.e(raVar.f27937f);
        Paint paint = raVar.f27936c;
        float f14 = 0.0f;
        if (e > 0.0f) {
            f7 = 9.0f;
            f10 = 16.0f;
            paint.setColor(i0.a.k(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.G6, d6Var2), (int) (((Math.abs((Math.floor(raVar.d) + 0.5d) - raVar.d) * 1.2000000476837158d) + 0.4000000059604645d) * 18.0d * e)));
            float f15 = length;
            float f16 = f15 / 2.0f;
            d6Var = d6Var2;
            f11 = 41.0f;
            float lerp = AndroidUtilities.lerp((((float) Math.floor(raVar.d)) * f15) + f16, (f15 * ((float) Math.ceil(raVar.d))) + f16, raVar.d - ((int) f13)) + raVar.getPaddingLeft();
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
        while (i11 < qaVarArr.length) {
            qa qaVar = qaVarArr[i11];
            int paddingLeft = (i11 * length) + raVar.getPaddingLeft();
            RectF rectF2 = qaVar.h;
            StaticLayout staticLayout = qaVar.e;
            org.telegram.ui.Cells.z zVar = qaVar.f27558c;
            ij0 ij0Var = qaVar.f27557b;
            int i12 = length;
            rectF2.set(paddingLeft, f14, paddingLeft + length, raVar.getHeight());
            float min2 = 1.0f - Math.min(1.0f, Math.abs(raVar.d - i11));
            org.telegram.ui.ActionBar.d6 d6Var3 = d6Var;
            int v02 = org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.D6, d6Var3);
            int i13 = org.telegram.ui.ActionBar.h6.G6;
            int d = i0.a.d(min2, v02, org.telegram.ui.ActionBar.h6.v0(i13, d6Var3));
            qaVar.d.setColor(d);
            if (qaVar.f27565m != d) {
                qaVar.f27565m = d;
                f12 = min2;
                ij0Var.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            } else {
                f12 = min2;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            float f18 = min / 2.0f;
            qa[] qaVarArr2 = qaVarArr;
            int i14 = min;
            rect.set((int) (rectF2.centerX() - f18), AndroidUtilities.dp(f7), (int) (rectF2.centerX() + f18), AndroidUtilities.dp(f11));
            e6 e6Var = qaVar.f27561i;
            if (f12 > 0.6f) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e7 = e6Var.e(z10);
            if (e < 1.0f) {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.h6.v0(i13, d6Var3), (int) ((1.0f - e) * e7 * 18.0f)));
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(rect);
                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(f10), AndroidUtilities.dp(f10), paint);
            }
            zVar.setBounds(rect);
            zVar.draw(canvas);
            float dp = AndroidUtilities.dp(29.0f) / 2.0f;
            rect.set((int) (rectF2.centerX() - dp), (int) (AndroidUtilities.dpf2(24.66f) - dp), (int) (rectF2.centerX() + dp), (int) (AndroidUtilities.dpf2(24.66f) + dp));
            ij0Var.setBounds(rect);
            ij0Var.draw(canvas);
            canvas.save();
            canvas.translate((rectF2.centerX() - (qaVar.f27559f / 2.0f)) - qaVar.f27560g, AndroidUtilities.dp(50.0f) - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            i11++;
            raVar = this;
            d6Var = d6Var3;
            length = i12;
            qaVarArr = qaVarArr2;
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
            this.f27939r = true;
            return true;
        }
        int action = motionEvent.getAction();
        qa[] qaVarArr = this.f27935b;
        if (action != 1 && motionEvent.getAction() != 2) {
            if (motionEvent.getAction() == 3) {
                for (qa qaVar : qaVarArr) {
                    qaVar.f27558c.setState(new int[0]);
                }
                this.f27939r = false;
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
                            if (this.f27939r) {
                                qaVarArr[i10].f27558c.setState(new int[0]);
                            }
                            qaVarArr[i10].f27558c.setState(new int[]{16842919, 16842910});
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
                    qaVarArr[i11].f27558c.setState(new int[0]);
                }
            }
            if (i10 >= 0 && this.e != i10 && (callback = this.f27938n) != null) {
                callback.run(Integer.valueOf(i10));
            }
            this.f27939r = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTabClick(Utilities.Callback<Integer> callback) {
        this.f27938n = callback;
    }

    public void setProgress(float f7) {
        a(f7, true);
    }

    public void setScrolling(boolean z10) {
        if (this.f27937f == z10) {
            return;
        }
        this.f27937f = z10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        int i10 = 0;
        while (true) {
            qa[] qaVarArr = this.f27935b;
            if (i10 < qaVarArr.length) {
                if (qaVarArr[i10].f27558c == drawable) {
                    return true;
                }
                i10++;
            } else {
                return super.verifyDrawable(drawable);
            }
        }
    }
}
