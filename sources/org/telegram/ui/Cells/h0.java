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
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.m80;
public abstract class h0 extends View {
    public final ImageReceiver A;
    public boolean B;
    public boolean C;
    public final int D;
    public boolean E;
    public final z F;
    public int G;
    public StaticLayout f24413a;
    public String f24414b;
    public String f24415c;
    public String d;
    public int f24416e;
    public int f24417f;
    public int h;
    public int f24418n;
    public m80 f24419r;
    public final i80 f24420s;
    public f0 v;
    public final int f24421w;
    public final org.telegram.ui.ActionBar.b6 f24422x;
    public int f24423y;

    public h0(Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context);
        this.f24420s = new i80(this);
        this.D = AndroidUtilities.dp(4.0f);
        this.f24421w = i9;
        this.f24422x = b6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.A = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setCrossfadeWithOldImage(true);
        imageReceiver.setCrossfadeDuration(300);
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var);
        int i10 = SharedConfig.bubbleRadius;
        this.G = i10;
        z Y = org.telegram.ui.ActionBar.f6.Y(v02, i10, i10);
        this.F = Y;
        Y.setCallback(this);
    }

    public final void a() {
        if (this.f24419r != null) {
            this.f24419r = null;
        }
        this.f24420s.d(true);
        invalidate();
    }

    public final void b(boolean r29, long r30, java.lang.String r32, org.telegram.tgnet.TLObject r33, org.telegram.tgnet.tl.TL_bots.BotInfo r34, java.lang.String r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.h0.b(boolean, long, java.lang.String, org.telegram.tgnet.TLObject, org.telegram.tgnet.tl.TL_bots$BotInfo, java.lang.String):void");
    }

    public int getSideMenuWidth() {
        return 0;
    }

    public CharSequence getText() {
        StaticLayout staticLayout = this.f24413a;
        if (staticLayout == null) {
            return null;
        }
        return staticLayout.getText();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        float f10;
        canvas.save();
        canvas.translate(getSideMenuWidth() / 2.0f, 0.0f);
        int width = (getWidth() - this.f24416e) / 2;
        int dp = AndroidUtilities.dp(2.0f) + this.f24423y;
        Drawable j10 = org.telegram.ui.ActionBar.f6.f23226q3.j();
        if (j10 != null) {
            j10.setBounds(width, dp, this.f24416e + width, this.f24417f + dp);
            j10.draw(canvas);
        }
        Point point = AndroidUtilities.displaySize;
        int i9 = point.x;
        int i10 = point.y;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            i9 = view.getMeasuredWidth();
            i10 = view.getMeasuredHeight();
        }
        org.telegram.ui.ActionBar.b6 b6Var = this.f24422x;
        if (b6Var != null) {
            drawable = b6Var.getDrawable("drawableMsgInMedia");
        } else {
            drawable = null;
        }
        if (drawable == null) {
            drawable = org.telegram.ui.ActionBar.f6.O0("drawableMsgInMedia");
        }
        org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) drawable;
        d5Var.n((int) getY(), i9, i10);
        d5Var.setBounds(width, 0, this.f24416e + width, this.f24417f);
        d5Var.draw(canvas);
        z zVar = this.F;
        if (zVar != null) {
            int i11 = this.G;
            int i12 = SharedConfig.bubbleRadius;
            if (i11 != i12) {
                this.G = i12;
                org.telegram.ui.ActionBar.f6.A1(zVar, i12, i12);
            }
            zVar.setBounds(AndroidUtilities.dp(2.0f) + width, AndroidUtilities.dp(2.0f), (this.f24416e + width) - AndroidUtilities.dp(2.0f), this.f24417f - AndroidUtilities.dp(2.0f));
            zVar.draw(canvas);
        }
        int i13 = this.D;
        float f11 = this.f24423y - i13;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.setImageCoords(width + i13, i13, this.f24416e - (i13 * 2), f11);
        imageReceiver.draw(canvas);
        org.telegram.ui.ActionBar.f6.f23193o2.setColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.ec, b6Var));
        org.telegram.ui.ActionBar.f6.f23193o2.linkColor = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23061gc, b6Var);
        canvas.save();
        if (this.B) {
            f10 = 14.0f;
        } else {
            f10 = 11.0f;
        }
        int dp2 = AndroidUtilities.dp(f10) + width;
        this.h = dp2;
        float f12 = dp2;
        int dp3 = AndroidUtilities.dp(11.0f) + dp;
        this.f24418n = dp3;
        canvas.translate(f12, dp3);
        if (this.f24420s.f(canvas)) {
            invalidate();
        }
        StaticLayout staticLayout = this.f24413a;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StaticLayout staticLayout = this.f24413a;
        if (staticLayout != null) {
            accessibilityNodeInfo.setText(staticLayout.getText());
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i9), 1073741824), AndroidUtilities.dp(8.0f) + this.f24417f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.h0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAnimating(boolean z10) {
        this.E = z10;
    }

    public void setDelegate(f0 f0Var) {
        this.v = f0Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.F && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
