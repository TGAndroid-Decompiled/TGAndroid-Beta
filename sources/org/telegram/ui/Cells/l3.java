package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.id;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class l3 extends FrameLayout {
    public final EditTextBoldCursor f29505a;

    public l3(Context context) {
        super(context);
        int i7;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f29505a = editTextBoldCursor;
        org.telegram.ui.ActionBar.t6.U(editTextBoldCursor, org.telegram.ui.ActionBar.m6.G6, null);
        org.telegram.ui.ActionBar.t6.D(editTextBoldCursor, org.telegram.ui.ActionBar.m6.H6, null);
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setEllipsize(TextUtils.TruncateAt.END);
        if (id.f23161a0) {
            i7 = 5;
        } else {
            i7 = 3;
        }
        editTextBoldCursor.setGravity(i7 | 16);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setInputType(editTextBoldCursor.getInputType() | 16384);
        addView(editTextBoldCursor, c8.ha.d(-1, -1.0f, (id.f23161a0 ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public final void a(String str) {
        EditTextBoldCursor editTextBoldCursor = this.f29505a;
        editTextBoldCursor.setText("");
        editTextBoldCursor.setHint(str);
        setWillNotDraw(true);
    }

    public String getText() {
        return this.f29505a.getText().toString();
    }

    public EditTextBoldCursor getTextView() {
        return this.f29505a;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i7), org.telegram.messenger.g0.L(50.0f));
        this.f29505a.measure(View.MeasureSpec.makeMeasureSpec(((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - org.telegram.messenger.g0.L(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setTextColor(int i7) {
        this.f29505a.setTextColor(i7);
    }

    @Override
    public final void onDraw(Canvas canvas) {
    }
}
