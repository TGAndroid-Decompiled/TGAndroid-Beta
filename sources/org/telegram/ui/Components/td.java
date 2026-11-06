package org.telegram.ui.Components;

import android.util.Property;
import android.view.View;
public final class td extends Property {
    public final int f38325a;
    public final ChatActivityEnterView f38326b;

    public td(ChatActivityEnterView chatActivityEnterView, int i7) {
        super(Float.class, "emoji_button_scale");
        this.f38325a = i7;
        switch (i7) {
            case 1:
                this.f38326b = chatActivityEnterView;
                super(Float.class, "attach_scale");
                return;
            case 2:
                this.f38326b = chatActivityEnterView;
                super(Float.class, "emoji_button_alpha");
                return;
            case 3:
                this.f38326b = chatActivityEnterView;
                super(Float.class, "attach_layout_translation_x");
                return;
            case 4:
                this.f38326b = chatActivityEnterView;
                super(Float.class, "message_text_translation_x");
                return;
            default:
                this.f38326b = chatActivityEnterView;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f38325a) {
            case 0:
                View view = (View) obj;
                return Float.valueOf(this.f38326b.h);
            case 1:
                View view2 = (View) obj;
                return Float.valueOf(this.f38326b.E);
            case 2:
                View view3 = (View) obj;
                return Float.valueOf(this.f38326b.f31087n);
            case 3:
                View view4 = (View) obj;
                return Float.valueOf(this.f38326b.f31150y);
            default:
                View view5 = (View) obj;
                return Float.valueOf(this.f38326b.G);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f38325a) {
            case 0:
                View view = (View) obj;
                float floatValue = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView = this.f38326b;
                chatActivityEnterView.h = floatValue;
                chatActivityEnterView.H1();
                return;
            case 1:
                View view2 = (View) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView2 = this.f38326b;
                chatActivityEnterView2.E = floatValue2;
                chatActivityEnterView2.C1();
                return;
            case 2:
                View view3 = (View) obj;
                float floatValue3 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView3 = this.f38326b;
                chatActivityEnterView3.f31087n = floatValue3;
                chatActivityEnterView3.H1();
                return;
            case 3:
                View view4 = (View) obj;
                float floatValue4 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView4 = this.f38326b;
                chatActivityEnterView4.f31150y = floatValue4;
                chatActivityEnterView4.C1();
                return;
            default:
                View view5 = (View) obj;
                float floatValue5 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView5 = this.f38326b;
                chatActivityEnterView5.G = floatValue5;
                chatActivityEnterView5.L1();
                return;
        }
    }
}
