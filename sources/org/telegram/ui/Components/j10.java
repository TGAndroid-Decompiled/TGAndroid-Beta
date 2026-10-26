package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
public final class j10 extends FrameLayout implements org.telegram.ui.ActionBar.p6 {
    public boolean E;
    public ValueAnimator F;
    public gq G;
    public int H;
    public boolean I;
    public Paint f29437a;
    public r6 f29438b;
    public r6 f29439c;
    public float d;
    public h6 e;
    public View f29440f;
    public ShapeDrawable h;
    public float f29441n;
    public boolean f29442r;
    public ValueAnimator f29443s;
    public float v;
    public ValueAnimator f29444w;
    public int f29445x;
    public float f29446y;

    public final void a(boolean z10) {
        float f7;
        if (this.f29442r != z10) {
            ValueAnimator valueAnimator = this.f29443s;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f29443s = null;
            }
            float f10 = this.f29441n;
            this.f29442r = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.f29443s = ofFloat;
            ofFloat.addUpdateListener(new h10(this, 2));
            this.f29443s.addListener(new org.telegram.ui.jo(10, this, z10));
            this.f29443s.setDuration(320L);
            this.f29443s.setInterpolator(ds.h);
            this.f29443s.start();
        }
    }

    public final void b(CharSequence charSequence, boolean z10) {
        r6 r6Var = this.f29438b;
        if (z10) {
            r6Var.a();
        }
        r6Var.t(charSequence, z10, true);
        invalidate();
    }

    @Override
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        return false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        boolean z10;
        Paint paint = this.f29437a;
        r6 r6Var = this.f29439c;
        r6 r6Var2 = this.f29438b;
        this.f29440f.draw(canvas);
        if (this.f29441n > 0.0f) {
            if (this.G == null) {
                this.G = new gq(r6Var2.f32119a.getColor());
            }
            int dp = (int) ((1.0f - this.f29441n) * AndroidUtilities.dp(24.0f));
            this.G.setBounds(0, dp, getWidth(), getHeight() + dp);
            this.G.setAlpha((int) (this.f29441n * 255.0f));
            this.G.draw(canvas);
            invalidate();
        }
        float f7 = this.f29441n;
        if (f7 < 1.0f) {
            if (f7 != 0.0f) {
                canvas.save();
                canvas.translate(0.0f, (int) (this.f29441n * AndroidUtilities.dp(-24.0f)));
                canvas.scale(1.0f, 1.0f - (this.f29441n * 0.4f));
                z10 = true;
            } else {
                z10 = false;
            }
            float c10 = r6Var2.c();
            float d = this.e.d(this.d, false);
            float c11 = ((r6Var.c() + AndroidUtilities.dp(15.66f)) * d) + c10;
            Rect rect = AndroidUtilities.rectTmp2;
            rect.set((int) (((getMeasuredWidth() - c11) - getWidth()) / 2.0f), (int) (((getMeasuredHeight() - r6Var2.e) / 2.0f) - AndroidUtilities.dp(1.0f)), (int) org.telegram.messenger.t.b(getMeasuredWidth() - c11, getWidth(), 2.0f, c10), (int) (((getMeasuredHeight() + r6Var2.e) / 2.0f) - AndroidUtilities.dp(1.0f)));
            r6Var2.B = (int) (AndroidUtilities.lerp(0.5f, 1.0f, this.f29446y) * (1.0f - this.f29441n) * 255.0f);
            r6Var2.setBounds(rect);
            r6Var2.draw(canvas);
            rect.set((int) (c3.h0.B(getMeasuredWidth(), c11, 2.0f, c10) + AndroidUtilities.dp(5.0f)), (int) ((getMeasuredHeight() - AndroidUtilities.dp(18.0f)) / 2.0f), (int) (Math.max(AndroidUtilities.dp(9.0f), r6Var.c()) + c3.h0.B(getMeasuredWidth(), c11, 2.0f, c10) + AndroidUtilities.dp(13.0f)), (int) ((AndroidUtilities.dp(18.0f) + getMeasuredHeight()) / 2.0f));
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(rect);
            if (this.v != 1.0f) {
                canvas.save();
                float f10 = this.v;
                canvas.scale(f10, f10, rect.centerX(), rect.centerY());
            }
            paint.setAlpha((int) ((1.0f - this.f29441n) * 255.0f * d * d));
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint);
            rect.offset(-AndroidUtilities.dp(0.3f), -AndroidUtilities.dp(0.4f));
            r6Var.B = (int) org.telegram.messenger.t.A(1.0f, this.f29441n, 255.0f, d);
            r6Var.setBounds(rect);
            r6Var.draw(canvas);
            if (this.v != 1.0f) {
                canvas.restore();
            }
            if (z10) {
                canvas.restore();
            }
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) this.f29438b.f32126i);
        if (this.f29445x > 0) {
            str = ", " + LocaleController.formatPluralString("Chats", this.f29445x, new Object[0]);
        } else {
            str = "";
        }
        sb2.append(str);
        accessibilityNodeInfo.setContentDescription(sb2.toString());
    }

    @Override
    public final void setEnabled(boolean z10) {
        float f7;
        if (this.E != z10) {
            ValueAnimator valueAnimator = this.F;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.F = null;
            }
            float f10 = this.f29446y;
            this.E = z10;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            this.F = ofFloat;
            ofFloat.addUpdateListener(new h10(this, 0));
            this.F.addListener(new di.n1(1));
            this.F.start();
        }
    }

    @Override
    public final void updateColors() {
        ShapeDrawable shapeDrawable = this.h;
        r6 r6Var = this.f29438b;
        Paint paint = this.f29437a;
        if (paint != null && r6Var != null) {
            int i10 = org.telegram.ui.ActionBar.y6.Oh;
            int x02 = org.telegram.ui.ActionBar.y6.x0(null, i10, false);
            if (x02 != this.H || this.I != org.telegram.ui.ActionBar.y6.I.q()) {
                this.H = x02;
                this.I = org.telegram.ui.ActionBar.y6.I.q();
                View view = this.f29440f;
                if (view != null) {
                    view.setBackground(org.telegram.ui.ActionBar.o6.d(new float[]{8.0f}, 0, org.telegram.ui.ActionBar.o6.b(x02)));
                }
                if (shapeDrawable != null) {
                    shapeDrawable.getPaint().setColor(x02);
                    shapeDrawable.invalidateSelf();
                }
            }
            int i11 = org.telegram.ui.ActionBar.y6.Sh;
            paint.setColor(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
            r6Var.u(org.telegram.ui.ActionBar.y6.x0(null, i11, false));
            try {
                r6 r6Var2 = this.f29439c;
                if (r6Var2 != null) {
                    r6Var2.u(org.telegram.ui.ActionBar.y6.x0(null, i10, false));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
            invalidate();
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (this.f29438b != drawable && this.f29439c != drawable && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
