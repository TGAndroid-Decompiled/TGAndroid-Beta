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
    public final int f37356a;
    public Object f37357b;

    public pk(Object obj, Context context, int i10) {
        super(context);
        this.f37356a = i10;
        this.f37357b = obj;
    }

    public void a(int i10) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f37357b;
        if (fragmentContextView.J != i10) {
            org.telegram.ui.Components.r10 r10Var = fragmentContextView.d;
            r10Var.setPadding(r10Var.getPaddingLeft(), fragmentContextView.d.getPaddingTop(), (fragmentContextView.d.getPaddingRight() - fragmentContextView.J) + i10, fragmentContextView.d.getPaddingBottom());
            fragmentContextView.J = i10;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f37356a) {
            case 1:
                super.draw(canvas);
                int dp = AndroidUtilities.dp(1.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = dp;
                rectF.set(f10, f10, getWidth() - dp, getHeight() - dp);
                ((FragmentContextView) this.f37357b).K.a(AndroidUtilities.dp(16.0f), canvas, rectF, this);
                return;
            case 2:
            default:
                super.draw(canvas);
                return;
            case 3:
                super.draw(canvas);
                b81 b81Var = (b81) this.f37357b;
                org.telegram.ui.Components.voip.h hVar = b81Var.f32845c;
                if (hVar.f29657g <= 1.0f) {
                    SessionsActivity sessionsActivity = b81Var.d;
                    if (sessionsActivity.T && sessionsActivity.U) {
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                        hVar.f29656f = getMeasuredWidth();
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
        switch (this.f37356a) {
            case 0:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.h) this.f37357b) == null) {
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                    this.f37357b = hVar;
                    hVar.f29660k = false;
                    hVar.f29662m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.f37357b).f29656f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f37357b).a(AndroidUtilities.dp(22.0f), canvas, rectF, null);
                invalidate();
                return;
            case 4:
                super.onDraw(canvas);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), (Paint) this.f37357b);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        switch (this.f37356a) {
            case 5:
                super.onLayout(z4, i10, i11, i12, i13);
                if (z4) {
                    ((ai1) this.f37357b).H();
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
        switch (this.f37356a) {
            case 1:
                super.onMeasure(i10, i11);
                a(getMeasuredWidth());
                return;
            case 2:
                super.onMeasure(i10, i11);
                if (LocaleController.isRTL) {
                    ((org.telegram.ui.Components.t31) this.f37357b).f28893b.setPivotX(getMeasuredWidth());
                    return;
                }
                return;
            case 6:
                super.onMeasure(i10, i11);
                ((org.telegram.ui.web.w1) this.f37357b).f39694c.setPivotY(getMeasuredHeight() / 2.0f);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f37356a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                ((FragmentContextView) this.f37357b).K.f29656f = getWidth();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f37356a) {
            case 1:
                super.setVisibility(i10);
                if (i10 != 0) {
                    a(0);
                    ((FragmentContextView) this.f37357b).J = 0;
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
        this.f37356a = 4;
        this.f37357b = paint;
    }

    public pk(Context context) {
        super(context);
        this.f37356a = 0;
    }
}
