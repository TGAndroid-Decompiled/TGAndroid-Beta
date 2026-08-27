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

public final class sv0 extends View {

    public final o9 f32583a;

    public final qv0 f32584b;

    public final y5 f32585c;
    public boolean d;

    public rv0 f32586e;

    public boolean f32587f;
    public boolean h;

    public sv0(Context context) {
        super(context);
        qv0 qv0Var = new qv0();
        qv0Var.f31986c = -16777216;
        qv0Var.d = -1;
        this.f32584b = qv0Var;
        y5 y5Var = new y5(new pv0(this, 0), 380L, er.h);
        this.f32585c = y5Var;
        o9 o9Var = new o9(context);
        this.f32583a = o9Var;
        o9Var.setCallback(this);
        this.d = false;
        y5Var.d(0.0f, false);
        a();
    }

    public final void a() {
        boolean z10 = this.h && this.f32587f;
        this.d = z10;
        this.f32585c.e(z10);
        setEnabled(this.d);
        setClickable(this.d);
        invalidate();
    }

    public final void b(MessagesController.PeerColor peerColor) {
        this.f32584b.a(peerColor);
        invalidate();
    }

    public float getVisibilityFactor() {
        return this.f32585c.f34812c;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f32583a.getClass();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32583a.getClass();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float fE = this.f32585c.e(this.d);
        int iX = org.telegram.messenger.rl.x(24.0f, getMeasuredWidth(), 2);
        int measuredHeight = (getMeasuredHeight() - AndroidUtilities.dp(24.0f)) / 2;
        canvas.save();
        canvas.translate(iX, measuredHeight);
        canvas.scale(fE, fE, 0.0f, AndroidUtilities.dp(12.0f));
        int iDp = AndroidUtilities.dp(24.0f);
        int iDp2 = AndroidUtilities.dp(24.0f);
        o9 o9Var = this.f32583a;
        o9Var.setBounds(0, 0, iDp, iDp2);
        qv0 qv0Var = this.f32584b;
        int i10 = qv0Var.f31986c;
        if (o9Var.f31233f != i10) {
            o9Var.f31233f = i10;
            if (o9Var.f31231c != null) {
                o9Var.d.setColorFilter(i10, PorterDuff.Mode.MULTIPLY);
                o9Var.invalidateSelf();
            }
        }
        int i11 = qv0Var.d;
        if (o9Var.f31232e != i11) {
            o9Var.f31232e = i11;
            Drawable drawable = o9Var.f31231c;
            if (drawable != null) {
                drawable.setColorFilter(i11, PorterDuff.Mode.MULTIPLY);
                o9Var.invalidateSelf();
            }
        }
        int i12 = qv0Var.f31986c | (-16777216);
        if (o9Var.h != i12) {
            o9Var.h = i12;
            o9Var.f31230b.s(i12, false);
            o9Var.invalidateSelf();
        }
        o9Var.draw(canvas);
        canvas.restore();
    }

    public void set(TL_stars.Tl_starsRating tl_starsRating) {
        int iB;
        this.f32587f = tl_starsRating != null;
        a();
        if (tl_starsRating == null) {
            return;
        }
        int i10 = tl_starsRating.level;
        o9 o9Var = this.f32583a;
        if (o9Var.f31235r != i10 || o9Var.f31231c == null || o9Var.d == null) {
            o9Var.f31230b.q(i10 >= 0 ? Integer.toString(i10) : "!", true, true);
            o9Var.f31235r = i10;
            if (i10 < 0) {
                iB = 18;
            } else {
                iB = h7.n.b(i10 <= 10 ? i10 - 1 : (i10 / 10) + 8, 0, 17);
            }
            Context context = o9Var.f31229a;
            if (o9Var.f31234n != iB || o9Var.f31231c == null || o9Var.d == null) {
                int i11 = iB * 2;
                Drawable drawableMutate = context.getResources().getDrawable(o9.f31228s[i11]).mutate();
                o9Var.f31231c = drawableMutate;
                int i12 = o9Var.f31232e;
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                drawableMutate.setColorFilter(i12, mode);
                Drawable drawableMutate2 = context.getResources().getDrawable(o9.f31228s[i11 + 1]).mutate();
                o9Var.d = drawableMutate2;
                drawableMutate2.setColorFilter(o9Var.f31233f, mode);
                o9Var.f31234n = iB;
                Drawable drawable = o9Var.f31231c;
                if (drawable != null) {
                    drawable.setBounds(o9Var.getBounds());
                }
                Drawable drawable2 = o9Var.d;
                if (drawable2 != null) {
                    drawable2.setBounds(o9Var.getBounds());
                }
            }
            o9Var.invalidateSelf();
        }
        StringBuilder sb2 = new StringBuilder();
        org.telegram.messenger.rl.j(R.string.AccDescrProfileRatingLevel, " ", sb2);
        sb2.append(tl_starsRating.level);
        setContentDescription(sb2.toString());
        invalidate();
    }

    public void setDelegate(rv0 rv0Var) {
        this.f32586e = rv0Var;
    }

    public void setParentExpanded(float f10) {
        qv0 qv0Var = this.f32584b;
        qv0Var.f31987e = f10;
        qv0Var.a(qv0Var.f31984a);
        invalidate();
    }

    public void setResourcesProvider(org.telegram.ui.ActionBar.c6 c6Var) {
        this.f32584b.f31985b = c6Var;
    }

    public void setVisibility(boolean z10) {
        this.h = z10;
        a();
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f32583a;
    }
}
