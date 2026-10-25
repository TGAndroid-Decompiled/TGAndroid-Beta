package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class cm0 extends FrameLayout {
    public final int f38496a;
    public Object f38497b;
    public float f38498c;
    public final KeyEvent.Callback d;

    public cm0(Context context, EditTextBoldCursor editTextBoldCursor, int i10) {
        super(context);
        this.f38496a = i10;
        this.d = editTextBoldCursor;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f38496a) {
            case 0:
                if (((StaticLayout) this.f38497b) != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp(21.0f) + this.f38498c, ((EditTextBoldCursor) this.d).getLineY() + AndroidUtilities.dp(3.0f));
                    ((StaticLayout) this.f38497b).draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                if (((StaticLayout) this.f38497b) != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp(21.0f) + this.f38498c, ((EditTextBoldCursor) this.d).getLineY() + AndroidUtilities.dp(3.0f));
                    ((StaticLayout) this.f38497b).draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 2:
                if (((StaticLayout) this.f38497b) != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp(21.0f) + this.f38498c, ((EditTextBoldCursor) this.d).getLineY() + AndroidUtilities.dp(3.0f));
                    ((StaticLayout) this.f38497b).draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            default:
                super.onDraw(canvas);
                return;
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        org.telegram.ui.Components.ij0 ij0Var;
        switch (this.f38496a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(34.0f);
                StaticLayout errorLayout = ((EditTextBoldCursor) this.d).getErrorLayout(size);
                this.f38497b = errorLayout;
                if (errorLayout != null) {
                    int lineCount = errorLayout.getLineCount();
                    int i12 = 0;
                    if (lineCount > 1) {
                        i11 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.f38497b).getLineBottom(lineCount - 1) - ((StaticLayout) this.f38497b).getLineBottom(0)) + AndroidUtilities.dp(64.0f), 1073741824);
                    }
                    if (LocaleController.isRTL) {
                        float f7 = 0.0f;
                        while (true) {
                            if (i12 < lineCount) {
                                if (((StaticLayout) this.f38497b).getLineLeft(i12) != 0.0f) {
                                    this.f38498c = 0.0f;
                                } else {
                                    f7 = Math.max(f7, ((StaticLayout) this.f38497b).getLineWidth(i12));
                                    if (i12 == lineCount - 1) {
                                        this.f38498c = size - f7;
                                    }
                                    i12++;
                                }
                            }
                        }
                    }
                }
                super.onMeasure(i10, i11);
                return;
            case 1:
                int size2 = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(34.0f);
                StaticLayout errorLayout2 = ((EditTextBoldCursor) this.d).getErrorLayout(size2);
                this.f38497b = errorLayout2;
                if (errorLayout2 != null) {
                    int lineCount2 = errorLayout2.getLineCount();
                    int i13 = 0;
                    if (lineCount2 > 1) {
                        i11 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.f38497b).getLineBottom(lineCount2 - 1) - ((StaticLayout) this.f38497b).getLineBottom(0)) + AndroidUtilities.dp(64.0f), 1073741824);
                    }
                    if (LocaleController.isRTL) {
                        float f10 = 0.0f;
                        while (true) {
                            if (i13 < lineCount2) {
                                if (((StaticLayout) this.f38497b).getLineLeft(i13) != 0.0f) {
                                    this.f38498c = 0.0f;
                                } else {
                                    f10 = Math.max(f10, ((StaticLayout) this.f38497b).getLineWidth(i13));
                                    if (i13 == lineCount2 - 1) {
                                        this.f38498c = size2 - f10;
                                    }
                                    i13++;
                                }
                            }
                        }
                    }
                }
                super.onMeasure(i10, i11);
                return;
            case 2:
                int size3 = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(34.0f);
                StaticLayout errorLayout3 = ((EditTextBoldCursor) this.d).getErrorLayout(size3);
                this.f38497b = errorLayout3;
                if (errorLayout3 != null) {
                    int lineCount3 = errorLayout3.getLineCount();
                    int i14 = 0;
                    if (lineCount3 > 1) {
                        i11 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.f38497b).getLineBottom(lineCount3 - 1) - ((StaticLayout) this.f38497b).getLineBottom(0)) + AndroidUtilities.dp(64.0f), 1073741824);
                    }
                    if (LocaleController.isRTL) {
                        float f11 = 0.0f;
                        while (true) {
                            if (i14 < lineCount3) {
                                if (((StaticLayout) this.f38497b).getLineLeft(i14) != 0.0f) {
                                    this.f38498c = 0.0f;
                                } else {
                                    f11 = Math.max(f11, ((StaticLayout) this.f38497b).getLineWidth(i14));
                                    if (i14 == lineCount3 - 1) {
                                        this.f38498c = size3 - f11;
                                    }
                                    i14++;
                                }
                            }
                        }
                    }
                }
                super.onMeasure(i10, i11);
                return;
            default:
                super.onMeasure(i10, i11);
                org.telegram.ui.Components.ak0 ak0Var = ((org.telegram.ui.Components.ij0) this.d).h;
                float measuredHeight = (ij0Var.f29302f / 768.0f) * ((jg.l) this.f38497b).getMeasuredHeight();
                if (this.f38498c != measuredHeight) {
                    this.f38498c = measuredHeight;
                    ViewGroup.LayoutParams layoutParams = ak0Var.getLayoutParams();
                    int i15 = (int) measuredHeight;
                    ak0Var.getLayoutParams().width = i15;
                    layoutParams.height = i15;
                    super.onMeasure(i10, i11);
                    return;
                }
                return;
        }
    }

    public cm0(org.telegram.ui.Components.ij0 ij0Var, Context context, jg.l lVar) {
        super(context);
        this.f38496a = 3;
        this.d = ij0Var;
        this.f38497b = lVar;
    }
}
