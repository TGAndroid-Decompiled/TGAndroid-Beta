package org.telegram.ui.Components;

import android.content.Context;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.LinkSpanDrawable;

public abstract class TextHelper {
    public static LinkSpanDrawable.LinksTextView makeLinkTextView(Context context, float f, int i, int i2, boolean z, Theme.ResourcesProvider resourcesProvider) {
        LinkSpanDrawable.LinksTextView linksTextView = new LinkSpanDrawable.LinksTextView(context);
        linksTextView.setTextSize(1, f);
        linksTextView.setTextColor(Theme.getColor(i, resourcesProvider));
        linksTextView.setLinkTextColor(Theme.getColor(i2, resourcesProvider));
        if (z) {
            linksTextView.setTypeface(AndroidUtilities.bold());
        }
        return linksTextView;
    }

    public static LinkSpanDrawable.LinksTextView makeLinkTextView(Context context, float f, int i, boolean z, Theme.ResourcesProvider resourcesProvider) {
        return makeLinkTextView(context, f, i, Theme.key_chat_messageLinkIn, z, resourcesProvider);
    }

    public static TextView makeTextView(Context context, float f, int i, boolean z) {
        return makeTextView(context, f, i, z, null);
    }

    public static TextView makeTextView(Context context, float f, int i, boolean z, Theme.ResourcesProvider resourcesProvider) {
        TextView textView = new TextView(context);
        textView.setTextSize(1, f);
        textView.setTextColor(Theme.getColor(i, resourcesProvider));
        if (z) {
            textView.setTypeface(AndroidUtilities.bold());
        }
        return textView;
    }
}
