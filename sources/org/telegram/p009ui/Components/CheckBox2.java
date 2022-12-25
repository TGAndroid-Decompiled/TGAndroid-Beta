package org.telegram.p009ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CheckBox;
import org.telegram.messenger.GenericProvider;
import org.telegram.p009ui.ActionBar.Theme;
import org.telegram.p009ui.Components.CheckBoxBase;

public class CheckBox2 extends View {
    private CheckBoxBase checkBoxBase;

    public CheckBox2(Context context, int i) {
        this(context, i, null);
    }

    public CheckBox2(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.checkBoxBase = new CheckBoxBase(this, i, resourcesProvider);
    }

    public void setCirclePaintProvider(GenericProvider<Void, Paint> genericProvider) {
        this.checkBoxBase.setCirclePaintProvider(genericProvider);
    }

    public void setProgressDelegate(CheckBoxBase.ProgressDelegate progressDelegate) {
        this.checkBoxBase.setProgressDelegate(progressDelegate);
    }

    public void setChecked(int i, boolean z, boolean z2) {
        this.checkBoxBase.setChecked(i, z, z2);
    }

    public void setChecked(boolean z, boolean z2) {
        this.checkBoxBase.setChecked(z, z2);
    }

    public void setNum(int i) {
        this.checkBoxBase.setNum(i);
    }

    public boolean isChecked() {
        return this.checkBoxBase.isChecked();
    }

    public void setColor(String str, String str2, String str3) {
        this.checkBoxBase.setColor(str, str2, str3);
    }

    @Override
    public void setEnabled(boolean z) {
        this.checkBoxBase.setEnabled(z);
        super.setEnabled(z);
    }

    public void setDrawUnchecked(boolean z) {
        this.checkBoxBase.setDrawUnchecked(z);
    }

    public void setDrawBackgroundAsArc(int i) {
        this.checkBoxBase.setBackgroundType(i);
    }

    public float getProgress() {
        return this.checkBoxBase.getProgress();
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.checkBoxBase.onAttachedToWindow();
    }

    public void setDuration(long j) {
        this.checkBoxBase.animationDuration = j;
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.checkBoxBase.onDetachedFromWindow();
    }

    @Override
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.checkBoxBase.setBounds(0, 0, i3 - i, i4 - i2);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        this.checkBoxBase.draw(canvas);
    }

    @Override
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(CheckBox.class.getName());
        accessibilityNodeInfo.setChecked(isChecked());
        accessibilityNodeInfo.setCheckable(true);
    }
}
