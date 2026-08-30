package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class n30 extends View {
    public static final TextPaint G = new TextPaint(1);
    public static final Paint H = new Paint(1);
    public long B;
    public final int[] C;
    public final org.telegram.ui.ActionBar.f6 D;
    public final boolean E;
    public final boolean F;
    public final String f27173a;
    public final long f27174b;
    public final String f27175c;
    public final boolean d;
    public final Drawable e;
    public final RectF f27176f;
    public final ImageReceiver h;
    public final StaticLayout f27177n;
    public final z8 f27178r;
    public final ContactsController.Contact f27179s;
    public final int v;
    public final float f27180w;
    public float f27181x;
    public boolean f27182y;

    public n30(Context context, Object obj) {
        this(context, obj, null, false, null);
    }

    public final void a() {
        if (!this.f27182y) {
            return;
        }
        this.f27182y = false;
        this.B = System.currentTimeMillis();
        invalidate();
    }

    public final void b() {
        if (this.f27182y) {
            return;
        }
        this.f27182y = true;
        this.B = System.currentTimeMillis();
        invalidate();
    }

    public final void c() {
        int b10 = this.f27178r.b();
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.D;
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.05f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.di, f6Var);
        int red = Color.red(l1);
        int[] iArr = this.C;
        iArr[0] = red;
        iArr[1] = Color.red(b10);
        iArr[2] = Color.green(l1);
        iArr[3] = Color.green(b10);
        iArr[4] = Color.blue(l1);
        iArr[5] = Color.blue(b10);
        iArr[6] = Color.alpha(l1);
        iArr[7] = Color.alpha(b10);
        this.e.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
        H.setColor(l1);
    }

    public ContactsController.Contact getContact() {
        return this.f27179s;
    }

    public String getCountryIso2() {
        return this.f27173a;
    }

    public String getKey() {
        return this.f27175c;
    }

    public long getUid() {
        return this.f27174b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        int i10;
        int i11;
        int i12;
        float f11;
        float f12;
        int i13;
        float f13;
        int b10;
        float f14;
        float f15;
        float f16;
        float f17;
        boolean z4 = this.f27182y;
        if ((z4 && this.f27181x != 1.0f) || (!z4 && this.f27181x != 0.0f)) {
            long currentTimeMillis = System.currentTimeMillis() - this.B;
            if (currentTimeMillis < 0 || currentTimeMillis > 17) {
                currentTimeMillis = 17;
            }
            if (this.f27182y) {
                float f18 = (((float) currentTimeMillis) / 120.0f) + this.f27181x;
                this.f27181x = f18;
                if (f18 >= 1.0f) {
                    this.f27181x = 1.0f;
                }
            } else {
                float f19 = this.f27181x - (((float) currentTimeMillis) / 120.0f);
                this.f27181x = f19;
                if (f19 < 0.0f) {
                    this.f27181x = 0.0f;
                }
            }
            invalidate();
        }
        canvas.save();
        float measuredWidth = getMeasuredWidth();
        boolean z10 = this.E;
        if (z10) {
            f10 = 28.0f;
        } else {
            f10 = 32.0f;
        }
        RectF rectF = this.f27176f;
        rectF.set(0.0f, 0.0f, measuredWidth, AndroidUtilities.dp(f10));
        int[] iArr = this.C;
        int i14 = iArr[6];
        float f20 = this.f27181x;
        int argb = Color.argb(i14 + ((int) ((iArr[7] - i14) * f20)), iArr[0] + ((int) ((iArr[1] - i10) * f20)), iArr[2] + ((int) ((iArr[3] - i11) * f20)), iArr[4] + ((int) ((iArr[5] - i12) * f20)));
        Paint paint = H;
        paint.setColor(argb);
        float f21 = 14.0f;
        if (z10) {
            f11 = 14.0f;
        } else {
            f11 = 16.0f;
        }
        float dp = AndroidUtilities.dp(f11);
        if (z10) {
            f12 = 14.0f;
        } else {
            f12 = 16.0f;
        }
        canvas.drawRoundRect(rectF, dp, AndroidUtilities.dp(f12), paint);
        if (this.f27181x != 1.0f) {
            this.h.draw(canvas);
        }
        if (this.f27181x != 0.0f) {
            paint.setColor(this.f27178r.b());
            paint.setAlpha((int) (this.f27181x * 255.0f * (Color.alpha(b10) / 255.0f)));
            if (z10) {
                f14 = 14.0f;
            } else {
                f14 = 16.0f;
            }
            float dp2 = AndroidUtilities.dp(f14);
            if (z10) {
                f15 = 14.0f;
            } else {
                f15 = 16.0f;
            }
            float dp3 = AndroidUtilities.dp(f15);
            if (!z10) {
                f21 = 16.0f;
            }
            canvas.drawCircle(dp2, dp3, AndroidUtilities.dp(f21), paint);
            canvas.save();
            canvas.rotate((1.0f - this.f27181x) * 45.0f, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            float f22 = 11.0f;
            if (z10) {
                f16 = 9.0f;
            } else {
                f16 = 11.0f;
            }
            int dp4 = AndroidUtilities.dp(f16);
            if (z10) {
                f22 = 9.0f;
            }
            int dp5 = AndroidUtilities.dp(f22);
            float f23 = 21.0f;
            if (z10) {
                f17 = 19.0f;
            } else {
                f17 = 21.0f;
            }
            int dp6 = AndroidUtilities.dp(f17);
            if (z10) {
                f23 = 19.0f;
            }
            int dp7 = AndroidUtilities.dp(f23);
            Drawable drawable = this.e;
            drawable.setBounds(dp4, dp5, dp6, dp7);
            drawable.setAlpha((int) (this.f27181x * 255.0f));
            drawable.draw(canvas);
            canvas.restore();
        }
        if (z10) {
            i13 = 26;
        } else {
            i13 = 32;
        }
        float dp8 = this.f27180w + AndroidUtilities.dp(i13 + 9);
        if (z10) {
            f13 = 6.0f;
        } else {
            f13 = 8.0f;
        }
        canvas.translate(dp8, AndroidUtilities.dp(f13));
        int i15 = org.telegram.ui.ActionBar.j6.bi;
        org.telegram.ui.ActionBar.f6 f6Var = this.D;
        G.setColor(i0.a.d(this.f27181x, org.telegram.ui.ActionBar.j6.v0(i15, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J7, f6Var)));
        this.f27177n.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f27177n.getText());
        if (this.f27182y) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), LocaleController.getString(R.string.Delete)));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f10;
        boolean z4 = this.E;
        if (z4) {
            i12 = 20;
        } else {
            i12 = 32;
        }
        int dp = AndroidUtilities.dp(i12 + 25) + this.v;
        if (z4) {
            f10 = 28.0f;
        } else {
            f10 = 32.0f;
        }
        setMeasuredDimension(dp, AndroidUtilities.dp(f10));
    }

    public n30(android.content.Context r23, java.lang.Object r24, org.telegram.messenger.ContactsController.Contact r25, boolean r26, org.telegram.ui.ActionBar.f6 r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.n30.<init>(android.content.Context, java.lang.Object, org.telegram.messenger.ContactsController$Contact, boolean, org.telegram.ui.ActionBar.f6):void");
    }
}
