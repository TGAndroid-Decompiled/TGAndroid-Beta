package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.tl.TL_stars;
public final class nv0 extends View implements org.telegram.ui.ActionBar.k6 {
    public final h9 f28894a;
    public final lv0 f28895b;
    public final t5 f28896c;
    public boolean d;
    public mv0 e;
    public boolean f28897f;
    public boolean h;

    public nv0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f28206c = -16777216;
        obj.d = -1;
        this.f28895b = obj;
        t5 t5Var = new t5(new kv0(this, 0), 380L, gr.h);
        this.f28896c = t5Var;
        h9 h9Var = new h9(context);
        this.f28894a = h9Var;
        h9Var.setCallback(this);
        this.d = false;
        t5Var.e(false, 0.0f);
        a();
    }

    public final void a() {
        boolean z10;
        if (this.h && this.f28897f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.f28896c.d(z10);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.f28896c.f30445c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28894a.getClass();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28894a.getClass();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float d = this.f28896c.d(this.d);
        int y3 = org.telegram.messenger.z20.y(24.0f, getMeasuredWidth(), 2);
        canvas.save();
        canvas.translate(y3, (getMeasuredHeight() - org.telegram.messenger.i0.L(24.0f)) / 2);
        canvas.scale(d, d, 0.0f, org.telegram.messenger.i0.L(12.0f));
        int L = org.telegram.messenger.i0.L(24.0f);
        int L2 = org.telegram.messenger.i0.L(24.0f);
        h9 h9Var = this.f28894a;
        h9Var.setBounds(0, 0, L, L2);
        lv0 lv0Var = this.f28895b;
        int i10 = lv0Var.f28206c;
        if (h9Var.f26654f != i10) {
            h9Var.f26654f = i10;
            if (h9Var.f26653c != null) {
                h9Var.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                h9Var.invalidateSelf();
            }
        }
        int i11 = lv0Var.d;
        if (h9Var.e != i11) {
            h9Var.e = i11;
            Drawable drawable = h9Var.f26653c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                h9Var.invalidateSelf();
            }
        }
        int i12 = lv0Var.f28206c | (-16777216);
        if (h9Var.h != i12) {
            h9Var.h = i12;
            h9Var.f26652b.v(i12, false);
            h9Var.invalidateSelf();
        }
        h9Var.draw(canvas);
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
        this.f28897f = z10;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i11 = tl_starsRating.level;
        h9 h9Var = this.f28894a;
        if (h9Var.f26656r != i11 || h9Var.f26653c == null || h9Var.d == null) {
            e6 e6Var = h9Var.f26652b;
            if (i11 >= 0) {
                str = Integer.toString(i11);
            } else {
                str = "!";
            }
            e6Var.t(str, true, true);
            h9Var.f26656r = i11;
            if (i11 < 0) {
                b10 = 18;
            } else {
                if (i11 <= 10) {
                    i10 = i11 - 1;
                } else {
                    i10 = (i11 / 10) + 8;
                }
                b10 = w7.u.b(i10, 0, 17);
            }
            Context context = h9Var.f26651a;
            if (h9Var.f26655n != b10 || h9Var.f26653c == null || h9Var.d == null) {
                int i12 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(h9.f26650s[i12]).mutate();
                h9Var.f26653c = mutate;
                int i13 = h9Var.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i13, mode);
                Drawable mutate2 = context.getResources().getDrawable(h9.f26650s[i12 + 1]).mutate();
                h9Var.d = mutate2;
                mutate2.setColorFilter(h9Var.f26654f, mode);
                h9Var.f26655n = b10;
                Drawable drawable = h9Var.f26653c;
                if (drawable != null) {
                    drawable.setBounds(h9Var.getBounds());
                }
                Drawable drawable2 = h9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(h9Var.getBounds());
                }
            }
            h9Var.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.messenger.z20.q(null, 2131754797, sb2, " ");
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(mv0 mv0Var) {
        this.e = mv0Var;
    }

    public void setParentExpanded(float f7) {
        lv0 lv0Var = this.f28895b;
        lv0Var.e = f7;
        lv0Var.a(lv0Var.f28204a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.p6 p6Var) {
        this.f28895b.f28205b = p6Var;
    }

    public void setVisibility(boolean z10) {
        this.h = z10;
        a();
    }

    @Override
    public final void updateColors() {
        try {
            lv0 lv0Var = this.f28895b;
            lv0Var.a(lv0Var.f28204a);
            invalidate();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f28894a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
