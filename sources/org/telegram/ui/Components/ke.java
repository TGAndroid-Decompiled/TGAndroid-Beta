package org.telegram.ui.Components;

import android.util.Property;
import android.view.View;
public final class ke extends Property {
    public final int f26693a;
    public final ChatActivityEnterView f26694b;

    public ke(ChatActivityEnterView chatActivityEnterView, int i10) {
        super(Float.class, "emoji_button_scale");
        this.f26693a = i10;
        switch (i10) {
            case 1:
                this.f26694b = chatActivityEnterView;
                super(Float.class, "attach_scale");
                return;
            case 2:
                this.f26694b = chatActivityEnterView;
                super(Float.class, "emoji_button_alpha");
                return;
            case 3:
                this.f26694b = chatActivityEnterView;
                super(Float.class, "attach_layout_translation_x");
                return;
            case 4:
                this.f26694b = chatActivityEnterView;
                super(Float.class, "message_text_translation_x");
                return;
            default:
                this.f26694b = chatActivityEnterView;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f26693a) {
            case 0:
                View view = (View) obj;
                return Float.valueOf(this.f26694b.h);
            case 1:
                View view2 = (View) obj;
                return Float.valueOf(this.f26694b.E);
            case 2:
                View view3 = (View) obj;
                return Float.valueOf(this.f26694b.f22928n);
            case 3:
                View view4 = (View) obj;
                return Float.valueOf(this.f26694b.f22982x);
            default:
                View view5 = (View) obj;
                return Float.valueOf(this.f26694b.G);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f26693a) {
            case 0:
                View view = (View) obj;
                float floatValue = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView = this.f26694b;
                chatActivityEnterView.h = floatValue;
                chatActivityEnterView.D1();
                return;
            case 1:
                View view2 = (View) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView2 = this.f26694b;
                chatActivityEnterView2.E = floatValue2;
                chatActivityEnterView2.y1();
                return;
            case 2:
                View view3 = (View) obj;
                float floatValue3 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView3 = this.f26694b;
                chatActivityEnterView3.f22928n = floatValue3;
                chatActivityEnterView3.D1();
                return;
            case 3:
                View view4 = (View) obj;
                float floatValue4 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView4 = this.f26694b;
                chatActivityEnterView4.f22982x = floatValue4;
                chatActivityEnterView4.y1();
                return;
            default:
                View view5 = (View) obj;
                float floatValue5 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView5 = this.f26694b;
                chatActivityEnterView5.G = floatValue5;
                chatActivityEnterView5.H1();
                return;
        }
    }
}
