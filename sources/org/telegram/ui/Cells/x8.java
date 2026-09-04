package org.telegram.ui.Cells;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.wl;
import org.telegram.ui.Components.mp;
public final class x8 extends FrameLayout {
    public final TextView f23540a;
    public final TextView f23541b;
    public final mp f23542c;
    public boolean d;
    public boolean f23543e;
    public int f23544f;
    public float h;
    public float f23545n;

    static {
        new t8("animationProgress", 1);
    }

    public x8(Context context) {
        super(context);
        int i10;
        int i11;
        float f7;
        float f10;
        int i12;
        int i13;
        float f11;
        float f12;
        this.f23544f = 50;
        TextView textView = new TextView(context);
        this.f23540a = textView;
        wl.r(textView, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false), 1, 16.0f, 1);
        textView.setMaxLines(1);
        textView.setSingleLine(true);
        if (LocaleController.isRTL) {
            i10 = 5;
        } else {
            i10 = 3;
        }
        textView.setGravity(i10 | 16);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textView.setEllipsize(truncateAt);
        boolean z10 = LocaleController.isRTL;
        if (z10) {
            i11 = 5;
        } else {
            i11 = 3;
        }
        int i14 = i11 | 48;
        if (z10) {
            f7 = 21;
        } else {
            f7 = 64.0f;
        }
        if (z10) {
            f10 = 64.0f;
        } else {
            f10 = 21;
        }
        addView(textView, w7.x5.d(-1, -1.0f, i14, f7, 0.0f, f10, 0.0f));
        TextView textView2 = new TextView(context);
        this.f23541b = textView2;
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21061z6, false));
        textView2.setTextSize(1, 13.0f);
        if (LocaleController.isRTL) {
            i12 = 5;
        } else {
            i12 = 3;
        }
        textView2.setGravity(i12);
        textView2.setLines(1);
        textView2.setMaxLines(1);
        textView2.setSingleLine(true);
        textView2.setPadding(0, 0, 0, 0);
        textView2.setEllipsize(truncateAt);
        boolean z11 = LocaleController.isRTL;
        if (z11) {
            i13 = 5;
        } else {
            i13 = 3;
        }
        int i15 = i13 | 48;
        if (z11) {
            f11 = 21;
        } else {
            f11 = 64.0f;
        }
        if (z11) {
            f12 = 64.0f;
        } else {
            f12 = 21;
        }
        addView(textView2, w7.x5.d(-2, -2.0f, i15, f11, 36.0f, f12, 0.0f));
        mp mpVar = new mp(context, 21, null);
        this.f23542c = mpVar;
        mpVar.setDrawUnchecked(true);
        mpVar.setDrawBackgroundAsArc(10);
        mpVar.setDuration(100L);
        mpVar.b(org.telegram.ui.ActionBar.j6.f20736h7, org.telegram.ui.ActionBar.j6.f20772j7, org.telegram.ui.ActionBar.j6.f20792k7);
        addView(mpVar, w7.x5.d(20, 20.0f, (LocaleController.isRTL ? 5 : 3) | 16, 22.0f, 0.0f, 22.0f, 0.0f));
        setClipChildren(false);
    }

    public void setAnimationProgress(float f7) {
        this.h = f7;
        Math.max(this.f23545n, getMeasuredWidth() - this.f23545n);
        AndroidUtilities.dp(40.0f);
        getMeasuredHeight();
    }

    public final void b(String str, String str2, boolean z10, boolean z11) {
        TextView textView = this.f23540a;
        textView.setText(str);
        TextView textView2 = this.f23541b;
        textView2.setText(str2);
        this.d = z11;
        textView2.setVisibility(0);
        this.f23543e = z10;
        if (z10) {
            textView2.setLines(0);
            textView2.setMaxLines(0);
            textView2.setSingleLine(false);
            textView2.setEllipsize(null);
            textView2.setPadding(0, 0, 0, AndroidUtilities.dp(11.0f));
        } else {
            textView2.setLines(1);
            textView2.setMaxLines(1);
            textView2.setSingleLine(true);
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setPadding(0, 0, 0, 0);
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) textView.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.topMargin = AndroidUtilities.dp(10.0f);
        textView.setLayoutParams(layoutParams);
        setWillNotDraw(!z11);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        float dp;
        int i10;
        if (this.d) {
            if (LocaleController.isRTL) {
                dp = 0.0f;
            } else {
                dp = AndroidUtilities.dp(64.0f);
            }
            float measuredHeight = getMeasuredHeight() - 1;
            int measuredWidth = getMeasuredWidth();
            if (LocaleController.isRTL) {
                i10 = AndroidUtilities.dp(64.0f);
            } else {
                i10 = 0;
            }
            canvas.drawLine(dp, measuredHeight, measuredWidth - i10, getMeasuredHeight() - 1, org.telegram.ui.ActionBar.j6.f20785k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.checkbox");
        accessibilityNodeInfo.setCheckable(true);
        accessibilityNodeInfo.setChecked(this.f23542c.f28477a.f23907q);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f23540a.getText());
        TextView textView = this.f23541b;
        if (textView != null) {
            sb2.append("\n");
            sb2.append(textView.getText());
        }
        accessibilityNodeInfo.setText(sb2);
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        float f7;
        if (this.f23543e) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
            return;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 1073741824);
        if (this.f23541b.getVisibility() == 0) {
            f7 = 64.0f;
        } else {
            f7 = this.f23544f;
        }
        super.onMeasure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(f7) + (this.d ? 1 : 0), 1073741824));
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.f23545n = motionEvent.getX();
        return super.onTouchEvent(motionEvent);
    }

    @Override
    public void setBackgroundColor(int i10) {
        clearAnimation();
        super.setBackgroundColor(i10);
    }

    public void setChecked(boolean z10) {
        this.f23542c.a(z10, true);
    }

    public void setHeight(int i10) {
        this.f23544f = i10;
    }

    @Override
    public void setPressed(boolean z10) {
        super.setPressed(z10);
    }

    public void setTypeface(Typeface typeface) {
        this.f23540a.setTypeface(typeface);
    }
}
