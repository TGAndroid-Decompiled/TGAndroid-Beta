package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class fk0 extends FrameLayout {
    public final int f37169a;
    public Object f37170b;
    public float f37171c;
    public final KeyEvent.Callback d;

    public fk0(Context context, EditTextBoldCursor editTextBoldCursor, int i10) {
        super(context);
        this.f37169a = i10;
        this.d = editTextBoldCursor;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f37169a) {
            case 0:
                if (((StaticLayout) this.f37170b) != null) {
                    canvas.save();
                    canvas.translate(org.telegram.messenger.i0.L(21.0f) + this.f37171c, ((EditTextBoldCursor) this.d).getLineY() + org.telegram.messenger.i0.L(3.0f));
                    ((StaticLayout) this.f37170b).draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                if (((StaticLayout) this.f37170b) != null) {
                    canvas.save();
                    canvas.translate(org.telegram.messenger.i0.L(21.0f) + this.f37171c, ((EditTextBoldCursor) this.d).getLineY() + org.telegram.messenger.i0.L(3.0f));
                    ((StaticLayout) this.f37170b).draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 2:
                if (((StaticLayout) this.f37170b) != null) {
                    canvas.save();
                    canvas.translate(org.telegram.messenger.i0.L(21.0f) + this.f37171c, ((EditTextBoldCursor) this.d).getLineY() + org.telegram.messenger.i0.L(3.0f));
                    ((StaticLayout) this.f37170b).draw(canvas);
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
        org.telegram.ui.Components.oh0 oh0Var;
        switch (this.f37169a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(34.0f);
                StaticLayout p5 = ((EditTextBoldCursor) this.d).p(size);
                this.f37170b = p5;
                if (p5 != null) {
                    int lineCount = p5.getLineCount();
                    int i12 = 0;
                    if (lineCount > 1) {
                        i11 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.f37170b).getLineBottom(lineCount - 1) - ((StaticLayout) this.f37170b).getLineBottom(0)) + org.telegram.messenger.i0.L(64.0f), 1073741824);
                    }
                    if (org.telegram.messenger.dd.X) {
                        float f7 = 0.0f;
                        while (true) {
                            if (i12 < lineCount) {
                                if (((StaticLayout) this.f37170b).getLineLeft(i12) != 0.0f) {
                                    this.f37171c = 0.0f;
                                } else {
                                    f7 = Math.max(f7, ((StaticLayout) this.f37170b).getLineWidth(i12));
                                    if (i12 == lineCount - 1) {
                                        this.f37171c = size - f7;
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
                int size2 = View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(34.0f);
                StaticLayout p9 = ((EditTextBoldCursor) this.d).p(size2);
                this.f37170b = p9;
                if (p9 != null) {
                    int lineCount2 = p9.getLineCount();
                    int i13 = 0;
                    if (lineCount2 > 1) {
                        i11 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.f37170b).getLineBottom(lineCount2 - 1) - ((StaticLayout) this.f37170b).getLineBottom(0)) + org.telegram.messenger.i0.L(64.0f), 1073741824);
                    }
                    if (org.telegram.messenger.dd.X) {
                        float f10 = 0.0f;
                        while (true) {
                            if (i13 < lineCount2) {
                                if (((StaticLayout) this.f37170b).getLineLeft(i13) != 0.0f) {
                                    this.f37171c = 0.0f;
                                } else {
                                    f10 = Math.max(f10, ((StaticLayout) this.f37170b).getLineWidth(i13));
                                    if (i13 == lineCount2 - 1) {
                                        this.f37171c = size2 - f10;
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
                int size3 = View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(34.0f);
                StaticLayout p10 = ((EditTextBoldCursor) this.d).p(size3);
                this.f37170b = p10;
                if (p10 != null) {
                    int lineCount3 = p10.getLineCount();
                    int i14 = 0;
                    if (lineCount3 > 1) {
                        i11 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.f37170b).getLineBottom(lineCount3 - 1) - ((StaticLayout) this.f37170b).getLineBottom(0)) + org.telegram.messenger.i0.L(64.0f), 1073741824);
                    }
                    if (org.telegram.messenger.dd.X) {
                        float f11 = 0.0f;
                        while (true) {
                            if (i14 < lineCount3) {
                                if (((StaticLayout) this.f37170b).getLineLeft(i14) != 0.0f) {
                                    this.f37171c = 0.0f;
                                } else {
                                    f11 = Math.max(f11, ((StaticLayout) this.f37170b).getLineWidth(i14));
                                    if (i14 == lineCount3 - 1) {
                                        this.f37171c = size3 - f11;
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
                org.telegram.ui.Components.fi0 fi0Var = ((org.telegram.ui.Components.oh0) this.d).f29142n1;
                float measuredHeight = (oh0Var.f29141m1 / 768.0f) * ((ag.r) this.f37170b).getMeasuredHeight();
                if (this.f37171c != measuredHeight) {
                    this.f37171c = measuredHeight;
                    ViewGroup.LayoutParams layoutParams = fi0Var.getLayoutParams();
                    int i15 = (int) measuredHeight;
                    fi0Var.getLayoutParams().width = i15;
                    layoutParams.height = i15;
                    super.onMeasure(i10, i11);
                    return;
                }
                return;
        }
    }

    public fk0(org.telegram.ui.Components.oh0 oh0Var, Context context, ag.r rVar) {
        super(context);
        this.f37169a = 3;
        this.d = oh0Var;
        this.f37170b = rVar;
    }
}
