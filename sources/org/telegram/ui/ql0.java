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
public final class ql0 extends FrameLayout {
    public final int f40598a;
    public Object f40599b;
    public float f40600c;
    public final KeyEvent.Callback d;

    public ql0(Context context, EditTextBoldCursor editTextBoldCursor, int i10) {
        super(context);
        this.f40598a = i10;
        this.d = editTextBoldCursor;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f40598a) {
            case 0:
                if (((StaticLayout) this.f40599b) != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp(21.0f) + this.f40600c, ((EditTextBoldCursor) this.d).getLineY() + AndroidUtilities.dp(3.0f));
                    ((StaticLayout) this.f40599b).draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                if (((StaticLayout) this.f40599b) != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp(21.0f) + this.f40600c, ((EditTextBoldCursor) this.d).getLineY() + AndroidUtilities.dp(3.0f));
                    ((StaticLayout) this.f40599b).draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 2:
                if (((StaticLayout) this.f40599b) != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp(21.0f) + this.f40600c, ((EditTextBoldCursor) this.d).getLineY() + AndroidUtilities.dp(3.0f));
                    ((StaticLayout) this.f40599b).draw(canvas);
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
        org.telegram.ui.Components.fj0 fj0Var;
        switch (this.f40598a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(34.0f);
                StaticLayout errorLayout = ((EditTextBoldCursor) this.d).getErrorLayout(size);
                this.f40599b = errorLayout;
                if (errorLayout != null) {
                    int lineCount = errorLayout.getLineCount();
                    int i12 = 0;
                    if (lineCount > 1) {
                        i11 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.f40599b).getLineBottom(lineCount - 1) - ((StaticLayout) this.f40599b).getLineBottom(0)) + AndroidUtilities.dp(64.0f), 1073741824);
                    }
                    if (LocaleController.isRTL) {
                        float f7 = 0.0f;
                        while (true) {
                            if (i12 < lineCount) {
                                if (((StaticLayout) this.f40599b).getLineLeft(i12) != 0.0f) {
                                    this.f40600c = 0.0f;
                                } else {
                                    f7 = Math.max(f7, ((StaticLayout) this.f40599b).getLineWidth(i12));
                                    if (i12 == lineCount - 1) {
                                        this.f40600c = size - f7;
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
                this.f40599b = errorLayout2;
                if (errorLayout2 != null) {
                    int lineCount2 = errorLayout2.getLineCount();
                    int i13 = 0;
                    if (lineCount2 > 1) {
                        i11 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.f40599b).getLineBottom(lineCount2 - 1) - ((StaticLayout) this.f40599b).getLineBottom(0)) + AndroidUtilities.dp(64.0f), 1073741824);
                    }
                    if (LocaleController.isRTL) {
                        float f10 = 0.0f;
                        while (true) {
                            if (i13 < lineCount2) {
                                if (((StaticLayout) this.f40599b).getLineLeft(i13) != 0.0f) {
                                    this.f40600c = 0.0f;
                                } else {
                                    f10 = Math.max(f10, ((StaticLayout) this.f40599b).getLineWidth(i13));
                                    if (i13 == lineCount2 - 1) {
                                        this.f40600c = size2 - f10;
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
                this.f40599b = errorLayout3;
                if (errorLayout3 != null) {
                    int lineCount3 = errorLayout3.getLineCount();
                    int i14 = 0;
                    if (lineCount3 > 1) {
                        i11 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.f40599b).getLineBottom(lineCount3 - 1) - ((StaticLayout) this.f40599b).getLineBottom(0)) + AndroidUtilities.dp(64.0f), 1073741824);
                    }
                    if (LocaleController.isRTL) {
                        float f11 = 0.0f;
                        while (true) {
                            if (i14 < lineCount3) {
                                if (((StaticLayout) this.f40599b).getLineLeft(i14) != 0.0f) {
                                    this.f40600c = 0.0f;
                                } else {
                                    f11 = Math.max(f11, ((StaticLayout) this.f40599b).getLineWidth(i14));
                                    if (i14 == lineCount3 - 1) {
                                        this.f40600c = size3 - f11;
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
                org.telegram.ui.Components.xj0 xj0Var = ((org.telegram.ui.Components.fj0) this.d).h;
                float measuredHeight = (fj0Var.f26246f / 768.0f) * ((ig.k) this.f40599b).getMeasuredHeight();
                if (this.f40600c != measuredHeight) {
                    this.f40600c = measuredHeight;
                    ViewGroup.LayoutParams layoutParams = xj0Var.getLayoutParams();
                    int i15 = (int) measuredHeight;
                    xj0Var.getLayoutParams().width = i15;
                    layoutParams.height = i15;
                    super.onMeasure(i10, i11);
                    return;
                }
                return;
        }
    }

    public ql0(org.telegram.ui.Components.fj0 fj0Var, Context context, ig.k kVar) {
        super(context);
        this.f40598a = 3;
        this.d = fj0Var;
        this.f40599b = kVar;
    }
}
