package org.telegram.ui.Components;

import android.util.Property;
import android.view.View;
public final class je extends Property {
    public final int f25352a;
    public final ChatActivityEnterView f25353b;

    public je(ChatActivityEnterView chatActivityEnterView, int i10) {
        super(Float.class, "emoji_button_scale");
        this.f25352a = i10;
        switch (i10) {
            case 1:
                this.f25353b = chatActivityEnterView;
                super(Float.class, "attach_scale");
                return;
            case 2:
                this.f25353b = chatActivityEnterView;
                super(Float.class, "emoji_button_alpha");
                return;
            case 3:
                this.f25353b = chatActivityEnterView;
                super(Float.class, "attach_layout_translation_x");
                return;
            case 4:
                this.f25353b = chatActivityEnterView;
                super(Float.class, "message_text_translation_x");
                return;
            default:
                this.f25353b = chatActivityEnterView;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f25352a) {
            case 0:
                View view = (View) obj;
                return Float.valueOf(this.f25353b.h);
            case 1:
                View view2 = (View) obj;
                return Float.valueOf(this.f25353b.E);
            case 2:
                View view3 = (View) obj;
                return Float.valueOf(this.f25353b.f22029n);
            case 3:
                View view4 = (View) obj;
                return Float.valueOf(this.f25353b.f22083x);
            default:
                View view5 = (View) obj;
                return Float.valueOf(this.f25353b.G);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f25352a) {
            case 0:
                View view = (View) obj;
                float floatValue = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView = this.f25353b;
                chatActivityEnterView.h = floatValue;
                chatActivityEnterView.E1();
                return;
            case 1:
                View view2 = (View) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView2 = this.f25353b;
                chatActivityEnterView2.E = floatValue2;
                chatActivityEnterView2.z1();
                return;
            case 2:
                View view3 = (View) obj;
                float floatValue3 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView3 = this.f25353b;
                chatActivityEnterView3.f22029n = floatValue3;
                chatActivityEnterView3.E1();
                return;
            case 3:
                View view4 = (View) obj;
                float floatValue4 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView4 = this.f25353b;
                chatActivityEnterView4.f22083x = floatValue4;
                chatActivityEnterView4.z1();
                return;
            default:
                View view5 = (View) obj;
                float floatValue5 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView5 = this.f25353b;
                chatActivityEnterView5.G = floatValue5;
                chatActivityEnterView5.I1();
                return;
        }
    }
}
