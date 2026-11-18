package org.telegram.ui.Components;

import android.util.Property;
import android.view.View;
public final class ce extends Property {
    public final int f33972a;
    public final ChatActivityEnterView f33973b;

    public ce(ChatActivityEnterView chatActivityEnterView, int i7) {
        super(Float.class, "emoji_button_scale");
        this.f33972a = i7;
        switch (i7) {
            case 1:
                this.f33973b = chatActivityEnterView;
                super(Float.class, "attach_scale");
                return;
            case 2:
                this.f33973b = chatActivityEnterView;
                super(Float.class, "emoji_button_alpha");
                return;
            case 3:
                this.f33973b = chatActivityEnterView;
                super(Float.class, "attach_layout_translation_x");
                return;
            case 4:
                this.f33973b = chatActivityEnterView;
                super(Float.class, "message_text_translation_x");
                return;
            default:
                this.f33973b = chatActivityEnterView;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f33972a) {
            case 0:
                View view = (View) obj;
                return Float.valueOf(this.f33973b.h);
            case 1:
                View view2 = (View) obj;
                return Float.valueOf(this.f33973b.F);
            case 2:
                View view3 = (View) obj;
                return Float.valueOf(this.f33973b.f32642n);
            case 3:
                View view4 = (View) obj;
                return Float.valueOf(this.f33973b.f32720y);
            default:
                View view5 = (View) obj;
                return Float.valueOf(this.f33973b.H);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f33972a) {
            case 0:
                View view = (View) obj;
                float floatValue = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView = this.f33973b;
                chatActivityEnterView.h = floatValue;
                chatActivityEnterView.i2();
                return;
            case 1:
                View view2 = (View) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView2 = this.f33973b;
                chatActivityEnterView2.F = floatValue2;
                chatActivityEnterView2.d2();
                return;
            case 2:
                View view3 = (View) obj;
                float floatValue3 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView3 = this.f33973b;
                chatActivityEnterView3.f32642n = floatValue3;
                chatActivityEnterView3.i2();
                return;
            case 3:
                View view4 = (View) obj;
                float floatValue4 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView4 = this.f33973b;
                chatActivityEnterView4.f32720y = floatValue4;
                chatActivityEnterView4.d2();
                return;
            default:
                View view5 = (View) obj;
                float floatValue5 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView5 = this.f33973b;
                chatActivityEnterView5.H = floatValue5;
                chatActivityEnterView5.m2();
                return;
        }
    }
}
