package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
public final class gx0 extends View implements org.telegram.ui.ActionBar.b6 {
    public final v9 f26807a;
    public final ex0 f26808b;
    public final d6 f26809c;
    public boolean d;
    public fx0 e;
    public boolean f26810f;
    public boolean h;

    public gx0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f26135c = -16777216;
        obj.d = -1;
        this.f26808b = obj;
        d6 d6Var = new d6(new dx0(this, 0), 380L, zr.h);
        this.f26809c = d6Var;
        v9 v9Var = new v9(context);
        this.f26807a = v9Var;
        v9Var.setCallback(this);
        this.d = false;
        d6Var.d(0.0f, false);
        a();
    }

    public final void a() {
        boolean z10;
        if (this.h && this.f26810f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.f26809c.e(z10);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public final void b(MessagesController.PeerColor peerColor) {
        this.f26808b.a(peerColor);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.f26809c.f25568c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f26807a.getClass();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f26807a.getClass();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float e = this.f26809c.e(this.d);
        int A = org.telegram.messenger.tl.A(24.0f, getMeasuredWidth(), 2);
        canvas.save();
        canvas.translate(A, (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2);
        canvas.scale(e, e, 0.0f, AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        v9 v9Var = this.f26807a;
        v9Var.setBounds(0, 0, dp, dp2);
        ex0 ex0Var = this.f26808b;
        int i10 = ex0Var.f26135c;
        if (v9Var.f31385f != i10) {
            v9Var.f31385f = i10;
            if (v9Var.f31384c != null) {
                v9Var.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                v9Var.invalidateSelf();
            }
        }
        int i11 = ex0Var.d;
        if (v9Var.e != i11) {
            v9Var.e = i11;
            Drawable drawable = v9Var.f31384c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                v9Var.invalidateSelf();
            }
        }
        int i12 = ex0Var.f26135c | (-16777216);
        if (v9Var.h != i12) {
            v9Var.h = i12;
            v9Var.f31383b.v(i12, false);
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
        this.f26810f = z10;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i11 = tl_starsRating.level;
        v9 v9Var = this.f26807a;
        if (v9Var.f31387r != i11 || v9Var.f31384c == null || v9Var.d == null) {
            n6 n6Var = v9Var.f31383b;
            if (i11 >= 0) {
                str = Integer.toString(i11);
            } else {
                str = "!";
            }
            n6Var.t(str, true, true);
            v9Var.f31387r = i11;
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
            Context context = v9Var.f31382a;
            if (v9Var.f31386n != b10 || v9Var.f31384c == null || v9Var.d == null) {
                int i12 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(v9.f31381s[i12]).mutate();
                v9Var.f31384c = mutate;
                int i13 = v9Var.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i13, mode);
                Drawable mutate2 = context.getResources().getDrawable(v9.f31381s[i12 + 1]).mutate();
                v9Var.d = mutate2;
                mutate2.setColorFilter(v9Var.f31385f, mode);
                v9Var.f31386n = b10;
                Drawable drawable = v9Var.f31384c;
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
        org.telegram.ui.Cells.b1.o(R.string.AccDescrProfileRatingLevel, " ", sb2);
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(fx0 fx0Var) {
        this.e = fx0Var;
    }

    public void setParentExpanded(float f7) {
        ex0 ex0Var = this.f26808b;
        ex0Var.e = f7;
        ex0Var.a(ex0Var.f26133a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.g6 g6Var) {
        this.f26808b.f26134b = g6Var;
    }

    public void setVisibility(boolean z10) {
        this.h = z10;
        a();
    }

    @Override
    public final void updateColors() {
        try {
            ex0 ex0Var = this.f26808b;
            ex0Var.a(ex0Var.f26133a);
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f26807a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
