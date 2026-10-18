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
    public final org.telegram.ui.ActionBar.d6 f29907a;
    public final qa[] f29908b;
    public final Paint f29909c;
    public float d;
    public int e;
    public boolean f29910f;
    public final f6 h;
    public Utilities.Callback f29911n;
    public boolean f29912r;

    public ra(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f29909c = new Paint(1);
        this.h = new f6(this, 0L, 210L, bs.h);
        this.f29907a = d6Var;
        va0 va0Var = (va0) this;
        this.f29908b = new qa[]{new qa(va0Var, 0, R.raw.msg_stories_saved, 20, 40, LocaleController.getString(R.string.ProfileMyStoriesTab)), new qa(va0Var, 1, R.raw.msg_stories_archive, 0, 0, LocaleController.getString(R.string.ProfileStoriesArchiveTab))};
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        a(0.0f, false);
    }

    public final void a(float f7, boolean z10) {
        float f10;
        boolean z11;
        qa[] qaVarArr = this.f29908b;
        float clamp = Utilities.clamp(f7, qaVarArr.length, 0.0f);
        this.d = clamp;
        this.e = Math.round(clamp);
        for (int i10 = 0; i10 < qaVarArr.length; i10++) {
            qa qaVar = qaVarArr[i10];
            float abs = Math.abs(this.e - i10);
            if (qaVarArr[i10].f29624l) {
                f10 = 0.25f;
            } else {
                f10 = 0.35f;
            }
            if (abs < f10) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i11 = qaVar.f29623k;
            int i12 = qaVar.f29622j;
            uj0 uj0Var = qaVar.f29617b;
            if (qaVar.f29624l != z11) {
                if (qaVar.f29626n.f29908b[qaVar.f29616a].f29622j != 0) {
                    if (z11) {
                        uj0Var.P(i12);
                        if (uj0Var.f31001a0 >= i11 - 2) {
                            uj0Var.N(0, false, false);
                        }
                        if (uj0Var.f31001a0 <= i12) {
                            uj0Var.start();
                        } else {
                            uj0Var.M(i12);
                        }
                    } else if (uj0Var.f31001a0 >= i12 - 1) {
                        uj0Var.P(i11 - 1);
                        uj0Var.start();
                    } else {
                        uj0Var.P(0);
                        uj0Var.M(0);
                    }
                } else if (z11) {
                    uj0Var.M(0);
                    if (z10) {
                        uj0Var.start();
                    }
                }
                qaVar.f29624l = z11;
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
        int i10 = org.telegram.ui.ActionBar.h6.f20986d6;
        org.telegram.ui.ActionBar.d6 d6Var = raVar.f29907a;
        canvas.drawColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        canvas.drawRect(0.0f, 0.0f, raVar.getWidth(), AndroidUtilities.getShadowHeight(), org.telegram.ui.ActionBar.h6.f21107k0);
        int width = (raVar.getWidth() - raVar.getPaddingLeft()) - raVar.getPaddingRight();
        qa[] qaVarArr = raVar.f29908b;
        int length = width / qaVarArr.length;
        int min = Math.min(AndroidUtilities.dp(64.0f), length);
        float e = raVar.h.e(raVar.f29910f);
        int i11 = (e > 0.0f ? 1 : (e == 0.0f ? 0 : -1));
        float f13 = 16.0f;
        Paint paint = raVar.f29909c;
        if (i11 > 0) {
            f10 = 41.0f;
            f11 = 9.0f;
            paint.setColor(i0.a.o(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var), (int) (((Math.abs((Math.floor(raVar.d) + 0.5d) - raVar.d) * 1.2000000476837158d) + 0.4000000059604645d) * 18.0d * e)));
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
            org.telegram.ui.Cells.z zVar = qaVar.f29618c;
            float f17 = f13;
            uj0 uj0Var = qaVar.f29617b;
            int i13 = length;
            qa[] qaVarArr2 = qaVarArr;
            rectF2.set(paddingLeft, 0.0f, paddingLeft + length, raVar.getHeight());
            float min2 = 1.0f - Math.min(1.0f, Math.abs(raVar.d - i12));
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.D6, d6Var);
            int i14 = org.telegram.ui.ActionBar.h6.G6;
            int f18 = i0.a.f(min2, w02, org.telegram.ui.ActionBar.h6.w0(i14, d6Var));
            qaVar.d.setColor(f18);
            if (qaVar.f29625m != f18) {
                qaVar.f29625m = f18;
                uj0Var.setColorFilter(new PorterDuffColorFilter(f18, PorterDuff.Mode.SRC_IN));
            }
            Rect rect = AndroidUtilities.rectTmp2;
            float f19 = min / f7;
            int i15 = min;
            rect.set((int) (rectF2.centerX() - f19), AndroidUtilities.dp(f11), (int) (rectF2.centerX() + f19), AndroidUtilities.dp(f10));
            f6 f6Var = qaVar.f29621i;
            if (min2 > 0.6f) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e7 = f6Var.e(z10);
            if (e < 1.0f) {
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.h6.w0(i14, d6Var), (int) ((1.0f - e) * e7 * 18.0f)));
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(rect);
                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(f17), AndroidUtilities.dp(f17), paint);
            }
            zVar.setBounds(rect);
            zVar.draw(canvas);
            float dp = AndroidUtilities.dp(29.0f) / f7;
            rect.set((int) (rectF2.centerX() - dp), (int) (AndroidUtilities.dpf2(24.66f) - dp), (int) (rectF2.centerX() + dp), (int) (AndroidUtilities.dpf2(24.66f) + dp));
            uj0Var.setBounds(rect);
            uj0Var.draw(canvas);
            canvas.save();
            canvas.translate((rectF2.centerX() - (qaVar.f29619f / f7)) - qaVar.f29620g, AndroidUtilities.dp(50.0f) - (staticLayout.getHeight() / f7));
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
            this.f29912r = true;
            return true;
        }
        int action = motionEvent.getAction();
        qa[] qaVarArr = this.f29908b;
        if (action != 1 && motionEvent.getAction() != 2) {
            if (motionEvent.getAction() == 3) {
                for (qa qaVar : qaVarArr) {
                    qaVar.f29618c.setState(new int[0]);
                }
                this.f29912r = false;
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
                            if (this.f29912r) {
                                qaVarArr[i10].f29618c.setState(new int[0]);
                            }
                            qaVarArr[i10].f29618c.setState(new int[]{16842919, 16842910});
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
                    qaVarArr[i11].f29618c.setState(new int[0]);
                }
            }
            if (i10 >= 0 && this.e != i10 && (callback = this.f29911n) != null) {
                callback.run(Integer.valueOf(i10));
            }
            this.f29912r = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTabClick(Utilities.Callback<Integer> callback) {
        this.f29911n = callback;
    }

    public void setProgress(float f7) {
        a(f7, true);
    }

    public void setScrolling(boolean z10) {
        if (this.f29910f == z10) {
            return;
        }
        this.f29910f = z10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        int i10 = 0;
        while (true) {
            qa[] qaVarArr = this.f29908b;
            if (i10 < qaVarArr.length) {
                if (qaVarArr[i10].f29618c == drawable) {
                    return true;
                }
                i10++;
            } else {
                return super.verifyDrawable(drawable);
            }
        }
    }
}
