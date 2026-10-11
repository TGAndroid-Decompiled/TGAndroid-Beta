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
public final class mx0 extends View {
    public final z9 f28963a;
    public final kx0 f28964b;
    public final g6 f28965c;
    public boolean d;
    public lx0 f28966e;
    public boolean f28967f;
    public boolean h;

    public mx0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f28147c = -16777216;
        obj.d = -1;
        this.f28964b = obj;
        g6 g6Var = new g6(new jx0(this, 0), 380L, is.h);
        this.f28965c = g6Var;
        z9 z9Var = new z9(context);
        this.f28963a = z9Var;
        z9Var.setCallback(this);
        this.d = false;
        g6Var.d(0.0f, false);
        a();
    }

    public final void a() {
        boolean z10;
        if (this.h && this.f28967f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.f28965c.e(z10);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public final void b(MessagesController.PeerColor peerColor) {
        this.f28964b.a(peerColor);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.f28965c.f26665c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28963a.getClass();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28963a.getClass();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float e7 = this.f28965c.e(this.d);
        int A = org.telegram.messenger.ai.A(24.0f, getMeasuredWidth(), 2);
        canvas.save();
        canvas.translate(A, (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2);
        canvas.scale(e7, e7, 0.0f, AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        z9 z9Var = this.f28963a;
        z9Var.setBounds(0, 0, dp, dp2);
        kx0 kx0Var = this.f28964b;
        int i10 = kx0Var.f28147c;
        if (z9Var.f33587f != i10) {
            z9Var.f33587f = i10;
            if (z9Var.f33585c != null) {
                z9Var.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                z9Var.invalidateSelf();
            }
        }
        int i11 = kx0Var.d;
        if (z9Var.f33586e != i11) {
            z9Var.f33586e = i11;
            Drawable drawable = z9Var.f33585c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                z9Var.invalidateSelf();
            }
        }
        int i12 = kx0Var.f28147c | (-16777216);
        if (z9Var.h != i12) {
            z9Var.h = i12;
            z9Var.f33584b.v(i12, false);
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
        this.f28967f = z10;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i11 = tl_starsRating.level;
        z9 z9Var = this.f28963a;
        if (z9Var.f33589r != i11 || z9Var.f33585c == null || z9Var.d == null) {
            q6 q6Var = z9Var.f33584b;
            if (i11 >= 0) {
                str = Integer.toString(i11);
            } else {
                str = "!";
            }
            q6Var.t(str, true, true);
            z9Var.f33589r = i11;
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
            Context context = z9Var.f33583a;
            if (z9Var.f33588n != b10 || z9Var.f33585c == null || z9Var.d == null) {
                int i12 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(z9.f33582s[i12]).mutate();
                z9Var.f33585c = mutate;
                int i13 = z9Var.f33586e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i13, mode);
                Drawable mutate2 = context.getResources().getDrawable(z9.f33582s[i12 + 1]).mutate();
                z9Var.d = mutate2;
                mutate2.setColorFilter(z9Var.f33587f, mode);
                z9Var.f33588n = b10;
                Drawable drawable = z9Var.f33585c;
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

    public void setDelegate(lx0 lx0Var) {
        this.f28966e = lx0Var;
    }

    public void setParentExpanded(float f7) {
        kx0 kx0Var = this.f28964b;
        kx0Var.f28148e = f7;
        kx0Var.a(kx0Var.f28145a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.d6 d6Var) {
        this.f28964b.f28146b = d6Var;
    }

    public void setVisibility(boolean z10) {
        this.h = z10;
        a();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f28963a) {
            return false;
        }
        return true;
    }
}
