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
public final class qv0 extends View {
    public final p9 f32032a;
    public final ov0 f32033b;
    public final y5 f32034c;
    public boolean d;
    public pv0 f32035e;
    public boolean f32036f;
    public boolean h;

    public qv0(Context context) {
        super(context);
        ?? obj = new Object();
        obj.f31451c = -16777216;
        obj.d = -1;
        this.f32033b = obj;
        y5 y5Var = new y5(new nv0(this, 0), 380L, gr.h);
        this.f32034c = y5Var;
        p9 p9Var = new p9(context);
        this.f32032a = p9Var;
        p9Var.setCallback(this);
        this.d = false;
        y5Var.d(0.0f, false);
        a();
    }

    public final void a() {
        boolean z10;
        if (this.h && this.f32036f) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.d = z10;
        this.f32034c.e(z10);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public final void b(MessagesController.PeerColor peerColor) {
        this.f32033b.a(peerColor);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.f32034c.f34854c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32032a.getClass();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32032a.getClass();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float e10 = this.f32034c.e(this.d);
        int y10 = org.telegram.messenger.ll.y(24.0f, getMeasuredWidth(), 2);
        canvas.save();
        canvas.translate(y10, (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2);
        canvas.scale(e10, e10, 0.0f, AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(24.0f);
        int dp2 = AndroidUtilities.dp(24.0f);
        p9 p9Var = this.f32032a;
        p9Var.setBounds(0, 0, dp, dp2);
        ov0 ov0Var = this.f32033b;
        int i9 = ov0Var.f31451c;
        if (p9Var.f31599f != i9) {
            p9Var.f31599f = i9;
            if (p9Var.f31597c != null) {
                p9Var.d.setColorFilter(i9, PorterDuff.Mode.MULTIPLY);
                p9Var.invalidateSelf();
            }
        }
        int i10 = ov0Var.d;
        if (p9Var.f31598e != i10) {
            p9Var.f31598e = i10;
            Drawable drawable = p9Var.f31597c;
            if (drawable != null) {
                drawable.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                p9Var.invalidateSelf();
            }
        }
        int i11 = ov0Var.f31451c | (-16777216);
        if (p9Var.h != i11) {
            p9Var.h = i11;
            p9Var.f31596b.s(i11, false);
            p9Var.invalidateSelf();
        }
        p9Var.draw(canvas);
        canvas.restore();
    }

    public void set(TL_stars.Tl_starsRating tl_starsRating) {
        boolean z10;
        String str;
        int i9;
        int b10;
        if (tl_starsRating != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f32036f = z10;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i10 = tl_starsRating.level;
        p9 p9Var = this.f32032a;
        if (p9Var.f31601r != i10 || p9Var.f31597c == null || p9Var.d == null) {
            i6 i6Var = p9Var.f31596b;
            if (i10 >= 0) {
                str = Integer.toString(i10);
            } else {
                str = "!";
            }
            i6Var.q(str, true, true);
            p9Var.f31601r = i10;
            if (i10 < 0) {
                b10 = 18;
            } else {
                if (i10 <= 10) {
                    i9 = i10 - 1;
                } else {
                    i9 = (i10 / 10) + 8;
                }
                b10 = g7.n.b(i9, 0, 17);
            }
            Context context = p9Var.f31595a;
            if (p9Var.f31600n != b10 || p9Var.f31597c == null || p9Var.d == null) {
                int i11 = b10 * 2;
                Drawable mutate = context.getResources().getDrawable(p9.f31594s[i11]).mutate();
                p9Var.f31597c = mutate;
                int i12 = p9Var.f31598e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                mutate.setColorFilter(i12, mode);
                Drawable mutate2 = context.getResources().getDrawable(p9.f31594s[i11 + 1]).mutate();
                p9Var.d = mutate2;
                mutate2.setColorFilter(p9Var.f31599f, mode);
                p9Var.f31600n = b10;
                Drawable drawable = p9Var.f31597c;
                if (drawable != null) {
                    drawable.setBounds(p9Var.getBounds());
                }
                Drawable drawable2 = p9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(p9Var.getBounds());
                }
            }
            p9Var.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.ui.Cells.j2.k(R.string.AccDescrProfileRatingLevel, " ", sb2);
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(pv0 pv0Var) {
        this.f32035e = pv0Var;
    }

    public void setParentExpanded(float f10) {
        ov0 ov0Var = this.f32033b;
        ov0Var.f31452e = f10;
        ov0Var.a(ov0Var.f31449a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.b6 b6Var) {
        this.f32033b.f31450b = b6Var;
    }

    public void setVisibility(boolean z10) {
        this.h = z10;
        a();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f32032a) {
            return false;
        }
        return true;
    }
}
