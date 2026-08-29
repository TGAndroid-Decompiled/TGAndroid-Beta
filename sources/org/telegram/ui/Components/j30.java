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
public final class j30 extends View {
    public static final TextPaint F = new TextPaint(1);
    public static final Paint G = new Paint(1);
    public long A;
    public final int[] B;
    public final org.telegram.ui.ActionBar.c6 C;
    public final boolean D;
    public final boolean E;
    public final String f29530a;
    public final long f29531b;
    public final String f29532c;
    public final boolean d;
    public final Drawable f29533e;
    public final RectF f29534f;
    public final ImageReceiver h;
    public final StaticLayout f29535n;
    public final e9 f29536r;
    public final ContactsController.Contact f29537s;
    public final int v;
    public final float f29538w;
    public float f29539x;
    public boolean f29540y;

    public j30(Context context, Object obj) {
        this(context, obj, null, false, null);
    }

    public final void a() {
        if (!this.f29540y) {
            return;
        }
        this.f29540y = false;
        this.A = System.currentTimeMillis();
        invalidate();
    }

    public final void b() {
        if (this.f29540y) {
            return;
        }
        this.f29540y = true;
        this.A = System.currentTimeMillis();
        invalidate();
    }

    public final void c() {
        int b10 = this.f29536r.b();
        int i10 = org.telegram.ui.ActionBar.g6.G6;
        org.telegram.ui.ActionBar.c6 c6Var = this.C;
        int l1 = org.telegram.ui.ActionBar.g6.l1(0.05f, org.telegram.ui.ActionBar.g6.v0(i10, c6Var));
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.di, c6Var);
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
        this.f29533e.setColorFilter(new PorterDuffColorFilter(v02, PorterDuff.Mode.MULTIPLY));
        G.setColor(l1);
    }

    public ContactsController.Contact getContact() {
        return this.f29537s;
    }

    public String getCountryIso2() {
        return this.f29530a;
    }

    public String getKey() {
        return this.f29532c;
    }

    public long getUid() {
        return this.f29531b;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float f9;
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
        boolean z10 = this.f29540y;
        if ((z10 && this.f29539x != 1.0f) || (!z10 && this.f29539x != 0.0f)) {
            long currentTimeMillis = System.currentTimeMillis() - this.A;
            if (currentTimeMillis < 0 || currentTimeMillis > 17) {
                currentTimeMillis = 17;
            }
            if (this.f29540y) {
                float f17 = (((float) currentTimeMillis) / 120.0f) + this.f29539x;
                this.f29539x = f17;
                if (f17 >= 1.0f) {
                    this.f29539x = 1.0f;
                }
            } else {
                float f18 = this.f29539x - (((float) currentTimeMillis) / 120.0f);
                this.f29539x = f18;
                if (f18 < 0.0f) {
                    this.f29539x = 0.0f;
                }
            }
            invalidate();
        }
        canvas.save();
        float measuredWidth = getMeasuredWidth();
        boolean z11 = this.D;
        if (z11) {
            f9 = 28.0f;
        } else {
            f9 = 32.0f;
        }
        RectF rectF = this.f29534f;
        rectF.set(0.0f, 0.0f, measuredWidth, AndroidUtilities.dp(f9));
        int[] iArr = this.B;
        int i14 = iArr[6];
        float f19 = this.f29539x;
        int argb = Color.argb(i14 + ((int) ((iArr[7] - i14) * f19)), iArr[0] + ((int) ((iArr[1] - i10) * f19)), iArr[2] + ((int) ((iArr[3] - i11) * f19)), iArr[4] + ((int) ((iArr[5] - i12) * f19)));
        Paint paint = G;
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
        if (this.f29539x != 1.0f) {
            this.h.draw(canvas);
        }
        if (this.f29539x != 0.0f) {
            paint.setColor(this.f29536r.b());
            paint.setAlpha((int) (this.f29539x * 255.0f * (Color.alpha(b10) / 255.0f)));
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
            canvas.rotate((1.0f - this.f29539x) * 45.0f, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
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
            Drawable drawable = this.f29533e;
            drawable.setBounds(dp4, dp5, dp6, dp7);
            drawable.setAlpha((int) (this.f29539x * 255.0f));
            drawable.draw(canvas);
            canvas.restore();
        }
        if (z11) {
            i13 = 26;
        } else {
            i13 = 32;
        }
        float dp8 = this.f29538w + AndroidUtilities.dp(i13 + 9);
        if (z11) {
            f12 = 6.0f;
        } else {
            f12 = 8.0f;
        }
        canvas.translate(dp8, AndroidUtilities.dp(f12));
        int i15 = org.telegram.ui.ActionBar.g6.bi;
        org.telegram.ui.ActionBar.c6 c6Var = this.C;
        F.setColor(i0.a.d(this.f29539x, org.telegram.ui.ActionBar.g6.v0(i15, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.J7, c6Var)));
        this.f29535n.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f29535n.getText());
        if (this.f29540y) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_CLICK.getId(), LocaleController.getString(R.string.Delete)));
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int i12;
        float f9;
        boolean z10 = this.D;
        if (z10) {
            i12 = 20;
        } else {
            i12 = 32;
        }
        int dp = AndroidUtilities.dp(i12 + 25) + this.v;
        if (z10) {
            f9 = 28.0f;
        } else {
            f9 = 32.0f;
        }
        setMeasuredDimension(dp, AndroidUtilities.dp(f9));
    }

    public j30(android.content.Context r23, java.lang.Object r24, org.telegram.messenger.ContactsController.Contact r25, boolean r26, org.telegram.ui.ActionBar.c6 r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j30.<init>(android.content.Context, java.lang.Object, org.telegram.messenger.ContactsController$Contact, boolean, org.telegram.ui.ActionBar.c6):void");
    }
}
