package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
public final class cc0 extends FrameLayout {
    public final ImageView f33537a;
    public final TextView f33538b;
    public final TextView f33539c;

    public cc0(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f33537a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(2131231189);
        addView(imageView, c8.ja.e(-1, -1, 119));
        TextView textView = new TextView(context);
        this.f33538b = textView;
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setTextColor(-1);
        textView.setTextSize(1, 26.0f);
        textView.setGravity(17);
        addView(textView, c8.ja.d(-1, -2.0f, 17, 0.0f, -5.33f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f33539c = textView2;
        textView2.setTypeface(org.telegram.messenger.g0.o());
        textView2.setTextSize(1, 10.0f);
        textView2.setTextColor(Integer.MAX_VALUE);
        textView2.setGravity(17);
        addView(textView2, c8.ja.d(-1, -2.0f, 17, 0.0f, 14.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    public void setImage(int i7) {
        ImageView imageView = this.f33537a;
        imageView.setVisibility(0);
        this.f33538b.setVisibility(8);
        this.f33539c.setVisibility(8);
        imageView.setImageResource(i7);
    }

    public void setNum(int i7) {
        this.f33537a.setVisibility(8);
        TextView textView = this.f33538b;
        textView.setVisibility(0);
        TextView textView2 = this.f33539c;
        textView2.setVisibility(0);
        String str = "";
        textView.setText("" + i7);
        if (i7 != 0) {
            switch (i7) {
                case 2:
                    str = "ABC";
                    break;
                case 3:
                    str = "DEF";
                    break;
                case 4:
                    str = "GHI";
                    break;
                case 5:
                    str = "JKL";
                    break;
                case 6:
                    str = "MNO";
                    break;
                case 7:
                    str = "PQRS";
                    break;
                case 8:
                    str = "TUV";
                    break;
                case 9:
                    str = "WXYZ";
                    break;
            }
        } else {
            str = "+";
        }
        textView2.setText(str);
    }
}
