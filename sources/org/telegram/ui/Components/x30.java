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
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
public final class x30 extends View implements org.telegram.ui.ActionBar.p6 {
    public static final TextPaint M = new TextPaint(1);
    public static final Paint N = new Paint(1);
    public long E;
    public final int[] F;
    public final org.telegram.ui.ActionBar.u6 G;
    public final boolean H;
    public final boolean I;
    public final int J;
    public boolean K;
    public int L;
    public final String f34597a;
    public final long f34598b;
    public final String f34599c;
    public final boolean d;
    public final Drawable e;
    public final RectF f34600f;
    public final ImageReceiver h;
    public final StaticLayout f34601n;
    public final j9 f34602r;
    public final ContactsController.Contact f34603s;
    public final int v;
    public final float f34604w;
    public float f34605x;
    public boolean f34606y;

    public x30(Context context, Object obj) {
        this(context, obj, null, false, null);
    }

    public final void a() {
        if (!this.f34606y) {
            return;
        }
        this.f34606y = false;
        this.E = System.currentTimeMillis();
        invalidate();
    }

    public final void b() {
        if (this.f34606y) {
            return;
        }
        this.f34606y = true;
        this.E = System.currentTimeMillis();
        invalidate();
    }

    public final void c() {
        int b10 = this.f34602r.b();
        int i10 = org.telegram.ui.ActionBar.y6.G6;
        org.telegram.ui.ActionBar.u6 u6Var = this.G;
        int o12 = org.telegram.ui.ActionBar.y6.o1(0.05f, org.telegram.ui.ActionBar.y6.w0(i10, u6Var));
        int w02 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23366di, u6Var);
        int red = Color.red(o12);
        int[] iArr = this.F;
        iArr[0] = red;
        iArr[1] = Color.red(b10);
        iArr[2] = Color.green(o12);
        iArr[3] = Color.green(b10);
        iArr[4] = Color.blue(o12);
        iArr[5] = Color.blue(b10);
        iArr[6] = Color.alpha(o12);
        iArr[7] = Color.alpha(b10);
        if (!this.K || w02 != this.L) {
            this.K = true;
            this.L = w02;
            this.e.setColorFilter(new PorterDuffColorFilter(w02, PorterDuff.Mode.MULTIPLY));
        }
        N.setColor(o12);
    }

    public ContactsController.Contact getContact() {
        return this.f34603s;
    }

    public String getCountryIso2() {
        return this.f34597a;
    }

    public String getKey() {
        return this.f34599c;
    }

    public long getUid() {
        return this.f34598b;
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
        boolean z10 = this.f34606y;
        if ((z10 && this.f34605x != 1.0f) || (!z10 && this.f34605x != 0.0f)) {
            long currentTimeMillis = System.currentTimeMillis() - this.E;
            if (currentTimeMillis < 0 || currentTimeMillis > 17) {
                currentTimeMillis = 17;
            }
            if (this.f34606y) {
                float f17 = (((float) currentTimeMillis) / 120.0f) + this.f34605x;
                this.f34605x = f17;
                if (f17 >= 1.0f) {
                    this.f34605x = 1.0f;
                }
            } else {
                float f18 = this.f34605x - (((float) currentTimeMillis) / 120.0f);
                this.f34605x = f18;
                if (f18 < 0.0f) {
                    this.f34605x = 0.0f;
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
        RectF rectF = this.f34600f;
        rectF.set(0.0f, 0.0f, measuredWidth, AndroidUtilities.dp(f7));
        int[] iArr = this.F;
        int i14 = iArr[6];
        float f19 = this.f34605x;
        int argb = Color.argb(i14 + ((int) ((iArr[7] - i14) * f19)), iArr[0] + ((int) ((iArr[1] - i10) * f19)), iArr[2] + ((int) ((iArr[3] - i11) * f19)), iArr[4] + ((int) ((iArr[5] - i12) * f19)));
        Paint paint = N;
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
        if (this.f34605x != 1.0f) {
            this.h.draw(canvas);
        }
        if (this.f34605x != 0.0f) {
            paint.setColor(this.f34602r.b());
            paint.setAlpha((int) (this.f34605x * 255.0f * (Color.alpha(b10) / 255.0f)));
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
            canvas.rotate((1.0f - this.f34605x) * 45.0f, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
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
            Drawable drawable = this.e;
            drawable.setBounds(dp4, dp5, dp6, dp7);
            drawable.setAlpha((int) (this.f34605x * 255.0f));
            drawable.draw(canvas);
            canvas.restore();
        }
        if (z11) {
            i13 = 26;
        } else {
            i13 = 32;
        }
        float dp8 = this.f34604w + AndroidUtilities.dp(i13 + 9);
        if (z11) {
            f12 = 6.0f;
        } else {
            f12 = 8.0f;
        }
        canvas.translate(dp8, AndroidUtilities.dp(f12));
        int i15 = org.telegram.ui.ActionBar.y6.f23327bi;
        org.telegram.ui.ActionBar.u6 u6Var = this.G;
        M.setColor(i0.a.f(this.f34605x, org.telegram.ui.ActionBar.y6.w0(i15, u6Var), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.J7, u6Var)));
        this.f34601n.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setText(this.f34601n.getText());
        if (this.f34606y) {
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

    @Override
    public final void updateColors() {
        try {
            j9 j9Var = this.f34602r;
            if (j9Var != null) {
                int i10 = this.J;
                org.telegram.ui.ActionBar.u6 u6Var = this.G;
                if (i10 == 1) {
                    j9Var.h(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Qj, u6Var));
                } else if (i10 == 2) {
                    j9Var.i(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.T7, u6Var), org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23298a8, u6Var));
                } else if (i10 == 3) {
                    j9Var.h(org.telegram.ui.ActionBar.y6.o1(0.7f, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23579p7, u6Var)));
                }
            }
            c();
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public x30(android.content.Context r24, java.lang.Object r25, org.telegram.messenger.ContactsController.Contact r26, boolean r27, org.telegram.ui.ActionBar.u6 r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.x30.<init>(android.content.Context, java.lang.Object, org.telegram.messenger.ContactsController$Contact, boolean, org.telegram.ui.ActionBar.u6):void");
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
