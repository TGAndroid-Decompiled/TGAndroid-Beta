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
public final class rx0 extends View {
    public final z9 f30270a;
    public final px0 f30271b;
    public final g6 f30272c;
    public boolean d;
    public qx0 f30273e;
    public boolean f30274f;
    public boolean h;

    public rx0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f29585c = -16777216;
        obj.d = -1;
        this.f30271b = obj;
        g6 g6Var = new g6(new ox0(this, 0), 380L, js.h);
        this.f30272c = g6Var;
        z9 z9Var = new z9(context);
        this.f30270a = z9Var;
        z9Var.setCallback(this);
        this.d = false;
        g6Var.d(0.0f, false);
        a();
    }

    public final void a() {
        boolean z10;
        if (this.h && this.f30274f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.f30272c.e(z10);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public final void b(MessagesController.PeerColor peerColor) {
        this.f30271b.a(peerColor);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.f30272c.f26301c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30270a.getClass();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30270a.getClass();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float e7 = this.f30272c.e(this.d);
        int A = org.telegram.messenger.am.A(24.0f, getMeasuredWidth(), 2);
        canvas.save();
        canvas.translate(A, (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2);
        canvas.scale(e7, e7, 0.0f, AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        z9 z9Var = this.f30270a;
        z9Var.setBounds(0, 0, dp, dp2);
        px0 px0Var = this.f30271b;
        int i10 = px0Var.f29585c;
        if (z9Var.f33307f != i10) {
            z9Var.f33307f = i10;
            if (z9Var.f33305c != null) {
                z9Var.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                z9Var.invalidateSelf();
            }
        }
        int i11 = px0Var.d;
        if (z9Var.f33306e != i11) {
            z9Var.f33306e = i11;
            Drawable drawable = z9Var.f33305c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                z9Var.invalidateSelf();
            }
        }
        int i12 = px0Var.f29585c | (-16777216);
        if (z9Var.h != i12) {
            z9Var.h = i12;
            z9Var.f33304b.v(i12, false);
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
        this.f30274f = z10;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i11 = tl_starsRating.level;
        z9 z9Var = this.f30270a;
        if (z9Var.f33309r != i11 || z9Var.f33305c == null || z9Var.d == null) {
            q6 q6Var = z9Var.f33304b;
            if (i11 >= 0) {
                str = Integer.toString(i11);
            } else {
                str = "!";
            }
            q6Var.t(str, true, true);
            z9Var.f33309r = i11;
            if (i11 < 0) {
                b10 = 18;
            } else {
                if (i11 <= 10) {
                    i10 = i11 - 1;
                } else {
                    i10 = (i11 / 10) + 8;
                }
                b10 = w7.n.b(i10, 0, 17);
            }
            Context context = z9Var.f33303a;
            if (z9Var.f33308n != b10 || z9Var.f33305c == null || z9Var.d == null) {
                int i12 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(z9.f33302s[i12]).mutate();
                z9Var.f33305c = mutate;
                int i13 = z9Var.f33306e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i13, mode);
                Drawable mutate2 = context.getResources().getDrawable(z9.f33302s[i12 + 1]).mutate();
                z9Var.d = mutate2;
                mutate2.setColorFilter(z9Var.f33307f, mode);
                z9Var.f33308n = b10;
                Drawable drawable = z9Var.f33305c;
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

    public void setDelegate(qx0 qx0Var) {
        this.f30273e = qx0Var;
    }

    public void setParentExpanded(float f7) {
        px0 px0Var = this.f30271b;
        px0Var.f29586e = f7;
        px0Var.a(px0Var.f29583a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.c6 c6Var) {
        this.f30271b.f29584b = c6Var;
    }

    public void setVisibility(boolean z10) {
        this.h = z10;
        a();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f30270a) {
            return false;
        }
        return true;
    }
}
