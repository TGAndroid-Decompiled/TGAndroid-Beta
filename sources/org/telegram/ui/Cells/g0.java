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
import org.telegram.ui.Components.v90;
import org.telegram.ui.Components.z90;
public abstract class g0 extends View {
    public final ImageReceiver E;
    public boolean F;
    public boolean G;
    public final int H;
    public boolean I;
    public final y J;
    public int K;
    public StaticLayout f22386a;
    public String f22387b;
    public String f22388c;
    public String d;
    public int e;
    public int f22389f;
    public int h;
    public int f22390n;
    public z90 f22391r;
    public final v90 f22392s;
    public e0 v;
    public final int f22393w;
    public final org.telegram.ui.ActionBar.g6 f22394x;
    public int f22395y;

    public g0(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f22392s = new v90(this);
        this.H = AndroidUtilities.dp(4.0f);
        this.f22393w = i10;
        this.f22394x = g6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.E = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setCrossfadeWithOldImage(true);
        imageReceiver.setCrossfadeDuration(300);
        int w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21272i6, g6Var);
        int i11 = SharedConfig.bubbleRadius;
        this.K = i11;
        y Z = org.telegram.ui.ActionBar.k6.Z(w02, i11, i11);
        this.J = Z;
        Z.setCallback(this);
    }

    public final void a() {
        if (this.f22391r != null) {
            this.f22391r = null;
        }
        this.f22392s.d(true);
        invalidate();
    }

    public final void b(boolean r29, long r30, java.lang.String r32, org.telegram.tgnet.TLObject r33, org.telegram.tgnet.tl.TL_bots.BotInfo r34, java.lang.String r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.g0.b(boolean, long, java.lang.String, org.telegram.tgnet.TLObject, org.telegram.tgnet.tl.TL_bots$BotInfo, java.lang.String):void");
    }

    public int getSideMenuWidth() {
        return 0;
    }

    public CharSequence getText() {
        StaticLayout staticLayout = this.f22386a;
        if (staticLayout == null) {
            return null;
        }
        return staticLayout.getText();
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.E.onAttachedToWindow();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.E.onDetachedFromWindow();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Drawable drawable;
        float f7;
        canvas.save();
        canvas.translate(getSideMenuWidth() / 2.0f, 0.0f);
        int width = (getWidth() - this.e) / 2;
        int dp = AndroidUtilities.dp(2.0f) + this.f22395y;
        Drawable j10 = org.telegram.ui.ActionBar.k6.f21418q3.j();
        if (j10 != null) {
            j10.setBounds(width, dp, this.e + width, this.f22389f + dp);
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
        org.telegram.ui.ActionBar.g6 g6Var = this.f22394x;
        if (g6Var != null) {
            drawable = g6Var.getDrawable("drawableMsgInMedia");
        } else {
            drawable = null;
        }
        if (drawable == null) {
            drawable = org.telegram.ui.ActionBar.k6.Q0("drawableMsgInMedia");
        }
        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) drawable;
        j5Var.m((int) getY(), i10, i11);
        j5Var.setBounds(width, 0, this.e + width, this.f22389f);
        j5Var.draw(canvas);
        y yVar = this.J;
        if (yVar != null) {
            int i12 = this.K;
            int i13 = SharedConfig.bubbleRadius;
            if (i12 != i13) {
                this.K = i13;
                org.telegram.ui.ActionBar.k6.D1(yVar, i13, i13);
            }
            yVar.setBounds(AndroidUtilities.dp(2.0f) + width, AndroidUtilities.dp(2.0f), (this.e + width) - AndroidUtilities.dp(2.0f), this.f22389f - AndroidUtilities.dp(2.0f));
            yVar.draw(canvas);
        }
        int i14 = this.H;
        float f10 = this.f22395y - i14;
        ImageReceiver imageReceiver = this.E;
        imageReceiver.setImageCoords(width + i14, i14, this.e - (i14 * 2), f10);
        imageReceiver.draw(canvas);
        org.telegram.ui.ActionBar.k6.f21382o2.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21205ec, g6Var));
        org.telegram.ui.ActionBar.k6.f21382o2.linkColor = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21242gc, g6Var);
        canvas.save();
        if (this.F) {
            f7 = 14.0f;
        } else {
            f7 = 11.0f;
        }
        int dp2 = AndroidUtilities.dp(f7) + width;
        this.h = dp2;
        float f11 = dp2;
        int dp3 = AndroidUtilities.dp(11.0f) + dp;
        this.f22390n = dp3;
        canvas.translate(f11, dp3);
        if (this.f22392s.f(canvas)) {
            invalidate();
        }
        StaticLayout staticLayout = this.f22386a;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StaticLayout staticLayout = this.f22386a;
        if (staticLayout != null) {
            accessibilityNodeInfo.setText(staticLayout.getText());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), AndroidUtilities.dp(8.0f) + this.f22389f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.g0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAnimating(boolean z10) {
        this.I = z10;
    }

    public void setDelegate(e0 e0Var) {
        this.v = e0Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.J && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
