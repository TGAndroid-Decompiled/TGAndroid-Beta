package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
public final class px0 extends View implements org.telegram.ui.ActionBar.p6 {
    public final z9 f31722a;
    public final nx0 f31723b;
    public final h6 f31724c;
    public boolean d;
    public ox0 e;
    public boolean f31725f;
    public boolean h;

    public px0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f31094c = -16777216;
        obj.d = -1;
        this.f31723b = obj;
        h6 h6Var = new h6(new mx0(this, 0), 380L, ds.h);
        this.f31724c = h6Var;
        z9 z9Var = new z9(context);
        this.f31722a = z9Var;
        z9Var.setCallback(this);
        this.d = false;
        h6Var.d(0.0f, false);
        a();
    }

    public final void a() {
        boolean z10;
        if (this.h && this.f31725f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.f31724c.e(z10);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.f31724c.f28864c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31722a.getClass();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31722a.getClass();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float e = this.f31724c.e(this.d);
        int B = org.telegram.messenger.wh.B(24.0f, getMeasuredWidth(), 2);
        canvas.save();
        canvas.translate(B, (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2);
        canvas.scale(e, e, 0.0f, AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        z9 z9Var = this.f31722a;
        z9Var.setBounds(0, 0, dp, dp2);
        nx0 nx0Var = this.f31723b;
        int i10 = nx0Var.f31094c;
        if (z9Var.f35299f != i10) {
            z9Var.f35299f = i10;
            if (z9Var.f35298c != null) {
                z9Var.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                z9Var.invalidateSelf();
            }
        }
        int i11 = nx0Var.d;
        if (z9Var.e != i11) {
            z9Var.e = i11;
            Drawable drawable = z9Var.f35298c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                z9Var.invalidateSelf();
            }
        }
        int i12 = nx0Var.f31094c | (-16777216);
        if (z9Var.h != i12) {
            z9Var.h = i12;
            z9Var.f35297b.v(i12, false);
            z9Var.invalidateSelf();
        }
        z9Var.draw(canvas);
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
        this.f31725f = z10;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i11 = tl_starsRating.level;
        z9 z9Var = this.f31722a;
        if (z9Var.f35301r != i11 || z9Var.f35298c == null || z9Var.d == null) {
            r6 r6Var = z9Var.f35297b;
            if (i11 >= 0) {
                str = Integer.toString(i11);
            } else {
                str = "!";
            }
            r6Var.t(str, true, true);
            z9Var.f35301r = i11;
            if (i11 < 0) {
                b10 = 18;
            } else {
                if (i11 <= 10) {
                    i10 = i11 - 1;
                } else {
                    i10 = (i11 / 10) + 8;
                }
                b10 = a8.ee.b(i10, 0, 17);
            }
            Context context = z9Var.f35296a;
            if (z9Var.f35300n != b10 || z9Var.f35298c == null || z9Var.d == null) {
                int i12 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(z9.f35295s[i12]).mutate();
                z9Var.f35298c = mutate;
                int i13 = z9Var.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i13, mode);
                Drawable mutate2 = context.getResources().getDrawable(z9.f35295s[i12 + 1]).mutate();
                z9Var.d = mutate2;
                mutate2.setColorFilter(z9Var.f35299f, mode);
                z9Var.f35300n = b10;
                Drawable drawable = z9Var.f35298c;
                if (drawable != null) {
                    drawable.setBounds(z9Var.getBounds());
                }
                Drawable drawable2 = z9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(z9Var.getBounds());
                }
            }
            z9Var.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.d3.p(R.string.AccDescrProfileRatingLevel, " ", sb2);
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(ox0 ox0Var) {
        this.e = ox0Var;
    }

    public void setParentExpanded(float f7) {
        nx0 nx0Var = this.f31723b;
        nx0Var.e = f7;
        nx0Var.a(nx0Var.f31092a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.u6 u6Var) {
        this.f31723b.f31093b = u6Var;
    }

    public void setVisibility(boolean z10) {
        this.h = z10;
        a();
    }

    @Override
    public final void updateColors() {
        try {
            nx0 nx0Var = this.f31723b;
            nx0Var.a(nx0Var.f31092a);
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f31722a) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
