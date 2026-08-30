package org.telegram.ui.Components;

import android.util.Property;
import android.view.View;
public final class zd extends Property {
    public final int f31330a;
    public final ChatActivityEnterView f31331b;

    public zd(ChatActivityEnterView chatActivityEnterView, int i10) {
        super(Float.class, "emoji_button_scale");
        this.f31330a = i10;
        switch (i10) {
            case 1:
                this.f31331b = chatActivityEnterView;
                super(Float.class, "attach_scale");
                return;
            case 2:
                this.f31331b = chatActivityEnterView;
                super(Float.class, "emoji_button_alpha");
                return;
            case 3:
                this.f31331b = chatActivityEnterView;
                super(Float.class, "attach_layout_translation_x");
                return;
            case 4:
                this.f31331b = chatActivityEnterView;
                super(Float.class, "message_text_translation_x");
                return;
            default:
                this.f31331b = chatActivityEnterView;
                return;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f31330a) {
            case 0:
                View view = (View) obj;
                return Float.valueOf(this.f31331b.h);
            case 1:
                View view2 = (View) obj;
                return Float.valueOf(this.f31331b.B);
            case 2:
                View view3 = (View) obj;
                return Float.valueOf(this.f31331b.f22804n);
            case 3:
                View view4 = (View) obj;
                return Float.valueOf(this.f31331b.f22858x);
            default:
                View view5 = (View) obj;
                return Float.valueOf(this.f31331b.D);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f31330a) {
            case 0:
                View view = (View) obj;
                float floatValue = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView = this.f31331b;
                chatActivityEnterView.h = floatValue;
                chatActivityEnterView.F1();
                return;
            case 1:
                View view2 = (View) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView2 = this.f31331b;
                chatActivityEnterView2.B = floatValue2;
                chatActivityEnterView2.A1();
                return;
            case 2:
                View view3 = (View) obj;
                float floatValue3 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView3 = this.f31331b;
                chatActivityEnterView3.f22804n = floatValue3;
                chatActivityEnterView3.F1();
                return;
            case 3:
                View view4 = (View) obj;
                float floatValue4 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView4 = this.f31331b;
                chatActivityEnterView4.f22858x = floatValue4;
                chatActivityEnterView4.A1();
                return;
            default:
                View view5 = (View) obj;
                float floatValue5 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView5 = this.f31331b;
                chatActivityEnterView5.D = floatValue5;
                chatActivityEnterView5.J1();
                return;
        }
    }
}
