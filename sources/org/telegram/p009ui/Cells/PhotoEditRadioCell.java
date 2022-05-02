package org.telegram.p009ui.Cells;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.p009ui.Components.LayoutHelper;
import org.telegram.p009ui.Components.RadioButton;

public class PhotoEditRadioCell extends FrameLayout {
    private int currentColor;
    private int currentType;
    private TextView nameTextView;
    private View.OnClickListener onClickListener;
    private LinearLayout tintButtonsContainer;
    private final int[] tintShadowColors = {0, -45747, -753630, -13056, -8269183, -9321002, -16747844, -10080879};
    private final int[] tintHighlighsColors = {0, -1076602, -1388894, -859780, -5968466, -7742235, -13726776, -3303195};

    public PhotoEditRadioCell(Context context) {
        super(context);
        TextView textView = new TextView(context);
        this.nameTextView = textView;
        textView.setGravity(5);
        this.nameTextView.setTextColor(-1);
        this.nameTextView.setTextSize(1, 12.0f);
        this.nameTextView.setMaxLines(1);
        this.nameTextView.setSingleLine(true);
        this.nameTextView.setEllipsize(TextUtils.TruncateAt.END);
        addView(this.nameTextView, LayoutHelper.createFrame(80, -2.0f, 19, 0.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.tintButtonsContainer = linearLayout;
        linearLayout.setOrientation(0);
        for (int i = 0; i < this.tintShadowColors.length; i++) {
            RadioButton radioButton = new RadioButton(context);
            radioButton.setSize(AndroidUtilities.m34dp(20.0f));
            radioButton.setTag(Integer.valueOf(i));
            this.tintButtonsContainer.addView(radioButton, LayoutHelper.createLinear(0, -1, 1.0f / this.tintShadowColors.length));
            radioButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PhotoEditRadioCell.this.lambda$new$0(view);
                }
            });
        }
        addView(this.tintButtonsContainer, LayoutHelper.createFrame(-1, 40.0f, 51, 96.0f, 0.0f, 24.0f, 0.0f));
    }

    public void lambda$new$0(View view) {
        RadioButton radioButton = (RadioButton) view;
        if (this.currentType == 0) {
            this.currentColor = this.tintShadowColors[((Integer) radioButton.getTag()).intValue()];
        } else {
            this.currentColor = this.tintHighlighsColors[((Integer) radioButton.getTag()).intValue()];
        }
        updateSelectedTintButton(true);
        this.onClickListener.onClick(this);
    }

    public int getCurrentColor() {
        return this.currentColor;
    }

    private void updateSelectedTintButton(boolean z) {
        int i;
        int childCount = this.tintButtonsContainer.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.tintButtonsContainer.getChildAt(i2);
            if (childAt instanceof RadioButton) {
                RadioButton radioButton = (RadioButton) childAt;
                int intValue = ((Integer) radioButton.getTag()).intValue();
                radioButton.setChecked(this.currentColor == (this.currentType == 0 ? this.tintShadowColors[intValue] : this.tintHighlighsColors[intValue]), z);
                int i3 = -1;
                if (intValue == 0) {
                    i = -1;
                } else {
                    i = this.currentType == 0 ? this.tintShadowColors[intValue] : this.tintHighlighsColors[intValue];
                }
                if (intValue != 0) {
                    i3 = this.currentType == 0 ? this.tintShadowColors[intValue] : this.tintHighlighsColors[intValue];
                }
                radioButton.setColor(i, i3);
            }
        }
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.m34dp(40.0f), 1073741824));
    }

    public void setIconAndTextAndValue(String str, int i, int i2) {
        this.currentType = i;
        this.currentColor = i2;
        TextView textView = this.nameTextView;
        textView.setText(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        updateSelectedTintButton(false);
    }
}
