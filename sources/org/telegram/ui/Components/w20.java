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
public final class w20 extends View {
    public static final TextPaint F = new TextPaint(1);
    public static final Paint G = new Paint(1);
    public long A;
    public final int[] B;
    public final org.telegram.ui.ActionBar.b6 C;
    public final boolean D;
    public final boolean E;
    public final String f34078a;
    public final long f34079b;
    public final String f34080c;
    public final boolean d;
    public final Drawable f34081e;
    public final RectF f34082f;
    public final ImageReceiver h;
    public final StaticLayout f34083n;
    public final z8 f34084r;
    public final ContactsController.Contact f34085s;
    public final int v;
    public final float f34086w;
    public float f34087x;
    public boolean f34088y;

    public w20(Context context, Object obj) {
        this(context, obj, null, false, null);
    }

    public final void a() {
        if (!this.f34088y) {
            return;
        }
        this.f34088y = false;
        this.A = System.currentTimeMillis();
        invalidate();
    }

    public final void b() {
        if (this.f34088y) {
            return;
        }
        this.f34088y = true;
        this.A = System.currentTimeMillis();
        invalidate();
    }

    public final void c() {
        int b10 = this.f34084r.b();
        int i9 = org.telegram.ui.ActionBar.f6.G6;
        org.telegram.ui.ActionBar.b6 b6Var = this.C;
        int l1 = org.telegram.ui.ActionBar.f6.l1(0.05f, org.telegram.ui.ActionBar.f6.v0(i9, b6Var));
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.di, b6Var);
        int red = Color.red(l1);
        int[] iArr = this.B;
        iArr[0] = red;
        iArr[1] = Color.red(b10);
        iArr[2] = Color.green(l1);
        iArr[3] = Color.green(b10);
        iArr[4] = Color.blue(l1);
        iArr[5] = Color.blue(b10);
        iArr[6] = Color.alpha(l1);
        iArr[7] = Color.alpha(b10);
        this.f34081e.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
        G.setColor(l1);
    }

    public ContactsController.Contact getContact() {
        return this.f34085s;
    }

    public String getCountryIso2() {
        return this.f34078a;
    }

    public String getKey() {
        return this.f34080c;
    }

    public long getUid() {
        return this.f34079b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f10;
        int i9;
        int i10;
        int i11;
        float f11;
        float f12;
        int i12;
        float f13;
        int b10;
        float f14;
        float f15;
        float f16;
        float f17;
        boolean z10 = this.f34088y;
        if ((z10 && this.f34087x != 1.0f) || (!z10 && this.f34087x != 0.0f)) {
            long currentTimeMillis = System.currentTimeMillis() - this.A;
            if (currentTimeMillis < 0 || currentTimeMillis > 17) {
                currentTimeMillis = 17;
            }
            if (this.f34088y) {
                float f18 = (((float) currentTimeMillis) / 120.0f) + this.f34087x;
                this.f34087x = f18;
                if (f18 >= 1.0f) {
                    this.f34087x = 1.0f;
                }
            } else {
                float f19 = this.f34087x - (((float) currentTimeMillis) / 120.0f);
                this.f34087x = f19;
                if (f19 < 0.0f) {
                    this.f34087x = 0.0f;
                }
            }
            invalidate();
        }
        canvas.save();
        float measuredWidth = getMeasuredWidth();
        boolean z11 = this.D;
        if (z11) {
            f10 = 28.0f;
        } else {
            f10 = 32.0f;
        }
        RectF rectF = this.f34082f;
        rectF.set(0.0f, 0.0f, measuredWidth, AndroidUtilities.dp(f10));
        int[] iArr = this.B;
        int i13 = iArr[6];
        float f20 = this.f34087x;
        int argb = Color.argb(i13 + ((int) ((iArr[7] - i13) * f20)), iArr[0] + ((int) ((iArr[1] - i9) * f20)), iArr[2] + ((int) ((iArr[3] - i10) * f20)), iArr[4] + ((int) ((iArr[5] - i11) * f20)));
        Paint paint = G;
        paint.setColor(argb);
        float f21 = 14.0f;
        if (z11) {
            f11 = 14.0f;
        } else {
            f11 = 16.0f;
        }
        float dp = AndroidUtilities.dp(f11);
        if (z11) {
            f12 = 14.0f;
        } else {
            f12 = 16.0f;
        }
        canvas.drawRoundRect(rectF, dp, AndroidUtilities.dp(f12), paint);
        if (this.f34087x != 1.0f) {
            this.h.draw(canvas);
        }
        if (this.f34087x != 0.0f) {
            paint.setColor(this.f34084r.b());
            paint.setAlpha((int) (this.f34087x * 255.0f * (Color.alpha(b10) / 255.0f)));
            if (z11) {
                f14 = 14.0f;
            } else {
                f14 = 16.0f;
            }
            float dp2 = AndroidUtilities.dp(f14);
            if (z11) {
                f15 = 14.0f;
            } else {
                f15 = 16.0f;
            }
            float dp3 = AndroidUtilities.dp(f15);
            if (!z11) {
                f21 = 16.0f;
            }
            canvas.drawCircle(dp2, dp3, AndroidUtilities.dp(f21), paint);
            canvas.save();
            canvas.rotate((1.0f - this.f34087x) * 45.0f, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
            float f22 = 11.0f;
            if (z11) {
                f16 = 9.0f;
            } else {
                f16 = 11.0f;
            }
            int dp4 = AndroidUtilities.dp(f16);
            if (z11) {
                f22 = 9.0f;
            }
            int dp5 = AndroidUtilities.dp(f22);
            float f23 = 21.0f;
            if (z11) {
                f17 = 19.0f;
            } else {
                f17 = 21.0f;
            }
            int dp6 = AndroidUtilities.dp(f17);
            if (z11) {
                f23 = 19.0f;
            }
            int dp7 = AndroidUtilities.dp(f23);
            Drawable drawable = this.f34081e;
            drawable.setBounds(dp4, dp5, dp6, dp7);
            drawable.setAlpha((int) (this.f34087x * 255.0f));
            drawable.draw(canvas);
            canvas.restore();
        }
        if (z11) {
            i12 = 26;
        } else {
            i12 = 32;
        }
        float dp8 = this.f34086w + AndroidUtilities.dp(i12 + 9);
        if (z11) {
            f13 = 6.0f;
        } else {
            f13 = 8.0f;
        }
        canvas.translate(dp8, AndroidUtilities.dp(f13));
        int i14 = org.telegram.ui.ActionBar.f6.bi;
        org.telegram.ui.ActionBar.b6 b6Var = this.C;
        F.setColor(i0.a.d(this.f34087x, org.telegram.ui.ActionBar.f6.v0(i14, b6Var), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.J7, b6Var)));
        this.f34083n.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f34083n.getText());
        if (this.f34088y) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), LocaleController.getString(R.string.Delete)));
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        int i11;
        float f10;
        boolean z10 = this.D;
        if (z10) {
            i11 = 20;
        } else {
            i11 = 32;
        }
        int dp = AndroidUtilities.dp(i11 + 25) + this.v;
        if (z10) {
            f10 = 28.0f;
        } else {
            f10 = 32.0f;
        }
        setMeasuredDimension(dp, AndroidUtilities.dp(f10));
    }

    public w20(android.content.Context r23, java.lang.Object r24, org.telegram.messenger.ContactsController.Contact r25, boolean r26, org.telegram.ui.ActionBar.b6 r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.w20.<init>(android.content.Context, java.lang.Object, org.telegram.messenger.ContactsController$Contact, boolean, org.telegram.ui.ActionBar.b6):void");
    }
}
