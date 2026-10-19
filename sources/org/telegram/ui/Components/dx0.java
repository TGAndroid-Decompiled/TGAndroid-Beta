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
public final class dx0 extends View {
    public final x9 f25660a;
    public final bx0 f25661b;
    public final f6 f25662c;
    public boolean d;
    public cx0 e;
    public boolean f25663f;
    public boolean h;

    public dx0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f25035c = -16777216;
        obj.d = -1;
        this.f25661b = obj;
        f6 f6Var = new f6(new ax0(this, 0), 380L, bs.h);
        this.f25662c = f6Var;
        x9 x9Var = new x9(context);
        this.f25660a = x9Var;
        x9Var.setCallback(this);
        this.d = false;
        f6Var.d(0.0f, false);
        a();
    }

    public final void a() {
        boolean z10;
        if (this.h && this.f25663f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.f25662c.e(z10);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public final void b(MessagesController.PeerColor peerColor) {
        this.f25661b.a(peerColor);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.f25662c.f26108c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f25660a.getClass();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25660a.getClass();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float e = this.f25662c.e(this.d);
        int A = org.telegram.messenger.kk.A(24.0f, getMeasuredWidth(), 2);
        canvas.save();
        canvas.translate(A, (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2);
        canvas.scale(e, e, 0.0f, AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        x9 x9Var = this.f25660a;
        x9Var.setBounds(0, 0, dp, dp2);
        bx0 bx0Var = this.f25661b;
        int i10 = bx0Var.f25035c;
        if (x9Var.f32336f != i10) {
            x9Var.f32336f = i10;
            if (x9Var.f32335c != null) {
                x9Var.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                x9Var.invalidateSelf();
            }
        }
        int i11 = bx0Var.d;
        if (x9Var.e != i11) {
            x9Var.e = i11;
            Drawable drawable = x9Var.f32335c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                x9Var.invalidateSelf();
            }
        }
        int i12 = bx0Var.f25035c | (-16777216);
        if (x9Var.h != i12) {
            x9Var.h = i12;
            x9Var.f32334b.v(i12, false);
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
        this.f25663f = z10;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i11 = tl_starsRating.level;
        x9 x9Var = this.f25660a;
        if (x9Var.f32338r != i11 || x9Var.f32335c == null || x9Var.d == null) {
            p6 p6Var = x9Var.f32334b;
            if (i11 >= 0) {
                str = Integer.toString(i11);
            } else {
                str = "!";
            }
            p6Var.t(str, true, true);
            x9Var.f32338r = i11;
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
            Context context = x9Var.f32333a;
            if (x9Var.f32337n != b10 || x9Var.f32335c == null || x9Var.d == null) {
                int i12 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(x9.f32332s[i12]).mutate();
                x9Var.f32335c = mutate;
                int i13 = x9Var.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i13, mode);
                Drawable mutate2 = context.getResources().getDrawable(x9.f32332s[i12 + 1]).mutate();
                x9Var.d = mutate2;
                mutate2.setColorFilter(x9Var.f32336f, mode);
                x9Var.f32337n = b10;
                Drawable drawable = x9Var.f32335c;
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

    public void setDelegate(cx0 cx0Var) {
        this.e = cx0Var;
    }

    public void setParentExpanded(float f7) {
        bx0 bx0Var = this.f25661b;
        bx0Var.e = f7;
        bx0Var.a(bx0Var.f25033a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.d6 d6Var) {
        this.f25661b.f25034b = d6Var;
    }

    public void setVisibility(boolean z10) {
        this.h = z10;
        a();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f25660a) {
            return false;
        }
        return true;
    }
}
