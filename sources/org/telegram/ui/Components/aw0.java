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
public final class aw0 extends View {
    public final u9 f26905a;
    public final yv0 f26906b;
    public final d6 f26907c;
    public boolean d;
    public zv0 f26908e;
    public boolean f26909f;
    public boolean h;

    public aw0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f35135c = -16777216;
        obj.d = -1;
        this.f26906b = obj;
        d6 d6Var = new d6(new xv0(this, 0), 380L, jr.h);
        this.f26907c = d6Var;
        u9 u9Var = new u9(context);
        this.f26905a = u9Var;
        u9Var.setCallback(this);
        this.d = false;
        d6Var.d(0.0f, false);
        a();
    }

    public final void a() {
        boolean z10;
        if (this.h && this.f26909f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.f26907c.e(z10);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public final void b(MessagesController.PeerColor peerColor) {
        this.f26906b.a(peerColor);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.f26907c.f27666c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26905a.getClass();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26905a.getClass();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float e10 = this.f26907c.e(this.d);
        int x4 = org.telegram.ui.b.x(24.0f, getMeasuredWidth(), 2);
        canvas.save();
        canvas.translate(x4, (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2);
        canvas.scale(e10, e10, 0.0f, AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        u9 u9Var = this.f26905a;
        u9Var.setBounds(0, 0, dp, dp2);
        yv0 yv0Var = this.f26906b;
        int i10 = yv0Var.f35135c;
        if (u9Var.f33176f != i10) {
            u9Var.f33176f = i10;
            if (u9Var.f33174c != null) {
                u9Var.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                u9Var.invalidateSelf();
            }
        }
        int i11 = yv0Var.d;
        if (u9Var.f33175e != i11) {
            u9Var.f33175e = i11;
            Drawable drawable = u9Var.f33174c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                u9Var.invalidateSelf();
            }
        }
        int i12 = yv0Var.f35135c | (-16777216);
        if (u9Var.h != i12) {
            u9Var.h = i12;
            u9Var.f33173b.s(i12, false);
            u9Var.invalidateSelf();
        }
        u9Var.draw(canvas);
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
        this.f26909f = z10;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i11 = tl_starsRating.level;
        u9 u9Var = this.f26905a;
        if (u9Var.f33178r != i11 || u9Var.f33174c == null || u9Var.d == null) {
            n6 n6Var = u9Var.f33173b;
            if (i11 >= 0) {
                str = Integer.toString(i11);
            } else {
                str = "!";
            }
            n6Var.q(str, true, true);
            u9Var.f33178r = i11;
            if (i11 < 0) {
                b10 = 18;
            } else {
                if (i11 <= 10) {
                    i10 = i11 - 1;
                } else {
                    i10 = (i11 / 10) + 8;
                }
                b10 = i7.w.b(i10, 0, 17);
            }
            Context context = u9Var.f33172a;
            if (u9Var.f33177n != b10 || u9Var.f33174c == null || u9Var.d == null) {
                int i12 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(u9.f33171s[i12]).mutate();
                u9Var.f33174c = mutate;
                int i13 = u9Var.f33175e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i13, mode);
                Drawable mutate2 = context.getResources().getDrawable(u9.f33171s[i12 + 1]).mutate();
                u9Var.d = mutate2;
                mutate2.setColorFilter(u9Var.f33176f, mode);
                u9Var.f33177n = b10;
                Drawable drawable = u9Var.f33174c;
                if (drawable != null) {
                    drawable.setBounds(u9Var.getBounds());
                }
                Drawable drawable2 = u9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(u9Var.getBounds());
                }
            }
            u9Var.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.b.j(R.string.AccDescrProfileRatingLevel, " ", sb2);
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(zv0 zv0Var) {
        this.f26908e = zv0Var;
    }

    public void setParentExpanded(float f9) {
        yv0 yv0Var = this.f26906b;
        yv0Var.f35136e = f9;
        yv0Var.a(yv0Var.f35133a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.c6 c6Var) {
        this.f26906b.f35134b = c6Var;
    }

    public void setVisibility(boolean z10) {
        this.h = z10;
        a();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f26905a) {
            return false;
        }
        return true;
    }
}
