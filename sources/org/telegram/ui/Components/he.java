package org.telegram.ui.Components;

import android.util.Property;
import android.view.View;
public final class he extends Property {
    public final int f24647a;
    public final ChatActivityEnterView f24648b;

    public he(ChatActivityEnterView chatActivityEnterView, int i10) {
        super(Float.class, "emoji_button_scale");
        this.f24647a = i10;
        switch (i10) {
            case 1:
                this.f24648b = chatActivityEnterView;
                super(Float.class, "attach_scale");
                return;
            case 2:
                this.f24648b = chatActivityEnterView;
                super(Float.class, "emoji_button_alpha");
                return;
            case 3:
                this.f24648b = chatActivityEnterView;
                super(Float.class, "attach_layout_translation_x");
                return;
            case 4:
                this.f24648b = chatActivityEnterView;
                super(Float.class, "message_text_translation_x");
                return;
            default:
                this.f24648b = chatActivityEnterView;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f24647a) {
            case 0:
                View view = (View) obj;
                return Float.valueOf(this.f24648b.h);
            case 1:
                View view2 = (View) obj;
                return Float.valueOf(this.f24648b.E);
            case 2:
                View view3 = (View) obj;
                return Float.valueOf(this.f24648b.f21821n);
            case 3:
                View view4 = (View) obj;
                return Float.valueOf(this.f24648b.f21875x);
            default:
                View view5 = (View) obj;
                return Float.valueOf(this.f24648b.G);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f24647a) {
            case 0:
                View view = (View) obj;
                float floatValue = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView = this.f24648b;
                chatActivityEnterView.h = floatValue;
                chatActivityEnterView.F1();
                return;
            case 1:
                View view2 = (View) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView2 = this.f24648b;
                chatActivityEnterView2.E = floatValue2;
                chatActivityEnterView2.A1();
                return;
            case 2:
                View view3 = (View) obj;
                float floatValue3 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView3 = this.f24648b;
                chatActivityEnterView3.f21821n = floatValue3;
                chatActivityEnterView3.F1();
                return;
            case 3:
                View view4 = (View) obj;
                float floatValue4 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView4 = this.f24648b;
                chatActivityEnterView4.f21875x = floatValue4;
                chatActivityEnterView4.A1();
                return;
            default:
                View view5 = (View) obj;
                float floatValue5 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView5 = this.f24648b;
                chatActivityEnterView5.G = floatValue5;
                chatActivityEnterView5.J1();
                return;
        }
    }
}
