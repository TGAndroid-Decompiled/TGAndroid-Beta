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
public final class am0 extends FrameLayout {
    public final int f32198a;
    public Object f32199b;
    public float f32200c;
    public final KeyEvent.Callback d;

    public am0(Context context, EditTextBoldCursor editTextBoldCursor, int i10) {
        super(context);
        this.f32198a = i10;
        this.d = editTextBoldCursor;
    }

    @Override
    public void onDraw(Canvas canvas) {
        switch (this.f32198a) {
            case 0:
                if (((StaticLayout) this.f32199b) != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp(21.0f) + this.f32200c, ((EditTextBoldCursor) this.d).getLineY() + AndroidUtilities.dp(3.0f));
                    ((StaticLayout) this.f32199b).draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 1:
                if (((StaticLayout) this.f32199b) != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp(21.0f) + this.f32200c, ((EditTextBoldCursor) this.d).getLineY() + AndroidUtilities.dp(3.0f));
                    ((StaticLayout) this.f32199b).draw(canvas);
                    canvas.restore();
                    return;
                }
                return;
            case 2:
                if (((StaticLayout) this.f32199b) != null) {
                    canvas.save();
                    canvas.translate(AndroidUtilities.dp(21.0f) + this.f32200c, ((EditTextBoldCursor) this.d).getLineY() + AndroidUtilities.dp(3.0f));
                    ((StaticLayout) this.f32199b).draw(canvas);
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
        switch (this.f32198a) {
            case 0:
                int size = View.MeasureSpec.getSize(i10) - AndroidUtilities.dp(34.0f);
                StaticLayout errorLayout = ((EditTextBoldCursor) this.d).getErrorLayout(size);
                this.f32199b = errorLayout;
                if (errorLayout != null) {
                    int lineCount = errorLayout.getLineCount();
                    int i12 = 0;
                    if (lineCount > 1) {
                        i11 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.f32199b).getLineBottom(lineCount - 1) - ((StaticLayout) this.f32199b).getLineBottom(0)) + AndroidUtilities.dp(64.0f), 1073741824);
                    }
                    if (LocaleController.isRTL) {
                        float f7 = 0.0f;
                        while (true) {
                            if (i12 < lineCount) {
                                if (((StaticLayout) this.f32199b).getLineLeft(i12) != 0.0f) {
                                    this.f32200c = 0.0f;
                                } else {
                                    f7 = Math.max(f7, ((StaticLayout) this.f32199b).getLineWidth(i12));
                                    if (i12 == lineCount - 1) {
                                        this.f32200c = size - f7;
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
                this.f32199b = errorLayout2;
                if (errorLayout2 != null) {
                    int lineCount2 = errorLayout2.getLineCount();
                    int i13 = 0;
                    if (lineCount2 > 1) {
                        i11 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.f32199b).getLineBottom(lineCount2 - 1) - ((StaticLayout) this.f32199b).getLineBottom(0)) + AndroidUtilities.dp(64.0f), 1073741824);
                    }
                    if (LocaleController.isRTL) {
                        float f10 = 0.0f;
                        while (true) {
                            if (i13 < lineCount2) {
                                if (((StaticLayout) this.f32199b).getLineLeft(i13) != 0.0f) {
                                    this.f32200c = 0.0f;
                                } else {
                                    f10 = Math.max(f10, ((StaticLayout) this.f32199b).getLineWidth(i13));
                                    if (i13 == lineCount2 - 1) {
                                        this.f32200c = size2 - f10;
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
                this.f32199b = errorLayout3;
                if (errorLayout3 != null) {
                    int lineCount3 = errorLayout3.getLineCount();
                    int i14 = 0;
                    if (lineCount3 > 1) {
                        i11 = View.MeasureSpec.makeMeasureSpec((((StaticLayout) this.f32199b).getLineBottom(lineCount3 - 1) - ((StaticLayout) this.f32199b).getLineBottom(0)) + AndroidUtilities.dp(64.0f), 1073741824);
                    }
                    if (LocaleController.isRTL) {
                        float f11 = 0.0f;
                        while (true) {
                            if (i14 < lineCount3) {
                                if (((StaticLayout) this.f32199b).getLineLeft(i14) != 0.0f) {
                                    this.f32200c = 0.0f;
                                } else {
                                    f11 = Math.max(f11, ((StaticLayout) this.f32199b).getLineWidth(i14));
                                    if (i14 == lineCount3 - 1) {
                                        this.f32200c = size3 - f11;
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
                org.telegram.ui.Components.ui0 ui0Var = (org.telegram.ui.Components.ui0) this.d;
                org.telegram.ui.Components.lj0 lj0Var = ui0Var.h;
                float measuredHeight = (ui0Var.f28797f / 768.0f) * ((hg.l) this.f32199b).getMeasuredHeight();
                if (this.f32200c != measuredHeight) {
                    this.f32200c = measuredHeight;
                    ViewGroup.LayoutParams layoutParams = lj0Var.getLayoutParams();
                    int i15 = (int) measuredHeight;
                    lj0Var.getLayoutParams().width = i15;
                    layoutParams.height = i15;
                    super.onMeasure(i10, i11);
                    return;
                }
                return;
        }
    }

    public am0(org.telegram.ui.Components.ui0 ui0Var, Context context, hg.l lVar) {
        super(context);
        this.f32198a = 3;
        this.d = ui0Var;
        this.f32199b = lVar;
    }
}
