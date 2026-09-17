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
    public final v9 f25453a;
    public final hw0 f25454b;
    public final c6 f25455c;
    public boolean d;
    public iw0 e;
    public boolean f25456f;
    public boolean h;

    public jw0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f24743c = -16777216;
        obj.d = -1;
        this.f25454b = obj;
        c6 c6Var = new c6(new gw0(this, 0), 380L, qr.h);
        this.f25455c = c6Var;
        v9 v9Var = new v9(context);
        this.f25453a = v9Var;
        v9Var.setCallback(this);
        this.d = false;
        c6Var.d(0.0f, false);
        a();
    }

    public final void a() {
        boolean z10;
        if (this.h && this.f25456f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.f25455c.e(z10);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public final void b(MessagesController.PeerColor peerColor) {
        this.f25454b.a(peerColor);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.f25455c.f22937c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f25453a.getClass();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25453a.getClass();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float e = this.f25455c.e(this.d);
        int y3 = org.telegram.messenger.wl.y(24.0f, getMeasuredWidth(), 2);
        canvas.save();
        canvas.translate(y3, (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2);
        canvas.scale(e, e, 0.0f, AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        v9 v9Var = this.f25453a;
        v9Var.setBounds(0, 0, dp, dp2);
        hw0 hw0Var = this.f25454b;
        int i10 = hw0Var.f24743c;
        if (v9Var.f28663f != i10) {
            v9Var.f28663f = i10;
            if (v9Var.f28662c != null) {
                v9Var.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                v9Var.invalidateSelf();
            }
        }
        int i11 = hw0Var.d;
        if (v9Var.e != i11) {
            v9Var.e = i11;
            Drawable drawable = v9Var.f28662c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                v9Var.invalidateSelf();
            }
        }
        int i12 = hw0Var.f24743c | (-16777216);
        if (v9Var.h != i12) {
            v9Var.h = i12;
            v9Var.f28661b.s(i12, false);
            v9Var.invalidateSelf();
        }
        v9Var.draw(canvas);
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
        this.f25456f = z10;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i11 = tl_starsRating.level;
        v9 v9Var = this.f25453a;
        if (v9Var.f28665r != i11 || v9Var.f28662c == null || v9Var.d == null) {
            m6 m6Var = v9Var.f28661b;
            if (i11 >= 0) {
                str = Integer.toString(i11);
            } else {
                str = "!";
            }
            m6Var.q(str, true, true);
            v9Var.f28665r = i11;
            if (i11 < 0) {
                b10 = 18;
            } else {
                if (i11 <= 10) {
                    i10 = i11 - 1;
                } else {
                    i10 = (i11 / 10) + 8;
                }
                b10 = w7.p.b(i10, 0, 17);
            }
            Context context = v9Var.f28660a;
            if (v9Var.f28664n != b10 || v9Var.f28662c == null || v9Var.d == null) {
                int i12 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(v9.f28659s[i12]).mutate();
                v9Var.f28662c = mutate;
                int i13 = v9Var.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i13, mode);
                Drawable mutate2 = context.getResources().getDrawable(v9.f28659s[i12 + 1]).mutate();
                v9Var.d = mutate2;
                mutate2.setColorFilter(v9Var.f28663f, mode);
                v9Var.f28664n = b10;
                Drawable drawable = v9Var.f28662c;
                if (drawable != null) {
                    drawable.setBounds(v9Var.getBounds());
                }
                Drawable drawable2 = v9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(v9Var.getBounds());
                }
            }
            v9Var.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.messenger.wl.l(R.string.AccDescrProfileRatingLevel, " ", sb2);
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(iw0 iw0Var) {
        this.e = iw0Var;
    }

    public void setParentExpanded(float f7) {
        hw0 hw0Var = this.f25454b;
        hw0Var.e = f7;
        hw0Var.a(hw0Var.f24741a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.f6 f6Var) {
        this.f25454b.f24742b = f6Var;
    }

    public void setVisibility(boolean z10) {
        this.h = z10;
        a();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f25453a) {
            return false;
        }
        return true;
    }
}
