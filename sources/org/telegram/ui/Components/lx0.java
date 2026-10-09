package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
public final class lx0 extends View {
    public final z9 f28619a;
    public final jx0 f28620b;
    public final g6 f28621c;
    public boolean d;
    public kx0 f28622e;
    public boolean f28623f;
    public boolean h;

    public lx0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f27791c = -16777216;
        obj.d = -1;
        this.f28620b = obj;
        g6 g6Var = new g6(new ix0(this, 0), 380L, hs.h);
        this.f28621c = g6Var;
        z9 z9Var = new z9(context);
        this.f28619a = z9Var;
        z9Var.setCallback(this);
        this.d = false;
        g6Var.d(0.0f, false);
        a();
    }

    public final void a() {
        boolean z10;
        if (this.h && this.f28623f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.f28621c.e(z10);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public final void b(MessagesController.PeerColor peerColor) {
        this.f28620b.a(peerColor);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.f28621c.f26599c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28619a.getClass();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28619a.getClass();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float e7 = this.f28621c.e(this.d);
        int A = org.telegram.messenger.bi.A(24.0f, getMeasuredWidth(), 2);
        canvas.save();
        canvas.translate(A, (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2);
        canvas.scale(e7, e7, 0.0f, AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        z9 z9Var = this.f28619a;
        z9Var.setBounds(0, 0, dp, dp2);
        jx0 jx0Var = this.f28620b;
        int i10 = jx0Var.f27791c;
        if (z9Var.f33505f != i10) {
            z9Var.f33505f = i10;
            if (z9Var.f33503c != null) {
                z9Var.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                z9Var.invalidateSelf();
            }
        }
        int i11 = jx0Var.d;
        if (z9Var.f33504e != i11) {
            z9Var.f33504e = i11;
            Drawable drawable = z9Var.f33503c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                z9Var.invalidateSelf();
            }
        }
        int i12 = jx0Var.f27791c | (-16777216);
        if (z9Var.h != i12) {
            z9Var.h = i12;
            z9Var.f33502b.v(i12, false);
            z9Var.invalidateSelf();
        }
        z9Var.draw(canvas);
        canvas.restore();
    }

    public void set(TL_stars.Tl_starsRating tl_starsRating) {
        boolean z10;
        String str;
        int i10;
        int b10;
        if (tl_starsRating != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f28623f = z10;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i11 = tl_starsRating.level;
        z9 z9Var = this.f28619a;
        if (z9Var.f33507r != i11 || z9Var.f33503c == null || z9Var.d == null) {
            q6 q6Var = z9Var.f33502b;
            if (i11 >= 0) {
                str = Integer.toString(i11);
            } else {
                str = "!";
            }
            q6Var.t(str, true, true);
            z9Var.f33507r = i11;
            if (i11 < 0) {
                b10 = 18;
            } else {
                if (i11 <= 10) {
                    i10 = i11 - 1;
                } else {
                    i10 = (i11 / 10) + 8;
                }
                b10 = w7.o.b(i10, 0, 17);
            }
            Context context = z9Var.f33501a;
            if (z9Var.f33506n != b10 || z9Var.f33503c == null || z9Var.d == null) {
                int i12 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(z9.f33500s[i12]).mutate();
                z9Var.f33503c = mutate;
                int i13 = z9Var.f33504e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i13, mode);
                Drawable mutate2 = context.getResources().getDrawable(z9.f33500s[i12 + 1]).mutate();
                z9Var.d = mutate2;
                mutate2.setColorFilter(z9Var.f33505f, mode);
                z9Var.f33506n = b10;
                Drawable drawable = z9Var.f33503c;
                if (drawable != null) {
                    drawable.setBounds(z9Var.getBounds());
                }
                Drawable drawable2 = z9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(z9Var.getBounds());
                }
            }
            z9Var.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.Cells.c1.l(R.string.AccDescrProfileRatingLevel, " ", sb2);
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(kx0 kx0Var) {
        this.f28622e = kx0Var;
    }

    public void setParentExpanded(float f7) {
        jx0 jx0Var = this.f28620b;
        jx0Var.f27792e = f7;
        jx0Var.a(jx0Var.f27789a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.e6 e6Var) {
        this.f28620b.f27790b = e6Var;
    }

    public void setVisibility(boolean z10) {
        this.h = z10;
        a();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f28619a) {
            return false;
        }
        return true;
    }
}
