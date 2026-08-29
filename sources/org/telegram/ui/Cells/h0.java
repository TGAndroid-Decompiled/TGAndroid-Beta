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
import org.telegram.ui.Components.v80;
import org.telegram.ui.Components.z80;
public abstract class h0 extends View {
    public final ImageReceiver A;
    public boolean B;
    public boolean C;
    public final int D;
    public boolean E;
    public final z F;
    public int G;
    public StaticLayout f24424a;
    public String f24425b;
    public String f24426c;
    public String d;
    public int f24427e;
    public int f24428f;
    public int h;
    public int f24429n;
    public z80 f24430r;
    public final v80 f24431s;
    public f0 v;
    public final int f24432w;
    public final org.telegram.ui.ActionBar.c6 f24433x;
    public int f24434y;

    public h0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f24431s = new v80(this);
        this.D = AndroidUtilities.dp(4.0f);
        this.f24432w = i10;
        this.f24433x = c6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.A = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setCrossfadeWithOldImage(true);
        imageReceiver.setCrossfadeDuration(300);
        int v02 = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var);
        int i11 = SharedConfig.bubbleRadius;
        this.G = i11;
        z Y = org.telegram.ui.ActionBar.g6.Y(v02, i11, i11);
        this.F = Y;
        Y.setCallback(this);
    }

    public final void a() {
        if (this.f24430r != null) {
            this.f24430r = null;
        }
        this.f24431s.d(true);
        invalidate();
    }

    public final void b(boolean r29, long r30, java.lang.String r32, org.telegram.tgnet.TLObject r33, org.telegram.tgnet.tl.TL_bots.BotInfo r34, java.lang.String r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.h0.b(boolean, long, java.lang.String, org.telegram.tgnet.TLObject, org.telegram.tgnet.tl.TL_bots$BotInfo, java.lang.String):void");
    }

    public int getSideMenuWidth() {
        return 0;
    }

    public CharSequence getText() {
        StaticLayout staticLayout = this.f24424a;
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
        float f9;
        canvas.save();
        canvas.translate(getSideMenuWidth() / 2.0f, 0.0f);
        int width = (getWidth() - this.f24427e) / 2;
        int dp = AndroidUtilities.dp(2.0f) + this.f24434y;
        Drawable j10 = org.telegram.ui.ActionBar.g6.f23292q3.j();
        if (j10 != null) {
            j10.setBounds(width, dp, this.f24427e + width, this.f24428f + dp);
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
        org.telegram.ui.ActionBar.c6 c6Var = this.f24433x;
        if (c6Var != null) {
            drawable = c6Var.getDrawable("drawableMsgInMedia");
        } else {
            drawable = null;
        }
        if (drawable == null) {
            drawable = org.telegram.ui.ActionBar.g6.O0("drawableMsgInMedia");
        }
        org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) drawable;
        d5Var.n((int) getY(), i10, i11);
        d5Var.setBounds(width, 0, this.f24427e + width, this.f24428f);
        d5Var.draw(canvas);
        z zVar = this.F;
        if (zVar != null) {
            int i12 = this.G;
            int i13 = SharedConfig.bubbleRadius;
            if (i12 != i13) {
                this.G = i13;
                org.telegram.ui.ActionBar.g6.A1(zVar, i13, i13);
            }
            zVar.setBounds(AndroidUtilities.dp(2.0f) + width, AndroidUtilities.dp(2.0f), (this.f24427e + width) - AndroidUtilities.dp(2.0f), this.f24428f - AndroidUtilities.dp(2.0f));
            zVar.draw(canvas);
        }
        int i14 = this.D;
        float f10 = this.f24434y - i14;
        ImageReceiver imageReceiver = this.A;
        imageReceiver.setImageCoords(width + i14, i14, this.f24427e - (i14 * 2), f10);
        imageReceiver.draw(canvas);
        org.telegram.ui.ActionBar.g6.f23256o2.setColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23086ec, c6Var));
        org.telegram.ui.ActionBar.g6.f23256o2.linkColor = org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var);
        canvas.save();
        if (this.B) {
            f9 = 14.0f;
        } else {
            f9 = 11.0f;
        }
        int dp2 = AndroidUtilities.dp(f9) + width;
        this.h = dp2;
        float f11 = dp2;
        int dp3 = AndroidUtilities.dp(11.0f) + dp;
        this.f24429n = dp3;
        canvas.translate(f11, dp3);
        if (this.f24431s.f(canvas)) {
            invalidate();
        }
        StaticLayout staticLayout = this.f24424a;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StaticLayout staticLayout = this.f24424a;
        if (staticLayout != null) {
            accessibilityNodeInfo.setText(staticLayout.getText());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), AndroidUtilities.dp(8.0f) + this.f24428f);
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
