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
public final class cx0 extends View {
    public final x9 f25397a;
    public final ax0 f25398b;
    public final f6 f25399c;
    public boolean d;
    public bx0 e;
    public boolean f25400f;
    public boolean h;

    public cx0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f24730c = -16777216;
        obj.d = -1;
        this.f25398b = obj;
        f6 f6Var = new f6(new zw0(this, 0), 380L, bs.h);
        this.f25399c = f6Var;
        x9 x9Var = new x9(context);
        this.f25397a = x9Var;
        x9Var.setCallback(this);
        this.d = false;
        f6Var.d(0.0f, false);
        a();
    }

    public final void a() {
        boolean z10;
        if (this.h && this.f25400f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.f25399c.e(z10);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public final void b(MessagesController.PeerColor peerColor) {
        this.f25398b.a(peerColor);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.f25399c.f26093c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f25397a.getClass();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25397a.getClass();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float e = this.f25399c.e(this.d);
        int A = org.telegram.messenger.lk.A(24.0f, getMeasuredWidth(), 2);
        canvas.save();
        canvas.translate(A, (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2);
        canvas.scale(e, e, 0.0f, AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        x9 x9Var = this.f25397a;
        x9Var.setBounds(0, 0, dp, dp2);
        ax0 ax0Var = this.f25398b;
        int i10 = ax0Var.f24730c;
        if (x9Var.f32344f != i10) {
            x9Var.f32344f = i10;
            if (x9Var.f32343c != null) {
                x9Var.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                x9Var.invalidateSelf();
            }
        }
        int i11 = ax0Var.d;
        if (x9Var.e != i11) {
            x9Var.e = i11;
            Drawable drawable = x9Var.f32343c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                x9Var.invalidateSelf();
            }
        }
        int i12 = ax0Var.f24730c | (-16777216);
        if (x9Var.h != i12) {
            x9Var.h = i12;
            x9Var.f32342b.v(i12, false);
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
        this.f25400f = z10;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i11 = tl_starsRating.level;
        x9 x9Var = this.f25397a;
        if (x9Var.f32346r != i11 || x9Var.f32343c == null || x9Var.d == null) {
            p6 p6Var = x9Var.f32342b;
            if (i11 >= 0) {
                str = Integer.toString(i11);
            } else {
                str = "!";
            }
            p6Var.t(str, true, true);
            x9Var.f32346r = i11;
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
            Context context = x9Var.f32341a;
            if (x9Var.f32345n != b10 || x9Var.f32343c == null || x9Var.d == null) {
                int i12 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(x9.f32340s[i12]).mutate();
                x9Var.f32343c = mutate;
                int i13 = x9Var.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i13, mode);
                Drawable mutate2 = context.getResources().getDrawable(x9.f32340s[i12 + 1]).mutate();
                x9Var.d = mutate2;
                mutate2.setColorFilter(x9Var.f32344f, mode);
                x9Var.f32345n = b10;
                Drawable drawable = x9Var.f32343c;
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

    public void setDelegate(bx0 bx0Var) {
        this.e = bx0Var;
    }

    public void setParentExpanded(float f7) {
        ax0 ax0Var = this.f25398b;
        ax0Var.e = f7;
        ax0Var.a(ax0Var.f24728a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.d6 d6Var) {
        this.f25398b.f24729b = d6Var;
    }

    public void setVisibility(boolean z10) {
        this.h = z10;
        a();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f25397a) {
            return false;
        }
        return true;
    }
}
