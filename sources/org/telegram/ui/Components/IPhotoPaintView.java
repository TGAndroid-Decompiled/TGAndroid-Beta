package org.telegram.ui.Components;

import android.view.View;
public interface IPhotoPaintView {

    public final class CC {
        public static void $default$setOffsetTranslationX(IPhotoPaintView iPhotoPaintView, float f) {
        }

        public static View $default$getView(IPhotoPaintView _this) {
            if (_this instanceof View) {
                return (View) _this;
            }
            throw new IllegalArgumentException("You should override getView() if you're not inheriting from it.");
        }
    }
}
