package org.telegram.ui.Cells;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.LayoutHelper;
import org.telegram.ui.Components.RadioButton;

public class PhotoEditRadioCell extends FrameLayout {
    private int currentColor;
    private int currentType;
    private TextView nameTextView;
    private View.OnClickListener onClickListener;
    private LinearLayout tintButtonsContainer;
    private final int[] tintHighlighsColors;
    private final int[] tintShadowColors;

    public PhotoEditRadioCell(Context context) {
        super(context);
        this.tintShadowColors = new int[]{0, -45747, -753630, -13056, -8269183, -9321002, -16747844, -10080879};
        this.tintHighlighsColors = new int[]{0, -1076602, -1388894, -859780, -5968466, -7742235, -13726776, -3303195};
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
            radioButton.setSize(AndroidUtilities.dp(20.0f));
            radioButton.setTag(Integer.valueOf(i));
            this.tintButtonsContainer.addView(radioButton, LayoutHelper.createLinear(0, -1, 1.0f / this.tintShadowColors.length));
            radioButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public final void onClick(View view) {
                    PhotoEditRadioCell.m1499$r8$lambda$k8_GxOPRgx8gMS6SfrRCpRMl24(this.f$0, view);
                }
            });
        }
        addView(this.tintButtonsContainer, LayoutHelper.createFrame(-1, 40.0f, 51, 96.0f, 0.0f, 24.0f, 0.0f));
    }

    public static void m1499$r8$lambda$k8_GxOPRgx8gMS6SfrRCpRMl24(PhotoEditRadioCell photoEditRadioCell, View view) {
        photoEditRadioCell.getClass();
        RadioButton radioButton = (RadioButton) view;
        if (photoEditRadioCell.currentType == 0) {
            photoEditRadioCell.currentColor = photoEditRadioCell.tintShadowColors[((Integer) radioButton.getTag()).intValue()];
        } else {
            photoEditRadioCell.currentColor = photoEditRadioCell.tintHighlighsColors[((Integer) radioButton.getTag()).intValue()];
        }
        photoEditRadioCell.updateSelectedTintButton(true);
        photoEditRadioCell.onClickListener.onClick(photoEditRadioCell);
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
                int iIntValue = ((Integer) radioButton.getTag()).intValue();
                radioButton.setChecked(this.currentColor == (this.currentType == 0 ? this.tintShadowColors[iIntValue] : this.tintHighlighsColors[iIntValue]), z);
                if (iIntValue == 0) {
                    i = -1;
                } else {
                    i = this.currentType == 0 ? this.tintShadowColors[iIntValue] : this.tintHighlighsColors[iIntValue];
                }
                radioButton.setColor(i, iIntValue != 0 ? this.currentType == 0 ? this.tintShadowColors[iIntValue] : this.tintHighlighsColors[iIntValue] : -1);
            }
        }
    }

    @Override
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.onClickListener = onClickListener;
    }

    @Override
    protected void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(40.0f), 1073741824));
    }

    public void setIconAndTextAndValue(String str, int i, int i2) {
        this.currentType = i;
        this.currentColor = i2;
        this.nameTextView.setText(str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase());
        updateSelectedTintButton(false);
    }
}
