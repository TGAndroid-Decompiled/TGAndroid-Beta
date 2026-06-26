package org.telegram.ui.iv;

import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import org.telegram.ui.Cells.TextSelectionHelper;

abstract class RichBlockSelection {
    private static Layout placeholder;

    private static Layout placeholder() {
        if (placeholder == null) {
            placeholder = new StaticLayout(" ", new TextPaint(), 1, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
        }
        return placeholder;
    }

    static TextSelectionHelper.TextLayoutBlock of(int i, int i2, int i3, int i4) {
        final Rect rect = new Rect(i, i2, i3, i4);
        final Layout layoutPlaceholder = placeholder();
        return new TextSelectionHelper.TextLayoutBlock() {
            @Override
            public CharSequence getPrefix() {
                return TextSelectionHelper.TextLayoutBlock.CC.$default$getPrefix(this);
            }

            @Override
            public int getRow() {
                return 0;
            }

            @Override
            public CharSequence getText() {
                return TextSelectionHelper.TextLayoutBlock.CC.$default$getText(this);
            }

            @Override
            public int getX() {
                return 0;
            }

            @Override
            public int getY() {
                return 0;
            }

            @Override
            public Layout getLayout() {
                return layoutPlaceholder;
            }

            @Override
            public Rect getSelectionBounds() {
                return rect;
            }
        };
    }
}
