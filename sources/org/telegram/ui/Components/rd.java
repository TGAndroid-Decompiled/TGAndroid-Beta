package org.telegram.ui.Components;

import android.util.Property;
import android.view.View;
public final class rd extends Property {
    public final int f37707a;
    public final ChatActivityEnterView f37708b;

    public rd(ChatActivityEnterView chatActivityEnterView, int i3) {
        super(Float.class, "emoji_button_scale");
        this.f37707a = i3;
        switch (i3) {
            case 1:
                this.f37708b = chatActivityEnterView;
                super(Float.class, "attach_scale");
                return;
            case 2:
                this.f37708b = chatActivityEnterView;
                super(Float.class, "emoji_button_alpha");
                return;
            case 3:
                this.f37708b = chatActivityEnterView;
                super(Float.class, "attach_layout_translation_x");
                return;
            case 4:
                this.f37708b = chatActivityEnterView;
                super(Float.class, "message_text_translation_x");
                return;
            default:
                this.f37708b = chatActivityEnterView;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f37707a) {
            case 0:
                View view = (View) obj;
                return Float.valueOf(this.f37708b.h);
            case 1:
                View view2 = (View) obj;
                return Float.valueOf(this.f37708b.F);
            case 2:
                View view3 = (View) obj;
                return Float.valueOf(this.f37708b.f31161n);
            case 3:
                View view4 = (View) obj;
                return Float.valueOf(this.f37708b.f31225y);
            default:
                View view5 = (View) obj;
                return Float.valueOf(this.f37708b.H);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f37707a) {
            case 0:
                View view = (View) obj;
                float floatValue = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView = this.f37708b;
                chatActivityEnterView.h = floatValue;
                chatActivityEnterView.G1();
                return;
            case 1:
                View view2 = (View) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView2 = this.f37708b;
                chatActivityEnterView2.F = floatValue2;
                chatActivityEnterView2.B1();
                return;
            case 2:
                View view3 = (View) obj;
                float floatValue3 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView3 = this.f37708b;
                chatActivityEnterView3.f31161n = floatValue3;
                chatActivityEnterView3.G1();
                return;
            case 3:
                View view4 = (View) obj;
                float floatValue4 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView4 = this.f37708b;
                chatActivityEnterView4.f31225y = floatValue4;
                chatActivityEnterView4.B1();
                return;
            default:
                View view5 = (View) obj;
                float floatValue5 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView5 = this.f37708b;
                chatActivityEnterView5.H = floatValue5;
                chatActivityEnterView5.K1();
                return;
        }
    }
}
