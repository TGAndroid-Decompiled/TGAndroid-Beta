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
public final class m30 extends View {
    public static final TextPaint J = new TextPaint(1);
    public static final Paint K = new Paint(1);
    public long E;
    public final int[] F;
    public final org.telegram.ui.ActionBar.f6 G;
    public final boolean H;
    public final boolean I;
    public final String f28362a;
    public final long f28363b;
    public final String f28364c;
    public final boolean d;
    public final Drawable f28365e;
    public final RectF f28366f;
    public final ImageReceiver h;
    public final StaticLayout f28367n;
    public final i9 f28368r;
    public final ContactsController.Contact f28369s;
    public final int v;
    public final float f28370w;
    public float f28371x;
    public boolean f28372y;

    public m30(Context context, Object obj) {
        this(context, obj, null, false, null);
    }

    public final void a() {
        if (!this.f28372y) {
            return;
        }
        this.f28372y = false;
        this.E = System.currentTimeMillis();
        invalidate();
    }

    public final void b() {
        if (this.f28372y) {
            return;
        }
        this.f28372y = true;
        this.E = System.currentTimeMillis();
        invalidate();
    }

    public final void c() {
        int b10 = this.f28368r.b();
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        org.telegram.ui.ActionBar.f6 f6Var = this.G;
        int l1 = org.telegram.ui.ActionBar.j6.l1(0.05f, org.telegram.ui.ActionBar.j6.v0(i10, f6Var));
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20675di, f6Var);
        int red = Color.red(l1);
        int[] iArr = this.F;
        iArr[0] = red;
        iArr[1] = Color.red(b10);
        iArr[2] = Color.green(l1);
        iArr[3] = Color.green(b10);
        iArr[4] = Color.blue(l1);
        iArr[5] = Color.blue(b10);
        iArr[6] = Color.alpha(l1);
        iArr[7] = Color.alpha(b10);
        this.f28365e.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
        K.setColor(l1);
    }

    public ContactsController.Contact getContact() {
        return this.f28369s;
    }

    public String getCountryIso2() {
        return this.f28362a;
    }

    public String getKey() {
        return this.f28364c;
    }

    public long getUid() {
        return this.f28363b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f7;
        int i10;
        int i11;
        int i12;
        float f10;
        float f11;
        int i13;
        float f12;
        int b10;
        float f13;
        float f14;
        float f15;
        float f16;
        boolean z10 = this.f28372y;
        if ((z10 && this.f28371x != 1.0f) || (!z10 && this.f28371x != 0.0f)) {
            long currentTimeMillis = System.currentTimeMillis() - this.E;
            if (currentTimeMillis < 0 || currentTimeMillis > 17) {
                currentTimeMillis = 17;
            }
            if (this.f28372y) {
                float f17 = (((float) currentTimeMillis) / 120.0f) + this.f28371x;
                this.f28371x = f17;
                if (f17 >= 1.0f) {
                    this.f28371x = 1.0f;
                }
            } else {
                float f18 = this.f28371x - (((float) currentTimeMillis) / 120.0f);
                this.f28371x = f18;
                if (f18 < 0.0f) {
                    this.f28371x = 0.0f;
                }
            }
            invalidate();
        }
        canvas.save();
        float measuredWidth = getMeasuredWidth();
        boolean z11 = this.H;
        if (z11) {
            f7 = 28.0f;
        } else {
            f7 = 32.0f;
        }
        RectF rectF = this.f28366f;
        rectF.set(0.0f, 0.0f, measuredWidth, AndroidUtilities.dp(f7));
        int[] iArr = this.F;
        int i14 = iArr[6];
        float f19 = this.f28371x;
        int argb = Color.argb(i14 + ((int) ((iArr[7] - i14) * f19)), iArr[0] + ((int) ((iArr[1] - i10) * f19)), iArr[2] + ((int) ((iArr[3] - i11) * f19)), iArr[4] + ((int) ((iArr[5] - i12) * f19)));
        Paint paint = K;
        paint.setColor(argb);
        float f20 = 14.0f;
        if (z11) {
            f10 = 14.0f;
        } else {
            f10 = 16.0f;
        }
        float dp = AndroidUtilities.dp(f10);
        if (z11) {
            f11 = 14.0f;
        } else {
            f11 = 16.0f;
        }
        canvas.drawRoundRect(rectF, dp, AndroidUtilities.dp(f11), paint);
        if (this.f28371x != 1.0f) {
            this.h.draw(canvas);
        }
        if (this.f28371x != 0.0f) {
            paint.setColor(this.f28368r.b());
            paint.setAlpha((int) (this.f28371x * 255.0f * (Color.alpha(b10) / 255.0f)));
            if (z11) {
                f13 = 14.0f;
            } else {
                f13 = 16.0f;
            }
            float dp2 = AndroidUtilities.dp(f13);
            if (z11) {
                f14 = 14.0f;
            } else {
                f14 = 16.0f;
            }
            float dp3 = AndroidUtilities.dp(f14);
            if (!z11) {
                f20 = 16.0f;
            }
            canvas.drawCircle(dp2, dp3, AndroidUtilities.dp(f20), paint);
            canvas.save();
            canvas.rotate((1.0f - this.f28371x) * 45.0f, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            float f21 = 11.0f;
            if (z11) {
                f15 = 9.0f;
            } else {
                f15 = 11.0f;
            }
            int dp4 = AndroidUtilities.dp(f15);
            if (z11) {
                f21 = 9.0f;
            }
            int dp5 = AndroidUtilities.dp(f21);
            float f22 = 21.0f;
            if (z11) {
                f16 = 19.0f;
            } else {
                f16 = 21.0f;
            }
            int dp6 = AndroidUtilities.dp(f16);
            if (z11) {
                f22 = 19.0f;
            }
            int dp7 = AndroidUtilities.dp(f22);
            Drawable drawable = this.f28365e;
            drawable.setBounds(dp4, dp5, dp6, dp7);
            drawable.setAlpha((int) (this.f28371x * 255.0f));
            drawable.draw(canvas);
            canvas.restore();
        }
        if (z11) {
            i13 = 26;
        } else {
            i13 = 32;
        }
        float dp8 = this.f28370w + AndroidUtilities.dp(i13 + 9);
        if (z11) {
            f12 = 6.0f;
        } else {
            f12 = 8.0f;
        }
        canvas.translate(dp8, AndroidUtilities.dp(f12));
        int i15 = org.telegram.ui.ActionBar.j6.f20637bi;
        org.telegram.ui.ActionBar.f6 f6Var = this.G;
        J.setColor(i0.a.d(this.f28371x, org.telegram.ui.ActionBar.j6.v0(i15, f6Var), org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J7, f6Var)));
        this.f28367n.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f28367n.getText());
        if (this.f28372y) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), LocaleController.getString(R.string.Delete)));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f7;
        boolean z10 = this.H;
        if (z10) {
            i12 = 20;
        } else {
            i12 = 32;
        }
        int dp = AndroidUtilities.dp(i12 + 25) + this.v;
        if (z10) {
            f7 = 28.0f;
        } else {
            f7 = 32.0f;
        }
        setMeasuredDimension(dp, AndroidUtilities.dp(f7));
    }

    public m30(android.content.Context r23, java.lang.Object r24, org.telegram.messenger.ContactsController.Contact r25, boolean r26, org.telegram.ui.ActionBar.f6 r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.m30.<init>(android.content.Context, java.lang.Object, org.telegram.messenger.ContactsController$Contact, boolean, org.telegram.ui.ActionBar.f6):void");
    }
}
