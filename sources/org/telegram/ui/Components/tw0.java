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
    public final x9 f27503a;
    public final rw0 f27504b;
    public final d6 f27505c;
    public boolean d;
    public sw0 e;
    public boolean f27506f;
    public boolean h;

    public tw0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f26774c = -16777216;
        obj.d = -1;
        this.f27504b = obj;
        d6 d6Var = new d6(new qw0(this, 0), 380L, wr.h);
        this.f27505c = d6Var;
        x9 x9Var = new x9(context);
        this.f27503a = x9Var;
        x9Var.setCallback(this);
        this.d = false;
        d6Var.d(0.0f, false);
        a();
    }

    public final void a() {
        boolean z10;
        if (this.h && this.f27506f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.f27505c.e(z10);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public final void b(MessagesController.PeerColor peerColor) {
        this.f27504b.a(peerColor);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.f27505c.f22295c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27503a.getClass();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27503a.getClass();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float e = this.f27505c.e(this.d);
        int y3 = org.telegram.messenger.em.y(24.0f, getMeasuredWidth(), 2);
        canvas.save();
        canvas.translate(y3, (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2);
        canvas.scale(e, e, 0.0f, AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        x9 x9Var = this.f27503a;
        x9Var.setBounds(0, 0, dp, dp2);
        rw0 rw0Var = this.f27504b;
        int i10 = rw0Var.f26774c;
        if (x9Var.f28981f != i10) {
            x9Var.f28981f = i10;
            if (x9Var.f28980c != null) {
                x9Var.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                x9Var.invalidateSelf();
            }
        }
        int i11 = rw0Var.d;
        if (x9Var.e != i11) {
            x9Var.e = i11;
            Drawable drawable = x9Var.f28980c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                x9Var.invalidateSelf();
            }
        }
        int i12 = rw0Var.f26774c | (-16777216);
        if (x9Var.h != i12) {
            x9Var.h = i12;
            x9Var.f28979b.s(i12, false);
            x9Var.invalidateSelf();
        }
        x9Var.draw(canvas);
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
        this.f27506f = z10;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i11 = tl_starsRating.level;
        x9 x9Var = this.f27503a;
        if (x9Var.f28983r != i11 || x9Var.f28980c == null || x9Var.d == null) {
            n6 n6Var = x9Var.f28979b;
            if (i11 >= 0) {
                str = Integer.toString(i11);
            } else {
                str = "!";
            }
            n6Var.q(str, true, true);
            x9Var.f28983r = i11;
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
            Context context = x9Var.f28978a;
            if (x9Var.f28982n != b10 || x9Var.f28980c == null || x9Var.d == null) {
                int i12 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(x9.f28977s[i12]).mutate();
                x9Var.f28980c = mutate;
                int i13 = x9Var.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i13, mode);
                Drawable mutate2 = context.getResources().getDrawable(x9.f28977s[i12 + 1]).mutate();
                x9Var.d = mutate2;
                mutate2.setColorFilter(x9Var.f28981f, mode);
                x9Var.f28982n = b10;
                Drawable drawable = x9Var.f28980c;
                if (drawable != null) {
                    drawable.setBounds(x9Var.getBounds());
                }
                Drawable drawable2 = x9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(x9Var.getBounds());
                }
            }
            x9Var.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.messenger.em.l(R.string.AccDescrProfileRatingLevel, " ", sb2);
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(sw0 sw0Var) {
        this.e = sw0Var;
    }

    public void setParentExpanded(float f7) {
        rw0 rw0Var = this.f27504b;
        rw0Var.e = f7;
        rw0Var.a(rw0Var.f26772a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.f6 f6Var) {
        this.f27504b.f26773b = f6Var;
    }

    public void setVisibility(boolean z10) {
        this.h = z10;
        a();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f27503a) {
            return false;
        }
        return true;
    }
}
