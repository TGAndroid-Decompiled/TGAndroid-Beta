package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class bj0 extends FrameLayout {
    public final int f44079a;
    public Object f44080b;
    public float f44081c;
    public final KeyEvent.Callback d;

    public bj0(Context context, EditTextBoldCursor editTextBoldCursor, int i7) {
        super(context);
        this.f44079a = i7;
        this.d = editTextBoldCursor;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f44079a) {
            case 0:
                if (((StaticLayout) this.f44080b) != null) {
                    canvas.save();
                    canvas.translate(org.telegram.messenger.g0.L(21.0f) + this.f44081c, ((EditTextBoldCursor) this.d).getLineY() + org.telegram.messenger.g0.L(3.0f));
                    ((StaticLayout) this.f44080b).draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                if (((StaticLayout) this.f44080b) != null) {
                    canvas.save();
                    canvas.translate(org.telegram.messenger.g0.L(21.0f) + this.f44081c, ((EditTextBoldCursor) this.d).getLineY() + org.telegram.messenger.g0.L(3.0f));
                    ((StaticLayout) this.f44080b).draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 2:
                if (((StaticLayout) this.f44080b) != null) {
                    canvas.save();
                    canvas.translate(org.telegram.messenger.g0.L(21.0f) + this.f44081c, ((EditTextBoldCursor) this.d).getLineY() + org.telegram.messenger.g0.L(3.0f));
                    ((StaticLayout) this.f44080b).draw(canvas);
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
    public final void onMeasure(int i7, int i10) {
        org.telegram.ui.Components.lg0 lg0Var;
        switch (this.f44079a) {
            case 0:
                int size = View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(34.0f);
                StaticLayout p10 = ((EditTextBoldCursor) this.d).p(size);
                this.f44080b = p10;
                if (p10 != null) {
                    int lineCount = p10.getLineCount();
                    int i11 = 0;
                    if (lineCount > 1) {
                        i10 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.f44080b).getLineBottom(lineCount - 1) - ((StaticLayout) this.f44080b).getLineBottom(0)) + org.telegram.messenger.g0.L(64.0f), 1073741824);
                    }
                    if (org.telegram.messenger.id.f23161a0) {
                        float f10 = 0.0f;
                        while (true) {
                            if (i11 < lineCount) {
                                if (((StaticLayout) this.f44080b).getLineLeft(i11) != 0.0f) {
                                    this.f44081c = 0.0f;
                                } else {
                                    f10 = Math.max(f10, ((StaticLayout) this.f44080b).getLineWidth(i11));
                                    if (i11 == lineCount - 1) {
                                        this.f44081c = size - f10;
                                    }
                                    i11++;
                                }
                            }
                        }
                    }
                }
                super.onMeasure(i7, i10);
                return;
            case 1:
                int size2 = View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(34.0f);
                StaticLayout p11 = ((EditTextBoldCursor) this.d).p(size2);
                this.f44080b = p11;
                if (p11 != null) {
                    int lineCount2 = p11.getLineCount();
                    int i12 = 0;
                    if (lineCount2 > 1) {
                        i10 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.f44080b).getLineBottom(lineCount2 - 1) - ((StaticLayout) this.f44080b).getLineBottom(0)) + org.telegram.messenger.g0.L(64.0f), 1073741824);
                    }
                    if (org.telegram.messenger.id.f23161a0) {
                        float f11 = 0.0f;
                        while (true) {
                            if (i12 < lineCount2) {
                                if (((StaticLayout) this.f44080b).getLineLeft(i12) != 0.0f) {
                                    this.f44081c = 0.0f;
                                } else {
                                    f11 = Math.max(f11, ((StaticLayout) this.f44080b).getLineWidth(i12));
                                    if (i12 == lineCount2 - 1) {
                                        this.f44081c = size2 - f11;
                                    }
                                    i12++;
                                }
                            }
                        }
                    }
                }
                super.onMeasure(i7, i10);
                return;
            case 2:
                int size3 = View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(34.0f);
                StaticLayout p12 = ((EditTextBoldCursor) this.d).p(size3);
                this.f44080b = p12;
                if (p12 != null) {
                    int lineCount3 = p12.getLineCount();
                    int i13 = 0;
                    if (lineCount3 > 1) {
                        i10 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.f44080b).getLineBottom(lineCount3 - 1) - ((StaticLayout) this.f44080b).getLineBottom(0)) + org.telegram.messenger.g0.L(64.0f), 1073741824);
                    }
                    if (org.telegram.messenger.id.f23161a0) {
                        float f12 = 0.0f;
                        while (true) {
                            if (i13 < lineCount3) {
                                if (((StaticLayout) this.f44080b).getLineLeft(i13) != 0.0f) {
                                    this.f44081c = 0.0f;
                                } else {
                                    f12 = Math.max(f12, ((StaticLayout) this.f44080b).getLineWidth(i13));
                                    if (i13 == lineCount3 - 1) {
                                        this.f44081c = size3 - f12;
                                    }
                                    i13++;
                                }
                            }
                        }
                    }
                }
                super.onMeasure(i7, i10);
                return;
            default:
                super.onMeasure(i7, i10);
                org.telegram.ui.Components.ch0 ch0Var = ((org.telegram.ui.Components.lg0) this.d).f35672q1;
                float measuredHeight = (lg0Var.f35671p1 / 768.0f) * ((kg.k) this.f44080b).getMeasuredHeight();
                if (this.f44081c != measuredHeight) {
                    this.f44081c = measuredHeight;
                    ViewGroup.LayoutParams layoutParams = ch0Var.getLayoutParams();
                    int i14 = (int) measuredHeight;
                    ch0Var.getLayoutParams().width = i14;
                    layoutParams.height = i14;
                    super.onMeasure(i7, i10);
                    return;
                }
                return;
        }
    }

    public bj0(org.telegram.ui.Components.lg0 lg0Var, Context context, kg.k kVar) {
        super(context);
        this.f44079a = 3;
        this.d = lg0Var;
        this.f44080b = kVar;
    }
}
