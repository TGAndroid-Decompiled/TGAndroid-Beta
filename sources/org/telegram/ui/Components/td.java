package org.telegram.ui.Components;

import android.util.Property;
import android.view.View;
public final class td extends Property {
    public final int f39638a;
    public final ChatActivityEnterView f39639b;

    public td(ChatActivityEnterView chatActivityEnterView, int i7) {
        super(Float.class, "emoji_button_scale");
        this.f39638a = i7;
        switch (i7) {
            case 1:
                this.f39639b = chatActivityEnterView;
                super(Float.class, "attach_scale");
                return;
            case 2:
                this.f39639b = chatActivityEnterView;
                super(Float.class, "emoji_button_alpha");
                return;
            case 3:
                this.f39639b = chatActivityEnterView;
                super(Float.class, "attach_layout_translation_x");
                return;
            case 4:
                this.f39639b = chatActivityEnterView;
                super(Float.class, "message_text_translation_x");
                return;
            default:
                this.f39639b = chatActivityEnterView;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f39638a) {
            case 0:
                View view = (View) obj;
                return Float.valueOf(this.f39639b.h);
            case 1:
                View view2 = (View) obj;
                return Float.valueOf(this.f39639b.F);
            case 2:
                View view3 = (View) obj;
                return Float.valueOf(this.f39639b.f32245n);
            case 3:
                View view4 = (View) obj;
                return Float.valueOf(this.f39639b.f32323y);
            default:
                View view5 = (View) obj;
                return Float.valueOf(this.f39639b.H);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f39638a) {
            case 0:
                View view = (View) obj;
                float floatValue = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView = this.f39639b;
                chatActivityEnterView.h = floatValue;
                chatActivityEnterView.Z1();
                return;
            case 1:
                View view2 = (View) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView2 = this.f39639b;
                chatActivityEnterView2.F = floatValue2;
                chatActivityEnterView2.U1();
                return;
            case 2:
                View view3 = (View) obj;
                float floatValue3 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView3 = this.f39639b;
                chatActivityEnterView3.f32245n = floatValue3;
                chatActivityEnterView3.Z1();
                return;
            case 3:
                View view4 = (View) obj;
                float floatValue4 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView4 = this.f39639b;
                chatActivityEnterView4.f32323y = floatValue4;
                chatActivityEnterView4.U1();
                return;
            default:
                View view5 = (View) obj;
                float floatValue5 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView5 = this.f39639b;
                chatActivityEnterView5.H = floatValue5;
                chatActivityEnterView5.d2();
                return;
        }
    }
}
