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
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.h90;
public abstract class h0 extends View {
    public final ImageReceiver B;
    public boolean C;
    public boolean D;
    public final int E;
    public boolean F;
    public final z G;
    public int H;
    public StaticLayout f22865a;
    public String f22866b;
    public String f22867c;
    public String d;
    public int f22868e;
    public int f22869f;
    public int h;
    public int f22870n;
    public h90 f22871r;
    public final d90 f22872s;
    public f0 v;
    public final int f22873w;
    public final org.telegram.ui.ActionBar.g6 f22874x;
    public int f22875y;

    public h0(Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        this.f22872s = new d90(this);
        this.E = AndroidUtilities.dp(4.0f);
        this.f22873w = i10;
        this.f22874x = g6Var;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.B = imageReceiver;
        imageReceiver.setInvalidateAll(true);
        imageReceiver.setCrossfadeWithOldImage(true);
        imageReceiver.setCrossfadeDuration(300);
        int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21750i6, g6Var);
        int i11 = SharedConfig.bubbleRadius;
        this.H = i11;
        z Y = org.telegram.ui.ActionBar.k6.Y(v02, i11, i11);
        this.G = Y;
        Y.setCallback(this);
    }

    public final void a() {
        if (this.f22871r != null) {
            this.f22871r = null;
        }
        this.f22872s.d(true);
        invalidate();
    }

    public final void b(boolean r29, long r30, java.lang.String r32, org.telegram.tgnet.TLObject r33, org.telegram.tgnet.tl.TL_bots.BotInfo r34, java.lang.String r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Cells.h0.b(boolean, long, java.lang.String, org.telegram.tgnet.TLObject, org.telegram.tgnet.tl.TL_bots$BotInfo, java.lang.String):void");
    }

    public int getSideMenuWidth() {
        return 0;
    }

    public CharSequence getText() {
        StaticLayout staticLayout = this.f22865a;
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
        int width = (getWidth() - this.f22868e) / 2;
        int dp = AndroidUtilities.dp(2.0f) + this.f22875y;
        Drawable j10 = org.telegram.ui.ActionBar.k6.f21891q3.j();
        if (j10 != null) {
            j10.setBounds(width, dp, this.f22868e + width, this.f22869f + dp);
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
        org.telegram.ui.ActionBar.g6 g6Var = this.f22874x;
        if (g6Var != null) {
            drawable = g6Var.getDrawable("drawableMsgInMedia");
        } else {
            drawable = null;
        }
        if (drawable == null) {
            drawable = org.telegram.ui.ActionBar.k6.O0("drawableMsgInMedia");
        }
        org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) drawable;
        h5Var.n((int) getY(), i10, i11);
        h5Var.setBounds(width, 0, this.f22868e + width, this.f22869f);
        h5Var.draw(canvas);
        z zVar = this.G;
        if (zVar != null) {
            int i12 = this.H;
            int i13 = SharedConfig.bubbleRadius;
            if (i12 != i13) {
                this.H = i13;
                org.telegram.ui.ActionBar.k6.A1(zVar, i13, i13);
            }
            zVar.setBounds(AndroidUtilities.dp(2.0f) + width, AndroidUtilities.dp(2.0f), (this.f22868e + width) - AndroidUtilities.dp(2.0f), this.f22869f - AndroidUtilities.dp(2.0f));
            zVar.draw(canvas);
        }
        int i14 = this.E;
        float f11 = this.f22875y - i14;
        ImageReceiver imageReceiver = this.B;
        imageReceiver.setImageCoords(width + i14, i14, this.f22868e - (i14 * 2), f11);
        imageReceiver.draw(canvas);
        org.telegram.ui.ActionBar.k6.f21853o2.setColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21683ec, g6Var));
        org.telegram.ui.ActionBar.k6.f21853o2.linkColor = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21720gc, g6Var);
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
        this.f22870n = dp3;
        canvas.translate(f12, dp3);
        if (this.f22872s.f(canvas)) {
            invalidate();
        }
        StaticLayout staticLayout = this.f22865a;
        if (staticLayout != null) {
            staticLayout.draw(canvas);
        }
        canvas.restore();
        canvas.restore();
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        StaticLayout staticLayout = this.f22865a;
        if (staticLayout != null) {
            accessibilityNodeInfo.setText(staticLayout.getText());
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), AndroidUtilities.dp(8.0f) + this.f22869f);
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
