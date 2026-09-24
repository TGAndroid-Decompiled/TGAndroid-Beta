package org.telegram.ui.Components;

import android.util.Property;
import android.view.View;
public final class ke extends Property {
    public final int f25746a;
    public final ChatActivityEnterView f25747b;

    public ke(ChatActivityEnterView chatActivityEnterView, int i10) {
        super(Float.class, "emoji_button_scale");
        this.f25746a = i10;
        switch (i10) {
            case 1:
                this.f25747b = chatActivityEnterView;
                super(Float.class, "attach_scale");
                return;
            case 2:
                this.f25747b = chatActivityEnterView;
                super(Float.class, "emoji_button_alpha");
                return;
            case 3:
                this.f25747b = chatActivityEnterView;
                super(Float.class, "attach_layout_translation_x");
                return;
            case 4:
                this.f25747b = chatActivityEnterView;
                super(Float.class, "message_text_translation_x");
                return;
            default:
                this.f25747b = chatActivityEnterView;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f25746a) {
            case 0:
                View view = (View) obj;
                return Float.valueOf(this.f25747b.h);
            case 1:
                View view2 = (View) obj;
                return Float.valueOf(this.f25747b.E);
            case 2:
                View view3 = (View) obj;
                return Float.valueOf(this.f25747b.f22016n);
            case 3:
                View view4 = (View) obj;
                return Float.valueOf(this.f25747b.f22070x);
            default:
                View view5 = (View) obj;
                return Float.valueOf(this.f25747b.G);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f25746a) {
            case 0:
                View view = (View) obj;
                float floatValue = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView = this.f25747b;
                chatActivityEnterView.h = floatValue;
                chatActivityEnterView.F1();
                return;
            case 1:
                View view2 = (View) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView2 = this.f25747b;
                chatActivityEnterView2.E = floatValue2;
                chatActivityEnterView2.A1();
                return;
            case 2:
                View view3 = (View) obj;
                float floatValue3 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView3 = this.f25747b;
                chatActivityEnterView3.f22016n = floatValue3;
                chatActivityEnterView3.F1();
                return;
            case 3:
                View view4 = (View) obj;
                float floatValue4 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView4 = this.f25747b;
                chatActivityEnterView4.f22070x = floatValue4;
                chatActivityEnterView4.A1();
                return;
            default:
                View view5 = (View) obj;
                float floatValue5 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView5 = this.f25747b;
                chatActivityEnterView5.G = floatValue5;
                chatActivityEnterView5.J1();
                return;
        }
    }
}
