package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.c90;
import org.telegram.ui.Components.g90;
public abstract class h0 extends View {
    public final ImageReceiver B;
    public boolean C;
    public boolean D;
    public final int E;
    public boolean F;
    public final z G;
    public int H;
    public StaticLayout f21119a;
    public String f21120b;
    public String f21121c;
    public String d;
    public int e;
    public int f21122f;
    public int h;
    public int f21123n;
    public g90 f21124r;
    public final c90 f21125s;
    public f0 v;
    public final int f21126w;
    public final org.telegram.ui.ActionBar.f6 f21127x;
    public int f21128y;

    public h0(Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context);
        this.f21125s = new c90(this);
        this.E = AndroidUtilities.dp(4.0f);
        this.f21126w = i10;
        this.f21127x = f6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.B = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setCrossfadeWithOldImage(true);
        imageReceiver.setCrossfadeDuration(300);
        int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19971i6, f6Var);
        int i11 = SharedConfig.bubbleRadius;
        this.H = i11;
        z Y = org.telegram.ui.ActionBar.j6.Y(v02, i11, i11);
        this.G = Y;
        Y.setCallback(this);
    }

    public final void a() {
        if (this.f21124r != null) {
            this.f21124r = null;
        }
        this.f21125s.d(true);
        invalidate();
    }

    public final void b(boolean r29, long r30, java.lang.String r32, org.telegram.tgnet.TLObject r33, org.telegram.tgnet.tl.TL_bots.BotInfo r34, java.lang.String r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.h0.b(boolean, long, java.lang.String, org.telegram.tgnet.TLObject, org.telegram.tgnet.tl.TL_bots$BotInfo, java.lang.String):void");
    }

    public int getSideMenuWidth() {
        return 0;
    }

    public CharSequence getText() {
        StaticLayout staticLayout = this.f21119a;
        if (staticLayout == null) {
            return null;
        }
        return staticLayout.getText();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.B.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.B.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        float f10;
        canvas.save();
        canvas.translate(getSideMenuWidth() / 2.0f, 0.0f);
        int width = (getWidth() - this.e) / 2;
        int dp = AndroidUtilities.dp(2.0f) + this.f21128y;
        Drawable j10 = org.telegram.ui.ActionBar.j6.f20112q3.j();
        if (j10 != null) {
            j10.setBounds(width, dp, this.e + width, this.f21122f + dp);
            j10.draw(canvas);
        }
        Point point = AndroidUtilities.displaySize;
        int i10 = point.x;
        int i11 = point.y;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            i10 = view.getMeasuredWidth();
            i11 = view.getMeasuredHeight();
        }
        org.telegram.ui.ActionBar.f6 f6Var = this.f21127x;
        if (f6Var != null) {
            drawable = f6Var.getDrawable("drawableMsgInMedia");
        } else {
            drawable = null;
        }
        if (drawable == null) {
            drawable = org.telegram.ui.ActionBar.j6.O0("drawableMsgInMedia");
        }
        org.telegram.ui.ActionBar.g5 g5Var = (org.telegram.ui.ActionBar.g5) drawable;
        g5Var.n((int) getY(), i10, i11);
        g5Var.setBounds(width, 0, this.e + width, this.f21122f);
        g5Var.draw(canvas);
        z zVar = this.G;
        if (zVar != null) {
            int i12 = this.H;
            int i13 = SharedConfig.bubbleRadius;
            if (i12 != i13) {
                this.H = i13;
                org.telegram.ui.ActionBar.j6.A1(zVar, i13, i13);
            }
            zVar.setBounds(AndroidUtilities.dp(2.0f) + width, AndroidUtilities.dp(2.0f), (this.e + width) - AndroidUtilities.dp(2.0f), this.f21122f - AndroidUtilities.dp(2.0f));
            zVar.draw(canvas);
        }
        int i14 = this.E;
        float f11 = this.f21128y - i14;
        ImageReceiver imageReceiver = this.B;
        imageReceiver.setImageCoords(width + i14, i14, this.e - (i14 * 2), f11);
        imageReceiver.draw(canvas);
        org.telegram.ui.ActionBar.j6.f20074o2.setColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19904ec, f6Var));
        org.telegram.ui.ActionBar.j6.f20074o2.linkColor = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19941gc, f6Var);
        canvas.save();
        if (this.C) {
            f10 = 14.0f;
        } else {
            f10 = 11.0f;
        }
        int dp2 = AndroidUtilities.dp(f10) + width;
        this.h = dp2;
        float f12 = dp2;
        int dp3 = AndroidUtilities.dp(11.0f) + dp;
        this.f21123n = dp3;
        canvas.translate(f12, dp3);
        if (this.f21125s.f(canvas)) {
            invalidate();
        }
        StaticLayout staticLayout = this.f21119a;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StaticLayout staticLayout = this.f21119a;
        if (staticLayout != null) {
            accessibilityNodeInfo.setText(staticLayout.getText());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), AndroidUtilities.dp(8.0f) + this.f21122f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.h0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAnimating(boolean z4) {
        this.F = z4;
    }

    public void setDelegate(f0 f0Var) {
        this.v = f0Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.G && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
