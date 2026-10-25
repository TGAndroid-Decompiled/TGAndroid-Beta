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
    public static final pw0 f27234w;
    public ImageReceiver f27235a;
    public j9 f27236b;
    public org.telegram.ui.Cells.y f27237c;
    public Paint d;
    public Paint e;
    public o1.j f27238f;
    public ValueAnimator h;
    public float f27239n;
    public boolean f27240r;
    public boolean f27241s;
    public int v;

    static {
        pw0 pw0Var = new pw0(new qd0(16), new qd0(17));
        pw0Var.f31728c = 100.0f;
        f27234w = pw0Var;
    }

    public final void a(boolean z10, boolean z11, float f7) {
        if (z10) {
            o1.j jVar = this.f27238f;
            if (jVar != null) {
                jVar.c();
            }
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            boolean z12 = false;
            this.f27241s = false;
            this.f27240r = false;
            if (z11) {
                float f10 = this.f27239n * 100.0f;
                o1.j jVar2 = new o1.j(this, f27234w);
                jVar2.f18961b = f10;
                jVar2.f18962c = true;
                this.f27238f = jVar2;
                if (f7 < this.f27239n) {
                    z12 = true;
                }
                float f11 = f7 * 100.0f;
                this.f27241s = z12;
                this.f27240r = !z12;
                o1.k kVar = new o1.k(f11);
                kVar.f18975i = f11;
                kVar.b(450.0f);
                kVar.a(1.0f);
                jVar2.f18969u = kVar;
                this.f27238f.b(new oh(this, z12, f10, f11));
                this.f27238f.a(new hb(this, 4));
                this.f27238f.h();
                return;
            }
            ValueAnimator duration = ValueAnimator.ofFloat(this.f27239n, f7).setDuration(200L);
            this.h = duration;
            duration.setInterpolator(ds.f27584f);
            this.h.addUpdateListener(new e80(this, 17));
            this.h.addListener(new i10(this, 19));
            this.h.start();
            return;
        }
        this.f27239n = f7;
        invalidate();
    }

    @Override
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        this.f27237c.setState(getDrawableState());
    }

    public float getProgress() {
        return this.f27239n;
    }

    @Override
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f27237c.jumpToCurrentState();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f27235a.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f27235a.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint = this.d;
        Paint paint2 = this.e;
        canvas.save();
        float f7 = 1.0f;
        if (this.f27240r) {
            f7 = 1.0f - this.f27239n;
        } else if (this.f27241s) {
            f7 = this.f27239n;
        }
        canvas.scale(f7, f7, getWidth() / 2.0f, getHeight() / 2.0f);
        super.onDraw(canvas);
        this.f27235a.draw(canvas);
        int i10 = (int) (this.f27239n * 255.0f);
        paint.setAlpha(i10);
        canvas.drawCircle(getWidth() / 2.0f, getHeight() / 2.0f, Math.min(getWidth(), getHeight()) / 2.0f, paint);
        canvas.save();
        paint2.setAlpha(i10);
        float strokeWidth = paint2.getStrokeWidth() + AndroidUtilities.dp(10.0f);
        canvas.drawLine(strokeWidth, strokeWidth, getWidth() - strokeWidth, getHeight() - strokeWidth, paint2);
        canvas.drawLine(strokeWidth, getHeight() - strokeWidth, getWidth() - strokeWidth, strokeWidth, paint2);
        canvas.restore();
        this.f27237c.setBounds(0, 0, getWidth(), getHeight());
        this.f27237c.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getLayoutParams().width, 1073741824), View.MeasureSpec.makeMeasureSpec(getLayoutParams().height, 1073741824));
        this.f27235a.setImageCoords(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
    }

    public void setAvatar(TLObject tLObject) {
        String str;
        j9 j9Var = this.f27236b;
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
        this.f27235a.setForUserOrChat(tLObject, j9Var);
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
        this.d.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23344cf, false));
        this.e.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23324bf, false));
        if (this.f27237c != null) {
            int o12 = org.telegram.ui.ActionBar.y6.o1(0.2f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23354d6, false));
            if (o12 != this.v) {
                this.v = o12;
                org.telegram.ui.ActionBar.y6.E1(this.f27237c, o12, true);
            }
            invalidate();
            return;
        }
        this.v = org.telegram.ui.ActionBar.y6.o1(0.2f, org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23354d6, false));
        int dp = AndroidUtilities.dp(18.0f);
        int i10 = this.v;
        org.telegram.ui.Cells.y j02 = org.telegram.ui.ActionBar.y6.j0(dp, dp, dp, dp, 0, i10, i10);
        this.f27237c = j02;
        j02.setCallback(this);
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && this.f27237c != drawable) {
            return false;
        }
        return true;
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
