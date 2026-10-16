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
public final class n81 extends FrameLayout {
    public final ImageView f38286a;
    public final TextView f38287b;
    public final TextView f38288c;
    public final Switch d;
    public boolean e;

    public n81(Activity activity, boolean z10) {
        super(activity);
        int i10;
        int i11;
        this.e = false;
        ImageView imageView = new ImageView(activity);
        this.f38286a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, w7.z5.a(32.0f, 12.0f, 4.0f, 0.0f, 0.0f, 32, 0));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        addView(linearLayout, w7.z5.a(-2.0f, 64.0f, 4.0f, 0.0f, 4.0f, -1, 0));
        TextView textView = new TextView(activity);
        this.f38287b = textView;
        textView.setTextSize(2, 16.0f);
        textView.setGravity(3);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.G6, false));
        if (z10) {
            i10 = 64;
        } else {
            i10 = 0;
        }
        linearLayout.addView(textView, w7.z5.t(-1, -2, 0, 0, 0, i10, 0));
        TextView textView2 = new TextView(activity);
        this.f38288c = textView2;
        textView2.setTextSize(2, 13.0f);
        textView2.setGravity(3);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19988y6, false));
        if (z10) {
            i11 = 64;
        } else {
            i11 = 0;
        }
        linearLayout.addView(textView2, w7.z5.t(-1, -2, 0, 0, 4, i11, 0));
        setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        if (z10) {
            Switch r22 = new Switch(activity, null);
            this.d = r22;
            r22.setDrawIconType(1);
            addView(r22, w7.z5.a(40.0f, 21.0f, 0.0f, 21.0f, 0.0f, 37, 21));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.e) {
            canvas.drawRect(AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.g6.f19722k0);
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
            sb2.append((Object) this.f38287b.getText());
            sb2.append("\n");
            sb2.append((Object) this.f38288c.getText());
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
