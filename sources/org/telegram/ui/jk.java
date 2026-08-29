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
public final class jk extends TextView {
    public final int f39572a;
    public Object f39573b;

    public jk(Object obj, Context context, int i10) {
        super(context);
        this.f39572a = i10;
        this.f39573b = obj;
    }

    public void a(int i10) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f39573b;
        if (fragmentContextView.I != i10) {
            org.telegram.ui.Components.n10 n10Var = fragmentContextView.d;
            n10Var.setPadding(n10Var.getPaddingLeft(), fragmentContextView.d.getPaddingTop(), (fragmentContextView.d.getPaddingRight() - fragmentContextView.I) + i10, fragmentContextView.d.getPaddingBottom());
            fragmentContextView.I = i10;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f39572a) {
            case 1:
                super.draw(canvas);
                int dp = AndroidUtilities.dp(1.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                float f9 = dp;
                rectF.set(f9, f9, getWidth() - dp, getHeight() - dp);
                ((FragmentContextView) this.f39573b).J.a(AndroidUtilities.dp(16.0f), canvas, rectF, this);
                return;
            case 2:
            default:
                super.draw(canvas);
                return;
            case 3:
                super.draw(canvas);
                o71 o71Var = (o71) this.f39573b;
                org.telegram.ui.Components.voip.h hVar = o71Var.f41000c;
                if (hVar.f33721g <= 1.0f) {
                    SessionsActivity sessionsActivity = o71Var.d;
                    if (sessionsActivity.S && sessionsActivity.T) {
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                        hVar.f33720f = getMeasuredWidth();
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
        switch (this.f39572a) {
            case 0:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.h) this.f39573b) == null) {
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                    this.f39573b = hVar;
                    hVar.f33724k = false;
                    hVar.f33726m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.f39573b).f33720f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f39573b).a(AndroidUtilities.dp(22.0f), canvas, rectF, null);
                invalidate();
                return;
            case 4:
                super.onDraw(canvas);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), (Paint) this.f39573b);
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f39572a) {
            case 5:
                super.onLayout(z10, i10, i11, i12, i13);
                if (z10) {
                    ((oh1) this.f39573b).H();
                    return;
                }
                return;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f39572a) {
            case 1:
                super.onMeasure(i10, i11);
                a(getMeasuredWidth());
                return;
            case 2:
                super.onMeasure(i10, i11);
                if (LocaleController.isRTL) {
                    ((org.telegram.ui.Components.i31) this.f39573b).f29311b.setPivotX(getMeasuredWidth());
                    return;
                }
                return;
            case 6:
                super.onMeasure(i10, i11);
                ((org.telegram.ui.web.v1) this.f39573b).f44219c.setPivotY(getMeasuredHeight() / 2.0f);
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f39572a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                ((FragmentContextView) this.f39573b).J.f33720f = getWidth();
                return;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                return;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f39572a) {
            case 1:
                super.setVisibility(i10);
                if (i10 != 0) {
                    a(0);
                    ((FragmentContextView) this.f39573b).I = 0;
                    return;
                }
                return;
            default:
                super.setVisibility(i10);
                return;
        }
    }

    public jk(Activity activity, Paint paint) {
        super(activity);
        this.f39572a = 4;
        this.f39573b = paint;
    }

    public jk(Context context) {
        super(context);
        this.f39572a = 0;
    }
}
