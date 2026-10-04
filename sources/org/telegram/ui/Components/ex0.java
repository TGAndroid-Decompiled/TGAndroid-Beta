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
    public final x9 f26166a;
    public final cx0 f26167b;
    public final e6 f26168c;
    public boolean d;
    public dx0 f26169e;
    public boolean f26170f;
    public boolean h;

    public ex0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f25471c = -16777216;
        obj.d = -1;
        this.f26167b = obj;
        e6 e6Var = new e6(new bx0(this, 0), 380L, tr.h);
        this.f26168c = e6Var;
        x9 x9Var = new x9(context);
        this.f26166a = x9Var;
        x9Var.setCallback(this);
        this.d = false;
        e6Var.d(0.0f, false);
        a();
    }

    public final void a() {
        boolean z10;
        if (this.h && this.f26170f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.f26168c.e(z10);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public final void b(MessagesController.PeerColor peerColor) {
        this.f26167b.a(peerColor);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.f26168c.f25934c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26166a.getClass();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26166a.getClass();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float e7 = this.f26168c.e(this.d);
        int z10 = org.telegram.messenger.ok.z(24.0f, getMeasuredWidth(), 2);
        canvas.save();
        canvas.translate(z10, (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2);
        canvas.scale(e7, e7, 0.0f, AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        x9 x9Var = this.f26166a;
        x9Var.setBounds(0, 0, dp, dp2);
        cx0 cx0Var = this.f26167b;
        int i10 = cx0Var.f25471c;
        if (x9Var.f32742f != i10) {
            x9Var.f32742f = i10;
            if (x9Var.f32740c != null) {
                x9Var.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                x9Var.invalidateSelf();
            }
        }
        int i11 = cx0Var.d;
        if (x9Var.f32741e != i11) {
            x9Var.f32741e = i11;
            Drawable drawable = x9Var.f32740c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                x9Var.invalidateSelf();
            }
        }
        int i12 = cx0Var.f25471c | (-16777216);
        if (x9Var.h != i12) {
            x9Var.h = i12;
            x9Var.f32739b.s(i12, false);
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
        this.f26170f = z10;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i11 = tl_starsRating.level;
        x9 x9Var = this.f26166a;
        if (x9Var.f32744r != i11 || x9Var.f32740c == null || x9Var.d == null) {
            o6 o6Var = x9Var.f32739b;
            if (i11 >= 0) {
                str = Integer.toString(i11);
            } else {
                str = "!";
            }
            o6Var.q(str, true, true);
            x9Var.f32744r = i11;
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
            Context context = x9Var.f32738a;
            if (x9Var.f32743n != b10 || x9Var.f32740c == null || x9Var.d == null) {
                int i12 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(x9.f32737s[i12]).mutate();
                x9Var.f32740c = mutate;
                int i13 = x9Var.f32741e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i13, mode);
                Drawable mutate2 = context.getResources().getDrawable(x9.f32737s[i12 + 1]).mutate();
                x9Var.d = mutate2;
                mutate2.setColorFilter(x9Var.f32742f, mode);
                x9Var.f32743n = b10;
                Drawable drawable = x9Var.f32740c;
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
        this.f26169e = dx0Var;
    }

    public void setParentExpanded(float f7) {
        cx0 cx0Var = this.f26167b;
        cx0Var.f25472e = f7;
        cx0Var.a(cx0Var.f25469a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.d6 d6Var) {
        this.f26167b.f25470b = d6Var;
    }

    public void setVisibility(boolean z10) {
        this.h = z10;
        a();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f26166a) {
            return false;
        }
        return true;
    }
}
