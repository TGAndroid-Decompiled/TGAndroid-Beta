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
public final class n71 extends FrameLayout {
    public final ImageView f36485a;
    public final TextView f36486b;
    public final TextView f36487c;
    public final Switch d;
    public boolean e;

    public n71(Activity activity, boolean z4) {
        super(activity);
        int i10;
        int i11;
        this.e = false;
        ImageView imageView = new ImageView(activity);
        this.f36485a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        addView(imageView, k7.b6.d(32, 32.0f, 0, 12.0f, 4.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        addView(linearLayout, k7.b6.d(-1, -2.0f, 0, 64.0f, 4.0f, 0.0f, 4.0f));
        TextView textView = new TextView(activity);
        this.f36486b = textView;
        textView.setTextSize(2, 16.0f);
        textView.setGravity(3);
        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        if (z4) {
            i10 = 64;
        } else {
            i10 = 0;
        }
        linearLayout.addView(textView, k7.b6.t(-1, -2, 0, 0, 0, i10, 0));
        TextView textView2 = new TextView(activity);
        this.f36487c = textView2;
        textView2.setTextSize(2, 13.0f);
        textView2.setGravity(3);
        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20281y6, false));
        if (z4) {
            i11 = 64;
        } else {
            i11 = 0;
        }
        linearLayout.addView(textView2, k7.b6.t(-1, -2, 0, 0, 4, i11, 0));
        setPadding(0, AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f));
        if (z4) {
            Switch r22 = new Switch(activity, null);
            this.d = r22;
            r22.setDrawIconType(1);
            addView(r22, k7.b6.d(37, 40.0f, 21, 21.0f, 0.0f, 21.0f, 0.0f));
        }
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.e) {
            canvas.drawRect(AndroidUtilities.dp(64.0f), getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), org.telegram.ui.ActionBar.j6.f20025k0);
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
            StringBuilder sb = new StringBuilder();
            sb.append((Object) this.f36486b.getText());
            sb.append("\n");
            sb.append((Object) this.f36487c.getText());
            sb.append("\n");
            if (r02.h) {
                i10 = R.string.NotificationsOn;
            } else {
                i10 = R.string.NotificationsOff;
            }
            sb.append(LocaleController.getString(i10));
            accessibilityNodeInfo.setText(sb.toString());
        }
    }
}
