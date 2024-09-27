package org.telegram.ui.Components;

import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

public class ContactsEmptyView extends LinearLayout {
    private int currentAccount;
    private LoadingStickerDrawable drawable;
    private ArrayList imageViews;
    private BackupImageView stickerView;
    private ArrayList textViews;
    private TextView titleTextView;

    public ContactsEmptyView(android.content.Context r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ContactsEmptyView.<init>(android.content.Context):void");
    }

    private void setSticker() {
        this.stickerView.setImageDrawable(new RLottieDrawable(R.raw.utyan_empty, "utyan_empty", AndroidUtilities.dp(130.0f), AndroidUtilities.dp(130.0f)));
    }

    @Override
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSticker();
    }
}
