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
public final class hw0 extends View {
    public final y9 f26909a;
    public final fw0 f26910b;
    public final e6 f26911c;
    public boolean d;
    public gw0 f26912e;
    public boolean f26913f;
    public boolean h;

    public hw0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f26216c = -16777216;
        obj.d = -1;
        this.f26910b = obj;
        e6 e6Var = new e6(new ew0(this, 0), 380L, pr.h);
        this.f26911c = e6Var;
        y9 y9Var = new y9(context);
        this.f26909a = y9Var;
        y9Var.setCallback(this);
        this.d = false;
        e6Var.d(0.0f, false);
        a();
    }

    public final void a() {
        boolean z10;
        if (this.h && this.f26913f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.f26911c.e(z10);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public final void b(MessagesController.PeerColor peerColor) {
        this.f26910b.a(peerColor);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.f26911c.f25592c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26909a.getClass();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26909a.getClass();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float e7 = this.f26911c.e(this.d);
        int y3 = org.telegram.messenger.wl.y(24.0f, getMeasuredWidth(), 2);
        canvas.save();
        canvas.translate(y3, (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2);
        canvas.scale(e7, e7, 0.0f, AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        y9 y9Var = this.f26909a;
        y9Var.setBounds(0, 0, dp, dp2);
        fw0 fw0Var = this.f26910b;
        int i10 = fw0Var.f26216c;
        if (y9Var.f32894f != i10) {
            y9Var.f32894f = i10;
            if (y9Var.f32892c != null) {
                y9Var.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                y9Var.invalidateSelf();
            }
        }
        int i11 = fw0Var.d;
        if (y9Var.f32893e != i11) {
            y9Var.f32893e = i11;
            Drawable drawable = y9Var.f32892c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                y9Var.invalidateSelf();
            }
        }
        int i12 = fw0Var.f26216c | (-16777216);
        if (y9Var.h != i12) {
            y9Var.h = i12;
            y9Var.f32891b.s(i12, false);
            y9Var.invalidateSelf();
        }
        y9Var.draw(canvas);
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
        this.f26913f = z10;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i11 = tl_starsRating.level;
        y9 y9Var = this.f26909a;
        if (y9Var.f32896r != i11 || y9Var.f32892c == null || y9Var.d == null) {
            p6 p6Var = y9Var.f32891b;
            if (i11 >= 0) {
                str = Integer.toString(i11);
            } else {
                str = "!";
            }
            p6Var.q(str, true, true);
            y9Var.f32896r = i11;
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
            Context context = y9Var.f32890a;
            if (y9Var.f32895n != b10 || y9Var.f32892c == null || y9Var.d == null) {
                int i12 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(y9.f32889s[i12]).mutate();
                y9Var.f32892c = mutate;
                int i13 = y9Var.f32893e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i13, mode);
                Drawable mutate2 = context.getResources().getDrawable(y9.f32889s[i12 + 1]).mutate();
                y9Var.d = mutate2;
                mutate2.setColorFilter(y9Var.f32894f, mode);
                y9Var.f32895n = b10;
                Drawable drawable = y9Var.f32892c;
                if (drawable != null) {
                    drawable.setBounds(y9Var.getBounds());
                }
                Drawable drawable2 = y9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(y9Var.getBounds());
                }
            }
            y9Var.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.messenger.wl.l(R.string.AccDescrProfileRatingLevel, " ", sb2);
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(gw0 gw0Var) {
        this.f26912e = gw0Var;
    }

    public void setParentExpanded(float f7) {
        fw0 fw0Var = this.f26910b;
        fw0Var.f26217e = f7;
        fw0Var.a(fw0Var.f26214a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.f6 f6Var) {
        this.f26910b.f26215b = f6Var;
    }

    public void setVisibility(boolean z10) {
        this.h = z10;
        a();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f26909a) {
            return false;
        }
        return true;
    }
}
