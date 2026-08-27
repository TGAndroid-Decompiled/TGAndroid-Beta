package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.CheckBoxBase;

public final class aj0 extends View {

    public final int f36553a;

    public final Object f36554b;

    public aj0(Object obj, Context context, int i10) {
        super(context);
        this.f36553a = i10;
        this.f36554b = obj;
    }

    @Override
    public void dispatchDraw(Canvas canvas) {
        switch (this.f36553a) {
            case 11:
                jg.b bVar = ((qg.g) this.f36554b).E;
                if (bVar != null) {
                    bVar.draw(canvas);
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override
    public void onAttachedToWindow() {
        switch (this.f36553a) {
            case 10:
                super.onAttachedToWindow();
                ((pf.z0) this.f36554b).f46015f = true;
                break;
            case 13:
                super.onAttachedToWindow();
                ((CheckBoxBase) this.f36554b).f26304l = true;
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override
    public void onDetachedFromWindow() {
        switch (this.f36553a) {
            case 10:
                super.onDetachedFromWindow();
                ((pf.z0) this.f36554b).f46015f = false;
                break;
            case 13:
                super.onDetachedFromWindow();
                ((CheckBoxBase) this.f36554b).f26304l = false;
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    @Override
    public void onDraw(Canvas canvas) {
        int i10 = this.f36553a;
        Object obj = this.f36554b;
        switch (i10) {
            case 0:
                canvas.drawColor(((dj0) obj).getThemedColor(org.telegram.ui.ActionBar.g6.f23073e7));
                break;
            case 1:
                jp0 jp0Var = (jp0) obj;
                String str = String.format("%d", Integer.valueOf(Math.max(1, jp0Var.f39463c.size())));
                int iCeil = (int) Math.ceil(jp0Var.O.measureText(str));
                int iMax = Math.max(AndroidUtilities.dp(16.0f) + iCeil, AndroidUtilities.dp(24.0f));
                int measuredWidth = getMeasuredWidth() / 2;
                getMeasuredHeight();
                jp0Var.O.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.C5, false));
                jp0Var.Q.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23124h5, false));
                int i11 = iMax / 2;
                int i12 = measuredWidth - i11;
                int i13 = i11 + measuredWidth;
                jp0Var.P.set(i12, 0.0f, i13, getMeasuredHeight());
                canvas.drawRoundRect(jp0Var.P, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), jp0Var.Q);
                jp0Var.Q.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B5, false));
                jp0Var.P.set(AndroidUtilities.dp(2.0f) + i12, AndroidUtilities.dp(2.0f), i13 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(jp0Var.P, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), jp0Var.Q);
                canvas.drawText(str, measuredWidth - (iCeil / 2), AndroidUtilities.dp(16.2f), jp0Var.O);
                break;
            case 2:
                aq0 aq0Var = (aq0) obj;
                String str2 = String.format("%d", Integer.valueOf(Math.max(1, aq0Var.f36600c.size())));
                int iCeil2 = (int) Math.ceil(aq0Var.f36602d0.measureText(str2));
                int iMax2 = Math.max(AndroidUtilities.dp(16.0f) + iCeil2, AndroidUtilities.dp(24.0f));
                int measuredWidth2 = getMeasuredWidth() / 2;
                getMeasuredHeight();
                aq0Var.f36602d0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.C5, false));
                aq0Var.f36606f0.setColor(org.telegram.ui.ActionBar.g6.w0(null, aq0Var.f36617q0, false));
                int i14 = iMax2 / 2;
                int i15 = measuredWidth2 - i14;
                int i16 = i14 + measuredWidth2;
                aq0Var.f36604e0.set(i15, 0.0f, i16, getMeasuredHeight());
                canvas.drawRoundRect(aq0Var.f36604e0, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), aq0Var.f36606f0);
                aq0Var.f36606f0.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.B5, false));
                aq0Var.f36604e0.set(AndroidUtilities.dp(2.0f) + i15, AndroidUtilities.dp(2.0f), i16 - AndroidUtilities.dp(2.0f), getMeasuredHeight() - AndroidUtilities.dp(2.0f));
                canvas.drawRoundRect(aq0Var.f36604e0, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), aq0Var.f36606f0);
                canvas.drawText(str2, measuredWidth2 - (iCeil2 / 2), AndroidUtilities.dp(16.2f), aq0Var.f36602d0);
                break;
            case 3:
                ((PhotoViewer) obj).f35694m3.a(canvas, this);
                break;
            case 4:
            case 5:
            case 8:
            case 9:
            case 10:
            case 11:
            default:
                super.onDraw(canvas);
                break;
            case 6:
                y11 y11Var = (y11) obj;
                canvas.drawColor(y11Var.G ? -15590870 : -6569073);
                org.telegram.ui.Components.nb0 nb0Var = y11Var.f44671n;
                if (nb0Var != null) {
                    nb0Var.setBounds(0, 0, getWidth(), getHeight());
                }
                y11Var.h.setBounds(0, 0, getWidth(), getHeight());
                org.telegram.ui.Components.nb0 nb0Var2 = y11Var.f44671n;
                if (nb0Var2 != null) {
                    nb0Var2.draw(canvas);
                }
                y11Var.h.draw(canvas);
                super.onDraw(canvas);
                break;
            case 7:
                ((SecretMediaViewer) obj).M.a(canvas, this);
                break;
            case 12:
                canvas.save();
                canvas.translate(AndroidUtilities.dpf2(22.6f), AndroidUtilities.dpf2(21.66f));
                ((rh.q0) obj).f47386c.draw(canvas);
                canvas.restore();
                break;
            case 13:
                int iDp = AndroidUtilities.dp(20.0f);
                CheckBoxBase checkBoxBase = (CheckBoxBase) obj;
                checkBoxBase.e((getWidth() - iDp) / 2, (getHeight() - iDp) / 2, iDp, iDp);
                checkBoxBase.a(canvas);
                break;
        }
    }

    @Override
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.f36553a) {
            case 8:
                super.onLayout(z10, i10, i11, i12, i13);
                p41 p41Var = (p41) this.f36554b;
                int[] iArr = p41Var.C;
                getLocationOnScreen(iArr);
                Rect rect = p41Var.d;
                int i14 = iArr[0];
                rect.set(i14, iArr[1], getWidth() + i14, getHeight() + iArr[1]);
                AndroidUtilities.lerp(p41Var.f43612c, rect, p41Var.E, p41Var.f43613e);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override
    public void onMeasure(int i10, int i11) {
        int iIntValue;
        switch (this.f36553a) {
            case 4:
                yv0 yv0Var = (yv0) this.f36554b;
                PremiumPreviewFragment premiumPreviewFragment = yv0Var.f44953c;
                if (premiumPreviewFragment.S) {
                    premiumPreviewFragment.U = 0;
                } else {
                    int iDp = AndroidUtilities.dp(64.0f);
                    if (AndroidUtilities.dp(8.0f) + yv0Var.f44953c.Q.getMeasuredHeight() > iDp) {
                        iDp = yv0Var.f44953c.Q.getMeasuredHeight() + AndroidUtilities.dp(8.0f);
                    }
                    yv0Var.f44953c.U = iDp;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(yv0Var.f44953c.U, 1073741824));
                break;
            case 10:
                ((View) getParent()).getMeasuredHeight();
                pf.z0 z0Var = (pf.z0) this.f36554b;
                Integer num = z0Var.d;
                if (num != null) {
                    iIntValue = num.intValue();
                    z0Var.h = iIntValue;
                } else {
                    iIntValue = 0;
                    z0Var.h = 0;
                }
                super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(iIntValue, 1073741824));
                break;
            case 13:
                setMeasuredDimension(View.MeasureSpec.getSize(i10), AndroidUtilities.dp(24.0f));
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override
    public void setAlpha(float f10) {
        switch (this.f36553a) {
            case 5:
                super.setAlpha(f10);
                View view = ((ProfileActivity) this.f36554b).fragmentView;
                if (view != null) {
                    view.invalidate();
                }
                break;
            case 9:
                super.setAlpha(f10);
                View view2 = ((we1) this.f36554b).fragmentView;
                if (view2 != null) {
                    view2.invalidate();
                }
                break;
            default:
                super.setAlpha(f10);
                break;
        }
    }

    public aj0(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context);
        this.f36553a = 13;
        CheckBoxBase checkBoxBase = new CheckBoxBase(20, this, c6Var);
        this.f36554b = checkBoxBase;
        checkBoxBase.h(org.telegram.ui.ActionBar.g6.hl, org.telegram.ui.ActionBar.g6.f23440z5, org.telegram.ui.ActionBar.g6.f23182k7);
        checkBoxBase.d(10);
        checkBoxBase.k(true);
        checkBoxBase.i(AndroidUtilities.dp(5.0f));
    }
}
