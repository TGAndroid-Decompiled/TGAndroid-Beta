package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class cq0 extends View implements org.telegram.ui.ActionBar.p6 {
    public static final pw0 f27236w;
    public ImageReceiver f27237a;
    public j9 f27238b;
    public org.telegram.ui.Cells.y f27239c;
    public Paint d;
    public Paint e;
    public o1.j f27240f;
    public ValueAnimator h;
    public float f27241n;
    public boolean f27242r;
    public boolean f27243s;
    public int v;

    static {
        pw0 pw0Var = new pw0(new qd0(16), new qd0(17));
        pw0Var.f31730c = 100.0f;
        f27236w = pw0Var;
    }

    public final void a(boolean z10, boolean z11, float f7) {
        if (z10) {
            o1.j jVar = this.f27240f;
            if (jVar != null) {
                jVar.c();
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z12 = false;
            this.f27243s = false;
            this.f27242r = false;
            if (z11) {
                float f10 = this.f27241n * 100.0f;
                o1.j jVar2 = new o1.j(this, f27236w);
                jVar2.f18961b = f10;
                jVar2.f18962c = true;
                this.f27240f = jVar2;
                if (f7 < this.f27241n) {
                    z12 = true;
                }
                float f11 = f7 * 100.0f;
                this.f27243s = z12;
                this.f27242r = !z12;
                o1.k kVar = new o1.k(f11);
                kVar.f18975i = f11;
                kVar.b(450.0f);
                kVar.a(1.0f);
                jVar2.f18969u = kVar;
                this.f27240f.b(new oh(this, z12, f10, f11));
                this.f27240f.a(new hb(this, 4));
                this.f27240f.h();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.f27241n, f7).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(ds.f27586f);
            this.h.addUpdateListener(new e80(this, 17));
            this.h.addListener(new i10(this, 19));
            this.h.start();
            return;
        }
        this.f27241n = f7;
        invalidate();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f27239c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.f27241n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f27239c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27237a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27237a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.e;
        canvas.save();
        float f7 = 1.0f;
        if (this.f27242r) {
            f7 = 1.0f - this.f27241n;
        } else if (this.f27243s) {
            f7 = this.f27241n;
        }
        canvas.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.f27237a.draw(canvas);
        int i10 = (int) (this.f27241n * 255.0f);
        paint.setAlpha(i10);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i10);
        float strokeWidth = paint2.getStrokeWidth() + AndroidUtilities.dp(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.f27239c.setBounds(0, 0, getWidth(), getHeight());
        this.f27239c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.f27237a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String str;
        j9 j9Var = this.f27238b;
        if (tLObject instanceof TLRPC.User) {
            str = UserObject.getFirstName((TLRPC.User) tLObject);
        } else if (tLObject instanceof TLRPC.Chat) {
            str = ((TLRPC.Chat) tLObject).title;
        } else if (tLObject instanceof TLRPC.ChatInvite) {
            str = ((TLRPC.ChatInvite) tLObject).title;
        } else {
            str = "";
        }
        setContentDescription(LocaleController.formatString("AccDescrSendAsPeer", R.string.AccDescrSendAsPeer, str));
        j9Var.p(tLObject);
        this.f27237a.setForUserOrChat(tLObject, j9Var);
    }

    public void setProgress(float f7) {
        boolean z10;
        if (f7 != 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        a(true, z10, f7);
    }

    @Override
    public final void updateColors() {
        this.d.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23346cf, false));
        this.e.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23326bf, false));
        if (this.f27239c != null) {
            int o12 = org.telegram.ui.ActionBar.y6.o1(0.2f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23356d6, false));
            if (o12 != this.v) {
                this.v = o12;
                org.telegram.ui.ActionBar.y6.E1(this.f27239c, o12, true);
            }
            invalidate();
            return;
        }
        this.v = org.telegram.ui.ActionBar.y6.o1(0.2f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23356d6, false));
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = this.v;
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, 0, i10, i10);
        this.f27239c = j02;
        j02.setCallback(this);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f27239c != drawable) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
