package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class l3 extends FrameLayout {
    public final EditTextBoldCursor f29547a;

    public l3(Context context) {
        super(context);
        int i3;
        EditTextBoldCursor editTextBoldCursor = new EditTextBoldCursor(context);
        this.f29547a = editTextBoldCursor;
        org.telegram.ui.ActionBar.r6.V(editTextBoldCursor, org.telegram.ui.ActionBar.k6.G6, null);
        org.telegram.ui.ActionBar.r6.E(editTextBoldCursor, org.telegram.ui.ActionBar.k6.H6, null);
        editTextBoldCursor.setTextSize(1, 16.0f);
        editTextBoldCursor.setLines(1);
        editTextBoldCursor.setMaxLines(1);
        editTextBoldCursor.setSingleLine(true);
        editTextBoldCursor.setEllipsize(TextUtils.TruncateAt.END);
        if (bd.f21784a0) {
            i3 = 5;
        } else {
            i3 = 3;
        }
        editTextBoldCursor.setGravity(i3 | 16);
        editTextBoldCursor.setBackgroundDrawable(null);
        editTextBoldCursor.setPadding(0, 0, 0, 0);
        editTextBoldCursor.setInputType(editTextBoldCursor.getInputType() | 16384);
        addView(editTextBoldCursor, mf.d(-1, -1.0f, (bd.f21784a0 ? 5 : 3) | 48, 21.0f, 0.0f, 21.0f, 0.0f));
    }

    public final void a(String str) {
        EditTextBoldCursor editTextBoldCursor = this.f29547a;
        editTextBoldCursor.setText("");
        editTextBoldCursor.setHint(str);
        setWillNotDraw(true);
    }

    public String getText() {
        return this.f29547a.getText().toString();
    }

    public EditTextBoldCursor getTextView() {
        return this.f29547a;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i3), org.telegram.messenger.g0.L(50.0f));
        this.f29547a.measure(View.MeasureSpec.makeMeasureSpec(((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight()) - org.telegram.messenger.g0.L(42.0f), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
    }

    public void setTextColor(int i3) {
        this.f29547a.setTextColor(i3);
    }

    @Override
    public final void onDraw(Canvas canvas) {
    }
}
