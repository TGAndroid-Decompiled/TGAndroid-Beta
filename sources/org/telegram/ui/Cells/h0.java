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
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.fa0;
public abstract class h0 extends View {
    public final ImageReceiver E;
    public boolean F;
    public boolean G;
    public final int H;
    public boolean I;
    public final z J;
    public int K;
    public StaticLayout f22178a;
    public String f22179b;
    public String f22180c;
    public String d;
    public int f22181e;
    public int f22182f;
    public int h;
    public int f22183n;
    public fa0 f22184r;
    public final ba0 f22185s;
    public f0 v;
    public final int f22186w;
    public final org.telegram.ui.ActionBar.e6 f22187x;
    public int f22188y;

    public h0(Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        this.f22185s = new ba0(this);
        this.H = AndroidUtilities.dp(4.0f);
        this.f22186w = i10;
        this.f22187x = e6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.E = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setCrossfadeWithOldImage(true);
        imageReceiver.setCrossfadeDuration(300);
        int w02 = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20888i6, e6Var);
        int i11 = SharedConfig.bubbleRadius;
        this.K = i11;
        z Z = org.telegram.ui.ActionBar.i6.Z(w02, i11, i11);
        this.J = Z;
        Z.setCallback(this);
    }

    public final void a() {
        if (this.f22184r != null) {
            this.f22184r = null;
        }
        this.f22185s.d(true);
        invalidate();
    }

    public final void b(boolean r29, long r30, java.lang.String r32, org.telegram.tgnet.TLObject r33, org.telegram.tgnet.tl.TL_bots.BotInfo r34, java.lang.String r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.h0.b(boolean, long, java.lang.String, org.telegram.tgnet.TLObject, org.telegram.tgnet.tl.TL_bots$BotInfo, java.lang.String):void");
    }

    public int getSideMenuWidth() {
        return 0;
    }

    public CharSequence getText() {
        StaticLayout staticLayout = this.f22178a;
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
        int width = (getWidth() - this.f22181e) / 2;
        int dp = AndroidUtilities.dp(2.0f) + this.f22188y;
        Drawable j3 = org.telegram.ui.ActionBar.i6.f21034q3.j();
        if (j3 != null) {
            j3.setBounds(width, dp, this.f22181e + width, this.f22182f + dp);
            j3.draw(canvas);
        }
        Point point = AndroidUtilities.displaySize;
        int i10 = point.x;
        int i11 = point.y;
        if (getParent() instanceof View) {
            View view = (View) getParent();
            i10 = view.getMeasuredWidth();
            i11 = view.getMeasuredHeight();
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.f22187x;
        if (e6Var != null) {
            drawable = e6Var.getDrawable("drawableMsgInMedia");
        } else {
            drawable = null;
        }
        if (drawable == null) {
            drawable = org.telegram.ui.ActionBar.i6.P0("drawableMsgInMedia");
        }
        org.telegram.ui.ActionBar.f5 f5Var = (org.telegram.ui.ActionBar.f5) drawable;
        f5Var.n((int) getY(), i10, i11);
        f5Var.setBounds(width, 0, this.f22181e + width, this.f22182f);
        f5Var.draw(canvas);
        z zVar = this.J;
        if (zVar != null) {
            int i12 = this.K;
            int i13 = SharedConfig.bubbleRadius;
            if (i12 != i13) {
                this.K = i13;
                org.telegram.ui.ActionBar.i6.B1(zVar, i13, i13);
            }
            zVar.setBounds(AndroidUtilities.dp(2.0f) + width, AndroidUtilities.dp(2.0f), (this.f22181e + width) - AndroidUtilities.dp(2.0f), this.f22182f - AndroidUtilities.dp(2.0f));
            zVar.draw(canvas);
        }
        int i14 = this.H;
        float f10 = this.f22188y - i14;
        ImageReceiver imageReceiver = this.E;
        imageReceiver.setImageCoords(width + i14, i14, this.f22181e - (i14 * 2), f10);
        imageReceiver.draw(canvas);
        org.telegram.ui.ActionBar.i6.f20996o2.setColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.ec, e6Var));
        org.telegram.ui.ActionBar.i6.f20996o2.linkColor = org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.gc, e6Var);
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
        this.f22183n = dp3;
        canvas.translate(f11, dp3);
        if (this.f22185s.f(canvas)) {
            invalidate();
        }
        StaticLayout staticLayout = this.f22178a;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StaticLayout staticLayout = this.f22178a;
        if (staticLayout != null) {
            accessibilityNodeInfo.setText(staticLayout.getText());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), AndroidUtilities.dp(8.0f) + this.f22182f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.h0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAnimating(boolean z10) {
        this.I = z10;
    }

    public void setDelegate(f0 f0Var) {
        this.v = f0Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.J && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
