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
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.ea0;
public abstract class i0 extends View {
    public final ImageReceiver E;
    public boolean F;
    public boolean G;
    public final int H;
    public boolean I;
    public final z J;
    public int K;
    public StaticLayout f21292a;
    public String f21293b;
    public String f21294c;
    public String d;
    public int e;
    public int f21295f;
    public int h;
    public int f21296n;
    public ea0 f21297r;
    public final aa0 f21298s;
    public g0 v;
    public final int f21299w;
    public final org.telegram.ui.ActionBar.c6 f21300x;
    public int f21301y;

    public i0(Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f21298s = new aa0(this);
        this.H = AndroidUtilities.dp(4.0f);
        this.f21299w = i10;
        this.f21300x = c6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.E = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setCrossfadeWithOldImage(true);
        imageReceiver.setCrossfadeDuration(300);
        int w02 = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19990i6, c6Var);
        int i11 = SharedConfig.bubbleRadius;
        this.K = i11;
        z Z = org.telegram.ui.ActionBar.g6.Z(w02, i11, i11);
        this.J = Z;
        Z.setCallback(this);
    }

    public final void a() {
        if (this.f21297r != null) {
            this.f21297r = null;
        }
        this.f21298s.d(true);
        invalidate();
    }

    public final void b(boolean r29, long r30, java.lang.String r32, org.telegram.tgnet.TLObject r33, org.telegram.tgnet.tl.TL_bots.BotInfo r34, java.lang.String r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.i0.b(boolean, long, java.lang.String, org.telegram.tgnet.TLObject, org.telegram.tgnet.tl.TL_bots$BotInfo, java.lang.String):void");
    }

    public int getSideMenuWidth() {
        return 0;
    }

    public CharSequence getText() {
        StaticLayout staticLayout = this.f21292a;
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
        int dp = AndroidUtilities.dp(2.0f) + this.f21301y;
        Drawable j10 = org.telegram.ui.ActionBar.g6.f20136q3.j();
        if (j10 != null) {
            j10.setBounds(width, dp, this.e + width, this.f21295f + dp);
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
        org.telegram.ui.ActionBar.c6 c6Var = this.f21300x;
        if (c6Var != null) {
            drawable = c6Var.getDrawable("drawableMsgInMedia");
        } else {
            drawable = null;
        }
        if (drawable == null) {
            drawable = org.telegram.ui.ActionBar.g6.P0("drawableMsgInMedia");
        }
        org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) drawable;
        d5Var.n((int) getY(), i10, i11);
        d5Var.setBounds(width, 0, this.e + width, this.f21295f);
        d5Var.draw(canvas);
        z zVar = this.J;
        if (zVar != null) {
            int i12 = this.K;
            int i13 = SharedConfig.bubbleRadius;
            if (i12 != i13) {
                this.K = i13;
                org.telegram.ui.ActionBar.g6.B1(zVar, i13, i13);
            }
            zVar.setBounds(AndroidUtilities.dp(2.0f) + width, AndroidUtilities.dp(2.0f), (this.e + width) - AndroidUtilities.dp(2.0f), this.f21295f - AndroidUtilities.dp(2.0f));
            zVar.draw(canvas);
        }
        int i14 = this.H;
        float f10 = this.f21301y - i14;
        ImageReceiver imageReceiver = this.E;
        imageReceiver.setImageCoords(width + i14, i14, this.e - (i14 * 2), f10);
        imageReceiver.draw(canvas);
        org.telegram.ui.ActionBar.g6.f20100o2.setColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19923ec, c6Var));
        org.telegram.ui.ActionBar.g6.f20100o2.linkColor = org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19960gc, c6Var);
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
        this.f21296n = dp3;
        canvas.translate(f11, dp3);
        if (this.f21298s.f(canvas)) {
            invalidate();
        }
        StaticLayout staticLayout = this.f21292a;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StaticLayout staticLayout = this.f21292a;
        if (staticLayout != null) {
            accessibilityNodeInfo.setText(staticLayout.getText());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), AndroidUtilities.dp(8.0f) + this.f21295f);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r17) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.i0.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAnimating(boolean z10) {
        this.I = z10;
    }

    public void setDelegate(g0 g0Var) {
        this.v = g0Var;
    }

    @Override
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable != this.J && !super.verifyDrawable(drawable)) {
            return false;
        }
        return true;
    }
}
