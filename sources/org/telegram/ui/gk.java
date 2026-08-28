package org.telegram.ui;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.FragmentContextView;
public final class gk extends TextView {
    public final int f38559a;
    public Object f38560b;

    public gk(Object obj, Context context, int i9) {
        super(context);
        this.f38559a = i9;
        this.f38560b = obj;
    }

    public void a(int i9) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f38560b;
        if (fragmentContextView.I != i9) {
            org.telegram.ui.Components.c10 c10Var = fragmentContextView.d;
            c10Var.setPadding(c10Var.getPaddingLeft(), fragmentContextView.d.getPaddingTop(), (fragmentContextView.d.getPaddingRight() - fragmentContextView.I) + i9, fragmentContextView.d.getPaddingBottom());
            fragmentContextView.I = i9;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f38559a) {
            case 1:
                super.draw(canvas);
                int dp = AndroidUtilities.dp(1.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = dp;
                rectF.set(f10, f10, getWidth() - dp, getHeight() - dp);
                ((FragmentContextView) this.f38560b).J.a(AndroidUtilities.dp(16.0f), canvas, rectF, this);
                return;
            case 2:
            default:
                super.draw(canvas);
                return;
            case 3:
                super.draw(canvas);
                l71 l71Var = (l71) this.f38560b;
                org.telegram.ui.Components.voip.h hVar = l71Var.f40075c;
                if (hVar.f33542g <= 1.0f) {
                    SessionsActivity sessionsActivity = l71Var.d;
                    if (sessionsActivity.S && sessionsActivity.T) {
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                        hVar.f33541f = getMeasuredWidth();
                        hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF2, null);
                        invalidate();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f38559a) {
            case 0:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.h) this.f38560b) == null) {
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                    this.f38560b = hVar;
                    hVar.f33545k = false;
                    hVar.f33547m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.f38560b).f33541f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f38560b).a(AndroidUtilities.dp(22.0f), canvas, rectF, null);
                invalidate();
                return;
            case 4:
                super.onDraw(canvas);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), (Paint) this.f38560b);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        switch (this.f38559a) {
            case 5:
                super.onLayout(z10, i9, i10, i11, i12);
                if (z10) {
                    ((mh1) this.f38560b).H();
                    return;
                }
                return;
            default:
                super.onLayout(z10, i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public void onMeasure(int i9, int i10) {
        switch (this.f38559a) {
            case 1:
                super.onMeasure(i9, i10);
                a(getMeasuredWidth());
                return;
            case 2:
                super.onMeasure(i9, i10);
                if (LocaleController.isRTL) {
                    ((org.telegram.ui.Components.x21) this.f38560b).f34497b.setPivotX(getMeasuredWidth());
                    return;
                }
                return;
            case 6:
                super.onMeasure(i9, i10);
                ((org.telegram.ui.web.t1) this.f38560b).f44022c.setPivotY(getMeasuredHeight() / 2.0f);
                return;
            default:
                super.onMeasure(i9, i10);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.f38559a) {
            case 1:
                super.onSizeChanged(i9, i10, i11, i12);
                ((FragmentContextView) this.f38560b).J.f33541f = getWidth();
                return;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                return;
        }
    }

    @Override
    public void setVisibility(int i9) {
        switch (this.f38559a) {
            case 1:
                super.setVisibility(i9);
                if (i9 != 0) {
                    a(0);
                    ((FragmentContextView) this.f38560b).I = 0;
                    return;
                }
                return;
            default:
                super.setVisibility(i9);
                return;
        }
    }

    public gk(Activity activity, Paint paint) {
        super(activity);
        this.f38559a = 4;
        this.f38560b = paint;
    }

    public gk(Context context) {
        super(context);
        this.f38559a = 0;
    }
}
