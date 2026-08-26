package org.telegram.ui.iv;

import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import org.telegram.ui.Cells.TextSelectionHelper;

public abstract class RichBlockSelection {
    public static StaticLayout placeholder;

    public final class AnonymousClass1 implements TextSelectionHelper.TextLayoutBlock {
        public final Rect val$bounds;
        public final StaticLayout val$layout;

        public AnonymousClass1(StaticLayout staticLayout, Rect rect) {
            this.val$layout = staticLayout;
            this.val$bounds = rect;
        }

        @Override
        public final Layout getLayout() {
            return this.val$layout;
        }

        @Override
        public final CharSequence getPrefix() {
            return null;
        }

        @Override
        public final int getRow() {
            return 0;
        }

        @Override
        public final Rect getSelectionBounds() {
            return this.val$bounds;
        }

        @Override
        public final CharSequence getText() {
            Layout layout = getLayout();
            if (layout == null) {
                return null;
            }
            return layout.getText();
        }

        @Override
        public final int getX() {
            return 0;
        }

        @Override
        public final int getY() {
            return 0;
        }
    }
}
