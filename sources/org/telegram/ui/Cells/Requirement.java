package org.telegram.ui.Cells;

public final class Requirement {
    public final int padding;
    public final CharSequence text;

    public Requirement(CharSequence charSequence, int i) {
        this.text = charSequence;
        this.padding = i;
    }
}
