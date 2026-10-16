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
public final class hx0 extends View {
    public final aa f25424a;
    public final fx0 f25425b;
    public final g6 f25426c;
    public boolean d;
    public gx0 e;
    public boolean f25427f;
    public boolean h;

    public hx0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f24823c = -16777216;
        obj.d = -1;
        this.f25425b = obj;
        g6 g6Var = new g6(new ex0(this, 0), 380L, es.h);
        this.f25426c = g6Var;
        aa aaVar = new aa(context);
        this.f25424a = aaVar;
        aaVar.setCallback(this);
        this.d = false;
        g6Var.d(0.0f, false);
        a();
    }

    public final void a() {
        boolean z10;
        if (this.h && this.f25427f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.f25426c.e(z10);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public final void b(MessagesController.PeerColor peerColor) {
        this.f25425b.a(peerColor);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.f25426c.f24885c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f25424a.getClass();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f25424a.getClass();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float e = this.f25426c.e(this.d);
        int A = org.telegram.messenger.sk.A(24.0f, getMeasuredWidth(), 2);
        canvas.save();
        canvas.translate(A, (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2);
        canvas.scale(e, e, 0.0f, AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        aa aaVar = this.f25424a;
        aaVar.setBounds(0, 0, dp, dp2);
        fx0 fx0Var = this.f25425b;
        int i10 = fx0Var.f24823c;
        if (aaVar.f23179f != i10) {
            aaVar.f23179f = i10;
            if (aaVar.f23178c != null) {
                aaVar.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                aaVar.invalidateSelf();
            }
        }
        int i11 = fx0Var.d;
        if (aaVar.e != i11) {
            aaVar.e = i11;
            Drawable drawable = aaVar.f23178c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                aaVar.invalidateSelf();
            }
        }
        int i12 = fx0Var.f24823c | (-16777216);
        if (aaVar.h != i12) {
            aaVar.h = i12;
            aaVar.f23177b.v(i12, false);
            aaVar.invalidateSelf();
        }
        aaVar.draw(canvas);
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
        this.f25427f = z10;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i11 = tl_starsRating.level;
        aa aaVar = this.f25424a;
        if (aaVar.f23181r != i11 || aaVar.f23178c == null || aaVar.d == null) {
            r6 r6Var = aaVar.f23177b;
            if (i11 >= 0) {
                str = Integer.toString(i11);
            } else {
                str = "!";
            }
            r6Var.t(str, true, true);
            aaVar.f23181r = i11;
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
            Context context = aaVar.f23176a;
            if (aaVar.f23180n != b10 || aaVar.f23178c == null || aaVar.d == null) {
                int i12 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(aa.f23175s[i12]).mutate();
                aaVar.f23178c = mutate;
                int i13 = aaVar.e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i13, mode);
                Drawable mutate2 = context.getResources().getDrawable(aa.f23175s[i12 + 1]).mutate();
                aaVar.d = mutate2;
                mutate2.setColorFilter(aaVar.f23179f, mode);
                aaVar.f23180n = b10;
                Drawable drawable = aaVar.f23178c;
                if (drawable != null) {
                    drawable.setBounds(aaVar.getBounds());
                }
                Drawable drawable2 = aaVar.d;
                if (drawable2 != null) {
                    drawable2.setBounds(aaVar.getBounds());
                }
            }
            aaVar.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.Cells.c1.l(R.string.AccDescrProfileRatingLevel, " ", sb2);
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(gx0 gx0Var) {
        this.e = gx0Var;
    }

    public void setParentExpanded(float f7) {
        fx0 fx0Var = this.f25425b;
        fx0Var.e = f7;
        fx0Var.a(fx0Var.f24821a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.c6 c6Var) {
        this.f25425b.f24822b = c6Var;
    }

    public void setVisibility(boolean z10) {
        this.h = z10;
        a();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f25424a) {
            return false;
        }
        return true;
    }
}
