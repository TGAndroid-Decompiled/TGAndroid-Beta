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
public final class pk extends TextView {
    public final int f40034a;
    public Object f40035b;

    public pk(Object obj, Context context, int i10) {
        super(context);
        this.f40034a = i10;
        this.f40035b = obj;
    }

    public void a(int i10) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f40035b;
        if (fragmentContextView.J != i10) {
            org.telegram.ui.Components.s10 s10Var = fragmentContextView.d;
            s10Var.setPadding(s10Var.getPaddingLeft(), fragmentContextView.d.getPaddingTop(), (fragmentContextView.d.getPaddingRight() - fragmentContextView.J) + i10, fragmentContextView.d.getPaddingBottom());
            fragmentContextView.J = i10;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f40034a) {
            case 1:
                super.draw(canvas);
                int dp = AndroidUtilities.dp(1.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = dp;
                rectF.set(f10, f10, getWidth() - dp, getHeight() - dp);
                ((FragmentContextView) this.f40035b).K.a(AndroidUtilities.dp(16.0f), canvas, rectF, this);
                return;
            case 2:
            default:
                super.draw(canvas);
                return;
            case 3:
                super.draw(canvas);
                i81 i81Var = (i81) this.f40035b;
                org.telegram.ui.Components.voip.h hVar = i81Var.f37576c;
                if (hVar.f32061g <= 1.0f) {
                    SessionsActivity sessionsActivity = i81Var.d;
                    if (sessionsActivity.T && sessionsActivity.U) {
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                        hVar.f32060f = getMeasuredWidth();
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
        switch (this.f40034a) {
            case 0:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.h) this.f40035b) == null) {
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                    this.f40035b = hVar;
                    hVar.f32064k = false;
                    hVar.f32066m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.f40035b).f32060f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f40035b).a(AndroidUtilities.dp(22.0f), canvas, rectF, null);
                invalidate();
                return;
            case 4:
                super.onDraw(canvas);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), (Paint) this.f40035b);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f40034a) {
            case 5:
                super.onLayout(z4, i10, i11, i12, i13);
                if (z4) {
                    ((ii1) this.f40035b).H();
                    return;
                }
                return;
            default:
                super.onLayout(z4, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f40034a) {
            case 1:
                super.onMeasure(i10, i11);
                a(getMeasuredWidth());
                return;
            case 2:
                super.onMeasure(i10, i11);
                if (LocaleController.isRTL) {
                    ((org.telegram.ui.Components.t31) this.f40035b).f31264b.setPivotX(getMeasuredWidth());
                    return;
                }
                return;
            case 6:
                super.onMeasure(i10, i11);
                ((org.telegram.ui.web.w1) this.f40035b).f42716c.setPivotY(getMeasuredHeight() / 2.0f);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f40034a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                ((FragmentContextView) this.f40035b).K.f32060f = getWidth();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f40034a) {
            case 1:
                super.setVisibility(i10);
                if (i10 != 0) {
                    a(0);
                    ((FragmentContextView) this.f40035b).J = 0;
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public pk(Activity activity, Paint paint) {
        super(activity);
        this.f40034a = 4;
        this.f40035b = paint;
    }

    public pk(Context context) {
        super(context);
        this.f40034a = 0;
    }
}
