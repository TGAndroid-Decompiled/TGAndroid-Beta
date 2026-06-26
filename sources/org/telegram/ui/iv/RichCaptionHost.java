package org.telegram.ui.iv;

public interface RichCaptionHost {
    RichEditText getCaptionEditText();

    BlockRow getRow();

    boolean isPressOnCaption(int i, int i2);

    void persistCaption();
}
