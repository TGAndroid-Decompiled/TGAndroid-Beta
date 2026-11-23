package org.telegram.ui.Components;

import android.util.Property;
import android.view.View;
public final class ce extends Property {
    public final int f34188a;
    public final ChatActivityEnterView f34189b;

    public ce(ChatActivityEnterView chatActivityEnterView, int i7) {
        super(Float.class, "emoji_button_scale");
        this.f34188a = i7;
        switch (i7) {
            case 1:
                this.f34189b = chatActivityEnterView;
                super(Float.class, "attach_scale");
                return;
            case 2:
                this.f34189b = chatActivityEnterView;
                super(Float.class, "emoji_button_alpha");
                return;
            case 3:
                this.f34189b = chatActivityEnterView;
                super(Float.class, "attach_layout_translation_x");
                return;
            case 4:
                this.f34189b = chatActivityEnterView;
                super(Float.class, "message_text_translation_x");
                return;
            default:
                this.f34189b = chatActivityEnterView;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f34188a) {
            case 0:
                View view = (View) obj;
                return Float.valueOf(this.f34189b.h);
            case 1:
                View view2 = (View) obj;
                return Float.valueOf(this.f34189b.F);
            case 2:
                View view3 = (View) obj;
                return Float.valueOf(this.f34189b.f32673n);
            case 3:
                View view4 = (View) obj;
                return Float.valueOf(this.f34189b.f32756y);
            default:
                View view5 = (View) obj;
                return Float.valueOf(this.f34189b.H);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f34188a) {
            case 0:
                View view = (View) obj;
                float floatValue = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView = this.f34189b;
                chatActivityEnterView.h = floatValue;
                chatActivityEnterView.m2();
                return;
            case 1:
                View view2 = (View) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView2 = this.f34189b;
                chatActivityEnterView2.F = floatValue2;
                chatActivityEnterView2.h2();
                return;
            case 2:
                View view3 = (View) obj;
                float floatValue3 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView3 = this.f34189b;
                chatActivityEnterView3.f32673n = floatValue3;
                chatActivityEnterView3.m2();
                return;
            case 3:
                View view4 = (View) obj;
                float floatValue4 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView4 = this.f34189b;
                chatActivityEnterView4.f32756y = floatValue4;
                chatActivityEnterView4.h2();
                return;
            default:
                View view5 = (View) obj;
                float floatValue5 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView5 = this.f34189b;
                chatActivityEnterView5.H = floatValue5;
                chatActivityEnterView5.q2();
                return;
        }
    }
}
