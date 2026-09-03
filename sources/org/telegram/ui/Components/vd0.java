package org.telegram.ui.Components;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
public final class vd0 extends FrameLayout {
    public final ImageView f31869a;
    public final TextView f31870b;
    public final TextView f31871c;

    public vd0(Context context) {
        super(context);
        ImageView imageView = new ImageView(context);
        this.f31869a = imageView;
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.setImageResource(R.drawable.fingerprint);
        addView(imageView, k7.c6.e(-1, -1, 119));
        TextView textView = new TextView(context);
        this.f31870b = textView;
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        textView.setTextSize(1, 26.0f);
        textView.setGravity(17);
        addView(textView, k7.c6.d(-1, -2.0f, 17, 0.0f, -5.33f, 0.0f, 0.0f));
        TextView textView2 = new TextView(context);
        this.f31871c = textView2;
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextSize(1, 10.0f);
        textView2.setTextColor(Integer.MAX_VALUE);
        textView2.setGravity(17);
        addView(textView2, k7.c6.d(-1, -2.0f, 17, 0.0f, 14.0f, 0.0f, 0.0f));
    }

    @Override
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.Button");
    }

    public void setImage(int i10) {
        ImageView imageView = this.f31869a;
        imageView.setVisibility(0);
        this.f31870b.setVisibility(8);
        this.f31871c.setVisibility(8);
        imageView.setImageResource(i10);
    }

    public void setNum(int i10) {
        this.f31869a.setVisibility(8);
        TextView textView = this.f31870b;
        textView.setVisibility(0);
        TextView textView2 = this.f31871c;
        textView2.setVisibility(0);
        String str = "";
        textView.setText("" + i10);
        if (i10 != 0) {
            switch (i10) {
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
