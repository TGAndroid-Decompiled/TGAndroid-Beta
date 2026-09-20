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
public final class tw0 extends View {
    public final w9 f28462a;
    public final rw0 f28463b;
    public final d6 f28464c;
    public boolean d;
    public sw0 e;
    public boolean f28465f;
    public boolean h;

    public tw0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f27963c = -16777216;
        obj.d = -1;
        this.f28463b = obj;
        d6 d6Var = new d6(new qw0(this, 0), 380L, qr.h);
        this.f28464c = d6Var;
        w9 w9Var = new w9(context);
        this.f28462a = w9Var;
        w9Var.setCallback(this);
        this.d = false;
        d6Var.d(0.0f, false);
        a();
    }

    public final void a() {
        boolean z10;
        if (this.h && this.f28465f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.f28464c.e(z10);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public final void b(MessagesController.PeerColor peerColor) {
        this.f28463b.a(peerColor);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.f28464c.f23501c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28462a.getClass();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28462a.getClass();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float e = this.f28464c.e(this.d);
        int z10 = org.telegram.messenger.rk.z(24.0f, getMeasuredWidth(), 2);
        canvas.save();
        canvas.translate(z10, (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2);
        canvas.scale(e, e, 0.0f, AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        w9 w9Var = this.f28462a;
        w9Var.setBounds(0, 0, dp, dp2);
        rw0 rw0Var = this.f28463b;
        int i10 = rw0Var.f27963c;
        if (w9Var.f30012f != i10) {
            w9Var.f30012f = i10;
            if (w9Var.f30011c != null) {
                w9Var.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                w9Var.invalidateSelf();
            }
        }
        int i11 = rw0Var.d;
        if (w9Var.e != i11) {
            w9Var.e = i11;
            Drawable drawable = w9Var.f30011c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                w9Var.invalidateSelf();
            }
        }
        int i12 = rw0Var.f27963c | (-16777216);
        if (w9Var.h != i12) {
            w9Var.h = i12;
            w9Var.f30010b.s(i12, false);
            w9Var.invalidateSelf();
        }
        w9Var.draw(canvas);
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
        this.f28465f = z10;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i11 = tl_starsRating.level;
        w9 w9Var = this.f28462a;
        if (w9Var.f30014r != i11 || w9Var.f30011c == null || w9Var.d == null) {
            n6 n6Var = w9Var.f30010b;
            if (i11 >= 0) {
                str = Integer.toString(i11);
            } else {
                str = "!";
            }
            n6Var.q(str, true, true);
            w9Var.f30014r = i11;
            if (i11 < 0) {
                b10 = 18;
            } else {
                if (i11 <= 10) {
                    i10 = i11 - 1;
                } else {
                    i10 = (i11 / 10) + 8;
                }
                b10 = w7.q.b(i10, 0, 17);
            }
            Context context = w9Var.f30009a;
            if (w9Var.f30013n != b10 || w9Var.f30011c == null || w9Var.d == null) {
                int i12 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(w9.f30008s[i12]).mutate();
                w9Var.f30011c = mutate;
                int i13 = w9Var.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i13, mode);
                Drawable mutate2 = context.getResources().getDrawable(w9.f30008s[i12 + 1]).mutate();
                w9Var.d = mutate2;
                mutate2.setColorFilter(w9Var.f30012f, mode);
                w9Var.f30013n = b10;
                Drawable drawable = w9Var.f30011c;
                if (drawable != null) {
                    drawable.setBounds(w9Var.getBounds());
                }
                Drawable drawable2 = w9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(w9Var.getBounds());
                }
            }
            w9Var.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.Cells.c1.o(R.string.AccDescrProfileRatingLevel, " ", sb2);
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(sw0 sw0Var) {
        this.e = sw0Var;
    }

    public void setParentExpanded(float f7) {
        rw0 rw0Var = this.f28463b;
        rw0Var.e = f7;
        rw0Var.a(rw0Var.f27961a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.f6 f6Var) {
        this.f28463b.f27962b = f6Var;
    }

    public void setVisibility(boolean z10) {
        this.h = z10;
        a();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f28462a) {
            return false;
        }
        return true;
    }
}
