package org.telegram.ui;

import android.app.Activity;
import android.graphics.Canvas;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.Switch;
public final class f81 extends FrameLayout {
    public final ImageView f36335a;
    public final TextView f36336b;
    public final TextView f36337c;
    public final Switch d;
    public boolean f36338e;

    public f81(Activity activity, boolean z10) {
        super(activity);
        int i10;
        int i11;
        this.f36338e = false;
        ImageView imageView = new ImageView(activity);
        this.f36335a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.x5.d(32, 32.0f, 0, 12.0f, 4.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.x5.d(-1, -2.0f, 0, 64.0f, 4.0f, 0.0f, 4.0f));
        TextView textView = new TextView(activity);
        this.f36336b = textView;
        textView.setTextSize(2, 16.0f);
        textView.setGravity(3);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        if (z10) {
            i10 = 64;
        } else {
            i10 = 0;
        }
        linearLayout.addView(textView, w7.x5.t(-1, -2, 0, 0, 0, i10, 0));
        TextView textView2 = new TextView(activity);
        this.f36337c = textView2;
        textView2.setTextSize(2, 13.0f);
        textView2.setGravity(3);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f21042y6, false));
        if (z10) {
            i11 = 64;
        } else {
            i11 = 0;
        }
        linearLayout.addView(textView2, w7.x5.t(-1, -2, 0, 0, 4, i11, 0));
        setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        if (z10) {
            Switch r22 = new Switch(activity, null);
            this.d = r22;
            r22.setDrawIconType(1);
            addView(r22, w7.x5.d(37, 40.0f, 21, 21.0f, 0.0f, 21.0f, 0.0f));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f36338e) {
            canvas.drawRect(AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f20785k0);
        }
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        int i10;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        Switch r02 = this.d;
        if (r02 != null) {
            accessibilityNodeInfo.setClassName("android.widget.Switch");
            accessibilityNodeInfo.setCheckable(true);
            accessibilityNodeInfo.setChecked(r02.h);
            StringBuilder sb2 = new StringBuilder();
            sb2.append((Object) this.f36336b.getText());
            sb2.append("\n");
            sb2.append((Object) this.f36337c.getText());
            sb2.append("\n");
            if (r02.h) {
                i10 = R.string.NotificationsOn;
            } else {
                i10 = R.string.NotificationsOff;
            }
            sb2.append(LocaleController.getString(i10));
            accessibilityNodeInfo.setText(sb2.toString());
        }
    }
}
