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
    public final org.telegram.ui.ActionBar.f6 f26967a;
    public final oa[] f26968b;
    public final Paint f26969c;
    public float d;
    public int e;
    public boolean f26970f;
    public final c6 h;
    public Utilities.Callback f26971n;
    public boolean f26972r;

    public pa(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f26969c = new Paint(1);
        this.h = new c6(this, 0L, 210L, qr.h);
        this.f26967a = f6Var;
        aa0 aa0Var = (aa0) this;
        this.f26968b = new oa[]{new oa(aa0Var, 0, R.raw.msg_stories_saved, 20, 40, LocaleController.getString(R.string.ProfileMyStoriesTab)), new oa(aa0Var, 1, R.raw.msg_stories_archive, 0, 0, LocaleController.getString(R.string.ProfileStoriesArchiveTab))};
        setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        a(0.0f, false);
    }

    public final void a(float f7, boolean z10) {
        float f10;
        boolean z11;
        oa[] oaVarArr = this.f26968b;
        float clamp = Utilities.clamp(f7, oaVarArr.length, 0.0f);
        this.d = clamp;
        this.e = Math.round(clamp);
        for (int i10 = 0; i10 < oaVarArr.length; i10++) {
            oa oaVar = oaVarArr[i10];
            float abs = Math.abs(this.e - i10);
            if (oaVarArr[i10].f26687l) {
                f10 = 0.25f;
            } else {
                f10 = 0.35f;
            }
            if (abs < f10) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i11 = oaVar.f26686k;
            int i12 = oaVar.f26685j;
            yi0 yi0Var = oaVar.f26680b;
            if (oaVar.f26687l != z11) {
                if (oaVar.f26689n.f26968b[oaVar.f26679a].f26685j != 0) {
                    if (z11) {
                        yi0Var.P(i12);
                        if (yi0Var.f30221b0 >= i11 - 2) {
                            yi0Var.N(0, false, false);
                        }
                        if (yi0Var.f30221b0 <= i12) {
                            yi0Var.start();
                        } else {
                            yi0Var.M(i12);
                        }
                    } else if (yi0Var.f30221b0 >= i12 - 1) {
                        yi0Var.P(i11 - 1);
                        yi0Var.start();
                    } else {
                        yi0Var.P(0);
                        yi0Var.M(0);
                    }
                } else if (z11) {
                    yi0Var.M(0);
                    if (z10) {
                        yi0Var.start();
                    }
                }
                oaVar.f26687l = z11;
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
        pa paVar = this;
        int i10 = org.telegram.ui.ActionBar.j6.f18862d6;
        org.telegram.ui.ActionBar.f6 f6Var2 = paVar.f26967a;
        canvas.drawColor(org.telegram.ui.ActionBar.j6.v0(i10, f6Var2));
        canvas.drawRect(0.0f, 0.0f, paVar.getWidth(), AndroidUtilities.getShadowHeight(), org.telegram.ui.ActionBar.j6.f18984k0);
        int width = (paVar.getWidth() - paVar.getPaddingLeft()) - paVar.getPaddingRight();
        oa[] oaVarArr = paVar.f26968b;
        int length = width / oaVarArr.length;
        int min = Math.min(AndroidUtilities.dp(64.0f), length);
        float e = paVar.h.e(paVar.f26970f);
        Paint paint = paVar.f26969c;
        float f14 = 0.0f;
        if (e > 0.0f) {
            f7 = 9.0f;
            f10 = 16.0f;
            paint.setColor(i0.a.k(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.G6, f6Var2), (int) (((Math.abs((Math.floor(paVar.d) + 0.5d) - paVar.d) * 1.2000000476837158d) + 0.4000000059604645d) * 18.0d * e)));
            float f15 = length;
            float f16 = f15 / 2.0f;
            f6Var = f6Var2;
            f11 = 41.0f;
            float lerp = AndroidUtilities.lerp((((float) Math.floor(paVar.d)) * f15) + f16, (f15 * ((float) Math.ceil(paVar.d))) + f16, paVar.d - ((int) f13)) + paVar.getPaddingLeft();
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
        while (i11 < oaVarArr.length) {
            oa oaVar = oaVarArr[i11];
            int paddingLeft = (i11 * length) + paVar.getPaddingLeft();
            RectF rectF2 = oaVar.h;
            StaticLayout staticLayout = oaVar.e;
            org.telegram.ui.Cells.z zVar = oaVar.f26681c;
            yi0 yi0Var = oaVar.f26680b;
            int i12 = length;
            rectF2.set(paddingLeft, f14, paddingLeft + length, paVar.getHeight());
            float min2 = 1.0f - Math.min(1.0f, Math.abs(paVar.d - i11));
            org.telegram.ui.ActionBar.f6 f6Var3 = f6Var;
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.D6, f6Var3);
            int i13 = org.telegram.ui.ActionBar.j6.G6;
            int d = i0.a.d(min2, v02, org.telegram.ui.ActionBar.j6.v0(i13, f6Var3));
            oaVar.d.setColor(d);
            if (oaVar.f26688m != d) {
                oaVar.f26688m = d;
                f12 = min2;
                yi0Var.setColorFilter(new PorterDuffColorFilter(d, PorterDuff.Mode.SRC_IN));
            } else {
                f12 = min2;
            }
            Rect rect = AndroidUtilities.rectTmp2;
            float f18 = min / 2.0f;
            oa[] oaVarArr2 = oaVarArr;
            int i14 = min;
            rect.set((int) (rectF2.centerX() - f18), AndroidUtilities.dp(f7), (int) (rectF2.centerX() + f18), AndroidUtilities.dp(f11));
            c6 c6Var = oaVar.f26684i;
            if (f12 > 0.6f) {
                z10 = true;
            } else {
                z10 = false;
            }
            float e7 = c6Var.e(z10);
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
            yi0Var.setBounds(rect);
            yi0Var.draw(canvas);
            canvas.save();
            canvas.translate((rectF2.centerX() - (oaVar.f26682f / 2.0f)) - oaVar.f26683g, AndroidUtilities.dp(50.0f) - (staticLayout.getHeight() / 2.0f));
            staticLayout.draw(canvas);
            canvas.restore();
            i11++;
            paVar = this;
            f6Var = f6Var3;
            length = i12;
            oaVarArr = oaVarArr2;
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
            this.f26972r = true;
            return true;
        }
        int action = motionEvent.getAction();
        oa[] oaVarArr = this.f26968b;
        if (action != 1 && motionEvent.getAction() != 2) {
            if (motionEvent.getAction() == 3) {
                for (oa oaVar : oaVarArr) {
                    oaVar.f26681c.setState(new int[0]);
                }
                this.f26972r = false;
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
                            if (this.f26972r) {
                                oaVarArr[i10].f26681c.setState(new int[0]);
                            }
                            oaVarArr[i10].f26681c.setState(new int[]{16842919, 16842910});
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
                    oaVarArr[i11].f26681c.setState(new int[0]);
                }
            }
            if (i10 >= 0 && this.e != i10 && (callback = this.f26971n) != null) {
                callback.run(Integer.valueOf(i10));
            }
            this.f26972r = false;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setOnTabClick(Utilities.Callback<Integer> callback) {
        this.f26971n = callback;
    }

    public void setProgress(float f7) {
        a(f7, true);
    }

    public void setScrolling(boolean z10) {
        if (this.f26970f == z10) {
            return;
        }
        this.f26970f = z10;
        invalidate();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        int i10 = 0;
        while (true) {
            oa[] oaVarArr = this.f26968b;
            if (i10 < oaVarArr.length) {
                if (oaVarArr[i10].f26681c == drawable) {
                    return true;
                }
                i10++;
            } else {
                return super.verifyDrawable(drawable);
            }
        }
    }
}
