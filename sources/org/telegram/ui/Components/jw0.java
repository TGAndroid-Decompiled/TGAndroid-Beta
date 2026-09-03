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
public final class jw0 extends View {
    public final q9 f28205a;
    public final hw0 f28206b;
    public final z5 f28207c;
    public boolean d;
    public iw0 f28208e;
    public boolean f28209f;
    public boolean h;

    public jw0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f27642c = -16777216;
        obj.d = -1;
        this.f28206b = obj;
        z5 z5Var = new z5(new gw0(this, 0), 380L, pr.h);
        this.f28207c = z5Var;
        q9 q9Var = new q9(context);
        this.f28205a = q9Var;
        q9Var.setCallback(this);
        this.d = false;
        z5Var.d(0.0f, false);
        a();
    }

    public final void a() {
        boolean z4;
        if (this.h && this.f28209f) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.d = z4;
        this.f28207c.e(z4);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public final void b(MessagesController.PeerColor peerColor) {
        this.f28206b.a(peerColor);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.f28207c.f33763c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28205a.getClass();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28205a.getClass();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float e6 = this.f28207c.e(this.d);
        int x10 = org.telegram.ui.b.x(24.0f, getMeasuredWidth(), 2);
        canvas.save();
        canvas.translate(x10, (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2);
        canvas.scale(e6, e6, 0.0f, AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        q9 q9Var = this.f28205a;
        q9Var.setBounds(0, 0, dp, dp2);
        hw0 hw0Var = this.f28206b;
        int i10 = hw0Var.f27642c;
        if (q9Var.f30364f != i10) {
            q9Var.f30364f = i10;
            if (q9Var.f30362c != null) {
                q9Var.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                q9Var.invalidateSelf();
            }
        }
        int i11 = hw0Var.d;
        if (q9Var.f30363e != i11) {
            q9Var.f30363e = i11;
            Drawable drawable = q9Var.f30362c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                q9Var.invalidateSelf();
            }
        }
        int i12 = hw0Var.f27642c | (-16777216);
        if (q9Var.h != i12) {
            q9Var.h = i12;
            q9Var.f30361b.s(i12, false);
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
        this.f28209f = z4;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i11 = tl_starsRating.level;
        q9 q9Var = this.f28205a;
        if (q9Var.f30366r != i11 || q9Var.f30362c == null || q9Var.d == null) {
            j6 j6Var = q9Var.f30361b;
            if (i11 >= 0) {
                str = Integer.toString(i11);
            } else {
                str = "!";
            }
            j6Var.q(str, true, true);
            q9Var.f30366r = i11;
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
            Context context = q9Var.f30360a;
            if (q9Var.f30365n != b10 || q9Var.f30362c == null || q9Var.d == null) {
                int i12 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(q9.f30359s[i12]).mutate();
                q9Var.f30362c = mutate;
                int i13 = q9Var.f30363e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i13, mode);
                Drawable mutate2 = context.getResources().getDrawable(q9.f30359s[i12 + 1]).mutate();
                q9Var.d = mutate2;
                mutate2.setColorFilter(q9Var.f30364f, mode);
                q9Var.f30365n = b10;
                Drawable drawable = q9Var.f30362c;
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

    public void setDelegate(iw0 iw0Var) {
        this.f28208e = iw0Var;
    }

    public void setParentExpanded(float f10) {
        hw0 hw0Var = this.f28206b;
        hw0Var.f27643e = f10;
        hw0Var.a(hw0Var.f27640a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.g6 g6Var) {
        this.f28206b.f27641b = g6Var;
    }

    public void setVisibility(boolean z4) {
        this.h = z4;
        a();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f28205a) {
            return false;
        }
        return true;
    }
}
