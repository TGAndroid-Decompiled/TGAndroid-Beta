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

public final class ik extends TextView {

    public final int f39119a;

    public Object f39120b;

    public ik(Object obj, Context context, int i10) {
        super(context);
        this.f39119a = i10;
        this.f39120b = obj;
    }

    public void a(int i10) {
        FragmentContextView fragmentContextView = (FragmentContextView) this.f39120b;
        if (fragmentContextView.I != i10) {
            org.telegram.ui.Components.f10 f10Var = fragmentContextView.d;
            f10Var.setPadding(f10Var.getPaddingLeft(), fragmentContextView.d.getPaddingTop(), (fragmentContextView.d.getPaddingRight() - fragmentContextView.I) + i10, fragmentContextView.d.getPaddingBottom());
            fragmentContextView.I = i10;
        }
    }

    @Override
    public void draw(Canvas canvas) {
        switch (this.f39119a) {
            case 1:
                super.draw(canvas);
                int iDp = AndroidUtilities.dp(1.0f);
                RectF rectF = AndroidUtilities.rectTmp;
                float f10 = iDp;
                rectF.set(f10, f10, getWidth() - iDp, getHeight() - iDp);
                ((FragmentContextView) this.f39120b).J.a(AndroidUtilities.dp(16.0f), canvas, rectF, this);
                break;
            case 2:
            default:
                super.draw(canvas);
                break;
            case 3:
                super.draw(canvas);
                k71 k71Var = (k71) this.f39120b;
                org.telegram.ui.Components.voip.h hVar = k71Var.f39646c;
                if (hVar.f33592g <= 1.0f) {
                    SessionsActivity sessionsActivity = k71Var.d;
                    if (sessionsActivity.S && sessionsActivity.T) {
                        RectF rectF2 = AndroidUtilities.rectTmp;
                        rectF2.set(0.0f, 0.0f, getWidth(), getHeight());
                        hVar.f33591f = getMeasuredWidth();
                        hVar.a(AndroidUtilities.dp(8.0f), canvas, rectF2, null);
                        invalidate();
                        break;
                    }
                }
                break;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f39119a) {
            case 0:
                super.onDraw(canvas);
                if (((org.telegram.ui.Components.voip.h) this.f39120b) == null) {
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h();
                    this.f39120b = hVar;
                    hVar.f33595k = false;
                    hVar.f33597m = 2.0f;
                }
                ((org.telegram.ui.Components.voip.h) this.f39120b).f33591f = getMeasuredWidth();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
                ((org.telegram.ui.Components.voip.h) this.f39120b).a(AndroidUtilities.dp(22.0f), canvas, rectF, null);
                invalidate();
                break;
            case 4:
                super.onDraw(canvas);
                RectF rectF2 = AndroidUtilities.rectTmp;
                rectF2.set(AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), getMeasuredWidth() - AndroidUtilities.dp(1.0f), getMeasuredHeight() - AndroidUtilities.dp(1.0f));
                canvas.drawRoundRect(rectF2, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), (Paint) this.f39120b);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f39119a) {
            case 5:
                super.onLayout(z10, i10, i11, i12, i13);
                if (z10) {
                    ((lh1) this.f39120b).H();
                }
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f39119a) {
            case 1:
                super.onMeasure(i10, i11);
                a(getMeasuredWidth());
                break;
            case 2:
                super.onMeasure(i10, i11);
                if (LocaleController.isRTL) {
                    ((org.telegram.ui.Components.z21) this.f39120b).f35140b.setPivotX(getMeasuredWidth());
                }
                break;
            case 6:
                super.onMeasure(i10, i11);
                ((org.telegram.ui.web.u1) this.f39120b).f44009c.setPivotY(getMeasuredHeight() / 2.0f);
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.f39119a) {
            case 1:
                super.onSizeChanged(i10, i11, i12, i13);
                ((FragmentContextView) this.f39120b).J.f33591f = getWidth();
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public void setVisibility(int i10) {
        switch (this.f39119a) {
            case 1:
                super.setVisibility(i10);
                if (i10 != 0) {
                    a(0);
                    ((FragmentContextView) this.f39120b).I = 0;
                }
                break;
            default:
                super.setVisibility(i10);
                break;
        }
    }

    public ik(Activity activity, Paint paint) {
        super(activity);
        this.f39119a = 4;
        this.f39120b = paint;
    }

    public ik(Context context) {
        super(context);
        this.f39119a = 0;
    }
}
