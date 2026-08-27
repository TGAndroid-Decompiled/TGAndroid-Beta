package org.telegram.ui.Components;

import android.util.Property;

public final class vd extends Property {

    public final int f33372a;

    public final ChatActivityEnterView f33373b;

    public vd(ChatActivityEnterView chatActivityEnterView, int i10) {
        super(Float.class, "emoji_button_scale");
        this.f33372a = i10;
        switch (i10) {
            case 1:
                this.f33373b = chatActivityEnterView;
                super(Float.class, "attach_scale");
                break;
            case 2:
                this.f33373b = chatActivityEnterView;
                super(Float.class, "emoji_button_alpha");
                break;
            case 3:
                this.f33373b = chatActivityEnterView;
                super(Float.class, "attach_layout_translation_x");
                break;
            case 4:
                this.f33373b = chatActivityEnterView;
                super(Float.class, "message_text_translation_x");
                break;
            default:
                this.f33373b = chatActivityEnterView;
                break;
        }
    }

    @Override
    public final Object get(Object obj) {
        switch (this.f33372a) {
            case 0:
                return Float.valueOf(this.f33373b.h);
            case 1:
                return Float.valueOf(this.f33373b.A);
            case 2:
                return Float.valueOf(this.f33373b.f26145n);
            case 3:
                return Float.valueOf(this.f33373b.f26198x);
            default:
                return Float.valueOf(this.f33373b.C);
        }
    }

    @Override
    public final void set(Object obj, Object obj2) {
        switch (this.f33372a) {
            case 0:
                float fFloatValue = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView = this.f33373b;
                chatActivityEnterView.h = fFloatValue;
                chatActivityEnterView.E1();
                break;
            case 1:
                float fFloatValue2 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView2 = this.f33373b;
                chatActivityEnterView2.A = fFloatValue2;
                chatActivityEnterView2.z1();
                break;
            case 2:
                float fFloatValue3 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView3 = this.f33373b;
                chatActivityEnterView3.f26145n = fFloatValue3;
                chatActivityEnterView3.E1();
                break;
            case 3:
                float fFloatValue4 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView4 = this.f33373b;
                chatActivityEnterView4.f26198x = fFloatValue4;
                chatActivityEnterView4.z1();
                break;
            default:
                float fFloatValue5 = ((Float) obj2).floatValue();
                ChatActivityEnterView chatActivityEnterView5 = this.f33373b;
                chatActivityEnterView5.C = fFloatValue5;
                chatActivityEnterView5.I1();
                break;
        }
    }
}
