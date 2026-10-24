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
public abstract class pa extends View {
    public final org.telegram.ui.ActionBar.g6 f29527a;
    public final oa[] f29528b;
    public final Paint f29529c;
    public float d;
    public int e;
    public boolean f29530f;
    public final d6 h;
    public Utilities.Callback f29531n;
    public boolean f29532r;

    public pa(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f29529c = new Paint(1);
        this.h = new d6(this, 0L, 210L, zr.h);
        this.f29527a = g6Var;
        ua0 ua0Var = (ua0) this;
        this.f29528b = new oa[]{new oa(ua0Var, 0, R.raw.msg_stories_saved, 20, 40, LocaleController.getString(R.string.ProfileMyStoriesTab)), new oa(ua0Var, 1, R.raw.msg_stories_archive, 0, 0, LocaleController.getString(R.string.ProfileStoriesArchiveTab))};
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        a(0.0f, false);
    }

    public final void a(float f7, boolean z10) {
        float f10;
        boolean z11;
        oa[] oaVarArr = this.f29528b;
        float clamp = Utilities.clamp(f7, oaVarArr.length, 0.0f);
        this.d = clamp;
        this.e = Math.round(clamp);
        for (int i10 = 0; i10 < oaVarArr.length; i10++) {
            oa oaVar = oaVarArr[i10];
            float abs = Math.abs(this.e - i10);
            if (oaVarArr[i10].f29189m) {
                f10 = 0.25f;
            } else {
                f10 = 0.35f;
            }
            if (abs < f10) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i11 = oaVar.f29187k;
            int i12 = oaVar.f29186j;
            xj0 xj0Var = oaVar.f29181b;
            if (oaVar.f29189m != z11) {
                if (oaVar.f29191o.f29528b[oaVar.f29180a].f29186j != 0) {
                    if (z11) {
                        xj0Var.P(i12);
                        if (xj0Var.f32594a0 >= i11 - 2) {
                            xj0Var.N(0, false, false);
                        }
                        if (xj0Var.f32594a0 <= i12) {
                            xj0Var.start();
                        } else {
                            xj0Var.M(i12);
                        }
                    } else if (xj0Var.f32594a0 >= i12 - 1) {
                        xj0Var.P(i11 - 1);
                        xj0Var.start();
                    } else {
                        xj0Var.P(0);
                        xj0Var.M(0);
                    }
                } else if (z11) {
                    xj0Var.M(0);
                    if (z10) {
                        xj0Var.start();
                    }
                }
                oaVar.f29189m = z11;
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
        pa paVar = this;
        int i10 = org.telegram.ui.ActionBar.k6.f21184d6;
        org.telegram.ui.ActionBar.g6 g6Var = paVar.f29527a;
        canvas.drawColor(org.telegram.ui.ActionBar.k6.w0(i10, g6Var));
        canvas.drawRect(0.0f, 0.0f, paVar.getWidth(), AndroidUtilities.getShadowHeight(), org.telegram.ui.ActionBar.k6.f21305k0);
        int width = (paVar.getWidth() - paVar.getPaddingLeft()) - paVar.getPaddingRight();
        oa[] oaVarArr = paVar.f29528b;
        int length = width / oaVarArr.length;
        int min = Math.min(AndroidUtilities.dp(64.0f), length);
        float e = paVar.h.e(paVar.f29530f);
        int i11 = (e > 0.0f ? 1 : (e == 0.0f ? 0 : -1));
        float f13 = 16.0f;
        Paint paint = paVar.f29529c;
        if (i11 > 0) {
            f10 = 41.0f;
            f11 = 9.0f;
            paint.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.G6, g6Var), (int) (((Math.abs((Math.floor(paVar.d) + 0.5d) - paVar.d) * 1.2000000476837158d) + 0.4000000059604645d) * 18.0d * e)));
            float f14 = length;
            float f15 = f14 / 2.0f;
            f7 = 2.0f;
            float lerp = AndroidUtilities.lerp((((float) Math.floor(paVar.d)) * f14) + f15, (f14 * ((float) Math.ceil(paVar.d))) + f15, paVar.d - ((int) f12)) + paVar.getPaddingLeft();
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
        while (i12 < oaVarArr.length) {
            oa oaVar = oaVarArr[i12];
            int paddingLeft = (i12 * length) + paVar.getPaddingLeft();
            RectF rectF2 = oaVar.h;
            StaticLayout staticLayout = oaVar.e;
            org.telegram.ui.Cells.y yVar = oaVar.f29182c;
            float f17 = f13;
            xj0 xj0Var = oaVar.f29181b;
            int i13 = length;
            oa[] oaVarArr2 = oaVarArr;
            rectF2.set(paddingLeft, 0.0f, paddingLeft + length, paVar.getHeight());
            float min2 = 1.0f - Math.min(1.0f, Math.abs(paVar.d - i12));
            int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.D6, g6Var);
            int i14 = org.telegram.ui.ActionBar.k6.G6;
            int f18 = i0.a.f(min2, w02, org.telegram.ui.ActionBar.k6.w0(i14, g6Var));
            oaVar.d.setColor(f18);
            if (oaVar.f29190n != f18) {
                oaVar.f29190n = f18;
                xj0Var.setColorFilter(new PorterDuffColorFilter(f18, PorterDuff.Mode.SRC_IN));
            }
            Rect rect = AndroidUtilities.rectTmp2;
            float f19 = min / f7;
            int i15 = min;
            rect.set((int) (rectF2.centerX() - f19), AndroidUtilities.dp(f11), (int) (rectF2.centerX() + f19), AndroidUtilities.dp(f10));
            d6 d6Var = oaVar.f29185i;
            if (min2 > 0.6f) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e7 = d6Var.e(z10);
            if (e < 1.0f) {
                paint.setColor(i0.a.o(org.telegram.ui.ActionBar.k6.w0(i14, g6Var), (int) ((1.0f - e) * e7 * 18.0f)));
                RectF rectF3 = AndroidUtilities.rectTmp;
                rectF3.set(rect);
                canvas.drawRoundRect(rectF3, AndroidUtilities.dp(f17), AndroidUtilities.dp(f17), paint);
            }
            int o12 = org.telegram.ui.ActionBar.k6.o1(0.1f, org.telegram.ui.ActionBar.k6.w0(i14, g6Var));
            if (oaVar.f29188l != o12) {
                oaVar.f29188l = o12;
                org.telegram.ui.ActionBar.k6.E1(yVar, o12, true);
            }
            yVar.setBounds(rect);
            yVar.draw(canvas);
            float dp = AndroidUtilities.dp(29.0f) / f7;
            rect.set((int) (rectF2.centerX() - dp), (int) (AndroidUtilities.dpf2(24.66f) - dp), (int) (rectF2.centerX() + dp), (int) (AndroidUtilities.dpf2(24.66f) + dp));
            xj0Var.setBounds(rect);
            xj0Var.draw(canvas);
            canvas.save();
            canvas.translate((rectF2.centerX() - (oaVar.f29183f / f7)) - oaVar.f29184g, AndroidUtilities.dp(50.0f) - (staticLayout.getHeight() / f7));
            staticLayout.draw(canvas);
            canvas.restore();
            i12++;
            paVar = this;
            f13 = f17;
            length = i13;
            oaVarArr = oaVarArr2;
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
            this.f29532r = true;
            return true;
        }
        int action = motionEvent.getAction();
        oa[] oaVarArr = this.f29528b;
        if (action != 1 && motionEvent.getAction() != 2) {
            if (motionEvent.getAction() == 3) {
                for (oa oaVar : oaVarArr) {
                    oaVar.f29182c.setState(new int[0]);
                }
                this.f29532r = false;
                return true;
            }
        } else {
            float x10 = motionEvent.getX();
            int i10 = 0;
            while (true) {
                if (i10 < oaVarArr.length) {
                    RectF rectF = oaVarArr[i10].h;
                    if (rectF.left < x10 && rectF.right > x10) {
                        if (motionEvent.getAction() != 1) {
                            if (this.f29532r) {
                                oaVarArr[i10].f29182c.setState(new int[0]);
                            }
                            oaVarArr[i10].f29182c.setState(new int[]{16842919, 16842910});
                        }
                    } else {
                        i10++;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            }
            for (int i11 = 0; i11 < oaVarArr.length; i11++) {
                if (i11 != i10 || motionEvent.getAction() == 1) {
                    oaVarArr[i11].f29182c.setState(new int[0]);
                }
            }
            if (i10 >= 0 && this.e != i10 && (callback = this.f29531n) != null) {
                callback.run(Integer.valueOf(i10));
            }
            this.f29532r = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTabClick(Utilities.Callback<Integer> callback) {
        this.f29531n = callback;
    }

    public void setProgress(float f7) {
        a(f7, true);
    }

    public void setScrolling(boolean z10) {
        if (this.f29530f == z10) {
            return;
        }
        this.f29530f = z10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        int i10 = 0;
        while (true) {
            oa[] oaVarArr = this.f29528b;
            if (i10 < oaVarArr.length) {
                if (oaVarArr[i10].f29182c == drawable) {
                    return true;
                }
                i10++;
            } else {
                return super.verifyDrawable(drawable);
            }
        }
    }
}
