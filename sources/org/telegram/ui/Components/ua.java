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
public abstract class ua extends View {
    public final org.telegram.ui.ActionBar.e6 f31431a;
    public final ta[] f31432b;
    public final Paint f31433c;
    public float d;
    public int f31434e;
    public boolean f31435f;
    public final g6 h;
    public Utilities.Callback f31436n;
    public boolean f31437r;

    public ua(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f31433c = new Paint(1);
        this.h = new g6(this, 0L, 210L, is.h);
        this.f31431a = e6Var;
        db0 db0Var = (db0) this;
        this.f31432b = new ta[]{new ta(db0Var, 0, R.raw.msg_stories_saved, 20, 40, LocaleController.getString(R.string.ProfileMyStoriesTab)), new ta(db0Var, 1, R.raw.msg_stories_archive, 0, 0, LocaleController.getString(R.string.ProfileStoriesArchiveTab))};
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        a(0.0f, false);
    }

    public final void a(float f7, boolean z10) {
        float f10;
        boolean z11;
        ta[] taVarArr = this.f31432b;
        float clamp = Utilities.clamp(f7, taVarArr.length, 0.0f);
        this.d = clamp;
        this.f31434e = Math.round(clamp);
        for (int i10 = 0; i10 < taVarArr.length; i10++) {
            ta taVar = taVarArr[i10];
            float abs = Math.abs(this.f31434e - i10);
            if (taVarArr[i10].f31080l) {
                f10 = 0.25f;
            } else {
                f10 = 0.35f;
            }
            if (abs < f10) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i11 = taVar.f31079k;
            int i12 = taVar.f31078j;
            dk0 dk0Var = taVar.f31072b;
            if (taVar.f31080l != z11) {
                if (taVar.f31082n.f31432b[taVar.f31071a].f31078j != 0) {
                    if (z11) {
                        dk0Var.P(i12);
                        if (dk0Var.f25726a0 >= i11 - 2) {
                            dk0Var.N(0, false, false);
                        }
                        if (dk0Var.f25726a0 <= i12) {
                            dk0Var.start();
                        } else {
                            dk0Var.M(i12);
                        }
                    } else if (dk0Var.f25726a0 >= i12 - 1) {
                        dk0Var.P(i11 - 1);
                        dk0Var.start();
                    } else {
                        dk0Var.P(0);
                        dk0Var.M(0);
                    }
                } else if (z11) {
                    dk0Var.M(0);
                    if (z10) {
                        dk0Var.start();
                    }
                }
                taVar.f31080l = z11;
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
        ua uaVar = this;
        int i10 = org.telegram.ui.ActionBar.i6.f20801d6;
        org.telegram.ui.ActionBar.e6 e6Var = uaVar.f31431a;
        canvas.drawColor(org.telegram.ui.ActionBar.i6.w0(i10, e6Var));
        canvas.drawRect(0.0f, 0.0f, uaVar.getWidth(), AndroidUtilities.getShadowHeight(), org.telegram.ui.ActionBar.i6.f20923k0);
        int width = (uaVar.getWidth() - uaVar.getPaddingLeft()) - uaVar.getPaddingRight();
        ta[] taVarArr = uaVar.f31432b;
        int length = width / taVarArr.length;
        int min = Math.min(AndroidUtilities.dp(64.0f), length);
        float e7 = uaVar.h.e(uaVar.f31435f);
        int i11 = (e7 > 0.0f ? 1 : (e7 == 0.0f ? 0 : -1));
        float f13 = 16.0f;
        Paint paint = uaVar.f31433c;
        if (i11 > 0) {
            f10 = 41.0f;
            f11 = 9.0f;
            paint.setColor(i0.a.k(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.G6, e6Var), (int) (((Math.abs((Math.floor(uaVar.d) + 0.5d) - uaVar.d) * 1.2000000476837158d) + 0.4000000059604645d) * 18.0d * e7)));
            float f14 = length;
            float f15 = f14 / 2.0f;
            f7 = 2.0f;
            float lerp = AndroidUtilities.lerp((((float) Math.floor(uaVar.d)) * f14) + f15, (f14 * ((float) Math.ceil(uaVar.d))) + f15, uaVar.d - ((int) f12)) + uaVar.getPaddingLeft();
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
        while (i12 < taVarArr.length) {
            ta taVar = taVarArr[i12];
            int paddingLeft = (i12 * length) + uaVar.getPaddingLeft();
            RectF rectF2 = taVar.h;
            StaticLayout staticLayout = taVar.f31074e;
            org.telegram.ui.Cells.z zVar = taVar.f31073c;
            float f17 = f13;
            dk0 dk0Var = taVar.f31072b;
            int i13 = length;
            ta[] taVarArr2 = taVarArr;
            rectF2.set(paddingLeft, 0.0f, paddingLeft + length, uaVar.getHeight());
            float min2 = 1.0f - Math.min(1.0f, Math.abs(uaVar.d - i12));
            int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.D6, e6Var);
            int i14 = org.telegram.ui.ActionBar.i6.G6;
            int d = i0.a.d(min2, w02, org.telegram.ui.ActionBar.i6.w0(i14, e6Var));
            taVar.d.setColor(d);
            if (taVar.f31081m != d) {
                taVar.f31081m = d;
                dk0Var.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            }
            Rect rect = AndroidUtilities.rectTmp2;
            float f18 = min / f7;
            int i15 = min;
            rect.set((int) (rectF2.centerX() - f18), AndroidUtilities.dp(f11), (int) (rectF2.centerX() + f18), AndroidUtilities.dp(f10));
            g6 g6Var = taVar.f31077i;
            if (min2 > 0.6f) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e10 = g6Var.e(z10);
            if (e7 < 1.0f) {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.i6.w0(i14, e6Var), (int) ((1.0f - e7) * e10 * 18.0f)));
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(rect);
                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(f17), AndroidUtilities.dp(f17), paint);
            }
            zVar.setBounds(rect);
            zVar.draw(canvas);
            float dp = AndroidUtilities.dp(29.0f) / f7;
            rect.set((int) (rectF2.centerX() - dp), (int) (AndroidUtilities.dpf2(24.66f) - dp), (int) (rectF2.centerX() + dp), (int) (AndroidUtilities.dpf2(24.66f) + dp));
            dk0Var.setBounds(rect);
            dk0Var.draw(canvas);
            canvas.save();
            canvas.translate((rectF2.centerX() - (taVar.f31075f / f7)) - taVar.f31076g, AndroidUtilities.dp(50.0f) - (staticLayout.getHeight() / f7));
            staticLayout.draw(canvas);
            canvas.restore();
            i12++;
            uaVar = this;
            f13 = f17;
            length = i13;
            taVarArr = taVarArr2;
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
            this.f31437r = true;
            return true;
        }
        int action = motionEvent.getAction();
        ta[] taVarArr = this.f31432b;
        if (action != 1 && motionEvent.getAction() != 2) {
            if (motionEvent.getAction() == 3) {
                for (ta taVar : taVarArr) {
                    taVar.f31073c.setState(new int[0]);
                }
                this.f31437r = false;
                return true;
            }
        } else {
            float x10 = motionEvent.getX();
            int i10 = 0;
            while (true) {
                if (i10 < taVarArr.length) {
                    RectF rectF = taVarArr[i10].h;
                    if (rectF.left < x10 && rectF.right > x10) {
                        if (motionEvent.getAction() != 1) {
                            if (this.f31437r) {
                                taVarArr[i10].f31073c.setState(new int[0]);
                            }
                            taVarArr[i10].f31073c.setState(new int[]{16842919, 16842910});
                        }
                    } else {
                        i10++;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            }
            for (int i11 = 0; i11 < taVarArr.length; i11++) {
                if (i11 != i10 || motionEvent.getAction() == 1) {
                    taVarArr[i11].f31073c.setState(new int[0]);
                }
            }
            if (i10 >= 0 && this.f31434e != i10 && (callback = this.f31436n) != null) {
                callback.run(Integer.valueOf(i10));
            }
            this.f31437r = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTabClick(Utilities.Callback<Integer> callback) {
        this.f31436n = callback;
    }

    public void setProgress(float f7) {
        a(f7, true);
    }

    public void setScrolling(boolean z10) {
        if (this.f31435f == z10) {
            return;
        }
        this.f31435f = z10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        int i10 = 0;
        while (true) {
            ta[] taVarArr = this.f31432b;
            if (i10 < taVarArr.length) {
                if (taVarArr[i10].f31073c == drawable) {
                    return true;
                }
                i10++;
            } else {
                return super.verifyDrawable(drawable);
            }
        }
    }
}
