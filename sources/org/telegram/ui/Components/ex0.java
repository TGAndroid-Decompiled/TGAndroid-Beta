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
public final class ex0 extends View {
    public final x9 f25989a;
    public final cx0 f25990b;
    public final f6 f25991c;
    public boolean d;
    public dx0 e;
    public boolean f25992f;
    public boolean h;

    public ex0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f25281c = -16777216;
        obj.d = -1;
        this.f25990b = obj;
        f6 f6Var = new f6(new bx0(this, 0), 380L, bs.h);
        this.f25991c = f6Var;
        x9 x9Var = new x9(context);
        this.f25989a = x9Var;
        x9Var.setCallback(this);
        this.d = false;
        f6Var.d(0.0f, false);
        a();
    }

    public final void a() {
        boolean z10;
        if (this.h && this.f25992f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.f25991c.e(z10);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public final void b(MessagesController.PeerColor peerColor) {
        this.f25990b.a(peerColor);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.f25991c.f26089c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f25989a.getClass();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25989a.getClass();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float e = this.f25991c.e(this.d);
        int A = org.telegram.messenger.ok.A(24.0f, getMeasuredWidth(), 2);
        canvas.save();
        canvas.translate(A, (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2);
        canvas.scale(e, e, 0.0f, AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        x9 x9Var = this.f25989a;
        x9Var.setBounds(0, 0, dp, dp2);
        cx0 cx0Var = this.f25990b;
        int i10 = cx0Var.f25281c;
        if (x9Var.f32375f != i10) {
            x9Var.f32375f = i10;
            if (x9Var.f32374c != null) {
                x9Var.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                x9Var.invalidateSelf();
            }
        }
        int i11 = cx0Var.d;
        if (x9Var.e != i11) {
            x9Var.e = i11;
            Drawable drawable = x9Var.f32374c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                x9Var.invalidateSelf();
            }
        }
        int i12 = cx0Var.f25281c | (-16777216);
        if (x9Var.h != i12) {
            x9Var.h = i12;
            x9Var.f32373b.v(i12, false);
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
        this.f25992f = z10;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i11 = tl_starsRating.level;
        x9 x9Var = this.f25989a;
        if (x9Var.f32377r != i11 || x9Var.f32374c == null || x9Var.d == null) {
            p6 p6Var = x9Var.f32373b;
            if (i11 >= 0) {
                str = Integer.toString(i11);
            } else {
                str = "!";
            }
            p6Var.t(str, true, true);
            x9Var.f32377r = i11;
            if (i11 < 0) {
                b10 = 18;
            } else {
                if (i11 <= 10) {
                    i10 = i11 - 1;
                } else {
                    i10 = (i11 / 10) + 8;
                }
                b10 = w7.r.b(i10, 0, 17);
            }
            Context context = x9Var.f32372a;
            if (x9Var.f32376n != b10 || x9Var.f32374c == null || x9Var.d == null) {
                int i12 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(x9.f32371s[i12]).mutate();
                x9Var.f32374c = mutate;
                int i13 = x9Var.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i13, mode);
                Drawable mutate2 = context.getResources().getDrawable(x9.f32371s[i12 + 1]).mutate();
                x9Var.d = mutate2;
                mutate2.setColorFilter(x9Var.f32375f, mode);
                x9Var.f32376n = b10;
                Drawable drawable = x9Var.f32374c;
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
        org.telegram.ui.Cells.c1.n(R.string.AccDescrProfileRatingLevel, " ", sb2);
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(dx0 dx0Var) {
        this.e = dx0Var;
    }

    public void setParentExpanded(float f7) {
        cx0 cx0Var = this.f25990b;
        cx0Var.e = f7;
        cx0Var.a(cx0Var.f25279a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.d6 d6Var) {
        this.f25990b.f25280b = d6Var;
    }

    public void setVisibility(boolean z10) {
        this.h = z10;
        a();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f25989a) {
            return false;
        }
        return true;
    }
}
