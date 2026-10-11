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
public abstract class ta extends View {
    public final org.telegram.ui.ActionBar.d6 f31185a;
    public final sa[] f31186b;
    public final Paint f31187c;
    public float d;
    public int f31188e;
    public boolean f31189f;
    public final g6 h;
    public Utilities.Callback f31190n;
    public boolean f31191r;

    public ta(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.f31187c = new Paint(1);
        this.h = new g6(this, 0L, 210L, is.h);
        this.f31185a = d6Var;
        cb0 cb0Var = (cb0) this;
        this.f31186b = new sa[]{new sa(cb0Var, 0, R.raw.msg_stories_saved, 20, 40, LocaleController.getString(R.string.ProfileMyStoriesTab)), new sa(cb0Var, 1, R.raw.msg_stories_archive, 0, 0, LocaleController.getString(R.string.ProfileStoriesArchiveTab))};
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        a(0.0f, false);
    }

    public final void a(float f7, boolean z10) {
        float f10;
        boolean z11;
        sa[] saVarArr = this.f31186b;
        float clamp = Utilities.clamp(f7, saVarArr.length, 0.0f);
        this.d = clamp;
        this.f31188e = Math.round(clamp);
        for (int i10 = 0; i10 < saVarArr.length; i10++) {
            sa saVar = saVarArr[i10];
            float abs = Math.abs(this.f31188e - i10);
            if (saVarArr[i10].f30817l) {
                f10 = 0.25f;
            } else {
                f10 = 0.35f;
            }
            if (abs < f10) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i11 = saVar.f30816k;
            int i12 = saVar.f30815j;
            dk0 dk0Var = saVar.f30809b;
            if (saVar.f30817l != z11) {
                if (saVar.f30819n.f31186b[saVar.f30808a].f30815j != 0) {
                    if (z11) {
                        dk0Var.P(i12);
                        if (dk0Var.f25804a0 >= i11 - 2) {
                            dk0Var.N(0, false, false);
                        }
                        if (dk0Var.f25804a0 <= i12) {
                            dk0Var.start();
                        } else {
                            dk0Var.M(i12);
                        }
                    } else if (dk0Var.f25804a0 >= i12 - 1) {
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
                saVar.f30817l = z11;
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
        ta taVar = this;
        int i10 = org.telegram.ui.ActionBar.h6.f20822d6;
        org.telegram.ui.ActionBar.d6 d6Var = taVar.f31185a;
        canvas.drawColor(org.telegram.ui.ActionBar.h6.w0(i10, d6Var));
        canvas.drawRect(0.0f, 0.0f, taVar.getWidth(), AndroidUtilities.getShadowHeight(), org.telegram.ui.ActionBar.h6.f20944k0);
        int width = (taVar.getWidth() - taVar.getPaddingLeft()) - taVar.getPaddingRight();
        sa[] saVarArr = taVar.f31186b;
        int length = width / saVarArr.length;
        int min = Math.min(AndroidUtilities.dp(64.0f), length);
        float e7 = taVar.h.e(taVar.f31189f);
        int i11 = (e7 > 0.0f ? 1 : (e7 == 0.0f ? 0 : -1));
        float f13 = 16.0f;
        Paint paint = taVar.f31187c;
        if (i11 > 0) {
            f10 = 41.0f;
            f11 = 9.0f;
            paint.setColor(i0.a.k(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.G6, d6Var), (int) (((Math.abs((Math.floor(taVar.d) + 0.5d) - taVar.d) * 1.2000000476837158d) + 0.4000000059604645d) * 18.0d * e7)));
            float f14 = length;
            float f15 = f14 / 2.0f;
            f7 = 2.0f;
            float lerp = AndroidUtilities.lerp((((float) Math.floor(taVar.d)) * f14) + f15, (f14 * ((float) Math.ceil(taVar.d))) + f15, taVar.d - ((int) f12)) + taVar.getPaddingLeft();
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
        while (i12 < saVarArr.length) {
            sa saVar = saVarArr[i12];
            int paddingLeft = (i12 * length) + taVar.getPaddingLeft();
            RectF rectF2 = saVar.h;
            StaticLayout staticLayout = saVar.f30811e;
            org.telegram.ui.Cells.z zVar = saVar.f30810c;
            float f17 = f13;
            dk0 dk0Var = saVar.f30809b;
            int i13 = length;
            sa[] saVarArr2 = saVarArr;
            rectF2.set(paddingLeft, 0.0f, paddingLeft + length, taVar.getHeight());
            float min2 = 1.0f - Math.min(1.0f, Math.abs(taVar.d - i12));
            int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.D6, d6Var);
            int i14 = org.telegram.ui.ActionBar.h6.G6;
            int d = i0.a.d(min2, w02, org.telegram.ui.ActionBar.h6.w0(i14, d6Var));
            saVar.d.setColor(d);
            if (saVar.f30818m != d) {
                saVar.f30818m = d;
                dk0Var.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            }
            Rect rect = AndroidUtilities.rectTmp2;
            float f18 = min / f7;
            int i15 = min;
            rect.set((int) (rectF2.centerX() - f18), AndroidUtilities.dp(f11), (int) (rectF2.centerX() + f18), AndroidUtilities.dp(f10));
            g6 g6Var = saVar.f30814i;
            if (min2 > 0.6f) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e10 = g6Var.e(z10);
            if (e7 < 1.0f) {
                paint.setColor(i0.a.k(org.telegram.ui.ActionBar.h6.w0(i14, d6Var), (int) ((1.0f - e7) * e10 * 18.0f)));
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
            canvas.translate((rectF2.centerX() - (saVar.f30812f / f7)) - saVar.f30813g, AndroidUtilities.dp(50.0f) - (staticLayout.getHeight() / f7));
            staticLayout.draw(canvas);
            canvas.restore();
            i12++;
            taVar = this;
            f13 = f17;
            length = i13;
            saVarArr = saVarArr2;
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
            this.f31191r = true;
            return true;
        }
        int action = motionEvent.getAction();
        sa[] saVarArr = this.f31186b;
        if (action != 1 && motionEvent.getAction() != 2) {
            if (motionEvent.getAction() == 3) {
                for (sa saVar : saVarArr) {
                    saVar.f30810c.setState(new int[0]);
                }
                this.f31191r = false;
                return true;
            }
        } else {
            float x10 = motionEvent.getX();
            int i10 = 0;
            while (true) {
                if (i10 < saVarArr.length) {
                    RectF rectF = saVarArr[i10].h;
                    if (rectF.left < x10 && rectF.right > x10) {
                        if (motionEvent.getAction() != 1) {
                            if (this.f31191r) {
                                saVarArr[i10].f30810c.setState(new int[0]);
                            }
                            saVarArr[i10].f30810c.setState(new int[]{16842919, 16842910});
                        }
                    } else {
                        i10++;
                    }
                } else {
                    i10 = -1;
                    break;
                }
            }
            for (int i11 = 0; i11 < saVarArr.length; i11++) {
                if (i11 != i10 || motionEvent.getAction() == 1) {
                    saVarArr[i11].f30810c.setState(new int[0]);
                }
            }
            if (i10 >= 0 && this.f31188e != i10 && (callback = this.f31190n) != null) {
                callback.run(Integer.valueOf(i10));
            }
            this.f31191r = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTabClick(Utilities.Callback<Integer> callback) {
        this.f31190n = callback;
    }

    public void setProgress(float f7) {
        a(f7, true);
    }

    public void setScrolling(boolean z10) {
        if (this.f31189f == z10) {
            return;
        }
        this.f31189f = z10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        int i10 = 0;
        while (true) {
            sa[] saVarArr = this.f31186b;
            if (i10 < saVarArr.length) {
                if (saVarArr[i10].f30810c == drawable) {
                    return true;
                }
                i10++;
            } else {
                return super.verifyDrawable(drawable);
            }
        }
    }
}
