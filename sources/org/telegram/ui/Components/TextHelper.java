package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.RichMessageLayout$$ExternalSyntheticOutline0;
import org.telegram.ui.ActionBar.Theme;

public abstract class TextHelper {
    public static LinkSpanDrawable.LinksTextView makeLinkTextView(Context context, float f, int i, boolean z, Theme.ResourcesProvider resourcesProvider) {
        int i2 = Theme.key_chat_messageLinkIn;
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context, null);
        linksTextView.setTextSize(1, f);
        linksTextView.setTextColor(Theme.getColor(i, resourcesProvider));
        linksTextView.setLinkTextColor(Theme.getColor(i2, resourcesProvider));
        if (z) {
            linksTextView.setTypeface(AndroidUtilities.bold());
        }
        return linksTextView;
    }

    public static TextView makeTextView(Context context, float f, int i, boolean z, Theme.ResourcesProvider resourcesProvider) {
        TextView textViewM = RichMessageLayout$$ExternalSyntheticOutline0.m(context, 1, f);
        textViewM.setTextColor(Theme.getColor(i, resourcesProvider));
        if (z) {
            textViewM.setTypeface(AndroidUtilities.bold());
        }
        return textViewM;
    }
}
