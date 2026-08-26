package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.gms.internal.mlkit_vision_common.zzld;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import com.google.android.gms.internal.mlkit_vision_common.zzlg;
import com.google.android.gms.internal.mlkit_vision_common.zzlh;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;
import org.telegram.ui.ActionBar.Theme;

public class CheckBox2 extends View {
    public final CheckBoxBase checkBoxBase;
    public int currentIcon;
    public Drawable iconDrawable;

    public CheckBox2(Context context, int i) {
        super(context);
        this.checkBoxBase = new CheckBoxBase(null, this, i);
    }

    public CheckBoxBase getCheckBoxBase() {
        return this.checkBoxBase;
    }

    public boolean getDrawUnchecked() {
        return this.checkBoxBase.drawUnchecked;
    }

    public float getProgress() {
        return this.checkBoxBase.progress;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.checkBoxBase.attachedToWindow = true;
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.checkBoxBase.attachedToWindow = false;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        if (this.iconDrawable == null) {
            this.checkBoxBase.draw(canvas);
            return;
        }
        int measuredWidth = getMeasuredWidth() >> 1;
        int measuredHeight = getMeasuredHeight() >> 1;
        Drawable drawable = this.iconDrawable;
        drawable.setBounds(zzle.m(measuredWidth, drawable), zzld.m(measuredHeight, this.iconDrawable), zzlh.m(measuredWidth, this.iconDrawable), zzlg.m(measuredHeight, this.iconDrawable));
        this.iconDrawable.draw(canvas);
        Paint paint = new Paint();
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.2f));
        paint.setColor(Theme.getColor(null, Theme.key_switch2Track, false));
        canvas.drawCircle(measuredWidth, measuredHeight, measuredWidth - AndroidUtilities.dp(1.5f), paint);
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Switch");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.checkBoxBase.isChecked);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        int i5 = i4 - i2;
        this.checkBoxBase.setBounds(0, 0, i3 - i, i5);
    }

    public void setCirclePaintProvider(GenericProvider<Void, Paint> genericProvider) {
        CheckBoxBase checkBoxBase = this.checkBoxBase;
        if (checkBoxBase.circlePaintProvider == genericProvider) {
            return;
        }
        checkBoxBase.circlePaintProvider = genericProvider;
        checkBoxBase.invalidate();
    }

    public void setDrawBackgroundAsArc(int i) {
        this.checkBoxBase.setBackgroundType(i);
    }

    public void setDrawUnchecked(boolean z) {
        this.checkBoxBase.setDrawUnchecked(z);
    }

    public void setDuration(long j) {
        this.checkBoxBase.animationDuration = j;
    }

    @Override
    public void setEnabled(boolean z) {
        CheckBoxBase checkBoxBase = this.checkBoxBase;
        if (checkBoxBase.enabled != z) {
            checkBoxBase.enabled = z;
            checkBoxBase.invalidate();
        }
        super.setEnabled(z);
    }

    public void setForbidden(boolean z) {
        CheckBoxBase checkBoxBase = this.checkBoxBase;
        if (checkBoxBase.forbidden == z) {
            return;
        }
        checkBoxBase.forbidden = z;
        checkBoxBase.invalidate();
    }

    public void setIcon(int i) {
        if (i != this.currentIcon) {
            this.currentIcon = i;
            if (i == 0) {
                this.iconDrawable = null;
                return;
            }
            Drawable drawableMutate = getContext().getDrawable(i).mutate();
            this.iconDrawable = drawableMutate;
            drawableMutate.setColorFilter(Theme.getColor(null, Theme.key_switch2Track, false), PorterDuff.Mode.MULTIPLY);
        }
    }

    public void setNum(int i) {
        String str;
        CheckBoxBase checkBoxBase = this.checkBoxBase;
        if (i >= 0) {
            checkBoxBase.getClass();
            str = "" + (i + 1);
        } else {
            str = checkBoxBase.checkAnimator != null ? checkBoxBase.checkedText : null;
        }
        String str2 = checkBoxBase.checkedText;
        if (str2 == null) {
            if (str == null) {
                return;
            }
        } else if (str2.equals(str)) {
            return;
        }
        checkBoxBase.checkedText = str;
        checkBoxBase.invalidate();
    }

    public void setProgressDelegate(CheckBoxBase.ProgressDelegate progressDelegate) {
        this.checkBoxBase.progressDelegate = progressDelegate;
    }

    public CheckBox2(Context context, int i, Theme.ResourcesProvider resourcesProvider) {
        super(context);
        this.checkBoxBase = new CheckBoxBase(resourcesProvider, this, i);
    }
}
