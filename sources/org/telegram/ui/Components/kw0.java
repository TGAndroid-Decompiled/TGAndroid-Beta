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
public final class kw0 extends View {
    public final q9 f28467a;
    public final iw0 f28468b;
    public final z5 f28469c;
    public boolean d;
    public jw0 f28470e;
    public boolean f28471f;
    public boolean h;

    public kw0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f27917c = -16777216;
        obj.d = -1;
        this.f28468b = obj;
        z5 z5Var = new z5(new hw0(this, 0), 380L, pr.h);
        this.f28469c = z5Var;
        q9 q9Var = new q9(context);
        this.f28467a = q9Var;
        q9Var.setCallback(this);
        this.d = false;
        z5Var.d(0.0f, false);
        a();
    }

    public final void a() {
        boolean z4;
        if (this.h && this.f28471f) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.d = z4;
        this.f28469c.e(z4);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public final void b(MessagesController.PeerColor peerColor) {
        this.f28468b.a(peerColor);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.f28469c.f33725c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28467a.getClass();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28467a.getClass();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float e6 = this.f28469c.e(this.d);
        int x10 = org.telegram.ui.b.x(24.0f, getMeasuredWidth(), 2);
        canvas.save();
        canvas.translate(x10, (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2);
        canvas.scale(e6, e6, 0.0f, AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        q9 q9Var = this.f28467a;
        q9Var.setBounds(0, 0, dp, dp2);
        iw0 iw0Var = this.f28468b;
        int i10 = iw0Var.f27917c;
        if (q9Var.f30348f != i10) {
            q9Var.f30348f = i10;
            if (q9Var.f30346c != null) {
                q9Var.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                q9Var.invalidateSelf();
            }
        }
        int i11 = iw0Var.d;
        if (q9Var.f30347e != i11) {
            q9Var.f30347e = i11;
            Drawable drawable = q9Var.f30346c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                q9Var.invalidateSelf();
            }
        }
        int i12 = iw0Var.f27917c | (-16777216);
        if (q9Var.h != i12) {
            q9Var.h = i12;
            q9Var.f30345b.s(i12, false);
            q9Var.invalidateSelf();
        }
        q9Var.draw(canvas);
        canvas.restore();
    }

    public void set(TL_stars.Tl_starsRating tl_starsRating) {
        boolean z4;
        String str;
        int i10;
        int b10;
        if (tl_starsRating != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f28471f = z4;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i11 = tl_starsRating.level;
        q9 q9Var = this.f28467a;
        if (q9Var.f30350r != i11 || q9Var.f30346c == null || q9Var.d == null) {
            j6 j6Var = q9Var.f30345b;
            if (i11 >= 0) {
                str = Integer.toString(i11);
            } else {
                str = "!";
            }
            j6Var.q(str, true, true);
            q9Var.f30350r = i11;
            if (i11 < 0) {
                b10 = 18;
            } else {
                if (i11 <= 10) {
                    i10 = i11 - 1;
                } else {
                    i10 = (i11 / 10) + 8;
                }
                b10 = k7.o.b(i10, 0, 17);
            }
            Context context = q9Var.f30344a;
            if (q9Var.f30349n != b10 || q9Var.f30346c == null || q9Var.d == null) {
                int i12 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(q9.f30343s[i12]).mutate();
                q9Var.f30346c = mutate;
                int i13 = q9Var.f30347e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i13, mode);
                Drawable mutate2 = context.getResources().getDrawable(q9.f30343s[i12 + 1]).mutate();
                q9Var.d = mutate2;
                mutate2.setColorFilter(q9Var.f30348f, mode);
                q9Var.f30349n = b10;
                Drawable drawable = q9Var.f30346c;
                if (drawable != null) {
                    drawable.setBounds(q9Var.getBounds());
                }
                Drawable drawable2 = q9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(q9Var.getBounds());
                }
            }
            q9Var.invalidateSelf();
        }
        StringBuilder sb = new StringBuilder();
        org.telegram.ui.b.i(R.string.AccDescrProfileRatingLevel, " ", sb);
        sb.append(tl_starsRating.level);
        setContentDescription(sb.toString());
        invalidate();
    }

    public void setDelegate(jw0 jw0Var) {
        this.f28470e = jw0Var;
    }

    public void setParentExpanded(float f10) {
        iw0 iw0Var = this.f28468b;
        iw0Var.f27918e = f10;
        iw0Var.a(iw0Var.f27915a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.g6 g6Var) {
        this.f28468b.f27916b = g6Var;
    }

    public void setVisibility(boolean z4) {
        this.h = z4;
        a();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f28467a) {
            return false;
        }
        return true;
    }
}
