package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.text.StaticLayout;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class hk0 extends FrameLayout {
    public final int f37982a;
    public Object f37983b;
    public float f37984c;
    public final KeyEvent.Callback d;

    public hk0(Context context, EditTextBoldCursor editTextBoldCursor, int i10) {
        super(context);
        this.f37982a = i10;
        this.d = editTextBoldCursor;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f37982a) {
            case 0:
                if (((StaticLayout) this.f37983b) != null) {
                    canvas.save();
                    canvas.translate(org.telegram.messenger.i0.L(21.0f) + this.f37984c, ((EditTextBoldCursor) this.d).getLineY() + org.telegram.messenger.i0.L(3.0f));
                    ((StaticLayout) this.f37983b).draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                if (((StaticLayout) this.f37983b) != null) {
                    canvas.save();
                    canvas.translate(org.telegram.messenger.i0.L(21.0f) + this.f37984c, ((EditTextBoldCursor) this.d).getLineY() + org.telegram.messenger.i0.L(3.0f));
                    ((StaticLayout) this.f37983b).draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 2:
                if (((StaticLayout) this.f37983b) != null) {
                    canvas.save();
                    canvas.translate(org.telegram.messenger.i0.L(21.0f) + this.f37984c, ((EditTextBoldCursor) this.d).getLineY() + org.telegram.messenger.i0.L(3.0f));
                    ((StaticLayout) this.f37983b).draw(canvas);
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
        org.telegram.ui.Components.nh0 nh0Var;
        switch (this.f37982a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10) - org.telegram.messenger.i0.L(34.0f);
                StaticLayout p5 = ((EditTextBoldCursor) this.d).p(size);
                this.f37983b = p5;
                if (p5 != null) {
                    int lineCount = p5.getLineCount();
                    int i12 = 0;
                    if (lineCount > 1) {
                        i11 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.f37983b).getLineBottom(lineCount - 1) - ((StaticLayout) this.f37983b).getLineBottom(0)) + org.telegram.messenger.i0.L(64.0f), 1073741824);
                    }
                    if (org.telegram.messenger.cd.X) {
                        float f7 = 0.0f;
                        while (true) {
                            if (i12 < lineCount) {
                                if (((StaticLayout) this.f37983b).getLineLeft(i12) != 0.0f) {
                                    this.f37984c = 0.0f;
                                } else {
                                    f7 = Math.max(f7, ((StaticLayout) this.f37983b).getLineWidth(i12));
                                    if (i12 == lineCount - 1) {
                                        this.f37984c = size - f7;
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
                this.f37983b = p9;
                if (p9 != null) {
                    int lineCount2 = p9.getLineCount();
                    int i13 = 0;
                    if (lineCount2 > 1) {
                        i11 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.f37983b).getLineBottom(lineCount2 - 1) - ((StaticLayout) this.f37983b).getLineBottom(0)) + org.telegram.messenger.i0.L(64.0f), 1073741824);
                    }
                    if (org.telegram.messenger.cd.X) {
                        float f10 = 0.0f;
                        while (true) {
                            if (i13 < lineCount2) {
                                if (((StaticLayout) this.f37983b).getLineLeft(i13) != 0.0f) {
                                    this.f37984c = 0.0f;
                                } else {
                                    f10 = Math.max(f10, ((StaticLayout) this.f37983b).getLineWidth(i13));
                                    if (i13 == lineCount2 - 1) {
                                        this.f37984c = size2 - f10;
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
                this.f37983b = p10;
                if (p10 != null) {
                    int lineCount3 = p10.getLineCount();
                    int i14 = 0;
                    if (lineCount3 > 1) {
                        i11 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.f37983b).getLineBottom(lineCount3 - 1) - ((StaticLayout) this.f37983b).getLineBottom(0)) + org.telegram.messenger.i0.L(64.0f), 1073741824);
                    }
                    if (org.telegram.messenger.cd.X) {
                        float f11 = 0.0f;
                        while (true) {
                            if (i14 < lineCount3) {
                                if (((StaticLayout) this.f37983b).getLineLeft(i14) != 0.0f) {
                                    this.f37984c = 0.0f;
                                } else {
                                    f11 = Math.max(f11, ((StaticLayout) this.f37983b).getLineWidth(i14));
                                    if (i14 == lineCount3 - 1) {
                                        this.f37984c = size3 - f11;
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
                org.telegram.ui.Components.ei0 ei0Var = ((org.telegram.ui.Components.nh0) this.d).f28796n1;
                float measuredHeight = (nh0Var.f28795m1 / 768.0f) * ((ag.r) this.f37983b).getMeasuredHeight();
                if (this.f37984c != measuredHeight) {
                    this.f37984c = measuredHeight;
                    ViewGroup.LayoutParams layoutParams = ei0Var.getLayoutParams();
                    int i15 = (int) measuredHeight;
                    ei0Var.getLayoutParams().width = i15;
                    layoutParams.height = i15;
                    super.onMeasure(i10, i11);
                    return;
                }
                return;
        }
    }

    public hk0(org.telegram.ui.Components.nh0 nh0Var, Context context, ag.r rVar) {
        super(context);
        this.f37982a = 3;
        this.d = nh0Var;
        this.f37983b = rVar;
    }
}
